/**
 * generated by Xtext 2.11.0
 */
package dk.sdu.mdsd.ann.ann.util;

import dk.sdu.mdsd.ann.ann.ANNModel;
import dk.sdu.mdsd.ann.ann.Activation;
import dk.sdu.mdsd.ann.ann.AnnPackage;
import dk.sdu.mdsd.ann.ann.Condition;
import dk.sdu.mdsd.ann.ann.Constraint;
import dk.sdu.mdsd.ann.ann.Cos;
import dk.sdu.mdsd.ann.ann.Custom;
import dk.sdu.mdsd.ann.ann.Euler;
import dk.sdu.mdsd.ann.ann.Expression;
import dk.sdu.mdsd.ann.ann.External;
import dk.sdu.mdsd.ann.ann.Fac;
import dk.sdu.mdsd.ann.ann.Field;
import dk.sdu.mdsd.ann.ann.Hidden;
import dk.sdu.mdsd.ann.ann.Input;
import dk.sdu.mdsd.ann.ann.Layer;
import dk.sdu.mdsd.ann.ann.Letter;
import dk.sdu.mdsd.ann.ann.NLog;
import dk.sdu.mdsd.ann.ann.NumberLiteral;
import dk.sdu.mdsd.ann.ann.Output;
import dk.sdu.mdsd.ann.ann.Part;
import dk.sdu.mdsd.ann.ann.Power;
import dk.sdu.mdsd.ann.ann.Restriction;
import dk.sdu.mdsd.ann.ann.Sigmoid;
import dk.sdu.mdsd.ann.ann.Sin;
import dk.sdu.mdsd.ann.ann.Sqrt;
import dk.sdu.mdsd.ann.ann.Tansig;

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
      public Adapter caseRestriction(Restriction object)
      {
        return createRestrictionAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseField(Field object)
      {
        return createFieldAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseOutput(Output object)
      {
        return createOutputAdapter();
      }
      @Override
      public Adapter caseActivation(Activation object)
      {
        return createActivationAdapter();
      }
      @Override
      public Adapter caseExternal(External object)
      {
        return createExternalAdapter();
      }
      @Override
      public Adapter caseSigmoid(Sigmoid object)
      {
        return createSigmoidAdapter();
      }
      @Override
      public Adapter caseTansig(Tansig object)
      {
        return createTansigAdapter();
      }
      @Override
      public Adapter caseCustom(Custom object)
      {
        return createCustomAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseMath(dk.sdu.mdsd.ann.ann.Math object)
      {
        return createMathAdapter();
      }
      @Override
      public Adapter caseEuler(Euler object)
      {
        return createEulerAdapter();
      }
      @Override
      public Adapter caseNLog(NLog object)
      {
        return createNLogAdapter();
      }
      @Override
      public Adapter caseSin(Sin object)
      {
        return createSinAdapter();
      }
      @Override
      public Adapter caseCos(Cos object)
      {
        return createCosAdapter();
      }
      @Override
      public Adapter caseSqrt(Sqrt object)
      {
        return createSqrtAdapter();
      }
      @Override
      public Adapter casePower(Power object)
      {
        return createPowerAdapter();
      }
      @Override
      public Adapter caseLetter(Letter object)
      {
        return createLetterAdapter();
      }
      @Override
      public Adapter caseNumberLiteral(NumberLiteral object)
      {
        return createNumberLiteralAdapter();
      }
      @Override
      public Adapter casePart(Part object)
      {
        return createPartAdapter();
      }
      @Override
      public Adapter caseFac(Fac object)
      {
        return createFacAdapter();
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
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Restriction <em>Restriction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Restriction
   * @generated
   */
  public Adapter createRestrictionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Field
   * @generated
   */
  public Adapter createFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
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
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Activation <em>Activation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Activation
   * @generated
   */
  public Adapter createActivationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.External <em>External</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.External
   * @generated
   */
  public Adapter createExternalAdapter()
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
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Tansig <em>Tansig</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Tansig
   * @generated
   */
  public Adapter createTansigAdapter()
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
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Math <em>Math</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Math
   * @generated
   */
  public Adapter createMathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Euler <em>Euler</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Euler
   * @generated
   */
  public Adapter createEulerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.NLog <em>NLog</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.NLog
   * @generated
   */
  public Adapter createNLogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Sin <em>Sin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Sin
   * @generated
   */
  public Adapter createSinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Cos <em>Cos</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Cos
   * @generated
   */
  public Adapter createCosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Sqrt <em>Sqrt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Sqrt
   * @generated
   */
  public Adapter createSqrtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Power <em>Power</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Power
   * @generated
   */
  public Adapter createPowerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Letter <em>Letter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Letter
   * @generated
   */
  public Adapter createLetterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.NumberLiteral
   * @generated
   */
  public Adapter createNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Part <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Part
   * @generated
   */
  public Adapter createPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mdsd.ann.ann.Fac <em>Fac</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mdsd.ann.ann.Fac
   * @generated
   */
  public Adapter createFacAdapter()
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
