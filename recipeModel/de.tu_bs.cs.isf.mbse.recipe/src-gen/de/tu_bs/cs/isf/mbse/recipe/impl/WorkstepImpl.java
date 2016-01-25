/**
 */
package de.tu_bs.cs.isf.mbse.recipe.impl;

import de.tu_bs.cs.isf.mbse.recipe.Duration;
import de.tu_bs.cs.isf.mbse.recipe.Ingredient;
import de.tu_bs.cs.isf.mbse.recipe.Machine;
import de.tu_bs.cs.isf.mbse.recipe.RecipePackage;
import de.tu_bs.cs.isf.mbse.recipe.Tool;
import de.tu_bs.cs.isf.mbse.recipe.Workstep;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workstep</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.impl.WorkstepImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.impl.WorkstepImpl#getStepNumber <em>Step Number</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.impl.WorkstepImpl#getIsSuccessor <em>Is Successor</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.impl.WorkstepImpl#getIsPredecessor <em>Is Predecessor</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.impl.WorkstepImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.impl.WorkstepImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.impl.WorkstepImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.impl.WorkstepImpl#getNeeds <em>Needs</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.impl.WorkstepImpl#getRequires <em>Requires</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkstepImpl extends MinimalEObjectImpl.Container implements Workstep {
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
	 * The default value of the '{@link #getStepNumber() <em>Step Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_NUMBER_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getStepNumber() <em>Step Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepNumber()
	 * @generated
	 * @ordered
	 */
	protected int stepNumber = STEP_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsSuccessor() <em>Is Successor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSuccessor()
	 * @generated
	 * @ordered
	 */
	protected EList<Workstep> isSuccessor;

	/**
	 * The cached value of the '{@link #getIsPredecessor() <em>Is Predecessor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPredecessor()
	 * @generated
	 * @ordered
	 */
	protected EList<Workstep> isPredecessor;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected EList<Duration> duration;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Ingredient> contains;

	/**
	 * The cached value of the '{@link #getNeeds() <em>Needs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeeds()
	 * @generated
	 * @ordered
	 */
	protected EList<Machine> needs;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool> requires;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkstepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.WORKSTEP;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.WORKSTEP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStepNumber() {
		return stepNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepNumber(int newStepNumber) {
		int oldStepNumber = stepNumber;
		stepNumber = newStepNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.WORKSTEP__STEP_NUMBER, oldStepNumber, stepNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Machine> getNeeds() {
		if (needs == null) {
			needs = new EObjectWithInverseResolvingEList.ManyInverse<Machine>(Machine.class, this, RecipePackage.WORKSTEP__NEEDS, RecipePackage.MACHINE__NEEDED_IN);
		}
		return needs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tool> getRequires() {
		if (requires == null) {
			requires = new EObjectWithInverseResolvingEList.ManyInverse<Tool>(Tool.class, this, RecipePackage.WORKSTEP__REQUIRES, RecipePackage.TOOL__REQUIRED_IN);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workstep> getIsSuccessor() {
		if (isSuccessor == null) {
			isSuccessor = new EObjectResolvingEList<Workstep>(Workstep.class, this, RecipePackage.WORKSTEP__IS_SUCCESSOR);
		}
		return isSuccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workstep> getIsPredecessor() {
		if (isPredecessor == null) {
			isPredecessor = new EObjectResolvingEList<Workstep>(Workstep.class, this, RecipePackage.WORKSTEP__IS_PREDECESSOR);
		}
		return isPredecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ingredient> getContains() {
		if (contains == null) {
			contains = new EObjectWithInverseResolvingEList.ManyInverse<Ingredient>(Ingredient.class, this, RecipePackage.WORKSTEP__CONTAINS, RecipePackage.INGREDIENT__CONTAINED_IN);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Duration> getDuration() {
		if (duration == null) {
			duration = new EObjectContainmentEList<Duration>(Duration.class, this, RecipePackage.WORKSTEP__DURATION);
		}
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.WORKSTEP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecipePackage.WORKSTEP__CONTAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains()).basicAdd(otherEnd, msgs);
			case RecipePackage.WORKSTEP__NEEDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNeeds()).basicAdd(otherEnd, msgs);
			case RecipePackage.WORKSTEP__REQUIRES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequires()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecipePackage.WORKSTEP__DURATION:
				return ((InternalEList<?>)getDuration()).basicRemove(otherEnd, msgs);
			case RecipePackage.WORKSTEP__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case RecipePackage.WORKSTEP__NEEDS:
				return ((InternalEList<?>)getNeeds()).basicRemove(otherEnd, msgs);
			case RecipePackage.WORKSTEP__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecipePackage.WORKSTEP__NAME:
				return getName();
			case RecipePackage.WORKSTEP__STEP_NUMBER:
				return getStepNumber();
			case RecipePackage.WORKSTEP__IS_SUCCESSOR:
				return getIsSuccessor();
			case RecipePackage.WORKSTEP__IS_PREDECESSOR:
				return getIsPredecessor();
			case RecipePackage.WORKSTEP__DURATION:
				return getDuration();
			case RecipePackage.WORKSTEP__DESCRIPTION:
				return getDescription();
			case RecipePackage.WORKSTEP__CONTAINS:
				return getContains();
			case RecipePackage.WORKSTEP__NEEDS:
				return getNeeds();
			case RecipePackage.WORKSTEP__REQUIRES:
				return getRequires();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RecipePackage.WORKSTEP__NAME:
				setName((String)newValue);
				return;
			case RecipePackage.WORKSTEP__STEP_NUMBER:
				setStepNumber((Integer)newValue);
				return;
			case RecipePackage.WORKSTEP__IS_SUCCESSOR:
				getIsSuccessor().clear();
				getIsSuccessor().addAll((Collection<? extends Workstep>)newValue);
				return;
			case RecipePackage.WORKSTEP__IS_PREDECESSOR:
				getIsPredecessor().clear();
				getIsPredecessor().addAll((Collection<? extends Workstep>)newValue);
				return;
			case RecipePackage.WORKSTEP__DURATION:
				getDuration().clear();
				getDuration().addAll((Collection<? extends Duration>)newValue);
				return;
			case RecipePackage.WORKSTEP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RecipePackage.WORKSTEP__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends Ingredient>)newValue);
				return;
			case RecipePackage.WORKSTEP__NEEDS:
				getNeeds().clear();
				getNeeds().addAll((Collection<? extends Machine>)newValue);
				return;
			case RecipePackage.WORKSTEP__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends Tool>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case RecipePackage.WORKSTEP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RecipePackage.WORKSTEP__STEP_NUMBER:
				setStepNumber(STEP_NUMBER_EDEFAULT);
				return;
			case RecipePackage.WORKSTEP__IS_SUCCESSOR:
				getIsSuccessor().clear();
				return;
			case RecipePackage.WORKSTEP__IS_PREDECESSOR:
				getIsPredecessor().clear();
				return;
			case RecipePackage.WORKSTEP__DURATION:
				getDuration().clear();
				return;
			case RecipePackage.WORKSTEP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RecipePackage.WORKSTEP__CONTAINS:
				getContains().clear();
				return;
			case RecipePackage.WORKSTEP__NEEDS:
				getNeeds().clear();
				return;
			case RecipePackage.WORKSTEP__REQUIRES:
				getRequires().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RecipePackage.WORKSTEP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RecipePackage.WORKSTEP__STEP_NUMBER:
				return stepNumber != STEP_NUMBER_EDEFAULT;
			case RecipePackage.WORKSTEP__IS_SUCCESSOR:
				return isSuccessor != null && !isSuccessor.isEmpty();
			case RecipePackage.WORKSTEP__IS_PREDECESSOR:
				return isPredecessor != null && !isPredecessor.isEmpty();
			case RecipePackage.WORKSTEP__DURATION:
				return duration != null && !duration.isEmpty();
			case RecipePackage.WORKSTEP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RecipePackage.WORKSTEP__CONTAINS:
				return contains != null && !contains.isEmpty();
			case RecipePackage.WORKSTEP__NEEDS:
				return needs != null && !needs.isEmpty();
			case RecipePackage.WORKSTEP__REQUIRES:
				return requires != null && !requires.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", stepNumber: ");
		result.append(stepNumber);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //WorkstepImpl
