/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creation Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.CreationMethod#getFactoryMethod <em>Factory Method</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.CreationMethod#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getCreationMethod()
 * @model
 * @generated
 */
public interface CreationMethod extends EObject
{
  /**
   * Returns the value of the '<em><b>Factory Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factory Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factory Method</em>' attribute.
   * @see #setFactoryMethod(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getCreationMethod_FactoryMethod()
   * @model
   * @generated
   */
  String getFactoryMethod();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.CreationMethod#getFactoryMethod <em>Factory Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Factory Method</em>' attribute.
   * @see #getFactoryMethod()
   * @generated
   */
  void setFactoryMethod(String value);

  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(ClassOrFactory)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getCreationMethod_Class()
   * @model containment="true"
   * @generated
   */
  ClassOrFactory getClass_();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.CreationMethod#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(ClassOrFactory value);

} // CreationMethod
