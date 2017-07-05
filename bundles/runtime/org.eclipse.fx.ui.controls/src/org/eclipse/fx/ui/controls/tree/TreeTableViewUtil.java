/*******************************************************************************
 * Copyright (c) 2017 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ui.controls.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.fx.core.Memento;
import org.eclipse.fx.core.ObjectSerializer;
import org.eclipse.jdt.annotation.NonNull;

import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;

/**
 * Helper APIs when working with {@link TreeTableView}
 * 
 * @since 3.1.0
 */
public class TreeTableViewUtil {
	/**
	 * Properties of a {@link TreeTableView} one can capture in an memento
	 * 
	 * @since 3.1.0
	 */
	public enum TreeTableView_Properties {
		/**
		 * Width of the column
		 */
		COLUMN_WIDTH,
		/**
		 * Column order
		 */
		COLUMN_ORDER,
		/**
		 * Is column visible
		 */
		COLUMN_VISIBLE
	}

	private static final double DEFAULT = Double.NEGATIVE_INFINITY;
	
	private static final int VISIBLE_DEFAULT = 0;
	private static final int VISIBLE_YES = 1;
	private static final int VISIBLE_NO = 2;

	/**
	 * Restore the state of the {@link TreeTableView} and use the
	 * {@link TreeTableColumn#getId()} for the lookup
	 * 
	 * @param view
	 *            the view
	 * @param m
	 *            the memento used to retrieve stored data from
	 * @param properties
	 *            list of properties to restore or empty to restore all possible
	 *            properties
	 * @return the view you passed for fluent API useage
	 */
	public static <S> TreeTableView<S> restoreState(TreeTableView<S> view, Memento m, TreeTableView_Properties... properties) {
		return restoreState(view, m, TreeTableColumn::getId, properties);
	}

	/**
	 * Restore the state of the {@link TreeTableView}
	 * 
	 * @param view
	 *            the view
	 * @param m
	 *            the memento used to retrieve stored data from
	 * @param columnKeyProvider
	 *            function used to compute the id for a column
	 * @param properties
	 *            list of properties to restore or empty to restore all possible
	 *            properties
	 * @return the view you passed for fluent API useage
	 */
	public static <S> TreeTableView<S> restoreState(TreeTableView<S> view, Memento m, Function<TreeTableColumn<S, ?>, String> columnKeyProvider, TreeTableView_Properties... properties) {
		Map<String, TreeTableColumn<S, ?>> idToNodeMap = view.getColumns().stream().collect(Collectors.toMap(columnKeyProvider, c -> c));
		Map<TreeTableColumn<S, ?>, String> nodeToIdMap = idToNodeMap.entrySet().stream().collect(Collectors.toMap(Entry::getValue, Entry::getKey));

		for (TreeTableColumn<S, ?> c : view.getColumns()) {
			String key = nodeToIdMap.get(c);

			if (key == null) {
				continue;
			}

			if (isPropertySet(properties, TreeTableView_Properties.COLUMN_WIDTH)) {
				double val = m.get(key(key, TreeTableView_Properties.COLUMN_WIDTH), DEFAULT);
				if (val != DEFAULT) {
					c.setPrefWidth(val);
				}
			}
			
			if( isPropertySet(properties, TreeTableView_Properties.COLUMN_VISIBLE ) ) {
				int val = m.get(key(key, TreeTableView_Properties.COLUMN_VISIBLE), VISIBLE_DEFAULT);
				if( val != VISIBLE_DEFAULT ) {
					c.setVisible( val == VISIBLE_YES );
				}
			}
		}

		if (isPropertySet(properties, TreeTableView_Properties.COLUMN_ORDER)) {
			List<String> currentOrder = view.getColumns().stream().map(columnKeyProvider).collect(Collectors.toList());
			@SuppressWarnings("unchecked")
			List<String> restoredOrder = m.get("column_order", List.class, currentOrder); //$NON-NLS-1$
			if (!currentOrder.equals(restoredOrder)) {
				// Unable to restore if the column count matches
				if (restoredOrder != null && currentOrder.size() == restoredOrder.size()) {
					List<TreeTableColumn<S, ?>> newOrder = new ArrayList<>();
					for (String key : restoredOrder) {
						TreeTableColumn<S, ?> column = idToNodeMap.get(key);
						// Unknown column we can not restore the width
						if (column == null) {
							break;
						}

						newOrder.add(column);
					}

					if (newOrder.size() == view.getColumns().size()) {
						view.getColumns().setAll(newOrder);
					}
				}
			}
		}
		return view;
	}

	/**
	 * Capture the state of the {@link TreeTableView} and use the
	 * {@link TreeTableColumn#getId()} for the lookup
	 * 
	 * @param view
	 *            the view the state is captured of
	 * @param m
	 *            the memento used to store the state
	 * @param properties
	 *            list of properties to restore or empty to restore all possible
	 *            properties
	 * @return the view you passed for fluent API useage
	 */
	public static <S> TreeTableView<S> captureState(TreeTableView<S> view, Memento m, TreeTableView_Properties... properties) {
		return captureState(view, m, TreeTableColumn::getId, properties);
	}

	/**
	 * Capture the state of the {@link TreeTableView}
	 * 
	 * @param view
	 *            the view the state is captured of
	 * @param m
	 *            the memento used to store the state
	 * @param columnKeyProvider
	 *            function used to compute the id for a column
	 * @param properties
	 *            list of properties to restore or empty to restore all possible
	 *            properties
	 * @return the view you passed for fluent API useage
	 */
	public static <S> TreeTableView<S> captureState(TreeTableView<S> view, Memento m, Function<TreeTableColumn<S, ?>, String> columnKeyProvider, TreeTableView_Properties... properties) {
		Map<TreeTableColumn<S, ?>, String> nodeToIdMap = view.getColumns().stream().collect(Collectors.toMap(c -> c, columnKeyProvider));

		for (TreeTableColumn<S, ?> c : view.getColumns()) {
			String key = nodeToIdMap.get(c);
			if( key == null ) {
				continue;
			}
			
			if (isPropertySet(properties, TreeTableView_Properties.COLUMN_WIDTH)) {
				m.put(key(key, TreeTableView_Properties.COLUMN_WIDTH), c.getWidth());
			}
			
			if( isPropertySet(properties, TreeTableView_Properties.COLUMN_VISIBLE) ) {
				m.put( key(key, TreeTableView_Properties.COLUMN_VISIBLE), c.isVisible() ? VISIBLE_YES : VISIBLE_NO );
			}
		}
		if (isPropertySet(properties, TreeTableView_Properties.COLUMN_ORDER)) {
			m.put("column_order", view.getColumns().stream().map(nodeToIdMap::get).collect(Collectors.toList()), ObjectSerializer.JAXB_SERIALIZER); //$NON-NLS-1$
		}
		return view;
	}
	
	private static @NonNull String key(String key, Enum<?> property) {
		return key + "_" + property.name(); //$NON-NLS-1$
	}

	private static boolean isPropertySet(TreeTableView_Properties[] properties, TreeTableView_Properties property) {
		return properties.length == 0 || Arrays.asList(properties).contains(property);
	}
}
