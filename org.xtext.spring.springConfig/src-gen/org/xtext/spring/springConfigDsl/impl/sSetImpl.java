/**
 * generated by Xtext 2.14.0
 */
package org.xtext.spring.springConfigDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.spring.springConfigDsl.AbstractArtefact;
import org.xtext.spring.springConfigDsl.SpringConfigDslPackage;
import org.xtext.spring.springConfigDsl.sSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sSet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.sSetImpl#getArtefacts <em>Artefacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class sSetImpl extends CollectionImpl implements sSet
{
  /**
   * The cached value of the '{@link #getArtefacts() <em>Artefacts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtefacts()
   * @generated
   * @ordered
   */
  protected EList<AbstractArtefact> artefacts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected sSetImpl()
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
    return SpringConfigDslPackage.Literals.SSET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractArtefact> getArtefacts()
  {
    if (artefacts == null)
    {
      artefacts = new EObjectContainmentEList<AbstractArtefact>(AbstractArtefact.class, this, SpringConfigDslPackage.SSET__ARTEFACTS);
    }
    return artefacts;
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
      case SpringConfigDslPackage.SSET__ARTEFACTS:
        return ((InternalEList<?>)getArtefacts()).basicRemove(otherEnd, msgs);
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
      case SpringConfigDslPackage.SSET__ARTEFACTS:
        return getArtefacts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpringConfigDslPackage.SSET__ARTEFACTS:
        getArtefacts().clear();
        getArtefacts().addAll((Collection<? extends AbstractArtefact>)newValue);
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
      case SpringConfigDslPackage.SSET__ARTEFACTS:
        getArtefacts().clear();
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
      case SpringConfigDslPackage.SSET__ARTEFACTS:
        return artefacts != null && !artefacts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //sSetImpl
