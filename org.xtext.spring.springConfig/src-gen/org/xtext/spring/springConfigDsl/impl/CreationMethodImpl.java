/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.spring.springConfigDsl.ClassOrFactory;
import org.xtext.spring.springConfigDsl.CreationMethod;
import org.xtext.spring.springConfigDsl.SpringConfigDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Creation Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.CreationMethodImpl#getFactoryMethod <em>Factory Method</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.CreationMethodImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreationMethodImpl extends MinimalEObjectImpl.Container implements CreationMethod
{
  /**
	 * The default value of the '{@link #getFactoryMethod() <em>Factory Method</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFactoryMethod()
	 * @generated
	 * @ordered
	 */
  protected static final String FACTORY_METHOD_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getFactoryMethod() <em>Factory Method</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFactoryMethod()
	 * @generated
	 * @ordered
	 */
  protected String factoryMethod = FACTORY_METHOD_EDEFAULT;

  /**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
  protected ClassOrFactory class_;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CreationMethodImpl()
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
		return SpringConfigDslPackage.Literals.CREATION_METHOD;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getFactoryMethod()
  {
		return factoryMethod;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFactoryMethod(String newFactoryMethod)
  {
		String oldFactoryMethod = factoryMethod;
		factoryMethod = newFactoryMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.CREATION_METHOD__FACTORY_METHOD, oldFactoryMethod, factoryMethod));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ClassOrFactory getClass_()
  {
		return class_;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetClass(ClassOrFactory newClass, NotificationChain msgs)
  {
		ClassOrFactory oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.CREATION_METHOD__CLASS, oldClass, newClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setClass(ClassOrFactory newClass)
  {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringConfigDslPackage.CREATION_METHOD__CLASS, null, msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringConfigDslPackage.CREATION_METHOD__CLASS, null, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.CREATION_METHOD__CLASS, newClass, newClass));
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
			case SpringConfigDslPackage.CREATION_METHOD__CLASS:
				return basicSetClass(null, msgs);
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
			case SpringConfigDslPackage.CREATION_METHOD__FACTORY_METHOD:
				return getFactoryMethod();
			case SpringConfigDslPackage.CREATION_METHOD__CLASS:
				return getClass_();
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
		switch (featureID) {
			case SpringConfigDslPackage.CREATION_METHOD__FACTORY_METHOD:
				setFactoryMethod((String)newValue);
				return;
			case SpringConfigDslPackage.CREATION_METHOD__CLASS:
				setClass((ClassOrFactory)newValue);
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
			case SpringConfigDslPackage.CREATION_METHOD__FACTORY_METHOD:
				setFactoryMethod(FACTORY_METHOD_EDEFAULT);
				return;
			case SpringConfigDslPackage.CREATION_METHOD__CLASS:
				setClass((ClassOrFactory)null);
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
			case SpringConfigDslPackage.CREATION_METHOD__FACTORY_METHOD:
				return FACTORY_METHOD_EDEFAULT == null ? factoryMethod != null : !FACTORY_METHOD_EDEFAULT.equals(factoryMethod);
			case SpringConfigDslPackage.CREATION_METHOD__CLASS:
				return class_ != null;
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
		result.append(" (factoryMethod: ");
		result.append(factoryMethod);
		result.append(')');
		return result.toString();
	}

} //CreationMethodImpl
