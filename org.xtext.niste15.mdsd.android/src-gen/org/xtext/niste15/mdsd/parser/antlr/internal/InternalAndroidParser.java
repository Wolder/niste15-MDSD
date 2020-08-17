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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Application'", "'{'", "'}'", "'Pane'", "'Frame'", "'Text'", "'('", "')'", "'Button'", "'navigate'", "'->'", "'constraint'", "':'", "'='", "'rightOf'", "'leftOf'", "'bottomOf'", "'topOf'", "'%'", "'right'", "'left'", "'top'", "'bottom'", "'middle'"
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
    public static final int T__34=34;
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
    // InternalAndroid.g:71:1: ruleModel returns [EObject current=null] : ( (lv_application_0_0= ruleApplication ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_application_0_0 = null;



        	enterRule();

        try {
            // InternalAndroid.g:77:2: ( ( (lv_application_0_0= ruleApplication ) ) )
            // InternalAndroid.g:78:2: ( (lv_application_0_0= ruleApplication ) )
            {
            // InternalAndroid.g:78:2: ( (lv_application_0_0= ruleApplication ) )
            // InternalAndroid.g:79:3: (lv_application_0_0= ruleApplication )
            {
            // InternalAndroid.g:79:3: (lv_application_0_0= ruleApplication )
            // InternalAndroid.g:80:4: lv_application_0_0= ruleApplication
            {

            				newCompositeNode(grammarAccess.getModelAccess().getApplicationApplicationParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_application_0_0=ruleApplication();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				set(
            					current,
            					"application",
            					lv_application_0_0,
            					"org.xtext.niste15.mdsd.Android.Application");
            				afterParserOrEnumRuleCall();
            			

            }


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
    // InternalAndroid.g:107:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panes_3_0= rulePane ) )* otherlv_4= '}' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_panes_3_0 = null;



        	enterRule();

        try {
            // InternalAndroid.g:113:2: ( (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panes_3_0= rulePane ) )* otherlv_4= '}' ) )
            // InternalAndroid.g:114:2: (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panes_3_0= rulePane ) )* otherlv_4= '}' )
            {
            // InternalAndroid.g:114:2: (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panes_3_0= rulePane ) )* otherlv_4= '}' )
            // InternalAndroid.g:115:3: otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_panes_3_0= rulePane ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
            		
            // InternalAndroid.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAndroid.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAndroid.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalAndroid.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAndroid.g:141:3: ( (lv_panes_3_0= rulePane ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAndroid.g:142:4: (lv_panes_3_0= rulePane )
            	    {
            	    // InternalAndroid.g:142:4: (lv_panes_3_0= rulePane )
            	    // InternalAndroid.g:143:5: lv_panes_3_0= rulePane
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationAccess().getPanesPaneParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

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
    // InternalAndroid.g:175:1: rulePane returns [EObject current=null] : ( () otherlv_1= 'Pane' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_frames_4_0= ruleFrame ) )* otherlv_5= '}' ) ;
    public final EObject rulePane() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_frames_4_0 = null;



        	enterRule();

        try {
            // InternalAndroid.g:181:2: ( ( () otherlv_1= 'Pane' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_frames_4_0= ruleFrame ) )* otherlv_5= '}' ) )
            // InternalAndroid.g:182:2: ( () otherlv_1= 'Pane' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_frames_4_0= ruleFrame ) )* otherlv_5= '}' )
            {
            // InternalAndroid.g:182:2: ( () otherlv_1= 'Pane' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_frames_4_0= ruleFrame ) )* otherlv_5= '}' )
            // InternalAndroid.g:183:3: () otherlv_1= 'Pane' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_frames_4_0= ruleFrame ) )* otherlv_5= '}'
            {
            // InternalAndroid.g:183:3: ()
            // InternalAndroid.g:184:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPaneAccess().getPaneAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPaneAccess().getPaneKeyword_1());
            		
            // InternalAndroid.g:194:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAndroid.g:195:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAndroid.g:195:4: (lv_name_2_0= RULE_ID )
            // InternalAndroid.g:196:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPaneAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPaneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPaneAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAndroid.g:216:3: ( (lv_frames_4_0= ruleFrame ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAndroid.g:217:4: (lv_frames_4_0= ruleFrame )
            	    {
            	    // InternalAndroid.g:217:4: (lv_frames_4_0= ruleFrame )
            	    // InternalAndroid.g:218:5: lv_frames_4_0= ruleFrame
            	    {

            	    					newCompositeNode(grammarAccess.getPaneAccess().getFramesFrameParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_frames_4_0=ruleFrame();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPaneRule());
            	    					}
            	    					add(
            	    						current,
            	    						"frames",
            	    						lv_frames_4_0,
            	    						"org.xtext.niste15.mdsd.Android.Frame");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPaneAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalAndroid.g:243:1: entryRuleFrame returns [EObject current=null] : iv_ruleFrame= ruleFrame EOF ;
    public final EObject entryRuleFrame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrame = null;


        try {
            // InternalAndroid.g:243:46: (iv_ruleFrame= ruleFrame EOF )
            // InternalAndroid.g:244:2: iv_ruleFrame= ruleFrame EOF
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
    // InternalAndroid.g:250:1: ruleFrame returns [EObject current=null] : ( () otherlv_1= 'Frame' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleElements ) )* ( (lv_constraint_5_0= ruleConstraint ) )? otherlv_6= '}' ) ;
    public final EObject ruleFrame() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_elements_4_0 = null;

        EObject lv_constraint_5_0 = null;



        	enterRule();

        try {
            // InternalAndroid.g:256:2: ( ( () otherlv_1= 'Frame' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleElements ) )* ( (lv_constraint_5_0= ruleConstraint ) )? otherlv_6= '}' ) )
            // InternalAndroid.g:257:2: ( () otherlv_1= 'Frame' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleElements ) )* ( (lv_constraint_5_0= ruleConstraint ) )? otherlv_6= '}' )
            {
            // InternalAndroid.g:257:2: ( () otherlv_1= 'Frame' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleElements ) )* ( (lv_constraint_5_0= ruleConstraint ) )? otherlv_6= '}' )
            // InternalAndroid.g:258:3: () otherlv_1= 'Frame' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleElements ) )* ( (lv_constraint_5_0= ruleConstraint ) )? otherlv_6= '}'
            {
            // InternalAndroid.g:258:3: ()
            // InternalAndroid.g:259:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFrameAccess().getFrameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getFrameAccess().getFrameKeyword_1());
            		
            // InternalAndroid.g:269:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAndroid.g:270:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalAndroid.g:270:4: (lv_name_2_0= RULE_ID )
                    // InternalAndroid.g:271:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getFrameAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFrameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAndroid.g:291:3: ( (lv_elements_4_0= ruleElements ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16||LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAndroid.g:292:4: (lv_elements_4_0= ruleElements )
            	    {
            	    // InternalAndroid.g:292:4: (lv_elements_4_0= ruleElements )
            	    // InternalAndroid.g:293:5: lv_elements_4_0= ruleElements
            	    {

            	    					newCompositeNode(grammarAccess.getFrameAccess().getElementsElementsParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_elements_4_0=ruleElements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFrameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"org.xtext.niste15.mdsd.Android.Elements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalAndroid.g:310:3: ( (lv_constraint_5_0= ruleConstraint ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAndroid.g:311:4: (lv_constraint_5_0= ruleConstraint )
                    {
                    // InternalAndroid.g:311:4: (lv_constraint_5_0= ruleConstraint )
                    // InternalAndroid.g:312:5: lv_constraint_5_0= ruleConstraint
                    {

                    					newCompositeNode(grammarAccess.getFrameAccess().getConstraintConstraintParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_constraint_5_0=ruleConstraint();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFrameRule());
                    					}
                    					set(
                    						current,
                    						"constraint",
                    						lv_constraint_5_0,
                    						"org.xtext.niste15.mdsd.Android.Constraint");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFrameAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalAndroid.g:337:1: entryRuleElements returns [EObject current=null] : iv_ruleElements= ruleElements EOF ;
    public final EObject entryRuleElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElements = null;


        try {
            // InternalAndroid.g:337:49: (iv_ruleElements= ruleElements EOF )
            // InternalAndroid.g:338:2: iv_ruleElements= ruleElements EOF
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
    // InternalAndroid.g:344:1: ruleElements returns [EObject current=null] : (this_Button_0= ruleButton | this_Text_1= ruleText ) ;
    public final EObject ruleElements() throws RecognitionException {
        EObject current = null;

        EObject this_Button_0 = null;

        EObject this_Text_1 = null;



        	enterRule();

        try {
            // InternalAndroid.g:350:2: ( (this_Button_0= ruleButton | this_Text_1= ruleText ) )
            // InternalAndroid.g:351:2: (this_Button_0= ruleButton | this_Text_1= ruleText )
            {
            // InternalAndroid.g:351:2: (this_Button_0= ruleButton | this_Text_1= ruleText )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAndroid.g:352:3: this_Button_0= ruleButton
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
                    // InternalAndroid.g:361:3: this_Text_1= ruleText
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
    // InternalAndroid.g:373:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalAndroid.g:373:45: (iv_ruleText= ruleText EOF )
            // InternalAndroid.g:374:2: iv_ruleText= ruleText EOF
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
    // InternalAndroid.g:380:1: ruleText returns [EObject current=null] : (otherlv_0= 'Text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_text_3_0= ruleTextContent ) ) otherlv_4= ')' ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_text_3_0 = null;



        	enterRule();

        try {
            // InternalAndroid.g:386:2: ( (otherlv_0= 'Text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_text_3_0= ruleTextContent ) ) otherlv_4= ')' ) )
            // InternalAndroid.g:387:2: (otherlv_0= 'Text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_text_3_0= ruleTextContent ) ) otherlv_4= ')' )
            {
            // InternalAndroid.g:387:2: (otherlv_0= 'Text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_text_3_0= ruleTextContent ) ) otherlv_4= ')' )
            // InternalAndroid.g:388:3: otherlv_0= 'Text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_text_3_0= ruleTextContent ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTextKeyword_0());
            		
            // InternalAndroid.g:392:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAndroid.g:393:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAndroid.g:393:4: (lv_name_1_0= RULE_ID )
            // InternalAndroid.g:394:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTextAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getTextAccess().getLeftParenthesisKeyword_2());
            		
            // InternalAndroid.g:414:3: ( (lv_text_3_0= ruleTextContent ) )
            // InternalAndroid.g:415:4: (lv_text_3_0= ruleTextContent )
            {
            // InternalAndroid.g:415:4: (lv_text_3_0= ruleTextContent )
            // InternalAndroid.g:416:5: lv_text_3_0= ruleTextContent
            {

            					newCompositeNode(grammarAccess.getTextAccess().getTextTextContentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_text_3_0=ruleTextContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_3_0,
            						"org.xtext.niste15.mdsd.Android.TextContent");
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


    // $ANTLR start "entryRuleTextContent"
    // InternalAndroid.g:441:1: entryRuleTextContent returns [EObject current=null] : iv_ruleTextContent= ruleTextContent EOF ;
    public final EObject entryRuleTextContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextContent = null;


        try {
            // InternalAndroid.g:441:52: (iv_ruleTextContent= ruleTextContent EOF )
            // InternalAndroid.g:442:2: iv_ruleTextContent= ruleTextContent EOF
            {
             newCompositeNode(grammarAccess.getTextContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextContent=ruleTextContent();

            state._fsp--;

             current =iv_ruleTextContent; 
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
    // $ANTLR end "entryRuleTextContent"


    // $ANTLR start "ruleTextContent"
    // InternalAndroid.g:448:1: ruleTextContent returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleTextContent() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalAndroid.g:454:2: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // InternalAndroid.g:455:2: ( (lv_text_0_0= RULE_STRING ) )
            {
            // InternalAndroid.g:455:2: ( (lv_text_0_0= RULE_STRING ) )
            // InternalAndroid.g:456:3: (lv_text_0_0= RULE_STRING )
            {
            // InternalAndroid.g:456:3: (lv_text_0_0= RULE_STRING )
            // InternalAndroid.g:457:4: lv_text_0_0= RULE_STRING
            {
            lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_text_0_0, grammarAccess.getTextContentAccess().getTextSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTextContentRule());
            				}
            				setWithLastConsumed(
            					current,
            					"text",
            					lv_text_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


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
    // $ANTLR end "ruleTextContent"


    // $ANTLR start "entryRuleButton"
    // InternalAndroid.g:476:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalAndroid.g:476:47: (iv_ruleButton= ruleButton EOF )
            // InternalAndroid.g:477:2: iv_ruleButton= ruleButton EOF
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
    // InternalAndroid.g:483:1: ruleButton returns [EObject current=null] : (otherlv_0= 'Button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_text_3_0= RULE_STRING ) ) (otherlv_4= 'navigate' otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= ')' ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_text_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalAndroid.g:489:2: ( (otherlv_0= 'Button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_text_3_0= RULE_STRING ) ) (otherlv_4= 'navigate' otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= ')' ) )
            // InternalAndroid.g:490:2: (otherlv_0= 'Button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_text_3_0= RULE_STRING ) ) (otherlv_4= 'navigate' otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= ')' )
            {
            // InternalAndroid.g:490:2: (otherlv_0= 'Button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_text_3_0= RULE_STRING ) ) (otherlv_4= 'navigate' otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= ')' )
            // InternalAndroid.g:491:3: otherlv_0= 'Button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_text_3_0= RULE_STRING ) ) (otherlv_4= 'navigate' otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
            		
            // InternalAndroid.g:495:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAndroid.g:496:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAndroid.g:496:4: (lv_name_1_0= RULE_ID )
            // InternalAndroid.g:497:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getLeftParenthesisKeyword_2());
            		
            // InternalAndroid.g:517:3: ( (lv_text_3_0= RULE_STRING ) )
            // InternalAndroid.g:518:4: (lv_text_3_0= RULE_STRING )
            {
            // InternalAndroid.g:518:4: (lv_text_3_0= RULE_STRING )
            // InternalAndroid.g:519:5: lv_text_3_0= RULE_STRING
            {
            lv_text_3_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_text_3_0, grammarAccess.getButtonAccess().getTextSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAndroid.g:535:3: (otherlv_4= 'navigate' otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAndroid.g:536:4: otherlv_4= 'navigate' otherlv_5= '->' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getButtonAccess().getNavigateKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getButtonAccess().getHyphenMinusGreaterThanSignKeyword_4_1());
                    			
                    // InternalAndroid.g:544:4: ( (otherlv_6= RULE_ID ) )
                    // InternalAndroid.g:545:5: (otherlv_6= RULE_ID )
                    {
                    // InternalAndroid.g:545:5: (otherlv_6= RULE_ID )
                    // InternalAndroid.g:546:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getButtonRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_6, grammarAccess.getButtonAccess().getPanePaneCrossReference_4_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getButtonAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalAndroid.g:566:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalAndroid.g:566:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalAndroid.g:567:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalAndroid.g:573:1: ruleConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' otherlv_1= ':' ( (lv_constraintType_2_0= ruleConstraintType ) ) otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'constraint' otherlv_6= '=' ( (lv_param_7_0= ruleConstraintParameter ) ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_constraintType_2_0 = null;

        EObject lv_param_7_0 = null;



        	enterRule();

        try {
            // InternalAndroid.g:579:2: ( ( (otherlv_0= 'constraint' otherlv_1= ':' ( (lv_constraintType_2_0= ruleConstraintType ) ) otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'constraint' otherlv_6= '=' ( (lv_param_7_0= ruleConstraintParameter ) ) ) ) )
            // InternalAndroid.g:580:2: ( (otherlv_0= 'constraint' otherlv_1= ':' ( (lv_constraintType_2_0= ruleConstraintType ) ) otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'constraint' otherlv_6= '=' ( (lv_param_7_0= ruleConstraintParameter ) ) ) )
            {
            // InternalAndroid.g:580:2: ( (otherlv_0= 'constraint' otherlv_1= ':' ( (lv_constraintType_2_0= ruleConstraintType ) ) otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'constraint' otherlv_6= '=' ( (lv_param_7_0= ruleConstraintParameter ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==24) ) {
                    alt8=2;
                }
                else if ( (LA8_1==23) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAndroid.g:581:3: (otherlv_0= 'constraint' otherlv_1= ':' ( (lv_constraintType_2_0= ruleConstraintType ) ) otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalAndroid.g:581:3: (otherlv_0= 'constraint' otherlv_1= ':' ( (lv_constraintType_2_0= ruleConstraintType ) ) otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )
                    // InternalAndroid.g:582:4: otherlv_0= 'constraint' otherlv_1= ':' ( (lv_constraintType_2_0= ruleConstraintType ) ) otherlv_3= '=' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getColonKeyword_0_1());
                    			
                    // InternalAndroid.g:590:4: ( (lv_constraintType_2_0= ruleConstraintType ) )
                    // InternalAndroid.g:591:5: (lv_constraintType_2_0= ruleConstraintType )
                    {
                    // InternalAndroid.g:591:5: (lv_constraintType_2_0= ruleConstraintType )
                    // InternalAndroid.g:592:6: lv_constraintType_2_0= ruleConstraintType
                    {

                    						newCompositeNode(grammarAccess.getConstraintAccess().getConstraintTypeConstraintTypeParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_constraintType_2_0=ruleConstraintType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstraintRule());
                    						}
                    						set(
                    							current,
                    							"constraintType",
                    							lv_constraintType_2_0,
                    							"org.xtext.niste15.mdsd.Android.ConstraintType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getEqualsSignKeyword_0_3());
                    			
                    // InternalAndroid.g:613:4: ( (otherlv_4= RULE_ID ) )
                    // InternalAndroid.g:614:5: (otherlv_4= RULE_ID )
                    {
                    // InternalAndroid.g:614:5: (otherlv_4= RULE_ID )
                    // InternalAndroid.g:615:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getFrameFrameCrossReference_0_4_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAndroid.g:628:3: (otherlv_5= 'constraint' otherlv_6= '=' ( (lv_param_7_0= ruleConstraintParameter ) ) )
                    {
                    // InternalAndroid.g:628:3: (otherlv_5= 'constraint' otherlv_6= '=' ( (lv_param_7_0= ruleConstraintParameter ) ) )
                    // InternalAndroid.g:629:4: otherlv_5= 'constraint' otherlv_6= '=' ( (lv_param_7_0= ruleConstraintParameter ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getConstraintKeyword_1_0());
                    			
                    otherlv_6=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getConstraintAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalAndroid.g:637:4: ( (lv_param_7_0= ruleConstraintParameter ) )
                    // InternalAndroid.g:638:5: (lv_param_7_0= ruleConstraintParameter )
                    {
                    // InternalAndroid.g:638:5: (lv_param_7_0= ruleConstraintParameter )
                    // InternalAndroid.g:639:6: lv_param_7_0= ruleConstraintParameter
                    {

                    						newCompositeNode(grammarAccess.getConstraintAccess().getParamConstraintParameterParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_param_7_0=ruleConstraintParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstraintRule());
                    						}
                    						set(
                    							current,
                    							"param",
                    							lv_param_7_0,
                    							"org.xtext.niste15.mdsd.Android.ConstraintParameter");
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


    // $ANTLR start "entryRuleConstraintType"
    // InternalAndroid.g:661:1: entryRuleConstraintType returns [EObject current=null] : iv_ruleConstraintType= ruleConstraintType EOF ;
    public final EObject entryRuleConstraintType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintType = null;


        try {
            // InternalAndroid.g:661:55: (iv_ruleConstraintType= ruleConstraintType EOF )
            // InternalAndroid.g:662:2: iv_ruleConstraintType= ruleConstraintType EOF
            {
             newCompositeNode(grammarAccess.getConstraintTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintType=ruleConstraintType();

            state._fsp--;

             current =iv_ruleConstraintType; 
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
    // $ANTLR end "entryRuleConstraintType"


    // $ANTLR start "ruleConstraintType"
    // InternalAndroid.g:668:1: ruleConstraintType returns [EObject current=null] : ( ( () otherlv_1= 'rightOf' ) | ( () otherlv_3= 'leftOf' ) | ( () otherlv_5= 'bottomOf' ) | ( () otherlv_7= 'topOf' ) ) ;
    public final EObject ruleConstraintType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalAndroid.g:674:2: ( ( ( () otherlv_1= 'rightOf' ) | ( () otherlv_3= 'leftOf' ) | ( () otherlv_5= 'bottomOf' ) | ( () otherlv_7= 'topOf' ) ) )
            // InternalAndroid.g:675:2: ( ( () otherlv_1= 'rightOf' ) | ( () otherlv_3= 'leftOf' ) | ( () otherlv_5= 'bottomOf' ) | ( () otherlv_7= 'topOf' ) )
            {
            // InternalAndroid.g:675:2: ( ( () otherlv_1= 'rightOf' ) | ( () otherlv_3= 'leftOf' ) | ( () otherlv_5= 'bottomOf' ) | ( () otherlv_7= 'topOf' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            case 28:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAndroid.g:676:3: ( () otherlv_1= 'rightOf' )
                    {
                    // InternalAndroid.g:676:3: ( () otherlv_1= 'rightOf' )
                    // InternalAndroid.g:677:4: () otherlv_1= 'rightOf'
                    {
                    // InternalAndroid.g:677:4: ()
                    // InternalAndroid.g:678:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintTypeAccess().getRightOfAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getConstraintTypeAccess().getRightOfKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroid.g:690:3: ( () otherlv_3= 'leftOf' )
                    {
                    // InternalAndroid.g:690:3: ( () otherlv_3= 'leftOf' )
                    // InternalAndroid.g:691:4: () otherlv_3= 'leftOf'
                    {
                    // InternalAndroid.g:691:4: ()
                    // InternalAndroid.g:692:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintTypeAccess().getLeftOfAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getConstraintTypeAccess().getLeftOfKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAndroid.g:704:3: ( () otherlv_5= 'bottomOf' )
                    {
                    // InternalAndroid.g:704:3: ( () otherlv_5= 'bottomOf' )
                    // InternalAndroid.g:705:4: () otherlv_5= 'bottomOf'
                    {
                    // InternalAndroid.g:705:4: ()
                    // InternalAndroid.g:706:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintTypeAccess().getBottomOfAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getConstraintTypeAccess().getBottomOfKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAndroid.g:718:3: ( () otherlv_7= 'topOf' )
                    {
                    // InternalAndroid.g:718:3: ( () otherlv_7= 'topOf' )
                    // InternalAndroid.g:719:4: () otherlv_7= 'topOf'
                    {
                    // InternalAndroid.g:719:4: ()
                    // InternalAndroid.g:720:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintTypeAccess().getTopOfAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getConstraintTypeAccess().getTopOfKeyword_3_1());
                    			

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
    // $ANTLR end "ruleConstraintType"


    // $ANTLR start "entryRuleConstraintParameter"
    // InternalAndroid.g:735:1: entryRuleConstraintParameter returns [EObject current=null] : iv_ruleConstraintParameter= ruleConstraintParameter EOF ;
    public final EObject entryRuleConstraintParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintParameter = null;


        try {
            // InternalAndroid.g:735:60: (iv_ruleConstraintParameter= ruleConstraintParameter EOF )
            // InternalAndroid.g:736:2: iv_ruleConstraintParameter= ruleConstraintParameter EOF
            {
             newCompositeNode(grammarAccess.getConstraintParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintParameter=ruleConstraintParameter();

            state._fsp--;

             current =iv_ruleConstraintParameter; 
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
    // $ANTLR end "entryRuleConstraintParameter"


    // $ANTLR start "ruleConstraintParameter"
    // InternalAndroid.g:742:1: ruleConstraintParameter returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%' ) | ( () otherlv_4= 'right' ) | ( () otherlv_6= 'left' ) | ( () otherlv_8= 'top' ) | ( () otherlv_10= 'bottom' ) | ( () otherlv_12= 'middle' ) ) ;
    public final EObject ruleConstraintParameter() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalAndroid.g:748:2: ( ( ( () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%' ) | ( () otherlv_4= 'right' ) | ( () otherlv_6= 'left' ) | ( () otherlv_8= 'top' ) | ( () otherlv_10= 'bottom' ) | ( () otherlv_12= 'middle' ) ) )
            // InternalAndroid.g:749:2: ( ( () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%' ) | ( () otherlv_4= 'right' ) | ( () otherlv_6= 'left' ) | ( () otherlv_8= 'top' ) | ( () otherlv_10= 'bottom' ) | ( () otherlv_12= 'middle' ) )
            {
            // InternalAndroid.g:749:2: ( ( () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%' ) | ( () otherlv_4= 'right' ) | ( () otherlv_6= 'left' ) | ( () otherlv_8= 'top' ) | ( () otherlv_10= 'bottom' ) | ( () otherlv_12= 'middle' ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt10=1;
                }
                break;
            case 30:
                {
                alt10=2;
                }
                break;
            case 31:
                {
                alt10=3;
                }
                break;
            case 32:
                {
                alt10=4;
                }
                break;
            case 33:
                {
                alt10=5;
                }
                break;
            case 34:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalAndroid.g:750:3: ( () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%' )
                    {
                    // InternalAndroid.g:750:3: ( () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%' )
                    // InternalAndroid.g:751:4: () ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '%'
                    {
                    // InternalAndroid.g:751:4: ()
                    // InternalAndroid.g:752:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintParameterAccess().getPersentageAction_0_0(),
                    						current);
                    				

                    }

                    // InternalAndroid.g:758:4: ( (lv_value_1_0= RULE_ID ) )
                    // InternalAndroid.g:759:5: (lv_value_1_0= RULE_ID )
                    {
                    // InternalAndroid.g:759:5: (lv_value_1_0= RULE_ID )
                    // InternalAndroid.g:760:6: lv_value_1_0= RULE_ID
                    {
                    lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getConstraintParameterAccess().getValueIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintParameterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getConstraintParameterAccess().getPercentSignKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroid.g:782:3: ( () otherlv_4= 'right' )
                    {
                    // InternalAndroid.g:782:3: ( () otherlv_4= 'right' )
                    // InternalAndroid.g:783:4: () otherlv_4= 'right'
                    {
                    // InternalAndroid.g:783:4: ()
                    // InternalAndroid.g:784:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintParameterAccess().getRightAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getConstraintParameterAccess().getRightKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAndroid.g:796:3: ( () otherlv_6= 'left' )
                    {
                    // InternalAndroid.g:796:3: ( () otherlv_6= 'left' )
                    // InternalAndroid.g:797:4: () otherlv_6= 'left'
                    {
                    // InternalAndroid.g:797:4: ()
                    // InternalAndroid.g:798:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintParameterAccess().getLeftAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getConstraintParameterAccess().getLeftKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAndroid.g:810:3: ( () otherlv_8= 'top' )
                    {
                    // InternalAndroid.g:810:3: ( () otherlv_8= 'top' )
                    // InternalAndroid.g:811:4: () otherlv_8= 'top'
                    {
                    // InternalAndroid.g:811:4: ()
                    // InternalAndroid.g:812:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintParameterAccess().getTopAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getConstraintParameterAccess().getTopKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAndroid.g:824:3: ( () otherlv_10= 'bottom' )
                    {
                    // InternalAndroid.g:824:3: ( () otherlv_10= 'bottom' )
                    // InternalAndroid.g:825:4: () otherlv_10= 'bottom'
                    {
                    // InternalAndroid.g:825:4: ()
                    // InternalAndroid.g:826:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintParameterAccess().getBottomAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getConstraintParameterAccess().getBottomKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAndroid.g:838:3: ( () otherlv_12= 'middle' )
                    {
                    // InternalAndroid.g:838:3: ( () otherlv_12= 'middle' )
                    // InternalAndroid.g:839:4: () otherlv_12= 'middle'
                    {
                    // InternalAndroid.g:839:4: ()
                    // InternalAndroid.g:840:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstraintParameterAccess().getMiddleAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_12=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getConstraintParameterAccess().getMiddleKeyword_5_1());
                    			

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
    // $ANTLR end "ruleConstraintParameter"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000492000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000007C0000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});

}