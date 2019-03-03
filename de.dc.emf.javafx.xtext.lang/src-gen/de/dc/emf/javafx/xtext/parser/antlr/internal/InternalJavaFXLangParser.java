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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ProjectFX'", "'{'", "'packagePath'", "'controls'", "'}'", "'models'", "'class'", "'instanceType:'", "'TableView'", "'name:'", "'usedModel:'", "'Column'", "'('", "'width:'", "'attribute:'", "')'", "'-'"
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
    // InternalJavaFXLang.g:71:1: ruleProjectFX returns [EObject current=null] : ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleProjectFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_packagePath_5_0 = null;

        EObject lv_controls_8_0 = null;

        EObject lv_controls_9_0 = null;

        EObject lv_models_13_0 = null;

        EObject lv_models_14_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:77:2: ( ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalJavaFXLang.g:78:2: ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalJavaFXLang.g:78:2: ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalJavaFXLang.g:79:3: () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? otherlv_16= '}'
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

            // InternalJavaFXLang.g:138:3: (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJavaFXLang.g:139:4: otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}'
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

                    // InternalJavaFXLang.g:166:4: ( (lv_controls_9_0= ruleControlFX ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==19) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:167:5: (lv_controls_9_0= ruleControlFX )
                    	    {
                    	    // InternalJavaFXLang.g:167:5: (lv_controls_9_0= ruleControlFX )
                    	    // InternalJavaFXLang.g:168:6: lv_controls_9_0= ruleControlFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getProjectFXAccess().getControlsControlFXParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_controls_9_0=ruleControlFX();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"controls",
                    	    							lv_controls_9_0,
                    	    							"de.dc.emf.javafx.xtext.JavaFXLang.ControlFX");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalJavaFXLang.g:190:3: (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJavaFXLang.g:191:4: otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}'
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getProjectFXAccess().getModelsKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalJavaFXLang.g:199:4: ( (lv_models_13_0= ruleModelFX ) )
                    // InternalJavaFXLang.g:200:5: (lv_models_13_0= ruleModelFX )
                    {
                    // InternalJavaFXLang.g:200:5: (lv_models_13_0= ruleModelFX )
                    // InternalJavaFXLang.g:201:6: lv_models_13_0= ruleModelFX
                    {

                    						newCompositeNode(grammarAccess.getProjectFXAccess().getModelsModelFXParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_models_13_0=ruleModelFX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    						}
                    						add(
                    							current,
                    							"models",
                    							lv_models_13_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.ModelFX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:218:4: ( (lv_models_14_0= ruleModelFX ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:219:5: (lv_models_14_0= ruleModelFX )
                    	    {
                    	    // InternalJavaFXLang.g:219:5: (lv_models_14_0= ruleModelFX )
                    	    // InternalJavaFXLang.g:220:6: lv_models_14_0= ruleModelFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getProjectFXAccess().getModelsModelFXParserRuleCall_6_3_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
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
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalJavaFXLang.g:250:1: entryRuleControlFX returns [EObject current=null] : iv_ruleControlFX= ruleControlFX EOF ;
    public final EObject entryRuleControlFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlFX = null;


        try {
            // InternalJavaFXLang.g:250:50: (iv_ruleControlFX= ruleControlFX EOF )
            // InternalJavaFXLang.g:251:2: iv_ruleControlFX= ruleControlFX EOF
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
    // InternalJavaFXLang.g:257:1: ruleControlFX returns [EObject current=null] : this_TableViewFX_0= ruleTableViewFX ;
    public final EObject ruleControlFX() throws RecognitionException {
        EObject current = null;

        EObject this_TableViewFX_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:263:2: (this_TableViewFX_0= ruleTableViewFX )
            // InternalJavaFXLang.g:264:2: this_TableViewFX_0= ruleTableViewFX
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
    // InternalJavaFXLang.g:275:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJavaFXLang.g:275:47: (iv_ruleEString= ruleEString EOF )
            // InternalJavaFXLang.g:276:2: iv_ruleEString= ruleEString EOF
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
    // InternalJavaFXLang.g:282:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalJavaFXLang.g:288:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalJavaFXLang.g:289:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalJavaFXLang.g:289:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalJavaFXLang.g:290:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:298:3: this_ID_1= RULE_ID
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
    // InternalJavaFXLang.g:309:1: entryRuleModelFX returns [EObject current=null] : iv_ruleModelFX= ruleModelFX EOF ;
    public final EObject entryRuleModelFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelFX = null;


        try {
            // InternalJavaFXLang.g:309:48: (iv_ruleModelFX= ruleModelFX EOF )
            // InternalJavaFXLang.g:310:2: iv_ruleModelFX= ruleModelFX EOF
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
    // InternalJavaFXLang.g:316:1: ruleModelFX returns [EObject current=null] : (this_DerivedBean_0= ruleDerivedBean | this_Bean_1= ruleBean ) ;
    public final EObject ruleModelFX() throws RecognitionException {
        EObject current = null;

        EObject this_DerivedBean_0 = null;

        EObject this_Bean_1 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:322:2: ( (this_DerivedBean_0= ruleDerivedBean | this_Bean_1= ruleBean ) )
            // InternalJavaFXLang.g:323:2: (this_DerivedBean_0= ruleDerivedBean | this_Bean_1= ruleBean )
            {
            // InternalJavaFXLang.g:323:2: (this_DerivedBean_0= ruleDerivedBean | this_Bean_1= ruleBean )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_STRING) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==12) ) {
                        int LA7_4 = input.LA(4);

                        if ( (LA7_4==18) ) {
                            alt7=1;
                        }
                        else if ( ((LA7_4>=RULE_STRING && LA7_4<=RULE_ID)||LA7_4==15) ) {
                            alt7=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==RULE_ID) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==12) ) {
                        int LA7_4 = input.LA(4);

                        if ( (LA7_4==18) ) {
                            alt7=1;
                        }
                        else if ( ((LA7_4>=RULE_STRING && LA7_4<=RULE_ID)||LA7_4==15) ) {
                            alt7=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalJavaFXLang.g:324:3: this_DerivedBean_0= ruleDerivedBean
                    {

                    			newCompositeNode(grammarAccess.getModelFXAccess().getDerivedBeanParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DerivedBean_0=ruleDerivedBean();

                    state._fsp--;


                    			current = this_DerivedBean_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:333:3: this_Bean_1= ruleBean
                    {

                    			newCompositeNode(grammarAccess.getModelFXAccess().getBeanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bean_1=ruleBean();

                    state._fsp--;


                    			current = this_Bean_1;
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
    // $ANTLR end "ruleModelFX"


    // $ANTLR start "entryRuleDerivedBean"
    // InternalJavaFXLang.g:345:1: entryRuleDerivedBean returns [EObject current=null] : iv_ruleDerivedBean= ruleDerivedBean EOF ;
    public final EObject entryRuleDerivedBean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedBean = null;


        try {
            // InternalJavaFXLang.g:345:52: (iv_ruleDerivedBean= ruleDerivedBean EOF )
            // InternalJavaFXLang.g:346:2: iv_ruleDerivedBean= ruleDerivedBean EOF
            {
             newCompositeNode(grammarAccess.getDerivedBeanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDerivedBean=ruleDerivedBean();

            state._fsp--;

             current =iv_ruleDerivedBean; 
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
    // $ANTLR end "entryRuleDerivedBean"


    // $ANTLR start "ruleDerivedBean"
    // InternalJavaFXLang.g:352:1: ruleDerivedBean returns [EObject current=null] : ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleDerivedBean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_instanceType_5_0 = null;

        EObject lv_attributes_6_0 = null;

        EObject lv_attributes_7_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:358:2: ( ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}' ) )
            // InternalJavaFXLang.g:359:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}' )
            {
            // InternalJavaFXLang.g:359:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}' )
            // InternalJavaFXLang.g:360:3: () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}'
            {
            // InternalJavaFXLang.g:360:3: ()
            // InternalJavaFXLang.g:361:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDerivedBeanAccess().getDerivedBeanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDerivedBeanAccess().getClassKeyword_1());
            		
            // InternalJavaFXLang.g:371:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:372:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:372:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:373:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDerivedBeanAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDerivedBeanRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getDerivedBeanAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJavaFXLang.g:394:3: (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) )
            // InternalJavaFXLang.g:395:4: otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) )
            {
            otherlv_4=(Token)match(input,18,FOLLOW_3); 

            				newLeafNode(otherlv_4, grammarAccess.getDerivedBeanAccess().getInstanceTypeKeyword_4_0());
            			
            // InternalJavaFXLang.g:399:4: ( (lv_instanceType_5_0= ruleEString ) )
            // InternalJavaFXLang.g:400:5: (lv_instanceType_5_0= ruleEString )
            {
            // InternalJavaFXLang.g:400:5: (lv_instanceType_5_0= ruleEString )
            // InternalJavaFXLang.g:401:6: lv_instanceType_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDerivedBeanAccess().getInstanceTypeEStringParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_14);
            lv_instanceType_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDerivedBeanRule());
            						}
            						set(
            							current,
            							"instanceType",
            							lv_instanceType_5_0,
            							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalJavaFXLang.g:419:3: ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJavaFXLang.g:420:4: ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )*
                    {
                    // InternalJavaFXLang.g:420:4: ( (lv_attributes_6_0= ruleAttributeFX ) )
                    // InternalJavaFXLang.g:421:5: (lv_attributes_6_0= ruleAttributeFX )
                    {
                    // InternalJavaFXLang.g:421:5: (lv_attributes_6_0= ruleAttributeFX )
                    // InternalJavaFXLang.g:422:6: lv_attributes_6_0= ruleAttributeFX
                    {

                    						newCompositeNode(grammarAccess.getDerivedBeanAccess().getAttributesAttributeFXParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_attributes_6_0=ruleAttributeFX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDerivedBeanRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_6_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.AttributeFX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:439:4: ( (lv_attributes_7_0= ruleAttributeFX ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:440:5: (lv_attributes_7_0= ruleAttributeFX )
                    	    {
                    	    // InternalJavaFXLang.g:440:5: (lv_attributes_7_0= ruleAttributeFX )
                    	    // InternalJavaFXLang.g:441:6: lv_attributes_7_0= ruleAttributeFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getDerivedBeanAccess().getAttributesAttributeFXParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_attributes_7_0=ruleAttributeFX();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDerivedBeanRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributes",
                    	    							lv_attributes_7_0,
                    	    							"de.dc.emf.javafx.xtext.JavaFXLang.AttributeFX");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDerivedBeanAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDerivedBean"


    // $ANTLR start "entryRuleBean"
    // InternalJavaFXLang.g:467:1: entryRuleBean returns [EObject current=null] : iv_ruleBean= ruleBean EOF ;
    public final EObject entryRuleBean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBean = null;


        try {
            // InternalJavaFXLang.g:467:45: (iv_ruleBean= ruleBean EOF )
            // InternalJavaFXLang.g:468:2: iv_ruleBean= ruleBean EOF
            {
             newCompositeNode(grammarAccess.getBeanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBean=ruleBean();

            state._fsp--;

             current =iv_ruleBean; 
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
    // $ANTLR end "entryRuleBean"


    // $ANTLR start "ruleBean"
    // InternalJavaFXLang.g:474:1: ruleBean returns [EObject current=null] : ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleBean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_attributes_4_0 = null;

        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:480:2: ( ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}' ) )
            // InternalJavaFXLang.g:481:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}' )
            {
            // InternalJavaFXLang.g:481:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}' )
            // InternalJavaFXLang.g:482:3: () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}'
            {
            // InternalJavaFXLang.g:482:3: ()
            // InternalJavaFXLang.g:483:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBeanAccess().getBeanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBeanAccess().getClassKeyword_1());
            		
            // InternalJavaFXLang.g:493:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:494:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:494:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:495:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBeanAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBeanRule());
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

            			newLeafNode(otherlv_3, grammarAccess.getBeanAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJavaFXLang.g:516:3: ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJavaFXLang.g:517:4: ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )*
                    {
                    // InternalJavaFXLang.g:517:4: ( (lv_attributes_4_0= ruleAttributeFX ) )
                    // InternalJavaFXLang.g:518:5: (lv_attributes_4_0= ruleAttributeFX )
                    {
                    // InternalJavaFXLang.g:518:5: (lv_attributes_4_0= ruleAttributeFX )
                    // InternalJavaFXLang.g:519:6: lv_attributes_4_0= ruleAttributeFX
                    {

                    						newCompositeNode(grammarAccess.getBeanAccess().getAttributesAttributeFXParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_attributes_4_0=ruleAttributeFX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBeanRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_4_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.AttributeFX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:536:4: ( (lv_attributes_5_0= ruleAttributeFX ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:537:5: (lv_attributes_5_0= ruleAttributeFX )
                    	    {
                    	    // InternalJavaFXLang.g:537:5: (lv_attributes_5_0= ruleAttributeFX )
                    	    // InternalJavaFXLang.g:538:6: lv_attributes_5_0= ruleAttributeFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getBeanAccess().getAttributesAttributeFXParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_attributes_5_0=ruleAttributeFX();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBeanRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributes",
                    	    							lv_attributes_5_0,
                    	    							"de.dc.emf.javafx.xtext.JavaFXLang.AttributeFX");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBeanAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBean"


    // $ANTLR start "entryRuleTableViewFX"
    // InternalJavaFXLang.g:564:1: entryRuleTableViewFX returns [EObject current=null] : iv_ruleTableViewFX= ruleTableViewFX EOF ;
    public final EObject entryRuleTableViewFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableViewFX = null;


        try {
            // InternalJavaFXLang.g:564:52: (iv_ruleTableViewFX= ruleTableViewFX EOF )
            // InternalJavaFXLang.g:565:2: iv_ruleTableViewFX= ruleTableViewFX EOF
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
    // InternalJavaFXLang.g:571:1: ruleTableViewFX returns [EObject current=null] : ( () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleTableViewFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_columns_7_0 = null;

        EObject lv_columns_8_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:577:2: ( ( () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}' ) )
            // InternalJavaFXLang.g:578:2: ( () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}' )
            {
            // InternalJavaFXLang.g:578:2: ( () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}' )
            // InternalJavaFXLang.g:579:3: () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}'
            {
            // InternalJavaFXLang.g:579:3: ()
            // InternalJavaFXLang.g:580:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableViewFXAccess().getTableViewFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTableViewFXAccess().getTableViewKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getTableViewFXAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJavaFXLang.g:594:3: (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) )
            // InternalJavaFXLang.g:595:4: otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) )
            {
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getTableViewFXAccess().getNameKeyword_3_0());
            			
            // InternalJavaFXLang.g:599:4: ( (lv_name_4_0= ruleEString ) )
            // InternalJavaFXLang.g:600:5: (lv_name_4_0= ruleEString )
            {
            // InternalJavaFXLang.g:600:5: (lv_name_4_0= ruleEString )
            // InternalJavaFXLang.g:601:6: lv_name_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getTableViewFXAccess().getNameEStringParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_16);
            lv_name_4_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getTableViewFXRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_4_0,
            							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalJavaFXLang.g:619:3: (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJavaFXLang.g:620:4: otherlv_5= 'usedModel:' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTableViewFXAccess().getUsedModelKeyword_4_0());
                    			
                    // InternalJavaFXLang.g:624:4: ( ( ruleEString ) )
                    // InternalJavaFXLang.g:625:5: ( ruleEString )
                    {
                    // InternalJavaFXLang.g:625:5: ( ruleEString )
                    // InternalJavaFXLang.g:626:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTableViewFXRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTableViewFXAccess().getUsedModelModelFXCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:641:3: ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJavaFXLang.g:642:4: ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )*
                    {
                    // InternalJavaFXLang.g:642:4: ( (lv_columns_7_0= ruleTableColumnFX ) )
                    // InternalJavaFXLang.g:643:5: (lv_columns_7_0= ruleTableColumnFX )
                    {
                    // InternalJavaFXLang.g:643:5: (lv_columns_7_0= ruleTableColumnFX )
                    // InternalJavaFXLang.g:644:6: lv_columns_7_0= ruleTableColumnFX
                    {

                    						newCompositeNode(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_columns_7_0=ruleTableColumnFX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableViewFXRule());
                    						}
                    						add(
                    							current,
                    							"columns",
                    							lv_columns_7_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.TableColumnFX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:661:4: ( (lv_columns_8_0= ruleTableColumnFX ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==22) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:662:5: (lv_columns_8_0= ruleTableColumnFX )
                    	    {
                    	    // InternalJavaFXLang.g:662:5: (lv_columns_8_0= ruleTableColumnFX )
                    	    // InternalJavaFXLang.g:663:6: lv_columns_8_0= ruleTableColumnFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
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
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTableViewFXAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalJavaFXLang.g:689:1: entryRuleTableColumnFX returns [EObject current=null] : iv_ruleTableColumnFX= ruleTableColumnFX EOF ;
    public final EObject entryRuleTableColumnFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableColumnFX = null;


        try {
            // InternalJavaFXLang.g:689:54: (iv_ruleTableColumnFX= ruleTableColumnFX EOF )
            // InternalJavaFXLang.g:690:2: iv_ruleTableColumnFX= ruleTableColumnFX EOF
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
    // InternalJavaFXLang.g:696:1: ruleTableColumnFX returns [EObject current=null] : ( () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? otherlv_9= ')' ) ;
    public final EObject ruleTableColumnFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_width_6_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:702:2: ( ( () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? otherlv_9= ')' ) )
            // InternalJavaFXLang.g:703:2: ( () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? otherlv_9= ')' )
            {
            // InternalJavaFXLang.g:703:2: ( () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? otherlv_9= ')' )
            // InternalJavaFXLang.g:704:3: () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? otherlv_9= ')'
            {
            // InternalJavaFXLang.g:704:3: ()
            // InternalJavaFXLang.g:705:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableColumnFXAccess().getTableColumnFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getTableColumnFXAccess().getColumnKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getTableColumnFXAccess().getLeftParenthesisKeyword_2());
            		
            // InternalJavaFXLang.g:719:3: (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) )
            // InternalJavaFXLang.g:720:4: otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) )
            {
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getTableColumnFXAccess().getNameKeyword_3_0());
            			
            // InternalJavaFXLang.g:724:4: ( (lv_name_4_0= ruleEString ) )
            // InternalJavaFXLang.g:725:5: (lv_name_4_0= ruleEString )
            {
            // InternalJavaFXLang.g:725:5: (lv_name_4_0= ruleEString )
            // InternalJavaFXLang.g:726:6: lv_name_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getTableColumnFXAccess().getNameEStringParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_19);
            lv_name_4_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getTableColumnFXRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_4_0,
            							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalJavaFXLang.g:744:3: (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalJavaFXLang.g:745:4: otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getTableColumnFXAccess().getWidthKeyword_4_0());
                    			
                    // InternalJavaFXLang.g:749:4: ( (lv_width_6_0= ruleEInt ) )
                    // InternalJavaFXLang.g:750:5: (lv_width_6_0= ruleEInt )
                    {
                    // InternalJavaFXLang.g:750:5: (lv_width_6_0= ruleEInt )
                    // InternalJavaFXLang.g:751:6: lv_width_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTableColumnFXAccess().getWidthEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_width_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableColumnFXRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_6_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:769:3: (otherlv_7= 'attribute:' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJavaFXLang.g:770:4: otherlv_7= 'attribute:' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getTableColumnFXAccess().getAttributeKeyword_5_0());
                    			
                    // InternalJavaFXLang.g:774:4: ( ( ruleEString ) )
                    // InternalJavaFXLang.g:775:5: ( ruleEString )
                    {
                    // InternalJavaFXLang.g:775:5: ( ruleEString )
                    // InternalJavaFXLang.g:776:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTableColumnFXRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTableColumnFXAccess().getUsedAttributeAttributeFXCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTableColumnFXAccess().getRightParenthesisKeyword_6());
            		

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
    // InternalJavaFXLang.g:799:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalJavaFXLang.g:799:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalJavaFXLang.g:800:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalJavaFXLang.g:806:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJavaFXLang.g:812:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalJavaFXLang.g:813:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalJavaFXLang.g:813:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalJavaFXLang.g:814:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalJavaFXLang.g:814:3: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJavaFXLang.g:815:4: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_23); 

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
    // InternalJavaFXLang.g:832:1: entryRuleAttributeFX returns [EObject current=null] : iv_ruleAttributeFX= ruleAttributeFX EOF ;
    public final EObject entryRuleAttributeFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeFX = null;


        try {
            // InternalJavaFXLang.g:832:52: (iv_ruleAttributeFX= ruleAttributeFX EOF )
            // InternalJavaFXLang.g:833:2: iv_ruleAttributeFX= ruleAttributeFX EOF
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
    // InternalJavaFXLang.g:839:1: ruleAttributeFX returns [EObject current=null] : ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleAttributeFX() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:845:2: ( ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalJavaFXLang.g:846:2: ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalJavaFXLang.g:846:2: ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalJavaFXLang.g:847:3: () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) )
            {
            // InternalJavaFXLang.g:847:3: ()
            // InternalJavaFXLang.g:848:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeFXAccess().getAttributeFXAction_0(),
            					current);
            			

            }

            // InternalJavaFXLang.g:854:3: ( (lv_type_1_0= ruleEString ) )
            // InternalJavaFXLang.g:855:4: (lv_type_1_0= ruleEString )
            {
            // InternalJavaFXLang.g:855:4: (lv_type_1_0= ruleEString )
            // InternalJavaFXLang.g:856:5: lv_type_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeFXAccess().getTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeFXRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaFXLang.g:873:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:874:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:874:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:875:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeFXAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000608000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});

}