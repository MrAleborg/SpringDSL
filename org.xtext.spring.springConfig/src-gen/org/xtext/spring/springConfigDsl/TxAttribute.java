/**
 * generated by Xtext 2.14.0
 */
package org.xtext.spring.springConfigDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tx Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.TxAttribute#getTxMethods <em>Tx Methods</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getTxAttribute()
 * @model
 * @generated
 */
public interface TxAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Tx Methods</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.TxMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tx Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tx Methods</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getTxAttribute_TxMethods()
   * @model containment="true"
   * @generated
   */
  EList<TxMethod> getTxMethods();

} // TxAttribute
