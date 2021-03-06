/**
 * generated by Xtext 2.14.0
 */
package org.xtext.spring.springConfigDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Time Weaver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.LoadTimeWeaver#getAspectjWeaving <em>Aspectj Weaving</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.LoadTimeWeaver#getWeaverClass <em>Weaver Class</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getLoadTimeWeaver()
 * @model
 * @generated
 */
public interface LoadTimeWeaver extends Context
{
  /**
   * Returns the value of the '<em><b>Aspectj Weaving</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aspectj Weaving</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aspectj Weaving</em>' attribute.
   * @see #setAspectjWeaving(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getLoadTimeWeaver_AspectjWeaving()
   * @model
   * @generated
   */
  String getAspectjWeaving();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.LoadTimeWeaver#getAspectjWeaving <em>Aspectj Weaving</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aspectj Weaving</em>' attribute.
   * @see #getAspectjWeaving()
   * @generated
   */
  void setAspectjWeaving(String value);

  /**
   * Returns the value of the '<em><b>Weaver Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weaver Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weaver Class</em>' attribute.
   * @see #setWeaverClass(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getLoadTimeWeaver_WeaverClass()
   * @model
   * @generated
   */
  String getWeaverClass();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.LoadTimeWeaver#getWeaverClass <em>Weaver Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weaver Class</em>' attribute.
   * @see #getWeaverClass()
   * @generated
   */
  void setWeaverClass(String value);

} // LoadTimeWeaver
