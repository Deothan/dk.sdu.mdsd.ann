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
 *   <li>{@link dk.sdu.mdsd.ann.ann.Custom#getExp <em>Exp</em>}</li>
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
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression)
   * @see dk.sdu.mdsd.ann.ann.AnnPackage#getCustom_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.ann.ann.Custom#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

} // Custom
