/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.spring.springConfigDsl.PropertyFile;
import org.xtext.spring.springConfigDsl.SpringConfigDslPackage;
import org.xtext.spring.springConfigDsl.UtilProperties;
import org.xtext.spring.springConfigDsl.sBoolean;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Util Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.UtilPropertiesImpl#getPropertyfile <em>Propertyfile</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.UtilPropertiesImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.UtilPropertiesImpl#getIgnoreResourceNotFound <em>Ignore Resource Not Found</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.UtilPropertiesImpl#getLocalOverride <em>Local Override</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.UtilPropertiesImpl#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UtilPropertiesImpl extends PropsImpl implements UtilProperties
{
  /**
   * The cached value of the '{@link #getPropertyfile() <em>Propertyfile</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyfile()
   * @generated
   * @ordered
   */
  protected PropertyFile propertyfile;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getIgnoreResourceNotFound() <em>Ignore Resource Not Found</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIgnoreResourceNotFound()
   * @generated
   * @ordered
   */
  protected static final sBoolean IGNORE_RESOURCE_NOT_FOUND_EDEFAULT = sBoolean.FALSE;

  /**
   * The cached value of the '{@link #getIgnoreResourceNotFound() <em>Ignore Resource Not Found</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIgnoreResourceNotFound()
   * @generated
   * @ordered
   */
  protected sBoolean ignoreResourceNotFound = IGNORE_RESOURCE_NOT_FOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getLocalOverride() <em>Local Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalOverride()
   * @generated
   * @ordered
   */
  protected static final sBoolean LOCAL_OVERRIDE_EDEFAULT = sBoolean.FALSE;

  /**
   * The cached value of the '{@link #getLocalOverride() <em>Local Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalOverride()
   * @generated
   * @ordered
   */
  protected sBoolean localOverride = LOCAL_OVERRIDE_EDEFAULT;

  /**
   * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScope()
   * @generated
   * @ordered
   */
  protected static final String SCOPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScope()
   * @generated
   * @ordered
   */
  protected String scope = SCOPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UtilPropertiesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SpringConfigDslPackage.Literals.UTIL_PROPERTIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyFile getPropertyfile()
  {
    return propertyfile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropertyfile(PropertyFile newPropertyfile, NotificationChain msgs)
  {
    PropertyFile oldPropertyfile = propertyfile;
    propertyfile = newPropertyfile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.UTIL_PROPERTIES__PROPERTYFILE, oldPropertyfile, newPropertyfile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyfile(PropertyFile newPropertyfile)
  {
    if (newPropertyfile != propertyfile)
    {
      NotificationChain msgs = null;
      if (propertyfile != null)
        msgs = ((InternalEObject)propertyfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringConfigDslPackage.UTIL_PROPERTIES__PROPERTYFILE, null, msgs);
      if (newPropertyfile != null)
        msgs = ((InternalEObject)newPropertyfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringConfigDslPackage.UTIL_PROPERTIES__PROPERTYFILE, null, msgs);
      msgs = basicSetPropertyfile(newPropertyfile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.UTIL_PROPERTIES__PROPERTYFILE, newPropertyfile, newPropertyfile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.UTIL_PROPERTIES__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sBoolean getIgnoreResourceNotFound()
  {
    return ignoreResourceNotFound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIgnoreResourceNotFound(sBoolean newIgnoreResourceNotFound)
  {
    sBoolean oldIgnoreResourceNotFound = ignoreResourceNotFound;
    ignoreResourceNotFound = newIgnoreResourceNotFound == null ? IGNORE_RESOURCE_NOT_FOUND_EDEFAULT : newIgnoreResourceNotFound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.UTIL_PROPERTIES__IGNORE_RESOURCE_NOT_FOUND, oldIgnoreResourceNotFound, ignoreResourceNotFound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sBoolean getLocalOverride()
  {
    return localOverride;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocalOverride(sBoolean newLocalOverride)
  {
    sBoolean oldLocalOverride = localOverride;
    localOverride = newLocalOverride == null ? LOCAL_OVERRIDE_EDEFAULT : newLocalOverride;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.UTIL_PROPERTIES__LOCAL_OVERRIDE, oldLocalOverride, localOverride));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getScope()
  {
    return scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScope(String newScope)
  {
    String oldScope = scope;
    scope = newScope;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.UTIL_PROPERTIES__SCOPE, oldScope, scope));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SpringConfigDslPackage.UTIL_PROPERTIES__PROPERTYFILE:
        return basicSetPropertyfile(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SpringConfigDslPackage.UTIL_PROPERTIES__PROPERTYFILE:
        return getPropertyfile();
      case SpringConfigDslPackage.UTIL_PROPERTIES__NAME:
        return getName();
      case SpringConfigDslPackage.UTIL_PROPERTIES__IGNORE_RESOURCE_NOT_FOUND:
        return getIgnoreResourceNotFound();
      case SpringConfigDslPackage.UTIL_PROPERTIES__LOCAL_OVERRIDE:
        return getLocalOverride();
      case SpringConfigDslPackage.UTIL_PROPERTIES__SCOPE:
        return getScope();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpringConfigDslPackage.UTIL_PROPERTIES__PROPERTYFILE:
        setPropertyfile((PropertyFile)newValue);
        return;
      case SpringConfigDslPackage.UTIL_PROPERTIES__NAME:
        setName((String)newValue);
        return;
      case SpringConfigDslPackage.UTIL_PROPERTIES__IGNORE_RESOURCE_NOT_FOUND:
        setIgnoreResourceNotFound((sBoolean)newValue);
        return;
      case SpringConfigDslPackage.UTIL_PROPERTIES__LOCAL_OVERRIDE:
        setLocalOverride((sBoolean)newValue);
        return;
      case SpringConfigDslPackage.UTIL_PROPERTIES__SCOPE:
        setScope((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SpringConfigDslPackage.UTIL_PROPERTIES__PROPERTYFILE:
        setPropertyfile((PropertyFile)null);
        return;
      case SpringConfigDslPackage.UTIL_PROPERTIES__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SpringConfigDslPackage.UTIL_PROPERTIES__IGNORE_RESOURCE_NOT_FOUND:
        setIgnoreResourceNotFound(IGNORE_RESOURCE_NOT_FOUND_EDEFAULT);
        return;
      case SpringConfigDslPackage.UTIL_PROPERTIES__LOCAL_OVERRIDE:
        setLocalOverride(LOCAL_OVERRIDE_EDEFAULT);
        return;
      case SpringConfigDslPackage.UTIL_PROPERTIES__SCOPE:
        setScope(SCOPE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SpringConfigDslPackage.UTIL_PROPERTIES__PROPERTYFILE:
        return propertyfile != null;
      case SpringConfigDslPackage.UTIL_PROPERTIES__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SpringConfigDslPackage.UTIL_PROPERTIES__IGNORE_RESOURCE_NOT_FOUND:
        return ignoreResourceNotFound != IGNORE_RESOURCE_NOT_FOUND_EDEFAULT;
      case SpringConfigDslPackage.UTIL_PROPERTIES__LOCAL_OVERRIDE:
        return localOverride != LOCAL_OVERRIDE_EDEFAULT;
      case SpringConfigDslPackage.UTIL_PROPERTIES__SCOPE:
        return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", ignoreResourceNotFound: ");
    result.append(ignoreResourceNotFound);
    result.append(", localOverride: ");
    result.append(localOverride);
    result.append(", scope: ");
    result.append(scope);
    result.append(')');
    return result.toString();
  }

} //UtilPropertiesImpl
