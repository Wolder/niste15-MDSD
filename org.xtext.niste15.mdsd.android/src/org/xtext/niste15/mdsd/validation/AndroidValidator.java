/*
 * generated by Xtext 2.22.0
 */
package org.xtext.niste15.mdsd.validation;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.xtext.niste15.mdsd.android.AndroidPackage;
import org.xtext.niste15.mdsd.android.Button;
import org.xtext.niste15.mdsd.android.Frame;
import org.xtext.niste15.mdsd.android.Pane;
import org.xtext.niste15.mdsd.android.Text;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class AndroidValidator extends AbstractAndroidValidator {
	
	public static final String INVALID_NAME = "invalidName";
	public static final String NO_NAVIGATION = "noButtonNavigation";
	public static final String NO_CONSTRAINTS = "noFrameConstraints";

	@Check
	public void checkTextNameIsNotEmpty(Text text) {
		if (text.getText().getText().isEmpty()) {
			warning("Text should not be empty", AndroidPackage.Literals.TEXT__TEXT, INVALID_NAME);
		}
	}
	
	@Check
	public void checkIfButtonHasNoNavigation(Button button) {
		if (button.getPane() == null) {
			warning("Without navigation, the button has no function", AndroidPackage.Literals.BUTTON__PANE, NO_NAVIGATION);
		}
	}
	
	@Check
	public void checkIfFrameHasConstraints(Pane pane) {
		for (int i = 0; i < pane.getFrames().size(); i++) {
			if (pane.getFrames().get(i).getConstraint() == null) {
				warning("Frame has no constaints. Will be placed in the middle of the pane", AndroidPackage.Literals.PANE__FRAMES, NO_CONSTRAINTS);
			}
		}
	}
}
