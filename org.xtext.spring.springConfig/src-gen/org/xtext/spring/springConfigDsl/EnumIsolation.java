/**
 * generated by Xtext 2.17.0
 */
package org.xtext.spring.springConfigDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Isolation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getEnumIsolation()
 * @model
 * @generated
 */
public enum EnumIsolation implements Enumerator
{
  /**
   * The '<em><b>DEFAULT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEFAULT_VALUE
   * @generated
   * @ordered
   */
  DEFAULT(0, "DEFAULT", "\"DEFAULT\""),

  /**
   * The '<em><b>READ UNCOMMITTED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #READ_UNCOMMITTED_VALUE
   * @generated
   * @ordered
   */
  READ_UNCOMMITTED(1, "READ_UNCOMMITTED", "\"READ_UNCOMMITTED\""),

  /**
   * The '<em><b>READ COMMITTED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #READ_COMMITTED_VALUE
   * @generated
   * @ordered
   */
  READ_COMMITTED(2, "READ_COMMITTED", "\"READ_COMMITTED\""),

  /**
   * The '<em><b>REPEATABLE READ</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REPEATABLE_READ_VALUE
   * @generated
   * @ordered
   */
  REPEATABLE_READ(3, "REPEATABLE_READ", "\"REPEATABLE_READ\""),

  /**
   * The '<em><b>SERIALIZABLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SERIALIZABLE_VALUE
   * @generated
   * @ordered
   */
  SERIALIZABLE(4, "SERIALIZABLE", "\"SERIALIZABLE\"");

  /**
   * The '<em><b>DEFAULT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEFAULT
   * @model literal="\"DEFAULT\""
   * @generated
   * @ordered
   */
  public static final int DEFAULT_VALUE = 0;

  /**
   * The '<em><b>READ UNCOMMITTED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #READ_UNCOMMITTED
   * @model literal="\"READ_UNCOMMITTED\""
   * @generated
   * @ordered
   */
  public static final int READ_UNCOMMITTED_VALUE = 1;

  /**
   * The '<em><b>READ COMMITTED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #READ_COMMITTED
   * @model literal="\"READ_COMMITTED\""
   * @generated
   * @ordered
   */
  public static final int READ_COMMITTED_VALUE = 2;

  /**
   * The '<em><b>REPEATABLE READ</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REPEATABLE_READ
   * @model literal="\"REPEATABLE_READ\""
   * @generated
   * @ordered
   */
  public static final int REPEATABLE_READ_VALUE = 3;

  /**
   * The '<em><b>SERIALIZABLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SERIALIZABLE
   * @model literal="\"SERIALIZABLE\""
   * @generated
   * @ordered
   */
  public static final int SERIALIZABLE_VALUE = 4;

  /**
   * An array of all the '<em><b>Enum Isolation</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EnumIsolation[] VALUES_ARRAY =
    new EnumIsolation[]
    {
      DEFAULT,
      READ_UNCOMMITTED,
      READ_COMMITTED,
      REPEATABLE_READ,
      SERIALIZABLE,
    };

  /**
   * A public read-only list of all the '<em><b>Enum Isolation</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EnumIsolation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Enum Isolation</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EnumIsolation get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EnumIsolation result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Enum Isolation</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EnumIsolation getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EnumIsolation result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Enum Isolation</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EnumIsolation get(int value)
  {
    switch (value)
    {
      case DEFAULT_VALUE: return DEFAULT;
      case READ_UNCOMMITTED_VALUE: return READ_UNCOMMITTED;
      case READ_COMMITTED_VALUE: return READ_COMMITTED;
      case REPEATABLE_READ_VALUE: return REPEATABLE_READ;
      case SERIALIZABLE_VALUE: return SERIALIZABLE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EnumIsolation(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //EnumIsolation
