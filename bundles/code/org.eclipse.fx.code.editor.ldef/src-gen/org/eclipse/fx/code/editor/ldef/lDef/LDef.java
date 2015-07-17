/**
 */
package org.eclipse.fx.code.editor.ldef.lDef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LDef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.code.editor.ldef.lDef.LDef#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.code.editor.ldef.lDef.LDef#getParitioning <em>Paritioning</em>}</li>
 *   <li>{@link org.eclipse.fx.code.editor.ldef.lDef.LDef#getLexicalHighlighting <em>Lexical Highlighting</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.code.editor.ldef.lDef.LDefPackage#getLDef()
 * @model
 * @generated
 */
public interface LDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.fx.code.editor.ldef.lDef.LDefPackage#getLDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.fx.code.editor.ldef.lDef.LDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Paritioning</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paritioning</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paritioning</em>' containment reference.
   * @see #setParitioning(Paritioning)
   * @see org.eclipse.fx.code.editor.ldef.lDef.LDefPackage#getLDef_Paritioning()
   * @model containment="true"
   * @generated
   */
  Paritioning getParitioning();

  /**
   * Sets the value of the '{@link org.eclipse.fx.code.editor.ldef.lDef.LDef#getParitioning <em>Paritioning</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Paritioning</em>' containment reference.
   * @see #getParitioning()
   * @generated
   */
  void setParitioning(Paritioning value);

  /**
   * Returns the value of the '<em><b>Lexical Highlighting</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lexical Highlighting</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lexical Highlighting</em>' containment reference.
   * @see #setLexicalHighlighting(LexicalHighlighting)
   * @see org.eclipse.fx.code.editor.ldef.lDef.LDefPackage#getLDef_LexicalHighlighting()
   * @model containment="true"
   * @generated
   */
  LexicalHighlighting getLexicalHighlighting();

  /**
   * Sets the value of the '{@link org.eclipse.fx.code.editor.ldef.lDef.LDef#getLexicalHighlighting <em>Lexical Highlighting</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lexical Highlighting</em>' containment reference.
   * @see #getLexicalHighlighting()
   * @generated
   */
  void setLexicalHighlighting(LexicalHighlighting value);

} // LDef
