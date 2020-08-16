/**
 * generated by Xtext 2.22.0
 */
package org.xtext.niste15.mdsd.android;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.niste15.mdsd.android.Pane#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.niste15.mdsd.android.Pane#getFrames <em>Frames</em>}</li>
 * </ul>
 *
 * @see org.xtext.niste15.mdsd.android.AndroidPackage#getPane()
 * @model
 * @generated
 */
public interface Pane extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.niste15.mdsd.android.AndroidPackage#getPane_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.niste15.mdsd.android.Pane#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Frames</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.niste15.mdsd.android.Frame}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Frames</em>' containment reference list.
   * @see org.xtext.niste15.mdsd.android.AndroidPackage#getPane_Frames()
   * @model containment="true"
   * @generated
   */
  EList<Frame> getFrames();

} // Pane