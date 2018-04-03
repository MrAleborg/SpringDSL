/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.spring.springConfigDsl.Advise;
import org.xtext.spring.springConfigDsl.AopAspect;
import org.xtext.spring.springConfigDsl.AopPointcut;
import org.xtext.spring.springConfigDsl.Component;
import org.xtext.spring.springConfigDsl.DeclareParents;
import org.xtext.spring.springConfigDsl.SpringConfigDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aop Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.AopAspectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.AopAspectImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.AopAspectImpl#getBackingBeanRef <em>Backing Bean Ref</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.AopAspectImpl#getAopPointcuts <em>Aop Pointcuts</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.AopAspectImpl#getDeclaredParents <em>Declared Parents</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.AopAspectImpl#getAdvises <em>Advises</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AopAspectImpl extends MinimalEObjectImpl.Container implements AopAspect
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
   * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected static final String ORDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected String order = ORDER_EDEFAULT;

  /**
   * The cached value of the '{@link #getBackingBeanRef() <em>Backing Bean Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackingBeanRef()
   * @generated
   * @ordered
   */
  protected Component backingBeanRef;

  /**
   * The cached value of the '{@link #getAopPointcuts() <em>Aop Pointcuts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAopPointcuts()
   * @generated
   * @ordered
   */
  protected EList<AopPointcut> aopPointcuts;

  /**
   * The cached value of the '{@link #getDeclaredParents() <em>Declared Parents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredParents()
   * @generated
   * @ordered
   */
  protected EList<DeclareParents> declaredParents;

  /**
   * The cached value of the '{@link #getAdvises() <em>Advises</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdvises()
   * @generated
   * @ordered
   */
  protected EList<Advise> advises;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AopAspectImpl()
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
    return SpringConfigDslPackage.Literals.AOP_ASPECT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.AOP_ASPECT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOrder()
  {
    return order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrder(String newOrder)
  {
    String oldOrder = order;
    order = newOrder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.AOP_ASPECT__ORDER, oldOrder, order));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getBackingBeanRef()
  {
    if (backingBeanRef != null && backingBeanRef.eIsProxy())
    {
      InternalEObject oldBackingBeanRef = (InternalEObject)backingBeanRef;
      backingBeanRef = (Component)eResolveProxy(oldBackingBeanRef);
      if (backingBeanRef != oldBackingBeanRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpringConfigDslPackage.AOP_ASPECT__BACKING_BEAN_REF, oldBackingBeanRef, backingBeanRef));
      }
    }
    return backingBeanRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component basicGetBackingBeanRef()
  {
    return backingBeanRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBackingBeanRef(Component newBackingBeanRef)
  {
    Component oldBackingBeanRef = backingBeanRef;
    backingBeanRef = newBackingBeanRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.AOP_ASPECT__BACKING_BEAN_REF, oldBackingBeanRef, backingBeanRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AopPointcut> getAopPointcuts()
  {
    if (aopPointcuts == null)
    {
      aopPointcuts = new EObjectContainmentEList<AopPointcut>(AopPointcut.class, this, SpringConfigDslPackage.AOP_ASPECT__AOP_POINTCUTS);
    }
    return aopPointcuts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeclareParents> getDeclaredParents()
  {
    if (declaredParents == null)
    {
      declaredParents = new EObjectContainmentEList<DeclareParents>(DeclareParents.class, this, SpringConfigDslPackage.AOP_ASPECT__DECLARED_PARENTS);
    }
    return declaredParents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Advise> getAdvises()
  {
    if (advises == null)
    {
      advises = new EObjectContainmentEList<Advise>(Advise.class, this, SpringConfigDslPackage.AOP_ASPECT__ADVISES);
    }
    return advises;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SpringConfigDslPackage.AOP_ASPECT__AOP_POINTCUTS:
        return ((InternalEList<?>)getAopPointcuts()).basicRemove(otherEnd, msgs);
      case SpringConfigDslPackage.AOP_ASPECT__DECLARED_PARENTS:
        return ((InternalEList<?>)getDeclaredParents()).basicRemove(otherEnd, msgs);
      case SpringConfigDslPackage.AOP_ASPECT__ADVISES:
        return ((InternalEList<?>)getAdvises()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SpringConfigDslPackage.AOP_ASPECT__NAME:
        return getName();
      case SpringConfigDslPackage.AOP_ASPECT__ORDER:
        return getOrder();
      case SpringConfigDslPackage.AOP_ASPECT__BACKING_BEAN_REF:
        if (resolve) return getBackingBeanRef();
        return basicGetBackingBeanRef();
      case SpringConfigDslPackage.AOP_ASPECT__AOP_POINTCUTS:
        return getAopPointcuts();
      case SpringConfigDslPackage.AOP_ASPECT__DECLARED_PARENTS:
        return getDeclaredParents();
      case SpringConfigDslPackage.AOP_ASPECT__ADVISES:
        return getAdvises();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpringConfigDslPackage.AOP_ASPECT__NAME:
        setName((String)newValue);
        return;
      case SpringConfigDslPackage.AOP_ASPECT__ORDER:
        setOrder((String)newValue);
        return;
      case SpringConfigDslPackage.AOP_ASPECT__BACKING_BEAN_REF:
        setBackingBeanRef((Component)newValue);
        return;
      case SpringConfigDslPackage.AOP_ASPECT__AOP_POINTCUTS:
        getAopPointcuts().clear();
        getAopPointcuts().addAll((Collection<? extends AopPointcut>)newValue);
        return;
      case SpringConfigDslPackage.AOP_ASPECT__DECLARED_PARENTS:
        getDeclaredParents().clear();
        getDeclaredParents().addAll((Collection<? extends DeclareParents>)newValue);
        return;
      case SpringConfigDslPackage.AOP_ASPECT__ADVISES:
        getAdvises().clear();
        getAdvises().addAll((Collection<? extends Advise>)newValue);
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
      case SpringConfigDslPackage.AOP_ASPECT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SpringConfigDslPackage.AOP_ASPECT__ORDER:
        setOrder(ORDER_EDEFAULT);
        return;
      case SpringConfigDslPackage.AOP_ASPECT__BACKING_BEAN_REF:
        setBackingBeanRef((Component)null);
        return;
      case SpringConfigDslPackage.AOP_ASPECT__AOP_POINTCUTS:
        getAopPointcuts().clear();
        return;
      case SpringConfigDslPackage.AOP_ASPECT__DECLARED_PARENTS:
        getDeclaredParents().clear();
        return;
      case SpringConfigDslPackage.AOP_ASPECT__ADVISES:
        getAdvises().clear();
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
      case SpringConfigDslPackage.AOP_ASPECT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SpringConfigDslPackage.AOP_ASPECT__ORDER:
        return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
      case SpringConfigDslPackage.AOP_ASPECT__BACKING_BEAN_REF:
        return backingBeanRef != null;
      case SpringConfigDslPackage.AOP_ASPECT__AOP_POINTCUTS:
        return aopPointcuts != null && !aopPointcuts.isEmpty();
      case SpringConfigDslPackage.AOP_ASPECT__DECLARED_PARENTS:
        return declaredParents != null && !declaredParents.isEmpty();
      case SpringConfigDslPackage.AOP_ASPECT__ADVISES:
        return advises != null && !advises.isEmpty();
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", order: ");
    result.append(order);
    result.append(')');
    return result.toString();
  }

} //AopAspectImpl
