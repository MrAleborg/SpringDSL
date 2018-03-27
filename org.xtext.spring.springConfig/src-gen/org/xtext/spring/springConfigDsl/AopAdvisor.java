/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aop Advisor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.AopAdvisor#getAdviceRef <em>Advice Ref</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.AopAdvisor#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.AopAdvisor#getOrder <em>Order</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.AopAdvisor#getPointcut <em>Pointcut</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.AopAdvisor#getPointcutRef <em>Pointcut Ref</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAopAdvisor()
 * @model
 * @generated
 */
public interface AopAdvisor extends EObject
{
  /**
	 * Returns the value of the '<em><b>Advice Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Advice Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Advice Ref</em>' reference.
	 * @see #setAdviceRef(TxAdvise)
	 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAopAdvisor_AdviceRef()
	 * @model
	 * @generated
	 */
  TxAdvise getAdviceRef();

  /**
	 * Sets the value of the '{@link org.xtext.spring.springConfigDsl.AopAdvisor#getAdviceRef <em>Advice Ref</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advice Ref</em>' reference.
	 * @see #getAdviceRef()
	 * @generated
	 */
  void setAdviceRef(TxAdvise value);

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
	 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAopAdvisor_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.xtext.spring.springConfigDsl.AopAdvisor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(String)
	 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAopAdvisor_Order()
	 * @model
	 * @generated
	 */
  String getOrder();

  /**
	 * Sets the value of the '{@link org.xtext.spring.springConfigDsl.AopAdvisor#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
  void setOrder(String value);

  /**
	 * Returns the value of the '<em><b>Pointcut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointcut</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointcut</em>' containment reference.
	 * @see #setPointcut(AopPointcut)
	 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAopAdvisor_Pointcut()
	 * @model containment="true"
	 * @generated
	 */
  AopPointcut getPointcut();

  /**
	 * Sets the value of the '{@link org.xtext.spring.springConfigDsl.AopAdvisor#getPointcut <em>Pointcut</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointcut</em>' containment reference.
	 * @see #getPointcut()
	 * @generated
	 */
  void setPointcut(AopPointcut value);

  /**
	 * Returns the value of the '<em><b>Pointcut Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointcut Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointcut Ref</em>' reference.
	 * @see #setPointcutRef(AopPointcut)
	 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAopAdvisor_PointcutRef()
	 * @model
	 * @generated
	 */
  AopPointcut getPointcutRef();

  /**
	 * Sets the value of the '{@link org.xtext.spring.springConfigDsl.AopAdvisor#getPointcutRef <em>Pointcut Ref</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointcut Ref</em>' reference.
	 * @see #getPointcutRef()
	 * @generated
	 */
  void setPointcutRef(AopPointcut value);

} // AopAdvisor
