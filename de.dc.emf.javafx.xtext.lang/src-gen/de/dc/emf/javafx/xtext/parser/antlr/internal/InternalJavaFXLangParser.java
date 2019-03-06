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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ProjectFX'", "'{'", "'packagePath'", "'controls'", "'}'", "'models'", "'bindings'", "'charts'", "'BarChart'", "'name:'", "'legendSide:'", "'showLegend:'", "'title:'", "'titleSide:'", "'xAxisLabel:'", "'xAxisType:'", "'yAxisLabel:'", "'yAxisType:'", "'ScatterChart'", "'BubbleChart'", "'AreaChart'", "'PieChart'", "'LineChart'", "'binding'", "'FilteredTableView'", "'usedModel:'", "'usedFilter:'", "'class'", "'instanceType:'", "'TableView'", "'Column'", "'('", "'width:'", "'attribute:'", "'useFilter:'", "')'", "'true'", "'false'", "'-'", "'Category'", "'Number'", "'Bottom'", "'Left'", "'Right'", "'Top'", "'BooleanProperty'", "'DoubleProperty'", "'FloatProperty'", "'IntegerProperty'", "'ObservableList'", "'ObjectProperty'", "'StringProperty'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
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
    public static final int T__62=62;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalJavaFXLang.g:72:1: ruleProjectFX returns [EObject current=null] : ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? (otherlv_16= 'bindings' otherlv_17= '{' ( (lv_bindings_18_0= ruleBinding ) ) ( (lv_bindings_19_0= ruleBinding ) )* otherlv_20= '}' )? (otherlv_21= 'charts' otherlv_22= '{' ( (lv_charts_23_0= ruleChartFX ) ) ( (lv_charts_24_0= ruleChartFX ) )* otherlv_25= '}' )? otherlv_26= '}' ) ;
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
        Token otherlv_22=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_packagePath_5_0 = null;

        EObject lv_controls_8_0 = null;

        EObject lv_controls_9_0 = null;

        EObject lv_models_13_0 = null;

        EObject lv_models_14_0 = null;

        EObject lv_bindings_18_0 = null;

        EObject lv_bindings_19_0 = null;

        EObject lv_charts_23_0 = null;

        EObject lv_charts_24_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:78:2: ( ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? (otherlv_16= 'bindings' otherlv_17= '{' ( (lv_bindings_18_0= ruleBinding ) ) ( (lv_bindings_19_0= ruleBinding ) )* otherlv_20= '}' )? (otherlv_21= 'charts' otherlv_22= '{' ( (lv_charts_23_0= ruleChartFX ) ) ( (lv_charts_24_0= ruleChartFX ) )* otherlv_25= '}' )? otherlv_26= '}' ) )
            // InternalJavaFXLang.g:79:2: ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? (otherlv_16= 'bindings' otherlv_17= '{' ( (lv_bindings_18_0= ruleBinding ) ) ( (lv_bindings_19_0= ruleBinding ) )* otherlv_20= '}' )? (otherlv_21= 'charts' otherlv_22= '{' ( (lv_charts_23_0= ruleChartFX ) ) ( (lv_charts_24_0= ruleChartFX ) )* otherlv_25= '}' )? otherlv_26= '}' )
            {
            // InternalJavaFXLang.g:79:2: ( () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? (otherlv_16= 'bindings' otherlv_17= '{' ( (lv_bindings_18_0= ruleBinding ) ) ( (lv_bindings_19_0= ruleBinding ) )* otherlv_20= '}' )? (otherlv_21= 'charts' otherlv_22= '{' ( (lv_charts_23_0= ruleChartFX ) ) ( (lv_charts_24_0= ruleChartFX ) )* otherlv_25= '}' )? otherlv_26= '}' )
            // InternalJavaFXLang.g:80:3: () otherlv_1= 'ProjectFX' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'packagePath' ( (lv_packagePath_5_0= ruleEString ) ) )? (otherlv_6= 'controls' otherlv_7= '{' ( (lv_controls_8_0= ruleControlFX ) ) ( (lv_controls_9_0= ruleControlFX ) )* otherlv_10= '}' )? (otherlv_11= 'models' otherlv_12= '{' ( (lv_models_13_0= ruleModelFX ) ) ( (lv_models_14_0= ruleModelFX ) )* otherlv_15= '}' )? (otherlv_16= 'bindings' otherlv_17= '{' ( (lv_bindings_18_0= ruleBinding ) ) ( (lv_bindings_19_0= ruleBinding ) )* otherlv_20= '}' )? (otherlv_21= 'charts' otherlv_22= '{' ( (lv_charts_23_0= ruleChartFX ) ) ( (lv_charts_24_0= ruleChartFX ) )* otherlv_25= '}' )? otherlv_26= '}'
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

                        if ( (LA2_0==35||LA2_0==40) ) {
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

                        if ( (LA4_0==38) ) {
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

                        if ( (LA6_0==34) ) {
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

            // InternalJavaFXLang.g:295:3: (otherlv_21= 'charts' otherlv_22= '{' ( (lv_charts_23_0= ruleChartFX ) ) ( (lv_charts_24_0= ruleChartFX ) )* otherlv_25= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJavaFXLang.g:296:4: otherlv_21= 'charts' otherlv_22= '{' ( (lv_charts_23_0= ruleChartFX ) ) ( (lv_charts_24_0= ruleChartFX ) )* otherlv_25= '}'
                    {
                    otherlv_21=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_21, grammarAccess.getProjectFXAccess().getChartsKeyword_8_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_22, grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalJavaFXLang.g:304:4: ( (lv_charts_23_0= ruleChartFX ) )
                    // InternalJavaFXLang.g:305:5: (lv_charts_23_0= ruleChartFX )
                    {
                    // InternalJavaFXLang.g:305:5: (lv_charts_23_0= ruleChartFX )
                    // InternalJavaFXLang.g:306:6: lv_charts_23_0= ruleChartFX
                    {

                    						newCompositeNode(grammarAccess.getProjectFXAccess().getChartsChartFXParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_charts_23_0=ruleChartFX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    						}
                    						add(
                    							current,
                    							"charts",
                    							lv_charts_23_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.ChartFX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:323:4: ( (lv_charts_24_0= ruleChartFX ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==19||(LA8_0>=29 && LA8_0<=33)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:324:5: (lv_charts_24_0= ruleChartFX )
                    	    {
                    	    // InternalJavaFXLang.g:324:5: (lv_charts_24_0= ruleChartFX )
                    	    // InternalJavaFXLang.g:325:6: lv_charts_24_0= ruleChartFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getProjectFXAccess().getChartsChartFXParserRuleCall_8_3_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_charts_24_0=ruleChartFX();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getProjectFXRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"charts",
                    	    							lv_charts_24_0,
                    	    							"de.dc.emf.javafx.xtext.JavaFXLang.ChartFX");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_25, grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_26=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleChartFX"
    // InternalJavaFXLang.g:355:1: entryRuleChartFX returns [EObject current=null] : iv_ruleChartFX= ruleChartFX EOF ;
    public final EObject entryRuleChartFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChartFX = null;


        try {
            // InternalJavaFXLang.g:355:48: (iv_ruleChartFX= ruleChartFX EOF )
            // InternalJavaFXLang.g:356:2: iv_ruleChartFX= ruleChartFX EOF
            {
             newCompositeNode(grammarAccess.getChartFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChartFX=ruleChartFX();

            state._fsp--;

             current =iv_ruleChartFX; 
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
    // $ANTLR end "entryRuleChartFX"


    // $ANTLR start "ruleChartFX"
    // InternalJavaFXLang.g:362:1: ruleChartFX returns [EObject current=null] : (this_LineChartFX_0= ruleLineChartFX | this_PieChartFX_1= rulePieChartFX | this_AreaChartFX_2= ruleAreaChartFX | this_BubbleChartFX_3= ruleBubbleChartFX | this_ScatterChartFX_4= ruleScatterChartFX | this_BarChartFX_5= ruleBarChartFX ) ;
    public final EObject ruleChartFX() throws RecognitionException {
        EObject current = null;

        EObject this_LineChartFX_0 = null;

        EObject this_PieChartFX_1 = null;

        EObject this_AreaChartFX_2 = null;

        EObject this_BubbleChartFX_3 = null;

        EObject this_ScatterChartFX_4 = null;

        EObject this_BarChartFX_5 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:368:2: ( (this_LineChartFX_0= ruleLineChartFX | this_PieChartFX_1= rulePieChartFX | this_AreaChartFX_2= ruleAreaChartFX | this_BubbleChartFX_3= ruleBubbleChartFX | this_ScatterChartFX_4= ruleScatterChartFX | this_BarChartFX_5= ruleBarChartFX ) )
            // InternalJavaFXLang.g:369:2: (this_LineChartFX_0= ruleLineChartFX | this_PieChartFX_1= rulePieChartFX | this_AreaChartFX_2= ruleAreaChartFX | this_BubbleChartFX_3= ruleBubbleChartFX | this_ScatterChartFX_4= ruleScatterChartFX | this_BarChartFX_5= ruleBarChartFX )
            {
            // InternalJavaFXLang.g:369:2: (this_LineChartFX_0= ruleLineChartFX | this_PieChartFX_1= rulePieChartFX | this_AreaChartFX_2= ruleAreaChartFX | this_BubbleChartFX_3= ruleBubbleChartFX | this_ScatterChartFX_4= ruleScatterChartFX | this_BarChartFX_5= ruleBarChartFX )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt10=1;
                }
                break;
            case 32:
                {
                alt10=2;
                }
                break;
            case 31:
                {
                alt10=3;
                }
                break;
            case 30:
                {
                alt10=4;
                }
                break;
            case 29:
                {
                alt10=5;
                }
                break;
            case 19:
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
                    // InternalJavaFXLang.g:370:3: this_LineChartFX_0= ruleLineChartFX
                    {

                    			newCompositeNode(grammarAccess.getChartFXAccess().getLineChartFXParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LineChartFX_0=ruleLineChartFX();

                    state._fsp--;


                    			current = this_LineChartFX_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:379:3: this_PieChartFX_1= rulePieChartFX
                    {

                    			newCompositeNode(grammarAccess.getChartFXAccess().getPieChartFXParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PieChartFX_1=rulePieChartFX();

                    state._fsp--;


                    			current = this_PieChartFX_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJavaFXLang.g:388:3: this_AreaChartFX_2= ruleAreaChartFX
                    {

                    			newCompositeNode(grammarAccess.getChartFXAccess().getAreaChartFXParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AreaChartFX_2=ruleAreaChartFX();

                    state._fsp--;


                    			current = this_AreaChartFX_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJavaFXLang.g:397:3: this_BubbleChartFX_3= ruleBubbleChartFX
                    {

                    			newCompositeNode(grammarAccess.getChartFXAccess().getBubbleChartFXParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BubbleChartFX_3=ruleBubbleChartFX();

                    state._fsp--;


                    			current = this_BubbleChartFX_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJavaFXLang.g:406:3: this_ScatterChartFX_4= ruleScatterChartFX
                    {

                    			newCompositeNode(grammarAccess.getChartFXAccess().getScatterChartFXParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScatterChartFX_4=ruleScatterChartFX();

                    state._fsp--;


                    			current = this_ScatterChartFX_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJavaFXLang.g:415:3: this_BarChartFX_5= ruleBarChartFX
                    {

                    			newCompositeNode(grammarAccess.getChartFXAccess().getBarChartFXParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_BarChartFX_5=ruleBarChartFX();

                    state._fsp--;


                    			current = this_BarChartFX_5;
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
    // $ANTLR end "ruleChartFX"


    // $ANTLR start "entryRuleBarChartFX"
    // InternalJavaFXLang.g:427:1: entryRuleBarChartFX returns [EObject current=null] : iv_ruleBarChartFX= ruleBarChartFX EOF ;
    public final EObject entryRuleBarChartFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarChartFX = null;


        try {
            // InternalJavaFXLang.g:427:51: (iv_ruleBarChartFX= ruleBarChartFX EOF )
            // InternalJavaFXLang.g:428:2: iv_ruleBarChartFX= ruleBarChartFX EOF
            {
             newCompositeNode(grammarAccess.getBarChartFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBarChartFX=ruleBarChartFX();

            state._fsp--;

             current =iv_ruleBarChartFX; 
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
    // $ANTLR end "entryRuleBarChartFX"


    // $ANTLR start "ruleBarChartFX"
    // InternalJavaFXLang.g:434:1: ruleBarChartFX returns [EObject current=null] : ( () otherlv_1= 'BarChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' ) ;
    public final EObject ruleBarChartFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_legendSide_6_0 = null;

        AntlrDatatypeRuleToken lv_showLegend_8_0 = null;

        AntlrDatatypeRuleToken lv_title_10_0 = null;

        Enumerator lv_titleSide_12_0 = null;

        AntlrDatatypeRuleToken lv_xAxisLabel_14_0 = null;

        Enumerator lv_xAxisType_16_0 = null;

        AntlrDatatypeRuleToken lv_yAxisLabel_18_0 = null;

        Enumerator lv_yAxisType_20_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:440:2: ( ( () otherlv_1= 'BarChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' ) )
            // InternalJavaFXLang.g:441:2: ( () otherlv_1= 'BarChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' )
            {
            // InternalJavaFXLang.g:441:2: ( () otherlv_1= 'BarChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' )
            // InternalJavaFXLang.g:442:3: () otherlv_1= 'BarChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}'
            {
            // InternalJavaFXLang.g:442:3: ()
            // InternalJavaFXLang.g:443:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBarChartFXAccess().getBarChartFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBarChartFXAccess().getBarChartKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getBarChartFXAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getBarChartFXAccess().getNameKeyword_3());
            		
            // InternalJavaFXLang.g:461:3: ( (lv_name_4_0= ruleEString ) )
            // InternalJavaFXLang.g:462:4: (lv_name_4_0= ruleEString )
            {
            // InternalJavaFXLang.g:462:4: (lv_name_4_0= ruleEString )
            // InternalJavaFXLang.g:463:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBarChartFXAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBarChartFXRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaFXLang.g:480:3: (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJavaFXLang.g:481:4: otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getBarChartFXAccess().getLegendSideKeyword_5_0());
                    			
                    // InternalJavaFXLang.g:485:4: ( (lv_legendSide_6_0= ruleOrientation ) )
                    // InternalJavaFXLang.g:486:5: (lv_legendSide_6_0= ruleOrientation )
                    {
                    // InternalJavaFXLang.g:486:5: (lv_legendSide_6_0= ruleOrientation )
                    // InternalJavaFXLang.g:487:6: lv_legendSide_6_0= ruleOrientation
                    {

                    						newCompositeNode(grammarAccess.getBarChartFXAccess().getLegendSideOrientationEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_legendSide_6_0=ruleOrientation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartFXRule());
                    						}
                    						set(
                    							current,
                    							"legendSide",
                    							lv_legendSide_6_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.Orientation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:505:3: (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJavaFXLang.g:506:4: otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) )
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getBarChartFXAccess().getShowLegendKeyword_6_0());
                    			
                    // InternalJavaFXLang.g:510:4: ( (lv_showLegend_8_0= ruleEBoolean ) )
                    // InternalJavaFXLang.g:511:5: (lv_showLegend_8_0= ruleEBoolean )
                    {
                    // InternalJavaFXLang.g:511:5: (lv_showLegend_8_0= ruleEBoolean )
                    // InternalJavaFXLang.g:512:6: lv_showLegend_8_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getBarChartFXAccess().getShowLegendEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_showLegend_8_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartFXRule());
                    						}
                    						set(
                    							current,
                    							"showLegend",
                    							lv_showLegend_8_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:530:3: (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJavaFXLang.g:531:4: otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getBarChartFXAccess().getTitleKeyword_7_0());
                    			
                    // InternalJavaFXLang.g:535:4: ( (lv_title_10_0= ruleEString ) )
                    // InternalJavaFXLang.g:536:5: (lv_title_10_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:536:5: (lv_title_10_0= ruleEString )
                    // InternalJavaFXLang.g:537:6: lv_title_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarChartFXAccess().getTitleEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_title_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartFXRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_10_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:555:3: (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJavaFXLang.g:556:4: otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) )
                    {
                    otherlv_11=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getBarChartFXAccess().getTitleSideKeyword_8_0());
                    			
                    // InternalJavaFXLang.g:560:4: ( (lv_titleSide_12_0= ruleOrientation ) )
                    // InternalJavaFXLang.g:561:5: (lv_titleSide_12_0= ruleOrientation )
                    {
                    // InternalJavaFXLang.g:561:5: (lv_titleSide_12_0= ruleOrientation )
                    // InternalJavaFXLang.g:562:6: lv_titleSide_12_0= ruleOrientation
                    {

                    						newCompositeNode(grammarAccess.getBarChartFXAccess().getTitleSideOrientationEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_titleSide_12_0=ruleOrientation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartFXRule());
                    						}
                    						set(
                    							current,
                    							"titleSide",
                    							lv_titleSide_12_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.Orientation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:580:3: (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalJavaFXLang.g:581:4: otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getBarChartFXAccess().getXAxisLabelKeyword_9_0());
                    			
                    // InternalJavaFXLang.g:585:4: ( (lv_xAxisLabel_14_0= ruleEString ) )
                    // InternalJavaFXLang.g:586:5: (lv_xAxisLabel_14_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:586:5: (lv_xAxisLabel_14_0= ruleEString )
                    // InternalJavaFXLang.g:587:6: lv_xAxisLabel_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarChartFXAccess().getXAxisLabelEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_xAxisLabel_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartFXRule());
                    						}
                    						set(
                    							current,
                    							"xAxisLabel",
                    							lv_xAxisLabel_14_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:605:3: (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJavaFXLang.g:606:4: otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) )
                    {
                    otherlv_15=(Token)match(input,26,FOLLOW_28); 

                    				newLeafNode(otherlv_15, grammarAccess.getBarChartFXAccess().getXAxisTypeKeyword_10_0());
                    			
                    // InternalJavaFXLang.g:610:4: ( (lv_xAxisType_16_0= ruleAxisType ) )
                    // InternalJavaFXLang.g:611:5: (lv_xAxisType_16_0= ruleAxisType )
                    {
                    // InternalJavaFXLang.g:611:5: (lv_xAxisType_16_0= ruleAxisType )
                    // InternalJavaFXLang.g:612:6: lv_xAxisType_16_0= ruleAxisType
                    {

                    						newCompositeNode(grammarAccess.getBarChartFXAccess().getXAxisTypeAxisTypeEnumRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_xAxisType_16_0=ruleAxisType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartFXRule());
                    						}
                    						set(
                    							current,
                    							"xAxisType",
                    							lv_xAxisType_16_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.AxisType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:630:3: (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJavaFXLang.g:631:4: otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getBarChartFXAccess().getYAxisLabelKeyword_11_0());
                    			
                    // InternalJavaFXLang.g:635:4: ( (lv_yAxisLabel_18_0= ruleEString ) )
                    // InternalJavaFXLang.g:636:5: (lv_yAxisLabel_18_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:636:5: (lv_yAxisLabel_18_0= ruleEString )
                    // InternalJavaFXLang.g:637:6: lv_yAxisLabel_18_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarChartFXAccess().getYAxisLabelEStringParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_yAxisLabel_18_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartFXRule());
                    						}
                    						set(
                    							current,
                    							"yAxisLabel",
                    							lv_yAxisLabel_18_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:655:3: (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJavaFXLang.g:656:4: otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) )
                    {
                    otherlv_19=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_19, grammarAccess.getBarChartFXAccess().getYAxisTypeKeyword_12_0());
                    			
                    // InternalJavaFXLang.g:660:4: ( (lv_yAxisType_20_0= ruleAxisType ) )
                    // InternalJavaFXLang.g:661:5: (lv_yAxisType_20_0= ruleAxisType )
                    {
                    // InternalJavaFXLang.g:661:5: (lv_yAxisType_20_0= ruleAxisType )
                    // InternalJavaFXLang.g:662:6: lv_yAxisType_20_0= ruleAxisType
                    {

                    						newCompositeNode(grammarAccess.getBarChartFXAccess().getYAxisTypeAxisTypeEnumRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_yAxisType_20_0=ruleAxisType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartFXRule());
                    						}
                    						set(
                    							current,
                    							"yAxisType",
                    							lv_yAxisType_20_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.AxisType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getBarChartFXAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleBarChartFX"


    // $ANTLR start "entryRuleScatterChartFX"
    // InternalJavaFXLang.g:688:1: entryRuleScatterChartFX returns [EObject current=null] : iv_ruleScatterChartFX= ruleScatterChartFX EOF ;
    public final EObject entryRuleScatterChartFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScatterChartFX = null;


        try {
            // InternalJavaFXLang.g:688:55: (iv_ruleScatterChartFX= ruleScatterChartFX EOF )
            // InternalJavaFXLang.g:689:2: iv_ruleScatterChartFX= ruleScatterChartFX EOF
            {
             newCompositeNode(grammarAccess.getScatterChartFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScatterChartFX=ruleScatterChartFX();

            state._fsp--;

             current =iv_ruleScatterChartFX; 
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
    // $ANTLR end "entryRuleScatterChartFX"


    // $ANTLR start "ruleScatterChartFX"
    // InternalJavaFXLang.g:695:1: ruleScatterChartFX returns [EObject current=null] : ( () otherlv_1= 'ScatterChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' ) ;
    public final EObject ruleScatterChartFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_legendSide_6_0 = null;

        AntlrDatatypeRuleToken lv_showLegend_8_0 = null;

        AntlrDatatypeRuleToken lv_title_10_0 = null;

        Enumerator lv_titleSide_12_0 = null;

        AntlrDatatypeRuleToken lv_xAxisLabel_14_0 = null;

        Enumerator lv_xAxisType_16_0 = null;

        AntlrDatatypeRuleToken lv_yAxisLabel_18_0 = null;

        Enumerator lv_yAxisType_20_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:701:2: ( ( () otherlv_1= 'ScatterChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' ) )
            // InternalJavaFXLang.g:702:2: ( () otherlv_1= 'ScatterChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' )
            {
            // InternalJavaFXLang.g:702:2: ( () otherlv_1= 'ScatterChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' )
            // InternalJavaFXLang.g:703:3: () otherlv_1= 'ScatterChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}'
            {
            // InternalJavaFXLang.g:703:3: ()
            // InternalJavaFXLang.g:704:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScatterChartFXAccess().getScatterChartFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getScatterChartFXAccess().getScatterChartKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getScatterChartFXAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getScatterChartFXAccess().getNameKeyword_3());
            		
            // InternalJavaFXLang.g:722:3: ( (lv_name_4_0= ruleEString ) )
            // InternalJavaFXLang.g:723:4: (lv_name_4_0= ruleEString )
            {
            // InternalJavaFXLang.g:723:4: (lv_name_4_0= ruleEString )
            // InternalJavaFXLang.g:724:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getScatterChartFXAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScatterChartFXRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaFXLang.g:741:3: (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJavaFXLang.g:742:4: otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getScatterChartFXAccess().getLegendSideKeyword_5_0());
                    			
                    // InternalJavaFXLang.g:746:4: ( (lv_legendSide_6_0= ruleOrientation ) )
                    // InternalJavaFXLang.g:747:5: (lv_legendSide_6_0= ruleOrientation )
                    {
                    // InternalJavaFXLang.g:747:5: (lv_legendSide_6_0= ruleOrientation )
                    // InternalJavaFXLang.g:748:6: lv_legendSide_6_0= ruleOrientation
                    {

                    						newCompositeNode(grammarAccess.getScatterChartFXAccess().getLegendSideOrientationEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_legendSide_6_0=ruleOrientation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScatterChartFXRule());
                    						}
                    						set(
                    							current,
                    							"legendSide",
                    							lv_legendSide_6_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.Orientation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:766:3: (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJavaFXLang.g:767:4: otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) )
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getScatterChartFXAccess().getShowLegendKeyword_6_0());
                    			
                    // InternalJavaFXLang.g:771:4: ( (lv_showLegend_8_0= ruleEBoolean ) )
                    // InternalJavaFXLang.g:772:5: (lv_showLegend_8_0= ruleEBoolean )
                    {
                    // InternalJavaFXLang.g:772:5: (lv_showLegend_8_0= ruleEBoolean )
                    // InternalJavaFXLang.g:773:6: lv_showLegend_8_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getScatterChartFXAccess().getShowLegendEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_showLegend_8_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScatterChartFXRule());
                    						}
                    						set(
                    							current,
                    							"showLegend",
                    							lv_showLegend_8_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:791:3: (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJavaFXLang.g:792:4: otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getScatterChartFXAccess().getTitleKeyword_7_0());
                    			
                    // InternalJavaFXLang.g:796:4: ( (lv_title_10_0= ruleEString ) )
                    // InternalJavaFXLang.g:797:5: (lv_title_10_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:797:5: (lv_title_10_0= ruleEString )
                    // InternalJavaFXLang.g:798:6: lv_title_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getScatterChartFXAccess().getTitleEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_title_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScatterChartFXRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_10_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:816:3: (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJavaFXLang.g:817:4: otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) )
                    {
                    otherlv_11=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getScatterChartFXAccess().getTitleSideKeyword_8_0());
                    			
                    // InternalJavaFXLang.g:821:4: ( (lv_titleSide_12_0= ruleOrientation ) )
                    // InternalJavaFXLang.g:822:5: (lv_titleSide_12_0= ruleOrientation )
                    {
                    // InternalJavaFXLang.g:822:5: (lv_titleSide_12_0= ruleOrientation )
                    // InternalJavaFXLang.g:823:6: lv_titleSide_12_0= ruleOrientation
                    {

                    						newCompositeNode(grammarAccess.getScatterChartFXAccess().getTitleSideOrientationEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_titleSide_12_0=ruleOrientation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScatterChartFXRule());
                    						}
                    						set(
                    							current,
                    							"titleSide",
                    							lv_titleSide_12_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.Orientation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:841:3: (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalJavaFXLang.g:842:4: otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getScatterChartFXAccess().getXAxisLabelKeyword_9_0());
                    			
                    // InternalJavaFXLang.g:846:4: ( (lv_xAxisLabel_14_0= ruleEString ) )
                    // InternalJavaFXLang.g:847:5: (lv_xAxisLabel_14_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:847:5: (lv_xAxisLabel_14_0= ruleEString )
                    // InternalJavaFXLang.g:848:6: lv_xAxisLabel_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getScatterChartFXAccess().getXAxisLabelEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_xAxisLabel_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScatterChartFXRule());
                    						}
                    						set(
                    							current,
                    							"xAxisLabel",
                    							lv_xAxisLabel_14_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:866:3: (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJavaFXLang.g:867:4: otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) )
                    {
                    otherlv_15=(Token)match(input,26,FOLLOW_28); 

                    				newLeafNode(otherlv_15, grammarAccess.getScatterChartFXAccess().getXAxisTypeKeyword_10_0());
                    			
                    // InternalJavaFXLang.g:871:4: ( (lv_xAxisType_16_0= ruleAxisType ) )
                    // InternalJavaFXLang.g:872:5: (lv_xAxisType_16_0= ruleAxisType )
                    {
                    // InternalJavaFXLang.g:872:5: (lv_xAxisType_16_0= ruleAxisType )
                    // InternalJavaFXLang.g:873:6: lv_xAxisType_16_0= ruleAxisType
                    {

                    						newCompositeNode(grammarAccess.getScatterChartFXAccess().getXAxisTypeAxisTypeEnumRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_xAxisType_16_0=ruleAxisType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScatterChartFXRule());
                    						}
                    						set(
                    							current,
                    							"xAxisType",
                    							lv_xAxisType_16_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.AxisType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:891:3: (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJavaFXLang.g:892:4: otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getScatterChartFXAccess().getYAxisLabelKeyword_11_0());
                    			
                    // InternalJavaFXLang.g:896:4: ( (lv_yAxisLabel_18_0= ruleEString ) )
                    // InternalJavaFXLang.g:897:5: (lv_yAxisLabel_18_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:897:5: (lv_yAxisLabel_18_0= ruleEString )
                    // InternalJavaFXLang.g:898:6: lv_yAxisLabel_18_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getScatterChartFXAccess().getYAxisLabelEStringParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_yAxisLabel_18_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScatterChartFXRule());
                    						}
                    						set(
                    							current,
                    							"yAxisLabel",
                    							lv_yAxisLabel_18_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:916:3: (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJavaFXLang.g:917:4: otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) )
                    {
                    otherlv_19=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_19, grammarAccess.getScatterChartFXAccess().getYAxisTypeKeyword_12_0());
                    			
                    // InternalJavaFXLang.g:921:4: ( (lv_yAxisType_20_0= ruleAxisType ) )
                    // InternalJavaFXLang.g:922:5: (lv_yAxisType_20_0= ruleAxisType )
                    {
                    // InternalJavaFXLang.g:922:5: (lv_yAxisType_20_0= ruleAxisType )
                    // InternalJavaFXLang.g:923:6: lv_yAxisType_20_0= ruleAxisType
                    {

                    						newCompositeNode(grammarAccess.getScatterChartFXAccess().getYAxisTypeAxisTypeEnumRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_yAxisType_20_0=ruleAxisType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScatterChartFXRule());
                    						}
                    						set(
                    							current,
                    							"yAxisType",
                    							lv_yAxisType_20_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.AxisType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getScatterChartFXAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleScatterChartFX"


    // $ANTLR start "entryRuleBubbleChartFX"
    // InternalJavaFXLang.g:949:1: entryRuleBubbleChartFX returns [EObject current=null] : iv_ruleBubbleChartFX= ruleBubbleChartFX EOF ;
    public final EObject entryRuleBubbleChartFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBubbleChartFX = null;


        try {
            // InternalJavaFXLang.g:949:54: (iv_ruleBubbleChartFX= ruleBubbleChartFX EOF )
            // InternalJavaFXLang.g:950:2: iv_ruleBubbleChartFX= ruleBubbleChartFX EOF
            {
             newCompositeNode(grammarAccess.getBubbleChartFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBubbleChartFX=ruleBubbleChartFX();

            state._fsp--;

             current =iv_ruleBubbleChartFX; 
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
    // $ANTLR end "entryRuleBubbleChartFX"


    // $ANTLR start "ruleBubbleChartFX"
    // InternalJavaFXLang.g:956:1: ruleBubbleChartFX returns [EObject current=null] : ( () otherlv_1= 'BubbleChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' ) ;
    public final EObject ruleBubbleChartFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_legendSide_6_0 = null;

        AntlrDatatypeRuleToken lv_showLegend_8_0 = null;

        AntlrDatatypeRuleToken lv_title_10_0 = null;

        Enumerator lv_titleSide_12_0 = null;

        AntlrDatatypeRuleToken lv_xAxisLabel_14_0 = null;

        Enumerator lv_xAxisType_16_0 = null;

        AntlrDatatypeRuleToken lv_yAxisLabel_18_0 = null;

        Enumerator lv_yAxisType_20_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:962:2: ( ( () otherlv_1= 'BubbleChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' ) )
            // InternalJavaFXLang.g:963:2: ( () otherlv_1= 'BubbleChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' )
            {
            // InternalJavaFXLang.g:963:2: ( () otherlv_1= 'BubbleChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' )
            // InternalJavaFXLang.g:964:3: () otherlv_1= 'BubbleChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}'
            {
            // InternalJavaFXLang.g:964:3: ()
            // InternalJavaFXLang.g:965:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBubbleChartFXAccess().getBubbleChartFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBubbleChartFXAccess().getBubbleChartKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getBubbleChartFXAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getBubbleChartFXAccess().getNameKeyword_3());
            		
            // InternalJavaFXLang.g:983:3: ( (lv_name_4_0= ruleEString ) )
            // InternalJavaFXLang.g:984:4: (lv_name_4_0= ruleEString )
            {
            // InternalJavaFXLang.g:984:4: (lv_name_4_0= ruleEString )
            // InternalJavaFXLang.g:985:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBubbleChartFXAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBubbleChartFXRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaFXLang.g:1002:3: (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==21) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJavaFXLang.g:1003:4: otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getBubbleChartFXAccess().getLegendSideKeyword_5_0());
                    			
                    // InternalJavaFXLang.g:1007:4: ( (lv_legendSide_6_0= ruleOrientation ) )
                    // InternalJavaFXLang.g:1008:5: (lv_legendSide_6_0= ruleOrientation )
                    {
                    // InternalJavaFXLang.g:1008:5: (lv_legendSide_6_0= ruleOrientation )
                    // InternalJavaFXLang.g:1009:6: lv_legendSide_6_0= ruleOrientation
                    {

                    						newCompositeNode(grammarAccess.getBubbleChartFXAccess().getLegendSideOrientationEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_legendSide_6_0=ruleOrientation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBubbleChartFXRule());
                    						}
                    						set(
                    							current,
                    							"legendSide",
                    							lv_legendSide_6_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.Orientation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1027:3: (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJavaFXLang.g:1028:4: otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) )
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getBubbleChartFXAccess().getShowLegendKeyword_6_0());
                    			
                    // InternalJavaFXLang.g:1032:4: ( (lv_showLegend_8_0= ruleEBoolean ) )
                    // InternalJavaFXLang.g:1033:5: (lv_showLegend_8_0= ruleEBoolean )
                    {
                    // InternalJavaFXLang.g:1033:5: (lv_showLegend_8_0= ruleEBoolean )
                    // InternalJavaFXLang.g:1034:6: lv_showLegend_8_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getBubbleChartFXAccess().getShowLegendEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_showLegend_8_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBubbleChartFXRule());
                    						}
                    						set(
                    							current,
                    							"showLegend",
                    							lv_showLegend_8_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1052:3: (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalJavaFXLang.g:1053:4: otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getBubbleChartFXAccess().getTitleKeyword_7_0());
                    			
                    // InternalJavaFXLang.g:1057:4: ( (lv_title_10_0= ruleEString ) )
                    // InternalJavaFXLang.g:1058:5: (lv_title_10_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:1058:5: (lv_title_10_0= ruleEString )
                    // InternalJavaFXLang.g:1059:6: lv_title_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBubbleChartFXAccess().getTitleEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_title_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBubbleChartFXRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_10_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1077:3: (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==24) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalJavaFXLang.g:1078:4: otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) )
                    {
                    otherlv_11=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getBubbleChartFXAccess().getTitleSideKeyword_8_0());
                    			
                    // InternalJavaFXLang.g:1082:4: ( (lv_titleSide_12_0= ruleOrientation ) )
                    // InternalJavaFXLang.g:1083:5: (lv_titleSide_12_0= ruleOrientation )
                    {
                    // InternalJavaFXLang.g:1083:5: (lv_titleSide_12_0= ruleOrientation )
                    // InternalJavaFXLang.g:1084:6: lv_titleSide_12_0= ruleOrientation
                    {

                    						newCompositeNode(grammarAccess.getBubbleChartFXAccess().getTitleSideOrientationEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_titleSide_12_0=ruleOrientation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBubbleChartFXRule());
                    						}
                    						set(
                    							current,
                    							"titleSide",
                    							lv_titleSide_12_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.Orientation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1102:3: (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==25) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalJavaFXLang.g:1103:4: otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getBubbleChartFXAccess().getXAxisLabelKeyword_9_0());
                    			
                    // InternalJavaFXLang.g:1107:4: ( (lv_xAxisLabel_14_0= ruleEString ) )
                    // InternalJavaFXLang.g:1108:5: (lv_xAxisLabel_14_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:1108:5: (lv_xAxisLabel_14_0= ruleEString )
                    // InternalJavaFXLang.g:1109:6: lv_xAxisLabel_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBubbleChartFXAccess().getXAxisLabelEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_xAxisLabel_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBubbleChartFXRule());
                    						}
                    						set(
                    							current,
                    							"xAxisLabel",
                    							lv_xAxisLabel_14_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1127:3: (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalJavaFXLang.g:1128:4: otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) )
                    {
                    otherlv_15=(Token)match(input,26,FOLLOW_28); 

                    				newLeafNode(otherlv_15, grammarAccess.getBubbleChartFXAccess().getXAxisTypeKeyword_10_0());
                    			
                    // InternalJavaFXLang.g:1132:4: ( (lv_xAxisType_16_0= ruleAxisType ) )
                    // InternalJavaFXLang.g:1133:5: (lv_xAxisType_16_0= ruleAxisType )
                    {
                    // InternalJavaFXLang.g:1133:5: (lv_xAxisType_16_0= ruleAxisType )
                    // InternalJavaFXLang.g:1134:6: lv_xAxisType_16_0= ruleAxisType
                    {

                    						newCompositeNode(grammarAccess.getBubbleChartFXAccess().getXAxisTypeAxisTypeEnumRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_xAxisType_16_0=ruleAxisType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBubbleChartFXRule());
                    						}
                    						set(
                    							current,
                    							"xAxisType",
                    							lv_xAxisType_16_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.AxisType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1152:3: (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalJavaFXLang.g:1153:4: otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getBubbleChartFXAccess().getYAxisLabelKeyword_11_0());
                    			
                    // InternalJavaFXLang.g:1157:4: ( (lv_yAxisLabel_18_0= ruleEString ) )
                    // InternalJavaFXLang.g:1158:5: (lv_yAxisLabel_18_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:1158:5: (lv_yAxisLabel_18_0= ruleEString )
                    // InternalJavaFXLang.g:1159:6: lv_yAxisLabel_18_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBubbleChartFXAccess().getYAxisLabelEStringParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_yAxisLabel_18_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBubbleChartFXRule());
                    						}
                    						set(
                    							current,
                    							"yAxisLabel",
                    							lv_yAxisLabel_18_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1177:3: (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalJavaFXLang.g:1178:4: otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) )
                    {
                    otherlv_19=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_19, grammarAccess.getBubbleChartFXAccess().getYAxisTypeKeyword_12_0());
                    			
                    // InternalJavaFXLang.g:1182:4: ( (lv_yAxisType_20_0= ruleAxisType ) )
                    // InternalJavaFXLang.g:1183:5: (lv_yAxisType_20_0= ruleAxisType )
                    {
                    // InternalJavaFXLang.g:1183:5: (lv_yAxisType_20_0= ruleAxisType )
                    // InternalJavaFXLang.g:1184:6: lv_yAxisType_20_0= ruleAxisType
                    {

                    						newCompositeNode(grammarAccess.getBubbleChartFXAccess().getYAxisTypeAxisTypeEnumRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_yAxisType_20_0=ruleAxisType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBubbleChartFXRule());
                    						}
                    						set(
                    							current,
                    							"yAxisType",
                    							lv_yAxisType_20_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.AxisType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getBubbleChartFXAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleBubbleChartFX"


    // $ANTLR start "entryRuleAreaChartFX"
    // InternalJavaFXLang.g:1210:1: entryRuleAreaChartFX returns [EObject current=null] : iv_ruleAreaChartFX= ruleAreaChartFX EOF ;
    public final EObject entryRuleAreaChartFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAreaChartFX = null;


        try {
            // InternalJavaFXLang.g:1210:52: (iv_ruleAreaChartFX= ruleAreaChartFX EOF )
            // InternalJavaFXLang.g:1211:2: iv_ruleAreaChartFX= ruleAreaChartFX EOF
            {
             newCompositeNode(grammarAccess.getAreaChartFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAreaChartFX=ruleAreaChartFX();

            state._fsp--;

             current =iv_ruleAreaChartFX; 
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
    // $ANTLR end "entryRuleAreaChartFX"


    // $ANTLR start "ruleAreaChartFX"
    // InternalJavaFXLang.g:1217:1: ruleAreaChartFX returns [EObject current=null] : ( () otherlv_1= 'AreaChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' ) ;
    public final EObject ruleAreaChartFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_legendSide_6_0 = null;

        AntlrDatatypeRuleToken lv_showLegend_8_0 = null;

        AntlrDatatypeRuleToken lv_title_10_0 = null;

        Enumerator lv_titleSide_12_0 = null;

        AntlrDatatypeRuleToken lv_xAxisLabel_14_0 = null;

        Enumerator lv_xAxisType_16_0 = null;

        AntlrDatatypeRuleToken lv_yAxisLabel_18_0 = null;

        Enumerator lv_yAxisType_20_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:1223:2: ( ( () otherlv_1= 'AreaChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' ) )
            // InternalJavaFXLang.g:1224:2: ( () otherlv_1= 'AreaChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' )
            {
            // InternalJavaFXLang.g:1224:2: ( () otherlv_1= 'AreaChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' )
            // InternalJavaFXLang.g:1225:3: () otherlv_1= 'AreaChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}'
            {
            // InternalJavaFXLang.g:1225:3: ()
            // InternalJavaFXLang.g:1226:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAreaChartFXAccess().getAreaChartFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAreaChartFXAccess().getAreaChartKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getAreaChartFXAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAreaChartFXAccess().getNameKeyword_3());
            		
            // InternalJavaFXLang.g:1244:3: ( (lv_name_4_0= ruleEString ) )
            // InternalJavaFXLang.g:1245:4: (lv_name_4_0= ruleEString )
            {
            // InternalJavaFXLang.g:1245:4: (lv_name_4_0= ruleEString )
            // InternalJavaFXLang.g:1246:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAreaChartFXAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAreaChartFXRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaFXLang.g:1263:3: (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==21) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalJavaFXLang.g:1264:4: otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getAreaChartFXAccess().getLegendSideKeyword_5_0());
                    			
                    // InternalJavaFXLang.g:1268:4: ( (lv_legendSide_6_0= ruleOrientation ) )
                    // InternalJavaFXLang.g:1269:5: (lv_legendSide_6_0= ruleOrientation )
                    {
                    // InternalJavaFXLang.g:1269:5: (lv_legendSide_6_0= ruleOrientation )
                    // InternalJavaFXLang.g:1270:6: lv_legendSide_6_0= ruleOrientation
                    {

                    						newCompositeNode(grammarAccess.getAreaChartFXAccess().getLegendSideOrientationEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_legendSide_6_0=ruleOrientation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAreaChartFXRule());
                    						}
                    						set(
                    							current,
                    							"legendSide",
                    							lv_legendSide_6_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.Orientation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1288:3: (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==22) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalJavaFXLang.g:1289:4: otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) )
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getAreaChartFXAccess().getShowLegendKeyword_6_0());
                    			
                    // InternalJavaFXLang.g:1293:4: ( (lv_showLegend_8_0= ruleEBoolean ) )
                    // InternalJavaFXLang.g:1294:5: (lv_showLegend_8_0= ruleEBoolean )
                    {
                    // InternalJavaFXLang.g:1294:5: (lv_showLegend_8_0= ruleEBoolean )
                    // InternalJavaFXLang.g:1295:6: lv_showLegend_8_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getAreaChartFXAccess().getShowLegendEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_showLegend_8_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAreaChartFXRule());
                    						}
                    						set(
                    							current,
                    							"showLegend",
                    							lv_showLegend_8_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1313:3: (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==23) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalJavaFXLang.g:1314:4: otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getAreaChartFXAccess().getTitleKeyword_7_0());
                    			
                    // InternalJavaFXLang.g:1318:4: ( (lv_title_10_0= ruleEString ) )
                    // InternalJavaFXLang.g:1319:5: (lv_title_10_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:1319:5: (lv_title_10_0= ruleEString )
                    // InternalJavaFXLang.g:1320:6: lv_title_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAreaChartFXAccess().getTitleEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_title_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAreaChartFXRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_10_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1338:3: (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==24) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalJavaFXLang.g:1339:4: otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) )
                    {
                    otherlv_11=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getAreaChartFXAccess().getTitleSideKeyword_8_0());
                    			
                    // InternalJavaFXLang.g:1343:4: ( (lv_titleSide_12_0= ruleOrientation ) )
                    // InternalJavaFXLang.g:1344:5: (lv_titleSide_12_0= ruleOrientation )
                    {
                    // InternalJavaFXLang.g:1344:5: (lv_titleSide_12_0= ruleOrientation )
                    // InternalJavaFXLang.g:1345:6: lv_titleSide_12_0= ruleOrientation
                    {

                    						newCompositeNode(grammarAccess.getAreaChartFXAccess().getTitleSideOrientationEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_titleSide_12_0=ruleOrientation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAreaChartFXRule());
                    						}
                    						set(
                    							current,
                    							"titleSide",
                    							lv_titleSide_12_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.Orientation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1363:3: (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==25) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalJavaFXLang.g:1364:4: otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getAreaChartFXAccess().getXAxisLabelKeyword_9_0());
                    			
                    // InternalJavaFXLang.g:1368:4: ( (lv_xAxisLabel_14_0= ruleEString ) )
                    // InternalJavaFXLang.g:1369:5: (lv_xAxisLabel_14_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:1369:5: (lv_xAxisLabel_14_0= ruleEString )
                    // InternalJavaFXLang.g:1370:6: lv_xAxisLabel_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAreaChartFXAccess().getXAxisLabelEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_xAxisLabel_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAreaChartFXRule());
                    						}
                    						set(
                    							current,
                    							"xAxisLabel",
                    							lv_xAxisLabel_14_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1388:3: (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==26) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalJavaFXLang.g:1389:4: otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) )
                    {
                    otherlv_15=(Token)match(input,26,FOLLOW_28); 

                    				newLeafNode(otherlv_15, grammarAccess.getAreaChartFXAccess().getXAxisTypeKeyword_10_0());
                    			
                    // InternalJavaFXLang.g:1393:4: ( (lv_xAxisType_16_0= ruleAxisType ) )
                    // InternalJavaFXLang.g:1394:5: (lv_xAxisType_16_0= ruleAxisType )
                    {
                    // InternalJavaFXLang.g:1394:5: (lv_xAxisType_16_0= ruleAxisType )
                    // InternalJavaFXLang.g:1395:6: lv_xAxisType_16_0= ruleAxisType
                    {

                    						newCompositeNode(grammarAccess.getAreaChartFXAccess().getXAxisTypeAxisTypeEnumRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_xAxisType_16_0=ruleAxisType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAreaChartFXRule());
                    						}
                    						set(
                    							current,
                    							"xAxisType",
                    							lv_xAxisType_16_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.AxisType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1413:3: (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==27) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalJavaFXLang.g:1414:4: otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getAreaChartFXAccess().getYAxisLabelKeyword_11_0());
                    			
                    // InternalJavaFXLang.g:1418:4: ( (lv_yAxisLabel_18_0= ruleEString ) )
                    // InternalJavaFXLang.g:1419:5: (lv_yAxisLabel_18_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:1419:5: (lv_yAxisLabel_18_0= ruleEString )
                    // InternalJavaFXLang.g:1420:6: lv_yAxisLabel_18_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAreaChartFXAccess().getYAxisLabelEStringParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_yAxisLabel_18_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAreaChartFXRule());
                    						}
                    						set(
                    							current,
                    							"yAxisLabel",
                    							lv_yAxisLabel_18_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1438:3: (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==28) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalJavaFXLang.g:1439:4: otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) )
                    {
                    otherlv_19=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_19, grammarAccess.getAreaChartFXAccess().getYAxisTypeKeyword_12_0());
                    			
                    // InternalJavaFXLang.g:1443:4: ( (lv_yAxisType_20_0= ruleAxisType ) )
                    // InternalJavaFXLang.g:1444:5: (lv_yAxisType_20_0= ruleAxisType )
                    {
                    // InternalJavaFXLang.g:1444:5: (lv_yAxisType_20_0= ruleAxisType )
                    // InternalJavaFXLang.g:1445:6: lv_yAxisType_20_0= ruleAxisType
                    {

                    						newCompositeNode(grammarAccess.getAreaChartFXAccess().getYAxisTypeAxisTypeEnumRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_yAxisType_20_0=ruleAxisType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAreaChartFXRule());
                    						}
                    						set(
                    							current,
                    							"yAxisType",
                    							lv_yAxisType_20_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.AxisType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getAreaChartFXAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleAreaChartFX"


    // $ANTLR start "entryRulePieChartFX"
    // InternalJavaFXLang.g:1471:1: entryRulePieChartFX returns [EObject current=null] : iv_rulePieChartFX= rulePieChartFX EOF ;
    public final EObject entryRulePieChartFX() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePieChartFX = null;


        try {
            // InternalJavaFXLang.g:1471:51: (iv_rulePieChartFX= rulePieChartFX EOF )
            // InternalJavaFXLang.g:1472:2: iv_rulePieChartFX= rulePieChartFX EOF
            {
             newCompositeNode(grammarAccess.getPieChartFXRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePieChartFX=rulePieChartFX();

            state._fsp--;

             current =iv_rulePieChartFX; 
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
    // $ANTLR end "entryRulePieChartFX"


    // $ANTLR start "rulePieChartFX"
    // InternalJavaFXLang.g:1478:1: rulePieChartFX returns [EObject current=null] : ( () otherlv_1= 'PieChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? otherlv_13= '}' ) ;
    public final EObject rulePieChartFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_legendSide_6_0 = null;

        AntlrDatatypeRuleToken lv_showLegend_8_0 = null;

        AntlrDatatypeRuleToken lv_title_10_0 = null;

        Enumerator lv_titleSide_12_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:1484:2: ( ( () otherlv_1= 'PieChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? otherlv_13= '}' ) )
            // InternalJavaFXLang.g:1485:2: ( () otherlv_1= 'PieChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? otherlv_13= '}' )
            {
            // InternalJavaFXLang.g:1485:2: ( () otherlv_1= 'PieChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? otherlv_13= '}' )
            // InternalJavaFXLang.g:1486:3: () otherlv_1= 'PieChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? otherlv_13= '}'
            {
            // InternalJavaFXLang.g:1486:3: ()
            // InternalJavaFXLang.g:1487:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPieChartFXAccess().getPieChartFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPieChartFXAccess().getPieChartKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getPieChartFXAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPieChartFXAccess().getNameKeyword_3());
            		
            // InternalJavaFXLang.g:1505:3: ( (lv_name_4_0= ruleEString ) )
            // InternalJavaFXLang.g:1506:4: (lv_name_4_0= ruleEString )
            {
            // InternalJavaFXLang.g:1506:4: (lv_name_4_0= ruleEString )
            // InternalJavaFXLang.g:1507:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPieChartFXAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPieChartFXRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaFXLang.g:1524:3: (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==21) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalJavaFXLang.g:1525:4: otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getPieChartFXAccess().getLegendSideKeyword_5_0());
                    			
                    // InternalJavaFXLang.g:1529:4: ( (lv_legendSide_6_0= ruleOrientation ) )
                    // InternalJavaFXLang.g:1530:5: (lv_legendSide_6_0= ruleOrientation )
                    {
                    // InternalJavaFXLang.g:1530:5: (lv_legendSide_6_0= ruleOrientation )
                    // InternalJavaFXLang.g:1531:6: lv_legendSide_6_0= ruleOrientation
                    {

                    						newCompositeNode(grammarAccess.getPieChartFXAccess().getLegendSideOrientationEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_legendSide_6_0=ruleOrientation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPieChartFXRule());
                    						}
                    						set(
                    							current,
                    							"legendSide",
                    							lv_legendSide_6_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.Orientation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1549:3: (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==22) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalJavaFXLang.g:1550:4: otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) )
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getPieChartFXAccess().getShowLegendKeyword_6_0());
                    			
                    // InternalJavaFXLang.g:1554:4: ( (lv_showLegend_8_0= ruleEBoolean ) )
                    // InternalJavaFXLang.g:1555:5: (lv_showLegend_8_0= ruleEBoolean )
                    {
                    // InternalJavaFXLang.g:1555:5: (lv_showLegend_8_0= ruleEBoolean )
                    // InternalJavaFXLang.g:1556:6: lv_showLegend_8_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getPieChartFXAccess().getShowLegendEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_showLegend_8_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPieChartFXRule());
                    						}
                    						set(
                    							current,
                    							"showLegend",
                    							lv_showLegend_8_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1574:3: (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==23) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalJavaFXLang.g:1575:4: otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getPieChartFXAccess().getTitleKeyword_7_0());
                    			
                    // InternalJavaFXLang.g:1579:4: ( (lv_title_10_0= ruleEString ) )
                    // InternalJavaFXLang.g:1580:5: (lv_title_10_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:1580:5: (lv_title_10_0= ruleEString )
                    // InternalJavaFXLang.g:1581:6: lv_title_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPieChartFXAccess().getTitleEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_title_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPieChartFXRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_10_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1599:3: (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalJavaFXLang.g:1600:4: otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) )
                    {
                    otherlv_11=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getPieChartFXAccess().getTitleSideKeyword_8_0());
                    			
                    // InternalJavaFXLang.g:1604:4: ( (lv_titleSide_12_0= ruleOrientation ) )
                    // InternalJavaFXLang.g:1605:5: (lv_titleSide_12_0= ruleOrientation )
                    {
                    // InternalJavaFXLang.g:1605:5: (lv_titleSide_12_0= ruleOrientation )
                    // InternalJavaFXLang.g:1606:6: lv_titleSide_12_0= ruleOrientation
                    {

                    						newCompositeNode(grammarAccess.getPieChartFXAccess().getTitleSideOrientationEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_titleSide_12_0=ruleOrientation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPieChartFXRule());
                    						}
                    						set(
                    							current,
                    							"titleSide",
                    							lv_titleSide_12_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.Orientation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getPieChartFXAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "rulePieChartFX"


    // $ANTLR start "entryRuleLineChartFX"
    // InternalJavaFXLang.g:1632:1: entryRuleLineChartFX returns [EObject current=null] : iv_ruleLineChartFX= ruleLineChartFX EOF ;
    public final EObject entryRuleLineChartFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineChartFX = null;


        try {
            // InternalJavaFXLang.g:1632:52: (iv_ruleLineChartFX= ruleLineChartFX EOF )
            // InternalJavaFXLang.g:1633:2: iv_ruleLineChartFX= ruleLineChartFX EOF
            {
             newCompositeNode(grammarAccess.getLineChartFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineChartFX=ruleLineChartFX();

            state._fsp--;

             current =iv_ruleLineChartFX; 
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
    // $ANTLR end "entryRuleLineChartFX"


    // $ANTLR start "ruleLineChartFX"
    // InternalJavaFXLang.g:1639:1: ruleLineChartFX returns [EObject current=null] : ( () otherlv_1= 'LineChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' ) ;
    public final EObject ruleLineChartFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_legendSide_6_0 = null;

        AntlrDatatypeRuleToken lv_showLegend_8_0 = null;

        AntlrDatatypeRuleToken lv_title_10_0 = null;

        Enumerator lv_titleSide_12_0 = null;

        AntlrDatatypeRuleToken lv_xAxisLabel_14_0 = null;

        Enumerator lv_xAxisType_16_0 = null;

        AntlrDatatypeRuleToken lv_yAxisLabel_18_0 = null;

        Enumerator lv_yAxisType_20_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:1645:2: ( ( () otherlv_1= 'LineChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' ) )
            // InternalJavaFXLang.g:1646:2: ( () otherlv_1= 'LineChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' )
            {
            // InternalJavaFXLang.g:1646:2: ( () otherlv_1= 'LineChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}' )
            // InternalJavaFXLang.g:1647:3: () otherlv_1= 'LineChart' otherlv_2= '{' otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )? (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )? (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )? (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )? (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )? (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )? (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )? (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )? otherlv_21= '}'
            {
            // InternalJavaFXLang.g:1647:3: ()
            // InternalJavaFXLang.g:1648:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLineChartFXAccess().getLineChartFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLineChartFXAccess().getLineChartKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getLineChartFXAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getLineChartFXAccess().getNameKeyword_3());
            		
            // InternalJavaFXLang.g:1666:3: ( (lv_name_4_0= ruleEString ) )
            // InternalJavaFXLang.g:1667:4: (lv_name_4_0= ruleEString )
            {
            // InternalJavaFXLang.g:1667:4: (lv_name_4_0= ruleEString )
            // InternalJavaFXLang.g:1668:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLineChartFXAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineChartFXRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.dc.emf.javafx.xtext.JavaFXLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaFXLang.g:1685:3: (otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==21) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalJavaFXLang.g:1686:4: otherlv_5= 'legendSide:' ( (lv_legendSide_6_0= ruleOrientation ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getLineChartFXAccess().getLegendSideKeyword_5_0());
                    			
                    // InternalJavaFXLang.g:1690:4: ( (lv_legendSide_6_0= ruleOrientation ) )
                    // InternalJavaFXLang.g:1691:5: (lv_legendSide_6_0= ruleOrientation )
                    {
                    // InternalJavaFXLang.g:1691:5: (lv_legendSide_6_0= ruleOrientation )
                    // InternalJavaFXLang.g:1692:6: lv_legendSide_6_0= ruleOrientation
                    {

                    						newCompositeNode(grammarAccess.getLineChartFXAccess().getLegendSideOrientationEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_legendSide_6_0=ruleOrientation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartFXRule());
                    						}
                    						set(
                    							current,
                    							"legendSide",
                    							lv_legendSide_6_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.Orientation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1710:3: (otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==22) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalJavaFXLang.g:1711:4: otherlv_7= 'showLegend:' ( (lv_showLegend_8_0= ruleEBoolean ) )
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getLineChartFXAccess().getShowLegendKeyword_6_0());
                    			
                    // InternalJavaFXLang.g:1715:4: ( (lv_showLegend_8_0= ruleEBoolean ) )
                    // InternalJavaFXLang.g:1716:5: (lv_showLegend_8_0= ruleEBoolean )
                    {
                    // InternalJavaFXLang.g:1716:5: (lv_showLegend_8_0= ruleEBoolean )
                    // InternalJavaFXLang.g:1717:6: lv_showLegend_8_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getLineChartFXAccess().getShowLegendEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_showLegend_8_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartFXRule());
                    						}
                    						set(
                    							current,
                    							"showLegend",
                    							lv_showLegend_8_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1735:3: (otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==23) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalJavaFXLang.g:1736:4: otherlv_9= 'title:' ( (lv_title_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getLineChartFXAccess().getTitleKeyword_7_0());
                    			
                    // InternalJavaFXLang.g:1740:4: ( (lv_title_10_0= ruleEString ) )
                    // InternalJavaFXLang.g:1741:5: (lv_title_10_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:1741:5: (lv_title_10_0= ruleEString )
                    // InternalJavaFXLang.g:1742:6: lv_title_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLineChartFXAccess().getTitleEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_title_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartFXRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_10_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1760:3: (otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==24) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalJavaFXLang.g:1761:4: otherlv_11= 'titleSide:' ( (lv_titleSide_12_0= ruleOrientation ) )
                    {
                    otherlv_11=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getLineChartFXAccess().getTitleSideKeyword_8_0());
                    			
                    // InternalJavaFXLang.g:1765:4: ( (lv_titleSide_12_0= ruleOrientation ) )
                    // InternalJavaFXLang.g:1766:5: (lv_titleSide_12_0= ruleOrientation )
                    {
                    // InternalJavaFXLang.g:1766:5: (lv_titleSide_12_0= ruleOrientation )
                    // InternalJavaFXLang.g:1767:6: lv_titleSide_12_0= ruleOrientation
                    {

                    						newCompositeNode(grammarAccess.getLineChartFXAccess().getTitleSideOrientationEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_titleSide_12_0=ruleOrientation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartFXRule());
                    						}
                    						set(
                    							current,
                    							"titleSide",
                    							lv_titleSide_12_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.Orientation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1785:3: (otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==25) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalJavaFXLang.g:1786:4: otherlv_13= 'xAxisLabel:' ( (lv_xAxisLabel_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getLineChartFXAccess().getXAxisLabelKeyword_9_0());
                    			
                    // InternalJavaFXLang.g:1790:4: ( (lv_xAxisLabel_14_0= ruleEString ) )
                    // InternalJavaFXLang.g:1791:5: (lv_xAxisLabel_14_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:1791:5: (lv_xAxisLabel_14_0= ruleEString )
                    // InternalJavaFXLang.g:1792:6: lv_xAxisLabel_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLineChartFXAccess().getXAxisLabelEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_xAxisLabel_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartFXRule());
                    						}
                    						set(
                    							current,
                    							"xAxisLabel",
                    							lv_xAxisLabel_14_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1810:3: (otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==26) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalJavaFXLang.g:1811:4: otherlv_15= 'xAxisType:' ( (lv_xAxisType_16_0= ruleAxisType ) )
                    {
                    otherlv_15=(Token)match(input,26,FOLLOW_28); 

                    				newLeafNode(otherlv_15, grammarAccess.getLineChartFXAccess().getXAxisTypeKeyword_10_0());
                    			
                    // InternalJavaFXLang.g:1815:4: ( (lv_xAxisType_16_0= ruleAxisType ) )
                    // InternalJavaFXLang.g:1816:5: (lv_xAxisType_16_0= ruleAxisType )
                    {
                    // InternalJavaFXLang.g:1816:5: (lv_xAxisType_16_0= ruleAxisType )
                    // InternalJavaFXLang.g:1817:6: lv_xAxisType_16_0= ruleAxisType
                    {

                    						newCompositeNode(grammarAccess.getLineChartFXAccess().getXAxisTypeAxisTypeEnumRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_xAxisType_16_0=ruleAxisType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartFXRule());
                    						}
                    						set(
                    							current,
                    							"xAxisType",
                    							lv_xAxisType_16_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.AxisType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1835:3: (otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==27) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalJavaFXLang.g:1836:4: otherlv_17= 'yAxisLabel:' ( (lv_yAxisLabel_18_0= ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getLineChartFXAccess().getYAxisLabelKeyword_11_0());
                    			
                    // InternalJavaFXLang.g:1840:4: ( (lv_yAxisLabel_18_0= ruleEString ) )
                    // InternalJavaFXLang.g:1841:5: (lv_yAxisLabel_18_0= ruleEString )
                    {
                    // InternalJavaFXLang.g:1841:5: (lv_yAxisLabel_18_0= ruleEString )
                    // InternalJavaFXLang.g:1842:6: lv_yAxisLabel_18_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLineChartFXAccess().getYAxisLabelEStringParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_yAxisLabel_18_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartFXRule());
                    						}
                    						set(
                    							current,
                    							"yAxisLabel",
                    							lv_yAxisLabel_18_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:1860:3: (otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==28) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalJavaFXLang.g:1861:4: otherlv_19= 'yAxisType:' ( (lv_yAxisType_20_0= ruleAxisType ) )
                    {
                    otherlv_19=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_19, grammarAccess.getLineChartFXAccess().getYAxisTypeKeyword_12_0());
                    			
                    // InternalJavaFXLang.g:1865:4: ( (lv_yAxisType_20_0= ruleAxisType ) )
                    // InternalJavaFXLang.g:1866:5: (lv_yAxisType_20_0= ruleAxisType )
                    {
                    // InternalJavaFXLang.g:1866:5: (lv_yAxisType_20_0= ruleAxisType )
                    // InternalJavaFXLang.g:1867:6: lv_yAxisType_20_0= ruleAxisType
                    {

                    						newCompositeNode(grammarAccess.getLineChartFXAccess().getYAxisTypeAxisTypeEnumRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_yAxisType_20_0=ruleAxisType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartFXRule());
                    						}
                    						set(
                    							current,
                    							"yAxisType",
                    							lv_yAxisType_20_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.AxisType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getLineChartFXAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleLineChartFX"


    // $ANTLR start "entryRuleBinding"
    // InternalJavaFXLang.g:1893:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalJavaFXLang.g:1893:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalJavaFXLang.g:1894:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalJavaFXLang.g:1900:1: ruleBinding returns [EObject current=null] : ( () otherlv_1= 'binding' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )* )? otherlv_6= '}' ) ;
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
            // InternalJavaFXLang.g:1906:2: ( ( () otherlv_1= 'binding' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )* )? otherlv_6= '}' ) )
            // InternalJavaFXLang.g:1907:2: ( () otherlv_1= 'binding' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )* )? otherlv_6= '}' )
            {
            // InternalJavaFXLang.g:1907:2: ( () otherlv_1= 'binding' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )* )? otherlv_6= '}' )
            // InternalJavaFXLang.g:1908:3: () otherlv_1= 'binding' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )* )? otherlv_6= '}'
            {
            // InternalJavaFXLang.g:1908:3: ()
            // InternalJavaFXLang.g:1909:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBindingAccess().getBindingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getBindingKeyword_1());
            		
            // InternalJavaFXLang.g:1919:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:1920:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:1920:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:1921:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJavaFXLang.g:1942:3: ( ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=56 && LA56_0<=62)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalJavaFXLang.g:1943:4: ( (lv_property_4_0= ruleBindingProperty ) ) ( (lv_property_5_0= ruleBindingProperty ) )*
                    {
                    // InternalJavaFXLang.g:1943:4: ( (lv_property_4_0= ruleBindingProperty ) )
                    // InternalJavaFXLang.g:1944:5: (lv_property_4_0= ruleBindingProperty )
                    {
                    // InternalJavaFXLang.g:1944:5: (lv_property_4_0= ruleBindingProperty )
                    // InternalJavaFXLang.g:1945:6: lv_property_4_0= ruleBindingProperty
                    {

                    						newCompositeNode(grammarAccess.getBindingAccess().getPropertyBindingPropertyParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_35);
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

                    // InternalJavaFXLang.g:1962:4: ( (lv_property_5_0= ruleBindingProperty ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( ((LA55_0>=56 && LA55_0<=62)) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:1963:5: (lv_property_5_0= ruleBindingProperty )
                    	    {
                    	    // InternalJavaFXLang.g:1963:5: (lv_property_5_0= ruleBindingProperty )
                    	    // InternalJavaFXLang.g:1964:6: lv_property_5_0= ruleBindingProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getBindingAccess().getPropertyBindingPropertyParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_35);
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
                    	    break loop55;
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
    // InternalJavaFXLang.g:1990:1: entryRuleBindingProperty returns [EObject current=null] : iv_ruleBindingProperty= ruleBindingProperty EOF ;
    public final EObject entryRuleBindingProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingProperty = null;


        try {
            // InternalJavaFXLang.g:1990:56: (iv_ruleBindingProperty= ruleBindingProperty EOF )
            // InternalJavaFXLang.g:1991:2: iv_ruleBindingProperty= ruleBindingProperty EOF
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
    // InternalJavaFXLang.g:1997:1: ruleBindingProperty returns [EObject current=null] : ( () ( (lv_type_1_0= ruleBindinType ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleBindingProperty() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:2003:2: ( ( () ( (lv_type_1_0= ruleBindinType ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalJavaFXLang.g:2004:2: ( () ( (lv_type_1_0= ruleBindinType ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalJavaFXLang.g:2004:2: ( () ( (lv_type_1_0= ruleBindinType ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalJavaFXLang.g:2005:3: () ( (lv_type_1_0= ruleBindinType ) ) ( (lv_name_2_0= ruleEString ) )
            {
            // InternalJavaFXLang.g:2005:3: ()
            // InternalJavaFXLang.g:2006:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBindingPropertyAccess().getBindingPropertyAction_0(),
            					current);
            			

            }

            // InternalJavaFXLang.g:2012:3: ( (lv_type_1_0= ruleBindinType ) )
            // InternalJavaFXLang.g:2013:4: (lv_type_1_0= ruleBindinType )
            {
            // InternalJavaFXLang.g:2013:4: (lv_type_1_0= ruleBindinType )
            // InternalJavaFXLang.g:2014:5: lv_type_1_0= ruleBindinType
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

            // InternalJavaFXLang.g:2031:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:2032:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:2032:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:2033:5: lv_name_2_0= ruleEString
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
    // InternalJavaFXLang.g:2054:1: entryRuleControlFX returns [EObject current=null] : iv_ruleControlFX= ruleControlFX EOF ;
    public final EObject entryRuleControlFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlFX = null;


        try {
            // InternalJavaFXLang.g:2054:50: (iv_ruleControlFX= ruleControlFX EOF )
            // InternalJavaFXLang.g:2055:2: iv_ruleControlFX= ruleControlFX EOF
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
    // InternalJavaFXLang.g:2061:1: ruleControlFX returns [EObject current=null] : (this_TableViewFX_0= ruleTableViewFX | this_FilteredTableViewFX_1= ruleFilteredTableViewFX ) ;
    public final EObject ruleControlFX() throws RecognitionException {
        EObject current = null;

        EObject this_TableViewFX_0 = null;

        EObject this_FilteredTableViewFX_1 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:2067:2: ( (this_TableViewFX_0= ruleTableViewFX | this_FilteredTableViewFX_1= ruleFilteredTableViewFX ) )
            // InternalJavaFXLang.g:2068:2: (this_TableViewFX_0= ruleTableViewFX | this_FilteredTableViewFX_1= ruleFilteredTableViewFX )
            {
            // InternalJavaFXLang.g:2068:2: (this_TableViewFX_0= ruleTableViewFX | this_FilteredTableViewFX_1= ruleFilteredTableViewFX )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==40) ) {
                alt57=1;
            }
            else if ( (LA57_0==35) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalJavaFXLang.g:2069:3: this_TableViewFX_0= ruleTableViewFX
                    {

                    			newCompositeNode(grammarAccess.getControlFXAccess().getTableViewFXParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TableViewFX_0=ruleTableViewFX();

                    state._fsp--;


                    			current = this_TableViewFX_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:2078:3: this_FilteredTableViewFX_1= ruleFilteredTableViewFX
                    {

                    			newCompositeNode(grammarAccess.getControlFXAccess().getFilteredTableViewFXParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FilteredTableViewFX_1=ruleFilteredTableViewFX();

                    state._fsp--;


                    			current = this_FilteredTableViewFX_1;
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
    // $ANTLR end "ruleControlFX"


    // $ANTLR start "entryRuleFilteredTableViewFX"
    // InternalJavaFXLang.g:2090:1: entryRuleFilteredTableViewFX returns [EObject current=null] : iv_ruleFilteredTableViewFX= ruleFilteredTableViewFX EOF ;
    public final EObject entryRuleFilteredTableViewFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilteredTableViewFX = null;


        try {
            // InternalJavaFXLang.g:2090:60: (iv_ruleFilteredTableViewFX= ruleFilteredTableViewFX EOF )
            // InternalJavaFXLang.g:2091:2: iv_ruleFilteredTableViewFX= ruleFilteredTableViewFX EOF
            {
             newCompositeNode(grammarAccess.getFilteredTableViewFXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilteredTableViewFX=ruleFilteredTableViewFX();

            state._fsp--;

             current =iv_ruleFilteredTableViewFX; 
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
    // $ANTLR end "entryRuleFilteredTableViewFX"


    // $ANTLR start "ruleFilteredTableViewFX"
    // InternalJavaFXLang.g:2097:1: ruleFilteredTableViewFX returns [EObject current=null] : ( () otherlv_1= 'FilteredTableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? (otherlv_7= 'usedFilter:' ( (lv_useFilter_8_0= ruleEBoolean ) ) )? ( ( (lv_columns_9_0= ruleTableColumnFX ) ) ( (lv_columns_10_0= ruleTableColumnFX ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleFilteredTableViewFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_useFilter_8_0 = null;

        EObject lv_columns_9_0 = null;

        EObject lv_columns_10_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:2103:2: ( ( () otherlv_1= 'FilteredTableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? (otherlv_7= 'usedFilter:' ( (lv_useFilter_8_0= ruleEBoolean ) ) )? ( ( (lv_columns_9_0= ruleTableColumnFX ) ) ( (lv_columns_10_0= ruleTableColumnFX ) )* )? otherlv_11= '}' ) )
            // InternalJavaFXLang.g:2104:2: ( () otherlv_1= 'FilteredTableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? (otherlv_7= 'usedFilter:' ( (lv_useFilter_8_0= ruleEBoolean ) ) )? ( ( (lv_columns_9_0= ruleTableColumnFX ) ) ( (lv_columns_10_0= ruleTableColumnFX ) )* )? otherlv_11= '}' )
            {
            // InternalJavaFXLang.g:2104:2: ( () otherlv_1= 'FilteredTableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? (otherlv_7= 'usedFilter:' ( (lv_useFilter_8_0= ruleEBoolean ) ) )? ( ( (lv_columns_9_0= ruleTableColumnFX ) ) ( (lv_columns_10_0= ruleTableColumnFX ) )* )? otherlv_11= '}' )
            // InternalJavaFXLang.g:2105:3: () otherlv_1= 'FilteredTableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? (otherlv_7= 'usedFilter:' ( (lv_useFilter_8_0= ruleEBoolean ) ) )? ( ( (lv_columns_9_0= ruleTableColumnFX ) ) ( (lv_columns_10_0= ruleTableColumnFX ) )* )? otherlv_11= '}'
            {
            // InternalJavaFXLang.g:2105:3: ()
            // InternalJavaFXLang.g:2106:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFilteredTableViewFXAccess().getFilteredTableViewFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFilteredTableViewFXAccess().getFilteredTableViewKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getFilteredTableViewFXAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJavaFXLang.g:2120:3: (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) )
            // InternalJavaFXLang.g:2121:4: otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) )
            {
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getFilteredTableViewFXAccess().getNameKeyword_3_0());
            			
            // InternalJavaFXLang.g:2125:4: ( (lv_name_4_0= ruleEString ) )
            // InternalJavaFXLang.g:2126:5: (lv_name_4_0= ruleEString )
            {
            // InternalJavaFXLang.g:2126:5: (lv_name_4_0= ruleEString )
            // InternalJavaFXLang.g:2127:6: lv_name_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getFilteredTableViewFXAccess().getNameEStringParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_36);
            lv_name_4_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getFilteredTableViewFXRule());
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

            // InternalJavaFXLang.g:2145:3: (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==36) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalJavaFXLang.g:2146:4: otherlv_5= 'usedModel:' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getFilteredTableViewFXAccess().getUsedModelKeyword_4_0());
                    			
                    // InternalJavaFXLang.g:2150:4: ( ( ruleEString ) )
                    // InternalJavaFXLang.g:2151:5: ( ruleEString )
                    {
                    // InternalJavaFXLang.g:2151:5: ( ruleEString )
                    // InternalJavaFXLang.g:2152:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilteredTableViewFXRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFilteredTableViewFXAccess().getUsedModelModelFXCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:2167:3: (otherlv_7= 'usedFilter:' ( (lv_useFilter_8_0= ruleEBoolean ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==37) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalJavaFXLang.g:2168:4: otherlv_7= 'usedFilter:' ( (lv_useFilter_8_0= ruleEBoolean ) )
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getFilteredTableViewFXAccess().getUsedFilterKeyword_5_0());
                    			
                    // InternalJavaFXLang.g:2172:4: ( (lv_useFilter_8_0= ruleEBoolean ) )
                    // InternalJavaFXLang.g:2173:5: (lv_useFilter_8_0= ruleEBoolean )
                    {
                    // InternalJavaFXLang.g:2173:5: (lv_useFilter_8_0= ruleEBoolean )
                    // InternalJavaFXLang.g:2174:6: lv_useFilter_8_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFilteredTableViewFXAccess().getUseFilterEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_useFilter_8_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilteredTableViewFXRule());
                    						}
                    						set(
                    							current,
                    							"useFilter",
                    							lv_useFilter_8_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:2192:3: ( ( (lv_columns_9_0= ruleTableColumnFX ) ) ( (lv_columns_10_0= ruleTableColumnFX ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==41) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalJavaFXLang.g:2193:4: ( (lv_columns_9_0= ruleTableColumnFX ) ) ( (lv_columns_10_0= ruleTableColumnFX ) )*
                    {
                    // InternalJavaFXLang.g:2193:4: ( (lv_columns_9_0= ruleTableColumnFX ) )
                    // InternalJavaFXLang.g:2194:5: (lv_columns_9_0= ruleTableColumnFX )
                    {
                    // InternalJavaFXLang.g:2194:5: (lv_columns_9_0= ruleTableColumnFX )
                    // InternalJavaFXLang.g:2195:6: lv_columns_9_0= ruleTableColumnFX
                    {

                    						newCompositeNode(grammarAccess.getFilteredTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_columns_9_0=ruleTableColumnFX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilteredTableViewFXRule());
                    						}
                    						add(
                    							current,
                    							"columns",
                    							lv_columns_9_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.TableColumnFX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJavaFXLang.g:2212:4: ( (lv_columns_10_0= ruleTableColumnFX ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==41) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:2213:5: (lv_columns_10_0= ruleTableColumnFX )
                    	    {
                    	    // InternalJavaFXLang.g:2213:5: (lv_columns_10_0= ruleTableColumnFX )
                    	    // InternalJavaFXLang.g:2214:6: lv_columns_10_0= ruleTableColumnFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getFilteredTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_38);
                    	    lv_columns_10_0=ruleTableColumnFX();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFilteredTableViewFXRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"columns",
                    	    							lv_columns_10_0,
                    	    							"de.dc.emf.javafx.xtext.JavaFXLang.TableColumnFX");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFilteredTableViewFXAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleFilteredTableViewFX"


    // $ANTLR start "entryRuleEString"
    // InternalJavaFXLang.g:2240:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJavaFXLang.g:2240:47: (iv_ruleEString= ruleEString EOF )
            // InternalJavaFXLang.g:2241:2: iv_ruleEString= ruleEString EOF
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
    // InternalJavaFXLang.g:2247:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalJavaFXLang.g:2253:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalJavaFXLang.g:2254:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalJavaFXLang.g:2254:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_STRING) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_ID) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalJavaFXLang.g:2255:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:2263:3: this_ID_1= RULE_ID
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
    // InternalJavaFXLang.g:2274:1: entryRuleModelFX returns [EObject current=null] : iv_ruleModelFX= ruleModelFX EOF ;
    public final EObject entryRuleModelFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelFX = null;


        try {
            // InternalJavaFXLang.g:2274:48: (iv_ruleModelFX= ruleModelFX EOF )
            // InternalJavaFXLang.g:2275:2: iv_ruleModelFX= ruleModelFX EOF
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
    // InternalJavaFXLang.g:2281:1: ruleModelFX returns [EObject current=null] : (this_DerivedBean_0= ruleDerivedBean | this_Bean_1= ruleBean ) ;
    public final EObject ruleModelFX() throws RecognitionException {
        EObject current = null;

        EObject this_DerivedBean_0 = null;

        EObject this_Bean_1 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:2287:2: ( (this_DerivedBean_0= ruleDerivedBean | this_Bean_1= ruleBean ) )
            // InternalJavaFXLang.g:2288:2: (this_DerivedBean_0= ruleDerivedBean | this_Bean_1= ruleBean )
            {
            // InternalJavaFXLang.g:2288:2: (this_DerivedBean_0= ruleDerivedBean | this_Bean_1= ruleBean )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==38) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==RULE_STRING) ) {
                    int LA63_2 = input.LA(3);

                    if ( (LA63_2==12) ) {
                        int LA63_4 = input.LA(4);

                        if ( (LA63_4==39) ) {
                            alt63=1;
                        }
                        else if ( ((LA63_4>=RULE_STRING && LA63_4<=RULE_ID)||LA63_4==15) ) {
                            alt63=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 63, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA63_1==RULE_ID) ) {
                    int LA63_3 = input.LA(3);

                    if ( (LA63_3==12) ) {
                        int LA63_4 = input.LA(4);

                        if ( (LA63_4==39) ) {
                            alt63=1;
                        }
                        else if ( ((LA63_4>=RULE_STRING && LA63_4<=RULE_ID)||LA63_4==15) ) {
                            alt63=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 63, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalJavaFXLang.g:2289:3: this_DerivedBean_0= ruleDerivedBean
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
                    // InternalJavaFXLang.g:2298:3: this_Bean_1= ruleBean
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
    // InternalJavaFXLang.g:2310:1: entryRuleDerivedBean returns [EObject current=null] : iv_ruleDerivedBean= ruleDerivedBean EOF ;
    public final EObject entryRuleDerivedBean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedBean = null;


        try {
            // InternalJavaFXLang.g:2310:52: (iv_ruleDerivedBean= ruleDerivedBean EOF )
            // InternalJavaFXLang.g:2311:2: iv_ruleDerivedBean= ruleDerivedBean EOF
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
    // InternalJavaFXLang.g:2317:1: ruleDerivedBean returns [EObject current=null] : ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}' ) ;
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
            // InternalJavaFXLang.g:2323:2: ( ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}' ) )
            // InternalJavaFXLang.g:2324:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}' )
            {
            // InternalJavaFXLang.g:2324:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}' )
            // InternalJavaFXLang.g:2325:3: () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) ) ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )? otherlv_8= '}'
            {
            // InternalJavaFXLang.g:2325:3: ()
            // InternalJavaFXLang.g:2326:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDerivedBeanAccess().getDerivedBeanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDerivedBeanAccess().getClassKeyword_1());
            		
            // InternalJavaFXLang.g:2336:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:2337:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:2337:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:2338:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getDerivedBeanAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJavaFXLang.g:2359:3: (otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) ) )
            // InternalJavaFXLang.g:2360:4: otherlv_4= 'instanceType:' ( (lv_instanceType_5_0= ruleEString ) )
            {
            otherlv_4=(Token)match(input,39,FOLLOW_3); 

            				newLeafNode(otherlv_4, grammarAccess.getDerivedBeanAccess().getInstanceTypeKeyword_4_0());
            			
            // InternalJavaFXLang.g:2364:4: ( (lv_instanceType_5_0= ruleEString ) )
            // InternalJavaFXLang.g:2365:5: (lv_instanceType_5_0= ruleEString )
            {
            // InternalJavaFXLang.g:2365:5: (lv_instanceType_5_0= ruleEString )
            // InternalJavaFXLang.g:2366:6: lv_instanceType_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDerivedBeanAccess().getInstanceTypeEStringParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_40);
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

            // InternalJavaFXLang.g:2384:3: ( ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_STRING && LA65_0<=RULE_ID)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalJavaFXLang.g:2385:4: ( (lv_attributes_6_0= ruleAttributeFX ) ) ( (lv_attributes_7_0= ruleAttributeFX ) )*
                    {
                    // InternalJavaFXLang.g:2385:4: ( (lv_attributes_6_0= ruleAttributeFX ) )
                    // InternalJavaFXLang.g:2386:5: (lv_attributes_6_0= ruleAttributeFX )
                    {
                    // InternalJavaFXLang.g:2386:5: (lv_attributes_6_0= ruleAttributeFX )
                    // InternalJavaFXLang.g:2387:6: lv_attributes_6_0= ruleAttributeFX
                    {

                    						newCompositeNode(grammarAccess.getDerivedBeanAccess().getAttributesAttributeFXParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_40);
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

                    // InternalJavaFXLang.g:2404:4: ( (lv_attributes_7_0= ruleAttributeFX ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_ID)) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:2405:5: (lv_attributes_7_0= ruleAttributeFX )
                    	    {
                    	    // InternalJavaFXLang.g:2405:5: (lv_attributes_7_0= ruleAttributeFX )
                    	    // InternalJavaFXLang.g:2406:6: lv_attributes_7_0= ruleAttributeFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getDerivedBeanAccess().getAttributesAttributeFXParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_40);
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
                    	    break loop64;
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
    // InternalJavaFXLang.g:2432:1: entryRuleBean returns [EObject current=null] : iv_ruleBean= ruleBean EOF ;
    public final EObject entryRuleBean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBean = null;


        try {
            // InternalJavaFXLang.g:2432:45: (iv_ruleBean= ruleBean EOF )
            // InternalJavaFXLang.g:2433:2: iv_ruleBean= ruleBean EOF
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
    // InternalJavaFXLang.g:2439:1: ruleBean returns [EObject current=null] : ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}' ) ;
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
            // InternalJavaFXLang.g:2445:2: ( ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}' ) )
            // InternalJavaFXLang.g:2446:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}' )
            {
            // InternalJavaFXLang.g:2446:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}' )
            // InternalJavaFXLang.g:2447:3: () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )? otherlv_6= '}'
            {
            // InternalJavaFXLang.g:2447:3: ()
            // InternalJavaFXLang.g:2448:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBeanAccess().getBeanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBeanAccess().getClassKeyword_1());
            		
            // InternalJavaFXLang.g:2458:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:2459:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:2459:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:2460:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getBeanAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJavaFXLang.g:2481:3: ( ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=RULE_STRING && LA67_0<=RULE_ID)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalJavaFXLang.g:2482:4: ( (lv_attributes_4_0= ruleAttributeFX ) ) ( (lv_attributes_5_0= ruleAttributeFX ) )*
                    {
                    // InternalJavaFXLang.g:2482:4: ( (lv_attributes_4_0= ruleAttributeFX ) )
                    // InternalJavaFXLang.g:2483:5: (lv_attributes_4_0= ruleAttributeFX )
                    {
                    // InternalJavaFXLang.g:2483:5: (lv_attributes_4_0= ruleAttributeFX )
                    // InternalJavaFXLang.g:2484:6: lv_attributes_4_0= ruleAttributeFX
                    {

                    						newCompositeNode(grammarAccess.getBeanAccess().getAttributesAttributeFXParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_40);
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

                    // InternalJavaFXLang.g:2501:4: ( (lv_attributes_5_0= ruleAttributeFX ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( ((LA66_0>=RULE_STRING && LA66_0<=RULE_ID)) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:2502:5: (lv_attributes_5_0= ruleAttributeFX )
                    	    {
                    	    // InternalJavaFXLang.g:2502:5: (lv_attributes_5_0= ruleAttributeFX )
                    	    // InternalJavaFXLang.g:2503:6: lv_attributes_5_0= ruleAttributeFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getBeanAccess().getAttributesAttributeFXParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_40);
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
                    	    break loop66;
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
    // InternalJavaFXLang.g:2529:1: entryRuleTableViewFX returns [EObject current=null] : iv_ruleTableViewFX= ruleTableViewFX EOF ;
    public final EObject entryRuleTableViewFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableViewFX = null;


        try {
            // InternalJavaFXLang.g:2529:52: (iv_ruleTableViewFX= ruleTableViewFX EOF )
            // InternalJavaFXLang.g:2530:2: iv_ruleTableViewFX= ruleTableViewFX EOF
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
    // InternalJavaFXLang.g:2536:1: ruleTableViewFX returns [EObject current=null] : ( () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}' ) ;
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
            // InternalJavaFXLang.g:2542:2: ( ( () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}' ) )
            // InternalJavaFXLang.g:2543:2: ( () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}' )
            {
            // InternalJavaFXLang.g:2543:2: ( () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}' )
            // InternalJavaFXLang.g:2544:3: () otherlv_1= 'TableView' otherlv_2= '{' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )? ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )? otherlv_9= '}'
            {
            // InternalJavaFXLang.g:2544:3: ()
            // InternalJavaFXLang.g:2545:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableViewFXAccess().getTableViewFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTableViewFXAccess().getTableViewKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getTableViewFXAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJavaFXLang.g:2559:3: (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) )
            // InternalJavaFXLang.g:2560:4: otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) )
            {
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getTableViewFXAccess().getNameKeyword_3_0());
            			
            // InternalJavaFXLang.g:2564:4: ( (lv_name_4_0= ruleEString ) )
            // InternalJavaFXLang.g:2565:5: (lv_name_4_0= ruleEString )
            {
            // InternalJavaFXLang.g:2565:5: (lv_name_4_0= ruleEString )
            // InternalJavaFXLang.g:2566:6: lv_name_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getTableViewFXAccess().getNameEStringParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_41);
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

            // InternalJavaFXLang.g:2584:3: (otherlv_5= 'usedModel:' ( ( ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==36) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalJavaFXLang.g:2585:4: otherlv_5= 'usedModel:' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTableViewFXAccess().getUsedModelKeyword_4_0());
                    			
                    // InternalJavaFXLang.g:2589:4: ( ( ruleEString ) )
                    // InternalJavaFXLang.g:2590:5: ( ruleEString )
                    {
                    // InternalJavaFXLang.g:2590:5: ( ruleEString )
                    // InternalJavaFXLang.g:2591:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTableViewFXRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTableViewFXAccess().getUsedModelModelFXCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:2606:3: ( ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )* )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==41) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalJavaFXLang.g:2607:4: ( (lv_columns_7_0= ruleTableColumnFX ) ) ( (lv_columns_8_0= ruleTableColumnFX ) )*
                    {
                    // InternalJavaFXLang.g:2607:4: ( (lv_columns_7_0= ruleTableColumnFX ) )
                    // InternalJavaFXLang.g:2608:5: (lv_columns_7_0= ruleTableColumnFX )
                    {
                    // InternalJavaFXLang.g:2608:5: (lv_columns_7_0= ruleTableColumnFX )
                    // InternalJavaFXLang.g:2609:6: lv_columns_7_0= ruleTableColumnFX
                    {

                    						newCompositeNode(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_38);
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

                    // InternalJavaFXLang.g:2626:4: ( (lv_columns_8_0= ruleTableColumnFX ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==41) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalJavaFXLang.g:2627:5: (lv_columns_8_0= ruleTableColumnFX )
                    	    {
                    	    // InternalJavaFXLang.g:2627:5: (lv_columns_8_0= ruleTableColumnFX )
                    	    // InternalJavaFXLang.g:2628:6: lv_columns_8_0= ruleTableColumnFX
                    	    {

                    	    						newCompositeNode(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_38);
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
                    	    break loop69;
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
    // InternalJavaFXLang.g:2654:1: entryRuleTableColumnFX returns [EObject current=null] : iv_ruleTableColumnFX= ruleTableColumnFX EOF ;
    public final EObject entryRuleTableColumnFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableColumnFX = null;


        try {
            // InternalJavaFXLang.g:2654:54: (iv_ruleTableColumnFX= ruleTableColumnFX EOF )
            // InternalJavaFXLang.g:2655:2: iv_ruleTableColumnFX= ruleTableColumnFX EOF
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
    // InternalJavaFXLang.g:2661:1: ruleTableColumnFX returns [EObject current=null] : ( () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? (otherlv_9= 'useFilter:' ( (lv_useFilter_10_0= ruleEBoolean ) ) )? otherlv_11= ')' ) ;
    public final EObject ruleTableColumnFX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_width_6_0 = null;

        AntlrDatatypeRuleToken lv_useFilter_10_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:2667:2: ( ( () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? (otherlv_9= 'useFilter:' ( (lv_useFilter_10_0= ruleEBoolean ) ) )? otherlv_11= ')' ) )
            // InternalJavaFXLang.g:2668:2: ( () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? (otherlv_9= 'useFilter:' ( (lv_useFilter_10_0= ruleEBoolean ) ) )? otherlv_11= ')' )
            {
            // InternalJavaFXLang.g:2668:2: ( () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? (otherlv_9= 'useFilter:' ( (lv_useFilter_10_0= ruleEBoolean ) ) )? otherlv_11= ')' )
            // InternalJavaFXLang.g:2669:3: () otherlv_1= 'Column' otherlv_2= '(' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) ) (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )? (otherlv_7= 'attribute:' ( ( ruleEString ) ) )? (otherlv_9= 'useFilter:' ( (lv_useFilter_10_0= ruleEBoolean ) ) )? otherlv_11= ')'
            {
            // InternalJavaFXLang.g:2669:3: ()
            // InternalJavaFXLang.g:2670:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableColumnFXAccess().getTableColumnFXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getTableColumnFXAccess().getColumnKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getTableColumnFXAccess().getLeftParenthesisKeyword_2());
            		
            // InternalJavaFXLang.g:2684:3: (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) )
            // InternalJavaFXLang.g:2685:4: otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) )
            {
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getTableColumnFXAccess().getNameKeyword_3_0());
            			
            // InternalJavaFXLang.g:2689:4: ( (lv_name_4_0= ruleEString ) )
            // InternalJavaFXLang.g:2690:5: (lv_name_4_0= ruleEString )
            {
            // InternalJavaFXLang.g:2690:5: (lv_name_4_0= ruleEString )
            // InternalJavaFXLang.g:2691:6: lv_name_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getTableColumnFXAccess().getNameEStringParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_43);
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

            // InternalJavaFXLang.g:2709:3: (otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==43) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalJavaFXLang.g:2710:4: otherlv_5= 'width:' ( (lv_width_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_44); 

                    				newLeafNode(otherlv_5, grammarAccess.getTableColumnFXAccess().getWidthKeyword_4_0());
                    			
                    // InternalJavaFXLang.g:2714:4: ( (lv_width_6_0= ruleEInt ) )
                    // InternalJavaFXLang.g:2715:5: (lv_width_6_0= ruleEInt )
                    {
                    // InternalJavaFXLang.g:2715:5: (lv_width_6_0= ruleEInt )
                    // InternalJavaFXLang.g:2716:6: lv_width_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTableColumnFXAccess().getWidthEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_45);
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

            // InternalJavaFXLang.g:2734:3: (otherlv_7= 'attribute:' ( ( ruleEString ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==44) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalJavaFXLang.g:2735:4: otherlv_7= 'attribute:' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getTableColumnFXAccess().getAttributeKeyword_5_0());
                    			
                    // InternalJavaFXLang.g:2739:4: ( ( ruleEString ) )
                    // InternalJavaFXLang.g:2740:5: ( ruleEString )
                    {
                    // InternalJavaFXLang.g:2740:5: ( ruleEString )
                    // InternalJavaFXLang.g:2741:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTableColumnFXRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTableColumnFXAccess().getUsedAttributeAttributeFXCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJavaFXLang.g:2756:3: (otherlv_9= 'useFilter:' ( (lv_useFilter_10_0= ruleEBoolean ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==45) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalJavaFXLang.g:2757:4: otherlv_9= 'useFilter:' ( (lv_useFilter_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,45,FOLLOW_23); 

                    				newLeafNode(otherlv_9, grammarAccess.getTableColumnFXAccess().getUseFilterKeyword_6_0());
                    			
                    // InternalJavaFXLang.g:2761:4: ( (lv_useFilter_10_0= ruleEBoolean ) )
                    // InternalJavaFXLang.g:2762:5: (lv_useFilter_10_0= ruleEBoolean )
                    {
                    // InternalJavaFXLang.g:2762:5: (lv_useFilter_10_0= ruleEBoolean )
                    // InternalJavaFXLang.g:2763:6: lv_useFilter_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getTableColumnFXAccess().getUseFilterEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_useFilter_10_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableColumnFXRule());
                    						}
                    						set(
                    							current,
                    							"useFilter",
                    							lv_useFilter_10_0,
                    							"de.dc.emf.javafx.xtext.JavaFXLang.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTableColumnFXAccess().getRightParenthesisKeyword_7());
            		

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


    // $ANTLR start "entryRuleEBoolean"
    // InternalJavaFXLang.g:2789:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalJavaFXLang.g:2789:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalJavaFXLang.g:2790:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalJavaFXLang.g:2796:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJavaFXLang.g:2802:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalJavaFXLang.g:2803:2: (kw= 'true' | kw= 'false' )
            {
            // InternalJavaFXLang.g:2803:2: (kw= 'true' | kw= 'false' )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==47) ) {
                alt74=1;
            }
            else if ( (LA74_0==48) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalJavaFXLang.g:2804:3: kw= 'true'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:2810:3: kw= 'false'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // InternalJavaFXLang.g:2819:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalJavaFXLang.g:2819:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalJavaFXLang.g:2820:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalJavaFXLang.g:2826:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJavaFXLang.g:2832:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalJavaFXLang.g:2833:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalJavaFXLang.g:2833:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalJavaFXLang.g:2834:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalJavaFXLang.g:2834:3: (kw= '-' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==49) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalJavaFXLang.g:2835:4: kw= '-'
                    {
                    kw=(Token)match(input,49,FOLLOW_48); 

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
    // InternalJavaFXLang.g:2852:1: entryRuleAttributeFX returns [EObject current=null] : iv_ruleAttributeFX= ruleAttributeFX EOF ;
    public final EObject entryRuleAttributeFX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeFX = null;


        try {
            // InternalJavaFXLang.g:2852:52: (iv_ruleAttributeFX= ruleAttributeFX EOF )
            // InternalJavaFXLang.g:2853:2: iv_ruleAttributeFX= ruleAttributeFX EOF
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
    // InternalJavaFXLang.g:2859:1: ruleAttributeFX returns [EObject current=null] : ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleAttributeFX() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalJavaFXLang.g:2865:2: ( ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalJavaFXLang.g:2866:2: ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalJavaFXLang.g:2866:2: ( () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalJavaFXLang.g:2867:3: () ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) )
            {
            // InternalJavaFXLang.g:2867:3: ()
            // InternalJavaFXLang.g:2868:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeFXAccess().getAttributeFXAction_0(),
            					current);
            			

            }

            // InternalJavaFXLang.g:2874:3: ( (lv_type_1_0= ruleEString ) )
            // InternalJavaFXLang.g:2875:4: (lv_type_1_0= ruleEString )
            {
            // InternalJavaFXLang.g:2875:4: (lv_type_1_0= ruleEString )
            // InternalJavaFXLang.g:2876:5: lv_type_1_0= ruleEString
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

            // InternalJavaFXLang.g:2893:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJavaFXLang.g:2894:4: (lv_name_2_0= ruleEString )
            {
            // InternalJavaFXLang.g:2894:4: (lv_name_2_0= ruleEString )
            // InternalJavaFXLang.g:2895:5: lv_name_2_0= ruleEString
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


    // $ANTLR start "ruleAxisType"
    // InternalJavaFXLang.g:2916:1: ruleAxisType returns [Enumerator current=null] : ( (enumLiteral_0= 'Category' ) | (enumLiteral_1= 'Number' ) ) ;
    public final Enumerator ruleAxisType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJavaFXLang.g:2922:2: ( ( (enumLiteral_0= 'Category' ) | (enumLiteral_1= 'Number' ) ) )
            // InternalJavaFXLang.g:2923:2: ( (enumLiteral_0= 'Category' ) | (enumLiteral_1= 'Number' ) )
            {
            // InternalJavaFXLang.g:2923:2: ( (enumLiteral_0= 'Category' ) | (enumLiteral_1= 'Number' ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==50) ) {
                alt76=1;
            }
            else if ( (LA76_0==51) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalJavaFXLang.g:2924:3: (enumLiteral_0= 'Category' )
                    {
                    // InternalJavaFXLang.g:2924:3: (enumLiteral_0= 'Category' )
                    // InternalJavaFXLang.g:2925:4: enumLiteral_0= 'Category'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getAxisTypeAccess().getCategoryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAxisTypeAccess().getCategoryEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:2932:3: (enumLiteral_1= 'Number' )
                    {
                    // InternalJavaFXLang.g:2932:3: (enumLiteral_1= 'Number' )
                    // InternalJavaFXLang.g:2933:4: enumLiteral_1= 'Number'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getAxisTypeAccess().getNumberEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAxisTypeAccess().getNumberEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleAxisType"


    // $ANTLR start "ruleOrientation"
    // InternalJavaFXLang.g:2943:1: ruleOrientation returns [Enumerator current=null] : ( (enumLiteral_0= 'Bottom' ) | (enumLiteral_1= 'Left' ) | (enumLiteral_2= 'Right' ) | (enumLiteral_3= 'Top' ) ) ;
    public final Enumerator ruleOrientation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalJavaFXLang.g:2949:2: ( ( (enumLiteral_0= 'Bottom' ) | (enumLiteral_1= 'Left' ) | (enumLiteral_2= 'Right' ) | (enumLiteral_3= 'Top' ) ) )
            // InternalJavaFXLang.g:2950:2: ( (enumLiteral_0= 'Bottom' ) | (enumLiteral_1= 'Left' ) | (enumLiteral_2= 'Right' ) | (enumLiteral_3= 'Top' ) )
            {
            // InternalJavaFXLang.g:2950:2: ( (enumLiteral_0= 'Bottom' ) | (enumLiteral_1= 'Left' ) | (enumLiteral_2= 'Right' ) | (enumLiteral_3= 'Top' ) )
            int alt77=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt77=1;
                }
                break;
            case 53:
                {
                alt77=2;
                }
                break;
            case 54:
                {
                alt77=3;
                }
                break;
            case 55:
                {
                alt77=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalJavaFXLang.g:2951:3: (enumLiteral_0= 'Bottom' )
                    {
                    // InternalJavaFXLang.g:2951:3: (enumLiteral_0= 'Bottom' )
                    // InternalJavaFXLang.g:2952:4: enumLiteral_0= 'Bottom'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getBottomEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOrientationAccess().getBottomEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:2959:3: (enumLiteral_1= 'Left' )
                    {
                    // InternalJavaFXLang.g:2959:3: (enumLiteral_1= 'Left' )
                    // InternalJavaFXLang.g:2960:4: enumLiteral_1= 'Left'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getLeftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOrientationAccess().getLeftEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJavaFXLang.g:2967:3: (enumLiteral_2= 'Right' )
                    {
                    // InternalJavaFXLang.g:2967:3: (enumLiteral_2= 'Right' )
                    // InternalJavaFXLang.g:2968:4: enumLiteral_2= 'Right'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getRightEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOrientationAccess().getRightEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJavaFXLang.g:2975:3: (enumLiteral_3= 'Top' )
                    {
                    // InternalJavaFXLang.g:2975:3: (enumLiteral_3= 'Top' )
                    // InternalJavaFXLang.g:2976:4: enumLiteral_3= 'Top'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getOrientationAccess().getTopEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOrientationAccess().getTopEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleOrientation"


    // $ANTLR start "ruleBindinType"
    // InternalJavaFXLang.g:2986:1: ruleBindinType returns [Enumerator current=null] : ( (enumLiteral_0= 'BooleanProperty' ) | (enumLiteral_1= 'DoubleProperty' ) | (enumLiteral_2= 'FloatProperty' ) | (enumLiteral_3= 'IntegerProperty' ) | (enumLiteral_4= 'ObservableList' ) | (enumLiteral_5= 'ObjectProperty' ) | (enumLiteral_6= 'StringProperty' ) ) ;
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
            // InternalJavaFXLang.g:2992:2: ( ( (enumLiteral_0= 'BooleanProperty' ) | (enumLiteral_1= 'DoubleProperty' ) | (enumLiteral_2= 'FloatProperty' ) | (enumLiteral_3= 'IntegerProperty' ) | (enumLiteral_4= 'ObservableList' ) | (enumLiteral_5= 'ObjectProperty' ) | (enumLiteral_6= 'StringProperty' ) ) )
            // InternalJavaFXLang.g:2993:2: ( (enumLiteral_0= 'BooleanProperty' ) | (enumLiteral_1= 'DoubleProperty' ) | (enumLiteral_2= 'FloatProperty' ) | (enumLiteral_3= 'IntegerProperty' ) | (enumLiteral_4= 'ObservableList' ) | (enumLiteral_5= 'ObjectProperty' ) | (enumLiteral_6= 'StringProperty' ) )
            {
            // InternalJavaFXLang.g:2993:2: ( (enumLiteral_0= 'BooleanProperty' ) | (enumLiteral_1= 'DoubleProperty' ) | (enumLiteral_2= 'FloatProperty' ) | (enumLiteral_3= 'IntegerProperty' ) | (enumLiteral_4= 'ObservableList' ) | (enumLiteral_5= 'ObjectProperty' ) | (enumLiteral_6= 'StringProperty' ) )
            int alt78=7;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt78=1;
                }
                break;
            case 57:
                {
                alt78=2;
                }
                break;
            case 58:
                {
                alt78=3;
                }
                break;
            case 59:
                {
                alt78=4;
                }
                break;
            case 60:
                {
                alt78=5;
                }
                break;
            case 61:
                {
                alt78=6;
                }
                break;
            case 62:
                {
                alt78=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalJavaFXLang.g:2994:3: (enumLiteral_0= 'BooleanProperty' )
                    {
                    // InternalJavaFXLang.g:2994:3: (enumLiteral_0= 'BooleanProperty' )
                    // InternalJavaFXLang.g:2995:4: enumLiteral_0= 'BooleanProperty'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getBooleanPropertyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBindinTypeAccess().getBooleanPropertyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:3002:3: (enumLiteral_1= 'DoubleProperty' )
                    {
                    // InternalJavaFXLang.g:3002:3: (enumLiteral_1= 'DoubleProperty' )
                    // InternalJavaFXLang.g:3003:4: enumLiteral_1= 'DoubleProperty'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getDoublePropertyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBindinTypeAccess().getDoublePropertyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJavaFXLang.g:3010:3: (enumLiteral_2= 'FloatProperty' )
                    {
                    // InternalJavaFXLang.g:3010:3: (enumLiteral_2= 'FloatProperty' )
                    // InternalJavaFXLang.g:3011:4: enumLiteral_2= 'FloatProperty'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getFloatPropertyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBindinTypeAccess().getFloatPropertyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJavaFXLang.g:3018:3: (enumLiteral_3= 'IntegerProperty' )
                    {
                    // InternalJavaFXLang.g:3018:3: (enumLiteral_3= 'IntegerProperty' )
                    // InternalJavaFXLang.g:3019:4: enumLiteral_3= 'IntegerProperty'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getIntegerPropertyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBindinTypeAccess().getIntegerPropertyEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJavaFXLang.g:3026:3: (enumLiteral_4= 'ObservableList' )
                    {
                    // InternalJavaFXLang.g:3026:3: (enumLiteral_4= 'ObservableList' )
                    // InternalJavaFXLang.g:3027:4: enumLiteral_4= 'ObservableList'
                    {
                    enumLiteral_4=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getObservableListEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBindinTypeAccess().getObservableListEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJavaFXLang.g:3034:3: (enumLiteral_5= 'ObjectProperty' )
                    {
                    // InternalJavaFXLang.g:3034:3: (enumLiteral_5= 'ObjectProperty' )
                    // InternalJavaFXLang.g:3035:4: enumLiteral_5= 'ObjectProperty'
                    {
                    enumLiteral_5=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getBindinTypeAccess().getObjectPropertyEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBindinTypeAccess().getObjectPropertyEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJavaFXLang.g:3042:3: (enumLiteral_6= 'StringProperty' )
                    {
                    // InternalJavaFXLang.g:3042:3: (enumLiteral_6= 'StringProperty' )
                    // InternalJavaFXLang.g:3043:4: enumLiteral_6= 'StringProperty'
                    {
                    enumLiteral_6=(Token)match(input,62,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000010800008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000003E0080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000003E0088000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001FE08000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000001FC08000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000001F808000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000001F008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000001E008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000001C008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000018008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000001E08000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000001C08000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x7F00000000008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000023000008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000022000008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000008000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000021000008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000780000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000040L});

}