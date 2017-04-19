/**
 * generated by Xtext 2.11.0
 */
package dk.sdu.mdsd.ann.ann.impl;

import dk.sdu.mdsd.ann.ann.AnnPackage;
import dk.sdu.mdsd.ann.ann.Hidden;
import dk.sdu.mdsd.ann.ann.LearningRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hidden</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mdsd.ann.ann.impl.HiddenImpl#getL_rule <em>Lrule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HiddenImpl extends LayerImpl implements Hidden
{
  /**
   * The cached value of the '{@link #getL_rule() <em>Lrule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL_rule()
   * @generated
   * @ordered
   */
  protected LearningRule l_rule;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HiddenImpl()
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
    return AnnPackage.Literals.HIDDEN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LearningRule getL_rule()
  {
    return l_rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetL_rule(LearningRule newL_rule, NotificationChain msgs)
  {
    LearningRule oldL_rule = l_rule;
    l_rule = newL_rule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnPackage.HIDDEN__LRULE, oldL_rule, newL_rule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL_rule(LearningRule newL_rule)
  {
    if (newL_rule != l_rule)
    {
      NotificationChain msgs = null;
      if (l_rule != null)
        msgs = ((InternalEObject)l_rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnPackage.HIDDEN__LRULE, null, msgs);
      if (newL_rule != null)
        msgs = ((InternalEObject)newL_rule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnPackage.HIDDEN__LRULE, null, msgs);
      msgs = basicSetL_rule(newL_rule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnnPackage.HIDDEN__LRULE, newL_rule, newL_rule));
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
      case AnnPackage.HIDDEN__LRULE:
        return basicSetL_rule(null, msgs);
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
      case AnnPackage.HIDDEN__LRULE:
        return getL_rule();
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
      case AnnPackage.HIDDEN__LRULE:
        setL_rule((LearningRule)newValue);
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
      case AnnPackage.HIDDEN__LRULE:
        setL_rule((LearningRule)null);
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
      case AnnPackage.HIDDEN__LRULE:
        return l_rule != null;
    }
    return super.eIsSet(featureID);
  }

} //HiddenImpl
