/**
 * generated by Xtext 2.17.0
 */
package org.xtext.spring.springConfigDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getNames <em>Names</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getAutowireCandidate <em>Autowire Candidate</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getAutowire <em>Autowire</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getDetroyMethod <em>Detroy Method</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getInitMethod <em>Init Method</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getLazyInit <em>Lazy Init</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getParent <em>Parent</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getScope <em>Scope</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getLookupMethods <em>Lookup Methods</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getQualifiers <em>Qualifiers</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getAopScopedProxy <em>Aop Scoped Proxy</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Component#getUtilPropertiesPath <em>Util Properties Path</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends AbstractArtefact
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Component#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' attribute list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_Names()
   * @model unique="false"
   * @generated
   */
  EList<String> getNames();

  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(CreationMethod)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_Class()
   * @model containment="true"
   * @generated
   */
  CreationMethod getClass_();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Component#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(CreationMethod value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.Feature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.spring.springConfigDsl.sBoolean}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.sBoolean
   * @see #setAbstract(sBoolean)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_Abstract()
   * @model
   * @generated
   */
  sBoolean getAbstract();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Component#getAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.sBoolean
   * @see #getAbstract()
   * @generated
   */
  void setAbstract(sBoolean value);

  /**
   * Returns the value of the '<em><b>Autowire Candidate</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.spring.springConfigDsl.DefaultableBoolean}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Autowire Candidate</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.DefaultableBoolean
   * @see #setAutowireCandidate(DefaultableBoolean)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_AutowireCandidate()
   * @model
   * @generated
   */
  DefaultableBoolean getAutowireCandidate();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Component#getAutowireCandidate <em>Autowire Candidate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Autowire Candidate</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.DefaultableBoolean
   * @see #getAutowireCandidate()
   * @generated
   */
  void setAutowireCandidate(DefaultableBoolean value);

  /**
   * Returns the value of the '<em><b>Autowire</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.spring.springConfigDsl.DefaultableBoolean}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Autowire</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.DefaultableBoolean
   * @see #setAutowire(DefaultableBoolean)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_Autowire()
   * @model
   * @generated
   */
  DefaultableBoolean getAutowire();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Component#getAutowire <em>Autowire</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Autowire</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.DefaultableBoolean
   * @see #getAutowire()
   * @generated
   */
  void setAutowire(DefaultableBoolean value);

  /**
   * Returns the value of the '<em><b>Depends On</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Depends On</em>' reference.
   * @see #setDependsOn(Component)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_DependsOn()
   * @model
   * @generated
   */
  Component getDependsOn();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Component#getDependsOn <em>Depends On</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Depends On</em>' reference.
   * @see #getDependsOn()
   * @generated
   */
  void setDependsOn(Component value);

  /**
   * Returns the value of the '<em><b>Detroy Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Detroy Method</em>' attribute.
   * @see #setDetroyMethod(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_DetroyMethod()
   * @model
   * @generated
   */
  String getDetroyMethod();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Component#getDetroyMethod <em>Detroy Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Detroy Method</em>' attribute.
   * @see #getDetroyMethod()
   * @generated
   */
  void setDetroyMethod(String value);

  /**
   * Returns the value of the '<em><b>Init Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Method</em>' attribute.
   * @see #setInitMethod(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_InitMethod()
   * @model
   * @generated
   */
  String getInitMethod();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Component#getInitMethod <em>Init Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Method</em>' attribute.
   * @see #getInitMethod()
   * @generated
   */
  void setInitMethod(String value);

  /**
   * Returns the value of the '<em><b>Lazy Init</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.spring.springConfigDsl.DefaultableBoolean}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lazy Init</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.DefaultableBoolean
   * @see #setLazyInit(DefaultableBoolean)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_LazyInit()
   * @model
   * @generated
   */
  DefaultableBoolean getLazyInit();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Component#getLazyInit <em>Lazy Init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lazy Init</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.DefaultableBoolean
   * @see #getLazyInit()
   * @generated
   */
  void setLazyInit(DefaultableBoolean value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(Component)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_Parent()
   * @model
   * @generated
   */
  Component getParent();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Component#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Component value);

  /**
   * Returns the value of the '<em><b>Primary</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.spring.springConfigDsl.sBoolean}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.sBoolean
   * @see #setPrimary(sBoolean)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_Primary()
   * @model
   * @generated
   */
  sBoolean getPrimary();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Component#getPrimary <em>Primary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.sBoolean
   * @see #getPrimary()
   * @generated
   */
  void setPrimary(sBoolean value);

  /**
   * Returns the value of the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scope</em>' attribute.
   * @see #setScope(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_Scope()
   * @model
   * @generated
   */
  String getScope();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Component#getScope <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' attribute.
   * @see #getScope()
   * @generated
   */
  void setScope(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Component#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Lookup Methods</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.LookupMethod}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lookup Methods</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_LookupMethods()
   * @model containment="true"
   * @generated
   */
  EList<LookupMethod> getLookupMethods();

  /**
   * Returns the value of the '<em><b>Qualifiers</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.Qualifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifiers</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_Qualifiers()
   * @model containment="true"
   * @generated
   */
  EList<Qualifier> getQualifiers();

  /**
   * Returns the value of the '<em><b>Meta</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.Meta}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_Meta()
   * @model containment="true"
   * @generated
   */
  EList<Meta> getMeta();

  /**
   * Returns the value of the '<em><b>Aop Scoped Proxy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aop Scoped Proxy</em>' containment reference.
   * @see #setAopScopedProxy(AopScopedProxy)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_AopScopedProxy()
   * @model containment="true"
   * @generated
   */
  AopScopedProxy getAopScopedProxy();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Component#getAopScopedProxy <em>Aop Scoped Proxy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aop Scoped Proxy</em>' containment reference.
   * @see #getAopScopedProxy()
   * @generated
   */
  void setAopScopedProxy(AopScopedProxy value);

  /**
   * Returns the value of the '<em><b>Util Properties Path</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.UtilPropertyPath}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Util Properties Path</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getComponent_UtilPropertiesPath()
   * @model containment="true"
   * @generated
   */
  EList<UtilPropertyPath> getUtilPropertiesPath();

} // Component
