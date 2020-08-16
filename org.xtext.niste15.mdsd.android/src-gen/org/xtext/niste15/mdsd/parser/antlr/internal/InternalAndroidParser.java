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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAndroidParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Application'", "'{'", "'}'", "'Pane'", "'Frame'", "'Text'", "'('", "')'", "'Button'", "'constraintsVertical'", "':'", "'='", "'constraintsHorizontal'", "'rightOf'", "'leftOf'", "'bottomOf'", "'topOf'", "'%'", "'right'", "'left'", "'middle'", "'top'", "'bottom'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
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




    // $ANTLR start "entryRuleModel"
    // InternalAndroid.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAndroid.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalAndroid.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAndroid.g:71:1: ruleModel returns [EObject current=null] : ( (lv_application_0_0= ruleApplication ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_application_0_0 = null;



        	enterRule();

        try {
            // InternalAndroid.g:77:2: ( ( (lv_application_0_0= ruleApplication ) )* )
            // InternalAndroid.g:78:2: ( (lv_application_0_0= ruleApplication ) )*
            {
            // InternalAndroid.g:78:2: ( (lv_application_0_0= ruleApplication ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAndroid.g:79:3: (lv_application_0_0= ruleApplication )
            	    {
            	    // InternalAndroid.g:79:3: (lv_application_0_0= ruleApplication )
            	    // InternalAndroid.g:80:4: lv_application_0_0= ruleApplication
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getApplicationApplicationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_application_0_0=ruleApplication();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"application",
            	    					lv_application_0_0,
            	    					"org.xtext.niste15.mdsd.Android.Application");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleApplication"
    // InternalAndroid.g:100:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalAndroid.g:100:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalAndroid.g:101:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalAndroid.g:107:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panes_3_0= rulePane ) ) otherlv_4= '}' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_panes_3_0 = null;



        	enterRule();

        try {
            // InternalAndroid.g:113:2: ( (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panes_3_0= rulePane ) ) otherlv_4= '}' ) )
            // InternalAndroid.g:114:2: (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panes_3_0= rulePane ) ) otherlv_4= '}' )
            {
            // InternalAndroid.g:114:2: (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panes_3_0= rulePane ) ) otherlv_4= '}' )
            // InternalAndroid.g:115:3: otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panes_3_0= rulePane ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
            		
            // InternalAndroid.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAndroid.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAndroid.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalAndroid.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplicationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAndroid.g:141:3: ( (lv_panes_3_0= rulePane ) )
            // InternalAndroid.g:142:4: (lv_panes_3_0= rulePane )
            {
            // InternalAndroid.g:142:4: (lv_panes_3_0= rulePane )
            // InternalAndroid.g:143:5: lv_panes_3_0= rulePane
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getPanesPaneParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_panes_3_0=rulePane();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					add(
            						current,
            						"panes",
            						lv_panes_3_0,
            						"org.xtext.niste15.mdsd.Android.Pane");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRulePane"
    // InternalAndroid.g:168:1: entryRulePane returns [EObject current=null] : iv_rulePane= rulePane EOF ;
    public final EObject entryRulePane() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePane = null;


        try {
            // InternalAndroid.g:168:45: (iv_rulePane= rulePane EOF )
            // InternalAndroid.g:169:2: iv_rulePane= rulePane EOF
            {
             newCompositeNode(grammarAccess.getPaneRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePane=rulePane();

            state._fsp--;

             current =iv_rulePane; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePane"


    // $ANTLR start "rulePane"
    // InternalAndroid.g:175:1: rulePane returns [EObject current=null] : (otherlv_0= 'Pane' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_frames_3_0= ruleFrame ) ) otherlv_4= '}' ) ;
    public final EObject rulePane() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_frames_3_0 = null;



        	enterRule();

        try {
            // InternalAndroid.g:181:2: ( (otherlv_0= 'Pane' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_frames_3_0= ruleFrame ) ) otherlv_4= '}' ) )
            // InternalAndroid.g:182:2: (otherlv_0= 'Pane' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_frames_3_0= ruleFrame ) ) otherlv_4= '}' )
            {
            // InternalAndroid.g:182:2: (otherlv_0= 'Pane' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_frames_3_0= ruleFrame ) ) otherlv_4= '}' )
            // InternalAndroid.g:183:3: otherlv_0= 'Pane' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_frames_3_0= ruleFrame ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPaneAccess().getPaneKeyword_0());
            		
            // InternalAndroid.g:187:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAndroid.g:188:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAndroid.g:188:4: (lv_name_1_0= RULE_ID )
            // InternalAndroid.g:189:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPaneAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPaneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPaneAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAndroid.g:209:3: ( (lv_frames_3_0= ruleFrame ) )
            // InternalAndroid.g:210:4: (lv_frames_3_0= ruleFrame )
            {
            // InternalAndroid.g:210:4: (lv_frames_3_0= ruleFrame )
            // InternalAndroid.g:211:5: lv_frames_3_0= ruleFrame
            {

            					newCompositeNode(grammarAccess.getPaneAccess().getFramesFrameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_frames_3_0=ruleFrame();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPaneRule());
            					}
            					add(
            						current,
            						"frames",
            						lv_frames_3_0,
            						"org.xtext.niste15.mdsd.Android.Frame");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPaneAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePane"


    // $ANTLR start "entryRuleFrame"
    // InternalAndroid.g:236:1: entryRuleFrame returns [EObject current=null] : iv_ruleFrame= ruleFrame EOF ;
    public final EObject entryRuleFrame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrame = null;


        try {
            // InternalAndroid.g:236:46: (iv_ruleFrame= ruleFrame EOF )
            // InternalAndroid.g:237:2: iv_ruleFrame= ruleFrame EOF
            {
             newCompositeNode(grammarAccess.getFrameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrame=ruleFrame();

            state._fsp--;

             current =iv_ruleFrame; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFrame"


    // $ANTLR start "ruleFrame"
    // InternalAndroid.g:243:1: ruleFrame returns [EObject current=null] : (otherlv_0= 'Frame' otherlv_1= '{' ( (lv_elements_2_0= ruleElements ) ) otherlv_3= '}' ) ;
    public final EObject ruleFrame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalAndroid.g:249:2: ( (otherlv_0= 'Frame' otherlv_1= '{' ( (lv_elements_2_0= ruleElements ) ) otherlv_3= '}' ) )
            // InternalAndroid.g:250:2: (otherlv_0= 'Frame' otherlv_1= '{' ( (lv_elements_2_0= ruleElements ) ) otherlv_3= '}' )
            {
            // InternalAndroid.g:250:2: (otherlv_0= 'Frame' otherlv_1= '{' ( (lv_elements_2_0= ruleElements ) ) otherlv_3= '}' )
            // InternalAndroid.g:251:3: otherlv_0= 'Frame' otherlv_1= '{' ( (lv_elements_2_0= ruleElements ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFrameAccess().getFrameKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAndroid.g:259:3: ( (lv_elements_2_0= ruleElements ) )
            // InternalAndroid.g:260:4: (lv_elements_2_0= ruleElements )
            {
            // InternalAndroid.g:260:4: (lv_elements_2_0= ruleElements )
            // InternalAndroid.g:261:5: lv_elements_2_0= ruleElements
            {

            					newCompositeNode(grammarAccess.getFrameAccess().getElementsElementsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_elements_2_0=ruleElements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFrameRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"org.xtext.niste15.mdsd.Android.Elements");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFrameAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrame"


    // $ANTLR start "entryRuleElements"
    // InternalAndroid.g:286:1: entryRuleElements returns [EObject current=null] : iv_ruleElements= ruleElements EOF ;
    public final EObject entryRuleElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElements = null;


        try {
            // InternalAndroid.g:286:49: (iv_ruleElements= ruleElements EOF )
            // InternalAndroid.g:287:2: iv_ruleElements= ruleElements EOF
            {
             newCompositeNode(grammarAccess.getElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElements=ruleElements();

            state._fsp--;

             current =iv_ruleElements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElements"


    // $ANTLR start "ruleElements"
    // InternalAndroid.g:293:1: ruleElements returns [EObject current=null] : (this_Button_0= ruleButton | this_Text_1= ruleText ) ;
    public final EObject ruleElements() throws RecognitionException {
        EObject current = null;

        EObject this_Button_0 = null;

        EObject this_Text_1 = null;



        	enterRule();

        try {
            // InternalAndroid.g:299:2: ( (this_Button_0= ruleButton | this_Text_1= ruleText ) )
            // InternalAndroid.g:300:2: (this_Button_0= ruleButton | this_Text_1= ruleText )
            {
            // InternalAndroid.g:300:2: (this_Button_0= ruleButton | this_Text_1= ruleText )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAndroid.g:301:3: this_Button_0= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getElementsAccess().getButtonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_0=ruleButton();

                    state._fsp--;


                    			current = this_Button_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAndroid.g:310:3: this_Text_1= ruleText
                    {

                    			newCompositeNode(grammarAccess.getElementsAccess().getTextParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_1=ruleText();

                    state._fsp--;


                    			current = this_Text_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElements"


    // $ANTLR start "entryRuleText"
    // InternalAndroid.g:322:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalAndroid.g:322:45: (iv_ruleText= ruleText EOF )
            // InternalAndroid.g:323:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalAndroid.g:329:1: ruleText returns [EObject current=null] : (otherlv_0= 'Text' otherlv_1= '(' ( (lv_text_2_0= RULE_STRING ) ) ( (lv_constraint_3_0= ruleConstraint ) ) otherlv_4= ')' ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_text_2_0=null;
        Token otherlv_4=null;
        EObject lv_constraint_3_0 = null;



        	enterRule();

        try {
            // InternalAndroid.g:335:2: ( (otherlv_0= 'Text' otherlv_1= '(' ( (lv_text_2_0= RULE_STRING ) ) ( (lv_constraint_3_0= ruleConstraint ) ) otherlv_4= ')' ) )
            // InternalAndroid.g:336:2: (otherlv_0= 'Text' otherlv_1= '(' ( (lv_text_2_0= RULE_STRING ) ) ( (lv_constraint_3_0= ruleConstraint ) ) otherlv_4= ')' )
            {
            // InternalAndroid.g:336:2: (otherlv_0= 'Text' otherlv_1= '(' ( (lv_text_2_0= RULE_STRING ) ) ( (lv_constraint_3_0= ruleConstraint ) ) otherlv_4= ')' )
            // InternalAndroid.g:337:3: otherlv_0= 'Text' otherlv_1= '(' ( (lv_text_2_0= RULE_STRING ) ) ( (lv_constraint_3_0= ruleConstraint ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTextKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getTextAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAndroid.g:345:3: ( (lv_text_2_0= RULE_STRING ) )
            // InternalAndroid.g:346:4: (lv_text_2_0= RULE_STRING )
            {
            // InternalAndroid.g:346:4: (lv_text_2_0= RULE_STRING )
            // InternalAndroid.g:347:5: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_text_2_0, grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAndroid.g:363:3: ( (lv_constraint_3_0= ruleConstraint ) )
            // InternalAndroid.g:364:4: (lv_constraint_3_0= ruleConstraint )
            {
            // InternalAndroid.g:364:4: (lv_constraint_3_0= ruleConstraint )
            // InternalAndroid.g:365:5: lv_constraint_3_0= ruleConstraint
            {

            					newCompositeNode(grammarAccess.getTextAccess().getConstraintConstraintParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_constraint_3_0=ruleConstraint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextRule());
            					}
            					set(
            						current,
            						"constraint",
            						lv_constraint_3_0,
            						"org.xtext.niste15.mdsd.Android.Constraint");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTextAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleButton"
    // InternalAndroid.g:390:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalAndroid.g:390:47: (iv_ruleButton= ruleButton EOF )
            // InternalAndroid.g:391:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalAndroid.g:397:1: ruleButton returns [EObject current=null] : (otherlv_0= 'Button' otherlv_1= '(' ( (lv_text_2_0= RULE_STRING ) ) ( (lv_constraint_3_0= ruleConstraint ) ) otherlv_4= ')' ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_text_2_0=null;
        Token otherlv_4=null;
        EObject lv_constraint_3_0 = null;



        	enterRule();

        try {
            // InternalAndroid.g:403:2: ( (otherlv_0= 'Button' otherlv_1= '(' ( (lv_text_2_0= RULE_STRING ) ) ( (lv_constraint_3_0= ruleConstraint ) ) otherlv_4= ')' ) )
            // InternalAndroid.g:404:2: (otherlv_0= 'Button' otherlv_1= '(' ( (lv_text_2_0= RULE_STRING ) ) ( (lv_constraint_3_0= ruleConstraint ) ) otherlv_4= ')' )
            {
            // InternalAndroid.g:404:2: (otherlv_0= 'Button' otherlv_1= '(' ( (lv_text_2_0= RULE_STRING ) ) ( (lv_constraint_3_0= ruleConstraint ) ) otherlv_4= ')' )
            // InternalAndroid.g:405:3: otherlv_0= 'Button' otherlv_1= '(' ( (lv_text_2_0= RULE_STRING ) ) ( (lv_constraint_3_0= ruleConstraint ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAndroid.g:413:3: ( (lv_text_2_0= RULE_STRING ) )
            // InternalAndroid.g:414:4: (lv_text_2_0= RULE_STRING )
            {
            // InternalAndroid.g:414:4: (lv_text_2_0= RULE_STRING )
            // InternalAndroid.g:415:5: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_text_2_0, grammarAccess.getButtonAccess().getTextSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAndroid.g:431:3: ( (lv_constraint_3_0= ruleConstraint ) )
            // InternalAndroid.g:432:4: (lv_constraint_3_0= ruleConstraint )
            {
            // InternalAndroid.g:432:4: (lv_constraint_3_0= ruleConstraint )
            // InternalAndroid.g:433:5: lv_constraint_3_0= ruleConstraint
            {

            					newCompositeNode(grammarAccess.getButtonAccess().getConstraintConstraintParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_constraint_3_0=ruleConstraint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonRule());
            					}
            					set(
            						current,
            						"constraint",
            						lv_constraint_3_0,
            						"org.xtext.niste15.mdsd.Android.Constraint");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getButtonAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleConstraint"
    // InternalAndroid.g:458:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalAndroid.g:458:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalAndroid.g:459:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalAndroid.g:465:1: ruleConstraint returns [EObject current=null] : ( ( () otherlv_1= 'constraintsVertical' (otherlv_2= ':' ( (lv_constraintType_3_0= ruleConstraintTypeVertical ) ) ) otherlv_4= '=' ( (lv_param_5_0= ruleConstraintParameterVertical ) ) ) | ( () otherlv_7= 'constraintsHorizontal' (otherlv_8= ':' ( (lv_constraintType_9_0= ruleConstraintTypeHorizontal ) ) ) otherlv_10= '=' ( (lv_param_11_0= ruleConstraintParameterHorizontal ) ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_constraintType_3_0 = null;

        EObject lv_param_5_0 = null;

        EObject lv_constraintType_9_0 = null;

        EObject lv_param_11_0 = null;



        	enterRule();

        try {
            // InternalAndroid.g:471:2: ( ( ( () otherlv_1= 'constraintsVertical' (otherlv_2= ':' ( (lv_constraintType_3_0= ruleConstraintTypeVertical ) ) ) otherlv_4= '=' ( (lv_param_5_0= ruleConstraintParameterVertical ) ) ) | ( () otherlv_7= 'constraintsHorizontal' (otherlv_8= ':' ( (lv_constraintType_9_0= ruleConstraintTypeHorizontal ) ) ) otherlv_10= '=' ( (lv_param_11_0= ruleConstraintParameterHorizontal ) ) ) ) )
            // InternalAndroid.g:472:2: ( ( () otherlv_1= 'constraintsVertical' (otherlv_2= ':' ( (lv_constraintType_3_0= ruleConstraintTypeVertical ) ) ) otherlv_4= '=' ( (lv_param_5_0= ruleConstraintParameterVertical ) ) ) | ( () otherlv_7= 'constraintsHorizontal' (otherlv_8= ':' ( (lv_constraintType_9_0= ruleConstraintTypeHorizontal ) ) ) otherlv_10= '=' ( (lv_param_11_0= ruleConstraintParameterHorizontal ) ) ) )
            {
            // InternalAndroid.g:472:2: ( ( () otherlv_1= 'constraintsVertical' (otherlv_2= ':' ( (lv_constraintType_3_0= ruleConstraintTypeVertical ) ) ) otherlv_4= '=' ( (lv_param_5_0= ruleConstraintParameterVertical ) ) ) | ( () otherlv_7= 'constraintsHorizontal' (otherlv_8= ':' ( (lv_constraintType_9_0= ruleConstraintTypeHorizontal ) ) ) otherlv_10= '=' ( (lv_param_11_0= ruleConstraintParameterHorizontal ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAndroid.g:473:3: ( () otherlv_1= 'constraintsVertical' (otherlv_2= ':' ( (lv_constraintType_3_0= ruleConstraintTypeVertical ) ) ) otherlv_4= '=' ( (lv_param_5_0= ruleConstraintParameterVertical ) ) )
                    {
                    // InternalAndroid.g:473:3: ( () otherlv_1= 'constraintsVertical' (otherlv_2= ':' ( (lv_constraintType_3_0= ruleConstraintTypeVertical ) ) ) otherlv_4= '=' ( (lv_param_5_0= ruleConstraintParameterVertical ) ) )
                    // InternalAndroid.g:474:4: () otherlv_1= 'constraintsVertical' (otherlv_2= ':' ( (lv_constraintType_3_0= ruleConstraintTypeVertical ) ) ) otherlv_4= '=' ( (lv_param_5_0= ruleConstraintParameterVertical ) )
                    {
                    // InternalAndroid.g:474:4: ()
                    // InternalAndroid.g:475:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintAccess().getVerticalAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getConstraintsVerticalKeyword_0_1());
                    			
                    // InternalAndroid.g:485:4: (otherlv_2= ':' ( (lv_constraintType_3_0= ruleConstraintTypeVertical ) ) )
                    // InternalAndroid.g:486:5: otherlv_2= ':' ( (lv_constraintType_3_0= ruleConstraintTypeVertical ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_15); 

                    					newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getColonKeyword_0_2_0());
                    				
                    // InternalAndroid.g:490:5: ( (lv_constraintType_3_0= ruleConstraintTypeVertical ) )
                    // InternalAndroid.g:491:6: (lv_constraintType_3_0= ruleConstraintTypeVertical )
                    {
                    // InternalAndroid.g:491:6: (lv_constraintType_3_0= ruleConstraintTypeVertical )
                    // InternalAndroid.g:492:7: lv_constraintType_3_0= ruleConstraintTypeVertical
                    {

                    							newCompositeNode(grammarAccess.getConstraintAccess().getConstraintTypeConstraintTypeVerticalParserRuleCall_0_2_1_0());
                    						
                    pushFollow(FOLLOW_16);
                    lv_constraintType_3_0=ruleConstraintTypeVertical();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConstraintRule());
                    							}
                    							set(
                    								current,
                    								"constraintType",
                    								lv_constraintType_3_0,
                    								"org.xtext.niste15.mdsd.Android.ConstraintTypeVertical");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_4=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getEqualsSignKeyword_0_3());
                    			
                    // InternalAndroid.g:514:4: ( (lv_param_5_0= ruleConstraintParameterVertical ) )
                    // InternalAndroid.g:515:5: (lv_param_5_0= ruleConstraintParameterVertical )
                    {
                    // InternalAndroid.g:515:5: (lv_param_5_0= ruleConstraintParameterVertical )
                    // InternalAndroid.g:516:6: lv_param_5_0= ruleConstraintParameterVertical
                    {

                    						newCompositeNode(grammarAccess.getConstraintAccess().getParamConstraintParameterVerticalParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_param_5_0=ruleConstraintParameterVertical();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstraintRule());
                    						}
                    						set(
                    							current,
                    							"param",
                    							lv_param_5_0,
                    							"org.xtext.niste15.mdsd.Android.ConstraintParameterVertical");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAndroid.g:535:3: ( () otherlv_7= 'constraintsHorizontal' (otherlv_8= ':' ( (lv_constraintType_9_0= ruleConstraintTypeHorizontal ) ) ) otherlv_10= '=' ( (lv_param_11_0= ruleConstraintParameterHorizontal ) ) )
                    {
                    // InternalAndroid.g:535:3: ( () otherlv_7= 'constraintsHorizontal' (otherlv_8= ':' ( (lv_constraintType_9_0= ruleConstraintTypeHorizontal ) ) ) otherlv_10= '=' ( (lv_param_11_0= ruleConstraintParameterHorizontal ) ) )
                    // InternalAndroid.g:536:4: () otherlv_7= 'constraintsHorizontal' (otherlv_8= ':' ( (lv_constraintType_9_0= ruleConstraintTypeHorizontal ) ) ) otherlv_10= '=' ( (lv_param_11_0= ruleConstraintParameterHorizontal ) )
                    {
                    // InternalAndroid.g:536:4: ()
                    // InternalAndroid.g:537:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintAccess().getHorizontalAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getConstraintsHorizontalKeyword_1_1());
                    			
                    // InternalAndroid.g:547:4: (otherlv_8= ':' ( (lv_constraintType_9_0= ruleConstraintTypeHorizontal ) ) )
                    // InternalAndroid.g:548:5: otherlv_8= ':' ( (lv_constraintType_9_0= ruleConstraintTypeHorizontal ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_18); 

                    					newLeafNode(otherlv_8, grammarAccess.getConstraintAccess().getColonKeyword_1_2_0());
                    				
                    // InternalAndroid.g:552:5: ( (lv_constraintType_9_0= ruleConstraintTypeHorizontal ) )
                    // InternalAndroid.g:553:6: (lv_constraintType_9_0= ruleConstraintTypeHorizontal )
                    {
                    // InternalAndroid.g:553:6: (lv_constraintType_9_0= ruleConstraintTypeHorizontal )
                    // InternalAndroid.g:554:7: lv_constraintType_9_0= ruleConstraintTypeHorizontal
                    {

                    							newCompositeNode(grammarAccess.getConstraintAccess().getConstraintTypeConstraintTypeHorizontalParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_16);
                    lv_constraintType_9_0=ruleConstraintTypeHorizontal();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConstraintRule());
                    							}
                    							set(
                    								current,
                    								"constraintType",
                    								lv_constraintType_9_0,
                    								"org.xtext.niste15.mdsd.Android.ConstraintTypeHorizontal");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_10=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getConstraintAccess().getEqualsSignKeyword_1_3());
                    			
                    // InternalAndroid.g:576:4: ( (lv_param_11_0= ruleConstraintParameterHorizontal ) )
                    // InternalAndroid.g:577:5: (lv_param_11_0= ruleConstraintParameterHorizontal )
                    {
                    // InternalAndroid.g:577:5: (lv_param_11_0= ruleConstraintParameterHorizontal )
                    // InternalAndroid.g:578:6: lv_param_11_0= ruleConstraintParameterHorizontal
                    {

                    						newCompositeNode(grammarAccess.getConstraintAccess().getParamConstraintParameterHorizontalParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_param_11_0=ruleConstraintParameterHorizontal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstraintRule());
                    						}
                    						set(
                    							current,
                    							"param",
                    							lv_param_11_0,
                    							"org.xtext.niste15.mdsd.Android.ConstraintParameterHorizontal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleConstraintTypeVertical"
    // InternalAndroid.g:600:1: entryRuleConstraintTypeVertical returns [EObject current=null] : iv_ruleConstraintTypeVertical= ruleConstraintTypeVertical EOF ;
    public final EObject entryRuleConstraintTypeVertical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintTypeVertical = null;


        try {
            // InternalAndroid.g:600:63: (iv_ruleConstraintTypeVertical= ruleConstraintTypeVertical EOF )
            // InternalAndroid.g:601:2: iv_ruleConstraintTypeVertical= ruleConstraintTypeVertical EOF
            {
             newCompositeNode(grammarAccess.getConstraintTypeVerticalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintTypeVertical=ruleConstraintTypeVertical();

            state._fsp--;

             current =iv_ruleConstraintTypeVertical; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintTypeVertical"


    // $ANTLR start "ruleConstraintTypeVertical"
    // InternalAndroid.g:607:1: ruleConstraintTypeVertical returns [EObject current=null] : ( ( () otherlv_1= 'rightOf' ) | ( () otherlv_3= 'leftOf' ) ) ;
    public final EObject ruleConstraintTypeVertical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAndroid.g:613:2: ( ( ( () otherlv_1= 'rightOf' ) | ( () otherlv_3= 'leftOf' ) ) )
            // InternalAndroid.g:614:2: ( ( () otherlv_1= 'rightOf' ) | ( () otherlv_3= 'leftOf' ) )
            {
            // InternalAndroid.g:614:2: ( ( () otherlv_1= 'rightOf' ) | ( () otherlv_3= 'leftOf' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAndroid.g:615:3: ( () otherlv_1= 'rightOf' )
                    {
                    // InternalAndroid.g:615:3: ( () otherlv_1= 'rightOf' )
                    // InternalAndroid.g:616:4: () otherlv_1= 'rightOf'
                    {
                    // InternalAndroid.g:616:4: ()
                    // InternalAndroid.g:617:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintTypeVerticalAccess().getRightOfAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getConstraintTypeVerticalAccess().getRightOfKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroid.g:629:3: ( () otherlv_3= 'leftOf' )
                    {
                    // InternalAndroid.g:629:3: ( () otherlv_3= 'leftOf' )
                    // InternalAndroid.g:630:4: () otherlv_3= 'leftOf'
                    {
                    // InternalAndroid.g:630:4: ()
                    // InternalAndroid.g:631:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintTypeVerticalAccess().getLeftOfAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getConstraintTypeVerticalAccess().getLeftOfKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintTypeVertical"


    // $ANTLR start "entryRuleConstraintTypeHorizontal"
    // InternalAndroid.g:646:1: entryRuleConstraintTypeHorizontal returns [EObject current=null] : iv_ruleConstraintTypeHorizontal= ruleConstraintTypeHorizontal EOF ;
    public final EObject entryRuleConstraintTypeHorizontal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintTypeHorizontal = null;


        try {
            // InternalAndroid.g:646:65: (iv_ruleConstraintTypeHorizontal= ruleConstraintTypeHorizontal EOF )
            // InternalAndroid.g:647:2: iv_ruleConstraintTypeHorizontal= ruleConstraintTypeHorizontal EOF
            {
             newCompositeNode(grammarAccess.getConstraintTypeHorizontalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintTypeHorizontal=ruleConstraintTypeHorizontal();

            state._fsp--;

             current =iv_ruleConstraintTypeHorizontal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintTypeHorizontal"


    // $ANTLR start "ruleConstraintTypeHorizontal"
    // InternalAndroid.g:653:1: ruleConstraintTypeHorizontal returns [EObject current=null] : ( ( () otherlv_1= 'bottomOf' ) | ( () otherlv_3= 'topOf' ) ) ;
    public final EObject ruleConstraintTypeHorizontal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAndroid.g:659:2: ( ( ( () otherlv_1= 'bottomOf' ) | ( () otherlv_3= 'topOf' ) ) )
            // InternalAndroid.g:660:2: ( ( () otherlv_1= 'bottomOf' ) | ( () otherlv_3= 'topOf' ) )
            {
            // InternalAndroid.g:660:2: ( ( () otherlv_1= 'bottomOf' ) | ( () otherlv_3= 'topOf' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAndroid.g:661:3: ( () otherlv_1= 'bottomOf' )
                    {
                    // InternalAndroid.g:661:3: ( () otherlv_1= 'bottomOf' )
                    // InternalAndroid.g:662:4: () otherlv_1= 'bottomOf'
                    {
                    // InternalAndroid.g:662:4: ()
                    // InternalAndroid.g:663:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintTypeHorizontalAccess().getBottomOfAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getConstraintTypeHorizontalAccess().getBottomOfKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroid.g:675:3: ( () otherlv_3= 'topOf' )
                    {
                    // InternalAndroid.g:675:3: ( () otherlv_3= 'topOf' )
                    // InternalAndroid.g:676:4: () otherlv_3= 'topOf'
                    {
                    // InternalAndroid.g:676:4: ()
                    // InternalAndroid.g:677:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintTypeHorizontalAccess().getTopOfAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getConstraintTypeHorizontalAccess().getTopOfKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintTypeHorizontal"


    // $ANTLR start "entryRuleConstraintParameterVertical"
    // InternalAndroid.g:692:1: entryRuleConstraintParameterVertical returns [EObject current=null] : iv_ruleConstraintParameterVertical= ruleConstraintParameterVertical EOF ;
    public final EObject entryRuleConstraintParameterVertical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintParameterVertical = null;


        try {
            // InternalAndroid.g:692:68: (iv_ruleConstraintParameterVertical= ruleConstraintParameterVertical EOF )
            // InternalAndroid.g:693:2: iv_ruleConstraintParameterVertical= ruleConstraintParameterVertical EOF
            {
             newCompositeNode(grammarAccess.getConstraintParameterVerticalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintParameterVertical=ruleConstraintParameterVertical();

            state._fsp--;

             current =iv_ruleConstraintParameterVertical; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintParameterVertical"


    // $ANTLR start "ruleConstraintParameterVertical"
    // InternalAndroid.g:699:1: ruleConstraintParameterVertical returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%' ) | ( () otherlv_4= 'right' ) | ( () otherlv_6= 'left' ) | ( () otherlv_8= 'middle' ) ) ;
    public final EObject ruleConstraintParameterVertical() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalAndroid.g:705:2: ( ( ( () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%' ) | ( () otherlv_4= 'right' ) | ( () otherlv_6= 'left' ) | ( () otherlv_8= 'middle' ) ) )
            // InternalAndroid.g:706:2: ( ( () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%' ) | ( () otherlv_4= 'right' ) | ( () otherlv_6= 'left' ) | ( () otherlv_8= 'middle' ) )
            {
            // InternalAndroid.g:706:2: ( ( () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%' ) | ( () otherlv_4= 'right' ) | ( () otherlv_6= 'left' ) | ( () otherlv_8= 'middle' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 30:
                {
                alt6=3;
                }
                break;
            case 31:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAndroid.g:707:3: ( () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%' )
                    {
                    // InternalAndroid.g:707:3: ( () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%' )
                    // InternalAndroid.g:708:4: () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%'
                    {
                    // InternalAndroid.g:708:4: ()
                    // InternalAndroid.g:709:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintParameterVerticalAccess().getPersentageAction_0_0(),
                    						current);
                    				

                    }

                    // InternalAndroid.g:715:4: ( (lv_value_1_0= RULE_ID ) )
                    // InternalAndroid.g:716:5: (lv_value_1_0= RULE_ID )
                    {
                    // InternalAndroid.g:716:5: (lv_value_1_0= RULE_ID )
                    // InternalAndroid.g:717:6: lv_value_1_0= RULE_ID
                    {
                    lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getConstraintParameterVerticalAccess().getValueIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintParameterVerticalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getConstraintParameterVerticalAccess().getPercentSignKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroid.g:739:3: ( () otherlv_4= 'right' )
                    {
                    // InternalAndroid.g:739:3: ( () otherlv_4= 'right' )
                    // InternalAndroid.g:740:4: () otherlv_4= 'right'
                    {
                    // InternalAndroid.g:740:4: ()
                    // InternalAndroid.g:741:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintParameterVerticalAccess().getRightAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getConstraintParameterVerticalAccess().getRightKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAndroid.g:753:3: ( () otherlv_6= 'left' )
                    {
                    // InternalAndroid.g:753:3: ( () otherlv_6= 'left' )
                    // InternalAndroid.g:754:4: () otherlv_6= 'left'
                    {
                    // InternalAndroid.g:754:4: ()
                    // InternalAndroid.g:755:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintParameterVerticalAccess().getLeftAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getConstraintParameterVerticalAccess().getLeftKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAndroid.g:767:3: ( () otherlv_8= 'middle' )
                    {
                    // InternalAndroid.g:767:3: ( () otherlv_8= 'middle' )
                    // InternalAndroid.g:768:4: () otherlv_8= 'middle'
                    {
                    // InternalAndroid.g:768:4: ()
                    // InternalAndroid.g:769:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintParameterVerticalAccess().getMiddleAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getConstraintParameterVerticalAccess().getMiddleKeyword_3_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintParameterVertical"


    // $ANTLR start "entryRuleConstraintParameterHorizontal"
    // InternalAndroid.g:784:1: entryRuleConstraintParameterHorizontal returns [EObject current=null] : iv_ruleConstraintParameterHorizontal= ruleConstraintParameterHorizontal EOF ;
    public final EObject entryRuleConstraintParameterHorizontal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintParameterHorizontal = null;


        try {
            // InternalAndroid.g:784:70: (iv_ruleConstraintParameterHorizontal= ruleConstraintParameterHorizontal EOF )
            // InternalAndroid.g:785:2: iv_ruleConstraintParameterHorizontal= ruleConstraintParameterHorizontal EOF
            {
             newCompositeNode(grammarAccess.getConstraintParameterHorizontalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintParameterHorizontal=ruleConstraintParameterHorizontal();

            state._fsp--;

             current =iv_ruleConstraintParameterHorizontal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintParameterHorizontal"


    // $ANTLR start "ruleConstraintParameterHorizontal"
    // InternalAndroid.g:791:1: ruleConstraintParameterHorizontal returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%' ) | ( () otherlv_4= 'top' ) | ( () otherlv_6= 'bottom' ) | ( () otherlv_8= 'middle' ) ) ;
    public final EObject ruleConstraintParameterHorizontal() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalAndroid.g:797:2: ( ( ( () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%' ) | ( () otherlv_4= 'top' ) | ( () otherlv_6= 'bottom' ) | ( () otherlv_8= 'middle' ) ) )
            // InternalAndroid.g:798:2: ( ( () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%' ) | ( () otherlv_4= 'top' ) | ( () otherlv_6= 'bottom' ) | ( () otherlv_8= 'middle' ) )
            {
            // InternalAndroid.g:798:2: ( ( () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%' ) | ( () otherlv_4= 'top' ) | ( () otherlv_6= 'bottom' ) | ( () otherlv_8= 'middle' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            case 31:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalAndroid.g:799:3: ( () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%' )
                    {
                    // InternalAndroid.g:799:3: ( () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%' )
                    // InternalAndroid.g:800:4: () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%'
                    {
                    // InternalAndroid.g:800:4: ()
                    // InternalAndroid.g:801:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintParameterHorizontalAccess().getPersentageAction_0_0(),
                    						current);
                    				

                    }

                    // InternalAndroid.g:807:4: ( (lv_value_1_0= RULE_ID ) )
                    // InternalAndroid.g:808:5: (lv_value_1_0= RULE_ID )
                    {
                    // InternalAndroid.g:808:5: (lv_value_1_0= RULE_ID )
                    // InternalAndroid.g:809:6: lv_value_1_0= RULE_ID
                    {
                    lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getConstraintParameterHorizontalAccess().getValueIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintParameterHorizontalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getConstraintParameterHorizontalAccess().getPercentSignKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroid.g:831:3: ( () otherlv_4= 'top' )
                    {
                    // InternalAndroid.g:831:3: ( () otherlv_4= 'top' )
                    // InternalAndroid.g:832:4: () otherlv_4= 'top'
                    {
                    // InternalAndroid.g:832:4: ()
                    // InternalAndroid.g:833:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintParameterHorizontalAccess().getTopAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getConstraintParameterHorizontalAccess().getTopKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAndroid.g:845:3: ( () otherlv_6= 'bottom' )
                    {
                    // InternalAndroid.g:845:3: ( () otherlv_6= 'bottom' )
                    // InternalAndroid.g:846:4: () otherlv_6= 'bottom'
                    {
                    // InternalAndroid.g:846:4: ()
                    // InternalAndroid.g:847:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintParameterHorizontalAccess().getBottomAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getConstraintParameterHorizontalAccess().getBottomKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAndroid.g:859:3: ( () otherlv_8= 'middle' )
                    {
                    // InternalAndroid.g:859:3: ( () otherlv_8= 'middle' )
                    // InternalAndroid.g:860:4: () otherlv_8= 'middle'
                    {
                    // InternalAndroid.g:860:4: ()
                    // InternalAndroid.g:861:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintParameterHorizontalAccess().getMiddleAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getConstraintParameterHorizontalAccess().getMiddleKeyword_3_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintParameterHorizontal"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000E0000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000380000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});

}