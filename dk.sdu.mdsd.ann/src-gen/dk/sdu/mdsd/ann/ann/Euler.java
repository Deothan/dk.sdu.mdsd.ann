/**
 * generated by Xtext 2.11.0
 */
package dk.sdu.mdsd.ann.ann;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Euler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mdsd.ann.ann.Euler#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mdsd.ann.ann.AnnPackage#getEuler()
 * @model
 * @generated
 */
public interface Euler extends dk.sdu.mdsd.ann.ann.Math
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see dk.sdu.mdsd.ann.ann.AnnPackage#getEuler_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.ann.ann.Euler#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

} // Euler
