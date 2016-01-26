/**
 */
package de.tu_bs.cs.isf.mbse.recipe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Author#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Author#getId <em>Id</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Author#getWrites <em>Writes</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getAuthor()
 * @model
 * @generated
 */
public interface Author extends EObject {
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
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getAuthor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Author#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Writes</b></em>' reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.recipe.Recipe}.
	 * It is bidirectional and its opposite is '{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getWrittenBy <em>Written By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writes</em>' reference list.
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getAuthor_Writes()
	 * @see de.tu_bs.cs.isf.mbse.recipe.Recipe#getWrittenBy
	 * @model opposite="writtenBy"
	 * @generated
	 */
	EList<Recipe> getWrites();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getAuthor_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Author#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Author
