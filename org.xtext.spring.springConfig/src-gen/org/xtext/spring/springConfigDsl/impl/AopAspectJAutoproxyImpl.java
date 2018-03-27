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

import org.xtext.spring.springConfigDsl.AopAspectJAutoproxy;
import org.xtext.spring.springConfigDsl.AopInclude;
import org.xtext.spring.springConfigDsl.SpringConfigDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aop Aspect JAutoproxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.AopAspectJAutoproxyImpl#getAopincludes <em>Aopincludes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AopAspectJAutoproxyImpl extends AspectImpl implements AopAspectJAutoproxy
{
  /**
	 * The cached value of the '{@link #getAopincludes() <em>Aopincludes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAopincludes()
	 * @generated
	 * @ordered
	 */
  protected EList<AopInclude> aopincludes;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AopAspectJAutoproxyImpl()
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
		return SpringConfigDslPackage.Literals.AOP_ASPECT_JAUTOPROXY;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<AopInclude> getAopincludes()
  {
		if (aopincludes == null) {
			aopincludes = new EObjectContainmentEList<AopInclude>(AopInclude.class, this, SpringConfigDslPackage.AOP_ASPECT_JAUTOPROXY__AOPINCLUDES);
		}
		return aopincludes;
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
			case SpringConfigDslPackage.AOP_ASPECT_JAUTOPROXY__AOPINCLUDES:
				return ((InternalEList<?>)getAopincludes()).basicRemove(otherEnd, msgs);
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
			case SpringConfigDslPackage.AOP_ASPECT_JAUTOPROXY__AOPINCLUDES:
				return getAopincludes();
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
			case SpringConfigDslPackage.AOP_ASPECT_JAUTOPROXY__AOPINCLUDES:
				getAopincludes().clear();
				getAopincludes().addAll((Collection<? extends AopInclude>)newValue);
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
			case SpringConfigDslPackage.AOP_ASPECT_JAUTOPROXY__AOPINCLUDES:
				getAopincludes().clear();
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
			case SpringConfigDslPackage.AOP_ASPECT_JAUTOPROXY__AOPINCLUDES:
				return aopincludes != null && !aopincludes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AopAspectJAutoproxyImpl
