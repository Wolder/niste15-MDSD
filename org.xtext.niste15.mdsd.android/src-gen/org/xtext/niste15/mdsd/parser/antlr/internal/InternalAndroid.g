/*
 * generated by Xtext 2.22.0
 */
grammar InternalAndroid;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.niste15.mdsd.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.niste15.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.niste15.mdsd.services.AndroidGrammarAccess;

}

@parser::members {

 	private AndroidGrammarAccess grammarAccess;

    public InternalAndroidParser(TokenStream input, AndroidGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected AndroidGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getApplicationApplicationParserRuleCall_0());
			}
			lv_application_0_0=ruleApplication
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				set(
					$current,
					"application",
					lv_application_0_0,
					"org.xtext.niste15.mdsd.Android.Application");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleApplication
entryRuleApplication returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getApplicationRule()); }
	iv_ruleApplication=ruleApplication
	{ $current=$iv_ruleApplication.current; }
	EOF;

// Rule Application
ruleApplication returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Application'
		{
			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getApplicationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getApplicationAccess().getPanesPaneParserRuleCall_3_0());
				}
				lv_panes_3_0=rulePane
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getApplicationRule());
					}
					add(
						$current,
						"panes",
						lv_panes_3_0,
						"org.xtext.niste15.mdsd.Android.Pane");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRulePane
entryRulePane returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPaneRule()); }
	iv_rulePane=rulePane
	{ $current=$iv_rulePane.current; }
	EOF;

// Rule Pane
rulePane returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPaneAccess().getPaneAction_0(),
					$current);
			}
		)
		otherlv_1='Pane'
		{
			newLeafNode(otherlv_1, grammarAccess.getPaneAccess().getPaneKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getPaneAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPaneRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getPaneAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPaneAccess().getFramesFrameParserRuleCall_4_0());
				}
				lv_frames_4_0=ruleFrame
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPaneRule());
					}
					add(
						$current,
						"frames",
						lv_frames_4_0,
						"org.xtext.niste15.mdsd.Android.Frame");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getPaneAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleFrame
entryRuleFrame returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFrameRule()); }
	iv_ruleFrame=ruleFrame
	{ $current=$iv_ruleFrame.current; }
	EOF;

// Rule Frame
ruleFrame returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFrameAccess().getFrameAction_0(),
					$current);
			}
		)
		otherlv_1='Frame'
		{
			newLeafNode(otherlv_1, grammarAccess.getFrameAccess().getFrameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getFrameAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFrameRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFrameAccess().getElementsElementsParserRuleCall_4_0());
				}
				lv_elements_4_0=ruleElements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFrameRule());
					}
					add(
						$current,
						"elements",
						lv_elements_4_0,
						"org.xtext.niste15.mdsd.Android.Elements");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getFrameAccess().getConstraintConstraintParserRuleCall_5_0());
				}
				lv_constraint_5_0=ruleConstraint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFrameRule());
					}
					set(
						$current,
						"constraint",
						lv_constraint_5_0,
						"org.xtext.niste15.mdsd.Android.Constraint");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getFrameAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleElements
entryRuleElements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementsRule()); }
	iv_ruleElements=ruleElements
	{ $current=$iv_ruleElements.current; }
	EOF;

// Rule Elements
ruleElements returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getElementsAccess().getButtonParserRuleCall_0());
		}
		this_Button_0=ruleButton
		{
			$current = $this_Button_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementsAccess().getTextParserRuleCall_1());
		}
		this_Text_1=ruleText
		{
			$current = $this_Text_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleText
entryRuleText returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTextRule()); }
	iv_ruleText=ruleText
	{ $current=$iv_ruleText.current; }
	EOF;

// Rule Text
ruleText returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Text'
		{
			newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTextKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getTextAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_text_2_0=RULE_STRING
				{
					newLeafNode(lv_text_2_0, grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTextRule());
					}
					setWithLastConsumed(
						$current,
						"text",
						lv_text_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getTextAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleButton
entryRuleButton returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getButtonRule()); }
	iv_ruleButton=ruleButton
	{ $current=$iv_ruleButton.current; }
	EOF;

// Rule Button
ruleButton returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Button'
		{
			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_text_2_0=RULE_STRING
				{
					newLeafNode(lv_text_2_0, grammarAccess.getButtonAccess().getTextSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getButtonRule());
					}
					setWithLastConsumed(
						$current,
						"text",
						lv_text_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_3='navigate'
			{
				newLeafNode(otherlv_3, grammarAccess.getButtonAccess().getNavigateKeyword_3_0());
			}
			otherlv_4='->'
			{
				newLeafNode(otherlv_4, grammarAccess.getButtonAccess().getHyphenMinusGreaterThanSignKeyword_3_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getButtonRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getButtonAccess().getPanePaneCrossReference_3_2_0());
					}
				)
			)
		)?
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getButtonAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleConstraint
entryRuleConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstraintRule()); }
	iv_ruleConstraint=ruleConstraint
	{ $current=$iv_ruleConstraint.current; }
	EOF;

