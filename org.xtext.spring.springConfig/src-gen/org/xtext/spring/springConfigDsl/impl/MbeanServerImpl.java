/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.spring.springConfigDsl.MbeanServer;
import org.xtext.spring.springConfigDsl.SpringConfigDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mbean Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.MbeanServerImpl#getAgentId <em>Agent Id</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.MbeanServerImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MbeanServerImpl extends ContextImpl implements MbeanServer
{
  /**
	 * The default value of the '{@link #getAgentId() <em>Agent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAgentId()
	 * @generated
	 * @ordered
	 */
  protected static final String AGENT_ID_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getAgentId() <em>Agent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAgentId()
	 * @generated
	 * @ordered
	 */
  protected String agentId = AGENT_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MbeanServerImpl()
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
		return SpringConfigDslPackage.Literals.MBEAN_SERVER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getAgentId()
  {
		return agentId;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAgentId(String newAgentId)
  {
		String oldAgentId = agentId;
		agentId = newAgentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.MBEAN_SERVER__AGENT_ID, oldAgentId, agentId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.MBEAN_SERVER__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case SpringConfigDslPackage.MBEAN_SERVER__AGENT_ID:
				return getAgentId();
			case SpringConfigDslPackage.MBEAN_SERVER__NAME:
				return getName();
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
		switch (featureID) {
			case SpringConfigDslPackage.MBEAN_SERVER__AGENT_ID:
				setAgentId((String)newValue);
				return;
			case SpringConfigDslPackage.MBEAN_SERVER__NAME:
				setName((String)newValue);
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
		switch (featureID) {
			case SpringConfigDslPackage.MBEAN_SERVER__AGENT_ID:
				setAgentId(AGENT_ID_EDEFAULT);
				return;
			case SpringConfigDslPackage.MBEAN_SERVER__NAME:
				setName(NAME_EDEFAULT);
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
		switch (featureID) {
			case SpringConfigDslPackage.MBEAN_SERVER__AGENT_ID:
				return AGENT_ID_EDEFAULT == null ? agentId != null : !AGENT_ID_EDEFAULT.equals(agentId);
			case SpringConfigDslPackage.MBEAN_SERVER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (agentId: ");
		result.append(agentId);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MbeanServerImpl
