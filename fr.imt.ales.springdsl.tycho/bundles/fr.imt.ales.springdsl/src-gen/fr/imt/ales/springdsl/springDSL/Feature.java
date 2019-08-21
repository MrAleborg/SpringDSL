/**
 * generated by Xtext 2.18.0
 */
package fr.imt.ales.springdsl.springDSL;

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
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Feature#getName <em>Name</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Feature#getArtefact <em>Artefact</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Feature#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Feature#getIndex <em>Index</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Feature#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.Feature#getName <em>Name</em>}' attribute.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artefact</em>' containment reference.
   * @see #setArtefact(AbstractArtefact)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getFeature_Artefact()
   * @model containment="true"
   * @generated
   */
  AbstractArtefact getArtefact();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.Feature#getArtefact <em>Artefact</em>}' containment reference.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getFeature_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.Feature#getDescription <em>Description</em>}' attribute.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(String)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getFeature_Index()
   * @model
   * @generated
   */
  String getIndex();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.Feature#getIndex <em>Index</em>}' attribute.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getFeature_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.Feature#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // Feature