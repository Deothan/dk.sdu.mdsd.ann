/**
 * generated by Xtext 2.11.0
 */
package dk.sdu.mdsd.ann.ann.impl;

import dk.sdu.mdsd.ann.ann.AnnPackage;
import dk.sdu.mdsd.ann.ann.Custom;
import dk.sdu.mdsd.ann.ann.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mdsd.ann.ann.impl.CustomImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link dk.sdu.mdsd.ann.ann.impl.CustomImpl#getDer <em>Der</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomImpl extends ActivationImpl implements Custom
{
  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected Expression exp;

  /**
   * The cached value of the '{@link #getDer() <em>Der</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDer()
   * @generated
   * @ordered
   */
  protected Expression der;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CustomImpl()
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
    return AnnPackage.Literals.CUSTOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(Expression newExp, NotificationChain msgs)
  {
    Expression oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnPackage.CUSTOM__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(Expression newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnPackage.CUSTOM__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnPackage.CUSTOM__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnnPackage.CUSTOM__EXP, newExp, newExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getDer()
  {
    return der;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDer(Expression newDer, NotificationChain msgs)
  {
    Expression oldDer = der;
    der = newDer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnPackage.CUSTOM__DER, oldDer, newDer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDer(Expression newDer)
  {
    if (newDer != der)
    {
      NotificationChain msgs = null;
      if (der != null)
        msgs = ((InternalEObject)der).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnPackage.CUSTOM__DER, null, msgs);
      if (newDer != null)
        msgs = ((InternalEObject)newDer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnPackage.CUSTOM__DER, null, msgs);
      msgs = basicSetDer(newDer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnnPackage.CUSTOM__DER, newDer, newDer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AnnPackage.CUSTOM__EXP:
        return basicSetExp(null, msgs);
      case AnnPackage.CUSTOM__DER:
        return basicSetDer(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AnnPackage.CUSTOM__EXP:
        return getExp();
      case AnnPackage.CUSTOM__DER:
        return getDer();
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
      case AnnPackage.CUSTOM__EXP:
        setExp((Expression)newValue);
        return;
      case AnnPackage.CUSTOM__DER:
        setDer((Expression)newValue);
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
      case AnnPackage.CUSTOM__EXP:
        setExp((Expression)null);
        return;
      case AnnPackage.CUSTOM__DER:
        setDer((Expression)null);
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
      case AnnPackage.CUSTOM__EXP:
        return exp != null;
      case AnnPackage.CUSTOM__DER:
        return der != null;
    }
    return super.eIsSet(featureID);
  }

} //CustomImpl
