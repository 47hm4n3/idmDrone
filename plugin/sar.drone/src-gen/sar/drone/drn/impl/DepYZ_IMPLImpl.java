/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sar.drone.drn.DepYZ_IMPL;
import sar.drone.drn.DrnPackage;
import sar.drone.drn.Parametre;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dep YZ IMPL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.impl.DepYZ_IMPLImpl#getName <em>Name</em>}</li>
 *   <li>{@link sar.drone.drn.impl.DepYZ_IMPLImpl#getTempsCST <em>Temps CST</em>}</li>
 *   <li>{@link sar.drone.drn.impl.DepYZ_IMPLImpl#getTempsVAR <em>Temps VAR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepYZ_IMPLImpl extends ExpressionImpl implements DepYZ_IMPL
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTempsCST() <em>Temps CST</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTempsCST()
   * @generated
   * @ordered
   */
  protected static final String TEMPS_CST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTempsCST() <em>Temps CST</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTempsCST()
   * @generated
   * @ordered
   */
  protected String tempsCST = TEMPS_CST_EDEFAULT;

  /**
   * The cached value of the '{@link #getTempsVAR() <em>Temps VAR</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTempsVAR()
   * @generated
   * @ordered
   */
  protected Parametre tempsVAR;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DepYZ_IMPLImpl()
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
    return DrnPackage.Literals.DEP_YZ_IMPL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.DEP_YZ_IMPL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTempsCST()
  {
    return tempsCST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTempsCST(String newTempsCST)
  {
    String oldTempsCST = tempsCST;
    tempsCST = newTempsCST;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.DEP_YZ_IMPL__TEMPS_CST, oldTempsCST, tempsCST));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parametre getTempsVAR()
  {
    if (tempsVAR != null && tempsVAR.eIsProxy())
    {
      InternalEObject oldTempsVAR = (InternalEObject)tempsVAR;
      tempsVAR = (Parametre)eResolveProxy(oldTempsVAR);
      if (tempsVAR != oldTempsVAR)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DrnPackage.DEP_YZ_IMPL__TEMPS_VAR, oldTempsVAR, tempsVAR));
      }
    }
    return tempsVAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parametre basicGetTempsVAR()
  {
    return tempsVAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTempsVAR(Parametre newTempsVAR)
  {
    Parametre oldTempsVAR = tempsVAR;
    tempsVAR = newTempsVAR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.DEP_YZ_IMPL__TEMPS_VAR, oldTempsVAR, tempsVAR));
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
      case DrnPackage.DEP_YZ_IMPL__NAME:
        return getName();
      case DrnPackage.DEP_YZ_IMPL__TEMPS_CST:
        return getTempsCST();
      case DrnPackage.DEP_YZ_IMPL__TEMPS_VAR:
        if (resolve) return getTempsVAR();
        return basicGetTempsVAR();
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
      case DrnPackage.DEP_YZ_IMPL__NAME:
        setName((String)newValue);
        return;
      case DrnPackage.DEP_YZ_IMPL__TEMPS_CST:
        setTempsCST((String)newValue);
        return;
      case DrnPackage.DEP_YZ_IMPL__TEMPS_VAR:
        setTempsVAR((Parametre)newValue);
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
      case DrnPackage.DEP_YZ_IMPL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DrnPackage.DEP_YZ_IMPL__TEMPS_CST:
        setTempsCST(TEMPS_CST_EDEFAULT);
        return;
      case DrnPackage.DEP_YZ_IMPL__TEMPS_VAR:
        setTempsVAR((Parametre)null);
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
      case DrnPackage.DEP_YZ_IMPL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DrnPackage.DEP_YZ_IMPL__TEMPS_CST:
        return TEMPS_CST_EDEFAULT == null ? tempsCST != null : !TEMPS_CST_EDEFAULT.equals(tempsCST);
      case DrnPackage.DEP_YZ_IMPL__TEMPS_VAR:
        return tempsVAR != null;
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
	  return super.toString();
  }

} //DepYZ_IMPLImpl
