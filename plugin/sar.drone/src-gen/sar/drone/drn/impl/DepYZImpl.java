/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sar.drone.drn.DepYZ;
import sar.drone.drn.DrnPackage;
import sar.drone.drn.Parametre;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dep YZ</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.impl.DepYZImpl#getDistanceCST <em>Distance CST</em>}</li>
 *   <li>{@link sar.drone.drn.impl.DepYZImpl#getDistanceVar <em>Distance Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepYZImpl extends DepYZ_IMPLImpl implements DepYZ
{
  /**
   * The default value of the '{@link #getDistanceCST() <em>Distance CST</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistanceCST()
   * @generated
   * @ordered
   */
  protected static final String DISTANCE_CST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDistanceCST() <em>Distance CST</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistanceCST()
   * @generated
   * @ordered
   */
  protected String distanceCST = DISTANCE_CST_EDEFAULT;

  /**
   * The cached value of the '{@link #getDistanceVar() <em>Distance Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistanceVar()
   * @generated
   * @ordered
   */
  protected Parametre distanceVar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DepYZImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DrnPackage.Literals.DEP_YZ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDistanceCST()
  {
    return distanceCST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistanceCST(String newDistanceCST)
  {
    String oldDistanceCST = distanceCST;
    distanceCST = newDistanceCST;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.DEP_YZ__DISTANCE_CST, oldDistanceCST, distanceCST));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parametre getDistanceVar()
  {
    if (distanceVar != null && distanceVar.eIsProxy())
    {
      InternalEObject oldDistanceVar = (InternalEObject)distanceVar;
      distanceVar = (Parametre)eResolveProxy(oldDistanceVar);
      if (distanceVar != oldDistanceVar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DrnPackage.DEP_YZ__DISTANCE_VAR, oldDistanceVar, distanceVar));
      }
    }
    return distanceVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parametre basicGetDistanceVar()
  {
    return distanceVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistanceVar(Parametre newDistanceVar)
  {
    Parametre oldDistanceVar = distanceVar;
    distanceVar = newDistanceVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.DEP_YZ__DISTANCE_VAR, oldDistanceVar, distanceVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DrnPackage.DEP_YZ__DISTANCE_CST:
        return getDistanceCST();
      case DrnPackage.DEP_YZ__DISTANCE_VAR:
        if (resolve) return getDistanceVar();
        return basicGetDistanceVar();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DrnPackage.DEP_YZ__DISTANCE_CST:
        setDistanceCST((String)newValue);
        return;
      case DrnPackage.DEP_YZ__DISTANCE_VAR:
        setDistanceVar((Parametre)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DrnPackage.DEP_YZ__DISTANCE_CST:
        setDistanceCST(DISTANCE_CST_EDEFAULT);
        return;
      case DrnPackage.DEP_YZ__DISTANCE_VAR:
        setDistanceVar((Parametre)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DrnPackage.DEP_YZ__DISTANCE_CST:
        return DISTANCE_CST_EDEFAULT == null ? distanceCST != null : !DISTANCE_CST_EDEFAULT.equals(distanceCST);
      case DrnPackage.DEP_YZ__DISTANCE_VAR:
        return distanceVar != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer();
    result.append(" (distanceCST: ");
    result.append(distanceCST);
    result.append(')');
    return result.toString();
  }

} //DepYZImpl
