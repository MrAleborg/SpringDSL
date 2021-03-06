/**
 * generated by Xtext 2.14.0
 */
package org.xtext.spring.springConfigDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Propagation Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getPropagationEnum()
 * @model
 * @generated
 */
public enum PropagationEnum implements Enumerator
{
  /**
   * The '<em><b>REQUIRED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REQUIRED_VALUE
   * @generated
   * @ordered
   */
  REQUIRED(0, "REQUIRED", "\"REQUIRED\""),

  /**
   * The '<em><b>SUPPORTS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUPPORTS_VALUE
   * @generated
   * @ordered
   */
  SUPPORTS(1, "SUPPORTS", "\"SUPPORTS\""),

  /**
   * The '<em><b>MANDATORY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MANDATORY_VALUE
   * @generated
   * @ordered
   */
  MANDATORY(2, "MANDATORY", "\"MANDATORY\""),

  /**
   * The '<em><b>REQUIRES NEW</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REQUIRES_NEW_VALUE
   * @generated
   * @ordered
   */
  REQUIRES_NEW(3, "REQUIRES_NEW", "\"REQUIRES_NEW\""),

  /**
   * The '<em><b>NOT SUPPORTED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT_SUPPORTED_VALUE
   * @generated
   * @ordered
   */
  NOT_SUPPORTED(4, "NOT_SUPPORTED", "\"NOT_SUPPORTED\""),

  /**
   * The '<em><b>NEVER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEVER_VALUE
   * @generated
   * @ordered
   */
  NEVER(5, "NEVER", "\"NEVER\""),

  /**
   * The '<em><b>NESTED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NESTED_VALUE
   * @generated
   * @ordered
   */
  NESTED(6, "NESTED", "\"NESTED\"");

  /**
   * The '<em><b>REQUIRED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>REQUIRED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REQUIRED
   * @model literal="\"REQUIRED\""
   * @generated
   * @ordered
   */
  public static final int REQUIRED_VALUE = 0;

  /**
   * The '<em><b>SUPPORTS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SUPPORTS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUPPORTS
   * @model literal="\"SUPPORTS\""
   * @generated
   * @ordered
   */
  public static final int SUPPORTS_VALUE = 1;

  /**
   * The '<em><b>MANDATORY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MANDATORY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MANDATORY
   * @model literal="\"MANDATORY\""
   * @generated
   * @ordered
   */
  public static final int MANDATORY_VALUE = 2;

  /**
   * The '<em><b>REQUIRES NEW</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>REQUIRES NEW</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REQUIRES_NEW
   * @model literal="\"REQUIRES_NEW\""
   * @generated
   * @ordered
   */
  public static final int REQUIRES_NEW_VALUE = 3;

  /**
   * The '<em><b>NOT SUPPORTED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NOT SUPPORTED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOT_SUPPORTED
   * @model literal="\"NOT_SUPPORTED\""
   * @generated
   * @ordered
   */
  public static final int NOT_SUPPORTED_VALUE = 4;

  /**
   * The '<em><b>NEVER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NEVER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEVER
   * @model literal="\"NEVER\""
   * @generated
   * @ordered
   */
  public static final int NEVER_VALUE = 5;

  /**
   * The '<em><b>NESTED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NESTED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NESTED
   * @model literal="\"NESTED\""
   * @generated
   * @ordered
   */
  public static final int NESTED_VALUE = 6;

  /**
   * An array of all the '<em><b>Propagation Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PropagationEnum[] VALUES_ARRAY =
    new PropagationEnum[]
    {
      REQUIRED,
      SUPPORTS,
      MANDATORY,
      REQUIRES_NEW,
      NOT_SUPPORTED,
      NEVER,
      NESTED,
    };

  /**
   * A public read-only list of all the '<em><b>Propagation Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PropagationEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Propagation Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PropagationEnum get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PropagationEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Propagation Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PropagationEnum getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PropagationEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Propagation Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PropagationEnum get(int value)
  {
    switch (value)
    {
      case REQUIRED_VALUE: return REQUIRED;
      case SUPPORTS_VALUE: return SUPPORTS;
      case MANDATORY_VALUE: return MANDATORY;
      case REQUIRES_NEW_VALUE: return REQUIRES_NEW;
      case NOT_SUPPORTED_VALUE: return NOT_SUPPORTED;
      case NEVER_VALUE: return NEVER;
      case NESTED_VALUE: return NESTED;
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
  private PropagationEnum(int value, String name, String literal)
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
  public int getValue()
  {
    return value;
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
  
} //PropagationEnum
