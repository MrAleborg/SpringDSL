/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.Feature#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Feature#getArtefact <em>Artefact</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Feature#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Feature#getIndex <em>Index</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Feature#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
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
	 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getFeature_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Artefact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artefact</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Artefact</em>' containment reference.
	 * @see #setArtefact(AbstractArtefact)
	 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getFeature_Artefact()
	 * @model containment="true"
	 * @generated
	 */
  AbstractArtefact getArtefact();

  /**
	 * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Feature#getArtefact <em>Artefact</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artefact</em>' containment reference.
	 * @see #getArtefact()
	 * @generated
	 */
  void setArtefact(AbstractArtefact value);

  /**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getFeature_Description()
	 * @model
	 * @generated
	 */
  String getDescription();

  /**
	 * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Feature#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
  void setDescription(String value);

  /**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(String)
	 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getFeature_Index()
	 * @model
	 * @generated
	 */
  String getIndex();

  /**
	 * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Feature#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
  void setIndex(String value);

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
	 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getFeature_Type()
	 * @model
	 * @generated
	 */
  String getType();

  /**
	 * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Feature#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
  void setType(String value);

} // Feature
