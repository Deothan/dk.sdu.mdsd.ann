/**
 * generated by Xtext 2.11.0
 */
package dk.sdu.mdsd.ann.ann.util;

import dk.sdu.mdsd.ann.ann.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dk.sdu.mdsd.ann.ann.AnnPackage
 * @generated
 */
public class AnnAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AnnPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AnnPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnSwitch<Adapter> modelSwitch =
    new AnnSwitch<Adapter>()
    {
      @Override
      public Adapter caseANNModel(ANNModel object)
      {
        return createANNModelAdapter();
      }
      @Override
      public Adapter caseLayer(Layer object)
      {
        return createLayerAdapter();
      }
      @Override
      public Adapter caseHidden(Hidden object)
      {
        return createHiddenAdapter();
      }
      @Override
      public Adapter caseInput(Input object)
      {
        return createInputAdapter();
      }
      @Override
      public Adapter caseOutput(Output object)
      {
        return createOutputAdapter();
      }
      @Override
      public Adapter caseLearningRule(LearningRule object)
      {
        return createLearningRuleAdapter();
      }
      @Override
      public Adapter caseSigmoid(Sigmoid object)
      {
        return createSigmoidAdapter();
      }
      @Override
      public Adapter caseStub(Stub object)
      {
        return createStubAdapter();
      }
      @Override
      public Adapter caseCustom(Custom object)
      {
        return createCustomAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.ANNModel <em>ANN Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.ANNModel
   * @generated
   */
  public Adapter createANNModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Layer <em>Layer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Layer
   * @generated
   */
  public Adapter createLayerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Hidden <em>Hidden</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Hidden
   * @generated
   */
  public Adapter createHiddenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Input
   * @generated
   */
  public Adapter createInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Output
   * @generated
   */
  public Adapter createOutputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.LearningRule <em>Learning Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.LearningRule
   * @generated
   */
  public Adapter createLearningRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Sigmoid <em>Sigmoid</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Sigmoid
   * @generated
   */
  public Adapter createSigmoidAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Stub <em>Stub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Stub
   * @generated
   */
  public Adapter createStubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Custom <em>Custom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Custom
   * @generated
   */
  public Adapter createCustomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AnnAdapterFactory
