package org.xtext.niste15.mdsd.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.niste15.mdsd.services.AndroidGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAndroidParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Application'", "'{'", "'}'", "'Pane'", "'Frame'", "'Text'", "'('", "')'", "'Button'", "'constraint'", "':'", "'='", "'rightOf'", "'leftOf'", "'bottomOf'", "'topOf'", "'%'", "'right'", "'left'", "'top'", "'bottom'", "'middle'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAndroidParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAndroidParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAndroidParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAndroid.g"; }


    	private AndroidGrammarAccess grammarAccess;

    	public void setGrammarAccess(AndroidGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalAndroid.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAndroid.g:54:1: ( ruleModel EOF )
            // InternalAndroid.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAndroid.g:62:1: ruleModel : ( ( rule__Model__ApplicationAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:66:2: ( ( ( rule__Model__ApplicationAssignment ) ) )
            // InternalAndroid.g:67:2: ( ( rule__Model__ApplicationAssignment ) )
            {
            // InternalAndroid.g:67:2: ( ( rule__Model__ApplicationAssignment ) )
            // InternalAndroid.g:68:3: ( rule__Model__ApplicationAssignment )
            {
             before(grammarAccess.getModelAccess().getApplicationAssignment()); 
            // InternalAndroid.g:69:3: ( rule__Model__ApplicationAssignment )
            // InternalAndroid.g:69:4: rule__Model__ApplicationAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__ApplicationAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getApplicationAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleApplication"
    // InternalAndroid.g:78:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // InternalAndroid.g:79:1: ( ruleApplication EOF )
            // InternalAndroid.g:80:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalAndroid.g:87:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:91:2: ( ( ( rule__Application__Group__0 ) ) )
            // InternalAndroid.g:92:2: ( ( rule__Application__Group__0 ) )
            {
            // InternalAndroid.g:92:2: ( ( rule__Application__Group__0 ) )
            // InternalAndroid.g:93:3: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // InternalAndroid.g:94:3: ( rule__Application__Group__0 )
            // InternalAndroid.g:94:4: rule__Application__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRulePane"
    // InternalAndroid.g:103:1: entryRulePane : rulePane EOF ;
    public final void entryRulePane() throws RecognitionException {
        try {
            // InternalAndroid.g:104:1: ( rulePane EOF )
            // InternalAndroid.g:105:1: rulePane EOF
            {
             before(grammarAccess.getPaneRule()); 
            pushFollow(FOLLOW_1);
            rulePane();

            state._fsp--;

             after(grammarAccess.getPaneRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePane"


    // $ANTLR start "rulePane"
    // InternalAndroid.g:112:1: rulePane : ( ( rule__Pane__Group__0 ) ) ;
    public final void rulePane() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:116:2: ( ( ( rule__Pane__Group__0 ) ) )
            // InternalAndroid.g:117:2: ( ( rule__Pane__Group__0 ) )
            {
            // InternalAndroid.g:117:2: ( ( rule__Pane__Group__0 ) )
            // InternalAndroid.g:118:3: ( rule__Pane__Group__0 )
            {
             before(grammarAccess.getPaneAccess().getGroup()); 
            // InternalAndroid.g:119:3: ( rule__Pane__Group__0 )
            // InternalAndroid.g:119:4: rule__Pane__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pane__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPaneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePane"


    // $ANTLR start "entryRuleFrame"
    // InternalAndroid.g:128:1: entryRuleFrame : ruleFrame EOF ;
    public final void entryRuleFrame() throws RecognitionException {
        try {
            // InternalAndroid.g:129:1: ( ruleFrame EOF )
            // InternalAndroid.g:130:1: ruleFrame EOF
            {
             before(grammarAccess.getFrameRule()); 
            pushFollow(FOLLOW_1);
            ruleFrame();

            state._fsp--;

             after(grammarAccess.getFrameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFrame"


    // $ANTLR start "ruleFrame"
    // InternalAndroid.g:137:1: ruleFrame : ( ( rule__Frame__Group__0 ) ) ;
    public final void ruleFrame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:141:2: ( ( ( rule__Frame__Group__0 ) ) )
            // InternalAndroid.g:142:2: ( ( rule__Frame__Group__0 ) )
            {
            // InternalAndroid.g:142:2: ( ( rule__Frame__Group__0 ) )
            // InternalAndroid.g:143:3: ( rule__Frame__Group__0 )
            {
             before(grammarAccess.getFrameAccess().getGroup()); 
            // InternalAndroid.g:144:3: ( rule__Frame__Group__0 )
            // InternalAndroid.g:144:4: rule__Frame__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Frame__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrame"


    // $ANTLR start "entryRuleElements"
    // InternalAndroid.g:153:1: entryRuleElements : ruleElements EOF ;
    public final void entryRuleElements() throws RecognitionException {
        try {
            // InternalAndroid.g:154:1: ( ruleElements EOF )
            // InternalAndroid.g:155:1: ruleElements EOF
            {
             before(grammarAccess.getElementsRule()); 
            pushFollow(FOLLOW_1);
            ruleElements();

            state._fsp--;

             after(grammarAccess.getElementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElements"


    // $ANTLR start "ruleElements"
    // InternalAndroid.g:162:1: ruleElements : ( ( rule__Elements__Alternatives ) ) ;
    public final void ruleElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:166:2: ( ( ( rule__Elements__Alternatives ) ) )
            // InternalAndroid.g:167:2: ( ( rule__Elements__Alternatives ) )
            {
            // InternalAndroid.g:167:2: ( ( rule__Elements__Alternatives ) )
            // InternalAndroid.g:168:3: ( rule__Elements__Alternatives )
            {
             before(grammarAccess.getElementsAccess().getAlternatives()); 
            // InternalAndroid.g:169:3: ( rule__Elements__Alternatives )
            // InternalAndroid.g:169:4: rule__Elements__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Elements__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElements"


    // $ANTLR start "entryRuleText"
    // InternalAndroid.g:178:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalAndroid.g:179:1: ( ruleText EOF )
            // InternalAndroid.g:180:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalAndroid.g:187:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:191:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalAndroid.g:192:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalAndroid.g:192:2: ( ( rule__Text__Group__0 ) )
            // InternalAndroid.g:193:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalAndroid.g:194:3: ( rule__Text__Group__0 )
            // InternalAndroid.g:194:4: rule__Text__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleButton"
    // InternalAndroid.g:203:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalAndroid.g:204:1: ( ruleButton EOF )
            // InternalAndroid.g:205:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalAndroid.g:212:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:216:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalAndroid.g:217:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalAndroid.g:217:2: ( ( rule__Button__Group__0 ) )
            // InternalAndroid.g:218:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalAndroid.g:219:3: ( rule__Button__Group__0 )
            // InternalAndroid.g:219:4: rule__Button__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleConstraint"
    // InternalAndroid.g:228:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalAndroid.g:229:1: ( ruleConstraint EOF )
            // InternalAndroid.g:230:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalAndroid.g:237:1: ruleConstraint : ( ( rule__Constraint__Alternatives ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:241:2: ( ( ( rule__Constraint__Alternatives ) ) )
            // InternalAndroid.g:242:2: ( ( rule__Constraint__Alternatives ) )
            {
            // InternalAndroid.g:242:2: ( ( rule__Constraint__Alternatives ) )
            // InternalAndroid.g:243:3: ( rule__Constraint__Alternatives )
            {
             before(grammarAccess.getConstraintAccess().getAlternatives()); 
            // InternalAndroid.g:244:3: ( rule__Constraint__Alternatives )
            // InternalAndroid.g:244:4: rule__Constraint__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleConstraintTypeVertical"
    // InternalAndroid.g:253:1: entryRuleConstraintTypeVertical : ruleConstraintTypeVertical EOF ;
    public final void entryRuleConstraintTypeVertical() throws RecognitionException {
        try {
            // InternalAndroid.g:254:1: ( ruleConstraintTypeVertical EOF )
            // InternalAndroid.g:255:1: ruleConstraintTypeVertical EOF
            {
             before(grammarAccess.getConstraintTypeVerticalRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraintTypeVertical();

            state._fsp--;

             after(grammarAccess.getConstraintTypeVerticalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraintTypeVertical"


    // $ANTLR start "ruleConstraintTypeVertical"
    // InternalAndroid.g:262:1: ruleConstraintTypeVertical : ( ( rule__ConstraintTypeVertical__Alternatives ) ) ;
    public final void ruleConstraintTypeVertical() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:266:2: ( ( ( rule__ConstraintTypeVertical__Alternatives ) ) )
            // InternalAndroid.g:267:2: ( ( rule__ConstraintTypeVertical__Alternatives ) )
            {
            // InternalAndroid.g:267:2: ( ( rule__ConstraintTypeVertical__Alternatives ) )
            // InternalAndroid.g:268:3: ( rule__ConstraintTypeVertical__Alternatives )
            {
             before(grammarAccess.getConstraintTypeVerticalAccess().getAlternatives()); 
            // InternalAndroid.g:269:3: ( rule__ConstraintTypeVertical__Alternatives )
            // InternalAndroid.g:269:4: rule__ConstraintTypeVertical__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintTypeVertical__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstraintTypeVerticalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintTypeVertical"


    // $ANTLR start "entryRuleConstraintParameter"
    // InternalAndroid.g:278:1: entryRuleConstraintParameter : ruleConstraintParameter EOF ;
    public final void entryRuleConstraintParameter() throws RecognitionException {
        try {
            // InternalAndroid.g:279:1: ( ruleConstraintParameter EOF )
            // InternalAndroid.g:280:1: ruleConstraintParameter EOF
            {
             before(grammarAccess.getConstraintParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraintParameter();

            state._fsp--;

             after(grammarAccess.getConstraintParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraintParameter"


    // $ANTLR start "ruleConstraintParameter"
    // InternalAndroid.g:287:1: ruleConstraintParameter : ( ( rule__ConstraintParameter__Alternatives ) ) ;
    public final void ruleConstraintParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:291:2: ( ( ( rule__ConstraintParameter__Alternatives ) ) )
            // InternalAndroid.g:292:2: ( ( rule__ConstraintParameter__Alternatives ) )
            {
            // InternalAndroid.g:292:2: ( ( rule__ConstraintParameter__Alternatives ) )
            // InternalAndroid.g:293:3: ( rule__ConstraintParameter__Alternatives )
            {
             before(grammarAccess.getConstraintParameterAccess().getAlternatives()); 
            // InternalAndroid.g:294:3: ( rule__ConstraintParameter__Alternatives )
            // InternalAndroid.g:294:4: rule__ConstraintParameter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstraintParameterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintParameter"


    // $ANTLR start "rule__Elements__Alternatives"
    // InternalAndroid.g:302:1: rule__Elements__Alternatives : ( ( ruleButton ) | ( ruleText ) );
    public final void rule__Elements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:306:1: ( ( ruleButton ) | ( ruleText ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAndroid.g:307:2: ( ruleButton )
                    {
                    // InternalAndroid.g:307:2: ( ruleButton )
                    // InternalAndroid.g:308:3: ruleButton
                    {
                     before(grammarAccess.getElementsAccess().getButtonParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getElementsAccess().getButtonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroid.g:313:2: ( ruleText )
                    {
                    // InternalAndroid.g:313:2: ( ruleText )
                    // InternalAndroid.g:314:3: ruleText
                    {
                     before(grammarAccess.getElementsAccess().getTextParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getElementsAccess().getTextParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elements__Alternatives"


    // $ANTLR start "rule__Constraint__Alternatives"
    // InternalAndroid.g:323:1: rule__Constraint__Alternatives : ( ( ( rule__Constraint__Group_0__0 ) ) | ( ( rule__Constraint__Group_1__0 ) ) );
    public final void rule__Constraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:327:1: ( ( ( rule__Constraint__Group_0__0 ) ) | ( ( rule__Constraint__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==21) ) {
                    alt2=1;
                }
                else if ( (LA2_1==22) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAndroid.g:328:2: ( ( rule__Constraint__Group_0__0 ) )
                    {
                    // InternalAndroid.g:328:2: ( ( rule__Constraint__Group_0__0 ) )
                    // InternalAndroid.g:329:3: ( rule__Constraint__Group_0__0 )
                    {
                     before(grammarAccess.getConstraintAccess().getGroup_0()); 
                    // InternalAndroid.g:330:3: ( rule__Constraint__Group_0__0 )
                    // InternalAndroid.g:330:4: rule__Constraint__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroid.g:334:2: ( ( rule__Constraint__Group_1__0 ) )
                    {
                    // InternalAndroid.g:334:2: ( ( rule__Constraint__Group_1__0 ) )
                    // InternalAndroid.g:335:3: ( rule__Constraint__Group_1__0 )
                    {
                     before(grammarAccess.getConstraintAccess().getGroup_1()); 
                    // InternalAndroid.g:336:3: ( rule__Constraint__Group_1__0 )
                    // InternalAndroid.g:336:4: rule__Constraint__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Alternatives"


    // $ANTLR start "rule__ConstraintTypeVertical__Alternatives"
    // InternalAndroid.g:344:1: rule__ConstraintTypeVertical__Alternatives : ( ( ( rule__ConstraintTypeVertical__Group_0__0 ) ) | ( ( rule__ConstraintTypeVertical__Group_1__0 ) ) | ( ( rule__ConstraintTypeVertical__Group_2__0 ) ) | ( ( rule__ConstraintTypeVertical__Group_3__0 ) ) );
    public final void rule__ConstraintTypeVertical__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:348:1: ( ( ( rule__ConstraintTypeVertical__Group_0__0 ) ) | ( ( rule__ConstraintTypeVertical__Group_1__0 ) ) | ( ( rule__ConstraintTypeVertical__Group_2__0 ) ) | ( ( rule__ConstraintTypeVertical__Group_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 26:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAndroid.g:349:2: ( ( rule__ConstraintTypeVertical__Group_0__0 ) )
                    {
                    // InternalAndroid.g:349:2: ( ( rule__ConstraintTypeVertical__Group_0__0 ) )
                    // InternalAndroid.g:350:3: ( rule__ConstraintTypeVertical__Group_0__0 )
                    {
                     before(grammarAccess.getConstraintTypeVerticalAccess().getGroup_0()); 
                    // InternalAndroid.g:351:3: ( rule__ConstraintTypeVertical__Group_0__0 )
                    // InternalAndroid.g:351:4: rule__ConstraintTypeVertical__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintTypeVertical__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintTypeVerticalAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroid.g:355:2: ( ( rule__ConstraintTypeVertical__Group_1__0 ) )
                    {
                    // InternalAndroid.g:355:2: ( ( rule__ConstraintTypeVertical__Group_1__0 ) )
                    // InternalAndroid.g:356:3: ( rule__ConstraintTypeVertical__Group_1__0 )
                    {
                     before(grammarAccess.getConstraintTypeVerticalAccess().getGroup_1()); 
                    // InternalAndroid.g:357:3: ( rule__ConstraintTypeVertical__Group_1__0 )
                    // InternalAndroid.g:357:4: rule__ConstraintTypeVertical__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintTypeVertical__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintTypeVerticalAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAndroid.g:361:2: ( ( rule__ConstraintTypeVertical__Group_2__0 ) )
                    {
                    // InternalAndroid.g:361:2: ( ( rule__ConstraintTypeVertical__Group_2__0 ) )
                    // InternalAndroid.g:362:3: ( rule__ConstraintTypeVertical__Group_2__0 )
                    {
                     before(grammarAccess.getConstraintTypeVerticalAccess().getGroup_2()); 
                    // InternalAndroid.g:363:3: ( rule__ConstraintTypeVertical__Group_2__0 )
                    // InternalAndroid.g:363:4: rule__ConstraintTypeVertical__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintTypeVertical__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintTypeVerticalAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAndroid.g:367:2: ( ( rule__ConstraintTypeVertical__Group_3__0 ) )
                    {
                    // InternalAndroid.g:367:2: ( ( rule__ConstraintTypeVertical__Group_3__0 ) )
                    // InternalAndroid.g:368:3: ( rule__ConstraintTypeVertical__Group_3__0 )
                    {
                     before(grammarAccess.getConstraintTypeVerticalAccess().getGroup_3()); 
                    // InternalAndroid.g:369:3: ( rule__ConstraintTypeVertical__Group_3__0 )
                    // InternalAndroid.g:369:4: rule__ConstraintTypeVertical__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintTypeVertical__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintTypeVerticalAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintTypeVertical__Alternatives"


    // $ANTLR start "rule__ConstraintParameter__Alternatives"
    // InternalAndroid.g:377:1: rule__ConstraintParameter__Alternatives : ( ( ( rule__ConstraintParameter__Group_0__0 ) ) | ( ( rule__ConstraintParameter__Group_1__0 ) ) | ( ( rule__ConstraintParameter__Group_2__0 ) ) | ( ( rule__ConstraintParameter__Group_3__0 ) ) | ( ( rule__ConstraintParameter__Group_4__0 ) ) | ( ( rule__ConstraintParameter__Group_5__0 ) ) );
    public final void rule__ConstraintParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:381:1: ( ( ( rule__ConstraintParameter__Group_0__0 ) ) | ( ( rule__ConstraintParameter__Group_1__0 ) ) | ( ( rule__ConstraintParameter__Group_2__0 ) ) | ( ( rule__ConstraintParameter__Group_3__0 ) ) | ( ( rule__ConstraintParameter__Group_4__0 ) ) | ( ( rule__ConstraintParameter__Group_5__0 ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 28:
                {
                alt4=2;
                }
                break;
            case 29:
                {
                alt4=3;
                }
                break;
            case 30:
                {
                alt4=4;
                }
                break;
            case 31:
                {
                alt4=5;
                }
                break;
            case 32:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAndroid.g:382:2: ( ( rule__ConstraintParameter__Group_0__0 ) )
                    {
                    // InternalAndroid.g:382:2: ( ( rule__ConstraintParameter__Group_0__0 ) )
                    // InternalAndroid.g:383:3: ( rule__ConstraintParameter__Group_0__0 )
                    {
                     before(grammarAccess.getConstraintParameterAccess().getGroup_0()); 
                    // InternalAndroid.g:384:3: ( rule__ConstraintParameter__Group_0__0 )
                    // InternalAndroid.g:384:4: rule__ConstraintParameter__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintParameter__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintParameterAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroid.g:388:2: ( ( rule__ConstraintParameter__Group_1__0 ) )
                    {
                    // InternalAndroid.g:388:2: ( ( rule__ConstraintParameter__Group_1__0 ) )
                    // InternalAndroid.g:389:3: ( rule__ConstraintParameter__Group_1__0 )
                    {
                     before(grammarAccess.getConstraintParameterAccess().getGroup_1()); 
                    // InternalAndroid.g:390:3: ( rule__ConstraintParameter__Group_1__0 )
                    // InternalAndroid.g:390:4: rule__ConstraintParameter__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintParameter__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintParameterAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAndroid.g:394:2: ( ( rule__ConstraintParameter__Group_2__0 ) )
                    {
                    // InternalAndroid.g:394:2: ( ( rule__ConstraintParameter__Group_2__0 ) )
                    // InternalAndroid.g:395:3: ( rule__ConstraintParameter__Group_2__0 )
                    {
                     before(grammarAccess.getConstraintParameterAccess().getGroup_2()); 
                    // InternalAndroid.g:396:3: ( rule__ConstraintParameter__Group_2__0 )
                    // InternalAndroid.g:396:4: rule__ConstraintParameter__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintParameter__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintParameterAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAndroid.g:400:2: ( ( rule__ConstraintParameter__Group_3__0 ) )
                    {
                    // InternalAndroid.g:400:2: ( ( rule__ConstraintParameter__Group_3__0 ) )
                    // InternalAndroid.g:401:3: ( rule__ConstraintParameter__Group_3__0 )
                    {
                     before(grammarAccess.getConstraintParameterAccess().getGroup_3()); 
                    // InternalAndroid.g:402:3: ( rule__ConstraintParameter__Group_3__0 )
                    // InternalAndroid.g:402:4: rule__ConstraintParameter__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintParameter__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintParameterAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAndroid.g:406:2: ( ( rule__ConstraintParameter__Group_4__0 ) )
                    {
                    // InternalAndroid.g:406:2: ( ( rule__ConstraintParameter__Group_4__0 ) )
                    // InternalAndroid.g:407:3: ( rule__ConstraintParameter__Group_4__0 )
                    {
                     before(grammarAccess.getConstraintParameterAccess().getGroup_4()); 
                    // InternalAndroid.g:408:3: ( rule__ConstraintParameter__Group_4__0 )
                    // InternalAndroid.g:408:4: rule__ConstraintParameter__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintParameter__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintParameterAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAndroid.g:412:2: ( ( rule__ConstraintParameter__Group_5__0 ) )
                    {
                    // InternalAndroid.g:412:2: ( ( rule__ConstraintParameter__Group_5__0 ) )
                    // InternalAndroid.g:413:3: ( rule__ConstraintParameter__Group_5__0 )
                    {
                     before(grammarAccess.getConstraintParameterAccess().getGroup_5()); 
                    // InternalAndroid.g:414:3: ( rule__ConstraintParameter__Group_5__0 )
                    // InternalAndroid.g:414:4: rule__ConstraintParameter__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintParameter__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintParameterAccess().getGroup_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Alternatives"


    // $ANTLR start "rule__Application__Group__0"
    // InternalAndroid.g:422:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:426:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalAndroid.g:427:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Application__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0"


    // $ANTLR start "rule__Application__Group__0__Impl"
    // InternalAndroid.g:434:1: rule__Application__Group__0__Impl : ( 'Application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:438:1: ( ( 'Application' ) )
            // InternalAndroid.g:439:1: ( 'Application' )
            {
            // InternalAndroid.g:439:1: ( 'Application' )
            // InternalAndroid.g:440:2: 'Application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0__Impl"


    // $ANTLR start "rule__Application__Group__1"
    // InternalAndroid.g:449:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:453:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalAndroid.g:454:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Application__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1"


    // $ANTLR start "rule__Application__Group__1__Impl"
    // InternalAndroid.g:461:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:465:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // InternalAndroid.g:466:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // InternalAndroid.g:466:1: ( ( rule__Application__NameAssignment_1 ) )
            // InternalAndroid.g:467:2: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // InternalAndroid.g:468:2: ( rule__Application__NameAssignment_1 )
            // InternalAndroid.g:468:3: rule__Application__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1__Impl"


    // $ANTLR start "rule__Application__Group__2"
    // InternalAndroid.g:476:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:480:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalAndroid.g:481:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Application__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2"


    // $ANTLR start "rule__Application__Group__2__Impl"
    // InternalAndroid.g:488:1: rule__Application__Group__2__Impl : ( '{' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:492:1: ( ( '{' ) )
            // InternalAndroid.g:493:1: ( '{' )
            {
            // InternalAndroid.g:493:1: ( '{' )
            // InternalAndroid.g:494:2: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2__Impl"


    // $ANTLR start "rule__Application__Group__3"
    // InternalAndroid.g:503:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:507:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalAndroid.g:508:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Application__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__3"


    // $ANTLR start "rule__Application__Group__3__Impl"
    // InternalAndroid.g:515:1: rule__Application__Group__3__Impl : ( ( rule__Application__PanesAssignment_3 )* ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:519:1: ( ( ( rule__Application__PanesAssignment_3 )* ) )
            // InternalAndroid.g:520:1: ( ( rule__Application__PanesAssignment_3 )* )
            {
            // InternalAndroid.g:520:1: ( ( rule__Application__PanesAssignment_3 )* )
            // InternalAndroid.g:521:2: ( rule__Application__PanesAssignment_3 )*
            {
             before(grammarAccess.getApplicationAccess().getPanesAssignment_3()); 
            // InternalAndroid.g:522:2: ( rule__Application__PanesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAndroid.g:522:3: rule__Application__PanesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Application__PanesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getPanesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__3__Impl"


    // $ANTLR start "rule__Application__Group__4"
    // InternalAndroid.g:530:1: rule__Application__Group__4 : rule__Application__Group__4__Impl ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:534:1: ( rule__Application__Group__4__Impl )
            // InternalAndroid.g:535:2: rule__Application__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__4"


    // $ANTLR start "rule__Application__Group__4__Impl"
    // InternalAndroid.g:541:1: rule__Application__Group__4__Impl : ( '}' ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:545:1: ( ( '}' ) )
            // InternalAndroid.g:546:1: ( '}' )
            {
            // InternalAndroid.g:546:1: ( '}' )
            // InternalAndroid.g:547:2: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__4__Impl"


    // $ANTLR start "rule__Pane__Group__0"
    // InternalAndroid.g:557:1: rule__Pane__Group__0 : rule__Pane__Group__0__Impl rule__Pane__Group__1 ;
    public final void rule__Pane__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:561:1: ( rule__Pane__Group__0__Impl rule__Pane__Group__1 )
            // InternalAndroid.g:562:2: rule__Pane__Group__0__Impl rule__Pane__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Pane__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pane__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pane__Group__0"


    // $ANTLR start "rule__Pane__Group__0__Impl"
    // InternalAndroid.g:569:1: rule__Pane__Group__0__Impl : ( () ) ;
    public final void rule__Pane__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:573:1: ( ( () ) )
            // InternalAndroid.g:574:1: ( () )
            {
            // InternalAndroid.g:574:1: ( () )
            // InternalAndroid.g:575:2: ()
            {
             before(grammarAccess.getPaneAccess().getPaneAction_0()); 
            // InternalAndroid.g:576:2: ()
            // InternalAndroid.g:576:3: 
            {
            }

             after(grammarAccess.getPaneAccess().getPaneAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pane__Group__0__Impl"


    // $ANTLR start "rule__Pane__Group__1"
    // InternalAndroid.g:584:1: rule__Pane__Group__1 : rule__Pane__Group__1__Impl rule__Pane__Group__2 ;
    public final void rule__Pane__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:588:1: ( rule__Pane__Group__1__Impl rule__Pane__Group__2 )
            // InternalAndroid.g:589:2: rule__Pane__Group__1__Impl rule__Pane__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Pane__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pane__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pane__Group__1"


    // $ANTLR start "rule__Pane__Group__1__Impl"
    // InternalAndroid.g:596:1: rule__Pane__Group__1__Impl : ( 'Pane' ) ;
    public final void rule__Pane__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:600:1: ( ( 'Pane' ) )
            // InternalAndroid.g:601:1: ( 'Pane' )
            {
            // InternalAndroid.g:601:1: ( 'Pane' )
            // InternalAndroid.g:602:2: 'Pane'
            {
             before(grammarAccess.getPaneAccess().getPaneKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPaneAccess().getPaneKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pane__Group__1__Impl"


    // $ANTLR start "rule__Pane__Group__2"
    // InternalAndroid.g:611:1: rule__Pane__Group__2 : rule__Pane__Group__2__Impl rule__Pane__Group__3 ;
    public final void rule__Pane__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:615:1: ( rule__Pane__Group__2__Impl rule__Pane__Group__3 )
            // InternalAndroid.g:616:2: rule__Pane__Group__2__Impl rule__Pane__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Pane__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pane__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pane__Group__2"


    // $ANTLR start "rule__Pane__Group__2__Impl"
    // InternalAndroid.g:623:1: rule__Pane__Group__2__Impl : ( '{' ) ;
    public final void rule__Pane__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:627:1: ( ( '{' ) )
            // InternalAndroid.g:628:1: ( '{' )
            {
            // InternalAndroid.g:628:1: ( '{' )
            // InternalAndroid.g:629:2: '{'
            {
             before(grammarAccess.getPaneAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPaneAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pane__Group__2__Impl"


    // $ANTLR start "rule__Pane__Group__3"
    // InternalAndroid.g:638:1: rule__Pane__Group__3 : rule__Pane__Group__3__Impl rule__Pane__Group__4 ;
    public final void rule__Pane__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:642:1: ( rule__Pane__Group__3__Impl rule__Pane__Group__4 )
            // InternalAndroid.g:643:2: rule__Pane__Group__3__Impl rule__Pane__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Pane__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pane__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pane__Group__3"


    // $ANTLR start "rule__Pane__Group__3__Impl"
    // InternalAndroid.g:650:1: rule__Pane__Group__3__Impl : ( ( rule__Pane__FramesAssignment_3 )* ) ;
    public final void rule__Pane__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:654:1: ( ( ( rule__Pane__FramesAssignment_3 )* ) )
            // InternalAndroid.g:655:1: ( ( rule__Pane__FramesAssignment_3 )* )
            {
            // InternalAndroid.g:655:1: ( ( rule__Pane__FramesAssignment_3 )* )
            // InternalAndroid.g:656:2: ( rule__Pane__FramesAssignment_3 )*
            {
             before(grammarAccess.getPaneAccess().getFramesAssignment_3()); 
            // InternalAndroid.g:657:2: ( rule__Pane__FramesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAndroid.g:657:3: rule__Pane__FramesAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Pane__FramesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPaneAccess().getFramesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pane__Group__3__Impl"


    // $ANTLR start "rule__Pane__Group__4"
    // InternalAndroid.g:665:1: rule__Pane__Group__4 : rule__Pane__Group__4__Impl ;
    public final void rule__Pane__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:669:1: ( rule__Pane__Group__4__Impl )
            // InternalAndroid.g:670:2: rule__Pane__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pane__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pane__Group__4"


    // $ANTLR start "rule__Pane__Group__4__Impl"
    // InternalAndroid.g:676:1: rule__Pane__Group__4__Impl : ( '}' ) ;
    public final void rule__Pane__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:680:1: ( ( '}' ) )
            // InternalAndroid.g:681:1: ( '}' )
            {
            // InternalAndroid.g:681:1: ( '}' )
            // InternalAndroid.g:682:2: '}'
            {
             before(grammarAccess.getPaneAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPaneAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pane__Group__4__Impl"


    // $ANTLR start "rule__Frame__Group__0"
    // InternalAndroid.g:692:1: rule__Frame__Group__0 : rule__Frame__Group__0__Impl rule__Frame__Group__1 ;
    public final void rule__Frame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:696:1: ( rule__Frame__Group__0__Impl rule__Frame__Group__1 )
            // InternalAndroid.g:697:2: rule__Frame__Group__0__Impl rule__Frame__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Frame__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__0"


    // $ANTLR start "rule__Frame__Group__0__Impl"
    // InternalAndroid.g:704:1: rule__Frame__Group__0__Impl : ( () ) ;
    public final void rule__Frame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:708:1: ( ( () ) )
            // InternalAndroid.g:709:1: ( () )
            {
            // InternalAndroid.g:709:1: ( () )
            // InternalAndroid.g:710:2: ()
            {
             before(grammarAccess.getFrameAccess().getFrameAction_0()); 
            // InternalAndroid.g:711:2: ()
            // InternalAndroid.g:711:3: 
            {
            }

             after(grammarAccess.getFrameAccess().getFrameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__0__Impl"


    // $ANTLR start "rule__Frame__Group__1"
    // InternalAndroid.g:719:1: rule__Frame__Group__1 : rule__Frame__Group__1__Impl rule__Frame__Group__2 ;
    public final void rule__Frame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:723:1: ( rule__Frame__Group__1__Impl rule__Frame__Group__2 )
            // InternalAndroid.g:724:2: rule__Frame__Group__1__Impl rule__Frame__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Frame__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__1"


    // $ANTLR start "rule__Frame__Group__1__Impl"
    // InternalAndroid.g:731:1: rule__Frame__Group__1__Impl : ( 'Frame' ) ;
    public final void rule__Frame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:735:1: ( ( 'Frame' ) )
            // InternalAndroid.g:736:1: ( 'Frame' )
            {
            // InternalAndroid.g:736:1: ( 'Frame' )
            // InternalAndroid.g:737:2: 'Frame'
            {
             before(grammarAccess.getFrameAccess().getFrameKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getFrameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__1__Impl"


    // $ANTLR start "rule__Frame__Group__2"
    // InternalAndroid.g:746:1: rule__Frame__Group__2 : rule__Frame__Group__2__Impl rule__Frame__Group__3 ;
    public final void rule__Frame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:750:1: ( rule__Frame__Group__2__Impl rule__Frame__Group__3 )
            // InternalAndroid.g:751:2: rule__Frame__Group__2__Impl rule__Frame__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Frame__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__2"


    // $ANTLR start "rule__Frame__Group__2__Impl"
    // InternalAndroid.g:758:1: rule__Frame__Group__2__Impl : ( ( rule__Frame__NameAssignment_2 )? ) ;
    public final void rule__Frame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:762:1: ( ( ( rule__Frame__NameAssignment_2 )? ) )
            // InternalAndroid.g:763:1: ( ( rule__Frame__NameAssignment_2 )? )
            {
            // InternalAndroid.g:763:1: ( ( rule__Frame__NameAssignment_2 )? )
            // InternalAndroid.g:764:2: ( rule__Frame__NameAssignment_2 )?
            {
             before(grammarAccess.getFrameAccess().getNameAssignment_2()); 
            // InternalAndroid.g:765:2: ( rule__Frame__NameAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAndroid.g:765:3: rule__Frame__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Frame__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFrameAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__2__Impl"


    // $ANTLR start "rule__Frame__Group__3"
    // InternalAndroid.g:773:1: rule__Frame__Group__3 : rule__Frame__Group__3__Impl rule__Frame__Group__4 ;
    public final void rule__Frame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:777:1: ( rule__Frame__Group__3__Impl rule__Frame__Group__4 )
            // InternalAndroid.g:778:2: rule__Frame__Group__3__Impl rule__Frame__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Frame__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__3"


    // $ANTLR start "rule__Frame__Group__3__Impl"
    // InternalAndroid.g:785:1: rule__Frame__Group__3__Impl : ( '{' ) ;
    public final void rule__Frame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:789:1: ( ( '{' ) )
            // InternalAndroid.g:790:1: ( '{' )
            {
            // InternalAndroid.g:790:1: ( '{' )
            // InternalAndroid.g:791:2: '{'
            {
             before(grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__3__Impl"


    // $ANTLR start "rule__Frame__Group__4"
    // InternalAndroid.g:800:1: rule__Frame__Group__4 : rule__Frame__Group__4__Impl rule__Frame__Group__5 ;
    public final void rule__Frame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:804:1: ( rule__Frame__Group__4__Impl rule__Frame__Group__5 )
            // InternalAndroid.g:805:2: rule__Frame__Group__4__Impl rule__Frame__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Frame__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__4"


    // $ANTLR start "rule__Frame__Group__4__Impl"
    // InternalAndroid.g:812:1: rule__Frame__Group__4__Impl : ( ( rule__Frame__ElementsAssignment_4 )* ) ;
    public final void rule__Frame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:816:1: ( ( ( rule__Frame__ElementsAssignment_4 )* ) )
            // InternalAndroid.g:817:1: ( ( rule__Frame__ElementsAssignment_4 )* )
            {
            // InternalAndroid.g:817:1: ( ( rule__Frame__ElementsAssignment_4 )* )
            // InternalAndroid.g:818:2: ( rule__Frame__ElementsAssignment_4 )*
            {
             before(grammarAccess.getFrameAccess().getElementsAssignment_4()); 
            // InternalAndroid.g:819:2: ( rule__Frame__ElementsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16||LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAndroid.g:819:3: rule__Frame__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Frame__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getFrameAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__4__Impl"


    // $ANTLR start "rule__Frame__Group__5"
    // InternalAndroid.g:827:1: rule__Frame__Group__5 : rule__Frame__Group__5__Impl rule__Frame__Group__6 ;
    public final void rule__Frame__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:831:1: ( rule__Frame__Group__5__Impl rule__Frame__Group__6 )
            // InternalAndroid.g:832:2: rule__Frame__Group__5__Impl rule__Frame__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Frame__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__5"


    // $ANTLR start "rule__Frame__Group__5__Impl"
    // InternalAndroid.g:839:1: rule__Frame__Group__5__Impl : ( ( rule__Frame__ConstraintAssignment_5 )? ) ;
    public final void rule__Frame__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:843:1: ( ( ( rule__Frame__ConstraintAssignment_5 )? ) )
            // InternalAndroid.g:844:1: ( ( rule__Frame__ConstraintAssignment_5 )? )
            {
            // InternalAndroid.g:844:1: ( ( rule__Frame__ConstraintAssignment_5 )? )
            // InternalAndroid.g:845:2: ( rule__Frame__ConstraintAssignment_5 )?
            {
             before(grammarAccess.getFrameAccess().getConstraintAssignment_5()); 
            // InternalAndroid.g:846:2: ( rule__Frame__ConstraintAssignment_5 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAndroid.g:846:3: rule__Frame__ConstraintAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Frame__ConstraintAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFrameAccess().getConstraintAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__5__Impl"


    // $ANTLR start "rule__Frame__Group__6"
    // InternalAndroid.g:854:1: rule__Frame__Group__6 : rule__Frame__Group__6__Impl ;
    public final void rule__Frame__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:858:1: ( rule__Frame__Group__6__Impl )
            // InternalAndroid.g:859:2: rule__Frame__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Frame__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__6"


    // $ANTLR start "rule__Frame__Group__6__Impl"
    // InternalAndroid.g:865:1: rule__Frame__Group__6__Impl : ( '}' ) ;
    public final void rule__Frame__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:869:1: ( ( '}' ) )
            // InternalAndroid.g:870:1: ( '}' )
            {
            // InternalAndroid.g:870:1: ( '}' )
            // InternalAndroid.g:871:2: '}'
            {
             before(grammarAccess.getFrameAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__Group__6__Impl"


    // $ANTLR start "rule__Text__Group__0"
    // InternalAndroid.g:881:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:885:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalAndroid.g:886:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Text__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0"


    // $ANTLR start "rule__Text__Group__0__Impl"
    // InternalAndroid.g:893:1: rule__Text__Group__0__Impl : ( 'Text' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:897:1: ( ( 'Text' ) )
            // InternalAndroid.g:898:1: ( 'Text' )
            {
            // InternalAndroid.g:898:1: ( 'Text' )
            // InternalAndroid.g:899:2: 'Text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0__Impl"


    // $ANTLR start "rule__Text__Group__1"
    // InternalAndroid.g:908:1: rule__Text__Group__1 : rule__Text__Group__1__Impl rule__Text__Group__2 ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:912:1: ( rule__Text__Group__1__Impl rule__Text__Group__2 )
            // InternalAndroid.g:913:2: rule__Text__Group__1__Impl rule__Text__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Text__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1"


    // $ANTLR start "rule__Text__Group__1__Impl"
    // InternalAndroid.g:920:1: rule__Text__Group__1__Impl : ( '(' ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:924:1: ( ( '(' ) )
            // InternalAndroid.g:925:1: ( '(' )
            {
            // InternalAndroid.g:925:1: ( '(' )
            // InternalAndroid.g:926:2: '('
            {
             before(grammarAccess.getTextAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1__Impl"


    // $ANTLR start "rule__Text__Group__2"
    // InternalAndroid.g:935:1: rule__Text__Group__2 : rule__Text__Group__2__Impl rule__Text__Group__3 ;
    public final void rule__Text__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:939:1: ( rule__Text__Group__2__Impl rule__Text__Group__3 )
            // InternalAndroid.g:940:2: rule__Text__Group__2__Impl rule__Text__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Text__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__2"


    // $ANTLR start "rule__Text__Group__2__Impl"
    // InternalAndroid.g:947:1: rule__Text__Group__2__Impl : ( ( rule__Text__TextAssignment_2 ) ) ;
    public final void rule__Text__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:951:1: ( ( ( rule__Text__TextAssignment_2 ) ) )
            // InternalAndroid.g:952:1: ( ( rule__Text__TextAssignment_2 ) )
            {
            // InternalAndroid.g:952:1: ( ( rule__Text__TextAssignment_2 ) )
            // InternalAndroid.g:953:2: ( rule__Text__TextAssignment_2 )
            {
             before(grammarAccess.getTextAccess().getTextAssignment_2()); 
            // InternalAndroid.g:954:2: ( rule__Text__TextAssignment_2 )
            // InternalAndroid.g:954:3: rule__Text__TextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Text__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__2__Impl"


    // $ANTLR start "rule__Text__Group__3"
    // InternalAndroid.g:962:1: rule__Text__Group__3 : rule__Text__Group__3__Impl ;
    public final void rule__Text__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:966:1: ( rule__Text__Group__3__Impl )
            // InternalAndroid.g:967:2: rule__Text__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__3"


    // $ANTLR start "rule__Text__Group__3__Impl"
    // InternalAndroid.g:973:1: rule__Text__Group__3__Impl : ( ')' ) ;
    public final void rule__Text__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:977:1: ( ( ')' ) )
            // InternalAndroid.g:978:1: ( ')' )
            {
            // InternalAndroid.g:978:1: ( ')' )
            // InternalAndroid.g:979:2: ')'
            {
             before(grammarAccess.getTextAccess().getRightParenthesisKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__3__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // InternalAndroid.g:989:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:993:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalAndroid.g:994:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // InternalAndroid.g:1001:1: rule__Button__Group__0__Impl : ( 'Button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1005:1: ( ( 'Button' ) )
            // InternalAndroid.g:1006:1: ( 'Button' )
            {
            // InternalAndroid.g:1006:1: ( 'Button' )
            // InternalAndroid.g:1007:2: 'Button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // InternalAndroid.g:1016:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1020:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalAndroid.g:1021:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // InternalAndroid.g:1028:1: rule__Button__Group__1__Impl : ( '(' ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1032:1: ( ( '(' ) )
            // InternalAndroid.g:1033:1: ( '(' )
            {
            // InternalAndroid.g:1033:1: ( '(' )
            // InternalAndroid.g:1034:2: '('
            {
             before(grammarAccess.getButtonAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__2"
    // InternalAndroid.g:1043:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1047:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalAndroid.g:1048:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Button__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__2"


    // $ANTLR start "rule__Button__Group__2__Impl"
    // InternalAndroid.g:1055:1: rule__Button__Group__2__Impl : ( ( rule__Button__TextAssignment_2 ) ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1059:1: ( ( ( rule__Button__TextAssignment_2 ) ) )
            // InternalAndroid.g:1060:1: ( ( rule__Button__TextAssignment_2 ) )
            {
            // InternalAndroid.g:1060:1: ( ( rule__Button__TextAssignment_2 ) )
            // InternalAndroid.g:1061:2: ( rule__Button__TextAssignment_2 )
            {
             before(grammarAccess.getButtonAccess().getTextAssignment_2()); 
            // InternalAndroid.g:1062:2: ( rule__Button__TextAssignment_2 )
            // InternalAndroid.g:1062:3: rule__Button__TextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Button__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__2__Impl"


    // $ANTLR start "rule__Button__Group__3"
    // InternalAndroid.g:1070:1: rule__Button__Group__3 : rule__Button__Group__3__Impl ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1074:1: ( rule__Button__Group__3__Impl )
            // InternalAndroid.g:1075:2: rule__Button__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__3"


    // $ANTLR start "rule__Button__Group__3__Impl"
    // InternalAndroid.g:1081:1: rule__Button__Group__3__Impl : ( ')' ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1085:1: ( ( ')' ) )
            // InternalAndroid.g:1086:1: ( ')' )
            {
            // InternalAndroid.g:1086:1: ( ')' )
            // InternalAndroid.g:1087:2: ')'
            {
             before(grammarAccess.getButtonAccess().getRightParenthesisKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group_0__0"
    // InternalAndroid.g:1097:1: rule__Constraint__Group_0__0 : rule__Constraint__Group_0__0__Impl rule__Constraint__Group_0__1 ;
    public final void rule__Constraint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1101:1: ( rule__Constraint__Group_0__0__Impl rule__Constraint__Group_0__1 )
            // InternalAndroid.g:1102:2: rule__Constraint__Group_0__0__Impl rule__Constraint__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Constraint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_0__0"


    // $ANTLR start "rule__Constraint__Group_0__0__Impl"
    // InternalAndroid.g:1109:1: rule__Constraint__Group_0__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1113:1: ( ( 'constraint' ) )
            // InternalAndroid.g:1114:1: ( 'constraint' )
            {
            // InternalAndroid.g:1114:1: ( 'constraint' )
            // InternalAndroid.g:1115:2: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getConstraintKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_0__0__Impl"


    // $ANTLR start "rule__Constraint__Group_0__1"
    // InternalAndroid.g:1124:1: rule__Constraint__Group_0__1 : rule__Constraint__Group_0__1__Impl ;
    public final void rule__Constraint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1128:1: ( rule__Constraint__Group_0__1__Impl )
            // InternalAndroid.g:1129:2: rule__Constraint__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_0__1"


    // $ANTLR start "rule__Constraint__Group_0__1__Impl"
    // InternalAndroid.g:1135:1: rule__Constraint__Group_0__1__Impl : ( ( rule__Constraint__Group_0_1__0 ) ) ;
    public final void rule__Constraint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1139:1: ( ( ( rule__Constraint__Group_0_1__0 ) ) )
            // InternalAndroid.g:1140:1: ( ( rule__Constraint__Group_0_1__0 ) )
            {
            // InternalAndroid.g:1140:1: ( ( rule__Constraint__Group_0_1__0 ) )
            // InternalAndroid.g:1141:2: ( rule__Constraint__Group_0_1__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup_0_1()); 
            // InternalAndroid.g:1142:2: ( rule__Constraint__Group_0_1__0 )
            // InternalAndroid.g:1142:3: rule__Constraint__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_0__1__Impl"


    // $ANTLR start "rule__Constraint__Group_0_1__0"
    // InternalAndroid.g:1151:1: rule__Constraint__Group_0_1__0 : rule__Constraint__Group_0_1__0__Impl rule__Constraint__Group_0_1__1 ;
    public final void rule__Constraint__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1155:1: ( rule__Constraint__Group_0_1__0__Impl rule__Constraint__Group_0_1__1 )
            // InternalAndroid.g:1156:2: rule__Constraint__Group_0_1__0__Impl rule__Constraint__Group_0_1__1
            {
            pushFollow(FOLLOW_18);
            rule__Constraint__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_0_1__0"


    // $ANTLR start "rule__Constraint__Group_0_1__0__Impl"
    // InternalAndroid.g:1163:1: rule__Constraint__Group_0_1__0__Impl : ( ':' ) ;
    public final void rule__Constraint__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1167:1: ( ( ':' ) )
            // InternalAndroid.g:1168:1: ( ':' )
            {
            // InternalAndroid.g:1168:1: ( ':' )
            // InternalAndroid.g:1169:2: ':'
            {
             before(grammarAccess.getConstraintAccess().getColonKeyword_0_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getColonKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_0_1__0__Impl"


    // $ANTLR start "rule__Constraint__Group_0_1__1"
    // InternalAndroid.g:1178:1: rule__Constraint__Group_0_1__1 : rule__Constraint__Group_0_1__1__Impl rule__Constraint__Group_0_1__2 ;
    public final void rule__Constraint__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1182:1: ( rule__Constraint__Group_0_1__1__Impl rule__Constraint__Group_0_1__2 )
            // InternalAndroid.g:1183:2: rule__Constraint__Group_0_1__1__Impl rule__Constraint__Group_0_1__2
            {
            pushFollow(FOLLOW_19);
            rule__Constraint__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_0_1__1"


    // $ANTLR start "rule__Constraint__Group_0_1__1__Impl"
    // InternalAndroid.g:1190:1: rule__Constraint__Group_0_1__1__Impl : ( ( rule__Constraint__ConstraintTypeAssignment_0_1_1 ) ) ;
    public final void rule__Constraint__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1194:1: ( ( ( rule__Constraint__ConstraintTypeAssignment_0_1_1 ) ) )
            // InternalAndroid.g:1195:1: ( ( rule__Constraint__ConstraintTypeAssignment_0_1_1 ) )
            {
            // InternalAndroid.g:1195:1: ( ( rule__Constraint__ConstraintTypeAssignment_0_1_1 ) )
            // InternalAndroid.g:1196:2: ( rule__Constraint__ConstraintTypeAssignment_0_1_1 )
            {
             before(grammarAccess.getConstraintAccess().getConstraintTypeAssignment_0_1_1()); 
            // InternalAndroid.g:1197:2: ( rule__Constraint__ConstraintTypeAssignment_0_1_1 )
            // InternalAndroid.g:1197:3: rule__Constraint__ConstraintTypeAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ConstraintTypeAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getConstraintTypeAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_0_1__1__Impl"


    // $ANTLR start "rule__Constraint__Group_0_1__2"
    // InternalAndroid.g:1205:1: rule__Constraint__Group_0_1__2 : rule__Constraint__Group_0_1__2__Impl rule__Constraint__Group_0_1__3 ;
    public final void rule__Constraint__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1209:1: ( rule__Constraint__Group_0_1__2__Impl rule__Constraint__Group_0_1__3 )
            // InternalAndroid.g:1210:2: rule__Constraint__Group_0_1__2__Impl rule__Constraint__Group_0_1__3
            {
            pushFollow(FOLLOW_3);
            rule__Constraint__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_0_1__2"


    // $ANTLR start "rule__Constraint__Group_0_1__2__Impl"
    // InternalAndroid.g:1217:1: rule__Constraint__Group_0_1__2__Impl : ( '=' ) ;
    public final void rule__Constraint__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1221:1: ( ( '=' ) )
            // InternalAndroid.g:1222:1: ( '=' )
            {
            // InternalAndroid.g:1222:1: ( '=' )
            // InternalAndroid.g:1223:2: '='
            {
             before(grammarAccess.getConstraintAccess().getEqualsSignKeyword_0_1_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getEqualsSignKeyword_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_0_1__2__Impl"


    // $ANTLR start "rule__Constraint__Group_0_1__3"
    // InternalAndroid.g:1232:1: rule__Constraint__Group_0_1__3 : rule__Constraint__Group_0_1__3__Impl ;
    public final void rule__Constraint__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1236:1: ( rule__Constraint__Group_0_1__3__Impl )
            // InternalAndroid.g:1237:2: rule__Constraint__Group_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_0_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_0_1__3"


    // $ANTLR start "rule__Constraint__Group_0_1__3__Impl"
    // InternalAndroid.g:1243:1: rule__Constraint__Group_0_1__3__Impl : ( ( rule__Constraint__FrameAssignment_0_1_3 ) ) ;
    public final void rule__Constraint__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1247:1: ( ( ( rule__Constraint__FrameAssignment_0_1_3 ) ) )
            // InternalAndroid.g:1248:1: ( ( rule__Constraint__FrameAssignment_0_1_3 ) )
            {
            // InternalAndroid.g:1248:1: ( ( rule__Constraint__FrameAssignment_0_1_3 ) )
            // InternalAndroid.g:1249:2: ( rule__Constraint__FrameAssignment_0_1_3 )
            {
             before(grammarAccess.getConstraintAccess().getFrameAssignment_0_1_3()); 
            // InternalAndroid.g:1250:2: ( rule__Constraint__FrameAssignment_0_1_3 )
            // InternalAndroid.g:1250:3: rule__Constraint__FrameAssignment_0_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__FrameAssignment_0_1_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getFrameAssignment_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_0_1__3__Impl"


    // $ANTLR start "rule__Constraint__Group_1__0"
    // InternalAndroid.g:1259:1: rule__Constraint__Group_1__0 : rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1 ;
    public final void rule__Constraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1263:1: ( rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1 )
            // InternalAndroid.g:1264:2: rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Constraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_1__0"


    // $ANTLR start "rule__Constraint__Group_1__0__Impl"
    // InternalAndroid.g:1271:1: rule__Constraint__Group_1__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1275:1: ( ( 'constraint' ) )
            // InternalAndroid.g:1276:1: ( 'constraint' )
            {
            // InternalAndroid.g:1276:1: ( 'constraint' )
            // InternalAndroid.g:1277:2: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getConstraintKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_1__0__Impl"


    // $ANTLR start "rule__Constraint__Group_1__1"
    // InternalAndroid.g:1286:1: rule__Constraint__Group_1__1 : rule__Constraint__Group_1__1__Impl rule__Constraint__Group_1__2 ;
    public final void rule__Constraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1290:1: ( rule__Constraint__Group_1__1__Impl rule__Constraint__Group_1__2 )
            // InternalAndroid.g:1291:2: rule__Constraint__Group_1__1__Impl rule__Constraint__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Constraint__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_1__1"


    // $ANTLR start "rule__Constraint__Group_1__1__Impl"
    // InternalAndroid.g:1298:1: rule__Constraint__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Constraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1302:1: ( ( '=' ) )
            // InternalAndroid.g:1303:1: ( '=' )
            {
            // InternalAndroid.g:1303:1: ( '=' )
            // InternalAndroid.g:1304:2: '='
            {
             before(grammarAccess.getConstraintAccess().getEqualsSignKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_1__1__Impl"


    // $ANTLR start "rule__Constraint__Group_1__2"
    // InternalAndroid.g:1313:1: rule__Constraint__Group_1__2 : rule__Constraint__Group_1__2__Impl ;
    public final void rule__Constraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1317:1: ( rule__Constraint__Group_1__2__Impl )
            // InternalAndroid.g:1318:2: rule__Constraint__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_1__2"


    // $ANTLR start "rule__Constraint__Group_1__2__Impl"
    // InternalAndroid.g:1324:1: rule__Constraint__Group_1__2__Impl : ( ( rule__Constraint__ParamAssignment_1_2 ) ) ;
    public final void rule__Constraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1328:1: ( ( ( rule__Constraint__ParamAssignment_1_2 ) ) )
            // InternalAndroid.g:1329:1: ( ( rule__Constraint__ParamAssignment_1_2 ) )
            {
            // InternalAndroid.g:1329:1: ( ( rule__Constraint__ParamAssignment_1_2 ) )
            // InternalAndroid.g:1330:2: ( rule__Constraint__ParamAssignment_1_2 )
            {
             before(grammarAccess.getConstraintAccess().getParamAssignment_1_2()); 
            // InternalAndroid.g:1331:2: ( rule__Constraint__ParamAssignment_1_2 )
            // InternalAndroid.g:1331:3: rule__Constraint__ParamAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ParamAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getParamAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_1__2__Impl"


    // $ANTLR start "rule__ConstraintTypeVertical__Group_0__0"
    // InternalAndroid.g:1340:1: rule__ConstraintTypeVertical__Group_0__0 : rule__ConstraintTypeVertical__Group_0__0__Impl rule__ConstraintTypeVertical__Group_0__1 ;
    public final void rule__ConstraintTypeVertical__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1344:1: ( rule__ConstraintTypeVertical__Group_0__0__Impl rule__ConstraintTypeVertical__Group_0__1 )
            // InternalAndroid.g:1345:2: rule__ConstraintTypeVertical__Group_0__0__Impl rule__ConstraintTypeVertical__Group_0__1
            {
            pushFollow(FOLLOW_21);
            rule__ConstraintTypeVertical__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintTypeVertical__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintTypeVertical__Group_0__0"


    // $ANTLR start "rule__ConstraintTypeVertical__Group_0__0__Impl"
    // InternalAndroid.g:1352:1: rule__ConstraintTypeVertical__Group_0__0__Impl : ( () ) ;
    public final void rule__ConstraintTypeVertical__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1356:1: ( ( () ) )
            // InternalAndroid.g:1357:1: ( () )
            {
            // InternalAndroid.g:1357:1: ( () )
            // InternalAndroid.g:1358:2: ()
            {
             before(grammarAccess.getConstraintTypeVerticalAccess().getRightOfAction_0_0()); 
            // InternalAndroid.g:1359:2: ()
            // InternalAndroid.g:1359:3: 
            {
            }

             after(grammarAccess.getConstraintTypeVerticalAccess().getRightOfAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintTypeVertical__Group_0__0__Impl"


    // $ANTLR start "rule__ConstraintTypeVertical__Group_0__1"
    // InternalAndroid.g:1367:1: rule__ConstraintTypeVertical__Group_0__1 : rule__ConstraintTypeVertical__Group_0__1__Impl ;
    public final void rule__ConstraintTypeVertical__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1371:1: ( rule__ConstraintTypeVertical__Group_0__1__Impl )
            // InternalAndroid.g:1372:2: rule__ConstraintTypeVertical__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintTypeVertical__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintTypeVertical__Group_0__1"


    // $ANTLR start "rule__ConstraintTypeVertical__Group_0__1__Impl"
    // InternalAndroid.g:1378:1: rule__ConstraintTypeVertical__Group_0__1__Impl : ( 'rightOf' ) ;
    public final void rule__ConstraintTypeVertical__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1382:1: ( ( 'rightOf' ) )
            // InternalAndroid.g:1383:1: ( 'rightOf' )
            {
            // InternalAndroid.g:1383:1: ( 'rightOf' )
            // InternalAndroid.g:1384:2: 'rightOf'
            {
             before(grammarAccess.getConstraintTypeVerticalAccess().getRightOfKeyword_0_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConstraintTypeVerticalAccess().getRightOfKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintTypeVertical__Group_0__1__Impl"


    // $ANTLR start "rule__ConstraintTypeVertical__Group_1__0"
    // InternalAndroid.g:1394:1: rule__ConstraintTypeVertical__Group_1__0 : rule__ConstraintTypeVertical__Group_1__0__Impl rule__ConstraintTypeVertical__Group_1__1 ;
    public final void rule__ConstraintTypeVertical__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1398:1: ( rule__ConstraintTypeVertical__Group_1__0__Impl rule__ConstraintTypeVertical__Group_1__1 )
            // InternalAndroid.g:1399:2: rule__ConstraintTypeVertical__Group_1__0__Impl rule__ConstraintTypeVertical__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__ConstraintTypeVertical__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintTypeVertical__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintTypeVertical__Group_1__0"


    // $ANTLR start "rule__ConstraintTypeVertical__Group_1__0__Impl"
    // InternalAndroid.g:1406:1: rule__ConstraintTypeVertical__Group_1__0__Impl : ( () ) ;
    public final void rule__ConstraintTypeVertical__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1410:1: ( ( () ) )
            // InternalAndroid.g:1411:1: ( () )
            {
            // InternalAndroid.g:1411:1: ( () )
            // InternalAndroid.g:1412:2: ()
            {
             before(grammarAccess.getConstraintTypeVerticalAccess().getLeftOfAction_1_0()); 
            // InternalAndroid.g:1413:2: ()
            // InternalAndroid.g:1413:3: 
            {
            }

             after(grammarAccess.getConstraintTypeVerticalAccess().getLeftOfAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintTypeVertical__Group_1__0__Impl"


    // $ANTLR start "rule__ConstraintTypeVertical__Group_1__1"
    // InternalAndroid.g:1421:1: rule__ConstraintTypeVertical__Group_1__1 : rule__ConstraintTypeVertical__Group_1__1__Impl ;
    public final void rule__ConstraintTypeVertical__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1425:1: ( rule__ConstraintTypeVertical__Group_1__1__Impl )
            // InternalAndroid.g:1426:2: rule__ConstraintTypeVertical__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintTypeVertical__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintTypeVertical__Group_1__1"


    // $ANTLR start "rule__ConstraintTypeVertical__Group_1__1__Impl"
    // InternalAndroid.g:1432:1: rule__ConstraintTypeVertical__Group_1__1__Impl : ( 'leftOf' ) ;
    public final void rule__ConstraintTypeVertical__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1436:1: ( ( 'leftOf' ) )
            // InternalAndroid.g:1437:1: ( 'leftOf' )
            {
            // InternalAndroid.g:1437:1: ( 'leftOf' )
            // InternalAndroid.g:1438:2: 'leftOf'
            {
             before(grammarAccess.getConstraintTypeVerticalAccess().getLeftOfKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConstraintTypeVerticalAccess().getLeftOfKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintTypeVertical__Group_1__1__Impl"


    // $ANTLR start "rule__ConstraintTypeVertical__Group_2__0"
    // InternalAndroid.g:1448:1: rule__ConstraintTypeVertical__Group_2__0 : rule__ConstraintTypeVertical__Group_2__0__Impl rule__ConstraintTypeVertical__Group_2__1 ;
    public final void rule__ConstraintTypeVertical__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1452:1: ( rule__ConstraintTypeVertical__Group_2__0__Impl rule__ConstraintTypeVertical__Group_2__1 )
            // InternalAndroid.g:1453:2: rule__ConstraintTypeVertical__Group_2__0__Impl rule__ConstraintTypeVertical__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__ConstraintTypeVertical__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintTypeVertical__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintTypeVertical__Group_2__0"


    // $ANTLR start "rule__ConstraintTypeVertical__Group_2__0__Impl"
    // InternalAndroid.g:1460:1: rule__ConstraintTypeVertical__Group_2__0__Impl : ( () ) ;
    public final void rule__ConstraintTypeVertical__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1464:1: ( ( () ) )
            // InternalAndroid.g:1465:1: ( () )
            {
            // InternalAndroid.g:1465:1: ( () )
            // InternalAndroid.g:1466:2: ()
            {
             before(grammarAccess.getConstraintTypeVerticalAccess().getBottomOfAction_2_0()); 
            // InternalAndroid.g:1467:2: ()
            // InternalAndroid.g:1467:3: 
            {
            }

             after(grammarAccess.getConstraintTypeVerticalAccess().getBottomOfAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintTypeVertical__Group_2__0__Impl"


    // $ANTLR start "rule__ConstraintTypeVertical__Group_2__1"
    // InternalAndroid.g:1475:1: rule__ConstraintTypeVertical__Group_2__1 : rule__ConstraintTypeVertical__Group_2__1__Impl ;
    public final void rule__ConstraintTypeVertical__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1479:1: ( rule__ConstraintTypeVertical__Group_2__1__Impl )
            // InternalAndroid.g:1480:2: rule__ConstraintTypeVertical__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintTypeVertical__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintTypeVertical__Group_2__1"


    // $ANTLR start "rule__ConstraintTypeVertical__Group_2__1__Impl"
    // InternalAndroid.g:1486:1: rule__ConstraintTypeVertical__Group_2__1__Impl : ( 'bottomOf' ) ;
    public final void rule__ConstraintTypeVertical__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1490:1: ( ( 'bottomOf' ) )
            // InternalAndroid.g:1491:1: ( 'bottomOf' )
            {
            // InternalAndroid.g:1491:1: ( 'bottomOf' )
            // InternalAndroid.g:1492:2: 'bottomOf'
            {
             before(grammarAccess.getConstraintTypeVerticalAccess().getBottomOfKeyword_2_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConstraintTypeVerticalAccess().getBottomOfKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintTypeVertical__Group_2__1__Impl"


    // $ANTLR start "rule__ConstraintTypeVertical__Group_3__0"
    // InternalAndroid.g:1502:1: rule__ConstraintTypeVertical__Group_3__0 : rule__ConstraintTypeVertical__Group_3__0__Impl rule__ConstraintTypeVertical__Group_3__1 ;
    public final void rule__ConstraintTypeVertical__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1506:1: ( rule__ConstraintTypeVertical__Group_3__0__Impl rule__ConstraintTypeVertical__Group_3__1 )
            // InternalAndroid.g:1507:2: rule__ConstraintTypeVertical__Group_3__0__Impl rule__ConstraintTypeVertical__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__ConstraintTypeVertical__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintTypeVertical__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintTypeVertical__Group_3__0"


    // $ANTLR start "rule__ConstraintTypeVertical__Group_3__0__Impl"
    // InternalAndroid.g:1514:1: rule__ConstraintTypeVertical__Group_3__0__Impl : ( () ) ;
    public final void rule__ConstraintTypeVertical__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1518:1: ( ( () ) )
            // InternalAndroid.g:1519:1: ( () )
            {
            // InternalAndroid.g:1519:1: ( () )
            // InternalAndroid.g:1520:2: ()
            {
             before(grammarAccess.getConstraintTypeVerticalAccess().getTopOfAction_3_0()); 
            // InternalAndroid.g:1521:2: ()
            // InternalAndroid.g:1521:3: 
            {
            }

             after(grammarAccess.getConstraintTypeVerticalAccess().getTopOfAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintTypeVertical__Group_3__0__Impl"


    // $ANTLR start "rule__ConstraintTypeVertical__Group_3__1"
    // InternalAndroid.g:1529:1: rule__ConstraintTypeVertical__Group_3__1 : rule__ConstraintTypeVertical__Group_3__1__Impl ;
    public final void rule__ConstraintTypeVertical__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1533:1: ( rule__ConstraintTypeVertical__Group_3__1__Impl )
            // InternalAndroid.g:1534:2: rule__ConstraintTypeVertical__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintTypeVertical__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintTypeVertical__Group_3__1"


    // $ANTLR start "rule__ConstraintTypeVertical__Group_3__1__Impl"
    // InternalAndroid.g:1540:1: rule__ConstraintTypeVertical__Group_3__1__Impl : ( 'topOf' ) ;
    public final void rule__ConstraintTypeVertical__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1544:1: ( ( 'topOf' ) )
            // InternalAndroid.g:1545:1: ( 'topOf' )
            {
            // InternalAndroid.g:1545:1: ( 'topOf' )
            // InternalAndroid.g:1546:2: 'topOf'
            {
             before(grammarAccess.getConstraintTypeVerticalAccess().getTopOfKeyword_3_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConstraintTypeVerticalAccess().getTopOfKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintTypeVertical__Group_3__1__Impl"


    // $ANTLR start "rule__ConstraintParameter__Group_0__0"
    // InternalAndroid.g:1556:1: rule__ConstraintParameter__Group_0__0 : rule__ConstraintParameter__Group_0__0__Impl rule__ConstraintParameter__Group_0__1 ;
    public final void rule__ConstraintParameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1560:1: ( rule__ConstraintParameter__Group_0__0__Impl rule__ConstraintParameter__Group_0__1 )
            // InternalAndroid.g:1561:2: rule__ConstraintParameter__Group_0__0__Impl rule__ConstraintParameter__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__ConstraintParameter__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParameter__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_0__0"


    // $ANTLR start "rule__ConstraintParameter__Group_0__0__Impl"
    // InternalAndroid.g:1568:1: rule__ConstraintParameter__Group_0__0__Impl : ( () ) ;
    public final void rule__ConstraintParameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1572:1: ( ( () ) )
            // InternalAndroid.g:1573:1: ( () )
            {
            // InternalAndroid.g:1573:1: ( () )
            // InternalAndroid.g:1574:2: ()
            {
             before(grammarAccess.getConstraintParameterAccess().getPersentageAction_0_0()); 
            // InternalAndroid.g:1575:2: ()
            // InternalAndroid.g:1575:3: 
            {
            }

             after(grammarAccess.getConstraintParameterAccess().getPersentageAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_0__0__Impl"


    // $ANTLR start "rule__ConstraintParameter__Group_0__1"
    // InternalAndroid.g:1583:1: rule__ConstraintParameter__Group_0__1 : rule__ConstraintParameter__Group_0__1__Impl rule__ConstraintParameter__Group_0__2 ;
    public final void rule__ConstraintParameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1587:1: ( rule__ConstraintParameter__Group_0__1__Impl rule__ConstraintParameter__Group_0__2 )
            // InternalAndroid.g:1588:2: rule__ConstraintParameter__Group_0__1__Impl rule__ConstraintParameter__Group_0__2
            {
            pushFollow(FOLLOW_24);
            rule__ConstraintParameter__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParameter__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_0__1"


    // $ANTLR start "rule__ConstraintParameter__Group_0__1__Impl"
    // InternalAndroid.g:1595:1: rule__ConstraintParameter__Group_0__1__Impl : ( ( rule__ConstraintParameter__ValueAssignment_0_1 ) ) ;
    public final void rule__ConstraintParameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1599:1: ( ( ( rule__ConstraintParameter__ValueAssignment_0_1 ) ) )
            // InternalAndroid.g:1600:1: ( ( rule__ConstraintParameter__ValueAssignment_0_1 ) )
            {
            // InternalAndroid.g:1600:1: ( ( rule__ConstraintParameter__ValueAssignment_0_1 ) )
            // InternalAndroid.g:1601:2: ( rule__ConstraintParameter__ValueAssignment_0_1 )
            {
             before(grammarAccess.getConstraintParameterAccess().getValueAssignment_0_1()); 
            // InternalAndroid.g:1602:2: ( rule__ConstraintParameter__ValueAssignment_0_1 )
            // InternalAndroid.g:1602:3: rule__ConstraintParameter__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParameter__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintParameterAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_0__1__Impl"


    // $ANTLR start "rule__ConstraintParameter__Group_0__2"
    // InternalAndroid.g:1610:1: rule__ConstraintParameter__Group_0__2 : rule__ConstraintParameter__Group_0__2__Impl ;
    public final void rule__ConstraintParameter__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1614:1: ( rule__ConstraintParameter__Group_0__2__Impl )
            // InternalAndroid.g:1615:2: rule__ConstraintParameter__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParameter__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_0__2"


    // $ANTLR start "rule__ConstraintParameter__Group_0__2__Impl"
    // InternalAndroid.g:1621:1: rule__ConstraintParameter__Group_0__2__Impl : ( '%' ) ;
    public final void rule__ConstraintParameter__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1625:1: ( ( '%' ) )
            // InternalAndroid.g:1626:1: ( '%' )
            {
            // InternalAndroid.g:1626:1: ( '%' )
            // InternalAndroid.g:1627:2: '%'
            {
             before(grammarAccess.getConstraintParameterAccess().getPercentSignKeyword_0_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConstraintParameterAccess().getPercentSignKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_0__2__Impl"


    // $ANTLR start "rule__ConstraintParameter__Group_1__0"
    // InternalAndroid.g:1637:1: rule__ConstraintParameter__Group_1__0 : rule__ConstraintParameter__Group_1__0__Impl rule__ConstraintParameter__Group_1__1 ;
    public final void rule__ConstraintParameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1641:1: ( rule__ConstraintParameter__Group_1__0__Impl rule__ConstraintParameter__Group_1__1 )
            // InternalAndroid.g:1642:2: rule__ConstraintParameter__Group_1__0__Impl rule__ConstraintParameter__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__ConstraintParameter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParameter__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_1__0"


    // $ANTLR start "rule__ConstraintParameter__Group_1__0__Impl"
    // InternalAndroid.g:1649:1: rule__ConstraintParameter__Group_1__0__Impl : ( () ) ;
    public final void rule__ConstraintParameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1653:1: ( ( () ) )
            // InternalAndroid.g:1654:1: ( () )
            {
            // InternalAndroid.g:1654:1: ( () )
            // InternalAndroid.g:1655:2: ()
            {
             before(grammarAccess.getConstraintParameterAccess().getRightAction_1_0()); 
            // InternalAndroid.g:1656:2: ()
            // InternalAndroid.g:1656:3: 
            {
            }

             after(grammarAccess.getConstraintParameterAccess().getRightAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_1__0__Impl"


    // $ANTLR start "rule__ConstraintParameter__Group_1__1"
    // InternalAndroid.g:1664:1: rule__ConstraintParameter__Group_1__1 : rule__ConstraintParameter__Group_1__1__Impl ;
    public final void rule__ConstraintParameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1668:1: ( rule__ConstraintParameter__Group_1__1__Impl )
            // InternalAndroid.g:1669:2: rule__ConstraintParameter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParameter__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_1__1"


    // $ANTLR start "rule__ConstraintParameter__Group_1__1__Impl"
    // InternalAndroid.g:1675:1: rule__ConstraintParameter__Group_1__1__Impl : ( 'right' ) ;
    public final void rule__ConstraintParameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1679:1: ( ( 'right' ) )
            // InternalAndroid.g:1680:1: ( 'right' )
            {
            // InternalAndroid.g:1680:1: ( 'right' )
            // InternalAndroid.g:1681:2: 'right'
            {
             before(grammarAccess.getConstraintParameterAccess().getRightKeyword_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getConstraintParameterAccess().getRightKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_1__1__Impl"


    // $ANTLR start "rule__ConstraintParameter__Group_2__0"
    // InternalAndroid.g:1691:1: rule__ConstraintParameter__Group_2__0 : rule__ConstraintParameter__Group_2__0__Impl rule__ConstraintParameter__Group_2__1 ;
    public final void rule__ConstraintParameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1695:1: ( rule__ConstraintParameter__Group_2__0__Impl rule__ConstraintParameter__Group_2__1 )
            // InternalAndroid.g:1696:2: rule__ConstraintParameter__Group_2__0__Impl rule__ConstraintParameter__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__ConstraintParameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParameter__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_2__0"


    // $ANTLR start "rule__ConstraintParameter__Group_2__0__Impl"
    // InternalAndroid.g:1703:1: rule__ConstraintParameter__Group_2__0__Impl : ( () ) ;
    public final void rule__ConstraintParameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1707:1: ( ( () ) )
            // InternalAndroid.g:1708:1: ( () )
            {
            // InternalAndroid.g:1708:1: ( () )
            // InternalAndroid.g:1709:2: ()
            {
             before(grammarAccess.getConstraintParameterAccess().getLeftAction_2_0()); 
            // InternalAndroid.g:1710:2: ()
            // InternalAndroid.g:1710:3: 
            {
            }

             after(grammarAccess.getConstraintParameterAccess().getLeftAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_2__0__Impl"


    // $ANTLR start "rule__ConstraintParameter__Group_2__1"
    // InternalAndroid.g:1718:1: rule__ConstraintParameter__Group_2__1 : rule__ConstraintParameter__Group_2__1__Impl ;
    public final void rule__ConstraintParameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1722:1: ( rule__ConstraintParameter__Group_2__1__Impl )
            // InternalAndroid.g:1723:2: rule__ConstraintParameter__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParameter__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_2__1"


    // $ANTLR start "rule__ConstraintParameter__Group_2__1__Impl"
    // InternalAndroid.g:1729:1: rule__ConstraintParameter__Group_2__1__Impl : ( 'left' ) ;
    public final void rule__ConstraintParameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1733:1: ( ( 'left' ) )
            // InternalAndroid.g:1734:1: ( 'left' )
            {
            // InternalAndroid.g:1734:1: ( 'left' )
            // InternalAndroid.g:1735:2: 'left'
            {
             before(grammarAccess.getConstraintParameterAccess().getLeftKeyword_2_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConstraintParameterAccess().getLeftKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_2__1__Impl"


    // $ANTLR start "rule__ConstraintParameter__Group_3__0"
    // InternalAndroid.g:1745:1: rule__ConstraintParameter__Group_3__0 : rule__ConstraintParameter__Group_3__0__Impl rule__ConstraintParameter__Group_3__1 ;
    public final void rule__ConstraintParameter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1749:1: ( rule__ConstraintParameter__Group_3__0__Impl rule__ConstraintParameter__Group_3__1 )
            // InternalAndroid.g:1750:2: rule__ConstraintParameter__Group_3__0__Impl rule__ConstraintParameter__Group_3__1
            {
            pushFollow(FOLLOW_27);
            rule__ConstraintParameter__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParameter__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_3__0"


    // $ANTLR start "rule__ConstraintParameter__Group_3__0__Impl"
    // InternalAndroid.g:1757:1: rule__ConstraintParameter__Group_3__0__Impl : ( () ) ;
    public final void rule__ConstraintParameter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1761:1: ( ( () ) )
            // InternalAndroid.g:1762:1: ( () )
            {
            // InternalAndroid.g:1762:1: ( () )
            // InternalAndroid.g:1763:2: ()
            {
             before(grammarAccess.getConstraintParameterAccess().getTopAction_3_0()); 
            // InternalAndroid.g:1764:2: ()
            // InternalAndroid.g:1764:3: 
            {
            }

             after(grammarAccess.getConstraintParameterAccess().getTopAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_3__0__Impl"


    // $ANTLR start "rule__ConstraintParameter__Group_3__1"
    // InternalAndroid.g:1772:1: rule__ConstraintParameter__Group_3__1 : rule__ConstraintParameter__Group_3__1__Impl ;
    public final void rule__ConstraintParameter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1776:1: ( rule__ConstraintParameter__Group_3__1__Impl )
            // InternalAndroid.g:1777:2: rule__ConstraintParameter__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParameter__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_3__1"


    // $ANTLR start "rule__ConstraintParameter__Group_3__1__Impl"
    // InternalAndroid.g:1783:1: rule__ConstraintParameter__Group_3__1__Impl : ( 'top' ) ;
    public final void rule__ConstraintParameter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1787:1: ( ( 'top' ) )
            // InternalAndroid.g:1788:1: ( 'top' )
            {
            // InternalAndroid.g:1788:1: ( 'top' )
            // InternalAndroid.g:1789:2: 'top'
            {
             before(grammarAccess.getConstraintParameterAccess().getTopKeyword_3_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConstraintParameterAccess().getTopKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_3__1__Impl"


    // $ANTLR start "rule__ConstraintParameter__Group_4__0"
    // InternalAndroid.g:1799:1: rule__ConstraintParameter__Group_4__0 : rule__ConstraintParameter__Group_4__0__Impl rule__ConstraintParameter__Group_4__1 ;
    public final void rule__ConstraintParameter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1803:1: ( rule__ConstraintParameter__Group_4__0__Impl rule__ConstraintParameter__Group_4__1 )
            // InternalAndroid.g:1804:2: rule__ConstraintParameter__Group_4__0__Impl rule__ConstraintParameter__Group_4__1
            {
            pushFollow(FOLLOW_28);
            rule__ConstraintParameter__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParameter__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_4__0"


    // $ANTLR start "rule__ConstraintParameter__Group_4__0__Impl"
    // InternalAndroid.g:1811:1: rule__ConstraintParameter__Group_4__0__Impl : ( () ) ;
    public final void rule__ConstraintParameter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1815:1: ( ( () ) )
            // InternalAndroid.g:1816:1: ( () )
            {
            // InternalAndroid.g:1816:1: ( () )
            // InternalAndroid.g:1817:2: ()
            {
             before(grammarAccess.getConstraintParameterAccess().getBottomAction_4_0()); 
            // InternalAndroid.g:1818:2: ()
            // InternalAndroid.g:1818:3: 
            {
            }

             after(grammarAccess.getConstraintParameterAccess().getBottomAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_4__0__Impl"


    // $ANTLR start "rule__ConstraintParameter__Group_4__1"
    // InternalAndroid.g:1826:1: rule__ConstraintParameter__Group_4__1 : rule__ConstraintParameter__Group_4__1__Impl ;
    public final void rule__ConstraintParameter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1830:1: ( rule__ConstraintParameter__Group_4__1__Impl )
            // InternalAndroid.g:1831:2: rule__ConstraintParameter__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParameter__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_4__1"


    // $ANTLR start "rule__ConstraintParameter__Group_4__1__Impl"
    // InternalAndroid.g:1837:1: rule__ConstraintParameter__Group_4__1__Impl : ( 'bottom' ) ;
    public final void rule__ConstraintParameter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1841:1: ( ( 'bottom' ) )
            // InternalAndroid.g:1842:1: ( 'bottom' )
            {
            // InternalAndroid.g:1842:1: ( 'bottom' )
            // InternalAndroid.g:1843:2: 'bottom'
            {
             before(grammarAccess.getConstraintParameterAccess().getBottomKeyword_4_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getConstraintParameterAccess().getBottomKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_4__1__Impl"


    // $ANTLR start "rule__ConstraintParameter__Group_5__0"
    // InternalAndroid.g:1853:1: rule__ConstraintParameter__Group_5__0 : rule__ConstraintParameter__Group_5__0__Impl rule__ConstraintParameter__Group_5__1 ;
    public final void rule__ConstraintParameter__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1857:1: ( rule__ConstraintParameter__Group_5__0__Impl rule__ConstraintParameter__Group_5__1 )
            // InternalAndroid.g:1858:2: rule__ConstraintParameter__Group_5__0__Impl rule__ConstraintParameter__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__ConstraintParameter__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParameter__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_5__0"


    // $ANTLR start "rule__ConstraintParameter__Group_5__0__Impl"
    // InternalAndroid.g:1865:1: rule__ConstraintParameter__Group_5__0__Impl : ( () ) ;
    public final void rule__ConstraintParameter__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1869:1: ( ( () ) )
            // InternalAndroid.g:1870:1: ( () )
            {
            // InternalAndroid.g:1870:1: ( () )
            // InternalAndroid.g:1871:2: ()
            {
             before(grammarAccess.getConstraintParameterAccess().getMiddleAction_5_0()); 
            // InternalAndroid.g:1872:2: ()
            // InternalAndroid.g:1872:3: 
            {
            }

             after(grammarAccess.getConstraintParameterAccess().getMiddleAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_5__0__Impl"


    // $ANTLR start "rule__ConstraintParameter__Group_5__1"
    // InternalAndroid.g:1880:1: rule__ConstraintParameter__Group_5__1 : rule__ConstraintParameter__Group_5__1__Impl ;
    public final void rule__ConstraintParameter__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1884:1: ( rule__ConstraintParameter__Group_5__1__Impl )
            // InternalAndroid.g:1885:2: rule__ConstraintParameter__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParameter__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_5__1"


    // $ANTLR start "rule__ConstraintParameter__Group_5__1__Impl"
    // InternalAndroid.g:1891:1: rule__ConstraintParameter__Group_5__1__Impl : ( 'middle' ) ;
    public final void rule__ConstraintParameter__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1895:1: ( ( 'middle' ) )
            // InternalAndroid.g:1896:1: ( 'middle' )
            {
            // InternalAndroid.g:1896:1: ( 'middle' )
            // InternalAndroid.g:1897:2: 'middle'
            {
             before(grammarAccess.getConstraintParameterAccess().getMiddleKeyword_5_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConstraintParameterAccess().getMiddleKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__Group_5__1__Impl"


    // $ANTLR start "rule__Model__ApplicationAssignment"
    // InternalAndroid.g:1907:1: rule__Model__ApplicationAssignment : ( ruleApplication ) ;
    public final void rule__Model__ApplicationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1911:1: ( ( ruleApplication ) )
            // InternalAndroid.g:1912:2: ( ruleApplication )
            {
            // InternalAndroid.g:1912:2: ( ruleApplication )
            // InternalAndroid.g:1913:3: ruleApplication
            {
             before(grammarAccess.getModelAccess().getApplicationApplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getModelAccess().getApplicationApplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ApplicationAssignment"


    // $ANTLR start "rule__Application__NameAssignment_1"
    // InternalAndroid.g:1922:1: rule__Application__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1926:1: ( ( RULE_ID ) )
            // InternalAndroid.g:1927:2: ( RULE_ID )
            {
            // InternalAndroid.g:1927:2: ( RULE_ID )
            // InternalAndroid.g:1928:3: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__NameAssignment_1"


    // $ANTLR start "rule__Application__PanesAssignment_3"
    // InternalAndroid.g:1937:1: rule__Application__PanesAssignment_3 : ( rulePane ) ;
    public final void rule__Application__PanesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1941:1: ( ( rulePane ) )
            // InternalAndroid.g:1942:2: ( rulePane )
            {
            // InternalAndroid.g:1942:2: ( rulePane )
            // InternalAndroid.g:1943:3: rulePane
            {
             before(grammarAccess.getApplicationAccess().getPanesPaneParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePane();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getPanesPaneParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__PanesAssignment_3"


    // $ANTLR start "rule__Pane__FramesAssignment_3"
    // InternalAndroid.g:1952:1: rule__Pane__FramesAssignment_3 : ( ruleFrame ) ;
    public final void rule__Pane__FramesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1956:1: ( ( ruleFrame ) )
            // InternalAndroid.g:1957:2: ( ruleFrame )
            {
            // InternalAndroid.g:1957:2: ( ruleFrame )
            // InternalAndroid.g:1958:3: ruleFrame
            {
             before(grammarAccess.getPaneAccess().getFramesFrameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFrame();

            state._fsp--;

             after(grammarAccess.getPaneAccess().getFramesFrameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pane__FramesAssignment_3"


    // $ANTLR start "rule__Frame__NameAssignment_2"
    // InternalAndroid.g:1967:1: rule__Frame__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Frame__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1971:1: ( ( RULE_ID ) )
            // InternalAndroid.g:1972:2: ( RULE_ID )
            {
            // InternalAndroid.g:1972:2: ( RULE_ID )
            // InternalAndroid.g:1973:3: RULE_ID
            {
             before(grammarAccess.getFrameAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__NameAssignment_2"


    // $ANTLR start "rule__Frame__ElementsAssignment_4"
    // InternalAndroid.g:1982:1: rule__Frame__ElementsAssignment_4 : ( ruleElements ) ;
    public final void rule__Frame__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:1986:1: ( ( ruleElements ) )
            // InternalAndroid.g:1987:2: ( ruleElements )
            {
            // InternalAndroid.g:1987:2: ( ruleElements )
            // InternalAndroid.g:1988:3: ruleElements
            {
             before(grammarAccess.getFrameAccess().getElementsElementsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleElements();

            state._fsp--;

             after(grammarAccess.getFrameAccess().getElementsElementsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__ElementsAssignment_4"


    // $ANTLR start "rule__Frame__ConstraintAssignment_5"
    // InternalAndroid.g:1997:1: rule__Frame__ConstraintAssignment_5 : ( ruleConstraint ) ;
    public final void rule__Frame__ConstraintAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:2001:1: ( ( ruleConstraint ) )
            // InternalAndroid.g:2002:2: ( ruleConstraint )
            {
            // InternalAndroid.g:2002:2: ( ruleConstraint )
            // InternalAndroid.g:2003:3: ruleConstraint
            {
             before(grammarAccess.getFrameAccess().getConstraintConstraintParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getFrameAccess().getConstraintConstraintParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__ConstraintAssignment_5"


    // $ANTLR start "rule__Text__TextAssignment_2"
    // InternalAndroid.g:2012:1: rule__Text__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Text__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:2016:1: ( ( RULE_STRING ) )
            // InternalAndroid.g:2017:2: ( RULE_STRING )
            {
            // InternalAndroid.g:2017:2: ( RULE_STRING )
            // InternalAndroid.g:2018:3: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__TextAssignment_2"


    // $ANTLR start "rule__Button__TextAssignment_2"
    // InternalAndroid.g:2027:1: rule__Button__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Button__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:2031:1: ( ( RULE_STRING ) )
            // InternalAndroid.g:2032:2: ( RULE_STRING )
            {
            // InternalAndroid.g:2032:2: ( RULE_STRING )
            // InternalAndroid.g:2033:3: RULE_STRING
            {
             before(grammarAccess.getButtonAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getTextSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__TextAssignment_2"


    // $ANTLR start "rule__Constraint__ConstraintTypeAssignment_0_1_1"
    // InternalAndroid.g:2042:1: rule__Constraint__ConstraintTypeAssignment_0_1_1 : ( ruleConstraintTypeVertical ) ;
    public final void rule__Constraint__ConstraintTypeAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:2046:1: ( ( ruleConstraintTypeVertical ) )
            // InternalAndroid.g:2047:2: ( ruleConstraintTypeVertical )
            {
            // InternalAndroid.g:2047:2: ( ruleConstraintTypeVertical )
            // InternalAndroid.g:2048:3: ruleConstraintTypeVertical
            {
             before(grammarAccess.getConstraintAccess().getConstraintTypeConstraintTypeVerticalParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraintTypeVertical();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getConstraintTypeConstraintTypeVerticalParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ConstraintTypeAssignment_0_1_1"


    // $ANTLR start "rule__Constraint__FrameAssignment_0_1_3"
    // InternalAndroid.g:2057:1: rule__Constraint__FrameAssignment_0_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__FrameAssignment_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:2061:1: ( ( ( RULE_ID ) ) )
            // InternalAndroid.g:2062:2: ( ( RULE_ID ) )
            {
            // InternalAndroid.g:2062:2: ( ( RULE_ID ) )
            // InternalAndroid.g:2063:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getFrameFrameCrossReference_0_1_3_0()); 
            // InternalAndroid.g:2064:3: ( RULE_ID )
            // InternalAndroid.g:2065:4: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getFrameFrameIDTerminalRuleCall_0_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getFrameFrameIDTerminalRuleCall_0_1_3_0_1()); 

            }

             after(grammarAccess.getConstraintAccess().getFrameFrameCrossReference_0_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__FrameAssignment_0_1_3"


    // $ANTLR start "rule__Constraint__ParamAssignment_1_2"
    // InternalAndroid.g:2076:1: rule__Constraint__ParamAssignment_1_2 : ( ruleConstraintParameter ) ;
    public final void rule__Constraint__ParamAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:2080:1: ( ( ruleConstraintParameter ) )
            // InternalAndroid.g:2081:2: ( ruleConstraintParameter )
            {
            // InternalAndroid.g:2081:2: ( ruleConstraintParameter )
            // InternalAndroid.g:2082:3: ruleConstraintParameter
            {
             before(grammarAccess.getConstraintAccess().getParamConstraintParameterParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraintParameter();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getParamConstraintParameterParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ParamAssignment_1_2"


    // $ANTLR start "rule__ConstraintParameter__ValueAssignment_0_1"
    // InternalAndroid.g:2091:1: rule__ConstraintParameter__ValueAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__ConstraintParameter__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroid.g:2095:1: ( ( RULE_ID ) )
            // InternalAndroid.g:2096:2: ( RULE_ID )
            {
            // InternalAndroid.g:2096:2: ( RULE_ID )
            // InternalAndroid.g:2097:3: RULE_ID
            {
             before(grammarAccess.getConstraintParameterAccess().getValueIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintParameterAccess().getValueIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParameter__ValueAssignment_0_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000192000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000090002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000001F0000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});

}