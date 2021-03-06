/**
 * generated by Xtext 2.11.0
 */
package dk.sdu.mdsd.ann.ann.impl;

import dk.sdu.mdsd.ann.ann.ANNModel;
import dk.sdu.mdsd.ann.ann.Activation;
import dk.sdu.mdsd.ann.ann.AnnPackage;
import dk.sdu.mdsd.ann.ann.Constraint;
import dk.sdu.mdsd.ann.ann.Layer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ANN Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mdsd.ann.ann.impl.ANNModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mdsd.ann.ann.impl.ANNModelImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link dk.sdu.mdsd.ann.ann.impl.ANNModelImpl#getEpochs <em>Epochs</em>}</li>
 *   <li>{@link dk.sdu.mdsd.ann.ann.impl.ANNModelImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link dk.sdu.mdsd.ann.ann.impl.ANNModelImpl#getActivation <em>Activation</em>}</li>
 *   <li>{@link dk.sdu.mdsd.ann.ann.impl.ANNModelImpl#getLayer <em>Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ANNModelImpl extends MinimalEObjectImpl.Container implements ANNModel
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlpha()
   * @generated
   * @ordered
   */
  protected static final String ALPHA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlpha()
   * @generated
   * @ordered
   */
  protected String alpha = ALPHA_EDEFAULT;

  /**
   * The default value of the '{@link #getEpochs() <em>Epochs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEpochs()
   * @generated
   * @ordered
   */
  protected static final int EPOCHS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getEpochs() <em>Epochs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEpochs()
   * @generated
   * @ordered
   */
  protected int epochs = EPOCHS_EDEFAULT;

  /**
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected EList<Constraint> constraints;

  /**
   * The cached value of the '{@link #getActivation() <em>Activation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivation()
   * @generated
   * @ordered
   */
  protected EList<Activation> activation;

  /**
   * The cached value of the '{@link #getLayer() <em>Layer</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayer()
   * @generated
   * @ordered
   */
  protected EList<Layer> layer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ANNModelImpl()
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
    return AnnPackage.Literals.ANN_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnnPackage.ANN_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAlpha()
  {
    return alpha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlpha(String newAlpha)
  {
    String oldAlpha = alpha;
    alpha = newAlpha;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnnPackage.ANN_MODEL__ALPHA, oldAlpha, alpha));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getEpochs()
  {
    return epochs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEpochs(int newEpochs)
  {
    int oldEpochs = epochs;
    epochs = newEpochs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnnPackage.ANN_MODEL__EPOCHS, oldEpochs, epochs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getConstraints()
  {
    if (constraints == null)
    {
      constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, AnnPackage.ANN_MODEL__CONSTRAINTS);
    }
    return constraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Activation> getActivation()
  {
    if (activation == null)
    {
      activation = new EObjectContainmentEList<Activation>(Activation.class, this, AnnPackage.ANN_MODEL__ACTIVATION);
    }
    return activation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Layer> getLayer()
  {
    if (layer == null)
    {
      layer = new EObjectContainmentEList<Layer>(Layer.class, this, AnnPackage.ANN_MODEL__LAYER);
    }
    return layer;
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
      case AnnPackage.ANN_MODEL__CONSTRAINTS:
        return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
      case AnnPackage.ANN_MODEL__ACTIVATION:
        return ((InternalEList<?>)getActivation()).basicRemove(otherEnd, msgs);
      case AnnPackage.ANN_MODEL__LAYER:
        return ((InternalEList<?>)getLayer()).basicRemove(otherEnd, msgs);
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
      case AnnPackage.ANN_MODEL__NAME:
        return getName();
      case AnnPackage.ANN_MODEL__ALPHA:
        return getAlpha();
      case AnnPackage.ANN_MODEL__EPOCHS:
        return getEpochs();
      case AnnPackage.ANN_MODEL__CONSTRAINTS:
        return getConstraints();
      case AnnPackage.ANN_MODEL__ACTIVATION:
        return getActivation();
      case AnnPackage.ANN_MODEL__LAYER:
        return getLayer();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AnnPackage.ANN_MODEL__NAME:
        setName((String)newValue);
        return;
      case AnnPackage.ANN_MODEL__ALPHA:
        setAlpha((String)newValue);
        return;
      case AnnPackage.ANN_MODEL__EPOCHS:
        setEpochs((Integer)newValue);
        return;
      case AnnPackage.ANN_MODEL__CONSTRAINTS:
        getConstraints().clear();
        getConstraints().addAll((Collection<? extends Constraint>)newValue);
        return;
      case AnnPackage.ANN_MODEL__ACTIVATION:
        getActivation().clear();
        getActivation().addAll((Collection<? extends Activation>)newValue);
        return;
      case AnnPackage.ANN_MODEL__LAYER:
        getLayer().clear();
        getLayer().addAll((Collection<? extends Layer>)newValue);
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
      case AnnPackage.ANN_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AnnPackage.ANN_MODEL__ALPHA:
        setAlpha(ALPHA_EDEFAULT);
        return;
      case AnnPackage.ANN_MODEL__EPOCHS:
        setEpochs(EPOCHS_EDEFAULT);
        return;
      case AnnPackage.ANN_MODEL__CONSTRAINTS:
        getConstraints().clear();
        return;
      case AnnPackage.ANN_MODEL__ACTIVATION:
        getActivation().clear();
        return;
      case AnnPackage.ANN_MODEL__LAYER:
        getLayer().clear();
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
      case AnnPackage.ANN_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AnnPackage.ANN_MODEL__ALPHA:
        return ALPHA_EDEFAULT == null ? alpha != null : !ALPHA_EDEFAULT.equals(alpha);
      case AnnPackage.ANN_MODEL__EPOCHS:
        return epochs != EPOCHS_EDEFAULT;
      case AnnPackage.ANN_MODEL__CONSTRAINTS:
        return constraints != null && !constraints.isEmpty();
      case AnnPackage.ANN_MODEL__ACTIVATION:
        return activation != null && !activation.isEmpty();
      case AnnPackage.ANN_MODEL__LAYER:
        return layer != null && !layer.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", alpha: ");
    result.append(alpha);
    result.append(", epochs: ");
    result.append(epochs);
    result.append(')');
    return result.toString();
  }

} //ANNModelImpl