// Rule Constraint
ruleConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='constraint'
			{
				newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0_0());
			}
			otherlv_1=':'
			{
				newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getColonKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConstraintAccess().getConstraintTypeConstraintTypeVerticalParserRuleCall_0_2_0());
					}
					lv_constraintType_2_0=ruleConstraintTypeVertical
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConstraintRule());
						}
						set(
							$current,
							"constraintType",
							lv_constraintType_2_0,
							"org.xtext.niste15.mdsd.Android.ConstraintTypeVertical");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3='='
			{
				newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getEqualsSignKeyword_0_3());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getConstraintRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getFrameFrameCrossReference_0_4_0());
					}
				)
			)
		)
		    |
		(
			otherlv_5='constraint'
			{
				newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getConstraintKeyword_1_0());
			}
			otherlv_6='='
			{
				newLeafNode(otherlv_6, grammarAccess.getConstraintAccess().getEqualsSignKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConstraintAccess().getParamConstraintParameterParserRuleCall_1_2_0());
					}
					lv_param_7_0=ruleConstraintParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConstraintRule());
						}
						set(
							$current,
							"param",
							lv_param_7_0,
							"org.xtext.niste15.mdsd.Android.ConstraintParameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleConstraintTypeVertical
entryRuleConstraintTypeVertical returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstraintTypeVerticalRule()); }
	iv_ruleConstraintTypeVertical=ruleConstraintTypeVertical
	{ $current=$iv_ruleConstraintTypeVertical.current; }
	EOF;

// Rule ConstraintTypeVertical
ruleConstraintTypeVertical returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getConstraintTypeVerticalAccess().getRightOfAction_0_0(),
						$current);
				}
			)
			otherlv_1='rightOf'
			{
				newLeafNode(otherlv_1, grammarAccess.getConstraintTypeVerticalAccess().getRightOfKeyword_0_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getConstraintTypeVerticalAccess().getLeftOfAction_1_0(),
						$current);
				}
			)
			otherlv_3='leftOf'
			{
				newLeafNode(otherlv_3, grammarAccess.getConstraintTypeVerticalAccess().getLeftOfKeyword_1_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getConstraintTypeVerticalAccess().getBottomOfAction_2_0(),
						$current);
				}
			)
			otherlv_5='bottomOf'
			{
				newLeafNode(otherlv_5, grammarAccess.getConstraintTypeVerticalAccess().getBottomOfKeyword_2_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getConstraintTypeVerticalAccess().getTopOfAction_3_0(),
						$current);
				}
			)
			otherlv_7='topOf'
			{
				newLeafNode(otherlv_7, grammarAccess.getConstraintTypeVerticalAccess().getTopOfKeyword_3_1());
			}
		)
	)
;

// Entry rule entryRuleConstraintParameter
entryRuleConstraintParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstraintParameterRule()); }
	iv_ruleConstraintParameter=ruleConstraintParameter
	{ $current=$iv_ruleConstraintParameter.current; }
	EOF;

// Rule ConstraintParameter
ruleConstraintParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getConstraintParameterAccess().getPersentageAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_value_1_0=RULE_ID
					{
						newLeafNode(lv_value_1_0, grammarAccess.getConstraintParameterAccess().getValueIDTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getConstraintParameterRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_2='%'
			{
				newLeafNode(otherlv_2, grammarAccess.getConstraintParameterAccess().getPercentSignKeyword_0_2());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getConstraintParameterAccess().getRightAction_1_0(),
						$current);
				}
			)
			otherlv_4='right'
			{
				newLeafNode(otherlv_4, grammarAccess.getConstraintParameterAccess().getRightKeyword_1_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getConstraintParameterAccess().getLeftAction_2_0(),
						$current);
				}
			)
			otherlv_6='left'
			{
				newLeafNode(otherlv_6, grammarAccess.getConstraintParameterAccess().getLeftKeyword_2_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getConstraintParameterAccess().getTopAction_3_0(),
						$current);
				}
			)
			otherlv_8='top'
			{
				newLeafNode(otherlv_8, grammarAccess.getConstraintParameterAccess().getTopKeyword_3_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getConstraintParameterAccess().getBottomAction_4_0(),
						$current);
				}
			)
			otherlv_10='bottom'
			{
				newLeafNode(otherlv_10, grammarAccess.getConstraintParameterAccess().getBottomKeyword_4_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getConstraintParameterAccess().getMiddleAction_5_0(),
						$current);
				}
			)
			otherlv_12='middle'
			{
				newLeafNode(otherlv_12, grammarAccess.getConstraintParameterAccess().getMiddleKeyword_5_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
