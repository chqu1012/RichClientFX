package de.dc.emf.javafx.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.dc.emf.javafx.xtext.services.JavaFXLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJavaFXLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ProjectFX'", "'{'", "'packagePath'", "'controls'", "','", "'}'", "'models'", "'ModelFX'", "'attributes'", "'TableViewFX'", "'usedModel'", "'columns'", "'TableColumnFX'", "'width'", "'-'", "'AttributeFX'", "'type'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalJavaFXLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJavaFXLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJavaFXLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJavaFXLang.g"; }



     	private JavaFXLangGrammarAccess grammarAccess;

        public InternalJavaFXLangParser(TokenStream input, JavaFXLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ProjectFX";
       	}

       	@Override
       	protected JavaFXLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProjectFX"
    // InternalJavaFXLang.g:64:1: entryRuleProjectFX returns [EObject current=null] : iv_ruleProjectFX= ruleProjectFX EOF ;
    public final EObject entryRuleProjectFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectFX = null;


        try {
            // InternalJavaFXLang.g:64:50: (iv_ruleProjectFX= ruleProjectFX EOF )
            // InternalJavaFXLang.g:65:2: iv_ruleProjectFX= ruleProjectFX EOF
            {
             newCompositeNode(grammarAccess.getProjectFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectFX=ruleProjectFX();

            state._fsp--;

             current =iv_ruleProjectFX; 
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
    // $ANTLR end "entryRuleProjectFX"


    // $ANTLR start "ruleProjectFX"
    // InternalJavaFXLang.g:71:1: ruleProjectFX returns [EObject current=null] : ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) (otherlv_9= ',' ( (lv_controls_10_0= ruleControlFX ) ) )* otherlv_11= '}' )? (otherlv_12= 'models' otherlv_13= '{' ( (lv_models_14_0= ruleModelFX ) ) (otherlv_15= ',' ( (lv_models_16_0= ruleModelFX ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleProjectFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_packagePath_5_0 = null;

        EObject lv_controls_8_0 = null;

        EObject lv_controls_10_0 = null;

        EObject lv_models_14_0 = null;

        EObject lv_models_16_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:77:2: ( ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) (otherlv_9= ',' ( (lv_controls_10_0= ruleControlFX ) ) )* otherlv_11= '}' )? (otherlv_12= 'models' otherlv_13= '{' ( (lv_models_14_0= ruleModelFX ) ) (otherlv_15= ',' ( (lv_models_16_0= ruleModelFX ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalJavaFXLang.g:78:2: ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) (otherlv_9= ',' ( (lv_controls_10_0= ruleControlFX ) ) )* otherlv_11= '}' )? (otherlv_12= 'models' otherlv_13= '{' ( (lv_models_14_0= ruleModelFX ) ) (otherlv_15= ',' ( (lv_models_16_0= ruleModelFX ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalJavaFXLang.g:78:2: ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) (otherlv_9= ',' ( (lv_controls_10_0= ruleControlFX ) ) )* otherlv_11= '}' )? (otherlv_12= 'models' otherlv_13= '{' ( (lv_models_14_0= ruleModelFX ) ) (otherlv_15= ',' ( (lv_models_16_0= ruleModelFX ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalJavaFXLang.g:79:3: () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) (otherlv_9= ',' ( (lv_controls_10_0= ruleControlFX ) ) )* otherlv_11= '}' )? (otherlv_12= 'models' otherlv_13= '{' ( (lv_models_14_0= ruleModelFX ) ) (otherlv_15= ',' ( (lv_models_16_0= ruleModelFX ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalJavaFXLang.g:79:3: ()
            // InternalJavaFXLang.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProjectFXAccess().getProjectFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectFXAccess().getProjectFXKeyword_1());
            		
            // InternalJavaFXLang.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:91:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProjectFXAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectFXRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJavaFXLang.g:113:3: (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalJavaFXLang.g:114:4: otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getProjectFXAccess().getPackagePathKeyword_4_0());
                    			
                    // InternalJavaFXLang.g:118:4: ( (lv_packagePath_5_0= ruleEString ) )
                    // InternalJavaFXLang.g:119:5: (lv_packagePath_5_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:119:5: (lv_packagePath_5_0= ruleEString )
                    // InternalJavaFXLang.g:120:6: lv_packagePath_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getProjectFXAccess().getPackagePathEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_packagePath_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    						}
                    						set(
                    							current,
                    							"packagePath",
                    							lv_packagePath_5_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:138:3: (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) (otherlv_9= ',' ( (lv_controls_10_0= ruleControlFX ) ) )* otherlv_11= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJavaFXLang.g:139:4: otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) (otherlv_9= ',' ( (lv_controls_10_0= ruleControlFX ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getProjectFXAccess().getControlsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalJavaFXLang.g:147:4: ( (lv_controls_8_0= ruleControlFX ) )
                    // InternalJavaFXLang.g:148:5: (lv_controls_8_0= ruleControlFX )
                    {
                    // InternalJavaFXLang.g:148:5: (lv_controls_8_0= ruleControlFX )
                    // InternalJavaFXLang.g:149:6: lv_controls_8_0= ruleControlFX
                    {

                    						newCompositeNode(grammarAccess.getProjectFXAccess().getControlsControlFXParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_controls_8_0=ruleControlFX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    						}
                    						add(
                    							current,
                    							"controls",
                    							lv_controls_8_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.ControlFX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:166:4: (otherlv_9= ',' ( (lv_controls_10_0= ruleControlFX ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:167:5: otherlv_9= ',' ( (lv_controls_10_0= ruleControlFX ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getProjectFXAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalJavaFXLang.g:171:5: ( (lv_controls_10_0= ruleControlFX ) )
                    	    // InternalJavaFXLang.g:172:6: (lv_controls_10_0= ruleControlFX )
                    	    {
                    	    // InternalJavaFXLang.g:172:6: (lv_controls_10_0= ruleControlFX )
                    	    // InternalJavaFXLang.g:173:7: lv_controls_10_0= ruleControlFX
                    	    {

                    	    							newCompositeNode(grammarAccess.getProjectFXAccess().getControlsControlFXParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_controls_10_0=ruleControlFX();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"controls",
                    	    								lv_controls_10_0,
                    	    								"de.dc.emf.javafx.xtext.JavaFXLang.ControlFX");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalJavaFXLang.g:196:3: (otherlv_12= 'models' otherlv_13= '{' ( (lv_models_14_0= ruleModelFX ) ) (otherlv_15= ',' ( (lv_models_16_0= ruleModelFX ) ) )* otherlv_17= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJavaFXLang.g:197:4: otherlv_12= 'models' otherlv_13= '{' ( (lv_models_14_0= ruleModelFX ) ) (otherlv_15= ',' ( (lv_models_16_0= ruleModelFX ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getProjectFXAccess().getModelsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalJavaFXLang.g:205:4: ( (lv_models_14_0= ruleModelFX ) )
                    // InternalJavaFXLang.g:206:5: (lv_models_14_0= ruleModelFX )
                    {
                    // InternalJavaFXLang.g:206:5: (lv_models_14_0= ruleModelFX )
                    // InternalJavaFXLang.g:207:6: lv_models_14_0= ruleModelFX
                    {

                    						newCompositeNode(grammarAccess.getProjectFXAccess().getModelsModelFXParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_models_14_0=ruleModelFX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    						}
                    						add(
                    							current,
                    							"models",
                    							lv_models_14_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.ModelFX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:224:4: (otherlv_15= ',' ( (lv_models_16_0= ruleModelFX ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:225:5: otherlv_15= ',' ( (lv_models_16_0= ruleModelFX ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getProjectFXAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalJavaFXLang.g:229:5: ( (lv_models_16_0= ruleModelFX ) )
                    	    // InternalJavaFXLang.g:230:6: (lv_models_16_0= ruleModelFX )
                    	    {
                    	    // InternalJavaFXLang.g:230:6: (lv_models_16_0= ruleModelFX )
                    	    // InternalJavaFXLang.g:231:7: lv_models_16_0= ruleModelFX
                    	    {

                    	    							newCompositeNode(grammarAccess.getProjectFXAccess().getModelsModelFXParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_models_16_0=ruleModelFX();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"models",
                    	    								lv_models_16_0,
                    	    								"de.dc.emf.javafx.xtext.JavaFXLang.ModelFX");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleProjectFX"


    // $ANTLR start "entryRuleControlFX"
    // InternalJavaFXLang.g:262:1: entryRuleControlFX returns [EObject current=null] : iv_ruleControlFX= ruleControlFX EOF ;
    public final EObject entryRuleControlFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlFX = null;


        try {
            // InternalJavaFXLang.g:262:50: (iv_ruleControlFX= ruleControlFX EOF )
            // InternalJavaFXLang.g:263:2: iv_ruleControlFX= ruleControlFX EOF
            {
             newCompositeNode(grammarAccess.getControlFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlFX=ruleControlFX();

            state._fsp--;

             current =iv_ruleControlFX; 
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
    // $ANTLR end "entryRuleControlFX"


    // $ANTLR start "ruleControlFX"
    // InternalJavaFXLang.g:269:1: ruleControlFX returns [EObject current=null] : this_TableViewFX_0= ruleTableViewFX ;
    public final EObject ruleControlFX() throws RecognitionException {
        EObject current = null;

        EObject this_TableViewFX_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:275:2: (this_TableViewFX_0= ruleTableViewFX )
            // InternalJavaFXLang.g:276:2: this_TableViewFX_0= ruleTableViewFX
            {

            		newCompositeNode(grammarAccess.getControlFXAccess().getTableViewFXParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_TableViewFX_0=ruleTableViewFX();

            state._fsp--;


            		current = this_TableViewFX_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleControlFX"


    // $ANTLR start "entryRuleEString"
    // InternalJavaFXLang.g:287:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJavaFXLang.g:287:47: (iv_ruleEString= ruleEString EOF )
            // InternalJavaFXLang.g:288:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalJavaFXLang.g:294:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalJavaFXLang.g:300:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalJavaFXLang.g:301:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalJavaFXLang.g:301:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalJavaFXLang.g:302:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:310:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleModelFX"
    // InternalJavaFXLang.g:321:1: entryRuleModelFX returns [EObject current=null] : iv_ruleModelFX= ruleModelFX EOF ;
    public final EObject entryRuleModelFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelFX = null;


        try {
            // InternalJavaFXLang.g:321:48: (iv_ruleModelFX= ruleModelFX EOF )
            // InternalJavaFXLang.g:322:2: iv_ruleModelFX= ruleModelFX EOF
            {
             newCompositeNode(grammarAccess.getModelFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelFX=ruleModelFX();

            state._fsp--;

             current =iv_ruleModelFX; 
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
    // $ANTLR end "entryRuleModelFX"


    // $ANTLR start "ruleModelFX"
    // InternalJavaFXLang.g:328:1: ruleModelFX returns [EObject current=null] : ( () otherlv_1= 'ModelFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttributeFX ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttributeFX ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleModelFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_attributes_6_0 = null;

        EObject lv_attributes_8_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:334:2: ( ( () otherlv_1= 'ModelFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttributeFX ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttributeFX ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalJavaFXLang.g:335:2: ( () otherlv_1= 'ModelFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttributeFX ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttributeFX ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalJavaFXLang.g:335:2: ( () otherlv_1= 'ModelFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttributeFX ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttributeFX ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalJavaFXLang.g:336:3: () otherlv_1= 'ModelFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttributeFX ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttributeFX ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalJavaFXLang.g:336:3: ()
            // InternalJavaFXLang.g:337:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelFXAccess().getModelFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModelFXAccess().getModelFXKeyword_1());
            		
            // InternalJavaFXLang.g:347:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:348:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:348:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:349:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModelFXAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelFXRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getModelFXAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJavaFXLang.g:370:3: (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttributeFX ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttributeFX ) ) )* otherlv_9= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJavaFXLang.g:371:4: otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttributeFX ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttributeFX ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelFXAccess().getAttributesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getModelFXAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalJavaFXLang.g:379:4: ( (lv_attributes_6_0= ruleAttributeFX ) )
                    // InternalJavaFXLang.g:380:5: (lv_attributes_6_0= ruleAttributeFX )
                    {
                    // InternalJavaFXLang.g:380:5: (lv_attributes_6_0= ruleAttributeFX )
                    // InternalJavaFXLang.g:381:6: lv_attributes_6_0= ruleAttributeFX
                    {

                    						newCompositeNode(grammarAccess.getModelFXAccess().getAttributesAttributeFXParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_attributes_6_0=ruleAttributeFX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelFXRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_6_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.AttributeFX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:398:4: (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttributeFX ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:399:5: otherlv_7= ',' ( (lv_attributes_8_0= ruleAttributeFX ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_13); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getModelFXAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalJavaFXLang.g:403:5: ( (lv_attributes_8_0= ruleAttributeFX ) )
                    	    // InternalJavaFXLang.g:404:6: (lv_attributes_8_0= ruleAttributeFX )
                    	    {
                    	    // InternalJavaFXLang.g:404:6: (lv_attributes_8_0= ruleAttributeFX )
                    	    // InternalJavaFXLang.g:405:7: lv_attributes_8_0= ruleAttributeFX
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelFXAccess().getAttributesAttributeFXParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_attributes_8_0=ruleAttributeFX();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelFXRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_8_0,
                    	    								"de.dc.emf.javafx.xtext.JavaFXLang.AttributeFX");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getModelFXAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getModelFXAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleModelFX"


    // $ANTLR start "entryRuleTableViewFX"
    // InternalJavaFXLang.g:436:1: entryRuleTableViewFX returns [EObject current=null] : iv_ruleTableViewFX= ruleTableViewFX EOF ;
    public final EObject entryRuleTableViewFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableViewFX = null;


        try {
            // InternalJavaFXLang.g:436:52: (iv_ruleTableViewFX= ruleTableViewFX EOF )
            // InternalJavaFXLang.g:437:2: iv_ruleTableViewFX= ruleTableViewFX EOF
            {
             newCompositeNode(grammarAccess.getTableViewFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableViewFX=ruleTableViewFX();

            state._fsp--;

             current =iv_ruleTableViewFX; 
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
    // $ANTLR end "entryRuleTableViewFX"


    // $ANTLR start "ruleTableViewFX"
    // InternalJavaFXLang.g:443:1: ruleTableViewFX returns [EObject current=null] : ( () otherlv_1= 'TableViewFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'usedModel' ( ( ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleTableColumnFX ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleTableColumnFX ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleTableViewFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_columns_8_0 = null;

        EObject lv_columns_10_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:449:2: ( ( () otherlv_1= 'TableViewFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'usedModel' ( ( ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleTableColumnFX ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleTableColumnFX ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalJavaFXLang.g:450:2: ( () otherlv_1= 'TableViewFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'usedModel' ( ( ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleTableColumnFX ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleTableColumnFX ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalJavaFXLang.g:450:2: ( () otherlv_1= 'TableViewFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'usedModel' ( ( ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleTableColumnFX ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleTableColumnFX ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalJavaFXLang.g:451:3: () otherlv_1= 'TableViewFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'usedModel' ( ( ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleTableColumnFX ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleTableColumnFX ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalJavaFXLang.g:451:3: ()
            // InternalJavaFXLang.g:452:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableViewFXAccess().getTableViewFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTableViewFXAccess().getTableViewFXKeyword_1());
            		
            // InternalJavaFXLang.g:462:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:463:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:463:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:464:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableViewFXAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableViewFXRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getTableViewFXAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJavaFXLang.g:485:3: (otherlv_4= 'usedModel' ( ( ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJavaFXLang.g:486:4: otherlv_4= 'usedModel' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTableViewFXAccess().getUsedModelKeyword_4_0());
                    			
                    // InternalJavaFXLang.g:490:4: ( ( ruleEString ) )
                    // InternalJavaFXLang.g:491:5: ( ruleEString )
                    {
                    // InternalJavaFXLang.g:491:5: ( ruleEString )
                    // InternalJavaFXLang.g:492:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTableViewFXRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTableViewFXAccess().getUsedModelModelFXCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:507:3: (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleTableColumnFX ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleTableColumnFX ) ) )* otherlv_11= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJavaFXLang.g:508:4: otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleTableColumnFX ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleTableColumnFX ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getTableViewFXAccess().getColumnsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getTableViewFXAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalJavaFXLang.g:516:4: ( (lv_columns_8_0= ruleTableColumnFX ) )
                    // InternalJavaFXLang.g:517:5: (lv_columns_8_0= ruleTableColumnFX )
                    {
                    // InternalJavaFXLang.g:517:5: (lv_columns_8_0= ruleTableColumnFX )
                    // InternalJavaFXLang.g:518:6: lv_columns_8_0= ruleTableColumnFX
                    {

                    						newCompositeNode(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_columns_8_0=ruleTableColumnFX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableViewFXRule());
                    						}
                    						add(
                    							current,
                    							"columns",
                    							lv_columns_8_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.TableColumnFX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:535:4: (otherlv_9= ',' ( (lv_columns_10_0= ruleTableColumnFX ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:536:5: otherlv_9= ',' ( (lv_columns_10_0= ruleTableColumnFX ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getTableViewFXAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalJavaFXLang.g:540:5: ( (lv_columns_10_0= ruleTableColumnFX ) )
                    	    // InternalJavaFXLang.g:541:6: (lv_columns_10_0= ruleTableColumnFX )
                    	    {
                    	    // InternalJavaFXLang.g:541:6: (lv_columns_10_0= ruleTableColumnFX )
                    	    // InternalJavaFXLang.g:542:7: lv_columns_10_0= ruleTableColumnFX
                    	    {

                    	    							newCompositeNode(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_columns_10_0=ruleTableColumnFX();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTableViewFXRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"columns",
                    	    								lv_columns_10_0,
                    	    								"de.dc.emf.javafx.xtext.JavaFXLang.TableColumnFX");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getTableViewFXAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getTableViewFXAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTableViewFX"


    // $ANTLR start "entryRuleTableColumnFX"
    // InternalJavaFXLang.g:573:1: entryRuleTableColumnFX returns [EObject current=null] : iv_ruleTableColumnFX= ruleTableColumnFX EOF ;
    public final EObject entryRuleTableColumnFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableColumnFX = null;


        try {
            // InternalJavaFXLang.g:573:54: (iv_ruleTableColumnFX= ruleTableColumnFX EOF )
            // InternalJavaFXLang.g:574:2: iv_ruleTableColumnFX= ruleTableColumnFX EOF
            {
             newCompositeNode(grammarAccess.getTableColumnFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableColumnFX=ruleTableColumnFX();

            state._fsp--;

             current =iv_ruleTableColumnFX; 
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
    // $ANTLR end "entryRuleTableColumnFX"


    // $ANTLR start "ruleTableColumnFX"
    // InternalJavaFXLang.g:580:1: ruleTableColumnFX returns [EObject current=null] : ( () otherlv_1= 'TableColumnFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'width' ( (lv_width_5_0= ruleEInt ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleTableColumnFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_width_5_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:586:2: ( ( () otherlv_1= 'TableColumnFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'width' ( (lv_width_5_0= ruleEInt ) ) )? otherlv_6= '}' ) )
            // InternalJavaFXLang.g:587:2: ( () otherlv_1= 'TableColumnFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'width' ( (lv_width_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            {
            // InternalJavaFXLang.g:587:2: ( () otherlv_1= 'TableColumnFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'width' ( (lv_width_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            // InternalJavaFXLang.g:588:3: () otherlv_1= 'TableColumnFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'width' ( (lv_width_5_0= ruleEInt ) ) )? otherlv_6= '}'
            {
            // InternalJavaFXLang.g:588:3: ()
            // InternalJavaFXLang.g:589:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableColumnFXAccess().getTableColumnFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTableColumnFXAccess().getTableColumnFXKeyword_1());
            		
            // InternalJavaFXLang.g:599:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:600:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:600:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:601:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableColumnFXAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableColumnFXRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getTableColumnFXAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJavaFXLang.g:622:3: (otherlv_4= 'width' ( (lv_width_5_0= ruleEInt ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJavaFXLang.g:623:4: otherlv_4= 'width' ( (lv_width_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getTableColumnFXAccess().getWidthKeyword_4_0());
                    			
                    // InternalJavaFXLang.g:627:4: ( (lv_width_5_0= ruleEInt ) )
                    // InternalJavaFXLang.g:628:5: (lv_width_5_0= ruleEInt )
                    {
                    // InternalJavaFXLang.g:628:5: (lv_width_5_0= ruleEInt )
                    // InternalJavaFXLang.g:629:6: lv_width_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTableColumnFXAccess().getWidthEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_width_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableColumnFXRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_5_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTableColumnFXAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTableColumnFX"


    // $ANTLR start "entryRuleEInt"
    // InternalJavaFXLang.g:655:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalJavaFXLang.g:655:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalJavaFXLang.g:656:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalJavaFXLang.g:662:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJavaFXLang.g:668:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalJavaFXLang.g:669:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalJavaFXLang.g:669:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalJavaFXLang.g:670:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalJavaFXLang.g:670:3: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJavaFXLang.g:671:4: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleAttributeFX"
    // InternalJavaFXLang.g:688:1: entryRuleAttributeFX returns [EObject current=null] : iv_ruleAttributeFX= ruleAttributeFX EOF ;
    public final EObject entryRuleAttributeFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeFX = null;


        try {
            // InternalJavaFXLang.g:688:52: (iv_ruleAttributeFX= ruleAttributeFX EOF )
            // InternalJavaFXLang.g:689:2: iv_ruleAttributeFX= ruleAttributeFX EOF
            {
             newCompositeNode(grammarAccess.getAttributeFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeFX=ruleAttributeFX();

            state._fsp--;

             current =iv_ruleAttributeFX; 
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
    // $ANTLR end "entryRuleAttributeFX"


    // $ANTLR start "ruleAttributeFX"
    // InternalJavaFXLang.g:695:1: ruleAttributeFX returns [EObject current=null] : ( () otherlv_1= 'AttributeFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleAttributeFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:701:2: ( ( () otherlv_1= 'AttributeFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalJavaFXLang.g:702:2: ( () otherlv_1= 'AttributeFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalJavaFXLang.g:702:2: ( () otherlv_1= 'AttributeFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalJavaFXLang.g:703:3: () otherlv_1= 'AttributeFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalJavaFXLang.g:703:3: ()
            // InternalJavaFXLang.g:704:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeFXAccess().getAttributeFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeFXAccess().getAttributeFXKeyword_1());
            		
            // InternalJavaFXLang.g:714:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:715:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:715:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:716:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeFXAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeFXRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeFXAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJavaFXLang.g:737:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJavaFXLang.g:738:4: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeFXAccess().getTypeKeyword_4_0());
                    			
                    // InternalJavaFXLang.g:742:4: ( (lv_type_5_0= ruleEString ) )
                    // InternalJavaFXLang.g:743:5: (lv_type_5_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:743:5: (lv_type_5_0= ruleEString )
                    // InternalJavaFXLang.g:744:6: lv_type_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeFXAccess().getTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeFXRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAttributeFXAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAttributeFX"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000036000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000610000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008010000L});

}