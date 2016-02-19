/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	Christoph Caks <ccaks@bestsolution.at> - improved editor behavior
 *	Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ui.controls.styledtext.behavior;

import org.eclipse.fx.ui.controls.styledtext.StyledTextArea;
import org.eclipse.fx.ui.controls.styledtext.events.TextPositionEvent;

import javafx.event.Event;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;

/**
 * manages text position support
 * @author ccaks
 *
 */
public class TextPositionSupport {

	private StyledTextArea textArea;
	private Region control;

	public TextPositionSupport(Region control, StyledTextArea textArea) {
		this.control = control;
		this.textArea = textArea;
	}

	protected void install() {
		this.control.addEventHandler(MouseEvent.MOUSE_CLICKED,  this::onMouseEvent);
		this.control.addEventHandler(MouseEvent.MOUSE_PRESSED, this::onMouseEvent);
		this.control.addEventHandler(MouseEvent.DRAG_DETECTED, this::onMouseEvent);
		this.control.addEventHandler(MouseEvent.MOUSE_DRAGGED, this::onMouseEvent);
		this.control.addEventHandler(MouseEvent.MOUSE_RELEASED, this::onMouseEvent);
		this.control.addEventFilter(MouseEvent.MOUSE_MOVED, this::onMouseEvent);
	}

	public static TextPositionSupport install(Region control, StyledTextArea textArea) {
		TextPositionSupport support = new TextPositionSupport(control, textArea);
		support.install();
		return support;
	}

	private void onMouseEvent(MouseEvent event) {
		Event.fireEvent(this.textArea, new TextPositionEvent(event, computeCursorOffset(event)));
	}

	/**
	 * computes the text offset under the mouse cursor.
	 * @param event
	 * @return the offset
	 */
	protected int computeCursorOffset(MouseEvent event) {
		return textArea.getOffsetAtPosition(event.getX(), event.getY());


//		List<LineCell> visibleCells = ((StyledTextSkin) this.textArea.getSkin()).getCurrentVisibleCells();
//
//		LineCell lastCell = null;
//
//		int result = this.textArea.getContent().getCharCount();
//
//		for (LineCell tmp : visibleCells) {
//			Bounds boundsInParent = tmp.getBoundsInParent();
//			if (boundsInParent.getMinY() > event.getY()) {
//				if (lastCell == null) {
//					lastCell = tmp;
//				}
//
//				if (lastCell.getDomainElement() != null) {
//					LineNode n = (LineNode) lastCell.getGraphic();
////					StyledTextLayoutContainer n = (StyledTextLayoutContainer) lastCell.getGraphic();
//					if (n.localToScene(n.getBoundsInLocal()).contains(event.getSceneX(), event.getSceneY())) {
//						int index = n.getCaretIndexAtPoint(n.sceneToLocal(event.getSceneX(), event.getSceneY()));
//						if (index >= 0) {
//							return n.getStartOffset() + index;
//						}
//					}
//
//					final double minX = n.localToScene(n.getBoundsInLocal()).getMinX();
//					final double mouseX = event.getSceneX();
//					final boolean left = minX >= mouseX;
//
//					result = lastCell.getDomainElement().getLineOffset() + (left ? 0 : lastCell.getDomainElement().getLineLength());
//				}
//				break;
//			}
//			lastCell = tmp;
//		}
//		return result;
	}


}
