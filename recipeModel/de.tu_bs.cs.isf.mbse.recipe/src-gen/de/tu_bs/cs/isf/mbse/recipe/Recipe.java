/**
 */
package de.tu_bs.cs.isf.mbse.recipe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getTitle <em>Title</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getCalories <em>Calories</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getServings <em>Servings</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getTotalPrice <em>Total Price</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getCategory <em>Category</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getWorkstep <em>Workstep</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getTotalDuration <em>Total Duration</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getWrittenBy <em>Written By</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getRecipe()
 * @model
 * @generated
 */
public interface Recipe extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getRecipe_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Calories</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calories</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calories</em>' attribute.
	 * @see #setCalories(int)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getRecipe_Calories()
	 * @model default="0"
	 * @generated
	 */
	int getCalories();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getCalories <em>Calories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calories</em>' attribute.
	 * @see #getCalories()
	 * @generated
	 */
	void setCalories(int value);

	/**
	 * Returns the value of the '<em><b>Servings</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servings</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servings</em>' attribute.
	 * @see #setServings(int)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getRecipe_Servings()
	 * @model default="1"
	 * @generated
	 */
	int getServings();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getServings <em>Servings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servings</em>' attribute.
	 * @see #getServings()
	 * @generated
	 */
	void setServings(int value);

	/**
	 * Returns the value of the '<em><b>Difficulty</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Difficulty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty</em>' attribute.
	 * @see #setDifficulty(int)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getRecipe_Difficulty()
	 * @model default="1"
	 * @generated
	 */
	int getDifficulty();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getDifficulty <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty</em>' attribute.
	 * @see #getDifficulty()
	 * @generated
	 */
	void setDifficulty(int value);

	/**
	 * Returns the value of the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Price</em>' attribute.
	 * @see #setTotalPrice(double)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getRecipe_TotalPrice()
	 * @model derived="true"
	 * @generated
	 */
	double getTotalPrice();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getTotalPrice <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Price</em>' attribute.
	 * @see #getTotalPrice()
	 * @generated
	 */
	void setTotalPrice(double value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getRecipe_Category()
	 * @model derived="true"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Workstep</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.recipe.Workstep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workstep</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workstep</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getRecipe_Workstep()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Workstep> getWorkstep();

	/**
	 * Returns the value of the '<em><b>Written By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.tu_bs.cs.isf.mbse.recipe.Author#getWrites <em>Writes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Written By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Written By</em>' reference.
	 * @see #setWrittenBy(Author)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getRecipe_WrittenBy()
	 * @see de.tu_bs.cs.isf.mbse.recipe.Author#getWrites
	 * @model opposite="writes" required="true"
	 * @generated
	 */
	Author getWrittenBy();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getWrittenBy <em>Written By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Written By</em>' reference.
	 * @see #getWrittenBy()
	 * @generated
	 */
	void setWrittenBy(Author value);

	/**
	 * Returns the value of the '<em><b>Total Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Duration</em>' attribute.
	 * @see #setTotalDuration(String)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getRecipe_TotalDuration()
	 * @model derived="true"
	 * @generated
	 */
	String getTotalDuration();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getTotalDuration <em>Total Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Duration</em>' attribute.
	 * @see #getTotalDuration()
	 * @generated
	 */
	void setTotalDuration(String value);

} // Recipe
