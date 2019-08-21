/**
 * generated by Xtext 2.18.0
 */
package fr.imt.ales.springdsl.springDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tx Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.TxMethod#getName <em>Name</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.TxMethod#getIsolation <em>Isolation</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.TxMethod#getNoRollBackFor <em>No Roll Back For</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.TxMethod#getPropagation <em>Propagation</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.TxMethod#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.TxMethod#getRollbackFor <em>Rollback For</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.TxMethod#getTimeOut <em>Time Out</em>}</li>
 * </ul>
 *
 * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getTxMethod()
 * @model
 * @generated
 */
public interface TxMethod extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getTxMethod_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.TxMethod#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Isolation</b></em>' attribute.
   * The literals are from the enumeration {@link fr.imt.ales.springdsl.springDSL.EnumIsolation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Isolation</em>' attribute.
   * @see fr.imt.ales.springdsl.springDSL.EnumIsolation
   * @see #setIsolation(EnumIsolation)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getTxMethod_Isolation()
   * @model
   * @generated
   */
  EnumIsolation getIsolation();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.TxMethod#getIsolation <em>Isolation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Isolation</em>' attribute.
   * @see fr.imt.ales.springdsl.springDSL.EnumIsolation
   * @see #getIsolation()
   * @generated
   */
  void setIsolation(EnumIsolation value);

  /**
   * Returns the value of the '<em><b>No Roll Back For</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>No Roll Back For</em>' attribute.
   * @see #setNoRollBackFor(String)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getTxMethod_NoRollBackFor()
   * @model
   * @generated
   */
  String getNoRollBackFor();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.TxMethod#getNoRollBackFor <em>No Roll Back For</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>No Roll Back For</em>' attribute.
   * @see #getNoRollBackFor()
   * @generated
   */
  void setNoRollBackFor(String value);

  /**
   * Returns the value of the '<em><b>Propagation</b></em>' attribute.
   * The literals are from the enumeration {@link fr.imt.ales.springdsl.springDSL.EnumIsolation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Propagation</em>' attribute.
   * @see fr.imt.ales.springdsl.springDSL.EnumIsolation
   * @see #setPropagation(EnumIsolation)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getTxMethod_Propagation()
   * @model
   * @generated
   */
  EnumIsolation getPropagation();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.TxMethod#getPropagation <em>Propagation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Propagation</em>' attribute.
   * @see fr.imt.ales.springdsl.springDSL.EnumIsolation
   * @see #getPropagation()
   * @generated
   */
  void setPropagation(EnumIsolation value);

  /**
   * Returns the value of the '<em><b>Read Only</b></em>' attribute.
   * The literals are from the enumeration {@link fr.imt.ales.springdsl.springDSL.sBoolean}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Read Only</em>' attribute.
   * @see fr.imt.ales.springdsl.springDSL.sBoolean
   * @see #setReadOnly(sBoolean)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getTxMethod_ReadOnly()
   * @model
   * @generated
   */
  sBoolean getReadOnly();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.TxMethod#getReadOnly <em>Read Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Read Only</em>' attribute.
   * @see fr.imt.ales.springdsl.springDSL.sBoolean
   * @see #getReadOnly()
   * @generated
   */
  void setReadOnly(sBoolean value);

  /**
   * Returns the value of the '<em><b>Rollback For</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rollback For</em>' attribute.
   * @see #setRollbackFor(String)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getTxMethod_RollbackFor()
   * @model
   * @generated
   */
  String getRollbackFor();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.TxMethod#getRollbackFor <em>Rollback For</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rollback For</em>' attribute.
   * @see #getRollbackFor()
   * @generated
   */
  void setRollbackFor(String value);

  /**
   * Returns the value of the '<em><b>Time Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time Out</em>' attribute.
   * @see #setTimeOut(String)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getTxMethod_TimeOut()
   * @model
   * @generated
   */
  String getTimeOut();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.TxMethod#getTimeOut <em>Time Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Out</em>' attribute.
   * @see #getTimeOut()
   * @generated
   */
  void setTimeOut(String value);

} // TxMethod