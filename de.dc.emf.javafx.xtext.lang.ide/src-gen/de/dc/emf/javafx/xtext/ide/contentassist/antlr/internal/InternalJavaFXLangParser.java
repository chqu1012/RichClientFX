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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Category'", "'Number'", "'Bottom'", "'Left'", "'Right'", "'Top'", "'BooleanProperty'", "'DoubleProperty'", "'FloatProperty'", "'IntegerProperty'", "'ObservableList'", "'ObjectProperty'", "'StringProperty'", "'ProjectFX'", "'{'", "'}'", "'packagePath'", "'controls'", "'models'", "'bindings'", "'charts'", "'LineChart'", "'name:'", "'legendSide:'", "'showLegend:'", "'title:'", "'titleSide:'", "'xAxisLabel:'", "'xAxisType:'", "'yAxisLabel:'", "'yAxisType:'", "'binding'", "'FilteredTableView'", "'usedModel:'", "'usedFilter:'", "'class'", "'instanceType:'", "'TableView'", "'Column'", "'('", "')'", "'width:'", "'attribute:'", "'useFilter:'", "'-'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
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
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    // InternalJavaFXLang.g:187:1: ruleControlFX : ( ( rule__ControlFX__Alternatives ) ) ;
    public final void ruleControlFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:191:2: ( ( ( rule__ControlFX__Alternatives ) ) )
            // InternalJavaFXLang.g:192:2: ( ( rule__ControlFX__Alternatives ) )
            {
            // InternalJavaFXLang.g:192:2: ( ( rule__ControlFX__Alternatives ) )
            // InternalJavaFXLang.g:193:3: ( rule__ControlFX__Alternatives )
            {
             before(grammarAccess.getControlFXAccess().getAlternatives()); 
            // InternalJavaFXLang.g:194:3: ( rule__ControlFX__Alternatives )
            // InternalJavaFXLang.g:194:4: rule__ControlFX__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ControlFX__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getControlFXAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleFilteredTableViewFX"
    // InternalJavaFXLang.g:203:1: entryRuleFilteredTableViewFX : ruleFilteredTableViewFX EOF ;
    public final void entryRuleFilteredTableViewFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:204:1: ( ruleFilteredTableViewFX EOF )
            // InternalJavaFXLang.g:205:1: ruleFilteredTableViewFX EOF
            {
             before(grammarAccess.getFilteredTableViewFXRule()); 
            pushFollow(FOLLOW_1);
            ruleFilteredTableViewFX();

            state._fsp--;

             after(grammarAccess.getFilteredTableViewFXRule()); 
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
    // $ANTLR end "entryRuleFilteredTableViewFX"


    // $ANTLR start "ruleFilteredTableViewFX"
    // InternalJavaFXLang.g:212:1: ruleFilteredTableViewFX : ( ( rule__FilteredTableViewFX__Group__0 ) ) ;
    public final void ruleFilteredTableViewFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:216:2: ( ( ( rule__FilteredTableViewFX__Group__0 ) ) )
            // InternalJavaFXLang.g:217:2: ( ( rule__FilteredTableViewFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:217:2: ( ( rule__FilteredTableViewFX__Group__0 ) )
            // InternalJavaFXLang.g:218:3: ( rule__FilteredTableViewFX__Group__0 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup()); 
            // InternalJavaFXLang.g:219:3: ( rule__FilteredTableViewFX__Group__0 )
            // InternalJavaFXLang.g:219:4: rule__FilteredTableViewFX__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilteredTableViewFXAccess().getGroup()); 

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
    // $ANTLR end "ruleFilteredTableViewFX"


    // $ANTLR start "entryRuleEString"
    // InternalJavaFXLang.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:229:1: ( ruleEString EOF )
            // InternalJavaFXLang.g:230:1: ruleEString EOF
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
    // InternalJavaFXLang.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalJavaFXLang.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalJavaFXLang.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalJavaFXLang.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalJavaFXLang.g:244:3: ( rule__EString__Alternatives )
            // InternalJavaFXLang.g:244:4: rule__EString__Alternatives
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
    // InternalJavaFXLang.g:253:1: entryRuleModelFX : ruleModelFX EOF ;
    public final void entryRuleModelFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:254:1: ( ruleModelFX EOF )
            // InternalJavaFXLang.g:255:1: ruleModelFX EOF
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
    // InternalJavaFXLang.g:262:1: ruleModelFX : ( ( rule__ModelFX__Alternatives ) ) ;
    public final void ruleModelFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:266:2: ( ( ( rule__ModelFX__Alternatives ) ) )
            // InternalJavaFXLang.g:267:2: ( ( rule__ModelFX__Alternatives ) )
            {
            // InternalJavaFXLang.g:267:2: ( ( rule__ModelFX__Alternatives ) )
            // InternalJavaFXLang.g:268:3: ( rule__ModelFX__Alternatives )
            {
             before(grammarAccess.getModelFXAccess().getAlternatives()); 
            // InternalJavaFXLang.g:269:3: ( rule__ModelFX__Alternatives )
            // InternalJavaFXLang.g:269:4: rule__ModelFX__Alternatives
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
    // InternalJavaFXLang.g:278:1: entryRuleDerivedBean : ruleDerivedBean EOF ;
    public final void entryRuleDerivedBean() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:279:1: ( ruleDerivedBean EOF )
            // InternalJavaFXLang.g:280:1: ruleDerivedBean EOF
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
    // InternalJavaFXLang.g:287:1: ruleDerivedBean : ( ( rule__DerivedBean__Group__0 ) ) ;
    public final void ruleDerivedBean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:291:2: ( ( ( rule__DerivedBean__Group__0 ) ) )
            // InternalJavaFXLang.g:292:2: ( ( rule__DerivedBean__Group__0 ) )
            {
            // InternalJavaFXLang.g:292:2: ( ( rule__DerivedBean__Group__0 ) )
            // InternalJavaFXLang.g:293:3: ( rule__DerivedBean__Group__0 )
            {
             before(grammarAccess.getDerivedBeanAccess().getGroup()); 
            // InternalJavaFXLang.g:294:3: ( rule__DerivedBean__Group__0 )
            // InternalJavaFXLang.g:294:4: rule__DerivedBean__Group__0
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
    // InternalJavaFXLang.g:303:1: entryRuleBean : ruleBean EOF ;
    public final void entryRuleBean() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:304:1: ( ruleBean EOF )
            // InternalJavaFXLang.g:305:1: ruleBean EOF
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
    // InternalJavaFXLang.g:312:1: ruleBean : ( ( rule__Bean__Group__0 ) ) ;
    public final void ruleBean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:316:2: ( ( ( rule__Bean__Group__0 ) ) )
            // InternalJavaFXLang.g:317:2: ( ( rule__Bean__Group__0 ) )
            {
            // InternalJavaFXLang.g:317:2: ( ( rule__Bean__Group__0 ) )
            // InternalJavaFXLang.g:318:3: ( rule__Bean__Group__0 )
            {
             before(grammarAccess.getBeanAccess().getGroup()); 
            // InternalJavaFXLang.g:319:3: ( rule__Bean__Group__0 )
            // InternalJavaFXLang.g:319:4: rule__Bean__Group__0
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
    // InternalJavaFXLang.g:328:1: entryRuleTableViewFX : ruleTableViewFX EOF ;
    public final void entryRuleTableViewFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:329:1: ( ruleTableViewFX EOF )
            // InternalJavaFXLang.g:330:1: ruleTableViewFX EOF
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
    // InternalJavaFXLang.g:337:1: ruleTableViewFX : ( ( rule__TableViewFX__Group__0 ) ) ;
    public final void ruleTableViewFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:341:2: ( ( ( rule__TableViewFX__Group__0 ) ) )
            // InternalJavaFXLang.g:342:2: ( ( rule__TableViewFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:342:2: ( ( rule__TableViewFX__Group__0 ) )
            // InternalJavaFXLang.g:343:3: ( rule__TableViewFX__Group__0 )
            {
             before(grammarAccess.getTableViewFXAccess().getGroup()); 
            // InternalJavaFXLang.g:344:3: ( rule__TableViewFX__Group__0 )
            // InternalJavaFXLang.g:344:4: rule__TableViewFX__Group__0
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
    // InternalJavaFXLang.g:353:1: entryRuleTableColumnFX : ruleTableColumnFX EOF ;
    public final void entryRuleTableColumnFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:354:1: ( ruleTableColumnFX EOF )
            // InternalJavaFXLang.g:355:1: ruleTableColumnFX EOF
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
    // InternalJavaFXLang.g:362:1: ruleTableColumnFX : ( ( rule__TableColumnFX__Group__0 ) ) ;
    public final void ruleTableColumnFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:366:2: ( ( ( rule__TableColumnFX__Group__0 ) ) )
            // InternalJavaFXLang.g:367:2: ( ( rule__TableColumnFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:367:2: ( ( rule__TableColumnFX__Group__0 ) )
            // InternalJavaFXLang.g:368:3: ( rule__TableColumnFX__Group__0 )
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup()); 
            // InternalJavaFXLang.g:369:3: ( rule__TableColumnFX__Group__0 )
            // InternalJavaFXLang.g:369:4: rule__TableColumnFX__Group__0
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
    // InternalJavaFXLang.g:378:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:379:1: ( ruleEBoolean EOF )
            // InternalJavaFXLang.g:380:1: ruleEBoolean EOF
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
    // InternalJavaFXLang.g:387:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:391:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalJavaFXLang.g:392:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalJavaFXLang.g:392:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalJavaFXLang.g:393:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalJavaFXLang.g:394:3: ( rule__EBoolean__Alternatives )
            // InternalJavaFXLang.g:394:4: rule__EBoolean__Alternatives
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
    // InternalJavaFXLang.g:403:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:404:1: ( ruleEInt EOF )
            // InternalJavaFXLang.g:405:1: ruleEInt EOF
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
    // InternalJavaFXLang.g:412:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:416:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalJavaFXLang.g:417:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalJavaFXLang.g:417:2: ( ( rule__EInt__Group__0 ) )
            // InternalJavaFXLang.g:418:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalJavaFXLang.g:419:3: ( rule__EInt__Group__0 )
            // InternalJavaFXLang.g:419:4: rule__EInt__Group__0
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
    // InternalJavaFXLang.g:428:1: entryRuleAttributeFX : ruleAttributeFX EOF ;
    public final void entryRuleAttributeFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:429:1: ( ruleAttributeFX EOF )
            // InternalJavaFXLang.g:430:1: ruleAttributeFX EOF
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
    // InternalJavaFXLang.g:437:1: ruleAttributeFX : ( ( rule__AttributeFX__Group__0 ) ) ;
    public final void ruleAttributeFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:441:2: ( ( ( rule__AttributeFX__Group__0 ) ) )
            // InternalJavaFXLang.g:442:2: ( ( rule__AttributeFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:442:2: ( ( rule__AttributeFX__Group__0 ) )
            // InternalJavaFXLang.g:443:3: ( rule__AttributeFX__Group__0 )
            {
             before(grammarAccess.getAttributeFXAccess().getGroup()); 
            // InternalJavaFXLang.g:444:3: ( rule__AttributeFX__Group__0 )
            // InternalJavaFXLang.g:444:4: rule__AttributeFX__Group__0
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


    // $ANTLR start "ruleAxisType"
    // InternalJavaFXLang.g:453:1: ruleAxisType : ( ( rule__AxisType__Alternatives ) ) ;
    public final void ruleAxisType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:457:1: ( ( ( rule__AxisType__Alternatives ) ) )
            // InternalJavaFXLang.g:458:2: ( ( rule__AxisType__Alternatives ) )
            {
            // InternalJavaFXLang.g:458:2: ( ( rule__AxisType__Alternatives ) )
            // InternalJavaFXLang.g:459:3: ( rule__AxisType__Alternatives )
            {
             before(grammarAccess.getAxisTypeAccess().getAlternatives()); 
            // InternalJavaFXLang.g:460:3: ( rule__AxisType__Alternatives )
            // InternalJavaFXLang.g:460:4: rule__AxisType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AxisType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAxisTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAxisType"


    // $ANTLR start "ruleOrientation"
    // InternalJavaFXLang.g:469:1: ruleOrientation : ( ( rule__Orientation__Alternatives ) ) ;
    public final void ruleOrientation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:473:1: ( ( ( rule__Orientation__Alternatives ) ) )
            // InternalJavaFXLang.g:474:2: ( ( rule__Orientation__Alternatives ) )
            {
            // InternalJavaFXLang.g:474:2: ( ( rule__Orientation__Alternatives ) )
            // InternalJavaFXLang.g:475:3: ( rule__Orientation__Alternatives )
            {
             before(grammarAccess.getOrientationAccess().getAlternatives()); 
            // InternalJavaFXLang.g:476:3: ( rule__Orientation__Alternatives )
            // InternalJavaFXLang.g:476:4: rule__Orientation__Alternatives
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
    // InternalJavaFXLang.g:485:1: ruleBindinType : ( ( rule__BindinType__Alternatives ) ) ;
    public final void ruleBindinType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:489:1: ( ( ( rule__BindinType__Alternatives ) ) )
            // InternalJavaFXLang.g:490:2: ( ( rule__BindinType__Alternatives ) )
            {
            // InternalJavaFXLang.g:490:2: ( ( rule__BindinType__Alternatives ) )
            // InternalJavaFXLang.g:491:3: ( rule__BindinType__Alternatives )
            {
             before(grammarAccess.getBindinTypeAccess().getAlternatives()); 
            // InternalJavaFXLang.g:492:3: ( rule__BindinType__Alternatives )
            // InternalJavaFXLang.g:492:4: rule__BindinType__Alternatives
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


    // $ANTLR start "rule__ControlFX__Alternatives"
    // InternalJavaFXLang.g:500:1: rule__ControlFX__Alternatives : ( ( ruleTableViewFX ) | ( ruleFilteredTableViewFX ) );
    public final void rule__ControlFX__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:504:1: ( ( ruleTableViewFX ) | ( ruleFilteredTableViewFX ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==50) ) {
                alt1=1;
            }
            else if ( (LA1_0==45) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalJavaFXLang.g:505:2: ( ruleTableViewFX )
                    {
                    // InternalJavaFXLang.g:505:2: ( ruleTableViewFX )
                    // InternalJavaFXLang.g:506:3: ruleTableViewFX
                    {
                     before(grammarAccess.getControlFXAccess().getTableViewFXParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTableViewFX();

                    state._fsp--;

                     after(grammarAccess.getControlFXAccess().getTableViewFXParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:511:2: ( ruleFilteredTableViewFX )
                    {
                    // InternalJavaFXLang.g:511:2: ( ruleFilteredTableViewFX )
                    // InternalJavaFXLang.g:512:3: ruleFilteredTableViewFX
                    {
                     before(grammarAccess.getControlFXAccess().getFilteredTableViewFXParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFilteredTableViewFX();

                    state._fsp--;

                     after(grammarAccess.getControlFXAccess().getFilteredTableViewFXParserRuleCall_1()); 

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
    // $ANTLR end "rule__ControlFX__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalJavaFXLang.g:521:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:525:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJavaFXLang.g:526:2: ( RULE_STRING )
                    {
                    // InternalJavaFXLang.g:526:2: ( RULE_STRING )
                    // InternalJavaFXLang.g:527:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:532:2: ( RULE_ID )
                    {
                    // InternalJavaFXLang.g:532:2: ( RULE_ID )
                    // InternalJavaFXLang.g:533:3: RULE_ID
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
    // InternalJavaFXLang.g:542:1: rule__ModelFX__Alternatives : ( ( ruleDerivedBean ) | ( ruleBean ) );
    public final void rule__ModelFX__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:546:1: ( ( ruleDerivedBean ) | ( ruleBean ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==48) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_STRING) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==27) ) {
                        int LA3_4 = input.LA(4);

                        if ( ((LA3_4>=RULE_STRING && LA3_4<=RULE_ID)||LA3_4==28) ) {
                            alt3=2;
                        }
                        else if ( (LA3_4==49) ) {
                            alt3=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_1==RULE_ID) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==27) ) {
                        int LA3_4 = input.LA(4);

                        if ( ((LA3_4>=RULE_STRING && LA3_4<=RULE_ID)||LA3_4==28) ) {
                            alt3=2;
                        }
                        else if ( (LA3_4==49) ) {
                            alt3=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJavaFXLang.g:547:2: ( ruleDerivedBean )
                    {
                    // InternalJavaFXLang.g:547:2: ( ruleDerivedBean )
                    // InternalJavaFXLang.g:548:3: ruleDerivedBean
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
                    // InternalJavaFXLang.g:553:2: ( ruleBean )
                    {
                    // InternalJavaFXLang.g:553:2: ( ruleBean )
                    // InternalJavaFXLang.g:554:3: ruleBean
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
    // InternalJavaFXLang.g:563:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:567:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJavaFXLang.g:568:2: ( 'true' )
                    {
                    // InternalJavaFXLang.g:568:2: ( 'true' )
                    // InternalJavaFXLang.g:569:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:574:2: ( 'false' )
                    {
                    // InternalJavaFXLang.g:574:2: ( 'false' )
                    // InternalJavaFXLang.g:575:3: 'false'
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


    // $ANTLR start "rule__AxisType__Alternatives"
    // InternalJavaFXLang.g:584:1: rule__AxisType__Alternatives : ( ( ( 'Category' ) ) | ( ( 'Number' ) ) );
    public final void rule__AxisType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:588:1: ( ( ( 'Category' ) ) | ( ( 'Number' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalJavaFXLang.g:589:2: ( ( 'Category' ) )
                    {
                    // InternalJavaFXLang.g:589:2: ( ( 'Category' ) )
                    // InternalJavaFXLang.g:590:3: ( 'Category' )
                    {
                     before(grammarAccess.getAxisTypeAccess().getCategoryEnumLiteralDeclaration_0()); 
                    // InternalJavaFXLang.g:591:3: ( 'Category' )
                    // InternalJavaFXLang.g:591:4: 'Category'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAxisTypeAccess().getCategoryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:595:2: ( ( 'Number' ) )
                    {
                    // InternalJavaFXLang.g:595:2: ( ( 'Number' ) )
                    // InternalJavaFXLang.g:596:3: ( 'Number' )
                    {
                     before(grammarAccess.getAxisTypeAccess().getNumberEnumLiteralDeclaration_1()); 
                    // InternalJavaFXLang.g:597:3: ( 'Number' )
                    // InternalJavaFXLang.g:597:4: 'Number'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getAxisTypeAccess().getNumberEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__AxisType__Alternatives"


    // $ANTLR start "rule__Orientation__Alternatives"
    // InternalJavaFXLang.g:605:1: rule__Orientation__Alternatives : ( ( ( 'Bottom' ) ) | ( ( 'Left' ) ) | ( ( 'Right' ) ) | ( ( 'Top' ) ) );
    public final void rule__Orientation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:609:1: ( ( ( 'Bottom' ) ) | ( ( 'Left' ) ) | ( ( 'Right' ) ) | ( ( 'Top' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case 18:
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
                    // InternalJavaFXLang.g:610:2: ( ( 'Bottom' ) )
                    {
                    // InternalJavaFXLang.g:610:2: ( ( 'Bottom' ) )
                    // InternalJavaFXLang.g:611:3: ( 'Bottom' )
                    {
                     before(grammarAccess.getOrientationAccess().getBottomEnumLiteralDeclaration_0()); 
                    // InternalJavaFXLang.g:612:3: ( 'Bottom' )
                    // InternalJavaFXLang.g:612:4: 'Bottom'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrientationAccess().getBottomEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:616:2: ( ( 'Left' ) )
                    {
                    // InternalJavaFXLang.g:616:2: ( ( 'Left' ) )
                    // InternalJavaFXLang.g:617:3: ( 'Left' )
                    {
                     before(grammarAccess.getOrientationAccess().getLeftEnumLiteralDeclaration_1()); 
                    // InternalJavaFXLang.g:618:3: ( 'Left' )
                    // InternalJavaFXLang.g:618:4: 'Left'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrientationAccess().getLeftEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJavaFXLang.g:622:2: ( ( 'Right' ) )
                    {
                    // InternalJavaFXLang.g:622:2: ( ( 'Right' ) )
                    // InternalJavaFXLang.g:623:3: ( 'Right' )
                    {
                     before(grammarAccess.getOrientationAccess().getRightEnumLiteralDeclaration_2()); 
                    // InternalJavaFXLang.g:624:3: ( 'Right' )
                    // InternalJavaFXLang.g:624:4: 'Right'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrientationAccess().getRightEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJavaFXLang.g:628:2: ( ( 'Top' ) )
                    {
                    // InternalJavaFXLang.g:628:2: ( ( 'Top' ) )
                    // InternalJavaFXLang.g:629:3: ( 'Top' )
                    {
                     before(grammarAccess.getOrientationAccess().getTopEnumLiteralDeclaration_3()); 
                    // InternalJavaFXLang.g:630:3: ( 'Top' )
                    // InternalJavaFXLang.g:630:4: 'Top'
                    {
                    match(input,18,FOLLOW_2); 

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
    // InternalJavaFXLang.g:638:1: rule__BindinType__Alternatives : ( ( ( 'BooleanProperty' ) ) | ( ( 'DoubleProperty' ) ) | ( ( 'FloatProperty' ) ) | ( ( 'IntegerProperty' ) ) | ( ( 'ObservableList' ) ) | ( ( 'ObjectProperty' ) ) | ( ( 'StringProperty' ) ) );
    public final void rule__BindinType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:642:1: ( ( ( 'BooleanProperty' ) ) | ( ( 'DoubleProperty' ) ) | ( ( 'FloatProperty' ) ) | ( ( 'IntegerProperty' ) ) | ( ( 'ObservableList' ) ) | ( ( 'ObjectProperty' ) ) | ( ( 'StringProperty' ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case 22:
                {
                alt7=4;
                }
                break;
            case 23:
                {
                alt7=5;
                }
                break;
            case 24:
                {
                alt7=6;
                }
                break;
            case 25:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalJavaFXLang.g:643:2: ( ( 'BooleanProperty' ) )
                    {
                    // InternalJavaFXLang.g:643:2: ( ( 'BooleanProperty' ) )
                    // InternalJavaFXLang.g:644:3: ( 'BooleanProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getBooleanPropertyEnumLiteralDeclaration_0()); 
                    // InternalJavaFXLang.g:645:3: ( 'BooleanProperty' )
                    // InternalJavaFXLang.g:645:4: 'BooleanProperty'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getBooleanPropertyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:649:2: ( ( 'DoubleProperty' ) )
                    {
                    // InternalJavaFXLang.g:649:2: ( ( 'DoubleProperty' ) )
                    // InternalJavaFXLang.g:650:3: ( 'DoubleProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getDoublePropertyEnumLiteralDeclaration_1()); 
                    // InternalJavaFXLang.g:651:3: ( 'DoubleProperty' )
                    // InternalJavaFXLang.g:651:4: 'DoubleProperty'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getDoublePropertyEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJavaFXLang.g:655:2: ( ( 'FloatProperty' ) )
                    {
                    // InternalJavaFXLang.g:655:2: ( ( 'FloatProperty' ) )
                    // InternalJavaFXLang.g:656:3: ( 'FloatProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getFloatPropertyEnumLiteralDeclaration_2()); 
                    // InternalJavaFXLang.g:657:3: ( 'FloatProperty' )
                    // InternalJavaFXLang.g:657:4: 'FloatProperty'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getFloatPropertyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJavaFXLang.g:661:2: ( ( 'IntegerProperty' ) )
                    {
                    // InternalJavaFXLang.g:661:2: ( ( 'IntegerProperty' ) )
                    // InternalJavaFXLang.g:662:3: ( 'IntegerProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getIntegerPropertyEnumLiteralDeclaration_3()); 
                    // InternalJavaFXLang.g:663:3: ( 'IntegerProperty' )
                    // InternalJavaFXLang.g:663:4: 'IntegerProperty'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getIntegerPropertyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJavaFXLang.g:667:2: ( ( 'ObservableList' ) )
                    {
                    // InternalJavaFXLang.g:667:2: ( ( 'ObservableList' ) )
                    // InternalJavaFXLang.g:668:3: ( 'ObservableList' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getObservableListEnumLiteralDeclaration_4()); 
                    // InternalJavaFXLang.g:669:3: ( 'ObservableList' )
                    // InternalJavaFXLang.g:669:4: 'ObservableList'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getObservableListEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJavaFXLang.g:673:2: ( ( 'ObjectProperty' ) )
                    {
                    // InternalJavaFXLang.g:673:2: ( ( 'ObjectProperty' ) )
                    // InternalJavaFXLang.g:674:3: ( 'ObjectProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getObjectPropertyEnumLiteralDeclaration_5()); 
                    // InternalJavaFXLang.g:675:3: ( 'ObjectProperty' )
                    // InternalJavaFXLang.g:675:4: 'ObjectProperty'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getObjectPropertyEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJavaFXLang.g:679:2: ( ( 'StringProperty' ) )
                    {
                    // InternalJavaFXLang.g:679:2: ( ( 'StringProperty' ) )
                    // InternalJavaFXLang.g:680:3: ( 'StringProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getStringPropertyEnumLiteralDeclaration_6()); 
                    // InternalJavaFXLang.g:681:3: ( 'StringProperty' )
                    // InternalJavaFXLang.g:681:4: 'StringProperty'
                    {
                    match(input,25,FOLLOW_2); 

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
    // InternalJavaFXLang.g:689:1: rule__ProjectFX__Group__0 : rule__ProjectFX__Group__0__Impl rule__ProjectFX__Group__1 ;
    public final void rule__ProjectFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:693:1: ( rule__ProjectFX__Group__0__Impl rule__ProjectFX__Group__1 )
            // InternalJavaFXLang.g:694:2: rule__ProjectFX__Group__0__Impl rule__ProjectFX__Group__1
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
    // InternalJavaFXLang.g:701:1: rule__ProjectFX__Group__0__Impl : ( () ) ;
    public final void rule__ProjectFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:705:1: ( ( () ) )
            // InternalJavaFXLang.g:706:1: ( () )
            {
            // InternalJavaFXLang.g:706:1: ( () )
            // InternalJavaFXLang.g:707:2: ()
            {
             before(grammarAccess.getProjectFXAccess().getProjectFXAction_0()); 
            // InternalJavaFXLang.g:708:2: ()
            // InternalJavaFXLang.g:708:3: 
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
    // InternalJavaFXLang.g:716:1: rule__ProjectFX__Group__1 : rule__ProjectFX__Group__1__Impl rule__ProjectFX__Group__2 ;
    public final void rule__ProjectFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:720:1: ( rule__ProjectFX__Group__1__Impl rule__ProjectFX__Group__2 )
            // InternalJavaFXLang.g:721:2: rule__ProjectFX__Group__1__Impl rule__ProjectFX__Group__2
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
    // InternalJavaFXLang.g:728:1: rule__ProjectFX__Group__1__Impl : ( 'ProjectFX' ) ;
    public final void rule__ProjectFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:732:1: ( ( 'ProjectFX' ) )
            // InternalJavaFXLang.g:733:1: ( 'ProjectFX' )
            {
            // InternalJavaFXLang.g:733:1: ( 'ProjectFX' )
            // InternalJavaFXLang.g:734:2: 'ProjectFX'
            {
             before(grammarAccess.getProjectFXAccess().getProjectFXKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalJavaFXLang.g:743:1: rule__ProjectFX__Group__2 : rule__ProjectFX__Group__2__Impl rule__ProjectFX__Group__3 ;
    public final void rule__ProjectFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:747:1: ( rule__ProjectFX__Group__2__Impl rule__ProjectFX__Group__3 )
            // InternalJavaFXLang.g:748:2: rule__ProjectFX__Group__2__Impl rule__ProjectFX__Group__3
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
    // InternalJavaFXLang.g:755:1: rule__ProjectFX__Group__2__Impl : ( ( rule__ProjectFX__NameAssignment_2 ) ) ;
    public final void rule__ProjectFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:759:1: ( ( ( rule__ProjectFX__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:760:1: ( ( rule__ProjectFX__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:760:1: ( ( rule__ProjectFX__NameAssignment_2 ) )
            // InternalJavaFXLang.g:761:2: ( rule__ProjectFX__NameAssignment_2 )
            {
             before(grammarAccess.getProjectFXAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:762:2: ( rule__ProjectFX__NameAssignment_2 )
            // InternalJavaFXLang.g:762:3: rule__ProjectFX__NameAssignment_2
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
    // InternalJavaFXLang.g:770:1: rule__ProjectFX__Group__3 : rule__ProjectFX__Group__3__Impl rule__ProjectFX__Group__4 ;
    public final void rule__ProjectFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:774:1: ( rule__ProjectFX__Group__3__Impl rule__ProjectFX__Group__4 )
            // InternalJavaFXLang.g:775:2: rule__ProjectFX__Group__3__Impl rule__ProjectFX__Group__4
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
    // InternalJavaFXLang.g:782:1: rule__ProjectFX__Group__3__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:786:1: ( ( '{' ) )
            // InternalJavaFXLang.g:787:1: ( '{' )
            {
            // InternalJavaFXLang.g:787:1: ( '{' )
            // InternalJavaFXLang.g:788:2: '{'
            {
             before(grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalJavaFXLang.g:797:1: rule__ProjectFX__Group__4 : rule__ProjectFX__Group__4__Impl rule__ProjectFX__Group__5 ;
    public final void rule__ProjectFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:801:1: ( rule__ProjectFX__Group__4__Impl rule__ProjectFX__Group__5 )
            // InternalJavaFXLang.g:802:2: rule__ProjectFX__Group__4__Impl rule__ProjectFX__Group__5
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
    // InternalJavaFXLang.g:809:1: rule__ProjectFX__Group__4__Impl : ( ( rule__ProjectFX__Group_4__0 )? ) ;
    public final void rule__ProjectFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:813:1: ( ( ( rule__ProjectFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:814:1: ( ( rule__ProjectFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:814:1: ( ( rule__ProjectFX__Group_4__0 )? )
            // InternalJavaFXLang.g:815:2: ( rule__ProjectFX__Group_4__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:816:2: ( rule__ProjectFX__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJavaFXLang.g:816:3: rule__ProjectFX__Group_4__0
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
    // InternalJavaFXLang.g:824:1: rule__ProjectFX__Group__5 : rule__ProjectFX__Group__5__Impl rule__ProjectFX__Group__6 ;
    public final void rule__ProjectFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:828:1: ( rule__ProjectFX__Group__5__Impl rule__ProjectFX__Group__6 )
            // InternalJavaFXLang.g:829:2: rule__ProjectFX__Group__5__Impl rule__ProjectFX__Group__6
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
    // InternalJavaFXLang.g:836:1: rule__ProjectFX__Group__5__Impl : ( ( rule__ProjectFX__Group_5__0 )? ) ;
    public final void rule__ProjectFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:840:1: ( ( ( rule__ProjectFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:841:1: ( ( rule__ProjectFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:841:1: ( ( rule__ProjectFX__Group_5__0 )? )
            // InternalJavaFXLang.g:842:2: ( rule__ProjectFX__Group_5__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:843:2: ( rule__ProjectFX__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJavaFXLang.g:843:3: rule__ProjectFX__Group_5__0
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
    // InternalJavaFXLang.g:851:1: rule__ProjectFX__Group__6 : rule__ProjectFX__Group__6__Impl rule__ProjectFX__Group__7 ;
    public final void rule__ProjectFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:855:1: ( rule__ProjectFX__Group__6__Impl rule__ProjectFX__Group__7 )
            // InternalJavaFXLang.g:856:2: rule__ProjectFX__Group__6__Impl rule__ProjectFX__Group__7
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
    // InternalJavaFXLang.g:863:1: rule__ProjectFX__Group__6__Impl : ( ( rule__ProjectFX__Group_6__0 )? ) ;
    public final void rule__ProjectFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:867:1: ( ( ( rule__ProjectFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:868:1: ( ( rule__ProjectFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:868:1: ( ( rule__ProjectFX__Group_6__0 )? )
            // InternalJavaFXLang.g:869:2: ( rule__ProjectFX__Group_6__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:870:2: ( rule__ProjectFX__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJavaFXLang.g:870:3: rule__ProjectFX__Group_6__0
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
    // InternalJavaFXLang.g:878:1: rule__ProjectFX__Group__7 : rule__ProjectFX__Group__7__Impl rule__ProjectFX__Group__8 ;
    public final void rule__ProjectFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:882:1: ( rule__ProjectFX__Group__7__Impl rule__ProjectFX__Group__8 )
            // InternalJavaFXLang.g:883:2: rule__ProjectFX__Group__7__Impl rule__ProjectFX__Group__8
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
    // InternalJavaFXLang.g:890:1: rule__ProjectFX__Group__7__Impl : ( ( rule__ProjectFX__Group_7__0 )? ) ;
    public final void rule__ProjectFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:894:1: ( ( ( rule__ProjectFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:895:1: ( ( rule__ProjectFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:895:1: ( ( rule__ProjectFX__Group_7__0 )? )
            // InternalJavaFXLang.g:896:2: ( rule__ProjectFX__Group_7__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:897:2: ( rule__ProjectFX__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJavaFXLang.g:897:3: rule__ProjectFX__Group_7__0
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
    // InternalJavaFXLang.g:905:1: rule__ProjectFX__Group__8 : rule__ProjectFX__Group__8__Impl rule__ProjectFX__Group__9 ;
    public final void rule__ProjectFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:909:1: ( rule__ProjectFX__Group__8__Impl rule__ProjectFX__Group__9 )
            // InternalJavaFXLang.g:910:2: rule__ProjectFX__Group__8__Impl rule__ProjectFX__Group__9
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
    // InternalJavaFXLang.g:917:1: rule__ProjectFX__Group__8__Impl : ( ( rule__ProjectFX__Group_8__0 )? ) ;
    public final void rule__ProjectFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:921:1: ( ( ( rule__ProjectFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:922:1: ( ( rule__ProjectFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:922:1: ( ( rule__ProjectFX__Group_8__0 )? )
            // InternalJavaFXLang.g:923:2: ( rule__ProjectFX__Group_8__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:924:2: ( rule__ProjectFX__Group_8__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJavaFXLang.g:924:3: rule__ProjectFX__Group_8__0
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
    // InternalJavaFXLang.g:932:1: rule__ProjectFX__Group__9 : rule__ProjectFX__Group__9__Impl ;
    public final void rule__ProjectFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:936:1: ( rule__ProjectFX__Group__9__Impl )
            // InternalJavaFXLang.g:937:2: rule__ProjectFX__Group__9__Impl
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
    // InternalJavaFXLang.g:943:1: rule__ProjectFX__Group__9__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:947:1: ( ( '}' ) )
            // InternalJavaFXLang.g:948:1: ( '}' )
            {
            // InternalJavaFXLang.g:948:1: ( '}' )
            // InternalJavaFXLang.g:949:2: '}'
            {
             before(grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_9()); 
            match(input,28,FOLLOW_2); 
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
    // InternalJavaFXLang.g:959:1: rule__ProjectFX__Group_4__0 : rule__ProjectFX__Group_4__0__Impl rule__ProjectFX__Group_4__1 ;
    public final void rule__ProjectFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:963:1: ( rule__ProjectFX__Group_4__0__Impl rule__ProjectFX__Group_4__1 )
            // InternalJavaFXLang.g:964:2: rule__ProjectFX__Group_4__0__Impl rule__ProjectFX__Group_4__1
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
    // InternalJavaFXLang.g:971:1: rule__ProjectFX__Group_4__0__Impl : ( 'packagePath' ) ;
    public final void rule__ProjectFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:975:1: ( ( 'packagePath' ) )
            // InternalJavaFXLang.g:976:1: ( 'packagePath' )
            {
            // InternalJavaFXLang.g:976:1: ( 'packagePath' )
            // InternalJavaFXLang.g:977:2: 'packagePath'
            {
             before(grammarAccess.getProjectFXAccess().getPackagePathKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalJavaFXLang.g:986:1: rule__ProjectFX__Group_4__1 : rule__ProjectFX__Group_4__1__Impl ;
    public final void rule__ProjectFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:990:1: ( rule__ProjectFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:991:2: rule__ProjectFX__Group_4__1__Impl
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
    // InternalJavaFXLang.g:997:1: rule__ProjectFX__Group_4__1__Impl : ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) ) ;
    public final void rule__ProjectFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1001:1: ( ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:1002:1: ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:1002:1: ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) )
            // InternalJavaFXLang.g:1003:2: ( rule__ProjectFX__PackagePathAssignment_4_1 )
            {
             before(grammarAccess.getProjectFXAccess().getPackagePathAssignment_4_1()); 
            // InternalJavaFXLang.g:1004:2: ( rule__ProjectFX__PackagePathAssignment_4_1 )
            // InternalJavaFXLang.g:1004:3: rule__ProjectFX__PackagePathAssignment_4_1
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
    // InternalJavaFXLang.g:1013:1: rule__ProjectFX__Group_5__0 : rule__ProjectFX__Group_5__0__Impl rule__ProjectFX__Group_5__1 ;
    public final void rule__ProjectFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1017:1: ( rule__ProjectFX__Group_5__0__Impl rule__ProjectFX__Group_5__1 )
            // InternalJavaFXLang.g:1018:2: rule__ProjectFX__Group_5__0__Impl rule__ProjectFX__Group_5__1
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
    // InternalJavaFXLang.g:1025:1: rule__ProjectFX__Group_5__0__Impl : ( 'controls' ) ;
    public final void rule__ProjectFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1029:1: ( ( 'controls' ) )
            // InternalJavaFXLang.g:1030:1: ( 'controls' )
            {
            // InternalJavaFXLang.g:1030:1: ( 'controls' )
            // InternalJavaFXLang.g:1031:2: 'controls'
            {
             before(grammarAccess.getProjectFXAccess().getControlsKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalJavaFXLang.g:1040:1: rule__ProjectFX__Group_5__1 : rule__ProjectFX__Group_5__1__Impl rule__ProjectFX__Group_5__2 ;
    public final void rule__ProjectFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1044:1: ( rule__ProjectFX__Group_5__1__Impl rule__ProjectFX__Group_5__2 )
            // InternalJavaFXLang.g:1045:2: rule__ProjectFX__Group_5__1__Impl rule__ProjectFX__Group_5__2
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
    // InternalJavaFXLang.g:1052:1: rule__ProjectFX__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1056:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1057:1: ( '{' )
            {
            // InternalJavaFXLang.g:1057:1: ( '{' )
            // InternalJavaFXLang.g:1058:2: '{'
            {
             before(grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalJavaFXLang.g:1067:1: rule__ProjectFX__Group_5__2 : rule__ProjectFX__Group_5__2__Impl rule__ProjectFX__Group_5__3 ;
    public final void rule__ProjectFX__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1071:1: ( rule__ProjectFX__Group_5__2__Impl rule__ProjectFX__Group_5__3 )
            // InternalJavaFXLang.g:1072:2: rule__ProjectFX__Group_5__2__Impl rule__ProjectFX__Group_5__3
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
    // InternalJavaFXLang.g:1079:1: rule__ProjectFX__Group_5__2__Impl : ( ( rule__ProjectFX__ControlsAssignment_5_2 ) ) ;
    public final void rule__ProjectFX__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1083:1: ( ( ( rule__ProjectFX__ControlsAssignment_5_2 ) ) )
            // InternalJavaFXLang.g:1084:1: ( ( rule__ProjectFX__ControlsAssignment_5_2 ) )
            {
            // InternalJavaFXLang.g:1084:1: ( ( rule__ProjectFX__ControlsAssignment_5_2 ) )
            // InternalJavaFXLang.g:1085:2: ( rule__ProjectFX__ControlsAssignment_5_2 )
            {
             before(grammarAccess.getProjectFXAccess().getControlsAssignment_5_2()); 
            // InternalJavaFXLang.g:1086:2: ( rule__ProjectFX__ControlsAssignment_5_2 )
            // InternalJavaFXLang.g:1086:3: rule__ProjectFX__ControlsAssignment_5_2
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
    // InternalJavaFXLang.g:1094:1: rule__ProjectFX__Group_5__3 : rule__ProjectFX__Group_5__3__Impl rule__ProjectFX__Group_5__4 ;
    public final void rule__ProjectFX__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1098:1: ( rule__ProjectFX__Group_5__3__Impl rule__ProjectFX__Group_5__4 )
            // InternalJavaFXLang.g:1099:2: rule__ProjectFX__Group_5__3__Impl rule__ProjectFX__Group_5__4
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
    // InternalJavaFXLang.g:1106:1: rule__ProjectFX__Group_5__3__Impl : ( ( rule__ProjectFX__ControlsAssignment_5_3 )* ) ;
    public final void rule__ProjectFX__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1110:1: ( ( ( rule__ProjectFX__ControlsAssignment_5_3 )* ) )
            // InternalJavaFXLang.g:1111:1: ( ( rule__ProjectFX__ControlsAssignment_5_3 )* )
            {
            // InternalJavaFXLang.g:1111:1: ( ( rule__ProjectFX__ControlsAssignment_5_3 )* )
            // InternalJavaFXLang.g:1112:2: ( rule__ProjectFX__ControlsAssignment_5_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getControlsAssignment_5_3()); 
            // InternalJavaFXLang.g:1113:2: ( rule__ProjectFX__ControlsAssignment_5_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==45||LA13_0==50) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalJavaFXLang.g:1113:3: rule__ProjectFX__ControlsAssignment_5_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ProjectFX__ControlsAssignment_5_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalJavaFXLang.g:1121:1: rule__ProjectFX__Group_5__4 : rule__ProjectFX__Group_5__4__Impl ;
    public final void rule__ProjectFX__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1125:1: ( rule__ProjectFX__Group_5__4__Impl )
            // InternalJavaFXLang.g:1126:2: rule__ProjectFX__Group_5__4__Impl
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
    // InternalJavaFXLang.g:1132:1: rule__ProjectFX__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1136:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1137:1: ( '}' )
            {
            // InternalJavaFXLang.g:1137:1: ( '}' )
            // InternalJavaFXLang.g:1138:2: '}'
            {
             before(grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalJavaFXLang.g:1148:1: rule__ProjectFX__Group_6__0 : rule__ProjectFX__Group_6__0__Impl rule__ProjectFX__Group_6__1 ;
    public final void rule__ProjectFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1152:1: ( rule__ProjectFX__Group_6__0__Impl rule__ProjectFX__Group_6__1 )
            // InternalJavaFXLang.g:1153:2: rule__ProjectFX__Group_6__0__Impl rule__ProjectFX__Group_6__1
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
    // InternalJavaFXLang.g:1160:1: rule__ProjectFX__Group_6__0__Impl : ( 'models' ) ;
    public final void rule__ProjectFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1164:1: ( ( 'models' ) )
            // InternalJavaFXLang.g:1165:1: ( 'models' )
            {
            // InternalJavaFXLang.g:1165:1: ( 'models' )
            // InternalJavaFXLang.g:1166:2: 'models'
            {
             before(grammarAccess.getProjectFXAccess().getModelsKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalJavaFXLang.g:1175:1: rule__ProjectFX__Group_6__1 : rule__ProjectFX__Group_6__1__Impl rule__ProjectFX__Group_6__2 ;
    public final void rule__ProjectFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1179:1: ( rule__ProjectFX__Group_6__1__Impl rule__ProjectFX__Group_6__2 )
            // InternalJavaFXLang.g:1180:2: rule__ProjectFX__Group_6__1__Impl rule__ProjectFX__Group_6__2
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
    // InternalJavaFXLang.g:1187:1: rule__ProjectFX__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1191:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1192:1: ( '{' )
            {
            // InternalJavaFXLang.g:1192:1: ( '{' )
            // InternalJavaFXLang.g:1193:2: '{'
            {
             before(grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalJavaFXLang.g:1202:1: rule__ProjectFX__Group_6__2 : rule__ProjectFX__Group_6__2__Impl rule__ProjectFX__Group_6__3 ;
    public final void rule__ProjectFX__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1206:1: ( rule__ProjectFX__Group_6__2__Impl rule__ProjectFX__Group_6__3 )
            // InternalJavaFXLang.g:1207:2: rule__ProjectFX__Group_6__2__Impl rule__ProjectFX__Group_6__3
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
    // InternalJavaFXLang.g:1214:1: rule__ProjectFX__Group_6__2__Impl : ( ( rule__ProjectFX__ModelsAssignment_6_2 ) ) ;
    public final void rule__ProjectFX__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1218:1: ( ( ( rule__ProjectFX__ModelsAssignment_6_2 ) ) )
            // InternalJavaFXLang.g:1219:1: ( ( rule__ProjectFX__ModelsAssignment_6_2 ) )
            {
            // InternalJavaFXLang.g:1219:1: ( ( rule__ProjectFX__ModelsAssignment_6_2 ) )
            // InternalJavaFXLang.g:1220:2: ( rule__ProjectFX__ModelsAssignment_6_2 )
            {
             before(grammarAccess.getProjectFXAccess().getModelsAssignment_6_2()); 
            // InternalJavaFXLang.g:1221:2: ( rule__ProjectFX__ModelsAssignment_6_2 )
            // InternalJavaFXLang.g:1221:3: rule__ProjectFX__ModelsAssignment_6_2
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
    // InternalJavaFXLang.g:1229:1: rule__ProjectFX__Group_6__3 : rule__ProjectFX__Group_6__3__Impl rule__ProjectFX__Group_6__4 ;
    public final void rule__ProjectFX__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1233:1: ( rule__ProjectFX__Group_6__3__Impl rule__ProjectFX__Group_6__4 )
            // InternalJavaFXLang.g:1234:2: rule__ProjectFX__Group_6__3__Impl rule__ProjectFX__Group_6__4
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
    // InternalJavaFXLang.g:1241:1: rule__ProjectFX__Group_6__3__Impl : ( ( rule__ProjectFX__ModelsAssignment_6_3 )* ) ;
    public final void rule__ProjectFX__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1245:1: ( ( ( rule__ProjectFX__ModelsAssignment_6_3 )* ) )
            // InternalJavaFXLang.g:1246:1: ( ( rule__ProjectFX__ModelsAssignment_6_3 )* )
            {
            // InternalJavaFXLang.g:1246:1: ( ( rule__ProjectFX__ModelsAssignment_6_3 )* )
            // InternalJavaFXLang.g:1247:2: ( rule__ProjectFX__ModelsAssignment_6_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getModelsAssignment_6_3()); 
            // InternalJavaFXLang.g:1248:2: ( rule__ProjectFX__ModelsAssignment_6_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==48) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJavaFXLang.g:1248:3: rule__ProjectFX__ModelsAssignment_6_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ProjectFX__ModelsAssignment_6_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalJavaFXLang.g:1256:1: rule__ProjectFX__Group_6__4 : rule__ProjectFX__Group_6__4__Impl ;
    public final void rule__ProjectFX__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1260:1: ( rule__ProjectFX__Group_6__4__Impl )
            // InternalJavaFXLang.g:1261:2: rule__ProjectFX__Group_6__4__Impl
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
    // InternalJavaFXLang.g:1267:1: rule__ProjectFX__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1271:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1272:1: ( '}' )
            {
            // InternalJavaFXLang.g:1272:1: ( '}' )
            // InternalJavaFXLang.g:1273:2: '}'
            {
             before(grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalJavaFXLang.g:1283:1: rule__ProjectFX__Group_7__0 : rule__ProjectFX__Group_7__0__Impl rule__ProjectFX__Group_7__1 ;
    public final void rule__ProjectFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1287:1: ( rule__ProjectFX__Group_7__0__Impl rule__ProjectFX__Group_7__1 )
            // InternalJavaFXLang.g:1288:2: rule__ProjectFX__Group_7__0__Impl rule__ProjectFX__Group_7__1
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
    // InternalJavaFXLang.g:1295:1: rule__ProjectFX__Group_7__0__Impl : ( 'bindings' ) ;
    public final void rule__ProjectFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1299:1: ( ( 'bindings' ) )
            // InternalJavaFXLang.g:1300:1: ( 'bindings' )
            {
            // InternalJavaFXLang.g:1300:1: ( 'bindings' )
            // InternalJavaFXLang.g:1301:2: 'bindings'
            {
             before(grammarAccess.getProjectFXAccess().getBindingsKeyword_7_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalJavaFXLang.g:1310:1: rule__ProjectFX__Group_7__1 : rule__ProjectFX__Group_7__1__Impl rule__ProjectFX__Group_7__2 ;
    public final void rule__ProjectFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1314:1: ( rule__ProjectFX__Group_7__1__Impl rule__ProjectFX__Group_7__2 )
            // InternalJavaFXLang.g:1315:2: rule__ProjectFX__Group_7__1__Impl rule__ProjectFX__Group_7__2
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
    // InternalJavaFXLang.g:1322:1: rule__ProjectFX__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1326:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1327:1: ( '{' )
            {
            // InternalJavaFXLang.g:1327:1: ( '{' )
            // InternalJavaFXLang.g:1328:2: '{'
            {
             before(grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalJavaFXLang.g:1337:1: rule__ProjectFX__Group_7__2 : rule__ProjectFX__Group_7__2__Impl rule__ProjectFX__Group_7__3 ;
    public final void rule__ProjectFX__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1341:1: ( rule__ProjectFX__Group_7__2__Impl rule__ProjectFX__Group_7__3 )
            // InternalJavaFXLang.g:1342:2: rule__ProjectFX__Group_7__2__Impl rule__ProjectFX__Group_7__3
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
    // InternalJavaFXLang.g:1349:1: rule__ProjectFX__Group_7__2__Impl : ( ( rule__ProjectFX__BindingsAssignment_7_2 ) ) ;
    public final void rule__ProjectFX__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1353:1: ( ( ( rule__ProjectFX__BindingsAssignment_7_2 ) ) )
            // InternalJavaFXLang.g:1354:1: ( ( rule__ProjectFX__BindingsAssignment_7_2 ) )
            {
            // InternalJavaFXLang.g:1354:1: ( ( rule__ProjectFX__BindingsAssignment_7_2 ) )
            // InternalJavaFXLang.g:1355:2: ( rule__ProjectFX__BindingsAssignment_7_2 )
            {
             before(grammarAccess.getProjectFXAccess().getBindingsAssignment_7_2()); 
            // InternalJavaFXLang.g:1356:2: ( rule__ProjectFX__BindingsAssignment_7_2 )
            // InternalJavaFXLang.g:1356:3: rule__ProjectFX__BindingsAssignment_7_2
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
    // InternalJavaFXLang.g:1364:1: rule__ProjectFX__Group_7__3 : rule__ProjectFX__Group_7__3__Impl rule__ProjectFX__Group_7__4 ;
    public final void rule__ProjectFX__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1368:1: ( rule__ProjectFX__Group_7__3__Impl rule__ProjectFX__Group_7__4 )
            // InternalJavaFXLang.g:1369:2: rule__ProjectFX__Group_7__3__Impl rule__ProjectFX__Group_7__4
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
    // InternalJavaFXLang.g:1376:1: rule__ProjectFX__Group_7__3__Impl : ( ( rule__ProjectFX__BindingsAssignment_7_3 )* ) ;
    public final void rule__ProjectFX__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1380:1: ( ( ( rule__ProjectFX__BindingsAssignment_7_3 )* ) )
            // InternalJavaFXLang.g:1381:1: ( ( rule__ProjectFX__BindingsAssignment_7_3 )* )
            {
            // InternalJavaFXLang.g:1381:1: ( ( rule__ProjectFX__BindingsAssignment_7_3 )* )
            // InternalJavaFXLang.g:1382:2: ( rule__ProjectFX__BindingsAssignment_7_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getBindingsAssignment_7_3()); 
            // InternalJavaFXLang.g:1383:2: ( rule__ProjectFX__BindingsAssignment_7_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==44) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalJavaFXLang.g:1383:3: rule__ProjectFX__BindingsAssignment_7_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ProjectFX__BindingsAssignment_7_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalJavaFXLang.g:1391:1: rule__ProjectFX__Group_7__4 : rule__ProjectFX__Group_7__4__Impl ;
    public final void rule__ProjectFX__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1395:1: ( rule__ProjectFX__Group_7__4__Impl )
            // InternalJavaFXLang.g:1396:2: rule__ProjectFX__Group_7__4__Impl
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
    // InternalJavaFXLang.g:1402:1: rule__ProjectFX__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1406:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1407:1: ( '}' )
            {
            // InternalJavaFXLang.g:1407:1: ( '}' )
            // InternalJavaFXLang.g:1408:2: '}'
            {
             before(grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalJavaFXLang.g:1418:1: rule__ProjectFX__Group_8__0 : rule__ProjectFX__Group_8__0__Impl rule__ProjectFX__Group_8__1 ;
    public final void rule__ProjectFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1422:1: ( rule__ProjectFX__Group_8__0__Impl rule__ProjectFX__Group_8__1 )
            // InternalJavaFXLang.g:1423:2: rule__ProjectFX__Group_8__0__Impl rule__ProjectFX__Group_8__1
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
    // InternalJavaFXLang.g:1430:1: rule__ProjectFX__Group_8__0__Impl : ( 'charts' ) ;
    public final void rule__ProjectFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1434:1: ( ( 'charts' ) )
            // InternalJavaFXLang.g:1435:1: ( 'charts' )
            {
            // InternalJavaFXLang.g:1435:1: ( 'charts' )
            // InternalJavaFXLang.g:1436:2: 'charts'
            {
             before(grammarAccess.getProjectFXAccess().getChartsKeyword_8_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalJavaFXLang.g:1445:1: rule__ProjectFX__Group_8__1 : rule__ProjectFX__Group_8__1__Impl rule__ProjectFX__Group_8__2 ;
    public final void rule__ProjectFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1449:1: ( rule__ProjectFX__Group_8__1__Impl rule__ProjectFX__Group_8__2 )
            // InternalJavaFXLang.g:1450:2: rule__ProjectFX__Group_8__1__Impl rule__ProjectFX__Group_8__2
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
    // InternalJavaFXLang.g:1457:1: rule__ProjectFX__Group_8__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1461:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1462:1: ( '{' )
            {
            // InternalJavaFXLang.g:1462:1: ( '{' )
            // InternalJavaFXLang.g:1463:2: '{'
            {
             before(grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalJavaFXLang.g:1472:1: rule__ProjectFX__Group_8__2 : rule__ProjectFX__Group_8__2__Impl rule__ProjectFX__Group_8__3 ;
    public final void rule__ProjectFX__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1476:1: ( rule__ProjectFX__Group_8__2__Impl rule__ProjectFX__Group_8__3 )
            // InternalJavaFXLang.g:1477:2: rule__ProjectFX__Group_8__2__Impl rule__ProjectFX__Group_8__3
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
    // InternalJavaFXLang.g:1484:1: rule__ProjectFX__Group_8__2__Impl : ( ( rule__ProjectFX__ChartsAssignment_8_2 ) ) ;
    public final void rule__ProjectFX__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1488:1: ( ( ( rule__ProjectFX__ChartsAssignment_8_2 ) ) )
            // InternalJavaFXLang.g:1489:1: ( ( rule__ProjectFX__ChartsAssignment_8_2 ) )
            {
            // InternalJavaFXLang.g:1489:1: ( ( rule__ProjectFX__ChartsAssignment_8_2 ) )
            // InternalJavaFXLang.g:1490:2: ( rule__ProjectFX__ChartsAssignment_8_2 )
            {
             before(grammarAccess.getProjectFXAccess().getChartsAssignment_8_2()); 
            // InternalJavaFXLang.g:1491:2: ( rule__ProjectFX__ChartsAssignment_8_2 )
            // InternalJavaFXLang.g:1491:3: rule__ProjectFX__ChartsAssignment_8_2
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
    // InternalJavaFXLang.g:1499:1: rule__ProjectFX__Group_8__3 : rule__ProjectFX__Group_8__3__Impl rule__ProjectFX__Group_8__4 ;
    public final void rule__ProjectFX__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1503:1: ( rule__ProjectFX__Group_8__3__Impl rule__ProjectFX__Group_8__4 )
            // InternalJavaFXLang.g:1504:2: rule__ProjectFX__Group_8__3__Impl rule__ProjectFX__Group_8__4
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
    // InternalJavaFXLang.g:1511:1: rule__ProjectFX__Group_8__3__Impl : ( ( rule__ProjectFX__ChartsAssignment_8_3 )* ) ;
    public final void rule__ProjectFX__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1515:1: ( ( ( rule__ProjectFX__ChartsAssignment_8_3 )* ) )
            // InternalJavaFXLang.g:1516:1: ( ( rule__ProjectFX__ChartsAssignment_8_3 )* )
            {
            // InternalJavaFXLang.g:1516:1: ( ( rule__ProjectFX__ChartsAssignment_8_3 )* )
            // InternalJavaFXLang.g:1517:2: ( rule__ProjectFX__ChartsAssignment_8_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getChartsAssignment_8_3()); 
            // InternalJavaFXLang.g:1518:2: ( rule__ProjectFX__ChartsAssignment_8_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalJavaFXLang.g:1518:3: rule__ProjectFX__ChartsAssignment_8_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ProjectFX__ChartsAssignment_8_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalJavaFXLang.g:1526:1: rule__ProjectFX__Group_8__4 : rule__ProjectFX__Group_8__4__Impl ;
    public final void rule__ProjectFX__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1530:1: ( rule__ProjectFX__Group_8__4__Impl )
            // InternalJavaFXLang.g:1531:2: rule__ProjectFX__Group_8__4__Impl
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
    // InternalJavaFXLang.g:1537:1: rule__ProjectFX__Group_8__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1541:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1542:1: ( '}' )
            {
            // InternalJavaFXLang.g:1542:1: ( '}' )
            // InternalJavaFXLang.g:1543:2: '}'
            {
             before(grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalJavaFXLang.g:1553:1: rule__LineChartFX__Group__0 : rule__LineChartFX__Group__0__Impl rule__LineChartFX__Group__1 ;
    public final void rule__LineChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1557:1: ( rule__LineChartFX__Group__0__Impl rule__LineChartFX__Group__1 )
            // InternalJavaFXLang.g:1558:2: rule__LineChartFX__Group__0__Impl rule__LineChartFX__Group__1
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
    // InternalJavaFXLang.g:1565:1: rule__LineChartFX__Group__0__Impl : ( () ) ;
    public final void rule__LineChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1569:1: ( ( () ) )
            // InternalJavaFXLang.g:1570:1: ( () )
            {
            // InternalJavaFXLang.g:1570:1: ( () )
            // InternalJavaFXLang.g:1571:2: ()
            {
             before(grammarAccess.getLineChartFXAccess().getLineChartFXAction_0()); 
            // InternalJavaFXLang.g:1572:2: ()
            // InternalJavaFXLang.g:1572:3: 
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
    // InternalJavaFXLang.g:1580:1: rule__LineChartFX__Group__1 : rule__LineChartFX__Group__1__Impl rule__LineChartFX__Group__2 ;
    public final void rule__LineChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1584:1: ( rule__LineChartFX__Group__1__Impl rule__LineChartFX__Group__2 )
            // InternalJavaFXLang.g:1585:2: rule__LineChartFX__Group__1__Impl rule__LineChartFX__Group__2
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
    // InternalJavaFXLang.g:1592:1: rule__LineChartFX__Group__1__Impl : ( 'LineChart' ) ;
    public final void rule__LineChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1596:1: ( ( 'LineChart' ) )
            // InternalJavaFXLang.g:1597:1: ( 'LineChart' )
            {
            // InternalJavaFXLang.g:1597:1: ( 'LineChart' )
            // InternalJavaFXLang.g:1598:2: 'LineChart'
            {
             before(grammarAccess.getLineChartFXAccess().getLineChartKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalJavaFXLang.g:1607:1: rule__LineChartFX__Group__2 : rule__LineChartFX__Group__2__Impl rule__LineChartFX__Group__3 ;
    public final void rule__LineChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1611:1: ( rule__LineChartFX__Group__2__Impl rule__LineChartFX__Group__3 )
            // InternalJavaFXLang.g:1612:2: rule__LineChartFX__Group__2__Impl rule__LineChartFX__Group__3
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
    // InternalJavaFXLang.g:1619:1: rule__LineChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__LineChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1623:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1624:1: ( '{' )
            {
            // InternalJavaFXLang.g:1624:1: ( '{' )
            // InternalJavaFXLang.g:1625:2: '{'
            {
             before(grammarAccess.getLineChartFXAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalJavaFXLang.g:1634:1: rule__LineChartFX__Group__3 : rule__LineChartFX__Group__3__Impl rule__LineChartFX__Group__4 ;
    public final void rule__LineChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1638:1: ( rule__LineChartFX__Group__3__Impl rule__LineChartFX__Group__4 )
            // InternalJavaFXLang.g:1639:2: rule__LineChartFX__Group__3__Impl rule__LineChartFX__Group__4
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
    // InternalJavaFXLang.g:1646:1: rule__LineChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__LineChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1650:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:1651:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:1651:1: ( 'name:' )
            // InternalJavaFXLang.g:1652:2: 'name:'
            {
             before(grammarAccess.getLineChartFXAccess().getNameKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalJavaFXLang.g:1661:1: rule__LineChartFX__Group__4 : rule__LineChartFX__Group__4__Impl rule__LineChartFX__Group__5 ;
    public final void rule__LineChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1665:1: ( rule__LineChartFX__Group__4__Impl rule__LineChartFX__Group__5 )
            // InternalJavaFXLang.g:1666:2: rule__LineChartFX__Group__4__Impl rule__LineChartFX__Group__5
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
    // InternalJavaFXLang.g:1673:1: rule__LineChartFX__Group__4__Impl : ( ( rule__LineChartFX__NameAssignment_4 ) ) ;
    public final void rule__LineChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1677:1: ( ( ( rule__LineChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:1678:1: ( ( rule__LineChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:1678:1: ( ( rule__LineChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:1679:2: ( rule__LineChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getLineChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:1680:2: ( rule__LineChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:1680:3: rule__LineChartFX__NameAssignment_4
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
    // InternalJavaFXLang.g:1688:1: rule__LineChartFX__Group__5 : rule__LineChartFX__Group__5__Impl rule__LineChartFX__Group__6 ;
    public final void rule__LineChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1692:1: ( rule__LineChartFX__Group__5__Impl rule__LineChartFX__Group__6 )
            // InternalJavaFXLang.g:1693:2: rule__LineChartFX__Group__5__Impl rule__LineChartFX__Group__6
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
    // InternalJavaFXLang.g:1700:1: rule__LineChartFX__Group__5__Impl : ( ( rule__LineChartFX__Group_5__0 )? ) ;
    public final void rule__LineChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1704:1: ( ( ( rule__LineChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:1705:1: ( ( rule__LineChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:1705:1: ( ( rule__LineChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:1706:2: ( rule__LineChartFX__Group_5__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:1707:2: ( rule__LineChartFX__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJavaFXLang.g:1707:3: rule__LineChartFX__Group_5__0
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
    // InternalJavaFXLang.g:1715:1: rule__LineChartFX__Group__6 : rule__LineChartFX__Group__6__Impl rule__LineChartFX__Group__7 ;
    public final void rule__LineChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1719:1: ( rule__LineChartFX__Group__6__Impl rule__LineChartFX__Group__7 )
            // InternalJavaFXLang.g:1720:2: rule__LineChartFX__Group__6__Impl rule__LineChartFX__Group__7
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
    // InternalJavaFXLang.g:1727:1: rule__LineChartFX__Group__6__Impl : ( ( rule__LineChartFX__Group_6__0 )? ) ;
    public final void rule__LineChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1731:1: ( ( ( rule__LineChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:1732:1: ( ( rule__LineChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:1732:1: ( ( rule__LineChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:1733:2: ( rule__LineChartFX__Group_6__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:1734:2: ( rule__LineChartFX__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJavaFXLang.g:1734:3: rule__LineChartFX__Group_6__0
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
    // InternalJavaFXLang.g:1742:1: rule__LineChartFX__Group__7 : rule__LineChartFX__Group__7__Impl rule__LineChartFX__Group__8 ;
    public final void rule__LineChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1746:1: ( rule__LineChartFX__Group__7__Impl rule__LineChartFX__Group__8 )
            // InternalJavaFXLang.g:1747:2: rule__LineChartFX__Group__7__Impl rule__LineChartFX__Group__8
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
    // InternalJavaFXLang.g:1754:1: rule__LineChartFX__Group__7__Impl : ( ( rule__LineChartFX__Group_7__0 )? ) ;
    public final void rule__LineChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1758:1: ( ( ( rule__LineChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:1759:1: ( ( rule__LineChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:1759:1: ( ( rule__LineChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:1760:2: ( rule__LineChartFX__Group_7__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:1761:2: ( rule__LineChartFX__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJavaFXLang.g:1761:3: rule__LineChartFX__Group_7__0
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
    // InternalJavaFXLang.g:1769:1: rule__LineChartFX__Group__8 : rule__LineChartFX__Group__8__Impl rule__LineChartFX__Group__9 ;
    public final void rule__LineChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1773:1: ( rule__LineChartFX__Group__8__Impl rule__LineChartFX__Group__9 )
            // InternalJavaFXLang.g:1774:2: rule__LineChartFX__Group__8__Impl rule__LineChartFX__Group__9
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
    // InternalJavaFXLang.g:1781:1: rule__LineChartFX__Group__8__Impl : ( ( rule__LineChartFX__Group_8__0 )? ) ;
    public final void rule__LineChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1785:1: ( ( ( rule__LineChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:1786:1: ( ( rule__LineChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:1786:1: ( ( rule__LineChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:1787:2: ( rule__LineChartFX__Group_8__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:1788:2: ( rule__LineChartFX__Group_8__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJavaFXLang.g:1788:3: rule__LineChartFX__Group_8__0
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
    // InternalJavaFXLang.g:1796:1: rule__LineChartFX__Group__9 : rule__LineChartFX__Group__9__Impl rule__LineChartFX__Group__10 ;
    public final void rule__LineChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1800:1: ( rule__LineChartFX__Group__9__Impl rule__LineChartFX__Group__10 )
            // InternalJavaFXLang.g:1801:2: rule__LineChartFX__Group__9__Impl rule__LineChartFX__Group__10
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
    // InternalJavaFXLang.g:1808:1: rule__LineChartFX__Group__9__Impl : ( ( rule__LineChartFX__Group_9__0 )? ) ;
    public final void rule__LineChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1812:1: ( ( ( rule__LineChartFX__Group_9__0 )? ) )
            // InternalJavaFXLang.g:1813:1: ( ( rule__LineChartFX__Group_9__0 )? )
            {
            // InternalJavaFXLang.g:1813:1: ( ( rule__LineChartFX__Group_9__0 )? )
            // InternalJavaFXLang.g:1814:2: ( rule__LineChartFX__Group_9__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_9()); 
            // InternalJavaFXLang.g:1815:2: ( rule__LineChartFX__Group_9__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJavaFXLang.g:1815:3: rule__LineChartFX__Group_9__0
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
    // InternalJavaFXLang.g:1823:1: rule__LineChartFX__Group__10 : rule__LineChartFX__Group__10__Impl rule__LineChartFX__Group__11 ;
    public final void rule__LineChartFX__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1827:1: ( rule__LineChartFX__Group__10__Impl rule__LineChartFX__Group__11 )
            // InternalJavaFXLang.g:1828:2: rule__LineChartFX__Group__10__Impl rule__LineChartFX__Group__11
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
    // InternalJavaFXLang.g:1835:1: rule__LineChartFX__Group__10__Impl : ( ( rule__LineChartFX__Group_10__0 )? ) ;
    public final void rule__LineChartFX__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1839:1: ( ( ( rule__LineChartFX__Group_10__0 )? ) )
            // InternalJavaFXLang.g:1840:1: ( ( rule__LineChartFX__Group_10__0 )? )
            {
            // InternalJavaFXLang.g:1840:1: ( ( rule__LineChartFX__Group_10__0 )? )
            // InternalJavaFXLang.g:1841:2: ( rule__LineChartFX__Group_10__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_10()); 
            // InternalJavaFXLang.g:1842:2: ( rule__LineChartFX__Group_10__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJavaFXLang.g:1842:3: rule__LineChartFX__Group_10__0
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
    // InternalJavaFXLang.g:1850:1: rule__LineChartFX__Group__11 : rule__LineChartFX__Group__11__Impl rule__LineChartFX__Group__12 ;
    public final void rule__LineChartFX__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1854:1: ( rule__LineChartFX__Group__11__Impl rule__LineChartFX__Group__12 )
            // InternalJavaFXLang.g:1855:2: rule__LineChartFX__Group__11__Impl rule__LineChartFX__Group__12
            {
            pushFollow(FOLLOW_20);
            rule__LineChartFX__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group__12();

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
    // InternalJavaFXLang.g:1862:1: rule__LineChartFX__Group__11__Impl : ( ( rule__LineChartFX__Group_11__0 )? ) ;
    public final void rule__LineChartFX__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1866:1: ( ( ( rule__LineChartFX__Group_11__0 )? ) )
            // InternalJavaFXLang.g:1867:1: ( ( rule__LineChartFX__Group_11__0 )? )
            {
            // InternalJavaFXLang.g:1867:1: ( ( rule__LineChartFX__Group_11__0 )? )
            // InternalJavaFXLang.g:1868:2: ( rule__LineChartFX__Group_11__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_11()); 
            // InternalJavaFXLang.g:1869:2: ( rule__LineChartFX__Group_11__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalJavaFXLang.g:1869:3: rule__LineChartFX__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineChartFX__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineChartFXAccess().getGroup_11()); 

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


    // $ANTLR start "rule__LineChartFX__Group__12"
    // InternalJavaFXLang.g:1877:1: rule__LineChartFX__Group__12 : rule__LineChartFX__Group__12__Impl rule__LineChartFX__Group__13 ;
    public final void rule__LineChartFX__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1881:1: ( rule__LineChartFX__Group__12__Impl rule__LineChartFX__Group__13 )
            // InternalJavaFXLang.g:1882:2: rule__LineChartFX__Group__12__Impl rule__LineChartFX__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__LineChartFX__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group__13();

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
    // $ANTLR end "rule__LineChartFX__Group__12"


    // $ANTLR start "rule__LineChartFX__Group__12__Impl"
    // InternalJavaFXLang.g:1889:1: rule__LineChartFX__Group__12__Impl : ( ( rule__LineChartFX__Group_12__0 )? ) ;
    public final void rule__LineChartFX__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1893:1: ( ( ( rule__LineChartFX__Group_12__0 )? ) )
            // InternalJavaFXLang.g:1894:1: ( ( rule__LineChartFX__Group_12__0 )? )
            {
            // InternalJavaFXLang.g:1894:1: ( ( rule__LineChartFX__Group_12__0 )? )
            // InternalJavaFXLang.g:1895:2: ( rule__LineChartFX__Group_12__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_12()); 
            // InternalJavaFXLang.g:1896:2: ( rule__LineChartFX__Group_12__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJavaFXLang.g:1896:3: rule__LineChartFX__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineChartFX__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineChartFXAccess().getGroup_12()); 

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
    // $ANTLR end "rule__LineChartFX__Group__12__Impl"


    // $ANTLR start "rule__LineChartFX__Group__13"
    // InternalJavaFXLang.g:1904:1: rule__LineChartFX__Group__13 : rule__LineChartFX__Group__13__Impl ;
    public final void rule__LineChartFX__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1908:1: ( rule__LineChartFX__Group__13__Impl )
            // InternalJavaFXLang.g:1909:2: rule__LineChartFX__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group__13__Impl();

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
    // $ANTLR end "rule__LineChartFX__Group__13"


    // $ANTLR start "rule__LineChartFX__Group__13__Impl"
    // InternalJavaFXLang.g:1915:1: rule__LineChartFX__Group__13__Impl : ( '}' ) ;
    public final void rule__LineChartFX__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1919:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1920:1: ( '}' )
            {
            // InternalJavaFXLang.g:1920:1: ( '}' )
            // InternalJavaFXLang.g:1921:2: '}'
            {
             before(grammarAccess.getLineChartFXAccess().getRightCurlyBracketKeyword_13()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLineChartFXAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__LineChartFX__Group__13__Impl"


    // $ANTLR start "rule__LineChartFX__Group_5__0"
    // InternalJavaFXLang.g:1931:1: rule__LineChartFX__Group_5__0 : rule__LineChartFX__Group_5__0__Impl rule__LineChartFX__Group_5__1 ;
    public final void rule__LineChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1935:1: ( rule__LineChartFX__Group_5__0__Impl rule__LineChartFX__Group_5__1 )
            // InternalJavaFXLang.g:1936:2: rule__LineChartFX__Group_5__0__Impl rule__LineChartFX__Group_5__1
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
    // InternalJavaFXLang.g:1943:1: rule__LineChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__LineChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1947:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:1948:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:1948:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:1949:2: 'legendSide:'
            {
             before(grammarAccess.getLineChartFXAccess().getLegendSideKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalJavaFXLang.g:1958:1: rule__LineChartFX__Group_5__1 : rule__LineChartFX__Group_5__1__Impl ;
    public final void rule__LineChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1962:1: ( rule__LineChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:1963:2: rule__LineChartFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:1969:1: rule__LineChartFX__Group_5__1__Impl : ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__LineChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1973:1: ( ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:1974:1: ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:1974:1: ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:1975:2: ( rule__LineChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:1976:2: ( rule__LineChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:1976:3: rule__LineChartFX__LegendSideAssignment_5_1
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
    // InternalJavaFXLang.g:1985:1: rule__LineChartFX__Group_6__0 : rule__LineChartFX__Group_6__0__Impl rule__LineChartFX__Group_6__1 ;
    public final void rule__LineChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1989:1: ( rule__LineChartFX__Group_6__0__Impl rule__LineChartFX__Group_6__1 )
            // InternalJavaFXLang.g:1990:2: rule__LineChartFX__Group_6__0__Impl rule__LineChartFX__Group_6__1
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
    // InternalJavaFXLang.g:1997:1: rule__LineChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__LineChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2001:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:2002:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:2002:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:2003:2: 'showLegend:'
            {
             before(grammarAccess.getLineChartFXAccess().getShowLegendKeyword_6_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalJavaFXLang.g:2012:1: rule__LineChartFX__Group_6__1 : rule__LineChartFX__Group_6__1__Impl ;
    public final void rule__LineChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2016:1: ( rule__LineChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:2017:2: rule__LineChartFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:2023:1: rule__LineChartFX__Group_6__1__Impl : ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__LineChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2027:1: ( ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:2028:1: ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:2028:1: ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:2029:2: ( rule__LineChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:2030:2: ( rule__LineChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:2030:3: rule__LineChartFX__ShowLegendAssignment_6_1
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
    // InternalJavaFXLang.g:2039:1: rule__LineChartFX__Group_7__0 : rule__LineChartFX__Group_7__0__Impl rule__LineChartFX__Group_7__1 ;
    public final void rule__LineChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2043:1: ( rule__LineChartFX__Group_7__0__Impl rule__LineChartFX__Group_7__1 )
            // InternalJavaFXLang.g:2044:2: rule__LineChartFX__Group_7__0__Impl rule__LineChartFX__Group_7__1
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
    // InternalJavaFXLang.g:2051:1: rule__LineChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__LineChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2055:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:2056:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:2056:1: ( 'title:' )
            // InternalJavaFXLang.g:2057:2: 'title:'
            {
             before(grammarAccess.getLineChartFXAccess().getTitleKeyword_7_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalJavaFXLang.g:2066:1: rule__LineChartFX__Group_7__1 : rule__LineChartFX__Group_7__1__Impl ;
    public final void rule__LineChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2070:1: ( rule__LineChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:2071:2: rule__LineChartFX__Group_7__1__Impl
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
    // InternalJavaFXLang.g:2077:1: rule__LineChartFX__Group_7__1__Impl : ( ( rule__LineChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__LineChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2081:1: ( ( ( rule__LineChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:2082:1: ( ( rule__LineChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:2082:1: ( ( rule__LineChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:2083:2: ( rule__LineChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:2084:2: ( rule__LineChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:2084:3: rule__LineChartFX__TitleAssignment_7_1
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
    // InternalJavaFXLang.g:2093:1: rule__LineChartFX__Group_8__0 : rule__LineChartFX__Group_8__0__Impl rule__LineChartFX__Group_8__1 ;
    public final void rule__LineChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2097:1: ( rule__LineChartFX__Group_8__0__Impl rule__LineChartFX__Group_8__1 )
            // InternalJavaFXLang.g:2098:2: rule__LineChartFX__Group_8__0__Impl rule__LineChartFX__Group_8__1
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
    // InternalJavaFXLang.g:2105:1: rule__LineChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__LineChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2109:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:2110:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:2110:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:2111:2: 'titleSide:'
            {
             before(grammarAccess.getLineChartFXAccess().getTitleSideKeyword_8_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalJavaFXLang.g:2120:1: rule__LineChartFX__Group_8__1 : rule__LineChartFX__Group_8__1__Impl ;
    public final void rule__LineChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2124:1: ( rule__LineChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:2125:2: rule__LineChartFX__Group_8__1__Impl
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
    // InternalJavaFXLang.g:2131:1: rule__LineChartFX__Group_8__1__Impl : ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__LineChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2135:1: ( ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:2136:1: ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:2136:1: ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:2137:2: ( rule__LineChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:2138:2: ( rule__LineChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:2138:3: rule__LineChartFX__TitleSideAssignment_8_1
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
    // InternalJavaFXLang.g:2147:1: rule__LineChartFX__Group_9__0 : rule__LineChartFX__Group_9__0__Impl rule__LineChartFX__Group_9__1 ;
    public final void rule__LineChartFX__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2151:1: ( rule__LineChartFX__Group_9__0__Impl rule__LineChartFX__Group_9__1 )
            // InternalJavaFXLang.g:2152:2: rule__LineChartFX__Group_9__0__Impl rule__LineChartFX__Group_9__1
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
    // InternalJavaFXLang.g:2159:1: rule__LineChartFX__Group_9__0__Impl : ( 'xAxisLabel:' ) ;
    public final void rule__LineChartFX__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2163:1: ( ( 'xAxisLabel:' ) )
            // InternalJavaFXLang.g:2164:1: ( 'xAxisLabel:' )
            {
            // InternalJavaFXLang.g:2164:1: ( 'xAxisLabel:' )
            // InternalJavaFXLang.g:2165:2: 'xAxisLabel:'
            {
             before(grammarAccess.getLineChartFXAccess().getXAxisLabelKeyword_9_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalJavaFXLang.g:2174:1: rule__LineChartFX__Group_9__1 : rule__LineChartFX__Group_9__1__Impl ;
    public final void rule__LineChartFX__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2178:1: ( rule__LineChartFX__Group_9__1__Impl )
            // InternalJavaFXLang.g:2179:2: rule__LineChartFX__Group_9__1__Impl
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
    // InternalJavaFXLang.g:2185:1: rule__LineChartFX__Group_9__1__Impl : ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) ) ;
    public final void rule__LineChartFX__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2189:1: ( ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) ) )
            // InternalJavaFXLang.g:2190:1: ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) )
            {
            // InternalJavaFXLang.g:2190:1: ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) )
            // InternalJavaFXLang.g:2191:2: ( rule__LineChartFX__XAxisLabelAssignment_9_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getXAxisLabelAssignment_9_1()); 
            // InternalJavaFXLang.g:2192:2: ( rule__LineChartFX__XAxisLabelAssignment_9_1 )
            // InternalJavaFXLang.g:2192:3: rule__LineChartFX__XAxisLabelAssignment_9_1
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
    // InternalJavaFXLang.g:2201:1: rule__LineChartFX__Group_10__0 : rule__LineChartFX__Group_10__0__Impl rule__LineChartFX__Group_10__1 ;
    public final void rule__LineChartFX__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2205:1: ( rule__LineChartFX__Group_10__0__Impl rule__LineChartFX__Group_10__1 )
            // InternalJavaFXLang.g:2206:2: rule__LineChartFX__Group_10__0__Impl rule__LineChartFX__Group_10__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalJavaFXLang.g:2213:1: rule__LineChartFX__Group_10__0__Impl : ( 'xAxisType:' ) ;
    public final void rule__LineChartFX__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2217:1: ( ( 'xAxisType:' ) )
            // InternalJavaFXLang.g:2218:1: ( 'xAxisType:' )
            {
            // InternalJavaFXLang.g:2218:1: ( 'xAxisType:' )
            // InternalJavaFXLang.g:2219:2: 'xAxisType:'
            {
             before(grammarAccess.getLineChartFXAccess().getXAxisTypeKeyword_10_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLineChartFXAccess().getXAxisTypeKeyword_10_0()); 

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
    // InternalJavaFXLang.g:2228:1: rule__LineChartFX__Group_10__1 : rule__LineChartFX__Group_10__1__Impl ;
    public final void rule__LineChartFX__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2232:1: ( rule__LineChartFX__Group_10__1__Impl )
            // InternalJavaFXLang.g:2233:2: rule__LineChartFX__Group_10__1__Impl
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
    // InternalJavaFXLang.g:2239:1: rule__LineChartFX__Group_10__1__Impl : ( ( rule__LineChartFX__XAxisTypeAssignment_10_1 ) ) ;
    public final void rule__LineChartFX__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2243:1: ( ( ( rule__LineChartFX__XAxisTypeAssignment_10_1 ) ) )
            // InternalJavaFXLang.g:2244:1: ( ( rule__LineChartFX__XAxisTypeAssignment_10_1 ) )
            {
            // InternalJavaFXLang.g:2244:1: ( ( rule__LineChartFX__XAxisTypeAssignment_10_1 ) )
            // InternalJavaFXLang.g:2245:2: ( rule__LineChartFX__XAxisTypeAssignment_10_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getXAxisTypeAssignment_10_1()); 
            // InternalJavaFXLang.g:2246:2: ( rule__LineChartFX__XAxisTypeAssignment_10_1 )
            // InternalJavaFXLang.g:2246:3: rule__LineChartFX__XAxisTypeAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__XAxisTypeAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getLineChartFXAccess().getXAxisTypeAssignment_10_1()); 

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


    // $ANTLR start "rule__LineChartFX__Group_11__0"
    // InternalJavaFXLang.g:2255:1: rule__LineChartFX__Group_11__0 : rule__LineChartFX__Group_11__0__Impl rule__LineChartFX__Group_11__1 ;
    public final void rule__LineChartFX__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2259:1: ( rule__LineChartFX__Group_11__0__Impl rule__LineChartFX__Group_11__1 )
            // InternalJavaFXLang.g:2260:2: rule__LineChartFX__Group_11__0__Impl rule__LineChartFX__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__LineChartFX__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_11__1();

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
    // $ANTLR end "rule__LineChartFX__Group_11__0"


    // $ANTLR start "rule__LineChartFX__Group_11__0__Impl"
    // InternalJavaFXLang.g:2267:1: rule__LineChartFX__Group_11__0__Impl : ( 'yAxisLabel:' ) ;
    public final void rule__LineChartFX__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2271:1: ( ( 'yAxisLabel:' ) )
            // InternalJavaFXLang.g:2272:1: ( 'yAxisLabel:' )
            {
            // InternalJavaFXLang.g:2272:1: ( 'yAxisLabel:' )
            // InternalJavaFXLang.g:2273:2: 'yAxisLabel:'
            {
             before(grammarAccess.getLineChartFXAccess().getYAxisLabelKeyword_11_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLineChartFXAccess().getYAxisLabelKeyword_11_0()); 

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
    // $ANTLR end "rule__LineChartFX__Group_11__0__Impl"


    // $ANTLR start "rule__LineChartFX__Group_11__1"
    // InternalJavaFXLang.g:2282:1: rule__LineChartFX__Group_11__1 : rule__LineChartFX__Group_11__1__Impl ;
    public final void rule__LineChartFX__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2286:1: ( rule__LineChartFX__Group_11__1__Impl )
            // InternalJavaFXLang.g:2287:2: rule__LineChartFX__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_11__1__Impl();

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
    // $ANTLR end "rule__LineChartFX__Group_11__1"


    // $ANTLR start "rule__LineChartFX__Group_11__1__Impl"
    // InternalJavaFXLang.g:2293:1: rule__LineChartFX__Group_11__1__Impl : ( ( rule__LineChartFX__YAxisLabelAssignment_11_1 ) ) ;
    public final void rule__LineChartFX__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2297:1: ( ( ( rule__LineChartFX__YAxisLabelAssignment_11_1 ) ) )
            // InternalJavaFXLang.g:2298:1: ( ( rule__LineChartFX__YAxisLabelAssignment_11_1 ) )
            {
            // InternalJavaFXLang.g:2298:1: ( ( rule__LineChartFX__YAxisLabelAssignment_11_1 ) )
            // InternalJavaFXLang.g:2299:2: ( rule__LineChartFX__YAxisLabelAssignment_11_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getYAxisLabelAssignment_11_1()); 
            // InternalJavaFXLang.g:2300:2: ( rule__LineChartFX__YAxisLabelAssignment_11_1 )
            // InternalJavaFXLang.g:2300:3: rule__LineChartFX__YAxisLabelAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__YAxisLabelAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getLineChartFXAccess().getYAxisLabelAssignment_11_1()); 

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
    // $ANTLR end "rule__LineChartFX__Group_11__1__Impl"


    // $ANTLR start "rule__LineChartFX__Group_12__0"
    // InternalJavaFXLang.g:2309:1: rule__LineChartFX__Group_12__0 : rule__LineChartFX__Group_12__0__Impl rule__LineChartFX__Group_12__1 ;
    public final void rule__LineChartFX__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2313:1: ( rule__LineChartFX__Group_12__0__Impl rule__LineChartFX__Group_12__1 )
            // InternalJavaFXLang.g:2314:2: rule__LineChartFX__Group_12__0__Impl rule__LineChartFX__Group_12__1
            {
            pushFollow(FOLLOW_23);
            rule__LineChartFX__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_12__1();

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
    // $ANTLR end "rule__LineChartFX__Group_12__0"


    // $ANTLR start "rule__LineChartFX__Group_12__0__Impl"
    // InternalJavaFXLang.g:2321:1: rule__LineChartFX__Group_12__0__Impl : ( 'yAxisType:' ) ;
    public final void rule__LineChartFX__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2325:1: ( ( 'yAxisType:' ) )
            // InternalJavaFXLang.g:2326:1: ( 'yAxisType:' )
            {
            // InternalJavaFXLang.g:2326:1: ( 'yAxisType:' )
            // InternalJavaFXLang.g:2327:2: 'yAxisType:'
            {
             before(grammarAccess.getLineChartFXAccess().getYAxisTypeKeyword_12_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLineChartFXAccess().getYAxisTypeKeyword_12_0()); 

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
    // $ANTLR end "rule__LineChartFX__Group_12__0__Impl"


    // $ANTLR start "rule__LineChartFX__Group_12__1"
    // InternalJavaFXLang.g:2336:1: rule__LineChartFX__Group_12__1 : rule__LineChartFX__Group_12__1__Impl ;
    public final void rule__LineChartFX__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2340:1: ( rule__LineChartFX__Group_12__1__Impl )
            // InternalJavaFXLang.g:2341:2: rule__LineChartFX__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_12__1__Impl();

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
    // $ANTLR end "rule__LineChartFX__Group_12__1"


    // $ANTLR start "rule__LineChartFX__Group_12__1__Impl"
    // InternalJavaFXLang.g:2347:1: rule__LineChartFX__Group_12__1__Impl : ( ( rule__LineChartFX__YAxisTypeAssignment_12_1 ) ) ;
    public final void rule__LineChartFX__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2351:1: ( ( ( rule__LineChartFX__YAxisTypeAssignment_12_1 ) ) )
            // InternalJavaFXLang.g:2352:1: ( ( rule__LineChartFX__YAxisTypeAssignment_12_1 ) )
            {
            // InternalJavaFXLang.g:2352:1: ( ( rule__LineChartFX__YAxisTypeAssignment_12_1 ) )
            // InternalJavaFXLang.g:2353:2: ( rule__LineChartFX__YAxisTypeAssignment_12_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getYAxisTypeAssignment_12_1()); 
            // InternalJavaFXLang.g:2354:2: ( rule__LineChartFX__YAxisTypeAssignment_12_1 )
            // InternalJavaFXLang.g:2354:3: rule__LineChartFX__YAxisTypeAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__YAxisTypeAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getLineChartFXAccess().getYAxisTypeAssignment_12_1()); 

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
    // $ANTLR end "rule__LineChartFX__Group_12__1__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalJavaFXLang.g:2363:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2367:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalJavaFXLang.g:2368:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
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
    // InternalJavaFXLang.g:2375:1: rule__Binding__Group__0__Impl : ( () ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2379:1: ( ( () ) )
            // InternalJavaFXLang.g:2380:1: ( () )
            {
            // InternalJavaFXLang.g:2380:1: ( () )
            // InternalJavaFXLang.g:2381:2: ()
            {
             before(grammarAccess.getBindingAccess().getBindingAction_0()); 
            // InternalJavaFXLang.g:2382:2: ()
            // InternalJavaFXLang.g:2382:3: 
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
    // InternalJavaFXLang.g:2390:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2394:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalJavaFXLang.g:2395:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
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
    // InternalJavaFXLang.g:2402:1: rule__Binding__Group__1__Impl : ( 'binding' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2406:1: ( ( 'binding' ) )
            // InternalJavaFXLang.g:2407:1: ( 'binding' )
            {
            // InternalJavaFXLang.g:2407:1: ( 'binding' )
            // InternalJavaFXLang.g:2408:2: 'binding'
            {
             before(grammarAccess.getBindingAccess().getBindingKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalJavaFXLang.g:2417:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2421:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalJavaFXLang.g:2422:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
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
    // InternalJavaFXLang.g:2429:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__NameAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2433:1: ( ( ( rule__Binding__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:2434:1: ( ( rule__Binding__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:2434:1: ( ( rule__Binding__NameAssignment_2 ) )
            // InternalJavaFXLang.g:2435:2: ( rule__Binding__NameAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:2436:2: ( rule__Binding__NameAssignment_2 )
            // InternalJavaFXLang.g:2436:3: rule__Binding__NameAssignment_2
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
    // InternalJavaFXLang.g:2444:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2448:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalJavaFXLang.g:2449:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalJavaFXLang.g:2456:1: rule__Binding__Group__3__Impl : ( '{' ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2460:1: ( ( '{' ) )
            // InternalJavaFXLang.g:2461:1: ( '{' )
            {
            // InternalJavaFXLang.g:2461:1: ( '{' )
            // InternalJavaFXLang.g:2462:2: '{'
            {
             before(grammarAccess.getBindingAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalJavaFXLang.g:2471:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl rule__Binding__Group__5 ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2475:1: ( rule__Binding__Group__4__Impl rule__Binding__Group__5 )
            // InternalJavaFXLang.g:2476:2: rule__Binding__Group__4__Impl rule__Binding__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalJavaFXLang.g:2483:1: rule__Binding__Group__4__Impl : ( ( rule__Binding__Group_4__0 )? ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2487:1: ( ( ( rule__Binding__Group_4__0 )? ) )
            // InternalJavaFXLang.g:2488:1: ( ( rule__Binding__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:2488:1: ( ( rule__Binding__Group_4__0 )? )
            // InternalJavaFXLang.g:2489:2: ( rule__Binding__Group_4__0 )?
            {
             before(grammarAccess.getBindingAccess().getGroup_4()); 
            // InternalJavaFXLang.g:2490:2: ( rule__Binding__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=19 && LA25_0<=25)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJavaFXLang.g:2490:3: rule__Binding__Group_4__0
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
    // InternalJavaFXLang.g:2498:1: rule__Binding__Group__5 : rule__Binding__Group__5__Impl ;
    public final void rule__Binding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2502:1: ( rule__Binding__Group__5__Impl )
            // InternalJavaFXLang.g:2503:2: rule__Binding__Group__5__Impl
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
    // InternalJavaFXLang.g:2509:1: rule__Binding__Group__5__Impl : ( '}' ) ;
    public final void rule__Binding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2513:1: ( ( '}' ) )
            // InternalJavaFXLang.g:2514:1: ( '}' )
            {
            // InternalJavaFXLang.g:2514:1: ( '}' )
            // InternalJavaFXLang.g:2515:2: '}'
            {
             before(grammarAccess.getBindingAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalJavaFXLang.g:2525:1: rule__Binding__Group_4__0 : rule__Binding__Group_4__0__Impl rule__Binding__Group_4__1 ;
    public final void rule__Binding__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2529:1: ( rule__Binding__Group_4__0__Impl rule__Binding__Group_4__1 )
            // InternalJavaFXLang.g:2530:2: rule__Binding__Group_4__0__Impl rule__Binding__Group_4__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalJavaFXLang.g:2537:1: rule__Binding__Group_4__0__Impl : ( ( rule__Binding__PropertyAssignment_4_0 ) ) ;
    public final void rule__Binding__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2541:1: ( ( ( rule__Binding__PropertyAssignment_4_0 ) ) )
            // InternalJavaFXLang.g:2542:1: ( ( rule__Binding__PropertyAssignment_4_0 ) )
            {
            // InternalJavaFXLang.g:2542:1: ( ( rule__Binding__PropertyAssignment_4_0 ) )
            // InternalJavaFXLang.g:2543:2: ( rule__Binding__PropertyAssignment_4_0 )
            {
             before(grammarAccess.getBindingAccess().getPropertyAssignment_4_0()); 
            // InternalJavaFXLang.g:2544:2: ( rule__Binding__PropertyAssignment_4_0 )
            // InternalJavaFXLang.g:2544:3: rule__Binding__PropertyAssignment_4_0
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
    // InternalJavaFXLang.g:2552:1: rule__Binding__Group_4__1 : rule__Binding__Group_4__1__Impl ;
    public final void rule__Binding__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2556:1: ( rule__Binding__Group_4__1__Impl )
            // InternalJavaFXLang.g:2557:2: rule__Binding__Group_4__1__Impl
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
    // InternalJavaFXLang.g:2563:1: rule__Binding__Group_4__1__Impl : ( ( rule__Binding__PropertyAssignment_4_1 )* ) ;
    public final void rule__Binding__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2567:1: ( ( ( rule__Binding__PropertyAssignment_4_1 )* ) )
            // InternalJavaFXLang.g:2568:1: ( ( rule__Binding__PropertyAssignment_4_1 )* )
            {
            // InternalJavaFXLang.g:2568:1: ( ( rule__Binding__PropertyAssignment_4_1 )* )
            // InternalJavaFXLang.g:2569:2: ( rule__Binding__PropertyAssignment_4_1 )*
            {
             before(grammarAccess.getBindingAccess().getPropertyAssignment_4_1()); 
            // InternalJavaFXLang.g:2570:2: ( rule__Binding__PropertyAssignment_4_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=19 && LA26_0<=25)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalJavaFXLang.g:2570:3: rule__Binding__PropertyAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Binding__PropertyAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalJavaFXLang.g:2579:1: rule__BindingProperty__Group__0 : rule__BindingProperty__Group__0__Impl rule__BindingProperty__Group__1 ;
    public final void rule__BindingProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2583:1: ( rule__BindingProperty__Group__0__Impl rule__BindingProperty__Group__1 )
            // InternalJavaFXLang.g:2584:2: rule__BindingProperty__Group__0__Impl rule__BindingProperty__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalJavaFXLang.g:2591:1: rule__BindingProperty__Group__0__Impl : ( () ) ;
    public final void rule__BindingProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2595:1: ( ( () ) )
            // InternalJavaFXLang.g:2596:1: ( () )
            {
            // InternalJavaFXLang.g:2596:1: ( () )
            // InternalJavaFXLang.g:2597:2: ()
            {
             before(grammarAccess.getBindingPropertyAccess().getBindingPropertyAction_0()); 
            // InternalJavaFXLang.g:2598:2: ()
            // InternalJavaFXLang.g:2598:3: 
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
    // InternalJavaFXLang.g:2606:1: rule__BindingProperty__Group__1 : rule__BindingProperty__Group__1__Impl rule__BindingProperty__Group__2 ;
    public final void rule__BindingProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2610:1: ( rule__BindingProperty__Group__1__Impl rule__BindingProperty__Group__2 )
            // InternalJavaFXLang.g:2611:2: rule__BindingProperty__Group__1__Impl rule__BindingProperty__Group__2
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
    // InternalJavaFXLang.g:2618:1: rule__BindingProperty__Group__1__Impl : ( ( rule__BindingProperty__TypeAssignment_1 ) ) ;
    public final void rule__BindingProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2622:1: ( ( ( rule__BindingProperty__TypeAssignment_1 ) ) )
            // InternalJavaFXLang.g:2623:1: ( ( rule__BindingProperty__TypeAssignment_1 ) )
            {
            // InternalJavaFXLang.g:2623:1: ( ( rule__BindingProperty__TypeAssignment_1 ) )
            // InternalJavaFXLang.g:2624:2: ( rule__BindingProperty__TypeAssignment_1 )
            {
             before(grammarAccess.getBindingPropertyAccess().getTypeAssignment_1()); 
            // InternalJavaFXLang.g:2625:2: ( rule__BindingProperty__TypeAssignment_1 )
            // InternalJavaFXLang.g:2625:3: rule__BindingProperty__TypeAssignment_1
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
    // InternalJavaFXLang.g:2633:1: rule__BindingProperty__Group__2 : rule__BindingProperty__Group__2__Impl ;
    public final void rule__BindingProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2637:1: ( rule__BindingProperty__Group__2__Impl )
            // InternalJavaFXLang.g:2638:2: rule__BindingProperty__Group__2__Impl
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
    // InternalJavaFXLang.g:2644:1: rule__BindingProperty__Group__2__Impl : ( ( rule__BindingProperty__NameAssignment_2 ) ) ;
    public final void rule__BindingProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2648:1: ( ( ( rule__BindingProperty__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:2649:1: ( ( rule__BindingProperty__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:2649:1: ( ( rule__BindingProperty__NameAssignment_2 ) )
            // InternalJavaFXLang.g:2650:2: ( rule__BindingProperty__NameAssignment_2 )
            {
             before(grammarAccess.getBindingPropertyAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:2651:2: ( rule__BindingProperty__NameAssignment_2 )
            // InternalJavaFXLang.g:2651:3: rule__BindingProperty__NameAssignment_2
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


    // $ANTLR start "rule__FilteredTableViewFX__Group__0"
    // InternalJavaFXLang.g:2660:1: rule__FilteredTableViewFX__Group__0 : rule__FilteredTableViewFX__Group__0__Impl rule__FilteredTableViewFX__Group__1 ;
    public final void rule__FilteredTableViewFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2664:1: ( rule__FilteredTableViewFX__Group__0__Impl rule__FilteredTableViewFX__Group__1 )
            // InternalJavaFXLang.g:2665:2: rule__FilteredTableViewFX__Group__0__Impl rule__FilteredTableViewFX__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__FilteredTableViewFX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__Group__1();

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
    // $ANTLR end "rule__FilteredTableViewFX__Group__0"


    // $ANTLR start "rule__FilteredTableViewFX__Group__0__Impl"
    // InternalJavaFXLang.g:2672:1: rule__FilteredTableViewFX__Group__0__Impl : ( () ) ;
    public final void rule__FilteredTableViewFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2676:1: ( ( () ) )
            // InternalJavaFXLang.g:2677:1: ( () )
            {
            // InternalJavaFXLang.g:2677:1: ( () )
            // InternalJavaFXLang.g:2678:2: ()
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getFilteredTableViewFXAction_0()); 
            // InternalJavaFXLang.g:2679:2: ()
            // InternalJavaFXLang.g:2679:3: 
            {
            }

             after(grammarAccess.getFilteredTableViewFXAccess().getFilteredTableViewFXAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilteredTableViewFX__Group__0__Impl"


    // $ANTLR start "rule__FilteredTableViewFX__Group__1"
    // InternalJavaFXLang.g:2687:1: rule__FilteredTableViewFX__Group__1 : rule__FilteredTableViewFX__Group__1__Impl rule__FilteredTableViewFX__Group__2 ;
    public final void rule__FilteredTableViewFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2691:1: ( rule__FilteredTableViewFX__Group__1__Impl rule__FilteredTableViewFX__Group__2 )
            // InternalJavaFXLang.g:2692:2: rule__FilteredTableViewFX__Group__1__Impl rule__FilteredTableViewFX__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FilteredTableViewFX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__Group__2();

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
    // $ANTLR end "rule__FilteredTableViewFX__Group__1"


    // $ANTLR start "rule__FilteredTableViewFX__Group__1__Impl"
    // InternalJavaFXLang.g:2699:1: rule__FilteredTableViewFX__Group__1__Impl : ( 'FilteredTableView' ) ;
    public final void rule__FilteredTableViewFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2703:1: ( ( 'FilteredTableView' ) )
            // InternalJavaFXLang.g:2704:1: ( 'FilteredTableView' )
            {
            // InternalJavaFXLang.g:2704:1: ( 'FilteredTableView' )
            // InternalJavaFXLang.g:2705:2: 'FilteredTableView'
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getFilteredTableViewKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFilteredTableViewFXAccess().getFilteredTableViewKeyword_1()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__Group__1__Impl"


    // $ANTLR start "rule__FilteredTableViewFX__Group__2"
    // InternalJavaFXLang.g:2714:1: rule__FilteredTableViewFX__Group__2 : rule__FilteredTableViewFX__Group__2__Impl rule__FilteredTableViewFX__Group__3 ;
    public final void rule__FilteredTableViewFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2718:1: ( rule__FilteredTableViewFX__Group__2__Impl rule__FilteredTableViewFX__Group__3 )
            // InternalJavaFXLang.g:2719:2: rule__FilteredTableViewFX__Group__2__Impl rule__FilteredTableViewFX__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__FilteredTableViewFX__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__Group__3();

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
    // $ANTLR end "rule__FilteredTableViewFX__Group__2"


    // $ANTLR start "rule__FilteredTableViewFX__Group__2__Impl"
    // InternalJavaFXLang.g:2726:1: rule__FilteredTableViewFX__Group__2__Impl : ( '{' ) ;
    public final void rule__FilteredTableViewFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2730:1: ( ( '{' ) )
            // InternalJavaFXLang.g:2731:1: ( '{' )
            {
            // InternalJavaFXLang.g:2731:1: ( '{' )
            // InternalJavaFXLang.g:2732:2: '{'
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFilteredTableViewFXAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__Group__2__Impl"


    // $ANTLR start "rule__FilteredTableViewFX__Group__3"
    // InternalJavaFXLang.g:2741:1: rule__FilteredTableViewFX__Group__3 : rule__FilteredTableViewFX__Group__3__Impl rule__FilteredTableViewFX__Group__4 ;
    public final void rule__FilteredTableViewFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2745:1: ( rule__FilteredTableViewFX__Group__3__Impl rule__FilteredTableViewFX__Group__4 )
            // InternalJavaFXLang.g:2746:2: rule__FilteredTableViewFX__Group__3__Impl rule__FilteredTableViewFX__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__FilteredTableViewFX__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__Group__4();

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
    // $ANTLR end "rule__FilteredTableViewFX__Group__3"


    // $ANTLR start "rule__FilteredTableViewFX__Group__3__Impl"
    // InternalJavaFXLang.g:2753:1: rule__FilteredTableViewFX__Group__3__Impl : ( ( rule__FilteredTableViewFX__Group_3__0 ) ) ;
    public final void rule__FilteredTableViewFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2757:1: ( ( ( rule__FilteredTableViewFX__Group_3__0 ) ) )
            // InternalJavaFXLang.g:2758:1: ( ( rule__FilteredTableViewFX__Group_3__0 ) )
            {
            // InternalJavaFXLang.g:2758:1: ( ( rule__FilteredTableViewFX__Group_3__0 ) )
            // InternalJavaFXLang.g:2759:2: ( rule__FilteredTableViewFX__Group_3__0 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup_3()); 
            // InternalJavaFXLang.g:2760:2: ( rule__FilteredTableViewFX__Group_3__0 )
            // InternalJavaFXLang.g:2760:3: rule__FilteredTableViewFX__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getFilteredTableViewFXAccess().getGroup_3()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__Group__3__Impl"


    // $ANTLR start "rule__FilteredTableViewFX__Group__4"
    // InternalJavaFXLang.g:2768:1: rule__FilteredTableViewFX__Group__4 : rule__FilteredTableViewFX__Group__4__Impl rule__FilteredTableViewFX__Group__5 ;
    public final void rule__FilteredTableViewFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2772:1: ( rule__FilteredTableViewFX__Group__4__Impl rule__FilteredTableViewFX__Group__5 )
            // InternalJavaFXLang.g:2773:2: rule__FilteredTableViewFX__Group__4__Impl rule__FilteredTableViewFX__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__FilteredTableViewFX__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__Group__5();

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
    // $ANTLR end "rule__FilteredTableViewFX__Group__4"


    // $ANTLR start "rule__FilteredTableViewFX__Group__4__Impl"
    // InternalJavaFXLang.g:2780:1: rule__FilteredTableViewFX__Group__4__Impl : ( ( rule__FilteredTableViewFX__Group_4__0 )? ) ;
    public final void rule__FilteredTableViewFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2784:1: ( ( ( rule__FilteredTableViewFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:2785:1: ( ( rule__FilteredTableViewFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:2785:1: ( ( rule__FilteredTableViewFX__Group_4__0 )? )
            // InternalJavaFXLang.g:2786:2: ( rule__FilteredTableViewFX__Group_4__0 )?
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:2787:2: ( rule__FilteredTableViewFX__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJavaFXLang.g:2787:3: rule__FilteredTableViewFX__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilteredTableViewFX__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilteredTableViewFXAccess().getGroup_4()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__Group__4__Impl"


    // $ANTLR start "rule__FilteredTableViewFX__Group__5"
    // InternalJavaFXLang.g:2795:1: rule__FilteredTableViewFX__Group__5 : rule__FilteredTableViewFX__Group__5__Impl rule__FilteredTableViewFX__Group__6 ;
    public final void rule__FilteredTableViewFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2799:1: ( rule__FilteredTableViewFX__Group__5__Impl rule__FilteredTableViewFX__Group__6 )
            // InternalJavaFXLang.g:2800:2: rule__FilteredTableViewFX__Group__5__Impl rule__FilteredTableViewFX__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__FilteredTableViewFX__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__Group__6();

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
    // $ANTLR end "rule__FilteredTableViewFX__Group__5"


    // $ANTLR start "rule__FilteredTableViewFX__Group__5__Impl"
    // InternalJavaFXLang.g:2807:1: rule__FilteredTableViewFX__Group__5__Impl : ( ( rule__FilteredTableViewFX__Group_5__0 )? ) ;
    public final void rule__FilteredTableViewFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2811:1: ( ( ( rule__FilteredTableViewFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:2812:1: ( ( rule__FilteredTableViewFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:2812:1: ( ( rule__FilteredTableViewFX__Group_5__0 )? )
            // InternalJavaFXLang.g:2813:2: ( rule__FilteredTableViewFX__Group_5__0 )?
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:2814:2: ( rule__FilteredTableViewFX__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJavaFXLang.g:2814:3: rule__FilteredTableViewFX__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilteredTableViewFX__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilteredTableViewFXAccess().getGroup_5()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__Group__5__Impl"


    // $ANTLR start "rule__FilteredTableViewFX__Group__6"
    // InternalJavaFXLang.g:2822:1: rule__FilteredTableViewFX__Group__6 : rule__FilteredTableViewFX__Group__6__Impl rule__FilteredTableViewFX__Group__7 ;
    public final void rule__FilteredTableViewFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2826:1: ( rule__FilteredTableViewFX__Group__6__Impl rule__FilteredTableViewFX__Group__7 )
            // InternalJavaFXLang.g:2827:2: rule__FilteredTableViewFX__Group__6__Impl rule__FilteredTableViewFX__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__FilteredTableViewFX__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__Group__7();

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
    // $ANTLR end "rule__FilteredTableViewFX__Group__6"


    // $ANTLR start "rule__FilteredTableViewFX__Group__6__Impl"
    // InternalJavaFXLang.g:2834:1: rule__FilteredTableViewFX__Group__6__Impl : ( ( rule__FilteredTableViewFX__Group_6__0 )? ) ;
    public final void rule__FilteredTableViewFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2838:1: ( ( ( rule__FilteredTableViewFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:2839:1: ( ( rule__FilteredTableViewFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:2839:1: ( ( rule__FilteredTableViewFX__Group_6__0 )? )
            // InternalJavaFXLang.g:2840:2: ( rule__FilteredTableViewFX__Group_6__0 )?
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:2841:2: ( rule__FilteredTableViewFX__Group_6__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalJavaFXLang.g:2841:3: rule__FilteredTableViewFX__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilteredTableViewFX__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilteredTableViewFXAccess().getGroup_6()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__Group__6__Impl"


    // $ANTLR start "rule__FilteredTableViewFX__Group__7"
    // InternalJavaFXLang.g:2849:1: rule__FilteredTableViewFX__Group__7 : rule__FilteredTableViewFX__Group__7__Impl ;
    public final void rule__FilteredTableViewFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2853:1: ( rule__FilteredTableViewFX__Group__7__Impl )
            // InternalJavaFXLang.g:2854:2: rule__FilteredTableViewFX__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__Group__7__Impl();

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
    // $ANTLR end "rule__FilteredTableViewFX__Group__7"


    // $ANTLR start "rule__FilteredTableViewFX__Group__7__Impl"
    // InternalJavaFXLang.g:2860:1: rule__FilteredTableViewFX__Group__7__Impl : ( '}' ) ;
    public final void rule__FilteredTableViewFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2864:1: ( ( '}' ) )
            // InternalJavaFXLang.g:2865:1: ( '}' )
            {
            // InternalJavaFXLang.g:2865:1: ( '}' )
            // InternalJavaFXLang.g:2866:2: '}'
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getRightCurlyBracketKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFilteredTableViewFXAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__Group__7__Impl"


    // $ANTLR start "rule__FilteredTableViewFX__Group_3__0"
    // InternalJavaFXLang.g:2876:1: rule__FilteredTableViewFX__Group_3__0 : rule__FilteredTableViewFX__Group_3__0__Impl rule__FilteredTableViewFX__Group_3__1 ;
    public final void rule__FilteredTableViewFX__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2880:1: ( rule__FilteredTableViewFX__Group_3__0__Impl rule__FilteredTableViewFX__Group_3__1 )
            // InternalJavaFXLang.g:2881:2: rule__FilteredTableViewFX__Group_3__0__Impl rule__FilteredTableViewFX__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__FilteredTableViewFX__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__Group_3__1();

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
    // $ANTLR end "rule__FilteredTableViewFX__Group_3__0"


    // $ANTLR start "rule__FilteredTableViewFX__Group_3__0__Impl"
    // InternalJavaFXLang.g:2888:1: rule__FilteredTableViewFX__Group_3__0__Impl : ( 'name:' ) ;
    public final void rule__FilteredTableViewFX__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2892:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:2893:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:2893:1: ( 'name:' )
            // InternalJavaFXLang.g:2894:2: 'name:'
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getNameKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFilteredTableViewFXAccess().getNameKeyword_3_0()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__Group_3__0__Impl"


    // $ANTLR start "rule__FilteredTableViewFX__Group_3__1"
    // InternalJavaFXLang.g:2903:1: rule__FilteredTableViewFX__Group_3__1 : rule__FilteredTableViewFX__Group_3__1__Impl ;
    public final void rule__FilteredTableViewFX__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2907:1: ( rule__FilteredTableViewFX__Group_3__1__Impl )
            // InternalJavaFXLang.g:2908:2: rule__FilteredTableViewFX__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__Group_3__1__Impl();

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
    // $ANTLR end "rule__FilteredTableViewFX__Group_3__1"


    // $ANTLR start "rule__FilteredTableViewFX__Group_3__1__Impl"
    // InternalJavaFXLang.g:2914:1: rule__FilteredTableViewFX__Group_3__1__Impl : ( ( rule__FilteredTableViewFX__NameAssignment_3_1 ) ) ;
    public final void rule__FilteredTableViewFX__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2918:1: ( ( ( rule__FilteredTableViewFX__NameAssignment_3_1 ) ) )
            // InternalJavaFXLang.g:2919:1: ( ( rule__FilteredTableViewFX__NameAssignment_3_1 ) )
            {
            // InternalJavaFXLang.g:2919:1: ( ( rule__FilteredTableViewFX__NameAssignment_3_1 ) )
            // InternalJavaFXLang.g:2920:2: ( rule__FilteredTableViewFX__NameAssignment_3_1 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getNameAssignment_3_1()); 
            // InternalJavaFXLang.g:2921:2: ( rule__FilteredTableViewFX__NameAssignment_3_1 )
            // InternalJavaFXLang.g:2921:3: rule__FilteredTableViewFX__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFilteredTableViewFXAccess().getNameAssignment_3_1()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__Group_3__1__Impl"


    // $ANTLR start "rule__FilteredTableViewFX__Group_4__0"
    // InternalJavaFXLang.g:2930:1: rule__FilteredTableViewFX__Group_4__0 : rule__FilteredTableViewFX__Group_4__0__Impl rule__FilteredTableViewFX__Group_4__1 ;
    public final void rule__FilteredTableViewFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2934:1: ( rule__FilteredTableViewFX__Group_4__0__Impl rule__FilteredTableViewFX__Group_4__1 )
            // InternalJavaFXLang.g:2935:2: rule__FilteredTableViewFX__Group_4__0__Impl rule__FilteredTableViewFX__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__FilteredTableViewFX__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__Group_4__1();

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
    // $ANTLR end "rule__FilteredTableViewFX__Group_4__0"


    // $ANTLR start "rule__FilteredTableViewFX__Group_4__0__Impl"
    // InternalJavaFXLang.g:2942:1: rule__FilteredTableViewFX__Group_4__0__Impl : ( 'usedModel:' ) ;
    public final void rule__FilteredTableViewFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2946:1: ( ( 'usedModel:' ) )
            // InternalJavaFXLang.g:2947:1: ( 'usedModel:' )
            {
            // InternalJavaFXLang.g:2947:1: ( 'usedModel:' )
            // InternalJavaFXLang.g:2948:2: 'usedModel:'
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUsedModelKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getFilteredTableViewFXAccess().getUsedModelKeyword_4_0()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__Group_4__0__Impl"


    // $ANTLR start "rule__FilteredTableViewFX__Group_4__1"
    // InternalJavaFXLang.g:2957:1: rule__FilteredTableViewFX__Group_4__1 : rule__FilteredTableViewFX__Group_4__1__Impl ;
    public final void rule__FilteredTableViewFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2961:1: ( rule__FilteredTableViewFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:2962:2: rule__FilteredTableViewFX__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__Group_4__1__Impl();

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
    // $ANTLR end "rule__FilteredTableViewFX__Group_4__1"


    // $ANTLR start "rule__FilteredTableViewFX__Group_4__1__Impl"
    // InternalJavaFXLang.g:2968:1: rule__FilteredTableViewFX__Group_4__1__Impl : ( ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 ) ) ;
    public final void rule__FilteredTableViewFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2972:1: ( ( ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:2973:1: ( ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:2973:1: ( ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 ) )
            // InternalJavaFXLang.g:2974:2: ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUsedModelAssignment_4_1()); 
            // InternalJavaFXLang.g:2975:2: ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 )
            // InternalJavaFXLang.g:2975:3: rule__FilteredTableViewFX__UsedModelAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__UsedModelAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFilteredTableViewFXAccess().getUsedModelAssignment_4_1()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__Group_4__1__Impl"


    // $ANTLR start "rule__FilteredTableViewFX__Group_5__0"
    // InternalJavaFXLang.g:2984:1: rule__FilteredTableViewFX__Group_5__0 : rule__FilteredTableViewFX__Group_5__0__Impl rule__FilteredTableViewFX__Group_5__1 ;
    public final void rule__FilteredTableViewFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2988:1: ( rule__FilteredTableViewFX__Group_5__0__Impl rule__FilteredTableViewFX__Group_5__1 )
            // InternalJavaFXLang.g:2989:2: rule__FilteredTableViewFX__Group_5__0__Impl rule__FilteredTableViewFX__Group_5__1
            {
            pushFollow(FOLLOW_22);
            rule__FilteredTableViewFX__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__Group_5__1();

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
    // $ANTLR end "rule__FilteredTableViewFX__Group_5__0"


    // $ANTLR start "rule__FilteredTableViewFX__Group_5__0__Impl"
    // InternalJavaFXLang.g:2996:1: rule__FilteredTableViewFX__Group_5__0__Impl : ( 'usedFilter:' ) ;
    public final void rule__FilteredTableViewFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3000:1: ( ( 'usedFilter:' ) )
            // InternalJavaFXLang.g:3001:1: ( 'usedFilter:' )
            {
            // InternalJavaFXLang.g:3001:1: ( 'usedFilter:' )
            // InternalJavaFXLang.g:3002:2: 'usedFilter:'
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUsedFilterKeyword_5_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getFilteredTableViewFXAccess().getUsedFilterKeyword_5_0()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__Group_5__0__Impl"


    // $ANTLR start "rule__FilteredTableViewFX__Group_5__1"
    // InternalJavaFXLang.g:3011:1: rule__FilteredTableViewFX__Group_5__1 : rule__FilteredTableViewFX__Group_5__1__Impl ;
    public final void rule__FilteredTableViewFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3015:1: ( rule__FilteredTableViewFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:3016:2: rule__FilteredTableViewFX__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__Group_5__1__Impl();

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
    // $ANTLR end "rule__FilteredTableViewFX__Group_5__1"


    // $ANTLR start "rule__FilteredTableViewFX__Group_5__1__Impl"
    // InternalJavaFXLang.g:3022:1: rule__FilteredTableViewFX__Group_5__1__Impl : ( ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 ) ) ;
    public final void rule__FilteredTableViewFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3026:1: ( ( ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:3027:1: ( ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:3027:1: ( ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 ) )
            // InternalJavaFXLang.g:3028:2: ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUseFilterAssignment_5_1()); 
            // InternalJavaFXLang.g:3029:2: ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 )
            // InternalJavaFXLang.g:3029:3: rule__FilteredTableViewFX__UseFilterAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__UseFilterAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFilteredTableViewFXAccess().getUseFilterAssignment_5_1()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__Group_5__1__Impl"


    // $ANTLR start "rule__FilteredTableViewFX__Group_6__0"
    // InternalJavaFXLang.g:3038:1: rule__FilteredTableViewFX__Group_6__0 : rule__FilteredTableViewFX__Group_6__0__Impl rule__FilteredTableViewFX__Group_6__1 ;
    public final void rule__FilteredTableViewFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3042:1: ( rule__FilteredTableViewFX__Group_6__0__Impl rule__FilteredTableViewFX__Group_6__1 )
            // InternalJavaFXLang.g:3043:2: rule__FilteredTableViewFX__Group_6__0__Impl rule__FilteredTableViewFX__Group_6__1
            {
            pushFollow(FOLLOW_28);
            rule__FilteredTableViewFX__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__Group_6__1();

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
    // $ANTLR end "rule__FilteredTableViewFX__Group_6__0"


    // $ANTLR start "rule__FilteredTableViewFX__Group_6__0__Impl"
    // InternalJavaFXLang.g:3050:1: rule__FilteredTableViewFX__Group_6__0__Impl : ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 ) ) ;
    public final void rule__FilteredTableViewFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3054:1: ( ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 ) ) )
            // InternalJavaFXLang.g:3055:1: ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 ) )
            {
            // InternalJavaFXLang.g:3055:1: ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 ) )
            // InternalJavaFXLang.g:3056:2: ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getColumnsAssignment_6_0()); 
            // InternalJavaFXLang.g:3057:2: ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 )
            // InternalJavaFXLang.g:3057:3: rule__FilteredTableViewFX__ColumnsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__ColumnsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getFilteredTableViewFXAccess().getColumnsAssignment_6_0()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__Group_6__0__Impl"


    // $ANTLR start "rule__FilteredTableViewFX__Group_6__1"
    // InternalJavaFXLang.g:3065:1: rule__FilteredTableViewFX__Group_6__1 : rule__FilteredTableViewFX__Group_6__1__Impl ;
    public final void rule__FilteredTableViewFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3069:1: ( rule__FilteredTableViewFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:3070:2: rule__FilteredTableViewFX__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilteredTableViewFX__Group_6__1__Impl();

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
    // $ANTLR end "rule__FilteredTableViewFX__Group_6__1"


    // $ANTLR start "rule__FilteredTableViewFX__Group_6__1__Impl"
    // InternalJavaFXLang.g:3076:1: rule__FilteredTableViewFX__Group_6__1__Impl : ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )* ) ;
    public final void rule__FilteredTableViewFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3080:1: ( ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )* ) )
            // InternalJavaFXLang.g:3081:1: ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )* )
            {
            // InternalJavaFXLang.g:3081:1: ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )* )
            // InternalJavaFXLang.g:3082:2: ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )*
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getColumnsAssignment_6_1()); 
            // InternalJavaFXLang.g:3083:2: ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==51) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalJavaFXLang.g:3083:3: rule__FilteredTableViewFX__ColumnsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__FilteredTableViewFX__ColumnsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getFilteredTableViewFXAccess().getColumnsAssignment_6_1()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__Group_6__1__Impl"


    // $ANTLR start "rule__DerivedBean__Group__0"
    // InternalJavaFXLang.g:3092:1: rule__DerivedBean__Group__0 : rule__DerivedBean__Group__0__Impl rule__DerivedBean__Group__1 ;
    public final void rule__DerivedBean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3096:1: ( rule__DerivedBean__Group__0__Impl rule__DerivedBean__Group__1 )
            // InternalJavaFXLang.g:3097:2: rule__DerivedBean__Group__0__Impl rule__DerivedBean__Group__1
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
    // InternalJavaFXLang.g:3104:1: rule__DerivedBean__Group__0__Impl : ( () ) ;
    public final void rule__DerivedBean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3108:1: ( ( () ) )
            // InternalJavaFXLang.g:3109:1: ( () )
            {
            // InternalJavaFXLang.g:3109:1: ( () )
            // InternalJavaFXLang.g:3110:2: ()
            {
             before(grammarAccess.getDerivedBeanAccess().getDerivedBeanAction_0()); 
            // InternalJavaFXLang.g:3111:2: ()
            // InternalJavaFXLang.g:3111:3: 
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
    // InternalJavaFXLang.g:3119:1: rule__DerivedBean__Group__1 : rule__DerivedBean__Group__1__Impl rule__DerivedBean__Group__2 ;
    public final void rule__DerivedBean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3123:1: ( rule__DerivedBean__Group__1__Impl rule__DerivedBean__Group__2 )
            // InternalJavaFXLang.g:3124:2: rule__DerivedBean__Group__1__Impl rule__DerivedBean__Group__2
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
    // InternalJavaFXLang.g:3131:1: rule__DerivedBean__Group__1__Impl : ( 'class' ) ;
    public final void rule__DerivedBean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3135:1: ( ( 'class' ) )
            // InternalJavaFXLang.g:3136:1: ( 'class' )
            {
            // InternalJavaFXLang.g:3136:1: ( 'class' )
            // InternalJavaFXLang.g:3137:2: 'class'
            {
             before(grammarAccess.getDerivedBeanAccess().getClassKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalJavaFXLang.g:3146:1: rule__DerivedBean__Group__2 : rule__DerivedBean__Group__2__Impl rule__DerivedBean__Group__3 ;
    public final void rule__DerivedBean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3150:1: ( rule__DerivedBean__Group__2__Impl rule__DerivedBean__Group__3 )
            // InternalJavaFXLang.g:3151:2: rule__DerivedBean__Group__2__Impl rule__DerivedBean__Group__3
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
    // InternalJavaFXLang.g:3158:1: rule__DerivedBean__Group__2__Impl : ( ( rule__DerivedBean__NameAssignment_2 ) ) ;
    public final void rule__DerivedBean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3162:1: ( ( ( rule__DerivedBean__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:3163:1: ( ( rule__DerivedBean__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:3163:1: ( ( rule__DerivedBean__NameAssignment_2 ) )
            // InternalJavaFXLang.g:3164:2: ( rule__DerivedBean__NameAssignment_2 )
            {
             before(grammarAccess.getDerivedBeanAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:3165:2: ( rule__DerivedBean__NameAssignment_2 )
            // InternalJavaFXLang.g:3165:3: rule__DerivedBean__NameAssignment_2
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
    // InternalJavaFXLang.g:3173:1: rule__DerivedBean__Group__3 : rule__DerivedBean__Group__3__Impl rule__DerivedBean__Group__4 ;
    public final void rule__DerivedBean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3177:1: ( rule__DerivedBean__Group__3__Impl rule__DerivedBean__Group__4 )
            // InternalJavaFXLang.g:3178:2: rule__DerivedBean__Group__3__Impl rule__DerivedBean__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalJavaFXLang.g:3185:1: rule__DerivedBean__Group__3__Impl : ( '{' ) ;
    public final void rule__DerivedBean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3189:1: ( ( '{' ) )
            // InternalJavaFXLang.g:3190:1: ( '{' )
            {
            // InternalJavaFXLang.g:3190:1: ( '{' )
            // InternalJavaFXLang.g:3191:2: '{'
            {
             before(grammarAccess.getDerivedBeanAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalJavaFXLang.g:3200:1: rule__DerivedBean__Group__4 : rule__DerivedBean__Group__4__Impl rule__DerivedBean__Group__5 ;
    public final void rule__DerivedBean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3204:1: ( rule__DerivedBean__Group__4__Impl rule__DerivedBean__Group__5 )
            // InternalJavaFXLang.g:3205:2: rule__DerivedBean__Group__4__Impl rule__DerivedBean__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalJavaFXLang.g:3212:1: rule__DerivedBean__Group__4__Impl : ( ( rule__DerivedBean__Group_4__0 ) ) ;
    public final void rule__DerivedBean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3216:1: ( ( ( rule__DerivedBean__Group_4__0 ) ) )
            // InternalJavaFXLang.g:3217:1: ( ( rule__DerivedBean__Group_4__0 ) )
            {
            // InternalJavaFXLang.g:3217:1: ( ( rule__DerivedBean__Group_4__0 ) )
            // InternalJavaFXLang.g:3218:2: ( rule__DerivedBean__Group_4__0 )
            {
             before(grammarAccess.getDerivedBeanAccess().getGroup_4()); 
            // InternalJavaFXLang.g:3219:2: ( rule__DerivedBean__Group_4__0 )
            // InternalJavaFXLang.g:3219:3: rule__DerivedBean__Group_4__0
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
    // InternalJavaFXLang.g:3227:1: rule__DerivedBean__Group__5 : rule__DerivedBean__Group__5__Impl rule__DerivedBean__Group__6 ;
    public final void rule__DerivedBean__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3231:1: ( rule__DerivedBean__Group__5__Impl rule__DerivedBean__Group__6 )
            // InternalJavaFXLang.g:3232:2: rule__DerivedBean__Group__5__Impl rule__DerivedBean__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalJavaFXLang.g:3239:1: rule__DerivedBean__Group__5__Impl : ( ( rule__DerivedBean__Group_5__0 )? ) ;
    public final void rule__DerivedBean__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3243:1: ( ( ( rule__DerivedBean__Group_5__0 )? ) )
            // InternalJavaFXLang.g:3244:1: ( ( rule__DerivedBean__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:3244:1: ( ( rule__DerivedBean__Group_5__0 )? )
            // InternalJavaFXLang.g:3245:2: ( rule__DerivedBean__Group_5__0 )?
            {
             before(grammarAccess.getDerivedBeanAccess().getGroup_5()); 
            // InternalJavaFXLang.g:3246:2: ( rule__DerivedBean__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalJavaFXLang.g:3246:3: rule__DerivedBean__Group_5__0
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
    // InternalJavaFXLang.g:3254:1: rule__DerivedBean__Group__6 : rule__DerivedBean__Group__6__Impl ;
    public final void rule__DerivedBean__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3258:1: ( rule__DerivedBean__Group__6__Impl )
            // InternalJavaFXLang.g:3259:2: rule__DerivedBean__Group__6__Impl
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
    // InternalJavaFXLang.g:3265:1: rule__DerivedBean__Group__6__Impl : ( '}' ) ;
    public final void rule__DerivedBean__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3269:1: ( ( '}' ) )
            // InternalJavaFXLang.g:3270:1: ( '}' )
            {
            // InternalJavaFXLang.g:3270:1: ( '}' )
            // InternalJavaFXLang.g:3271:2: '}'
            {
             before(grammarAccess.getDerivedBeanAccess().getRightCurlyBracketKeyword_6()); 
            match(input,28,FOLLOW_2); 
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
    // InternalJavaFXLang.g:3281:1: rule__DerivedBean__Group_4__0 : rule__DerivedBean__Group_4__0__Impl rule__DerivedBean__Group_4__1 ;
    public final void rule__DerivedBean__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3285:1: ( rule__DerivedBean__Group_4__0__Impl rule__DerivedBean__Group_4__1 )
            // InternalJavaFXLang.g:3286:2: rule__DerivedBean__Group_4__0__Impl rule__DerivedBean__Group_4__1
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
    // InternalJavaFXLang.g:3293:1: rule__DerivedBean__Group_4__0__Impl : ( 'instanceType:' ) ;
    public final void rule__DerivedBean__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3297:1: ( ( 'instanceType:' ) )
            // InternalJavaFXLang.g:3298:1: ( 'instanceType:' )
            {
            // InternalJavaFXLang.g:3298:1: ( 'instanceType:' )
            // InternalJavaFXLang.g:3299:2: 'instanceType:'
            {
             before(grammarAccess.getDerivedBeanAccess().getInstanceTypeKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalJavaFXLang.g:3308:1: rule__DerivedBean__Group_4__1 : rule__DerivedBean__Group_4__1__Impl ;
    public final void rule__DerivedBean__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3312:1: ( rule__DerivedBean__Group_4__1__Impl )
            // InternalJavaFXLang.g:3313:2: rule__DerivedBean__Group_4__1__Impl
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
    // InternalJavaFXLang.g:3319:1: rule__DerivedBean__Group_4__1__Impl : ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) ) ;
    public final void rule__DerivedBean__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3323:1: ( ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:3324:1: ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:3324:1: ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) )
            // InternalJavaFXLang.g:3325:2: ( rule__DerivedBean__InstanceTypeAssignment_4_1 )
            {
             before(grammarAccess.getDerivedBeanAccess().getInstanceTypeAssignment_4_1()); 
            // InternalJavaFXLang.g:3326:2: ( rule__DerivedBean__InstanceTypeAssignment_4_1 )
            // InternalJavaFXLang.g:3326:3: rule__DerivedBean__InstanceTypeAssignment_4_1
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
    // InternalJavaFXLang.g:3335:1: rule__DerivedBean__Group_5__0 : rule__DerivedBean__Group_5__0__Impl rule__DerivedBean__Group_5__1 ;
    public final void rule__DerivedBean__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3339:1: ( rule__DerivedBean__Group_5__0__Impl rule__DerivedBean__Group_5__1 )
            // InternalJavaFXLang.g:3340:2: rule__DerivedBean__Group_5__0__Impl rule__DerivedBean__Group_5__1
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
    // InternalJavaFXLang.g:3347:1: rule__DerivedBean__Group_5__0__Impl : ( ( rule__DerivedBean__AttributesAssignment_5_0 ) ) ;
    public final void rule__DerivedBean__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3351:1: ( ( ( rule__DerivedBean__AttributesAssignment_5_0 ) ) )
            // InternalJavaFXLang.g:3352:1: ( ( rule__DerivedBean__AttributesAssignment_5_0 ) )
            {
            // InternalJavaFXLang.g:3352:1: ( ( rule__DerivedBean__AttributesAssignment_5_0 ) )
            // InternalJavaFXLang.g:3353:2: ( rule__DerivedBean__AttributesAssignment_5_0 )
            {
             before(grammarAccess.getDerivedBeanAccess().getAttributesAssignment_5_0()); 
            // InternalJavaFXLang.g:3354:2: ( rule__DerivedBean__AttributesAssignment_5_0 )
            // InternalJavaFXLang.g:3354:3: rule__DerivedBean__AttributesAssignment_5_0
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
    // InternalJavaFXLang.g:3362:1: rule__DerivedBean__Group_5__1 : rule__DerivedBean__Group_5__1__Impl ;
    public final void rule__DerivedBean__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3366:1: ( rule__DerivedBean__Group_5__1__Impl )
            // InternalJavaFXLang.g:3367:2: rule__DerivedBean__Group_5__1__Impl
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
    // InternalJavaFXLang.g:3373:1: rule__DerivedBean__Group_5__1__Impl : ( ( rule__DerivedBean__AttributesAssignment_5_1 )* ) ;
    public final void rule__DerivedBean__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3377:1: ( ( ( rule__DerivedBean__AttributesAssignment_5_1 )* ) )
            // InternalJavaFXLang.g:3378:1: ( ( rule__DerivedBean__AttributesAssignment_5_1 )* )
            {
            // InternalJavaFXLang.g:3378:1: ( ( rule__DerivedBean__AttributesAssignment_5_1 )* )
            // InternalJavaFXLang.g:3379:2: ( rule__DerivedBean__AttributesAssignment_5_1 )*
            {
             before(grammarAccess.getDerivedBeanAccess().getAttributesAssignment_5_1()); 
            // InternalJavaFXLang.g:3380:2: ( rule__DerivedBean__AttributesAssignment_5_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_ID)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalJavaFXLang.g:3380:3: rule__DerivedBean__AttributesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__DerivedBean__AttributesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalJavaFXLang.g:3389:1: rule__Bean__Group__0 : rule__Bean__Group__0__Impl rule__Bean__Group__1 ;
    public final void rule__Bean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3393:1: ( rule__Bean__Group__0__Impl rule__Bean__Group__1 )
            // InternalJavaFXLang.g:3394:2: rule__Bean__Group__0__Impl rule__Bean__Group__1
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
    // InternalJavaFXLang.g:3401:1: rule__Bean__Group__0__Impl : ( () ) ;
    public final void rule__Bean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3405:1: ( ( () ) )
            // InternalJavaFXLang.g:3406:1: ( () )
            {
            // InternalJavaFXLang.g:3406:1: ( () )
            // InternalJavaFXLang.g:3407:2: ()
            {
             before(grammarAccess.getBeanAccess().getBeanAction_0()); 
            // InternalJavaFXLang.g:3408:2: ()
            // InternalJavaFXLang.g:3408:3: 
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
    // InternalJavaFXLang.g:3416:1: rule__Bean__Group__1 : rule__Bean__Group__1__Impl rule__Bean__Group__2 ;
    public final void rule__Bean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3420:1: ( rule__Bean__Group__1__Impl rule__Bean__Group__2 )
            // InternalJavaFXLang.g:3421:2: rule__Bean__Group__1__Impl rule__Bean__Group__2
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
    // InternalJavaFXLang.g:3428:1: rule__Bean__Group__1__Impl : ( 'class' ) ;
    public final void rule__Bean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3432:1: ( ( 'class' ) )
            // InternalJavaFXLang.g:3433:1: ( 'class' )
            {
            // InternalJavaFXLang.g:3433:1: ( 'class' )
            // InternalJavaFXLang.g:3434:2: 'class'
            {
             before(grammarAccess.getBeanAccess().getClassKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalJavaFXLang.g:3443:1: rule__Bean__Group__2 : rule__Bean__Group__2__Impl rule__Bean__Group__3 ;
    public final void rule__Bean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3447:1: ( rule__Bean__Group__2__Impl rule__Bean__Group__3 )
            // InternalJavaFXLang.g:3448:2: rule__Bean__Group__2__Impl rule__Bean__Group__3
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
    // InternalJavaFXLang.g:3455:1: rule__Bean__Group__2__Impl : ( ( rule__Bean__NameAssignment_2 ) ) ;
    public final void rule__Bean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3459:1: ( ( ( rule__Bean__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:3460:1: ( ( rule__Bean__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:3460:1: ( ( rule__Bean__NameAssignment_2 ) )
            // InternalJavaFXLang.g:3461:2: ( rule__Bean__NameAssignment_2 )
            {
             before(grammarAccess.getBeanAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:3462:2: ( rule__Bean__NameAssignment_2 )
            // InternalJavaFXLang.g:3462:3: rule__Bean__NameAssignment_2
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
    // InternalJavaFXLang.g:3470:1: rule__Bean__Group__3 : rule__Bean__Group__3__Impl rule__Bean__Group__4 ;
    public final void rule__Bean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3474:1: ( rule__Bean__Group__3__Impl rule__Bean__Group__4 )
            // InternalJavaFXLang.g:3475:2: rule__Bean__Group__3__Impl rule__Bean__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalJavaFXLang.g:3482:1: rule__Bean__Group__3__Impl : ( '{' ) ;
    public final void rule__Bean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3486:1: ( ( '{' ) )
            // InternalJavaFXLang.g:3487:1: ( '{' )
            {
            // InternalJavaFXLang.g:3487:1: ( '{' )
            // InternalJavaFXLang.g:3488:2: '{'
            {
             before(grammarAccess.getBeanAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalJavaFXLang.g:3497:1: rule__Bean__Group__4 : rule__Bean__Group__4__Impl rule__Bean__Group__5 ;
    public final void rule__Bean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3501:1: ( rule__Bean__Group__4__Impl rule__Bean__Group__5 )
            // InternalJavaFXLang.g:3502:2: rule__Bean__Group__4__Impl rule__Bean__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalJavaFXLang.g:3509:1: rule__Bean__Group__4__Impl : ( ( rule__Bean__Group_4__0 )? ) ;
    public final void rule__Bean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3513:1: ( ( ( rule__Bean__Group_4__0 )? ) )
            // InternalJavaFXLang.g:3514:1: ( ( rule__Bean__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:3514:1: ( ( rule__Bean__Group_4__0 )? )
            // InternalJavaFXLang.g:3515:2: ( rule__Bean__Group_4__0 )?
            {
             before(grammarAccess.getBeanAccess().getGroup_4()); 
            // InternalJavaFXLang.g:3516:2: ( rule__Bean__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_ID)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalJavaFXLang.g:3516:3: rule__Bean__Group_4__0
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
    // InternalJavaFXLang.g:3524:1: rule__Bean__Group__5 : rule__Bean__Group__5__Impl ;
    public final void rule__Bean__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3528:1: ( rule__Bean__Group__5__Impl )
            // InternalJavaFXLang.g:3529:2: rule__Bean__Group__5__Impl
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
    // InternalJavaFXLang.g:3535:1: rule__Bean__Group__5__Impl : ( '}' ) ;
    public final void rule__Bean__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3539:1: ( ( '}' ) )
            // InternalJavaFXLang.g:3540:1: ( '}' )
            {
            // InternalJavaFXLang.g:3540:1: ( '}' )
            // InternalJavaFXLang.g:3541:2: '}'
            {
             before(grammarAccess.getBeanAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalJavaFXLang.g:3551:1: rule__Bean__Group_4__0 : rule__Bean__Group_4__0__Impl rule__Bean__Group_4__1 ;
    public final void rule__Bean__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3555:1: ( rule__Bean__Group_4__0__Impl rule__Bean__Group_4__1 )
            // InternalJavaFXLang.g:3556:2: rule__Bean__Group_4__0__Impl rule__Bean__Group_4__1
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
    // InternalJavaFXLang.g:3563:1: rule__Bean__Group_4__0__Impl : ( ( rule__Bean__AttributesAssignment_4_0 ) ) ;
    public final void rule__Bean__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3567:1: ( ( ( rule__Bean__AttributesAssignment_4_0 ) ) )
            // InternalJavaFXLang.g:3568:1: ( ( rule__Bean__AttributesAssignment_4_0 ) )
            {
            // InternalJavaFXLang.g:3568:1: ( ( rule__Bean__AttributesAssignment_4_0 ) )
            // InternalJavaFXLang.g:3569:2: ( rule__Bean__AttributesAssignment_4_0 )
            {
             before(grammarAccess.getBeanAccess().getAttributesAssignment_4_0()); 
            // InternalJavaFXLang.g:3570:2: ( rule__Bean__AttributesAssignment_4_0 )
            // InternalJavaFXLang.g:3570:3: rule__Bean__AttributesAssignment_4_0
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
    // InternalJavaFXLang.g:3578:1: rule__Bean__Group_4__1 : rule__Bean__Group_4__1__Impl ;
    public final void rule__Bean__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3582:1: ( rule__Bean__Group_4__1__Impl )
            // InternalJavaFXLang.g:3583:2: rule__Bean__Group_4__1__Impl
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
    // InternalJavaFXLang.g:3589:1: rule__Bean__Group_4__1__Impl : ( ( rule__Bean__AttributesAssignment_4_1 )* ) ;
    public final void rule__Bean__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3593:1: ( ( ( rule__Bean__AttributesAssignment_4_1 )* ) )
            // InternalJavaFXLang.g:3594:1: ( ( rule__Bean__AttributesAssignment_4_1 )* )
            {
            // InternalJavaFXLang.g:3594:1: ( ( rule__Bean__AttributesAssignment_4_1 )* )
            // InternalJavaFXLang.g:3595:2: ( rule__Bean__AttributesAssignment_4_1 )*
            {
             before(grammarAccess.getBeanAccess().getAttributesAssignment_4_1()); 
            // InternalJavaFXLang.g:3596:2: ( rule__Bean__AttributesAssignment_4_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_ID)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalJavaFXLang.g:3596:3: rule__Bean__AttributesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Bean__AttributesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalJavaFXLang.g:3605:1: rule__TableViewFX__Group__0 : rule__TableViewFX__Group__0__Impl rule__TableViewFX__Group__1 ;
    public final void rule__TableViewFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3609:1: ( rule__TableViewFX__Group__0__Impl rule__TableViewFX__Group__1 )
            // InternalJavaFXLang.g:3610:2: rule__TableViewFX__Group__0__Impl rule__TableViewFX__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalJavaFXLang.g:3617:1: rule__TableViewFX__Group__0__Impl : ( () ) ;
    public final void rule__TableViewFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3621:1: ( ( () ) )
            // InternalJavaFXLang.g:3622:1: ( () )
            {
            // InternalJavaFXLang.g:3622:1: ( () )
            // InternalJavaFXLang.g:3623:2: ()
            {
             before(grammarAccess.getTableViewFXAccess().getTableViewFXAction_0()); 
            // InternalJavaFXLang.g:3624:2: ()
            // InternalJavaFXLang.g:3624:3: 
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
    // InternalJavaFXLang.g:3632:1: rule__TableViewFX__Group__1 : rule__TableViewFX__Group__1__Impl rule__TableViewFX__Group__2 ;
    public final void rule__TableViewFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3636:1: ( rule__TableViewFX__Group__1__Impl rule__TableViewFX__Group__2 )
            // InternalJavaFXLang.g:3637:2: rule__TableViewFX__Group__1__Impl rule__TableViewFX__Group__2
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
    // InternalJavaFXLang.g:3644:1: rule__TableViewFX__Group__1__Impl : ( 'TableView' ) ;
    public final void rule__TableViewFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3648:1: ( ( 'TableView' ) )
            // InternalJavaFXLang.g:3649:1: ( 'TableView' )
            {
            // InternalJavaFXLang.g:3649:1: ( 'TableView' )
            // InternalJavaFXLang.g:3650:2: 'TableView'
            {
             before(grammarAccess.getTableViewFXAccess().getTableViewKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalJavaFXLang.g:3659:1: rule__TableViewFX__Group__2 : rule__TableViewFX__Group__2__Impl rule__TableViewFX__Group__3 ;
    public final void rule__TableViewFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3663:1: ( rule__TableViewFX__Group__2__Impl rule__TableViewFX__Group__3 )
            // InternalJavaFXLang.g:3664:2: rule__TableViewFX__Group__2__Impl rule__TableViewFX__Group__3
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
    // InternalJavaFXLang.g:3671:1: rule__TableViewFX__Group__2__Impl : ( '{' ) ;
    public final void rule__TableViewFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3675:1: ( ( '{' ) )
            // InternalJavaFXLang.g:3676:1: ( '{' )
            {
            // InternalJavaFXLang.g:3676:1: ( '{' )
            // InternalJavaFXLang.g:3677:2: '{'
            {
             before(grammarAccess.getTableViewFXAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalJavaFXLang.g:3686:1: rule__TableViewFX__Group__3 : rule__TableViewFX__Group__3__Impl rule__TableViewFX__Group__4 ;
    public final void rule__TableViewFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3690:1: ( rule__TableViewFX__Group__3__Impl rule__TableViewFX__Group__4 )
            // InternalJavaFXLang.g:3691:2: rule__TableViewFX__Group__3__Impl rule__TableViewFX__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalJavaFXLang.g:3698:1: rule__TableViewFX__Group__3__Impl : ( ( rule__TableViewFX__Group_3__0 ) ) ;
    public final void rule__TableViewFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3702:1: ( ( ( rule__TableViewFX__Group_3__0 ) ) )
            // InternalJavaFXLang.g:3703:1: ( ( rule__TableViewFX__Group_3__0 ) )
            {
            // InternalJavaFXLang.g:3703:1: ( ( rule__TableViewFX__Group_3__0 ) )
            // InternalJavaFXLang.g:3704:2: ( rule__TableViewFX__Group_3__0 )
            {
             before(grammarAccess.getTableViewFXAccess().getGroup_3()); 
            // InternalJavaFXLang.g:3705:2: ( rule__TableViewFX__Group_3__0 )
            // InternalJavaFXLang.g:3705:3: rule__TableViewFX__Group_3__0
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
    // InternalJavaFXLang.g:3713:1: rule__TableViewFX__Group__4 : rule__TableViewFX__Group__4__Impl rule__TableViewFX__Group__5 ;
    public final void rule__TableViewFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3717:1: ( rule__TableViewFX__Group__4__Impl rule__TableViewFX__Group__5 )
            // InternalJavaFXLang.g:3718:2: rule__TableViewFX__Group__4__Impl rule__TableViewFX__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalJavaFXLang.g:3725:1: rule__TableViewFX__Group__4__Impl : ( ( rule__TableViewFX__Group_4__0 )? ) ;
    public final void rule__TableViewFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3729:1: ( ( ( rule__TableViewFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:3730:1: ( ( rule__TableViewFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:3730:1: ( ( rule__TableViewFX__Group_4__0 )? )
            // InternalJavaFXLang.g:3731:2: ( rule__TableViewFX__Group_4__0 )?
            {
             before(grammarAccess.getTableViewFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:3732:2: ( rule__TableViewFX__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalJavaFXLang.g:3732:3: rule__TableViewFX__Group_4__0
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
    // InternalJavaFXLang.g:3740:1: rule__TableViewFX__Group__5 : rule__TableViewFX__Group__5__Impl rule__TableViewFX__Group__6 ;
    public final void rule__TableViewFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3744:1: ( rule__TableViewFX__Group__5__Impl rule__TableViewFX__Group__6 )
            // InternalJavaFXLang.g:3745:2: rule__TableViewFX__Group__5__Impl rule__TableViewFX__Group__6
            {
            pushFollow(FOLLOW_34);
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
    // InternalJavaFXLang.g:3752:1: rule__TableViewFX__Group__5__Impl : ( ( rule__TableViewFX__Group_5__0 )? ) ;
    public final void rule__TableViewFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3756:1: ( ( ( rule__TableViewFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:3757:1: ( ( rule__TableViewFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:3757:1: ( ( rule__TableViewFX__Group_5__0 )? )
            // InternalJavaFXLang.g:3758:2: ( rule__TableViewFX__Group_5__0 )?
            {
             before(grammarAccess.getTableViewFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:3759:2: ( rule__TableViewFX__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalJavaFXLang.g:3759:3: rule__TableViewFX__Group_5__0
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
    // InternalJavaFXLang.g:3767:1: rule__TableViewFX__Group__6 : rule__TableViewFX__Group__6__Impl ;
    public final void rule__TableViewFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3771:1: ( rule__TableViewFX__Group__6__Impl )
            // InternalJavaFXLang.g:3772:2: rule__TableViewFX__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group__6__Impl();

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
    // InternalJavaFXLang.g:3778:1: rule__TableViewFX__Group__6__Impl : ( '}' ) ;
    public final void rule__TableViewFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3782:1: ( ( '}' ) )
            // InternalJavaFXLang.g:3783:1: ( '}' )
            {
            // InternalJavaFXLang.g:3783:1: ( '}' )
            // InternalJavaFXLang.g:3784:2: '}'
            {
             before(grammarAccess.getTableViewFXAccess().getRightCurlyBracketKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTableViewFXAccess().getRightCurlyBracketKeyword_6()); 

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


    // $ANTLR start "rule__TableViewFX__Group_3__0"
    // InternalJavaFXLang.g:3794:1: rule__TableViewFX__Group_3__0 : rule__TableViewFX__Group_3__0__Impl rule__TableViewFX__Group_3__1 ;
    public final void rule__TableViewFX__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3798:1: ( rule__TableViewFX__Group_3__0__Impl rule__TableViewFX__Group_3__1 )
            // InternalJavaFXLang.g:3799:2: rule__TableViewFX__Group_3__0__Impl rule__TableViewFX__Group_3__1
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
    // InternalJavaFXLang.g:3806:1: rule__TableViewFX__Group_3__0__Impl : ( 'name:' ) ;
    public final void rule__TableViewFX__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3810:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:3811:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:3811:1: ( 'name:' )
            // InternalJavaFXLang.g:3812:2: 'name:'
            {
             before(grammarAccess.getTableViewFXAccess().getNameKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalJavaFXLang.g:3821:1: rule__TableViewFX__Group_3__1 : rule__TableViewFX__Group_3__1__Impl ;
    public final void rule__TableViewFX__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3825:1: ( rule__TableViewFX__Group_3__1__Impl )
            // InternalJavaFXLang.g:3826:2: rule__TableViewFX__Group_3__1__Impl
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
    // InternalJavaFXLang.g:3832:1: rule__TableViewFX__Group_3__1__Impl : ( ( rule__TableViewFX__NameAssignment_3_1 ) ) ;
    public final void rule__TableViewFX__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3836:1: ( ( ( rule__TableViewFX__NameAssignment_3_1 ) ) )
            // InternalJavaFXLang.g:3837:1: ( ( rule__TableViewFX__NameAssignment_3_1 ) )
            {
            // InternalJavaFXLang.g:3837:1: ( ( rule__TableViewFX__NameAssignment_3_1 ) )
            // InternalJavaFXLang.g:3838:2: ( rule__TableViewFX__NameAssignment_3_1 )
            {
             before(grammarAccess.getTableViewFXAccess().getNameAssignment_3_1()); 
            // InternalJavaFXLang.g:3839:2: ( rule__TableViewFX__NameAssignment_3_1 )
            // InternalJavaFXLang.g:3839:3: rule__TableViewFX__NameAssignment_3_1
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
    // InternalJavaFXLang.g:3848:1: rule__TableViewFX__Group_4__0 : rule__TableViewFX__Group_4__0__Impl rule__TableViewFX__Group_4__1 ;
    public final void rule__TableViewFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3852:1: ( rule__TableViewFX__Group_4__0__Impl rule__TableViewFX__Group_4__1 )
            // InternalJavaFXLang.g:3853:2: rule__TableViewFX__Group_4__0__Impl rule__TableViewFX__Group_4__1
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
    // InternalJavaFXLang.g:3860:1: rule__TableViewFX__Group_4__0__Impl : ( 'usedModel:' ) ;
    public final void rule__TableViewFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3864:1: ( ( 'usedModel:' ) )
            // InternalJavaFXLang.g:3865:1: ( 'usedModel:' )
            {
            // InternalJavaFXLang.g:3865:1: ( 'usedModel:' )
            // InternalJavaFXLang.g:3866:2: 'usedModel:'
            {
             before(grammarAccess.getTableViewFXAccess().getUsedModelKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalJavaFXLang.g:3875:1: rule__TableViewFX__Group_4__1 : rule__TableViewFX__Group_4__1__Impl ;
    public final void rule__TableViewFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3879:1: ( rule__TableViewFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:3880:2: rule__TableViewFX__Group_4__1__Impl
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
    // InternalJavaFXLang.g:3886:1: rule__TableViewFX__Group_4__1__Impl : ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) ) ;
    public final void rule__TableViewFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3890:1: ( ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:3891:1: ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:3891:1: ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) )
            // InternalJavaFXLang.g:3892:2: ( rule__TableViewFX__UsedModelAssignment_4_1 )
            {
             before(grammarAccess.getTableViewFXAccess().getUsedModelAssignment_4_1()); 
            // InternalJavaFXLang.g:3893:2: ( rule__TableViewFX__UsedModelAssignment_4_1 )
            // InternalJavaFXLang.g:3893:3: rule__TableViewFX__UsedModelAssignment_4_1
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
    // InternalJavaFXLang.g:3902:1: rule__TableViewFX__Group_5__0 : rule__TableViewFX__Group_5__0__Impl rule__TableViewFX__Group_5__1 ;
    public final void rule__TableViewFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3906:1: ( rule__TableViewFX__Group_5__0__Impl rule__TableViewFX__Group_5__1 )
            // InternalJavaFXLang.g:3907:2: rule__TableViewFX__Group_5__0__Impl rule__TableViewFX__Group_5__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalJavaFXLang.g:3914:1: rule__TableViewFX__Group_5__0__Impl : ( ( rule__TableViewFX__ColumnsAssignment_5_0 ) ) ;
    public final void rule__TableViewFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3918:1: ( ( ( rule__TableViewFX__ColumnsAssignment_5_0 ) ) )
            // InternalJavaFXLang.g:3919:1: ( ( rule__TableViewFX__ColumnsAssignment_5_0 ) )
            {
            // InternalJavaFXLang.g:3919:1: ( ( rule__TableViewFX__ColumnsAssignment_5_0 ) )
            // InternalJavaFXLang.g:3920:2: ( rule__TableViewFX__ColumnsAssignment_5_0 )
            {
             before(grammarAccess.getTableViewFXAccess().getColumnsAssignment_5_0()); 
            // InternalJavaFXLang.g:3921:2: ( rule__TableViewFX__ColumnsAssignment_5_0 )
            // InternalJavaFXLang.g:3921:3: rule__TableViewFX__ColumnsAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__TableViewFX__ColumnsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getTableViewFXAccess().getColumnsAssignment_5_0()); 

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
    // InternalJavaFXLang.g:3929:1: rule__TableViewFX__Group_5__1 : rule__TableViewFX__Group_5__1__Impl ;
    public final void rule__TableViewFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3933:1: ( rule__TableViewFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:3934:2: rule__TableViewFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:3940:1: rule__TableViewFX__Group_5__1__Impl : ( ( rule__TableViewFX__ColumnsAssignment_5_1 )* ) ;
    public final void rule__TableViewFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3944:1: ( ( ( rule__TableViewFX__ColumnsAssignment_5_1 )* ) )
            // InternalJavaFXLang.g:3945:1: ( ( rule__TableViewFX__ColumnsAssignment_5_1 )* )
            {
            // InternalJavaFXLang.g:3945:1: ( ( rule__TableViewFX__ColumnsAssignment_5_1 )* )
            // InternalJavaFXLang.g:3946:2: ( rule__TableViewFX__ColumnsAssignment_5_1 )*
            {
             before(grammarAccess.getTableViewFXAccess().getColumnsAssignment_5_1()); 
            // InternalJavaFXLang.g:3947:2: ( rule__TableViewFX__ColumnsAssignment_5_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==51) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalJavaFXLang.g:3947:3: rule__TableViewFX__ColumnsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__TableViewFX__ColumnsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getTableViewFXAccess().getColumnsAssignment_5_1()); 

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


    // $ANTLR start "rule__TableColumnFX__Group__0"
    // InternalJavaFXLang.g:3956:1: rule__TableColumnFX__Group__0 : rule__TableColumnFX__Group__0__Impl rule__TableColumnFX__Group__1 ;
    public final void rule__TableColumnFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3960:1: ( rule__TableColumnFX__Group__0__Impl rule__TableColumnFX__Group__1 )
            // InternalJavaFXLang.g:3961:2: rule__TableColumnFX__Group__0__Impl rule__TableColumnFX__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalJavaFXLang.g:3968:1: rule__TableColumnFX__Group__0__Impl : ( () ) ;
    public final void rule__TableColumnFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3972:1: ( ( () ) )
            // InternalJavaFXLang.g:3973:1: ( () )
            {
            // InternalJavaFXLang.g:3973:1: ( () )
            // InternalJavaFXLang.g:3974:2: ()
            {
             before(grammarAccess.getTableColumnFXAccess().getTableColumnFXAction_0()); 
            // InternalJavaFXLang.g:3975:2: ()
            // InternalJavaFXLang.g:3975:3: 
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
    // InternalJavaFXLang.g:3983:1: rule__TableColumnFX__Group__1 : rule__TableColumnFX__Group__1__Impl rule__TableColumnFX__Group__2 ;
    public final void rule__TableColumnFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3987:1: ( rule__TableColumnFX__Group__1__Impl rule__TableColumnFX__Group__2 )
            // InternalJavaFXLang.g:3988:2: rule__TableColumnFX__Group__1__Impl rule__TableColumnFX__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalJavaFXLang.g:3995:1: rule__TableColumnFX__Group__1__Impl : ( 'Column' ) ;
    public final void rule__TableColumnFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3999:1: ( ( 'Column' ) )
            // InternalJavaFXLang.g:4000:1: ( 'Column' )
            {
            // InternalJavaFXLang.g:4000:1: ( 'Column' )
            // InternalJavaFXLang.g:4001:2: 'Column'
            {
             before(grammarAccess.getTableColumnFXAccess().getColumnKeyword_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalJavaFXLang.g:4010:1: rule__TableColumnFX__Group__2 : rule__TableColumnFX__Group__2__Impl rule__TableColumnFX__Group__3 ;
    public final void rule__TableColumnFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4014:1: ( rule__TableColumnFX__Group__2__Impl rule__TableColumnFX__Group__3 )
            // InternalJavaFXLang.g:4015:2: rule__TableColumnFX__Group__2__Impl rule__TableColumnFX__Group__3
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
    // InternalJavaFXLang.g:4022:1: rule__TableColumnFX__Group__2__Impl : ( '(' ) ;
    public final void rule__TableColumnFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4026:1: ( ( '(' ) )
            // InternalJavaFXLang.g:4027:1: ( '(' )
            {
            // InternalJavaFXLang.g:4027:1: ( '(' )
            // InternalJavaFXLang.g:4028:2: '('
            {
             before(grammarAccess.getTableColumnFXAccess().getLeftParenthesisKeyword_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalJavaFXLang.g:4037:1: rule__TableColumnFX__Group__3 : rule__TableColumnFX__Group__3__Impl rule__TableColumnFX__Group__4 ;
    public final void rule__TableColumnFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4041:1: ( rule__TableColumnFX__Group__3__Impl rule__TableColumnFX__Group__4 )
            // InternalJavaFXLang.g:4042:2: rule__TableColumnFX__Group__3__Impl rule__TableColumnFX__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalJavaFXLang.g:4049:1: rule__TableColumnFX__Group__3__Impl : ( ( rule__TableColumnFX__Group_3__0 ) ) ;
    public final void rule__TableColumnFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4053:1: ( ( ( rule__TableColumnFX__Group_3__0 ) ) )
            // InternalJavaFXLang.g:4054:1: ( ( rule__TableColumnFX__Group_3__0 ) )
            {
            // InternalJavaFXLang.g:4054:1: ( ( rule__TableColumnFX__Group_3__0 ) )
            // InternalJavaFXLang.g:4055:2: ( rule__TableColumnFX__Group_3__0 )
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_3()); 
            // InternalJavaFXLang.g:4056:2: ( rule__TableColumnFX__Group_3__0 )
            // InternalJavaFXLang.g:4056:3: rule__TableColumnFX__Group_3__0
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
    // InternalJavaFXLang.g:4064:1: rule__TableColumnFX__Group__4 : rule__TableColumnFX__Group__4__Impl rule__TableColumnFX__Group__5 ;
    public final void rule__TableColumnFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4068:1: ( rule__TableColumnFX__Group__4__Impl rule__TableColumnFX__Group__5 )
            // InternalJavaFXLang.g:4069:2: rule__TableColumnFX__Group__4__Impl rule__TableColumnFX__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalJavaFXLang.g:4076:1: rule__TableColumnFX__Group__4__Impl : ( ( rule__TableColumnFX__Group_4__0 )? ) ;
    public final void rule__TableColumnFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4080:1: ( ( ( rule__TableColumnFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:4081:1: ( ( rule__TableColumnFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:4081:1: ( ( rule__TableColumnFX__Group_4__0 )? )
            // InternalJavaFXLang.g:4082:2: ( rule__TableColumnFX__Group_4__0 )?
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:4083:2: ( rule__TableColumnFX__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==54) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalJavaFXLang.g:4083:3: rule__TableColumnFX__Group_4__0
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
    // InternalJavaFXLang.g:4091:1: rule__TableColumnFX__Group__5 : rule__TableColumnFX__Group__5__Impl rule__TableColumnFX__Group__6 ;
    public final void rule__TableColumnFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4095:1: ( rule__TableColumnFX__Group__5__Impl rule__TableColumnFX__Group__6 )
            // InternalJavaFXLang.g:4096:2: rule__TableColumnFX__Group__5__Impl rule__TableColumnFX__Group__6
            {
            pushFollow(FOLLOW_36);
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
    // InternalJavaFXLang.g:4103:1: rule__TableColumnFX__Group__5__Impl : ( ( rule__TableColumnFX__Group_5__0 )? ) ;
    public final void rule__TableColumnFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4107:1: ( ( ( rule__TableColumnFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:4108:1: ( ( rule__TableColumnFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:4108:1: ( ( rule__TableColumnFX__Group_5__0 )? )
            // InternalJavaFXLang.g:4109:2: ( rule__TableColumnFX__Group_5__0 )?
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:4110:2: ( rule__TableColumnFX__Group_5__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==55) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalJavaFXLang.g:4110:3: rule__TableColumnFX__Group_5__0
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
    // InternalJavaFXLang.g:4118:1: rule__TableColumnFX__Group__6 : rule__TableColumnFX__Group__6__Impl rule__TableColumnFX__Group__7 ;
    public final void rule__TableColumnFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4122:1: ( rule__TableColumnFX__Group__6__Impl rule__TableColumnFX__Group__7 )
            // InternalJavaFXLang.g:4123:2: rule__TableColumnFX__Group__6__Impl rule__TableColumnFX__Group__7
            {
            pushFollow(FOLLOW_36);
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
    // InternalJavaFXLang.g:4130:1: rule__TableColumnFX__Group__6__Impl : ( ( rule__TableColumnFX__Group_6__0 )? ) ;
    public final void rule__TableColumnFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4134:1: ( ( ( rule__TableColumnFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:4135:1: ( ( rule__TableColumnFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:4135:1: ( ( rule__TableColumnFX__Group_6__0 )? )
            // InternalJavaFXLang.g:4136:2: ( rule__TableColumnFX__Group_6__0 )?
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:4137:2: ( rule__TableColumnFX__Group_6__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==56) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalJavaFXLang.g:4137:3: rule__TableColumnFX__Group_6__0
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
    // InternalJavaFXLang.g:4145:1: rule__TableColumnFX__Group__7 : rule__TableColumnFX__Group__7__Impl ;
    public final void rule__TableColumnFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4149:1: ( rule__TableColumnFX__Group__7__Impl )
            // InternalJavaFXLang.g:4150:2: rule__TableColumnFX__Group__7__Impl
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
    // InternalJavaFXLang.g:4156:1: rule__TableColumnFX__Group__7__Impl : ( ')' ) ;
    public final void rule__TableColumnFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4160:1: ( ( ')' ) )
            // InternalJavaFXLang.g:4161:1: ( ')' )
            {
            // InternalJavaFXLang.g:4161:1: ( ')' )
            // InternalJavaFXLang.g:4162:2: ')'
            {
             before(grammarAccess.getTableColumnFXAccess().getRightParenthesisKeyword_7()); 
            match(input,53,FOLLOW_2); 
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
    // InternalJavaFXLang.g:4172:1: rule__TableColumnFX__Group_3__0 : rule__TableColumnFX__Group_3__0__Impl rule__TableColumnFX__Group_3__1 ;
    public final void rule__TableColumnFX__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4176:1: ( rule__TableColumnFX__Group_3__0__Impl rule__TableColumnFX__Group_3__1 )
            // InternalJavaFXLang.g:4177:2: rule__TableColumnFX__Group_3__0__Impl rule__TableColumnFX__Group_3__1
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
    // InternalJavaFXLang.g:4184:1: rule__TableColumnFX__Group_3__0__Impl : ( 'name:' ) ;
    public final void rule__TableColumnFX__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4188:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:4189:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:4189:1: ( 'name:' )
            // InternalJavaFXLang.g:4190:2: 'name:'
            {
             before(grammarAccess.getTableColumnFXAccess().getNameKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalJavaFXLang.g:4199:1: rule__TableColumnFX__Group_3__1 : rule__TableColumnFX__Group_3__1__Impl ;
    public final void rule__TableColumnFX__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4203:1: ( rule__TableColumnFX__Group_3__1__Impl )
            // InternalJavaFXLang.g:4204:2: rule__TableColumnFX__Group_3__1__Impl
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
    // InternalJavaFXLang.g:4210:1: rule__TableColumnFX__Group_3__1__Impl : ( ( rule__TableColumnFX__NameAssignment_3_1 ) ) ;
    public final void rule__TableColumnFX__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4214:1: ( ( ( rule__TableColumnFX__NameAssignment_3_1 ) ) )
            // InternalJavaFXLang.g:4215:1: ( ( rule__TableColumnFX__NameAssignment_3_1 ) )
            {
            // InternalJavaFXLang.g:4215:1: ( ( rule__TableColumnFX__NameAssignment_3_1 ) )
            // InternalJavaFXLang.g:4216:2: ( rule__TableColumnFX__NameAssignment_3_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getNameAssignment_3_1()); 
            // InternalJavaFXLang.g:4217:2: ( rule__TableColumnFX__NameAssignment_3_1 )
            // InternalJavaFXLang.g:4217:3: rule__TableColumnFX__NameAssignment_3_1
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
    // InternalJavaFXLang.g:4226:1: rule__TableColumnFX__Group_4__0 : rule__TableColumnFX__Group_4__0__Impl rule__TableColumnFX__Group_4__1 ;
    public final void rule__TableColumnFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4230:1: ( rule__TableColumnFX__Group_4__0__Impl rule__TableColumnFX__Group_4__1 )
            // InternalJavaFXLang.g:4231:2: rule__TableColumnFX__Group_4__0__Impl rule__TableColumnFX__Group_4__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalJavaFXLang.g:4238:1: rule__TableColumnFX__Group_4__0__Impl : ( 'width:' ) ;
    public final void rule__TableColumnFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4242:1: ( ( 'width:' ) )
            // InternalJavaFXLang.g:4243:1: ( 'width:' )
            {
            // InternalJavaFXLang.g:4243:1: ( 'width:' )
            // InternalJavaFXLang.g:4244:2: 'width:'
            {
             before(grammarAccess.getTableColumnFXAccess().getWidthKeyword_4_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalJavaFXLang.g:4253:1: rule__TableColumnFX__Group_4__1 : rule__TableColumnFX__Group_4__1__Impl ;
    public final void rule__TableColumnFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4257:1: ( rule__TableColumnFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:4258:2: rule__TableColumnFX__Group_4__1__Impl
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
    // InternalJavaFXLang.g:4264:1: rule__TableColumnFX__Group_4__1__Impl : ( ( rule__TableColumnFX__WidthAssignment_4_1 ) ) ;
    public final void rule__TableColumnFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4268:1: ( ( ( rule__TableColumnFX__WidthAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:4269:1: ( ( rule__TableColumnFX__WidthAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:4269:1: ( ( rule__TableColumnFX__WidthAssignment_4_1 ) )
            // InternalJavaFXLang.g:4270:2: ( rule__TableColumnFX__WidthAssignment_4_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getWidthAssignment_4_1()); 
            // InternalJavaFXLang.g:4271:2: ( rule__TableColumnFX__WidthAssignment_4_1 )
            // InternalJavaFXLang.g:4271:3: rule__TableColumnFX__WidthAssignment_4_1
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
    // InternalJavaFXLang.g:4280:1: rule__TableColumnFX__Group_5__0 : rule__TableColumnFX__Group_5__0__Impl rule__TableColumnFX__Group_5__1 ;
    public final void rule__TableColumnFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4284:1: ( rule__TableColumnFX__Group_5__0__Impl rule__TableColumnFX__Group_5__1 )
            // InternalJavaFXLang.g:4285:2: rule__TableColumnFX__Group_5__0__Impl rule__TableColumnFX__Group_5__1
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
    // InternalJavaFXLang.g:4292:1: rule__TableColumnFX__Group_5__0__Impl : ( 'attribute:' ) ;
    public final void rule__TableColumnFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4296:1: ( ( 'attribute:' ) )
            // InternalJavaFXLang.g:4297:1: ( 'attribute:' )
            {
            // InternalJavaFXLang.g:4297:1: ( 'attribute:' )
            // InternalJavaFXLang.g:4298:2: 'attribute:'
            {
             before(grammarAccess.getTableColumnFXAccess().getAttributeKeyword_5_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalJavaFXLang.g:4307:1: rule__TableColumnFX__Group_5__1 : rule__TableColumnFX__Group_5__1__Impl ;
    public final void rule__TableColumnFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4311:1: ( rule__TableColumnFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:4312:2: rule__TableColumnFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:4318:1: rule__TableColumnFX__Group_5__1__Impl : ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) ) ;
    public final void rule__TableColumnFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4322:1: ( ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:4323:1: ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:4323:1: ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) )
            // InternalJavaFXLang.g:4324:2: ( rule__TableColumnFX__UsedAttributeAssignment_5_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getUsedAttributeAssignment_5_1()); 
            // InternalJavaFXLang.g:4325:2: ( rule__TableColumnFX__UsedAttributeAssignment_5_1 )
            // InternalJavaFXLang.g:4325:3: rule__TableColumnFX__UsedAttributeAssignment_5_1
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
    // InternalJavaFXLang.g:4334:1: rule__TableColumnFX__Group_6__0 : rule__TableColumnFX__Group_6__0__Impl rule__TableColumnFX__Group_6__1 ;
    public final void rule__TableColumnFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4338:1: ( rule__TableColumnFX__Group_6__0__Impl rule__TableColumnFX__Group_6__1 )
            // InternalJavaFXLang.g:4339:2: rule__TableColumnFX__Group_6__0__Impl rule__TableColumnFX__Group_6__1
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
    // InternalJavaFXLang.g:4346:1: rule__TableColumnFX__Group_6__0__Impl : ( 'useFilter:' ) ;
    public final void rule__TableColumnFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4350:1: ( ( 'useFilter:' ) )
            // InternalJavaFXLang.g:4351:1: ( 'useFilter:' )
            {
            // InternalJavaFXLang.g:4351:1: ( 'useFilter:' )
            // InternalJavaFXLang.g:4352:2: 'useFilter:'
            {
             before(grammarAccess.getTableColumnFXAccess().getUseFilterKeyword_6_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalJavaFXLang.g:4361:1: rule__TableColumnFX__Group_6__1 : rule__TableColumnFX__Group_6__1__Impl ;
    public final void rule__TableColumnFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4365:1: ( rule__TableColumnFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:4366:2: rule__TableColumnFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:4372:1: rule__TableColumnFX__Group_6__1__Impl : ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) ) ;
    public final void rule__TableColumnFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4376:1: ( ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:4377:1: ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:4377:1: ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) )
            // InternalJavaFXLang.g:4378:2: ( rule__TableColumnFX__UseFilterAssignment_6_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getUseFilterAssignment_6_1()); 
            // InternalJavaFXLang.g:4379:2: ( rule__TableColumnFX__UseFilterAssignment_6_1 )
            // InternalJavaFXLang.g:4379:3: rule__TableColumnFX__UseFilterAssignment_6_1
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
    // InternalJavaFXLang.g:4388:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4392:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalJavaFXLang.g:4393:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalJavaFXLang.g:4400:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4404:1: ( ( ( '-' )? ) )
            // InternalJavaFXLang.g:4405:1: ( ( '-' )? )
            {
            // InternalJavaFXLang.g:4405:1: ( ( '-' )? )
            // InternalJavaFXLang.g:4406:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalJavaFXLang.g:4407:2: ( '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==57) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalJavaFXLang.g:4407:3: '-'
                    {
                    match(input,57,FOLLOW_2); 

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
    // InternalJavaFXLang.g:4415:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4419:1: ( rule__EInt__Group__1__Impl )
            // InternalJavaFXLang.g:4420:2: rule__EInt__Group__1__Impl
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
    // InternalJavaFXLang.g:4426:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4430:1: ( ( RULE_INT ) )
            // InternalJavaFXLang.g:4431:1: ( RULE_INT )
            {
            // InternalJavaFXLang.g:4431:1: ( RULE_INT )
            // InternalJavaFXLang.g:4432:2: RULE_INT
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
    // InternalJavaFXLang.g:4442:1: rule__AttributeFX__Group__0 : rule__AttributeFX__Group__0__Impl rule__AttributeFX__Group__1 ;
    public final void rule__AttributeFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4446:1: ( rule__AttributeFX__Group__0__Impl rule__AttributeFX__Group__1 )
            // InternalJavaFXLang.g:4447:2: rule__AttributeFX__Group__0__Impl rule__AttributeFX__Group__1
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
    // InternalJavaFXLang.g:4454:1: rule__AttributeFX__Group__0__Impl : ( () ) ;
    public final void rule__AttributeFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4458:1: ( ( () ) )
            // InternalJavaFXLang.g:4459:1: ( () )
            {
            // InternalJavaFXLang.g:4459:1: ( () )
            // InternalJavaFXLang.g:4460:2: ()
            {
             before(grammarAccess.getAttributeFXAccess().getAttributeFXAction_0()); 
            // InternalJavaFXLang.g:4461:2: ()
            // InternalJavaFXLang.g:4461:3: 
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
    // InternalJavaFXLang.g:4469:1: rule__AttributeFX__Group__1 : rule__AttributeFX__Group__1__Impl rule__AttributeFX__Group__2 ;
    public final void rule__AttributeFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4473:1: ( rule__AttributeFX__Group__1__Impl rule__AttributeFX__Group__2 )
            // InternalJavaFXLang.g:4474:2: rule__AttributeFX__Group__1__Impl rule__AttributeFX__Group__2
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
    // InternalJavaFXLang.g:4481:1: rule__AttributeFX__Group__1__Impl : ( ( rule__AttributeFX__TypeAssignment_1 ) ) ;
    public final void rule__AttributeFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4485:1: ( ( ( rule__AttributeFX__TypeAssignment_1 ) ) )
            // InternalJavaFXLang.g:4486:1: ( ( rule__AttributeFX__TypeAssignment_1 ) )
            {
            // InternalJavaFXLang.g:4486:1: ( ( rule__AttributeFX__TypeAssignment_1 ) )
            // InternalJavaFXLang.g:4487:2: ( rule__AttributeFX__TypeAssignment_1 )
            {
             before(grammarAccess.getAttributeFXAccess().getTypeAssignment_1()); 
            // InternalJavaFXLang.g:4488:2: ( rule__AttributeFX__TypeAssignment_1 )
            // InternalJavaFXLang.g:4488:3: rule__AttributeFX__TypeAssignment_1
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
    // InternalJavaFXLang.g:4496:1: rule__AttributeFX__Group__2 : rule__AttributeFX__Group__2__Impl ;
    public final void rule__AttributeFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4500:1: ( rule__AttributeFX__Group__2__Impl )
            // InternalJavaFXLang.g:4501:2: rule__AttributeFX__Group__2__Impl
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
    // InternalJavaFXLang.g:4507:1: rule__AttributeFX__Group__2__Impl : ( ( rule__AttributeFX__NameAssignment_2 ) ) ;
    public final void rule__AttributeFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4511:1: ( ( ( rule__AttributeFX__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:4512:1: ( ( rule__AttributeFX__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:4512:1: ( ( rule__AttributeFX__NameAssignment_2 ) )
            // InternalJavaFXLang.g:4513:2: ( rule__AttributeFX__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeFXAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:4514:2: ( rule__AttributeFX__NameAssignment_2 )
            // InternalJavaFXLang.g:4514:3: rule__AttributeFX__NameAssignment_2
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
    // InternalJavaFXLang.g:4523:1: rule__ProjectFX__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ProjectFX__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4527:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4528:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4528:2: ( ruleEString )
            // InternalJavaFXLang.g:4529:3: ruleEString
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
    // InternalJavaFXLang.g:4538:1: rule__ProjectFX__PackagePathAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ProjectFX__PackagePathAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4542:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4543:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4543:2: ( ruleEString )
            // InternalJavaFXLang.g:4544:3: ruleEString
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
    // InternalJavaFXLang.g:4553:1: rule__ProjectFX__ControlsAssignment_5_2 : ( ruleControlFX ) ;
    public final void rule__ProjectFX__ControlsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4557:1: ( ( ruleControlFX ) )
            // InternalJavaFXLang.g:4558:2: ( ruleControlFX )
            {
            // InternalJavaFXLang.g:4558:2: ( ruleControlFX )
            // InternalJavaFXLang.g:4559:3: ruleControlFX
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
    // InternalJavaFXLang.g:4568:1: rule__ProjectFX__ControlsAssignment_5_3 : ( ruleControlFX ) ;
    public final void rule__ProjectFX__ControlsAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4572:1: ( ( ruleControlFX ) )
            // InternalJavaFXLang.g:4573:2: ( ruleControlFX )
            {
            // InternalJavaFXLang.g:4573:2: ( ruleControlFX )
            // InternalJavaFXLang.g:4574:3: ruleControlFX
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
    // InternalJavaFXLang.g:4583:1: rule__ProjectFX__ModelsAssignment_6_2 : ( ruleModelFX ) ;
    public final void rule__ProjectFX__ModelsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4587:1: ( ( ruleModelFX ) )
            // InternalJavaFXLang.g:4588:2: ( ruleModelFX )
            {
            // InternalJavaFXLang.g:4588:2: ( ruleModelFX )
            // InternalJavaFXLang.g:4589:3: ruleModelFX
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
    // InternalJavaFXLang.g:4598:1: rule__ProjectFX__ModelsAssignment_6_3 : ( ruleModelFX ) ;
    public final void rule__ProjectFX__ModelsAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4602:1: ( ( ruleModelFX ) )
            // InternalJavaFXLang.g:4603:2: ( ruleModelFX )
            {
            // InternalJavaFXLang.g:4603:2: ( ruleModelFX )
            // InternalJavaFXLang.g:4604:3: ruleModelFX
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
    // InternalJavaFXLang.g:4613:1: rule__ProjectFX__BindingsAssignment_7_2 : ( ruleBinding ) ;
    public final void rule__ProjectFX__BindingsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4617:1: ( ( ruleBinding ) )
            // InternalJavaFXLang.g:4618:2: ( ruleBinding )
            {
            // InternalJavaFXLang.g:4618:2: ( ruleBinding )
            // InternalJavaFXLang.g:4619:3: ruleBinding
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
    // InternalJavaFXLang.g:4628:1: rule__ProjectFX__BindingsAssignment_7_3 : ( ruleBinding ) ;
    public final void rule__ProjectFX__BindingsAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4632:1: ( ( ruleBinding ) )
            // InternalJavaFXLang.g:4633:2: ( ruleBinding )
            {
            // InternalJavaFXLang.g:4633:2: ( ruleBinding )
            // InternalJavaFXLang.g:4634:3: ruleBinding
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
    // InternalJavaFXLang.g:4643:1: rule__ProjectFX__ChartsAssignment_8_2 : ( ruleChartFX ) ;
    public final void rule__ProjectFX__ChartsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4647:1: ( ( ruleChartFX ) )
            // InternalJavaFXLang.g:4648:2: ( ruleChartFX )
            {
            // InternalJavaFXLang.g:4648:2: ( ruleChartFX )
            // InternalJavaFXLang.g:4649:3: ruleChartFX
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
    // InternalJavaFXLang.g:4658:1: rule__ProjectFX__ChartsAssignment_8_3 : ( ruleChartFX ) ;
    public final void rule__ProjectFX__ChartsAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4662:1: ( ( ruleChartFX ) )
            // InternalJavaFXLang.g:4663:2: ( ruleChartFX )
            {
            // InternalJavaFXLang.g:4663:2: ( ruleChartFX )
            // InternalJavaFXLang.g:4664:3: ruleChartFX
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
    // InternalJavaFXLang.g:4673:1: rule__LineChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__LineChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4677:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4678:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4678:2: ( ruleEString )
            // InternalJavaFXLang.g:4679:3: ruleEString
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
    // InternalJavaFXLang.g:4688:1: rule__LineChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__LineChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4692:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:4693:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:4693:2: ( ruleOrientation )
            // InternalJavaFXLang.g:4694:3: ruleOrientation
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
    // InternalJavaFXLang.g:4703:1: rule__LineChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__LineChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4707:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:4708:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:4708:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:4709:3: ruleEBoolean
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
    // InternalJavaFXLang.g:4718:1: rule__LineChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__LineChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4722:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4723:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4723:2: ( ruleEString )
            // InternalJavaFXLang.g:4724:3: ruleEString
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
    // InternalJavaFXLang.g:4733:1: rule__LineChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__LineChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4737:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:4738:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:4738:2: ( ruleOrientation )
            // InternalJavaFXLang.g:4739:3: ruleOrientation
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
    // InternalJavaFXLang.g:4748:1: rule__LineChartFX__XAxisLabelAssignment_9_1 : ( ruleEString ) ;
    public final void rule__LineChartFX__XAxisLabelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4752:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4753:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4753:2: ( ruleEString )
            // InternalJavaFXLang.g:4754:3: ruleEString
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


    // $ANTLR start "rule__LineChartFX__XAxisTypeAssignment_10_1"
    // InternalJavaFXLang.g:4763:1: rule__LineChartFX__XAxisTypeAssignment_10_1 : ( ruleAxisType ) ;
    public final void rule__LineChartFX__XAxisTypeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4767:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:4768:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:4768:2: ( ruleAxisType )
            // InternalJavaFXLang.g:4769:3: ruleAxisType
            {
             before(grammarAccess.getLineChartFXAccess().getXAxisTypeAxisTypeEnumRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxisType();

            state._fsp--;

             after(grammarAccess.getLineChartFXAccess().getXAxisTypeAxisTypeEnumRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__LineChartFX__XAxisTypeAssignment_10_1"


    // $ANTLR start "rule__LineChartFX__YAxisLabelAssignment_11_1"
    // InternalJavaFXLang.g:4778:1: rule__LineChartFX__YAxisLabelAssignment_11_1 : ( ruleEString ) ;
    public final void rule__LineChartFX__YAxisLabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4782:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4783:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4783:2: ( ruleEString )
            // InternalJavaFXLang.g:4784:3: ruleEString
            {
             before(grammarAccess.getLineChartFXAccess().getYAxisLabelEStringParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineChartFXAccess().getYAxisLabelEStringParserRuleCall_11_1_0()); 

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
    // $ANTLR end "rule__LineChartFX__YAxisLabelAssignment_11_1"


    // $ANTLR start "rule__LineChartFX__YAxisTypeAssignment_12_1"
    // InternalJavaFXLang.g:4793:1: rule__LineChartFX__YAxisTypeAssignment_12_1 : ( ruleAxisType ) ;
    public final void rule__LineChartFX__YAxisTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4797:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:4798:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:4798:2: ( ruleAxisType )
            // InternalJavaFXLang.g:4799:3: ruleAxisType
            {
             before(grammarAccess.getLineChartFXAccess().getYAxisTypeAxisTypeEnumRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxisType();

            state._fsp--;

             after(grammarAccess.getLineChartFXAccess().getYAxisTypeAxisTypeEnumRuleCall_12_1_0()); 

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
    // $ANTLR end "rule__LineChartFX__YAxisTypeAssignment_12_1"


    // $ANTLR start "rule__Binding__NameAssignment_2"
    // InternalJavaFXLang.g:4808:1: rule__Binding__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Binding__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4812:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4813:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4813:2: ( ruleEString )
            // InternalJavaFXLang.g:4814:3: ruleEString
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
    // InternalJavaFXLang.g:4823:1: rule__Binding__PropertyAssignment_4_0 : ( ruleBindingProperty ) ;
    public final void rule__Binding__PropertyAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4827:1: ( ( ruleBindingProperty ) )
            // InternalJavaFXLang.g:4828:2: ( ruleBindingProperty )
            {
            // InternalJavaFXLang.g:4828:2: ( ruleBindingProperty )
            // InternalJavaFXLang.g:4829:3: ruleBindingProperty
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
    // InternalJavaFXLang.g:4838:1: rule__Binding__PropertyAssignment_4_1 : ( ruleBindingProperty ) ;
    public final void rule__Binding__PropertyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4842:1: ( ( ruleBindingProperty ) )
            // InternalJavaFXLang.g:4843:2: ( ruleBindingProperty )
            {
            // InternalJavaFXLang.g:4843:2: ( ruleBindingProperty )
            // InternalJavaFXLang.g:4844:3: ruleBindingProperty
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
    // InternalJavaFXLang.g:4853:1: rule__BindingProperty__TypeAssignment_1 : ( ruleBindinType ) ;
    public final void rule__BindingProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4857:1: ( ( ruleBindinType ) )
            // InternalJavaFXLang.g:4858:2: ( ruleBindinType )
            {
            // InternalJavaFXLang.g:4858:2: ( ruleBindinType )
            // InternalJavaFXLang.g:4859:3: ruleBindinType
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
    // InternalJavaFXLang.g:4868:1: rule__BindingProperty__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BindingProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4872:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4873:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4873:2: ( ruleEString )
            // InternalJavaFXLang.g:4874:3: ruleEString
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


    // $ANTLR start "rule__FilteredTableViewFX__NameAssignment_3_1"
    // InternalJavaFXLang.g:4883:1: rule__FilteredTableViewFX__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__FilteredTableViewFX__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4887:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4888:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4888:2: ( ruleEString )
            // InternalJavaFXLang.g:4889:3: ruleEString
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFilteredTableViewFXAccess().getNameEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__NameAssignment_3_1"


    // $ANTLR start "rule__FilteredTableViewFX__UsedModelAssignment_4_1"
    // InternalJavaFXLang.g:4898:1: rule__FilteredTableViewFX__UsedModelAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__FilteredTableViewFX__UsedModelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4902:1: ( ( ( ruleEString ) ) )
            // InternalJavaFXLang.g:4903:2: ( ( ruleEString ) )
            {
            // InternalJavaFXLang.g:4903:2: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4904:3: ( ruleEString )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUsedModelModelFXCrossReference_4_1_0()); 
            // InternalJavaFXLang.g:4905:3: ( ruleEString )
            // InternalJavaFXLang.g:4906:4: ruleEString
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUsedModelModelFXEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFilteredTableViewFXAccess().getUsedModelModelFXEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getFilteredTableViewFXAccess().getUsedModelModelFXCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__UsedModelAssignment_4_1"


    // $ANTLR start "rule__FilteredTableViewFX__UseFilterAssignment_5_1"
    // InternalJavaFXLang.g:4917:1: rule__FilteredTableViewFX__UseFilterAssignment_5_1 : ( ruleEBoolean ) ;
    public final void rule__FilteredTableViewFX__UseFilterAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4921:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:4922:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:4922:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:4923:3: ruleEBoolean
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUseFilterEBooleanParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getFilteredTableViewFXAccess().getUseFilterEBooleanParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__UseFilterAssignment_5_1"


    // $ANTLR start "rule__FilteredTableViewFX__ColumnsAssignment_6_0"
    // InternalJavaFXLang.g:4932:1: rule__FilteredTableViewFX__ColumnsAssignment_6_0 : ( ruleTableColumnFX ) ;
    public final void rule__FilteredTableViewFX__ColumnsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4936:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:4937:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:4937:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:4938:3: ruleTableColumnFX
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTableColumnFX();

            state._fsp--;

             after(grammarAccess.getFilteredTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__ColumnsAssignment_6_0"


    // $ANTLR start "rule__FilteredTableViewFX__ColumnsAssignment_6_1"
    // InternalJavaFXLang.g:4947:1: rule__FilteredTableViewFX__ColumnsAssignment_6_1 : ( ruleTableColumnFX ) ;
    public final void rule__FilteredTableViewFX__ColumnsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4951:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:4952:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:4952:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:4953:3: ruleTableColumnFX
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTableColumnFX();

            state._fsp--;

             after(grammarAccess.getFilteredTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__FilteredTableViewFX__ColumnsAssignment_6_1"


    // $ANTLR start "rule__DerivedBean__NameAssignment_2"
    // InternalJavaFXLang.g:4962:1: rule__DerivedBean__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DerivedBean__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4966:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4967:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4967:2: ( ruleEString )
            // InternalJavaFXLang.g:4968:3: ruleEString
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
    // InternalJavaFXLang.g:4977:1: rule__DerivedBean__InstanceTypeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__DerivedBean__InstanceTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4981:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:4982:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:4982:2: ( ruleEString )
            // InternalJavaFXLang.g:4983:3: ruleEString
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
    // InternalJavaFXLang.g:4992:1: rule__DerivedBean__AttributesAssignment_5_0 : ( ruleAttributeFX ) ;
    public final void rule__DerivedBean__AttributesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4996:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:4997:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:4997:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:4998:3: ruleAttributeFX
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
    // InternalJavaFXLang.g:5007:1: rule__DerivedBean__AttributesAssignment_5_1 : ( ruleAttributeFX ) ;
    public final void rule__DerivedBean__AttributesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5011:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:5012:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:5012:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:5013:3: ruleAttributeFX
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
    // InternalJavaFXLang.g:5022:1: rule__Bean__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Bean__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5026:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:5027:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:5027:2: ( ruleEString )
            // InternalJavaFXLang.g:5028:3: ruleEString
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
    // InternalJavaFXLang.g:5037:1: rule__Bean__AttributesAssignment_4_0 : ( ruleAttributeFX ) ;
    public final void rule__Bean__AttributesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5041:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:5042:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:5042:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:5043:3: ruleAttributeFX
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
    // InternalJavaFXLang.g:5052:1: rule__Bean__AttributesAssignment_4_1 : ( ruleAttributeFX ) ;
    public final void rule__Bean__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5056:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:5057:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:5057:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:5058:3: ruleAttributeFX
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
    // InternalJavaFXLang.g:5067:1: rule__TableViewFX__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__TableViewFX__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5071:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:5072:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:5072:2: ( ruleEString )
            // InternalJavaFXLang.g:5073:3: ruleEString
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
    // InternalJavaFXLang.g:5082:1: rule__TableViewFX__UsedModelAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__TableViewFX__UsedModelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5086:1: ( ( ( ruleEString ) ) )
            // InternalJavaFXLang.g:5087:2: ( ( ruleEString ) )
            {
            // InternalJavaFXLang.g:5087:2: ( ( ruleEString ) )
            // InternalJavaFXLang.g:5088:3: ( ruleEString )
            {
             before(grammarAccess.getTableViewFXAccess().getUsedModelModelFXCrossReference_4_1_0()); 
            // InternalJavaFXLang.g:5089:3: ( ruleEString )
            // InternalJavaFXLang.g:5090:4: ruleEString
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


    // $ANTLR start "rule__TableViewFX__ColumnsAssignment_5_0"
    // InternalJavaFXLang.g:5101:1: rule__TableViewFX__ColumnsAssignment_5_0 : ( ruleTableColumnFX ) ;
    public final void rule__TableViewFX__ColumnsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5105:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:5106:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:5106:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:5107:3: ruleTableColumnFX
            {
             before(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTableColumnFX();

            state._fsp--;

             after(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__TableViewFX__ColumnsAssignment_5_0"


    // $ANTLR start "rule__TableViewFX__ColumnsAssignment_5_1"
    // InternalJavaFXLang.g:5116:1: rule__TableViewFX__ColumnsAssignment_5_1 : ( ruleTableColumnFX ) ;
    public final void rule__TableViewFX__ColumnsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5120:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:5121:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:5121:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:5122:3: ruleTableColumnFX
            {
             before(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTableColumnFX();

            state._fsp--;

             after(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__TableViewFX__ColumnsAssignment_5_1"


    // $ANTLR start "rule__TableColumnFX__NameAssignment_3_1"
    // InternalJavaFXLang.g:5131:1: rule__TableColumnFX__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__TableColumnFX__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5135:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:5136:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:5136:2: ( ruleEString )
            // InternalJavaFXLang.g:5137:3: ruleEString
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
    // InternalJavaFXLang.g:5146:1: rule__TableColumnFX__WidthAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__TableColumnFX__WidthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5150:1: ( ( ruleEInt ) )
            // InternalJavaFXLang.g:5151:2: ( ruleEInt )
            {
            // InternalJavaFXLang.g:5151:2: ( ruleEInt )
            // InternalJavaFXLang.g:5152:3: ruleEInt
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
    // InternalJavaFXLang.g:5161:1: rule__TableColumnFX__UsedAttributeAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__TableColumnFX__UsedAttributeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5165:1: ( ( ( ruleEString ) ) )
            // InternalJavaFXLang.g:5166:2: ( ( ruleEString ) )
            {
            // InternalJavaFXLang.g:5166:2: ( ( ruleEString ) )
            // InternalJavaFXLang.g:5167:3: ( ruleEString )
            {
             before(grammarAccess.getTableColumnFXAccess().getUsedAttributeAttributeFXCrossReference_5_1_0()); 
            // InternalJavaFXLang.g:5168:3: ( ruleEString )
            // InternalJavaFXLang.g:5169:4: ruleEString
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
    // InternalJavaFXLang.g:5180:1: rule__TableColumnFX__UseFilterAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__TableColumnFX__UseFilterAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5184:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:5185:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:5185:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:5186:3: ruleEBoolean
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
    // InternalJavaFXLang.g:5195:1: rule__AttributeFX__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__AttributeFX__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5199:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:5200:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:5200:2: ( ruleEString )
            // InternalJavaFXLang.g:5201:3: ruleEString
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
    // InternalJavaFXLang.g:5210:1: rule__AttributeFX__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__AttributeFX__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5214:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:5215:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:5215:2: ( ruleEString )
            // InternalJavaFXLang.g:5216:3: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0004200000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0004200010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0004200000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000100010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000FF010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000013F80000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000003F80000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000003F80002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008C00010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0008400010000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x01E0000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0200000000000040L});

}