/*******************************************************************************
 * Copyright (c) 2011 Guillaume Hillairet.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Guillaume Hillairet - initial API and implementation
 *******************************************************************************/
package org.eclipselabs.emfjson.junit.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emfjson.junit.model.User#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.eclipselabs.emfjson.junit.model.User#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.emfjson.junit.model.User#getFriends <em>Friends</em>}</li>
 *   <li>{@link org.eclipselabs.emfjson.junit.model.User#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emfjson.junit.model.ModelPackage#getUser()
 * @model annotation="JSON root='true'"
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Id</em>' attribute.
	 * @see #setUserId(String)
	 * @see org.eclipselabs.emfjson.junit.model.ModelPackage#getUser_UserId()
	 * @model id="true"
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emfjson.junit.model.User#getUserId <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' attribute.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(String value);

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
	 * @see org.eclipselabs.emfjson.junit.model.ModelPackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emfjson.junit.model.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Friends</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.emfjson.junit.model.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friends</em>' reference list.
	 * @see org.eclipselabs.emfjson.junit.model.ModelPackage#getUser_Friends()
	 * @model
	 * @generated
	 */
	EList<User> getFriends();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Address)
	 * @see org.eclipselabs.emfjson.junit.model.ModelPackage#getUser_Address()
	 * @model containment="true"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emfjson.junit.model.User#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

} // User