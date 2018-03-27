/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.spring.springConfigDsl.AopAdvisor;
import org.xtext.spring.springConfigDsl.AopAspect;
import org.xtext.spring.springConfigDsl.AopConfig;
import org.xtext.spring.springConfigDsl.AopPointcut;
import org.xtext.spring.springConfigDsl.SpringConfigDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aop Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.AopConfigImpl#getAopPointcuts <em>Aop Pointcuts</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.AopConfigImpl#getAopAdvisors <em>Aop Advisors</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.AopConfigImpl#getAspects <em>Aspects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AopConfigImpl extends AspectImpl implements AopConfig
{
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
	 * The cached value of the '{@link #getAopAdvisors() <em>Aop Advisors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAopAdvisors()
	 * @generated
	 * @ordered
	 */
  protected EList<AopAdvisor> aopAdvisors;

  /**
	 * The cached value of the '{@link #getAspects() <em>Aspects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAspects()
	 * @generated
	 * @ordered
	 */
  protected EList<AopAspect> aspects;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AopConfigImpl()
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
		return SpringConfigDslPackage.Literals.AOP_CONFIG;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<AopPointcut> getAopPointcuts()
  {
		if (aopPointcuts == null) {
			aopPointcuts = new EObjectContainmentEList<AopPointcut>(AopPointcut.class, this, SpringConfigDslPackage.AOP_CONFIG__AOP_POINTCUTS);
		}
		return aopPointcuts;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<AopAdvisor> getAopAdvisors()
  {
		if (aopAdvisors == null) {
			aopAdvisors = new EObjectContainmentEList<AopAdvisor>(AopAdvisor.class, this, SpringConfigDslPackage.AOP_CONFIG__AOP_ADVISORS);
		}
		return aopAdvisors;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<AopAspect> getAspects()
  {
		if (aspects == null) {
			aspects = new EObjectContainmentEList<AopAspect>(AopAspect.class, this, SpringConfigDslPackage.AOP_CONFIG__ASPECTS);
		}
		return aspects;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case SpringConfigDslPackage.AOP_CONFIG__AOP_POINTCUTS:
				return ((InternalEList<?>)getAopPointcuts()).basicRemove(otherEnd, msgs);
			case SpringConfigDslPackage.AOP_CONFIG__AOP_ADVISORS:
				return ((InternalEList<?>)getAopAdvisors()).basicRemove(otherEnd, msgs);
			case SpringConfigDslPackage.AOP_CONFIG__ASPECTS:
				return ((InternalEList<?>)getAspects()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case SpringConfigDslPackage.AOP_CONFIG__AOP_POINTCUTS:
				return getAopPointcuts();
			case SpringConfigDslPackage.AOP_CONFIG__AOP_ADVISORS:
				return getAopAdvisors();
			case SpringConfigDslPackage.AOP_CONFIG__ASPECTS:
				return getAspects();
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
		switch (featureID) {
			case SpringConfigDslPackage.AOP_CONFIG__AOP_POINTCUTS:
				getAopPointcuts().clear();
				getAopPointcuts().addAll((Collection<? extends AopPointcut>)newValue);
				return;
			case SpringConfigDslPackage.AOP_CONFIG__AOP_ADVISORS:
				getAopAdvisors().clear();
				getAopAdvisors().addAll((Collection<? extends AopAdvisor>)newValue);
				return;
			case SpringConfigDslPackage.AOP_CONFIG__ASPECTS:
				getAspects().clear();
				getAspects().addAll((Collection<? extends AopAspect>)newValue);
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
		switch (featureID) {
			case SpringConfigDslPackage.AOP_CONFIG__AOP_POINTCUTS:
				getAopPointcuts().clear();
				return;
			case SpringConfigDslPackage.AOP_CONFIG__AOP_ADVISORS:
				getAopAdvisors().clear();
				return;
			case SpringConfigDslPackage.AOP_CONFIG__ASPECTS:
				getAspects().clear();
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
		switch (featureID) {
			case SpringConfigDslPackage.AOP_CONFIG__AOP_POINTCUTS:
				return aopPointcuts != null && !aopPointcuts.isEmpty();
			case SpringConfigDslPackage.AOP_CONFIG__AOP_ADVISORS:
				return aopAdvisors != null && !aopAdvisors.isEmpty();
			case SpringConfigDslPackage.AOP_CONFIG__ASPECTS:
				return aspects != null && !aspects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AopConfigImpl
