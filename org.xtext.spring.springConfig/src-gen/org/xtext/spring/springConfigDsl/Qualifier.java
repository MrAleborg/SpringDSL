/**
 * generated by Xtext 2.14.0
 */
package org.xtext.spring.springConfigDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.Qualifier#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Qualifier#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Qualifier#getQualifierAttributes <em>Qualifier Attributes</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getQualifier()
 * @model
 * @generated
 */
public interface Qualifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getQualifier_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Qualifier#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getQualifier_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Qualifier#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Qualifier Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.QualifierAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualifier Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifier Attributes</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getQualifier_QualifierAttributes()
   * @model containment="true"
   * @generated
   */
  EList<QualifierAttribute> getQualifierAttributes();

} // Qualifier
