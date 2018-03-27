/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.Reference#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends AbstractArtefact
{
  /**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Component)
	 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getReference_Ref()
	 * @model
	 * @generated
	 */
  Component getRef();

  /**
	 * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Reference#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
  void setRef(Component value);

} // Reference
