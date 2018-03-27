/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tx Advise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.TxAdvise#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.TxAdvise#getTransactionManager <em>Transaction Manager</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.TxAdvise#getTxAttribute <em>Tx Attribute</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getTxAdvise()
 * @model
 * @generated
 */
public interface TxAdvise extends EObject
{
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
	 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getTxAdvise_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.xtext.spring.springConfigDsl.TxAdvise#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Transaction Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transaction Manager</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Manager</em>' attribute.
	 * @see #setTransactionManager(String)
	 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getTxAdvise_TransactionManager()
	 * @model
	 * @generated
	 */
  String getTransactionManager();

  /**
	 * Sets the value of the '{@link org.xtext.spring.springConfigDsl.TxAdvise#getTransactionManager <em>Transaction Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Manager</em>' attribute.
	 * @see #getTransactionManager()
	 * @generated
	 */
  void setTransactionManager(String value);

  /**
	 * Returns the value of the '<em><b>Tx Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tx Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Tx Attribute</em>' containment reference.
	 * @see #setTxAttribute(TxAttribute)
	 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getTxAdvise_TxAttribute()
	 * @model containment="true"
	 * @generated
	 */
  TxAttribute getTxAttribute();

  /**
	 * Sets the value of the '{@link org.xtext.spring.springConfigDsl.TxAdvise#getTxAttribute <em>Tx Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx Attribute</em>' containment reference.
	 * @see #getTxAttribute()
	 * @generated
	 */
  void setTxAttribute(TxAttribute value);

} // TxAdvise
