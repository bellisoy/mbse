/**
 */
package de.tu_bs.cs.isf.mbse.recipe;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.recipe.RecipeFactory
 * @model kind="package"
 * @generated
 */
public interface RecipePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "recipe";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://tu-bs.de/isf/recipe";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "recipe";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RecipePackage eINSTANCE = de.tu_bs.cs.isf.mbse.recipe.impl.RecipePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.recipe.impl.AuthorImpl <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.recipe.impl.AuthorImpl
	 * @see de.tu_bs.cs.isf.mbse.recipe.impl.RecipePackageImpl#getAuthor()
	 * @generated
	 */
	int AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__ID = 1;

	/**
	 * The feature id for the '<em><b>Writes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__WRITES = 2;

	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.recipe.impl.WorkstepImpl <em>Workstep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.recipe.impl.WorkstepImpl
	 * @see de.tu_bs.cs.isf.mbse.recipe.impl.RecipePackageImpl#getWorkstep()
	 * @generated
	 */
	int WORKSTEP = 1;

	/**
	 * The feature id for the '<em><b>Step Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP__STEP_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Is Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP__IS_SUCCESSOR = 1;

	/**
	 * The feature id for the '<em><b>Is Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP__IS_PREDECESSOR = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP__CONTAINS = 4;

	/**
	 * The feature id for the '<em><b>Needs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP__NEEDS = 5;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP__REQUIRES = 6;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP__DURATION = 7;

	/**
	 * The number of structural features of the '<em>Workstep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Workstep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.recipe.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.recipe.impl.MachineImpl
	 * @see de.tu_bs.cs.isf.mbse.recipe.impl.RecipePackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__PURPOSE = 1;

	/**
	 * The feature id for the '<em><b>Needed In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NEEDED_IN = 2;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.recipe.impl.RecipeImpl <em>Recipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.recipe.impl.RecipeImpl
	 * @see de.tu_bs.cs.isf.mbse.recipe.impl.RecipePackageImpl#getRecipe()
	 * @generated
	 */
	int RECIPE = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Calories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__CALORIES = 1;

	/**
	 * The feature id for the '<em><b>Servings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__SERVINGS = 2;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__DIFFICULTY = 3;

	/**
	 * The feature id for the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__TOTAL_PRICE = 4;

	/**
	 * The feature id for the '<em><b>Workstep</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__WORKSTEP = 5;

	/**
	 * The feature id for the '<em><b>Total Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__TOTAL_DURATION = 6;

	/**
	 * The feature id for the '<em><b>Written By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__WRITTEN_BY = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__TYPE = 8;

	/**
	 * The number of structural features of the '<em>Recipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Recipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.recipe.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.recipe.impl.ToolImpl
	 * @see de.tu_bs.cs.isf.mbse.recipe.impl.RecipePackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__PURPOSE = 1;

	/**
	 * The feature id for the '<em><b>Required In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__REQUIRED_IN = 2;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.recipe.impl.IngredientImpl <em>Ingredient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.recipe.impl.IngredientImpl
	 * @see de.tu_bs.cs.isf.mbse.recipe.impl.RecipePackageImpl#getIngredient()
	 * @generated
	 */
	int INGREDIENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__UNIT = 2;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__PRICE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__CONTAINED_IN = 5;

	/**
	 * The number of structural features of the '<em>Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.recipe.Food <em>Food</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.recipe.Food
	 * @see de.tu_bs.cs.isf.mbse.recipe.impl.RecipePackageImpl#getFood()
	 * @generated
	 */
	int FOOD = 6;


	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.recipe.RecipeType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipeType
	 * @see de.tu_bs.cs.isf.mbse.recipe.impl.RecipePackageImpl#getRecipeType()
	 * @generated
	 */
	int RECIPE_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.recipe.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Author
	 * @generated
	 */
	EClass getAuthor();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Author#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Author#getName()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.cs.isf.mbse.recipe.Author#getWrites <em>Writes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Writes</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Author#getWrites()
	 * @see #getAuthor()
	 * @generated
	 */
	EReference getAuthor_Writes();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Author#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Author#getId()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Id();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.recipe.Workstep <em>Workstep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workstep</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Workstep
	 * @generated
	 */
	EClass getWorkstep();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getStepNumber <em>Step Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Number</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Workstep#getStepNumber()
	 * @see #getWorkstep()
	 * @generated
	 */
	EAttribute getWorkstep_StepNumber();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getNeeds <em>Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Needs</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Workstep#getNeeds()
	 * @see #getWorkstep()
	 * @generated
	 */
	EReference getWorkstep_Needs();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Workstep#getRequires()
	 * @see #getWorkstep()
	 * @generated
	 */
	EReference getWorkstep_Requires();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getIsSuccessor <em>Is Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Successor</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Workstep#getIsSuccessor()
	 * @see #getWorkstep()
	 * @generated
	 */
	EReference getWorkstep_IsSuccessor();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getIsPredecessor <em>Is Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Predecessor</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Workstep#getIsPredecessor()
	 * @see #getWorkstep()
	 * @generated
	 */
	EReference getWorkstep_IsPredecessor();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Workstep#getContains()
	 * @see #getWorkstep()
	 * @generated
	 */
	EReference getWorkstep_Contains();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Workstep#getDuration()
	 * @see #getWorkstep()
	 * @generated
	 */
	EAttribute getWorkstep_Duration();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Workstep#getDescription()
	 * @see #getWorkstep()
	 * @generated
	 */
	EAttribute getWorkstep_Description();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.recipe.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Machine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Machine#getName()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.cs.isf.mbse.recipe.Machine#getNeededIn <em>Needed In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Needed In</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Machine#getNeededIn()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_NeededIn();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Machine#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Machine#getPurpose()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Purpose();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.recipe.Recipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipe</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Recipe
	 * @generated
	 */
	EClass getRecipe();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Recipe#getTitle()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_Title();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getCalories <em>Calories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calories</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Recipe#getCalories()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_Calories();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getServings <em>Servings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Servings</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Recipe#getServings()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_Servings();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getDifficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Recipe#getDifficulty()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_Difficulty();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getTotalPrice <em>Total Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Price</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Recipe#getTotalPrice()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_TotalPrice();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getWorkstep <em>Workstep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workstep</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Recipe#getWorkstep()
	 * @see #getRecipe()
	 * @generated
	 */
	EReference getRecipe_Workstep();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getWrittenBy <em>Written By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Written By</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Recipe#getWrittenBy()
	 * @see #getRecipe()
	 * @generated
	 */
	EReference getRecipe_WrittenBy();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Recipe#getType()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Recipe#getTotalDuration <em>Total Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Duration</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Recipe#getTotalDuration()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_TotalDuration();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.recipe.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Tool#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Tool#getName()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.cs.isf.mbse.recipe.Tool#getRequiredIn <em>Required In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required In</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Tool#getRequiredIn()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_RequiredIn();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Tool#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Tool#getPurpose()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Purpose();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.recipe.Ingredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingredient</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Ingredient
	 * @generated
	 */
	EClass getIngredient();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Ingredient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Ingredient#getName()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Ingredient#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Ingredient#getQuantity()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Ingredient#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Ingredient#getUnit()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Unit();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Ingredient#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Ingredient#getPrice()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Price();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.recipe.Ingredient#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Ingredient#getType()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Type();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.cs.isf.mbse.recipe.Ingredient#getContainedIn <em>Contained In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained In</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Ingredient#getContainedIn()
	 * @see #getIngredient()
	 * @generated
	 */
	EReference getIngredient_ContainedIn();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.mbse.recipe.Food <em>Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Food</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.Food
	 * @generated
	 */
	EEnum getFood();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.mbse.recipe.RecipeType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipeType
	 * @generated
	 */
	EEnum getRecipeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RecipeFactory getRecipeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.recipe.impl.AuthorImpl <em>Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.recipe.impl.AuthorImpl
		 * @see de.tu_bs.cs.isf.mbse.recipe.impl.RecipePackageImpl#getAuthor()
		 * @generated
		 */
		EClass AUTHOR = eINSTANCE.getAuthor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__NAME = eINSTANCE.getAuthor_Name();

		/**
		 * The meta object literal for the '<em><b>Writes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHOR__WRITES = eINSTANCE.getAuthor_Writes();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__ID = eINSTANCE.getAuthor_Id();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.recipe.impl.WorkstepImpl <em>Workstep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.recipe.impl.WorkstepImpl
		 * @see de.tu_bs.cs.isf.mbse.recipe.impl.RecipePackageImpl#getWorkstep()
		 * @generated
		 */
		EClass WORKSTEP = eINSTANCE.getWorkstep();

		/**
		 * The meta object literal for the '<em><b>Step Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP__STEP_NUMBER = eINSTANCE.getWorkstep_StepNumber();

		/**
		 * The meta object literal for the '<em><b>Needs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSTEP__NEEDS = eINSTANCE.getWorkstep_Needs();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSTEP__REQUIRES = eINSTANCE.getWorkstep_Requires();

		/**
		 * The meta object literal for the '<em><b>Is Successor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSTEP__IS_SUCCESSOR = eINSTANCE.getWorkstep_IsSuccessor();

		/**
		 * The meta object literal for the '<em><b>Is Predecessor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSTEP__IS_PREDECESSOR = eINSTANCE.getWorkstep_IsPredecessor();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSTEP__CONTAINS = eINSTANCE.getWorkstep_Contains();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP__DURATION = eINSTANCE.getWorkstep_Duration();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTEP__DESCRIPTION = eINSTANCE.getWorkstep_Description();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.recipe.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.recipe.impl.MachineImpl
		 * @see de.tu_bs.cs.isf.mbse.recipe.impl.RecipePackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__NAME = eINSTANCE.getMachine_Name();

		/**
		 * The meta object literal for the '<em><b>Needed In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__NEEDED_IN = eINSTANCE.getMachine_NeededIn();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__PURPOSE = eINSTANCE.getMachine_Purpose();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.recipe.impl.RecipeImpl <em>Recipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.recipe.impl.RecipeImpl
		 * @see de.tu_bs.cs.isf.mbse.recipe.impl.RecipePackageImpl#getRecipe()
		 * @generated
		 */
		EClass RECIPE = eINSTANCE.getRecipe();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__TITLE = eINSTANCE.getRecipe_Title();

		/**
		 * The meta object literal for the '<em><b>Calories</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__CALORIES = eINSTANCE.getRecipe_Calories();

		/**
		 * The meta object literal for the '<em><b>Servings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__SERVINGS = eINSTANCE.getRecipe_Servings();

		/**
		 * The meta object literal for the '<em><b>Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__DIFFICULTY = eINSTANCE.getRecipe_Difficulty();

		/**
		 * The meta object literal for the '<em><b>Total Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__TOTAL_PRICE = eINSTANCE.getRecipe_TotalPrice();

		/**
		 * The meta object literal for the '<em><b>Workstep</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPE__WORKSTEP = eINSTANCE.getRecipe_Workstep();

		/**
		 * The meta object literal for the '<em><b>Written By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPE__WRITTEN_BY = eINSTANCE.getRecipe_WrittenBy();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__TYPE = eINSTANCE.getRecipe_Type();

		/**
		 * The meta object literal for the '<em><b>Total Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__TOTAL_DURATION = eINSTANCE.getRecipe_TotalDuration();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.recipe.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.recipe.impl.ToolImpl
		 * @see de.tu_bs.cs.isf.mbse.recipe.impl.RecipePackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__NAME = eINSTANCE.getTool_Name();

		/**
		 * The meta object literal for the '<em><b>Required In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__REQUIRED_IN = eINSTANCE.getTool_RequiredIn();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__PURPOSE = eINSTANCE.getTool_Purpose();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.recipe.impl.IngredientImpl <em>Ingredient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.recipe.impl.IngredientImpl
		 * @see de.tu_bs.cs.isf.mbse.recipe.impl.RecipePackageImpl#getIngredient()
		 * @generated
		 */
		EClass INGREDIENT = eINSTANCE.getIngredient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__NAME = eINSTANCE.getIngredient_Name();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__QUANTITY = eINSTANCE.getIngredient_Quantity();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__UNIT = eINSTANCE.getIngredient_Unit();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__PRICE = eINSTANCE.getIngredient_Price();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__TYPE = eINSTANCE.getIngredient_Type();

		/**
		 * The meta object literal for the '<em><b>Contained In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INGREDIENT__CONTAINED_IN = eINSTANCE.getIngredient_ContainedIn();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.recipe.Food <em>Food</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.recipe.Food
		 * @see de.tu_bs.cs.isf.mbse.recipe.impl.RecipePackageImpl#getFood()
		 * @generated
		 */
		EEnum FOOD = eINSTANCE.getFood();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.recipe.RecipeType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.recipe.RecipeType
		 * @see de.tu_bs.cs.isf.mbse.recipe.impl.RecipePackageImpl#getRecipeType()
		 * @generated
		 */
		EEnum RECIPE_TYPE = eINSTANCE.getRecipeType();

	}

} //RecipePackage
