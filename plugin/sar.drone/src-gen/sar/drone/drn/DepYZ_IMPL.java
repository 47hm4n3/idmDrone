/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dep YZ IMPL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.DepYZ_IMPL#getName <em>Name</em>}</li>
 *   <li>{@link sar.drone.drn.DepYZ_IMPL#getTempsCST <em>Temps CST</em>}</li>
 *   <li>{@link sar.drone.drn.DepYZ_IMPL#getTempsVAR <em>Temps VAR</em>}</li>
 * </ul>
 *
 * @see sar.drone.drn.DrnPackage#getDepYZ_IMPL()
 * @model
 * @generated
 */
public interface DepYZ_IMPL extends Expression
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
   * @see sar.drone.drn.DrnPackage#getDepYZ_IMPL_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sar.drone.drn.DepYZ_IMPL#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Temps CST</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Temps CST</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temps CST</em>' attribute.
   * @see #setTempsCST(String)
   * @see sar.drone.drn.DrnPackage#getDepYZ_IMPL_TempsCST()
   * @model
   * @generated
   */
  String getTempsCST();

  /**
   * Sets the value of the '{@link sar.drone.drn.DepYZ_IMPL#getTempsCST <em>Temps CST</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Temps CST</em>' attribute.
   * @see #getTempsCST()
   * @generated
   */
  void setTempsCST(String value);

  /**
   * Returns the value of the '<em><b>Temps VAR</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Temps VAR</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temps VAR</em>' reference.
   * @see #setTempsVAR(Parametre)
   * @see sar.drone.drn.DrnPackage#getDepYZ_IMPL_TempsVAR()
   * @model
   * @generated
   */
  Parametre getTempsVAR();

  /**
   * Sets the value of the '{@link sar.drone.drn.DepYZ_IMPL#getTempsVAR <em>Temps VAR</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Temps VAR</em>' reference.
   * @see #getTempsVAR()
   * @generated
   */
  void setTempsVAR(Parametre value);

} // DepYZ_IMPL
