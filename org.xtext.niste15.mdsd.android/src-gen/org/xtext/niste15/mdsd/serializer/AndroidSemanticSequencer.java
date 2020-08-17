/*
 * generated by Xtext 2.22.0
 */
package org.xtext.niste15.mdsd.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.niste15.mdsd.android.AndroidPackage;
import org.xtext.niste15.mdsd.android.Application;
import org.xtext.niste15.mdsd.android.Bottom;
import org.xtext.niste15.mdsd.android.BottomOf;
import org.xtext.niste15.mdsd.android.Button;
import org.xtext.niste15.mdsd.android.Constraint;
import org.xtext.niste15.mdsd.android.Frame;
import org.xtext.niste15.mdsd.android.Left;
import org.xtext.niste15.mdsd.android.LeftOf;
import org.xtext.niste15.mdsd.android.Middle;
import org.xtext.niste15.mdsd.android.Model;
import org.xtext.niste15.mdsd.android.Pane;
import org.xtext.niste15.mdsd.android.Persentage;
import org.xtext.niste15.mdsd.android.Right;
import org.xtext.niste15.mdsd.android.RightOf;
import org.xtext.niste15.mdsd.android.Text;
import org.xtext.niste15.mdsd.android.TextContent;
import org.xtext.niste15.mdsd.android.Top;
import org.xtext.niste15.mdsd.android.TopOf;
import org.xtext.niste15.mdsd.services.AndroidGrammarAccess;

@SuppressWarnings("all")
public class AndroidSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AndroidGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AndroidPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AndroidPackage.APPLICATION:
				sequence_Application(context, (Application) semanticObject); 
				return; 
			case AndroidPackage.BOTTOM:
				sequence_ConstraintParameter(context, (Bottom) semanticObject); 
				return; 
			case AndroidPackage.BOTTOM_OF:
				sequence_ConstraintType(context, (BottomOf) semanticObject); 
				return; 
			case AndroidPackage.BUTTON:
				sequence_Button(context, (Button) semanticObject); 
				return; 
			case AndroidPackage.CONSTRAINT:
				sequence_Constraint(context, (Constraint) semanticObject); 
				return; 
			case AndroidPackage.FRAME:
				sequence_Frame(context, (Frame) semanticObject); 
				return; 
			case AndroidPackage.LEFT:
				sequence_ConstraintParameter(context, (Left) semanticObject); 
				return; 
			case AndroidPackage.LEFT_OF:
				sequence_ConstraintType(context, (LeftOf) semanticObject); 
				return; 
			case AndroidPackage.MIDDLE:
				sequence_ConstraintParameter(context, (Middle) semanticObject); 
				return; 
			case AndroidPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case AndroidPackage.PANE:
				sequence_Pane(context, (Pane) semanticObject); 
				return; 
			case AndroidPackage.PERSENTAGE:
				sequence_ConstraintParameter(context, (Persentage) semanticObject); 
				return; 
			case AndroidPackage.RIGHT:
				sequence_ConstraintParameter(context, (Right) semanticObject); 
				return; 
			case AndroidPackage.RIGHT_OF:
				sequence_ConstraintType(context, (RightOf) semanticObject); 
				return; 
			case AndroidPackage.TEXT:
				sequence_Text(context, (Text) semanticObject); 
				return; 
			case AndroidPackage.TEXT_CONTENT:
				sequence_TextContent(context, (TextContent) semanticObject); 
				return; 
			case AndroidPackage.TOP:
				sequence_ConstraintParameter(context, (Top) semanticObject); 
				return; 
			case AndroidPackage.TOP_OF:
				sequence_ConstraintType(context, (TopOf) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Application returns Application
	 *
	 * Constraint:
	 *     (name=ID panes+=Pane*)
	 */
	protected void sequence_Application(ISerializationContext context, Application semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Elements returns Button
	 *     Button returns Button
	 *
	 * Constraint:
	 *     (name=ID text=STRING pane=[Pane|ID]?)
	 */
	protected void sequence_Button(ISerializationContext context, Button semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintParameter returns Bottom
	 *
	 * Constraint:
	 *     {Bottom}
	 */
	protected void sequence_ConstraintParameter(ISerializationContext context, Bottom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintParameter returns Left
	 *
	 * Constraint:
	 *     {Left}
	 */
	protected void sequence_ConstraintParameter(ISerializationContext context, Left semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintParameter returns Middle
	 *
	 * Constraint:
	 *     {Middle}
	 */
	protected void sequence_ConstraintParameter(ISerializationContext context, Middle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintParameter returns Persentage
	 *
	 * Constraint:
	 *     value=ID
	 */
	protected void sequence_ConstraintParameter(ISerializationContext context, Persentage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidPackage.Literals.PERSENTAGE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidPackage.Literals.PERSENTAGE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstraintParameterAccess().getValueIDTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintParameter returns Right
	 *
	 * Constraint:
	 *     {Right}
	 */
	protected void sequence_ConstraintParameter(ISerializationContext context, Right semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintParameter returns Top
	 *
	 * Constraint:
	 *     {Top}
	 */
	protected void sequence_ConstraintParameter(ISerializationContext context, Top semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintType returns BottomOf
	 *
	 * Constraint:
	 *     {BottomOf}
	 */
	protected void sequence_ConstraintType(ISerializationContext context, BottomOf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintType returns LeftOf
	 *
	 * Constraint:
	 *     {LeftOf}
	 */
	protected void sequence_ConstraintType(ISerializationContext context, LeftOf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintType returns RightOf
	 *
	 * Constraint:
	 *     {RightOf}
	 */
	protected void sequence_ConstraintType(ISerializationContext context, RightOf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintType returns TopOf
	 *
	 * Constraint:
	 *     {TopOf}
	 */
	protected void sequence_ConstraintType(ISerializationContext context, TopOf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constraint returns Constraint
	 *
	 * Constraint:
	 *     ((constraintType=ConstraintType frame=[Frame|ID]) | param=ConstraintParameter)
	 */
	protected void sequence_Constraint(ISerializationContext context, Constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Frame returns Frame
	 *
	 * Constraint:
	 *     (name=ID? elements+=Elements* constraint=Constraint?)
	 */
	protected void sequence_Frame(ISerializationContext context, Frame semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     application=Application
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidPackage.Literals.MODEL__APPLICATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidPackage.Literals.MODEL__APPLICATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelAccess().getApplicationApplicationParserRuleCall_0(), semanticObject.getApplication());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Pane returns Pane
	 *
	 * Constraint:
	 *     (name=ID frames+=Frame*)
	 */
	protected void sequence_Pane(ISerializationContext context, Pane semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TextContent returns TextContent
	 *
	 * Constraint:
	 *     text=STRING
	 */
	protected void sequence_TextContent(ISerializationContext context, TextContent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidPackage.Literals.TEXT_CONTENT__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidPackage.Literals.TEXT_CONTENT__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTextContentAccess().getTextSTRINGTerminalRuleCall_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Elements returns Text
	 *     Text returns Text
	 *
	 * Constraint:
	 *     (name=ID text=TextContent)
	 */
	protected void sequence_Text(ISerializationContext context, Text semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AndroidPackage.Literals.ELEMENTS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidPackage.Literals.ELEMENTS__NAME));
			if (transientValues.isValueTransient(semanticObject, AndroidPackage.Literals.TEXT__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AndroidPackage.Literals.TEXT__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTextAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTextAccess().getTextTextContentParserRuleCall_3_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
}
