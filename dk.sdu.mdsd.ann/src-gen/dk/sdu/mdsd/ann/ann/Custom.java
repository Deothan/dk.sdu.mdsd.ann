/**
 * generated by Xtext 2.11.0
 */
package dk.sdu.mdsd.ann.ann;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mdsd.ann.ann.Custom#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mdsd.ann.ann.Custom#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mdsd.ann.ann.AnnPackage#getCustom()
 * @model
 * @generated
 */
public interface Custom extends LearningRule
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
   * @see dk.sdu.mdsd.ann.ann.AnnPackage#getCustom_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.ann.ann.Custom#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' attribute.
   * @see #setFunction(String)
   * @see dk.sdu.mdsd.ann.ann.AnnPackage#getCustom_Function()
   * @model
   * @generated
   */
  String getFunction();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.ann.ann.Custom#getFunction <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' attribute.
   * @see #getFunction()
   * @generated
   */
  void setFunction(String value);

} // Custom