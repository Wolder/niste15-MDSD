/*
 * generated by Xtext 2.22.0
 */
package org.xtext.niste15.mdsd.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class AndroidGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.niste15.mdsd.Android.Model");
		private final Assignment cApplicationAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cApplicationApplicationParserRuleCall_0 = (RuleCall)cApplicationAssignment.eContents().get(0);
		
		//Model:
		//	application=Application;
		@Override public ParserRule getRule() { return rule; }
		
		//application=Application
		public Assignment getApplicationAssignment() { return cApplicationAssignment; }
		
		//Application
		public RuleCall getApplicationApplicationParserRuleCall_0() { return cApplicationApplicationParserRuleCall_0; }
	}
	public class ApplicationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.niste15.mdsd.Android.Application");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cApplicationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPanesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPanesPaneParserRuleCall_3_0 = (RuleCall)cPanesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Application:
		//	'Application' name=ID '{' panes+=Pane* '}' //NavigationBar
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Application' name=ID '{' panes+=Pane* '}'
		public Group getGroup() { return cGroup; }
		
		//'Application'
		public Keyword getApplicationKeyword_0() { return cApplicationKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//panes+=Pane*
		public Assignment getPanesAssignment_3() { return cPanesAssignment_3; }
		
		//Pane
		public RuleCall getPanesPaneParserRuleCall_3_0() { return cPanesPaneParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class PaneElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.niste15.mdsd.Android.Pane");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPaneAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPaneKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFramesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFramesFrameParserRuleCall_4_0 = (RuleCall)cFramesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Pane:
		//	{Pane} 'Pane' name=ID? '{' frames+=Frame* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Pane} 'Pane' name=ID? '{' frames+=Frame* '}'
		public Group getGroup() { return cGroup; }
		
		//{Pane}
		public Action getPaneAction_0() { return cPaneAction_0; }
		
		//'Pane'
		public Keyword getPaneKeyword_1() { return cPaneKeyword_1; }
		
		//name=ID?
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//frames+=Frame*
		public Assignment getFramesAssignment_4() { return cFramesAssignment_4; }
		
		//Frame
		public RuleCall getFramesFrameParserRuleCall_4_0() { return cFramesFrameParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class FrameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.niste15.mdsd.Android.Frame");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFrameAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFrameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementsElementsParserRuleCall_4_0 = (RuleCall)cElementsAssignment_4.eContents().get(0);
		private final Assignment cConstraintAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cConstraintConstraintParserRuleCall_5_0 = (RuleCall)cConstraintAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Frame:
		//	{Frame} 'Frame' name=ID? '{' elements+=Elements* constraint=Constraint? '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Frame} 'Frame' name=ID? '{' elements+=Elements* constraint=Constraint? '}'
		public Group getGroup() { return cGroup; }
		
		//{Frame}
		public Action getFrameAction_0() { return cFrameAction_0; }
		
		//'Frame'
		public Keyword getFrameKeyword_1() { return cFrameKeyword_1; }
		
		//name=ID?
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//elements+=Elements*
		public Assignment getElementsAssignment_4() { return cElementsAssignment_4; }
		
		//Elements
		public RuleCall getElementsElementsParserRuleCall_4_0() { return cElementsElementsParserRuleCall_4_0; }
		
		//constraint=Constraint?
		public Assignment getConstraintAssignment_5() { return cConstraintAssignment_5; }
		
		//Constraint
		public RuleCall getConstraintConstraintParserRuleCall_5_0() { return cConstraintConstraintParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class ElementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.niste15.mdsd.Android.Elements");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cButtonParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTextParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Elements:
		//	Button | Text // ADD MORE 
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Button | Text
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Button
		public RuleCall getButtonParserRuleCall_0() { return cButtonParserRuleCall_0; }
		
		//Text
		public RuleCall getTextParserRuleCall_1() { return cTextParserRuleCall_1; }
	}
	public class TextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.niste15.mdsd.Android.Text");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTextKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTextAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTextSTRINGTerminalRuleCall_2_0 = (RuleCall)cTextAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Text:
		//	'Text' '(' text=STRING ')' //More Params
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Text' '(' text=STRING ')'
		public Group getGroup() { return cGroup; }
		
		//'Text'
		public Keyword getTextKeyword_0() { return cTextKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//text=STRING
		public Assignment getTextAssignment_2() { return cTextAssignment_2; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_2_0() { return cTextSTRINGTerminalRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class ButtonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.niste15.mdsd.Android.Button");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cButtonKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTextAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTextSTRINGTerminalRuleCall_2_0 = (RuleCall)cTextAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cNavigateKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cPaneAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final CrossReference cPanePaneCrossReference_3_2_0 = (CrossReference)cPaneAssignment_3_2.eContents().get(0);
		private final RuleCall cPanePaneIDTerminalRuleCall_3_2_0_1 = (RuleCall)cPanePaneCrossReference_3_2_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Button:
		//	'Button' '(' text=STRING ('navigate' '->' pane=[Pane])? ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'Button' '(' text=STRING ('navigate' '->' pane=[Pane])? ')'
		public Group getGroup() { return cGroup; }
		
		//'Button'
		public Keyword getButtonKeyword_0() { return cButtonKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//text=STRING
		public Assignment getTextAssignment_2() { return cTextAssignment_2; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_2_0() { return cTextSTRINGTerminalRuleCall_2_0; }
		
		//('navigate' '->' pane=[Pane])?
		public Group getGroup_3() { return cGroup_3; }
		
		//'navigate'
		public Keyword getNavigateKeyword_3_0() { return cNavigateKeyword_3_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_3_1() { return cHyphenMinusGreaterThanSignKeyword_3_1; }
		
		//pane=[Pane]
		public Assignment getPaneAssignment_3_2() { return cPaneAssignment_3_2; }
		
		//[Pane]
		public CrossReference getPanePaneCrossReference_3_2_0() { return cPanePaneCrossReference_3_2_0; }
		
		//ID
		public RuleCall getPanePaneIDTerminalRuleCall_3_2_0_1() { return cPanePaneIDTerminalRuleCall_3_2_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class ConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.niste15.mdsd.Android.Constraint");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cConstraintKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cConstraintTypeAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cConstraintTypeConstraintTypeVerticalParserRuleCall_0_2_0 = (RuleCall)cConstraintTypeAssignment_0_2.eContents().get(0);
		private final Keyword cEqualsSignKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Assignment cFrameAssignment_0_4 = (Assignment)cGroup_0.eContents().get(4);
		private final CrossReference cFrameFrameCrossReference_0_4_0 = (CrossReference)cFrameAssignment_0_4.eContents().get(0);
		private final RuleCall cFrameFrameIDTerminalRuleCall_0_4_0_1 = (RuleCall)cFrameFrameCrossReference_0_4_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cConstraintKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cParamAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cParamConstraintParameterParserRuleCall_1_2_0 = (RuleCall)cParamAssignment_1_2.eContents().get(0);
		
		//Constraint:
		//	'constraint' ':' constraintType=ConstraintTypeVertical '=' frame=[Frame] |
		//	'constraint' '=' param=ConstraintParameter;
		@Override public ParserRule getRule() { return rule; }
		
		//'constraint' ':' constraintType=ConstraintTypeVertical '=' frame=[Frame] | 'constraint' '=' param=ConstraintParameter
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'constraint' ':' constraintType=ConstraintTypeVertical '=' frame=[Frame]
		public Group getGroup_0() { return cGroup_0; }
		
		//'constraint'
		public Keyword getConstraintKeyword_0_0() { return cConstraintKeyword_0_0; }
		
		//':'
		public Keyword getColonKeyword_0_1() { return cColonKeyword_0_1; }
		
		//constraintType=ConstraintTypeVertical
		public Assignment getConstraintTypeAssignment_0_2() { return cConstraintTypeAssignment_0_2; }
		
		//ConstraintTypeVertical
		public RuleCall getConstraintTypeConstraintTypeVerticalParserRuleCall_0_2_0() { return cConstraintTypeConstraintTypeVerticalParserRuleCall_0_2_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_0_3() { return cEqualsSignKeyword_0_3; }
		
		//frame=[Frame]
		public Assignment getFrameAssignment_0_4() { return cFrameAssignment_0_4; }
		
		//[Frame]
		public CrossReference getFrameFrameCrossReference_0_4_0() { return cFrameFrameCrossReference_0_4_0; }
		
		//ID
		public RuleCall getFrameFrameIDTerminalRuleCall_0_4_0_1() { return cFrameFrameIDTerminalRuleCall_0_4_0_1; }
		
		//'constraint' '=' param=ConstraintParameter
		public Group getGroup_1() { return cGroup_1; }
		
		//'constraint'
		public Keyword getConstraintKeyword_1_0() { return cConstraintKeyword_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1_1() { return cEqualsSignKeyword_1_1; }
		
		//param=ConstraintParameter
		public Assignment getParamAssignment_1_2() { return cParamAssignment_1_2; }
		
		//ConstraintParameter
		public RuleCall getParamConstraintParameterParserRuleCall_1_2_0() { return cParamConstraintParameterParserRuleCall_1_2_0; }
	}
	public class ConstraintTypeVerticalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.niste15.mdsd.Android.ConstraintTypeVertical");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cRightOfAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cRightOfKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cLeftOfAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cLeftOfKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cBottomOfAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Keyword cBottomOfKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cTopOfAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Keyword cTopOfKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		
		//ConstraintTypeVertical:
		//	{RightOf} 'rightOf' | {LeftOf} 'leftOf' | {BottomOf} 'bottomOf' | {TopOf} 'topOf';
		@Override public ParserRule getRule() { return rule; }
		
		//{RightOf} 'rightOf' | {LeftOf} 'leftOf' | {BottomOf} 'bottomOf' | {TopOf} 'topOf'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{RightOf} 'rightOf'
		public Group getGroup_0() { return cGroup_0; }
		
		//{RightOf}
		public Action getRightOfAction_0_0() { return cRightOfAction_0_0; }
		
		//'rightOf'
		public Keyword getRightOfKeyword_0_1() { return cRightOfKeyword_0_1; }
		
		//{LeftOf} 'leftOf'
		public Group getGroup_1() { return cGroup_1; }
		
		//{LeftOf}
		public Action getLeftOfAction_1_0() { return cLeftOfAction_1_0; }
		
		//'leftOf'
		public Keyword getLeftOfKeyword_1_1() { return cLeftOfKeyword_1_1; }
		
		//{BottomOf} 'bottomOf'
		public Group getGroup_2() { return cGroup_2; }
		
		//{BottomOf}
		public Action getBottomOfAction_2_0() { return cBottomOfAction_2_0; }
		
		//'bottomOf'
		public Keyword getBottomOfKeyword_2_1() { return cBottomOfKeyword_2_1; }
		
		//{TopOf} 'topOf'
		public Group getGroup_3() { return cGroup_3; }
		
		//{TopOf}
		public Action getTopOfAction_3_0() { return cTopOfAction_3_0; }
		
		//'topOf'
		public Keyword getTopOfKeyword_3_1() { return cTopOfKeyword_3_1; }
	}
	public class ConstraintParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.niste15.mdsd.Android.ConstraintParameter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cPersentageAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cValueIDTerminalRuleCall_0_1_0 = (RuleCall)cValueAssignment_0_1.eContents().get(0);
		private final Keyword cPercentSignKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cRightAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cRightKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cLeftAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Keyword cLeftKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cTopAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Keyword cTopKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Action cBottomAction_4_0 = (Action)cGroup_4.eContents().get(0);
		private final Keyword cBottomKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Action cMiddleAction_5_0 = (Action)cGroup_5.eContents().get(0);
		private final Keyword cMiddleKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		
		//ConstraintParameter:
		//	{Persentage} value=ID '%' | {Right} 'right' | {Left} 'left' | {Top} 'top' | {Bottom} 'bottom' | {Middle} 'middle';
		@Override public ParserRule getRule() { return rule; }
		
		//{Persentage} value=ID '%' | {Right} 'right' | {Left} 'left' | {Top} 'top' | {Bottom} 'bottom' | {Middle} 'middle'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Persentage} value=ID '%'
		public Group getGroup_0() { return cGroup_0; }
		
		//{Persentage}
		public Action getPersentageAction_0_0() { return cPersentageAction_0_0; }
		
		//value=ID
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//ID
		public RuleCall getValueIDTerminalRuleCall_0_1_0() { return cValueIDTerminalRuleCall_0_1_0; }
		
		//'%'
		public Keyword getPercentSignKeyword_0_2() { return cPercentSignKeyword_0_2; }
		
		//{Right} 'right'
		public Group getGroup_1() { return cGroup_1; }
		
		//{Right}
		public Action getRightAction_1_0() { return cRightAction_1_0; }
		
		//'right'
		public Keyword getRightKeyword_1_1() { return cRightKeyword_1_1; }
		
		//{Left} 'left'
		public Group getGroup_2() { return cGroup_2; }
		
		//{Left}
		public Action getLeftAction_2_0() { return cLeftAction_2_0; }
		
		//'left'
		public Keyword getLeftKeyword_2_1() { return cLeftKeyword_2_1; }
		
		//{Top} 'top'
		public Group getGroup_3() { return cGroup_3; }
		
		//{Top}
		public Action getTopAction_3_0() { return cTopAction_3_0; }
		
		//'top'
		public Keyword getTopKeyword_3_1() { return cTopKeyword_3_1; }
		
		//{Bottom} 'bottom'
		public Group getGroup_4() { return cGroup_4; }
		
		//{Bottom}
		public Action getBottomAction_4_0() { return cBottomAction_4_0; }
		
		//'bottom'
		public Keyword getBottomKeyword_4_1() { return cBottomKeyword_4_1; }
		
		//{Middle} 'middle'
		public Group getGroup_5() { return cGroup_5; }
		
		//{Middle}
		public Action getMiddleAction_5_0() { return cMiddleAction_5_0; }
		
		//'middle'
		public Keyword getMiddleKeyword_5_1() { return cMiddleKeyword_5_1; }
	}
	
	
	private final ModelElements pModel;
	private final ApplicationElements pApplication;
	private final PaneElements pPane;
	private final FrameElements pFrame;
	private final ElementsElements pElements;
	private final TextElements pText;
	private final ButtonElements pButton;
	private final ConstraintElements pConstraint;
	private final ConstraintTypeVerticalElements pConstraintTypeVertical;
	private final ConstraintParameterElements pConstraintParameter;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public AndroidGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pApplication = new ApplicationElements();
		this.pPane = new PaneElements();
		this.pFrame = new FrameElements();
		this.pElements = new ElementsElements();
		this.pText = new TextElements();
		this.pButton = new ButtonElements();
		this.pConstraint = new ConstraintElements();
		this.pConstraintTypeVertical = new ConstraintTypeVerticalElements();
		this.pConstraintParameter = new ConstraintParameterElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.niste15.mdsd.Android".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	application=Application;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Application:
	//	'Application' name=ID '{' panes+=Pane* '}' //NavigationBar
	//;
	public ApplicationElements getApplicationAccess() {
		return pApplication;
	}
	
	public ParserRule getApplicationRule() {
		return getApplicationAccess().getRule();
	}
	
	//Pane:
	//	{Pane} 'Pane' name=ID? '{' frames+=Frame* '}';
	public PaneElements getPaneAccess() {
		return pPane;
	}
	
	public ParserRule getPaneRule() {
		return getPaneAccess().getRule();
	}
	
	//Frame:
	//	{Frame} 'Frame' name=ID? '{' elements+=Elements* constraint=Constraint? '}';
	public FrameElements getFrameAccess() {
		return pFrame;
	}
	
	public ParserRule getFrameRule() {
		return getFrameAccess().getRule();
	}
	
	//Elements:
	//	Button | Text // ADD MORE 
	//;
	public ElementsElements getElementsAccess() {
		return pElements;
	}
	
	public ParserRule getElementsRule() {
		return getElementsAccess().getRule();
	}
	
	//Text:
	//	'Text' '(' text=STRING ')' //More Params
	//;
	public TextElements getTextAccess() {
		return pText;
	}
	
	public ParserRule getTextRule() {
		return getTextAccess().getRule();
	}
	
	//Button:
	//	'Button' '(' text=STRING ('navigate' '->' pane=[Pane])? ')';
	public ButtonElements getButtonAccess() {
		return pButton;
	}
	
	public ParserRule getButtonRule() {
		return getButtonAccess().getRule();
	}
	
	//Constraint:
	//	'constraint' ':' constraintType=ConstraintTypeVertical '=' frame=[Frame] |
	//	'constraint' '=' param=ConstraintParameter;
	public ConstraintElements getConstraintAccess() {
		return pConstraint;
	}
	
	public ParserRule getConstraintRule() {
		return getConstraintAccess().getRule();
	}
	
	//ConstraintTypeVertical:
	//	{RightOf} 'rightOf' | {LeftOf} 'leftOf' | {BottomOf} 'bottomOf' | {TopOf} 'topOf';
	public ConstraintTypeVerticalElements getConstraintTypeVerticalAccess() {
		return pConstraintTypeVertical;
	}
	
	public ParserRule getConstraintTypeVerticalRule() {
		return getConstraintTypeVerticalAccess().getRule();
	}
	
	//ConstraintParameter:
	//	{Persentage} value=ID '%' | {Right} 'right' | {Left} 'left' | {Top} 'top' | {Bottom} 'bottom' | {Middle} 'middle';
	public ConstraintParameterElements getConstraintParameterAccess() {
		return pConstraintParameter;
	}
	
	public ParserRule getConstraintParameterRule() {
		return getConstraintParameterAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
