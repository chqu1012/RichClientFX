package de.dc.emf.javafx.xtext.ide.contentassist.antlr.internal;

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
import de.dc.emf.javafx.xtext.services.JavaFXLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJavaFXLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Bottom'", "'Left'", "'Right'", "'Top'", "'BooleanProperty'", "'DoubleProperty'", "'FloatProperty'", "'IntegerProperty'", "'ObservableList'", "'ObjectProperty'", "'StringProperty'", "'ProjectFX'", "'{'", "'}'", "'packagePath'", "'controls'", "'models'", "'bindings'", "'charts'", "'LineChart'", "'name:'", "'legendSide:'", "'showLegend:'", "'title:'", "'titleSide:'", "'xAxisLabel:'", "'yAxisLabel:'", "'binding'", "'class'", "'instanceType:'", "'TableView'", "'usedModel:'", "'usedFilter:'", "'Column'", "'('", "')'", "'width:'", "'attribute:'", "'useFilter:'", "'-'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
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

    	public void setGrammarAccess(JavaFXLangGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProjectFX"
    // InternalJavaFXLang.g:53:1: entryRuleProjectFX : ruleProjectFX EOF ;
    public final void entryRuleProjectFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:54:1: ( ruleProjectFX EOF )
            // InternalJavaFXLang.g:55:1: ruleProjectFX EOF
            {
             before(grammarAccess.getProjectFXRule()); 
            pushFollow(FOLLOW_1);
            ruleProjectFX();

            state._fsp--;

             after(grammarAccess.getProjectFXRule()); 
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
    // $ANTLR end "entryRuleProjectFX"


    // $ANTLR start "ruleProjectFX"
    // InternalJavaFXLang.g:62:1: ruleProjectFX : ( ( rule__ProjectFX__Group__0 ) ) ;
    public final void ruleProjectFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:66:2: ( ( ( rule__ProjectFX__Group__0 ) ) )
            // InternalJavaFXLang.g:67:2: ( ( rule__ProjectFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:67:2: ( ( rule__ProjectFX__Group__0 ) )
            // InternalJavaFXLang.g:68:3: ( rule__ProjectFX__Group__0 )
            {
             before(grammarAccess.getProjectFXAccess().getGroup()); 
            // InternalJavaFXLang.g:69:3: ( rule__ProjectFX__Group__0 )
            // InternalJavaFXLang.g:69:4: rule__ProjectFX__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectFXAccess().getGroup()); 

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
    // $ANTLR end "ruleProjectFX"


    // $ANTLR start "entryRuleChartFX"
    // InternalJavaFXLang.g:78:1: entryRuleChartFX : ruleChartFX EOF ;
    public final void entryRuleChartFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:79:1: ( ruleChartFX EOF )
            // InternalJavaFXLang.g:80:1: ruleChartFX EOF
            {
             before(grammarAccess.getChartFXRule()); 
            pushFollow(FOLLOW_1);
            ruleChartFX();

            state._fsp--;

             after(grammarAccess.getChartFXRule()); 
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
    // $ANTLR end "entryRuleChartFX"


    // $ANTLR start "ruleChartFX"
    // InternalJavaFXLang.g:87:1: ruleChartFX : ( ruleLineChartFX ) ;
    public final void ruleChartFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:91:2: ( ( ruleLineChartFX ) )
            // InternalJavaFXLang.g:92:2: ( ruleLineChartFX )
            {
            // InternalJavaFXLang.g:92:2: ( ruleLineChartFX )
            // InternalJavaFXLang.g:93:3: ruleLineChartFX
            {
             before(grammarAccess.getChartFXAccess().getLineChartFXParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleLineChartFX();

            state._fsp--;

             after(grammarAccess.getChartFXAccess().getLineChartFXParserRuleCall()); 

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
    // $ANTLR end "ruleChartFX"


    // $ANTLR start "entryRuleLineChartFX"
    // InternalJavaFXLang.g:103:1: entryRuleLineChartFX : ruleLineChartFX EOF ;
    public final void entryRuleLineChartFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:104:1: ( ruleLineChartFX EOF )
            // InternalJavaFXLang.g:105:1: ruleLineChartFX EOF
            {
             before(grammarAccess.getLineChartFXRule()); 
            pushFollow(FOLLOW_1);
            ruleLineChartFX();

            state._fsp--;

             after(grammarAccess.getLineChartFXRule()); 
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
    // $ANTLR end "entryRuleLineChartFX"


    // $ANTLR start "ruleLineChartFX"
    // InternalJavaFXLang.g:112:1: ruleLineChartFX : ( ( rule__LineChartFX__Group__0 ) ) ;
    public final void ruleLineChartFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:116:2: ( ( ( rule__LineChartFX__Group__0 ) ) )
            // InternalJavaFXLang.g:117:2: ( ( rule__LineChartFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:117:2: ( ( rule__LineChartFX__Group__0 ) )
            // InternalJavaFXLang.g:118:3: ( rule__LineChartFX__Group__0 )
            {
             before(grammarAccess.getLineChartFXAccess().getGroup()); 
            // InternalJavaFXLang.g:119:3: ( rule__LineChartFX__Group__0 )
            // InternalJavaFXLang.g:119:4: rule__LineChartFX__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineChartFXAccess().getGroup()); 

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
    // $ANTLR end "ruleLineChartFX"


    // $ANTLR start "entryRuleBinding"
    // InternalJavaFXLang.g:128:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:129:1: ( ruleBinding EOF )
            // InternalJavaFXLang.g:130:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getBindingRule()); 
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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalJavaFXLang.g:137:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:141:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalJavaFXLang.g:142:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalJavaFXLang.g:142:2: ( ( rule__Binding__Group__0 ) )
            // InternalJavaFXLang.g:143:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalJavaFXLang.g:144:3: ( rule__Binding__Group__0 )
            // InternalJavaFXLang.g:144:4: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getGroup()); 

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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleBindingProperty"
    // InternalJavaFXLang.g:153:1: entryRuleBindingProperty : ruleBindingProperty EOF ;
    public final void entryRuleBindingProperty() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:154:1: ( ruleBindingProperty EOF )
            // InternalJavaFXLang.g:155:1: ruleBindingProperty EOF
            {
             before(grammarAccess.getBindingPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleBindingProperty();

            state._fsp--;

             after(grammarAccess.getBindingPropertyRule()); 
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
    // $ANTLR end "entryRuleBindingProperty"


    // $ANTLR start "ruleBindingProperty"
    // InternalJavaFXLang.g:162:1: ruleBindingProperty : ( ( rule__BindingProperty__Group__0 ) ) ;
    public final void ruleBindingProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:166:2: ( ( ( rule__BindingProperty__Group__0 ) ) )
            // InternalJavaFXLang.g:167:2: ( ( rule__BindingProperty__Group__0 ) )
            {
            // InternalJavaFXLang.g:167:2: ( ( rule__BindingProperty__Group__0 ) )
            // InternalJavaFXLang.g:168:3: ( rule__BindingProperty__Group__0 )
            {
             before(grammarAccess.getBindingPropertyAccess().getGroup()); 
            // InternalJavaFXLang.g:169:3: ( rule__BindingProperty__Group__0 )
            // InternalJavaFXLang.g:169:4: rule__BindingProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BindingProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleBindingProperty"


    // $ANTLR start "entryRuleControlFX"
    // InternalJavaFXLang.g:178:1: entryRuleControlFX : ruleControlFX EOF ;
    public final void entryRuleControlFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:179:1: ( ruleControlFX EOF )
            // InternalJavaFXLang.g:180:1: ruleControlFX EOF
            {
             before(grammarAccess.getControlFXRule()); 
            pushFollow(FOLLOW_1);
            ruleControlFX();

            state._fsp--;

             after(grammarAccess.getControlFXRule()); 
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
    // $ANTLR end "entryRuleControlFX"


    // $ANTLR start "ruleControlFX"
    // InternalJavaFXLang.g:187:1: ruleControlFX : ( ruleTableViewFX ) ;
    public final void ruleControlFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:191:2: ( ( ruleTableViewFX ) )
            // InternalJavaFXLang.g:192:2: ( ruleTableViewFX )
            {
            // InternalJavaFXLang.g:192:2: ( ruleTableViewFX )
            // InternalJavaFXLang.g:193:3: ruleTableViewFX
            {
             before(grammarAccess.getControlFXAccess().getTableViewFXParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleTableViewFX();

            state._fsp--;

             after(grammarAccess.getControlFXAccess().getTableViewFXParserRuleCall()); 

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
    // $ANTLR end "ruleControlFX"


    // $ANTLR start "entryRuleEString"
    // InternalJavaFXLang.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:204:1: ( ruleEString EOF )
            // InternalJavaFXLang.g:205:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalJavaFXLang.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalJavaFXLang.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalJavaFXLang.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalJavaFXLang.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalJavaFXLang.g:219:3: ( rule__EString__Alternatives )
            // InternalJavaFXLang.g:219:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleModelFX"
    // InternalJavaFXLang.g:228:1: entryRuleModelFX : ruleModelFX EOF ;
    public final void entryRuleModelFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:229:1: ( ruleModelFX EOF )
            // InternalJavaFXLang.g:230:1: ruleModelFX EOF
            {
             before(grammarAccess.getModelFXRule()); 
            pushFollow(FOLLOW_1);
            ruleModelFX();

            state._fsp--;

             after(grammarAccess.getModelFXRule()); 
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
    // $ANTLR end "entryRuleModelFX"


    // $ANTLR start "ruleModelFX"
    // InternalJavaFXLang.g:237:1: ruleModelFX : ( ( rule__ModelFX__Alternatives ) ) ;
    public final void ruleModelFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:241:2: ( ( ( rule__ModelFX__Alternatives ) ) )
            // InternalJavaFXLang.g:242:2: ( ( rule__ModelFX__Alternatives ) )
            {
            // InternalJavaFXLang.g:242:2: ( ( rule__ModelFX__Alternatives ) )
            // InternalJavaFXLang.g:243:3: ( rule__ModelFX__Alternatives )
            {
             before(grammarAccess.getModelFXAccess().getAlternatives()); 
            // InternalJavaFXLang.g:244:3: ( rule__ModelFX__Alternatives )
            // InternalJavaFXLang.g:244:4: rule__ModelFX__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ModelFX__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelFXAccess().getAlternatives()); 

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
    // $ANTLR end "ruleModelFX"


    // $ANTLR start "entryRuleDerivedBean"
    // InternalJavaFXLang.g:253:1: entryRuleDerivedBean : ruleDerivedBean EOF ;
    public final void entryRuleDerivedBean() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:254:1: ( ruleDerivedBean EOF )
            // InternalJavaFXLang.g:255:1: ruleDerivedBean EOF
            {
             before(grammarAccess.getDerivedBeanRule()); 
            pushFollow(FOLLOW_1);
            ruleDerivedBean();

            state._fsp--;

             after(grammarAccess.getDerivedBeanRule()); 
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
    // $ANTLR end "entryRuleDerivedBean"


    // $ANTLR start "ruleDerivedBean"
    // InternalJavaFXLang.g:262:1: ruleDerivedBean : ( ( rule__DerivedBean__Group__0 ) ) ;
    public final void ruleDerivedBean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:266:2: ( ( ( rule__DerivedBean__Group__0 ) ) )
            // InternalJavaFXLang.g:267:2: ( ( rule__DerivedBean__Group__0 ) )
            {
            // InternalJavaFXLang.g:267:2: ( ( rule__DerivedBean__Group__0 ) )
            // InternalJavaFXLang.g:268:3: ( rule__DerivedBean__Group__0 )
            {
             before(grammarAccess.getDerivedBeanAccess().getGroup()); 
            // InternalJavaFXLang.g:269:3: ( rule__DerivedBean__Group__0 )
            // InternalJavaFXLang.g:269:4: rule__DerivedBean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DerivedBean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDerivedBeanAccess().getGroup()); 

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
    // $ANTLR end "ruleDerivedBean"


    // $ANTLR start "entryRuleBean"
    // InternalJavaFXLang.g:278:1: entryRuleBean : ruleBean EOF ;
    public final void entryRuleBean() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:279:1: ( ruleBean EOF )
            // InternalJavaFXLang.g:280:1: ruleBean EOF
            {
             before(grammarAccess.getBeanRule()); 
            pushFollow(FOLLOW_1);
            ruleBean();

            state._fsp--;

             after(grammarAccess.getBeanRule()); 
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
    // $ANTLR end "entryRuleBean"


    // $ANTLR start "ruleBean"
    // InternalJavaFXLang.g:287:1: ruleBean : ( ( rule__Bean__Group__0 ) ) ;
    public final void ruleBean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:291:2: ( ( ( rule__Bean__Group__0 ) ) )
            // InternalJavaFXLang.g:292:2: ( ( rule__Bean__Group__0 ) )
            {
            // InternalJavaFXLang.g:292:2: ( ( rule__Bean__Group__0 ) )
            // InternalJavaFXLang.g:293:3: ( rule__Bean__Group__0 )
            {
             before(grammarAccess.getBeanAccess().getGroup()); 
            // InternalJavaFXLang.g:294:3: ( rule__Bean__Group__0 )
            // InternalJavaFXLang.g:294:4: rule__Bean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBeanAccess().getGroup()); 

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
    // $ANTLR end "ruleBean"


    // $ANTLR start "entryRuleTableViewFX"
    // InternalJavaFXLang.g:303:1: entryRuleTableViewFX : ruleTableViewFX EOF ;
    public final void entryRuleTableViewFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:304:1: ( ruleTableViewFX EOF )
            // InternalJavaFXLang.g:305:1: ruleTableViewFX EOF
            {
             before(grammarAccess.getTableViewFXRule()); 
            pushFollow(FOLLOW_1);
            ruleTableViewFX();

            state._fsp--;

             after(grammarAccess.getTableViewFXRule()); 
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
    // $ANTLR end "entryRuleTableViewFX"


    // $ANTLR start "ruleTableViewFX"
    // InternalJavaFXLang.g:312:1: ruleTableViewFX : ( ( rule__TableViewFX__Group__0 ) ) ;
    public final void ruleTableViewFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:316:2: ( ( ( rule__TableViewFX__Group__0 ) ) )
            // InternalJavaFXLang.g:317:2: ( ( rule__TableViewFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:317:2: ( ( rule__TableViewFX__Group__0 ) )
            // InternalJavaFXLang.g:318:3: ( rule__TableViewFX__Group__0 )
            {
             before(grammarAccess.getTableViewFXAccess().getGroup()); 
            // InternalJavaFXLang.g:319:3: ( rule__TableViewFX__Group__0 )
            // InternalJavaFXLang.g:319:4: rule__TableViewFX__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableViewFXAccess().getGroup()); 

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
    // $ANTLR end "ruleTableViewFX"


    // $ANTLR start "entryRuleTableColumnFX"
    // InternalJavaFXLang.g:328:1: entryRuleTableColumnFX : ruleTableColumnFX EOF ;
    public final void entryRuleTableColumnFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:329:1: ( ruleTableColumnFX EOF )
            // InternalJavaFXLang.g:330:1: ruleTableColumnFX EOF
            {
             before(grammarAccess.getTableColumnFXRule()); 
            pushFollow(FOLLOW_1);
            ruleTableColumnFX();

            state._fsp--;

             after(grammarAccess.getTableColumnFXRule()); 
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
    // $ANTLR end "entryRuleTableColumnFX"


    // $ANTLR start "ruleTableColumnFX"
    // InternalJavaFXLang.g:337:1: ruleTableColumnFX : ( ( rule__TableColumnFX__Group__0 ) ) ;
    public final void ruleTableColumnFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:341:2: ( ( ( rule__TableColumnFX__Group__0 ) ) )
            // InternalJavaFXLang.g:342:2: ( ( rule__TableColumnFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:342:2: ( ( rule__TableColumnFX__Group__0 ) )
            // InternalJavaFXLang.g:343:3: ( rule__TableColumnFX__Group__0 )
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup()); 
            // InternalJavaFXLang.g:344:3: ( rule__TableColumnFX__Group__0 )
            // InternalJavaFXLang.g:344:4: rule__TableColumnFX__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableColumnFX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableColumnFXAccess().getGroup()); 

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
    // $ANTLR end "ruleTableColumnFX"


    // $ANTLR start "entryRuleEBoolean"
    // InternalJavaFXLang.g:353:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:354:1: ( ruleEBoolean EOF )
            // InternalJavaFXLang.g:355:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalJavaFXLang.g:362:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:366:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalJavaFXLang.g:367:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalJavaFXLang.g:367:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalJavaFXLang.g:368:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalJavaFXLang.g:369:3: ( rule__EBoolean__Alternatives )
            // InternalJavaFXLang.g:369:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // InternalJavaFXLang.g:378:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:379:1: ( ruleEInt EOF )
            // InternalJavaFXLang.g:380:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalJavaFXLang.g:387:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:391:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalJavaFXLang.g:392:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalJavaFXLang.g:392:2: ( ( rule__EInt__Group__0 ) )
            // InternalJavaFXLang.g:393:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalJavaFXLang.g:394:3: ( rule__EInt__Group__0 )
            // InternalJavaFXLang.g:394:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleAttributeFX"
    // InternalJavaFXLang.g:403:1: entryRuleAttributeFX : ruleAttributeFX EOF ;
    public final void entryRuleAttributeFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:404:1: ( ruleAttributeFX EOF )
            // InternalJavaFXLang.g:405:1: ruleAttributeFX EOF
            {
             before(grammarAccess.getAttributeFXRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeFX();

            state._fsp--;

             after(grammarAccess.getAttributeFXRule()); 
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
    // $ANTLR end "entryRuleAttributeFX"


    // $ANTLR start "ruleAttributeFX"
    // InternalJavaFXLang.g:412:1: ruleAttributeFX : ( ( rule__AttributeFX__Group__0 ) ) ;
    public final void ruleAttributeFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:416:2: ( ( ( rule__AttributeFX__Group__0 ) ) )
            // InternalJavaFXLang.g:417:2: ( ( rule__AttributeFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:417:2: ( ( rule__AttributeFX__Group__0 ) )
            // InternalJavaFXLang.g:418:3: ( rule__AttributeFX__Group__0 )
            {
             before(grammarAccess.getAttributeFXAccess().getGroup()); 
            // InternalJavaFXLang.g:419:3: ( rule__AttributeFX__Group__0 )
            // InternalJavaFXLang.g:419:4: rule__AttributeFX__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFXAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeFX"


    // $ANTLR start "ruleOrientation"
    // InternalJavaFXLang.g:428:1: ruleOrientation : ( ( rule__Orientation__Alternatives ) ) ;
    public final void ruleOrientation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:432:1: ( ( ( rule__Orientation__Alternatives ) ) )
            // InternalJavaFXLang.g:433:2: ( ( rule__Orientation__Alternatives ) )
            {
            // InternalJavaFXLang.g:433:2: ( ( rule__Orientation__Alternatives ) )
            // InternalJavaFXLang.g:434:3: ( rule__Orientation__Alternatives )
            {
             before(grammarAccess.getOrientationAccess().getAlternatives()); 
            // InternalJavaFXLang.g:435:3: ( rule__Orientation__Alternatives )
            // InternalJavaFXLang.g:435:4: rule__Orientation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Orientation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrientationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOrientation"


    // $ANTLR start "ruleBindinType"
    // InternalJavaFXLang.g:444:1: ruleBindinType : ( ( rule__BindinType__Alternatives ) ) ;
    public final void ruleBindinType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:448:1: ( ( ( rule__BindinType__Alternatives ) ) )
            // InternalJavaFXLang.g:449:2: ( ( rule__BindinType__Alternatives ) )
            {
            // InternalJavaFXLang.g:449:2: ( ( rule__BindinType__Alternatives ) )
            // InternalJavaFXLang.g:450:3: ( rule__BindinType__Alternatives )
            {
             before(grammarAccess.getBindinTypeAccess().getAlternatives()); 
            // InternalJavaFXLang.g:451:3: ( rule__BindinType__Alternatives )
            // InternalJavaFXLang.g:451:4: rule__BindinType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BindinType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBindinTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBindinType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalJavaFXLang.g:459:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:463:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalJavaFXLang.g:464:2: ( RULE_STRING )
                    {
                    // InternalJavaFXLang.g:464:2: ( RULE_STRING )
                    // InternalJavaFXLang.g:465:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:470:2: ( RULE_ID )
                    {
                    // InternalJavaFXLang.g:470:2: ( RULE_ID )
                    // InternalJavaFXLang.g:471:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__ModelFX__Alternatives"
    // InternalJavaFXLang.g:480:1: rule__ModelFX__Alternatives : ( ( ruleDerivedBean ) | ( ruleBean ) );
    public final void rule__ModelFX__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:484:1: ( ( ruleDerivedBean ) | ( ruleBean ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==41) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_STRING) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==25) ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==42) ) {
                            alt2=1;
                        }
                        else if ( ((LA2_4>=RULE_STRING && LA2_4<=RULE_ID)||LA2_4==26) ) {
                            alt2=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_1==RULE_ID) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==25) ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==42) ) {
                            alt2=1;
                        }
                        else if ( ((LA2_4>=RULE_STRING && LA2_4<=RULE_ID)||LA2_4==26) ) {
                            alt2=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
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
                    // InternalJavaFXLang.g:485:2: ( ruleDerivedBean )
                    {
                    // InternalJavaFXLang.g:485:2: ( ruleDerivedBean )
                    // InternalJavaFXLang.g:486:3: ruleDerivedBean
                    {
                     before(grammarAccess.getModelFXAccess().getDerivedBeanParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDerivedBean();

                    state._fsp--;

                     after(grammarAccess.getModelFXAccess().getDerivedBeanParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:491:2: ( ruleBean )
                    {
                    // InternalJavaFXLang.g:491:2: ( ruleBean )
                    // InternalJavaFXLang.g:492:3: ruleBean
                    {
                     before(grammarAccess.getModelFXAccess().getBeanParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBean();

                    state._fsp--;

                     after(grammarAccess.getModelFXAccess().getBeanParserRuleCall_1()); 

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
    // $ANTLR end "rule__ModelFX__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalJavaFXLang.g:501:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:505:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJavaFXLang.g:506:2: ( 'true' )
                    {
                    // InternalJavaFXLang.g:506:2: ( 'true' )
                    // InternalJavaFXLang.g:507:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:512:2: ( 'false' )
                    {
                    // InternalJavaFXLang.g:512:2: ( 'false' )
                    // InternalJavaFXLang.g:513:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__Orientation__Alternatives"
    // InternalJavaFXLang.g:522:1: rule__Orientation__Alternatives : ( ( ( 'Bottom' ) ) | ( ( 'Left' ) ) | ( ( 'Right' ) ) | ( ( 'Top' ) ) );
    public final void rule__Orientation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:526:1: ( ( ( 'Bottom' ) ) | ( ( 'Left' ) ) | ( ( 'Right' ) ) | ( ( 'Top' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalJavaFXLang.g:527:2: ( ( 'Bottom' ) )
                    {
                    // InternalJavaFXLang.g:527:2: ( ( 'Bottom' ) )
                    // InternalJavaFXLang.g:528:3: ( 'Bottom' )
                    {
                     before(grammarAccess.getOrientationAccess().getBottomEnumLiteralDeclaration_0()); 
                    // InternalJavaFXLang.g:529:3: ( 'Bottom' )
                    // InternalJavaFXLang.g:529:4: 'Bottom'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrientationAccess().getBottomEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:533:2: ( ( 'Left' ) )
                    {
                    // InternalJavaFXLang.g:533:2: ( ( 'Left' ) )
                    // InternalJavaFXLang.g:534:3: ( 'Left' )
                    {
                     before(grammarAccess.getOrientationAccess().getLeftEnumLiteralDeclaration_1()); 
                    // InternalJavaFXLang.g:535:3: ( 'Left' )
                    // InternalJavaFXLang.g:535:4: 'Left'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrientationAccess().getLeftEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJavaFXLang.g:539:2: ( ( 'Right' ) )
                    {
                    // InternalJavaFXLang.g:539:2: ( ( 'Right' ) )
                    // InternalJavaFXLang.g:540:3: ( 'Right' )
                    {
                     before(grammarAccess.getOrientationAccess().getRightEnumLiteralDeclaration_2()); 
                    // InternalJavaFXLang.g:541:3: ( 'Right' )
                    // InternalJavaFXLang.g:541:4: 'Right'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrientationAccess().getRightEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJavaFXLang.g:545:2: ( ( 'Top' ) )
                    {
                    // InternalJavaFXLang.g:545:2: ( ( 'Top' ) )
                    // InternalJavaFXLang.g:546:3: ( 'Top' )
                    {
                     before(grammarAccess.getOrientationAccess().getTopEnumLiteralDeclaration_3()); 
                    // InternalJavaFXLang.g:547:3: ( 'Top' )
                    // InternalJavaFXLang.g:547:4: 'Top'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrientationAccess().getTopEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Orientation__Alternatives"


    // $ANTLR start "rule__BindinType__Alternatives"
    // InternalJavaFXLang.g:555:1: rule__BindinType__Alternatives : ( ( ( 'BooleanProperty' ) ) | ( ( 'DoubleProperty' ) ) | ( ( 'FloatProperty' ) ) | ( ( 'IntegerProperty' ) ) | ( ( 'ObservableList' ) ) | ( ( 'ObjectProperty' ) ) | ( ( 'StringProperty' ) ) );
    public final void rule__BindinType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:559:1: ( ( ( 'BooleanProperty' ) ) | ( ( 'DoubleProperty' ) ) | ( ( 'FloatProperty' ) ) | ( ( 'IntegerProperty' ) ) | ( ( 'ObservableList' ) ) | ( ( 'ObjectProperty' ) ) | ( ( 'StringProperty' ) ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            case 21:
                {
                alt5=5;
                }
                break;
            case 22:
                {
                alt5=6;
                }
                break;
            case 23:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalJavaFXLang.g:560:2: ( ( 'BooleanProperty' ) )
                    {
                    // InternalJavaFXLang.g:560:2: ( ( 'BooleanProperty' ) )
                    // InternalJavaFXLang.g:561:3: ( 'BooleanProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getBooleanPropertyEnumLiteralDeclaration_0()); 
                    // InternalJavaFXLang.g:562:3: ( 'BooleanProperty' )
                    // InternalJavaFXLang.g:562:4: 'BooleanProperty'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getBooleanPropertyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:566:2: ( ( 'DoubleProperty' ) )
                    {
                    // InternalJavaFXLang.g:566:2: ( ( 'DoubleProperty' ) )
                    // InternalJavaFXLang.g:567:3: ( 'DoubleProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getDoublePropertyEnumLiteralDeclaration_1()); 
                    // InternalJavaFXLang.g:568:3: ( 'DoubleProperty' )
                    // InternalJavaFXLang.g:568:4: 'DoubleProperty'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getDoublePropertyEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJavaFXLang.g:572:2: ( ( 'FloatProperty' ) )
                    {
                    // InternalJavaFXLang.g:572:2: ( ( 'FloatProperty' ) )
                    // InternalJavaFXLang.g:573:3: ( 'FloatProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getFloatPropertyEnumLiteralDeclaration_2()); 
                    // InternalJavaFXLang.g:574:3: ( 'FloatProperty' )
                    // InternalJavaFXLang.g:574:4: 'FloatProperty'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getFloatPropertyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJavaFXLang.g:578:2: ( ( 'IntegerProperty' ) )
                    {
                    // InternalJavaFXLang.g:578:2: ( ( 'IntegerProperty' ) )
                    // InternalJavaFXLang.g:579:3: ( 'IntegerProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getIntegerPropertyEnumLiteralDeclaration_3()); 
                    // InternalJavaFXLang.g:580:3: ( 'IntegerProperty' )
                    // InternalJavaFXLang.g:580:4: 'IntegerProperty'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getIntegerPropertyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJavaFXLang.g:584:2: ( ( 'ObservableList' ) )
                    {
                    // InternalJavaFXLang.g:584:2: ( ( 'ObservableList' ) )
                    // InternalJavaFXLang.g:585:3: ( 'ObservableList' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getObservableListEnumLiteralDeclaration_4()); 
                    // InternalJavaFXLang.g:586:3: ( 'ObservableList' )
                    // InternalJavaFXLang.g:586:4: 'ObservableList'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getObservableListEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJavaFXLang.g:590:2: ( ( 'ObjectProperty' ) )
                    {
                    // InternalJavaFXLang.g:590:2: ( ( 'ObjectProperty' ) )
                    // InternalJavaFXLang.g:591:3: ( 'ObjectProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getObjectPropertyEnumLiteralDeclaration_5()); 
                    // InternalJavaFXLang.g:592:3: ( 'ObjectProperty' )
                    // InternalJavaFXLang.g:592:4: 'ObjectProperty'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getObjectPropertyEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJavaFXLang.g:596:2: ( ( 'StringProperty' ) )
                    {
                    // InternalJavaFXLang.g:596:2: ( ( 'StringProperty' ) )
                    // InternalJavaFXLang.g:597:3: ( 'StringProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getStringPropertyEnumLiteralDeclaration_6()); 
                    // InternalJavaFXLang.g:598:3: ( 'StringProperty' )
                    // InternalJavaFXLang.g:598:4: 'StringProperty'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getStringPropertyEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__BindinType__Alternatives"


    // $ANTLR start "rule__ProjectFX__Group__0"
    // InternalJavaFXLang.g:606:1: rule__ProjectFX__Group__0 : rule__ProjectFX__Group__0__Impl rule__ProjectFX__Group__1 ;
    public final void rule__ProjectFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:610:1: ( rule__ProjectFX__Group__0__Impl rule__ProjectFX__Group__1 )
            // InternalJavaFXLang.g:611:2: rule__ProjectFX__Group__0__Impl rule__ProjectFX__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ProjectFX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group__1();

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
    // $ANTLR end "rule__ProjectFX__Group__0"


    // $ANTLR start "rule__ProjectFX__Group__0__Impl"
    // InternalJavaFXLang.g:618:1: rule__ProjectFX__Group__0__Impl : ( () ) ;
    public final void rule__ProjectFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:622:1: ( ( () ) )
            // InternalJavaFXLang.g:623:1: ( () )
            {
            // InternalJavaFXLang.g:623:1: ( () )
            // InternalJavaFXLang.g:624:2: ()
            {
             before(grammarAccess.getProjectFXAccess().getProjectFXAction_0()); 
            // InternalJavaFXLang.g:625:2: ()
            // InternalJavaFXLang.g:625:3: 
            {
            }

             after(grammarAccess.getProjectFXAccess().getProjectFXAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectFX__Group__0__Impl"


    // $ANTLR start "rule__ProjectFX__Group__1"
    // InternalJavaFXLang.g:633:1: rule__ProjectFX__Group__1 : rule__ProjectFX__Group__1__Impl rule__ProjectFX__Group__2 ;
    public final void rule__ProjectFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:637:1: ( rule__ProjectFX__Group__1__Impl rule__ProjectFX__Group__2 )
            // InternalJavaFXLang.g:638:2: rule__ProjectFX__Group__1__Impl rule__ProjectFX__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ProjectFX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group__2();

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
    // $ANTLR end "rule__ProjectFX__Group__1"


    // $ANTLR start "rule__ProjectFX__Group__1__Impl"
    // InternalJavaFXLang.g:645:1: rule__ProjectFX__Group__1__Impl : ( 'ProjectFX' ) ;
    public final void rule__ProjectFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:649:1: ( ( 'ProjectFX' ) )
            // InternalJavaFXLang.g:650:1: ( 'ProjectFX' )
            {
            // InternalJavaFXLang.g:650:1: ( 'ProjectFX' )
            // InternalJavaFXLang.g:651:2: 'ProjectFX'
            {
             before(grammarAccess.getProjectFXAccess().getProjectFXKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProjectFXAccess().getProjectFXKeyword_1()); 

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
    // $ANTLR end "rule__ProjectFX__Group__1__Impl"


    // $ANTLR start "rule__ProjectFX__Group__2"
    // InternalJavaFXLang.g:660:1: rule__ProjectFX__Group__2 : rule__ProjectFX__Group__2__Impl rule__ProjectFX__Group__3 ;
    public final void rule__ProjectFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:664:1: ( rule__ProjectFX__Group__2__Impl rule__ProjectFX__Group__3 )
            // InternalJavaFXLang.g:665:2: rule__ProjectFX__Group__2__Impl rule__ProjectFX__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ProjectFX__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group__3();

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
    // $ANTLR end "rule__ProjectFX__Group__2"


    // $ANTLR start "rule__ProjectFX__Group__2__Impl"
    // InternalJavaFXLang.g:672:1: rule__ProjectFX__Group__2__Impl : ( ( rule__ProjectFX__NameAssignment_2 ) ) ;
    public final void rule__ProjectFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:676:1: ( ( ( rule__ProjectFX__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:677:1: ( ( rule__ProjectFX__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:677:1: ( ( rule__ProjectFX__NameAssignment_2 ) )
            // InternalJavaFXLang.g:678:2: ( rule__ProjectFX__NameAssignment_2 )
            {
             before(grammarAccess.getProjectFXAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:679:2: ( rule__ProjectFX__NameAssignment_2 )
            // InternalJavaFXLang.g:679:3: rule__ProjectFX__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ProjectFX__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectFXAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ProjectFX__Group__2__Impl"


    // $ANTLR start "rule__ProjectFX__Group__3"
    // InternalJavaFXLang.g:687:1: rule__ProjectFX__Group__3 : rule__ProjectFX__Group__3__Impl rule__ProjectFX__Group__4 ;
    public final void rule__ProjectFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:691:1: ( rule__ProjectFX__Group__3__Impl rule__ProjectFX__Group__4 )
            // InternalJavaFXLang.g:692:2: rule__ProjectFX__Group__3__Impl rule__ProjectFX__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ProjectFX__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group__4();

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
    // $ANTLR end "rule__ProjectFX__Group__3"


    // $ANTLR start "rule__ProjectFX__Group__3__Impl"
    // InternalJavaFXLang.g:699:1: rule__ProjectFX__Group__3__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:703:1: ( ( '{' ) )
            // InternalJavaFXLang.g:704:1: ( '{' )
            {
            // InternalJavaFXLang.g:704:1: ( '{' )
            // InternalJavaFXLang.g:705:2: '{'
            {
             before(grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ProjectFX__Group__3__Impl"


    // $ANTLR start "rule__ProjectFX__Group__4"
    // InternalJavaFXLang.g:714:1: rule__ProjectFX__Group__4 : rule__ProjectFX__Group__4__Impl rule__ProjectFX__Group__5 ;
    public final void rule__ProjectFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:718:1: ( rule__ProjectFX__Group__4__Impl rule__ProjectFX__Group__5 )
            // InternalJavaFXLang.g:719:2: rule__ProjectFX__Group__4__Impl rule__ProjectFX__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ProjectFX__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group__5();

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
    // $ANTLR end "rule__ProjectFX__Group__4"


    // $ANTLR start "rule__ProjectFX__Group__4__Impl"
    // InternalJavaFXLang.g:726:1: rule__ProjectFX__Group__4__Impl : ( ( rule__ProjectFX__Group_4__0 )? ) ;
    public final void rule__ProjectFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:730:1: ( ( ( rule__ProjectFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:731:1: ( ( rule__ProjectFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:731:1: ( ( rule__ProjectFX__Group_4__0 )? )
            // InternalJavaFXLang.g:732:2: ( rule__ProjectFX__Group_4__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:733:2: ( rule__ProjectFX__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJavaFXLang.g:733:3: rule__ProjectFX__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectFX__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectFXAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ProjectFX__Group__4__Impl"


    // $ANTLR start "rule__ProjectFX__Group__5"
    // InternalJavaFXLang.g:741:1: rule__ProjectFX__Group__5 : rule__ProjectFX__Group__5__Impl rule__ProjectFX__Group__6 ;
    public final void rule__ProjectFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:745:1: ( rule__ProjectFX__Group__5__Impl rule__ProjectFX__Group__6 )
            // InternalJavaFXLang.g:746:2: rule__ProjectFX__Group__5__Impl rule__ProjectFX__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ProjectFX__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group__6();

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
    // $ANTLR end "rule__ProjectFX__Group__5"


    // $ANTLR start "rule__ProjectFX__Group__5__Impl"
    // InternalJavaFXLang.g:753:1: rule__ProjectFX__Group__5__Impl : ( ( rule__ProjectFX__Group_5__0 )? ) ;
    public final void rule__ProjectFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:757:1: ( ( ( rule__ProjectFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:758:1: ( ( rule__ProjectFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:758:1: ( ( rule__ProjectFX__Group_5__0 )? )
            // InternalJavaFXLang.g:759:2: ( rule__ProjectFX__Group_5__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:760:2: ( rule__ProjectFX__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJavaFXLang.g:760:3: rule__ProjectFX__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectFX__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectFXAccess().getGroup_5()); 

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
    // $ANTLR end "rule__ProjectFX__Group__5__Impl"


    // $ANTLR start "rule__ProjectFX__Group__6"
    // InternalJavaFXLang.g:768:1: rule__ProjectFX__Group__6 : rule__ProjectFX__Group__6__Impl rule__ProjectFX__Group__7 ;
    public final void rule__ProjectFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:772:1: ( rule__ProjectFX__Group__6__Impl rule__ProjectFX__Group__7 )
            // InternalJavaFXLang.g:773:2: rule__ProjectFX__Group__6__Impl rule__ProjectFX__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__ProjectFX__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group__7();

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
    // $ANTLR end "rule__ProjectFX__Group__6"


    // $ANTLR start "rule__ProjectFX__Group__6__Impl"
    // InternalJavaFXLang.g:780:1: rule__ProjectFX__Group__6__Impl : ( ( rule__ProjectFX__Group_6__0 )? ) ;
    public final void rule__ProjectFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:784:1: ( ( ( rule__ProjectFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:785:1: ( ( rule__ProjectFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:785:1: ( ( rule__ProjectFX__Group_6__0 )? )
            // InternalJavaFXLang.g:786:2: ( rule__ProjectFX__Group_6__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:787:2: ( rule__ProjectFX__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJavaFXLang.g:787:3: rule__ProjectFX__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectFX__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectFXAccess().getGroup_6()); 

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
    // $ANTLR end "rule__ProjectFX__Group__6__Impl"


    // $ANTLR start "rule__ProjectFX__Group__7"
    // InternalJavaFXLang.g:795:1: rule__ProjectFX__Group__7 : rule__ProjectFX__Group__7__Impl rule__ProjectFX__Group__8 ;
    public final void rule__ProjectFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:799:1: ( rule__ProjectFX__Group__7__Impl rule__ProjectFX__Group__8 )
            // InternalJavaFXLang.g:800:2: rule__ProjectFX__Group__7__Impl rule__ProjectFX__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__ProjectFX__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group__8();

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
    // $ANTLR end "rule__ProjectFX__Group__7"


    // $ANTLR start "rule__ProjectFX__Group__7__Impl"
    // InternalJavaFXLang.g:807:1: rule__ProjectFX__Group__7__Impl : ( ( rule__ProjectFX__Group_7__0 )? ) ;
    public final void rule__ProjectFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:811:1: ( ( ( rule__ProjectFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:812:1: ( ( rule__ProjectFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:812:1: ( ( rule__ProjectFX__Group_7__0 )? )
            // InternalJavaFXLang.g:813:2: ( rule__ProjectFX__Group_7__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:814:2: ( rule__ProjectFX__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJavaFXLang.g:814:3: rule__ProjectFX__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectFX__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectFXAccess().getGroup_7()); 

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
    // $ANTLR end "rule__ProjectFX__Group__7__Impl"


    // $ANTLR start "rule__ProjectFX__Group__8"
    // InternalJavaFXLang.g:822:1: rule__ProjectFX__Group__8 : rule__ProjectFX__Group__8__Impl rule__ProjectFX__Group__9 ;
    public final void rule__ProjectFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:826:1: ( rule__ProjectFX__Group__8__Impl rule__ProjectFX__Group__9 )
            // InternalJavaFXLang.g:827:2: rule__ProjectFX__Group__8__Impl rule__ProjectFX__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__ProjectFX__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group__9();

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
    // $ANTLR end "rule__ProjectFX__Group__8"


    // $ANTLR start "rule__ProjectFX__Group__8__Impl"
    // InternalJavaFXLang.g:834:1: rule__ProjectFX__Group__8__Impl : ( ( rule__ProjectFX__Group_8__0 )? ) ;
    public final void rule__ProjectFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:838:1: ( ( ( rule__ProjectFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:839:1: ( ( rule__ProjectFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:839:1: ( ( rule__ProjectFX__Group_8__0 )? )
            // InternalJavaFXLang.g:840:2: ( rule__ProjectFX__Group_8__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:841:2: ( rule__ProjectFX__Group_8__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJavaFXLang.g:841:3: rule__ProjectFX__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectFX__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectFXAccess().getGroup_8()); 

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
    // $ANTLR end "rule__ProjectFX__Group__8__Impl"


    // $ANTLR start "rule__ProjectFX__Group__9"
    // InternalJavaFXLang.g:849:1: rule__ProjectFX__Group__9 : rule__ProjectFX__Group__9__Impl ;
    public final void rule__ProjectFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:853:1: ( rule__ProjectFX__Group__9__Impl )
            // InternalJavaFXLang.g:854:2: rule__ProjectFX__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group__9__Impl();

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
    // $ANTLR end "rule__ProjectFX__Group__9"


    // $ANTLR start "rule__ProjectFX__Group__9__Impl"
    // InternalJavaFXLang.g:860:1: rule__ProjectFX__Group__9__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:864:1: ( ( '}' ) )
            // InternalJavaFXLang.g:865:1: ( '}' )
            {
            // InternalJavaFXLang.g:865:1: ( '}' )
            // InternalJavaFXLang.g:866:2: '}'
            {
             before(grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__ProjectFX__Group__9__Impl"


    // $ANTLR start "rule__ProjectFX__Group_4__0"
    // InternalJavaFXLang.g:876:1: rule__ProjectFX__Group_4__0 : rule__ProjectFX__Group_4__0__Impl rule__ProjectFX__Group_4__1 ;
    public final void rule__ProjectFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:880:1: ( rule__ProjectFX__Group_4__0__Impl rule__ProjectFX__Group_4__1 )
            // InternalJavaFXLang.g:881:2: rule__ProjectFX__Group_4__0__Impl rule__ProjectFX__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__ProjectFX__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_4__1();

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
    // $ANTLR end "rule__ProjectFX__Group_4__0"


    // $ANTLR start "rule__ProjectFX__Group_4__0__Impl"
    // InternalJavaFXLang.g:888:1: rule__ProjectFX__Group_4__0__Impl : ( 'packagePath' ) ;
    public final void rule__ProjectFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:892:1: ( ( 'packagePath' ) )
            // InternalJavaFXLang.g:893:1: ( 'packagePath' )
            {
            // InternalJavaFXLang.g:893:1: ( 'packagePath' )
            // InternalJavaFXLang.g:894:2: 'packagePath'
            {
             before(grammarAccess.getProjectFXAccess().getPackagePathKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProjectFXAccess().getPackagePathKeyword_4_0()); 

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
    // $ANTLR end "rule__ProjectFX__Group_4__0__Impl"


    // $ANTLR start "rule__ProjectFX__Group_4__1"
    // InternalJavaFXLang.g:903:1: rule__ProjectFX__Group_4__1 : rule__ProjectFX__Group_4__1__Impl ;
    public final void rule__ProjectFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:907:1: ( rule__ProjectFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:908:2: rule__ProjectFX__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_4__1__Impl();

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
    // $ANTLR end "rule__ProjectFX__Group_4__1"


    // $ANTLR start "rule__ProjectFX__Group_4__1__Impl"
    // InternalJavaFXLang.g:914:1: rule__ProjectFX__Group_4__1__Impl : ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) ) ;
    public final void rule__ProjectFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:918:1: ( ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:919:1: ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:919:1: ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) )
            // InternalJavaFXLang.g:920:2: ( rule__ProjectFX__PackagePathAssignment_4_1 )
            {
             before(grammarAccess.getProjectFXAccess().getPackagePathAssignment_4_1()); 
            // InternalJavaFXLang.g:921:2: ( rule__ProjectFX__PackagePathAssignment_4_1 )
            // InternalJavaFXLang.g:921:3: rule__ProjectFX__PackagePathAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectFX__PackagePathAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectFXAccess().getPackagePathAssignment_4_1()); 

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
    // $ANTLR end "rule__ProjectFX__Group_4__1__Impl"


    // $ANTLR start "rule__ProjectFX__Group_5__0"
    // InternalJavaFXLang.g:930:1: rule__ProjectFX__Group_5__0 : rule__ProjectFX__Group_5__0__Impl rule__ProjectFX__Group_5__1 ;
    public final void rule__ProjectFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:934:1: ( rule__ProjectFX__Group_5__0__Impl rule__ProjectFX__Group_5__1 )
            // InternalJavaFXLang.g:935:2: rule__ProjectFX__Group_5__0__Impl rule__ProjectFX__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__ProjectFX__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_5__1();

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
    // $ANTLR end "rule__ProjectFX__Group_5__0"


    // $ANTLR start "rule__ProjectFX__Group_5__0__Impl"
    // InternalJavaFXLang.g:942:1: rule__ProjectFX__Group_5__0__Impl : ( 'controls' ) ;
    public final void rule__ProjectFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:946:1: ( ( 'controls' ) )
            // InternalJavaFXLang.g:947:1: ( 'controls' )
            {
            // InternalJavaFXLang.g:947:1: ( 'controls' )
            // InternalJavaFXLang.g:948:2: 'controls'
            {
             before(grammarAccess.getProjectFXAccess().getControlsKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProjectFXAccess().getControlsKeyword_5_0()); 

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
    // $ANTLR end "rule__ProjectFX__Group_5__0__Impl"


    // $ANTLR start "rule__ProjectFX__Group_5__1"
    // InternalJavaFXLang.g:957:1: rule__ProjectFX__Group_5__1 : rule__ProjectFX__Group_5__1__Impl rule__ProjectFX__Group_5__2 ;
    public final void rule__ProjectFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:961:1: ( rule__ProjectFX__Group_5__1__Impl rule__ProjectFX__Group_5__2 )
            // InternalJavaFXLang.g:962:2: rule__ProjectFX__Group_5__1__Impl rule__ProjectFX__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__ProjectFX__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_5__2();

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
    // $ANTLR end "rule__ProjectFX__Group_5__1"


    // $ANTLR start "rule__ProjectFX__Group_5__1__Impl"
    // InternalJavaFXLang.g:969:1: rule__ProjectFX__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:973:1: ( ( '{' ) )
            // InternalJavaFXLang.g:974:1: ( '{' )
            {
            // InternalJavaFXLang.g:974:1: ( '{' )
            // InternalJavaFXLang.g:975:2: '{'
            {
             before(grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__ProjectFX__Group_5__1__Impl"


    // $ANTLR start "rule__ProjectFX__Group_5__2"
    // InternalJavaFXLang.g:984:1: rule__ProjectFX__Group_5__2 : rule__ProjectFX__Group_5__2__Impl rule__ProjectFX__Group_5__3 ;
    public final void rule__ProjectFX__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:988:1: ( rule__ProjectFX__Group_5__2__Impl rule__ProjectFX__Group_5__3 )
            // InternalJavaFXLang.g:989:2: rule__ProjectFX__Group_5__2__Impl rule__ProjectFX__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__ProjectFX__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_5__3();

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
    // $ANTLR end "rule__ProjectFX__Group_5__2"


    // $ANTLR start "rule__ProjectFX__Group_5__2__Impl"
    // InternalJavaFXLang.g:996:1: rule__ProjectFX__Group_5__2__Impl : ( ( rule__ProjectFX__ControlsAssignment_5_2 ) ) ;
    public final void rule__ProjectFX__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1000:1: ( ( ( rule__ProjectFX__ControlsAssignment_5_2 ) ) )
            // InternalJavaFXLang.g:1001:1: ( ( rule__ProjectFX__ControlsAssignment_5_2 ) )
            {
            // InternalJavaFXLang.g:1001:1: ( ( rule__ProjectFX__ControlsAssignment_5_2 ) )
            // InternalJavaFXLang.g:1002:2: ( rule__ProjectFX__ControlsAssignment_5_2 )
            {
             before(grammarAccess.getProjectFXAccess().getControlsAssignment_5_2()); 
            // InternalJavaFXLang.g:1003:2: ( rule__ProjectFX__ControlsAssignment_5_2 )
            // InternalJavaFXLang.g:1003:3: rule__ProjectFX__ControlsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ProjectFX__ControlsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectFXAccess().getControlsAssignment_5_2()); 

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
    // $ANTLR end "rule__ProjectFX__Group_5__2__Impl"


    // $ANTLR start "rule__ProjectFX__Group_5__3"
    // InternalJavaFXLang.g:1011:1: rule__ProjectFX__Group_5__3 : rule__ProjectFX__Group_5__3__Impl rule__ProjectFX__Group_5__4 ;
    public final void rule__ProjectFX__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1015:1: ( rule__ProjectFX__Group_5__3__Impl rule__ProjectFX__Group_5__4 )
            // InternalJavaFXLang.g:1016:2: rule__ProjectFX__Group_5__3__Impl rule__ProjectFX__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__ProjectFX__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_5__4();

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
    // $ANTLR end "rule__ProjectFX__Group_5__3"


    // $ANTLR start "rule__ProjectFX__Group_5__3__Impl"
    // InternalJavaFXLang.g:1023:1: rule__ProjectFX__Group_5__3__Impl : ( ( rule__ProjectFX__ControlsAssignment_5_3 )* ) ;
    public final void rule__ProjectFX__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1027:1: ( ( ( rule__ProjectFX__ControlsAssignment_5_3 )* ) )
            // InternalJavaFXLang.g:1028:1: ( ( rule__ProjectFX__ControlsAssignment_5_3 )* )
            {
            // InternalJavaFXLang.g:1028:1: ( ( rule__ProjectFX__ControlsAssignment_5_3 )* )
            // InternalJavaFXLang.g:1029:2: ( rule__ProjectFX__ControlsAssignment_5_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getControlsAssignment_5_3()); 
            // InternalJavaFXLang.g:1030:2: ( rule__ProjectFX__ControlsAssignment_5_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==43) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJavaFXLang.g:1030:3: rule__ProjectFX__ControlsAssignment_5_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ProjectFX__ControlsAssignment_5_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getProjectFXAccess().getControlsAssignment_5_3()); 

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
    // $ANTLR end "rule__ProjectFX__Group_5__3__Impl"


    // $ANTLR start "rule__ProjectFX__Group_5__4"
    // InternalJavaFXLang.g:1038:1: rule__ProjectFX__Group_5__4 : rule__ProjectFX__Group_5__4__Impl ;
    public final void rule__ProjectFX__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1042:1: ( rule__ProjectFX__Group_5__4__Impl )
            // InternalJavaFXLang.g:1043:2: rule__ProjectFX__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_5__4__Impl();

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
    // $ANTLR end "rule__ProjectFX__Group_5__4"


    // $ANTLR start "rule__ProjectFX__Group_5__4__Impl"
    // InternalJavaFXLang.g:1049:1: rule__ProjectFX__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1053:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1054:1: ( '}' )
            {
            // InternalJavaFXLang.g:1054:1: ( '}' )
            // InternalJavaFXLang.g:1055:2: '}'
            {
             before(grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__ProjectFX__Group_5__4__Impl"


    // $ANTLR start "rule__ProjectFX__Group_6__0"
    // InternalJavaFXLang.g:1065:1: rule__ProjectFX__Group_6__0 : rule__ProjectFX__Group_6__0__Impl rule__ProjectFX__Group_6__1 ;
    public final void rule__ProjectFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1069:1: ( rule__ProjectFX__Group_6__0__Impl rule__ProjectFX__Group_6__1 )
            // InternalJavaFXLang.g:1070:2: rule__ProjectFX__Group_6__0__Impl rule__ProjectFX__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__ProjectFX__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_6__1();

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
    // $ANTLR end "rule__ProjectFX__Group_6__0"


    // $ANTLR start "rule__ProjectFX__Group_6__0__Impl"
    // InternalJavaFXLang.g:1077:1: rule__ProjectFX__Group_6__0__Impl : ( 'models' ) ;
    public final void rule__ProjectFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1081:1: ( ( 'models' ) )
            // InternalJavaFXLang.g:1082:1: ( 'models' )
            {
            // InternalJavaFXLang.g:1082:1: ( 'models' )
            // InternalJavaFXLang.g:1083:2: 'models'
            {
             before(grammarAccess.getProjectFXAccess().getModelsKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProjectFXAccess().getModelsKeyword_6_0()); 

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
    // $ANTLR end "rule__ProjectFX__Group_6__0__Impl"


    // $ANTLR start "rule__ProjectFX__Group_6__1"
    // InternalJavaFXLang.g:1092:1: rule__ProjectFX__Group_6__1 : rule__ProjectFX__Group_6__1__Impl rule__ProjectFX__Group_6__2 ;
    public final void rule__ProjectFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1096:1: ( rule__ProjectFX__Group_6__1__Impl rule__ProjectFX__Group_6__2 )
            // InternalJavaFXLang.g:1097:2: rule__ProjectFX__Group_6__1__Impl rule__ProjectFX__Group_6__2
            {
            pushFollow(FOLLOW_10);
            rule__ProjectFX__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_6__2();

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
    // $ANTLR end "rule__ProjectFX__Group_6__1"


    // $ANTLR start "rule__ProjectFX__Group_6__1__Impl"
    // InternalJavaFXLang.g:1104:1: rule__ProjectFX__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1108:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1109:1: ( '{' )
            {
            // InternalJavaFXLang.g:1109:1: ( '{' )
            // InternalJavaFXLang.g:1110:2: '{'
            {
             before(grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__ProjectFX__Group_6__1__Impl"


    // $ANTLR start "rule__ProjectFX__Group_6__2"
    // InternalJavaFXLang.g:1119:1: rule__ProjectFX__Group_6__2 : rule__ProjectFX__Group_6__2__Impl rule__ProjectFX__Group_6__3 ;
    public final void rule__ProjectFX__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1123:1: ( rule__ProjectFX__Group_6__2__Impl rule__ProjectFX__Group_6__3 )
            // InternalJavaFXLang.g:1124:2: rule__ProjectFX__Group_6__2__Impl rule__ProjectFX__Group_6__3
            {
            pushFollow(FOLLOW_11);
            rule__ProjectFX__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_6__3();

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
    // $ANTLR end "rule__ProjectFX__Group_6__2"


    // $ANTLR start "rule__ProjectFX__Group_6__2__Impl"
    // InternalJavaFXLang.g:1131:1: rule__ProjectFX__Group_6__2__Impl : ( ( rule__ProjectFX__ModelsAssignment_6_2 ) ) ;
    public final void rule__ProjectFX__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1135:1: ( ( ( rule__ProjectFX__ModelsAssignment_6_2 ) ) )
            // InternalJavaFXLang.g:1136:1: ( ( rule__ProjectFX__ModelsAssignment_6_2 ) )
            {
            // InternalJavaFXLang.g:1136:1: ( ( rule__ProjectFX__ModelsAssignment_6_2 ) )
            // InternalJavaFXLang.g:1137:2: ( rule__ProjectFX__ModelsAssignment_6_2 )
            {
             before(grammarAccess.getProjectFXAccess().getModelsAssignment_6_2()); 
            // InternalJavaFXLang.g:1138:2: ( rule__ProjectFX__ModelsAssignment_6_2 )
            // InternalJavaFXLang.g:1138:3: rule__ProjectFX__ModelsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ProjectFX__ModelsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectFXAccess().getModelsAssignment_6_2()); 

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
    // $ANTLR end "rule__ProjectFX__Group_6__2__Impl"


    // $ANTLR start "rule__ProjectFX__Group_6__3"
    // InternalJavaFXLang.g:1146:1: rule__ProjectFX__Group_6__3 : rule__ProjectFX__Group_6__3__Impl rule__ProjectFX__Group_6__4 ;
    public final void rule__ProjectFX__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1150:1: ( rule__ProjectFX__Group_6__3__Impl rule__ProjectFX__Group_6__4 )
            // InternalJavaFXLang.g:1151:2: rule__ProjectFX__Group_6__3__Impl rule__ProjectFX__Group_6__4
            {
            pushFollow(FOLLOW_11);
            rule__ProjectFX__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_6__4();

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
    // $ANTLR end "rule__ProjectFX__Group_6__3"


    // $ANTLR start "rule__ProjectFX__Group_6__3__Impl"
    // InternalJavaFXLang.g:1158:1: rule__ProjectFX__Group_6__3__Impl : ( ( rule__ProjectFX__ModelsAssignment_6_3 )* ) ;
    public final void rule__ProjectFX__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1162:1: ( ( ( rule__ProjectFX__ModelsAssignment_6_3 )* ) )
            // InternalJavaFXLang.g:1163:1: ( ( rule__ProjectFX__ModelsAssignment_6_3 )* )
            {
            // InternalJavaFXLang.g:1163:1: ( ( rule__ProjectFX__ModelsAssignment_6_3 )* )
            // InternalJavaFXLang.g:1164:2: ( rule__ProjectFX__ModelsAssignment_6_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getModelsAssignment_6_3()); 
            // InternalJavaFXLang.g:1165:2: ( rule__ProjectFX__ModelsAssignment_6_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==41) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalJavaFXLang.g:1165:3: rule__ProjectFX__ModelsAssignment_6_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ProjectFX__ModelsAssignment_6_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getProjectFXAccess().getModelsAssignment_6_3()); 

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
    // $ANTLR end "rule__ProjectFX__Group_6__3__Impl"


    // $ANTLR start "rule__ProjectFX__Group_6__4"
    // InternalJavaFXLang.g:1173:1: rule__ProjectFX__Group_6__4 : rule__ProjectFX__Group_6__4__Impl ;
    public final void rule__ProjectFX__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1177:1: ( rule__ProjectFX__Group_6__4__Impl )
            // InternalJavaFXLang.g:1178:2: rule__ProjectFX__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_6__4__Impl();

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
    // $ANTLR end "rule__ProjectFX__Group_6__4"


    // $ANTLR start "rule__ProjectFX__Group_6__4__Impl"
    // InternalJavaFXLang.g:1184:1: rule__ProjectFX__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1188:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1189:1: ( '}' )
            {
            // InternalJavaFXLang.g:1189:1: ( '}' )
            // InternalJavaFXLang.g:1190:2: '}'
            {
             before(grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__ProjectFX__Group_6__4__Impl"


    // $ANTLR start "rule__ProjectFX__Group_7__0"
    // InternalJavaFXLang.g:1200:1: rule__ProjectFX__Group_7__0 : rule__ProjectFX__Group_7__0__Impl rule__ProjectFX__Group_7__1 ;
    public final void rule__ProjectFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1204:1: ( rule__ProjectFX__Group_7__0__Impl rule__ProjectFX__Group_7__1 )
            // InternalJavaFXLang.g:1205:2: rule__ProjectFX__Group_7__0__Impl rule__ProjectFX__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__ProjectFX__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_7__1();

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
    // $ANTLR end "rule__ProjectFX__Group_7__0"


    // $ANTLR start "rule__ProjectFX__Group_7__0__Impl"
    // InternalJavaFXLang.g:1212:1: rule__ProjectFX__Group_7__0__Impl : ( 'bindings' ) ;
    public final void rule__ProjectFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1216:1: ( ( 'bindings' ) )
            // InternalJavaFXLang.g:1217:1: ( 'bindings' )
            {
            // InternalJavaFXLang.g:1217:1: ( 'bindings' )
            // InternalJavaFXLang.g:1218:2: 'bindings'
            {
             before(grammarAccess.getProjectFXAccess().getBindingsKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProjectFXAccess().getBindingsKeyword_7_0()); 

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
    // $ANTLR end "rule__ProjectFX__Group_7__0__Impl"


    // $ANTLR start "rule__ProjectFX__Group_7__1"
    // InternalJavaFXLang.g:1227:1: rule__ProjectFX__Group_7__1 : rule__ProjectFX__Group_7__1__Impl rule__ProjectFX__Group_7__2 ;
    public final void rule__ProjectFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1231:1: ( rule__ProjectFX__Group_7__1__Impl rule__ProjectFX__Group_7__2 )
            // InternalJavaFXLang.g:1232:2: rule__ProjectFX__Group_7__1__Impl rule__ProjectFX__Group_7__2
            {
            pushFollow(FOLLOW_13);
            rule__ProjectFX__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_7__2();

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
    // $ANTLR end "rule__ProjectFX__Group_7__1"


    // $ANTLR start "rule__ProjectFX__Group_7__1__Impl"
    // InternalJavaFXLang.g:1239:1: rule__ProjectFX__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1243:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1244:1: ( '{' )
            {
            // InternalJavaFXLang.g:1244:1: ( '{' )
            // InternalJavaFXLang.g:1245:2: '{'
            {
             before(grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__ProjectFX__Group_7__1__Impl"


    // $ANTLR start "rule__ProjectFX__Group_7__2"
    // InternalJavaFXLang.g:1254:1: rule__ProjectFX__Group_7__2 : rule__ProjectFX__Group_7__2__Impl rule__ProjectFX__Group_7__3 ;
    public final void rule__ProjectFX__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1258:1: ( rule__ProjectFX__Group_7__2__Impl rule__ProjectFX__Group_7__3 )
            // InternalJavaFXLang.g:1259:2: rule__ProjectFX__Group_7__2__Impl rule__ProjectFX__Group_7__3
            {
            pushFollow(FOLLOW_14);
            rule__ProjectFX__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_7__3();

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
    // $ANTLR end "rule__ProjectFX__Group_7__2"


    // $ANTLR start "rule__ProjectFX__Group_7__2__Impl"
    // InternalJavaFXLang.g:1266:1: rule__ProjectFX__Group_7__2__Impl : ( ( rule__ProjectFX__BindingsAssignment_7_2 ) ) ;
    public final void rule__ProjectFX__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1270:1: ( ( ( rule__ProjectFX__BindingsAssignment_7_2 ) ) )
            // InternalJavaFXLang.g:1271:1: ( ( rule__ProjectFX__BindingsAssignment_7_2 ) )
            {
            // InternalJavaFXLang.g:1271:1: ( ( rule__ProjectFX__BindingsAssignment_7_2 ) )
            // InternalJavaFXLang.g:1272:2: ( rule__ProjectFX__BindingsAssignment_7_2 )
            {
             before(grammarAccess.getProjectFXAccess().getBindingsAssignment_7_2()); 
            // InternalJavaFXLang.g:1273:2: ( rule__ProjectFX__BindingsAssignment_7_2 )
            // InternalJavaFXLang.g:1273:3: rule__ProjectFX__BindingsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__ProjectFX__BindingsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectFXAccess().getBindingsAssignment_7_2()); 

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
    // $ANTLR end "rule__ProjectFX__Group_7__2__Impl"


    // $ANTLR start "rule__ProjectFX__Group_7__3"
    // InternalJavaFXLang.g:1281:1: rule__ProjectFX__Group_7__3 : rule__ProjectFX__Group_7__3__Impl rule__ProjectFX__Group_7__4 ;
    public final void rule__ProjectFX__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1285:1: ( rule__ProjectFX__Group_7__3__Impl rule__ProjectFX__Group_7__4 )
            // InternalJavaFXLang.g:1286:2: rule__ProjectFX__Group_7__3__Impl rule__ProjectFX__Group_7__4
            {
            pushFollow(FOLLOW_14);
            rule__ProjectFX__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_7__4();

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
    // $ANTLR end "rule__ProjectFX__Group_7__3"


    // $ANTLR start "rule__ProjectFX__Group_7__3__Impl"
    // InternalJavaFXLang.g:1293:1: rule__ProjectFX__Group_7__3__Impl : ( ( rule__ProjectFX__BindingsAssignment_7_3 )* ) ;
    public final void rule__ProjectFX__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1297:1: ( ( ( rule__ProjectFX__BindingsAssignment_7_3 )* ) )
            // InternalJavaFXLang.g:1298:1: ( ( rule__ProjectFX__BindingsAssignment_7_3 )* )
            {
            // InternalJavaFXLang.g:1298:1: ( ( rule__ProjectFX__BindingsAssignment_7_3 )* )
            // InternalJavaFXLang.g:1299:2: ( rule__ProjectFX__BindingsAssignment_7_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getBindingsAssignment_7_3()); 
            // InternalJavaFXLang.g:1300:2: ( rule__ProjectFX__BindingsAssignment_7_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==40) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalJavaFXLang.g:1300:3: rule__ProjectFX__BindingsAssignment_7_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ProjectFX__BindingsAssignment_7_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getProjectFXAccess().getBindingsAssignment_7_3()); 

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
    // $ANTLR end "rule__ProjectFX__Group_7__3__Impl"


    // $ANTLR start "rule__ProjectFX__Group_7__4"
    // InternalJavaFXLang.g:1308:1: rule__ProjectFX__Group_7__4 : rule__ProjectFX__Group_7__4__Impl ;
    public final void rule__ProjectFX__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1312:1: ( rule__ProjectFX__Group_7__4__Impl )
            // InternalJavaFXLang.g:1313:2: rule__ProjectFX__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_7__4__Impl();

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
    // $ANTLR end "rule__ProjectFX__Group_7__4"


    // $ANTLR start "rule__ProjectFX__Group_7__4__Impl"
    // InternalJavaFXLang.g:1319:1: rule__ProjectFX__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1323:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1324:1: ( '}' )
            {
            // InternalJavaFXLang.g:1324:1: ( '}' )
            // InternalJavaFXLang.g:1325:2: '}'
            {
             before(grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__ProjectFX__Group_7__4__Impl"


    // $ANTLR start "rule__ProjectFX__Group_8__0"
    // InternalJavaFXLang.g:1335:1: rule__ProjectFX__Group_8__0 : rule__ProjectFX__Group_8__0__Impl rule__ProjectFX__Group_8__1 ;
    public final void rule__ProjectFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1339:1: ( rule__ProjectFX__Group_8__0__Impl rule__ProjectFX__Group_8__1 )
            // InternalJavaFXLang.g:1340:2: rule__ProjectFX__Group_8__0__Impl rule__ProjectFX__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__ProjectFX__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_8__1();

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
    // $ANTLR end "rule__ProjectFX__Group_8__0"


    // $ANTLR start "rule__ProjectFX__Group_8__0__Impl"
    // InternalJavaFXLang.g:1347:1: rule__ProjectFX__Group_8__0__Impl : ( 'charts' ) ;
    public final void rule__ProjectFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1351:1: ( ( 'charts' ) )
            // InternalJavaFXLang.g:1352:1: ( 'charts' )
            {
            // InternalJavaFXLang.g:1352:1: ( 'charts' )
            // InternalJavaFXLang.g:1353:2: 'charts'
            {
             before(grammarAccess.getProjectFXAccess().getChartsKeyword_8_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProjectFXAccess().getChartsKeyword_8_0()); 

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
    // $ANTLR end "rule__ProjectFX__Group_8__0__Impl"


    // $ANTLR start "rule__ProjectFX__Group_8__1"
    // InternalJavaFXLang.g:1362:1: rule__ProjectFX__Group_8__1 : rule__ProjectFX__Group_8__1__Impl rule__ProjectFX__Group_8__2 ;
    public final void rule__ProjectFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1366:1: ( rule__ProjectFX__Group_8__1__Impl rule__ProjectFX__Group_8__2 )
            // InternalJavaFXLang.g:1367:2: rule__ProjectFX__Group_8__1__Impl rule__ProjectFX__Group_8__2
            {
            pushFollow(FOLLOW_16);
            rule__ProjectFX__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_8__2();

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
    // $ANTLR end "rule__ProjectFX__Group_8__1"


    // $ANTLR start "rule__ProjectFX__Group_8__1__Impl"
    // InternalJavaFXLang.g:1374:1: rule__ProjectFX__Group_8__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1378:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1379:1: ( '{' )
            {
            // InternalJavaFXLang.g:1379:1: ( '{' )
            // InternalJavaFXLang.g:1380:2: '{'
            {
             before(grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_8_1()); 

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
    // $ANTLR end "rule__ProjectFX__Group_8__1__Impl"


    // $ANTLR start "rule__ProjectFX__Group_8__2"
    // InternalJavaFXLang.g:1389:1: rule__ProjectFX__Group_8__2 : rule__ProjectFX__Group_8__2__Impl rule__ProjectFX__Group_8__3 ;
    public final void rule__ProjectFX__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1393:1: ( rule__ProjectFX__Group_8__2__Impl rule__ProjectFX__Group_8__3 )
            // InternalJavaFXLang.g:1394:2: rule__ProjectFX__Group_8__2__Impl rule__ProjectFX__Group_8__3
            {
            pushFollow(FOLLOW_17);
            rule__ProjectFX__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_8__3();

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
    // $ANTLR end "rule__ProjectFX__Group_8__2"


    // $ANTLR start "rule__ProjectFX__Group_8__2__Impl"
    // InternalJavaFXLang.g:1401:1: rule__ProjectFX__Group_8__2__Impl : ( ( rule__ProjectFX__ChartsAssignment_8_2 ) ) ;
    public final void rule__ProjectFX__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1405:1: ( ( ( rule__ProjectFX__ChartsAssignment_8_2 ) ) )
            // InternalJavaFXLang.g:1406:1: ( ( rule__ProjectFX__ChartsAssignment_8_2 ) )
            {
            // InternalJavaFXLang.g:1406:1: ( ( rule__ProjectFX__ChartsAssignment_8_2 ) )
            // InternalJavaFXLang.g:1407:2: ( rule__ProjectFX__ChartsAssignment_8_2 )
            {
             before(grammarAccess.getProjectFXAccess().getChartsAssignment_8_2()); 
            // InternalJavaFXLang.g:1408:2: ( rule__ProjectFX__ChartsAssignment_8_2 )
            // InternalJavaFXLang.g:1408:3: rule__ProjectFX__ChartsAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__ProjectFX__ChartsAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectFXAccess().getChartsAssignment_8_2()); 

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
    // $ANTLR end "rule__ProjectFX__Group_8__2__Impl"


    // $ANTLR start "rule__ProjectFX__Group_8__3"
    // InternalJavaFXLang.g:1416:1: rule__ProjectFX__Group_8__3 : rule__ProjectFX__Group_8__3__Impl rule__ProjectFX__Group_8__4 ;
    public final void rule__ProjectFX__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1420:1: ( rule__ProjectFX__Group_8__3__Impl rule__ProjectFX__Group_8__4 )
            // InternalJavaFXLang.g:1421:2: rule__ProjectFX__Group_8__3__Impl rule__ProjectFX__Group_8__4
            {
            pushFollow(FOLLOW_17);
            rule__ProjectFX__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_8__4();

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
    // $ANTLR end "rule__ProjectFX__Group_8__3"


    // $ANTLR start "rule__ProjectFX__Group_8__3__Impl"
    // InternalJavaFXLang.g:1428:1: rule__ProjectFX__Group_8__3__Impl : ( ( rule__ProjectFX__ChartsAssignment_8_3 )* ) ;
    public final void rule__ProjectFX__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1432:1: ( ( ( rule__ProjectFX__ChartsAssignment_8_3 )* ) )
            // InternalJavaFXLang.g:1433:1: ( ( rule__ProjectFX__ChartsAssignment_8_3 )* )
            {
            // InternalJavaFXLang.g:1433:1: ( ( rule__ProjectFX__ChartsAssignment_8_3 )* )
            // InternalJavaFXLang.g:1434:2: ( rule__ProjectFX__ChartsAssignment_8_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getChartsAssignment_8_3()); 
            // InternalJavaFXLang.g:1435:2: ( rule__ProjectFX__ChartsAssignment_8_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJavaFXLang.g:1435:3: rule__ProjectFX__ChartsAssignment_8_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ProjectFX__ChartsAssignment_8_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getProjectFXAccess().getChartsAssignment_8_3()); 

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
    // $ANTLR end "rule__ProjectFX__Group_8__3__Impl"


    // $ANTLR start "rule__ProjectFX__Group_8__4"
    // InternalJavaFXLang.g:1443:1: rule__ProjectFX__Group_8__4 : rule__ProjectFX__Group_8__4__Impl ;
    public final void rule__ProjectFX__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1447:1: ( rule__ProjectFX__Group_8__4__Impl )
            // InternalJavaFXLang.g:1448:2: rule__ProjectFX__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_8__4__Impl();

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
    // $ANTLR end "rule__ProjectFX__Group_8__4"


    // $ANTLR start "rule__ProjectFX__Group_8__4__Impl"
    // InternalJavaFXLang.g:1454:1: rule__ProjectFX__Group_8__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1458:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1459:1: ( '}' )
            {
            // InternalJavaFXLang.g:1459:1: ( '}' )
            // InternalJavaFXLang.g:1460:2: '}'
            {
             before(grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_8_4()); 

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
    // $ANTLR end "rule__ProjectFX__Group_8__4__Impl"


    // $ANTLR start "rule__LineChartFX__Group__0"
    // InternalJavaFXLang.g:1470:1: rule__LineChartFX__Group__0 : rule__LineChartFX__Group__0__Impl rule__LineChartFX__Group__1 ;
    public final void rule__LineChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1474:1: ( rule__LineChartFX__Group__0__Impl rule__LineChartFX__Group__1 )
            // InternalJavaFXLang.g:1475:2: rule__LineChartFX__Group__0__Impl rule__LineChartFX__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__LineChartFX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group__1();

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
    // $ANTLR end "rule__LineChartFX__Group__0"


    // $ANTLR start "rule__LineChartFX__Group__0__Impl"
    // InternalJavaFXLang.g:1482:1: rule__LineChartFX__Group__0__Impl : ( () ) ;
    public final void rule__LineChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1486:1: ( ( () ) )
            // InternalJavaFXLang.g:1487:1: ( () )
            {
            // InternalJavaFXLang.g:1487:1: ( () )
            // InternalJavaFXLang.g:1488:2: ()
            {
             before(grammarAccess.getLineChartFXAccess().getLineChartFXAction_0()); 
            // InternalJavaFXLang.g:1489:2: ()
            // InternalJavaFXLang.g:1489:3: 
            {
            }

             after(grammarAccess.getLineChartFXAccess().getLineChartFXAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChartFX__Group__0__Impl"


    // $ANTLR start "rule__LineChartFX__Group__1"
    // InternalJavaFXLang.g:1497:1: rule__LineChartFX__Group__1 : rule__LineChartFX__Group__1__Impl rule__LineChartFX__Group__2 ;
    public final void rule__LineChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1501:1: ( rule__LineChartFX__Group__1__Impl rule__LineChartFX__Group__2 )
            // InternalJavaFXLang.g:1502:2: rule__LineChartFX__Group__1__Impl rule__LineChartFX__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LineChartFX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group__2();

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
    // $ANTLR end "rule__LineChartFX__Group__1"


    // $ANTLR start "rule__LineChartFX__Group__1__Impl"
    // InternalJavaFXLang.g:1509:1: rule__LineChartFX__Group__1__Impl : ( 'LineChart' ) ;
    public final void rule__LineChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1513:1: ( ( 'LineChart' ) )
            // InternalJavaFXLang.g:1514:1: ( 'LineChart' )
            {
            // InternalJavaFXLang.g:1514:1: ( 'LineChart' )
            // InternalJavaFXLang.g:1515:2: 'LineChart'
            {
             before(grammarAccess.getLineChartFXAccess().getLineChartKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLineChartFXAccess().getLineChartKeyword_1()); 

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
    // $ANTLR end "rule__LineChartFX__Group__1__Impl"


    // $ANTLR start "rule__LineChartFX__Group__2"
    // InternalJavaFXLang.g:1524:1: rule__LineChartFX__Group__2 : rule__LineChartFX__Group__2__Impl rule__LineChartFX__Group__3 ;
    public final void rule__LineChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1528:1: ( rule__LineChartFX__Group__2__Impl rule__LineChartFX__Group__3 )
            // InternalJavaFXLang.g:1529:2: rule__LineChartFX__Group__2__Impl rule__LineChartFX__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__LineChartFX__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group__3();

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
    // $ANTLR end "rule__LineChartFX__Group__2"


    // $ANTLR start "rule__LineChartFX__Group__2__Impl"
    // InternalJavaFXLang.g:1536:1: rule__LineChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__LineChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1540:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1541:1: ( '{' )
            {
            // InternalJavaFXLang.g:1541:1: ( '{' )
            // InternalJavaFXLang.g:1542:2: '{'
            {
             before(grammarAccess.getLineChartFXAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLineChartFXAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__LineChartFX__Group__2__Impl"


    // $ANTLR start "rule__LineChartFX__Group__3"
    // InternalJavaFXLang.g:1551:1: rule__LineChartFX__Group__3 : rule__LineChartFX__Group__3__Impl rule__LineChartFX__Group__4 ;
    public final void rule__LineChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1555:1: ( rule__LineChartFX__Group__3__Impl rule__LineChartFX__Group__4 )
            // InternalJavaFXLang.g:1556:2: rule__LineChartFX__Group__3__Impl rule__LineChartFX__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__LineChartFX__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group__4();

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
    // $ANTLR end "rule__LineChartFX__Group__3"


    // $ANTLR start "rule__LineChartFX__Group__3__Impl"
    // InternalJavaFXLang.g:1563:1: rule__LineChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__LineChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1567:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:1568:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:1568:1: ( 'name:' )
            // InternalJavaFXLang.g:1569:2: 'name:'
            {
             before(grammarAccess.getLineChartFXAccess().getNameKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLineChartFXAccess().getNameKeyword_3()); 

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
    // $ANTLR end "rule__LineChartFX__Group__3__Impl"


    // $ANTLR start "rule__LineChartFX__Group__4"
    // InternalJavaFXLang.g:1578:1: rule__LineChartFX__Group__4 : rule__LineChartFX__Group__4__Impl rule__LineChartFX__Group__5 ;
    public final void rule__LineChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1582:1: ( rule__LineChartFX__Group__4__Impl rule__LineChartFX__Group__5 )
            // InternalJavaFXLang.g:1583:2: rule__LineChartFX__Group__4__Impl rule__LineChartFX__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__LineChartFX__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group__5();

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
    // $ANTLR end "rule__LineChartFX__Group__4"


    // $ANTLR start "rule__LineChartFX__Group__4__Impl"
    // InternalJavaFXLang.g:1590:1: rule__LineChartFX__Group__4__Impl : ( ( rule__LineChartFX__NameAssignment_4 ) ) ;
    public final void rule__LineChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1594:1: ( ( ( rule__LineChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:1595:1: ( ( rule__LineChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:1595:1: ( ( rule__LineChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:1596:2: ( rule__LineChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getLineChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:1597:2: ( rule__LineChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:1597:3: rule__LineChartFX__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLineChartFXAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__LineChartFX__Group__4__Impl"


    // $ANTLR start "rule__LineChartFX__Group__5"
    // InternalJavaFXLang.g:1605:1: rule__LineChartFX__Group__5 : rule__LineChartFX__Group__5__Impl rule__LineChartFX__Group__6 ;
    public final void rule__LineChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1609:1: ( rule__LineChartFX__Group__5__Impl rule__LineChartFX__Group__6 )
            // InternalJavaFXLang.g:1610:2: rule__LineChartFX__Group__5__Impl rule__LineChartFX__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__LineChartFX__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group__6();

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
    // $ANTLR end "rule__LineChartFX__Group__5"


    // $ANTLR start "rule__LineChartFX__Group__5__Impl"
    // InternalJavaFXLang.g:1617:1: rule__LineChartFX__Group__5__Impl : ( ( rule__LineChartFX__Group_5__0 )? ) ;
    public final void rule__LineChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1621:1: ( ( ( rule__LineChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:1622:1: ( ( rule__LineChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:1622:1: ( ( rule__LineChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:1623:2: ( rule__LineChartFX__Group_5__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:1624:2: ( rule__LineChartFX__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalJavaFXLang.g:1624:3: rule__LineChartFX__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineChartFX__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineChartFXAccess().getGroup_5()); 

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
    // $ANTLR end "rule__LineChartFX__Group__5__Impl"


    // $ANTLR start "rule__LineChartFX__Group__6"
    // InternalJavaFXLang.g:1632:1: rule__LineChartFX__Group__6 : rule__LineChartFX__Group__6__Impl rule__LineChartFX__Group__7 ;
    public final void rule__LineChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1636:1: ( rule__LineChartFX__Group__6__Impl rule__LineChartFX__Group__7 )
            // InternalJavaFXLang.g:1637:2: rule__LineChartFX__Group__6__Impl rule__LineChartFX__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__LineChartFX__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group__7();

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
    // $ANTLR end "rule__LineChartFX__Group__6"


    // $ANTLR start "rule__LineChartFX__Group__6__Impl"
    // InternalJavaFXLang.g:1644:1: rule__LineChartFX__Group__6__Impl : ( ( rule__LineChartFX__Group_6__0 )? ) ;
    public final void rule__LineChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1648:1: ( ( ( rule__LineChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:1649:1: ( ( rule__LineChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:1649:1: ( ( rule__LineChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:1650:2: ( rule__LineChartFX__Group_6__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:1651:2: ( rule__LineChartFX__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJavaFXLang.g:1651:3: rule__LineChartFX__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineChartFX__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineChartFXAccess().getGroup_6()); 

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
    // $ANTLR end "rule__LineChartFX__Group__6__Impl"


    // $ANTLR start "rule__LineChartFX__Group__7"
    // InternalJavaFXLang.g:1659:1: rule__LineChartFX__Group__7 : rule__LineChartFX__Group__7__Impl rule__LineChartFX__Group__8 ;
    public final void rule__LineChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1663:1: ( rule__LineChartFX__Group__7__Impl rule__LineChartFX__Group__8 )
            // InternalJavaFXLang.g:1664:2: rule__LineChartFX__Group__7__Impl rule__LineChartFX__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__LineChartFX__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group__8();

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
    // $ANTLR end "rule__LineChartFX__Group__7"


    // $ANTLR start "rule__LineChartFX__Group__7__Impl"
    // InternalJavaFXLang.g:1671:1: rule__LineChartFX__Group__7__Impl : ( ( rule__LineChartFX__Group_7__0 )? ) ;
    public final void rule__LineChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1675:1: ( ( ( rule__LineChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:1676:1: ( ( rule__LineChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:1676:1: ( ( rule__LineChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:1677:2: ( rule__LineChartFX__Group_7__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:1678:2: ( rule__LineChartFX__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJavaFXLang.g:1678:3: rule__LineChartFX__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineChartFX__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineChartFXAccess().getGroup_7()); 

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
    // $ANTLR end "rule__LineChartFX__Group__7__Impl"


    // $ANTLR start "rule__LineChartFX__Group__8"
    // InternalJavaFXLang.g:1686:1: rule__LineChartFX__Group__8 : rule__LineChartFX__Group__8__Impl rule__LineChartFX__Group__9 ;
    public final void rule__LineChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1690:1: ( rule__LineChartFX__Group__8__Impl rule__LineChartFX__Group__9 )
            // InternalJavaFXLang.g:1691:2: rule__LineChartFX__Group__8__Impl rule__LineChartFX__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__LineChartFX__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group__9();

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
    // $ANTLR end "rule__LineChartFX__Group__8"


    // $ANTLR start "rule__LineChartFX__Group__8__Impl"
    // InternalJavaFXLang.g:1698:1: rule__LineChartFX__Group__8__Impl : ( ( rule__LineChartFX__Group_8__0 )? ) ;
    public final void rule__LineChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1702:1: ( ( ( rule__LineChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:1703:1: ( ( rule__LineChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:1703:1: ( ( rule__LineChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:1704:2: ( rule__LineChartFX__Group_8__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:1705:2: ( rule__LineChartFX__Group_8__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJavaFXLang.g:1705:3: rule__LineChartFX__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineChartFX__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineChartFXAccess().getGroup_8()); 

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
    // $ANTLR end "rule__LineChartFX__Group__8__Impl"


    // $ANTLR start "rule__LineChartFX__Group__9"
    // InternalJavaFXLang.g:1713:1: rule__LineChartFX__Group__9 : rule__LineChartFX__Group__9__Impl rule__LineChartFX__Group__10 ;
    public final void rule__LineChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1717:1: ( rule__LineChartFX__Group__9__Impl rule__LineChartFX__Group__10 )
            // InternalJavaFXLang.g:1718:2: rule__LineChartFX__Group__9__Impl rule__LineChartFX__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__LineChartFX__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group__10();

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
    // $ANTLR end "rule__LineChartFX__Group__9"


    // $ANTLR start "rule__LineChartFX__Group__9__Impl"
    // InternalJavaFXLang.g:1725:1: rule__LineChartFX__Group__9__Impl : ( ( rule__LineChartFX__Group_9__0 )? ) ;
    public final void rule__LineChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1729:1: ( ( ( rule__LineChartFX__Group_9__0 )? ) )
            // InternalJavaFXLang.g:1730:1: ( ( rule__LineChartFX__Group_9__0 )? )
            {
            // InternalJavaFXLang.g:1730:1: ( ( rule__LineChartFX__Group_9__0 )? )
            // InternalJavaFXLang.g:1731:2: ( rule__LineChartFX__Group_9__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_9()); 
            // InternalJavaFXLang.g:1732:2: ( rule__LineChartFX__Group_9__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJavaFXLang.g:1732:3: rule__LineChartFX__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineChartFX__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineChartFXAccess().getGroup_9()); 

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
    // $ANTLR end "rule__LineChartFX__Group__9__Impl"


    // $ANTLR start "rule__LineChartFX__Group__10"
    // InternalJavaFXLang.g:1740:1: rule__LineChartFX__Group__10 : rule__LineChartFX__Group__10__Impl rule__LineChartFX__Group__11 ;
    public final void rule__LineChartFX__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1744:1: ( rule__LineChartFX__Group__10__Impl rule__LineChartFX__Group__11 )
            // InternalJavaFXLang.g:1745:2: rule__LineChartFX__Group__10__Impl rule__LineChartFX__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__LineChartFX__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group__11();

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
    // $ANTLR end "rule__LineChartFX__Group__10"


    // $ANTLR start "rule__LineChartFX__Group__10__Impl"
    // InternalJavaFXLang.g:1752:1: rule__LineChartFX__Group__10__Impl : ( ( rule__LineChartFX__Group_10__0 )? ) ;
    public final void rule__LineChartFX__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1756:1: ( ( ( rule__LineChartFX__Group_10__0 )? ) )
            // InternalJavaFXLang.g:1757:1: ( ( rule__LineChartFX__Group_10__0 )? )
            {
            // InternalJavaFXLang.g:1757:1: ( ( rule__LineChartFX__Group_10__0 )? )
            // InternalJavaFXLang.g:1758:2: ( rule__LineChartFX__Group_10__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_10()); 
            // InternalJavaFXLang.g:1759:2: ( rule__LineChartFX__Group_10__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJavaFXLang.g:1759:3: rule__LineChartFX__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineChartFX__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineChartFXAccess().getGroup_10()); 

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
    // $ANTLR end "rule__LineChartFX__Group__10__Impl"


    // $ANTLR start "rule__LineChartFX__Group__11"
    // InternalJavaFXLang.g:1767:1: rule__LineChartFX__Group__11 : rule__LineChartFX__Group__11__Impl ;
    public final void rule__LineChartFX__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1771:1: ( rule__LineChartFX__Group__11__Impl )
            // InternalJavaFXLang.g:1772:2: rule__LineChartFX__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group__11__Impl();

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
    // $ANTLR end "rule__LineChartFX__Group__11"


    // $ANTLR start "rule__LineChartFX__Group__11__Impl"
    // InternalJavaFXLang.g:1778:1: rule__LineChartFX__Group__11__Impl : ( '}' ) ;
    public final void rule__LineChartFX__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1782:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1783:1: ( '}' )
            {
            // InternalJavaFXLang.g:1783:1: ( '}' )
            // InternalJavaFXLang.g:1784:2: '}'
            {
             before(grammarAccess.getLineChartFXAccess().getRightCurlyBracketKeyword_11()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLineChartFXAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__LineChartFX__Group__11__Impl"


    // $ANTLR start "rule__LineChartFX__Group_5__0"
    // InternalJavaFXLang.g:1794:1: rule__LineChartFX__Group_5__0 : rule__LineChartFX__Group_5__0__Impl rule__LineChartFX__Group_5__1 ;
    public final void rule__LineChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1798:1: ( rule__LineChartFX__Group_5__0__Impl rule__LineChartFX__Group_5__1 )
            // InternalJavaFXLang.g:1799:2: rule__LineChartFX__Group_5__0__Impl rule__LineChartFX__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__LineChartFX__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_5__1();

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
    // $ANTLR end "rule__LineChartFX__Group_5__0"


    // $ANTLR start "rule__LineChartFX__Group_5__0__Impl"
    // InternalJavaFXLang.g:1806:1: rule__LineChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__LineChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1810:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:1811:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:1811:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:1812:2: 'legendSide:'
            {
             before(grammarAccess.getLineChartFXAccess().getLegendSideKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLineChartFXAccess().getLegendSideKeyword_5_0()); 

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
    // $ANTLR end "rule__LineChartFX__Group_5__0__Impl"


    // $ANTLR start "rule__LineChartFX__Group_5__1"
    // InternalJavaFXLang.g:1821:1: rule__LineChartFX__Group_5__1 : rule__LineChartFX__Group_5__1__Impl ;
    public final void rule__LineChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1825:1: ( rule__LineChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:1826:2: rule__LineChartFX__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_5__1__Impl();

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
    // $ANTLR end "rule__LineChartFX__Group_5__1"


    // $ANTLR start "rule__LineChartFX__Group_5__1__Impl"
    // InternalJavaFXLang.g:1832:1: rule__LineChartFX__Group_5__1__Impl : ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__LineChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1836:1: ( ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:1837:1: ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:1837:1: ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:1838:2: ( rule__LineChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:1839:2: ( rule__LineChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:1839:3: rule__LineChartFX__LegendSideAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__LegendSideAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLineChartFXAccess().getLegendSideAssignment_5_1()); 

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
    // $ANTLR end "rule__LineChartFX__Group_5__1__Impl"


    // $ANTLR start "rule__LineChartFX__Group_6__0"
    // InternalJavaFXLang.g:1848:1: rule__LineChartFX__Group_6__0 : rule__LineChartFX__Group_6__0__Impl rule__LineChartFX__Group_6__1 ;
    public final void rule__LineChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1852:1: ( rule__LineChartFX__Group_6__0__Impl rule__LineChartFX__Group_6__1 )
            // InternalJavaFXLang.g:1853:2: rule__LineChartFX__Group_6__0__Impl rule__LineChartFX__Group_6__1
            {
            pushFollow(FOLLOW_22);
            rule__LineChartFX__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_6__1();

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
    // $ANTLR end "rule__LineChartFX__Group_6__0"


    // $ANTLR start "rule__LineChartFX__Group_6__0__Impl"
    // InternalJavaFXLang.g:1860:1: rule__LineChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__LineChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1864:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:1865:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:1865:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:1866:2: 'showLegend:'
            {
             before(grammarAccess.getLineChartFXAccess().getShowLegendKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLineChartFXAccess().getShowLegendKeyword_6_0()); 

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
    // $ANTLR end "rule__LineChartFX__Group_6__0__Impl"


    // $ANTLR start "rule__LineChartFX__Group_6__1"
    // InternalJavaFXLang.g:1875:1: rule__LineChartFX__Group_6__1 : rule__LineChartFX__Group_6__1__Impl ;
    public final void rule__LineChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1879:1: ( rule__LineChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:1880:2: rule__LineChartFX__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_6__1__Impl();

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
    // $ANTLR end "rule__LineChartFX__Group_6__1"


    // $ANTLR start "rule__LineChartFX__Group_6__1__Impl"
    // InternalJavaFXLang.g:1886:1: rule__LineChartFX__Group_6__1__Impl : ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__LineChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1890:1: ( ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:1891:1: ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:1891:1: ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:1892:2: ( rule__LineChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:1893:2: ( rule__LineChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:1893:3: rule__LineChartFX__ShowLegendAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__ShowLegendAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLineChartFXAccess().getShowLegendAssignment_6_1()); 

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
    // $ANTLR end "rule__LineChartFX__Group_6__1__Impl"


    // $ANTLR start "rule__LineChartFX__Group_7__0"
    // InternalJavaFXLang.g:1902:1: rule__LineChartFX__Group_7__0 : rule__LineChartFX__Group_7__0__Impl rule__LineChartFX__Group_7__1 ;
    public final void rule__LineChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1906:1: ( rule__LineChartFX__Group_7__0__Impl rule__LineChartFX__Group_7__1 )
            // InternalJavaFXLang.g:1907:2: rule__LineChartFX__Group_7__0__Impl rule__LineChartFX__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__LineChartFX__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_7__1();

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
    // $ANTLR end "rule__LineChartFX__Group_7__0"


    // $ANTLR start "rule__LineChartFX__Group_7__0__Impl"
    // InternalJavaFXLang.g:1914:1: rule__LineChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__LineChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1918:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:1919:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:1919:1: ( 'title:' )
            // InternalJavaFXLang.g:1920:2: 'title:'
            {
             before(grammarAccess.getLineChartFXAccess().getTitleKeyword_7_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLineChartFXAccess().getTitleKeyword_7_0()); 

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
    // $ANTLR end "rule__LineChartFX__Group_7__0__Impl"


    // $ANTLR start "rule__LineChartFX__Group_7__1"
    // InternalJavaFXLang.g:1929:1: rule__LineChartFX__Group_7__1 : rule__LineChartFX__Group_7__1__Impl ;
    public final void rule__LineChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1933:1: ( rule__LineChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:1934:2: rule__LineChartFX__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_7__1__Impl();

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
    // $ANTLR end "rule__LineChartFX__Group_7__1"


    // $ANTLR start "rule__LineChartFX__Group_7__1__Impl"
    // InternalJavaFXLang.g:1940:1: rule__LineChartFX__Group_7__1__Impl : ( ( rule__LineChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__LineChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1944:1: ( ( ( rule__LineChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:1945:1: ( ( rule__LineChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:1945:1: ( ( rule__LineChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:1946:2: ( rule__LineChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:1947:2: ( rule__LineChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:1947:3: rule__LineChartFX__TitleAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__TitleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getLineChartFXAccess().getTitleAssignment_7_1()); 

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
    // $ANTLR end "rule__LineChartFX__Group_7__1__Impl"


    // $ANTLR start "rule__LineChartFX__Group_8__0"
    // InternalJavaFXLang.g:1956:1: rule__LineChartFX__Group_8__0 : rule__LineChartFX__Group_8__0__Impl rule__LineChartFX__Group_8__1 ;
    public final void rule__LineChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1960:1: ( rule__LineChartFX__Group_8__0__Impl rule__LineChartFX__Group_8__1 )
            // InternalJavaFXLang.g:1961:2: rule__LineChartFX__Group_8__0__Impl rule__LineChartFX__Group_8__1
            {
            pushFollow(FOLLOW_21);
            rule__LineChartFX__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_8__1();

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
    // $ANTLR end "rule__LineChartFX__Group_8__0"


    // $ANTLR start "rule__LineChartFX__Group_8__0__Impl"
    // InternalJavaFXLang.g:1968:1: rule__LineChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__LineChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1972:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:1973:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:1973:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:1974:2: 'titleSide:'
            {
             before(grammarAccess.getLineChartFXAccess().getTitleSideKeyword_8_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLineChartFXAccess().getTitleSideKeyword_8_0()); 

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
    // $ANTLR end "rule__LineChartFX__Group_8__0__Impl"


    // $ANTLR start "rule__LineChartFX__Group_8__1"
    // InternalJavaFXLang.g:1983:1: rule__LineChartFX__Group_8__1 : rule__LineChartFX__Group_8__1__Impl ;
    public final void rule__LineChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1987:1: ( rule__LineChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:1988:2: rule__LineChartFX__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_8__1__Impl();

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
    // $ANTLR end "rule__LineChartFX__Group_8__1"


    // $ANTLR start "rule__LineChartFX__Group_8__1__Impl"
    // InternalJavaFXLang.g:1994:1: rule__LineChartFX__Group_8__1__Impl : ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__LineChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1998:1: ( ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:1999:1: ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:1999:1: ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:2000:2: ( rule__LineChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:2001:2: ( rule__LineChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:2001:3: rule__LineChartFX__TitleSideAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__TitleSideAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getLineChartFXAccess().getTitleSideAssignment_8_1()); 

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
    // $ANTLR end "rule__LineChartFX__Group_8__1__Impl"


    // $ANTLR start "rule__LineChartFX__Group_9__0"
    // InternalJavaFXLang.g:2010:1: rule__LineChartFX__Group_9__0 : rule__LineChartFX__Group_9__0__Impl rule__LineChartFX__Group_9__1 ;
    public final void rule__LineChartFX__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2014:1: ( rule__LineChartFX__Group_9__0__Impl rule__LineChartFX__Group_9__1 )
            // InternalJavaFXLang.g:2015:2: rule__LineChartFX__Group_9__0__Impl rule__LineChartFX__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__LineChartFX__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_9__1();

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
    // $ANTLR end "rule__LineChartFX__Group_9__0"


    // $ANTLR start "rule__LineChartFX__Group_9__0__Impl"
    // InternalJavaFXLang.g:2022:1: rule__LineChartFX__Group_9__0__Impl : ( 'xAxisLabel:' ) ;
    public final void rule__LineChartFX__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2026:1: ( ( 'xAxisLabel:' ) )
            // InternalJavaFXLang.g:2027:1: ( 'xAxisLabel:' )
            {
            // InternalJavaFXLang.g:2027:1: ( 'xAxisLabel:' )
            // InternalJavaFXLang.g:2028:2: 'xAxisLabel:'
            {
             before(grammarAccess.getLineChartFXAccess().getXAxisLabelKeyword_9_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLineChartFXAccess().getXAxisLabelKeyword_9_0()); 

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
    // $ANTLR end "rule__LineChartFX__Group_9__0__Impl"


    // $ANTLR start "rule__LineChartFX__Group_9__1"
    // InternalJavaFXLang.g:2037:1: rule__LineChartFX__Group_9__1 : rule__LineChartFX__Group_9__1__Impl ;
    public final void rule__LineChartFX__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2041:1: ( rule__LineChartFX__Group_9__1__Impl )
            // InternalJavaFXLang.g:2042:2: rule__LineChartFX__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_9__1__Impl();

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
    // $ANTLR end "rule__LineChartFX__Group_9__1"


    // $ANTLR start "rule__LineChartFX__Group_9__1__Impl"
    // InternalJavaFXLang.g:2048:1: rule__LineChartFX__Group_9__1__Impl : ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) ) ;
    public final void rule__LineChartFX__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2052:1: ( ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) ) )
            // InternalJavaFXLang.g:2053:1: ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) )
            {
            // InternalJavaFXLang.g:2053:1: ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) )
            // InternalJavaFXLang.g:2054:2: ( rule__LineChartFX__XAxisLabelAssignment_9_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getXAxisLabelAssignment_9_1()); 
            // InternalJavaFXLang.g:2055:2: ( rule__LineChartFX__XAxisLabelAssignment_9_1 )
            // InternalJavaFXLang.g:2055:3: rule__LineChartFX__XAxisLabelAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__XAxisLabelAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getLineChartFXAccess().getXAxisLabelAssignment_9_1()); 

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
    // $ANTLR end "rule__LineChartFX__Group_9__1__Impl"


    // $ANTLR start "rule__LineChartFX__Group_10__0"
    // InternalJavaFXLang.g:2064:1: rule__LineChartFX__Group_10__0 : rule__LineChartFX__Group_10__0__Impl rule__LineChartFX__Group_10__1 ;
    public final void rule__LineChartFX__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2068:1: ( rule__LineChartFX__Group_10__0__Impl rule__LineChartFX__Group_10__1 )
            // InternalJavaFXLang.g:2069:2: rule__LineChartFX__Group_10__0__Impl rule__LineChartFX__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__LineChartFX__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_10__1();

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
    // $ANTLR end "rule__LineChartFX__Group_10__0"


    // $ANTLR start "rule__LineChartFX__Group_10__0__Impl"
    // InternalJavaFXLang.g:2076:1: rule__LineChartFX__Group_10__0__Impl : ( 'yAxisLabel:' ) ;
    public final void rule__LineChartFX__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2080:1: ( ( 'yAxisLabel:' ) )
            // InternalJavaFXLang.g:2081:1: ( 'yAxisLabel:' )
            {
            // InternalJavaFXLang.g:2081:1: ( 'yAxisLabel:' )
            // InternalJavaFXLang.g:2082:2: 'yAxisLabel:'
            {
             before(grammarAccess.getLineChartFXAccess().getYAxisLabelKeyword_10_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLineChartFXAccess().getYAxisLabelKeyword_10_0()); 

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
    // $ANTLR end "rule__LineChartFX__Group_10__0__Impl"


    // $ANTLR start "rule__LineChartFX__Group_10__1"
    // InternalJavaFXLang.g:2091:1: rule__LineChartFX__Group_10__1 : rule__LineChartFX__Group_10__1__Impl ;
    public final void rule__LineChartFX__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2095:1: ( rule__LineChartFX__Group_10__1__Impl )
            // InternalJavaFXLang.g:2096:2: rule__LineChartFX__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_10__1__Impl();

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
    // $ANTLR end "rule__LineChartFX__Group_10__1"


    // $ANTLR start "rule__LineChartFX__Group_10__1__Impl"
    // InternalJavaFXLang.g:2102:1: rule__LineChartFX__Group_10__1__Impl : ( ( rule__LineChartFX__YAxisLabelAssignment_10_1 ) ) ;
    public final void rule__LineChartFX__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2106:1: ( ( ( rule__LineChartFX__YAxisLabelAssignment_10_1 ) ) )
            // InternalJavaFXLang.g:2107:1: ( ( rule__LineChartFX__YAxisLabelAssignment_10_1 ) )
            {
            // InternalJavaFXLang.g:2107:1: ( ( rule__LineChartFX__YAxisLabelAssignment_10_1 ) )
            // InternalJavaFXLang.g:2108:2: ( rule__LineChartFX__YAxisLabelAssignment_10_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getYAxisLabelAssignment_10_1()); 
            // InternalJavaFXLang.g:2109:2: ( rule__LineChartFX__YAxisLabelAssignment_10_1 )
            // InternalJavaFXLang.g:2109:3: rule__LineChartFX__YAxisLabelAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__YAxisLabelAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getLineChartFXAccess().getYAxisLabelAssignment_10_1()); 

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
    // $ANTLR end "rule__LineChartFX__Group_10__1__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalJavaFXLang.g:2118:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2122:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalJavaFXLang.g:2123:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Binding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__1();

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
    // $ANTLR end "rule__Binding__Group__0"


    // $ANTLR start "rule__Binding__Group__0__Impl"
    // InternalJavaFXLang.g:2130:1: rule__Binding__Group__0__Impl : ( () ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2134:1: ( ( () ) )
            // InternalJavaFXLang.g:2135:1: ( () )
            {
            // InternalJavaFXLang.g:2135:1: ( () )
            // InternalJavaFXLang.g:2136:2: ()
            {
             before(grammarAccess.getBindingAccess().getBindingAction_0()); 
            // InternalJavaFXLang.g:2137:2: ()
            // InternalJavaFXLang.g:2137:3: 
            {
            }

             after(grammarAccess.getBindingAccess().getBindingAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0__Impl"


    // $ANTLR start "rule__Binding__Group__1"
    // InternalJavaFXLang.g:2145:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2149:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalJavaFXLang.g:2150:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Binding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__2();

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
    // $ANTLR end "rule__Binding__Group__1"


    // $ANTLR start "rule__Binding__Group__1__Impl"
    // InternalJavaFXLang.g:2157:1: rule__Binding__Group__1__Impl : ( 'binding' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2161:1: ( ( 'binding' ) )
            // InternalJavaFXLang.g:2162:1: ( 'binding' )
            {
            // InternalJavaFXLang.g:2162:1: ( 'binding' )
            // InternalJavaFXLang.g:2163:2: 'binding'
            {
             before(grammarAccess.getBindingAccess().getBindingKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getBindingKeyword_1()); 

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
    // $ANTLR end "rule__Binding__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__2"
    // InternalJavaFXLang.g:2172:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2176:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalJavaFXLang.g:2177:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Binding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__3();

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
    // $ANTLR end "rule__Binding__Group__2"


    // $ANTLR start "rule__Binding__Group__2__Impl"
    // InternalJavaFXLang.g:2184:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__NameAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2188:1: ( ( ( rule__Binding__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:2189:1: ( ( rule__Binding__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:2189:1: ( ( rule__Binding__NameAssignment_2 ) )
            // InternalJavaFXLang.g:2190:2: ( rule__Binding__NameAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:2191:2: ( rule__Binding__NameAssignment_2 )
            // InternalJavaFXLang.g:2191:3: rule__Binding__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Binding__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Binding__Group__2__Impl"


    // $ANTLR start "rule__Binding__Group__3"
    // InternalJavaFXLang.g:2199:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2203:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalJavaFXLang.g:2204:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Binding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__4();

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
    // $ANTLR end "rule__Binding__Group__3"


    // $ANTLR start "rule__Binding__Group__3__Impl"
    // InternalJavaFXLang.g:2211:1: rule__Binding__Group__3__Impl : ( '{' ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2215:1: ( ( '{' ) )
            // InternalJavaFXLang.g:2216:1: ( '{' )
            {
            // InternalJavaFXLang.g:2216:1: ( '{' )
            // InternalJavaFXLang.g:2217:2: '{'
            {
             before(grammarAccess.getBindingAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Binding__Group__3__Impl"


    // $ANTLR start "rule__Binding__Group__4"
    // InternalJavaFXLang.g:2226:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl rule__Binding__Group__5 ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2230:1: ( rule__Binding__Group__4__Impl rule__Binding__Group__5 )
            // InternalJavaFXLang.g:2231:2: rule__Binding__Group__4__Impl rule__Binding__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Binding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__5();

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
    // $ANTLR end "rule__Binding__Group__4"


    // $ANTLR start "rule__Binding__Group__4__Impl"
    // InternalJavaFXLang.g:2238:1: rule__Binding__Group__4__Impl : ( ( rule__Binding__Group_4__0 )? ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2242:1: ( ( ( rule__Binding__Group_4__0 )? ) )
            // InternalJavaFXLang.g:2243:1: ( ( rule__Binding__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:2243:1: ( ( rule__Binding__Group_4__0 )? )
            // InternalJavaFXLang.g:2244:2: ( rule__Binding__Group_4__0 )?
            {
             before(grammarAccess.getBindingAccess().getGroup_4()); 
            // InternalJavaFXLang.g:2245:2: ( rule__Binding__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=17 && LA21_0<=23)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJavaFXLang.g:2245:3: rule__Binding__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Binding__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBindingAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Binding__Group__4__Impl"


    // $ANTLR start "rule__Binding__Group__5"
    // InternalJavaFXLang.g:2253:1: rule__Binding__Group__5 : rule__Binding__Group__5__Impl ;
    public final void rule__Binding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2257:1: ( rule__Binding__Group__5__Impl )
            // InternalJavaFXLang.g:2258:2: rule__Binding__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__5__Impl();

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
    // $ANTLR end "rule__Binding__Group__5"


    // $ANTLR start "rule__Binding__Group__5__Impl"
    // InternalJavaFXLang.g:2264:1: rule__Binding__Group__5__Impl : ( '}' ) ;
    public final void rule__Binding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2268:1: ( ( '}' ) )
            // InternalJavaFXLang.g:2269:1: ( '}' )
            {
            // InternalJavaFXLang.g:2269:1: ( '}' )
            // InternalJavaFXLang.g:2270:2: '}'
            {
             before(grammarAccess.getBindingAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Binding__Group__5__Impl"


    // $ANTLR start "rule__Binding__Group_4__0"
    // InternalJavaFXLang.g:2280:1: rule__Binding__Group_4__0 : rule__Binding__Group_4__0__Impl rule__Binding__Group_4__1 ;
    public final void rule__Binding__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2284:1: ( rule__Binding__Group_4__0__Impl rule__Binding__Group_4__1 )
            // InternalJavaFXLang.g:2285:2: rule__Binding__Group_4__0__Impl rule__Binding__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__Binding__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group_4__1();

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
    // $ANTLR end "rule__Binding__Group_4__0"


    // $ANTLR start "rule__Binding__Group_4__0__Impl"
    // InternalJavaFXLang.g:2292:1: rule__Binding__Group_4__0__Impl : ( ( rule__Binding__PropertyAssignment_4_0 ) ) ;
    public final void rule__Binding__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2296:1: ( ( ( rule__Binding__PropertyAssignment_4_0 ) ) )
            // InternalJavaFXLang.g:2297:1: ( ( rule__Binding__PropertyAssignment_4_0 ) )
            {
            // InternalJavaFXLang.g:2297:1: ( ( rule__Binding__PropertyAssignment_4_0 ) )
            // InternalJavaFXLang.g:2298:2: ( rule__Binding__PropertyAssignment_4_0 )
            {
             before(grammarAccess.getBindingAccess().getPropertyAssignment_4_0()); 
            // InternalJavaFXLang.g:2299:2: ( rule__Binding__PropertyAssignment_4_0 )
            // InternalJavaFXLang.g:2299:3: rule__Binding__PropertyAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__PropertyAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getPropertyAssignment_4_0()); 

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
    // $ANTLR end "rule__Binding__Group_4__0__Impl"


    // $ANTLR start "rule__Binding__Group_4__1"
    // InternalJavaFXLang.g:2307:1: rule__Binding__Group_4__1 : rule__Binding__Group_4__1__Impl ;
    public final void rule__Binding__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2311:1: ( rule__Binding__Group_4__1__Impl )
            // InternalJavaFXLang.g:2312:2: rule__Binding__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group_4__1__Impl();

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
    // $ANTLR end "rule__Binding__Group_4__1"


    // $ANTLR start "rule__Binding__Group_4__1__Impl"
    // InternalJavaFXLang.g:2318:1: rule__Binding__Group_4__1__Impl : ( ( rule__Binding__PropertyAssignment_4_1 )* ) ;
    public final void rule__Binding__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2322:1: ( ( ( rule__Binding__PropertyAssignment_4_1 )* ) )
            // InternalJavaFXLang.g:2323:1: ( ( rule__Binding__PropertyAssignment_4_1 )* )
            {
            // InternalJavaFXLang.g:2323:1: ( ( rule__Binding__PropertyAssignment_4_1 )* )
            // InternalJavaFXLang.g:2324:2: ( rule__Binding__PropertyAssignment_4_1 )*
            {
             before(grammarAccess.getBindingAccess().getPropertyAssignment_4_1()); 
            // InternalJavaFXLang.g:2325:2: ( rule__Binding__PropertyAssignment_4_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=17 && LA22_0<=23)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalJavaFXLang.g:2325:3: rule__Binding__PropertyAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Binding__PropertyAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getBindingAccess().getPropertyAssignment_4_1()); 

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
    // $ANTLR end "rule__Binding__Group_4__1__Impl"


    // $ANTLR start "rule__BindingProperty__Group__0"
    // InternalJavaFXLang.g:2334:1: rule__BindingProperty__Group__0 : rule__BindingProperty__Group__0__Impl rule__BindingProperty__Group__1 ;
    public final void rule__BindingProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2338:1: ( rule__BindingProperty__Group__0__Impl rule__BindingProperty__Group__1 )
            // InternalJavaFXLang.g:2339:2: rule__BindingProperty__Group__0__Impl rule__BindingProperty__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__BindingProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BindingProperty__Group__1();

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
    // $ANTLR end "rule__BindingProperty__Group__0"


    // $ANTLR start "rule__BindingProperty__Group__0__Impl"
    // InternalJavaFXLang.g:2346:1: rule__BindingProperty__Group__0__Impl : ( () ) ;
    public final void rule__BindingProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2350:1: ( ( () ) )
            // InternalJavaFXLang.g:2351:1: ( () )
            {
            // InternalJavaFXLang.g:2351:1: ( () )
            // InternalJavaFXLang.g:2352:2: ()
            {
             before(grammarAccess.getBindingPropertyAccess().getBindingPropertyAction_0()); 
            // InternalJavaFXLang.g:2353:2: ()
            // InternalJavaFXLang.g:2353:3: 
            {
            }

             after(grammarAccess.getBindingPropertyAccess().getBindingPropertyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingProperty__Group__0__Impl"


    // $ANTLR start "rule__BindingProperty__Group__1"
    // InternalJavaFXLang.g:2361:1: rule__BindingProperty__Group__1 : rule__BindingProperty__Group__1__Impl rule__BindingProperty__Group__2 ;
    public final void rule__BindingProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2365:1: ( rule__BindingProperty__Group__1__Impl rule__BindingProperty__Group__2 )
            // InternalJavaFXLang.g:2366:2: rule__BindingProperty__Group__1__Impl rule__BindingProperty__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BindingProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BindingProperty__Group__2();

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
    // $ANTLR end "rule__BindingProperty__Group__1"


    // $ANTLR start "rule__BindingProperty__Group__1__Impl"
    // InternalJavaFXLang.g:2373:1: rule__BindingProperty__Group__1__Impl : ( ( rule__BindingProperty__TypeAssignment_1 ) ) ;
    public final void rule__BindingProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2377:1: ( ( ( rule__BindingProperty__TypeAssignment_1 ) ) )
            // InternalJavaFXLang.g:2378:1: ( ( rule__BindingProperty__TypeAssignment_1 ) )
            {
            // InternalJavaFXLang.g:2378:1: ( ( rule__BindingProperty__TypeAssignment_1 ) )
            // InternalJavaFXLang.g:2379:2: ( rule__BindingProperty__TypeAssignment_1 )
            {
             before(grammarAccess.getBindingPropertyAccess().getTypeAssignment_1()); 
            // InternalJavaFXLang.g:2380:2: ( rule__BindingProperty__TypeAssignment_1 )
            // InternalJavaFXLang.g:2380:3: rule__BindingProperty__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BindingProperty__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBindingPropertyAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__BindingProperty__Group__1__Impl"


    // $ANTLR start "rule__BindingProperty__Group__2"
    // InternalJavaFXLang.g:2388:1: rule__BindingProperty__Group__2 : rule__BindingProperty__Group__2__Impl ;
    public final void rule__BindingProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2392:1: ( rule__BindingProperty__Group__2__Impl )
            // InternalJavaFXLang.g:2393:2: rule__BindingProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BindingProperty__Group__2__Impl();

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
    // $ANTLR end "rule__BindingProperty__Group__2"


    // $ANTLR start "rule__BindingProperty__Group__2__Impl"
    // InternalJavaFXLang.g:2399:1: rule__BindingProperty__Group__2__Impl : ( ( rule__BindingProperty__NameAssignment_2 ) ) ;
    public final void rule__BindingProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2403:1: ( ( ( rule__BindingProperty__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:2404:1: ( ( rule__BindingProperty__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:2404:1: ( ( rule__BindingProperty__NameAssignment_2 ) )
            // InternalJavaFXLang.g:2405:2: ( rule__BindingProperty__NameAssignment_2 )
            {
             before(grammarAccess.getBindingPropertyAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:2406:2: ( rule__BindingProperty__NameAssignment_2 )
            // InternalJavaFXLang.g:2406:3: rule__BindingProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BindingProperty__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBindingPropertyAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__BindingProperty__Group__2__Impl"


    // $ANTLR start "rule__DerivedBean__Group__0"
    // InternalJavaFXLang.g:2415:1: rule__DerivedBean__Group__0 : rule__DerivedBean__Group__0__Impl rule__DerivedBean__Group__1 ;
    public final void rule__DerivedBean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2419:1: ( rule__DerivedBean__Group__0__Impl rule__DerivedBean__Group__1 )
            // InternalJavaFXLang.g:2420:2: rule__DerivedBean__Group__0__Impl rule__DerivedBean__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DerivedBean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DerivedBean__Group__1();

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
    // $ANTLR end "rule__DerivedBean__Group__0"


    // $ANTLR start "rule__DerivedBean__Group__0__Impl"
    // InternalJavaFXLang.g:2427:1: rule__DerivedBean__Group__0__Impl : ( () ) ;
    public final void rule__DerivedBean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2431:1: ( ( () ) )
            // InternalJavaFXLang.g:2432:1: ( () )
            {
            // InternalJavaFXLang.g:2432:1: ( () )
            // InternalJavaFXLang.g:2433:2: ()
            {
             before(grammarAccess.getDerivedBeanAccess().getDerivedBeanAction_0()); 
            // InternalJavaFXLang.g:2434:2: ()
            // InternalJavaFXLang.g:2434:3: 
            {
            }

             after(grammarAccess.getDerivedBeanAccess().getDerivedBeanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedBean__Group__0__Impl"


    // $ANTLR start "rule__DerivedBean__Group__1"
    // InternalJavaFXLang.g:2442:1: rule__DerivedBean__Group__1 : rule__DerivedBean__Group__1__Impl rule__DerivedBean__Group__2 ;
    public final void rule__DerivedBean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2446:1: ( rule__DerivedBean__Group__1__Impl rule__DerivedBean__Group__2 )
            // InternalJavaFXLang.g:2447:2: rule__DerivedBean__Group__1__Impl rule__DerivedBean__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DerivedBean__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DerivedBean__Group__2();

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
    // $ANTLR end "rule__DerivedBean__Group__1"


    // $ANTLR start "rule__DerivedBean__Group__1__Impl"
    // InternalJavaFXLang.g:2454:1: rule__DerivedBean__Group__1__Impl : ( 'class' ) ;
    public final void rule__DerivedBean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2458:1: ( ( 'class' ) )
            // InternalJavaFXLang.g:2459:1: ( 'class' )
            {
            // InternalJavaFXLang.g:2459:1: ( 'class' )
            // InternalJavaFXLang.g:2460:2: 'class'
            {
             before(grammarAccess.getDerivedBeanAccess().getClassKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDerivedBeanAccess().getClassKeyword_1()); 

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
    // $ANTLR end "rule__DerivedBean__Group__1__Impl"


    // $ANTLR start "rule__DerivedBean__Group__2"
    // InternalJavaFXLang.g:2469:1: rule__DerivedBean__Group__2 : rule__DerivedBean__Group__2__Impl rule__DerivedBean__Group__3 ;
    public final void rule__DerivedBean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2473:1: ( rule__DerivedBean__Group__2__Impl rule__DerivedBean__Group__3 )
            // InternalJavaFXLang.g:2474:2: rule__DerivedBean__Group__2__Impl rule__DerivedBean__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DerivedBean__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DerivedBean__Group__3();

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
    // $ANTLR end "rule__DerivedBean__Group__2"


    // $ANTLR start "rule__DerivedBean__Group__2__Impl"
    // InternalJavaFXLang.g:2481:1: rule__DerivedBean__Group__2__Impl : ( ( rule__DerivedBean__NameAssignment_2 ) ) ;
    public final void rule__DerivedBean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2485:1: ( ( ( rule__DerivedBean__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:2486:1: ( ( rule__DerivedBean__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:2486:1: ( ( rule__DerivedBean__NameAssignment_2 ) )
            // InternalJavaFXLang.g:2487:2: ( rule__DerivedBean__NameAssignment_2 )
            {
             before(grammarAccess.getDerivedBeanAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:2488:2: ( rule__DerivedBean__NameAssignment_2 )
            // InternalJavaFXLang.g:2488:3: rule__DerivedBean__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DerivedBean__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDerivedBeanAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__DerivedBean__Group__2__Impl"


    // $ANTLR start "rule__DerivedBean__Group__3"
    // InternalJavaFXLang.g:2496:1: rule__DerivedBean__Group__3 : rule__DerivedBean__Group__3__Impl rule__DerivedBean__Group__4 ;
    public final void rule__DerivedBean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2500:1: ( rule__DerivedBean__Group__3__Impl rule__DerivedBean__Group__4 )
            // InternalJavaFXLang.g:2501:2: rule__DerivedBean__Group__3__Impl rule__DerivedBean__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__DerivedBean__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DerivedBean__Group__4();

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
    // $ANTLR end "rule__DerivedBean__Group__3"


    // $ANTLR start "rule__DerivedBean__Group__3__Impl"
    // InternalJavaFXLang.g:2508:1: rule__DerivedBean__Group__3__Impl : ( '{' ) ;
    public final void rule__DerivedBean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2512:1: ( ( '{' ) )
            // InternalJavaFXLang.g:2513:1: ( '{' )
            {
            // InternalJavaFXLang.g:2513:1: ( '{' )
            // InternalJavaFXLang.g:2514:2: '{'
            {
             before(grammarAccess.getDerivedBeanAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDerivedBeanAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__DerivedBean__Group__3__Impl"


    // $ANTLR start "rule__DerivedBean__Group__4"
    // InternalJavaFXLang.g:2523:1: rule__DerivedBean__Group__4 : rule__DerivedBean__Group__4__Impl rule__DerivedBean__Group__5 ;
    public final void rule__DerivedBean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2527:1: ( rule__DerivedBean__Group__4__Impl rule__DerivedBean__Group__5 )
            // InternalJavaFXLang.g:2528:2: rule__DerivedBean__Group__4__Impl rule__DerivedBean__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__DerivedBean__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DerivedBean__Group__5();

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
    // $ANTLR end "rule__DerivedBean__Group__4"


    // $ANTLR start "rule__DerivedBean__Group__4__Impl"
    // InternalJavaFXLang.g:2535:1: rule__DerivedBean__Group__4__Impl : ( ( rule__DerivedBean__Group_4__0 ) ) ;
    public final void rule__DerivedBean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2539:1: ( ( ( rule__DerivedBean__Group_4__0 ) ) )
            // InternalJavaFXLang.g:2540:1: ( ( rule__DerivedBean__Group_4__0 ) )
            {
            // InternalJavaFXLang.g:2540:1: ( ( rule__DerivedBean__Group_4__0 ) )
            // InternalJavaFXLang.g:2541:2: ( rule__DerivedBean__Group_4__0 )
            {
             before(grammarAccess.getDerivedBeanAccess().getGroup_4()); 
            // InternalJavaFXLang.g:2542:2: ( rule__DerivedBean__Group_4__0 )
            // InternalJavaFXLang.g:2542:3: rule__DerivedBean__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__DerivedBean__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getDerivedBeanAccess().getGroup_4()); 

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
    // $ANTLR end "rule__DerivedBean__Group__4__Impl"


    // $ANTLR start "rule__DerivedBean__Group__5"
    // InternalJavaFXLang.g:2550:1: rule__DerivedBean__Group__5 : rule__DerivedBean__Group__5__Impl rule__DerivedBean__Group__6 ;
    public final void rule__DerivedBean__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2554:1: ( rule__DerivedBean__Group__5__Impl rule__DerivedBean__Group__6 )
            // InternalJavaFXLang.g:2555:2: rule__DerivedBean__Group__5__Impl rule__DerivedBean__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__DerivedBean__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DerivedBean__Group__6();

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
    // $ANTLR end "rule__DerivedBean__Group__5"


    // $ANTLR start "rule__DerivedBean__Group__5__Impl"
    // InternalJavaFXLang.g:2562:1: rule__DerivedBean__Group__5__Impl : ( ( rule__DerivedBean__Group_5__0 )? ) ;
    public final void rule__DerivedBean__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2566:1: ( ( ( rule__DerivedBean__Group_5__0 )? ) )
            // InternalJavaFXLang.g:2567:1: ( ( rule__DerivedBean__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:2567:1: ( ( rule__DerivedBean__Group_5__0 )? )
            // InternalJavaFXLang.g:2568:2: ( rule__DerivedBean__Group_5__0 )?
            {
             before(grammarAccess.getDerivedBeanAccess().getGroup_5()); 
            // InternalJavaFXLang.g:2569:2: ( rule__DerivedBean__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalJavaFXLang.g:2569:3: rule__DerivedBean__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DerivedBean__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDerivedBeanAccess().getGroup_5()); 

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
    // $ANTLR end "rule__DerivedBean__Group__5__Impl"


    // $ANTLR start "rule__DerivedBean__Group__6"
    // InternalJavaFXLang.g:2577:1: rule__DerivedBean__Group__6 : rule__DerivedBean__Group__6__Impl ;
    public final void rule__DerivedBean__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2581:1: ( rule__DerivedBean__Group__6__Impl )
            // InternalJavaFXLang.g:2582:2: rule__DerivedBean__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DerivedBean__Group__6__Impl();

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
    // $ANTLR end "rule__DerivedBean__Group__6"


    // $ANTLR start "rule__DerivedBean__Group__6__Impl"
    // InternalJavaFXLang.g:2588:1: rule__DerivedBean__Group__6__Impl : ( '}' ) ;
    public final void rule__DerivedBean__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2592:1: ( ( '}' ) )
            // InternalJavaFXLang.g:2593:1: ( '}' )
            {
            // InternalJavaFXLang.g:2593:1: ( '}' )
            // InternalJavaFXLang.g:2594:2: '}'
            {
             before(grammarAccess.getDerivedBeanAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDerivedBeanAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__DerivedBean__Group__6__Impl"


    // $ANTLR start "rule__DerivedBean__Group_4__0"
    // InternalJavaFXLang.g:2604:1: rule__DerivedBean__Group_4__0 : rule__DerivedBean__Group_4__0__Impl rule__DerivedBean__Group_4__1 ;
    public final void rule__DerivedBean__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2608:1: ( rule__DerivedBean__Group_4__0__Impl rule__DerivedBean__Group_4__1 )
            // InternalJavaFXLang.g:2609:2: rule__DerivedBean__Group_4__0__Impl rule__DerivedBean__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__DerivedBean__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DerivedBean__Group_4__1();

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
    // $ANTLR end "rule__DerivedBean__Group_4__0"


    // $ANTLR start "rule__DerivedBean__Group_4__0__Impl"
    // InternalJavaFXLang.g:2616:1: rule__DerivedBean__Group_4__0__Impl : ( 'instanceType:' ) ;
    public final void rule__DerivedBean__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2620:1: ( ( 'instanceType:' ) )
            // InternalJavaFXLang.g:2621:1: ( 'instanceType:' )
            {
            // InternalJavaFXLang.g:2621:1: ( 'instanceType:' )
            // InternalJavaFXLang.g:2622:2: 'instanceType:'
            {
             before(grammarAccess.getDerivedBeanAccess().getInstanceTypeKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDerivedBeanAccess().getInstanceTypeKeyword_4_0()); 

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
    // $ANTLR end "rule__DerivedBean__Group_4__0__Impl"


    // $ANTLR start "rule__DerivedBean__Group_4__1"
    // InternalJavaFXLang.g:2631:1: rule__DerivedBean__Group_4__1 : rule__DerivedBean__Group_4__1__Impl ;
    public final void rule__DerivedBean__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2635:1: ( rule__DerivedBean__Group_4__1__Impl )
            // InternalJavaFXLang.g:2636:2: rule__DerivedBean__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DerivedBean__Group_4__1__Impl();

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
    // $ANTLR end "rule__DerivedBean__Group_4__1"


    // $ANTLR start "rule__DerivedBean__Group_4__1__Impl"
    // InternalJavaFXLang.g:2642:1: rule__DerivedBean__Group_4__1__Impl : ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) ) ;
    public final void rule__DerivedBean__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2646:1: ( ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:2647:1: ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:2647:1: ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) )
            // InternalJavaFXLang.g:2648:2: ( rule__DerivedBean__InstanceTypeAssignment_4_1 )
            {
             before(grammarAccess.getDerivedBeanAccess().getInstanceTypeAssignment_4_1()); 
            // InternalJavaFXLang.g:2649:2: ( rule__DerivedBean__InstanceTypeAssignment_4_1 )
            // InternalJavaFXLang.g:2649:3: rule__DerivedBean__InstanceTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DerivedBean__InstanceTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDerivedBeanAccess().getInstanceTypeAssignment_4_1()); 

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
    // $ANTLR end "rule__DerivedBean__Group_4__1__Impl"


    // $ANTLR start "rule__DerivedBean__Group_5__0"
    // InternalJavaFXLang.g:2658:1: rule__DerivedBean__Group_5__0 : rule__DerivedBean__Group_5__0__Impl rule__DerivedBean__Group_5__1 ;
    public final void rule__DerivedBean__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2662:1: ( rule__DerivedBean__Group_5__0__Impl rule__DerivedBean__Group_5__1 )
            // InternalJavaFXLang.g:2663:2: rule__DerivedBean__Group_5__0__Impl rule__DerivedBean__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__DerivedBean__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DerivedBean__Group_5__1();

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
    // $ANTLR end "rule__DerivedBean__Group_5__0"


    // $ANTLR start "rule__DerivedBean__Group_5__0__Impl"
    // InternalJavaFXLang.g:2670:1: rule__DerivedBean__Group_5__0__Impl : ( ( rule__DerivedBean__AttributesAssignment_5_0 ) ) ;
    public final void rule__DerivedBean__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2674:1: ( ( ( rule__DerivedBean__AttributesAssignment_5_0 ) ) )
            // InternalJavaFXLang.g:2675:1: ( ( rule__DerivedBean__AttributesAssignment_5_0 ) )
            {
            // InternalJavaFXLang.g:2675:1: ( ( rule__DerivedBean__AttributesAssignment_5_0 ) )
            // InternalJavaFXLang.g:2676:2: ( rule__DerivedBean__AttributesAssignment_5_0 )
            {
             before(grammarAccess.getDerivedBeanAccess().getAttributesAssignment_5_0()); 
            // InternalJavaFXLang.g:2677:2: ( rule__DerivedBean__AttributesAssignment_5_0 )
            // InternalJavaFXLang.g:2677:3: rule__DerivedBean__AttributesAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__DerivedBean__AttributesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getDerivedBeanAccess().getAttributesAssignment_5_0()); 

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
    // $ANTLR end "rule__DerivedBean__Group_5__0__Impl"


    // $ANTLR start "rule__DerivedBean__Group_5__1"
    // InternalJavaFXLang.g:2685:1: rule__DerivedBean__Group_5__1 : rule__DerivedBean__Group_5__1__Impl ;
    public final void rule__DerivedBean__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2689:1: ( rule__DerivedBean__Group_5__1__Impl )
            // InternalJavaFXLang.g:2690:2: rule__DerivedBean__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DerivedBean__Group_5__1__Impl();

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
    // $ANTLR end "rule__DerivedBean__Group_5__1"


    // $ANTLR start "rule__DerivedBean__Group_5__1__Impl"
    // InternalJavaFXLang.g:2696:1: rule__DerivedBean__Group_5__1__Impl : ( ( rule__DerivedBean__AttributesAssignment_5_1 )* ) ;
    public final void rule__DerivedBean__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2700:1: ( ( ( rule__DerivedBean__AttributesAssignment_5_1 )* ) )
            // InternalJavaFXLang.g:2701:1: ( ( rule__DerivedBean__AttributesAssignment_5_1 )* )
            {
            // InternalJavaFXLang.g:2701:1: ( ( rule__DerivedBean__AttributesAssignment_5_1 )* )
            // InternalJavaFXLang.g:2702:2: ( rule__DerivedBean__AttributesAssignment_5_1 )*
            {
             before(grammarAccess.getDerivedBeanAccess().getAttributesAssignment_5_1()); 
            // InternalJavaFXLang.g:2703:2: ( rule__DerivedBean__AttributesAssignment_5_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalJavaFXLang.g:2703:3: rule__DerivedBean__AttributesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__DerivedBean__AttributesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getDerivedBeanAccess().getAttributesAssignment_5_1()); 

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
    // $ANTLR end "rule__DerivedBean__Group_5__1__Impl"


    // $ANTLR start "rule__Bean__Group__0"
    // InternalJavaFXLang.g:2712:1: rule__Bean__Group__0 : rule__Bean__Group__0__Impl rule__Bean__Group__1 ;
    public final void rule__Bean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2716:1: ( rule__Bean__Group__0__Impl rule__Bean__Group__1 )
            // InternalJavaFXLang.g:2717:2: rule__Bean__Group__0__Impl rule__Bean__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Bean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bean__Group__1();

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
    // $ANTLR end "rule__Bean__Group__0"


    // $ANTLR start "rule__Bean__Group__0__Impl"
    // InternalJavaFXLang.g:2724:1: rule__Bean__Group__0__Impl : ( () ) ;
    public final void rule__Bean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2728:1: ( ( () ) )
            // InternalJavaFXLang.g:2729:1: ( () )
            {
            // InternalJavaFXLang.g:2729:1: ( () )
            // InternalJavaFXLang.g:2730:2: ()
            {
             before(grammarAccess.getBeanAccess().getBeanAction_0()); 
            // InternalJavaFXLang.g:2731:2: ()
            // InternalJavaFXLang.g:2731:3: 
            {
            }

             after(grammarAccess.getBeanAccess().getBeanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bean__Group__0__Impl"


    // $ANTLR start "rule__Bean__Group__1"
    // InternalJavaFXLang.g:2739:1: rule__Bean__Group__1 : rule__Bean__Group__1__Impl rule__Bean__Group__2 ;
    public final void rule__Bean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2743:1: ( rule__Bean__Group__1__Impl rule__Bean__Group__2 )
            // InternalJavaFXLang.g:2744:2: rule__Bean__Group__1__Impl rule__Bean__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Bean__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bean__Group__2();

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
    // $ANTLR end "rule__Bean__Group__1"


    // $ANTLR start "rule__Bean__Group__1__Impl"
    // InternalJavaFXLang.g:2751:1: rule__Bean__Group__1__Impl : ( 'class' ) ;
    public final void rule__Bean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2755:1: ( ( 'class' ) )
            // InternalJavaFXLang.g:2756:1: ( 'class' )
            {
            // InternalJavaFXLang.g:2756:1: ( 'class' )
            // InternalJavaFXLang.g:2757:2: 'class'
            {
             before(grammarAccess.getBeanAccess().getClassKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBeanAccess().getClassKeyword_1()); 

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
    // $ANTLR end "rule__Bean__Group__1__Impl"


    // $ANTLR start "rule__Bean__Group__2"
    // InternalJavaFXLang.g:2766:1: rule__Bean__Group__2 : rule__Bean__Group__2__Impl rule__Bean__Group__3 ;
    public final void rule__Bean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2770:1: ( rule__Bean__Group__2__Impl rule__Bean__Group__3 )
            // InternalJavaFXLang.g:2771:2: rule__Bean__Group__2__Impl rule__Bean__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Bean__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bean__Group__3();

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
    // $ANTLR end "rule__Bean__Group__2"


    // $ANTLR start "rule__Bean__Group__2__Impl"
    // InternalJavaFXLang.g:2778:1: rule__Bean__Group__2__Impl : ( ( rule__Bean__NameAssignment_2 ) ) ;
    public final void rule__Bean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2782:1: ( ( ( rule__Bean__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:2783:1: ( ( rule__Bean__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:2783:1: ( ( rule__Bean__NameAssignment_2 ) )
            // InternalJavaFXLang.g:2784:2: ( rule__Bean__NameAssignment_2 )
            {
             before(grammarAccess.getBeanAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:2785:2: ( rule__Bean__NameAssignment_2 )
            // InternalJavaFXLang.g:2785:3: rule__Bean__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Bean__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBeanAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Bean__Group__2__Impl"


    // $ANTLR start "rule__Bean__Group__3"
    // InternalJavaFXLang.g:2793:1: rule__Bean__Group__3 : rule__Bean__Group__3__Impl rule__Bean__Group__4 ;
    public final void rule__Bean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2797:1: ( rule__Bean__Group__3__Impl rule__Bean__Group__4 )
            // InternalJavaFXLang.g:2798:2: rule__Bean__Group__3__Impl rule__Bean__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Bean__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bean__Group__4();

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
    // $ANTLR end "rule__Bean__Group__3"


    // $ANTLR start "rule__Bean__Group__3__Impl"
    // InternalJavaFXLang.g:2805:1: rule__Bean__Group__3__Impl : ( '{' ) ;
    public final void rule__Bean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2809:1: ( ( '{' ) )
            // InternalJavaFXLang.g:2810:1: ( '{' )
            {
            // InternalJavaFXLang.g:2810:1: ( '{' )
            // InternalJavaFXLang.g:2811:2: '{'
            {
             before(grammarAccess.getBeanAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBeanAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Bean__Group__3__Impl"


    // $ANTLR start "rule__Bean__Group__4"
    // InternalJavaFXLang.g:2820:1: rule__Bean__Group__4 : rule__Bean__Group__4__Impl rule__Bean__Group__5 ;
    public final void rule__Bean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2824:1: ( rule__Bean__Group__4__Impl rule__Bean__Group__5 )
            // InternalJavaFXLang.g:2825:2: rule__Bean__Group__4__Impl rule__Bean__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Bean__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bean__Group__5();

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
    // $ANTLR end "rule__Bean__Group__4"


    // $ANTLR start "rule__Bean__Group__4__Impl"
    // InternalJavaFXLang.g:2832:1: rule__Bean__Group__4__Impl : ( ( rule__Bean__Group_4__0 )? ) ;
    public final void rule__Bean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2836:1: ( ( ( rule__Bean__Group_4__0 )? ) )
            // InternalJavaFXLang.g:2837:1: ( ( rule__Bean__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:2837:1: ( ( rule__Bean__Group_4__0 )? )
            // InternalJavaFXLang.g:2838:2: ( rule__Bean__Group_4__0 )?
            {
             before(grammarAccess.getBeanAccess().getGroup_4()); 
            // InternalJavaFXLang.g:2839:2: ( rule__Bean__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJavaFXLang.g:2839:3: rule__Bean__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bean__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBeanAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Bean__Group__4__Impl"


    // $ANTLR start "rule__Bean__Group__5"
    // InternalJavaFXLang.g:2847:1: rule__Bean__Group__5 : rule__Bean__Group__5__Impl ;
    public final void rule__Bean__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2851:1: ( rule__Bean__Group__5__Impl )
            // InternalJavaFXLang.g:2852:2: rule__Bean__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bean__Group__5__Impl();

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
    // $ANTLR end "rule__Bean__Group__5"


    // $ANTLR start "rule__Bean__Group__5__Impl"
    // InternalJavaFXLang.g:2858:1: rule__Bean__Group__5__Impl : ( '}' ) ;
    public final void rule__Bean__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2862:1: ( ( '}' ) )
            // InternalJavaFXLang.g:2863:1: ( '}' )
            {
            // InternalJavaFXLang.g:2863:1: ( '}' )
            // InternalJavaFXLang.g:2864:2: '}'
            {
             before(grammarAccess.getBeanAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBeanAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Bean__Group__5__Impl"


    // $ANTLR start "rule__Bean__Group_4__0"
    // InternalJavaFXLang.g:2874:1: rule__Bean__Group_4__0 : rule__Bean__Group_4__0__Impl rule__Bean__Group_4__1 ;
    public final void rule__Bean__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2878:1: ( rule__Bean__Group_4__0__Impl rule__Bean__Group_4__1 )
            // InternalJavaFXLang.g:2879:2: rule__Bean__Group_4__0__Impl rule__Bean__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Bean__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bean__Group_4__1();

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
    // $ANTLR end "rule__Bean__Group_4__0"


    // $ANTLR start "rule__Bean__Group_4__0__Impl"
    // InternalJavaFXLang.g:2886:1: rule__Bean__Group_4__0__Impl : ( ( rule__Bean__AttributesAssignment_4_0 ) ) ;
    public final void rule__Bean__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2890:1: ( ( ( rule__Bean__AttributesAssignment_4_0 ) ) )
            // InternalJavaFXLang.g:2891:1: ( ( rule__Bean__AttributesAssignment_4_0 ) )
            {
            // InternalJavaFXLang.g:2891:1: ( ( rule__Bean__AttributesAssignment_4_0 ) )
            // InternalJavaFXLang.g:2892:2: ( rule__Bean__AttributesAssignment_4_0 )
            {
             before(grammarAccess.getBeanAccess().getAttributesAssignment_4_0()); 
            // InternalJavaFXLang.g:2893:2: ( rule__Bean__AttributesAssignment_4_0 )
            // InternalJavaFXLang.g:2893:3: rule__Bean__AttributesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Bean__AttributesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getBeanAccess().getAttributesAssignment_4_0()); 

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
    // $ANTLR end "rule__Bean__Group_4__0__Impl"


    // $ANTLR start "rule__Bean__Group_4__1"
    // InternalJavaFXLang.g:2901:1: rule__Bean__Group_4__1 : rule__Bean__Group_4__1__Impl ;
    public final void rule__Bean__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2905:1: ( rule__Bean__Group_4__1__Impl )
            // InternalJavaFXLang.g:2906:2: rule__Bean__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bean__Group_4__1__Impl();

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
    // $ANTLR end "rule__Bean__Group_4__1"


    // $ANTLR start "rule__Bean__Group_4__1__Impl"
    // InternalJavaFXLang.g:2912:1: rule__Bean__Group_4__1__Impl : ( ( rule__Bean__AttributesAssignment_4_1 )* ) ;
    public final void rule__Bean__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2916:1: ( ( ( rule__Bean__AttributesAssignment_4_1 )* ) )
            // InternalJavaFXLang.g:2917:1: ( ( rule__Bean__AttributesAssignment_4_1 )* )
            {
            // InternalJavaFXLang.g:2917:1: ( ( rule__Bean__AttributesAssignment_4_1 )* )
            // InternalJavaFXLang.g:2918:2: ( rule__Bean__AttributesAssignment_4_1 )*
            {
             before(grammarAccess.getBeanAccess().getAttributesAssignment_4_1()); 
            // InternalJavaFXLang.g:2919:2: ( rule__Bean__AttributesAssignment_4_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalJavaFXLang.g:2919:3: rule__Bean__AttributesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Bean__AttributesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getBeanAccess().getAttributesAssignment_4_1()); 

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
    // $ANTLR end "rule__Bean__Group_4__1__Impl"


    // $ANTLR start "rule__TableViewFX__Group__0"
    // InternalJavaFXLang.g:2928:1: rule__TableViewFX__Group__0 : rule__TableViewFX__Group__0__Impl rule__TableViewFX__Group__1 ;
    public final void rule__TableViewFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2932:1: ( rule__TableViewFX__Group__0__Impl rule__TableViewFX__Group__1 )
            // InternalJavaFXLang.g:2933:2: rule__TableViewFX__Group__0__Impl rule__TableViewFX__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__TableViewFX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group__1();

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
    // $ANTLR end "rule__TableViewFX__Group__0"


    // $ANTLR start "rule__TableViewFX__Group__0__Impl"
    // InternalJavaFXLang.g:2940:1: rule__TableViewFX__Group__0__Impl : ( () ) ;
    public final void rule__TableViewFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2944:1: ( ( () ) )
            // InternalJavaFXLang.g:2945:1: ( () )
            {
            // InternalJavaFXLang.g:2945:1: ( () )
            // InternalJavaFXLang.g:2946:2: ()
            {
             before(grammarAccess.getTableViewFXAccess().getTableViewFXAction_0()); 
            // InternalJavaFXLang.g:2947:2: ()
            // InternalJavaFXLang.g:2947:3: 
            {
            }

             after(grammarAccess.getTableViewFXAccess().getTableViewFXAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableViewFX__Group__0__Impl"


    // $ANTLR start "rule__TableViewFX__Group__1"
    // InternalJavaFXLang.g:2955:1: rule__TableViewFX__Group__1 : rule__TableViewFX__Group__1__Impl rule__TableViewFX__Group__2 ;
    public final void rule__TableViewFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2959:1: ( rule__TableViewFX__Group__1__Impl rule__TableViewFX__Group__2 )
            // InternalJavaFXLang.g:2960:2: rule__TableViewFX__Group__1__Impl rule__TableViewFX__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TableViewFX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group__2();

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
    // $ANTLR end "rule__TableViewFX__Group__1"


    // $ANTLR start "rule__TableViewFX__Group__1__Impl"
    // InternalJavaFXLang.g:2967:1: rule__TableViewFX__Group__1__Impl : ( 'TableView' ) ;
    public final void rule__TableViewFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2971:1: ( ( 'TableView' ) )
            // InternalJavaFXLang.g:2972:1: ( 'TableView' )
            {
            // InternalJavaFXLang.g:2972:1: ( 'TableView' )
            // InternalJavaFXLang.g:2973:2: 'TableView'
            {
             before(grammarAccess.getTableViewFXAccess().getTableViewKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTableViewFXAccess().getTableViewKeyword_1()); 

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
    // $ANTLR end "rule__TableViewFX__Group__1__Impl"


    // $ANTLR start "rule__TableViewFX__Group__2"
    // InternalJavaFXLang.g:2982:1: rule__TableViewFX__Group__2 : rule__TableViewFX__Group__2__Impl rule__TableViewFX__Group__3 ;
    public final void rule__TableViewFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2986:1: ( rule__TableViewFX__Group__2__Impl rule__TableViewFX__Group__3 )
            // InternalJavaFXLang.g:2987:2: rule__TableViewFX__Group__2__Impl rule__TableViewFX__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__TableViewFX__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group__3();

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
    // $ANTLR end "rule__TableViewFX__Group__2"


    // $ANTLR start "rule__TableViewFX__Group__2__Impl"
    // InternalJavaFXLang.g:2994:1: rule__TableViewFX__Group__2__Impl : ( '{' ) ;
    public final void rule__TableViewFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2998:1: ( ( '{' ) )
            // InternalJavaFXLang.g:2999:1: ( '{' )
            {
            // InternalJavaFXLang.g:2999:1: ( '{' )
            // InternalJavaFXLang.g:3000:2: '{'
            {
             before(grammarAccess.getTableViewFXAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTableViewFXAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__TableViewFX__Group__2__Impl"


    // $ANTLR start "rule__TableViewFX__Group__3"
    // InternalJavaFXLang.g:3009:1: rule__TableViewFX__Group__3 : rule__TableViewFX__Group__3__Impl rule__TableViewFX__Group__4 ;
    public final void rule__TableViewFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3013:1: ( rule__TableViewFX__Group__3__Impl rule__TableViewFX__Group__4 )
            // InternalJavaFXLang.g:3014:2: rule__TableViewFX__Group__3__Impl rule__TableViewFX__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__TableViewFX__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group__4();

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
    // $ANTLR end "rule__TableViewFX__Group__3"


    // $ANTLR start "rule__TableViewFX__Group__3__Impl"
    // InternalJavaFXLang.g:3021:1: rule__TableViewFX__Group__3__Impl : ( ( rule__TableViewFX__Group_3__0 ) ) ;
    public final void rule__TableViewFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3025:1: ( ( ( rule__TableViewFX__Group_3__0 ) ) )
            // InternalJavaFXLang.g:3026:1: ( ( rule__TableViewFX__Group_3__0 ) )
            {
            // InternalJavaFXLang.g:3026:1: ( ( rule__TableViewFX__Group_3__0 ) )
            // InternalJavaFXLang.g:3027:2: ( rule__TableViewFX__Group_3__0 )
            {
             before(grammarAccess.getTableViewFXAccess().getGroup_3()); 
            // InternalJavaFXLang.g:3028:2: ( rule__TableViewFX__Group_3__0 )
            // InternalJavaFXLang.g:3028:3: rule__TableViewFX__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getTableViewFXAccess().getGroup_3()); 

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
    // $ANTLR end "rule__TableViewFX__Group__3__Impl"


    // $ANTLR start "rule__TableViewFX__Group__4"
    // InternalJavaFXLang.g:3036:1: rule__TableViewFX__Group__4 : rule__TableViewFX__Group__4__Impl rule__TableViewFX__Group__5 ;
    public final void rule__TableViewFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3040:1: ( rule__TableViewFX__Group__4__Impl rule__TableViewFX__Group__5 )
            // InternalJavaFXLang.g:3041:2: rule__TableViewFX__Group__4__Impl rule__TableViewFX__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__TableViewFX__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group__5();

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
    // $ANTLR end "rule__TableViewFX__Group__4"


    // $ANTLR start "rule__TableViewFX__Group__4__Impl"
    // InternalJavaFXLang.g:3048:1: rule__TableViewFX__Group__4__Impl : ( ( rule__TableViewFX__Group_4__0 )? ) ;
    public final void rule__TableViewFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3052:1: ( ( ( rule__TableViewFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:3053:1: ( ( rule__TableViewFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:3053:1: ( ( rule__TableViewFX__Group_4__0 )? )
            // InternalJavaFXLang.g:3054:2: ( rule__TableViewFX__Group_4__0 )?
            {
             before(grammarAccess.getTableViewFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:3055:2: ( rule__TableViewFX__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJavaFXLang.g:3055:3: rule__TableViewFX__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TableViewFX__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableViewFXAccess().getGroup_4()); 

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
    // $ANTLR end "rule__TableViewFX__Group__4__Impl"


    // $ANTLR start "rule__TableViewFX__Group__5"
    // InternalJavaFXLang.g:3063:1: rule__TableViewFX__Group__5 : rule__TableViewFX__Group__5__Impl rule__TableViewFX__Group__6 ;
    public final void rule__TableViewFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3067:1: ( rule__TableViewFX__Group__5__Impl rule__TableViewFX__Group__6 )
            // InternalJavaFXLang.g:3068:2: rule__TableViewFX__Group__5__Impl rule__TableViewFX__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__TableViewFX__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group__6();

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
    // $ANTLR end "rule__TableViewFX__Group__5"


    // $ANTLR start "rule__TableViewFX__Group__5__Impl"
    // InternalJavaFXLang.g:3075:1: rule__TableViewFX__Group__5__Impl : ( ( rule__TableViewFX__Group_5__0 )? ) ;
    public final void rule__TableViewFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3079:1: ( ( ( rule__TableViewFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:3080:1: ( ( rule__TableViewFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:3080:1: ( ( rule__TableViewFX__Group_5__0 )? )
            // InternalJavaFXLang.g:3081:2: ( rule__TableViewFX__Group_5__0 )?
            {
             before(grammarAccess.getTableViewFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:3082:2: ( rule__TableViewFX__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJavaFXLang.g:3082:3: rule__TableViewFX__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TableViewFX__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableViewFXAccess().getGroup_5()); 

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
    // $ANTLR end "rule__TableViewFX__Group__5__Impl"


    // $ANTLR start "rule__TableViewFX__Group__6"
    // InternalJavaFXLang.g:3090:1: rule__TableViewFX__Group__6 : rule__TableViewFX__Group__6__Impl rule__TableViewFX__Group__7 ;
    public final void rule__TableViewFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3094:1: ( rule__TableViewFX__Group__6__Impl rule__TableViewFX__Group__7 )
            // InternalJavaFXLang.g:3095:2: rule__TableViewFX__Group__6__Impl rule__TableViewFX__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__TableViewFX__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group__7();

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
    // $ANTLR end "rule__TableViewFX__Group__6"


    // $ANTLR start "rule__TableViewFX__Group__6__Impl"
    // InternalJavaFXLang.g:3102:1: rule__TableViewFX__Group__6__Impl : ( ( rule__TableViewFX__Group_6__0 )? ) ;
    public final void rule__TableViewFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3106:1: ( ( ( rule__TableViewFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:3107:1: ( ( rule__TableViewFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:3107:1: ( ( rule__TableViewFX__Group_6__0 )? )
            // InternalJavaFXLang.g:3108:2: ( rule__TableViewFX__Group_6__0 )?
            {
             before(grammarAccess.getTableViewFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:3109:2: ( rule__TableViewFX__Group_6__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalJavaFXLang.g:3109:3: rule__TableViewFX__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TableViewFX__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableViewFXAccess().getGroup_6()); 

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
    // $ANTLR end "rule__TableViewFX__Group__6__Impl"


    // $ANTLR start "rule__TableViewFX__Group__7"
    // InternalJavaFXLang.g:3117:1: rule__TableViewFX__Group__7 : rule__TableViewFX__Group__7__Impl ;
    public final void rule__TableViewFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3121:1: ( rule__TableViewFX__Group__7__Impl )
            // InternalJavaFXLang.g:3122:2: rule__TableViewFX__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group__7__Impl();

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
    // $ANTLR end "rule__TableViewFX__Group__7"


    // $ANTLR start "rule__TableViewFX__Group__7__Impl"
    // InternalJavaFXLang.g:3128:1: rule__TableViewFX__Group__7__Impl : ( '}' ) ;
    public final void rule__TableViewFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3132:1: ( ( '}' ) )
            // InternalJavaFXLang.g:3133:1: ( '}' )
            {
            // InternalJavaFXLang.g:3133:1: ( '}' )
            // InternalJavaFXLang.g:3134:2: '}'
            {
             before(grammarAccess.getTableViewFXAccess().getRightCurlyBracketKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTableViewFXAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__TableViewFX__Group__7__Impl"


    // $ANTLR start "rule__TableViewFX__Group_3__0"
    // InternalJavaFXLang.g:3144:1: rule__TableViewFX__Group_3__0 : rule__TableViewFX__Group_3__0__Impl rule__TableViewFX__Group_3__1 ;
    public final void rule__TableViewFX__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3148:1: ( rule__TableViewFX__Group_3__0__Impl rule__TableViewFX__Group_3__1 )
            // InternalJavaFXLang.g:3149:2: rule__TableViewFX__Group_3__0__Impl rule__TableViewFX__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TableViewFX__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group_3__1();

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
    // $ANTLR end "rule__TableViewFX__Group_3__0"


    // $ANTLR start "rule__TableViewFX__Group_3__0__Impl"
    // InternalJavaFXLang.g:3156:1: rule__TableViewFX__Group_3__0__Impl : ( 'name:' ) ;
    public final void rule__TableViewFX__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3160:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:3161:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:3161:1: ( 'name:' )
            // InternalJavaFXLang.g:3162:2: 'name:'
            {
             before(grammarAccess.getTableViewFXAccess().getNameKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTableViewFXAccess().getNameKeyword_3_0()); 

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
    // $ANTLR end "rule__TableViewFX__Group_3__0__Impl"


    // $ANTLR start "rule__TableViewFX__Group_3__1"
    // InternalJavaFXLang.g:3171:1: rule__TableViewFX__Group_3__1 : rule__TableViewFX__Group_3__1__Impl ;
    public final void rule__TableViewFX__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3175:1: ( rule__TableViewFX__Group_3__1__Impl )
            // InternalJavaFXLang.g:3176:2: rule__TableViewFX__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group_3__1__Impl();

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
    // $ANTLR end "rule__TableViewFX__Group_3__1"


    // $ANTLR start "rule__TableViewFX__Group_3__1__Impl"
    // InternalJavaFXLang.g:3182:1: rule__TableViewFX__Group_3__1__Impl : ( ( rule__TableViewFX__NameAssignment_3_1 ) ) ;
    public final void rule__TableViewFX__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3186:1: ( ( ( rule__TableViewFX__NameAssignment_3_1 ) ) )
            // InternalJavaFXLang.g:3187:1: ( ( rule__TableViewFX__NameAssignment_3_1 ) )
            {
            // InternalJavaFXLang.g:3187:1: ( ( rule__TableViewFX__NameAssignment_3_1 ) )
            // InternalJavaFXLang.g:3188:2: ( rule__TableViewFX__NameAssignment_3_1 )
            {
             before(grammarAccess.getTableViewFXAccess().getNameAssignment_3_1()); 
            // InternalJavaFXLang.g:3189:2: ( rule__TableViewFX__NameAssignment_3_1 )
            // InternalJavaFXLang.g:3189:3: rule__TableViewFX__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TableViewFX__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTableViewFXAccess().getNameAssignment_3_1()); 

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
    // $ANTLR end "rule__TableViewFX__Group_3__1__Impl"


    // $ANTLR start "rule__TableViewFX__Group_4__0"
    // InternalJavaFXLang.g:3198:1: rule__TableViewFX__Group_4__0 : rule__TableViewFX__Group_4__0__Impl rule__TableViewFX__Group_4__1 ;
    public final void rule__TableViewFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3202:1: ( rule__TableViewFX__Group_4__0__Impl rule__TableViewFX__Group_4__1 )
            // InternalJavaFXLang.g:3203:2: rule__TableViewFX__Group_4__0__Impl rule__TableViewFX__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__TableViewFX__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group_4__1();

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
    // $ANTLR end "rule__TableViewFX__Group_4__0"


    // $ANTLR start "rule__TableViewFX__Group_4__0__Impl"
    // InternalJavaFXLang.g:3210:1: rule__TableViewFX__Group_4__0__Impl : ( 'usedModel:' ) ;
    public final void rule__TableViewFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3214:1: ( ( 'usedModel:' ) )
            // InternalJavaFXLang.g:3215:1: ( 'usedModel:' )
            {
            // InternalJavaFXLang.g:3215:1: ( 'usedModel:' )
            // InternalJavaFXLang.g:3216:2: 'usedModel:'
            {
             before(grammarAccess.getTableViewFXAccess().getUsedModelKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTableViewFXAccess().getUsedModelKeyword_4_0()); 

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
    // $ANTLR end "rule__TableViewFX__Group_4__0__Impl"


    // $ANTLR start "rule__TableViewFX__Group_4__1"
    // InternalJavaFXLang.g:3225:1: rule__TableViewFX__Group_4__1 : rule__TableViewFX__Group_4__1__Impl ;
    public final void rule__TableViewFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3229:1: ( rule__TableViewFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:3230:2: rule__TableViewFX__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group_4__1__Impl();

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
    // $ANTLR end "rule__TableViewFX__Group_4__1"


    // $ANTLR start "rule__TableViewFX__Group_4__1__Impl"
    // InternalJavaFXLang.g:3236:1: rule__TableViewFX__Group_4__1__Impl : ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) ) ;
    public final void rule__TableViewFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3240:1: ( ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:3241:1: ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:3241:1: ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) )
            // InternalJavaFXLang.g:3242:2: ( rule__TableViewFX__UsedModelAssignment_4_1 )
            {
             before(grammarAccess.getTableViewFXAccess().getUsedModelAssignment_4_1()); 
            // InternalJavaFXLang.g:3243:2: ( rule__TableViewFX__UsedModelAssignment_4_1 )
            // InternalJavaFXLang.g:3243:3: rule__TableViewFX__UsedModelAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TableViewFX__UsedModelAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTableViewFXAccess().getUsedModelAssignment_4_1()); 

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
    // $ANTLR end "rule__TableViewFX__Group_4__1__Impl"


    // $ANTLR start "rule__TableViewFX__Group_5__0"
    // InternalJavaFXLang.g:3252:1: rule__TableViewFX__Group_5__0 : rule__TableViewFX__Group_5__0__Impl rule__TableViewFX__Group_5__1 ;
    public final void rule__TableViewFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3256:1: ( rule__TableViewFX__Group_5__0__Impl rule__TableViewFX__Group_5__1 )
            // InternalJavaFXLang.g:3257:2: rule__TableViewFX__Group_5__0__Impl rule__TableViewFX__Group_5__1
            {
            pushFollow(FOLLOW_22);
            rule__TableViewFX__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group_5__1();

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
    // $ANTLR end "rule__TableViewFX__Group_5__0"


    // $ANTLR start "rule__TableViewFX__Group_5__0__Impl"
    // InternalJavaFXLang.g:3264:1: rule__TableViewFX__Group_5__0__Impl : ( 'usedFilter:' ) ;
    public final void rule__TableViewFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3268:1: ( ( 'usedFilter:' ) )
            // InternalJavaFXLang.g:3269:1: ( 'usedFilter:' )
            {
            // InternalJavaFXLang.g:3269:1: ( 'usedFilter:' )
            // InternalJavaFXLang.g:3270:2: 'usedFilter:'
            {
             before(grammarAccess.getTableViewFXAccess().getUsedFilterKeyword_5_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTableViewFXAccess().getUsedFilterKeyword_5_0()); 

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
    // $ANTLR end "rule__TableViewFX__Group_5__0__Impl"


    // $ANTLR start "rule__TableViewFX__Group_5__1"
    // InternalJavaFXLang.g:3279:1: rule__TableViewFX__Group_5__1 : rule__TableViewFX__Group_5__1__Impl ;
    public final void rule__TableViewFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3283:1: ( rule__TableViewFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:3284:2: rule__TableViewFX__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group_5__1__Impl();

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
    // $ANTLR end "rule__TableViewFX__Group_5__1"


    // $ANTLR start "rule__TableViewFX__Group_5__1__Impl"
    // InternalJavaFXLang.g:3290:1: rule__TableViewFX__Group_5__1__Impl : ( ( rule__TableViewFX__UseFilterAssignment_5_1 ) ) ;
    public final void rule__TableViewFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3294:1: ( ( ( rule__TableViewFX__UseFilterAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:3295:1: ( ( rule__TableViewFX__UseFilterAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:3295:1: ( ( rule__TableViewFX__UseFilterAssignment_5_1 ) )
            // InternalJavaFXLang.g:3296:2: ( rule__TableViewFX__UseFilterAssignment_5_1 )
            {
             before(grammarAccess.getTableViewFXAccess().getUseFilterAssignment_5_1()); 
            // InternalJavaFXLang.g:3297:2: ( rule__TableViewFX__UseFilterAssignment_5_1 )
            // InternalJavaFXLang.g:3297:3: rule__TableViewFX__UseFilterAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TableViewFX__UseFilterAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTableViewFXAccess().getUseFilterAssignment_5_1()); 

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
    // $ANTLR end "rule__TableViewFX__Group_5__1__Impl"


    // $ANTLR start "rule__TableViewFX__Group_6__0"
    // InternalJavaFXLang.g:3306:1: rule__TableViewFX__Group_6__0 : rule__TableViewFX__Group_6__0__Impl rule__TableViewFX__Group_6__1 ;
    public final void rule__TableViewFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3310:1: ( rule__TableViewFX__Group_6__0__Impl rule__TableViewFX__Group_6__1 )
            // InternalJavaFXLang.g:3311:2: rule__TableViewFX__Group_6__0__Impl rule__TableViewFX__Group_6__1
            {
            pushFollow(FOLLOW_30);
            rule__TableViewFX__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group_6__1();

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
    // $ANTLR end "rule__TableViewFX__Group_6__0"


    // $ANTLR start "rule__TableViewFX__Group_6__0__Impl"
    // InternalJavaFXLang.g:3318:1: rule__TableViewFX__Group_6__0__Impl : ( ( rule__TableViewFX__ColumnsAssignment_6_0 ) ) ;
    public final void rule__TableViewFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3322:1: ( ( ( rule__TableViewFX__ColumnsAssignment_6_0 ) ) )
            // InternalJavaFXLang.g:3323:1: ( ( rule__TableViewFX__ColumnsAssignment_6_0 ) )
            {
            // InternalJavaFXLang.g:3323:1: ( ( rule__TableViewFX__ColumnsAssignment_6_0 ) )
            // InternalJavaFXLang.g:3324:2: ( rule__TableViewFX__ColumnsAssignment_6_0 )
            {
             before(grammarAccess.getTableViewFXAccess().getColumnsAssignment_6_0()); 
            // InternalJavaFXLang.g:3325:2: ( rule__TableViewFX__ColumnsAssignment_6_0 )
            // InternalJavaFXLang.g:3325:3: rule__TableViewFX__ColumnsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__TableViewFX__ColumnsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getTableViewFXAccess().getColumnsAssignment_6_0()); 

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
    // $ANTLR end "rule__TableViewFX__Group_6__0__Impl"


    // $ANTLR start "rule__TableViewFX__Group_6__1"
    // InternalJavaFXLang.g:3333:1: rule__TableViewFX__Group_6__1 : rule__TableViewFX__Group_6__1__Impl ;
    public final void rule__TableViewFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3337:1: ( rule__TableViewFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:3338:2: rule__TableViewFX__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group_6__1__Impl();

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
    // $ANTLR end "rule__TableViewFX__Group_6__1"


    // $ANTLR start "rule__TableViewFX__Group_6__1__Impl"
    // InternalJavaFXLang.g:3344:1: rule__TableViewFX__Group_6__1__Impl : ( ( rule__TableViewFX__ColumnsAssignment_6_1 )* ) ;
    public final void rule__TableViewFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3348:1: ( ( ( rule__TableViewFX__ColumnsAssignment_6_1 )* ) )
            // InternalJavaFXLang.g:3349:1: ( ( rule__TableViewFX__ColumnsAssignment_6_1 )* )
            {
            // InternalJavaFXLang.g:3349:1: ( ( rule__TableViewFX__ColumnsAssignment_6_1 )* )
            // InternalJavaFXLang.g:3350:2: ( rule__TableViewFX__ColumnsAssignment_6_1 )*
            {
             before(grammarAccess.getTableViewFXAccess().getColumnsAssignment_6_1()); 
            // InternalJavaFXLang.g:3351:2: ( rule__TableViewFX__ColumnsAssignment_6_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==46) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalJavaFXLang.g:3351:3: rule__TableViewFX__ColumnsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__TableViewFX__ColumnsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getTableViewFXAccess().getColumnsAssignment_6_1()); 

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
    // $ANTLR end "rule__TableViewFX__Group_6__1__Impl"


    // $ANTLR start "rule__TableColumnFX__Group__0"
    // InternalJavaFXLang.g:3360:1: rule__TableColumnFX__Group__0 : rule__TableColumnFX__Group__0__Impl rule__TableColumnFX__Group__1 ;
    public final void rule__TableColumnFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3364:1: ( rule__TableColumnFX__Group__0__Impl rule__TableColumnFX__Group__1 )
            // InternalJavaFXLang.g:3365:2: rule__TableColumnFX__Group__0__Impl rule__TableColumnFX__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__TableColumnFX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableColumnFX__Group__1();

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
    // $ANTLR end "rule__TableColumnFX__Group__0"


    // $ANTLR start "rule__TableColumnFX__Group__0__Impl"
    // InternalJavaFXLang.g:3372:1: rule__TableColumnFX__Group__0__Impl : ( () ) ;
    public final void rule__TableColumnFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3376:1: ( ( () ) )
            // InternalJavaFXLang.g:3377:1: ( () )
            {
            // InternalJavaFXLang.g:3377:1: ( () )
            // InternalJavaFXLang.g:3378:2: ()
            {
             before(grammarAccess.getTableColumnFXAccess().getTableColumnFXAction_0()); 
            // InternalJavaFXLang.g:3379:2: ()
            // InternalJavaFXLang.g:3379:3: 
            {
            }

             after(grammarAccess.getTableColumnFXAccess().getTableColumnFXAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableColumnFX__Group__0__Impl"


    // $ANTLR start "rule__TableColumnFX__Group__1"
    // InternalJavaFXLang.g:3387:1: rule__TableColumnFX__Group__1 : rule__TableColumnFX__Group__1__Impl rule__TableColumnFX__Group__2 ;
    public final void rule__TableColumnFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3391:1: ( rule__TableColumnFX__Group__1__Impl rule__TableColumnFX__Group__2 )
            // InternalJavaFXLang.g:3392:2: rule__TableColumnFX__Group__1__Impl rule__TableColumnFX__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__TableColumnFX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableColumnFX__Group__2();

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
    // $ANTLR end "rule__TableColumnFX__Group__1"


    // $ANTLR start "rule__TableColumnFX__Group__1__Impl"
    // InternalJavaFXLang.g:3399:1: rule__TableColumnFX__Group__1__Impl : ( 'Column' ) ;
    public final void rule__TableColumnFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3403:1: ( ( 'Column' ) )
            // InternalJavaFXLang.g:3404:1: ( 'Column' )
            {
            // InternalJavaFXLang.g:3404:1: ( 'Column' )
            // InternalJavaFXLang.g:3405:2: 'Column'
            {
             before(grammarAccess.getTableColumnFXAccess().getColumnKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTableColumnFXAccess().getColumnKeyword_1()); 

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
    // $ANTLR end "rule__TableColumnFX__Group__1__Impl"


    // $ANTLR start "rule__TableColumnFX__Group__2"
    // InternalJavaFXLang.g:3414:1: rule__TableColumnFX__Group__2 : rule__TableColumnFX__Group__2__Impl rule__TableColumnFX__Group__3 ;
    public final void rule__TableColumnFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3418:1: ( rule__TableColumnFX__Group__2__Impl rule__TableColumnFX__Group__3 )
            // InternalJavaFXLang.g:3419:2: rule__TableColumnFX__Group__2__Impl rule__TableColumnFX__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__TableColumnFX__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableColumnFX__Group__3();

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
    // $ANTLR end "rule__TableColumnFX__Group__2"


    // $ANTLR start "rule__TableColumnFX__Group__2__Impl"
    // InternalJavaFXLang.g:3426:1: rule__TableColumnFX__Group__2__Impl : ( '(' ) ;
    public final void rule__TableColumnFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3430:1: ( ( '(' ) )
            // InternalJavaFXLang.g:3431:1: ( '(' )
            {
            // InternalJavaFXLang.g:3431:1: ( '(' )
            // InternalJavaFXLang.g:3432:2: '('
            {
             before(grammarAccess.getTableColumnFXAccess().getLeftParenthesisKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTableColumnFXAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__TableColumnFX__Group__2__Impl"


    // $ANTLR start "rule__TableColumnFX__Group__3"
    // InternalJavaFXLang.g:3441:1: rule__TableColumnFX__Group__3 : rule__TableColumnFX__Group__3__Impl rule__TableColumnFX__Group__4 ;
    public final void rule__TableColumnFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3445:1: ( rule__TableColumnFX__Group__3__Impl rule__TableColumnFX__Group__4 )
            // InternalJavaFXLang.g:3446:2: rule__TableColumnFX__Group__3__Impl rule__TableColumnFX__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__TableColumnFX__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableColumnFX__Group__4();

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
    // $ANTLR end "rule__TableColumnFX__Group__3"


    // $ANTLR start "rule__TableColumnFX__Group__3__Impl"
    // InternalJavaFXLang.g:3453:1: rule__TableColumnFX__Group__3__Impl : ( ( rule__TableColumnFX__Group_3__0 ) ) ;
    public final void rule__TableColumnFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3457:1: ( ( ( rule__TableColumnFX__Group_3__0 ) ) )
            // InternalJavaFXLang.g:3458:1: ( ( rule__TableColumnFX__Group_3__0 ) )
            {
            // InternalJavaFXLang.g:3458:1: ( ( rule__TableColumnFX__Group_3__0 ) )
            // InternalJavaFXLang.g:3459:2: ( rule__TableColumnFX__Group_3__0 )
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_3()); 
            // InternalJavaFXLang.g:3460:2: ( rule__TableColumnFX__Group_3__0 )
            // InternalJavaFXLang.g:3460:3: rule__TableColumnFX__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__TableColumnFX__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getTableColumnFXAccess().getGroup_3()); 

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
    // $ANTLR end "rule__TableColumnFX__Group__3__Impl"


    // $ANTLR start "rule__TableColumnFX__Group__4"
    // InternalJavaFXLang.g:3468:1: rule__TableColumnFX__Group__4 : rule__TableColumnFX__Group__4__Impl rule__TableColumnFX__Group__5 ;
    public final void rule__TableColumnFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3472:1: ( rule__TableColumnFX__Group__4__Impl rule__TableColumnFX__Group__5 )
            // InternalJavaFXLang.g:3473:2: rule__TableColumnFX__Group__4__Impl rule__TableColumnFX__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__TableColumnFX__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableColumnFX__Group__5();

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
    // $ANTLR end "rule__TableColumnFX__Group__4"


    // $ANTLR start "rule__TableColumnFX__Group__4__Impl"
    // InternalJavaFXLang.g:3480:1: rule__TableColumnFX__Group__4__Impl : ( ( rule__TableColumnFX__Group_4__0 )? ) ;
    public final void rule__TableColumnFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3484:1: ( ( ( rule__TableColumnFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:3485:1: ( ( rule__TableColumnFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:3485:1: ( ( rule__TableColumnFX__Group_4__0 )? )
            // InternalJavaFXLang.g:3486:2: ( rule__TableColumnFX__Group_4__0 )?
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:3487:2: ( rule__TableColumnFX__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalJavaFXLang.g:3487:3: rule__TableColumnFX__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TableColumnFX__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableColumnFXAccess().getGroup_4()); 

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
    // $ANTLR end "rule__TableColumnFX__Group__4__Impl"


    // $ANTLR start "rule__TableColumnFX__Group__5"
    // InternalJavaFXLang.g:3495:1: rule__TableColumnFX__Group__5 : rule__TableColumnFX__Group__5__Impl rule__TableColumnFX__Group__6 ;
    public final void rule__TableColumnFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3499:1: ( rule__TableColumnFX__Group__5__Impl rule__TableColumnFX__Group__6 )
            // InternalJavaFXLang.g:3500:2: rule__TableColumnFX__Group__5__Impl rule__TableColumnFX__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__TableColumnFX__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableColumnFX__Group__6();

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
    // $ANTLR end "rule__TableColumnFX__Group__5"


    // $ANTLR start "rule__TableColumnFX__Group__5__Impl"
    // InternalJavaFXLang.g:3507:1: rule__TableColumnFX__Group__5__Impl : ( ( rule__TableColumnFX__Group_5__0 )? ) ;
    public final void rule__TableColumnFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3511:1: ( ( ( rule__TableColumnFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:3512:1: ( ( rule__TableColumnFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:3512:1: ( ( rule__TableColumnFX__Group_5__0 )? )
            // InternalJavaFXLang.g:3513:2: ( rule__TableColumnFX__Group_5__0 )?
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:3514:2: ( rule__TableColumnFX__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalJavaFXLang.g:3514:3: rule__TableColumnFX__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TableColumnFX__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableColumnFXAccess().getGroup_5()); 

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
    // $ANTLR end "rule__TableColumnFX__Group__5__Impl"


    // $ANTLR start "rule__TableColumnFX__Group__6"
    // InternalJavaFXLang.g:3522:1: rule__TableColumnFX__Group__6 : rule__TableColumnFX__Group__6__Impl rule__TableColumnFX__Group__7 ;
    public final void rule__TableColumnFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3526:1: ( rule__TableColumnFX__Group__6__Impl rule__TableColumnFX__Group__7 )
            // InternalJavaFXLang.g:3527:2: rule__TableColumnFX__Group__6__Impl rule__TableColumnFX__Group__7
            {
            pushFollow(FOLLOW_33);
            rule__TableColumnFX__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableColumnFX__Group__7();

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
    // $ANTLR end "rule__TableColumnFX__Group__6"


    // $ANTLR start "rule__TableColumnFX__Group__6__Impl"
    // InternalJavaFXLang.g:3534:1: rule__TableColumnFX__Group__6__Impl : ( ( rule__TableColumnFX__Group_6__0 )? ) ;
    public final void rule__TableColumnFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3538:1: ( ( ( rule__TableColumnFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:3539:1: ( ( rule__TableColumnFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:3539:1: ( ( rule__TableColumnFX__Group_6__0 )? )
            // InternalJavaFXLang.g:3540:2: ( rule__TableColumnFX__Group_6__0 )?
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:3541:2: ( rule__TableColumnFX__Group_6__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==51) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalJavaFXLang.g:3541:3: rule__TableColumnFX__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TableColumnFX__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableColumnFXAccess().getGroup_6()); 

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
    // $ANTLR end "rule__TableColumnFX__Group__6__Impl"


    // $ANTLR start "rule__TableColumnFX__Group__7"
    // InternalJavaFXLang.g:3549:1: rule__TableColumnFX__Group__7 : rule__TableColumnFX__Group__7__Impl ;
    public final void rule__TableColumnFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3553:1: ( rule__TableColumnFX__Group__7__Impl )
            // InternalJavaFXLang.g:3554:2: rule__TableColumnFX__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableColumnFX__Group__7__Impl();

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
    // $ANTLR end "rule__TableColumnFX__Group__7"


    // $ANTLR start "rule__TableColumnFX__Group__7__Impl"
    // InternalJavaFXLang.g:3560:1: rule__TableColumnFX__Group__7__Impl : ( ')' ) ;
    public final void rule__TableColumnFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3564:1: ( ( ')' ) )
            // InternalJavaFXLang.g:3565:1: ( ')' )
            {
            // InternalJavaFXLang.g:3565:1: ( ')' )
            // InternalJavaFXLang.g:3566:2: ')'
            {
             before(grammarAccess.getTableColumnFXAccess().getRightParenthesisKeyword_7()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTableColumnFXAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__TableColumnFX__Group__7__Impl"


    // $ANTLR start "rule__TableColumnFX__Group_3__0"
    // InternalJavaFXLang.g:3576:1: rule__TableColumnFX__Group_3__0 : rule__TableColumnFX__Group_3__0__Impl rule__TableColumnFX__Group_3__1 ;
    public final void rule__TableColumnFX__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3580:1: ( rule__TableColumnFX__Group_3__0__Impl rule__TableColumnFX__Group_3__1 )
            // InternalJavaFXLang.g:3581:2: rule__TableColumnFX__Group_3__0__Impl rule__TableColumnFX__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TableColumnFX__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableColumnFX__Group_3__1();

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
    // $ANTLR end "rule__TableColumnFX__Group_3__0"


    // $ANTLR start "rule__TableColumnFX__Group_3__0__Impl"
    // InternalJavaFXLang.g:3588:1: rule__TableColumnFX__Group_3__0__Impl : ( 'name:' ) ;
    public final void rule__TableColumnFX__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3592:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:3593:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:3593:1: ( 'name:' )
            // InternalJavaFXLang.g:3594:2: 'name:'
            {
             before(grammarAccess.getTableColumnFXAccess().getNameKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTableColumnFXAccess().getNameKeyword_3_0()); 

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
    // $ANTLR end "rule__TableColumnFX__Group_3__0__Impl"


    // $ANTLR start "rule__TableColumnFX__Group_3__1"
    // InternalJavaFXLang.g:3603:1: rule__TableColumnFX__Group_3__1 : rule__TableColumnFX__Group_3__1__Impl ;
    public final void rule__TableColumnFX__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3607:1: ( rule__TableColumnFX__Group_3__1__Impl )
            // InternalJavaFXLang.g:3608:2: rule__TableColumnFX__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableColumnFX__Group_3__1__Impl();

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
    // $ANTLR end "rule__TableColumnFX__Group_3__1"


    // $ANTLR start "rule__TableColumnFX__Group_3__1__Impl"
    // InternalJavaFXLang.g:3614:1: rule__TableColumnFX__Group_3__1__Impl : ( ( rule__TableColumnFX__NameAssignment_3_1 ) ) ;
    public final void rule__TableColumnFX__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3618:1: ( ( ( rule__TableColumnFX__NameAssignment_3_1 ) ) )
            // InternalJavaFXLang.g:3619:1: ( ( rule__TableColumnFX__NameAssignment_3_1 ) )
            {
            // InternalJavaFXLang.g:3619:1: ( ( rule__TableColumnFX__NameAssignment_3_1 ) )
            // InternalJavaFXLang.g:3620:2: ( rule__TableColumnFX__NameAssignment_3_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getNameAssignment_3_1()); 
            // InternalJavaFXLang.g:3621:2: ( rule__TableColumnFX__NameAssignment_3_1 )
            // InternalJavaFXLang.g:3621:3: rule__TableColumnFX__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TableColumnFX__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTableColumnFXAccess().getNameAssignment_3_1()); 

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
    // $ANTLR end "rule__TableColumnFX__Group_3__1__Impl"


    // $ANTLR start "rule__TableColumnFX__Group_4__0"
    // InternalJavaFXLang.g:3630:1: rule__TableColumnFX__Group_4__0 : rule__TableColumnFX__Group_4__0__Impl rule__TableColumnFX__Group_4__1 ;
    public final void rule__TableColumnFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3634:1: ( rule__TableColumnFX__Group_4__0__Impl rule__TableColumnFX__Group_4__1 )
            // InternalJavaFXLang.g:3635:2: rule__TableColumnFX__Group_4__0__Impl rule__TableColumnFX__Group_4__1
            {
            pushFollow(FOLLOW_34);
            rule__TableColumnFX__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableColumnFX__Group_4__1();

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
    // $ANTLR end "rule__TableColumnFX__Group_4__0"


    // $ANTLR start "rule__TableColumnFX__Group_4__0__Impl"
    // InternalJavaFXLang.g:3642:1: rule__TableColumnFX__Group_4__0__Impl : ( 'width:' ) ;
    public final void rule__TableColumnFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3646:1: ( ( 'width:' ) )
            // InternalJavaFXLang.g:3647:1: ( 'width:' )
            {
            // InternalJavaFXLang.g:3647:1: ( 'width:' )
            // InternalJavaFXLang.g:3648:2: 'width:'
            {
             before(grammarAccess.getTableColumnFXAccess().getWidthKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTableColumnFXAccess().getWidthKeyword_4_0()); 

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
    // $ANTLR end "rule__TableColumnFX__Group_4__0__Impl"


    // $ANTLR start "rule__TableColumnFX__Group_4__1"
    // InternalJavaFXLang.g:3657:1: rule__TableColumnFX__Group_4__1 : rule__TableColumnFX__Group_4__1__Impl ;
    public final void rule__TableColumnFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3661:1: ( rule__TableColumnFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:3662:2: rule__TableColumnFX__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableColumnFX__Group_4__1__Impl();

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
    // $ANTLR end "rule__TableColumnFX__Group_4__1"


    // $ANTLR start "rule__TableColumnFX__Group_4__1__Impl"
    // InternalJavaFXLang.g:3668:1: rule__TableColumnFX__Group_4__1__Impl : ( ( rule__TableColumnFX__WidthAssignment_4_1 ) ) ;
    public final void rule__TableColumnFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3672:1: ( ( ( rule__TableColumnFX__WidthAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:3673:1: ( ( rule__TableColumnFX__WidthAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:3673:1: ( ( rule__TableColumnFX__WidthAssignment_4_1 ) )
            // InternalJavaFXLang.g:3674:2: ( rule__TableColumnFX__WidthAssignment_4_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getWidthAssignment_4_1()); 
            // InternalJavaFXLang.g:3675:2: ( rule__TableColumnFX__WidthAssignment_4_1 )
            // InternalJavaFXLang.g:3675:3: rule__TableColumnFX__WidthAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TableColumnFX__WidthAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTableColumnFXAccess().getWidthAssignment_4_1()); 

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
    // $ANTLR end "rule__TableColumnFX__Group_4__1__Impl"


    // $ANTLR start "rule__TableColumnFX__Group_5__0"
    // InternalJavaFXLang.g:3684:1: rule__TableColumnFX__Group_5__0 : rule__TableColumnFX__Group_5__0__Impl rule__TableColumnFX__Group_5__1 ;
    public final void rule__TableColumnFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3688:1: ( rule__TableColumnFX__Group_5__0__Impl rule__TableColumnFX__Group_5__1 )
            // InternalJavaFXLang.g:3689:2: rule__TableColumnFX__Group_5__0__Impl rule__TableColumnFX__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__TableColumnFX__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableColumnFX__Group_5__1();

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
    // $ANTLR end "rule__TableColumnFX__Group_5__0"


    // $ANTLR start "rule__TableColumnFX__Group_5__0__Impl"
    // InternalJavaFXLang.g:3696:1: rule__TableColumnFX__Group_5__0__Impl : ( 'attribute:' ) ;
    public final void rule__TableColumnFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3700:1: ( ( 'attribute:' ) )
            // InternalJavaFXLang.g:3701:1: ( 'attribute:' )
            {
            // InternalJavaFXLang.g:3701:1: ( 'attribute:' )
            // InternalJavaFXLang.g:3702:2: 'attribute:'
            {
             before(grammarAccess.getTableColumnFXAccess().getAttributeKeyword_5_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTableColumnFXAccess().getAttributeKeyword_5_0()); 

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
    // $ANTLR end "rule__TableColumnFX__Group_5__0__Impl"


    // $ANTLR start "rule__TableColumnFX__Group_5__1"
    // InternalJavaFXLang.g:3711:1: rule__TableColumnFX__Group_5__1 : rule__TableColumnFX__Group_5__1__Impl ;
    public final void rule__TableColumnFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3715:1: ( rule__TableColumnFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:3716:2: rule__TableColumnFX__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableColumnFX__Group_5__1__Impl();

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
    // $ANTLR end "rule__TableColumnFX__Group_5__1"


    // $ANTLR start "rule__TableColumnFX__Group_5__1__Impl"
    // InternalJavaFXLang.g:3722:1: rule__TableColumnFX__Group_5__1__Impl : ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) ) ;
    public final void rule__TableColumnFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3726:1: ( ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:3727:1: ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:3727:1: ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) )
            // InternalJavaFXLang.g:3728:2: ( rule__TableColumnFX__UsedAttributeAssignment_5_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getUsedAttributeAssignment_5_1()); 
            // InternalJavaFXLang.g:3729:2: ( rule__TableColumnFX__UsedAttributeAssignment_5_1 )
            // InternalJavaFXLang.g:3729:3: rule__TableColumnFX__UsedAttributeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TableColumnFX__UsedAttributeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTableColumnFXAccess().getUsedAttributeAssignment_5_1()); 

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
    // $ANTLR end "rule__TableColumnFX__Group_5__1__Impl"


    // $ANTLR start "rule__TableColumnFX__Group_6__0"
    // InternalJavaFXLang.g:3738:1: rule__TableColumnFX__Group_6__0 : rule__TableColumnFX__Group_6__0__Impl rule__TableColumnFX__Group_6__1 ;
    public final void rule__TableColumnFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3742:1: ( rule__TableColumnFX__Group_6__0__Impl rule__TableColumnFX__Group_6__1 )
            // InternalJavaFXLang.g:3743:2: rule__TableColumnFX__Group_6__0__Impl rule__TableColumnFX__Group_6__1
            {
            pushFollow(FOLLOW_22);
            rule__TableColumnFX__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableColumnFX__Group_6__1();

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
    // $ANTLR end "rule__TableColumnFX__Group_6__0"


    // $ANTLR start "rule__TableColumnFX__Group_6__0__Impl"
    // InternalJavaFXLang.g:3750:1: rule__TableColumnFX__Group_6__0__Impl : ( 'useFilter:' ) ;
    public final void rule__TableColumnFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3754:1: ( ( 'useFilter:' ) )
            // InternalJavaFXLang.g:3755:1: ( 'useFilter:' )
            {
            // InternalJavaFXLang.g:3755:1: ( 'useFilter:' )
            // InternalJavaFXLang.g:3756:2: 'useFilter:'
            {
             before(grammarAccess.getTableColumnFXAccess().getUseFilterKeyword_6_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTableColumnFXAccess().getUseFilterKeyword_6_0()); 

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
    // $ANTLR end "rule__TableColumnFX__Group_6__0__Impl"


    // $ANTLR start "rule__TableColumnFX__Group_6__1"
    // InternalJavaFXLang.g:3765:1: rule__TableColumnFX__Group_6__1 : rule__TableColumnFX__Group_6__1__Impl ;
    public final void rule__TableColumnFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3769:1: ( rule__TableColumnFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:3770:2: rule__TableColumnFX__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableColumnFX__Group_6__1__Impl();

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
    // $ANTLR end "rule__TableColumnFX__Group_6__1"


    // $ANTLR start "rule__TableColumnFX__Group_6__1__Impl"
    // InternalJavaFXLang.g:3776:1: rule__TableColumnFX__Group_6__1__Impl : ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) ) ;
    public final void rule__TableColumnFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3780:1: ( ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:3781:1: ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:3781:1: ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) )
            // InternalJavaFXLang.g:3782:2: ( rule__TableColumnFX__UseFilterAssignment_6_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getUseFilterAssignment_6_1()); 
            // InternalJavaFXLang.g:3783:2: ( rule__TableColumnFX__UseFilterAssignment_6_1 )
            // InternalJavaFXLang.g:3783:3: rule__TableColumnFX__UseFilterAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__TableColumnFX__UseFilterAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTableColumnFXAccess().getUseFilterAssignment_6_1()); 

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
    // $ANTLR end "rule__TableColumnFX__Group_6__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalJavaFXLang.g:3792:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3796:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalJavaFXLang.g:3797:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalJavaFXLang.g:3804:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3808:1: ( ( ( '-' )? ) )
            // InternalJavaFXLang.g:3809:1: ( ( '-' )? )
            {
            // InternalJavaFXLang.g:3809:1: ( ( '-' )? )
            // InternalJavaFXLang.g:3810:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalJavaFXLang.g:3811:2: ( '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==52) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalJavaFXLang.g:3811:3: '-'
                    {
                    match(input,52,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalJavaFXLang.g:3819:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3823:1: ( rule__EInt__Group__1__Impl )
            // InternalJavaFXLang.g:3824:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalJavaFXLang.g:3830:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3834:1: ( ( RULE_INT ) )
            // InternalJavaFXLang.g:3835:1: ( RULE_INT )
            {
            // InternalJavaFXLang.g:3835:1: ( RULE_INT )
            // InternalJavaFXLang.g:3836:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__AttributeFX__Group__0"
    // InternalJavaFXLang.g:3846:1: rule__AttributeFX__Group__0 : rule__AttributeFX__Group__0__Impl rule__AttributeFX__Group__1 ;
    public final void rule__AttributeFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3850:1: ( rule__AttributeFX__Group__0__Impl rule__AttributeFX__Group__1 )
            // InternalJavaFXLang.g:3851:2: rule__AttributeFX__Group__0__Impl rule__AttributeFX__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AttributeFX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFX__Group__1();

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
    // $ANTLR end "rule__AttributeFX__Group__0"


    // $ANTLR start "rule__AttributeFX__Group__0__Impl"
    // InternalJavaFXLang.g:3858:1: rule__AttributeFX__Group__0__Impl : ( () ) ;
    public final void rule__AttributeFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3862:1: ( ( () ) )
            // InternalJavaFXLang.g:3863:1: ( () )
            {
            // InternalJavaFXLang.g:3863:1: ( () )
            // InternalJavaFXLang.g:3864:2: ()
            {
             before(grammarAccess.getAttributeFXAccess().getAttributeFXAction_0()); 
            // InternalJavaFXLang.g:3865:2: ()
            // InternalJavaFXLang.g:3865:3: 
            {
            }

             after(grammarAccess.getAttributeFXAccess().getAttributeFXAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFX__Group__0__Impl"


    // $ANTLR start "rule__AttributeFX__Group__1"
    // InternalJavaFXLang.g:3873:1: rule__AttributeFX__Group__1 : rule__AttributeFX__Group__1__Impl rule__AttributeFX__Group__2 ;
    public final void rule__AttributeFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3877:1: ( rule__AttributeFX__Group__1__Impl rule__AttributeFX__Group__2 )
            // InternalJavaFXLang.g:3878:2: rule__AttributeFX__Group__1__Impl rule__AttributeFX__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AttributeFX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFX__Group__2();

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
    // $ANTLR end "rule__AttributeFX__Group__1"


    // $ANTLR start "rule__AttributeFX__Group__1__Impl"
    // InternalJavaFXLang.g:3885:1: rule__AttributeFX__Group__1__Impl : ( ( rule__AttributeFX__TypeAssignment_1 ) ) ;
    public final void rule__AttributeFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3889:1: ( ( ( rule__AttributeFX__TypeAssignment_1 ) ) )
            // InternalJavaFXLang.g:3890:1: ( ( rule__AttributeFX__TypeAssignment_1 ) )
            {
            // InternalJavaFXLang.g:3890:1: ( ( rule__AttributeFX__TypeAssignment_1 ) )
            // InternalJavaFXLang.g:3891:2: ( rule__AttributeFX__TypeAssignment_1 )
            {
             before(grammarAccess.getAttributeFXAccess().getTypeAssignment_1()); 
            // InternalJavaFXLang.g:3892:2: ( rule__AttributeFX__TypeAssignment_1 )
            // InternalJavaFXLang.g:3892:3: rule__AttributeFX__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFX__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFXAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__AttributeFX__Group__1__Impl"


    // $ANTLR start "rule__AttributeFX__Group__2"
    // InternalJavaFXLang.g:3900:1: rule__AttributeFX__Group__2 : rule__AttributeFX__Group__2__Impl ;
    public final void rule__AttributeFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3904:1: ( rule__AttributeFX__Group__2__Impl )
            // InternalJavaFXLang.g:3905:2: rule__AttributeFX__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFX__Group__2__Impl();

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
    // $ANTLR end "rule__AttributeFX__Group__2"


    // $ANTLR start "rule__AttributeFX__Group__2__Impl"
    // InternalJavaFXLang.g:3911:1: rule__AttributeFX__Group__2__Impl : ( ( rule__AttributeFX__NameAssignment_2 ) ) ;
    public final void rule__AttributeFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3915:1: ( ( ( rule__AttributeFX__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:3916:1: ( ( rule__AttributeFX__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:3916:1: ( ( rule__AttributeFX__NameAssignment_2 ) )
            // InternalJavaFXLang.g:3917:2: ( rule__AttributeFX__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeFXAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:3918:2: ( rule__AttributeFX__NameAssignment_2 )
            // InternalJavaFXLang.g:3918:3: rule__AttributeFX__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFX__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFXAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__AttributeFX__Group__2__Impl"


    // $ANTLR start "rule__ProjectFX__NameAssignment_2"
    // InternalJavaFXLang.g:3927:1: rule__ProjectFX__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ProjectFX__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3931:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:3932:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:3932:2: ( ruleEString )
            // InternalJavaFXLang.g:3933:3: ruleEString
            {
             before(grammarAccess.getProjectFXAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProjectFXAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ProjectFX__NameAssignment_2"


    // $ANTLR start "rule__ProjectFX__PackagePathAssignment_4_1"
    // InternalJavaFXLang.g:3942:1: rule__ProjectFX__PackagePathAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ProjectFX__PackagePathAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3946:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:3947:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:3947:2: ( ruleEString )
            // InternalJavaFXLang.g:3948:3: ruleEString
            {
             before(grammarAccess.getProjectFXAccess().getPackagePathEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProjectFXAccess().getPackagePathEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ProjectFX__PackagePathAssignment_4_1"


    // $ANTLR start "rule__ProjectFX__ControlsAssignment_5_2"
    // InternalJavaFXLang.g:3957:1: rule__ProjectFX__ControlsAssignment_5_2 : ( ruleControlFX ) ;
    public final void rule__ProjectFX__ControlsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3961:1: ( ( ruleControlFX ) )
            // InternalJavaFXLang.g:3962:2: ( ruleControlFX )
            {
            // InternalJavaFXLang.g:3962:2: ( ruleControlFX )
            // InternalJavaFXLang.g:3963:3: ruleControlFX
            {
             before(grammarAccess.getProjectFXAccess().getControlsControlFXParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleControlFX();

            state._fsp--;

             after(grammarAccess.getProjectFXAccess().getControlsControlFXParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__ProjectFX__ControlsAssignment_5_2"


    // $ANTLR start "rule__ProjectFX__ControlsAssignment_5_3"
    // InternalJavaFXLang.g:3972:1: rule__ProjectFX__ControlsAssignment_5_3 : ( ruleControlFX ) ;
    public final void rule__ProjectFX__ControlsAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3976:1: ( ( ruleControlFX ) )
            // InternalJavaFXLang.g:3977:2: ( ruleControlFX )
            {
            // InternalJavaFXLang.g:3977:2: ( ruleControlFX )
            // InternalJavaFXLang.g:3978:3: ruleControlFX
            {
             before(grammarAccess.getProjectFXAccess().getControlsControlFXParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleControlFX();

            state._fsp--;

             after(grammarAccess.getProjectFXAccess().getControlsControlFXParserRuleCall_5_3_0()); 

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
    // $ANTLR end "rule__ProjectFX__ControlsAssignment_5_3"


    // $ANTLR start "rule__ProjectFX__ModelsAssignment_6_2"
    // InternalJavaFXLang.g:3987:1: rule__ProjectFX__ModelsAssignment_6_2 : ( ruleModelFX ) ;
    public final void rule__ProjectFX__ModelsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3991:1: ( ( ruleModelFX ) )
            // InternalJavaFXLang.g:3992:2: ( ruleModelFX )
            {
            // InternalJavaFXLang.g:3992:2: ( ruleModelFX )
            // InternalJavaFXLang.g:3993:3: ruleModelFX
            {
             before(grammarAccess.getProjectFXAccess().getModelsModelFXParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleModelFX();

            state._fsp--;

             after(grammarAccess.getProjectFXAccess().getModelsModelFXParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__ProjectFX__ModelsAssignment_6_2"


    // $ANTLR start "rule__ProjectFX__ModelsAssignment_6_3"
    // InternalJavaFXLang.g:4002:1: rule__ProjectFX__ModelsAssignment_6_3 : ( ruleModelFX ) ;
    public final void rule__ProjectFX__ModelsAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4006:1: ( ( ruleModelFX ) )
            // InternalJavaFXLang.g:4007:2: ( ruleModelFX )
            {
            // InternalJavaFXLang.g:4007:2: ( ruleModelFX )
            // InternalJavaFXLang.g:4008:3: ruleModelFX
            {
             before(grammarAccess.getProjectFXAccess().getModelsModelFXParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_2);
            ruleModelFX();

            state._fsp--;

             after(grammarAccess.getProjectFXAccess().getModelsModelFXParserRuleCall_6_3_0()); 

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
    // $ANTLR end "rule__ProjectFX__ModelsAssignment_6_3"


    // $ANTLR start "rule__ProjectFX__BindingsAssignment_7_2"
    // InternalJavaFXLang.g:4017:1: rule__ProjectFX__BindingsAssignment_7_2 : ( ruleBinding ) ;
    public final void rule__ProjectFX__BindingsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4021:1: ( ( ruleBinding ) )
            // InternalJavaFXLang.g:4022:2: ( ruleBinding )
            {
            // InternalJavaFXLang.g:4022:2: ( ruleBinding )
            // InternalJavaFXLang.g:4023:3: ruleBinding
            {
             before(grammarAccess.getProjectFXAccess().getBindingsBindingParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getProjectFXAccess().getBindingsBindingParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__ProjectFX__BindingsAssignment_7_2"


    // $ANTLR start "rule__ProjectFX__BindingsAssignment_7_3"
    // InternalJavaFXLang.g:4032:1: rule__ProjectFX__BindingsAssignment_7_3 : ( ruleBinding ) ;
    public final void rule__ProjectFX__BindingsAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4036:1: ( ( ruleBinding ) )
            // InternalJavaFXLang.g:4037:2: ( ruleBinding )
            {
            // InternalJavaFXLang.g:4037:2: ( ruleBinding )
            // InternalJavaFXLang.g:4038:3: ruleBinding
            {
             before(grammarAccess.getProjectFXAccess().getBindingsBindingParserRuleCall_7_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getProjectFXAccess().getBindingsBindingParserRuleCall_7_3_0()); 

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
    // $ANTLR end "rule__ProjectFX__BindingsAssignment_7_3"


    // $ANTLR start "rule__ProjectFX__ChartsAssignment_8_2"
    // InternalJavaFXLang.g:4047:1: rule__ProjectFX__ChartsAssignment_8_2 : ( ruleChartFX ) ;
    public final void rule__ProjectFX__ChartsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4051:1: ( ( ruleChartFX ) )
            // InternalJavaFXLang.g:4052:2: ( ruleChartFX )
            {
            // InternalJavaFXLang.g:4052:2: ( ruleChartFX )
            // InternalJavaFXLang.g:4053:3: ruleChartFX
            {
             before(grammarAccess.getProjectFXAccess().getChartsChartFXParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleChartFX();

            state._fsp--;

             after(grammarAccess.getProjectFXAccess().getChartsChartFXParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__ProjectFX__ChartsAssignment_8_2"


    // $ANTLR start "rule__ProjectFX__ChartsAssignment_8_3"
    // InternalJavaFXLang.g:4062:1: rule__ProjectFX__ChartsAssignment_8_3 : ( ruleChartFX ) ;
    public final void rule__ProjectFX__ChartsAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4066:1: ( ( ruleChartFX ) )
            // InternalJavaFXLang.g:4067:2: ( ruleChartFX )
            {
            // InternalJavaFXLang.g:4067:2: ( ruleChartFX )
            // InternalJavaFXLang.g:4068:3: ruleChartFX
            {
             before(grammarAccess.getProjectFXAccess().getChartsChartFXParserRuleCall_8_3_0()); 
            pushFollow(FOLLOW_2);
            ruleChartFX();

            state._fsp--;

             after(grammarAccess.getProjectFXAccess().getChartsChartFXParserRuleCall_8_3_0()); 

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
    // $ANTLR end "rule__ProjectFX__ChartsAssignment_8_3"


    // $ANTLR start "rule__LineChartFX__NameAssignment_4"
    // InternalJavaFXLang.g:4077:1: rule__LineChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__LineChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4081:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4082:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4082:2: ( ruleEString )
            // InternalJavaFXLang.g:4083:3: ruleEString
            {
             before(grammarAccess.getLineChartFXAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineChartFXAccess().getNameEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__LineChartFX__NameAssignment_4"


    // $ANTLR start "rule__LineChartFX__LegendSideAssignment_5_1"
    // InternalJavaFXLang.g:4092:1: rule__LineChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__LineChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4096:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:4097:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:4097:2: ( ruleOrientation )
            // InternalJavaFXLang.g:4098:3: ruleOrientation
            {
             before(grammarAccess.getLineChartFXAccess().getLegendSideOrientationEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrientation();

            state._fsp--;

             after(grammarAccess.getLineChartFXAccess().getLegendSideOrientationEnumRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__LineChartFX__LegendSideAssignment_5_1"


    // $ANTLR start "rule__LineChartFX__ShowLegendAssignment_6_1"
    // InternalJavaFXLang.g:4107:1: rule__LineChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__LineChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4111:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:4112:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:4112:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:4113:3: ruleEBoolean
            {
             before(grammarAccess.getLineChartFXAccess().getShowLegendEBooleanParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getLineChartFXAccess().getShowLegendEBooleanParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__LineChartFX__ShowLegendAssignment_6_1"


    // $ANTLR start "rule__LineChartFX__TitleAssignment_7_1"
    // InternalJavaFXLang.g:4122:1: rule__LineChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__LineChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4126:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4127:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4127:2: ( ruleEString )
            // InternalJavaFXLang.g:4128:3: ruleEString
            {
             before(grammarAccess.getLineChartFXAccess().getTitleEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineChartFXAccess().getTitleEStringParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__LineChartFX__TitleAssignment_7_1"


    // $ANTLR start "rule__LineChartFX__TitleSideAssignment_8_1"
    // InternalJavaFXLang.g:4137:1: rule__LineChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__LineChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4141:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:4142:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:4142:2: ( ruleOrientation )
            // InternalJavaFXLang.g:4143:3: ruleOrientation
            {
             before(grammarAccess.getLineChartFXAccess().getTitleSideOrientationEnumRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrientation();

            state._fsp--;

             after(grammarAccess.getLineChartFXAccess().getTitleSideOrientationEnumRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__LineChartFX__TitleSideAssignment_8_1"


    // $ANTLR start "rule__LineChartFX__XAxisLabelAssignment_9_1"
    // InternalJavaFXLang.g:4152:1: rule__LineChartFX__XAxisLabelAssignment_9_1 : ( ruleEString ) ;
    public final void rule__LineChartFX__XAxisLabelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4156:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4157:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4157:2: ( ruleEString )
            // InternalJavaFXLang.g:4158:3: ruleEString
            {
             before(grammarAccess.getLineChartFXAccess().getXAxisLabelEStringParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineChartFXAccess().getXAxisLabelEStringParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__LineChartFX__XAxisLabelAssignment_9_1"


    // $ANTLR start "rule__LineChartFX__YAxisLabelAssignment_10_1"
    // InternalJavaFXLang.g:4167:1: rule__LineChartFX__YAxisLabelAssignment_10_1 : ( ruleEString ) ;
    public final void rule__LineChartFX__YAxisLabelAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4171:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4172:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4172:2: ( ruleEString )
            // InternalJavaFXLang.g:4173:3: ruleEString
            {
             before(grammarAccess.getLineChartFXAccess().getYAxisLabelEStringParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineChartFXAccess().getYAxisLabelEStringParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__LineChartFX__YAxisLabelAssignment_10_1"


    // $ANTLR start "rule__Binding__NameAssignment_2"
    // InternalJavaFXLang.g:4182:1: rule__Binding__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Binding__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4186:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4187:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4187:2: ( ruleEString )
            // InternalJavaFXLang.g:4188:3: ruleEString
            {
             before(grammarAccess.getBindingAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Binding__NameAssignment_2"


    // $ANTLR start "rule__Binding__PropertyAssignment_4_0"
    // InternalJavaFXLang.g:4197:1: rule__Binding__PropertyAssignment_4_0 : ( ruleBindingProperty ) ;
    public final void rule__Binding__PropertyAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4201:1: ( ( ruleBindingProperty ) )
            // InternalJavaFXLang.g:4202:2: ( ruleBindingProperty )
            {
            // InternalJavaFXLang.g:4202:2: ( ruleBindingProperty )
            // InternalJavaFXLang.g:4203:3: ruleBindingProperty
            {
             before(grammarAccess.getBindingAccess().getPropertyBindingPropertyParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBindingProperty();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getPropertyBindingPropertyParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Binding__PropertyAssignment_4_0"


    // $ANTLR start "rule__Binding__PropertyAssignment_4_1"
    // InternalJavaFXLang.g:4212:1: rule__Binding__PropertyAssignment_4_1 : ( ruleBindingProperty ) ;
    public final void rule__Binding__PropertyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4216:1: ( ( ruleBindingProperty ) )
            // InternalJavaFXLang.g:4217:2: ( ruleBindingProperty )
            {
            // InternalJavaFXLang.g:4217:2: ( ruleBindingProperty )
            // InternalJavaFXLang.g:4218:3: ruleBindingProperty
            {
             before(grammarAccess.getBindingAccess().getPropertyBindingPropertyParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBindingProperty();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getPropertyBindingPropertyParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Binding__PropertyAssignment_4_1"


    // $ANTLR start "rule__BindingProperty__TypeAssignment_1"
    // InternalJavaFXLang.g:4227:1: rule__BindingProperty__TypeAssignment_1 : ( ruleBindinType ) ;
    public final void rule__BindingProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4231:1: ( ( ruleBindinType ) )
            // InternalJavaFXLang.g:4232:2: ( ruleBindinType )
            {
            // InternalJavaFXLang.g:4232:2: ( ruleBindinType )
            // InternalJavaFXLang.g:4233:3: ruleBindinType
            {
             before(grammarAccess.getBindingPropertyAccess().getTypeBindinTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBindinType();

            state._fsp--;

             after(grammarAccess.getBindingPropertyAccess().getTypeBindinTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__BindingProperty__TypeAssignment_1"


    // $ANTLR start "rule__BindingProperty__NameAssignment_2"
    // InternalJavaFXLang.g:4242:1: rule__BindingProperty__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BindingProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4246:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4247:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4247:2: ( ruleEString )
            // InternalJavaFXLang.g:4248:3: ruleEString
            {
             before(grammarAccess.getBindingPropertyAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBindingPropertyAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__BindingProperty__NameAssignment_2"


    // $ANTLR start "rule__DerivedBean__NameAssignment_2"
    // InternalJavaFXLang.g:4257:1: rule__DerivedBean__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DerivedBean__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4261:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4262:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4262:2: ( ruleEString )
            // InternalJavaFXLang.g:4263:3: ruleEString
            {
             before(grammarAccess.getDerivedBeanAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDerivedBeanAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DerivedBean__NameAssignment_2"


    // $ANTLR start "rule__DerivedBean__InstanceTypeAssignment_4_1"
    // InternalJavaFXLang.g:4272:1: rule__DerivedBean__InstanceTypeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__DerivedBean__InstanceTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4276:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4277:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4277:2: ( ruleEString )
            // InternalJavaFXLang.g:4278:3: ruleEString
            {
             before(grammarAccess.getDerivedBeanAccess().getInstanceTypeEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDerivedBeanAccess().getInstanceTypeEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__DerivedBean__InstanceTypeAssignment_4_1"


    // $ANTLR start "rule__DerivedBean__AttributesAssignment_5_0"
    // InternalJavaFXLang.g:4287:1: rule__DerivedBean__AttributesAssignment_5_0 : ( ruleAttributeFX ) ;
    public final void rule__DerivedBean__AttributesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4291:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:4292:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:4292:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:4293:3: ruleAttributeFX
            {
             before(grammarAccess.getDerivedBeanAccess().getAttributesAttributeFXParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeFX();

            state._fsp--;

             after(grammarAccess.getDerivedBeanAccess().getAttributesAttributeFXParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__DerivedBean__AttributesAssignment_5_0"


    // $ANTLR start "rule__DerivedBean__AttributesAssignment_5_1"
    // InternalJavaFXLang.g:4302:1: rule__DerivedBean__AttributesAssignment_5_1 : ( ruleAttributeFX ) ;
    public final void rule__DerivedBean__AttributesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4306:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:4307:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:4307:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:4308:3: ruleAttributeFX
            {
             before(grammarAccess.getDerivedBeanAccess().getAttributesAttributeFXParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeFX();

            state._fsp--;

             after(grammarAccess.getDerivedBeanAccess().getAttributesAttributeFXParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__DerivedBean__AttributesAssignment_5_1"


    // $ANTLR start "rule__Bean__NameAssignment_2"
    // InternalJavaFXLang.g:4317:1: rule__Bean__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Bean__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4321:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4322:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4322:2: ( ruleEString )
            // InternalJavaFXLang.g:4323:3: ruleEString
            {
             before(grammarAccess.getBeanAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBeanAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Bean__NameAssignment_2"


    // $ANTLR start "rule__Bean__AttributesAssignment_4_0"
    // InternalJavaFXLang.g:4332:1: rule__Bean__AttributesAssignment_4_0 : ( ruleAttributeFX ) ;
    public final void rule__Bean__AttributesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4336:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:4337:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:4337:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:4338:3: ruleAttributeFX
            {
             before(grammarAccess.getBeanAccess().getAttributesAttributeFXParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeFX();

            state._fsp--;

             after(grammarAccess.getBeanAccess().getAttributesAttributeFXParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Bean__AttributesAssignment_4_0"


    // $ANTLR start "rule__Bean__AttributesAssignment_4_1"
    // InternalJavaFXLang.g:4347:1: rule__Bean__AttributesAssignment_4_1 : ( ruleAttributeFX ) ;
    public final void rule__Bean__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4351:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:4352:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:4352:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:4353:3: ruleAttributeFX
            {
             before(grammarAccess.getBeanAccess().getAttributesAttributeFXParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeFX();

            state._fsp--;

             after(grammarAccess.getBeanAccess().getAttributesAttributeFXParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Bean__AttributesAssignment_4_1"


    // $ANTLR start "rule__TableViewFX__NameAssignment_3_1"
    // InternalJavaFXLang.g:4362:1: rule__TableViewFX__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__TableViewFX__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4366:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4367:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4367:2: ( ruleEString )
            // InternalJavaFXLang.g:4368:3: ruleEString
            {
             before(grammarAccess.getTableViewFXAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableViewFXAccess().getNameEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__TableViewFX__NameAssignment_3_1"


    // $ANTLR start "rule__TableViewFX__UsedModelAssignment_4_1"
    // InternalJavaFXLang.g:4377:1: rule__TableViewFX__UsedModelAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__TableViewFX__UsedModelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4381:1: ( ( ( ruleEString ) ) )
            // InternalJavaFXLang.g:4382:2: ( ( ruleEString ) )
            {
            // InternalJavaFXLang.g:4382:2: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4383:3: ( ruleEString )
            {
             before(grammarAccess.getTableViewFXAccess().getUsedModelModelFXCrossReference_4_1_0()); 
            // InternalJavaFXLang.g:4384:3: ( ruleEString )
            // InternalJavaFXLang.g:4385:4: ruleEString
            {
             before(grammarAccess.getTableViewFXAccess().getUsedModelModelFXEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableViewFXAccess().getUsedModelModelFXEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getTableViewFXAccess().getUsedModelModelFXCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__TableViewFX__UsedModelAssignment_4_1"


    // $ANTLR start "rule__TableViewFX__UseFilterAssignment_5_1"
    // InternalJavaFXLang.g:4396:1: rule__TableViewFX__UseFilterAssignment_5_1 : ( ruleEBoolean ) ;
    public final void rule__TableViewFX__UseFilterAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4400:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:4401:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:4401:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:4402:3: ruleEBoolean
            {
             before(grammarAccess.getTableViewFXAccess().getUseFilterEBooleanParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getTableViewFXAccess().getUseFilterEBooleanParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__TableViewFX__UseFilterAssignment_5_1"


    // $ANTLR start "rule__TableViewFX__ColumnsAssignment_6_0"
    // InternalJavaFXLang.g:4411:1: rule__TableViewFX__ColumnsAssignment_6_0 : ( ruleTableColumnFX ) ;
    public final void rule__TableViewFX__ColumnsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4415:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:4416:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:4416:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:4417:3: ruleTableColumnFX
            {
             before(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTableColumnFX();

            state._fsp--;

             after(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__TableViewFX__ColumnsAssignment_6_0"


    // $ANTLR start "rule__TableViewFX__ColumnsAssignment_6_1"
    // InternalJavaFXLang.g:4426:1: rule__TableViewFX__ColumnsAssignment_6_1 : ( ruleTableColumnFX ) ;
    public final void rule__TableViewFX__ColumnsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4430:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:4431:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:4431:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:4432:3: ruleTableColumnFX
            {
             before(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTableColumnFX();

            state._fsp--;

             after(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__TableViewFX__ColumnsAssignment_6_1"


    // $ANTLR start "rule__TableColumnFX__NameAssignment_3_1"
    // InternalJavaFXLang.g:4441:1: rule__TableColumnFX__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__TableColumnFX__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4445:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4446:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4446:2: ( ruleEString )
            // InternalJavaFXLang.g:4447:3: ruleEString
            {
             before(grammarAccess.getTableColumnFXAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableColumnFXAccess().getNameEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__TableColumnFX__NameAssignment_3_1"


    // $ANTLR start "rule__TableColumnFX__WidthAssignment_4_1"
    // InternalJavaFXLang.g:4456:1: rule__TableColumnFX__WidthAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__TableColumnFX__WidthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4460:1: ( ( ruleEInt ) )
            // InternalJavaFXLang.g:4461:2: ( ruleEInt )
            {
            // InternalJavaFXLang.g:4461:2: ( ruleEInt )
            // InternalJavaFXLang.g:4462:3: ruleEInt
            {
             before(grammarAccess.getTableColumnFXAccess().getWidthEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTableColumnFXAccess().getWidthEIntParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__TableColumnFX__WidthAssignment_4_1"


    // $ANTLR start "rule__TableColumnFX__UsedAttributeAssignment_5_1"
    // InternalJavaFXLang.g:4471:1: rule__TableColumnFX__UsedAttributeAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__TableColumnFX__UsedAttributeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4475:1: ( ( ( ruleEString ) ) )
            // InternalJavaFXLang.g:4476:2: ( ( ruleEString ) )
            {
            // InternalJavaFXLang.g:4476:2: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4477:3: ( ruleEString )
            {
             before(grammarAccess.getTableColumnFXAccess().getUsedAttributeAttributeFXCrossReference_5_1_0()); 
            // InternalJavaFXLang.g:4478:3: ( ruleEString )
            // InternalJavaFXLang.g:4479:4: ruleEString
            {
             before(grammarAccess.getTableColumnFXAccess().getUsedAttributeAttributeFXEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableColumnFXAccess().getUsedAttributeAttributeFXEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getTableColumnFXAccess().getUsedAttributeAttributeFXCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__TableColumnFX__UsedAttributeAssignment_5_1"


    // $ANTLR start "rule__TableColumnFX__UseFilterAssignment_6_1"
    // InternalJavaFXLang.g:4490:1: rule__TableColumnFX__UseFilterAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__TableColumnFX__UseFilterAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4494:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:4495:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:4495:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:4496:3: ruleEBoolean
            {
             before(grammarAccess.getTableColumnFXAccess().getUseFilterEBooleanParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getTableColumnFXAccess().getUseFilterEBooleanParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__TableColumnFX__UseFilterAssignment_6_1"


    // $ANTLR start "rule__AttributeFX__TypeAssignment_1"
    // InternalJavaFXLang.g:4505:1: rule__AttributeFX__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__AttributeFX__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4509:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4510:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4510:2: ( ruleEString )
            // InternalJavaFXLang.g:4511:3: ruleEString
            {
             before(grammarAccess.getAttributeFXAccess().getTypeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeFXAccess().getTypeEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AttributeFX__TypeAssignment_1"


    // $ANTLR start "rule__AttributeFX__NameAssignment_2"
    // InternalJavaFXLang.g:4520:1: rule__AttributeFX__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__AttributeFX__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4524:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4525:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4525:2: ( ruleEString )
            // InternalJavaFXLang.g:4526:3: ruleEString
            {
             before(grammarAccess.getAttributeFXAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeFXAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AttributeFX__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000FC000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000080004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000020004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000010004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000FC04000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004FE0000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000FE0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000FE0002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000700004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000F000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0010000000000040L});

}