/**
 * generated by Xtext 2.17.0
 */
package org.xtext.spring.springConfigDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.spring.springConfigDsl.Advise;
import org.xtext.spring.springConfigDsl.AopPointcut;
import org.xtext.spring.springConfigDsl.SpringConfigDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.AdviseImpl#getPointcutRef <em>Pointcut Ref</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.AdviseImpl#getPointcutExpression <em>Pointcut Expression</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.AdviseImpl#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdviseImpl extends MinimalEObjectImpl.Container implements Advise
{
  /**
   * The cached value of the '{@link #getPointcutRef() <em>Pointcut Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointcutRef()
   * @generated
   * @ordered
   */
  protected AopPointcut pointcutRef;

  /**
   * The default value of the '{@link #getPointcutExpression() <em>Pointcut Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointcutExpression()
   * @generated
   * @ordered
   */
  protected static final String POINTCUT_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPointcutExpression() <em>Pointcut Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointcutExpression()
   * @generated
   * @ordered
   */
  protected String pointcutExpression = POINTCUT_EXPRESSION_EDEFAULT;

  /**
   * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected static final String METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected String method = METHOD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdviseImpl()
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
    return SpringConfigDslPackage.Literals.ADVISE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AopPointcut getPointcutRef()
  {
    if (pointcutRef != null && pointcutRef.eIsProxy())
    {
      InternalEObject oldPointcutRef = (InternalEObject)pointcutRef;
      pointcutRef = (AopPointcut)eResolveProxy(oldPointcutRef);
      if (pointcutRef != oldPointcutRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpringConfigDslPackage.ADVISE__POINTCUT_REF, oldPointcutRef, pointcutRef));
      }
    }
    return pointcutRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AopPointcut basicGetPointcutRef()
  {
    return pointcutRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPointcutRef(AopPointcut newPointcutRef)
  {
    AopPointcut oldPointcutRef = pointcutRef;
    pointcutRef = newPointcutRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.ADVISE__POINTCUT_REF, oldPointcutRef, pointcutRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPointcutExpression()
  {
    return pointcutExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPointcutExpression(String newPointcutExpression)
  {
    String oldPointcutExpression = pointcutExpression;
    pointcutExpression = newPointcutExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.ADVISE__POINTCUT_EXPRESSION, oldPointcutExpression, pointcutExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMethod(String newMethod)
  {
    String oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.ADVISE__METHOD, oldMethod, method));
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
      case SpringConfigDslPackage.ADVISE__POINTCUT_REF:
        if (resolve) return getPointcutRef();
        return basicGetPointcutRef();
      case SpringConfigDslPackage.ADVISE__POINTCUT_EXPRESSION:
        return getPointcutExpression();
      case SpringConfigDslPackage.ADVISE__METHOD:
        return getMethod();
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
      case SpringConfigDslPackage.ADVISE__POINTCUT_REF:
        setPointcutRef((AopPointcut)newValue);
        return;
      case SpringConfigDslPackage.ADVISE__POINTCUT_EXPRESSION:
        setPointcutExpression((String)newValue);
        return;
      case SpringConfigDslPackage.ADVISE__METHOD:
        setMethod((String)newValue);
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
      case SpringConfigDslPackage.ADVISE__POINTCUT_REF:
        setPointcutRef((AopPointcut)null);
        return;
      case SpringConfigDslPackage.ADVISE__POINTCUT_EXPRESSION:
        setPointcutExpression(POINTCUT_EXPRESSION_EDEFAULT);
        return;
      case SpringConfigDslPackage.ADVISE__METHOD:
        setMethod(METHOD_EDEFAULT);
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
      case SpringConfigDslPackage.ADVISE__POINTCUT_REF:
        return pointcutRef != null;
      case SpringConfigDslPackage.ADVISE__POINTCUT_EXPRESSION:
        return POINTCUT_EXPRESSION_EDEFAULT == null ? pointcutExpression != null : !POINTCUT_EXPRESSION_EDEFAULT.equals(pointcutExpression);
      case SpringConfigDslPackage.ADVISE__METHOD:
        return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (PointcutExpression: ");
    result.append(pointcutExpression);
    result.append(", method: ");
    result.append(method);
    result.append(')');
    return result.toString();
  }

} //AdviseImpl
