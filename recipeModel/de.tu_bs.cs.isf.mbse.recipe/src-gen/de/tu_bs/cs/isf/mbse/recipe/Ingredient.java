/**
 */
package de.tu_bs.cs.isf.mbse.recipe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Ingredient#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Ingredient#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Ingredient#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Ingredient#getPrice <em>Price</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Ingredient#getType <em>Type</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Ingredient#getContainedIn <em>Contained In</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getIngredient()
 * @model
 * @generated
 */
public interface Ingredient extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getIngredient_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Ingredient#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(double)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getIngredient_Quantity()
	 * @model
	 * @generated
	 */
	double getQuantity();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Ingredient#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(double value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getIngredient_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Ingredient#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getIngredient_Price()
	 * @model
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Ingredient#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.mbse.recipe.Food}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Food
	 * @see #setType(Food)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getIngredient_Type()
	 * @model
	 * @generated
	 */
	Food getType();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Ingredient#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Food
	 * @see #getType()
	 * @generated
	 */
	void setType(Food value);

	/**
	 * Returns the value of the '<em><b>Contained In</b></em>' reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.recipe.Workstep}.
	 * It is bidirectional and its opposite is '{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained In</em>' reference list.
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getIngredient_ContainedIn()
	 * @see de.tu_bs.cs.isf.mbse.recipe.Workstep#getContains
	 * @model opposite="contains" required="true"
	 * @generated
	 */
	EList<Workstep> getContainedIn();

} // Ingredient
