/**
 */
package de.tu_bs.cs.isf.mbse.recipe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workstep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getStepNumber <em>Step Number</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getIsSuccessor <em>Is Successor</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getIsPredecessor <em>Is Predecessor</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getDescription <em>Description</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getContains <em>Contains</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getNeeds <em>Needs</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getRequires <em>Requires</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getWorkstep()
 * @model
 * @generated
 */
public interface Workstep extends EObject {
	/**
	 * Returns the value of the '<em><b>Step Number</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Number</em>' attribute.
	 * @see #setStepNumber(int)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getWorkstep_StepNumber()
	 * @model default="1"
	 * @generated
	 */
	int getStepNumber();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getStepNumber <em>Step Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Number</em>' attribute.
	 * @see #getStepNumber()
	 * @generated
	 */
	void setStepNumber(int value);

	/**
	 * Returns the value of the '<em><b>Needs</b></em>' reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.recipe.Machine}.
	 * It is bidirectional and its opposite is '{@link de.tu_bs.cs.isf.mbse.recipe.Machine#getNeededIn <em>Needed In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs</em>' reference list.
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getWorkstep_Needs()
	 * @see de.tu_bs.cs.isf.mbse.recipe.Machine#getNeededIn
	 * @model opposite="neededIn"
	 * @generated
	 */
	EList<Machine> getNeeds();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.recipe.Tool}.
	 * It is bidirectional and its opposite is '{@link de.tu_bs.cs.isf.mbse.recipe.Tool#getRequiredIn <em>Required In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' reference list.
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getWorkstep_Requires()
	 * @see de.tu_bs.cs.isf.mbse.recipe.Tool#getRequiredIn
	 * @model opposite="requiredIn"
	 * @generated
	 */
	EList<Tool> getRequires();

	/**
	 * Returns the value of the '<em><b>Is Successor</b></em>' reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.recipe.Workstep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Successor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Successor</em>' reference list.
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getWorkstep_IsSuccessor()
	 * @model
	 * @generated
	 */
	EList<Workstep> getIsSuccessor();

	/**
	 * Returns the value of the '<em><b>Is Predecessor</b></em>' reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.recipe.Workstep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Predecessor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Predecessor</em>' reference list.
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getWorkstep_IsPredecessor()
	 * @model
	 * @generated
	 */
	EList<Workstep> getIsPredecessor();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.recipe.Ingredient}.
	 * It is bidirectional and its opposite is '{@link de.tu_bs.cs.isf.mbse.recipe.Ingredient#getContainedIn <em>Contained In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getWorkstep_Contains()
	 * @see de.tu_bs.cs.isf.mbse.recipe.Ingredient#getContainedIn
	 * @model opposite="containedIn"
	 * @generated
	 */
	EList<Ingredient> getContains();

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getWorkstep_Duration()
	 * @model
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getWorkstep_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Workstep
