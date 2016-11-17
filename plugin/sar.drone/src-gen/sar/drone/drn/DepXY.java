/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dep XY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.DepXY#getDistanceCST <em>Distance CST</em>}</li>
 *   <li>{@link sar.drone.drn.DepXY#getDistanceVar <em>Distance Var</em>}</li>
 * </ul>
 *
 * @see sar.drone.drn.DrnPackage#getDepXY()
 * @model
 * @generated
 */
public interface DepXY extends DepXY_IMPL
{
  /**
   * Returns the value of the '<em><b>Distance CST</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distance CST</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distance CST</em>' attribute.
   * @see #setDistanceCST(String)
   * @see sar.drone.drn.DrnPackage#getDepXY_DistanceCST()
   * @model
   * @generated
   */
  String getDistanceCST();

  /**
   * Sets the value of the '{@link sar.drone.drn.DepXY#getDistanceCST <em>Distance CST</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distance CST</em>' attribute.
   * @see #getDistanceCST()
   * @generated
   */
  void setDistanceCST(String value);

  /**
   * Returns the value of the '<em><b>Distance Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distance Var</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distance Var</em>' reference.
   * @see #setDistanceVar(Parametre)
   * @see sar.drone.drn.DrnPackage#getDepXY_DistanceVar()
   * @model
   * @generated
   */
  Parametre getDistanceVar();

  /**
   * Sets the value of the '{@link sar.drone.drn.DepXY#getDistanceVar <em>Distance Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distance Var</em>' reference.
   * @see #getDistanceVar()
   * @generated
   */
  void setDistanceVar(Parametre value);

} // DepXY