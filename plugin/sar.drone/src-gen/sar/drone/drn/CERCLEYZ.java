/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CERCLEYZ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.CERCLEYZ#getRayonCST <em>Rayon CST</em>}</li>
 *   <li>{@link sar.drone.drn.CERCLEYZ#getRayonVar <em>Rayon Var</em>}</li>
 * </ul>
 *
 * @see sar.drone.drn.DrnPackage#getCERCLEYZ()
 * @model
 * @generated
 */
public interface CERCLEYZ extends DepYZ_IMPL
{
  /**
   * Returns the value of the '<em><b>Rayon CST</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rayon CST</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rayon CST</em>' attribute.
   * @see #setRayonCST(String)
   * @see sar.drone.drn.DrnPackage#getCERCLEYZ_RayonCST()
   * @model
   * @generated
   */
  String getRayonCST();

  /**
   * Sets the value of the '{@link sar.drone.drn.CERCLEYZ#getRayonCST <em>Rayon CST</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rayon CST</em>' attribute.
   * @see #getRayonCST()
   * @generated
   */
  void setRayonCST(String value);

  /**
   * Returns the value of the '<em><b>Rayon Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rayon Var</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rayon Var</em>' reference.
   * @see #setRayonVar(Parametre)
   * @see sar.drone.drn.DrnPackage#getCERCLEYZ_RayonVar()
   * @model
   * @generated
   */
  Parametre getRayonVar();

  /**
   * Sets the value of the '{@link sar.drone.drn.CERCLEYZ#getRayonVar <em>Rayon Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rayon Var</em>' reference.
   * @see #getRayonVar()
   * @generated
   */
  void setRayonVar(Parametre value);

} // CERCLEYZ