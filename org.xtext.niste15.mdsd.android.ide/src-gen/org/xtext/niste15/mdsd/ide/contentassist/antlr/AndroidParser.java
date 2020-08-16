/*
 * generated by Xtext 2.22.0
 */
package org.xtext.niste15.mdsd.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.niste15.mdsd.ide.contentassist.antlr.internal.InternalAndroidParser;
import org.xtext.niste15.mdsd.services.AndroidGrammarAccess;

public class AndroidParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(AndroidGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, AndroidGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getElementsAccess().getAlternatives(), "rule__Elements__Alternatives");
			builder.put(grammarAccess.getConstraintAccess().getAlternatives(), "rule__Constraint__Alternatives");
			builder.put(grammarAccess.getConstraintTypeVerticalAccess().getAlternatives(), "rule__ConstraintTypeVertical__Alternatives");
			builder.put(grammarAccess.getConstraintParameterAccess().getAlternatives(), "rule__ConstraintParameter__Alternatives");
			builder.put(grammarAccess.getApplicationAccess().getGroup(), "rule__Application__Group__0");
			builder.put(grammarAccess.getPaneAccess().getGroup(), "rule__Pane__Group__0");
			builder.put(grammarAccess.getFrameAccess().getGroup(), "rule__Frame__Group__0");
			builder.put(grammarAccess.getTextAccess().getGroup(), "rule__Text__Group__0");
			builder.put(grammarAccess.getButtonAccess().getGroup(), "rule__Button__Group__0");
			builder.put(grammarAccess.getConstraintAccess().getGroup_0(), "rule__Constraint__Group_0__0");
			builder.put(grammarAccess.getConstraintAccess().getGroup_0_1(), "rule__Constraint__Group_0_1__0");
			builder.put(grammarAccess.getConstraintAccess().getGroup_1(), "rule__Constraint__Group_1__0");
			builder.put(grammarAccess.getConstraintTypeVerticalAccess().getGroup_0(), "rule__ConstraintTypeVertical__Group_0__0");
			builder.put(grammarAccess.getConstraintTypeVerticalAccess().getGroup_1(), "rule__ConstraintTypeVertical__Group_1__0");
			builder.put(grammarAccess.getConstraintTypeVerticalAccess().getGroup_2(), "rule__ConstraintTypeVertical__Group_2__0");
			builder.put(grammarAccess.getConstraintTypeVerticalAccess().getGroup_3(), "rule__ConstraintTypeVertical__Group_3__0");
			builder.put(grammarAccess.getConstraintParameterAccess().getGroup_0(), "rule__ConstraintParameter__Group_0__0");
			builder.put(grammarAccess.getConstraintParameterAccess().getGroup_1(), "rule__ConstraintParameter__Group_1__0");
			builder.put(grammarAccess.getConstraintParameterAccess().getGroup_2(), "rule__ConstraintParameter__Group_2__0");
			builder.put(grammarAccess.getConstraintParameterAccess().getGroup_3(), "rule__ConstraintParameter__Group_3__0");
			builder.put(grammarAccess.getConstraintParameterAccess().getGroup_4(), "rule__ConstraintParameter__Group_4__0");
			builder.put(grammarAccess.getConstraintParameterAccess().getGroup_5(), "rule__ConstraintParameter__Group_5__0");
			builder.put(grammarAccess.getModelAccess().getApplicationAssignment(), "rule__Model__ApplicationAssignment");
			builder.put(grammarAccess.getApplicationAccess().getNameAssignment_1(), "rule__Application__NameAssignment_1");
			builder.put(grammarAccess.getApplicationAccess().getPanesAssignment_3(), "rule__Application__PanesAssignment_3");
			builder.put(grammarAccess.getPaneAccess().getFramesAssignment_3(), "rule__Pane__FramesAssignment_3");
			builder.put(grammarAccess.getFrameAccess().getNameAssignment_2(), "rule__Frame__NameAssignment_2");
			builder.put(grammarAccess.getFrameAccess().getElementsAssignment_4(), "rule__Frame__ElementsAssignment_4");
			builder.put(grammarAccess.getFrameAccess().getConstraintAssignment_5(), "rule__Frame__ConstraintAssignment_5");
			builder.put(grammarAccess.getTextAccess().getTextAssignment_2(), "rule__Text__TextAssignment_2");
			builder.put(grammarAccess.getButtonAccess().getTextAssignment_2(), "rule__Button__TextAssignment_2");
			builder.put(grammarAccess.getConstraintAccess().getConstraintTypeAssignment_0_1_1(), "rule__Constraint__ConstraintTypeAssignment_0_1_1");
			builder.put(grammarAccess.getConstraintAccess().getFrameAssignment_0_1_3(), "rule__Constraint__FrameAssignment_0_1_3");
			builder.put(grammarAccess.getConstraintAccess().getParamAssignment_1_2(), "rule__Constraint__ParamAssignment_1_2");
			builder.put(grammarAccess.getConstraintParameterAccess().getValueAssignment_0_1(), "rule__ConstraintParameter__ValueAssignment_0_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private AndroidGrammarAccess grammarAccess;

	@Override
	protected InternalAndroidParser createParser() {
		InternalAndroidParser result = new InternalAndroidParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AndroidGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AndroidGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
