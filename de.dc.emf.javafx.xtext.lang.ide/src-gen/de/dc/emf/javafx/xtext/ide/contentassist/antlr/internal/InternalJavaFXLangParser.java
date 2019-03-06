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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Category'", "'Number'", "'Bottom'", "'Left'", "'Right'", "'Top'", "'BooleanProperty'", "'DoubleProperty'", "'FloatProperty'", "'IntegerProperty'", "'ObservableList'", "'ObjectProperty'", "'StringProperty'", "'ProjectFX'", "'{'", "'}'", "'packagePath'", "'controls'", "'models'", "'bindings'", "'charts'", "'BarChart'", "'name:'", "'legendSide:'", "'showLegend:'", "'title:'", "'titleSide:'", "'xAxisLabel:'", "'xAxisType:'", "'yAxisLabel:'", "'yAxisType:'", "'ScatterChart'", "'BubbleChart'", "'AreaChart'", "'PieChart'", "'LineChart'", "'binding'", "'FilteredTableView'", "'usedModel:'", "'usedFilter:'", "'class'", "'instanceType:'", "'TableView'", "'Column'", "'('", "')'", "'width:'", "'attribute:'", "'useFilter:'", "'-'"
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
    // InternalJavaFXLang.g:87:1: ruleChartFX : ( ( rule__ChartFX__Alternatives ) ) ;
    public final void ruleChartFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:91:2: ( ( ( rule__ChartFX__Alternatives ) ) )
            // InternalJavaFXLang.g:92:2: ( ( rule__ChartFX__Alternatives ) )
            {
            // InternalJavaFXLang.g:92:2: ( ( rule__ChartFX__Alternatives ) )
            // InternalJavaFXLang.g:93:3: ( rule__ChartFX__Alternatives )
            {
             before(grammarAccess.getChartFXAccess().getAlternatives()); 
            // InternalJavaFXLang.g:94:3: ( rule__ChartFX__Alternatives )
            // InternalJavaFXLang.g:94:4: rule__ChartFX__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ChartFX__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getChartFXAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleBarChartFX"
    // InternalJavaFXLang.g:103:1: entryRuleBarChartFX : ruleBarChartFX EOF ;
    public final void entryRuleBarChartFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:104:1: ( ruleBarChartFX EOF )
            // InternalJavaFXLang.g:105:1: ruleBarChartFX EOF
            {
             before(grammarAccess.getBarChartFXRule()); 
            pushFollow(FOLLOW_1);
            ruleBarChartFX();

            state._fsp--;

             after(grammarAccess.getBarChartFXRule()); 
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
    // $ANTLR end "entryRuleBarChartFX"


    // $ANTLR start "ruleBarChartFX"
    // InternalJavaFXLang.g:112:1: ruleBarChartFX : ( ( rule__BarChartFX__Group__0 ) ) ;
    public final void ruleBarChartFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:116:2: ( ( ( rule__BarChartFX__Group__0 ) ) )
            // InternalJavaFXLang.g:117:2: ( ( rule__BarChartFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:117:2: ( ( rule__BarChartFX__Group__0 ) )
            // InternalJavaFXLang.g:118:3: ( rule__BarChartFX__Group__0 )
            {
             before(grammarAccess.getBarChartFXAccess().getGroup()); 
            // InternalJavaFXLang.g:119:3: ( rule__BarChartFX__Group__0 )
            // InternalJavaFXLang.g:119:4: rule__BarChartFX__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBarChartFXAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBarChartFX"


    // $ANTLR start "entryRuleScatterChartFX"
    // InternalJavaFXLang.g:128:1: entryRuleScatterChartFX : ruleScatterChartFX EOF ;
    public final void entryRuleScatterChartFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:129:1: ( ruleScatterChartFX EOF )
            // InternalJavaFXLang.g:130:1: ruleScatterChartFX EOF
            {
             before(grammarAccess.getScatterChartFXRule()); 
            pushFollow(FOLLOW_1);
            ruleScatterChartFX();

            state._fsp--;

             after(grammarAccess.getScatterChartFXRule()); 
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
    // $ANTLR end "entryRuleScatterChartFX"


    // $ANTLR start "ruleScatterChartFX"
    // InternalJavaFXLang.g:137:1: ruleScatterChartFX : ( ( rule__ScatterChartFX__Group__0 ) ) ;
    public final void ruleScatterChartFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:141:2: ( ( ( rule__ScatterChartFX__Group__0 ) ) )
            // InternalJavaFXLang.g:142:2: ( ( rule__ScatterChartFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:142:2: ( ( rule__ScatterChartFX__Group__0 ) )
            // InternalJavaFXLang.g:143:3: ( rule__ScatterChartFX__Group__0 )
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup()); 
            // InternalJavaFXLang.g:144:3: ( rule__ScatterChartFX__Group__0 )
            // InternalJavaFXLang.g:144:4: rule__ScatterChartFX__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScatterChartFXAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScatterChartFX"


    // $ANTLR start "entryRuleBubbleChartFX"
    // InternalJavaFXLang.g:153:1: entryRuleBubbleChartFX : ruleBubbleChartFX EOF ;
    public final void entryRuleBubbleChartFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:154:1: ( ruleBubbleChartFX EOF )
            // InternalJavaFXLang.g:155:1: ruleBubbleChartFX EOF
            {
             before(grammarAccess.getBubbleChartFXRule()); 
            pushFollow(FOLLOW_1);
            ruleBubbleChartFX();

            state._fsp--;

             after(grammarAccess.getBubbleChartFXRule()); 
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
    // $ANTLR end "entryRuleBubbleChartFX"


    // $ANTLR start "ruleBubbleChartFX"
    // InternalJavaFXLang.g:162:1: ruleBubbleChartFX : ( ( rule__BubbleChartFX__Group__0 ) ) ;
    public final void ruleBubbleChartFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:166:2: ( ( ( rule__BubbleChartFX__Group__0 ) ) )
            // InternalJavaFXLang.g:167:2: ( ( rule__BubbleChartFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:167:2: ( ( rule__BubbleChartFX__Group__0 ) )
            // InternalJavaFXLang.g:168:3: ( rule__BubbleChartFX__Group__0 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup()); 
            // InternalJavaFXLang.g:169:3: ( rule__BubbleChartFX__Group__0 )
            // InternalJavaFXLang.g:169:4: rule__BubbleChartFX__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBubbleChartFXAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBubbleChartFX"


    // $ANTLR start "entryRuleAreaChartFX"
    // InternalJavaFXLang.g:178:1: entryRuleAreaChartFX : ruleAreaChartFX EOF ;
    public final void entryRuleAreaChartFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:179:1: ( ruleAreaChartFX EOF )
            // InternalJavaFXLang.g:180:1: ruleAreaChartFX EOF
            {
             before(grammarAccess.getAreaChartFXRule()); 
            pushFollow(FOLLOW_1);
            ruleAreaChartFX();

            state._fsp--;

             after(grammarAccess.getAreaChartFXRule()); 
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
    // $ANTLR end "entryRuleAreaChartFX"


    // $ANTLR start "ruleAreaChartFX"
    // InternalJavaFXLang.g:187:1: ruleAreaChartFX : ( ( rule__AreaChartFX__Group__0 ) ) ;
    public final void ruleAreaChartFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:191:2: ( ( ( rule__AreaChartFX__Group__0 ) ) )
            // InternalJavaFXLang.g:192:2: ( ( rule__AreaChartFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:192:2: ( ( rule__AreaChartFX__Group__0 ) )
            // InternalJavaFXLang.g:193:3: ( rule__AreaChartFX__Group__0 )
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup()); 
            // InternalJavaFXLang.g:194:3: ( rule__AreaChartFX__Group__0 )
            // InternalJavaFXLang.g:194:4: rule__AreaChartFX__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAreaChartFXAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAreaChartFX"


    // $ANTLR start "entryRulePieChartFX"
    // InternalJavaFXLang.g:203:1: entryRulePieChartFX : rulePieChartFX EOF ;
    public final void entryRulePieChartFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:204:1: ( rulePieChartFX EOF )
            // InternalJavaFXLang.g:205:1: rulePieChartFX EOF
            {
             before(grammarAccess.getPieChartFXRule()); 
            pushFollow(FOLLOW_1);
            rulePieChartFX();

            state._fsp--;

             after(grammarAccess.getPieChartFXRule()); 
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
    // $ANTLR end "entryRulePieChartFX"


    // $ANTLR start "rulePieChartFX"
    // InternalJavaFXLang.g:212:1: rulePieChartFX : ( ( rule__PieChartFX__Group__0 ) ) ;
    public final void rulePieChartFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:216:2: ( ( ( rule__PieChartFX__Group__0 ) ) )
            // InternalJavaFXLang.g:217:2: ( ( rule__PieChartFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:217:2: ( ( rule__PieChartFX__Group__0 ) )
            // InternalJavaFXLang.g:218:3: ( rule__PieChartFX__Group__0 )
            {
             before(grammarAccess.getPieChartFXAccess().getGroup()); 
            // InternalJavaFXLang.g:219:3: ( rule__PieChartFX__Group__0 )
            // InternalJavaFXLang.g:219:4: rule__PieChartFX__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPieChartFXAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePieChartFX"


    // $ANTLR start "entryRuleLineChartFX"
    // InternalJavaFXLang.g:228:1: entryRuleLineChartFX : ruleLineChartFX EOF ;
    public final void entryRuleLineChartFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:229:1: ( ruleLineChartFX EOF )
            // InternalJavaFXLang.g:230:1: ruleLineChartFX EOF
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
    // InternalJavaFXLang.g:237:1: ruleLineChartFX : ( ( rule__LineChartFX__Group__0 ) ) ;
    public final void ruleLineChartFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:241:2: ( ( ( rule__LineChartFX__Group__0 ) ) )
            // InternalJavaFXLang.g:242:2: ( ( rule__LineChartFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:242:2: ( ( rule__LineChartFX__Group__0 ) )
            // InternalJavaFXLang.g:243:3: ( rule__LineChartFX__Group__0 )
            {
             before(grammarAccess.getLineChartFXAccess().getGroup()); 
            // InternalJavaFXLang.g:244:3: ( rule__LineChartFX__Group__0 )
            // InternalJavaFXLang.g:244:4: rule__LineChartFX__Group__0
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
    // InternalJavaFXLang.g:253:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:254:1: ( ruleBinding EOF )
            // InternalJavaFXLang.g:255:1: ruleBinding EOF
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
    // InternalJavaFXLang.g:262:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:266:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalJavaFXLang.g:267:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalJavaFXLang.g:267:2: ( ( rule__Binding__Group__0 ) )
            // InternalJavaFXLang.g:268:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalJavaFXLang.g:269:3: ( rule__Binding__Group__0 )
            // InternalJavaFXLang.g:269:4: rule__Binding__Group__0
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
    // InternalJavaFXLang.g:278:1: entryRuleBindingProperty : ruleBindingProperty EOF ;
    public final void entryRuleBindingProperty() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:279:1: ( ruleBindingProperty EOF )
            // InternalJavaFXLang.g:280:1: ruleBindingProperty EOF
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
    // InternalJavaFXLang.g:287:1: ruleBindingProperty : ( ( rule__BindingProperty__Group__0 ) ) ;
    public final void ruleBindingProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:291:2: ( ( ( rule__BindingProperty__Group__0 ) ) )
            // InternalJavaFXLang.g:292:2: ( ( rule__BindingProperty__Group__0 ) )
            {
            // InternalJavaFXLang.g:292:2: ( ( rule__BindingProperty__Group__0 ) )
            // InternalJavaFXLang.g:293:3: ( rule__BindingProperty__Group__0 )
            {
             before(grammarAccess.getBindingPropertyAccess().getGroup()); 
            // InternalJavaFXLang.g:294:3: ( rule__BindingProperty__Group__0 )
            // InternalJavaFXLang.g:294:4: rule__BindingProperty__Group__0
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
    // InternalJavaFXLang.g:303:1: entryRuleControlFX : ruleControlFX EOF ;
    public final void entryRuleControlFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:304:1: ( ruleControlFX EOF )
            // InternalJavaFXLang.g:305:1: ruleControlFX EOF
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
    // InternalJavaFXLang.g:312:1: ruleControlFX : ( ( rule__ControlFX__Alternatives ) ) ;
    public final void ruleControlFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:316:2: ( ( ( rule__ControlFX__Alternatives ) ) )
            // InternalJavaFXLang.g:317:2: ( ( rule__ControlFX__Alternatives ) )
            {
            // InternalJavaFXLang.g:317:2: ( ( rule__ControlFX__Alternatives ) )
            // InternalJavaFXLang.g:318:3: ( rule__ControlFX__Alternatives )
            {
             before(grammarAccess.getControlFXAccess().getAlternatives()); 
            // InternalJavaFXLang.g:319:3: ( rule__ControlFX__Alternatives )
            // InternalJavaFXLang.g:319:4: rule__ControlFX__Alternatives
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
    // InternalJavaFXLang.g:328:1: entryRuleFilteredTableViewFX : ruleFilteredTableViewFX EOF ;
    public final void entryRuleFilteredTableViewFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:329:1: ( ruleFilteredTableViewFX EOF )
            // InternalJavaFXLang.g:330:1: ruleFilteredTableViewFX EOF
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
    // InternalJavaFXLang.g:337:1: ruleFilteredTableViewFX : ( ( rule__FilteredTableViewFX__Group__0 ) ) ;
    public final void ruleFilteredTableViewFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:341:2: ( ( ( rule__FilteredTableViewFX__Group__0 ) ) )
            // InternalJavaFXLang.g:342:2: ( ( rule__FilteredTableViewFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:342:2: ( ( rule__FilteredTableViewFX__Group__0 ) )
            // InternalJavaFXLang.g:343:3: ( rule__FilteredTableViewFX__Group__0 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup()); 
            // InternalJavaFXLang.g:344:3: ( rule__FilteredTableViewFX__Group__0 )
            // InternalJavaFXLang.g:344:4: rule__FilteredTableViewFX__Group__0
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
    // InternalJavaFXLang.g:353:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:354:1: ( ruleEString EOF )
            // InternalJavaFXLang.g:355:1: ruleEString EOF
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
    // InternalJavaFXLang.g:362:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:366:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalJavaFXLang.g:367:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalJavaFXLang.g:367:2: ( ( rule__EString__Alternatives ) )
            // InternalJavaFXLang.g:368:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalJavaFXLang.g:369:3: ( rule__EString__Alternatives )
            // InternalJavaFXLang.g:369:4: rule__EString__Alternatives
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
    // InternalJavaFXLang.g:378:1: entryRuleModelFX : ruleModelFX EOF ;
    public final void entryRuleModelFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:379:1: ( ruleModelFX EOF )
            // InternalJavaFXLang.g:380:1: ruleModelFX EOF
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
    // InternalJavaFXLang.g:387:1: ruleModelFX : ( ( rule__ModelFX__Alternatives ) ) ;
    public final void ruleModelFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:391:2: ( ( ( rule__ModelFX__Alternatives ) ) )
            // InternalJavaFXLang.g:392:2: ( ( rule__ModelFX__Alternatives ) )
            {
            // InternalJavaFXLang.g:392:2: ( ( rule__ModelFX__Alternatives ) )
            // InternalJavaFXLang.g:393:3: ( rule__ModelFX__Alternatives )
            {
             before(grammarAccess.getModelFXAccess().getAlternatives()); 
            // InternalJavaFXLang.g:394:3: ( rule__ModelFX__Alternatives )
            // InternalJavaFXLang.g:394:4: rule__ModelFX__Alternatives
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
    // InternalJavaFXLang.g:403:1: entryRuleDerivedBean : ruleDerivedBean EOF ;
    public final void entryRuleDerivedBean() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:404:1: ( ruleDerivedBean EOF )
            // InternalJavaFXLang.g:405:1: ruleDerivedBean EOF
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
    // InternalJavaFXLang.g:412:1: ruleDerivedBean : ( ( rule__DerivedBean__Group__0 ) ) ;
    public final void ruleDerivedBean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:416:2: ( ( ( rule__DerivedBean__Group__0 ) ) )
            // InternalJavaFXLang.g:417:2: ( ( rule__DerivedBean__Group__0 ) )
            {
            // InternalJavaFXLang.g:417:2: ( ( rule__DerivedBean__Group__0 ) )
            // InternalJavaFXLang.g:418:3: ( rule__DerivedBean__Group__0 )
            {
             before(grammarAccess.getDerivedBeanAccess().getGroup()); 
            // InternalJavaFXLang.g:419:3: ( rule__DerivedBean__Group__0 )
            // InternalJavaFXLang.g:419:4: rule__DerivedBean__Group__0
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
    // InternalJavaFXLang.g:428:1: entryRuleBean : ruleBean EOF ;
    public final void entryRuleBean() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:429:1: ( ruleBean EOF )
            // InternalJavaFXLang.g:430:1: ruleBean EOF
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
    // InternalJavaFXLang.g:437:1: ruleBean : ( ( rule__Bean__Group__0 ) ) ;
    public final void ruleBean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:441:2: ( ( ( rule__Bean__Group__0 ) ) )
            // InternalJavaFXLang.g:442:2: ( ( rule__Bean__Group__0 ) )
            {
            // InternalJavaFXLang.g:442:2: ( ( rule__Bean__Group__0 ) )
            // InternalJavaFXLang.g:443:3: ( rule__Bean__Group__0 )
            {
             before(grammarAccess.getBeanAccess().getGroup()); 
            // InternalJavaFXLang.g:444:3: ( rule__Bean__Group__0 )
            // InternalJavaFXLang.g:444:4: rule__Bean__Group__0
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
    // InternalJavaFXLang.g:453:1: entryRuleTableViewFX : ruleTableViewFX EOF ;
    public final void entryRuleTableViewFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:454:1: ( ruleTableViewFX EOF )
            // InternalJavaFXLang.g:455:1: ruleTableViewFX EOF
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
    // InternalJavaFXLang.g:462:1: ruleTableViewFX : ( ( rule__TableViewFX__Group__0 ) ) ;
    public final void ruleTableViewFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:466:2: ( ( ( rule__TableViewFX__Group__0 ) ) )
            // InternalJavaFXLang.g:467:2: ( ( rule__TableViewFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:467:2: ( ( rule__TableViewFX__Group__0 ) )
            // InternalJavaFXLang.g:468:3: ( rule__TableViewFX__Group__0 )
            {
             before(grammarAccess.getTableViewFXAccess().getGroup()); 
            // InternalJavaFXLang.g:469:3: ( rule__TableViewFX__Group__0 )
            // InternalJavaFXLang.g:469:4: rule__TableViewFX__Group__0
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
    // InternalJavaFXLang.g:478:1: entryRuleTableColumnFX : ruleTableColumnFX EOF ;
    public final void entryRuleTableColumnFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:479:1: ( ruleTableColumnFX EOF )
            // InternalJavaFXLang.g:480:1: ruleTableColumnFX EOF
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
    // InternalJavaFXLang.g:487:1: ruleTableColumnFX : ( ( rule__TableColumnFX__Group__0 ) ) ;
    public final void ruleTableColumnFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:491:2: ( ( ( rule__TableColumnFX__Group__0 ) ) )
            // InternalJavaFXLang.g:492:2: ( ( rule__TableColumnFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:492:2: ( ( rule__TableColumnFX__Group__0 ) )
            // InternalJavaFXLang.g:493:3: ( rule__TableColumnFX__Group__0 )
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup()); 
            // InternalJavaFXLang.g:494:3: ( rule__TableColumnFX__Group__0 )
            // InternalJavaFXLang.g:494:4: rule__TableColumnFX__Group__0
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
    // InternalJavaFXLang.g:503:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:504:1: ( ruleEBoolean EOF )
            // InternalJavaFXLang.g:505:1: ruleEBoolean EOF
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
    // InternalJavaFXLang.g:512:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:516:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalJavaFXLang.g:517:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalJavaFXLang.g:517:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalJavaFXLang.g:518:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalJavaFXLang.g:519:3: ( rule__EBoolean__Alternatives )
            // InternalJavaFXLang.g:519:4: rule__EBoolean__Alternatives
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
    // InternalJavaFXLang.g:528:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:529:1: ( ruleEInt EOF )
            // InternalJavaFXLang.g:530:1: ruleEInt EOF
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
    // InternalJavaFXLang.g:537:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:541:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalJavaFXLang.g:542:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalJavaFXLang.g:542:2: ( ( rule__EInt__Group__0 ) )
            // InternalJavaFXLang.g:543:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalJavaFXLang.g:544:3: ( rule__EInt__Group__0 )
            // InternalJavaFXLang.g:544:4: rule__EInt__Group__0
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
    // InternalJavaFXLang.g:553:1: entryRuleAttributeFX : ruleAttributeFX EOF ;
    public final void entryRuleAttributeFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:554:1: ( ruleAttributeFX EOF )
            // InternalJavaFXLang.g:555:1: ruleAttributeFX EOF
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
    // InternalJavaFXLang.g:562:1: ruleAttributeFX : ( ( rule__AttributeFX__Group__0 ) ) ;
    public final void ruleAttributeFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:566:2: ( ( ( rule__AttributeFX__Group__0 ) ) )
            // InternalJavaFXLang.g:567:2: ( ( rule__AttributeFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:567:2: ( ( rule__AttributeFX__Group__0 ) )
            // InternalJavaFXLang.g:568:3: ( rule__AttributeFX__Group__0 )
            {
             before(grammarAccess.getAttributeFXAccess().getGroup()); 
            // InternalJavaFXLang.g:569:3: ( rule__AttributeFX__Group__0 )
            // InternalJavaFXLang.g:569:4: rule__AttributeFX__Group__0
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
    // InternalJavaFXLang.g:578:1: ruleAxisType : ( ( rule__AxisType__Alternatives ) ) ;
    public final void ruleAxisType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:582:1: ( ( ( rule__AxisType__Alternatives ) ) )
            // InternalJavaFXLang.g:583:2: ( ( rule__AxisType__Alternatives ) )
            {
            // InternalJavaFXLang.g:583:2: ( ( rule__AxisType__Alternatives ) )
            // InternalJavaFXLang.g:584:3: ( rule__AxisType__Alternatives )
            {
             before(grammarAccess.getAxisTypeAccess().getAlternatives()); 
            // InternalJavaFXLang.g:585:3: ( rule__AxisType__Alternatives )
            // InternalJavaFXLang.g:585:4: rule__AxisType__Alternatives
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
    // InternalJavaFXLang.g:594:1: ruleOrientation : ( ( rule__Orientation__Alternatives ) ) ;
    public final void ruleOrientation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:598:1: ( ( ( rule__Orientation__Alternatives ) ) )
            // InternalJavaFXLang.g:599:2: ( ( rule__Orientation__Alternatives ) )
            {
            // InternalJavaFXLang.g:599:2: ( ( rule__Orientation__Alternatives ) )
            // InternalJavaFXLang.g:600:3: ( rule__Orientation__Alternatives )
            {
             before(grammarAccess.getOrientationAccess().getAlternatives()); 
            // InternalJavaFXLang.g:601:3: ( rule__Orientation__Alternatives )
            // InternalJavaFXLang.g:601:4: rule__Orientation__Alternatives
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
    // InternalJavaFXLang.g:610:1: ruleBindinType : ( ( rule__BindinType__Alternatives ) ) ;
    public final void ruleBindinType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:614:1: ( ( ( rule__BindinType__Alternatives ) ) )
            // InternalJavaFXLang.g:615:2: ( ( rule__BindinType__Alternatives ) )
            {
            // InternalJavaFXLang.g:615:2: ( ( rule__BindinType__Alternatives ) )
            // InternalJavaFXLang.g:616:3: ( rule__BindinType__Alternatives )
            {
             before(grammarAccess.getBindinTypeAccess().getAlternatives()); 
            // InternalJavaFXLang.g:617:3: ( rule__BindinType__Alternatives )
            // InternalJavaFXLang.g:617:4: rule__BindinType__Alternatives
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


    // $ANTLR start "rule__ChartFX__Alternatives"
    // InternalJavaFXLang.g:625:1: rule__ChartFX__Alternatives : ( ( ruleLineChartFX ) | ( rulePieChartFX ) | ( ruleAreaChartFX ) | ( ruleBubbleChartFX ) | ( ruleScatterChartFX ) | ( ruleBarChartFX ) );
    public final void rule__ChartFX__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:629:1: ( ( ruleLineChartFX ) | ( rulePieChartFX ) | ( ruleAreaChartFX ) | ( ruleBubbleChartFX ) | ( ruleScatterChartFX ) | ( ruleBarChartFX ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt1=1;
                }
                break;
            case 47:
                {
                alt1=2;
                }
                break;
            case 46:
                {
                alt1=3;
                }
                break;
            case 45:
                {
                alt1=4;
                }
                break;
            case 44:
                {
                alt1=5;
                }
                break;
            case 34:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalJavaFXLang.g:630:2: ( ruleLineChartFX )
                    {
                    // InternalJavaFXLang.g:630:2: ( ruleLineChartFX )
                    // InternalJavaFXLang.g:631:3: ruleLineChartFX
                    {
                     before(grammarAccess.getChartFXAccess().getLineChartFXParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLineChartFX();

                    state._fsp--;

                     after(grammarAccess.getChartFXAccess().getLineChartFXParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:636:2: ( rulePieChartFX )
                    {
                    // InternalJavaFXLang.g:636:2: ( rulePieChartFX )
                    // InternalJavaFXLang.g:637:3: rulePieChartFX
                    {
                     before(grammarAccess.getChartFXAccess().getPieChartFXParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePieChartFX();

                    state._fsp--;

                     after(grammarAccess.getChartFXAccess().getPieChartFXParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJavaFXLang.g:642:2: ( ruleAreaChartFX )
                    {
                    // InternalJavaFXLang.g:642:2: ( ruleAreaChartFX )
                    // InternalJavaFXLang.g:643:3: ruleAreaChartFX
                    {
                     before(grammarAccess.getChartFXAccess().getAreaChartFXParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAreaChartFX();

                    state._fsp--;

                     after(grammarAccess.getChartFXAccess().getAreaChartFXParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJavaFXLang.g:648:2: ( ruleBubbleChartFX )
                    {
                    // InternalJavaFXLang.g:648:2: ( ruleBubbleChartFX )
                    // InternalJavaFXLang.g:649:3: ruleBubbleChartFX
                    {
                     before(grammarAccess.getChartFXAccess().getBubbleChartFXParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBubbleChartFX();

                    state._fsp--;

                     after(grammarAccess.getChartFXAccess().getBubbleChartFXParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJavaFXLang.g:654:2: ( ruleScatterChartFX )
                    {
                    // InternalJavaFXLang.g:654:2: ( ruleScatterChartFX )
                    // InternalJavaFXLang.g:655:3: ruleScatterChartFX
                    {
                     before(grammarAccess.getChartFXAccess().getScatterChartFXParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleScatterChartFX();

                    state._fsp--;

                     after(grammarAccess.getChartFXAccess().getScatterChartFXParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJavaFXLang.g:660:2: ( ruleBarChartFX )
                    {
                    // InternalJavaFXLang.g:660:2: ( ruleBarChartFX )
                    // InternalJavaFXLang.g:661:3: ruleBarChartFX
                    {
                     before(grammarAccess.getChartFXAccess().getBarChartFXParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleBarChartFX();

                    state._fsp--;

                     after(grammarAccess.getChartFXAccess().getBarChartFXParserRuleCall_5()); 

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
    // $ANTLR end "rule__ChartFX__Alternatives"


    // $ANTLR start "rule__ControlFX__Alternatives"
    // InternalJavaFXLang.g:670:1: rule__ControlFX__Alternatives : ( ( ruleTableViewFX ) | ( ruleFilteredTableViewFX ) );
    public final void rule__ControlFX__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:674:1: ( ( ruleTableViewFX ) | ( ruleFilteredTableViewFX ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==55) ) {
                alt2=1;
            }
            else if ( (LA2_0==50) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJavaFXLang.g:675:2: ( ruleTableViewFX )
                    {
                    // InternalJavaFXLang.g:675:2: ( ruleTableViewFX )
                    // InternalJavaFXLang.g:676:3: ruleTableViewFX
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
                    // InternalJavaFXLang.g:681:2: ( ruleFilteredTableViewFX )
                    {
                    // InternalJavaFXLang.g:681:2: ( ruleFilteredTableViewFX )
                    // InternalJavaFXLang.g:682:3: ruleFilteredTableViewFX
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
    // InternalJavaFXLang.g:691:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:695:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJavaFXLang.g:696:2: ( RULE_STRING )
                    {
                    // InternalJavaFXLang.g:696:2: ( RULE_STRING )
                    // InternalJavaFXLang.g:697:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:702:2: ( RULE_ID )
                    {
                    // InternalJavaFXLang.g:702:2: ( RULE_ID )
                    // InternalJavaFXLang.g:703:3: RULE_ID
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
    // InternalJavaFXLang.g:712:1: rule__ModelFX__Alternatives : ( ( ruleDerivedBean ) | ( ruleBean ) );
    public final void rule__ModelFX__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:716:1: ( ( ruleDerivedBean ) | ( ruleBean ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==53) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_STRING) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==27) ) {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4==54) ) {
                            alt4=1;
                        }
                        else if ( ((LA4_4>=RULE_STRING && LA4_4<=RULE_ID)||LA4_4==28) ) {
                            alt4=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_1==RULE_ID) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==27) ) {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4==54) ) {
                            alt4=1;
                        }
                        else if ( ((LA4_4>=RULE_STRING && LA4_4<=RULE_ID)||LA4_4==28) ) {
                            alt4=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJavaFXLang.g:717:2: ( ruleDerivedBean )
                    {
                    // InternalJavaFXLang.g:717:2: ( ruleDerivedBean )
                    // InternalJavaFXLang.g:718:3: ruleDerivedBean
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
                    // InternalJavaFXLang.g:723:2: ( ruleBean )
                    {
                    // InternalJavaFXLang.g:723:2: ( ruleBean )
                    // InternalJavaFXLang.g:724:3: ruleBean
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
    // InternalJavaFXLang.g:733:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:737:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalJavaFXLang.g:738:2: ( 'true' )
                    {
                    // InternalJavaFXLang.g:738:2: ( 'true' )
                    // InternalJavaFXLang.g:739:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:744:2: ( 'false' )
                    {
                    // InternalJavaFXLang.g:744:2: ( 'false' )
                    // InternalJavaFXLang.g:745:3: 'false'
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
    // InternalJavaFXLang.g:754:1: rule__AxisType__Alternatives : ( ( ( 'Category' ) ) | ( ( 'Number' ) ) );
    public final void rule__AxisType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:758:1: ( ( ( 'Category' ) ) | ( ( 'Number' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalJavaFXLang.g:759:2: ( ( 'Category' ) )
                    {
                    // InternalJavaFXLang.g:759:2: ( ( 'Category' ) )
                    // InternalJavaFXLang.g:760:3: ( 'Category' )
                    {
                     before(grammarAccess.getAxisTypeAccess().getCategoryEnumLiteralDeclaration_0()); 
                    // InternalJavaFXLang.g:761:3: ( 'Category' )
                    // InternalJavaFXLang.g:761:4: 'Category'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAxisTypeAccess().getCategoryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:765:2: ( ( 'Number' ) )
                    {
                    // InternalJavaFXLang.g:765:2: ( ( 'Number' ) )
                    // InternalJavaFXLang.g:766:3: ( 'Number' )
                    {
                     before(grammarAccess.getAxisTypeAccess().getNumberEnumLiteralDeclaration_1()); 
                    // InternalJavaFXLang.g:767:3: ( 'Number' )
                    // InternalJavaFXLang.g:767:4: 'Number'
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
    // InternalJavaFXLang.g:775:1: rule__Orientation__Alternatives : ( ( ( 'Bottom' ) ) | ( ( 'Left' ) ) | ( ( 'Right' ) ) | ( ( 'Top' ) ) );
    public final void rule__Orientation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:779:1: ( ( ( 'Bottom' ) ) | ( ( 'Left' ) ) | ( ( 'Right' ) ) | ( ( 'Top' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt7=1;
                }
                break;
            case 16:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            case 18:
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
                    // InternalJavaFXLang.g:780:2: ( ( 'Bottom' ) )
                    {
                    // InternalJavaFXLang.g:780:2: ( ( 'Bottom' ) )
                    // InternalJavaFXLang.g:781:3: ( 'Bottom' )
                    {
                     before(grammarAccess.getOrientationAccess().getBottomEnumLiteralDeclaration_0()); 
                    // InternalJavaFXLang.g:782:3: ( 'Bottom' )
                    // InternalJavaFXLang.g:782:4: 'Bottom'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrientationAccess().getBottomEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:786:2: ( ( 'Left' ) )
                    {
                    // InternalJavaFXLang.g:786:2: ( ( 'Left' ) )
                    // InternalJavaFXLang.g:787:3: ( 'Left' )
                    {
                     before(grammarAccess.getOrientationAccess().getLeftEnumLiteralDeclaration_1()); 
                    // InternalJavaFXLang.g:788:3: ( 'Left' )
                    // InternalJavaFXLang.g:788:4: 'Left'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrientationAccess().getLeftEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJavaFXLang.g:792:2: ( ( 'Right' ) )
                    {
                    // InternalJavaFXLang.g:792:2: ( ( 'Right' ) )
                    // InternalJavaFXLang.g:793:3: ( 'Right' )
                    {
                     before(grammarAccess.getOrientationAccess().getRightEnumLiteralDeclaration_2()); 
                    // InternalJavaFXLang.g:794:3: ( 'Right' )
                    // InternalJavaFXLang.g:794:4: 'Right'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrientationAccess().getRightEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJavaFXLang.g:798:2: ( ( 'Top' ) )
                    {
                    // InternalJavaFXLang.g:798:2: ( ( 'Top' ) )
                    // InternalJavaFXLang.g:799:3: ( 'Top' )
                    {
                     before(grammarAccess.getOrientationAccess().getTopEnumLiteralDeclaration_3()); 
                    // InternalJavaFXLang.g:800:3: ( 'Top' )
                    // InternalJavaFXLang.g:800:4: 'Top'
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
    // InternalJavaFXLang.g:808:1: rule__BindinType__Alternatives : ( ( ( 'BooleanProperty' ) ) | ( ( 'DoubleProperty' ) ) | ( ( 'FloatProperty' ) ) | ( ( 'IntegerProperty' ) ) | ( ( 'ObservableList' ) ) | ( ( 'ObjectProperty' ) ) | ( ( 'StringProperty' ) ) );
    public final void rule__BindinType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:812:1: ( ( ( 'BooleanProperty' ) ) | ( ( 'DoubleProperty' ) ) | ( ( 'FloatProperty' ) ) | ( ( 'IntegerProperty' ) ) | ( ( 'ObservableList' ) ) | ( ( 'ObjectProperty' ) ) | ( ( 'StringProperty' ) ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            case 22:
                {
                alt8=4;
                }
                break;
            case 23:
                {
                alt8=5;
                }
                break;
            case 24:
                {
                alt8=6;
                }
                break;
            case 25:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalJavaFXLang.g:813:2: ( ( 'BooleanProperty' ) )
                    {
                    // InternalJavaFXLang.g:813:2: ( ( 'BooleanProperty' ) )
                    // InternalJavaFXLang.g:814:3: ( 'BooleanProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getBooleanPropertyEnumLiteralDeclaration_0()); 
                    // InternalJavaFXLang.g:815:3: ( 'BooleanProperty' )
                    // InternalJavaFXLang.g:815:4: 'BooleanProperty'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getBooleanPropertyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:819:2: ( ( 'DoubleProperty' ) )
                    {
                    // InternalJavaFXLang.g:819:2: ( ( 'DoubleProperty' ) )
                    // InternalJavaFXLang.g:820:3: ( 'DoubleProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getDoublePropertyEnumLiteralDeclaration_1()); 
                    // InternalJavaFXLang.g:821:3: ( 'DoubleProperty' )
                    // InternalJavaFXLang.g:821:4: 'DoubleProperty'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getDoublePropertyEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJavaFXLang.g:825:2: ( ( 'FloatProperty' ) )
                    {
                    // InternalJavaFXLang.g:825:2: ( ( 'FloatProperty' ) )
                    // InternalJavaFXLang.g:826:3: ( 'FloatProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getFloatPropertyEnumLiteralDeclaration_2()); 
                    // InternalJavaFXLang.g:827:3: ( 'FloatProperty' )
                    // InternalJavaFXLang.g:827:4: 'FloatProperty'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getFloatPropertyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJavaFXLang.g:831:2: ( ( 'IntegerProperty' ) )
                    {
                    // InternalJavaFXLang.g:831:2: ( ( 'IntegerProperty' ) )
                    // InternalJavaFXLang.g:832:3: ( 'IntegerProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getIntegerPropertyEnumLiteralDeclaration_3()); 
                    // InternalJavaFXLang.g:833:3: ( 'IntegerProperty' )
                    // InternalJavaFXLang.g:833:4: 'IntegerProperty'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getIntegerPropertyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJavaFXLang.g:837:2: ( ( 'ObservableList' ) )
                    {
                    // InternalJavaFXLang.g:837:2: ( ( 'ObservableList' ) )
                    // InternalJavaFXLang.g:838:3: ( 'ObservableList' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getObservableListEnumLiteralDeclaration_4()); 
                    // InternalJavaFXLang.g:839:3: ( 'ObservableList' )
                    // InternalJavaFXLang.g:839:4: 'ObservableList'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getObservableListEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJavaFXLang.g:843:2: ( ( 'ObjectProperty' ) )
                    {
                    // InternalJavaFXLang.g:843:2: ( ( 'ObjectProperty' ) )
                    // InternalJavaFXLang.g:844:3: ( 'ObjectProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getObjectPropertyEnumLiteralDeclaration_5()); 
                    // InternalJavaFXLang.g:845:3: ( 'ObjectProperty' )
                    // InternalJavaFXLang.g:845:4: 'ObjectProperty'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getObjectPropertyEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJavaFXLang.g:849:2: ( ( 'StringProperty' ) )
                    {
                    // InternalJavaFXLang.g:849:2: ( ( 'StringProperty' ) )
                    // InternalJavaFXLang.g:850:3: ( 'StringProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getStringPropertyEnumLiteralDeclaration_6()); 
                    // InternalJavaFXLang.g:851:3: ( 'StringProperty' )
                    // InternalJavaFXLang.g:851:4: 'StringProperty'
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
    // InternalJavaFXLang.g:859:1: rule__ProjectFX__Group__0 : rule__ProjectFX__Group__0__Impl rule__ProjectFX__Group__1 ;
    public final void rule__ProjectFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:863:1: ( rule__ProjectFX__Group__0__Impl rule__ProjectFX__Group__1 )
            // InternalJavaFXLang.g:864:2: rule__ProjectFX__Group__0__Impl rule__ProjectFX__Group__1
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
    // InternalJavaFXLang.g:871:1: rule__ProjectFX__Group__0__Impl : ( () ) ;
    public final void rule__ProjectFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:875:1: ( ( () ) )
            // InternalJavaFXLang.g:876:1: ( () )
            {
            // InternalJavaFXLang.g:876:1: ( () )
            // InternalJavaFXLang.g:877:2: ()
            {
             before(grammarAccess.getProjectFXAccess().getProjectFXAction_0()); 
            // InternalJavaFXLang.g:878:2: ()
            // InternalJavaFXLang.g:878:3: 
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
    // InternalJavaFXLang.g:886:1: rule__ProjectFX__Group__1 : rule__ProjectFX__Group__1__Impl rule__ProjectFX__Group__2 ;
    public final void rule__ProjectFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:890:1: ( rule__ProjectFX__Group__1__Impl rule__ProjectFX__Group__2 )
            // InternalJavaFXLang.g:891:2: rule__ProjectFX__Group__1__Impl rule__ProjectFX__Group__2
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
    // InternalJavaFXLang.g:898:1: rule__ProjectFX__Group__1__Impl : ( 'ProjectFX' ) ;
    public final void rule__ProjectFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:902:1: ( ( 'ProjectFX' ) )
            // InternalJavaFXLang.g:903:1: ( 'ProjectFX' )
            {
            // InternalJavaFXLang.g:903:1: ( 'ProjectFX' )
            // InternalJavaFXLang.g:904:2: 'ProjectFX'
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
    // InternalJavaFXLang.g:913:1: rule__ProjectFX__Group__2 : rule__ProjectFX__Group__2__Impl rule__ProjectFX__Group__3 ;
    public final void rule__ProjectFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:917:1: ( rule__ProjectFX__Group__2__Impl rule__ProjectFX__Group__3 )
            // InternalJavaFXLang.g:918:2: rule__ProjectFX__Group__2__Impl rule__ProjectFX__Group__3
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
    // InternalJavaFXLang.g:925:1: rule__ProjectFX__Group__2__Impl : ( ( rule__ProjectFX__NameAssignment_2 ) ) ;
    public final void rule__ProjectFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:929:1: ( ( ( rule__ProjectFX__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:930:1: ( ( rule__ProjectFX__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:930:1: ( ( rule__ProjectFX__NameAssignment_2 ) )
            // InternalJavaFXLang.g:931:2: ( rule__ProjectFX__NameAssignment_2 )
            {
             before(grammarAccess.getProjectFXAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:932:2: ( rule__ProjectFX__NameAssignment_2 )
            // InternalJavaFXLang.g:932:3: rule__ProjectFX__NameAssignment_2
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
    // InternalJavaFXLang.g:940:1: rule__ProjectFX__Group__3 : rule__ProjectFX__Group__3__Impl rule__ProjectFX__Group__4 ;
    public final void rule__ProjectFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:944:1: ( rule__ProjectFX__Group__3__Impl rule__ProjectFX__Group__4 )
            // InternalJavaFXLang.g:945:2: rule__ProjectFX__Group__3__Impl rule__ProjectFX__Group__4
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
    // InternalJavaFXLang.g:952:1: rule__ProjectFX__Group__3__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:956:1: ( ( '{' ) )
            // InternalJavaFXLang.g:957:1: ( '{' )
            {
            // InternalJavaFXLang.g:957:1: ( '{' )
            // InternalJavaFXLang.g:958:2: '{'
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
    // InternalJavaFXLang.g:967:1: rule__ProjectFX__Group__4 : rule__ProjectFX__Group__4__Impl rule__ProjectFX__Group__5 ;
    public final void rule__ProjectFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:971:1: ( rule__ProjectFX__Group__4__Impl rule__ProjectFX__Group__5 )
            // InternalJavaFXLang.g:972:2: rule__ProjectFX__Group__4__Impl rule__ProjectFX__Group__5
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
    // InternalJavaFXLang.g:979:1: rule__ProjectFX__Group__4__Impl : ( ( rule__ProjectFX__Group_4__0 )? ) ;
    public final void rule__ProjectFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:983:1: ( ( ( rule__ProjectFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:984:1: ( ( rule__ProjectFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:984:1: ( ( rule__ProjectFX__Group_4__0 )? )
            // InternalJavaFXLang.g:985:2: ( rule__ProjectFX__Group_4__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:986:2: ( rule__ProjectFX__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJavaFXLang.g:986:3: rule__ProjectFX__Group_4__0
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
    // InternalJavaFXLang.g:994:1: rule__ProjectFX__Group__5 : rule__ProjectFX__Group__5__Impl rule__ProjectFX__Group__6 ;
    public final void rule__ProjectFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:998:1: ( rule__ProjectFX__Group__5__Impl rule__ProjectFX__Group__6 )
            // InternalJavaFXLang.g:999:2: rule__ProjectFX__Group__5__Impl rule__ProjectFX__Group__6
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
    // InternalJavaFXLang.g:1006:1: rule__ProjectFX__Group__5__Impl : ( ( rule__ProjectFX__Group_5__0 )? ) ;
    public final void rule__ProjectFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1010:1: ( ( ( rule__ProjectFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:1011:1: ( ( rule__ProjectFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:1011:1: ( ( rule__ProjectFX__Group_5__0 )? )
            // InternalJavaFXLang.g:1012:2: ( rule__ProjectFX__Group_5__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:1013:2: ( rule__ProjectFX__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJavaFXLang.g:1013:3: rule__ProjectFX__Group_5__0
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
    // InternalJavaFXLang.g:1021:1: rule__ProjectFX__Group__6 : rule__ProjectFX__Group__6__Impl rule__ProjectFX__Group__7 ;
    public final void rule__ProjectFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1025:1: ( rule__ProjectFX__Group__6__Impl rule__ProjectFX__Group__7 )
            // InternalJavaFXLang.g:1026:2: rule__ProjectFX__Group__6__Impl rule__ProjectFX__Group__7
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
    // InternalJavaFXLang.g:1033:1: rule__ProjectFX__Group__6__Impl : ( ( rule__ProjectFX__Group_6__0 )? ) ;
    public final void rule__ProjectFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1037:1: ( ( ( rule__ProjectFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:1038:1: ( ( rule__ProjectFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:1038:1: ( ( rule__ProjectFX__Group_6__0 )? )
            // InternalJavaFXLang.g:1039:2: ( rule__ProjectFX__Group_6__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:1040:2: ( rule__ProjectFX__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJavaFXLang.g:1040:3: rule__ProjectFX__Group_6__0
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
    // InternalJavaFXLang.g:1048:1: rule__ProjectFX__Group__7 : rule__ProjectFX__Group__7__Impl rule__ProjectFX__Group__8 ;
    public final void rule__ProjectFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1052:1: ( rule__ProjectFX__Group__7__Impl rule__ProjectFX__Group__8 )
            // InternalJavaFXLang.g:1053:2: rule__ProjectFX__Group__7__Impl rule__ProjectFX__Group__8
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
    // InternalJavaFXLang.g:1060:1: rule__ProjectFX__Group__7__Impl : ( ( rule__ProjectFX__Group_7__0 )? ) ;
    public final void rule__ProjectFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1064:1: ( ( ( rule__ProjectFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:1065:1: ( ( rule__ProjectFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:1065:1: ( ( rule__ProjectFX__Group_7__0 )? )
            // InternalJavaFXLang.g:1066:2: ( rule__ProjectFX__Group_7__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:1067:2: ( rule__ProjectFX__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJavaFXLang.g:1067:3: rule__ProjectFX__Group_7__0
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
    // InternalJavaFXLang.g:1075:1: rule__ProjectFX__Group__8 : rule__ProjectFX__Group__8__Impl rule__ProjectFX__Group__9 ;
    public final void rule__ProjectFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1079:1: ( rule__ProjectFX__Group__8__Impl rule__ProjectFX__Group__9 )
            // InternalJavaFXLang.g:1080:2: rule__ProjectFX__Group__8__Impl rule__ProjectFX__Group__9
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
    // InternalJavaFXLang.g:1087:1: rule__ProjectFX__Group__8__Impl : ( ( rule__ProjectFX__Group_8__0 )? ) ;
    public final void rule__ProjectFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1091:1: ( ( ( rule__ProjectFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:1092:1: ( ( rule__ProjectFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:1092:1: ( ( rule__ProjectFX__Group_8__0 )? )
            // InternalJavaFXLang.g:1093:2: ( rule__ProjectFX__Group_8__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:1094:2: ( rule__ProjectFX__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJavaFXLang.g:1094:3: rule__ProjectFX__Group_8__0
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
    // InternalJavaFXLang.g:1102:1: rule__ProjectFX__Group__9 : rule__ProjectFX__Group__9__Impl ;
    public final void rule__ProjectFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1106:1: ( rule__ProjectFX__Group__9__Impl )
            // InternalJavaFXLang.g:1107:2: rule__ProjectFX__Group__9__Impl
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
    // InternalJavaFXLang.g:1113:1: rule__ProjectFX__Group__9__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1117:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1118:1: ( '}' )
            {
            // InternalJavaFXLang.g:1118:1: ( '}' )
            // InternalJavaFXLang.g:1119:2: '}'
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
    // InternalJavaFXLang.g:1129:1: rule__ProjectFX__Group_4__0 : rule__ProjectFX__Group_4__0__Impl rule__ProjectFX__Group_4__1 ;
    public final void rule__ProjectFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1133:1: ( rule__ProjectFX__Group_4__0__Impl rule__ProjectFX__Group_4__1 )
            // InternalJavaFXLang.g:1134:2: rule__ProjectFX__Group_4__0__Impl rule__ProjectFX__Group_4__1
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
    // InternalJavaFXLang.g:1141:1: rule__ProjectFX__Group_4__0__Impl : ( 'packagePath' ) ;
    public final void rule__ProjectFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1145:1: ( ( 'packagePath' ) )
            // InternalJavaFXLang.g:1146:1: ( 'packagePath' )
            {
            // InternalJavaFXLang.g:1146:1: ( 'packagePath' )
            // InternalJavaFXLang.g:1147:2: 'packagePath'
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
    // InternalJavaFXLang.g:1156:1: rule__ProjectFX__Group_4__1 : rule__ProjectFX__Group_4__1__Impl ;
    public final void rule__ProjectFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1160:1: ( rule__ProjectFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:1161:2: rule__ProjectFX__Group_4__1__Impl
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
    // InternalJavaFXLang.g:1167:1: rule__ProjectFX__Group_4__1__Impl : ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) ) ;
    public final void rule__ProjectFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1171:1: ( ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:1172:1: ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:1172:1: ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) )
            // InternalJavaFXLang.g:1173:2: ( rule__ProjectFX__PackagePathAssignment_4_1 )
            {
             before(grammarAccess.getProjectFXAccess().getPackagePathAssignment_4_1()); 
            // InternalJavaFXLang.g:1174:2: ( rule__ProjectFX__PackagePathAssignment_4_1 )
            // InternalJavaFXLang.g:1174:3: rule__ProjectFX__PackagePathAssignment_4_1
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
    // InternalJavaFXLang.g:1183:1: rule__ProjectFX__Group_5__0 : rule__ProjectFX__Group_5__0__Impl rule__ProjectFX__Group_5__1 ;
    public final void rule__ProjectFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1187:1: ( rule__ProjectFX__Group_5__0__Impl rule__ProjectFX__Group_5__1 )
            // InternalJavaFXLang.g:1188:2: rule__ProjectFX__Group_5__0__Impl rule__ProjectFX__Group_5__1
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
    // InternalJavaFXLang.g:1195:1: rule__ProjectFX__Group_5__0__Impl : ( 'controls' ) ;
    public final void rule__ProjectFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1199:1: ( ( 'controls' ) )
            // InternalJavaFXLang.g:1200:1: ( 'controls' )
            {
            // InternalJavaFXLang.g:1200:1: ( 'controls' )
            // InternalJavaFXLang.g:1201:2: 'controls'
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
    // InternalJavaFXLang.g:1210:1: rule__ProjectFX__Group_5__1 : rule__ProjectFX__Group_5__1__Impl rule__ProjectFX__Group_5__2 ;
    public final void rule__ProjectFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1214:1: ( rule__ProjectFX__Group_5__1__Impl rule__ProjectFX__Group_5__2 )
            // InternalJavaFXLang.g:1215:2: rule__ProjectFX__Group_5__1__Impl rule__ProjectFX__Group_5__2
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
    // InternalJavaFXLang.g:1222:1: rule__ProjectFX__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1226:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1227:1: ( '{' )
            {
            // InternalJavaFXLang.g:1227:1: ( '{' )
            // InternalJavaFXLang.g:1228:2: '{'
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
    // InternalJavaFXLang.g:1237:1: rule__ProjectFX__Group_5__2 : rule__ProjectFX__Group_5__2__Impl rule__ProjectFX__Group_5__3 ;
    public final void rule__ProjectFX__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1241:1: ( rule__ProjectFX__Group_5__2__Impl rule__ProjectFX__Group_5__3 )
            // InternalJavaFXLang.g:1242:2: rule__ProjectFX__Group_5__2__Impl rule__ProjectFX__Group_5__3
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
    // InternalJavaFXLang.g:1249:1: rule__ProjectFX__Group_5__2__Impl : ( ( rule__ProjectFX__ControlsAssignment_5_2 ) ) ;
    public final void rule__ProjectFX__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1253:1: ( ( ( rule__ProjectFX__ControlsAssignment_5_2 ) ) )
            // InternalJavaFXLang.g:1254:1: ( ( rule__ProjectFX__ControlsAssignment_5_2 ) )
            {
            // InternalJavaFXLang.g:1254:1: ( ( rule__ProjectFX__ControlsAssignment_5_2 ) )
            // InternalJavaFXLang.g:1255:2: ( rule__ProjectFX__ControlsAssignment_5_2 )
            {
             before(grammarAccess.getProjectFXAccess().getControlsAssignment_5_2()); 
            // InternalJavaFXLang.g:1256:2: ( rule__ProjectFX__ControlsAssignment_5_2 )
            // InternalJavaFXLang.g:1256:3: rule__ProjectFX__ControlsAssignment_5_2
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
    // InternalJavaFXLang.g:1264:1: rule__ProjectFX__Group_5__3 : rule__ProjectFX__Group_5__3__Impl rule__ProjectFX__Group_5__4 ;
    public final void rule__ProjectFX__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1268:1: ( rule__ProjectFX__Group_5__3__Impl rule__ProjectFX__Group_5__4 )
            // InternalJavaFXLang.g:1269:2: rule__ProjectFX__Group_5__3__Impl rule__ProjectFX__Group_5__4
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
    // InternalJavaFXLang.g:1276:1: rule__ProjectFX__Group_5__3__Impl : ( ( rule__ProjectFX__ControlsAssignment_5_3 )* ) ;
    public final void rule__ProjectFX__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1280:1: ( ( ( rule__ProjectFX__ControlsAssignment_5_3 )* ) )
            // InternalJavaFXLang.g:1281:1: ( ( rule__ProjectFX__ControlsAssignment_5_3 )* )
            {
            // InternalJavaFXLang.g:1281:1: ( ( rule__ProjectFX__ControlsAssignment_5_3 )* )
            // InternalJavaFXLang.g:1282:2: ( rule__ProjectFX__ControlsAssignment_5_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getControlsAssignment_5_3()); 
            // InternalJavaFXLang.g:1283:2: ( rule__ProjectFX__ControlsAssignment_5_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==50||LA14_0==55) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJavaFXLang.g:1283:3: rule__ProjectFX__ControlsAssignment_5_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ProjectFX__ControlsAssignment_5_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalJavaFXLang.g:1291:1: rule__ProjectFX__Group_5__4 : rule__ProjectFX__Group_5__4__Impl ;
    public final void rule__ProjectFX__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1295:1: ( rule__ProjectFX__Group_5__4__Impl )
            // InternalJavaFXLang.g:1296:2: rule__ProjectFX__Group_5__4__Impl
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
    // InternalJavaFXLang.g:1302:1: rule__ProjectFX__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1306:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1307:1: ( '}' )
            {
            // InternalJavaFXLang.g:1307:1: ( '}' )
            // InternalJavaFXLang.g:1308:2: '}'
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
    // InternalJavaFXLang.g:1318:1: rule__ProjectFX__Group_6__0 : rule__ProjectFX__Group_6__0__Impl rule__ProjectFX__Group_6__1 ;
    public final void rule__ProjectFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1322:1: ( rule__ProjectFX__Group_6__0__Impl rule__ProjectFX__Group_6__1 )
            // InternalJavaFXLang.g:1323:2: rule__ProjectFX__Group_6__0__Impl rule__ProjectFX__Group_6__1
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
    // InternalJavaFXLang.g:1330:1: rule__ProjectFX__Group_6__0__Impl : ( 'models' ) ;
    public final void rule__ProjectFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1334:1: ( ( 'models' ) )
            // InternalJavaFXLang.g:1335:1: ( 'models' )
            {
            // InternalJavaFXLang.g:1335:1: ( 'models' )
            // InternalJavaFXLang.g:1336:2: 'models'
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
    // InternalJavaFXLang.g:1345:1: rule__ProjectFX__Group_6__1 : rule__ProjectFX__Group_6__1__Impl rule__ProjectFX__Group_6__2 ;
    public final void rule__ProjectFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1349:1: ( rule__ProjectFX__Group_6__1__Impl rule__ProjectFX__Group_6__2 )
            // InternalJavaFXLang.g:1350:2: rule__ProjectFX__Group_6__1__Impl rule__ProjectFX__Group_6__2
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
    // InternalJavaFXLang.g:1357:1: rule__ProjectFX__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1361:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1362:1: ( '{' )
            {
            // InternalJavaFXLang.g:1362:1: ( '{' )
            // InternalJavaFXLang.g:1363:2: '{'
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
    // InternalJavaFXLang.g:1372:1: rule__ProjectFX__Group_6__2 : rule__ProjectFX__Group_6__2__Impl rule__ProjectFX__Group_6__3 ;
    public final void rule__ProjectFX__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1376:1: ( rule__ProjectFX__Group_6__2__Impl rule__ProjectFX__Group_6__3 )
            // InternalJavaFXLang.g:1377:2: rule__ProjectFX__Group_6__2__Impl rule__ProjectFX__Group_6__3
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
    // InternalJavaFXLang.g:1384:1: rule__ProjectFX__Group_6__2__Impl : ( ( rule__ProjectFX__ModelsAssignment_6_2 ) ) ;
    public final void rule__ProjectFX__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1388:1: ( ( ( rule__ProjectFX__ModelsAssignment_6_2 ) ) )
            // InternalJavaFXLang.g:1389:1: ( ( rule__ProjectFX__ModelsAssignment_6_2 ) )
            {
            // InternalJavaFXLang.g:1389:1: ( ( rule__ProjectFX__ModelsAssignment_6_2 ) )
            // InternalJavaFXLang.g:1390:2: ( rule__ProjectFX__ModelsAssignment_6_2 )
            {
             before(grammarAccess.getProjectFXAccess().getModelsAssignment_6_2()); 
            // InternalJavaFXLang.g:1391:2: ( rule__ProjectFX__ModelsAssignment_6_2 )
            // InternalJavaFXLang.g:1391:3: rule__ProjectFX__ModelsAssignment_6_2
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
    // InternalJavaFXLang.g:1399:1: rule__ProjectFX__Group_6__3 : rule__ProjectFX__Group_6__3__Impl rule__ProjectFX__Group_6__4 ;
    public final void rule__ProjectFX__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1403:1: ( rule__ProjectFX__Group_6__3__Impl rule__ProjectFX__Group_6__4 )
            // InternalJavaFXLang.g:1404:2: rule__ProjectFX__Group_6__3__Impl rule__ProjectFX__Group_6__4
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
    // InternalJavaFXLang.g:1411:1: rule__ProjectFX__Group_6__3__Impl : ( ( rule__ProjectFX__ModelsAssignment_6_3 )* ) ;
    public final void rule__ProjectFX__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1415:1: ( ( ( rule__ProjectFX__ModelsAssignment_6_3 )* ) )
            // InternalJavaFXLang.g:1416:1: ( ( rule__ProjectFX__ModelsAssignment_6_3 )* )
            {
            // InternalJavaFXLang.g:1416:1: ( ( rule__ProjectFX__ModelsAssignment_6_3 )* )
            // InternalJavaFXLang.g:1417:2: ( rule__ProjectFX__ModelsAssignment_6_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getModelsAssignment_6_3()); 
            // InternalJavaFXLang.g:1418:2: ( rule__ProjectFX__ModelsAssignment_6_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==53) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalJavaFXLang.g:1418:3: rule__ProjectFX__ModelsAssignment_6_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ProjectFX__ModelsAssignment_6_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalJavaFXLang.g:1426:1: rule__ProjectFX__Group_6__4 : rule__ProjectFX__Group_6__4__Impl ;
    public final void rule__ProjectFX__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1430:1: ( rule__ProjectFX__Group_6__4__Impl )
            // InternalJavaFXLang.g:1431:2: rule__ProjectFX__Group_6__4__Impl
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
    // InternalJavaFXLang.g:1437:1: rule__ProjectFX__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1441:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1442:1: ( '}' )
            {
            // InternalJavaFXLang.g:1442:1: ( '}' )
            // InternalJavaFXLang.g:1443:2: '}'
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
    // InternalJavaFXLang.g:1453:1: rule__ProjectFX__Group_7__0 : rule__ProjectFX__Group_7__0__Impl rule__ProjectFX__Group_7__1 ;
    public final void rule__ProjectFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1457:1: ( rule__ProjectFX__Group_7__0__Impl rule__ProjectFX__Group_7__1 )
            // InternalJavaFXLang.g:1458:2: rule__ProjectFX__Group_7__0__Impl rule__ProjectFX__Group_7__1
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
    // InternalJavaFXLang.g:1465:1: rule__ProjectFX__Group_7__0__Impl : ( 'bindings' ) ;
    public final void rule__ProjectFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1469:1: ( ( 'bindings' ) )
            // InternalJavaFXLang.g:1470:1: ( 'bindings' )
            {
            // InternalJavaFXLang.g:1470:1: ( 'bindings' )
            // InternalJavaFXLang.g:1471:2: 'bindings'
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
    // InternalJavaFXLang.g:1480:1: rule__ProjectFX__Group_7__1 : rule__ProjectFX__Group_7__1__Impl rule__ProjectFX__Group_7__2 ;
    public final void rule__ProjectFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1484:1: ( rule__ProjectFX__Group_7__1__Impl rule__ProjectFX__Group_7__2 )
            // InternalJavaFXLang.g:1485:2: rule__ProjectFX__Group_7__1__Impl rule__ProjectFX__Group_7__2
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
    // InternalJavaFXLang.g:1492:1: rule__ProjectFX__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1496:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1497:1: ( '{' )
            {
            // InternalJavaFXLang.g:1497:1: ( '{' )
            // InternalJavaFXLang.g:1498:2: '{'
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
    // InternalJavaFXLang.g:1507:1: rule__ProjectFX__Group_7__2 : rule__ProjectFX__Group_7__2__Impl rule__ProjectFX__Group_7__3 ;
    public final void rule__ProjectFX__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1511:1: ( rule__ProjectFX__Group_7__2__Impl rule__ProjectFX__Group_7__3 )
            // InternalJavaFXLang.g:1512:2: rule__ProjectFX__Group_7__2__Impl rule__ProjectFX__Group_7__3
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
    // InternalJavaFXLang.g:1519:1: rule__ProjectFX__Group_7__2__Impl : ( ( rule__ProjectFX__BindingsAssignment_7_2 ) ) ;
    public final void rule__ProjectFX__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1523:1: ( ( ( rule__ProjectFX__BindingsAssignment_7_2 ) ) )
            // InternalJavaFXLang.g:1524:1: ( ( rule__ProjectFX__BindingsAssignment_7_2 ) )
            {
            // InternalJavaFXLang.g:1524:1: ( ( rule__ProjectFX__BindingsAssignment_7_2 ) )
            // InternalJavaFXLang.g:1525:2: ( rule__ProjectFX__BindingsAssignment_7_2 )
            {
             before(grammarAccess.getProjectFXAccess().getBindingsAssignment_7_2()); 
            // InternalJavaFXLang.g:1526:2: ( rule__ProjectFX__BindingsAssignment_7_2 )
            // InternalJavaFXLang.g:1526:3: rule__ProjectFX__BindingsAssignment_7_2
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
    // InternalJavaFXLang.g:1534:1: rule__ProjectFX__Group_7__3 : rule__ProjectFX__Group_7__3__Impl rule__ProjectFX__Group_7__4 ;
    public final void rule__ProjectFX__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1538:1: ( rule__ProjectFX__Group_7__3__Impl rule__ProjectFX__Group_7__4 )
            // InternalJavaFXLang.g:1539:2: rule__ProjectFX__Group_7__3__Impl rule__ProjectFX__Group_7__4
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
    // InternalJavaFXLang.g:1546:1: rule__ProjectFX__Group_7__3__Impl : ( ( rule__ProjectFX__BindingsAssignment_7_3 )* ) ;
    public final void rule__ProjectFX__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1550:1: ( ( ( rule__ProjectFX__BindingsAssignment_7_3 )* ) )
            // InternalJavaFXLang.g:1551:1: ( ( rule__ProjectFX__BindingsAssignment_7_3 )* )
            {
            // InternalJavaFXLang.g:1551:1: ( ( rule__ProjectFX__BindingsAssignment_7_3 )* )
            // InternalJavaFXLang.g:1552:2: ( rule__ProjectFX__BindingsAssignment_7_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getBindingsAssignment_7_3()); 
            // InternalJavaFXLang.g:1553:2: ( rule__ProjectFX__BindingsAssignment_7_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==49) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalJavaFXLang.g:1553:3: rule__ProjectFX__BindingsAssignment_7_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ProjectFX__BindingsAssignment_7_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalJavaFXLang.g:1561:1: rule__ProjectFX__Group_7__4 : rule__ProjectFX__Group_7__4__Impl ;
    public final void rule__ProjectFX__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1565:1: ( rule__ProjectFX__Group_7__4__Impl )
            // InternalJavaFXLang.g:1566:2: rule__ProjectFX__Group_7__4__Impl
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
    // InternalJavaFXLang.g:1572:1: rule__ProjectFX__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1576:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1577:1: ( '}' )
            {
            // InternalJavaFXLang.g:1577:1: ( '}' )
            // InternalJavaFXLang.g:1578:2: '}'
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
    // InternalJavaFXLang.g:1588:1: rule__ProjectFX__Group_8__0 : rule__ProjectFX__Group_8__0__Impl rule__ProjectFX__Group_8__1 ;
    public final void rule__ProjectFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1592:1: ( rule__ProjectFX__Group_8__0__Impl rule__ProjectFX__Group_8__1 )
            // InternalJavaFXLang.g:1593:2: rule__ProjectFX__Group_8__0__Impl rule__ProjectFX__Group_8__1
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
    // InternalJavaFXLang.g:1600:1: rule__ProjectFX__Group_8__0__Impl : ( 'charts' ) ;
    public final void rule__ProjectFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1604:1: ( ( 'charts' ) )
            // InternalJavaFXLang.g:1605:1: ( 'charts' )
            {
            // InternalJavaFXLang.g:1605:1: ( 'charts' )
            // InternalJavaFXLang.g:1606:2: 'charts'
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
    // InternalJavaFXLang.g:1615:1: rule__ProjectFX__Group_8__1 : rule__ProjectFX__Group_8__1__Impl rule__ProjectFX__Group_8__2 ;
    public final void rule__ProjectFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1619:1: ( rule__ProjectFX__Group_8__1__Impl rule__ProjectFX__Group_8__2 )
            // InternalJavaFXLang.g:1620:2: rule__ProjectFX__Group_8__1__Impl rule__ProjectFX__Group_8__2
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
    // InternalJavaFXLang.g:1627:1: rule__ProjectFX__Group_8__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1631:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1632:1: ( '{' )
            {
            // InternalJavaFXLang.g:1632:1: ( '{' )
            // InternalJavaFXLang.g:1633:2: '{'
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
    // InternalJavaFXLang.g:1642:1: rule__ProjectFX__Group_8__2 : rule__ProjectFX__Group_8__2__Impl rule__ProjectFX__Group_8__3 ;
    public final void rule__ProjectFX__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1646:1: ( rule__ProjectFX__Group_8__2__Impl rule__ProjectFX__Group_8__3 )
            // InternalJavaFXLang.g:1647:2: rule__ProjectFX__Group_8__2__Impl rule__ProjectFX__Group_8__3
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
    // InternalJavaFXLang.g:1654:1: rule__ProjectFX__Group_8__2__Impl : ( ( rule__ProjectFX__ChartsAssignment_8_2 ) ) ;
    public final void rule__ProjectFX__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1658:1: ( ( ( rule__ProjectFX__ChartsAssignment_8_2 ) ) )
            // InternalJavaFXLang.g:1659:1: ( ( rule__ProjectFX__ChartsAssignment_8_2 ) )
            {
            // InternalJavaFXLang.g:1659:1: ( ( rule__ProjectFX__ChartsAssignment_8_2 ) )
            // InternalJavaFXLang.g:1660:2: ( rule__ProjectFX__ChartsAssignment_8_2 )
            {
             before(grammarAccess.getProjectFXAccess().getChartsAssignment_8_2()); 
            // InternalJavaFXLang.g:1661:2: ( rule__ProjectFX__ChartsAssignment_8_2 )
            // InternalJavaFXLang.g:1661:3: rule__ProjectFX__ChartsAssignment_8_2
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
    // InternalJavaFXLang.g:1669:1: rule__ProjectFX__Group_8__3 : rule__ProjectFX__Group_8__3__Impl rule__ProjectFX__Group_8__4 ;
    public final void rule__ProjectFX__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1673:1: ( rule__ProjectFX__Group_8__3__Impl rule__ProjectFX__Group_8__4 )
            // InternalJavaFXLang.g:1674:2: rule__ProjectFX__Group_8__3__Impl rule__ProjectFX__Group_8__4
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
    // InternalJavaFXLang.g:1681:1: rule__ProjectFX__Group_8__3__Impl : ( ( rule__ProjectFX__ChartsAssignment_8_3 )* ) ;
    public final void rule__ProjectFX__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1685:1: ( ( ( rule__ProjectFX__ChartsAssignment_8_3 )* ) )
            // InternalJavaFXLang.g:1686:1: ( ( rule__ProjectFX__ChartsAssignment_8_3 )* )
            {
            // InternalJavaFXLang.g:1686:1: ( ( rule__ProjectFX__ChartsAssignment_8_3 )* )
            // InternalJavaFXLang.g:1687:2: ( rule__ProjectFX__ChartsAssignment_8_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getChartsAssignment_8_3()); 
            // InternalJavaFXLang.g:1688:2: ( rule__ProjectFX__ChartsAssignment_8_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34||(LA17_0>=44 && LA17_0<=48)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalJavaFXLang.g:1688:3: rule__ProjectFX__ChartsAssignment_8_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ProjectFX__ChartsAssignment_8_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalJavaFXLang.g:1696:1: rule__ProjectFX__Group_8__4 : rule__ProjectFX__Group_8__4__Impl ;
    public final void rule__ProjectFX__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1700:1: ( rule__ProjectFX__Group_8__4__Impl )
            // InternalJavaFXLang.g:1701:2: rule__ProjectFX__Group_8__4__Impl
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
    // InternalJavaFXLang.g:1707:1: rule__ProjectFX__Group_8__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1711:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1712:1: ( '}' )
            {
            // InternalJavaFXLang.g:1712:1: ( '}' )
            // InternalJavaFXLang.g:1713:2: '}'
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


    // $ANTLR start "rule__BarChartFX__Group__0"
    // InternalJavaFXLang.g:1723:1: rule__BarChartFX__Group__0 : rule__BarChartFX__Group__0__Impl rule__BarChartFX__Group__1 ;
    public final void rule__BarChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1727:1: ( rule__BarChartFX__Group__0__Impl rule__BarChartFX__Group__1 )
            // InternalJavaFXLang.g:1728:2: rule__BarChartFX__Group__0__Impl rule__BarChartFX__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__BarChartFX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__0"


    // $ANTLR start "rule__BarChartFX__Group__0__Impl"
    // InternalJavaFXLang.g:1735:1: rule__BarChartFX__Group__0__Impl : ( () ) ;
    public final void rule__BarChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1739:1: ( ( () ) )
            // InternalJavaFXLang.g:1740:1: ( () )
            {
            // InternalJavaFXLang.g:1740:1: ( () )
            // InternalJavaFXLang.g:1741:2: ()
            {
             before(grammarAccess.getBarChartFXAccess().getBarChartFXAction_0()); 
            // InternalJavaFXLang.g:1742:2: ()
            // InternalJavaFXLang.g:1742:3: 
            {
            }

             after(grammarAccess.getBarChartFXAccess().getBarChartFXAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__0__Impl"


    // $ANTLR start "rule__BarChartFX__Group__1"
    // InternalJavaFXLang.g:1750:1: rule__BarChartFX__Group__1 : rule__BarChartFX__Group__1__Impl rule__BarChartFX__Group__2 ;
    public final void rule__BarChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1754:1: ( rule__BarChartFX__Group__1__Impl rule__BarChartFX__Group__2 )
            // InternalJavaFXLang.g:1755:2: rule__BarChartFX__Group__1__Impl rule__BarChartFX__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__BarChartFX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__1"


    // $ANTLR start "rule__BarChartFX__Group__1__Impl"
    // InternalJavaFXLang.g:1762:1: rule__BarChartFX__Group__1__Impl : ( 'BarChart' ) ;
    public final void rule__BarChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1766:1: ( ( 'BarChart' ) )
            // InternalJavaFXLang.g:1767:1: ( 'BarChart' )
            {
            // InternalJavaFXLang.g:1767:1: ( 'BarChart' )
            // InternalJavaFXLang.g:1768:2: 'BarChart'
            {
             before(grammarAccess.getBarChartFXAccess().getBarChartKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBarChartFXAccess().getBarChartKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__1__Impl"


    // $ANTLR start "rule__BarChartFX__Group__2"
    // InternalJavaFXLang.g:1777:1: rule__BarChartFX__Group__2 : rule__BarChartFX__Group__2__Impl rule__BarChartFX__Group__3 ;
    public final void rule__BarChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1781:1: ( rule__BarChartFX__Group__2__Impl rule__BarChartFX__Group__3 )
            // InternalJavaFXLang.g:1782:2: rule__BarChartFX__Group__2__Impl rule__BarChartFX__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__BarChartFX__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__2"


    // $ANTLR start "rule__BarChartFX__Group__2__Impl"
    // InternalJavaFXLang.g:1789:1: rule__BarChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__BarChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1793:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1794:1: ( '{' )
            {
            // InternalJavaFXLang.g:1794:1: ( '{' )
            // InternalJavaFXLang.g:1795:2: '{'
            {
             before(grammarAccess.getBarChartFXAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBarChartFXAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__2__Impl"


    // $ANTLR start "rule__BarChartFX__Group__3"
    // InternalJavaFXLang.g:1804:1: rule__BarChartFX__Group__3 : rule__BarChartFX__Group__3__Impl rule__BarChartFX__Group__4 ;
    public final void rule__BarChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1808:1: ( rule__BarChartFX__Group__3__Impl rule__BarChartFX__Group__4 )
            // InternalJavaFXLang.g:1809:2: rule__BarChartFX__Group__3__Impl rule__BarChartFX__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__BarChartFX__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__3"


    // $ANTLR start "rule__BarChartFX__Group__3__Impl"
    // InternalJavaFXLang.g:1816:1: rule__BarChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__BarChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1820:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:1821:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:1821:1: ( 'name:' )
            // InternalJavaFXLang.g:1822:2: 'name:'
            {
             before(grammarAccess.getBarChartFXAccess().getNameKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBarChartFXAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__3__Impl"


    // $ANTLR start "rule__BarChartFX__Group__4"
    // InternalJavaFXLang.g:1831:1: rule__BarChartFX__Group__4 : rule__BarChartFX__Group__4__Impl rule__BarChartFX__Group__5 ;
    public final void rule__BarChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1835:1: ( rule__BarChartFX__Group__4__Impl rule__BarChartFX__Group__5 )
            // InternalJavaFXLang.g:1836:2: rule__BarChartFX__Group__4__Impl rule__BarChartFX__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__BarChartFX__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__4"


    // $ANTLR start "rule__BarChartFX__Group__4__Impl"
    // InternalJavaFXLang.g:1843:1: rule__BarChartFX__Group__4__Impl : ( ( rule__BarChartFX__NameAssignment_4 ) ) ;
    public final void rule__BarChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1847:1: ( ( ( rule__BarChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:1848:1: ( ( rule__BarChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:1848:1: ( ( rule__BarChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:1849:2: ( rule__BarChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getBarChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:1850:2: ( rule__BarChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:1850:3: rule__BarChartFX__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BarChartFX__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBarChartFXAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__4__Impl"


    // $ANTLR start "rule__BarChartFX__Group__5"
    // InternalJavaFXLang.g:1858:1: rule__BarChartFX__Group__5 : rule__BarChartFX__Group__5__Impl rule__BarChartFX__Group__6 ;
    public final void rule__BarChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1862:1: ( rule__BarChartFX__Group__5__Impl rule__BarChartFX__Group__6 )
            // InternalJavaFXLang.g:1863:2: rule__BarChartFX__Group__5__Impl rule__BarChartFX__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__BarChartFX__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__5"


    // $ANTLR start "rule__BarChartFX__Group__5__Impl"
    // InternalJavaFXLang.g:1870:1: rule__BarChartFX__Group__5__Impl : ( ( rule__BarChartFX__Group_5__0 )? ) ;
    public final void rule__BarChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1874:1: ( ( ( rule__BarChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:1875:1: ( ( rule__BarChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:1875:1: ( ( rule__BarChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:1876:2: ( rule__BarChartFX__Group_5__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:1877:2: ( rule__BarChartFX__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJavaFXLang.g:1877:3: rule__BarChartFX__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarChartFX__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarChartFXAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__5__Impl"


    // $ANTLR start "rule__BarChartFX__Group__6"
    // InternalJavaFXLang.g:1885:1: rule__BarChartFX__Group__6 : rule__BarChartFX__Group__6__Impl rule__BarChartFX__Group__7 ;
    public final void rule__BarChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1889:1: ( rule__BarChartFX__Group__6__Impl rule__BarChartFX__Group__7 )
            // InternalJavaFXLang.g:1890:2: rule__BarChartFX__Group__6__Impl rule__BarChartFX__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__BarChartFX__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__6"


    // $ANTLR start "rule__BarChartFX__Group__6__Impl"
    // InternalJavaFXLang.g:1897:1: rule__BarChartFX__Group__6__Impl : ( ( rule__BarChartFX__Group_6__0 )? ) ;
    public final void rule__BarChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1901:1: ( ( ( rule__BarChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:1902:1: ( ( rule__BarChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:1902:1: ( ( rule__BarChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:1903:2: ( rule__BarChartFX__Group_6__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:1904:2: ( rule__BarChartFX__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJavaFXLang.g:1904:3: rule__BarChartFX__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarChartFX__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarChartFXAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__6__Impl"


    // $ANTLR start "rule__BarChartFX__Group__7"
    // InternalJavaFXLang.g:1912:1: rule__BarChartFX__Group__7 : rule__BarChartFX__Group__7__Impl rule__BarChartFX__Group__8 ;
    public final void rule__BarChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1916:1: ( rule__BarChartFX__Group__7__Impl rule__BarChartFX__Group__8 )
            // InternalJavaFXLang.g:1917:2: rule__BarChartFX__Group__7__Impl rule__BarChartFX__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__BarChartFX__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__7"


    // $ANTLR start "rule__BarChartFX__Group__7__Impl"
    // InternalJavaFXLang.g:1924:1: rule__BarChartFX__Group__7__Impl : ( ( rule__BarChartFX__Group_7__0 )? ) ;
    public final void rule__BarChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1928:1: ( ( ( rule__BarChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:1929:1: ( ( rule__BarChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:1929:1: ( ( rule__BarChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:1930:2: ( rule__BarChartFX__Group_7__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:1931:2: ( rule__BarChartFX__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJavaFXLang.g:1931:3: rule__BarChartFX__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarChartFX__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarChartFXAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__7__Impl"


    // $ANTLR start "rule__BarChartFX__Group__8"
    // InternalJavaFXLang.g:1939:1: rule__BarChartFX__Group__8 : rule__BarChartFX__Group__8__Impl rule__BarChartFX__Group__9 ;
    public final void rule__BarChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1943:1: ( rule__BarChartFX__Group__8__Impl rule__BarChartFX__Group__9 )
            // InternalJavaFXLang.g:1944:2: rule__BarChartFX__Group__8__Impl rule__BarChartFX__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__BarChartFX__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__8"


    // $ANTLR start "rule__BarChartFX__Group__8__Impl"
    // InternalJavaFXLang.g:1951:1: rule__BarChartFX__Group__8__Impl : ( ( rule__BarChartFX__Group_8__0 )? ) ;
    public final void rule__BarChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1955:1: ( ( ( rule__BarChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:1956:1: ( ( rule__BarChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:1956:1: ( ( rule__BarChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:1957:2: ( rule__BarChartFX__Group_8__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:1958:2: ( rule__BarChartFX__Group_8__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJavaFXLang.g:1958:3: rule__BarChartFX__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarChartFX__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarChartFXAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__8__Impl"


    // $ANTLR start "rule__BarChartFX__Group__9"
    // InternalJavaFXLang.g:1966:1: rule__BarChartFX__Group__9 : rule__BarChartFX__Group__9__Impl rule__BarChartFX__Group__10 ;
    public final void rule__BarChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1970:1: ( rule__BarChartFX__Group__9__Impl rule__BarChartFX__Group__10 )
            // InternalJavaFXLang.g:1971:2: rule__BarChartFX__Group__9__Impl rule__BarChartFX__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__BarChartFX__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__9"


    // $ANTLR start "rule__BarChartFX__Group__9__Impl"
    // InternalJavaFXLang.g:1978:1: rule__BarChartFX__Group__9__Impl : ( ( rule__BarChartFX__Group_9__0 )? ) ;
    public final void rule__BarChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1982:1: ( ( ( rule__BarChartFX__Group_9__0 )? ) )
            // InternalJavaFXLang.g:1983:1: ( ( rule__BarChartFX__Group_9__0 )? )
            {
            // InternalJavaFXLang.g:1983:1: ( ( rule__BarChartFX__Group_9__0 )? )
            // InternalJavaFXLang.g:1984:2: ( rule__BarChartFX__Group_9__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_9()); 
            // InternalJavaFXLang.g:1985:2: ( rule__BarChartFX__Group_9__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJavaFXLang.g:1985:3: rule__BarChartFX__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarChartFX__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarChartFXAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__9__Impl"


    // $ANTLR start "rule__BarChartFX__Group__10"
    // InternalJavaFXLang.g:1993:1: rule__BarChartFX__Group__10 : rule__BarChartFX__Group__10__Impl rule__BarChartFX__Group__11 ;
    public final void rule__BarChartFX__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1997:1: ( rule__BarChartFX__Group__10__Impl rule__BarChartFX__Group__11 )
            // InternalJavaFXLang.g:1998:2: rule__BarChartFX__Group__10__Impl rule__BarChartFX__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__BarChartFX__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__10"


    // $ANTLR start "rule__BarChartFX__Group__10__Impl"
    // InternalJavaFXLang.g:2005:1: rule__BarChartFX__Group__10__Impl : ( ( rule__BarChartFX__Group_10__0 )? ) ;
    public final void rule__BarChartFX__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2009:1: ( ( ( rule__BarChartFX__Group_10__0 )? ) )
            // InternalJavaFXLang.g:2010:1: ( ( rule__BarChartFX__Group_10__0 )? )
            {
            // InternalJavaFXLang.g:2010:1: ( ( rule__BarChartFX__Group_10__0 )? )
            // InternalJavaFXLang.g:2011:2: ( rule__BarChartFX__Group_10__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_10()); 
            // InternalJavaFXLang.g:2012:2: ( rule__BarChartFX__Group_10__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalJavaFXLang.g:2012:3: rule__BarChartFX__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarChartFX__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarChartFXAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__10__Impl"


    // $ANTLR start "rule__BarChartFX__Group__11"
    // InternalJavaFXLang.g:2020:1: rule__BarChartFX__Group__11 : rule__BarChartFX__Group__11__Impl rule__BarChartFX__Group__12 ;
    public final void rule__BarChartFX__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2024:1: ( rule__BarChartFX__Group__11__Impl rule__BarChartFX__Group__12 )
            // InternalJavaFXLang.g:2025:2: rule__BarChartFX__Group__11__Impl rule__BarChartFX__Group__12
            {
            pushFollow(FOLLOW_20);
            rule__BarChartFX__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__11"


    // $ANTLR start "rule__BarChartFX__Group__11__Impl"
    // InternalJavaFXLang.g:2032:1: rule__BarChartFX__Group__11__Impl : ( ( rule__BarChartFX__Group_11__0 )? ) ;
    public final void rule__BarChartFX__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2036:1: ( ( ( rule__BarChartFX__Group_11__0 )? ) )
            // InternalJavaFXLang.g:2037:1: ( ( rule__BarChartFX__Group_11__0 )? )
            {
            // InternalJavaFXLang.g:2037:1: ( ( rule__BarChartFX__Group_11__0 )? )
            // InternalJavaFXLang.g:2038:2: ( rule__BarChartFX__Group_11__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_11()); 
            // InternalJavaFXLang.g:2039:2: ( rule__BarChartFX__Group_11__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJavaFXLang.g:2039:3: rule__BarChartFX__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarChartFX__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarChartFXAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__11__Impl"


    // $ANTLR start "rule__BarChartFX__Group__12"
    // InternalJavaFXLang.g:2047:1: rule__BarChartFX__Group__12 : rule__BarChartFX__Group__12__Impl rule__BarChartFX__Group__13 ;
    public final void rule__BarChartFX__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2051:1: ( rule__BarChartFX__Group__12__Impl rule__BarChartFX__Group__13 )
            // InternalJavaFXLang.g:2052:2: rule__BarChartFX__Group__12__Impl rule__BarChartFX__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__BarChartFX__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__12"


    // $ANTLR start "rule__BarChartFX__Group__12__Impl"
    // InternalJavaFXLang.g:2059:1: rule__BarChartFX__Group__12__Impl : ( ( rule__BarChartFX__Group_12__0 )? ) ;
    public final void rule__BarChartFX__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2063:1: ( ( ( rule__BarChartFX__Group_12__0 )? ) )
            // InternalJavaFXLang.g:2064:1: ( ( rule__BarChartFX__Group_12__0 )? )
            {
            // InternalJavaFXLang.g:2064:1: ( ( rule__BarChartFX__Group_12__0 )? )
            // InternalJavaFXLang.g:2065:2: ( rule__BarChartFX__Group_12__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_12()); 
            // InternalJavaFXLang.g:2066:2: ( rule__BarChartFX__Group_12__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJavaFXLang.g:2066:3: rule__BarChartFX__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarChartFX__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarChartFXAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__12__Impl"


    // $ANTLR start "rule__BarChartFX__Group__13"
    // InternalJavaFXLang.g:2074:1: rule__BarChartFX__Group__13 : rule__BarChartFX__Group__13__Impl ;
    public final void rule__BarChartFX__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2078:1: ( rule__BarChartFX__Group__13__Impl )
            // InternalJavaFXLang.g:2079:2: rule__BarChartFX__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__13"


    // $ANTLR start "rule__BarChartFX__Group__13__Impl"
    // InternalJavaFXLang.g:2085:1: rule__BarChartFX__Group__13__Impl : ( '}' ) ;
    public final void rule__BarChartFX__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2089:1: ( ( '}' ) )
            // InternalJavaFXLang.g:2090:1: ( '}' )
            {
            // InternalJavaFXLang.g:2090:1: ( '}' )
            // InternalJavaFXLang.g:2091:2: '}'
            {
             before(grammarAccess.getBarChartFXAccess().getRightCurlyBracketKeyword_13()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBarChartFXAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group__13__Impl"


    // $ANTLR start "rule__BarChartFX__Group_5__0"
    // InternalJavaFXLang.g:2101:1: rule__BarChartFX__Group_5__0 : rule__BarChartFX__Group_5__0__Impl rule__BarChartFX__Group_5__1 ;
    public final void rule__BarChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2105:1: ( rule__BarChartFX__Group_5__0__Impl rule__BarChartFX__Group_5__1 )
            // InternalJavaFXLang.g:2106:2: rule__BarChartFX__Group_5__0__Impl rule__BarChartFX__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__BarChartFX__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_5__0"


    // $ANTLR start "rule__BarChartFX__Group_5__0__Impl"
    // InternalJavaFXLang.g:2113:1: rule__BarChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__BarChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2117:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:2118:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:2118:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:2119:2: 'legendSide:'
            {
             before(grammarAccess.getBarChartFXAccess().getLegendSideKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBarChartFXAccess().getLegendSideKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_5__0__Impl"


    // $ANTLR start "rule__BarChartFX__Group_5__1"
    // InternalJavaFXLang.g:2128:1: rule__BarChartFX__Group_5__1 : rule__BarChartFX__Group_5__1__Impl ;
    public final void rule__BarChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2132:1: ( rule__BarChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:2133:2: rule__BarChartFX__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_5__1"


    // $ANTLR start "rule__BarChartFX__Group_5__1__Impl"
    // InternalJavaFXLang.g:2139:1: rule__BarChartFX__Group_5__1__Impl : ( ( rule__BarChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__BarChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2143:1: ( ( ( rule__BarChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:2144:1: ( ( rule__BarChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:2144:1: ( ( rule__BarChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:2145:2: ( rule__BarChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:2146:2: ( rule__BarChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:2146:3: rule__BarChartFX__LegendSideAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BarChartFX__LegendSideAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBarChartFXAccess().getLegendSideAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_5__1__Impl"


    // $ANTLR start "rule__BarChartFX__Group_6__0"
    // InternalJavaFXLang.g:2155:1: rule__BarChartFX__Group_6__0 : rule__BarChartFX__Group_6__0__Impl rule__BarChartFX__Group_6__1 ;
    public final void rule__BarChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2159:1: ( rule__BarChartFX__Group_6__0__Impl rule__BarChartFX__Group_6__1 )
            // InternalJavaFXLang.g:2160:2: rule__BarChartFX__Group_6__0__Impl rule__BarChartFX__Group_6__1
            {
            pushFollow(FOLLOW_22);
            rule__BarChartFX__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_6__0"


    // $ANTLR start "rule__BarChartFX__Group_6__0__Impl"
    // InternalJavaFXLang.g:2167:1: rule__BarChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__BarChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2171:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:2172:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:2172:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:2173:2: 'showLegend:'
            {
             before(grammarAccess.getBarChartFXAccess().getShowLegendKeyword_6_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBarChartFXAccess().getShowLegendKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_6__0__Impl"


    // $ANTLR start "rule__BarChartFX__Group_6__1"
    // InternalJavaFXLang.g:2182:1: rule__BarChartFX__Group_6__1 : rule__BarChartFX__Group_6__1__Impl ;
    public final void rule__BarChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2186:1: ( rule__BarChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:2187:2: rule__BarChartFX__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_6__1"


    // $ANTLR start "rule__BarChartFX__Group_6__1__Impl"
    // InternalJavaFXLang.g:2193:1: rule__BarChartFX__Group_6__1__Impl : ( ( rule__BarChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__BarChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2197:1: ( ( ( rule__BarChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:2198:1: ( ( rule__BarChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:2198:1: ( ( rule__BarChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:2199:2: ( rule__BarChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:2200:2: ( rule__BarChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:2200:3: rule__BarChartFX__ShowLegendAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__BarChartFX__ShowLegendAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getBarChartFXAccess().getShowLegendAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_6__1__Impl"


    // $ANTLR start "rule__BarChartFX__Group_7__0"
    // InternalJavaFXLang.g:2209:1: rule__BarChartFX__Group_7__0 : rule__BarChartFX__Group_7__0__Impl rule__BarChartFX__Group_7__1 ;
    public final void rule__BarChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2213:1: ( rule__BarChartFX__Group_7__0__Impl rule__BarChartFX__Group_7__1 )
            // InternalJavaFXLang.g:2214:2: rule__BarChartFX__Group_7__0__Impl rule__BarChartFX__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__BarChartFX__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_7__0"


    // $ANTLR start "rule__BarChartFX__Group_7__0__Impl"
    // InternalJavaFXLang.g:2221:1: rule__BarChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__BarChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2225:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:2226:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:2226:1: ( 'title:' )
            // InternalJavaFXLang.g:2227:2: 'title:'
            {
             before(grammarAccess.getBarChartFXAccess().getTitleKeyword_7_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBarChartFXAccess().getTitleKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_7__0__Impl"


    // $ANTLR start "rule__BarChartFX__Group_7__1"
    // InternalJavaFXLang.g:2236:1: rule__BarChartFX__Group_7__1 : rule__BarChartFX__Group_7__1__Impl ;
    public final void rule__BarChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2240:1: ( rule__BarChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:2241:2: rule__BarChartFX__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_7__1"


    // $ANTLR start "rule__BarChartFX__Group_7__1__Impl"
    // InternalJavaFXLang.g:2247:1: rule__BarChartFX__Group_7__1__Impl : ( ( rule__BarChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__BarChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2251:1: ( ( ( rule__BarChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:2252:1: ( ( rule__BarChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:2252:1: ( ( rule__BarChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:2253:2: ( rule__BarChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:2254:2: ( rule__BarChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:2254:3: rule__BarChartFX__TitleAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__BarChartFX__TitleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBarChartFXAccess().getTitleAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_7__1__Impl"


    // $ANTLR start "rule__BarChartFX__Group_8__0"
    // InternalJavaFXLang.g:2263:1: rule__BarChartFX__Group_8__0 : rule__BarChartFX__Group_8__0__Impl rule__BarChartFX__Group_8__1 ;
    public final void rule__BarChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2267:1: ( rule__BarChartFX__Group_8__0__Impl rule__BarChartFX__Group_8__1 )
            // InternalJavaFXLang.g:2268:2: rule__BarChartFX__Group_8__0__Impl rule__BarChartFX__Group_8__1
            {
            pushFollow(FOLLOW_21);
            rule__BarChartFX__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_8__0"


    // $ANTLR start "rule__BarChartFX__Group_8__0__Impl"
    // InternalJavaFXLang.g:2275:1: rule__BarChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__BarChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2279:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:2280:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:2280:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:2281:2: 'titleSide:'
            {
             before(grammarAccess.getBarChartFXAccess().getTitleSideKeyword_8_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBarChartFXAccess().getTitleSideKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_8__0__Impl"


    // $ANTLR start "rule__BarChartFX__Group_8__1"
    // InternalJavaFXLang.g:2290:1: rule__BarChartFX__Group_8__1 : rule__BarChartFX__Group_8__1__Impl ;
    public final void rule__BarChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2294:1: ( rule__BarChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:2295:2: rule__BarChartFX__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_8__1"


    // $ANTLR start "rule__BarChartFX__Group_8__1__Impl"
    // InternalJavaFXLang.g:2301:1: rule__BarChartFX__Group_8__1__Impl : ( ( rule__BarChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__BarChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2305:1: ( ( ( rule__BarChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:2306:1: ( ( rule__BarChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:2306:1: ( ( rule__BarChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:2307:2: ( rule__BarChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:2308:2: ( rule__BarChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:2308:3: rule__BarChartFX__TitleSideAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__BarChartFX__TitleSideAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getBarChartFXAccess().getTitleSideAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_8__1__Impl"


    // $ANTLR start "rule__BarChartFX__Group_9__0"
    // InternalJavaFXLang.g:2317:1: rule__BarChartFX__Group_9__0 : rule__BarChartFX__Group_9__0__Impl rule__BarChartFX__Group_9__1 ;
    public final void rule__BarChartFX__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2321:1: ( rule__BarChartFX__Group_9__0__Impl rule__BarChartFX__Group_9__1 )
            // InternalJavaFXLang.g:2322:2: rule__BarChartFX__Group_9__0__Impl rule__BarChartFX__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__BarChartFX__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_9__0"


    // $ANTLR start "rule__BarChartFX__Group_9__0__Impl"
    // InternalJavaFXLang.g:2329:1: rule__BarChartFX__Group_9__0__Impl : ( 'xAxisLabel:' ) ;
    public final void rule__BarChartFX__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2333:1: ( ( 'xAxisLabel:' ) )
            // InternalJavaFXLang.g:2334:1: ( 'xAxisLabel:' )
            {
            // InternalJavaFXLang.g:2334:1: ( 'xAxisLabel:' )
            // InternalJavaFXLang.g:2335:2: 'xAxisLabel:'
            {
             before(grammarAccess.getBarChartFXAccess().getXAxisLabelKeyword_9_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBarChartFXAccess().getXAxisLabelKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_9__0__Impl"


    // $ANTLR start "rule__BarChartFX__Group_9__1"
    // InternalJavaFXLang.g:2344:1: rule__BarChartFX__Group_9__1 : rule__BarChartFX__Group_9__1__Impl ;
    public final void rule__BarChartFX__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2348:1: ( rule__BarChartFX__Group_9__1__Impl )
            // InternalJavaFXLang.g:2349:2: rule__BarChartFX__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_9__1"


    // $ANTLR start "rule__BarChartFX__Group_9__1__Impl"
    // InternalJavaFXLang.g:2355:1: rule__BarChartFX__Group_9__1__Impl : ( ( rule__BarChartFX__XAxisLabelAssignment_9_1 ) ) ;
    public final void rule__BarChartFX__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2359:1: ( ( ( rule__BarChartFX__XAxisLabelAssignment_9_1 ) ) )
            // InternalJavaFXLang.g:2360:1: ( ( rule__BarChartFX__XAxisLabelAssignment_9_1 ) )
            {
            // InternalJavaFXLang.g:2360:1: ( ( rule__BarChartFX__XAxisLabelAssignment_9_1 ) )
            // InternalJavaFXLang.g:2361:2: ( rule__BarChartFX__XAxisLabelAssignment_9_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getXAxisLabelAssignment_9_1()); 
            // InternalJavaFXLang.g:2362:2: ( rule__BarChartFX__XAxisLabelAssignment_9_1 )
            // InternalJavaFXLang.g:2362:3: rule__BarChartFX__XAxisLabelAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__BarChartFX__XAxisLabelAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getBarChartFXAccess().getXAxisLabelAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_9__1__Impl"


    // $ANTLR start "rule__BarChartFX__Group_10__0"
    // InternalJavaFXLang.g:2371:1: rule__BarChartFX__Group_10__0 : rule__BarChartFX__Group_10__0__Impl rule__BarChartFX__Group_10__1 ;
    public final void rule__BarChartFX__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2375:1: ( rule__BarChartFX__Group_10__0__Impl rule__BarChartFX__Group_10__1 )
            // InternalJavaFXLang.g:2376:2: rule__BarChartFX__Group_10__0__Impl rule__BarChartFX__Group_10__1
            {
            pushFollow(FOLLOW_23);
            rule__BarChartFX__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_10__0"


    // $ANTLR start "rule__BarChartFX__Group_10__0__Impl"
    // InternalJavaFXLang.g:2383:1: rule__BarChartFX__Group_10__0__Impl : ( 'xAxisType:' ) ;
    public final void rule__BarChartFX__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2387:1: ( ( 'xAxisType:' ) )
            // InternalJavaFXLang.g:2388:1: ( 'xAxisType:' )
            {
            // InternalJavaFXLang.g:2388:1: ( 'xAxisType:' )
            // InternalJavaFXLang.g:2389:2: 'xAxisType:'
            {
             before(grammarAccess.getBarChartFXAccess().getXAxisTypeKeyword_10_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBarChartFXAccess().getXAxisTypeKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_10__0__Impl"


    // $ANTLR start "rule__BarChartFX__Group_10__1"
    // InternalJavaFXLang.g:2398:1: rule__BarChartFX__Group_10__1 : rule__BarChartFX__Group_10__1__Impl ;
    public final void rule__BarChartFX__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2402:1: ( rule__BarChartFX__Group_10__1__Impl )
            // InternalJavaFXLang.g:2403:2: rule__BarChartFX__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_10__1"


    // $ANTLR start "rule__BarChartFX__Group_10__1__Impl"
    // InternalJavaFXLang.g:2409:1: rule__BarChartFX__Group_10__1__Impl : ( ( rule__BarChartFX__XAxisTypeAssignment_10_1 ) ) ;
    public final void rule__BarChartFX__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2413:1: ( ( ( rule__BarChartFX__XAxisTypeAssignment_10_1 ) ) )
            // InternalJavaFXLang.g:2414:1: ( ( rule__BarChartFX__XAxisTypeAssignment_10_1 ) )
            {
            // InternalJavaFXLang.g:2414:1: ( ( rule__BarChartFX__XAxisTypeAssignment_10_1 ) )
            // InternalJavaFXLang.g:2415:2: ( rule__BarChartFX__XAxisTypeAssignment_10_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getXAxisTypeAssignment_10_1()); 
            // InternalJavaFXLang.g:2416:2: ( rule__BarChartFX__XAxisTypeAssignment_10_1 )
            // InternalJavaFXLang.g:2416:3: rule__BarChartFX__XAxisTypeAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__BarChartFX__XAxisTypeAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getBarChartFXAccess().getXAxisTypeAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_10__1__Impl"


    // $ANTLR start "rule__BarChartFX__Group_11__0"
    // InternalJavaFXLang.g:2425:1: rule__BarChartFX__Group_11__0 : rule__BarChartFX__Group_11__0__Impl rule__BarChartFX__Group_11__1 ;
    public final void rule__BarChartFX__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2429:1: ( rule__BarChartFX__Group_11__0__Impl rule__BarChartFX__Group_11__1 )
            // InternalJavaFXLang.g:2430:2: rule__BarChartFX__Group_11__0__Impl rule__BarChartFX__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__BarChartFX__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_11__0"


    // $ANTLR start "rule__BarChartFX__Group_11__0__Impl"
    // InternalJavaFXLang.g:2437:1: rule__BarChartFX__Group_11__0__Impl : ( 'yAxisLabel:' ) ;
    public final void rule__BarChartFX__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2441:1: ( ( 'yAxisLabel:' ) )
            // InternalJavaFXLang.g:2442:1: ( 'yAxisLabel:' )
            {
            // InternalJavaFXLang.g:2442:1: ( 'yAxisLabel:' )
            // InternalJavaFXLang.g:2443:2: 'yAxisLabel:'
            {
             before(grammarAccess.getBarChartFXAccess().getYAxisLabelKeyword_11_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBarChartFXAccess().getYAxisLabelKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_11__0__Impl"


    // $ANTLR start "rule__BarChartFX__Group_11__1"
    // InternalJavaFXLang.g:2452:1: rule__BarChartFX__Group_11__1 : rule__BarChartFX__Group_11__1__Impl ;
    public final void rule__BarChartFX__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2456:1: ( rule__BarChartFX__Group_11__1__Impl )
            // InternalJavaFXLang.g:2457:2: rule__BarChartFX__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_11__1"


    // $ANTLR start "rule__BarChartFX__Group_11__1__Impl"
    // InternalJavaFXLang.g:2463:1: rule__BarChartFX__Group_11__1__Impl : ( ( rule__BarChartFX__YAxisLabelAssignment_11_1 ) ) ;
    public final void rule__BarChartFX__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2467:1: ( ( ( rule__BarChartFX__YAxisLabelAssignment_11_1 ) ) )
            // InternalJavaFXLang.g:2468:1: ( ( rule__BarChartFX__YAxisLabelAssignment_11_1 ) )
            {
            // InternalJavaFXLang.g:2468:1: ( ( rule__BarChartFX__YAxisLabelAssignment_11_1 ) )
            // InternalJavaFXLang.g:2469:2: ( rule__BarChartFX__YAxisLabelAssignment_11_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getYAxisLabelAssignment_11_1()); 
            // InternalJavaFXLang.g:2470:2: ( rule__BarChartFX__YAxisLabelAssignment_11_1 )
            // InternalJavaFXLang.g:2470:3: rule__BarChartFX__YAxisLabelAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__BarChartFX__YAxisLabelAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getBarChartFXAccess().getYAxisLabelAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_11__1__Impl"


    // $ANTLR start "rule__BarChartFX__Group_12__0"
    // InternalJavaFXLang.g:2479:1: rule__BarChartFX__Group_12__0 : rule__BarChartFX__Group_12__0__Impl rule__BarChartFX__Group_12__1 ;
    public final void rule__BarChartFX__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2483:1: ( rule__BarChartFX__Group_12__0__Impl rule__BarChartFX__Group_12__1 )
            // InternalJavaFXLang.g:2484:2: rule__BarChartFX__Group_12__0__Impl rule__BarChartFX__Group_12__1
            {
            pushFollow(FOLLOW_23);
            rule__BarChartFX__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_12__0"


    // $ANTLR start "rule__BarChartFX__Group_12__0__Impl"
    // InternalJavaFXLang.g:2491:1: rule__BarChartFX__Group_12__0__Impl : ( 'yAxisType:' ) ;
    public final void rule__BarChartFX__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2495:1: ( ( 'yAxisType:' ) )
            // InternalJavaFXLang.g:2496:1: ( 'yAxisType:' )
            {
            // InternalJavaFXLang.g:2496:1: ( 'yAxisType:' )
            // InternalJavaFXLang.g:2497:2: 'yAxisType:'
            {
             before(grammarAccess.getBarChartFXAccess().getYAxisTypeKeyword_12_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getBarChartFXAccess().getYAxisTypeKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_12__0__Impl"


    // $ANTLR start "rule__BarChartFX__Group_12__1"
    // InternalJavaFXLang.g:2506:1: rule__BarChartFX__Group_12__1 : rule__BarChartFX__Group_12__1__Impl ;
    public final void rule__BarChartFX__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2510:1: ( rule__BarChartFX__Group_12__1__Impl )
            // InternalJavaFXLang.g:2511:2: rule__BarChartFX__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChartFX__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_12__1"


    // $ANTLR start "rule__BarChartFX__Group_12__1__Impl"
    // InternalJavaFXLang.g:2517:1: rule__BarChartFX__Group_12__1__Impl : ( ( rule__BarChartFX__YAxisTypeAssignment_12_1 ) ) ;
    public final void rule__BarChartFX__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2521:1: ( ( ( rule__BarChartFX__YAxisTypeAssignment_12_1 ) ) )
            // InternalJavaFXLang.g:2522:1: ( ( rule__BarChartFX__YAxisTypeAssignment_12_1 ) )
            {
            // InternalJavaFXLang.g:2522:1: ( ( rule__BarChartFX__YAxisTypeAssignment_12_1 ) )
            // InternalJavaFXLang.g:2523:2: ( rule__BarChartFX__YAxisTypeAssignment_12_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getYAxisTypeAssignment_12_1()); 
            // InternalJavaFXLang.g:2524:2: ( rule__BarChartFX__YAxisTypeAssignment_12_1 )
            // InternalJavaFXLang.g:2524:3: rule__BarChartFX__YAxisTypeAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__BarChartFX__YAxisTypeAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getBarChartFXAccess().getYAxisTypeAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__Group_12__1__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group__0"
    // InternalJavaFXLang.g:2533:1: rule__ScatterChartFX__Group__0 : rule__ScatterChartFX__Group__0__Impl rule__ScatterChartFX__Group__1 ;
    public final void rule__ScatterChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2537:1: ( rule__ScatterChartFX__Group__0__Impl rule__ScatterChartFX__Group__1 )
            // InternalJavaFXLang.g:2538:2: rule__ScatterChartFX__Group__0__Impl rule__ScatterChartFX__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ScatterChartFX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__0"


    // $ANTLR start "rule__ScatterChartFX__Group__0__Impl"
    // InternalJavaFXLang.g:2545:1: rule__ScatterChartFX__Group__0__Impl : ( () ) ;
    public final void rule__ScatterChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2549:1: ( ( () ) )
            // InternalJavaFXLang.g:2550:1: ( () )
            {
            // InternalJavaFXLang.g:2550:1: ( () )
            // InternalJavaFXLang.g:2551:2: ()
            {
             before(grammarAccess.getScatterChartFXAccess().getScatterChartFXAction_0()); 
            // InternalJavaFXLang.g:2552:2: ()
            // InternalJavaFXLang.g:2552:3: 
            {
            }

             after(grammarAccess.getScatterChartFXAccess().getScatterChartFXAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__0__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group__1"
    // InternalJavaFXLang.g:2560:1: rule__ScatterChartFX__Group__1 : rule__ScatterChartFX__Group__1__Impl rule__ScatterChartFX__Group__2 ;
    public final void rule__ScatterChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2564:1: ( rule__ScatterChartFX__Group__1__Impl rule__ScatterChartFX__Group__2 )
            // InternalJavaFXLang.g:2565:2: rule__ScatterChartFX__Group__1__Impl rule__ScatterChartFX__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ScatterChartFX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__1"


    // $ANTLR start "rule__ScatterChartFX__Group__1__Impl"
    // InternalJavaFXLang.g:2572:1: rule__ScatterChartFX__Group__1__Impl : ( 'ScatterChart' ) ;
    public final void rule__ScatterChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2576:1: ( ( 'ScatterChart' ) )
            // InternalJavaFXLang.g:2577:1: ( 'ScatterChart' )
            {
            // InternalJavaFXLang.g:2577:1: ( 'ScatterChart' )
            // InternalJavaFXLang.g:2578:2: 'ScatterChart'
            {
             before(grammarAccess.getScatterChartFXAccess().getScatterChartKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getScatterChartFXAccess().getScatterChartKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__1__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group__2"
    // InternalJavaFXLang.g:2587:1: rule__ScatterChartFX__Group__2 : rule__ScatterChartFX__Group__2__Impl rule__ScatterChartFX__Group__3 ;
    public final void rule__ScatterChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2591:1: ( rule__ScatterChartFX__Group__2__Impl rule__ScatterChartFX__Group__3 )
            // InternalJavaFXLang.g:2592:2: rule__ScatterChartFX__Group__2__Impl rule__ScatterChartFX__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ScatterChartFX__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__2"


    // $ANTLR start "rule__ScatterChartFX__Group__2__Impl"
    // InternalJavaFXLang.g:2599:1: rule__ScatterChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__ScatterChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2603:1: ( ( '{' ) )
            // InternalJavaFXLang.g:2604:1: ( '{' )
            {
            // InternalJavaFXLang.g:2604:1: ( '{' )
            // InternalJavaFXLang.g:2605:2: '{'
            {
             before(grammarAccess.getScatterChartFXAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getScatterChartFXAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__2__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group__3"
    // InternalJavaFXLang.g:2614:1: rule__ScatterChartFX__Group__3 : rule__ScatterChartFX__Group__3__Impl rule__ScatterChartFX__Group__4 ;
    public final void rule__ScatterChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2618:1: ( rule__ScatterChartFX__Group__3__Impl rule__ScatterChartFX__Group__4 )
            // InternalJavaFXLang.g:2619:2: rule__ScatterChartFX__Group__3__Impl rule__ScatterChartFX__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ScatterChartFX__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__3"


    // $ANTLR start "rule__ScatterChartFX__Group__3__Impl"
    // InternalJavaFXLang.g:2626:1: rule__ScatterChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__ScatterChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2630:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:2631:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:2631:1: ( 'name:' )
            // InternalJavaFXLang.g:2632:2: 'name:'
            {
             before(grammarAccess.getScatterChartFXAccess().getNameKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getScatterChartFXAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__3__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group__4"
    // InternalJavaFXLang.g:2641:1: rule__ScatterChartFX__Group__4 : rule__ScatterChartFX__Group__4__Impl rule__ScatterChartFX__Group__5 ;
    public final void rule__ScatterChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2645:1: ( rule__ScatterChartFX__Group__4__Impl rule__ScatterChartFX__Group__5 )
            // InternalJavaFXLang.g:2646:2: rule__ScatterChartFX__Group__4__Impl rule__ScatterChartFX__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__ScatterChartFX__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__4"


    // $ANTLR start "rule__ScatterChartFX__Group__4__Impl"
    // InternalJavaFXLang.g:2653:1: rule__ScatterChartFX__Group__4__Impl : ( ( rule__ScatterChartFX__NameAssignment_4 ) ) ;
    public final void rule__ScatterChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2657:1: ( ( ( rule__ScatterChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:2658:1: ( ( rule__ScatterChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:2658:1: ( ( rule__ScatterChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:2659:2: ( rule__ScatterChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getScatterChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:2660:2: ( rule__ScatterChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:2660:3: rule__ScatterChartFX__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getScatterChartFXAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__4__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group__5"
    // InternalJavaFXLang.g:2668:1: rule__ScatterChartFX__Group__5 : rule__ScatterChartFX__Group__5__Impl rule__ScatterChartFX__Group__6 ;
    public final void rule__ScatterChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2672:1: ( rule__ScatterChartFX__Group__5__Impl rule__ScatterChartFX__Group__6 )
            // InternalJavaFXLang.g:2673:2: rule__ScatterChartFX__Group__5__Impl rule__ScatterChartFX__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__ScatterChartFX__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__5"


    // $ANTLR start "rule__ScatterChartFX__Group__5__Impl"
    // InternalJavaFXLang.g:2680:1: rule__ScatterChartFX__Group__5__Impl : ( ( rule__ScatterChartFX__Group_5__0 )? ) ;
    public final void rule__ScatterChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2684:1: ( ( ( rule__ScatterChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:2685:1: ( ( rule__ScatterChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:2685:1: ( ( rule__ScatterChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:2686:2: ( rule__ScatterChartFX__Group_5__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:2687:2: ( rule__ScatterChartFX__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJavaFXLang.g:2687:3: rule__ScatterChartFX__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScatterChartFX__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScatterChartFXAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__5__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group__6"
    // InternalJavaFXLang.g:2695:1: rule__ScatterChartFX__Group__6 : rule__ScatterChartFX__Group__6__Impl rule__ScatterChartFX__Group__7 ;
    public final void rule__ScatterChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2699:1: ( rule__ScatterChartFX__Group__6__Impl rule__ScatterChartFX__Group__7 )
            // InternalJavaFXLang.g:2700:2: rule__ScatterChartFX__Group__6__Impl rule__ScatterChartFX__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__ScatterChartFX__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__6"


    // $ANTLR start "rule__ScatterChartFX__Group__6__Impl"
    // InternalJavaFXLang.g:2707:1: rule__ScatterChartFX__Group__6__Impl : ( ( rule__ScatterChartFX__Group_6__0 )? ) ;
    public final void rule__ScatterChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2711:1: ( ( ( rule__ScatterChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:2712:1: ( ( rule__ScatterChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:2712:1: ( ( rule__ScatterChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:2713:2: ( rule__ScatterChartFX__Group_6__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:2714:2: ( rule__ScatterChartFX__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJavaFXLang.g:2714:3: rule__ScatterChartFX__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScatterChartFX__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScatterChartFXAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__6__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group__7"
    // InternalJavaFXLang.g:2722:1: rule__ScatterChartFX__Group__7 : rule__ScatterChartFX__Group__7__Impl rule__ScatterChartFX__Group__8 ;
    public final void rule__ScatterChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2726:1: ( rule__ScatterChartFX__Group__7__Impl rule__ScatterChartFX__Group__8 )
            // InternalJavaFXLang.g:2727:2: rule__ScatterChartFX__Group__7__Impl rule__ScatterChartFX__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__ScatterChartFX__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__7"


    // $ANTLR start "rule__ScatterChartFX__Group__7__Impl"
    // InternalJavaFXLang.g:2734:1: rule__ScatterChartFX__Group__7__Impl : ( ( rule__ScatterChartFX__Group_7__0 )? ) ;
    public final void rule__ScatterChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2738:1: ( ( ( rule__ScatterChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:2739:1: ( ( rule__ScatterChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:2739:1: ( ( rule__ScatterChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:2740:2: ( rule__ScatterChartFX__Group_7__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:2741:2: ( rule__ScatterChartFX__Group_7__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJavaFXLang.g:2741:3: rule__ScatterChartFX__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScatterChartFX__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScatterChartFXAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__7__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group__8"
    // InternalJavaFXLang.g:2749:1: rule__ScatterChartFX__Group__8 : rule__ScatterChartFX__Group__8__Impl rule__ScatterChartFX__Group__9 ;
    public final void rule__ScatterChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2753:1: ( rule__ScatterChartFX__Group__8__Impl rule__ScatterChartFX__Group__9 )
            // InternalJavaFXLang.g:2754:2: rule__ScatterChartFX__Group__8__Impl rule__ScatterChartFX__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__ScatterChartFX__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__8"


    // $ANTLR start "rule__ScatterChartFX__Group__8__Impl"
    // InternalJavaFXLang.g:2761:1: rule__ScatterChartFX__Group__8__Impl : ( ( rule__ScatterChartFX__Group_8__0 )? ) ;
    public final void rule__ScatterChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2765:1: ( ( ( rule__ScatterChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:2766:1: ( ( rule__ScatterChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:2766:1: ( ( rule__ScatterChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:2767:2: ( rule__ScatterChartFX__Group_8__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:2768:2: ( rule__ScatterChartFX__Group_8__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalJavaFXLang.g:2768:3: rule__ScatterChartFX__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScatterChartFX__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScatterChartFXAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__8__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group__9"
    // InternalJavaFXLang.g:2776:1: rule__ScatterChartFX__Group__9 : rule__ScatterChartFX__Group__9__Impl rule__ScatterChartFX__Group__10 ;
    public final void rule__ScatterChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2780:1: ( rule__ScatterChartFX__Group__9__Impl rule__ScatterChartFX__Group__10 )
            // InternalJavaFXLang.g:2781:2: rule__ScatterChartFX__Group__9__Impl rule__ScatterChartFX__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__ScatterChartFX__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__9"


    // $ANTLR start "rule__ScatterChartFX__Group__9__Impl"
    // InternalJavaFXLang.g:2788:1: rule__ScatterChartFX__Group__9__Impl : ( ( rule__ScatterChartFX__Group_9__0 )? ) ;
    public final void rule__ScatterChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2792:1: ( ( ( rule__ScatterChartFX__Group_9__0 )? ) )
            // InternalJavaFXLang.g:2793:1: ( ( rule__ScatterChartFX__Group_9__0 )? )
            {
            // InternalJavaFXLang.g:2793:1: ( ( rule__ScatterChartFX__Group_9__0 )? )
            // InternalJavaFXLang.g:2794:2: ( rule__ScatterChartFX__Group_9__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_9()); 
            // InternalJavaFXLang.g:2795:2: ( rule__ScatterChartFX__Group_9__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalJavaFXLang.g:2795:3: rule__ScatterChartFX__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScatterChartFX__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScatterChartFXAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__9__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group__10"
    // InternalJavaFXLang.g:2803:1: rule__ScatterChartFX__Group__10 : rule__ScatterChartFX__Group__10__Impl rule__ScatterChartFX__Group__11 ;
    public final void rule__ScatterChartFX__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2807:1: ( rule__ScatterChartFX__Group__10__Impl rule__ScatterChartFX__Group__11 )
            // InternalJavaFXLang.g:2808:2: rule__ScatterChartFX__Group__10__Impl rule__ScatterChartFX__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__ScatterChartFX__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__10"


    // $ANTLR start "rule__ScatterChartFX__Group__10__Impl"
    // InternalJavaFXLang.g:2815:1: rule__ScatterChartFX__Group__10__Impl : ( ( rule__ScatterChartFX__Group_10__0 )? ) ;
    public final void rule__ScatterChartFX__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2819:1: ( ( ( rule__ScatterChartFX__Group_10__0 )? ) )
            // InternalJavaFXLang.g:2820:1: ( ( rule__ScatterChartFX__Group_10__0 )? )
            {
            // InternalJavaFXLang.g:2820:1: ( ( rule__ScatterChartFX__Group_10__0 )? )
            // InternalJavaFXLang.g:2821:2: ( rule__ScatterChartFX__Group_10__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_10()); 
            // InternalJavaFXLang.g:2822:2: ( rule__ScatterChartFX__Group_10__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalJavaFXLang.g:2822:3: rule__ScatterChartFX__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScatterChartFX__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScatterChartFXAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__10__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group__11"
    // InternalJavaFXLang.g:2830:1: rule__ScatterChartFX__Group__11 : rule__ScatterChartFX__Group__11__Impl rule__ScatterChartFX__Group__12 ;
    public final void rule__ScatterChartFX__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2834:1: ( rule__ScatterChartFX__Group__11__Impl rule__ScatterChartFX__Group__12 )
            // InternalJavaFXLang.g:2835:2: rule__ScatterChartFX__Group__11__Impl rule__ScatterChartFX__Group__12
            {
            pushFollow(FOLLOW_20);
            rule__ScatterChartFX__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__11"


    // $ANTLR start "rule__ScatterChartFX__Group__11__Impl"
    // InternalJavaFXLang.g:2842:1: rule__ScatterChartFX__Group__11__Impl : ( ( rule__ScatterChartFX__Group_11__0 )? ) ;
    public final void rule__ScatterChartFX__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2846:1: ( ( ( rule__ScatterChartFX__Group_11__0 )? ) )
            // InternalJavaFXLang.g:2847:1: ( ( rule__ScatterChartFX__Group_11__0 )? )
            {
            // InternalJavaFXLang.g:2847:1: ( ( rule__ScatterChartFX__Group_11__0 )? )
            // InternalJavaFXLang.g:2848:2: ( rule__ScatterChartFX__Group_11__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_11()); 
            // InternalJavaFXLang.g:2849:2: ( rule__ScatterChartFX__Group_11__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalJavaFXLang.g:2849:3: rule__ScatterChartFX__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScatterChartFX__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScatterChartFXAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__11__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group__12"
    // InternalJavaFXLang.g:2857:1: rule__ScatterChartFX__Group__12 : rule__ScatterChartFX__Group__12__Impl rule__ScatterChartFX__Group__13 ;
    public final void rule__ScatterChartFX__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2861:1: ( rule__ScatterChartFX__Group__12__Impl rule__ScatterChartFX__Group__13 )
            // InternalJavaFXLang.g:2862:2: rule__ScatterChartFX__Group__12__Impl rule__ScatterChartFX__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__ScatterChartFX__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__12"


    // $ANTLR start "rule__ScatterChartFX__Group__12__Impl"
    // InternalJavaFXLang.g:2869:1: rule__ScatterChartFX__Group__12__Impl : ( ( rule__ScatterChartFX__Group_12__0 )? ) ;
    public final void rule__ScatterChartFX__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2873:1: ( ( ( rule__ScatterChartFX__Group_12__0 )? ) )
            // InternalJavaFXLang.g:2874:1: ( ( rule__ScatterChartFX__Group_12__0 )? )
            {
            // InternalJavaFXLang.g:2874:1: ( ( rule__ScatterChartFX__Group_12__0 )? )
            // InternalJavaFXLang.g:2875:2: ( rule__ScatterChartFX__Group_12__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_12()); 
            // InternalJavaFXLang.g:2876:2: ( rule__ScatterChartFX__Group_12__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalJavaFXLang.g:2876:3: rule__ScatterChartFX__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScatterChartFX__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScatterChartFXAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__12__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group__13"
    // InternalJavaFXLang.g:2884:1: rule__ScatterChartFX__Group__13 : rule__ScatterChartFX__Group__13__Impl ;
    public final void rule__ScatterChartFX__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2888:1: ( rule__ScatterChartFX__Group__13__Impl )
            // InternalJavaFXLang.g:2889:2: rule__ScatterChartFX__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__13"


    // $ANTLR start "rule__ScatterChartFX__Group__13__Impl"
    // InternalJavaFXLang.g:2895:1: rule__ScatterChartFX__Group__13__Impl : ( '}' ) ;
    public final void rule__ScatterChartFX__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2899:1: ( ( '}' ) )
            // InternalJavaFXLang.g:2900:1: ( '}' )
            {
            // InternalJavaFXLang.g:2900:1: ( '}' )
            // InternalJavaFXLang.g:2901:2: '}'
            {
             before(grammarAccess.getScatterChartFXAccess().getRightCurlyBracketKeyword_13()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getScatterChartFXAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group__13__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group_5__0"
    // InternalJavaFXLang.g:2911:1: rule__ScatterChartFX__Group_5__0 : rule__ScatterChartFX__Group_5__0__Impl rule__ScatterChartFX__Group_5__1 ;
    public final void rule__ScatterChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2915:1: ( rule__ScatterChartFX__Group_5__0__Impl rule__ScatterChartFX__Group_5__1 )
            // InternalJavaFXLang.g:2916:2: rule__ScatterChartFX__Group_5__0__Impl rule__ScatterChartFX__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__ScatterChartFX__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_5__0"


    // $ANTLR start "rule__ScatterChartFX__Group_5__0__Impl"
    // InternalJavaFXLang.g:2923:1: rule__ScatterChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__ScatterChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2927:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:2928:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:2928:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:2929:2: 'legendSide:'
            {
             before(grammarAccess.getScatterChartFXAccess().getLegendSideKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getScatterChartFXAccess().getLegendSideKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_5__0__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group_5__1"
    // InternalJavaFXLang.g:2938:1: rule__ScatterChartFX__Group_5__1 : rule__ScatterChartFX__Group_5__1__Impl ;
    public final void rule__ScatterChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2942:1: ( rule__ScatterChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:2943:2: rule__ScatterChartFX__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_5__1"


    // $ANTLR start "rule__ScatterChartFX__Group_5__1__Impl"
    // InternalJavaFXLang.g:2949:1: rule__ScatterChartFX__Group_5__1__Impl : ( ( rule__ScatterChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__ScatterChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2953:1: ( ( ( rule__ScatterChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:2954:1: ( ( rule__ScatterChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:2954:1: ( ( rule__ScatterChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:2955:2: ( rule__ScatterChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:2956:2: ( rule__ScatterChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:2956:3: rule__ScatterChartFX__LegendSideAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__LegendSideAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getScatterChartFXAccess().getLegendSideAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_5__1__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group_6__0"
    // InternalJavaFXLang.g:2965:1: rule__ScatterChartFX__Group_6__0 : rule__ScatterChartFX__Group_6__0__Impl rule__ScatterChartFX__Group_6__1 ;
    public final void rule__ScatterChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2969:1: ( rule__ScatterChartFX__Group_6__0__Impl rule__ScatterChartFX__Group_6__1 )
            // InternalJavaFXLang.g:2970:2: rule__ScatterChartFX__Group_6__0__Impl rule__ScatterChartFX__Group_6__1
            {
            pushFollow(FOLLOW_22);
            rule__ScatterChartFX__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_6__0"


    // $ANTLR start "rule__ScatterChartFX__Group_6__0__Impl"
    // InternalJavaFXLang.g:2977:1: rule__ScatterChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__ScatterChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2981:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:2982:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:2982:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:2983:2: 'showLegend:'
            {
             before(grammarAccess.getScatterChartFXAccess().getShowLegendKeyword_6_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getScatterChartFXAccess().getShowLegendKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_6__0__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group_6__1"
    // InternalJavaFXLang.g:2992:1: rule__ScatterChartFX__Group_6__1 : rule__ScatterChartFX__Group_6__1__Impl ;
    public final void rule__ScatterChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2996:1: ( rule__ScatterChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:2997:2: rule__ScatterChartFX__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_6__1"


    // $ANTLR start "rule__ScatterChartFX__Group_6__1__Impl"
    // InternalJavaFXLang.g:3003:1: rule__ScatterChartFX__Group_6__1__Impl : ( ( rule__ScatterChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__ScatterChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3007:1: ( ( ( rule__ScatterChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:3008:1: ( ( rule__ScatterChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:3008:1: ( ( rule__ScatterChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:3009:2: ( rule__ScatterChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:3010:2: ( rule__ScatterChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:3010:3: rule__ScatterChartFX__ShowLegendAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__ShowLegendAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getScatterChartFXAccess().getShowLegendAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_6__1__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group_7__0"
    // InternalJavaFXLang.g:3019:1: rule__ScatterChartFX__Group_7__0 : rule__ScatterChartFX__Group_7__0__Impl rule__ScatterChartFX__Group_7__1 ;
    public final void rule__ScatterChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3023:1: ( rule__ScatterChartFX__Group_7__0__Impl rule__ScatterChartFX__Group_7__1 )
            // InternalJavaFXLang.g:3024:2: rule__ScatterChartFX__Group_7__0__Impl rule__ScatterChartFX__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__ScatterChartFX__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_7__0"


    // $ANTLR start "rule__ScatterChartFX__Group_7__0__Impl"
    // InternalJavaFXLang.g:3031:1: rule__ScatterChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__ScatterChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3035:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:3036:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:3036:1: ( 'title:' )
            // InternalJavaFXLang.g:3037:2: 'title:'
            {
             before(grammarAccess.getScatterChartFXAccess().getTitleKeyword_7_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getScatterChartFXAccess().getTitleKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_7__0__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group_7__1"
    // InternalJavaFXLang.g:3046:1: rule__ScatterChartFX__Group_7__1 : rule__ScatterChartFX__Group_7__1__Impl ;
    public final void rule__ScatterChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3050:1: ( rule__ScatterChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:3051:2: rule__ScatterChartFX__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_7__1"


    // $ANTLR start "rule__ScatterChartFX__Group_7__1__Impl"
    // InternalJavaFXLang.g:3057:1: rule__ScatterChartFX__Group_7__1__Impl : ( ( rule__ScatterChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__ScatterChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3061:1: ( ( ( rule__ScatterChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:3062:1: ( ( rule__ScatterChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:3062:1: ( ( rule__ScatterChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:3063:2: ( rule__ScatterChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:3064:2: ( rule__ScatterChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:3064:3: rule__ScatterChartFX__TitleAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__TitleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getScatterChartFXAccess().getTitleAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_7__1__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group_8__0"
    // InternalJavaFXLang.g:3073:1: rule__ScatterChartFX__Group_8__0 : rule__ScatterChartFX__Group_8__0__Impl rule__ScatterChartFX__Group_8__1 ;
    public final void rule__ScatterChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3077:1: ( rule__ScatterChartFX__Group_8__0__Impl rule__ScatterChartFX__Group_8__1 )
            // InternalJavaFXLang.g:3078:2: rule__ScatterChartFX__Group_8__0__Impl rule__ScatterChartFX__Group_8__1
            {
            pushFollow(FOLLOW_21);
            rule__ScatterChartFX__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_8__0"


    // $ANTLR start "rule__ScatterChartFX__Group_8__0__Impl"
    // InternalJavaFXLang.g:3085:1: rule__ScatterChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__ScatterChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3089:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:3090:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:3090:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:3091:2: 'titleSide:'
            {
             before(grammarAccess.getScatterChartFXAccess().getTitleSideKeyword_8_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getScatterChartFXAccess().getTitleSideKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_8__0__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group_8__1"
    // InternalJavaFXLang.g:3100:1: rule__ScatterChartFX__Group_8__1 : rule__ScatterChartFX__Group_8__1__Impl ;
    public final void rule__ScatterChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3104:1: ( rule__ScatterChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:3105:2: rule__ScatterChartFX__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_8__1"


    // $ANTLR start "rule__ScatterChartFX__Group_8__1__Impl"
    // InternalJavaFXLang.g:3111:1: rule__ScatterChartFX__Group_8__1__Impl : ( ( rule__ScatterChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__ScatterChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3115:1: ( ( ( rule__ScatterChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:3116:1: ( ( rule__ScatterChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:3116:1: ( ( rule__ScatterChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:3117:2: ( rule__ScatterChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:3118:2: ( rule__ScatterChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:3118:3: rule__ScatterChartFX__TitleSideAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__TitleSideAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getScatterChartFXAccess().getTitleSideAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_8__1__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group_9__0"
    // InternalJavaFXLang.g:3127:1: rule__ScatterChartFX__Group_9__0 : rule__ScatterChartFX__Group_9__0__Impl rule__ScatterChartFX__Group_9__1 ;
    public final void rule__ScatterChartFX__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3131:1: ( rule__ScatterChartFX__Group_9__0__Impl rule__ScatterChartFX__Group_9__1 )
            // InternalJavaFXLang.g:3132:2: rule__ScatterChartFX__Group_9__0__Impl rule__ScatterChartFX__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__ScatterChartFX__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_9__0"


    // $ANTLR start "rule__ScatterChartFX__Group_9__0__Impl"
    // InternalJavaFXLang.g:3139:1: rule__ScatterChartFX__Group_9__0__Impl : ( 'xAxisLabel:' ) ;
    public final void rule__ScatterChartFX__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3143:1: ( ( 'xAxisLabel:' ) )
            // InternalJavaFXLang.g:3144:1: ( 'xAxisLabel:' )
            {
            // InternalJavaFXLang.g:3144:1: ( 'xAxisLabel:' )
            // InternalJavaFXLang.g:3145:2: 'xAxisLabel:'
            {
             before(grammarAccess.getScatterChartFXAccess().getXAxisLabelKeyword_9_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getScatterChartFXAccess().getXAxisLabelKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_9__0__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group_9__1"
    // InternalJavaFXLang.g:3154:1: rule__ScatterChartFX__Group_9__1 : rule__ScatterChartFX__Group_9__1__Impl ;
    public final void rule__ScatterChartFX__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3158:1: ( rule__ScatterChartFX__Group_9__1__Impl )
            // InternalJavaFXLang.g:3159:2: rule__ScatterChartFX__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_9__1"


    // $ANTLR start "rule__ScatterChartFX__Group_9__1__Impl"
    // InternalJavaFXLang.g:3165:1: rule__ScatterChartFX__Group_9__1__Impl : ( ( rule__ScatterChartFX__XAxisLabelAssignment_9_1 ) ) ;
    public final void rule__ScatterChartFX__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3169:1: ( ( ( rule__ScatterChartFX__XAxisLabelAssignment_9_1 ) ) )
            // InternalJavaFXLang.g:3170:1: ( ( rule__ScatterChartFX__XAxisLabelAssignment_9_1 ) )
            {
            // InternalJavaFXLang.g:3170:1: ( ( rule__ScatterChartFX__XAxisLabelAssignment_9_1 ) )
            // InternalJavaFXLang.g:3171:2: ( rule__ScatterChartFX__XAxisLabelAssignment_9_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getXAxisLabelAssignment_9_1()); 
            // InternalJavaFXLang.g:3172:2: ( rule__ScatterChartFX__XAxisLabelAssignment_9_1 )
            // InternalJavaFXLang.g:3172:3: rule__ScatterChartFX__XAxisLabelAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__XAxisLabelAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getScatterChartFXAccess().getXAxisLabelAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_9__1__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group_10__0"
    // InternalJavaFXLang.g:3181:1: rule__ScatterChartFX__Group_10__0 : rule__ScatterChartFX__Group_10__0__Impl rule__ScatterChartFX__Group_10__1 ;
    public final void rule__ScatterChartFX__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3185:1: ( rule__ScatterChartFX__Group_10__0__Impl rule__ScatterChartFX__Group_10__1 )
            // InternalJavaFXLang.g:3186:2: rule__ScatterChartFX__Group_10__0__Impl rule__ScatterChartFX__Group_10__1
            {
            pushFollow(FOLLOW_23);
            rule__ScatterChartFX__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_10__0"


    // $ANTLR start "rule__ScatterChartFX__Group_10__0__Impl"
    // InternalJavaFXLang.g:3193:1: rule__ScatterChartFX__Group_10__0__Impl : ( 'xAxisType:' ) ;
    public final void rule__ScatterChartFX__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3197:1: ( ( 'xAxisType:' ) )
            // InternalJavaFXLang.g:3198:1: ( 'xAxisType:' )
            {
            // InternalJavaFXLang.g:3198:1: ( 'xAxisType:' )
            // InternalJavaFXLang.g:3199:2: 'xAxisType:'
            {
             before(grammarAccess.getScatterChartFXAccess().getXAxisTypeKeyword_10_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getScatterChartFXAccess().getXAxisTypeKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_10__0__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group_10__1"
    // InternalJavaFXLang.g:3208:1: rule__ScatterChartFX__Group_10__1 : rule__ScatterChartFX__Group_10__1__Impl ;
    public final void rule__ScatterChartFX__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3212:1: ( rule__ScatterChartFX__Group_10__1__Impl )
            // InternalJavaFXLang.g:3213:2: rule__ScatterChartFX__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_10__1"


    // $ANTLR start "rule__ScatterChartFX__Group_10__1__Impl"
    // InternalJavaFXLang.g:3219:1: rule__ScatterChartFX__Group_10__1__Impl : ( ( rule__ScatterChartFX__XAxisTypeAssignment_10_1 ) ) ;
    public final void rule__ScatterChartFX__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3223:1: ( ( ( rule__ScatterChartFX__XAxisTypeAssignment_10_1 ) ) )
            // InternalJavaFXLang.g:3224:1: ( ( rule__ScatterChartFX__XAxisTypeAssignment_10_1 ) )
            {
            // InternalJavaFXLang.g:3224:1: ( ( rule__ScatterChartFX__XAxisTypeAssignment_10_1 ) )
            // InternalJavaFXLang.g:3225:2: ( rule__ScatterChartFX__XAxisTypeAssignment_10_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getXAxisTypeAssignment_10_1()); 
            // InternalJavaFXLang.g:3226:2: ( rule__ScatterChartFX__XAxisTypeAssignment_10_1 )
            // InternalJavaFXLang.g:3226:3: rule__ScatterChartFX__XAxisTypeAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__XAxisTypeAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getScatterChartFXAccess().getXAxisTypeAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_10__1__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group_11__0"
    // InternalJavaFXLang.g:3235:1: rule__ScatterChartFX__Group_11__0 : rule__ScatterChartFX__Group_11__0__Impl rule__ScatterChartFX__Group_11__1 ;
    public final void rule__ScatterChartFX__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3239:1: ( rule__ScatterChartFX__Group_11__0__Impl rule__ScatterChartFX__Group_11__1 )
            // InternalJavaFXLang.g:3240:2: rule__ScatterChartFX__Group_11__0__Impl rule__ScatterChartFX__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__ScatterChartFX__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_11__0"


    // $ANTLR start "rule__ScatterChartFX__Group_11__0__Impl"
    // InternalJavaFXLang.g:3247:1: rule__ScatterChartFX__Group_11__0__Impl : ( 'yAxisLabel:' ) ;
    public final void rule__ScatterChartFX__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3251:1: ( ( 'yAxisLabel:' ) )
            // InternalJavaFXLang.g:3252:1: ( 'yAxisLabel:' )
            {
            // InternalJavaFXLang.g:3252:1: ( 'yAxisLabel:' )
            // InternalJavaFXLang.g:3253:2: 'yAxisLabel:'
            {
             before(grammarAccess.getScatterChartFXAccess().getYAxisLabelKeyword_11_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getScatterChartFXAccess().getYAxisLabelKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_11__0__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group_11__1"
    // InternalJavaFXLang.g:3262:1: rule__ScatterChartFX__Group_11__1 : rule__ScatterChartFX__Group_11__1__Impl ;
    public final void rule__ScatterChartFX__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3266:1: ( rule__ScatterChartFX__Group_11__1__Impl )
            // InternalJavaFXLang.g:3267:2: rule__ScatterChartFX__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_11__1"


    // $ANTLR start "rule__ScatterChartFX__Group_11__1__Impl"
    // InternalJavaFXLang.g:3273:1: rule__ScatterChartFX__Group_11__1__Impl : ( ( rule__ScatterChartFX__YAxisLabelAssignment_11_1 ) ) ;
    public final void rule__ScatterChartFX__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3277:1: ( ( ( rule__ScatterChartFX__YAxisLabelAssignment_11_1 ) ) )
            // InternalJavaFXLang.g:3278:1: ( ( rule__ScatterChartFX__YAxisLabelAssignment_11_1 ) )
            {
            // InternalJavaFXLang.g:3278:1: ( ( rule__ScatterChartFX__YAxisLabelAssignment_11_1 ) )
            // InternalJavaFXLang.g:3279:2: ( rule__ScatterChartFX__YAxisLabelAssignment_11_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getYAxisLabelAssignment_11_1()); 
            // InternalJavaFXLang.g:3280:2: ( rule__ScatterChartFX__YAxisLabelAssignment_11_1 )
            // InternalJavaFXLang.g:3280:3: rule__ScatterChartFX__YAxisLabelAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__YAxisLabelAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getScatterChartFXAccess().getYAxisLabelAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_11__1__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group_12__0"
    // InternalJavaFXLang.g:3289:1: rule__ScatterChartFX__Group_12__0 : rule__ScatterChartFX__Group_12__0__Impl rule__ScatterChartFX__Group_12__1 ;
    public final void rule__ScatterChartFX__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3293:1: ( rule__ScatterChartFX__Group_12__0__Impl rule__ScatterChartFX__Group_12__1 )
            // InternalJavaFXLang.g:3294:2: rule__ScatterChartFX__Group_12__0__Impl rule__ScatterChartFX__Group_12__1
            {
            pushFollow(FOLLOW_23);
            rule__ScatterChartFX__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_12__0"


    // $ANTLR start "rule__ScatterChartFX__Group_12__0__Impl"
    // InternalJavaFXLang.g:3301:1: rule__ScatterChartFX__Group_12__0__Impl : ( 'yAxisType:' ) ;
    public final void rule__ScatterChartFX__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3305:1: ( ( 'yAxisType:' ) )
            // InternalJavaFXLang.g:3306:1: ( 'yAxisType:' )
            {
            // InternalJavaFXLang.g:3306:1: ( 'yAxisType:' )
            // InternalJavaFXLang.g:3307:2: 'yAxisType:'
            {
             before(grammarAccess.getScatterChartFXAccess().getYAxisTypeKeyword_12_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getScatterChartFXAccess().getYAxisTypeKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_12__0__Impl"


    // $ANTLR start "rule__ScatterChartFX__Group_12__1"
    // InternalJavaFXLang.g:3316:1: rule__ScatterChartFX__Group_12__1 : rule__ScatterChartFX__Group_12__1__Impl ;
    public final void rule__ScatterChartFX__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3320:1: ( rule__ScatterChartFX__Group_12__1__Impl )
            // InternalJavaFXLang.g:3321:2: rule__ScatterChartFX__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_12__1"


    // $ANTLR start "rule__ScatterChartFX__Group_12__1__Impl"
    // InternalJavaFXLang.g:3327:1: rule__ScatterChartFX__Group_12__1__Impl : ( ( rule__ScatterChartFX__YAxisTypeAssignment_12_1 ) ) ;
    public final void rule__ScatterChartFX__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3331:1: ( ( ( rule__ScatterChartFX__YAxisTypeAssignment_12_1 ) ) )
            // InternalJavaFXLang.g:3332:1: ( ( rule__ScatterChartFX__YAxisTypeAssignment_12_1 ) )
            {
            // InternalJavaFXLang.g:3332:1: ( ( rule__ScatterChartFX__YAxisTypeAssignment_12_1 ) )
            // InternalJavaFXLang.g:3333:2: ( rule__ScatterChartFX__YAxisTypeAssignment_12_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getYAxisTypeAssignment_12_1()); 
            // InternalJavaFXLang.g:3334:2: ( rule__ScatterChartFX__YAxisTypeAssignment_12_1 )
            // InternalJavaFXLang.g:3334:3: rule__ScatterChartFX__YAxisTypeAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__ScatterChartFX__YAxisTypeAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getScatterChartFXAccess().getYAxisTypeAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__Group_12__1__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group__0"
    // InternalJavaFXLang.g:3343:1: rule__BubbleChartFX__Group__0 : rule__BubbleChartFX__Group__0__Impl rule__BubbleChartFX__Group__1 ;
    public final void rule__BubbleChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3347:1: ( rule__BubbleChartFX__Group__0__Impl rule__BubbleChartFX__Group__1 )
            // InternalJavaFXLang.g:3348:2: rule__BubbleChartFX__Group__0__Impl rule__BubbleChartFX__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__BubbleChartFX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__0"


    // $ANTLR start "rule__BubbleChartFX__Group__0__Impl"
    // InternalJavaFXLang.g:3355:1: rule__BubbleChartFX__Group__0__Impl : ( () ) ;
    public final void rule__BubbleChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3359:1: ( ( () ) )
            // InternalJavaFXLang.g:3360:1: ( () )
            {
            // InternalJavaFXLang.g:3360:1: ( () )
            // InternalJavaFXLang.g:3361:2: ()
            {
             before(grammarAccess.getBubbleChartFXAccess().getBubbleChartFXAction_0()); 
            // InternalJavaFXLang.g:3362:2: ()
            // InternalJavaFXLang.g:3362:3: 
            {
            }

             after(grammarAccess.getBubbleChartFXAccess().getBubbleChartFXAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__0__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group__1"
    // InternalJavaFXLang.g:3370:1: rule__BubbleChartFX__Group__1 : rule__BubbleChartFX__Group__1__Impl rule__BubbleChartFX__Group__2 ;
    public final void rule__BubbleChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3374:1: ( rule__BubbleChartFX__Group__1__Impl rule__BubbleChartFX__Group__2 )
            // InternalJavaFXLang.g:3375:2: rule__BubbleChartFX__Group__1__Impl rule__BubbleChartFX__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__BubbleChartFX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__1"


    // $ANTLR start "rule__BubbleChartFX__Group__1__Impl"
    // InternalJavaFXLang.g:3382:1: rule__BubbleChartFX__Group__1__Impl : ( 'BubbleChart' ) ;
    public final void rule__BubbleChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3386:1: ( ( 'BubbleChart' ) )
            // InternalJavaFXLang.g:3387:1: ( 'BubbleChart' )
            {
            // InternalJavaFXLang.g:3387:1: ( 'BubbleChart' )
            // InternalJavaFXLang.g:3388:2: 'BubbleChart'
            {
             before(grammarAccess.getBubbleChartFXAccess().getBubbleChartKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBubbleChartFXAccess().getBubbleChartKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__1__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group__2"
    // InternalJavaFXLang.g:3397:1: rule__BubbleChartFX__Group__2 : rule__BubbleChartFX__Group__2__Impl rule__BubbleChartFX__Group__3 ;
    public final void rule__BubbleChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3401:1: ( rule__BubbleChartFX__Group__2__Impl rule__BubbleChartFX__Group__3 )
            // InternalJavaFXLang.g:3402:2: rule__BubbleChartFX__Group__2__Impl rule__BubbleChartFX__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__BubbleChartFX__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__2"


    // $ANTLR start "rule__BubbleChartFX__Group__2__Impl"
    // InternalJavaFXLang.g:3409:1: rule__BubbleChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__BubbleChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3413:1: ( ( '{' ) )
            // InternalJavaFXLang.g:3414:1: ( '{' )
            {
            // InternalJavaFXLang.g:3414:1: ( '{' )
            // InternalJavaFXLang.g:3415:2: '{'
            {
             before(grammarAccess.getBubbleChartFXAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBubbleChartFXAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__2__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group__3"
    // InternalJavaFXLang.g:3424:1: rule__BubbleChartFX__Group__3 : rule__BubbleChartFX__Group__3__Impl rule__BubbleChartFX__Group__4 ;
    public final void rule__BubbleChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3428:1: ( rule__BubbleChartFX__Group__3__Impl rule__BubbleChartFX__Group__4 )
            // InternalJavaFXLang.g:3429:2: rule__BubbleChartFX__Group__3__Impl rule__BubbleChartFX__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__BubbleChartFX__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__3"


    // $ANTLR start "rule__BubbleChartFX__Group__3__Impl"
    // InternalJavaFXLang.g:3436:1: rule__BubbleChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__BubbleChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3440:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:3441:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:3441:1: ( 'name:' )
            // InternalJavaFXLang.g:3442:2: 'name:'
            {
             before(grammarAccess.getBubbleChartFXAccess().getNameKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBubbleChartFXAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__3__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group__4"
    // InternalJavaFXLang.g:3451:1: rule__BubbleChartFX__Group__4 : rule__BubbleChartFX__Group__4__Impl rule__BubbleChartFX__Group__5 ;
    public final void rule__BubbleChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3455:1: ( rule__BubbleChartFX__Group__4__Impl rule__BubbleChartFX__Group__5 )
            // InternalJavaFXLang.g:3456:2: rule__BubbleChartFX__Group__4__Impl rule__BubbleChartFX__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__BubbleChartFX__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__4"


    // $ANTLR start "rule__BubbleChartFX__Group__4__Impl"
    // InternalJavaFXLang.g:3463:1: rule__BubbleChartFX__Group__4__Impl : ( ( rule__BubbleChartFX__NameAssignment_4 ) ) ;
    public final void rule__BubbleChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3467:1: ( ( ( rule__BubbleChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:3468:1: ( ( rule__BubbleChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:3468:1: ( ( rule__BubbleChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:3469:2: ( rule__BubbleChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:3470:2: ( rule__BubbleChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:3470:3: rule__BubbleChartFX__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBubbleChartFXAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__4__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group__5"
    // InternalJavaFXLang.g:3478:1: rule__BubbleChartFX__Group__5 : rule__BubbleChartFX__Group__5__Impl rule__BubbleChartFX__Group__6 ;
    public final void rule__BubbleChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3482:1: ( rule__BubbleChartFX__Group__5__Impl rule__BubbleChartFX__Group__6 )
            // InternalJavaFXLang.g:3483:2: rule__BubbleChartFX__Group__5__Impl rule__BubbleChartFX__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__BubbleChartFX__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__5"


    // $ANTLR start "rule__BubbleChartFX__Group__5__Impl"
    // InternalJavaFXLang.g:3490:1: rule__BubbleChartFX__Group__5__Impl : ( ( rule__BubbleChartFX__Group_5__0 )? ) ;
    public final void rule__BubbleChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3494:1: ( ( ( rule__BubbleChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:3495:1: ( ( rule__BubbleChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:3495:1: ( ( rule__BubbleChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:3496:2: ( rule__BubbleChartFX__Group_5__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:3497:2: ( rule__BubbleChartFX__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalJavaFXLang.g:3497:3: rule__BubbleChartFX__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BubbleChartFX__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBubbleChartFXAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__5__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group__6"
    // InternalJavaFXLang.g:3505:1: rule__BubbleChartFX__Group__6 : rule__BubbleChartFX__Group__6__Impl rule__BubbleChartFX__Group__7 ;
    public final void rule__BubbleChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3509:1: ( rule__BubbleChartFX__Group__6__Impl rule__BubbleChartFX__Group__7 )
            // InternalJavaFXLang.g:3510:2: rule__BubbleChartFX__Group__6__Impl rule__BubbleChartFX__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__BubbleChartFX__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__6"


    // $ANTLR start "rule__BubbleChartFX__Group__6__Impl"
    // InternalJavaFXLang.g:3517:1: rule__BubbleChartFX__Group__6__Impl : ( ( rule__BubbleChartFX__Group_6__0 )? ) ;
    public final void rule__BubbleChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3521:1: ( ( ( rule__BubbleChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:3522:1: ( ( rule__BubbleChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:3522:1: ( ( rule__BubbleChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:3523:2: ( rule__BubbleChartFX__Group_6__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:3524:2: ( rule__BubbleChartFX__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalJavaFXLang.g:3524:3: rule__BubbleChartFX__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BubbleChartFX__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBubbleChartFXAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__6__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group__7"
    // InternalJavaFXLang.g:3532:1: rule__BubbleChartFX__Group__7 : rule__BubbleChartFX__Group__7__Impl rule__BubbleChartFX__Group__8 ;
    public final void rule__BubbleChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3536:1: ( rule__BubbleChartFX__Group__7__Impl rule__BubbleChartFX__Group__8 )
            // InternalJavaFXLang.g:3537:2: rule__BubbleChartFX__Group__7__Impl rule__BubbleChartFX__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__BubbleChartFX__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__7"


    // $ANTLR start "rule__BubbleChartFX__Group__7__Impl"
    // InternalJavaFXLang.g:3544:1: rule__BubbleChartFX__Group__7__Impl : ( ( rule__BubbleChartFX__Group_7__0 )? ) ;
    public final void rule__BubbleChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3548:1: ( ( ( rule__BubbleChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:3549:1: ( ( rule__BubbleChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:3549:1: ( ( rule__BubbleChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:3550:2: ( rule__BubbleChartFX__Group_7__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:3551:2: ( rule__BubbleChartFX__Group_7__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalJavaFXLang.g:3551:3: rule__BubbleChartFX__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BubbleChartFX__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBubbleChartFXAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__7__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group__8"
    // InternalJavaFXLang.g:3559:1: rule__BubbleChartFX__Group__8 : rule__BubbleChartFX__Group__8__Impl rule__BubbleChartFX__Group__9 ;
    public final void rule__BubbleChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3563:1: ( rule__BubbleChartFX__Group__8__Impl rule__BubbleChartFX__Group__9 )
            // InternalJavaFXLang.g:3564:2: rule__BubbleChartFX__Group__8__Impl rule__BubbleChartFX__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__BubbleChartFX__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__8"


    // $ANTLR start "rule__BubbleChartFX__Group__8__Impl"
    // InternalJavaFXLang.g:3571:1: rule__BubbleChartFX__Group__8__Impl : ( ( rule__BubbleChartFX__Group_8__0 )? ) ;
    public final void rule__BubbleChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3575:1: ( ( ( rule__BubbleChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:3576:1: ( ( rule__BubbleChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:3576:1: ( ( rule__BubbleChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:3577:2: ( rule__BubbleChartFX__Group_8__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:3578:2: ( rule__BubbleChartFX__Group_8__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalJavaFXLang.g:3578:3: rule__BubbleChartFX__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BubbleChartFX__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBubbleChartFXAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__8__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group__9"
    // InternalJavaFXLang.g:3586:1: rule__BubbleChartFX__Group__9 : rule__BubbleChartFX__Group__9__Impl rule__BubbleChartFX__Group__10 ;
    public final void rule__BubbleChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3590:1: ( rule__BubbleChartFX__Group__9__Impl rule__BubbleChartFX__Group__10 )
            // InternalJavaFXLang.g:3591:2: rule__BubbleChartFX__Group__9__Impl rule__BubbleChartFX__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__BubbleChartFX__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__9"


    // $ANTLR start "rule__BubbleChartFX__Group__9__Impl"
    // InternalJavaFXLang.g:3598:1: rule__BubbleChartFX__Group__9__Impl : ( ( rule__BubbleChartFX__Group_9__0 )? ) ;
    public final void rule__BubbleChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3602:1: ( ( ( rule__BubbleChartFX__Group_9__0 )? ) )
            // InternalJavaFXLang.g:3603:1: ( ( rule__BubbleChartFX__Group_9__0 )? )
            {
            // InternalJavaFXLang.g:3603:1: ( ( rule__BubbleChartFX__Group_9__0 )? )
            // InternalJavaFXLang.g:3604:2: ( rule__BubbleChartFX__Group_9__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_9()); 
            // InternalJavaFXLang.g:3605:2: ( rule__BubbleChartFX__Group_9__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalJavaFXLang.g:3605:3: rule__BubbleChartFX__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BubbleChartFX__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBubbleChartFXAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__9__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group__10"
    // InternalJavaFXLang.g:3613:1: rule__BubbleChartFX__Group__10 : rule__BubbleChartFX__Group__10__Impl rule__BubbleChartFX__Group__11 ;
    public final void rule__BubbleChartFX__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3617:1: ( rule__BubbleChartFX__Group__10__Impl rule__BubbleChartFX__Group__11 )
            // InternalJavaFXLang.g:3618:2: rule__BubbleChartFX__Group__10__Impl rule__BubbleChartFX__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__BubbleChartFX__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__10"


    // $ANTLR start "rule__BubbleChartFX__Group__10__Impl"
    // InternalJavaFXLang.g:3625:1: rule__BubbleChartFX__Group__10__Impl : ( ( rule__BubbleChartFX__Group_10__0 )? ) ;
    public final void rule__BubbleChartFX__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3629:1: ( ( ( rule__BubbleChartFX__Group_10__0 )? ) )
            // InternalJavaFXLang.g:3630:1: ( ( rule__BubbleChartFX__Group_10__0 )? )
            {
            // InternalJavaFXLang.g:3630:1: ( ( rule__BubbleChartFX__Group_10__0 )? )
            // InternalJavaFXLang.g:3631:2: ( rule__BubbleChartFX__Group_10__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_10()); 
            // InternalJavaFXLang.g:3632:2: ( rule__BubbleChartFX__Group_10__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==41) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalJavaFXLang.g:3632:3: rule__BubbleChartFX__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BubbleChartFX__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBubbleChartFXAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__10__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group__11"
    // InternalJavaFXLang.g:3640:1: rule__BubbleChartFX__Group__11 : rule__BubbleChartFX__Group__11__Impl rule__BubbleChartFX__Group__12 ;
    public final void rule__BubbleChartFX__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3644:1: ( rule__BubbleChartFX__Group__11__Impl rule__BubbleChartFX__Group__12 )
            // InternalJavaFXLang.g:3645:2: rule__BubbleChartFX__Group__11__Impl rule__BubbleChartFX__Group__12
            {
            pushFollow(FOLLOW_20);
            rule__BubbleChartFX__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__11"


    // $ANTLR start "rule__BubbleChartFX__Group__11__Impl"
    // InternalJavaFXLang.g:3652:1: rule__BubbleChartFX__Group__11__Impl : ( ( rule__BubbleChartFX__Group_11__0 )? ) ;
    public final void rule__BubbleChartFX__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3656:1: ( ( ( rule__BubbleChartFX__Group_11__0 )? ) )
            // InternalJavaFXLang.g:3657:1: ( ( rule__BubbleChartFX__Group_11__0 )? )
            {
            // InternalJavaFXLang.g:3657:1: ( ( rule__BubbleChartFX__Group_11__0 )? )
            // InternalJavaFXLang.g:3658:2: ( rule__BubbleChartFX__Group_11__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_11()); 
            // InternalJavaFXLang.g:3659:2: ( rule__BubbleChartFX__Group_11__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==42) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalJavaFXLang.g:3659:3: rule__BubbleChartFX__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BubbleChartFX__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBubbleChartFXAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__11__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group__12"
    // InternalJavaFXLang.g:3667:1: rule__BubbleChartFX__Group__12 : rule__BubbleChartFX__Group__12__Impl rule__BubbleChartFX__Group__13 ;
    public final void rule__BubbleChartFX__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3671:1: ( rule__BubbleChartFX__Group__12__Impl rule__BubbleChartFX__Group__13 )
            // InternalJavaFXLang.g:3672:2: rule__BubbleChartFX__Group__12__Impl rule__BubbleChartFX__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__BubbleChartFX__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__12"


    // $ANTLR start "rule__BubbleChartFX__Group__12__Impl"
    // InternalJavaFXLang.g:3679:1: rule__BubbleChartFX__Group__12__Impl : ( ( rule__BubbleChartFX__Group_12__0 )? ) ;
    public final void rule__BubbleChartFX__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3683:1: ( ( ( rule__BubbleChartFX__Group_12__0 )? ) )
            // InternalJavaFXLang.g:3684:1: ( ( rule__BubbleChartFX__Group_12__0 )? )
            {
            // InternalJavaFXLang.g:3684:1: ( ( rule__BubbleChartFX__Group_12__0 )? )
            // InternalJavaFXLang.g:3685:2: ( rule__BubbleChartFX__Group_12__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_12()); 
            // InternalJavaFXLang.g:3686:2: ( rule__BubbleChartFX__Group_12__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalJavaFXLang.g:3686:3: rule__BubbleChartFX__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BubbleChartFX__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBubbleChartFXAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__12__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group__13"
    // InternalJavaFXLang.g:3694:1: rule__BubbleChartFX__Group__13 : rule__BubbleChartFX__Group__13__Impl ;
    public final void rule__BubbleChartFX__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3698:1: ( rule__BubbleChartFX__Group__13__Impl )
            // InternalJavaFXLang.g:3699:2: rule__BubbleChartFX__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__13"


    // $ANTLR start "rule__BubbleChartFX__Group__13__Impl"
    // InternalJavaFXLang.g:3705:1: rule__BubbleChartFX__Group__13__Impl : ( '}' ) ;
    public final void rule__BubbleChartFX__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3709:1: ( ( '}' ) )
            // InternalJavaFXLang.g:3710:1: ( '}' )
            {
            // InternalJavaFXLang.g:3710:1: ( '}' )
            // InternalJavaFXLang.g:3711:2: '}'
            {
             before(grammarAccess.getBubbleChartFXAccess().getRightCurlyBracketKeyword_13()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBubbleChartFXAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group__13__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group_5__0"
    // InternalJavaFXLang.g:3721:1: rule__BubbleChartFX__Group_5__0 : rule__BubbleChartFX__Group_5__0__Impl rule__BubbleChartFX__Group_5__1 ;
    public final void rule__BubbleChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3725:1: ( rule__BubbleChartFX__Group_5__0__Impl rule__BubbleChartFX__Group_5__1 )
            // InternalJavaFXLang.g:3726:2: rule__BubbleChartFX__Group_5__0__Impl rule__BubbleChartFX__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__BubbleChartFX__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_5__0"


    // $ANTLR start "rule__BubbleChartFX__Group_5__0__Impl"
    // InternalJavaFXLang.g:3733:1: rule__BubbleChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__BubbleChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3737:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:3738:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:3738:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:3739:2: 'legendSide:'
            {
             before(grammarAccess.getBubbleChartFXAccess().getLegendSideKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBubbleChartFXAccess().getLegendSideKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_5__0__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group_5__1"
    // InternalJavaFXLang.g:3748:1: rule__BubbleChartFX__Group_5__1 : rule__BubbleChartFX__Group_5__1__Impl ;
    public final void rule__BubbleChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3752:1: ( rule__BubbleChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:3753:2: rule__BubbleChartFX__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_5__1"


    // $ANTLR start "rule__BubbleChartFX__Group_5__1__Impl"
    // InternalJavaFXLang.g:3759:1: rule__BubbleChartFX__Group_5__1__Impl : ( ( rule__BubbleChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__BubbleChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3763:1: ( ( ( rule__BubbleChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:3764:1: ( ( rule__BubbleChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:3764:1: ( ( rule__BubbleChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:3765:2: ( rule__BubbleChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:3766:2: ( rule__BubbleChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:3766:3: rule__BubbleChartFX__LegendSideAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__LegendSideAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBubbleChartFXAccess().getLegendSideAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_5__1__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group_6__0"
    // InternalJavaFXLang.g:3775:1: rule__BubbleChartFX__Group_6__0 : rule__BubbleChartFX__Group_6__0__Impl rule__BubbleChartFX__Group_6__1 ;
    public final void rule__BubbleChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3779:1: ( rule__BubbleChartFX__Group_6__0__Impl rule__BubbleChartFX__Group_6__1 )
            // InternalJavaFXLang.g:3780:2: rule__BubbleChartFX__Group_6__0__Impl rule__BubbleChartFX__Group_6__1
            {
            pushFollow(FOLLOW_22);
            rule__BubbleChartFX__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_6__0"


    // $ANTLR start "rule__BubbleChartFX__Group_6__0__Impl"
    // InternalJavaFXLang.g:3787:1: rule__BubbleChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__BubbleChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3791:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:3792:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:3792:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:3793:2: 'showLegend:'
            {
             before(grammarAccess.getBubbleChartFXAccess().getShowLegendKeyword_6_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBubbleChartFXAccess().getShowLegendKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_6__0__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group_6__1"
    // InternalJavaFXLang.g:3802:1: rule__BubbleChartFX__Group_6__1 : rule__BubbleChartFX__Group_6__1__Impl ;
    public final void rule__BubbleChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3806:1: ( rule__BubbleChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:3807:2: rule__BubbleChartFX__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_6__1"


    // $ANTLR start "rule__BubbleChartFX__Group_6__1__Impl"
    // InternalJavaFXLang.g:3813:1: rule__BubbleChartFX__Group_6__1__Impl : ( ( rule__BubbleChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__BubbleChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3817:1: ( ( ( rule__BubbleChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:3818:1: ( ( rule__BubbleChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:3818:1: ( ( rule__BubbleChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:3819:2: ( rule__BubbleChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:3820:2: ( rule__BubbleChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:3820:3: rule__BubbleChartFX__ShowLegendAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__ShowLegendAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getBubbleChartFXAccess().getShowLegendAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_6__1__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group_7__0"
    // InternalJavaFXLang.g:3829:1: rule__BubbleChartFX__Group_7__0 : rule__BubbleChartFX__Group_7__0__Impl rule__BubbleChartFX__Group_7__1 ;
    public final void rule__BubbleChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3833:1: ( rule__BubbleChartFX__Group_7__0__Impl rule__BubbleChartFX__Group_7__1 )
            // InternalJavaFXLang.g:3834:2: rule__BubbleChartFX__Group_7__0__Impl rule__BubbleChartFX__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__BubbleChartFX__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_7__0"


    // $ANTLR start "rule__BubbleChartFX__Group_7__0__Impl"
    // InternalJavaFXLang.g:3841:1: rule__BubbleChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__BubbleChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3845:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:3846:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:3846:1: ( 'title:' )
            // InternalJavaFXLang.g:3847:2: 'title:'
            {
             before(grammarAccess.getBubbleChartFXAccess().getTitleKeyword_7_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBubbleChartFXAccess().getTitleKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_7__0__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group_7__1"
    // InternalJavaFXLang.g:3856:1: rule__BubbleChartFX__Group_7__1 : rule__BubbleChartFX__Group_7__1__Impl ;
    public final void rule__BubbleChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3860:1: ( rule__BubbleChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:3861:2: rule__BubbleChartFX__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_7__1"


    // $ANTLR start "rule__BubbleChartFX__Group_7__1__Impl"
    // InternalJavaFXLang.g:3867:1: rule__BubbleChartFX__Group_7__1__Impl : ( ( rule__BubbleChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__BubbleChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3871:1: ( ( ( rule__BubbleChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:3872:1: ( ( rule__BubbleChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:3872:1: ( ( rule__BubbleChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:3873:2: ( rule__BubbleChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:3874:2: ( rule__BubbleChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:3874:3: rule__BubbleChartFX__TitleAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__TitleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBubbleChartFXAccess().getTitleAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_7__1__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group_8__0"
    // InternalJavaFXLang.g:3883:1: rule__BubbleChartFX__Group_8__0 : rule__BubbleChartFX__Group_8__0__Impl rule__BubbleChartFX__Group_8__1 ;
    public final void rule__BubbleChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3887:1: ( rule__BubbleChartFX__Group_8__0__Impl rule__BubbleChartFX__Group_8__1 )
            // InternalJavaFXLang.g:3888:2: rule__BubbleChartFX__Group_8__0__Impl rule__BubbleChartFX__Group_8__1
            {
            pushFollow(FOLLOW_21);
            rule__BubbleChartFX__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_8__0"


    // $ANTLR start "rule__BubbleChartFX__Group_8__0__Impl"
    // InternalJavaFXLang.g:3895:1: rule__BubbleChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__BubbleChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3899:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:3900:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:3900:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:3901:2: 'titleSide:'
            {
             before(grammarAccess.getBubbleChartFXAccess().getTitleSideKeyword_8_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBubbleChartFXAccess().getTitleSideKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_8__0__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group_8__1"
    // InternalJavaFXLang.g:3910:1: rule__BubbleChartFX__Group_8__1 : rule__BubbleChartFX__Group_8__1__Impl ;
    public final void rule__BubbleChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3914:1: ( rule__BubbleChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:3915:2: rule__BubbleChartFX__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_8__1"


    // $ANTLR start "rule__BubbleChartFX__Group_8__1__Impl"
    // InternalJavaFXLang.g:3921:1: rule__BubbleChartFX__Group_8__1__Impl : ( ( rule__BubbleChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__BubbleChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3925:1: ( ( ( rule__BubbleChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:3926:1: ( ( rule__BubbleChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:3926:1: ( ( rule__BubbleChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:3927:2: ( rule__BubbleChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:3928:2: ( rule__BubbleChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:3928:3: rule__BubbleChartFX__TitleSideAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__TitleSideAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getBubbleChartFXAccess().getTitleSideAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_8__1__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group_9__0"
    // InternalJavaFXLang.g:3937:1: rule__BubbleChartFX__Group_9__0 : rule__BubbleChartFX__Group_9__0__Impl rule__BubbleChartFX__Group_9__1 ;
    public final void rule__BubbleChartFX__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3941:1: ( rule__BubbleChartFX__Group_9__0__Impl rule__BubbleChartFX__Group_9__1 )
            // InternalJavaFXLang.g:3942:2: rule__BubbleChartFX__Group_9__0__Impl rule__BubbleChartFX__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__BubbleChartFX__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_9__0"


    // $ANTLR start "rule__BubbleChartFX__Group_9__0__Impl"
    // InternalJavaFXLang.g:3949:1: rule__BubbleChartFX__Group_9__0__Impl : ( 'xAxisLabel:' ) ;
    public final void rule__BubbleChartFX__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3953:1: ( ( 'xAxisLabel:' ) )
            // InternalJavaFXLang.g:3954:1: ( 'xAxisLabel:' )
            {
            // InternalJavaFXLang.g:3954:1: ( 'xAxisLabel:' )
            // InternalJavaFXLang.g:3955:2: 'xAxisLabel:'
            {
             before(grammarAccess.getBubbleChartFXAccess().getXAxisLabelKeyword_9_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBubbleChartFXAccess().getXAxisLabelKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_9__0__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group_9__1"
    // InternalJavaFXLang.g:3964:1: rule__BubbleChartFX__Group_9__1 : rule__BubbleChartFX__Group_9__1__Impl ;
    public final void rule__BubbleChartFX__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3968:1: ( rule__BubbleChartFX__Group_9__1__Impl )
            // InternalJavaFXLang.g:3969:2: rule__BubbleChartFX__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_9__1"


    // $ANTLR start "rule__BubbleChartFX__Group_9__1__Impl"
    // InternalJavaFXLang.g:3975:1: rule__BubbleChartFX__Group_9__1__Impl : ( ( rule__BubbleChartFX__XAxisLabelAssignment_9_1 ) ) ;
    public final void rule__BubbleChartFX__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3979:1: ( ( ( rule__BubbleChartFX__XAxisLabelAssignment_9_1 ) ) )
            // InternalJavaFXLang.g:3980:1: ( ( rule__BubbleChartFX__XAxisLabelAssignment_9_1 ) )
            {
            // InternalJavaFXLang.g:3980:1: ( ( rule__BubbleChartFX__XAxisLabelAssignment_9_1 ) )
            // InternalJavaFXLang.g:3981:2: ( rule__BubbleChartFX__XAxisLabelAssignment_9_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getXAxisLabelAssignment_9_1()); 
            // InternalJavaFXLang.g:3982:2: ( rule__BubbleChartFX__XAxisLabelAssignment_9_1 )
            // InternalJavaFXLang.g:3982:3: rule__BubbleChartFX__XAxisLabelAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__XAxisLabelAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getBubbleChartFXAccess().getXAxisLabelAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_9__1__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group_10__0"
    // InternalJavaFXLang.g:3991:1: rule__BubbleChartFX__Group_10__0 : rule__BubbleChartFX__Group_10__0__Impl rule__BubbleChartFX__Group_10__1 ;
    public final void rule__BubbleChartFX__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3995:1: ( rule__BubbleChartFX__Group_10__0__Impl rule__BubbleChartFX__Group_10__1 )
            // InternalJavaFXLang.g:3996:2: rule__BubbleChartFX__Group_10__0__Impl rule__BubbleChartFX__Group_10__1
            {
            pushFollow(FOLLOW_23);
            rule__BubbleChartFX__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_10__0"


    // $ANTLR start "rule__BubbleChartFX__Group_10__0__Impl"
    // InternalJavaFXLang.g:4003:1: rule__BubbleChartFX__Group_10__0__Impl : ( 'xAxisType:' ) ;
    public final void rule__BubbleChartFX__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4007:1: ( ( 'xAxisType:' ) )
            // InternalJavaFXLang.g:4008:1: ( 'xAxisType:' )
            {
            // InternalJavaFXLang.g:4008:1: ( 'xAxisType:' )
            // InternalJavaFXLang.g:4009:2: 'xAxisType:'
            {
             before(grammarAccess.getBubbleChartFXAccess().getXAxisTypeKeyword_10_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBubbleChartFXAccess().getXAxisTypeKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_10__0__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group_10__1"
    // InternalJavaFXLang.g:4018:1: rule__BubbleChartFX__Group_10__1 : rule__BubbleChartFX__Group_10__1__Impl ;
    public final void rule__BubbleChartFX__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4022:1: ( rule__BubbleChartFX__Group_10__1__Impl )
            // InternalJavaFXLang.g:4023:2: rule__BubbleChartFX__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_10__1"


    // $ANTLR start "rule__BubbleChartFX__Group_10__1__Impl"
    // InternalJavaFXLang.g:4029:1: rule__BubbleChartFX__Group_10__1__Impl : ( ( rule__BubbleChartFX__XAxisTypeAssignment_10_1 ) ) ;
    public final void rule__BubbleChartFX__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4033:1: ( ( ( rule__BubbleChartFX__XAxisTypeAssignment_10_1 ) ) )
            // InternalJavaFXLang.g:4034:1: ( ( rule__BubbleChartFX__XAxisTypeAssignment_10_1 ) )
            {
            // InternalJavaFXLang.g:4034:1: ( ( rule__BubbleChartFX__XAxisTypeAssignment_10_1 ) )
            // InternalJavaFXLang.g:4035:2: ( rule__BubbleChartFX__XAxisTypeAssignment_10_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getXAxisTypeAssignment_10_1()); 
            // InternalJavaFXLang.g:4036:2: ( rule__BubbleChartFX__XAxisTypeAssignment_10_1 )
            // InternalJavaFXLang.g:4036:3: rule__BubbleChartFX__XAxisTypeAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__XAxisTypeAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getBubbleChartFXAccess().getXAxisTypeAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_10__1__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group_11__0"
    // InternalJavaFXLang.g:4045:1: rule__BubbleChartFX__Group_11__0 : rule__BubbleChartFX__Group_11__0__Impl rule__BubbleChartFX__Group_11__1 ;
    public final void rule__BubbleChartFX__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4049:1: ( rule__BubbleChartFX__Group_11__0__Impl rule__BubbleChartFX__Group_11__1 )
            // InternalJavaFXLang.g:4050:2: rule__BubbleChartFX__Group_11__0__Impl rule__BubbleChartFX__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__BubbleChartFX__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_11__0"


    // $ANTLR start "rule__BubbleChartFX__Group_11__0__Impl"
    // InternalJavaFXLang.g:4057:1: rule__BubbleChartFX__Group_11__0__Impl : ( 'yAxisLabel:' ) ;
    public final void rule__BubbleChartFX__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4061:1: ( ( 'yAxisLabel:' ) )
            // InternalJavaFXLang.g:4062:1: ( 'yAxisLabel:' )
            {
            // InternalJavaFXLang.g:4062:1: ( 'yAxisLabel:' )
            // InternalJavaFXLang.g:4063:2: 'yAxisLabel:'
            {
             before(grammarAccess.getBubbleChartFXAccess().getYAxisLabelKeyword_11_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBubbleChartFXAccess().getYAxisLabelKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_11__0__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group_11__1"
    // InternalJavaFXLang.g:4072:1: rule__BubbleChartFX__Group_11__1 : rule__BubbleChartFX__Group_11__1__Impl ;
    public final void rule__BubbleChartFX__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4076:1: ( rule__BubbleChartFX__Group_11__1__Impl )
            // InternalJavaFXLang.g:4077:2: rule__BubbleChartFX__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_11__1"


    // $ANTLR start "rule__BubbleChartFX__Group_11__1__Impl"
    // InternalJavaFXLang.g:4083:1: rule__BubbleChartFX__Group_11__1__Impl : ( ( rule__BubbleChartFX__YAxisLabelAssignment_11_1 ) ) ;
    public final void rule__BubbleChartFX__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4087:1: ( ( ( rule__BubbleChartFX__YAxisLabelAssignment_11_1 ) ) )
            // InternalJavaFXLang.g:4088:1: ( ( rule__BubbleChartFX__YAxisLabelAssignment_11_1 ) )
            {
            // InternalJavaFXLang.g:4088:1: ( ( rule__BubbleChartFX__YAxisLabelAssignment_11_1 ) )
            // InternalJavaFXLang.g:4089:2: ( rule__BubbleChartFX__YAxisLabelAssignment_11_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getYAxisLabelAssignment_11_1()); 
            // InternalJavaFXLang.g:4090:2: ( rule__BubbleChartFX__YAxisLabelAssignment_11_1 )
            // InternalJavaFXLang.g:4090:3: rule__BubbleChartFX__YAxisLabelAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__YAxisLabelAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getBubbleChartFXAccess().getYAxisLabelAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_11__1__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group_12__0"
    // InternalJavaFXLang.g:4099:1: rule__BubbleChartFX__Group_12__0 : rule__BubbleChartFX__Group_12__0__Impl rule__BubbleChartFX__Group_12__1 ;
    public final void rule__BubbleChartFX__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4103:1: ( rule__BubbleChartFX__Group_12__0__Impl rule__BubbleChartFX__Group_12__1 )
            // InternalJavaFXLang.g:4104:2: rule__BubbleChartFX__Group_12__0__Impl rule__BubbleChartFX__Group_12__1
            {
            pushFollow(FOLLOW_23);
            rule__BubbleChartFX__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_12__0"


    // $ANTLR start "rule__BubbleChartFX__Group_12__0__Impl"
    // InternalJavaFXLang.g:4111:1: rule__BubbleChartFX__Group_12__0__Impl : ( 'yAxisType:' ) ;
    public final void rule__BubbleChartFX__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4115:1: ( ( 'yAxisType:' ) )
            // InternalJavaFXLang.g:4116:1: ( 'yAxisType:' )
            {
            // InternalJavaFXLang.g:4116:1: ( 'yAxisType:' )
            // InternalJavaFXLang.g:4117:2: 'yAxisType:'
            {
             before(grammarAccess.getBubbleChartFXAccess().getYAxisTypeKeyword_12_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getBubbleChartFXAccess().getYAxisTypeKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_12__0__Impl"


    // $ANTLR start "rule__BubbleChartFX__Group_12__1"
    // InternalJavaFXLang.g:4126:1: rule__BubbleChartFX__Group_12__1 : rule__BubbleChartFX__Group_12__1__Impl ;
    public final void rule__BubbleChartFX__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4130:1: ( rule__BubbleChartFX__Group_12__1__Impl )
            // InternalJavaFXLang.g:4131:2: rule__BubbleChartFX__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_12__1"


    // $ANTLR start "rule__BubbleChartFX__Group_12__1__Impl"
    // InternalJavaFXLang.g:4137:1: rule__BubbleChartFX__Group_12__1__Impl : ( ( rule__BubbleChartFX__YAxisTypeAssignment_12_1 ) ) ;
    public final void rule__BubbleChartFX__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4141:1: ( ( ( rule__BubbleChartFX__YAxisTypeAssignment_12_1 ) ) )
            // InternalJavaFXLang.g:4142:1: ( ( rule__BubbleChartFX__YAxisTypeAssignment_12_1 ) )
            {
            // InternalJavaFXLang.g:4142:1: ( ( rule__BubbleChartFX__YAxisTypeAssignment_12_1 ) )
            // InternalJavaFXLang.g:4143:2: ( rule__BubbleChartFX__YAxisTypeAssignment_12_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getYAxisTypeAssignment_12_1()); 
            // InternalJavaFXLang.g:4144:2: ( rule__BubbleChartFX__YAxisTypeAssignment_12_1 )
            // InternalJavaFXLang.g:4144:3: rule__BubbleChartFX__YAxisTypeAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__BubbleChartFX__YAxisTypeAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getBubbleChartFXAccess().getYAxisTypeAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__Group_12__1__Impl"


    // $ANTLR start "rule__AreaChartFX__Group__0"
    // InternalJavaFXLang.g:4153:1: rule__AreaChartFX__Group__0 : rule__AreaChartFX__Group__0__Impl rule__AreaChartFX__Group__1 ;
    public final void rule__AreaChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4157:1: ( rule__AreaChartFX__Group__0__Impl rule__AreaChartFX__Group__1 )
            // InternalJavaFXLang.g:4158:2: rule__AreaChartFX__Group__0__Impl rule__AreaChartFX__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__AreaChartFX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__0"


    // $ANTLR start "rule__AreaChartFX__Group__0__Impl"
    // InternalJavaFXLang.g:4165:1: rule__AreaChartFX__Group__0__Impl : ( () ) ;
    public final void rule__AreaChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4169:1: ( ( () ) )
            // InternalJavaFXLang.g:4170:1: ( () )
            {
            // InternalJavaFXLang.g:4170:1: ( () )
            // InternalJavaFXLang.g:4171:2: ()
            {
             before(grammarAccess.getAreaChartFXAccess().getAreaChartFXAction_0()); 
            // InternalJavaFXLang.g:4172:2: ()
            // InternalJavaFXLang.g:4172:3: 
            {
            }

             after(grammarAccess.getAreaChartFXAccess().getAreaChartFXAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__0__Impl"


    // $ANTLR start "rule__AreaChartFX__Group__1"
    // InternalJavaFXLang.g:4180:1: rule__AreaChartFX__Group__1 : rule__AreaChartFX__Group__1__Impl rule__AreaChartFX__Group__2 ;
    public final void rule__AreaChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4184:1: ( rule__AreaChartFX__Group__1__Impl rule__AreaChartFX__Group__2 )
            // InternalJavaFXLang.g:4185:2: rule__AreaChartFX__Group__1__Impl rule__AreaChartFX__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AreaChartFX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__1"


    // $ANTLR start "rule__AreaChartFX__Group__1__Impl"
    // InternalJavaFXLang.g:4192:1: rule__AreaChartFX__Group__1__Impl : ( 'AreaChart' ) ;
    public final void rule__AreaChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4196:1: ( ( 'AreaChart' ) )
            // InternalJavaFXLang.g:4197:1: ( 'AreaChart' )
            {
            // InternalJavaFXLang.g:4197:1: ( 'AreaChart' )
            // InternalJavaFXLang.g:4198:2: 'AreaChart'
            {
             before(grammarAccess.getAreaChartFXAccess().getAreaChartKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAreaChartFXAccess().getAreaChartKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__1__Impl"


    // $ANTLR start "rule__AreaChartFX__Group__2"
    // InternalJavaFXLang.g:4207:1: rule__AreaChartFX__Group__2 : rule__AreaChartFX__Group__2__Impl rule__AreaChartFX__Group__3 ;
    public final void rule__AreaChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4211:1: ( rule__AreaChartFX__Group__2__Impl rule__AreaChartFX__Group__3 )
            // InternalJavaFXLang.g:4212:2: rule__AreaChartFX__Group__2__Impl rule__AreaChartFX__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__AreaChartFX__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__2"


    // $ANTLR start "rule__AreaChartFX__Group__2__Impl"
    // InternalJavaFXLang.g:4219:1: rule__AreaChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__AreaChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4223:1: ( ( '{' ) )
            // InternalJavaFXLang.g:4224:1: ( '{' )
            {
            // InternalJavaFXLang.g:4224:1: ( '{' )
            // InternalJavaFXLang.g:4225:2: '{'
            {
             before(grammarAccess.getAreaChartFXAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAreaChartFXAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__2__Impl"


    // $ANTLR start "rule__AreaChartFX__Group__3"
    // InternalJavaFXLang.g:4234:1: rule__AreaChartFX__Group__3 : rule__AreaChartFX__Group__3__Impl rule__AreaChartFX__Group__4 ;
    public final void rule__AreaChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4238:1: ( rule__AreaChartFX__Group__3__Impl rule__AreaChartFX__Group__4 )
            // InternalJavaFXLang.g:4239:2: rule__AreaChartFX__Group__3__Impl rule__AreaChartFX__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__AreaChartFX__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__3"


    // $ANTLR start "rule__AreaChartFX__Group__3__Impl"
    // InternalJavaFXLang.g:4246:1: rule__AreaChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__AreaChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4250:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:4251:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:4251:1: ( 'name:' )
            // InternalJavaFXLang.g:4252:2: 'name:'
            {
             before(grammarAccess.getAreaChartFXAccess().getNameKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAreaChartFXAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__3__Impl"


    // $ANTLR start "rule__AreaChartFX__Group__4"
    // InternalJavaFXLang.g:4261:1: rule__AreaChartFX__Group__4 : rule__AreaChartFX__Group__4__Impl rule__AreaChartFX__Group__5 ;
    public final void rule__AreaChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4265:1: ( rule__AreaChartFX__Group__4__Impl rule__AreaChartFX__Group__5 )
            // InternalJavaFXLang.g:4266:2: rule__AreaChartFX__Group__4__Impl rule__AreaChartFX__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__AreaChartFX__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__4"


    // $ANTLR start "rule__AreaChartFX__Group__4__Impl"
    // InternalJavaFXLang.g:4273:1: rule__AreaChartFX__Group__4__Impl : ( ( rule__AreaChartFX__NameAssignment_4 ) ) ;
    public final void rule__AreaChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4277:1: ( ( ( rule__AreaChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:4278:1: ( ( rule__AreaChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:4278:1: ( ( rule__AreaChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:4279:2: ( rule__AreaChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getAreaChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:4280:2: ( rule__AreaChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:4280:3: rule__AreaChartFX__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AreaChartFX__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAreaChartFXAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__4__Impl"


    // $ANTLR start "rule__AreaChartFX__Group__5"
    // InternalJavaFXLang.g:4288:1: rule__AreaChartFX__Group__5 : rule__AreaChartFX__Group__5__Impl rule__AreaChartFX__Group__6 ;
    public final void rule__AreaChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4292:1: ( rule__AreaChartFX__Group__5__Impl rule__AreaChartFX__Group__6 )
            // InternalJavaFXLang.g:4293:2: rule__AreaChartFX__Group__5__Impl rule__AreaChartFX__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__AreaChartFX__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__5"


    // $ANTLR start "rule__AreaChartFX__Group__5__Impl"
    // InternalJavaFXLang.g:4300:1: rule__AreaChartFX__Group__5__Impl : ( ( rule__AreaChartFX__Group_5__0 )? ) ;
    public final void rule__AreaChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4304:1: ( ( ( rule__AreaChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:4305:1: ( ( rule__AreaChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:4305:1: ( ( rule__AreaChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:4306:2: ( rule__AreaChartFX__Group_5__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:4307:2: ( rule__AreaChartFX__Group_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalJavaFXLang.g:4307:3: rule__AreaChartFX__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AreaChartFX__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAreaChartFXAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__5__Impl"


    // $ANTLR start "rule__AreaChartFX__Group__6"
    // InternalJavaFXLang.g:4315:1: rule__AreaChartFX__Group__6 : rule__AreaChartFX__Group__6__Impl rule__AreaChartFX__Group__7 ;
    public final void rule__AreaChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4319:1: ( rule__AreaChartFX__Group__6__Impl rule__AreaChartFX__Group__7 )
            // InternalJavaFXLang.g:4320:2: rule__AreaChartFX__Group__6__Impl rule__AreaChartFX__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__AreaChartFX__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__6"


    // $ANTLR start "rule__AreaChartFX__Group__6__Impl"
    // InternalJavaFXLang.g:4327:1: rule__AreaChartFX__Group__6__Impl : ( ( rule__AreaChartFX__Group_6__0 )? ) ;
    public final void rule__AreaChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4331:1: ( ( ( rule__AreaChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:4332:1: ( ( rule__AreaChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:4332:1: ( ( rule__AreaChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:4333:2: ( rule__AreaChartFX__Group_6__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:4334:2: ( rule__AreaChartFX__Group_6__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalJavaFXLang.g:4334:3: rule__AreaChartFX__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AreaChartFX__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAreaChartFXAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__6__Impl"


    // $ANTLR start "rule__AreaChartFX__Group__7"
    // InternalJavaFXLang.g:4342:1: rule__AreaChartFX__Group__7 : rule__AreaChartFX__Group__7__Impl rule__AreaChartFX__Group__8 ;
    public final void rule__AreaChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4346:1: ( rule__AreaChartFX__Group__7__Impl rule__AreaChartFX__Group__8 )
            // InternalJavaFXLang.g:4347:2: rule__AreaChartFX__Group__7__Impl rule__AreaChartFX__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__AreaChartFX__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__7"


    // $ANTLR start "rule__AreaChartFX__Group__7__Impl"
    // InternalJavaFXLang.g:4354:1: rule__AreaChartFX__Group__7__Impl : ( ( rule__AreaChartFX__Group_7__0 )? ) ;
    public final void rule__AreaChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4358:1: ( ( ( rule__AreaChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:4359:1: ( ( rule__AreaChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:4359:1: ( ( rule__AreaChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:4360:2: ( rule__AreaChartFX__Group_7__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:4361:2: ( rule__AreaChartFX__Group_7__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==38) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalJavaFXLang.g:4361:3: rule__AreaChartFX__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AreaChartFX__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAreaChartFXAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__7__Impl"


    // $ANTLR start "rule__AreaChartFX__Group__8"
    // InternalJavaFXLang.g:4369:1: rule__AreaChartFX__Group__8 : rule__AreaChartFX__Group__8__Impl rule__AreaChartFX__Group__9 ;
    public final void rule__AreaChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4373:1: ( rule__AreaChartFX__Group__8__Impl rule__AreaChartFX__Group__9 )
            // InternalJavaFXLang.g:4374:2: rule__AreaChartFX__Group__8__Impl rule__AreaChartFX__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__AreaChartFX__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__8"


    // $ANTLR start "rule__AreaChartFX__Group__8__Impl"
    // InternalJavaFXLang.g:4381:1: rule__AreaChartFX__Group__8__Impl : ( ( rule__AreaChartFX__Group_8__0 )? ) ;
    public final void rule__AreaChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4385:1: ( ( ( rule__AreaChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:4386:1: ( ( rule__AreaChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:4386:1: ( ( rule__AreaChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:4387:2: ( rule__AreaChartFX__Group_8__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:4388:2: ( rule__AreaChartFX__Group_8__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==39) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalJavaFXLang.g:4388:3: rule__AreaChartFX__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AreaChartFX__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAreaChartFXAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__8__Impl"


    // $ANTLR start "rule__AreaChartFX__Group__9"
    // InternalJavaFXLang.g:4396:1: rule__AreaChartFX__Group__9 : rule__AreaChartFX__Group__9__Impl rule__AreaChartFX__Group__10 ;
    public final void rule__AreaChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4400:1: ( rule__AreaChartFX__Group__9__Impl rule__AreaChartFX__Group__10 )
            // InternalJavaFXLang.g:4401:2: rule__AreaChartFX__Group__9__Impl rule__AreaChartFX__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__AreaChartFX__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__9"


    // $ANTLR start "rule__AreaChartFX__Group__9__Impl"
    // InternalJavaFXLang.g:4408:1: rule__AreaChartFX__Group__9__Impl : ( ( rule__AreaChartFX__Group_9__0 )? ) ;
    public final void rule__AreaChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4412:1: ( ( ( rule__AreaChartFX__Group_9__0 )? ) )
            // InternalJavaFXLang.g:4413:1: ( ( rule__AreaChartFX__Group_9__0 )? )
            {
            // InternalJavaFXLang.g:4413:1: ( ( rule__AreaChartFX__Group_9__0 )? )
            // InternalJavaFXLang.g:4414:2: ( rule__AreaChartFX__Group_9__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_9()); 
            // InternalJavaFXLang.g:4415:2: ( rule__AreaChartFX__Group_9__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==40) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalJavaFXLang.g:4415:3: rule__AreaChartFX__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AreaChartFX__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAreaChartFXAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__9__Impl"


    // $ANTLR start "rule__AreaChartFX__Group__10"
    // InternalJavaFXLang.g:4423:1: rule__AreaChartFX__Group__10 : rule__AreaChartFX__Group__10__Impl rule__AreaChartFX__Group__11 ;
    public final void rule__AreaChartFX__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4427:1: ( rule__AreaChartFX__Group__10__Impl rule__AreaChartFX__Group__11 )
            // InternalJavaFXLang.g:4428:2: rule__AreaChartFX__Group__10__Impl rule__AreaChartFX__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__AreaChartFX__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__10"


    // $ANTLR start "rule__AreaChartFX__Group__10__Impl"
    // InternalJavaFXLang.g:4435:1: rule__AreaChartFX__Group__10__Impl : ( ( rule__AreaChartFX__Group_10__0 )? ) ;
    public final void rule__AreaChartFX__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4439:1: ( ( ( rule__AreaChartFX__Group_10__0 )? ) )
            // InternalJavaFXLang.g:4440:1: ( ( rule__AreaChartFX__Group_10__0 )? )
            {
            // InternalJavaFXLang.g:4440:1: ( ( rule__AreaChartFX__Group_10__0 )? )
            // InternalJavaFXLang.g:4441:2: ( rule__AreaChartFX__Group_10__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_10()); 
            // InternalJavaFXLang.g:4442:2: ( rule__AreaChartFX__Group_10__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==41) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalJavaFXLang.g:4442:3: rule__AreaChartFX__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AreaChartFX__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAreaChartFXAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__10__Impl"


    // $ANTLR start "rule__AreaChartFX__Group__11"
    // InternalJavaFXLang.g:4450:1: rule__AreaChartFX__Group__11 : rule__AreaChartFX__Group__11__Impl rule__AreaChartFX__Group__12 ;
    public final void rule__AreaChartFX__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4454:1: ( rule__AreaChartFX__Group__11__Impl rule__AreaChartFX__Group__12 )
            // InternalJavaFXLang.g:4455:2: rule__AreaChartFX__Group__11__Impl rule__AreaChartFX__Group__12
            {
            pushFollow(FOLLOW_20);
            rule__AreaChartFX__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__11"


    // $ANTLR start "rule__AreaChartFX__Group__11__Impl"
    // InternalJavaFXLang.g:4462:1: rule__AreaChartFX__Group__11__Impl : ( ( rule__AreaChartFX__Group_11__0 )? ) ;
    public final void rule__AreaChartFX__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4466:1: ( ( ( rule__AreaChartFX__Group_11__0 )? ) )
            // InternalJavaFXLang.g:4467:1: ( ( rule__AreaChartFX__Group_11__0 )? )
            {
            // InternalJavaFXLang.g:4467:1: ( ( rule__AreaChartFX__Group_11__0 )? )
            // InternalJavaFXLang.g:4468:2: ( rule__AreaChartFX__Group_11__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_11()); 
            // InternalJavaFXLang.g:4469:2: ( rule__AreaChartFX__Group_11__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==42) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalJavaFXLang.g:4469:3: rule__AreaChartFX__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AreaChartFX__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAreaChartFXAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__11__Impl"


    // $ANTLR start "rule__AreaChartFX__Group__12"
    // InternalJavaFXLang.g:4477:1: rule__AreaChartFX__Group__12 : rule__AreaChartFX__Group__12__Impl rule__AreaChartFX__Group__13 ;
    public final void rule__AreaChartFX__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4481:1: ( rule__AreaChartFX__Group__12__Impl rule__AreaChartFX__Group__13 )
            // InternalJavaFXLang.g:4482:2: rule__AreaChartFX__Group__12__Impl rule__AreaChartFX__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__AreaChartFX__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__12"


    // $ANTLR start "rule__AreaChartFX__Group__12__Impl"
    // InternalJavaFXLang.g:4489:1: rule__AreaChartFX__Group__12__Impl : ( ( rule__AreaChartFX__Group_12__0 )? ) ;
    public final void rule__AreaChartFX__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4493:1: ( ( ( rule__AreaChartFX__Group_12__0 )? ) )
            // InternalJavaFXLang.g:4494:1: ( ( rule__AreaChartFX__Group_12__0 )? )
            {
            // InternalJavaFXLang.g:4494:1: ( ( rule__AreaChartFX__Group_12__0 )? )
            // InternalJavaFXLang.g:4495:2: ( rule__AreaChartFX__Group_12__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_12()); 
            // InternalJavaFXLang.g:4496:2: ( rule__AreaChartFX__Group_12__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==43) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalJavaFXLang.g:4496:3: rule__AreaChartFX__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AreaChartFX__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAreaChartFXAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__12__Impl"


    // $ANTLR start "rule__AreaChartFX__Group__13"
    // InternalJavaFXLang.g:4504:1: rule__AreaChartFX__Group__13 : rule__AreaChartFX__Group__13__Impl ;
    public final void rule__AreaChartFX__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4508:1: ( rule__AreaChartFX__Group__13__Impl )
            // InternalJavaFXLang.g:4509:2: rule__AreaChartFX__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__13"


    // $ANTLR start "rule__AreaChartFX__Group__13__Impl"
    // InternalJavaFXLang.g:4515:1: rule__AreaChartFX__Group__13__Impl : ( '}' ) ;
    public final void rule__AreaChartFX__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4519:1: ( ( '}' ) )
            // InternalJavaFXLang.g:4520:1: ( '}' )
            {
            // InternalJavaFXLang.g:4520:1: ( '}' )
            // InternalJavaFXLang.g:4521:2: '}'
            {
             before(grammarAccess.getAreaChartFXAccess().getRightCurlyBracketKeyword_13()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAreaChartFXAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group__13__Impl"


    // $ANTLR start "rule__AreaChartFX__Group_5__0"
    // InternalJavaFXLang.g:4531:1: rule__AreaChartFX__Group_5__0 : rule__AreaChartFX__Group_5__0__Impl rule__AreaChartFX__Group_5__1 ;
    public final void rule__AreaChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4535:1: ( rule__AreaChartFX__Group_5__0__Impl rule__AreaChartFX__Group_5__1 )
            // InternalJavaFXLang.g:4536:2: rule__AreaChartFX__Group_5__0__Impl rule__AreaChartFX__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__AreaChartFX__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_5__0"


    // $ANTLR start "rule__AreaChartFX__Group_5__0__Impl"
    // InternalJavaFXLang.g:4543:1: rule__AreaChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__AreaChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4547:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:4548:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:4548:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:4549:2: 'legendSide:'
            {
             before(grammarAccess.getAreaChartFXAccess().getLegendSideKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAreaChartFXAccess().getLegendSideKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_5__0__Impl"


    // $ANTLR start "rule__AreaChartFX__Group_5__1"
    // InternalJavaFXLang.g:4558:1: rule__AreaChartFX__Group_5__1 : rule__AreaChartFX__Group_5__1__Impl ;
    public final void rule__AreaChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4562:1: ( rule__AreaChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:4563:2: rule__AreaChartFX__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_5__1"


    // $ANTLR start "rule__AreaChartFX__Group_5__1__Impl"
    // InternalJavaFXLang.g:4569:1: rule__AreaChartFX__Group_5__1__Impl : ( ( rule__AreaChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__AreaChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4573:1: ( ( ( rule__AreaChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:4574:1: ( ( rule__AreaChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:4574:1: ( ( rule__AreaChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:4575:2: ( rule__AreaChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:4576:2: ( rule__AreaChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:4576:3: rule__AreaChartFX__LegendSideAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AreaChartFX__LegendSideAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAreaChartFXAccess().getLegendSideAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_5__1__Impl"


    // $ANTLR start "rule__AreaChartFX__Group_6__0"
    // InternalJavaFXLang.g:4585:1: rule__AreaChartFX__Group_6__0 : rule__AreaChartFX__Group_6__0__Impl rule__AreaChartFX__Group_6__1 ;
    public final void rule__AreaChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4589:1: ( rule__AreaChartFX__Group_6__0__Impl rule__AreaChartFX__Group_6__1 )
            // InternalJavaFXLang.g:4590:2: rule__AreaChartFX__Group_6__0__Impl rule__AreaChartFX__Group_6__1
            {
            pushFollow(FOLLOW_22);
            rule__AreaChartFX__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_6__0"


    // $ANTLR start "rule__AreaChartFX__Group_6__0__Impl"
    // InternalJavaFXLang.g:4597:1: rule__AreaChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__AreaChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4601:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:4602:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:4602:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:4603:2: 'showLegend:'
            {
             before(grammarAccess.getAreaChartFXAccess().getShowLegendKeyword_6_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAreaChartFXAccess().getShowLegendKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_6__0__Impl"


    // $ANTLR start "rule__AreaChartFX__Group_6__1"
    // InternalJavaFXLang.g:4612:1: rule__AreaChartFX__Group_6__1 : rule__AreaChartFX__Group_6__1__Impl ;
    public final void rule__AreaChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4616:1: ( rule__AreaChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:4617:2: rule__AreaChartFX__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_6__1"


    // $ANTLR start "rule__AreaChartFX__Group_6__1__Impl"
    // InternalJavaFXLang.g:4623:1: rule__AreaChartFX__Group_6__1__Impl : ( ( rule__AreaChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__AreaChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4627:1: ( ( ( rule__AreaChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:4628:1: ( ( rule__AreaChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:4628:1: ( ( rule__AreaChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:4629:2: ( rule__AreaChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:4630:2: ( rule__AreaChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:4630:3: rule__AreaChartFX__ShowLegendAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__AreaChartFX__ShowLegendAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAreaChartFXAccess().getShowLegendAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_6__1__Impl"


    // $ANTLR start "rule__AreaChartFX__Group_7__0"
    // InternalJavaFXLang.g:4639:1: rule__AreaChartFX__Group_7__0 : rule__AreaChartFX__Group_7__0__Impl rule__AreaChartFX__Group_7__1 ;
    public final void rule__AreaChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4643:1: ( rule__AreaChartFX__Group_7__0__Impl rule__AreaChartFX__Group_7__1 )
            // InternalJavaFXLang.g:4644:2: rule__AreaChartFX__Group_7__0__Impl rule__AreaChartFX__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__AreaChartFX__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_7__0"


    // $ANTLR start "rule__AreaChartFX__Group_7__0__Impl"
    // InternalJavaFXLang.g:4651:1: rule__AreaChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__AreaChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4655:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:4656:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:4656:1: ( 'title:' )
            // InternalJavaFXLang.g:4657:2: 'title:'
            {
             before(grammarAccess.getAreaChartFXAccess().getTitleKeyword_7_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAreaChartFXAccess().getTitleKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_7__0__Impl"


    // $ANTLR start "rule__AreaChartFX__Group_7__1"
    // InternalJavaFXLang.g:4666:1: rule__AreaChartFX__Group_7__1 : rule__AreaChartFX__Group_7__1__Impl ;
    public final void rule__AreaChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4670:1: ( rule__AreaChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:4671:2: rule__AreaChartFX__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_7__1"


    // $ANTLR start "rule__AreaChartFX__Group_7__1__Impl"
    // InternalJavaFXLang.g:4677:1: rule__AreaChartFX__Group_7__1__Impl : ( ( rule__AreaChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__AreaChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4681:1: ( ( ( rule__AreaChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:4682:1: ( ( rule__AreaChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:4682:1: ( ( rule__AreaChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:4683:2: ( rule__AreaChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:4684:2: ( rule__AreaChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:4684:3: rule__AreaChartFX__TitleAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__AreaChartFX__TitleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAreaChartFXAccess().getTitleAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_7__1__Impl"


    // $ANTLR start "rule__AreaChartFX__Group_8__0"
    // InternalJavaFXLang.g:4693:1: rule__AreaChartFX__Group_8__0 : rule__AreaChartFX__Group_8__0__Impl rule__AreaChartFX__Group_8__1 ;
    public final void rule__AreaChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4697:1: ( rule__AreaChartFX__Group_8__0__Impl rule__AreaChartFX__Group_8__1 )
            // InternalJavaFXLang.g:4698:2: rule__AreaChartFX__Group_8__0__Impl rule__AreaChartFX__Group_8__1
            {
            pushFollow(FOLLOW_21);
            rule__AreaChartFX__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_8__0"


    // $ANTLR start "rule__AreaChartFX__Group_8__0__Impl"
    // InternalJavaFXLang.g:4705:1: rule__AreaChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__AreaChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4709:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:4710:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:4710:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:4711:2: 'titleSide:'
            {
             before(grammarAccess.getAreaChartFXAccess().getTitleSideKeyword_8_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAreaChartFXAccess().getTitleSideKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_8__0__Impl"


    // $ANTLR start "rule__AreaChartFX__Group_8__1"
    // InternalJavaFXLang.g:4720:1: rule__AreaChartFX__Group_8__1 : rule__AreaChartFX__Group_8__1__Impl ;
    public final void rule__AreaChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4724:1: ( rule__AreaChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:4725:2: rule__AreaChartFX__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_8__1"


    // $ANTLR start "rule__AreaChartFX__Group_8__1__Impl"
    // InternalJavaFXLang.g:4731:1: rule__AreaChartFX__Group_8__1__Impl : ( ( rule__AreaChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__AreaChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4735:1: ( ( ( rule__AreaChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:4736:1: ( ( rule__AreaChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:4736:1: ( ( rule__AreaChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:4737:2: ( rule__AreaChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:4738:2: ( rule__AreaChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:4738:3: rule__AreaChartFX__TitleSideAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__AreaChartFX__TitleSideAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getAreaChartFXAccess().getTitleSideAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_8__1__Impl"


    // $ANTLR start "rule__AreaChartFX__Group_9__0"
    // InternalJavaFXLang.g:4747:1: rule__AreaChartFX__Group_9__0 : rule__AreaChartFX__Group_9__0__Impl rule__AreaChartFX__Group_9__1 ;
    public final void rule__AreaChartFX__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4751:1: ( rule__AreaChartFX__Group_9__0__Impl rule__AreaChartFX__Group_9__1 )
            // InternalJavaFXLang.g:4752:2: rule__AreaChartFX__Group_9__0__Impl rule__AreaChartFX__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__AreaChartFX__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_9__0"


    // $ANTLR start "rule__AreaChartFX__Group_9__0__Impl"
    // InternalJavaFXLang.g:4759:1: rule__AreaChartFX__Group_9__0__Impl : ( 'xAxisLabel:' ) ;
    public final void rule__AreaChartFX__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4763:1: ( ( 'xAxisLabel:' ) )
            // InternalJavaFXLang.g:4764:1: ( 'xAxisLabel:' )
            {
            // InternalJavaFXLang.g:4764:1: ( 'xAxisLabel:' )
            // InternalJavaFXLang.g:4765:2: 'xAxisLabel:'
            {
             before(grammarAccess.getAreaChartFXAccess().getXAxisLabelKeyword_9_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAreaChartFXAccess().getXAxisLabelKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_9__0__Impl"


    // $ANTLR start "rule__AreaChartFX__Group_9__1"
    // InternalJavaFXLang.g:4774:1: rule__AreaChartFX__Group_9__1 : rule__AreaChartFX__Group_9__1__Impl ;
    public final void rule__AreaChartFX__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4778:1: ( rule__AreaChartFX__Group_9__1__Impl )
            // InternalJavaFXLang.g:4779:2: rule__AreaChartFX__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_9__1"


    // $ANTLR start "rule__AreaChartFX__Group_9__1__Impl"
    // InternalJavaFXLang.g:4785:1: rule__AreaChartFX__Group_9__1__Impl : ( ( rule__AreaChartFX__XAxisLabelAssignment_9_1 ) ) ;
    public final void rule__AreaChartFX__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4789:1: ( ( ( rule__AreaChartFX__XAxisLabelAssignment_9_1 ) ) )
            // InternalJavaFXLang.g:4790:1: ( ( rule__AreaChartFX__XAxisLabelAssignment_9_1 ) )
            {
            // InternalJavaFXLang.g:4790:1: ( ( rule__AreaChartFX__XAxisLabelAssignment_9_1 ) )
            // InternalJavaFXLang.g:4791:2: ( rule__AreaChartFX__XAxisLabelAssignment_9_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getXAxisLabelAssignment_9_1()); 
            // InternalJavaFXLang.g:4792:2: ( rule__AreaChartFX__XAxisLabelAssignment_9_1 )
            // InternalJavaFXLang.g:4792:3: rule__AreaChartFX__XAxisLabelAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__AreaChartFX__XAxisLabelAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getAreaChartFXAccess().getXAxisLabelAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_9__1__Impl"


    // $ANTLR start "rule__AreaChartFX__Group_10__0"
    // InternalJavaFXLang.g:4801:1: rule__AreaChartFX__Group_10__0 : rule__AreaChartFX__Group_10__0__Impl rule__AreaChartFX__Group_10__1 ;
    public final void rule__AreaChartFX__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4805:1: ( rule__AreaChartFX__Group_10__0__Impl rule__AreaChartFX__Group_10__1 )
            // InternalJavaFXLang.g:4806:2: rule__AreaChartFX__Group_10__0__Impl rule__AreaChartFX__Group_10__1
            {
            pushFollow(FOLLOW_23);
            rule__AreaChartFX__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_10__0"


    // $ANTLR start "rule__AreaChartFX__Group_10__0__Impl"
    // InternalJavaFXLang.g:4813:1: rule__AreaChartFX__Group_10__0__Impl : ( 'xAxisType:' ) ;
    public final void rule__AreaChartFX__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4817:1: ( ( 'xAxisType:' ) )
            // InternalJavaFXLang.g:4818:1: ( 'xAxisType:' )
            {
            // InternalJavaFXLang.g:4818:1: ( 'xAxisType:' )
            // InternalJavaFXLang.g:4819:2: 'xAxisType:'
            {
             before(grammarAccess.getAreaChartFXAccess().getXAxisTypeKeyword_10_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAreaChartFXAccess().getXAxisTypeKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_10__0__Impl"


    // $ANTLR start "rule__AreaChartFX__Group_10__1"
    // InternalJavaFXLang.g:4828:1: rule__AreaChartFX__Group_10__1 : rule__AreaChartFX__Group_10__1__Impl ;
    public final void rule__AreaChartFX__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4832:1: ( rule__AreaChartFX__Group_10__1__Impl )
            // InternalJavaFXLang.g:4833:2: rule__AreaChartFX__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_10__1"


    // $ANTLR start "rule__AreaChartFX__Group_10__1__Impl"
    // InternalJavaFXLang.g:4839:1: rule__AreaChartFX__Group_10__1__Impl : ( ( rule__AreaChartFX__XAxisTypeAssignment_10_1 ) ) ;
    public final void rule__AreaChartFX__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4843:1: ( ( ( rule__AreaChartFX__XAxisTypeAssignment_10_1 ) ) )
            // InternalJavaFXLang.g:4844:1: ( ( rule__AreaChartFX__XAxisTypeAssignment_10_1 ) )
            {
            // InternalJavaFXLang.g:4844:1: ( ( rule__AreaChartFX__XAxisTypeAssignment_10_1 ) )
            // InternalJavaFXLang.g:4845:2: ( rule__AreaChartFX__XAxisTypeAssignment_10_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getXAxisTypeAssignment_10_1()); 
            // InternalJavaFXLang.g:4846:2: ( rule__AreaChartFX__XAxisTypeAssignment_10_1 )
            // InternalJavaFXLang.g:4846:3: rule__AreaChartFX__XAxisTypeAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__AreaChartFX__XAxisTypeAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getAreaChartFXAccess().getXAxisTypeAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_10__1__Impl"


    // $ANTLR start "rule__AreaChartFX__Group_11__0"
    // InternalJavaFXLang.g:4855:1: rule__AreaChartFX__Group_11__0 : rule__AreaChartFX__Group_11__0__Impl rule__AreaChartFX__Group_11__1 ;
    public final void rule__AreaChartFX__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4859:1: ( rule__AreaChartFX__Group_11__0__Impl rule__AreaChartFX__Group_11__1 )
            // InternalJavaFXLang.g:4860:2: rule__AreaChartFX__Group_11__0__Impl rule__AreaChartFX__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__AreaChartFX__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_11__0"


    // $ANTLR start "rule__AreaChartFX__Group_11__0__Impl"
    // InternalJavaFXLang.g:4867:1: rule__AreaChartFX__Group_11__0__Impl : ( 'yAxisLabel:' ) ;
    public final void rule__AreaChartFX__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4871:1: ( ( 'yAxisLabel:' ) )
            // InternalJavaFXLang.g:4872:1: ( 'yAxisLabel:' )
            {
            // InternalJavaFXLang.g:4872:1: ( 'yAxisLabel:' )
            // InternalJavaFXLang.g:4873:2: 'yAxisLabel:'
            {
             before(grammarAccess.getAreaChartFXAccess().getYAxisLabelKeyword_11_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAreaChartFXAccess().getYAxisLabelKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_11__0__Impl"


    // $ANTLR start "rule__AreaChartFX__Group_11__1"
    // InternalJavaFXLang.g:4882:1: rule__AreaChartFX__Group_11__1 : rule__AreaChartFX__Group_11__1__Impl ;
    public final void rule__AreaChartFX__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4886:1: ( rule__AreaChartFX__Group_11__1__Impl )
            // InternalJavaFXLang.g:4887:2: rule__AreaChartFX__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_11__1"


    // $ANTLR start "rule__AreaChartFX__Group_11__1__Impl"
    // InternalJavaFXLang.g:4893:1: rule__AreaChartFX__Group_11__1__Impl : ( ( rule__AreaChartFX__YAxisLabelAssignment_11_1 ) ) ;
    public final void rule__AreaChartFX__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4897:1: ( ( ( rule__AreaChartFX__YAxisLabelAssignment_11_1 ) ) )
            // InternalJavaFXLang.g:4898:1: ( ( rule__AreaChartFX__YAxisLabelAssignment_11_1 ) )
            {
            // InternalJavaFXLang.g:4898:1: ( ( rule__AreaChartFX__YAxisLabelAssignment_11_1 ) )
            // InternalJavaFXLang.g:4899:2: ( rule__AreaChartFX__YAxisLabelAssignment_11_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getYAxisLabelAssignment_11_1()); 
            // InternalJavaFXLang.g:4900:2: ( rule__AreaChartFX__YAxisLabelAssignment_11_1 )
            // InternalJavaFXLang.g:4900:3: rule__AreaChartFX__YAxisLabelAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__AreaChartFX__YAxisLabelAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getAreaChartFXAccess().getYAxisLabelAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_11__1__Impl"


    // $ANTLR start "rule__AreaChartFX__Group_12__0"
    // InternalJavaFXLang.g:4909:1: rule__AreaChartFX__Group_12__0 : rule__AreaChartFX__Group_12__0__Impl rule__AreaChartFX__Group_12__1 ;
    public final void rule__AreaChartFX__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4913:1: ( rule__AreaChartFX__Group_12__0__Impl rule__AreaChartFX__Group_12__1 )
            // InternalJavaFXLang.g:4914:2: rule__AreaChartFX__Group_12__0__Impl rule__AreaChartFX__Group_12__1
            {
            pushFollow(FOLLOW_23);
            rule__AreaChartFX__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_12__0"


    // $ANTLR start "rule__AreaChartFX__Group_12__0__Impl"
    // InternalJavaFXLang.g:4921:1: rule__AreaChartFX__Group_12__0__Impl : ( 'yAxisType:' ) ;
    public final void rule__AreaChartFX__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4925:1: ( ( 'yAxisType:' ) )
            // InternalJavaFXLang.g:4926:1: ( 'yAxisType:' )
            {
            // InternalJavaFXLang.g:4926:1: ( 'yAxisType:' )
            // InternalJavaFXLang.g:4927:2: 'yAxisType:'
            {
             before(grammarAccess.getAreaChartFXAccess().getYAxisTypeKeyword_12_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAreaChartFXAccess().getYAxisTypeKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_12__0__Impl"


    // $ANTLR start "rule__AreaChartFX__Group_12__1"
    // InternalJavaFXLang.g:4936:1: rule__AreaChartFX__Group_12__1 : rule__AreaChartFX__Group_12__1__Impl ;
    public final void rule__AreaChartFX__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4940:1: ( rule__AreaChartFX__Group_12__1__Impl )
            // InternalJavaFXLang.g:4941:2: rule__AreaChartFX__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AreaChartFX__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_12__1"


    // $ANTLR start "rule__AreaChartFX__Group_12__1__Impl"
    // InternalJavaFXLang.g:4947:1: rule__AreaChartFX__Group_12__1__Impl : ( ( rule__AreaChartFX__YAxisTypeAssignment_12_1 ) ) ;
    public final void rule__AreaChartFX__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4951:1: ( ( ( rule__AreaChartFX__YAxisTypeAssignment_12_1 ) ) )
            // InternalJavaFXLang.g:4952:1: ( ( rule__AreaChartFX__YAxisTypeAssignment_12_1 ) )
            {
            // InternalJavaFXLang.g:4952:1: ( ( rule__AreaChartFX__YAxisTypeAssignment_12_1 ) )
            // InternalJavaFXLang.g:4953:2: ( rule__AreaChartFX__YAxisTypeAssignment_12_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getYAxisTypeAssignment_12_1()); 
            // InternalJavaFXLang.g:4954:2: ( rule__AreaChartFX__YAxisTypeAssignment_12_1 )
            // InternalJavaFXLang.g:4954:3: rule__AreaChartFX__YAxisTypeAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__AreaChartFX__YAxisTypeAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getAreaChartFXAccess().getYAxisTypeAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__Group_12__1__Impl"


    // $ANTLR start "rule__PieChartFX__Group__0"
    // InternalJavaFXLang.g:4963:1: rule__PieChartFX__Group__0 : rule__PieChartFX__Group__0__Impl rule__PieChartFX__Group__1 ;
    public final void rule__PieChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4967:1: ( rule__PieChartFX__Group__0__Impl rule__PieChartFX__Group__1 )
            // InternalJavaFXLang.g:4968:2: rule__PieChartFX__Group__0__Impl rule__PieChartFX__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__PieChartFX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__0"


    // $ANTLR start "rule__PieChartFX__Group__0__Impl"
    // InternalJavaFXLang.g:4975:1: rule__PieChartFX__Group__0__Impl : ( () ) ;
    public final void rule__PieChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4979:1: ( ( () ) )
            // InternalJavaFXLang.g:4980:1: ( () )
            {
            // InternalJavaFXLang.g:4980:1: ( () )
            // InternalJavaFXLang.g:4981:2: ()
            {
             before(grammarAccess.getPieChartFXAccess().getPieChartFXAction_0()); 
            // InternalJavaFXLang.g:4982:2: ()
            // InternalJavaFXLang.g:4982:3: 
            {
            }

             after(grammarAccess.getPieChartFXAccess().getPieChartFXAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__0__Impl"


    // $ANTLR start "rule__PieChartFX__Group__1"
    // InternalJavaFXLang.g:4990:1: rule__PieChartFX__Group__1 : rule__PieChartFX__Group__1__Impl rule__PieChartFX__Group__2 ;
    public final void rule__PieChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4994:1: ( rule__PieChartFX__Group__1__Impl rule__PieChartFX__Group__2 )
            // InternalJavaFXLang.g:4995:2: rule__PieChartFX__Group__1__Impl rule__PieChartFX__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PieChartFX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__1"


    // $ANTLR start "rule__PieChartFX__Group__1__Impl"
    // InternalJavaFXLang.g:5002:1: rule__PieChartFX__Group__1__Impl : ( 'PieChart' ) ;
    public final void rule__PieChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5006:1: ( ( 'PieChart' ) )
            // InternalJavaFXLang.g:5007:1: ( 'PieChart' )
            {
            // InternalJavaFXLang.g:5007:1: ( 'PieChart' )
            // InternalJavaFXLang.g:5008:2: 'PieChart'
            {
             before(grammarAccess.getPieChartFXAccess().getPieChartKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPieChartFXAccess().getPieChartKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__1__Impl"


    // $ANTLR start "rule__PieChartFX__Group__2"
    // InternalJavaFXLang.g:5017:1: rule__PieChartFX__Group__2 : rule__PieChartFX__Group__2__Impl rule__PieChartFX__Group__3 ;
    public final void rule__PieChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5021:1: ( rule__PieChartFX__Group__2__Impl rule__PieChartFX__Group__3 )
            // InternalJavaFXLang.g:5022:2: rule__PieChartFX__Group__2__Impl rule__PieChartFX__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__PieChartFX__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__2"


    // $ANTLR start "rule__PieChartFX__Group__2__Impl"
    // InternalJavaFXLang.g:5029:1: rule__PieChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__PieChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5033:1: ( ( '{' ) )
            // InternalJavaFXLang.g:5034:1: ( '{' )
            {
            // InternalJavaFXLang.g:5034:1: ( '{' )
            // InternalJavaFXLang.g:5035:2: '{'
            {
             before(grammarAccess.getPieChartFXAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPieChartFXAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__2__Impl"


    // $ANTLR start "rule__PieChartFX__Group__3"
    // InternalJavaFXLang.g:5044:1: rule__PieChartFX__Group__3 : rule__PieChartFX__Group__3__Impl rule__PieChartFX__Group__4 ;
    public final void rule__PieChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5048:1: ( rule__PieChartFX__Group__3__Impl rule__PieChartFX__Group__4 )
            // InternalJavaFXLang.g:5049:2: rule__PieChartFX__Group__3__Impl rule__PieChartFX__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__PieChartFX__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__3"


    // $ANTLR start "rule__PieChartFX__Group__3__Impl"
    // InternalJavaFXLang.g:5056:1: rule__PieChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__PieChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5060:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:5061:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:5061:1: ( 'name:' )
            // InternalJavaFXLang.g:5062:2: 'name:'
            {
             before(grammarAccess.getPieChartFXAccess().getNameKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPieChartFXAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__3__Impl"


    // $ANTLR start "rule__PieChartFX__Group__4"
    // InternalJavaFXLang.g:5071:1: rule__PieChartFX__Group__4 : rule__PieChartFX__Group__4__Impl rule__PieChartFX__Group__5 ;
    public final void rule__PieChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5075:1: ( rule__PieChartFX__Group__4__Impl rule__PieChartFX__Group__5 )
            // InternalJavaFXLang.g:5076:2: rule__PieChartFX__Group__4__Impl rule__PieChartFX__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__PieChartFX__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__4"


    // $ANTLR start "rule__PieChartFX__Group__4__Impl"
    // InternalJavaFXLang.g:5083:1: rule__PieChartFX__Group__4__Impl : ( ( rule__PieChartFX__NameAssignment_4 ) ) ;
    public final void rule__PieChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5087:1: ( ( ( rule__PieChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:5088:1: ( ( rule__PieChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:5088:1: ( ( rule__PieChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:5089:2: ( rule__PieChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getPieChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:5090:2: ( rule__PieChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:5090:3: rule__PieChartFX__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPieChartFXAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__4__Impl"


    // $ANTLR start "rule__PieChartFX__Group__5"
    // InternalJavaFXLang.g:5098:1: rule__PieChartFX__Group__5 : rule__PieChartFX__Group__5__Impl rule__PieChartFX__Group__6 ;
    public final void rule__PieChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5102:1: ( rule__PieChartFX__Group__5__Impl rule__PieChartFX__Group__6 )
            // InternalJavaFXLang.g:5103:2: rule__PieChartFX__Group__5__Impl rule__PieChartFX__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__PieChartFX__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__5"


    // $ANTLR start "rule__PieChartFX__Group__5__Impl"
    // InternalJavaFXLang.g:5110:1: rule__PieChartFX__Group__5__Impl : ( ( rule__PieChartFX__Group_5__0 )? ) ;
    public final void rule__PieChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5114:1: ( ( ( rule__PieChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:5115:1: ( ( rule__PieChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:5115:1: ( ( rule__PieChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:5116:2: ( rule__PieChartFX__Group_5__0 )?
            {
             before(grammarAccess.getPieChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:5117:2: ( rule__PieChartFX__Group_5__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==36) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalJavaFXLang.g:5117:3: rule__PieChartFX__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PieChartFX__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPieChartFXAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__5__Impl"


    // $ANTLR start "rule__PieChartFX__Group__6"
    // InternalJavaFXLang.g:5125:1: rule__PieChartFX__Group__6 : rule__PieChartFX__Group__6__Impl rule__PieChartFX__Group__7 ;
    public final void rule__PieChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5129:1: ( rule__PieChartFX__Group__6__Impl rule__PieChartFX__Group__7 )
            // InternalJavaFXLang.g:5130:2: rule__PieChartFX__Group__6__Impl rule__PieChartFX__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__PieChartFX__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__6"


    // $ANTLR start "rule__PieChartFX__Group__6__Impl"
    // InternalJavaFXLang.g:5137:1: rule__PieChartFX__Group__6__Impl : ( ( rule__PieChartFX__Group_6__0 )? ) ;
    public final void rule__PieChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5141:1: ( ( ( rule__PieChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:5142:1: ( ( rule__PieChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:5142:1: ( ( rule__PieChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:5143:2: ( rule__PieChartFX__Group_6__0 )?
            {
             before(grammarAccess.getPieChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:5144:2: ( rule__PieChartFX__Group_6__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==37) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalJavaFXLang.g:5144:3: rule__PieChartFX__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PieChartFX__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPieChartFXAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__6__Impl"


    // $ANTLR start "rule__PieChartFX__Group__7"
    // InternalJavaFXLang.g:5152:1: rule__PieChartFX__Group__7 : rule__PieChartFX__Group__7__Impl rule__PieChartFX__Group__8 ;
    public final void rule__PieChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5156:1: ( rule__PieChartFX__Group__7__Impl rule__PieChartFX__Group__8 )
            // InternalJavaFXLang.g:5157:2: rule__PieChartFX__Group__7__Impl rule__PieChartFX__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__PieChartFX__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__7"


    // $ANTLR start "rule__PieChartFX__Group__7__Impl"
    // InternalJavaFXLang.g:5164:1: rule__PieChartFX__Group__7__Impl : ( ( rule__PieChartFX__Group_7__0 )? ) ;
    public final void rule__PieChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5168:1: ( ( ( rule__PieChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:5169:1: ( ( rule__PieChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:5169:1: ( ( rule__PieChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:5170:2: ( rule__PieChartFX__Group_7__0 )?
            {
             before(grammarAccess.getPieChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:5171:2: ( rule__PieChartFX__Group_7__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==38) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalJavaFXLang.g:5171:3: rule__PieChartFX__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PieChartFX__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPieChartFXAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__7__Impl"


    // $ANTLR start "rule__PieChartFX__Group__8"
    // InternalJavaFXLang.g:5179:1: rule__PieChartFX__Group__8 : rule__PieChartFX__Group__8__Impl rule__PieChartFX__Group__9 ;
    public final void rule__PieChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5183:1: ( rule__PieChartFX__Group__8__Impl rule__PieChartFX__Group__9 )
            // InternalJavaFXLang.g:5184:2: rule__PieChartFX__Group__8__Impl rule__PieChartFX__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__PieChartFX__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__8"


    // $ANTLR start "rule__PieChartFX__Group__8__Impl"
    // InternalJavaFXLang.g:5191:1: rule__PieChartFX__Group__8__Impl : ( ( rule__PieChartFX__Group_8__0 )? ) ;
    public final void rule__PieChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5195:1: ( ( ( rule__PieChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:5196:1: ( ( rule__PieChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:5196:1: ( ( rule__PieChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:5197:2: ( rule__PieChartFX__Group_8__0 )?
            {
             before(grammarAccess.getPieChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:5198:2: ( rule__PieChartFX__Group_8__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==39) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalJavaFXLang.g:5198:3: rule__PieChartFX__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PieChartFX__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPieChartFXAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__8__Impl"


    // $ANTLR start "rule__PieChartFX__Group__9"
    // InternalJavaFXLang.g:5206:1: rule__PieChartFX__Group__9 : rule__PieChartFX__Group__9__Impl rule__PieChartFX__Group__10 ;
    public final void rule__PieChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5210:1: ( rule__PieChartFX__Group__9__Impl rule__PieChartFX__Group__10 )
            // InternalJavaFXLang.g:5211:2: rule__PieChartFX__Group__9__Impl rule__PieChartFX__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__PieChartFX__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__9"


    // $ANTLR start "rule__PieChartFX__Group__9__Impl"
    // InternalJavaFXLang.g:5218:1: rule__PieChartFX__Group__9__Impl : ( ( rule__PieChartFX__Group_9__0 )? ) ;
    public final void rule__PieChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5222:1: ( ( ( rule__PieChartFX__Group_9__0 )? ) )
            // InternalJavaFXLang.g:5223:1: ( ( rule__PieChartFX__Group_9__0 )? )
            {
            // InternalJavaFXLang.g:5223:1: ( ( rule__PieChartFX__Group_9__0 )? )
            // InternalJavaFXLang.g:5224:2: ( rule__PieChartFX__Group_9__0 )?
            {
             before(grammarAccess.getPieChartFXAccess().getGroup_9()); 
            // InternalJavaFXLang.g:5225:2: ( rule__PieChartFX__Group_9__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==40) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalJavaFXLang.g:5225:3: rule__PieChartFX__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PieChartFX__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPieChartFXAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__9__Impl"


    // $ANTLR start "rule__PieChartFX__Group__10"
    // InternalJavaFXLang.g:5233:1: rule__PieChartFX__Group__10 : rule__PieChartFX__Group__10__Impl rule__PieChartFX__Group__11 ;
    public final void rule__PieChartFX__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5237:1: ( rule__PieChartFX__Group__10__Impl rule__PieChartFX__Group__11 )
            // InternalJavaFXLang.g:5238:2: rule__PieChartFX__Group__10__Impl rule__PieChartFX__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__PieChartFX__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__10"


    // $ANTLR start "rule__PieChartFX__Group__10__Impl"
    // InternalJavaFXLang.g:5245:1: rule__PieChartFX__Group__10__Impl : ( ( rule__PieChartFX__Group_10__0 )? ) ;
    public final void rule__PieChartFX__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5249:1: ( ( ( rule__PieChartFX__Group_10__0 )? ) )
            // InternalJavaFXLang.g:5250:1: ( ( rule__PieChartFX__Group_10__0 )? )
            {
            // InternalJavaFXLang.g:5250:1: ( ( rule__PieChartFX__Group_10__0 )? )
            // InternalJavaFXLang.g:5251:2: ( rule__PieChartFX__Group_10__0 )?
            {
             before(grammarAccess.getPieChartFXAccess().getGroup_10()); 
            // InternalJavaFXLang.g:5252:2: ( rule__PieChartFX__Group_10__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==41) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalJavaFXLang.g:5252:3: rule__PieChartFX__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PieChartFX__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPieChartFXAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__10__Impl"


    // $ANTLR start "rule__PieChartFX__Group__11"
    // InternalJavaFXLang.g:5260:1: rule__PieChartFX__Group__11 : rule__PieChartFX__Group__11__Impl rule__PieChartFX__Group__12 ;
    public final void rule__PieChartFX__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5264:1: ( rule__PieChartFX__Group__11__Impl rule__PieChartFX__Group__12 )
            // InternalJavaFXLang.g:5265:2: rule__PieChartFX__Group__11__Impl rule__PieChartFX__Group__12
            {
            pushFollow(FOLLOW_20);
            rule__PieChartFX__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__11"


    // $ANTLR start "rule__PieChartFX__Group__11__Impl"
    // InternalJavaFXLang.g:5272:1: rule__PieChartFX__Group__11__Impl : ( ( rule__PieChartFX__Group_11__0 )? ) ;
    public final void rule__PieChartFX__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5276:1: ( ( ( rule__PieChartFX__Group_11__0 )? ) )
            // InternalJavaFXLang.g:5277:1: ( ( rule__PieChartFX__Group_11__0 )? )
            {
            // InternalJavaFXLang.g:5277:1: ( ( rule__PieChartFX__Group_11__0 )? )
            // InternalJavaFXLang.g:5278:2: ( rule__PieChartFX__Group_11__0 )?
            {
             before(grammarAccess.getPieChartFXAccess().getGroup_11()); 
            // InternalJavaFXLang.g:5279:2: ( rule__PieChartFX__Group_11__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==42) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalJavaFXLang.g:5279:3: rule__PieChartFX__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PieChartFX__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPieChartFXAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__11__Impl"


    // $ANTLR start "rule__PieChartFX__Group__12"
    // InternalJavaFXLang.g:5287:1: rule__PieChartFX__Group__12 : rule__PieChartFX__Group__12__Impl rule__PieChartFX__Group__13 ;
    public final void rule__PieChartFX__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5291:1: ( rule__PieChartFX__Group__12__Impl rule__PieChartFX__Group__13 )
            // InternalJavaFXLang.g:5292:2: rule__PieChartFX__Group__12__Impl rule__PieChartFX__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__PieChartFX__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__12"


    // $ANTLR start "rule__PieChartFX__Group__12__Impl"
    // InternalJavaFXLang.g:5299:1: rule__PieChartFX__Group__12__Impl : ( ( rule__PieChartFX__Group_12__0 )? ) ;
    public final void rule__PieChartFX__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5303:1: ( ( ( rule__PieChartFX__Group_12__0 )? ) )
            // InternalJavaFXLang.g:5304:1: ( ( rule__PieChartFX__Group_12__0 )? )
            {
            // InternalJavaFXLang.g:5304:1: ( ( rule__PieChartFX__Group_12__0 )? )
            // InternalJavaFXLang.g:5305:2: ( rule__PieChartFX__Group_12__0 )?
            {
             before(grammarAccess.getPieChartFXAccess().getGroup_12()); 
            // InternalJavaFXLang.g:5306:2: ( rule__PieChartFX__Group_12__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==43) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalJavaFXLang.g:5306:3: rule__PieChartFX__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PieChartFX__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPieChartFXAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__12__Impl"


    // $ANTLR start "rule__PieChartFX__Group__13"
    // InternalJavaFXLang.g:5314:1: rule__PieChartFX__Group__13 : rule__PieChartFX__Group__13__Impl ;
    public final void rule__PieChartFX__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5318:1: ( rule__PieChartFX__Group__13__Impl )
            // InternalJavaFXLang.g:5319:2: rule__PieChartFX__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__13"


    // $ANTLR start "rule__PieChartFX__Group__13__Impl"
    // InternalJavaFXLang.g:5325:1: rule__PieChartFX__Group__13__Impl : ( '}' ) ;
    public final void rule__PieChartFX__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5329:1: ( ( '}' ) )
            // InternalJavaFXLang.g:5330:1: ( '}' )
            {
            // InternalJavaFXLang.g:5330:1: ( '}' )
            // InternalJavaFXLang.g:5331:2: '}'
            {
             before(grammarAccess.getPieChartFXAccess().getRightCurlyBracketKeyword_13()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPieChartFXAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group__13__Impl"


    // $ANTLR start "rule__PieChartFX__Group_5__0"
    // InternalJavaFXLang.g:5341:1: rule__PieChartFX__Group_5__0 : rule__PieChartFX__Group_5__0__Impl rule__PieChartFX__Group_5__1 ;
    public final void rule__PieChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5345:1: ( rule__PieChartFX__Group_5__0__Impl rule__PieChartFX__Group_5__1 )
            // InternalJavaFXLang.g:5346:2: rule__PieChartFX__Group_5__0__Impl rule__PieChartFX__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__PieChartFX__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_5__0"


    // $ANTLR start "rule__PieChartFX__Group_5__0__Impl"
    // InternalJavaFXLang.g:5353:1: rule__PieChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__PieChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5357:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:5358:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:5358:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:5359:2: 'legendSide:'
            {
             before(grammarAccess.getPieChartFXAccess().getLegendSideKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPieChartFXAccess().getLegendSideKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_5__0__Impl"


    // $ANTLR start "rule__PieChartFX__Group_5__1"
    // InternalJavaFXLang.g:5368:1: rule__PieChartFX__Group_5__1 : rule__PieChartFX__Group_5__1__Impl ;
    public final void rule__PieChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5372:1: ( rule__PieChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:5373:2: rule__PieChartFX__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_5__1"


    // $ANTLR start "rule__PieChartFX__Group_5__1__Impl"
    // InternalJavaFXLang.g:5379:1: rule__PieChartFX__Group_5__1__Impl : ( ( rule__PieChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__PieChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5383:1: ( ( ( rule__PieChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:5384:1: ( ( rule__PieChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:5384:1: ( ( rule__PieChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:5385:2: ( rule__PieChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getPieChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:5386:2: ( rule__PieChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:5386:3: rule__PieChartFX__LegendSideAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__LegendSideAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPieChartFXAccess().getLegendSideAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_5__1__Impl"


    // $ANTLR start "rule__PieChartFX__Group_6__0"
    // InternalJavaFXLang.g:5395:1: rule__PieChartFX__Group_6__0 : rule__PieChartFX__Group_6__0__Impl rule__PieChartFX__Group_6__1 ;
    public final void rule__PieChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5399:1: ( rule__PieChartFX__Group_6__0__Impl rule__PieChartFX__Group_6__1 )
            // InternalJavaFXLang.g:5400:2: rule__PieChartFX__Group_6__0__Impl rule__PieChartFX__Group_6__1
            {
            pushFollow(FOLLOW_22);
            rule__PieChartFX__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_6__0"


    // $ANTLR start "rule__PieChartFX__Group_6__0__Impl"
    // InternalJavaFXLang.g:5407:1: rule__PieChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__PieChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5411:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:5412:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:5412:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:5413:2: 'showLegend:'
            {
             before(grammarAccess.getPieChartFXAccess().getShowLegendKeyword_6_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPieChartFXAccess().getShowLegendKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_6__0__Impl"


    // $ANTLR start "rule__PieChartFX__Group_6__1"
    // InternalJavaFXLang.g:5422:1: rule__PieChartFX__Group_6__1 : rule__PieChartFX__Group_6__1__Impl ;
    public final void rule__PieChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5426:1: ( rule__PieChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:5427:2: rule__PieChartFX__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_6__1"


    // $ANTLR start "rule__PieChartFX__Group_6__1__Impl"
    // InternalJavaFXLang.g:5433:1: rule__PieChartFX__Group_6__1__Impl : ( ( rule__PieChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__PieChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5437:1: ( ( ( rule__PieChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:5438:1: ( ( rule__PieChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:5438:1: ( ( rule__PieChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:5439:2: ( rule__PieChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getPieChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:5440:2: ( rule__PieChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:5440:3: rule__PieChartFX__ShowLegendAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__ShowLegendAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPieChartFXAccess().getShowLegendAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_6__1__Impl"


    // $ANTLR start "rule__PieChartFX__Group_7__0"
    // InternalJavaFXLang.g:5449:1: rule__PieChartFX__Group_7__0 : rule__PieChartFX__Group_7__0__Impl rule__PieChartFX__Group_7__1 ;
    public final void rule__PieChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5453:1: ( rule__PieChartFX__Group_7__0__Impl rule__PieChartFX__Group_7__1 )
            // InternalJavaFXLang.g:5454:2: rule__PieChartFX__Group_7__0__Impl rule__PieChartFX__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__PieChartFX__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_7__0"


    // $ANTLR start "rule__PieChartFX__Group_7__0__Impl"
    // InternalJavaFXLang.g:5461:1: rule__PieChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__PieChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5465:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:5466:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:5466:1: ( 'title:' )
            // InternalJavaFXLang.g:5467:2: 'title:'
            {
             before(grammarAccess.getPieChartFXAccess().getTitleKeyword_7_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPieChartFXAccess().getTitleKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_7__0__Impl"


    // $ANTLR start "rule__PieChartFX__Group_7__1"
    // InternalJavaFXLang.g:5476:1: rule__PieChartFX__Group_7__1 : rule__PieChartFX__Group_7__1__Impl ;
    public final void rule__PieChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5480:1: ( rule__PieChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:5481:2: rule__PieChartFX__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_7__1"


    // $ANTLR start "rule__PieChartFX__Group_7__1__Impl"
    // InternalJavaFXLang.g:5487:1: rule__PieChartFX__Group_7__1__Impl : ( ( rule__PieChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__PieChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5491:1: ( ( ( rule__PieChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:5492:1: ( ( rule__PieChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:5492:1: ( ( rule__PieChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:5493:2: ( rule__PieChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getPieChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:5494:2: ( rule__PieChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:5494:3: rule__PieChartFX__TitleAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__TitleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPieChartFXAccess().getTitleAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_7__1__Impl"


    // $ANTLR start "rule__PieChartFX__Group_8__0"
    // InternalJavaFXLang.g:5503:1: rule__PieChartFX__Group_8__0 : rule__PieChartFX__Group_8__0__Impl rule__PieChartFX__Group_8__1 ;
    public final void rule__PieChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5507:1: ( rule__PieChartFX__Group_8__0__Impl rule__PieChartFX__Group_8__1 )
            // InternalJavaFXLang.g:5508:2: rule__PieChartFX__Group_8__0__Impl rule__PieChartFX__Group_8__1
            {
            pushFollow(FOLLOW_21);
            rule__PieChartFX__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_8__0"


    // $ANTLR start "rule__PieChartFX__Group_8__0__Impl"
    // InternalJavaFXLang.g:5515:1: rule__PieChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__PieChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5519:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:5520:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:5520:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:5521:2: 'titleSide:'
            {
             before(grammarAccess.getPieChartFXAccess().getTitleSideKeyword_8_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPieChartFXAccess().getTitleSideKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_8__0__Impl"


    // $ANTLR start "rule__PieChartFX__Group_8__1"
    // InternalJavaFXLang.g:5530:1: rule__PieChartFX__Group_8__1 : rule__PieChartFX__Group_8__1__Impl ;
    public final void rule__PieChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5534:1: ( rule__PieChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:5535:2: rule__PieChartFX__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_8__1"


    // $ANTLR start "rule__PieChartFX__Group_8__1__Impl"
    // InternalJavaFXLang.g:5541:1: rule__PieChartFX__Group_8__1__Impl : ( ( rule__PieChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__PieChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5545:1: ( ( ( rule__PieChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:5546:1: ( ( rule__PieChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:5546:1: ( ( rule__PieChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:5547:2: ( rule__PieChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getPieChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:5548:2: ( rule__PieChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:5548:3: rule__PieChartFX__TitleSideAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__TitleSideAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPieChartFXAccess().getTitleSideAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_8__1__Impl"


    // $ANTLR start "rule__PieChartFX__Group_9__0"
    // InternalJavaFXLang.g:5557:1: rule__PieChartFX__Group_9__0 : rule__PieChartFX__Group_9__0__Impl rule__PieChartFX__Group_9__1 ;
    public final void rule__PieChartFX__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5561:1: ( rule__PieChartFX__Group_9__0__Impl rule__PieChartFX__Group_9__1 )
            // InternalJavaFXLang.g:5562:2: rule__PieChartFX__Group_9__0__Impl rule__PieChartFX__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__PieChartFX__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_9__0"


    // $ANTLR start "rule__PieChartFX__Group_9__0__Impl"
    // InternalJavaFXLang.g:5569:1: rule__PieChartFX__Group_9__0__Impl : ( 'xAxisLabel:' ) ;
    public final void rule__PieChartFX__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5573:1: ( ( 'xAxisLabel:' ) )
            // InternalJavaFXLang.g:5574:1: ( 'xAxisLabel:' )
            {
            // InternalJavaFXLang.g:5574:1: ( 'xAxisLabel:' )
            // InternalJavaFXLang.g:5575:2: 'xAxisLabel:'
            {
             before(grammarAccess.getPieChartFXAccess().getXAxisLabelKeyword_9_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPieChartFXAccess().getXAxisLabelKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_9__0__Impl"


    // $ANTLR start "rule__PieChartFX__Group_9__1"
    // InternalJavaFXLang.g:5584:1: rule__PieChartFX__Group_9__1 : rule__PieChartFX__Group_9__1__Impl ;
    public final void rule__PieChartFX__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5588:1: ( rule__PieChartFX__Group_9__1__Impl )
            // InternalJavaFXLang.g:5589:2: rule__PieChartFX__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_9__1"


    // $ANTLR start "rule__PieChartFX__Group_9__1__Impl"
    // InternalJavaFXLang.g:5595:1: rule__PieChartFX__Group_9__1__Impl : ( ( rule__PieChartFX__XAxisLabelAssignment_9_1 ) ) ;
    public final void rule__PieChartFX__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5599:1: ( ( ( rule__PieChartFX__XAxisLabelAssignment_9_1 ) ) )
            // InternalJavaFXLang.g:5600:1: ( ( rule__PieChartFX__XAxisLabelAssignment_9_1 ) )
            {
            // InternalJavaFXLang.g:5600:1: ( ( rule__PieChartFX__XAxisLabelAssignment_9_1 ) )
            // InternalJavaFXLang.g:5601:2: ( rule__PieChartFX__XAxisLabelAssignment_9_1 )
            {
             before(grammarAccess.getPieChartFXAccess().getXAxisLabelAssignment_9_1()); 
            // InternalJavaFXLang.g:5602:2: ( rule__PieChartFX__XAxisLabelAssignment_9_1 )
            // InternalJavaFXLang.g:5602:3: rule__PieChartFX__XAxisLabelAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__XAxisLabelAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getPieChartFXAccess().getXAxisLabelAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_9__1__Impl"


    // $ANTLR start "rule__PieChartFX__Group_10__0"
    // InternalJavaFXLang.g:5611:1: rule__PieChartFX__Group_10__0 : rule__PieChartFX__Group_10__0__Impl rule__PieChartFX__Group_10__1 ;
    public final void rule__PieChartFX__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5615:1: ( rule__PieChartFX__Group_10__0__Impl rule__PieChartFX__Group_10__1 )
            // InternalJavaFXLang.g:5616:2: rule__PieChartFX__Group_10__0__Impl rule__PieChartFX__Group_10__1
            {
            pushFollow(FOLLOW_23);
            rule__PieChartFX__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_10__0"


    // $ANTLR start "rule__PieChartFX__Group_10__0__Impl"
    // InternalJavaFXLang.g:5623:1: rule__PieChartFX__Group_10__0__Impl : ( 'xAxisType:' ) ;
    public final void rule__PieChartFX__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5627:1: ( ( 'xAxisType:' ) )
            // InternalJavaFXLang.g:5628:1: ( 'xAxisType:' )
            {
            // InternalJavaFXLang.g:5628:1: ( 'xAxisType:' )
            // InternalJavaFXLang.g:5629:2: 'xAxisType:'
            {
             before(grammarAccess.getPieChartFXAccess().getXAxisTypeKeyword_10_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPieChartFXAccess().getXAxisTypeKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_10__0__Impl"


    // $ANTLR start "rule__PieChartFX__Group_10__1"
    // InternalJavaFXLang.g:5638:1: rule__PieChartFX__Group_10__1 : rule__PieChartFX__Group_10__1__Impl ;
    public final void rule__PieChartFX__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5642:1: ( rule__PieChartFX__Group_10__1__Impl )
            // InternalJavaFXLang.g:5643:2: rule__PieChartFX__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_10__1"


    // $ANTLR start "rule__PieChartFX__Group_10__1__Impl"
    // InternalJavaFXLang.g:5649:1: rule__PieChartFX__Group_10__1__Impl : ( ( rule__PieChartFX__XAxisTypeAssignment_10_1 ) ) ;
    public final void rule__PieChartFX__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5653:1: ( ( ( rule__PieChartFX__XAxisTypeAssignment_10_1 ) ) )
            // InternalJavaFXLang.g:5654:1: ( ( rule__PieChartFX__XAxisTypeAssignment_10_1 ) )
            {
            // InternalJavaFXLang.g:5654:1: ( ( rule__PieChartFX__XAxisTypeAssignment_10_1 ) )
            // InternalJavaFXLang.g:5655:2: ( rule__PieChartFX__XAxisTypeAssignment_10_1 )
            {
             before(grammarAccess.getPieChartFXAccess().getXAxisTypeAssignment_10_1()); 
            // InternalJavaFXLang.g:5656:2: ( rule__PieChartFX__XAxisTypeAssignment_10_1 )
            // InternalJavaFXLang.g:5656:3: rule__PieChartFX__XAxisTypeAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__XAxisTypeAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getPieChartFXAccess().getXAxisTypeAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_10__1__Impl"


    // $ANTLR start "rule__PieChartFX__Group_11__0"
    // InternalJavaFXLang.g:5665:1: rule__PieChartFX__Group_11__0 : rule__PieChartFX__Group_11__0__Impl rule__PieChartFX__Group_11__1 ;
    public final void rule__PieChartFX__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5669:1: ( rule__PieChartFX__Group_11__0__Impl rule__PieChartFX__Group_11__1 )
            // InternalJavaFXLang.g:5670:2: rule__PieChartFX__Group_11__0__Impl rule__PieChartFX__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__PieChartFX__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_11__0"


    // $ANTLR start "rule__PieChartFX__Group_11__0__Impl"
    // InternalJavaFXLang.g:5677:1: rule__PieChartFX__Group_11__0__Impl : ( 'yAxisLabel:' ) ;
    public final void rule__PieChartFX__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5681:1: ( ( 'yAxisLabel:' ) )
            // InternalJavaFXLang.g:5682:1: ( 'yAxisLabel:' )
            {
            // InternalJavaFXLang.g:5682:1: ( 'yAxisLabel:' )
            // InternalJavaFXLang.g:5683:2: 'yAxisLabel:'
            {
             before(grammarAccess.getPieChartFXAccess().getYAxisLabelKeyword_11_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPieChartFXAccess().getYAxisLabelKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_11__0__Impl"


    // $ANTLR start "rule__PieChartFX__Group_11__1"
    // InternalJavaFXLang.g:5692:1: rule__PieChartFX__Group_11__1 : rule__PieChartFX__Group_11__1__Impl ;
    public final void rule__PieChartFX__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5696:1: ( rule__PieChartFX__Group_11__1__Impl )
            // InternalJavaFXLang.g:5697:2: rule__PieChartFX__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_11__1"


    // $ANTLR start "rule__PieChartFX__Group_11__1__Impl"
    // InternalJavaFXLang.g:5703:1: rule__PieChartFX__Group_11__1__Impl : ( ( rule__PieChartFX__YAxisLabelAssignment_11_1 ) ) ;
    public final void rule__PieChartFX__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5707:1: ( ( ( rule__PieChartFX__YAxisLabelAssignment_11_1 ) ) )
            // InternalJavaFXLang.g:5708:1: ( ( rule__PieChartFX__YAxisLabelAssignment_11_1 ) )
            {
            // InternalJavaFXLang.g:5708:1: ( ( rule__PieChartFX__YAxisLabelAssignment_11_1 ) )
            // InternalJavaFXLang.g:5709:2: ( rule__PieChartFX__YAxisLabelAssignment_11_1 )
            {
             before(grammarAccess.getPieChartFXAccess().getYAxisLabelAssignment_11_1()); 
            // InternalJavaFXLang.g:5710:2: ( rule__PieChartFX__YAxisLabelAssignment_11_1 )
            // InternalJavaFXLang.g:5710:3: rule__PieChartFX__YAxisLabelAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__YAxisLabelAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getPieChartFXAccess().getYAxisLabelAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_11__1__Impl"


    // $ANTLR start "rule__PieChartFX__Group_12__0"
    // InternalJavaFXLang.g:5719:1: rule__PieChartFX__Group_12__0 : rule__PieChartFX__Group_12__0__Impl rule__PieChartFX__Group_12__1 ;
    public final void rule__PieChartFX__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5723:1: ( rule__PieChartFX__Group_12__0__Impl rule__PieChartFX__Group_12__1 )
            // InternalJavaFXLang.g:5724:2: rule__PieChartFX__Group_12__0__Impl rule__PieChartFX__Group_12__1
            {
            pushFollow(FOLLOW_23);
            rule__PieChartFX__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_12__0"


    // $ANTLR start "rule__PieChartFX__Group_12__0__Impl"
    // InternalJavaFXLang.g:5731:1: rule__PieChartFX__Group_12__0__Impl : ( 'yAxisType:' ) ;
    public final void rule__PieChartFX__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5735:1: ( ( 'yAxisType:' ) )
            // InternalJavaFXLang.g:5736:1: ( 'yAxisType:' )
            {
            // InternalJavaFXLang.g:5736:1: ( 'yAxisType:' )
            // InternalJavaFXLang.g:5737:2: 'yAxisType:'
            {
             before(grammarAccess.getPieChartFXAccess().getYAxisTypeKeyword_12_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPieChartFXAccess().getYAxisTypeKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_12__0__Impl"


    // $ANTLR start "rule__PieChartFX__Group_12__1"
    // InternalJavaFXLang.g:5746:1: rule__PieChartFX__Group_12__1 : rule__PieChartFX__Group_12__1__Impl ;
    public final void rule__PieChartFX__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5750:1: ( rule__PieChartFX__Group_12__1__Impl )
            // InternalJavaFXLang.g:5751:2: rule__PieChartFX__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_12__1"


    // $ANTLR start "rule__PieChartFX__Group_12__1__Impl"
    // InternalJavaFXLang.g:5757:1: rule__PieChartFX__Group_12__1__Impl : ( ( rule__PieChartFX__YAxisTypeAssignment_12_1 ) ) ;
    public final void rule__PieChartFX__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5761:1: ( ( ( rule__PieChartFX__YAxisTypeAssignment_12_1 ) ) )
            // InternalJavaFXLang.g:5762:1: ( ( rule__PieChartFX__YAxisTypeAssignment_12_1 ) )
            {
            // InternalJavaFXLang.g:5762:1: ( ( rule__PieChartFX__YAxisTypeAssignment_12_1 ) )
            // InternalJavaFXLang.g:5763:2: ( rule__PieChartFX__YAxisTypeAssignment_12_1 )
            {
             before(grammarAccess.getPieChartFXAccess().getYAxisTypeAssignment_12_1()); 
            // InternalJavaFXLang.g:5764:2: ( rule__PieChartFX__YAxisTypeAssignment_12_1 )
            // InternalJavaFXLang.g:5764:3: rule__PieChartFX__YAxisTypeAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__YAxisTypeAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getPieChartFXAccess().getYAxisTypeAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__Group_12__1__Impl"


    // $ANTLR start "rule__LineChartFX__Group__0"
    // InternalJavaFXLang.g:5773:1: rule__LineChartFX__Group__0 : rule__LineChartFX__Group__0__Impl rule__LineChartFX__Group__1 ;
    public final void rule__LineChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5777:1: ( rule__LineChartFX__Group__0__Impl rule__LineChartFX__Group__1 )
            // InternalJavaFXLang.g:5778:2: rule__LineChartFX__Group__0__Impl rule__LineChartFX__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalJavaFXLang.g:5785:1: rule__LineChartFX__Group__0__Impl : ( () ) ;
    public final void rule__LineChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5789:1: ( ( () ) )
            // InternalJavaFXLang.g:5790:1: ( () )
            {
            // InternalJavaFXLang.g:5790:1: ( () )
            // InternalJavaFXLang.g:5791:2: ()
            {
             before(grammarAccess.getLineChartFXAccess().getLineChartFXAction_0()); 
            // InternalJavaFXLang.g:5792:2: ()
            // InternalJavaFXLang.g:5792:3: 
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
    // InternalJavaFXLang.g:5800:1: rule__LineChartFX__Group__1 : rule__LineChartFX__Group__1__Impl rule__LineChartFX__Group__2 ;
    public final void rule__LineChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5804:1: ( rule__LineChartFX__Group__1__Impl rule__LineChartFX__Group__2 )
            // InternalJavaFXLang.g:5805:2: rule__LineChartFX__Group__1__Impl rule__LineChartFX__Group__2
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
    // InternalJavaFXLang.g:5812:1: rule__LineChartFX__Group__1__Impl : ( 'LineChart' ) ;
    public final void rule__LineChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5816:1: ( ( 'LineChart' ) )
            // InternalJavaFXLang.g:5817:1: ( 'LineChart' )
            {
            // InternalJavaFXLang.g:5817:1: ( 'LineChart' )
            // InternalJavaFXLang.g:5818:2: 'LineChart'
            {
             before(grammarAccess.getLineChartFXAccess().getLineChartKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalJavaFXLang.g:5827:1: rule__LineChartFX__Group__2 : rule__LineChartFX__Group__2__Impl rule__LineChartFX__Group__3 ;
    public final void rule__LineChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5831:1: ( rule__LineChartFX__Group__2__Impl rule__LineChartFX__Group__3 )
            // InternalJavaFXLang.g:5832:2: rule__LineChartFX__Group__2__Impl rule__LineChartFX__Group__3
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
    // InternalJavaFXLang.g:5839:1: rule__LineChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__LineChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5843:1: ( ( '{' ) )
            // InternalJavaFXLang.g:5844:1: ( '{' )
            {
            // InternalJavaFXLang.g:5844:1: ( '{' )
            // InternalJavaFXLang.g:5845:2: '{'
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
    // InternalJavaFXLang.g:5854:1: rule__LineChartFX__Group__3 : rule__LineChartFX__Group__3__Impl rule__LineChartFX__Group__4 ;
    public final void rule__LineChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5858:1: ( rule__LineChartFX__Group__3__Impl rule__LineChartFX__Group__4 )
            // InternalJavaFXLang.g:5859:2: rule__LineChartFX__Group__3__Impl rule__LineChartFX__Group__4
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
    // InternalJavaFXLang.g:5866:1: rule__LineChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__LineChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5870:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:5871:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:5871:1: ( 'name:' )
            // InternalJavaFXLang.g:5872:2: 'name:'
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
    // InternalJavaFXLang.g:5881:1: rule__LineChartFX__Group__4 : rule__LineChartFX__Group__4__Impl rule__LineChartFX__Group__5 ;
    public final void rule__LineChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5885:1: ( rule__LineChartFX__Group__4__Impl rule__LineChartFX__Group__5 )
            // InternalJavaFXLang.g:5886:2: rule__LineChartFX__Group__4__Impl rule__LineChartFX__Group__5
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
    // InternalJavaFXLang.g:5893:1: rule__LineChartFX__Group__4__Impl : ( ( rule__LineChartFX__NameAssignment_4 ) ) ;
    public final void rule__LineChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5897:1: ( ( ( rule__LineChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:5898:1: ( ( rule__LineChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:5898:1: ( ( rule__LineChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:5899:2: ( rule__LineChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getLineChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:5900:2: ( rule__LineChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:5900:3: rule__LineChartFX__NameAssignment_4
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
    // InternalJavaFXLang.g:5908:1: rule__LineChartFX__Group__5 : rule__LineChartFX__Group__5__Impl rule__LineChartFX__Group__6 ;
    public final void rule__LineChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5912:1: ( rule__LineChartFX__Group__5__Impl rule__LineChartFX__Group__6 )
            // InternalJavaFXLang.g:5913:2: rule__LineChartFX__Group__5__Impl rule__LineChartFX__Group__6
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
    // InternalJavaFXLang.g:5920:1: rule__LineChartFX__Group__5__Impl : ( ( rule__LineChartFX__Group_5__0 )? ) ;
    public final void rule__LineChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5924:1: ( ( ( rule__LineChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:5925:1: ( ( rule__LineChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:5925:1: ( ( rule__LineChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:5926:2: ( rule__LineChartFX__Group_5__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:5927:2: ( rule__LineChartFX__Group_5__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==36) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalJavaFXLang.g:5927:3: rule__LineChartFX__Group_5__0
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
    // InternalJavaFXLang.g:5935:1: rule__LineChartFX__Group__6 : rule__LineChartFX__Group__6__Impl rule__LineChartFX__Group__7 ;
    public final void rule__LineChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5939:1: ( rule__LineChartFX__Group__6__Impl rule__LineChartFX__Group__7 )
            // InternalJavaFXLang.g:5940:2: rule__LineChartFX__Group__6__Impl rule__LineChartFX__Group__7
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
    // InternalJavaFXLang.g:5947:1: rule__LineChartFX__Group__6__Impl : ( ( rule__LineChartFX__Group_6__0 )? ) ;
    public final void rule__LineChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5951:1: ( ( ( rule__LineChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:5952:1: ( ( rule__LineChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:5952:1: ( ( rule__LineChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:5953:2: ( rule__LineChartFX__Group_6__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:5954:2: ( rule__LineChartFX__Group_6__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==37) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalJavaFXLang.g:5954:3: rule__LineChartFX__Group_6__0
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
    // InternalJavaFXLang.g:5962:1: rule__LineChartFX__Group__7 : rule__LineChartFX__Group__7__Impl rule__LineChartFX__Group__8 ;
    public final void rule__LineChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5966:1: ( rule__LineChartFX__Group__7__Impl rule__LineChartFX__Group__8 )
            // InternalJavaFXLang.g:5967:2: rule__LineChartFX__Group__7__Impl rule__LineChartFX__Group__8
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
    // InternalJavaFXLang.g:5974:1: rule__LineChartFX__Group__7__Impl : ( ( rule__LineChartFX__Group_7__0 )? ) ;
    public final void rule__LineChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5978:1: ( ( ( rule__LineChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:5979:1: ( ( rule__LineChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:5979:1: ( ( rule__LineChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:5980:2: ( rule__LineChartFX__Group_7__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:5981:2: ( rule__LineChartFX__Group_7__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==38) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalJavaFXLang.g:5981:3: rule__LineChartFX__Group_7__0
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
    // InternalJavaFXLang.g:5989:1: rule__LineChartFX__Group__8 : rule__LineChartFX__Group__8__Impl rule__LineChartFX__Group__9 ;
    public final void rule__LineChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5993:1: ( rule__LineChartFX__Group__8__Impl rule__LineChartFX__Group__9 )
            // InternalJavaFXLang.g:5994:2: rule__LineChartFX__Group__8__Impl rule__LineChartFX__Group__9
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
    // InternalJavaFXLang.g:6001:1: rule__LineChartFX__Group__8__Impl : ( ( rule__LineChartFX__Group_8__0 )? ) ;
    public final void rule__LineChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6005:1: ( ( ( rule__LineChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:6006:1: ( ( rule__LineChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:6006:1: ( ( rule__LineChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:6007:2: ( rule__LineChartFX__Group_8__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:6008:2: ( rule__LineChartFX__Group_8__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==39) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalJavaFXLang.g:6008:3: rule__LineChartFX__Group_8__0
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
    // InternalJavaFXLang.g:6016:1: rule__LineChartFX__Group__9 : rule__LineChartFX__Group__9__Impl rule__LineChartFX__Group__10 ;
    public final void rule__LineChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6020:1: ( rule__LineChartFX__Group__9__Impl rule__LineChartFX__Group__10 )
            // InternalJavaFXLang.g:6021:2: rule__LineChartFX__Group__9__Impl rule__LineChartFX__Group__10
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
    // InternalJavaFXLang.g:6028:1: rule__LineChartFX__Group__9__Impl : ( ( rule__LineChartFX__Group_9__0 )? ) ;
    public final void rule__LineChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6032:1: ( ( ( rule__LineChartFX__Group_9__0 )? ) )
            // InternalJavaFXLang.g:6033:1: ( ( rule__LineChartFX__Group_9__0 )? )
            {
            // InternalJavaFXLang.g:6033:1: ( ( rule__LineChartFX__Group_9__0 )? )
            // InternalJavaFXLang.g:6034:2: ( rule__LineChartFX__Group_9__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_9()); 
            // InternalJavaFXLang.g:6035:2: ( rule__LineChartFX__Group_9__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==40) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalJavaFXLang.g:6035:3: rule__LineChartFX__Group_9__0
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
    // InternalJavaFXLang.g:6043:1: rule__LineChartFX__Group__10 : rule__LineChartFX__Group__10__Impl rule__LineChartFX__Group__11 ;
    public final void rule__LineChartFX__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6047:1: ( rule__LineChartFX__Group__10__Impl rule__LineChartFX__Group__11 )
            // InternalJavaFXLang.g:6048:2: rule__LineChartFX__Group__10__Impl rule__LineChartFX__Group__11
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
    // InternalJavaFXLang.g:6055:1: rule__LineChartFX__Group__10__Impl : ( ( rule__LineChartFX__Group_10__0 )? ) ;
    public final void rule__LineChartFX__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6059:1: ( ( ( rule__LineChartFX__Group_10__0 )? ) )
            // InternalJavaFXLang.g:6060:1: ( ( rule__LineChartFX__Group_10__0 )? )
            {
            // InternalJavaFXLang.g:6060:1: ( ( rule__LineChartFX__Group_10__0 )? )
            // InternalJavaFXLang.g:6061:2: ( rule__LineChartFX__Group_10__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_10()); 
            // InternalJavaFXLang.g:6062:2: ( rule__LineChartFX__Group_10__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==41) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalJavaFXLang.g:6062:3: rule__LineChartFX__Group_10__0
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
    // InternalJavaFXLang.g:6070:1: rule__LineChartFX__Group__11 : rule__LineChartFX__Group__11__Impl rule__LineChartFX__Group__12 ;
    public final void rule__LineChartFX__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6074:1: ( rule__LineChartFX__Group__11__Impl rule__LineChartFX__Group__12 )
            // InternalJavaFXLang.g:6075:2: rule__LineChartFX__Group__11__Impl rule__LineChartFX__Group__12
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
    // InternalJavaFXLang.g:6082:1: rule__LineChartFX__Group__11__Impl : ( ( rule__LineChartFX__Group_11__0 )? ) ;
    public final void rule__LineChartFX__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6086:1: ( ( ( rule__LineChartFX__Group_11__0 )? ) )
            // InternalJavaFXLang.g:6087:1: ( ( rule__LineChartFX__Group_11__0 )? )
            {
            // InternalJavaFXLang.g:6087:1: ( ( rule__LineChartFX__Group_11__0 )? )
            // InternalJavaFXLang.g:6088:2: ( rule__LineChartFX__Group_11__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_11()); 
            // InternalJavaFXLang.g:6089:2: ( rule__LineChartFX__Group_11__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==42) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalJavaFXLang.g:6089:3: rule__LineChartFX__Group_11__0
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
    // InternalJavaFXLang.g:6097:1: rule__LineChartFX__Group__12 : rule__LineChartFX__Group__12__Impl rule__LineChartFX__Group__13 ;
    public final void rule__LineChartFX__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6101:1: ( rule__LineChartFX__Group__12__Impl rule__LineChartFX__Group__13 )
            // InternalJavaFXLang.g:6102:2: rule__LineChartFX__Group__12__Impl rule__LineChartFX__Group__13
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
    // InternalJavaFXLang.g:6109:1: rule__LineChartFX__Group__12__Impl : ( ( rule__LineChartFX__Group_12__0 )? ) ;
    public final void rule__LineChartFX__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6113:1: ( ( ( rule__LineChartFX__Group_12__0 )? ) )
            // InternalJavaFXLang.g:6114:1: ( ( rule__LineChartFX__Group_12__0 )? )
            {
            // InternalJavaFXLang.g:6114:1: ( ( rule__LineChartFX__Group_12__0 )? )
            // InternalJavaFXLang.g:6115:2: ( rule__LineChartFX__Group_12__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_12()); 
            // InternalJavaFXLang.g:6116:2: ( rule__LineChartFX__Group_12__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==43) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalJavaFXLang.g:6116:3: rule__LineChartFX__Group_12__0
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
    // InternalJavaFXLang.g:6124:1: rule__LineChartFX__Group__13 : rule__LineChartFX__Group__13__Impl ;
    public final void rule__LineChartFX__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6128:1: ( rule__LineChartFX__Group__13__Impl )
            // InternalJavaFXLang.g:6129:2: rule__LineChartFX__Group__13__Impl
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
    // InternalJavaFXLang.g:6135:1: rule__LineChartFX__Group__13__Impl : ( '}' ) ;
    public final void rule__LineChartFX__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6139:1: ( ( '}' ) )
            // InternalJavaFXLang.g:6140:1: ( '}' )
            {
            // InternalJavaFXLang.g:6140:1: ( '}' )
            // InternalJavaFXLang.g:6141:2: '}'
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
    // InternalJavaFXLang.g:6151:1: rule__LineChartFX__Group_5__0 : rule__LineChartFX__Group_5__0__Impl rule__LineChartFX__Group_5__1 ;
    public final void rule__LineChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6155:1: ( rule__LineChartFX__Group_5__0__Impl rule__LineChartFX__Group_5__1 )
            // InternalJavaFXLang.g:6156:2: rule__LineChartFX__Group_5__0__Impl rule__LineChartFX__Group_5__1
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
    // InternalJavaFXLang.g:6163:1: rule__LineChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__LineChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6167:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:6168:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:6168:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:6169:2: 'legendSide:'
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
    // InternalJavaFXLang.g:6178:1: rule__LineChartFX__Group_5__1 : rule__LineChartFX__Group_5__1__Impl ;
    public final void rule__LineChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6182:1: ( rule__LineChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:6183:2: rule__LineChartFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:6189:1: rule__LineChartFX__Group_5__1__Impl : ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__LineChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6193:1: ( ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:6194:1: ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:6194:1: ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:6195:2: ( rule__LineChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:6196:2: ( rule__LineChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:6196:3: rule__LineChartFX__LegendSideAssignment_5_1
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
    // InternalJavaFXLang.g:6205:1: rule__LineChartFX__Group_6__0 : rule__LineChartFX__Group_6__0__Impl rule__LineChartFX__Group_6__1 ;
    public final void rule__LineChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6209:1: ( rule__LineChartFX__Group_6__0__Impl rule__LineChartFX__Group_6__1 )
            // InternalJavaFXLang.g:6210:2: rule__LineChartFX__Group_6__0__Impl rule__LineChartFX__Group_6__1
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
    // InternalJavaFXLang.g:6217:1: rule__LineChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__LineChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6221:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:6222:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:6222:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:6223:2: 'showLegend:'
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
    // InternalJavaFXLang.g:6232:1: rule__LineChartFX__Group_6__1 : rule__LineChartFX__Group_6__1__Impl ;
    public final void rule__LineChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6236:1: ( rule__LineChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:6237:2: rule__LineChartFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:6243:1: rule__LineChartFX__Group_6__1__Impl : ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__LineChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6247:1: ( ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:6248:1: ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:6248:1: ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:6249:2: ( rule__LineChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:6250:2: ( rule__LineChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:6250:3: rule__LineChartFX__ShowLegendAssignment_6_1
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
    // InternalJavaFXLang.g:6259:1: rule__LineChartFX__Group_7__0 : rule__LineChartFX__Group_7__0__Impl rule__LineChartFX__Group_7__1 ;
    public final void rule__LineChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6263:1: ( rule__LineChartFX__Group_7__0__Impl rule__LineChartFX__Group_7__1 )
            // InternalJavaFXLang.g:6264:2: rule__LineChartFX__Group_7__0__Impl rule__LineChartFX__Group_7__1
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
    // InternalJavaFXLang.g:6271:1: rule__LineChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__LineChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6275:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:6276:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:6276:1: ( 'title:' )
            // InternalJavaFXLang.g:6277:2: 'title:'
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
    // InternalJavaFXLang.g:6286:1: rule__LineChartFX__Group_7__1 : rule__LineChartFX__Group_7__1__Impl ;
    public final void rule__LineChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6290:1: ( rule__LineChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:6291:2: rule__LineChartFX__Group_7__1__Impl
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
    // InternalJavaFXLang.g:6297:1: rule__LineChartFX__Group_7__1__Impl : ( ( rule__LineChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__LineChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6301:1: ( ( ( rule__LineChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:6302:1: ( ( rule__LineChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:6302:1: ( ( rule__LineChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:6303:2: ( rule__LineChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:6304:2: ( rule__LineChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:6304:3: rule__LineChartFX__TitleAssignment_7_1
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
    // InternalJavaFXLang.g:6313:1: rule__LineChartFX__Group_8__0 : rule__LineChartFX__Group_8__0__Impl rule__LineChartFX__Group_8__1 ;
    public final void rule__LineChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6317:1: ( rule__LineChartFX__Group_8__0__Impl rule__LineChartFX__Group_8__1 )
            // InternalJavaFXLang.g:6318:2: rule__LineChartFX__Group_8__0__Impl rule__LineChartFX__Group_8__1
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
    // InternalJavaFXLang.g:6325:1: rule__LineChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__LineChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6329:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:6330:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:6330:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:6331:2: 'titleSide:'
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
    // InternalJavaFXLang.g:6340:1: rule__LineChartFX__Group_8__1 : rule__LineChartFX__Group_8__1__Impl ;
    public final void rule__LineChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6344:1: ( rule__LineChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:6345:2: rule__LineChartFX__Group_8__1__Impl
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
    // InternalJavaFXLang.g:6351:1: rule__LineChartFX__Group_8__1__Impl : ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__LineChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6355:1: ( ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:6356:1: ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:6356:1: ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:6357:2: ( rule__LineChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:6358:2: ( rule__LineChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:6358:3: rule__LineChartFX__TitleSideAssignment_8_1
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
    // InternalJavaFXLang.g:6367:1: rule__LineChartFX__Group_9__0 : rule__LineChartFX__Group_9__0__Impl rule__LineChartFX__Group_9__1 ;
    public final void rule__LineChartFX__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6371:1: ( rule__LineChartFX__Group_9__0__Impl rule__LineChartFX__Group_9__1 )
            // InternalJavaFXLang.g:6372:2: rule__LineChartFX__Group_9__0__Impl rule__LineChartFX__Group_9__1
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
    // InternalJavaFXLang.g:6379:1: rule__LineChartFX__Group_9__0__Impl : ( 'xAxisLabel:' ) ;
    public final void rule__LineChartFX__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6383:1: ( ( 'xAxisLabel:' ) )
            // InternalJavaFXLang.g:6384:1: ( 'xAxisLabel:' )
            {
            // InternalJavaFXLang.g:6384:1: ( 'xAxisLabel:' )
            // InternalJavaFXLang.g:6385:2: 'xAxisLabel:'
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
    // InternalJavaFXLang.g:6394:1: rule__LineChartFX__Group_9__1 : rule__LineChartFX__Group_9__1__Impl ;
    public final void rule__LineChartFX__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6398:1: ( rule__LineChartFX__Group_9__1__Impl )
            // InternalJavaFXLang.g:6399:2: rule__LineChartFX__Group_9__1__Impl
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
    // InternalJavaFXLang.g:6405:1: rule__LineChartFX__Group_9__1__Impl : ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) ) ;
    public final void rule__LineChartFX__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6409:1: ( ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) ) )
            // InternalJavaFXLang.g:6410:1: ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) )
            {
            // InternalJavaFXLang.g:6410:1: ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) )
            // InternalJavaFXLang.g:6411:2: ( rule__LineChartFX__XAxisLabelAssignment_9_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getXAxisLabelAssignment_9_1()); 
            // InternalJavaFXLang.g:6412:2: ( rule__LineChartFX__XAxisLabelAssignment_9_1 )
            // InternalJavaFXLang.g:6412:3: rule__LineChartFX__XAxisLabelAssignment_9_1
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
    // InternalJavaFXLang.g:6421:1: rule__LineChartFX__Group_10__0 : rule__LineChartFX__Group_10__0__Impl rule__LineChartFX__Group_10__1 ;
    public final void rule__LineChartFX__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6425:1: ( rule__LineChartFX__Group_10__0__Impl rule__LineChartFX__Group_10__1 )
            // InternalJavaFXLang.g:6426:2: rule__LineChartFX__Group_10__0__Impl rule__LineChartFX__Group_10__1
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
    // InternalJavaFXLang.g:6433:1: rule__LineChartFX__Group_10__0__Impl : ( 'xAxisType:' ) ;
    public final void rule__LineChartFX__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6437:1: ( ( 'xAxisType:' ) )
            // InternalJavaFXLang.g:6438:1: ( 'xAxisType:' )
            {
            // InternalJavaFXLang.g:6438:1: ( 'xAxisType:' )
            // InternalJavaFXLang.g:6439:2: 'xAxisType:'
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
    // InternalJavaFXLang.g:6448:1: rule__LineChartFX__Group_10__1 : rule__LineChartFX__Group_10__1__Impl ;
    public final void rule__LineChartFX__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6452:1: ( rule__LineChartFX__Group_10__1__Impl )
            // InternalJavaFXLang.g:6453:2: rule__LineChartFX__Group_10__1__Impl
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
    // InternalJavaFXLang.g:6459:1: rule__LineChartFX__Group_10__1__Impl : ( ( rule__LineChartFX__XAxisTypeAssignment_10_1 ) ) ;
    public final void rule__LineChartFX__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6463:1: ( ( ( rule__LineChartFX__XAxisTypeAssignment_10_1 ) ) )
            // InternalJavaFXLang.g:6464:1: ( ( rule__LineChartFX__XAxisTypeAssignment_10_1 ) )
            {
            // InternalJavaFXLang.g:6464:1: ( ( rule__LineChartFX__XAxisTypeAssignment_10_1 ) )
            // InternalJavaFXLang.g:6465:2: ( rule__LineChartFX__XAxisTypeAssignment_10_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getXAxisTypeAssignment_10_1()); 
            // InternalJavaFXLang.g:6466:2: ( rule__LineChartFX__XAxisTypeAssignment_10_1 )
            // InternalJavaFXLang.g:6466:3: rule__LineChartFX__XAxisTypeAssignment_10_1
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
    // InternalJavaFXLang.g:6475:1: rule__LineChartFX__Group_11__0 : rule__LineChartFX__Group_11__0__Impl rule__LineChartFX__Group_11__1 ;
    public final void rule__LineChartFX__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6479:1: ( rule__LineChartFX__Group_11__0__Impl rule__LineChartFX__Group_11__1 )
            // InternalJavaFXLang.g:6480:2: rule__LineChartFX__Group_11__0__Impl rule__LineChartFX__Group_11__1
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
    // InternalJavaFXLang.g:6487:1: rule__LineChartFX__Group_11__0__Impl : ( 'yAxisLabel:' ) ;
    public final void rule__LineChartFX__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6491:1: ( ( 'yAxisLabel:' ) )
            // InternalJavaFXLang.g:6492:1: ( 'yAxisLabel:' )
            {
            // InternalJavaFXLang.g:6492:1: ( 'yAxisLabel:' )
            // InternalJavaFXLang.g:6493:2: 'yAxisLabel:'
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
    // InternalJavaFXLang.g:6502:1: rule__LineChartFX__Group_11__1 : rule__LineChartFX__Group_11__1__Impl ;
    public final void rule__LineChartFX__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6506:1: ( rule__LineChartFX__Group_11__1__Impl )
            // InternalJavaFXLang.g:6507:2: rule__LineChartFX__Group_11__1__Impl
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
    // InternalJavaFXLang.g:6513:1: rule__LineChartFX__Group_11__1__Impl : ( ( rule__LineChartFX__YAxisLabelAssignment_11_1 ) ) ;
    public final void rule__LineChartFX__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6517:1: ( ( ( rule__LineChartFX__YAxisLabelAssignment_11_1 ) ) )
            // InternalJavaFXLang.g:6518:1: ( ( rule__LineChartFX__YAxisLabelAssignment_11_1 ) )
            {
            // InternalJavaFXLang.g:6518:1: ( ( rule__LineChartFX__YAxisLabelAssignment_11_1 ) )
            // InternalJavaFXLang.g:6519:2: ( rule__LineChartFX__YAxisLabelAssignment_11_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getYAxisLabelAssignment_11_1()); 
            // InternalJavaFXLang.g:6520:2: ( rule__LineChartFX__YAxisLabelAssignment_11_1 )
            // InternalJavaFXLang.g:6520:3: rule__LineChartFX__YAxisLabelAssignment_11_1
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
    // InternalJavaFXLang.g:6529:1: rule__LineChartFX__Group_12__0 : rule__LineChartFX__Group_12__0__Impl rule__LineChartFX__Group_12__1 ;
    public final void rule__LineChartFX__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6533:1: ( rule__LineChartFX__Group_12__0__Impl rule__LineChartFX__Group_12__1 )
            // InternalJavaFXLang.g:6534:2: rule__LineChartFX__Group_12__0__Impl rule__LineChartFX__Group_12__1
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
    // InternalJavaFXLang.g:6541:1: rule__LineChartFX__Group_12__0__Impl : ( 'yAxisType:' ) ;
    public final void rule__LineChartFX__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6545:1: ( ( 'yAxisType:' ) )
            // InternalJavaFXLang.g:6546:1: ( 'yAxisType:' )
            {
            // InternalJavaFXLang.g:6546:1: ( 'yAxisType:' )
            // InternalJavaFXLang.g:6547:2: 'yAxisType:'
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
    // InternalJavaFXLang.g:6556:1: rule__LineChartFX__Group_12__1 : rule__LineChartFX__Group_12__1__Impl ;
    public final void rule__LineChartFX__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6560:1: ( rule__LineChartFX__Group_12__1__Impl )
            // InternalJavaFXLang.g:6561:2: rule__LineChartFX__Group_12__1__Impl
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
    // InternalJavaFXLang.g:6567:1: rule__LineChartFX__Group_12__1__Impl : ( ( rule__LineChartFX__YAxisTypeAssignment_12_1 ) ) ;
    public final void rule__LineChartFX__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6571:1: ( ( ( rule__LineChartFX__YAxisTypeAssignment_12_1 ) ) )
            // InternalJavaFXLang.g:6572:1: ( ( rule__LineChartFX__YAxisTypeAssignment_12_1 ) )
            {
            // InternalJavaFXLang.g:6572:1: ( ( rule__LineChartFX__YAxisTypeAssignment_12_1 ) )
            // InternalJavaFXLang.g:6573:2: ( rule__LineChartFX__YAxisTypeAssignment_12_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getYAxisTypeAssignment_12_1()); 
            // InternalJavaFXLang.g:6574:2: ( rule__LineChartFX__YAxisTypeAssignment_12_1 )
            // InternalJavaFXLang.g:6574:3: rule__LineChartFX__YAxisTypeAssignment_12_1
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
    // InternalJavaFXLang.g:6583:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6587:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalJavaFXLang.g:6588:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
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
    // InternalJavaFXLang.g:6595:1: rule__Binding__Group__0__Impl : ( () ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6599:1: ( ( () ) )
            // InternalJavaFXLang.g:6600:1: ( () )
            {
            // InternalJavaFXLang.g:6600:1: ( () )
            // InternalJavaFXLang.g:6601:2: ()
            {
             before(grammarAccess.getBindingAccess().getBindingAction_0()); 
            // InternalJavaFXLang.g:6602:2: ()
            // InternalJavaFXLang.g:6602:3: 
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
    // InternalJavaFXLang.g:6610:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6614:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalJavaFXLang.g:6615:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
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
    // InternalJavaFXLang.g:6622:1: rule__Binding__Group__1__Impl : ( 'binding' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6626:1: ( ( 'binding' ) )
            // InternalJavaFXLang.g:6627:1: ( 'binding' )
            {
            // InternalJavaFXLang.g:6627:1: ( 'binding' )
            // InternalJavaFXLang.g:6628:2: 'binding'
            {
             before(grammarAccess.getBindingAccess().getBindingKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalJavaFXLang.g:6637:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6641:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalJavaFXLang.g:6642:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
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
    // InternalJavaFXLang.g:6649:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__NameAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6653:1: ( ( ( rule__Binding__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:6654:1: ( ( rule__Binding__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:6654:1: ( ( rule__Binding__NameAssignment_2 ) )
            // InternalJavaFXLang.g:6655:2: ( rule__Binding__NameAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:6656:2: ( rule__Binding__NameAssignment_2 )
            // InternalJavaFXLang.g:6656:3: rule__Binding__NameAssignment_2
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
    // InternalJavaFXLang.g:6664:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6668:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalJavaFXLang.g:6669:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalJavaFXLang.g:6676:1: rule__Binding__Group__3__Impl : ( '{' ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6680:1: ( ( '{' ) )
            // InternalJavaFXLang.g:6681:1: ( '{' )
            {
            // InternalJavaFXLang.g:6681:1: ( '{' )
            // InternalJavaFXLang.g:6682:2: '{'
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
    // InternalJavaFXLang.g:6691:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl rule__Binding__Group__5 ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6695:1: ( rule__Binding__Group__4__Impl rule__Binding__Group__5 )
            // InternalJavaFXLang.g:6696:2: rule__Binding__Group__4__Impl rule__Binding__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalJavaFXLang.g:6703:1: rule__Binding__Group__4__Impl : ( ( rule__Binding__Group_4__0 )? ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6707:1: ( ( ( rule__Binding__Group_4__0 )? ) )
            // InternalJavaFXLang.g:6708:1: ( ( rule__Binding__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:6708:1: ( ( rule__Binding__Group_4__0 )? )
            // InternalJavaFXLang.g:6709:2: ( rule__Binding__Group_4__0 )?
            {
             before(grammarAccess.getBindingAccess().getGroup_4()); 
            // InternalJavaFXLang.g:6710:2: ( rule__Binding__Group_4__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=19 && LA66_0<=25)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalJavaFXLang.g:6710:3: rule__Binding__Group_4__0
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
    // InternalJavaFXLang.g:6718:1: rule__Binding__Group__5 : rule__Binding__Group__5__Impl ;
    public final void rule__Binding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6722:1: ( rule__Binding__Group__5__Impl )
            // InternalJavaFXLang.g:6723:2: rule__Binding__Group__5__Impl
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
    // InternalJavaFXLang.g:6729:1: rule__Binding__Group__5__Impl : ( '}' ) ;
    public final void rule__Binding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6733:1: ( ( '}' ) )
            // InternalJavaFXLang.g:6734:1: ( '}' )
            {
            // InternalJavaFXLang.g:6734:1: ( '}' )
            // InternalJavaFXLang.g:6735:2: '}'
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
    // InternalJavaFXLang.g:6745:1: rule__Binding__Group_4__0 : rule__Binding__Group_4__0__Impl rule__Binding__Group_4__1 ;
    public final void rule__Binding__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6749:1: ( rule__Binding__Group_4__0__Impl rule__Binding__Group_4__1 )
            // InternalJavaFXLang.g:6750:2: rule__Binding__Group_4__0__Impl rule__Binding__Group_4__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalJavaFXLang.g:6757:1: rule__Binding__Group_4__0__Impl : ( ( rule__Binding__PropertyAssignment_4_0 ) ) ;
    public final void rule__Binding__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6761:1: ( ( ( rule__Binding__PropertyAssignment_4_0 ) ) )
            // InternalJavaFXLang.g:6762:1: ( ( rule__Binding__PropertyAssignment_4_0 ) )
            {
            // InternalJavaFXLang.g:6762:1: ( ( rule__Binding__PropertyAssignment_4_0 ) )
            // InternalJavaFXLang.g:6763:2: ( rule__Binding__PropertyAssignment_4_0 )
            {
             before(grammarAccess.getBindingAccess().getPropertyAssignment_4_0()); 
            // InternalJavaFXLang.g:6764:2: ( rule__Binding__PropertyAssignment_4_0 )
            // InternalJavaFXLang.g:6764:3: rule__Binding__PropertyAssignment_4_0
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
    // InternalJavaFXLang.g:6772:1: rule__Binding__Group_4__1 : rule__Binding__Group_4__1__Impl ;
    public final void rule__Binding__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6776:1: ( rule__Binding__Group_4__1__Impl )
            // InternalJavaFXLang.g:6777:2: rule__Binding__Group_4__1__Impl
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
    // InternalJavaFXLang.g:6783:1: rule__Binding__Group_4__1__Impl : ( ( rule__Binding__PropertyAssignment_4_1 )* ) ;
    public final void rule__Binding__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6787:1: ( ( ( rule__Binding__PropertyAssignment_4_1 )* ) )
            // InternalJavaFXLang.g:6788:1: ( ( rule__Binding__PropertyAssignment_4_1 )* )
            {
            // InternalJavaFXLang.g:6788:1: ( ( rule__Binding__PropertyAssignment_4_1 )* )
            // InternalJavaFXLang.g:6789:2: ( rule__Binding__PropertyAssignment_4_1 )*
            {
             before(grammarAccess.getBindingAccess().getPropertyAssignment_4_1()); 
            // InternalJavaFXLang.g:6790:2: ( rule__Binding__PropertyAssignment_4_1 )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=19 && LA67_0<=25)) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalJavaFXLang.g:6790:3: rule__Binding__PropertyAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Binding__PropertyAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop67;
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
    // InternalJavaFXLang.g:6799:1: rule__BindingProperty__Group__0 : rule__BindingProperty__Group__0__Impl rule__BindingProperty__Group__1 ;
    public final void rule__BindingProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6803:1: ( rule__BindingProperty__Group__0__Impl rule__BindingProperty__Group__1 )
            // InternalJavaFXLang.g:6804:2: rule__BindingProperty__Group__0__Impl rule__BindingProperty__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalJavaFXLang.g:6811:1: rule__BindingProperty__Group__0__Impl : ( () ) ;
    public final void rule__BindingProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6815:1: ( ( () ) )
            // InternalJavaFXLang.g:6816:1: ( () )
            {
            // InternalJavaFXLang.g:6816:1: ( () )
            // InternalJavaFXLang.g:6817:2: ()
            {
             before(grammarAccess.getBindingPropertyAccess().getBindingPropertyAction_0()); 
            // InternalJavaFXLang.g:6818:2: ()
            // InternalJavaFXLang.g:6818:3: 
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
    // InternalJavaFXLang.g:6826:1: rule__BindingProperty__Group__1 : rule__BindingProperty__Group__1__Impl rule__BindingProperty__Group__2 ;
    public final void rule__BindingProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6830:1: ( rule__BindingProperty__Group__1__Impl rule__BindingProperty__Group__2 )
            // InternalJavaFXLang.g:6831:2: rule__BindingProperty__Group__1__Impl rule__BindingProperty__Group__2
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
    // InternalJavaFXLang.g:6838:1: rule__BindingProperty__Group__1__Impl : ( ( rule__BindingProperty__TypeAssignment_1 ) ) ;
    public final void rule__BindingProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6842:1: ( ( ( rule__BindingProperty__TypeAssignment_1 ) ) )
            // InternalJavaFXLang.g:6843:1: ( ( rule__BindingProperty__TypeAssignment_1 ) )
            {
            // InternalJavaFXLang.g:6843:1: ( ( rule__BindingProperty__TypeAssignment_1 ) )
            // InternalJavaFXLang.g:6844:2: ( rule__BindingProperty__TypeAssignment_1 )
            {
             before(grammarAccess.getBindingPropertyAccess().getTypeAssignment_1()); 
            // InternalJavaFXLang.g:6845:2: ( rule__BindingProperty__TypeAssignment_1 )
            // InternalJavaFXLang.g:6845:3: rule__BindingProperty__TypeAssignment_1
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
    // InternalJavaFXLang.g:6853:1: rule__BindingProperty__Group__2 : rule__BindingProperty__Group__2__Impl ;
    public final void rule__BindingProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6857:1: ( rule__BindingProperty__Group__2__Impl )
            // InternalJavaFXLang.g:6858:2: rule__BindingProperty__Group__2__Impl
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
    // InternalJavaFXLang.g:6864:1: rule__BindingProperty__Group__2__Impl : ( ( rule__BindingProperty__NameAssignment_2 ) ) ;
    public final void rule__BindingProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6868:1: ( ( ( rule__BindingProperty__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:6869:1: ( ( rule__BindingProperty__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:6869:1: ( ( rule__BindingProperty__NameAssignment_2 ) )
            // InternalJavaFXLang.g:6870:2: ( rule__BindingProperty__NameAssignment_2 )
            {
             before(grammarAccess.getBindingPropertyAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:6871:2: ( rule__BindingProperty__NameAssignment_2 )
            // InternalJavaFXLang.g:6871:3: rule__BindingProperty__NameAssignment_2
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
    // InternalJavaFXLang.g:6880:1: rule__FilteredTableViewFX__Group__0 : rule__FilteredTableViewFX__Group__0__Impl rule__FilteredTableViewFX__Group__1 ;
    public final void rule__FilteredTableViewFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6884:1: ( rule__FilteredTableViewFX__Group__0__Impl rule__FilteredTableViewFX__Group__1 )
            // InternalJavaFXLang.g:6885:2: rule__FilteredTableViewFX__Group__0__Impl rule__FilteredTableViewFX__Group__1
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
    // InternalJavaFXLang.g:6892:1: rule__FilteredTableViewFX__Group__0__Impl : ( () ) ;
    public final void rule__FilteredTableViewFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6896:1: ( ( () ) )
            // InternalJavaFXLang.g:6897:1: ( () )
            {
            // InternalJavaFXLang.g:6897:1: ( () )
            // InternalJavaFXLang.g:6898:2: ()
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getFilteredTableViewFXAction_0()); 
            // InternalJavaFXLang.g:6899:2: ()
            // InternalJavaFXLang.g:6899:3: 
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
    // InternalJavaFXLang.g:6907:1: rule__FilteredTableViewFX__Group__1 : rule__FilteredTableViewFX__Group__1__Impl rule__FilteredTableViewFX__Group__2 ;
    public final void rule__FilteredTableViewFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6911:1: ( rule__FilteredTableViewFX__Group__1__Impl rule__FilteredTableViewFX__Group__2 )
            // InternalJavaFXLang.g:6912:2: rule__FilteredTableViewFX__Group__1__Impl rule__FilteredTableViewFX__Group__2
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
    // InternalJavaFXLang.g:6919:1: rule__FilteredTableViewFX__Group__1__Impl : ( 'FilteredTableView' ) ;
    public final void rule__FilteredTableViewFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6923:1: ( ( 'FilteredTableView' ) )
            // InternalJavaFXLang.g:6924:1: ( 'FilteredTableView' )
            {
            // InternalJavaFXLang.g:6924:1: ( 'FilteredTableView' )
            // InternalJavaFXLang.g:6925:2: 'FilteredTableView'
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getFilteredTableViewKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalJavaFXLang.g:6934:1: rule__FilteredTableViewFX__Group__2 : rule__FilteredTableViewFX__Group__2__Impl rule__FilteredTableViewFX__Group__3 ;
    public final void rule__FilteredTableViewFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6938:1: ( rule__FilteredTableViewFX__Group__2__Impl rule__FilteredTableViewFX__Group__3 )
            // InternalJavaFXLang.g:6939:2: rule__FilteredTableViewFX__Group__2__Impl rule__FilteredTableViewFX__Group__3
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
    // InternalJavaFXLang.g:6946:1: rule__FilteredTableViewFX__Group__2__Impl : ( '{' ) ;
    public final void rule__FilteredTableViewFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6950:1: ( ( '{' ) )
            // InternalJavaFXLang.g:6951:1: ( '{' )
            {
            // InternalJavaFXLang.g:6951:1: ( '{' )
            // InternalJavaFXLang.g:6952:2: '{'
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
    // InternalJavaFXLang.g:6961:1: rule__FilteredTableViewFX__Group__3 : rule__FilteredTableViewFX__Group__3__Impl rule__FilteredTableViewFX__Group__4 ;
    public final void rule__FilteredTableViewFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6965:1: ( rule__FilteredTableViewFX__Group__3__Impl rule__FilteredTableViewFX__Group__4 )
            // InternalJavaFXLang.g:6966:2: rule__FilteredTableViewFX__Group__3__Impl rule__FilteredTableViewFX__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalJavaFXLang.g:6973:1: rule__FilteredTableViewFX__Group__3__Impl : ( ( rule__FilteredTableViewFX__Group_3__0 ) ) ;
    public final void rule__FilteredTableViewFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6977:1: ( ( ( rule__FilteredTableViewFX__Group_3__0 ) ) )
            // InternalJavaFXLang.g:6978:1: ( ( rule__FilteredTableViewFX__Group_3__0 ) )
            {
            // InternalJavaFXLang.g:6978:1: ( ( rule__FilteredTableViewFX__Group_3__0 ) )
            // InternalJavaFXLang.g:6979:2: ( rule__FilteredTableViewFX__Group_3__0 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup_3()); 
            // InternalJavaFXLang.g:6980:2: ( rule__FilteredTableViewFX__Group_3__0 )
            // InternalJavaFXLang.g:6980:3: rule__FilteredTableViewFX__Group_3__0
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
    // InternalJavaFXLang.g:6988:1: rule__FilteredTableViewFX__Group__4 : rule__FilteredTableViewFX__Group__4__Impl rule__FilteredTableViewFX__Group__5 ;
    public final void rule__FilteredTableViewFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6992:1: ( rule__FilteredTableViewFX__Group__4__Impl rule__FilteredTableViewFX__Group__5 )
            // InternalJavaFXLang.g:6993:2: rule__FilteredTableViewFX__Group__4__Impl rule__FilteredTableViewFX__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalJavaFXLang.g:7000:1: rule__FilteredTableViewFX__Group__4__Impl : ( ( rule__FilteredTableViewFX__Group_4__0 )? ) ;
    public final void rule__FilteredTableViewFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7004:1: ( ( ( rule__FilteredTableViewFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:7005:1: ( ( rule__FilteredTableViewFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:7005:1: ( ( rule__FilteredTableViewFX__Group_4__0 )? )
            // InternalJavaFXLang.g:7006:2: ( rule__FilteredTableViewFX__Group_4__0 )?
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:7007:2: ( rule__FilteredTableViewFX__Group_4__0 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==51) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalJavaFXLang.g:7007:3: rule__FilteredTableViewFX__Group_4__0
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
    // InternalJavaFXLang.g:7015:1: rule__FilteredTableViewFX__Group__5 : rule__FilteredTableViewFX__Group__5__Impl rule__FilteredTableViewFX__Group__6 ;
    public final void rule__FilteredTableViewFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7019:1: ( rule__FilteredTableViewFX__Group__5__Impl rule__FilteredTableViewFX__Group__6 )
            // InternalJavaFXLang.g:7020:2: rule__FilteredTableViewFX__Group__5__Impl rule__FilteredTableViewFX__Group__6
            {
            pushFollow(FOLLOW_32);
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
    // InternalJavaFXLang.g:7027:1: rule__FilteredTableViewFX__Group__5__Impl : ( ( rule__FilteredTableViewFX__Group_5__0 )? ) ;
    public final void rule__FilteredTableViewFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7031:1: ( ( ( rule__FilteredTableViewFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:7032:1: ( ( rule__FilteredTableViewFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:7032:1: ( ( rule__FilteredTableViewFX__Group_5__0 )? )
            // InternalJavaFXLang.g:7033:2: ( rule__FilteredTableViewFX__Group_5__0 )?
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:7034:2: ( rule__FilteredTableViewFX__Group_5__0 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==52) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalJavaFXLang.g:7034:3: rule__FilteredTableViewFX__Group_5__0
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
    // InternalJavaFXLang.g:7042:1: rule__FilteredTableViewFX__Group__6 : rule__FilteredTableViewFX__Group__6__Impl rule__FilteredTableViewFX__Group__7 ;
    public final void rule__FilteredTableViewFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7046:1: ( rule__FilteredTableViewFX__Group__6__Impl rule__FilteredTableViewFX__Group__7 )
            // InternalJavaFXLang.g:7047:2: rule__FilteredTableViewFX__Group__6__Impl rule__FilteredTableViewFX__Group__7
            {
            pushFollow(FOLLOW_32);
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
    // InternalJavaFXLang.g:7054:1: rule__FilteredTableViewFX__Group__6__Impl : ( ( rule__FilteredTableViewFX__Group_6__0 )? ) ;
    public final void rule__FilteredTableViewFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7058:1: ( ( ( rule__FilteredTableViewFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:7059:1: ( ( rule__FilteredTableViewFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:7059:1: ( ( rule__FilteredTableViewFX__Group_6__0 )? )
            // InternalJavaFXLang.g:7060:2: ( rule__FilteredTableViewFX__Group_6__0 )?
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:7061:2: ( rule__FilteredTableViewFX__Group_6__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==56) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalJavaFXLang.g:7061:3: rule__FilteredTableViewFX__Group_6__0
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
    // InternalJavaFXLang.g:7069:1: rule__FilteredTableViewFX__Group__7 : rule__FilteredTableViewFX__Group__7__Impl ;
    public final void rule__FilteredTableViewFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7073:1: ( rule__FilteredTableViewFX__Group__7__Impl )
            // InternalJavaFXLang.g:7074:2: rule__FilteredTableViewFX__Group__7__Impl
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
    // InternalJavaFXLang.g:7080:1: rule__FilteredTableViewFX__Group__7__Impl : ( '}' ) ;
    public final void rule__FilteredTableViewFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7084:1: ( ( '}' ) )
            // InternalJavaFXLang.g:7085:1: ( '}' )
            {
            // InternalJavaFXLang.g:7085:1: ( '}' )
            // InternalJavaFXLang.g:7086:2: '}'
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
    // InternalJavaFXLang.g:7096:1: rule__FilteredTableViewFX__Group_3__0 : rule__FilteredTableViewFX__Group_3__0__Impl rule__FilteredTableViewFX__Group_3__1 ;
    public final void rule__FilteredTableViewFX__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7100:1: ( rule__FilteredTableViewFX__Group_3__0__Impl rule__FilteredTableViewFX__Group_3__1 )
            // InternalJavaFXLang.g:7101:2: rule__FilteredTableViewFX__Group_3__0__Impl rule__FilteredTableViewFX__Group_3__1
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
    // InternalJavaFXLang.g:7108:1: rule__FilteredTableViewFX__Group_3__0__Impl : ( 'name:' ) ;
    public final void rule__FilteredTableViewFX__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7112:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:7113:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:7113:1: ( 'name:' )
            // InternalJavaFXLang.g:7114:2: 'name:'
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
    // InternalJavaFXLang.g:7123:1: rule__FilteredTableViewFX__Group_3__1 : rule__FilteredTableViewFX__Group_3__1__Impl ;
    public final void rule__FilteredTableViewFX__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7127:1: ( rule__FilteredTableViewFX__Group_3__1__Impl )
            // InternalJavaFXLang.g:7128:2: rule__FilteredTableViewFX__Group_3__1__Impl
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
    // InternalJavaFXLang.g:7134:1: rule__FilteredTableViewFX__Group_3__1__Impl : ( ( rule__FilteredTableViewFX__NameAssignment_3_1 ) ) ;
    public final void rule__FilteredTableViewFX__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7138:1: ( ( ( rule__FilteredTableViewFX__NameAssignment_3_1 ) ) )
            // InternalJavaFXLang.g:7139:1: ( ( rule__FilteredTableViewFX__NameAssignment_3_1 ) )
            {
            // InternalJavaFXLang.g:7139:1: ( ( rule__FilteredTableViewFX__NameAssignment_3_1 ) )
            // InternalJavaFXLang.g:7140:2: ( rule__FilteredTableViewFX__NameAssignment_3_1 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getNameAssignment_3_1()); 
            // InternalJavaFXLang.g:7141:2: ( rule__FilteredTableViewFX__NameAssignment_3_1 )
            // InternalJavaFXLang.g:7141:3: rule__FilteredTableViewFX__NameAssignment_3_1
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
    // InternalJavaFXLang.g:7150:1: rule__FilteredTableViewFX__Group_4__0 : rule__FilteredTableViewFX__Group_4__0__Impl rule__FilteredTableViewFX__Group_4__1 ;
    public final void rule__FilteredTableViewFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7154:1: ( rule__FilteredTableViewFX__Group_4__0__Impl rule__FilteredTableViewFX__Group_4__1 )
            // InternalJavaFXLang.g:7155:2: rule__FilteredTableViewFX__Group_4__0__Impl rule__FilteredTableViewFX__Group_4__1
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
    // InternalJavaFXLang.g:7162:1: rule__FilteredTableViewFX__Group_4__0__Impl : ( 'usedModel:' ) ;
    public final void rule__FilteredTableViewFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7166:1: ( ( 'usedModel:' ) )
            // InternalJavaFXLang.g:7167:1: ( 'usedModel:' )
            {
            // InternalJavaFXLang.g:7167:1: ( 'usedModel:' )
            // InternalJavaFXLang.g:7168:2: 'usedModel:'
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUsedModelKeyword_4_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalJavaFXLang.g:7177:1: rule__FilteredTableViewFX__Group_4__1 : rule__FilteredTableViewFX__Group_4__1__Impl ;
    public final void rule__FilteredTableViewFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7181:1: ( rule__FilteredTableViewFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:7182:2: rule__FilteredTableViewFX__Group_4__1__Impl
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
    // InternalJavaFXLang.g:7188:1: rule__FilteredTableViewFX__Group_4__1__Impl : ( ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 ) ) ;
    public final void rule__FilteredTableViewFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7192:1: ( ( ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:7193:1: ( ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:7193:1: ( ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 ) )
            // InternalJavaFXLang.g:7194:2: ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUsedModelAssignment_4_1()); 
            // InternalJavaFXLang.g:7195:2: ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 )
            // InternalJavaFXLang.g:7195:3: rule__FilteredTableViewFX__UsedModelAssignment_4_1
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
    // InternalJavaFXLang.g:7204:1: rule__FilteredTableViewFX__Group_5__0 : rule__FilteredTableViewFX__Group_5__0__Impl rule__FilteredTableViewFX__Group_5__1 ;
    public final void rule__FilteredTableViewFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7208:1: ( rule__FilteredTableViewFX__Group_5__0__Impl rule__FilteredTableViewFX__Group_5__1 )
            // InternalJavaFXLang.g:7209:2: rule__FilteredTableViewFX__Group_5__0__Impl rule__FilteredTableViewFX__Group_5__1
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
    // InternalJavaFXLang.g:7216:1: rule__FilteredTableViewFX__Group_5__0__Impl : ( 'usedFilter:' ) ;
    public final void rule__FilteredTableViewFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7220:1: ( ( 'usedFilter:' ) )
            // InternalJavaFXLang.g:7221:1: ( 'usedFilter:' )
            {
            // InternalJavaFXLang.g:7221:1: ( 'usedFilter:' )
            // InternalJavaFXLang.g:7222:2: 'usedFilter:'
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUsedFilterKeyword_5_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalJavaFXLang.g:7231:1: rule__FilteredTableViewFX__Group_5__1 : rule__FilteredTableViewFX__Group_5__1__Impl ;
    public final void rule__FilteredTableViewFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7235:1: ( rule__FilteredTableViewFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:7236:2: rule__FilteredTableViewFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:7242:1: rule__FilteredTableViewFX__Group_5__1__Impl : ( ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 ) ) ;
    public final void rule__FilteredTableViewFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7246:1: ( ( ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:7247:1: ( ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:7247:1: ( ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 ) )
            // InternalJavaFXLang.g:7248:2: ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUseFilterAssignment_5_1()); 
            // InternalJavaFXLang.g:7249:2: ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 )
            // InternalJavaFXLang.g:7249:3: rule__FilteredTableViewFX__UseFilterAssignment_5_1
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
    // InternalJavaFXLang.g:7258:1: rule__FilteredTableViewFX__Group_6__0 : rule__FilteredTableViewFX__Group_6__0__Impl rule__FilteredTableViewFX__Group_6__1 ;
    public final void rule__FilteredTableViewFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7262:1: ( rule__FilteredTableViewFX__Group_6__0__Impl rule__FilteredTableViewFX__Group_6__1 )
            // InternalJavaFXLang.g:7263:2: rule__FilteredTableViewFX__Group_6__0__Impl rule__FilteredTableViewFX__Group_6__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalJavaFXLang.g:7270:1: rule__FilteredTableViewFX__Group_6__0__Impl : ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 ) ) ;
    public final void rule__FilteredTableViewFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7274:1: ( ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 ) ) )
            // InternalJavaFXLang.g:7275:1: ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 ) )
            {
            // InternalJavaFXLang.g:7275:1: ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 ) )
            // InternalJavaFXLang.g:7276:2: ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getColumnsAssignment_6_0()); 
            // InternalJavaFXLang.g:7277:2: ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 )
            // InternalJavaFXLang.g:7277:3: rule__FilteredTableViewFX__ColumnsAssignment_6_0
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
    // InternalJavaFXLang.g:7285:1: rule__FilteredTableViewFX__Group_6__1 : rule__FilteredTableViewFX__Group_6__1__Impl ;
    public final void rule__FilteredTableViewFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7289:1: ( rule__FilteredTableViewFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:7290:2: rule__FilteredTableViewFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:7296:1: rule__FilteredTableViewFX__Group_6__1__Impl : ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )* ) ;
    public final void rule__FilteredTableViewFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7300:1: ( ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )* ) )
            // InternalJavaFXLang.g:7301:1: ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )* )
            {
            // InternalJavaFXLang.g:7301:1: ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )* )
            // InternalJavaFXLang.g:7302:2: ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )*
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getColumnsAssignment_6_1()); 
            // InternalJavaFXLang.g:7303:2: ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==56) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalJavaFXLang.g:7303:3: rule__FilteredTableViewFX__ColumnsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__FilteredTableViewFX__ColumnsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop71;
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
    // InternalJavaFXLang.g:7312:1: rule__DerivedBean__Group__0 : rule__DerivedBean__Group__0__Impl rule__DerivedBean__Group__1 ;
    public final void rule__DerivedBean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7316:1: ( rule__DerivedBean__Group__0__Impl rule__DerivedBean__Group__1 )
            // InternalJavaFXLang.g:7317:2: rule__DerivedBean__Group__0__Impl rule__DerivedBean__Group__1
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
    // InternalJavaFXLang.g:7324:1: rule__DerivedBean__Group__0__Impl : ( () ) ;
    public final void rule__DerivedBean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7328:1: ( ( () ) )
            // InternalJavaFXLang.g:7329:1: ( () )
            {
            // InternalJavaFXLang.g:7329:1: ( () )
            // InternalJavaFXLang.g:7330:2: ()
            {
             before(grammarAccess.getDerivedBeanAccess().getDerivedBeanAction_0()); 
            // InternalJavaFXLang.g:7331:2: ()
            // InternalJavaFXLang.g:7331:3: 
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
    // InternalJavaFXLang.g:7339:1: rule__DerivedBean__Group__1 : rule__DerivedBean__Group__1__Impl rule__DerivedBean__Group__2 ;
    public final void rule__DerivedBean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7343:1: ( rule__DerivedBean__Group__1__Impl rule__DerivedBean__Group__2 )
            // InternalJavaFXLang.g:7344:2: rule__DerivedBean__Group__1__Impl rule__DerivedBean__Group__2
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
    // InternalJavaFXLang.g:7351:1: rule__DerivedBean__Group__1__Impl : ( 'class' ) ;
    public final void rule__DerivedBean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7355:1: ( ( 'class' ) )
            // InternalJavaFXLang.g:7356:1: ( 'class' )
            {
            // InternalJavaFXLang.g:7356:1: ( 'class' )
            // InternalJavaFXLang.g:7357:2: 'class'
            {
             before(grammarAccess.getDerivedBeanAccess().getClassKeyword_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalJavaFXLang.g:7366:1: rule__DerivedBean__Group__2 : rule__DerivedBean__Group__2__Impl rule__DerivedBean__Group__3 ;
    public final void rule__DerivedBean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7370:1: ( rule__DerivedBean__Group__2__Impl rule__DerivedBean__Group__3 )
            // InternalJavaFXLang.g:7371:2: rule__DerivedBean__Group__2__Impl rule__DerivedBean__Group__3
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
    // InternalJavaFXLang.g:7378:1: rule__DerivedBean__Group__2__Impl : ( ( rule__DerivedBean__NameAssignment_2 ) ) ;
    public final void rule__DerivedBean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7382:1: ( ( ( rule__DerivedBean__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:7383:1: ( ( rule__DerivedBean__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:7383:1: ( ( rule__DerivedBean__NameAssignment_2 ) )
            // InternalJavaFXLang.g:7384:2: ( rule__DerivedBean__NameAssignment_2 )
            {
             before(grammarAccess.getDerivedBeanAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:7385:2: ( rule__DerivedBean__NameAssignment_2 )
            // InternalJavaFXLang.g:7385:3: rule__DerivedBean__NameAssignment_2
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
    // InternalJavaFXLang.g:7393:1: rule__DerivedBean__Group__3 : rule__DerivedBean__Group__3__Impl rule__DerivedBean__Group__4 ;
    public final void rule__DerivedBean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7397:1: ( rule__DerivedBean__Group__3__Impl rule__DerivedBean__Group__4 )
            // InternalJavaFXLang.g:7398:2: rule__DerivedBean__Group__3__Impl rule__DerivedBean__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalJavaFXLang.g:7405:1: rule__DerivedBean__Group__3__Impl : ( '{' ) ;
    public final void rule__DerivedBean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7409:1: ( ( '{' ) )
            // InternalJavaFXLang.g:7410:1: ( '{' )
            {
            // InternalJavaFXLang.g:7410:1: ( '{' )
            // InternalJavaFXLang.g:7411:2: '{'
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
    // InternalJavaFXLang.g:7420:1: rule__DerivedBean__Group__4 : rule__DerivedBean__Group__4__Impl rule__DerivedBean__Group__5 ;
    public final void rule__DerivedBean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7424:1: ( rule__DerivedBean__Group__4__Impl rule__DerivedBean__Group__5 )
            // InternalJavaFXLang.g:7425:2: rule__DerivedBean__Group__4__Impl rule__DerivedBean__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalJavaFXLang.g:7432:1: rule__DerivedBean__Group__4__Impl : ( ( rule__DerivedBean__Group_4__0 ) ) ;
    public final void rule__DerivedBean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7436:1: ( ( ( rule__DerivedBean__Group_4__0 ) ) )
            // InternalJavaFXLang.g:7437:1: ( ( rule__DerivedBean__Group_4__0 ) )
            {
            // InternalJavaFXLang.g:7437:1: ( ( rule__DerivedBean__Group_4__0 ) )
            // InternalJavaFXLang.g:7438:2: ( rule__DerivedBean__Group_4__0 )
            {
             before(grammarAccess.getDerivedBeanAccess().getGroup_4()); 
            // InternalJavaFXLang.g:7439:2: ( rule__DerivedBean__Group_4__0 )
            // InternalJavaFXLang.g:7439:3: rule__DerivedBean__Group_4__0
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
    // InternalJavaFXLang.g:7447:1: rule__DerivedBean__Group__5 : rule__DerivedBean__Group__5__Impl rule__DerivedBean__Group__6 ;
    public final void rule__DerivedBean__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7451:1: ( rule__DerivedBean__Group__5__Impl rule__DerivedBean__Group__6 )
            // InternalJavaFXLang.g:7452:2: rule__DerivedBean__Group__5__Impl rule__DerivedBean__Group__6
            {
            pushFollow(FOLLOW_36);
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
    // InternalJavaFXLang.g:7459:1: rule__DerivedBean__Group__5__Impl : ( ( rule__DerivedBean__Group_5__0 )? ) ;
    public final void rule__DerivedBean__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7463:1: ( ( ( rule__DerivedBean__Group_5__0 )? ) )
            // InternalJavaFXLang.g:7464:1: ( ( rule__DerivedBean__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:7464:1: ( ( rule__DerivedBean__Group_5__0 )? )
            // InternalJavaFXLang.g:7465:2: ( rule__DerivedBean__Group_5__0 )?
            {
             before(grammarAccess.getDerivedBeanAccess().getGroup_5()); 
            // InternalJavaFXLang.g:7466:2: ( rule__DerivedBean__Group_5__0 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=RULE_STRING && LA72_0<=RULE_ID)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalJavaFXLang.g:7466:3: rule__DerivedBean__Group_5__0
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
    // InternalJavaFXLang.g:7474:1: rule__DerivedBean__Group__6 : rule__DerivedBean__Group__6__Impl ;
    public final void rule__DerivedBean__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7478:1: ( rule__DerivedBean__Group__6__Impl )
            // InternalJavaFXLang.g:7479:2: rule__DerivedBean__Group__6__Impl
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
    // InternalJavaFXLang.g:7485:1: rule__DerivedBean__Group__6__Impl : ( '}' ) ;
    public final void rule__DerivedBean__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7489:1: ( ( '}' ) )
            // InternalJavaFXLang.g:7490:1: ( '}' )
            {
            // InternalJavaFXLang.g:7490:1: ( '}' )
            // InternalJavaFXLang.g:7491:2: '}'
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
    // InternalJavaFXLang.g:7501:1: rule__DerivedBean__Group_4__0 : rule__DerivedBean__Group_4__0__Impl rule__DerivedBean__Group_4__1 ;
    public final void rule__DerivedBean__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7505:1: ( rule__DerivedBean__Group_4__0__Impl rule__DerivedBean__Group_4__1 )
            // InternalJavaFXLang.g:7506:2: rule__DerivedBean__Group_4__0__Impl rule__DerivedBean__Group_4__1
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
    // InternalJavaFXLang.g:7513:1: rule__DerivedBean__Group_4__0__Impl : ( 'instanceType:' ) ;
    public final void rule__DerivedBean__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7517:1: ( ( 'instanceType:' ) )
            // InternalJavaFXLang.g:7518:1: ( 'instanceType:' )
            {
            // InternalJavaFXLang.g:7518:1: ( 'instanceType:' )
            // InternalJavaFXLang.g:7519:2: 'instanceType:'
            {
             before(grammarAccess.getDerivedBeanAccess().getInstanceTypeKeyword_4_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalJavaFXLang.g:7528:1: rule__DerivedBean__Group_4__1 : rule__DerivedBean__Group_4__1__Impl ;
    public final void rule__DerivedBean__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7532:1: ( rule__DerivedBean__Group_4__1__Impl )
            // InternalJavaFXLang.g:7533:2: rule__DerivedBean__Group_4__1__Impl
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
    // InternalJavaFXLang.g:7539:1: rule__DerivedBean__Group_4__1__Impl : ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) ) ;
    public final void rule__DerivedBean__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7543:1: ( ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:7544:1: ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:7544:1: ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) )
            // InternalJavaFXLang.g:7545:2: ( rule__DerivedBean__InstanceTypeAssignment_4_1 )
            {
             before(grammarAccess.getDerivedBeanAccess().getInstanceTypeAssignment_4_1()); 
            // InternalJavaFXLang.g:7546:2: ( rule__DerivedBean__InstanceTypeAssignment_4_1 )
            // InternalJavaFXLang.g:7546:3: rule__DerivedBean__InstanceTypeAssignment_4_1
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
    // InternalJavaFXLang.g:7555:1: rule__DerivedBean__Group_5__0 : rule__DerivedBean__Group_5__0__Impl rule__DerivedBean__Group_5__1 ;
    public final void rule__DerivedBean__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7559:1: ( rule__DerivedBean__Group_5__0__Impl rule__DerivedBean__Group_5__1 )
            // InternalJavaFXLang.g:7560:2: rule__DerivedBean__Group_5__0__Impl rule__DerivedBean__Group_5__1
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
    // InternalJavaFXLang.g:7567:1: rule__DerivedBean__Group_5__0__Impl : ( ( rule__DerivedBean__AttributesAssignment_5_0 ) ) ;
    public final void rule__DerivedBean__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7571:1: ( ( ( rule__DerivedBean__AttributesAssignment_5_0 ) ) )
            // InternalJavaFXLang.g:7572:1: ( ( rule__DerivedBean__AttributesAssignment_5_0 ) )
            {
            // InternalJavaFXLang.g:7572:1: ( ( rule__DerivedBean__AttributesAssignment_5_0 ) )
            // InternalJavaFXLang.g:7573:2: ( rule__DerivedBean__AttributesAssignment_5_0 )
            {
             before(grammarAccess.getDerivedBeanAccess().getAttributesAssignment_5_0()); 
            // InternalJavaFXLang.g:7574:2: ( rule__DerivedBean__AttributesAssignment_5_0 )
            // InternalJavaFXLang.g:7574:3: rule__DerivedBean__AttributesAssignment_5_0
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
    // InternalJavaFXLang.g:7582:1: rule__DerivedBean__Group_5__1 : rule__DerivedBean__Group_5__1__Impl ;
    public final void rule__DerivedBean__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7586:1: ( rule__DerivedBean__Group_5__1__Impl )
            // InternalJavaFXLang.g:7587:2: rule__DerivedBean__Group_5__1__Impl
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
    // InternalJavaFXLang.g:7593:1: rule__DerivedBean__Group_5__1__Impl : ( ( rule__DerivedBean__AttributesAssignment_5_1 )* ) ;
    public final void rule__DerivedBean__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7597:1: ( ( ( rule__DerivedBean__AttributesAssignment_5_1 )* ) )
            // InternalJavaFXLang.g:7598:1: ( ( rule__DerivedBean__AttributesAssignment_5_1 )* )
            {
            // InternalJavaFXLang.g:7598:1: ( ( rule__DerivedBean__AttributesAssignment_5_1 )* )
            // InternalJavaFXLang.g:7599:2: ( rule__DerivedBean__AttributesAssignment_5_1 )*
            {
             before(grammarAccess.getDerivedBeanAccess().getAttributesAssignment_5_1()); 
            // InternalJavaFXLang.g:7600:2: ( rule__DerivedBean__AttributesAssignment_5_1 )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( ((LA73_0>=RULE_STRING && LA73_0<=RULE_ID)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalJavaFXLang.g:7600:3: rule__DerivedBean__AttributesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__DerivedBean__AttributesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop73;
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
    // InternalJavaFXLang.g:7609:1: rule__Bean__Group__0 : rule__Bean__Group__0__Impl rule__Bean__Group__1 ;
    public final void rule__Bean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7613:1: ( rule__Bean__Group__0__Impl rule__Bean__Group__1 )
            // InternalJavaFXLang.g:7614:2: rule__Bean__Group__0__Impl rule__Bean__Group__1
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
    // InternalJavaFXLang.g:7621:1: rule__Bean__Group__0__Impl : ( () ) ;
    public final void rule__Bean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7625:1: ( ( () ) )
            // InternalJavaFXLang.g:7626:1: ( () )
            {
            // InternalJavaFXLang.g:7626:1: ( () )
            // InternalJavaFXLang.g:7627:2: ()
            {
             before(grammarAccess.getBeanAccess().getBeanAction_0()); 
            // InternalJavaFXLang.g:7628:2: ()
            // InternalJavaFXLang.g:7628:3: 
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
    // InternalJavaFXLang.g:7636:1: rule__Bean__Group__1 : rule__Bean__Group__1__Impl rule__Bean__Group__2 ;
    public final void rule__Bean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7640:1: ( rule__Bean__Group__1__Impl rule__Bean__Group__2 )
            // InternalJavaFXLang.g:7641:2: rule__Bean__Group__1__Impl rule__Bean__Group__2
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
    // InternalJavaFXLang.g:7648:1: rule__Bean__Group__1__Impl : ( 'class' ) ;
    public final void rule__Bean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7652:1: ( ( 'class' ) )
            // InternalJavaFXLang.g:7653:1: ( 'class' )
            {
            // InternalJavaFXLang.g:7653:1: ( 'class' )
            // InternalJavaFXLang.g:7654:2: 'class'
            {
             before(grammarAccess.getBeanAccess().getClassKeyword_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalJavaFXLang.g:7663:1: rule__Bean__Group__2 : rule__Bean__Group__2__Impl rule__Bean__Group__3 ;
    public final void rule__Bean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7667:1: ( rule__Bean__Group__2__Impl rule__Bean__Group__3 )
            // InternalJavaFXLang.g:7668:2: rule__Bean__Group__2__Impl rule__Bean__Group__3
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
    // InternalJavaFXLang.g:7675:1: rule__Bean__Group__2__Impl : ( ( rule__Bean__NameAssignment_2 ) ) ;
    public final void rule__Bean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7679:1: ( ( ( rule__Bean__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:7680:1: ( ( rule__Bean__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:7680:1: ( ( rule__Bean__NameAssignment_2 ) )
            // InternalJavaFXLang.g:7681:2: ( rule__Bean__NameAssignment_2 )
            {
             before(grammarAccess.getBeanAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:7682:2: ( rule__Bean__NameAssignment_2 )
            // InternalJavaFXLang.g:7682:3: rule__Bean__NameAssignment_2
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
    // InternalJavaFXLang.g:7690:1: rule__Bean__Group__3 : rule__Bean__Group__3__Impl rule__Bean__Group__4 ;
    public final void rule__Bean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7694:1: ( rule__Bean__Group__3__Impl rule__Bean__Group__4 )
            // InternalJavaFXLang.g:7695:2: rule__Bean__Group__3__Impl rule__Bean__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalJavaFXLang.g:7702:1: rule__Bean__Group__3__Impl : ( '{' ) ;
    public final void rule__Bean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7706:1: ( ( '{' ) )
            // InternalJavaFXLang.g:7707:1: ( '{' )
            {
            // InternalJavaFXLang.g:7707:1: ( '{' )
            // InternalJavaFXLang.g:7708:2: '{'
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
    // InternalJavaFXLang.g:7717:1: rule__Bean__Group__4 : rule__Bean__Group__4__Impl rule__Bean__Group__5 ;
    public final void rule__Bean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7721:1: ( rule__Bean__Group__4__Impl rule__Bean__Group__5 )
            // InternalJavaFXLang.g:7722:2: rule__Bean__Group__4__Impl rule__Bean__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalJavaFXLang.g:7729:1: rule__Bean__Group__4__Impl : ( ( rule__Bean__Group_4__0 )? ) ;
    public final void rule__Bean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7733:1: ( ( ( rule__Bean__Group_4__0 )? ) )
            // InternalJavaFXLang.g:7734:1: ( ( rule__Bean__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:7734:1: ( ( rule__Bean__Group_4__0 )? )
            // InternalJavaFXLang.g:7735:2: ( rule__Bean__Group_4__0 )?
            {
             before(grammarAccess.getBeanAccess().getGroup_4()); 
            // InternalJavaFXLang.g:7736:2: ( rule__Bean__Group_4__0 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=RULE_STRING && LA74_0<=RULE_ID)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalJavaFXLang.g:7736:3: rule__Bean__Group_4__0
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
    // InternalJavaFXLang.g:7744:1: rule__Bean__Group__5 : rule__Bean__Group__5__Impl ;
    public final void rule__Bean__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7748:1: ( rule__Bean__Group__5__Impl )
            // InternalJavaFXLang.g:7749:2: rule__Bean__Group__5__Impl
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
    // InternalJavaFXLang.g:7755:1: rule__Bean__Group__5__Impl : ( '}' ) ;
    public final void rule__Bean__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7759:1: ( ( '}' ) )
            // InternalJavaFXLang.g:7760:1: ( '}' )
            {
            // InternalJavaFXLang.g:7760:1: ( '}' )
            // InternalJavaFXLang.g:7761:2: '}'
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
    // InternalJavaFXLang.g:7771:1: rule__Bean__Group_4__0 : rule__Bean__Group_4__0__Impl rule__Bean__Group_4__1 ;
    public final void rule__Bean__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7775:1: ( rule__Bean__Group_4__0__Impl rule__Bean__Group_4__1 )
            // InternalJavaFXLang.g:7776:2: rule__Bean__Group_4__0__Impl rule__Bean__Group_4__1
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
    // InternalJavaFXLang.g:7783:1: rule__Bean__Group_4__0__Impl : ( ( rule__Bean__AttributesAssignment_4_0 ) ) ;
    public final void rule__Bean__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7787:1: ( ( ( rule__Bean__AttributesAssignment_4_0 ) ) )
            // InternalJavaFXLang.g:7788:1: ( ( rule__Bean__AttributesAssignment_4_0 ) )
            {
            // InternalJavaFXLang.g:7788:1: ( ( rule__Bean__AttributesAssignment_4_0 ) )
            // InternalJavaFXLang.g:7789:2: ( rule__Bean__AttributesAssignment_4_0 )
            {
             before(grammarAccess.getBeanAccess().getAttributesAssignment_4_0()); 
            // InternalJavaFXLang.g:7790:2: ( rule__Bean__AttributesAssignment_4_0 )
            // InternalJavaFXLang.g:7790:3: rule__Bean__AttributesAssignment_4_0
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
    // InternalJavaFXLang.g:7798:1: rule__Bean__Group_4__1 : rule__Bean__Group_4__1__Impl ;
    public final void rule__Bean__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7802:1: ( rule__Bean__Group_4__1__Impl )
            // InternalJavaFXLang.g:7803:2: rule__Bean__Group_4__1__Impl
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
    // InternalJavaFXLang.g:7809:1: rule__Bean__Group_4__1__Impl : ( ( rule__Bean__AttributesAssignment_4_1 )* ) ;
    public final void rule__Bean__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7813:1: ( ( ( rule__Bean__AttributesAssignment_4_1 )* ) )
            // InternalJavaFXLang.g:7814:1: ( ( rule__Bean__AttributesAssignment_4_1 )* )
            {
            // InternalJavaFXLang.g:7814:1: ( ( rule__Bean__AttributesAssignment_4_1 )* )
            // InternalJavaFXLang.g:7815:2: ( rule__Bean__AttributesAssignment_4_1 )*
            {
             before(grammarAccess.getBeanAccess().getAttributesAssignment_4_1()); 
            // InternalJavaFXLang.g:7816:2: ( rule__Bean__AttributesAssignment_4_1 )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( ((LA75_0>=RULE_STRING && LA75_0<=RULE_ID)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalJavaFXLang.g:7816:3: rule__Bean__AttributesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Bean__AttributesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop75;
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
    // InternalJavaFXLang.g:7825:1: rule__TableViewFX__Group__0 : rule__TableViewFX__Group__0__Impl rule__TableViewFX__Group__1 ;
    public final void rule__TableViewFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7829:1: ( rule__TableViewFX__Group__0__Impl rule__TableViewFX__Group__1 )
            // InternalJavaFXLang.g:7830:2: rule__TableViewFX__Group__0__Impl rule__TableViewFX__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalJavaFXLang.g:7837:1: rule__TableViewFX__Group__0__Impl : ( () ) ;
    public final void rule__TableViewFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7841:1: ( ( () ) )
            // InternalJavaFXLang.g:7842:1: ( () )
            {
            // InternalJavaFXLang.g:7842:1: ( () )
            // InternalJavaFXLang.g:7843:2: ()
            {
             before(grammarAccess.getTableViewFXAccess().getTableViewFXAction_0()); 
            // InternalJavaFXLang.g:7844:2: ()
            // InternalJavaFXLang.g:7844:3: 
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
    // InternalJavaFXLang.g:7852:1: rule__TableViewFX__Group__1 : rule__TableViewFX__Group__1__Impl rule__TableViewFX__Group__2 ;
    public final void rule__TableViewFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7856:1: ( rule__TableViewFX__Group__1__Impl rule__TableViewFX__Group__2 )
            // InternalJavaFXLang.g:7857:2: rule__TableViewFX__Group__1__Impl rule__TableViewFX__Group__2
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
    // InternalJavaFXLang.g:7864:1: rule__TableViewFX__Group__1__Impl : ( 'TableView' ) ;
    public final void rule__TableViewFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7868:1: ( ( 'TableView' ) )
            // InternalJavaFXLang.g:7869:1: ( 'TableView' )
            {
            // InternalJavaFXLang.g:7869:1: ( 'TableView' )
            // InternalJavaFXLang.g:7870:2: 'TableView'
            {
             before(grammarAccess.getTableViewFXAccess().getTableViewKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalJavaFXLang.g:7879:1: rule__TableViewFX__Group__2 : rule__TableViewFX__Group__2__Impl rule__TableViewFX__Group__3 ;
    public final void rule__TableViewFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7883:1: ( rule__TableViewFX__Group__2__Impl rule__TableViewFX__Group__3 )
            // InternalJavaFXLang.g:7884:2: rule__TableViewFX__Group__2__Impl rule__TableViewFX__Group__3
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
    // InternalJavaFXLang.g:7891:1: rule__TableViewFX__Group__2__Impl : ( '{' ) ;
    public final void rule__TableViewFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7895:1: ( ( '{' ) )
            // InternalJavaFXLang.g:7896:1: ( '{' )
            {
            // InternalJavaFXLang.g:7896:1: ( '{' )
            // InternalJavaFXLang.g:7897:2: '{'
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
    // InternalJavaFXLang.g:7906:1: rule__TableViewFX__Group__3 : rule__TableViewFX__Group__3__Impl rule__TableViewFX__Group__4 ;
    public final void rule__TableViewFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7910:1: ( rule__TableViewFX__Group__3__Impl rule__TableViewFX__Group__4 )
            // InternalJavaFXLang.g:7911:2: rule__TableViewFX__Group__3__Impl rule__TableViewFX__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalJavaFXLang.g:7918:1: rule__TableViewFX__Group__3__Impl : ( ( rule__TableViewFX__Group_3__0 ) ) ;
    public final void rule__TableViewFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7922:1: ( ( ( rule__TableViewFX__Group_3__0 ) ) )
            // InternalJavaFXLang.g:7923:1: ( ( rule__TableViewFX__Group_3__0 ) )
            {
            // InternalJavaFXLang.g:7923:1: ( ( rule__TableViewFX__Group_3__0 ) )
            // InternalJavaFXLang.g:7924:2: ( rule__TableViewFX__Group_3__0 )
            {
             before(grammarAccess.getTableViewFXAccess().getGroup_3()); 
            // InternalJavaFXLang.g:7925:2: ( rule__TableViewFX__Group_3__0 )
            // InternalJavaFXLang.g:7925:3: rule__TableViewFX__Group_3__0
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
    // InternalJavaFXLang.g:7933:1: rule__TableViewFX__Group__4 : rule__TableViewFX__Group__4__Impl rule__TableViewFX__Group__5 ;
    public final void rule__TableViewFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7937:1: ( rule__TableViewFX__Group__4__Impl rule__TableViewFX__Group__5 )
            // InternalJavaFXLang.g:7938:2: rule__TableViewFX__Group__4__Impl rule__TableViewFX__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalJavaFXLang.g:7945:1: rule__TableViewFX__Group__4__Impl : ( ( rule__TableViewFX__Group_4__0 )? ) ;
    public final void rule__TableViewFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7949:1: ( ( ( rule__TableViewFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:7950:1: ( ( rule__TableViewFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:7950:1: ( ( rule__TableViewFX__Group_4__0 )? )
            // InternalJavaFXLang.g:7951:2: ( rule__TableViewFX__Group_4__0 )?
            {
             before(grammarAccess.getTableViewFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:7952:2: ( rule__TableViewFX__Group_4__0 )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==51) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalJavaFXLang.g:7952:3: rule__TableViewFX__Group_4__0
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
    // InternalJavaFXLang.g:7960:1: rule__TableViewFX__Group__5 : rule__TableViewFX__Group__5__Impl rule__TableViewFX__Group__6 ;
    public final void rule__TableViewFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7964:1: ( rule__TableViewFX__Group__5__Impl rule__TableViewFX__Group__6 )
            // InternalJavaFXLang.g:7965:2: rule__TableViewFX__Group__5__Impl rule__TableViewFX__Group__6
            {
            pushFollow(FOLLOW_39);
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
    // InternalJavaFXLang.g:7972:1: rule__TableViewFX__Group__5__Impl : ( ( rule__TableViewFX__Group_5__0 )? ) ;
    public final void rule__TableViewFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7976:1: ( ( ( rule__TableViewFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:7977:1: ( ( rule__TableViewFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:7977:1: ( ( rule__TableViewFX__Group_5__0 )? )
            // InternalJavaFXLang.g:7978:2: ( rule__TableViewFX__Group_5__0 )?
            {
             before(grammarAccess.getTableViewFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:7979:2: ( rule__TableViewFX__Group_5__0 )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==56) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalJavaFXLang.g:7979:3: rule__TableViewFX__Group_5__0
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
    // InternalJavaFXLang.g:7987:1: rule__TableViewFX__Group__6 : rule__TableViewFX__Group__6__Impl ;
    public final void rule__TableViewFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7991:1: ( rule__TableViewFX__Group__6__Impl )
            // InternalJavaFXLang.g:7992:2: rule__TableViewFX__Group__6__Impl
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
    // InternalJavaFXLang.g:7998:1: rule__TableViewFX__Group__6__Impl : ( '}' ) ;
    public final void rule__TableViewFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8002:1: ( ( '}' ) )
            // InternalJavaFXLang.g:8003:1: ( '}' )
            {
            // InternalJavaFXLang.g:8003:1: ( '}' )
            // InternalJavaFXLang.g:8004:2: '}'
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
    // InternalJavaFXLang.g:8014:1: rule__TableViewFX__Group_3__0 : rule__TableViewFX__Group_3__0__Impl rule__TableViewFX__Group_3__1 ;
    public final void rule__TableViewFX__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8018:1: ( rule__TableViewFX__Group_3__0__Impl rule__TableViewFX__Group_3__1 )
            // InternalJavaFXLang.g:8019:2: rule__TableViewFX__Group_3__0__Impl rule__TableViewFX__Group_3__1
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
    // InternalJavaFXLang.g:8026:1: rule__TableViewFX__Group_3__0__Impl : ( 'name:' ) ;
    public final void rule__TableViewFX__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8030:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:8031:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:8031:1: ( 'name:' )
            // InternalJavaFXLang.g:8032:2: 'name:'
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
    // InternalJavaFXLang.g:8041:1: rule__TableViewFX__Group_3__1 : rule__TableViewFX__Group_3__1__Impl ;
    public final void rule__TableViewFX__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8045:1: ( rule__TableViewFX__Group_3__1__Impl )
            // InternalJavaFXLang.g:8046:2: rule__TableViewFX__Group_3__1__Impl
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
    // InternalJavaFXLang.g:8052:1: rule__TableViewFX__Group_3__1__Impl : ( ( rule__TableViewFX__NameAssignment_3_1 ) ) ;
    public final void rule__TableViewFX__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8056:1: ( ( ( rule__TableViewFX__NameAssignment_3_1 ) ) )
            // InternalJavaFXLang.g:8057:1: ( ( rule__TableViewFX__NameAssignment_3_1 ) )
            {
            // InternalJavaFXLang.g:8057:1: ( ( rule__TableViewFX__NameAssignment_3_1 ) )
            // InternalJavaFXLang.g:8058:2: ( rule__TableViewFX__NameAssignment_3_1 )
            {
             before(grammarAccess.getTableViewFXAccess().getNameAssignment_3_1()); 
            // InternalJavaFXLang.g:8059:2: ( rule__TableViewFX__NameAssignment_3_1 )
            // InternalJavaFXLang.g:8059:3: rule__TableViewFX__NameAssignment_3_1
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
    // InternalJavaFXLang.g:8068:1: rule__TableViewFX__Group_4__0 : rule__TableViewFX__Group_4__0__Impl rule__TableViewFX__Group_4__1 ;
    public final void rule__TableViewFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8072:1: ( rule__TableViewFX__Group_4__0__Impl rule__TableViewFX__Group_4__1 )
            // InternalJavaFXLang.g:8073:2: rule__TableViewFX__Group_4__0__Impl rule__TableViewFX__Group_4__1
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
    // InternalJavaFXLang.g:8080:1: rule__TableViewFX__Group_4__0__Impl : ( 'usedModel:' ) ;
    public final void rule__TableViewFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8084:1: ( ( 'usedModel:' ) )
            // InternalJavaFXLang.g:8085:1: ( 'usedModel:' )
            {
            // InternalJavaFXLang.g:8085:1: ( 'usedModel:' )
            // InternalJavaFXLang.g:8086:2: 'usedModel:'
            {
             before(grammarAccess.getTableViewFXAccess().getUsedModelKeyword_4_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8095:1: rule__TableViewFX__Group_4__1 : rule__TableViewFX__Group_4__1__Impl ;
    public final void rule__TableViewFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8099:1: ( rule__TableViewFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:8100:2: rule__TableViewFX__Group_4__1__Impl
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
    // InternalJavaFXLang.g:8106:1: rule__TableViewFX__Group_4__1__Impl : ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) ) ;
    public final void rule__TableViewFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8110:1: ( ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:8111:1: ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:8111:1: ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) )
            // InternalJavaFXLang.g:8112:2: ( rule__TableViewFX__UsedModelAssignment_4_1 )
            {
             before(grammarAccess.getTableViewFXAccess().getUsedModelAssignment_4_1()); 
            // InternalJavaFXLang.g:8113:2: ( rule__TableViewFX__UsedModelAssignment_4_1 )
            // InternalJavaFXLang.g:8113:3: rule__TableViewFX__UsedModelAssignment_4_1
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
    // InternalJavaFXLang.g:8122:1: rule__TableViewFX__Group_5__0 : rule__TableViewFX__Group_5__0__Impl rule__TableViewFX__Group_5__1 ;
    public final void rule__TableViewFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8126:1: ( rule__TableViewFX__Group_5__0__Impl rule__TableViewFX__Group_5__1 )
            // InternalJavaFXLang.g:8127:2: rule__TableViewFX__Group_5__0__Impl rule__TableViewFX__Group_5__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalJavaFXLang.g:8134:1: rule__TableViewFX__Group_5__0__Impl : ( ( rule__TableViewFX__ColumnsAssignment_5_0 ) ) ;
    public final void rule__TableViewFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8138:1: ( ( ( rule__TableViewFX__ColumnsAssignment_5_0 ) ) )
            // InternalJavaFXLang.g:8139:1: ( ( rule__TableViewFX__ColumnsAssignment_5_0 ) )
            {
            // InternalJavaFXLang.g:8139:1: ( ( rule__TableViewFX__ColumnsAssignment_5_0 ) )
            // InternalJavaFXLang.g:8140:2: ( rule__TableViewFX__ColumnsAssignment_5_0 )
            {
             before(grammarAccess.getTableViewFXAccess().getColumnsAssignment_5_0()); 
            // InternalJavaFXLang.g:8141:2: ( rule__TableViewFX__ColumnsAssignment_5_0 )
            // InternalJavaFXLang.g:8141:3: rule__TableViewFX__ColumnsAssignment_5_0
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
    // InternalJavaFXLang.g:8149:1: rule__TableViewFX__Group_5__1 : rule__TableViewFX__Group_5__1__Impl ;
    public final void rule__TableViewFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8153:1: ( rule__TableViewFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:8154:2: rule__TableViewFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:8160:1: rule__TableViewFX__Group_5__1__Impl : ( ( rule__TableViewFX__ColumnsAssignment_5_1 )* ) ;
    public final void rule__TableViewFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8164:1: ( ( ( rule__TableViewFX__ColumnsAssignment_5_1 )* ) )
            // InternalJavaFXLang.g:8165:1: ( ( rule__TableViewFX__ColumnsAssignment_5_1 )* )
            {
            // InternalJavaFXLang.g:8165:1: ( ( rule__TableViewFX__ColumnsAssignment_5_1 )* )
            // InternalJavaFXLang.g:8166:2: ( rule__TableViewFX__ColumnsAssignment_5_1 )*
            {
             before(grammarAccess.getTableViewFXAccess().getColumnsAssignment_5_1()); 
            // InternalJavaFXLang.g:8167:2: ( rule__TableViewFX__ColumnsAssignment_5_1 )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==56) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalJavaFXLang.g:8167:3: rule__TableViewFX__ColumnsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__TableViewFX__ColumnsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop78;
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
    // InternalJavaFXLang.g:8176:1: rule__TableColumnFX__Group__0 : rule__TableColumnFX__Group__0__Impl rule__TableColumnFX__Group__1 ;
    public final void rule__TableColumnFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8180:1: ( rule__TableColumnFX__Group__0__Impl rule__TableColumnFX__Group__1 )
            // InternalJavaFXLang.g:8181:2: rule__TableColumnFX__Group__0__Impl rule__TableColumnFX__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalJavaFXLang.g:8188:1: rule__TableColumnFX__Group__0__Impl : ( () ) ;
    public final void rule__TableColumnFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8192:1: ( ( () ) )
            // InternalJavaFXLang.g:8193:1: ( () )
            {
            // InternalJavaFXLang.g:8193:1: ( () )
            // InternalJavaFXLang.g:8194:2: ()
            {
             before(grammarAccess.getTableColumnFXAccess().getTableColumnFXAction_0()); 
            // InternalJavaFXLang.g:8195:2: ()
            // InternalJavaFXLang.g:8195:3: 
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
    // InternalJavaFXLang.g:8203:1: rule__TableColumnFX__Group__1 : rule__TableColumnFX__Group__1__Impl rule__TableColumnFX__Group__2 ;
    public final void rule__TableColumnFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8207:1: ( rule__TableColumnFX__Group__1__Impl rule__TableColumnFX__Group__2 )
            // InternalJavaFXLang.g:8208:2: rule__TableColumnFX__Group__1__Impl rule__TableColumnFX__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalJavaFXLang.g:8215:1: rule__TableColumnFX__Group__1__Impl : ( 'Column' ) ;
    public final void rule__TableColumnFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8219:1: ( ( 'Column' ) )
            // InternalJavaFXLang.g:8220:1: ( 'Column' )
            {
            // InternalJavaFXLang.g:8220:1: ( 'Column' )
            // InternalJavaFXLang.g:8221:2: 'Column'
            {
             before(grammarAccess.getTableColumnFXAccess().getColumnKeyword_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8230:1: rule__TableColumnFX__Group__2 : rule__TableColumnFX__Group__2__Impl rule__TableColumnFX__Group__3 ;
    public final void rule__TableColumnFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8234:1: ( rule__TableColumnFX__Group__2__Impl rule__TableColumnFX__Group__3 )
            // InternalJavaFXLang.g:8235:2: rule__TableColumnFX__Group__2__Impl rule__TableColumnFX__Group__3
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
    // InternalJavaFXLang.g:8242:1: rule__TableColumnFX__Group__2__Impl : ( '(' ) ;
    public final void rule__TableColumnFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8246:1: ( ( '(' ) )
            // InternalJavaFXLang.g:8247:1: ( '(' )
            {
            // InternalJavaFXLang.g:8247:1: ( '(' )
            // InternalJavaFXLang.g:8248:2: '('
            {
             before(grammarAccess.getTableColumnFXAccess().getLeftParenthesisKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8257:1: rule__TableColumnFX__Group__3 : rule__TableColumnFX__Group__3__Impl rule__TableColumnFX__Group__4 ;
    public final void rule__TableColumnFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8261:1: ( rule__TableColumnFX__Group__3__Impl rule__TableColumnFX__Group__4 )
            // InternalJavaFXLang.g:8262:2: rule__TableColumnFX__Group__3__Impl rule__TableColumnFX__Group__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalJavaFXLang.g:8269:1: rule__TableColumnFX__Group__3__Impl : ( ( rule__TableColumnFX__Group_3__0 ) ) ;
    public final void rule__TableColumnFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8273:1: ( ( ( rule__TableColumnFX__Group_3__0 ) ) )
            // InternalJavaFXLang.g:8274:1: ( ( rule__TableColumnFX__Group_3__0 ) )
            {
            // InternalJavaFXLang.g:8274:1: ( ( rule__TableColumnFX__Group_3__0 ) )
            // InternalJavaFXLang.g:8275:2: ( rule__TableColumnFX__Group_3__0 )
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_3()); 
            // InternalJavaFXLang.g:8276:2: ( rule__TableColumnFX__Group_3__0 )
            // InternalJavaFXLang.g:8276:3: rule__TableColumnFX__Group_3__0
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
    // InternalJavaFXLang.g:8284:1: rule__TableColumnFX__Group__4 : rule__TableColumnFX__Group__4__Impl rule__TableColumnFX__Group__5 ;
    public final void rule__TableColumnFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8288:1: ( rule__TableColumnFX__Group__4__Impl rule__TableColumnFX__Group__5 )
            // InternalJavaFXLang.g:8289:2: rule__TableColumnFX__Group__4__Impl rule__TableColumnFX__Group__5
            {
            pushFollow(FOLLOW_41);
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
    // InternalJavaFXLang.g:8296:1: rule__TableColumnFX__Group__4__Impl : ( ( rule__TableColumnFX__Group_4__0 )? ) ;
    public final void rule__TableColumnFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8300:1: ( ( ( rule__TableColumnFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:8301:1: ( ( rule__TableColumnFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:8301:1: ( ( rule__TableColumnFX__Group_4__0 )? )
            // InternalJavaFXLang.g:8302:2: ( rule__TableColumnFX__Group_4__0 )?
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:8303:2: ( rule__TableColumnFX__Group_4__0 )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==59) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalJavaFXLang.g:8303:3: rule__TableColumnFX__Group_4__0
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
    // InternalJavaFXLang.g:8311:1: rule__TableColumnFX__Group__5 : rule__TableColumnFX__Group__5__Impl rule__TableColumnFX__Group__6 ;
    public final void rule__TableColumnFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8315:1: ( rule__TableColumnFX__Group__5__Impl rule__TableColumnFX__Group__6 )
            // InternalJavaFXLang.g:8316:2: rule__TableColumnFX__Group__5__Impl rule__TableColumnFX__Group__6
            {
            pushFollow(FOLLOW_41);
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
    // InternalJavaFXLang.g:8323:1: rule__TableColumnFX__Group__5__Impl : ( ( rule__TableColumnFX__Group_5__0 )? ) ;
    public final void rule__TableColumnFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8327:1: ( ( ( rule__TableColumnFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:8328:1: ( ( rule__TableColumnFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:8328:1: ( ( rule__TableColumnFX__Group_5__0 )? )
            // InternalJavaFXLang.g:8329:2: ( rule__TableColumnFX__Group_5__0 )?
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:8330:2: ( rule__TableColumnFX__Group_5__0 )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==60) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalJavaFXLang.g:8330:3: rule__TableColumnFX__Group_5__0
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
    // InternalJavaFXLang.g:8338:1: rule__TableColumnFX__Group__6 : rule__TableColumnFX__Group__6__Impl rule__TableColumnFX__Group__7 ;
    public final void rule__TableColumnFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8342:1: ( rule__TableColumnFX__Group__6__Impl rule__TableColumnFX__Group__7 )
            // InternalJavaFXLang.g:8343:2: rule__TableColumnFX__Group__6__Impl rule__TableColumnFX__Group__7
            {
            pushFollow(FOLLOW_41);
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
    // InternalJavaFXLang.g:8350:1: rule__TableColumnFX__Group__6__Impl : ( ( rule__TableColumnFX__Group_6__0 )? ) ;
    public final void rule__TableColumnFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8354:1: ( ( ( rule__TableColumnFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:8355:1: ( ( rule__TableColumnFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:8355:1: ( ( rule__TableColumnFX__Group_6__0 )? )
            // InternalJavaFXLang.g:8356:2: ( rule__TableColumnFX__Group_6__0 )?
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:8357:2: ( rule__TableColumnFX__Group_6__0 )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==61) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalJavaFXLang.g:8357:3: rule__TableColumnFX__Group_6__0
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
    // InternalJavaFXLang.g:8365:1: rule__TableColumnFX__Group__7 : rule__TableColumnFX__Group__7__Impl ;
    public final void rule__TableColumnFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8369:1: ( rule__TableColumnFX__Group__7__Impl )
            // InternalJavaFXLang.g:8370:2: rule__TableColumnFX__Group__7__Impl
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
    // InternalJavaFXLang.g:8376:1: rule__TableColumnFX__Group__7__Impl : ( ')' ) ;
    public final void rule__TableColumnFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8380:1: ( ( ')' ) )
            // InternalJavaFXLang.g:8381:1: ( ')' )
            {
            // InternalJavaFXLang.g:8381:1: ( ')' )
            // InternalJavaFXLang.g:8382:2: ')'
            {
             before(grammarAccess.getTableColumnFXAccess().getRightParenthesisKeyword_7()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8392:1: rule__TableColumnFX__Group_3__0 : rule__TableColumnFX__Group_3__0__Impl rule__TableColumnFX__Group_3__1 ;
    public final void rule__TableColumnFX__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8396:1: ( rule__TableColumnFX__Group_3__0__Impl rule__TableColumnFX__Group_3__1 )
            // InternalJavaFXLang.g:8397:2: rule__TableColumnFX__Group_3__0__Impl rule__TableColumnFX__Group_3__1
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
    // InternalJavaFXLang.g:8404:1: rule__TableColumnFX__Group_3__0__Impl : ( 'name:' ) ;
    public final void rule__TableColumnFX__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8408:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:8409:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:8409:1: ( 'name:' )
            // InternalJavaFXLang.g:8410:2: 'name:'
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
    // InternalJavaFXLang.g:8419:1: rule__TableColumnFX__Group_3__1 : rule__TableColumnFX__Group_3__1__Impl ;
    public final void rule__TableColumnFX__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8423:1: ( rule__TableColumnFX__Group_3__1__Impl )
            // InternalJavaFXLang.g:8424:2: rule__TableColumnFX__Group_3__1__Impl
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
    // InternalJavaFXLang.g:8430:1: rule__TableColumnFX__Group_3__1__Impl : ( ( rule__TableColumnFX__NameAssignment_3_1 ) ) ;
    public final void rule__TableColumnFX__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8434:1: ( ( ( rule__TableColumnFX__NameAssignment_3_1 ) ) )
            // InternalJavaFXLang.g:8435:1: ( ( rule__TableColumnFX__NameAssignment_3_1 ) )
            {
            // InternalJavaFXLang.g:8435:1: ( ( rule__TableColumnFX__NameAssignment_3_1 ) )
            // InternalJavaFXLang.g:8436:2: ( rule__TableColumnFX__NameAssignment_3_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getNameAssignment_3_1()); 
            // InternalJavaFXLang.g:8437:2: ( rule__TableColumnFX__NameAssignment_3_1 )
            // InternalJavaFXLang.g:8437:3: rule__TableColumnFX__NameAssignment_3_1
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
    // InternalJavaFXLang.g:8446:1: rule__TableColumnFX__Group_4__0 : rule__TableColumnFX__Group_4__0__Impl rule__TableColumnFX__Group_4__1 ;
    public final void rule__TableColumnFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8450:1: ( rule__TableColumnFX__Group_4__0__Impl rule__TableColumnFX__Group_4__1 )
            // InternalJavaFXLang.g:8451:2: rule__TableColumnFX__Group_4__0__Impl rule__TableColumnFX__Group_4__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalJavaFXLang.g:8458:1: rule__TableColumnFX__Group_4__0__Impl : ( 'width:' ) ;
    public final void rule__TableColumnFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8462:1: ( ( 'width:' ) )
            // InternalJavaFXLang.g:8463:1: ( 'width:' )
            {
            // InternalJavaFXLang.g:8463:1: ( 'width:' )
            // InternalJavaFXLang.g:8464:2: 'width:'
            {
             before(grammarAccess.getTableColumnFXAccess().getWidthKeyword_4_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8473:1: rule__TableColumnFX__Group_4__1 : rule__TableColumnFX__Group_4__1__Impl ;
    public final void rule__TableColumnFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8477:1: ( rule__TableColumnFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:8478:2: rule__TableColumnFX__Group_4__1__Impl
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
    // InternalJavaFXLang.g:8484:1: rule__TableColumnFX__Group_4__1__Impl : ( ( rule__TableColumnFX__WidthAssignment_4_1 ) ) ;
    public final void rule__TableColumnFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8488:1: ( ( ( rule__TableColumnFX__WidthAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:8489:1: ( ( rule__TableColumnFX__WidthAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:8489:1: ( ( rule__TableColumnFX__WidthAssignment_4_1 ) )
            // InternalJavaFXLang.g:8490:2: ( rule__TableColumnFX__WidthAssignment_4_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getWidthAssignment_4_1()); 
            // InternalJavaFXLang.g:8491:2: ( rule__TableColumnFX__WidthAssignment_4_1 )
            // InternalJavaFXLang.g:8491:3: rule__TableColumnFX__WidthAssignment_4_1
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
    // InternalJavaFXLang.g:8500:1: rule__TableColumnFX__Group_5__0 : rule__TableColumnFX__Group_5__0__Impl rule__TableColumnFX__Group_5__1 ;
    public final void rule__TableColumnFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8504:1: ( rule__TableColumnFX__Group_5__0__Impl rule__TableColumnFX__Group_5__1 )
            // InternalJavaFXLang.g:8505:2: rule__TableColumnFX__Group_5__0__Impl rule__TableColumnFX__Group_5__1
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
    // InternalJavaFXLang.g:8512:1: rule__TableColumnFX__Group_5__0__Impl : ( 'attribute:' ) ;
    public final void rule__TableColumnFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8516:1: ( ( 'attribute:' ) )
            // InternalJavaFXLang.g:8517:1: ( 'attribute:' )
            {
            // InternalJavaFXLang.g:8517:1: ( 'attribute:' )
            // InternalJavaFXLang.g:8518:2: 'attribute:'
            {
             before(grammarAccess.getTableColumnFXAccess().getAttributeKeyword_5_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8527:1: rule__TableColumnFX__Group_5__1 : rule__TableColumnFX__Group_5__1__Impl ;
    public final void rule__TableColumnFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8531:1: ( rule__TableColumnFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:8532:2: rule__TableColumnFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:8538:1: rule__TableColumnFX__Group_5__1__Impl : ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) ) ;
    public final void rule__TableColumnFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8542:1: ( ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:8543:1: ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:8543:1: ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) )
            // InternalJavaFXLang.g:8544:2: ( rule__TableColumnFX__UsedAttributeAssignment_5_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getUsedAttributeAssignment_5_1()); 
            // InternalJavaFXLang.g:8545:2: ( rule__TableColumnFX__UsedAttributeAssignment_5_1 )
            // InternalJavaFXLang.g:8545:3: rule__TableColumnFX__UsedAttributeAssignment_5_1
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
    // InternalJavaFXLang.g:8554:1: rule__TableColumnFX__Group_6__0 : rule__TableColumnFX__Group_6__0__Impl rule__TableColumnFX__Group_6__1 ;
    public final void rule__TableColumnFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8558:1: ( rule__TableColumnFX__Group_6__0__Impl rule__TableColumnFX__Group_6__1 )
            // InternalJavaFXLang.g:8559:2: rule__TableColumnFX__Group_6__0__Impl rule__TableColumnFX__Group_6__1
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
    // InternalJavaFXLang.g:8566:1: rule__TableColumnFX__Group_6__0__Impl : ( 'useFilter:' ) ;
    public final void rule__TableColumnFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8570:1: ( ( 'useFilter:' ) )
            // InternalJavaFXLang.g:8571:1: ( 'useFilter:' )
            {
            // InternalJavaFXLang.g:8571:1: ( 'useFilter:' )
            // InternalJavaFXLang.g:8572:2: 'useFilter:'
            {
             before(grammarAccess.getTableColumnFXAccess().getUseFilterKeyword_6_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8581:1: rule__TableColumnFX__Group_6__1 : rule__TableColumnFX__Group_6__1__Impl ;
    public final void rule__TableColumnFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8585:1: ( rule__TableColumnFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:8586:2: rule__TableColumnFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:8592:1: rule__TableColumnFX__Group_6__1__Impl : ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) ) ;
    public final void rule__TableColumnFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8596:1: ( ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:8597:1: ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:8597:1: ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) )
            // InternalJavaFXLang.g:8598:2: ( rule__TableColumnFX__UseFilterAssignment_6_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getUseFilterAssignment_6_1()); 
            // InternalJavaFXLang.g:8599:2: ( rule__TableColumnFX__UseFilterAssignment_6_1 )
            // InternalJavaFXLang.g:8599:3: rule__TableColumnFX__UseFilterAssignment_6_1
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
    // InternalJavaFXLang.g:8608:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8612:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalJavaFXLang.g:8613:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalJavaFXLang.g:8620:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8624:1: ( ( ( '-' )? ) )
            // InternalJavaFXLang.g:8625:1: ( ( '-' )? )
            {
            // InternalJavaFXLang.g:8625:1: ( ( '-' )? )
            // InternalJavaFXLang.g:8626:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalJavaFXLang.g:8627:2: ( '-' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==62) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalJavaFXLang.g:8627:3: '-'
                    {
                    match(input,62,FOLLOW_2); 

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
    // InternalJavaFXLang.g:8635:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8639:1: ( rule__EInt__Group__1__Impl )
            // InternalJavaFXLang.g:8640:2: rule__EInt__Group__1__Impl
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
    // InternalJavaFXLang.g:8646:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8650:1: ( ( RULE_INT ) )
            // InternalJavaFXLang.g:8651:1: ( RULE_INT )
            {
            // InternalJavaFXLang.g:8651:1: ( RULE_INT )
            // InternalJavaFXLang.g:8652:2: RULE_INT
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
    // InternalJavaFXLang.g:8662:1: rule__AttributeFX__Group__0 : rule__AttributeFX__Group__0__Impl rule__AttributeFX__Group__1 ;
    public final void rule__AttributeFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8666:1: ( rule__AttributeFX__Group__0__Impl rule__AttributeFX__Group__1 )
            // InternalJavaFXLang.g:8667:2: rule__AttributeFX__Group__0__Impl rule__AttributeFX__Group__1
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
    // InternalJavaFXLang.g:8674:1: rule__AttributeFX__Group__0__Impl : ( () ) ;
    public final void rule__AttributeFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8678:1: ( ( () ) )
            // InternalJavaFXLang.g:8679:1: ( () )
            {
            // InternalJavaFXLang.g:8679:1: ( () )
            // InternalJavaFXLang.g:8680:2: ()
            {
             before(grammarAccess.getAttributeFXAccess().getAttributeFXAction_0()); 
            // InternalJavaFXLang.g:8681:2: ()
            // InternalJavaFXLang.g:8681:3: 
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
    // InternalJavaFXLang.g:8689:1: rule__AttributeFX__Group__1 : rule__AttributeFX__Group__1__Impl rule__AttributeFX__Group__2 ;
    public final void rule__AttributeFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8693:1: ( rule__AttributeFX__Group__1__Impl rule__AttributeFX__Group__2 )
            // InternalJavaFXLang.g:8694:2: rule__AttributeFX__Group__1__Impl rule__AttributeFX__Group__2
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
    // InternalJavaFXLang.g:8701:1: rule__AttributeFX__Group__1__Impl : ( ( rule__AttributeFX__TypeAssignment_1 ) ) ;
    public final void rule__AttributeFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8705:1: ( ( ( rule__AttributeFX__TypeAssignment_1 ) ) )
            // InternalJavaFXLang.g:8706:1: ( ( rule__AttributeFX__TypeAssignment_1 ) )
            {
            // InternalJavaFXLang.g:8706:1: ( ( rule__AttributeFX__TypeAssignment_1 ) )
            // InternalJavaFXLang.g:8707:2: ( rule__AttributeFX__TypeAssignment_1 )
            {
             before(grammarAccess.getAttributeFXAccess().getTypeAssignment_1()); 
            // InternalJavaFXLang.g:8708:2: ( rule__AttributeFX__TypeAssignment_1 )
            // InternalJavaFXLang.g:8708:3: rule__AttributeFX__TypeAssignment_1
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
    // InternalJavaFXLang.g:8716:1: rule__AttributeFX__Group__2 : rule__AttributeFX__Group__2__Impl ;
    public final void rule__AttributeFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8720:1: ( rule__AttributeFX__Group__2__Impl )
            // InternalJavaFXLang.g:8721:2: rule__AttributeFX__Group__2__Impl
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
    // InternalJavaFXLang.g:8727:1: rule__AttributeFX__Group__2__Impl : ( ( rule__AttributeFX__NameAssignment_2 ) ) ;
    public final void rule__AttributeFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8731:1: ( ( ( rule__AttributeFX__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:8732:1: ( ( rule__AttributeFX__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:8732:1: ( ( rule__AttributeFX__NameAssignment_2 ) )
            // InternalJavaFXLang.g:8733:2: ( rule__AttributeFX__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeFXAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:8734:2: ( rule__AttributeFX__NameAssignment_2 )
            // InternalJavaFXLang.g:8734:3: rule__AttributeFX__NameAssignment_2
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
    // InternalJavaFXLang.g:8743:1: rule__ProjectFX__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ProjectFX__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8747:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:8748:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:8748:2: ( ruleEString )
            // InternalJavaFXLang.g:8749:3: ruleEString
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
    // InternalJavaFXLang.g:8758:1: rule__ProjectFX__PackagePathAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ProjectFX__PackagePathAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8762:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:8763:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:8763:2: ( ruleEString )
            // InternalJavaFXLang.g:8764:3: ruleEString
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
    // InternalJavaFXLang.g:8773:1: rule__ProjectFX__ControlsAssignment_5_2 : ( ruleControlFX ) ;
    public final void rule__ProjectFX__ControlsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8777:1: ( ( ruleControlFX ) )
            // InternalJavaFXLang.g:8778:2: ( ruleControlFX )
            {
            // InternalJavaFXLang.g:8778:2: ( ruleControlFX )
            // InternalJavaFXLang.g:8779:3: ruleControlFX
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
    // InternalJavaFXLang.g:8788:1: rule__ProjectFX__ControlsAssignment_5_3 : ( ruleControlFX ) ;
    public final void rule__ProjectFX__ControlsAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8792:1: ( ( ruleControlFX ) )
            // InternalJavaFXLang.g:8793:2: ( ruleControlFX )
            {
            // InternalJavaFXLang.g:8793:2: ( ruleControlFX )
            // InternalJavaFXLang.g:8794:3: ruleControlFX
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
    // InternalJavaFXLang.g:8803:1: rule__ProjectFX__ModelsAssignment_6_2 : ( ruleModelFX ) ;
    public final void rule__ProjectFX__ModelsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8807:1: ( ( ruleModelFX ) )
            // InternalJavaFXLang.g:8808:2: ( ruleModelFX )
            {
            // InternalJavaFXLang.g:8808:2: ( ruleModelFX )
            // InternalJavaFXLang.g:8809:3: ruleModelFX
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
    // InternalJavaFXLang.g:8818:1: rule__ProjectFX__ModelsAssignment_6_3 : ( ruleModelFX ) ;
    public final void rule__ProjectFX__ModelsAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8822:1: ( ( ruleModelFX ) )
            // InternalJavaFXLang.g:8823:2: ( ruleModelFX )
            {
            // InternalJavaFXLang.g:8823:2: ( ruleModelFX )
            // InternalJavaFXLang.g:8824:3: ruleModelFX
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
    // InternalJavaFXLang.g:8833:1: rule__ProjectFX__BindingsAssignment_7_2 : ( ruleBinding ) ;
    public final void rule__ProjectFX__BindingsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8837:1: ( ( ruleBinding ) )
            // InternalJavaFXLang.g:8838:2: ( ruleBinding )
            {
            // InternalJavaFXLang.g:8838:2: ( ruleBinding )
            // InternalJavaFXLang.g:8839:3: ruleBinding
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
    // InternalJavaFXLang.g:8848:1: rule__ProjectFX__BindingsAssignment_7_3 : ( ruleBinding ) ;
    public final void rule__ProjectFX__BindingsAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8852:1: ( ( ruleBinding ) )
            // InternalJavaFXLang.g:8853:2: ( ruleBinding )
            {
            // InternalJavaFXLang.g:8853:2: ( ruleBinding )
            // InternalJavaFXLang.g:8854:3: ruleBinding
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
    // InternalJavaFXLang.g:8863:1: rule__ProjectFX__ChartsAssignment_8_2 : ( ruleChartFX ) ;
    public final void rule__ProjectFX__ChartsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8867:1: ( ( ruleChartFX ) )
            // InternalJavaFXLang.g:8868:2: ( ruleChartFX )
            {
            // InternalJavaFXLang.g:8868:2: ( ruleChartFX )
            // InternalJavaFXLang.g:8869:3: ruleChartFX
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
    // InternalJavaFXLang.g:8878:1: rule__ProjectFX__ChartsAssignment_8_3 : ( ruleChartFX ) ;
    public final void rule__ProjectFX__ChartsAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8882:1: ( ( ruleChartFX ) )
            // InternalJavaFXLang.g:8883:2: ( ruleChartFX )
            {
            // InternalJavaFXLang.g:8883:2: ( ruleChartFX )
            // InternalJavaFXLang.g:8884:3: ruleChartFX
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


    // $ANTLR start "rule__BarChartFX__NameAssignment_4"
    // InternalJavaFXLang.g:8893:1: rule__BarChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__BarChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8897:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:8898:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:8898:2: ( ruleEString )
            // InternalJavaFXLang.g:8899:3: ruleEString
            {
             before(grammarAccess.getBarChartFXAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarChartFXAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__NameAssignment_4"


    // $ANTLR start "rule__BarChartFX__LegendSideAssignment_5_1"
    // InternalJavaFXLang.g:8908:1: rule__BarChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__BarChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8912:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:8913:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:8913:2: ( ruleOrientation )
            // InternalJavaFXLang.g:8914:3: ruleOrientation
            {
             before(grammarAccess.getBarChartFXAccess().getLegendSideOrientationEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrientation();

            state._fsp--;

             after(grammarAccess.getBarChartFXAccess().getLegendSideOrientationEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__LegendSideAssignment_5_1"


    // $ANTLR start "rule__BarChartFX__ShowLegendAssignment_6_1"
    // InternalJavaFXLang.g:8923:1: rule__BarChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__BarChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8927:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:8928:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:8928:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:8929:3: ruleEBoolean
            {
             before(grammarAccess.getBarChartFXAccess().getShowLegendEBooleanParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBarChartFXAccess().getShowLegendEBooleanParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__ShowLegendAssignment_6_1"


    // $ANTLR start "rule__BarChartFX__TitleAssignment_7_1"
    // InternalJavaFXLang.g:8938:1: rule__BarChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__BarChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8942:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:8943:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:8943:2: ( ruleEString )
            // InternalJavaFXLang.g:8944:3: ruleEString
            {
             before(grammarAccess.getBarChartFXAccess().getTitleEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarChartFXAccess().getTitleEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__TitleAssignment_7_1"


    // $ANTLR start "rule__BarChartFX__TitleSideAssignment_8_1"
    // InternalJavaFXLang.g:8953:1: rule__BarChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__BarChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8957:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:8958:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:8958:2: ( ruleOrientation )
            // InternalJavaFXLang.g:8959:3: ruleOrientation
            {
             before(grammarAccess.getBarChartFXAccess().getTitleSideOrientationEnumRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrientation();

            state._fsp--;

             after(grammarAccess.getBarChartFXAccess().getTitleSideOrientationEnumRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__TitleSideAssignment_8_1"


    // $ANTLR start "rule__BarChartFX__XAxisLabelAssignment_9_1"
    // InternalJavaFXLang.g:8968:1: rule__BarChartFX__XAxisLabelAssignment_9_1 : ( ruleEString ) ;
    public final void rule__BarChartFX__XAxisLabelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8972:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:8973:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:8973:2: ( ruleEString )
            // InternalJavaFXLang.g:8974:3: ruleEString
            {
             before(grammarAccess.getBarChartFXAccess().getXAxisLabelEStringParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarChartFXAccess().getXAxisLabelEStringParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__XAxisLabelAssignment_9_1"


    // $ANTLR start "rule__BarChartFX__XAxisTypeAssignment_10_1"
    // InternalJavaFXLang.g:8983:1: rule__BarChartFX__XAxisTypeAssignment_10_1 : ( ruleAxisType ) ;
    public final void rule__BarChartFX__XAxisTypeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8987:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:8988:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:8988:2: ( ruleAxisType )
            // InternalJavaFXLang.g:8989:3: ruleAxisType
            {
             before(grammarAccess.getBarChartFXAccess().getXAxisTypeAxisTypeEnumRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxisType();

            state._fsp--;

             after(grammarAccess.getBarChartFXAccess().getXAxisTypeAxisTypeEnumRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__XAxisTypeAssignment_10_1"


    // $ANTLR start "rule__BarChartFX__YAxisLabelAssignment_11_1"
    // InternalJavaFXLang.g:8998:1: rule__BarChartFX__YAxisLabelAssignment_11_1 : ( ruleEString ) ;
    public final void rule__BarChartFX__YAxisLabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9002:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9003:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9003:2: ( ruleEString )
            // InternalJavaFXLang.g:9004:3: ruleEString
            {
             before(grammarAccess.getBarChartFXAccess().getYAxisLabelEStringParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarChartFXAccess().getYAxisLabelEStringParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__YAxisLabelAssignment_11_1"


    // $ANTLR start "rule__BarChartFX__YAxisTypeAssignment_12_1"
    // InternalJavaFXLang.g:9013:1: rule__BarChartFX__YAxisTypeAssignment_12_1 : ( ruleAxisType ) ;
    public final void rule__BarChartFX__YAxisTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9017:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9018:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9018:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9019:3: ruleAxisType
            {
             before(grammarAccess.getBarChartFXAccess().getYAxisTypeAxisTypeEnumRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxisType();

            state._fsp--;

             after(grammarAccess.getBarChartFXAccess().getYAxisTypeAxisTypeEnumRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChartFX__YAxisTypeAssignment_12_1"


    // $ANTLR start "rule__ScatterChartFX__NameAssignment_4"
    // InternalJavaFXLang.g:9028:1: rule__ScatterChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__ScatterChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9032:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9033:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9033:2: ( ruleEString )
            // InternalJavaFXLang.g:9034:3: ruleEString
            {
             before(grammarAccess.getScatterChartFXAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getScatterChartFXAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__NameAssignment_4"


    // $ANTLR start "rule__ScatterChartFX__LegendSideAssignment_5_1"
    // InternalJavaFXLang.g:9043:1: rule__ScatterChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__ScatterChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9047:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9048:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9048:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9049:3: ruleOrientation
            {
             before(grammarAccess.getScatterChartFXAccess().getLegendSideOrientationEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrientation();

            state._fsp--;

             after(grammarAccess.getScatterChartFXAccess().getLegendSideOrientationEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__LegendSideAssignment_5_1"


    // $ANTLR start "rule__ScatterChartFX__ShowLegendAssignment_6_1"
    // InternalJavaFXLang.g:9058:1: rule__ScatterChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__ScatterChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9062:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:9063:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:9063:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:9064:3: ruleEBoolean
            {
             before(grammarAccess.getScatterChartFXAccess().getShowLegendEBooleanParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getScatterChartFXAccess().getShowLegendEBooleanParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__ShowLegendAssignment_6_1"


    // $ANTLR start "rule__ScatterChartFX__TitleAssignment_7_1"
    // InternalJavaFXLang.g:9073:1: rule__ScatterChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__ScatterChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9077:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9078:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9078:2: ( ruleEString )
            // InternalJavaFXLang.g:9079:3: ruleEString
            {
             before(grammarAccess.getScatterChartFXAccess().getTitleEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getScatterChartFXAccess().getTitleEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__TitleAssignment_7_1"


    // $ANTLR start "rule__ScatterChartFX__TitleSideAssignment_8_1"
    // InternalJavaFXLang.g:9088:1: rule__ScatterChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__ScatterChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9092:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9093:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9093:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9094:3: ruleOrientation
            {
             before(grammarAccess.getScatterChartFXAccess().getTitleSideOrientationEnumRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrientation();

            state._fsp--;

             after(grammarAccess.getScatterChartFXAccess().getTitleSideOrientationEnumRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__TitleSideAssignment_8_1"


    // $ANTLR start "rule__ScatterChartFX__XAxisLabelAssignment_9_1"
    // InternalJavaFXLang.g:9103:1: rule__ScatterChartFX__XAxisLabelAssignment_9_1 : ( ruleEString ) ;
    public final void rule__ScatterChartFX__XAxisLabelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9107:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9108:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9108:2: ( ruleEString )
            // InternalJavaFXLang.g:9109:3: ruleEString
            {
             before(grammarAccess.getScatterChartFXAccess().getXAxisLabelEStringParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getScatterChartFXAccess().getXAxisLabelEStringParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__XAxisLabelAssignment_9_1"


    // $ANTLR start "rule__ScatterChartFX__XAxisTypeAssignment_10_1"
    // InternalJavaFXLang.g:9118:1: rule__ScatterChartFX__XAxisTypeAssignment_10_1 : ( ruleAxisType ) ;
    public final void rule__ScatterChartFX__XAxisTypeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9122:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9123:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9123:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9124:3: ruleAxisType
            {
             before(grammarAccess.getScatterChartFXAccess().getXAxisTypeAxisTypeEnumRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxisType();

            state._fsp--;

             after(grammarAccess.getScatterChartFXAccess().getXAxisTypeAxisTypeEnumRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__XAxisTypeAssignment_10_1"


    // $ANTLR start "rule__ScatterChartFX__YAxisLabelAssignment_11_1"
    // InternalJavaFXLang.g:9133:1: rule__ScatterChartFX__YAxisLabelAssignment_11_1 : ( ruleEString ) ;
    public final void rule__ScatterChartFX__YAxisLabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9137:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9138:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9138:2: ( ruleEString )
            // InternalJavaFXLang.g:9139:3: ruleEString
            {
             before(grammarAccess.getScatterChartFXAccess().getYAxisLabelEStringParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getScatterChartFXAccess().getYAxisLabelEStringParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__YAxisLabelAssignment_11_1"


    // $ANTLR start "rule__ScatterChartFX__YAxisTypeAssignment_12_1"
    // InternalJavaFXLang.g:9148:1: rule__ScatterChartFX__YAxisTypeAssignment_12_1 : ( ruleAxisType ) ;
    public final void rule__ScatterChartFX__YAxisTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9152:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9153:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9153:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9154:3: ruleAxisType
            {
             before(grammarAccess.getScatterChartFXAccess().getYAxisTypeAxisTypeEnumRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxisType();

            state._fsp--;

             after(grammarAccess.getScatterChartFXAccess().getYAxisTypeAxisTypeEnumRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScatterChartFX__YAxisTypeAssignment_12_1"


    // $ANTLR start "rule__BubbleChartFX__NameAssignment_4"
    // InternalJavaFXLang.g:9163:1: rule__BubbleChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__BubbleChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9167:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9168:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9168:2: ( ruleEString )
            // InternalJavaFXLang.g:9169:3: ruleEString
            {
             before(grammarAccess.getBubbleChartFXAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBubbleChartFXAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__NameAssignment_4"


    // $ANTLR start "rule__BubbleChartFX__LegendSideAssignment_5_1"
    // InternalJavaFXLang.g:9178:1: rule__BubbleChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__BubbleChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9182:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9183:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9183:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9184:3: ruleOrientation
            {
             before(grammarAccess.getBubbleChartFXAccess().getLegendSideOrientationEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrientation();

            state._fsp--;

             after(grammarAccess.getBubbleChartFXAccess().getLegendSideOrientationEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__LegendSideAssignment_5_1"


    // $ANTLR start "rule__BubbleChartFX__ShowLegendAssignment_6_1"
    // InternalJavaFXLang.g:9193:1: rule__BubbleChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__BubbleChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9197:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:9198:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:9198:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:9199:3: ruleEBoolean
            {
             before(grammarAccess.getBubbleChartFXAccess().getShowLegendEBooleanParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBubbleChartFXAccess().getShowLegendEBooleanParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__ShowLegendAssignment_6_1"


    // $ANTLR start "rule__BubbleChartFX__TitleAssignment_7_1"
    // InternalJavaFXLang.g:9208:1: rule__BubbleChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__BubbleChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9212:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9213:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9213:2: ( ruleEString )
            // InternalJavaFXLang.g:9214:3: ruleEString
            {
             before(grammarAccess.getBubbleChartFXAccess().getTitleEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBubbleChartFXAccess().getTitleEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__TitleAssignment_7_1"


    // $ANTLR start "rule__BubbleChartFX__TitleSideAssignment_8_1"
    // InternalJavaFXLang.g:9223:1: rule__BubbleChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__BubbleChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9227:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9228:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9228:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9229:3: ruleOrientation
            {
             before(grammarAccess.getBubbleChartFXAccess().getTitleSideOrientationEnumRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrientation();

            state._fsp--;

             after(grammarAccess.getBubbleChartFXAccess().getTitleSideOrientationEnumRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__TitleSideAssignment_8_1"


    // $ANTLR start "rule__BubbleChartFX__XAxisLabelAssignment_9_1"
    // InternalJavaFXLang.g:9238:1: rule__BubbleChartFX__XAxisLabelAssignment_9_1 : ( ruleEString ) ;
    public final void rule__BubbleChartFX__XAxisLabelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9242:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9243:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9243:2: ( ruleEString )
            // InternalJavaFXLang.g:9244:3: ruleEString
            {
             before(grammarAccess.getBubbleChartFXAccess().getXAxisLabelEStringParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBubbleChartFXAccess().getXAxisLabelEStringParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__XAxisLabelAssignment_9_1"


    // $ANTLR start "rule__BubbleChartFX__XAxisTypeAssignment_10_1"
    // InternalJavaFXLang.g:9253:1: rule__BubbleChartFX__XAxisTypeAssignment_10_1 : ( ruleAxisType ) ;
    public final void rule__BubbleChartFX__XAxisTypeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9257:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9258:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9258:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9259:3: ruleAxisType
            {
             before(grammarAccess.getBubbleChartFXAccess().getXAxisTypeAxisTypeEnumRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxisType();

            state._fsp--;

             after(grammarAccess.getBubbleChartFXAccess().getXAxisTypeAxisTypeEnumRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__XAxisTypeAssignment_10_1"


    // $ANTLR start "rule__BubbleChartFX__YAxisLabelAssignment_11_1"
    // InternalJavaFXLang.g:9268:1: rule__BubbleChartFX__YAxisLabelAssignment_11_1 : ( ruleEString ) ;
    public final void rule__BubbleChartFX__YAxisLabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9272:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9273:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9273:2: ( ruleEString )
            // InternalJavaFXLang.g:9274:3: ruleEString
            {
             before(grammarAccess.getBubbleChartFXAccess().getYAxisLabelEStringParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBubbleChartFXAccess().getYAxisLabelEStringParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__YAxisLabelAssignment_11_1"


    // $ANTLR start "rule__BubbleChartFX__YAxisTypeAssignment_12_1"
    // InternalJavaFXLang.g:9283:1: rule__BubbleChartFX__YAxisTypeAssignment_12_1 : ( ruleAxisType ) ;
    public final void rule__BubbleChartFX__YAxisTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9287:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9288:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9288:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9289:3: ruleAxisType
            {
             before(grammarAccess.getBubbleChartFXAccess().getYAxisTypeAxisTypeEnumRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxisType();

            state._fsp--;

             after(grammarAccess.getBubbleChartFXAccess().getYAxisTypeAxisTypeEnumRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BubbleChartFX__YAxisTypeAssignment_12_1"


    // $ANTLR start "rule__AreaChartFX__NameAssignment_4"
    // InternalJavaFXLang.g:9298:1: rule__AreaChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__AreaChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9302:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9303:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9303:2: ( ruleEString )
            // InternalJavaFXLang.g:9304:3: ruleEString
            {
             before(grammarAccess.getAreaChartFXAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAreaChartFXAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__NameAssignment_4"


    // $ANTLR start "rule__AreaChartFX__LegendSideAssignment_5_1"
    // InternalJavaFXLang.g:9313:1: rule__AreaChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__AreaChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9317:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9318:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9318:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9319:3: ruleOrientation
            {
             before(grammarAccess.getAreaChartFXAccess().getLegendSideOrientationEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrientation();

            state._fsp--;

             after(grammarAccess.getAreaChartFXAccess().getLegendSideOrientationEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__LegendSideAssignment_5_1"


    // $ANTLR start "rule__AreaChartFX__ShowLegendAssignment_6_1"
    // InternalJavaFXLang.g:9328:1: rule__AreaChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__AreaChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9332:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:9333:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:9333:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:9334:3: ruleEBoolean
            {
             before(grammarAccess.getAreaChartFXAccess().getShowLegendEBooleanParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getAreaChartFXAccess().getShowLegendEBooleanParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__ShowLegendAssignment_6_1"


    // $ANTLR start "rule__AreaChartFX__TitleAssignment_7_1"
    // InternalJavaFXLang.g:9343:1: rule__AreaChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__AreaChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9347:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9348:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9348:2: ( ruleEString )
            // InternalJavaFXLang.g:9349:3: ruleEString
            {
             before(grammarAccess.getAreaChartFXAccess().getTitleEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAreaChartFXAccess().getTitleEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__TitleAssignment_7_1"


    // $ANTLR start "rule__AreaChartFX__TitleSideAssignment_8_1"
    // InternalJavaFXLang.g:9358:1: rule__AreaChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__AreaChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9362:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9363:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9363:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9364:3: ruleOrientation
            {
             before(grammarAccess.getAreaChartFXAccess().getTitleSideOrientationEnumRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrientation();

            state._fsp--;

             after(grammarAccess.getAreaChartFXAccess().getTitleSideOrientationEnumRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__TitleSideAssignment_8_1"


    // $ANTLR start "rule__AreaChartFX__XAxisLabelAssignment_9_1"
    // InternalJavaFXLang.g:9373:1: rule__AreaChartFX__XAxisLabelAssignment_9_1 : ( ruleEString ) ;
    public final void rule__AreaChartFX__XAxisLabelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9377:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9378:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9378:2: ( ruleEString )
            // InternalJavaFXLang.g:9379:3: ruleEString
            {
             before(grammarAccess.getAreaChartFXAccess().getXAxisLabelEStringParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAreaChartFXAccess().getXAxisLabelEStringParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__XAxisLabelAssignment_9_1"


    // $ANTLR start "rule__AreaChartFX__XAxisTypeAssignment_10_1"
    // InternalJavaFXLang.g:9388:1: rule__AreaChartFX__XAxisTypeAssignment_10_1 : ( ruleAxisType ) ;
    public final void rule__AreaChartFX__XAxisTypeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9392:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9393:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9393:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9394:3: ruleAxisType
            {
             before(grammarAccess.getAreaChartFXAccess().getXAxisTypeAxisTypeEnumRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxisType();

            state._fsp--;

             after(grammarAccess.getAreaChartFXAccess().getXAxisTypeAxisTypeEnumRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__XAxisTypeAssignment_10_1"


    // $ANTLR start "rule__AreaChartFX__YAxisLabelAssignment_11_1"
    // InternalJavaFXLang.g:9403:1: rule__AreaChartFX__YAxisLabelAssignment_11_1 : ( ruleEString ) ;
    public final void rule__AreaChartFX__YAxisLabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9407:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9408:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9408:2: ( ruleEString )
            // InternalJavaFXLang.g:9409:3: ruleEString
            {
             before(grammarAccess.getAreaChartFXAccess().getYAxisLabelEStringParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAreaChartFXAccess().getYAxisLabelEStringParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__YAxisLabelAssignment_11_1"


    // $ANTLR start "rule__AreaChartFX__YAxisTypeAssignment_12_1"
    // InternalJavaFXLang.g:9418:1: rule__AreaChartFX__YAxisTypeAssignment_12_1 : ( ruleAxisType ) ;
    public final void rule__AreaChartFX__YAxisTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9422:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9423:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9423:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9424:3: ruleAxisType
            {
             before(grammarAccess.getAreaChartFXAccess().getYAxisTypeAxisTypeEnumRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxisType();

            state._fsp--;

             after(grammarAccess.getAreaChartFXAccess().getYAxisTypeAxisTypeEnumRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AreaChartFX__YAxisTypeAssignment_12_1"


    // $ANTLR start "rule__PieChartFX__NameAssignment_4"
    // InternalJavaFXLang.g:9433:1: rule__PieChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__PieChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9437:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9438:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9438:2: ( ruleEString )
            // InternalJavaFXLang.g:9439:3: ruleEString
            {
             before(grammarAccess.getPieChartFXAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieChartFXAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__NameAssignment_4"


    // $ANTLR start "rule__PieChartFX__LegendSideAssignment_5_1"
    // InternalJavaFXLang.g:9448:1: rule__PieChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__PieChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9452:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9453:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9453:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9454:3: ruleOrientation
            {
             before(grammarAccess.getPieChartFXAccess().getLegendSideOrientationEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrientation();

            state._fsp--;

             after(grammarAccess.getPieChartFXAccess().getLegendSideOrientationEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__LegendSideAssignment_5_1"


    // $ANTLR start "rule__PieChartFX__ShowLegendAssignment_6_1"
    // InternalJavaFXLang.g:9463:1: rule__PieChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__PieChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9467:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:9468:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:9468:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:9469:3: ruleEBoolean
            {
             before(grammarAccess.getPieChartFXAccess().getShowLegendEBooleanParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getPieChartFXAccess().getShowLegendEBooleanParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__ShowLegendAssignment_6_1"


    // $ANTLR start "rule__PieChartFX__TitleAssignment_7_1"
    // InternalJavaFXLang.g:9478:1: rule__PieChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__PieChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9482:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9483:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9483:2: ( ruleEString )
            // InternalJavaFXLang.g:9484:3: ruleEString
            {
             before(grammarAccess.getPieChartFXAccess().getTitleEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieChartFXAccess().getTitleEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__TitleAssignment_7_1"


    // $ANTLR start "rule__PieChartFX__TitleSideAssignment_8_1"
    // InternalJavaFXLang.g:9493:1: rule__PieChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__PieChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9497:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9498:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9498:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9499:3: ruleOrientation
            {
             before(grammarAccess.getPieChartFXAccess().getTitleSideOrientationEnumRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrientation();

            state._fsp--;

             after(grammarAccess.getPieChartFXAccess().getTitleSideOrientationEnumRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__TitleSideAssignment_8_1"


    // $ANTLR start "rule__PieChartFX__XAxisLabelAssignment_9_1"
    // InternalJavaFXLang.g:9508:1: rule__PieChartFX__XAxisLabelAssignment_9_1 : ( ruleEString ) ;
    public final void rule__PieChartFX__XAxisLabelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9512:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9513:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9513:2: ( ruleEString )
            // InternalJavaFXLang.g:9514:3: ruleEString
            {
             before(grammarAccess.getPieChartFXAccess().getXAxisLabelEStringParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieChartFXAccess().getXAxisLabelEStringParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__XAxisLabelAssignment_9_1"


    // $ANTLR start "rule__PieChartFX__XAxisTypeAssignment_10_1"
    // InternalJavaFXLang.g:9523:1: rule__PieChartFX__XAxisTypeAssignment_10_1 : ( ruleAxisType ) ;
    public final void rule__PieChartFX__XAxisTypeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9527:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9528:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9528:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9529:3: ruleAxisType
            {
             before(grammarAccess.getPieChartFXAccess().getXAxisTypeAxisTypeEnumRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxisType();

            state._fsp--;

             after(grammarAccess.getPieChartFXAccess().getXAxisTypeAxisTypeEnumRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__XAxisTypeAssignment_10_1"


    // $ANTLR start "rule__PieChartFX__YAxisLabelAssignment_11_1"
    // InternalJavaFXLang.g:9538:1: rule__PieChartFX__YAxisLabelAssignment_11_1 : ( ruleEString ) ;
    public final void rule__PieChartFX__YAxisLabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9542:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9543:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9543:2: ( ruleEString )
            // InternalJavaFXLang.g:9544:3: ruleEString
            {
             before(grammarAccess.getPieChartFXAccess().getYAxisLabelEStringParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieChartFXAccess().getYAxisLabelEStringParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__YAxisLabelAssignment_11_1"


    // $ANTLR start "rule__PieChartFX__YAxisTypeAssignment_12_1"
    // InternalJavaFXLang.g:9553:1: rule__PieChartFX__YAxisTypeAssignment_12_1 : ( ruleAxisType ) ;
    public final void rule__PieChartFX__YAxisTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9557:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9558:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9558:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9559:3: ruleAxisType
            {
             before(grammarAccess.getPieChartFXAccess().getYAxisTypeAxisTypeEnumRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxisType();

            state._fsp--;

             after(grammarAccess.getPieChartFXAccess().getYAxisTypeAxisTypeEnumRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChartFX__YAxisTypeAssignment_12_1"


    // $ANTLR start "rule__LineChartFX__NameAssignment_4"
    // InternalJavaFXLang.g:9568:1: rule__LineChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__LineChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9572:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9573:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9573:2: ( ruleEString )
            // InternalJavaFXLang.g:9574:3: ruleEString
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
    // InternalJavaFXLang.g:9583:1: rule__LineChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__LineChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9587:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9588:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9588:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9589:3: ruleOrientation
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
    // InternalJavaFXLang.g:9598:1: rule__LineChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__LineChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9602:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:9603:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:9603:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:9604:3: ruleEBoolean
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
    // InternalJavaFXLang.g:9613:1: rule__LineChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__LineChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9617:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9618:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9618:2: ( ruleEString )
            // InternalJavaFXLang.g:9619:3: ruleEString
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
    // InternalJavaFXLang.g:9628:1: rule__LineChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__LineChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9632:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9633:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9633:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9634:3: ruleOrientation
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
    // InternalJavaFXLang.g:9643:1: rule__LineChartFX__XAxisLabelAssignment_9_1 : ( ruleEString ) ;
    public final void rule__LineChartFX__XAxisLabelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9647:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9648:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9648:2: ( ruleEString )
            // InternalJavaFXLang.g:9649:3: ruleEString
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
    // InternalJavaFXLang.g:9658:1: rule__LineChartFX__XAxisTypeAssignment_10_1 : ( ruleAxisType ) ;
    public final void rule__LineChartFX__XAxisTypeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9662:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9663:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9663:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9664:3: ruleAxisType
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
    // InternalJavaFXLang.g:9673:1: rule__LineChartFX__YAxisLabelAssignment_11_1 : ( ruleEString ) ;
    public final void rule__LineChartFX__YAxisLabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9677:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9678:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9678:2: ( ruleEString )
            // InternalJavaFXLang.g:9679:3: ruleEString
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
    // InternalJavaFXLang.g:9688:1: rule__LineChartFX__YAxisTypeAssignment_12_1 : ( ruleAxisType ) ;
    public final void rule__LineChartFX__YAxisTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9692:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9693:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9693:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9694:3: ruleAxisType
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
    // InternalJavaFXLang.g:9703:1: rule__Binding__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Binding__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9707:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9708:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9708:2: ( ruleEString )
            // InternalJavaFXLang.g:9709:3: ruleEString
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
    // InternalJavaFXLang.g:9718:1: rule__Binding__PropertyAssignment_4_0 : ( ruleBindingProperty ) ;
    public final void rule__Binding__PropertyAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9722:1: ( ( ruleBindingProperty ) )
            // InternalJavaFXLang.g:9723:2: ( ruleBindingProperty )
            {
            // InternalJavaFXLang.g:9723:2: ( ruleBindingProperty )
            // InternalJavaFXLang.g:9724:3: ruleBindingProperty
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
    // InternalJavaFXLang.g:9733:1: rule__Binding__PropertyAssignment_4_1 : ( ruleBindingProperty ) ;
    public final void rule__Binding__PropertyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9737:1: ( ( ruleBindingProperty ) )
            // InternalJavaFXLang.g:9738:2: ( ruleBindingProperty )
            {
            // InternalJavaFXLang.g:9738:2: ( ruleBindingProperty )
            // InternalJavaFXLang.g:9739:3: ruleBindingProperty
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
    // InternalJavaFXLang.g:9748:1: rule__BindingProperty__TypeAssignment_1 : ( ruleBindinType ) ;
    public final void rule__BindingProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9752:1: ( ( ruleBindinType ) )
            // InternalJavaFXLang.g:9753:2: ( ruleBindinType )
            {
            // InternalJavaFXLang.g:9753:2: ( ruleBindinType )
            // InternalJavaFXLang.g:9754:3: ruleBindinType
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
    // InternalJavaFXLang.g:9763:1: rule__BindingProperty__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BindingProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9767:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9768:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9768:2: ( ruleEString )
            // InternalJavaFXLang.g:9769:3: ruleEString
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
    // InternalJavaFXLang.g:9778:1: rule__FilteredTableViewFX__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__FilteredTableViewFX__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9782:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9783:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9783:2: ( ruleEString )
            // InternalJavaFXLang.g:9784:3: ruleEString
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
    // InternalJavaFXLang.g:9793:1: rule__FilteredTableViewFX__UsedModelAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__FilteredTableViewFX__UsedModelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9797:1: ( ( ( ruleEString ) ) )
            // InternalJavaFXLang.g:9798:2: ( ( ruleEString ) )
            {
            // InternalJavaFXLang.g:9798:2: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9799:3: ( ruleEString )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUsedModelModelFXCrossReference_4_1_0()); 
            // InternalJavaFXLang.g:9800:3: ( ruleEString )
            // InternalJavaFXLang.g:9801:4: ruleEString
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
    // InternalJavaFXLang.g:9812:1: rule__FilteredTableViewFX__UseFilterAssignment_5_1 : ( ruleEBoolean ) ;
    public final void rule__FilteredTableViewFX__UseFilterAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9816:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:9817:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:9817:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:9818:3: ruleEBoolean
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
    // InternalJavaFXLang.g:9827:1: rule__FilteredTableViewFX__ColumnsAssignment_6_0 : ( ruleTableColumnFX ) ;
    public final void rule__FilteredTableViewFX__ColumnsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9831:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:9832:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:9832:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:9833:3: ruleTableColumnFX
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
    // InternalJavaFXLang.g:9842:1: rule__FilteredTableViewFX__ColumnsAssignment_6_1 : ( ruleTableColumnFX ) ;
    public final void rule__FilteredTableViewFX__ColumnsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9846:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:9847:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:9847:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:9848:3: ruleTableColumnFX
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
    // InternalJavaFXLang.g:9857:1: rule__DerivedBean__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DerivedBean__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9861:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9862:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9862:2: ( ruleEString )
            // InternalJavaFXLang.g:9863:3: ruleEString
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
    // InternalJavaFXLang.g:9872:1: rule__DerivedBean__InstanceTypeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__DerivedBean__InstanceTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9876:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9877:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9877:2: ( ruleEString )
            // InternalJavaFXLang.g:9878:3: ruleEString
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
    // InternalJavaFXLang.g:9887:1: rule__DerivedBean__AttributesAssignment_5_0 : ( ruleAttributeFX ) ;
    public final void rule__DerivedBean__AttributesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9891:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:9892:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:9892:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:9893:3: ruleAttributeFX
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
    // InternalJavaFXLang.g:9902:1: rule__DerivedBean__AttributesAssignment_5_1 : ( ruleAttributeFX ) ;
    public final void rule__DerivedBean__AttributesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9906:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:9907:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:9907:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:9908:3: ruleAttributeFX
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
    // InternalJavaFXLang.g:9917:1: rule__Bean__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Bean__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9921:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9922:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9922:2: ( ruleEString )
            // InternalJavaFXLang.g:9923:3: ruleEString
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
    // InternalJavaFXLang.g:9932:1: rule__Bean__AttributesAssignment_4_0 : ( ruleAttributeFX ) ;
    public final void rule__Bean__AttributesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9936:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:9937:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:9937:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:9938:3: ruleAttributeFX
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
    // InternalJavaFXLang.g:9947:1: rule__Bean__AttributesAssignment_4_1 : ( ruleAttributeFX ) ;
    public final void rule__Bean__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9951:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:9952:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:9952:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:9953:3: ruleAttributeFX
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
    // InternalJavaFXLang.g:9962:1: rule__TableViewFX__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__TableViewFX__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9966:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9967:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9967:2: ( ruleEString )
            // InternalJavaFXLang.g:9968:3: ruleEString
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
    // InternalJavaFXLang.g:9977:1: rule__TableViewFX__UsedModelAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__TableViewFX__UsedModelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9981:1: ( ( ( ruleEString ) ) )
            // InternalJavaFXLang.g:9982:2: ( ( ruleEString ) )
            {
            // InternalJavaFXLang.g:9982:2: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9983:3: ( ruleEString )
            {
             before(grammarAccess.getTableViewFXAccess().getUsedModelModelFXCrossReference_4_1_0()); 
            // InternalJavaFXLang.g:9984:3: ( ruleEString )
            // InternalJavaFXLang.g:9985:4: ruleEString
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
    // InternalJavaFXLang.g:9996:1: rule__TableViewFX__ColumnsAssignment_5_0 : ( ruleTableColumnFX ) ;
    public final void rule__TableViewFX__ColumnsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10000:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:10001:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:10001:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:10002:3: ruleTableColumnFX
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
    // InternalJavaFXLang.g:10011:1: rule__TableViewFX__ColumnsAssignment_5_1 : ( ruleTableColumnFX ) ;
    public final void rule__TableViewFX__ColumnsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10015:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:10016:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:10016:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:10017:3: ruleTableColumnFX
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
    // InternalJavaFXLang.g:10026:1: rule__TableColumnFX__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__TableColumnFX__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10030:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10031:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10031:2: ( ruleEString )
            // InternalJavaFXLang.g:10032:3: ruleEString
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
    // InternalJavaFXLang.g:10041:1: rule__TableColumnFX__WidthAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__TableColumnFX__WidthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10045:1: ( ( ruleEInt ) )
            // InternalJavaFXLang.g:10046:2: ( ruleEInt )
            {
            // InternalJavaFXLang.g:10046:2: ( ruleEInt )
            // InternalJavaFXLang.g:10047:3: ruleEInt
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
    // InternalJavaFXLang.g:10056:1: rule__TableColumnFX__UsedAttributeAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__TableColumnFX__UsedAttributeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10060:1: ( ( ( ruleEString ) ) )
            // InternalJavaFXLang.g:10061:2: ( ( ruleEString ) )
            {
            // InternalJavaFXLang.g:10061:2: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10062:3: ( ruleEString )
            {
             before(grammarAccess.getTableColumnFXAccess().getUsedAttributeAttributeFXCrossReference_5_1_0()); 
            // InternalJavaFXLang.g:10063:3: ( ruleEString )
            // InternalJavaFXLang.g:10064:4: ruleEString
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
    // InternalJavaFXLang.g:10075:1: rule__TableColumnFX__UseFilterAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__TableColumnFX__UseFilterAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10079:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:10080:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:10080:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:10081:3: ruleEBoolean
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
    // InternalJavaFXLang.g:10090:1: rule__AttributeFX__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__AttributeFX__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10094:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10095:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10095:2: ( ruleEString )
            // InternalJavaFXLang.g:10096:3: ruleEString
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
    // InternalJavaFXLang.g:10105:1: rule__AttributeFX__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__AttributeFX__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10109:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10110:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10110:2: ( ruleEString )
            // InternalJavaFXLang.g:10111:3: ruleEString
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0084000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0084000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0084000000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0020000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0002000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001F00400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001F00410000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001F00400000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000FF010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000013F80000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000003F80000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000003F80002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0118000010000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0108000010000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x3C00000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x4000000000000040L});

}