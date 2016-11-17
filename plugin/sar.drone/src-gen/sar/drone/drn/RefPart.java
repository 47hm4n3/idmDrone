/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.RefPart#getVariable_partie <em>Variable partie</em>}</li>
 *   <li>{@link sar.drone.drn.RefPart#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see sar.drone.drn.DrnPackage#getRefPart()
 * @model
 * @generated
 */
public interface RefPart extends Expression
{
  /**
   * Returns the value of the '<em><b>Variable partie</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable partie</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable partie</em>' reference.
   * @see #setVariable_partie(Assignement)
   * @see sar.drone.drn.DrnPackage#getRefPart_Variable_partie()
   * @model
   * @generated
   */
  Assignement getVariable_partie();

  /**
   * Sets the value of the '{@link sar.drone.drn.RefPart#getVariable_partie <em>Variable partie</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable partie</em>' reference.
   * @see #getVariable_partie()
   * @generated
   */
  void setVariable_partie(Assignement value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' attribute list.
   * @see sar.drone.drn.DrnPackage#getRefPart_Params()
   * @model unique="false"
   * @generated
   */
  EList<String> getParams();

} // RefPart