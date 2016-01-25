/**
 */
package de.tu_bs.cs.isf.mbse.recipe.impl;

import de.tu_bs.cs.isf.mbse.recipe.Author;
import de.tu_bs.cs.isf.mbse.recipe.Recipe;
import de.tu_bs.cs.isf.mbse.recipe.RecipePackage;
import de.tu_bs.cs.isf.mbse.recipe.RecipeType;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.impl.RecipeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.impl.RecipeImpl#getCalories <em>Calories</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.impl.RecipeImpl#getServings <em>Servings</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.impl.RecipeImpl#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.impl.RecipeImpl#getTotalPrice <em>Total Price</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.impl.RecipeImpl#getWorkstep <em>Workstep</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.impl.RecipeImpl#getTotalDuration <em>Total Duration</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.impl.RecipeImpl#getWrittenBy <em>Written By</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.impl.RecipeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecipeImpl extends MinimalEObjectImpl.Container implements Recipe {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCalories() <em>Calories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalories()
	 * @generated
	 * @ordered
	 */
	protected static final int CALORIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCalories() <em>Calories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalories()
	 * @generated
	 * @ordered
	 */
	protected int calories = CALORIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getServings() <em>Servings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServings()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVINGS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getServings() <em>Servings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServings()
	 * @generated
	 * @ordered
	 */
	protected int servings = SERVINGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected static final int DIFFICULTY_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected int difficulty = DIFFICULTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalPrice() <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalPrice() <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPrice()
	 * @generated
	 * @ordered
	 */
	protected double totalPrice = TOTAL_PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkstep() <em>Workstep</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkstep()
	 * @generated
	 * @ordered
	 */
	protected EList<Workstep> workstep;

	/**
	 * The default value of the '{@link #getTotalDuration() <em>Total Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String TOTAL_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalDuration() <em>Total Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDuration()
	 * @generated
	 * @ordered
	 */
	protected String totalDuration = TOTAL_DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWrittenBy() <em>Written By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrittenBy()
	 * @generated
	 * @ordered
	 */
	protected Author writtenBy;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RecipeType TYPE_EDEFAULT = RecipeType.NORMAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RecipeType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecipeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipePackage.Literals.RECIPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCalories() {
		return calories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalories(int newCalories) {
		int oldCalories = calories;
		calories = newCalories;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPE__CALORIES, oldCalories, calories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getServings() {
		return servings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServings(int newServings) {
		int oldServings = servings;
		servings = newServings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPE__SERVINGS, oldServings, servings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDifficulty() {
		return difficulty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDifficulty(int newDifficulty) {
		int oldDifficulty = difficulty;
		difficulty = newDifficulty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPE__DIFFICULTY, oldDifficulty, difficulty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalPrice(double newTotalPrice) {
		double oldTotalPrice = totalPrice;
		totalPrice = newTotalPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPE__TOTAL_PRICE, oldTotalPrice, totalPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workstep> getWorkstep() {
		if (workstep == null) {
			workstep = new EObjectContainmentEList<Workstep>(Workstep.class, this, RecipePackage.RECIPE__WORKSTEP);
		}
		return workstep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author getWrittenBy() {
		if (writtenBy != null && writtenBy.eIsProxy()) {
			InternalEObject oldWrittenBy = (InternalEObject)writtenBy;
			writtenBy = (Author)eResolveProxy(oldWrittenBy);
			if (writtenBy != oldWrittenBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecipePackage.RECIPE__WRITTEN_BY, oldWrittenBy, writtenBy));
			}
		}
		return writtenBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author basicGetWrittenBy() {
		return writtenBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWrittenBy(Author newWrittenBy, NotificationChain msgs) {
		Author oldWrittenBy = writtenBy;
		writtenBy = newWrittenBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPE__WRITTEN_BY, oldWrittenBy, newWrittenBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrittenBy(Author newWrittenBy) {
		if (newWrittenBy != writtenBy) {
			NotificationChain msgs = null;
			if (writtenBy != null)
				msgs = ((InternalEObject)writtenBy).eInverseRemove(this, RecipePackage.AUTHOR__WRITES, Author.class, msgs);
			if (newWrittenBy != null)
				msgs = ((InternalEObject)newWrittenBy).eInverseAdd(this, RecipePackage.AUTHOR__WRITES, Author.class, msgs);
			msgs = basicSetWrittenBy(newWrittenBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPE__WRITTEN_BY, newWrittenBy, newWrittenBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RecipeType newType) {
		RecipeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTotalDuration() {
		return totalDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalDuration(String newTotalDuration) {
		String oldTotalDuration = totalDuration;
		totalDuration = newTotalDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipePackage.RECIPE__TOTAL_DURATION, oldTotalDuration, totalDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecipePackage.RECIPE__WRITTEN_BY:
				if (writtenBy != null)
					msgs = ((InternalEObject)writtenBy).eInverseRemove(this, RecipePackage.AUTHOR__WRITES, Author.class, msgs);
				return basicSetWrittenBy((Author)otherEnd, msgs);
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
			case RecipePackage.RECIPE__WORKSTEP:
				return ((InternalEList<?>)getWorkstep()).basicRemove(otherEnd, msgs);
			case RecipePackage.RECIPE__WRITTEN_BY:
				return basicSetWrittenBy(null, msgs);
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
			case RecipePackage.RECIPE__TITLE:
				return getTitle();
			case RecipePackage.RECIPE__CALORIES:
				return getCalories();
			case RecipePackage.RECIPE__SERVINGS:
				return getServings();
			case RecipePackage.RECIPE__DIFFICULTY:
				return getDifficulty();
			case RecipePackage.RECIPE__TOTAL_PRICE:
				return getTotalPrice();
			case RecipePackage.RECIPE__WORKSTEP:
				return getWorkstep();
			case RecipePackage.RECIPE__TOTAL_DURATION:
				return getTotalDuration();
			case RecipePackage.RECIPE__WRITTEN_BY:
				if (resolve) return getWrittenBy();
				return basicGetWrittenBy();
			case RecipePackage.RECIPE__TYPE:
				return getType();
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
			case RecipePackage.RECIPE__TITLE:
				setTitle((String)newValue);
				return;
			case RecipePackage.RECIPE__CALORIES:
				setCalories((Integer)newValue);
				return;
			case RecipePackage.RECIPE__SERVINGS:
				setServings((Integer)newValue);
				return;
			case RecipePackage.RECIPE__DIFFICULTY:
				setDifficulty((Integer)newValue);
				return;
			case RecipePackage.RECIPE__TOTAL_PRICE:
				setTotalPrice((Double)newValue);
				return;
			case RecipePackage.RECIPE__WORKSTEP:
				getWorkstep().clear();
				getWorkstep().addAll((Collection<? extends Workstep>)newValue);
				return;
			case RecipePackage.RECIPE__TOTAL_DURATION:
				setTotalDuration((String)newValue);
				return;
			case RecipePackage.RECIPE__WRITTEN_BY:
				setWrittenBy((Author)newValue);
				return;
			case RecipePackage.RECIPE__TYPE:
				setType((RecipeType)newValue);
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
			case RecipePackage.RECIPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case RecipePackage.RECIPE__CALORIES:
				setCalories(CALORIES_EDEFAULT);
				return;
			case RecipePackage.RECIPE__SERVINGS:
				setServings(SERVINGS_EDEFAULT);
				return;
			case RecipePackage.RECIPE__DIFFICULTY:
				setDifficulty(DIFFICULTY_EDEFAULT);
				return;
			case RecipePackage.RECIPE__TOTAL_PRICE:
				setTotalPrice(TOTAL_PRICE_EDEFAULT);
				return;
			case RecipePackage.RECIPE__WORKSTEP:
				getWorkstep().clear();
				return;
			case RecipePackage.RECIPE__TOTAL_DURATION:
				setTotalDuration(TOTAL_DURATION_EDEFAULT);
				return;
			case RecipePackage.RECIPE__WRITTEN_BY:
				setWrittenBy((Author)null);
				return;
			case RecipePackage.RECIPE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case RecipePackage.RECIPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case RecipePackage.RECIPE__CALORIES:
				return calories != CALORIES_EDEFAULT;
			case RecipePackage.RECIPE__SERVINGS:
				return servings != SERVINGS_EDEFAULT;
			case RecipePackage.RECIPE__DIFFICULTY:
				return difficulty != DIFFICULTY_EDEFAULT;
			case RecipePackage.RECIPE__TOTAL_PRICE:
				return totalPrice != TOTAL_PRICE_EDEFAULT;
			case RecipePackage.RECIPE__WORKSTEP:
				return workstep != null && !workstep.isEmpty();
			case RecipePackage.RECIPE__TOTAL_DURATION:
				return TOTAL_DURATION_EDEFAULT == null ? totalDuration != null : !TOTAL_DURATION_EDEFAULT.equals(totalDuration);
			case RecipePackage.RECIPE__WRITTEN_BY:
				return writtenBy != null;
			case RecipePackage.RECIPE__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", calories: ");
		result.append(calories);
		result.append(", servings: ");
		result.append(servings);
		result.append(", difficulty: ");
		result.append(difficulty);
		result.append(", totalPrice: ");
		result.append(totalPrice);
		result.append(", totalDuration: ");
		result.append(totalDuration);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //RecipeImpl
