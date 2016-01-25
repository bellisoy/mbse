/**
 */
package de.tu_bs.cs.isf.mbse.recipe;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Food</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getFood()
 * @model
 * @generated
 */
public enum Food implements Enumerator {
	/**
	 * The '<em><b>VEGETERIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VEGETERIAN_VALUE
	 * @generated
	 * @ordered
	 */
	VEGETERIAN(0, "VEGETERIAN", "VEGETERIAN"), /**
	 * The '<em><b>VEGAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VEGAN_VALUE
	 * @generated
	 * @ordered
	 */
	VEGAN(2, "VEGAN", "VEGAN"), /**
	 * The '<em><b>POULTRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POULTRY_VALUE
	 * @generated
	 * @ordered
	 */
	POULTRY(3, "POULTRY", "POULTRY"), /**
	 * The '<em><b>FISH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FISH_VALUE
	 * @generated
	 * @ordered
	 */
	FISH(4, "FISH", "FISH"), /**
	 * The '<em><b>MEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEAT_VALUE
	 * @generated
	 * @ordered
	 */
	MEAT(4, "MEAT", "MEAT");

	/**
	 * The '<em><b>VEGETERIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VEGETERIAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VEGETERIAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VEGETERIAN_VALUE = 0;

	/**
	 * The '<em><b>VEGAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VEGAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VEGAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VEGAN_VALUE = 2;

	/**
	 * The '<em><b>POULTRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POULTRY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POULTRY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POULTRY_VALUE = 3;

	/**
	 * The '<em><b>FISH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FISH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FISH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FISH_VALUE = 4;

	/**
	 * The '<em><b>MEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MEAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEAT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Food</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Food[] VALUES_ARRAY =
		new Food[] {
			VEGETERIAN,
			VEGAN,
			POULTRY,
			FISH,
			MEAT,
		};

	/**
	 * A public read-only list of all the '<em><b>Food</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Food> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Food</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Food get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Food result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Food</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Food getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Food result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Food</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Food get(int value) {
		switch (value) {
			case VEGETERIAN_VALUE: return VEGETERIAN;
			case VEGAN_VALUE: return VEGAN;
			case POULTRY_VALUE: return POULTRY;
			case FISH_VALUE: return FISH;
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
	private Food(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Food
