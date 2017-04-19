/**
 * generated by Xtext 2.11.0
 */
package dk.sdu.mdsd.ann.ann;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dk.sdu.mdsd.ann.ann.AnnPackage
 * @generated
 */
public interface AnnFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AnnFactory eINSTANCE = dk.sdu.mdsd.ann.ann.impl.AnnFactoryImpl.init();

  /**
   * Returns a new object of class '<em>ANN Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ANN Model</em>'.
   * @generated
   */
  ANNModel createANNModel();

  /**
   * Returns a new object of class '<em>Layer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Layer</em>'.
   * @generated
   */
  Layer createLayer();

  /**
   * Returns a new object of class '<em>Hidden</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hidden</em>'.
   * @generated
   */
  Hidden createHidden();

  /**
   * Returns a new object of class '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input</em>'.
   * @generated
   */
  Input createInput();

  /**
   * Returns a new object of class '<em>Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output</em>'.
   * @generated
   */
  Output createOutput();

  /**
   * Returns a new object of class '<em>Learning Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Learning Rule</em>'.
   * @generated
   */
  LearningRule createLearningRule();

  /**
   * Returns a new object of class '<em>Custom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom</em>'.
   * @generated
   */
  Custom createCustom();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AnnPackage getAnnPackage();

} //AnnFactory
