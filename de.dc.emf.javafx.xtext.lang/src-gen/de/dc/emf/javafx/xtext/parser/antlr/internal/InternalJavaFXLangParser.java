package de.dc.emf.javafx.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ProjectFX'", "'{'", "'packagePath'", "'controls'", "'}'", "'models'", "'bindings'", "'binding'", "'class'", "'instanceType:'", "'TableView'", "'name:'", "'usedModel:'", "'Column'", "'('", "'width:'", "'attribute:'", "')'", "'-'", "'BooleanProperty'", "'DoubleProperty'", "'FloatProperty'", "'IntegerProperty'", "'ObservableList'", "'ObjectProperty'", "'StringProperty'"
    };
    public static final int RULE_STRING=4;
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
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
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
    // InternalJavaFXLang.g:65:1: entryRuleProjectFX returns [EObject current=null] : iv_ruleProjectFX= ruleProjectFX EOF ;
    public final EObject entryRuleProjectFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectFX = null;


        try {
            // InternalJavaFXLang.g:65:50: (iv_ruleProjectFX= ruleProjectFX EOF )
            // InternalJavaFXLang.g:66:2: iv_ruleProjectFX= ruleProjectFX EOF
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
    // InternalJavaFXLang.g:72:1: ruleProjectFX returns [EObject current=null] : ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? (otherlv_16= 'bindings' otherlv_17= '{' ( (lv_bindings_18_0= ruleBinding ) ) ( (lv_bindings_19_0= ruleBinding ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
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
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_packagePath_5_0 = null;

        EObject lv_controls_8_0 = null;

        EObject lv_controls_9_0 = null;

        EObject lv_models_13_0 = null;

        EObject lv_models_14_0 = null;

        EObject lv_bindings_18_0 = null;

        EObject lv_bindings_19_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:78:2: ( ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? (otherlv_16= 'bindings' otherlv_17= '{' ( (lv_bindings_18_0= ruleBinding ) ) ( (lv_bindings_19_0= ruleBinding ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalJavaFXLang.g:79:2: ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? (otherlv_16= 'bindings' otherlv_17= '{' ( (lv_bindings_18_0= ruleBinding ) ) ( (lv_bindings_19_0= ruleBinding ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalJavaFXLang.g:79:2: ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? (otherlv_16= 'bindings' otherlv_17= '{' ( (lv_bindings_18_0= ruleBinding ) ) ( (lv_bindings_19_0= ruleBinding ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalJavaFXLang.g:80:3: () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? (otherlv_16= 'bindings' otherlv_17= '{' ( (lv_bindings_18_0= ruleBinding ) ) ( (lv_bindings_19_0= ruleBinding ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalJavaFXLang.g:80:3: ()
            // InternalJavaFXLang.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProjectFXAccess().getProjectFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectFXAccess().getProjectFXKeyword_1());
            		
            // InternalJavaFXLang.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:92:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:93:5: lv_name_2_0= ruleEString
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
            		
            // InternalJavaFXLang.g:114:3: (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalJavaFXLang.g:115:4: otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getProjectFXAccess().getPackagePathKeyword_4_0());
                    			
                    // InternalJavaFXLang.g:119:4: ( (lv_packagePath_5_0= ruleEString ) )
                    // InternalJavaFXLang.g:120:5: (lv_packagePath_5_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:120:5: (lv_packagePath_5_0= ruleEString )
                    // InternalJavaFXLang.g:121:6: lv_packagePath_5_0= ruleEString
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

            // InternalJavaFXLang.g:139:3: (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJavaFXLang.g:140:4: otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getProjectFXAccess().getControlsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalJavaFXLang.g:148:4: ( (lv_controls_8_0= ruleControlFX ) )
                    // InternalJavaFXLang.g:149:5: (lv_controls_8_0= ruleControlFX )
                    {
                    // InternalJavaFXLang.g:149:5: (lv_controls_8_0= ruleControlFX )
                    // InternalJavaFXLang.g:150:6: lv_controls_8_0= ruleControlFX
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

                    // InternalJavaFXLang.g:167:4: ( (lv_controls_9_0= ruleControlFX ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==21) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:168:5: (lv_controls_9_0= ruleControlFX )
                    	    {
                    	    // InternalJavaFXLang.g:168:5: (lv_controls_9_0= ruleControlFX )
                    	    // InternalJavaFXLang.g:169:6: lv_controls_9_0= ruleControlFX
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

            // InternalJavaFXLang.g:191:3: (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJavaFXLang.g:192:4: otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}'
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getProjectFXAccess().getModelsKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalJavaFXLang.g:200:4: ( (lv_models_13_0= ruleModelFX ) )
                    // InternalJavaFXLang.g:201:5: (lv_models_13_0= ruleModelFX )
                    {
                    // InternalJavaFXLang.g:201:5: (lv_models_13_0= ruleModelFX )
                    // InternalJavaFXLang.g:202:6: lv_models_13_0= ruleModelFX
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

                    // InternalJavaFXLang.g:219:4: ( (lv_models_14_0= ruleModelFX ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==19) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:220:5: (lv_models_14_0= ruleModelFX )
                    	    {
                    	    // InternalJavaFXLang.g:220:5: (lv_models_14_0= ruleModelFX )
                    	    // InternalJavaFXLang.g:221:6: lv_models_14_0= ruleModelFX
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

            // InternalJavaFXLang.g:243:3: (otherlv_16= 'bindings' otherlv_17= '{' ( (lv_bindings_18_0= ruleBinding ) ) ( (lv_bindings_19_0= ruleBinding ) )* otherlv_20= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJavaFXLang.g:244:4: otherlv_16= 'bindings' otherlv_17= '{' ( (lv_bindings_18_0= ruleBinding ) ) ( (lv_bindings_19_0= ruleBinding ) )* otherlv_20= '}'
                    {
                    otherlv_16=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getProjectFXAccess().getBindingsKeyword_7_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_17, grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalJavaFXLang.g:252:4: ( (lv_bindings_18_0= ruleBinding ) )
                    // InternalJavaFXLang.g:253:5: (lv_bindings_18_0= ruleBinding )
                    {
                    // InternalJavaFXLang.g:253:5: (lv_bindings_18_0= ruleBinding )
                    // InternalJavaFXLang.g:254:6: lv_bindings_18_0= ruleBinding
                    {

                    						newCompositeNode(grammarAccess.getProjectFXAccess().getBindingsBindingParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_bindings_18_0=ruleBinding();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    						}
                    						add(
                    							current,
                    							"bindings",
                    							lv_bindings_18_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.Binding");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:271:4: ( (lv_bindings_19_0= ruleBinding ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==18) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:272:5: (lv_bindings_19_0= ruleBinding )
                    	    {
                    	    // InternalJavaFXLang.g:272:5: (lv_bindings_19_0= ruleBinding )
                    	    // InternalJavaFXLang.g:273:6: lv_bindings_19_0= ruleBinding
                    	    {

                    	    						newCompositeNode(grammarAccess.getProjectFXAccess().getBindingsBindingParserRuleCall_7_3_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_bindings_19_0=ruleBinding();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"bindings",
                    	    							lv_bindings_19_0,
                    	    							"de.dc.emf.javafx.xtext.JavaFXLang.Binding");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_20, grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleBinding"
    // InternalJavaFXLang.g:303:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalJavaFXLang.g:303:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalJavaFXLang.g:304:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalJavaFXLang.g:310:1: ruleBinding returns [EObject current=null] : ( () otherlv_1= 'binding' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_property_4_0 = null;

        EObject lv_property_5_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:316:2: ( ( () otherlv_1= 'binding' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )* )? otherlv_6= '}' ) )
            // InternalJavaFXLang.g:317:2: ( () otherlv_1= 'binding' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )* )? otherlv_6= '}' )
            {
            // InternalJavaFXLang.g:317:2: ( () otherlv_1= 'binding' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )* )? otherlv_6= '}' )
            // InternalJavaFXLang.g:318:3: () otherlv_1= 'binding' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )* )? otherlv_6= '}'
            {
            // InternalJavaFXLang.g:318:3: ()
            // InternalJavaFXLang.g:319:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBindingAccess().getBindingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getBindingKeyword_1());
            		
            // InternalJavaFXLang.g:329:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:330:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:330:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:331:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJavaFXLang.g:352:3: ( ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=30 && LA9_0<=36)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJavaFXLang.g:353:4: ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )*
                    {
                    // InternalJavaFXLang.g:353:4: ( (lv_property_4_0= ruleBindingProperty ) )
                    // InternalJavaFXLang.g:354:5: (lv_property_4_0= ruleBindingProperty )
                    {
                    // InternalJavaFXLang.g:354:5: (lv_property_4_0= ruleBindingProperty )
                    // InternalJavaFXLang.g:355:6: lv_property_4_0= ruleBindingProperty
                    {

                    						newCompositeNode(grammarAccess.getBindingAccess().getPropertyBindingPropertyParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_property_4_0=ruleBindingProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBindingRule());
                    						}
                    						add(
                    							current,
                    							"property",
                    							lv_property_4_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.BindingProperty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:372:4: ( (lv_property_5_0= ruleBindingProperty ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=30 && LA8_0<=36)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:373:5: (lv_property_5_0= ruleBindingProperty )
                    	    {
                    	    // InternalJavaFXLang.g:373:5: (lv_property_5_0= ruleBindingProperty )
                    	    // InternalJavaFXLang.g:374:6: lv_property_5_0= ruleBindingProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getBindingAccess().getPropertyBindingPropertyParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_property_5_0=ruleBindingProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBindingRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"property",
                    	    							lv_property_5_0,
                    	    							"de.dc.emf.javafx.xtext.JavaFXLang.BindingProperty");
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

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBindingAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleBindingProperty"
    // InternalJavaFXLang.g:400:1: entryRuleBindingProperty returns [EObject current=null] : iv_ruleBindingProperty= ruleBindingProperty EOF ;
    public final EObject entryRuleBindingProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingProperty = null;


        try {
            // InternalJavaFXLang.g:400:56: (iv_ruleBindingProperty= ruleBindingProperty EOF )
            // InternalJavaFXLang.g:401:2: iv_ruleBindingProperty= ruleBindingProperty EOF
            {
             newCompositeNode(grammarAccess.getBindingPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBindingProperty=ruleBindingProperty();

            state._fsp--;

             current =iv_ruleBindingProperty; 
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
    // $ANTLR end "entryRuleBindingProperty"


    // $ANTLR start "ruleBindingProperty"
    // InternalJavaFXLang.g:407:1: ruleBindingProperty returns [EObject current=null] : ( () ( (lv_type_1_0= ruleBindinType ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleBindingProperty() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:413:2: ( ( () ( (lv_type_1_0= ruleBindinType ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalJavaFXLang.g:414:2: ( () ( (lv_type_1_0= ruleBindinType ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalJavaFXLang.g:414:2: ( () ( (lv_type_1_0= ruleBindinType ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalJavaFXLang.g:415:3: () ( (lv_type_1_0= ruleBindinType ) ) ( (lv_name_2_0= ruleEString ) )
            {
            // InternalJavaFXLang.g:415:3: ()
            // InternalJavaFXLang.g:416:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBindingPropertyAccess().getBindingPropertyAction_0(),
            					current);
            			

            }

            // InternalJavaFXLang.g:422:3: ( (lv_type_1_0= ruleBindinType ) )
            // InternalJavaFXLang.g:423:4: (lv_type_1_0= ruleBindinType )
            {
            // InternalJavaFXLang.g:423:4: (lv_type_1_0= ruleBindinType )
            // InternalJavaFXLang.g:424:5: lv_type_1_0= ruleBindinType
            {

            					newCompositeNode(grammarAccess.getBindingPropertyAccess().getTypeBindinTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_1_0=ruleBindinType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingPropertyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.BindinType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaFXLang.g:441:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:442:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:442:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:443:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBindingPropertyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingPropertyRule());
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
    // $ANTLR end "ruleBindingProperty"


    // $ANTLR start "entryRuleControlFX"
    // InternalJavaFXLang.g:464:1: entryRuleControlFX returns [EObject current=null] : iv_ruleControlFX= ruleControlFX EOF ;
    public final EObject entryRuleControlFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlFX = null;


        try {
            // InternalJavaFXLang.g:464:50: (iv_ruleControlFX= ruleControlFX EOF )
            // InternalJavaFXLang.g:465:2: iv_ruleControlFX= ruleControlFX EOF
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
    // InternalJavaFXLang.g:471:1: ruleControlFX returns [EObject current=null] : this_TableViewFX_0= ruleTableViewFX ;
    public final EObject ruleControlFX() throws RecognitionException {
        EObject current = null;

        EObject this_TableViewFX_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:477:2: (this_TableViewFX_0= ruleTableViewFX )
            // InternalJavaFXLang.g:478:2: this_TableViewFX_0= ruleTableViewFX
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
    // InternalJavaFXLang.g:489:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJavaFXLang.g:489:47: (iv_ruleEString= ruleEString EOF )
            // InternalJavaFXLang.g:490:2: iv_ruleEString= ruleEString EOF
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
    // InternalJavaFXLang.g:496:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalJavaFXLang.g:502:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalJavaFXLang.g:503:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalJavaFXLang.g:503:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalJavaFXLang.g:504:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:512:3: this_ID_1= RULE_ID
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
    // InternalJavaFXLang.g:523:1: entryRuleModelFX returns [EObject current=null] : iv_ruleModelFX= ruleModelFX EOF ;
    public final EObject entryRuleModelFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelFX = null;


        try {
            // InternalJavaFXLang.g:523:48: (iv_ruleModelFX= ruleModelFX EOF )
            // InternalJavaFXLang.g:524:2: iv_ruleModelFX= ruleModelFX EOF
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
    // InternalJavaFXLang.g:530:1: ruleModelFX returns [EObject current=null] : (this_DerivedBean_0= ruleDerivedBean | this_Bean_1= ruleBean ) ;
    public final EObject ruleModelFX() throws RecognitionException {
        EObject current = null;

        EObject this_DerivedBean_0 = null;

        EObject this_Bean_1 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:536:2: ( (this_DerivedBean_0= ruleDerivedBean | this_Bean_1= ruleBean ) )
            // InternalJavaFXLang.g:537:2: (this_DerivedBean_0= ruleDerivedBean | this_Bean_1= ruleBean )
            {
            // InternalJavaFXLang.g:537:2: (this_DerivedBean_0= ruleDerivedBean | this_Bean_1= ruleBean )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_STRING) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==12) ) {
                        int LA11_4 = input.LA(4);

                        if ( (LA11_4==20) ) {
                            alt11=1;
                        }
                        else if ( ((LA11_4>=RULE_STRING && LA11_4<=RULE_ID)||LA11_4==15) ) {
                            alt11=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA11_1==RULE_ID) ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==12) ) {
                        int LA11_4 = input.LA(4);

                        if ( (LA11_4==20) ) {
                            alt11=1;
                        }
                        else if ( ((LA11_4>=RULE_STRING && LA11_4<=RULE_ID)||LA11_4==15) ) {
                            alt11=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalJavaFXLang.g:538:3: this_DerivedBean_0= ruleDerivedBean
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
                    // InternalJavaFXLang.g:547:3: this_Bean_1= ruleBean
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
    // InternalJavaFXLang.g:559:1: entryRuleDerivedBean returns [EObject current=null] : iv_ruleDerivedBean= ruleDerivedBean EOF ;
    public final EObject entryRuleDerivedBean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedBean = null;


        try {
            // InternalJavaFXLang.g:559:52: (iv_ruleDerivedBean= ruleDerivedBean EOF )
            // InternalJavaFXLang.g:560:2: iv_ruleDerivedBean= ruleDerivedBean EOF
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
    // InternalJavaFXLang.g:566:1: ruleDerivedBean returns [EObject current=null] : ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}' ) ;
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
            // InternalJavaFXLang.g:572:2: ( ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}' ) )
            // InternalJavaFXLang.g:573:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}' )
            {
            // InternalJavaFXLang.g:573:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}' )
            // InternalJavaFXLang.g:574:3: () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}'
            {
            // InternalJavaFXLang.g:574:3: ()
            // InternalJavaFXLang.g:575:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDerivedBeanAccess().getDerivedBeanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDerivedBeanAccess().getClassKeyword_1());
            		
            // InternalJavaFXLang.g:585:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:586:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:586:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:587:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getDerivedBeanAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJavaFXLang.g:608:3: (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) )
            // InternalJavaFXLang.g:609:4: otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) )
            {
            otherlv_4=(Token)match(input,20,FOLLOW_3); 

            				newLeafNode(otherlv_4, grammarAccess.getDerivedBeanAccess().getInstanceTypeKeyword_4_0());
            			
            // InternalJavaFXLang.g:613:4: ( (lv_instanceType_5_0= ruleEString ) )
            // InternalJavaFXLang.g:614:5: (lv_instanceType_5_0= ruleEString )
            {
            // InternalJavaFXLang.g:614:5: (lv_instanceType_5_0= ruleEString )
            // InternalJavaFXLang.g:615:6: lv_instanceType_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDerivedBeanAccess().getInstanceTypeEStringParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_18);
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

            // InternalJavaFXLang.g:633:3: ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJavaFXLang.g:634:4: ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )*
                    {
                    // InternalJavaFXLang.g:634:4: ( (lv_attributes_6_0= ruleAttributeFX ) )
                    // InternalJavaFXLang.g:635:5: (lv_attributes_6_0= ruleAttributeFX )
                    {
                    // InternalJavaFXLang.g:635:5: (lv_attributes_6_0= ruleAttributeFX )
                    // InternalJavaFXLang.g:636:6: lv_attributes_6_0= ruleAttributeFX
                    {

                    						newCompositeNode(grammarAccess.getDerivedBeanAccess().getAttributesAttributeFXParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_18);
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

                    // InternalJavaFXLang.g:653:4: ( (lv_attributes_7_0= ruleAttributeFX ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:654:5: (lv_attributes_7_0= ruleAttributeFX )
                    	    {
                    	    // InternalJavaFXLang.g:654:5: (lv_attributes_7_0= ruleAttributeFX )
                    	    // InternalJavaFXLang.g:655:6: lv_attributes_7_0= ruleAttributeFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getDerivedBeanAccess().getAttributesAttributeFXParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
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
                    	    break loop12;
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
    // InternalJavaFXLang.g:681:1: entryRuleBean returns [EObject current=null] : iv_ruleBean= ruleBean EOF ;
    public final EObject entryRuleBean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBean = null;


        try {
            // InternalJavaFXLang.g:681:45: (iv_ruleBean= ruleBean EOF )
            // InternalJavaFXLang.g:682:2: iv_ruleBean= ruleBean EOF
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
    // InternalJavaFXLang.g:688:1: ruleBean returns [EObject current=null] : ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}' ) ;
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
            // InternalJavaFXLang.g:694:2: ( ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}' ) )
            // InternalJavaFXLang.g:695:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}' )
            {
            // InternalJavaFXLang.g:695:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}' )
            // InternalJavaFXLang.g:696:3: () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}'
            {
            // InternalJavaFXLang.g:696:3: ()
            // InternalJavaFXLang.g:697:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBeanAccess().getBeanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBeanAccess().getClassKeyword_1());
            		
            // InternalJavaFXLang.g:707:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:708:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:708:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:709:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getBeanAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJavaFXLang.g:730:3: ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalJavaFXLang.g:731:4: ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )*
                    {
                    // InternalJavaFXLang.g:731:4: ( (lv_attributes_4_0= ruleAttributeFX ) )
                    // InternalJavaFXLang.g:732:5: (lv_attributes_4_0= ruleAttributeFX )
                    {
                    // InternalJavaFXLang.g:732:5: (lv_attributes_4_0= ruleAttributeFX )
                    // InternalJavaFXLang.g:733:6: lv_attributes_4_0= ruleAttributeFX
                    {

                    						newCompositeNode(grammarAccess.getBeanAccess().getAttributesAttributeFXParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_18);
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

                    // InternalJavaFXLang.g:750:4: ( (lv_attributes_5_0= ruleAttributeFX ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:751:5: (lv_attributes_5_0= ruleAttributeFX )
                    	    {
                    	    // InternalJavaFXLang.g:751:5: (lv_attributes_5_0= ruleAttributeFX )
                    	    // InternalJavaFXLang.g:752:6: lv_attributes_5_0= ruleAttributeFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getBeanAccess().getAttributesAttributeFXParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
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
                    	    break loop14;
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
    // InternalJavaFXLang.g:778:1: entryRuleTableViewFX returns [EObject current=null] : iv_ruleTableViewFX= ruleTableViewFX EOF ;
    public final EObject entryRuleTableViewFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableViewFX = null;


        try {
            // InternalJavaFXLang.g:778:52: (iv_ruleTableViewFX= ruleTableViewFX EOF )
            // InternalJavaFXLang.g:779:2: iv_ruleTableViewFX= ruleTableViewFX EOF
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
    // InternalJavaFXLang.g:785:1: ruleTableViewFX returns [EObject current=null] : ( () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}' ) ;
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
            // InternalJavaFXLang.g:791:2: ( ( () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}' ) )
            // InternalJavaFXLang.g:792:2: ( () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}' )
            {
            // InternalJavaFXLang.g:792:2: ( () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}' )
            // InternalJavaFXLang.g:793:3: () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}'
            {
            // InternalJavaFXLang.g:793:3: ()
            // InternalJavaFXLang.g:794:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableViewFXAccess().getTableViewFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTableViewFXAccess().getTableViewKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getTableViewFXAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJavaFXLang.g:808:3: (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) )
            // InternalJavaFXLang.g:809:4: otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) )
            {
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getTableViewFXAccess().getNameKeyword_3_0());
            			
            // InternalJavaFXLang.g:813:4: ( (lv_name_4_0= ruleEString ) )
            // InternalJavaFXLang.g:814:5: (lv_name_4_0= ruleEString )
            {
            // InternalJavaFXLang.g:814:5: (lv_name_4_0= ruleEString )
            // InternalJavaFXLang.g:815:6: lv_name_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getTableViewFXAccess().getNameEStringParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_20);
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

            // InternalJavaFXLang.g:833:3: (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJavaFXLang.g:834:4: otherlv_5= 'usedModel:' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTableViewFXAccess().getUsedModelKeyword_4_0());
                    			
                    // InternalJavaFXLang.g:838:4: ( ( ruleEString ) )
                    // InternalJavaFXLang.g:839:5: ( ruleEString )
                    {
                    // InternalJavaFXLang.g:839:5: ( ruleEString )
                    // InternalJavaFXLang.g:840:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTableViewFXRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTableViewFXAccess().getUsedModelModelFXCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:855:3: ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJavaFXLang.g:856:4: ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )*
                    {
                    // InternalJavaFXLang.g:856:4: ( (lv_columns_7_0= ruleTableColumnFX ) )
                    // InternalJavaFXLang.g:857:5: (lv_columns_7_0= ruleTableColumnFX )
                    {
                    // InternalJavaFXLang.g:857:5: (lv_columns_7_0= ruleTableColumnFX )
                    // InternalJavaFXLang.g:858:6: lv_columns_7_0= ruleTableColumnFX
                    {

                    						newCompositeNode(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    // InternalJavaFXLang.g:875:4: ( (lv_columns_8_0= ruleTableColumnFX ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==24) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:876:5: (lv_columns_8_0= ruleTableColumnFX )
                    	    {
                    	    // InternalJavaFXLang.g:876:5: (lv_columns_8_0= ruleTableColumnFX )
                    	    // InternalJavaFXLang.g:877:6: lv_columns_8_0= ruleTableColumnFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop17;
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
    // InternalJavaFXLang.g:903:1: entryRuleTableColumnFX returns [EObject current=null] : iv_ruleTableColumnFX= ruleTableColumnFX EOF ;
    public final EObject entryRuleTableColumnFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableColumnFX = null;


        try {
            // InternalJavaFXLang.g:903:54: (iv_ruleTableColumnFX= ruleTableColumnFX EOF )
            // InternalJavaFXLang.g:904:2: iv_ruleTableColumnFX= ruleTableColumnFX EOF
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
    // InternalJavaFXLang.g:910:1: ruleTableColumnFX returns [EObject current=null] : ( () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? otherlv_9= ')' ) ;
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
            // InternalJavaFXLang.g:916:2: ( ( () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? otherlv_9= ')' ) )
            // InternalJavaFXLang.g:917:2: ( () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? otherlv_9= ')' )
            {
            // InternalJavaFXLang.g:917:2: ( () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? otherlv_9= ')' )
            // InternalJavaFXLang.g:918:3: () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? otherlv_9= ')'
            {
            // InternalJavaFXLang.g:918:3: ()
            // InternalJavaFXLang.g:919:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableColumnFXAccess().getTableColumnFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getTableColumnFXAccess().getColumnKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getTableColumnFXAccess().getLeftParenthesisKeyword_2());
            		
            // InternalJavaFXLang.g:933:3: (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) )
            // InternalJavaFXLang.g:934:4: otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) )
            {
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getTableColumnFXAccess().getNameKeyword_3_0());
            			
            // InternalJavaFXLang.g:938:4: ( (lv_name_4_0= ruleEString ) )
            // InternalJavaFXLang.g:939:5: (lv_name_4_0= ruleEString )
            {
            // InternalJavaFXLang.g:939:5: (lv_name_4_0= ruleEString )
            // InternalJavaFXLang.g:940:6: lv_name_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getTableColumnFXAccess().getNameEStringParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_23);
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

            // InternalJavaFXLang.g:958:3: (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJavaFXLang.g:959:4: otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getTableColumnFXAccess().getWidthKeyword_4_0());
                    			
                    // InternalJavaFXLang.g:963:4: ( (lv_width_6_0= ruleEInt ) )
                    // InternalJavaFXLang.g:964:5: (lv_width_6_0= ruleEInt )
                    {
                    // InternalJavaFXLang.g:964:5: (lv_width_6_0= ruleEInt )
                    // InternalJavaFXLang.g:965:6: lv_width_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTableColumnFXAccess().getWidthEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_25);
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

            // InternalJavaFXLang.g:983:3: (otherlv_7= 'attribute:' ( ( ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJavaFXLang.g:984:4: otherlv_7= 'attribute:' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getTableColumnFXAccess().getAttributeKeyword_5_0());
                    			
                    // InternalJavaFXLang.g:988:4: ( ( ruleEString ) )
                    // InternalJavaFXLang.g:989:5: ( ruleEString )
                    {
                    // InternalJavaFXLang.g:989:5: ( ruleEString )
                    // InternalJavaFXLang.g:990:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTableColumnFXRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTableColumnFXAccess().getUsedAttributeAttributeFXCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,28,FOLLOW_2); 

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
    // InternalJavaFXLang.g:1013:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalJavaFXLang.g:1013:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalJavaFXLang.g:1014:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalJavaFXLang.g:1020:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJavaFXLang.g:1026:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalJavaFXLang.g:1027:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalJavaFXLang.g:1027:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalJavaFXLang.g:1028:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalJavaFXLang.g:1028:3: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJavaFXLang.g:1029:4: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_27); 

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
    // InternalJavaFXLang.g:1046:1: entryRuleAttributeFX returns [EObject current=null] : iv_ruleAttributeFX= ruleAttributeFX EOF ;
    public final EObject entryRuleAttributeFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeFX = null;


        try {
            // InternalJavaFXLang.g:1046:52: (iv_ruleAttributeFX= ruleAttributeFX EOF )
            // InternalJavaFXLang.g:1047:2: iv_ruleAttributeFX= ruleAttributeFX EOF
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
    // InternalJavaFXLang.g:1053:1: ruleAttributeFX returns [EObject current=null] : ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleAttributeFX() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:1059:2: ( ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalJavaFXLang.g:1060:2: ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalJavaFXLang.g:1060:2: ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalJavaFXLang.g:1061:3: () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) )
            {
            // InternalJavaFXLang.g:1061:3: ()
            // InternalJavaFXLang.g:1062:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeFXAccess().getAttributeFXAction_0(),
            					current);
            			

            }

            // InternalJavaFXLang.g:1068:3: ( (lv_type_1_0= ruleEString ) )
            // InternalJavaFXLang.g:1069:4: (lv_type_1_0= ruleEString )
            {
            // InternalJavaFXLang.g:1069:4: (lv_type_1_0= ruleEString )
            // InternalJavaFXLang.g:1070:5: lv_type_1_0= ruleEString
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

            // InternalJavaFXLang.g:1087:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:1088:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:1088:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:1089:5: lv_name_2_0= ruleEString
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


    // $ANTLR start "ruleBindinType"
    // InternalJavaFXLang.g:1110:1: ruleBindinType returns [Enumerator current=null] : ( (enumLiteral_0= 'BooleanProperty' ) | (enumLiteral_1= 'DoubleProperty' ) | (enumLiteral_2= 'FloatProperty' ) | (enumLiteral_3= 'IntegerProperty' ) | (enumLiteral_4= 'ObservableList' ) | (enumLiteral_5= 'ObjectProperty' ) | (enumLiteral_6= 'StringProperty' ) ) ;
    public final Enumerator ruleBindinType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalJavaFXLang.g:1116:2: ( ( (enumLiteral_0= 'BooleanProperty' ) | (enumLiteral_1= 'DoubleProperty' ) | (enumLiteral_2= 'FloatProperty' ) | (enumLiteral_3= 'IntegerProperty' ) | (enumLiteral_4= 'ObservableList' ) | (enumLiteral_5= 'ObjectProperty' ) | (enumLiteral_6= 'StringProperty' ) ) )
            // InternalJavaFXLang.g:1117:2: ( (enumLiteral_0= 'BooleanProperty' ) | (enumLiteral_1= 'DoubleProperty' ) | (enumLiteral_2= 'FloatProperty' ) | (enumLiteral_3= 'IntegerProperty' ) | (enumLiteral_4= 'ObservableList' ) | (enumLiteral_5= 'ObjectProperty' ) | (enumLiteral_6= 'StringProperty' ) )
            {
            // InternalJavaFXLang.g:1117:2: ( (enumLiteral_0= 'BooleanProperty' ) | (enumLiteral_1= 'DoubleProperty' ) | (enumLiteral_2= 'FloatProperty' ) | (enumLiteral_3= 'IntegerProperty' ) | (enumLiteral_4= 'ObservableList' ) | (enumLiteral_5= 'ObjectProperty' ) | (enumLiteral_6= 'StringProperty' ) )
            int alt22=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt22=1;
                }
                break;
            case 31:
                {
                alt22=2;
                }
                break;
            case 32:
                {
                alt22=3;
                }
                break;
            case 33:
                {
                alt22=4;
                }
                break;
            case 34:
                {
                alt22=5;
                }
                break;
            case 35:
                {
                alt22=6;
                }
                break;
            case 36:
                {
                alt22=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalJavaFXLang.g:1118:3: (enumLiteral_0= 'BooleanProperty' )
                    {
                    // InternalJavaFXLang.g:1118:3: (enumLiteral_0= 'BooleanProperty' )
                    // InternalJavaFXLang.g:1119:4: enumLiteral_0= 'BooleanProperty'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getBooleanPropertyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBindinTypeAccess().getBooleanPropertyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:1126:3: (enumLiteral_1= 'DoubleProperty' )
                    {
                    // InternalJavaFXLang.g:1126:3: (enumLiteral_1= 'DoubleProperty' )
                    // InternalJavaFXLang.g:1127:4: enumLiteral_1= 'DoubleProperty'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getDoublePropertyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBindinTypeAccess().getDoublePropertyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJavaFXLang.g:1134:3: (enumLiteral_2= 'FloatProperty' )
                    {
                    // InternalJavaFXLang.g:1134:3: (enumLiteral_2= 'FloatProperty' )
                    // InternalJavaFXLang.g:1135:4: enumLiteral_2= 'FloatProperty'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getFloatPropertyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBindinTypeAccess().getFloatPropertyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJavaFXLang.g:1142:3: (enumLiteral_3= 'IntegerProperty' )
                    {
                    // InternalJavaFXLang.g:1142:3: (enumLiteral_3= 'IntegerProperty' )
                    // InternalJavaFXLang.g:1143:4: enumLiteral_3= 'IntegerProperty'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getIntegerPropertyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBindinTypeAccess().getIntegerPropertyEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJavaFXLang.g:1150:3: (enumLiteral_4= 'ObservableList' )
                    {
                    // InternalJavaFXLang.g:1150:3: (enumLiteral_4= 'ObservableList' )
                    // InternalJavaFXLang.g:1151:4: enumLiteral_4= 'ObservableList'
                    {
                    enumLiteral_4=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getObservableListEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBindinTypeAccess().getObservableListEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJavaFXLang.g:1158:3: (enumLiteral_5= 'ObjectProperty' )
                    {
                    // InternalJavaFXLang.g:1158:3: (enumLiteral_5= 'ObjectProperty' )
                    // InternalJavaFXLang.g:1159:4: enumLiteral_5= 'ObjectProperty'
                    {
                    enumLiteral_5=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getObjectPropertyEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBindinTypeAccess().getObjectPropertyEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJavaFXLang.g:1166:3: (enumLiteral_6= 'StringProperty' )
                    {
                    // InternalJavaFXLang.g:1166:3: (enumLiteral_6= 'StringProperty' )
                    // InternalJavaFXLang.g:1167:4: enumLiteral_6= 'StringProperty'
                    {
                    enumLiteral_6=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getStringPropertyEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBindinTypeAccess().getStringPropertyEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleBindinType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001FC0008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});

}