/**
 */
package org.eclipse.fx.code.editor.ldef.lDef.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fx.code.editor.ldef.lDef.LDefPackage;
import org.eclipse.fx.code.editor.ldef.lDef.Scanner_SingleLineRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scanner Single Line Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.code.editor.ldef.lDef.impl.Scanner_SingleLineRuleImpl#getStartSeq <em>Start Seq</em>}</li>
 *   <li>{@link org.eclipse.fx.code.editor.ldef.lDef.impl.Scanner_SingleLineRuleImpl#getEndSeq <em>End Seq</em>}</li>
 *   <li>{@link org.eclipse.fx.code.editor.ldef.lDef.impl.Scanner_SingleLineRuleImpl#getEscapeSeq <em>Escape Seq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Scanner_SingleLineRuleImpl extends Scanner_RuleImpl implements Scanner_SingleLineRule
{
  /**
   * The default value of the '{@link #getStartSeq() <em>Start Seq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartSeq()
   * @generated
   * @ordered
   */
  protected static final String START_SEQ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStartSeq() <em>Start Seq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartSeq()
   * @generated
   * @ordered
   */
  protected String startSeq = START_SEQ_EDEFAULT;

  /**
   * The default value of the '{@link #getEndSeq() <em>End Seq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndSeq()
   * @generated
   * @ordered
   */
  protected static final String END_SEQ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndSeq() <em>End Seq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndSeq()
   * @generated
   * @ordered
   */
  protected String endSeq = END_SEQ_EDEFAULT;

  /**
   * The default value of the '{@link #getEscapeSeq() <em>Escape Seq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEscapeSeq()
   * @generated
   * @ordered
   */
  protected static final String ESCAPE_SEQ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEscapeSeq() <em>Escape Seq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEscapeSeq()
   * @generated
   * @ordered
   */
  protected String escapeSeq = ESCAPE_SEQ_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Scanner_SingleLineRuleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LDefPackage.Literals.SCANNER_SINGLE_LINE_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStartSeq()
  {
    return startSeq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartSeq(String newStartSeq)
  {
    String oldStartSeq = startSeq;
    startSeq = newStartSeq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LDefPackage.SCANNER_SINGLE_LINE_RULE__START_SEQ, oldStartSeq, startSeq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEndSeq()
  {
    return endSeq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndSeq(String newEndSeq)
  {
    String oldEndSeq = endSeq;
    endSeq = newEndSeq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LDefPackage.SCANNER_SINGLE_LINE_RULE__END_SEQ, oldEndSeq, endSeq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEscapeSeq()
  {
    return escapeSeq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEscapeSeq(String newEscapeSeq)
  {
    String oldEscapeSeq = escapeSeq;
    escapeSeq = newEscapeSeq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LDefPackage.SCANNER_SINGLE_LINE_RULE__ESCAPE_SEQ, oldEscapeSeq, escapeSeq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LDefPackage.SCANNER_SINGLE_LINE_RULE__START_SEQ:
        return getStartSeq();
      case LDefPackage.SCANNER_SINGLE_LINE_RULE__END_SEQ:
        return getEndSeq();
      case LDefPackage.SCANNER_SINGLE_LINE_RULE__ESCAPE_SEQ:
        return getEscapeSeq();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LDefPackage.SCANNER_SINGLE_LINE_RULE__START_SEQ:
        setStartSeq((String)newValue);
        return;
      case LDefPackage.SCANNER_SINGLE_LINE_RULE__END_SEQ:
        setEndSeq((String)newValue);
        return;
      case LDefPackage.SCANNER_SINGLE_LINE_RULE__ESCAPE_SEQ:
        setEscapeSeq((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LDefPackage.SCANNER_SINGLE_LINE_RULE__START_SEQ:
        setStartSeq(START_SEQ_EDEFAULT);
        return;
      case LDefPackage.SCANNER_SINGLE_LINE_RULE__END_SEQ:
        setEndSeq(END_SEQ_EDEFAULT);
        return;
      case LDefPackage.SCANNER_SINGLE_LINE_RULE__ESCAPE_SEQ:
        setEscapeSeq(ESCAPE_SEQ_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LDefPackage.SCANNER_SINGLE_LINE_RULE__START_SEQ:
        return START_SEQ_EDEFAULT == null ? startSeq != null : !START_SEQ_EDEFAULT.equals(startSeq);
      case LDefPackage.SCANNER_SINGLE_LINE_RULE__END_SEQ:
        return END_SEQ_EDEFAULT == null ? endSeq != null : !END_SEQ_EDEFAULT.equals(endSeq);
      case LDefPackage.SCANNER_SINGLE_LINE_RULE__ESCAPE_SEQ:
        return ESCAPE_SEQ_EDEFAULT == null ? escapeSeq != null : !ESCAPE_SEQ_EDEFAULT.equals(escapeSeq);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (startSeq: ");
    result.append(startSeq);
    result.append(", endSeq: ");
    result.append(endSeq);
    result.append(", escapeSeq: ");
    result.append(escapeSeq);
    result.append(')');
    return result.toString();
  }

} //Scanner_SingleLineRuleImpl
