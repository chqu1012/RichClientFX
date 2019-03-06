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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Category'", "'Number'", "'Bottom'", "'Left'", "'Right'", "'Top'", "'BooleanProperty'", "'DoubleProperty'", "'FloatProperty'", "'IntegerProperty'", "'ObservableList'", "'ObjectProperty'", "'StringProperty'", "'ProjectFX'", "'{'", "'}'", "'packagePath'", "'controls'", "'models'", "'bindings'", "'charts'", "'BarChart'", "'name:'", "'legendSide:'", "'showLegend:'", "'title:'", "'titleSide:'", "'xAxisLabel:'", "'xAxisType:'", "'yAxisLabel:'", "'yAxisType:'", "'ScatterChart'", "'BubbleChart'", "'AreaChart'", "'PieChart'", "'LineChart'", "'series'", "'dataList'", "'data'", "'('", "','", "')'", "'binding'", "'FilteredTableView'", "'usedModel:'", "'usedFilter:'", "'class'", "'instanceType:'", "'TableView'", "'Column'", "'width:'", "'attribute:'", "'useFilter:'", "'-'"
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
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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


    // $ANTLR start "entryRuleChartSeries"
    // InternalJavaFXLang.g:253:1: entryRuleChartSeries : ruleChartSeries EOF ;
    public final void entryRuleChartSeries() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:254:1: ( ruleChartSeries EOF )
            // InternalJavaFXLang.g:255:1: ruleChartSeries EOF
            {
             before(grammarAccess.getChartSeriesRule()); 
            pushFollow(FOLLOW_1);
            ruleChartSeries();

            state._fsp--;

             after(grammarAccess.getChartSeriesRule()); 
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
    // $ANTLR end "entryRuleChartSeries"


    // $ANTLR start "ruleChartSeries"
    // InternalJavaFXLang.g:262:1: ruleChartSeries : ( ( rule__ChartSeries__Group__0 ) ) ;
    public final void ruleChartSeries() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:266:2: ( ( ( rule__ChartSeries__Group__0 ) ) )
            // InternalJavaFXLang.g:267:2: ( ( rule__ChartSeries__Group__0 ) )
            {
            // InternalJavaFXLang.g:267:2: ( ( rule__ChartSeries__Group__0 ) )
            // InternalJavaFXLang.g:268:3: ( rule__ChartSeries__Group__0 )
            {
             before(grammarAccess.getChartSeriesAccess().getGroup()); 
            // InternalJavaFXLang.g:269:3: ( rule__ChartSeries__Group__0 )
            // InternalJavaFXLang.g:269:4: rule__ChartSeries__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChartSeries__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChartSeriesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChartSeries"


    // $ANTLR start "entryRuleChartFXData"
    // InternalJavaFXLang.g:278:1: entryRuleChartFXData : ruleChartFXData EOF ;
    public final void entryRuleChartFXData() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:279:1: ( ruleChartFXData EOF )
            // InternalJavaFXLang.g:280:1: ruleChartFXData EOF
            {
             before(grammarAccess.getChartFXDataRule()); 
            pushFollow(FOLLOW_1);
            ruleChartFXData();

            state._fsp--;

             after(grammarAccess.getChartFXDataRule()); 
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
    // $ANTLR end "entryRuleChartFXData"


    // $ANTLR start "ruleChartFXData"
    // InternalJavaFXLang.g:287:1: ruleChartFXData : ( ( rule__ChartFXData__Group__0 ) ) ;
    public final void ruleChartFXData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:291:2: ( ( ( rule__ChartFXData__Group__0 ) ) )
            // InternalJavaFXLang.g:292:2: ( ( rule__ChartFXData__Group__0 ) )
            {
            // InternalJavaFXLang.g:292:2: ( ( rule__ChartFXData__Group__0 ) )
            // InternalJavaFXLang.g:293:3: ( rule__ChartFXData__Group__0 )
            {
             before(grammarAccess.getChartFXDataAccess().getGroup()); 
            // InternalJavaFXLang.g:294:3: ( rule__ChartFXData__Group__0 )
            // InternalJavaFXLang.g:294:4: rule__ChartFXData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChartFXData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChartFXDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChartFXData"


    // $ANTLR start "entryRuleBinding"
    // InternalJavaFXLang.g:303:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:304:1: ( ruleBinding EOF )
            // InternalJavaFXLang.g:305:1: ruleBinding EOF
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
    // InternalJavaFXLang.g:312:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:316:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalJavaFXLang.g:317:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalJavaFXLang.g:317:2: ( ( rule__Binding__Group__0 ) )
            // InternalJavaFXLang.g:318:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalJavaFXLang.g:319:3: ( rule__Binding__Group__0 )
            // InternalJavaFXLang.g:319:4: rule__Binding__Group__0
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
    // InternalJavaFXLang.g:328:1: entryRuleBindingProperty : ruleBindingProperty EOF ;
    public final void entryRuleBindingProperty() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:329:1: ( ruleBindingProperty EOF )
            // InternalJavaFXLang.g:330:1: ruleBindingProperty EOF
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
    // InternalJavaFXLang.g:337:1: ruleBindingProperty : ( ( rule__BindingProperty__Group__0 ) ) ;
    public final void ruleBindingProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:341:2: ( ( ( rule__BindingProperty__Group__0 ) ) )
            // InternalJavaFXLang.g:342:2: ( ( rule__BindingProperty__Group__0 ) )
            {
            // InternalJavaFXLang.g:342:2: ( ( rule__BindingProperty__Group__0 ) )
            // InternalJavaFXLang.g:343:3: ( rule__BindingProperty__Group__0 )
            {
             before(grammarAccess.getBindingPropertyAccess().getGroup()); 
            // InternalJavaFXLang.g:344:3: ( rule__BindingProperty__Group__0 )
            // InternalJavaFXLang.g:344:4: rule__BindingProperty__Group__0
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
    // InternalJavaFXLang.g:353:1: entryRuleControlFX : ruleControlFX EOF ;
    public final void entryRuleControlFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:354:1: ( ruleControlFX EOF )
            // InternalJavaFXLang.g:355:1: ruleControlFX EOF
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
    // InternalJavaFXLang.g:362:1: ruleControlFX : ( ( rule__ControlFX__Alternatives ) ) ;
    public final void ruleControlFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:366:2: ( ( ( rule__ControlFX__Alternatives ) ) )
            // InternalJavaFXLang.g:367:2: ( ( rule__ControlFX__Alternatives ) )
            {
            // InternalJavaFXLang.g:367:2: ( ( rule__ControlFX__Alternatives ) )
            // InternalJavaFXLang.g:368:3: ( rule__ControlFX__Alternatives )
            {
             before(grammarAccess.getControlFXAccess().getAlternatives()); 
            // InternalJavaFXLang.g:369:3: ( rule__ControlFX__Alternatives )
            // InternalJavaFXLang.g:369:4: rule__ControlFX__Alternatives
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
    // InternalJavaFXLang.g:378:1: entryRuleFilteredTableViewFX : ruleFilteredTableViewFX EOF ;
    public final void entryRuleFilteredTableViewFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:379:1: ( ruleFilteredTableViewFX EOF )
            // InternalJavaFXLang.g:380:1: ruleFilteredTableViewFX EOF
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
    // InternalJavaFXLang.g:387:1: ruleFilteredTableViewFX : ( ( rule__FilteredTableViewFX__Group__0 ) ) ;
    public final void ruleFilteredTableViewFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:391:2: ( ( ( rule__FilteredTableViewFX__Group__0 ) ) )
            // InternalJavaFXLang.g:392:2: ( ( rule__FilteredTableViewFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:392:2: ( ( rule__FilteredTableViewFX__Group__0 ) )
            // InternalJavaFXLang.g:393:3: ( rule__FilteredTableViewFX__Group__0 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup()); 
            // InternalJavaFXLang.g:394:3: ( rule__FilteredTableViewFX__Group__0 )
            // InternalJavaFXLang.g:394:4: rule__FilteredTableViewFX__Group__0
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
    // InternalJavaFXLang.g:403:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:404:1: ( ruleEString EOF )
            // InternalJavaFXLang.g:405:1: ruleEString EOF
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
    // InternalJavaFXLang.g:412:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:416:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalJavaFXLang.g:417:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalJavaFXLang.g:417:2: ( ( rule__EString__Alternatives ) )
            // InternalJavaFXLang.g:418:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalJavaFXLang.g:419:3: ( rule__EString__Alternatives )
            // InternalJavaFXLang.g:419:4: rule__EString__Alternatives
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
    // InternalJavaFXLang.g:428:1: entryRuleModelFX : ruleModelFX EOF ;
    public final void entryRuleModelFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:429:1: ( ruleModelFX EOF )
            // InternalJavaFXLang.g:430:1: ruleModelFX EOF
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
    // InternalJavaFXLang.g:437:1: ruleModelFX : ( ( rule__ModelFX__Alternatives ) ) ;
    public final void ruleModelFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:441:2: ( ( ( rule__ModelFX__Alternatives ) ) )
            // InternalJavaFXLang.g:442:2: ( ( rule__ModelFX__Alternatives ) )
            {
            // InternalJavaFXLang.g:442:2: ( ( rule__ModelFX__Alternatives ) )
            // InternalJavaFXLang.g:443:3: ( rule__ModelFX__Alternatives )
            {
             before(grammarAccess.getModelFXAccess().getAlternatives()); 
            // InternalJavaFXLang.g:444:3: ( rule__ModelFX__Alternatives )
            // InternalJavaFXLang.g:444:4: rule__ModelFX__Alternatives
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
    // InternalJavaFXLang.g:453:1: entryRuleDerivedBean : ruleDerivedBean EOF ;
    public final void entryRuleDerivedBean() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:454:1: ( ruleDerivedBean EOF )
            // InternalJavaFXLang.g:455:1: ruleDerivedBean EOF
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
    // InternalJavaFXLang.g:462:1: ruleDerivedBean : ( ( rule__DerivedBean__Group__0 ) ) ;
    public final void ruleDerivedBean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:466:2: ( ( ( rule__DerivedBean__Group__0 ) ) )
            // InternalJavaFXLang.g:467:2: ( ( rule__DerivedBean__Group__0 ) )
            {
            // InternalJavaFXLang.g:467:2: ( ( rule__DerivedBean__Group__0 ) )
            // InternalJavaFXLang.g:468:3: ( rule__DerivedBean__Group__0 )
            {
             before(grammarAccess.getDerivedBeanAccess().getGroup()); 
            // InternalJavaFXLang.g:469:3: ( rule__DerivedBean__Group__0 )
            // InternalJavaFXLang.g:469:4: rule__DerivedBean__Group__0
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
    // InternalJavaFXLang.g:478:1: entryRuleBean : ruleBean EOF ;
    public final void entryRuleBean() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:479:1: ( ruleBean EOF )
            // InternalJavaFXLang.g:480:1: ruleBean EOF
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
    // InternalJavaFXLang.g:487:1: ruleBean : ( ( rule__Bean__Group__0 ) ) ;
    public final void ruleBean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:491:2: ( ( ( rule__Bean__Group__0 ) ) )
            // InternalJavaFXLang.g:492:2: ( ( rule__Bean__Group__0 ) )
            {
            // InternalJavaFXLang.g:492:2: ( ( rule__Bean__Group__0 ) )
            // InternalJavaFXLang.g:493:3: ( rule__Bean__Group__0 )
            {
             before(grammarAccess.getBeanAccess().getGroup()); 
            // InternalJavaFXLang.g:494:3: ( rule__Bean__Group__0 )
            // InternalJavaFXLang.g:494:4: rule__Bean__Group__0
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
    // InternalJavaFXLang.g:503:1: entryRuleTableViewFX : ruleTableViewFX EOF ;
    public final void entryRuleTableViewFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:504:1: ( ruleTableViewFX EOF )
            // InternalJavaFXLang.g:505:1: ruleTableViewFX EOF
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
    // InternalJavaFXLang.g:512:1: ruleTableViewFX : ( ( rule__TableViewFX__Group__0 ) ) ;
    public final void ruleTableViewFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:516:2: ( ( ( rule__TableViewFX__Group__0 ) ) )
            // InternalJavaFXLang.g:517:2: ( ( rule__TableViewFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:517:2: ( ( rule__TableViewFX__Group__0 ) )
            // InternalJavaFXLang.g:518:3: ( rule__TableViewFX__Group__0 )
            {
             before(grammarAccess.getTableViewFXAccess().getGroup()); 
            // InternalJavaFXLang.g:519:3: ( rule__TableViewFX__Group__0 )
            // InternalJavaFXLang.g:519:4: rule__TableViewFX__Group__0
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
    // InternalJavaFXLang.g:528:1: entryRuleTableColumnFX : ruleTableColumnFX EOF ;
    public final void entryRuleTableColumnFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:529:1: ( ruleTableColumnFX EOF )
            // InternalJavaFXLang.g:530:1: ruleTableColumnFX EOF
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
    // InternalJavaFXLang.g:537:1: ruleTableColumnFX : ( ( rule__TableColumnFX__Group__0 ) ) ;
    public final void ruleTableColumnFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:541:2: ( ( ( rule__TableColumnFX__Group__0 ) ) )
            // InternalJavaFXLang.g:542:2: ( ( rule__TableColumnFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:542:2: ( ( rule__TableColumnFX__Group__0 ) )
            // InternalJavaFXLang.g:543:3: ( rule__TableColumnFX__Group__0 )
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup()); 
            // InternalJavaFXLang.g:544:3: ( rule__TableColumnFX__Group__0 )
            // InternalJavaFXLang.g:544:4: rule__TableColumnFX__Group__0
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
    // InternalJavaFXLang.g:553:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:554:1: ( ruleEBoolean EOF )
            // InternalJavaFXLang.g:555:1: ruleEBoolean EOF
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
    // InternalJavaFXLang.g:562:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:566:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalJavaFXLang.g:567:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalJavaFXLang.g:567:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalJavaFXLang.g:568:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalJavaFXLang.g:569:3: ( rule__EBoolean__Alternatives )
            // InternalJavaFXLang.g:569:4: rule__EBoolean__Alternatives
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
    // InternalJavaFXLang.g:578:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:579:1: ( ruleEInt EOF )
            // InternalJavaFXLang.g:580:1: ruleEInt EOF
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
    // InternalJavaFXLang.g:587:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:591:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalJavaFXLang.g:592:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalJavaFXLang.g:592:2: ( ( rule__EInt__Group__0 ) )
            // InternalJavaFXLang.g:593:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalJavaFXLang.g:594:3: ( rule__EInt__Group__0 )
            // InternalJavaFXLang.g:594:4: rule__EInt__Group__0
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
    // InternalJavaFXLang.g:603:1: entryRuleAttributeFX : ruleAttributeFX EOF ;
    public final void entryRuleAttributeFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:604:1: ( ruleAttributeFX EOF )
            // InternalJavaFXLang.g:605:1: ruleAttributeFX EOF
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
    // InternalJavaFXLang.g:612:1: ruleAttributeFX : ( ( rule__AttributeFX__Group__0 ) ) ;
    public final void ruleAttributeFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:616:2: ( ( ( rule__AttributeFX__Group__0 ) ) )
            // InternalJavaFXLang.g:617:2: ( ( rule__AttributeFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:617:2: ( ( rule__AttributeFX__Group__0 ) )
            // InternalJavaFXLang.g:618:3: ( rule__AttributeFX__Group__0 )
            {
             before(grammarAccess.getAttributeFXAccess().getGroup()); 
            // InternalJavaFXLang.g:619:3: ( rule__AttributeFX__Group__0 )
            // InternalJavaFXLang.g:619:4: rule__AttributeFX__Group__0
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
    // InternalJavaFXLang.g:628:1: ruleAxisType : ( ( rule__AxisType__Alternatives ) ) ;
    public final void ruleAxisType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:632:1: ( ( ( rule__AxisType__Alternatives ) ) )
            // InternalJavaFXLang.g:633:2: ( ( rule__AxisType__Alternatives ) )
            {
            // InternalJavaFXLang.g:633:2: ( ( rule__AxisType__Alternatives ) )
            // InternalJavaFXLang.g:634:3: ( rule__AxisType__Alternatives )
            {
             before(grammarAccess.getAxisTypeAccess().getAlternatives()); 
            // InternalJavaFXLang.g:635:3: ( rule__AxisType__Alternatives )
            // InternalJavaFXLang.g:635:4: rule__AxisType__Alternatives
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
    // InternalJavaFXLang.g:644:1: ruleOrientation : ( ( rule__Orientation__Alternatives ) ) ;
    public final void ruleOrientation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:648:1: ( ( ( rule__Orientation__Alternatives ) ) )
            // InternalJavaFXLang.g:649:2: ( ( rule__Orientation__Alternatives ) )
            {
            // InternalJavaFXLang.g:649:2: ( ( rule__Orientation__Alternatives ) )
            // InternalJavaFXLang.g:650:3: ( rule__Orientation__Alternatives )
            {
             before(grammarAccess.getOrientationAccess().getAlternatives()); 
            // InternalJavaFXLang.g:651:3: ( rule__Orientation__Alternatives )
            // InternalJavaFXLang.g:651:4: rule__Orientation__Alternatives
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
    // InternalJavaFXLang.g:660:1: ruleBindinType : ( ( rule__BindinType__Alternatives ) ) ;
    public final void ruleBindinType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:664:1: ( ( ( rule__BindinType__Alternatives ) ) )
            // InternalJavaFXLang.g:665:2: ( ( rule__BindinType__Alternatives ) )
            {
            // InternalJavaFXLang.g:665:2: ( ( rule__BindinType__Alternatives ) )
            // InternalJavaFXLang.g:666:3: ( rule__BindinType__Alternatives )
            {
             before(grammarAccess.getBindinTypeAccess().getAlternatives()); 
            // InternalJavaFXLang.g:667:3: ( rule__BindinType__Alternatives )
            // InternalJavaFXLang.g:667:4: rule__BindinType__Alternatives
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
    // InternalJavaFXLang.g:675:1: rule__ChartFX__Alternatives : ( ( ruleLineChartFX ) | ( rulePieChartFX ) | ( ruleAreaChartFX ) | ( ruleBubbleChartFX ) | ( ruleScatterChartFX ) | ( ruleBarChartFX ) );
    public final void rule__ChartFX__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:679:1: ( ( ruleLineChartFX ) | ( rulePieChartFX ) | ( ruleAreaChartFX ) | ( ruleBubbleChartFX ) | ( ruleScatterChartFX ) | ( ruleBarChartFX ) )
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
                    // InternalJavaFXLang.g:680:2: ( ruleLineChartFX )
                    {
                    // InternalJavaFXLang.g:680:2: ( ruleLineChartFX )
                    // InternalJavaFXLang.g:681:3: ruleLineChartFX
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
                    // InternalJavaFXLang.g:686:2: ( rulePieChartFX )
                    {
                    // InternalJavaFXLang.g:686:2: ( rulePieChartFX )
                    // InternalJavaFXLang.g:687:3: rulePieChartFX
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
                    // InternalJavaFXLang.g:692:2: ( ruleAreaChartFX )
                    {
                    // InternalJavaFXLang.g:692:2: ( ruleAreaChartFX )
                    // InternalJavaFXLang.g:693:3: ruleAreaChartFX
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
                    // InternalJavaFXLang.g:698:2: ( ruleBubbleChartFX )
                    {
                    // InternalJavaFXLang.g:698:2: ( ruleBubbleChartFX )
                    // InternalJavaFXLang.g:699:3: ruleBubbleChartFX
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
                    // InternalJavaFXLang.g:704:2: ( ruleScatterChartFX )
                    {
                    // InternalJavaFXLang.g:704:2: ( ruleScatterChartFX )
                    // InternalJavaFXLang.g:705:3: ruleScatterChartFX
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
                    // InternalJavaFXLang.g:710:2: ( ruleBarChartFX )
                    {
                    // InternalJavaFXLang.g:710:2: ( ruleBarChartFX )
                    // InternalJavaFXLang.g:711:3: ruleBarChartFX
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
    // InternalJavaFXLang.g:720:1: rule__ControlFX__Alternatives : ( ( ruleTableViewFX ) | ( ruleFilteredTableViewFX ) );
    public final void rule__ControlFX__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:724:1: ( ( ruleTableViewFX ) | ( ruleFilteredTableViewFX ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==61) ) {
                alt2=1;
            }
            else if ( (LA2_0==56) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJavaFXLang.g:725:2: ( ruleTableViewFX )
                    {
                    // InternalJavaFXLang.g:725:2: ( ruleTableViewFX )
                    // InternalJavaFXLang.g:726:3: ruleTableViewFX
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
                    // InternalJavaFXLang.g:731:2: ( ruleFilteredTableViewFX )
                    {
                    // InternalJavaFXLang.g:731:2: ( ruleFilteredTableViewFX )
                    // InternalJavaFXLang.g:732:3: ruleFilteredTableViewFX
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
    // InternalJavaFXLang.g:741:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:745:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalJavaFXLang.g:746:2: ( RULE_STRING )
                    {
                    // InternalJavaFXLang.g:746:2: ( RULE_STRING )
                    // InternalJavaFXLang.g:747:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:752:2: ( RULE_ID )
                    {
                    // InternalJavaFXLang.g:752:2: ( RULE_ID )
                    // InternalJavaFXLang.g:753:3: RULE_ID
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
    // InternalJavaFXLang.g:762:1: rule__ModelFX__Alternatives : ( ( ruleDerivedBean ) | ( ruleBean ) );
    public final void rule__ModelFX__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:766:1: ( ( ruleDerivedBean ) | ( ruleBean ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==59) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_STRING) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==27) ) {
                        int LA4_4 = input.LA(4);

                        if ( ((LA4_4>=RULE_STRING && LA4_4<=RULE_ID)||LA4_4==28) ) {
                            alt4=2;
                        }
                        else if ( (LA4_4==60) ) {
                            alt4=1;
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

                        if ( ((LA4_4>=RULE_STRING && LA4_4<=RULE_ID)||LA4_4==28) ) {
                            alt4=2;
                        }
                        else if ( (LA4_4==60) ) {
                            alt4=1;
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
                    // InternalJavaFXLang.g:767:2: ( ruleDerivedBean )
                    {
                    // InternalJavaFXLang.g:767:2: ( ruleDerivedBean )
                    // InternalJavaFXLang.g:768:3: ruleDerivedBean
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
                    // InternalJavaFXLang.g:773:2: ( ruleBean )
                    {
                    // InternalJavaFXLang.g:773:2: ( ruleBean )
                    // InternalJavaFXLang.g:774:3: ruleBean
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
    // InternalJavaFXLang.g:783:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:787:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalJavaFXLang.g:788:2: ( 'true' )
                    {
                    // InternalJavaFXLang.g:788:2: ( 'true' )
                    // InternalJavaFXLang.g:789:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:794:2: ( 'false' )
                    {
                    // InternalJavaFXLang.g:794:2: ( 'false' )
                    // InternalJavaFXLang.g:795:3: 'false'
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
    // InternalJavaFXLang.g:804:1: rule__AxisType__Alternatives : ( ( ( 'Category' ) ) | ( ( 'Number' ) ) );
    public final void rule__AxisType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:808:1: ( ( ( 'Category' ) ) | ( ( 'Number' ) ) )
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
                    // InternalJavaFXLang.g:809:2: ( ( 'Category' ) )
                    {
                    // InternalJavaFXLang.g:809:2: ( ( 'Category' ) )
                    // InternalJavaFXLang.g:810:3: ( 'Category' )
                    {
                     before(grammarAccess.getAxisTypeAccess().getCategoryEnumLiteralDeclaration_0()); 
                    // InternalJavaFXLang.g:811:3: ( 'Category' )
                    // InternalJavaFXLang.g:811:4: 'Category'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAxisTypeAccess().getCategoryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:815:2: ( ( 'Number' ) )
                    {
                    // InternalJavaFXLang.g:815:2: ( ( 'Number' ) )
                    // InternalJavaFXLang.g:816:3: ( 'Number' )
                    {
                     before(grammarAccess.getAxisTypeAccess().getNumberEnumLiteralDeclaration_1()); 
                    // InternalJavaFXLang.g:817:3: ( 'Number' )
                    // InternalJavaFXLang.g:817:4: 'Number'
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
    // InternalJavaFXLang.g:825:1: rule__Orientation__Alternatives : ( ( ( 'Bottom' ) ) | ( ( 'Left' ) ) | ( ( 'Right' ) ) | ( ( 'Top' ) ) );
    public final void rule__Orientation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:829:1: ( ( ( 'Bottom' ) ) | ( ( 'Left' ) ) | ( ( 'Right' ) ) | ( ( 'Top' ) ) )
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
                    // InternalJavaFXLang.g:830:2: ( ( 'Bottom' ) )
                    {
                    // InternalJavaFXLang.g:830:2: ( ( 'Bottom' ) )
                    // InternalJavaFXLang.g:831:3: ( 'Bottom' )
                    {
                     before(grammarAccess.getOrientationAccess().getBottomEnumLiteralDeclaration_0()); 
                    // InternalJavaFXLang.g:832:3: ( 'Bottom' )
                    // InternalJavaFXLang.g:832:4: 'Bottom'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrientationAccess().getBottomEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:836:2: ( ( 'Left' ) )
                    {
                    // InternalJavaFXLang.g:836:2: ( ( 'Left' ) )
                    // InternalJavaFXLang.g:837:3: ( 'Left' )
                    {
                     before(grammarAccess.getOrientationAccess().getLeftEnumLiteralDeclaration_1()); 
                    // InternalJavaFXLang.g:838:3: ( 'Left' )
                    // InternalJavaFXLang.g:838:4: 'Left'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrientationAccess().getLeftEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJavaFXLang.g:842:2: ( ( 'Right' ) )
                    {
                    // InternalJavaFXLang.g:842:2: ( ( 'Right' ) )
                    // InternalJavaFXLang.g:843:3: ( 'Right' )
                    {
                     before(grammarAccess.getOrientationAccess().getRightEnumLiteralDeclaration_2()); 
                    // InternalJavaFXLang.g:844:3: ( 'Right' )
                    // InternalJavaFXLang.g:844:4: 'Right'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrientationAccess().getRightEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJavaFXLang.g:848:2: ( ( 'Top' ) )
                    {
                    // InternalJavaFXLang.g:848:2: ( ( 'Top' ) )
                    // InternalJavaFXLang.g:849:3: ( 'Top' )
                    {
                     before(grammarAccess.getOrientationAccess().getTopEnumLiteralDeclaration_3()); 
                    // InternalJavaFXLang.g:850:3: ( 'Top' )
                    // InternalJavaFXLang.g:850:4: 'Top'
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
    // InternalJavaFXLang.g:858:1: rule__BindinType__Alternatives : ( ( ( 'BooleanProperty' ) ) | ( ( 'DoubleProperty' ) ) | ( ( 'FloatProperty' ) ) | ( ( 'IntegerProperty' ) ) | ( ( 'ObservableList' ) ) | ( ( 'ObjectProperty' ) ) | ( ( 'StringProperty' ) ) );
    public final void rule__BindinType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:862:1: ( ( ( 'BooleanProperty' ) ) | ( ( 'DoubleProperty' ) ) | ( ( 'FloatProperty' ) ) | ( ( 'IntegerProperty' ) ) | ( ( 'ObservableList' ) ) | ( ( 'ObjectProperty' ) ) | ( ( 'StringProperty' ) ) )
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
                    // InternalJavaFXLang.g:863:2: ( ( 'BooleanProperty' ) )
                    {
                    // InternalJavaFXLang.g:863:2: ( ( 'BooleanProperty' ) )
                    // InternalJavaFXLang.g:864:3: ( 'BooleanProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getBooleanPropertyEnumLiteralDeclaration_0()); 
                    // InternalJavaFXLang.g:865:3: ( 'BooleanProperty' )
                    // InternalJavaFXLang.g:865:4: 'BooleanProperty'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getBooleanPropertyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:869:2: ( ( 'DoubleProperty' ) )
                    {
                    // InternalJavaFXLang.g:869:2: ( ( 'DoubleProperty' ) )
                    // InternalJavaFXLang.g:870:3: ( 'DoubleProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getDoublePropertyEnumLiteralDeclaration_1()); 
                    // InternalJavaFXLang.g:871:3: ( 'DoubleProperty' )
                    // InternalJavaFXLang.g:871:4: 'DoubleProperty'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getDoublePropertyEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJavaFXLang.g:875:2: ( ( 'FloatProperty' ) )
                    {
                    // InternalJavaFXLang.g:875:2: ( ( 'FloatProperty' ) )
                    // InternalJavaFXLang.g:876:3: ( 'FloatProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getFloatPropertyEnumLiteralDeclaration_2()); 
                    // InternalJavaFXLang.g:877:3: ( 'FloatProperty' )
                    // InternalJavaFXLang.g:877:4: 'FloatProperty'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getFloatPropertyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJavaFXLang.g:881:2: ( ( 'IntegerProperty' ) )
                    {
                    // InternalJavaFXLang.g:881:2: ( ( 'IntegerProperty' ) )
                    // InternalJavaFXLang.g:882:3: ( 'IntegerProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getIntegerPropertyEnumLiteralDeclaration_3()); 
                    // InternalJavaFXLang.g:883:3: ( 'IntegerProperty' )
                    // InternalJavaFXLang.g:883:4: 'IntegerProperty'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getIntegerPropertyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJavaFXLang.g:887:2: ( ( 'ObservableList' ) )
                    {
                    // InternalJavaFXLang.g:887:2: ( ( 'ObservableList' ) )
                    // InternalJavaFXLang.g:888:3: ( 'ObservableList' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getObservableListEnumLiteralDeclaration_4()); 
                    // InternalJavaFXLang.g:889:3: ( 'ObservableList' )
                    // InternalJavaFXLang.g:889:4: 'ObservableList'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getObservableListEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJavaFXLang.g:893:2: ( ( 'ObjectProperty' ) )
                    {
                    // InternalJavaFXLang.g:893:2: ( ( 'ObjectProperty' ) )
                    // InternalJavaFXLang.g:894:3: ( 'ObjectProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getObjectPropertyEnumLiteralDeclaration_5()); 
                    // InternalJavaFXLang.g:895:3: ( 'ObjectProperty' )
                    // InternalJavaFXLang.g:895:4: 'ObjectProperty'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getObjectPropertyEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJavaFXLang.g:899:2: ( ( 'StringProperty' ) )
                    {
                    // InternalJavaFXLang.g:899:2: ( ( 'StringProperty' ) )
                    // InternalJavaFXLang.g:900:3: ( 'StringProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getStringPropertyEnumLiteralDeclaration_6()); 
                    // InternalJavaFXLang.g:901:3: ( 'StringProperty' )
                    // InternalJavaFXLang.g:901:4: 'StringProperty'
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
    // InternalJavaFXLang.g:909:1: rule__ProjectFX__Group__0 : rule__ProjectFX__Group__0__Impl rule__ProjectFX__Group__1 ;
    public final void rule__ProjectFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:913:1: ( rule__ProjectFX__Group__0__Impl rule__ProjectFX__Group__1 )
            // InternalJavaFXLang.g:914:2: rule__ProjectFX__Group__0__Impl rule__ProjectFX__Group__1
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
    // InternalJavaFXLang.g:921:1: rule__ProjectFX__Group__0__Impl : ( () ) ;
    public final void rule__ProjectFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:925:1: ( ( () ) )
            // InternalJavaFXLang.g:926:1: ( () )
            {
            // InternalJavaFXLang.g:926:1: ( () )
            // InternalJavaFXLang.g:927:2: ()
            {
             before(grammarAccess.getProjectFXAccess().getProjectFXAction_0()); 
            // InternalJavaFXLang.g:928:2: ()
            // InternalJavaFXLang.g:928:3: 
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
    // InternalJavaFXLang.g:936:1: rule__ProjectFX__Group__1 : rule__ProjectFX__Group__1__Impl rule__ProjectFX__Group__2 ;
    public final void rule__ProjectFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:940:1: ( rule__ProjectFX__Group__1__Impl rule__ProjectFX__Group__2 )
            // InternalJavaFXLang.g:941:2: rule__ProjectFX__Group__1__Impl rule__ProjectFX__Group__2
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
    // InternalJavaFXLang.g:948:1: rule__ProjectFX__Group__1__Impl : ( 'ProjectFX' ) ;
    public final void rule__ProjectFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:952:1: ( ( 'ProjectFX' ) )
            // InternalJavaFXLang.g:953:1: ( 'ProjectFX' )
            {
            // InternalJavaFXLang.g:953:1: ( 'ProjectFX' )
            // InternalJavaFXLang.g:954:2: 'ProjectFX'
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
    // InternalJavaFXLang.g:963:1: rule__ProjectFX__Group__2 : rule__ProjectFX__Group__2__Impl rule__ProjectFX__Group__3 ;
    public final void rule__ProjectFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:967:1: ( rule__ProjectFX__Group__2__Impl rule__ProjectFX__Group__3 )
            // InternalJavaFXLang.g:968:2: rule__ProjectFX__Group__2__Impl rule__ProjectFX__Group__3
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
    // InternalJavaFXLang.g:975:1: rule__ProjectFX__Group__2__Impl : ( ( rule__ProjectFX__NameAssignment_2 ) ) ;
    public final void rule__ProjectFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:979:1: ( ( ( rule__ProjectFX__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:980:1: ( ( rule__ProjectFX__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:980:1: ( ( rule__ProjectFX__NameAssignment_2 ) )
            // InternalJavaFXLang.g:981:2: ( rule__ProjectFX__NameAssignment_2 )
            {
             before(grammarAccess.getProjectFXAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:982:2: ( rule__ProjectFX__NameAssignment_2 )
            // InternalJavaFXLang.g:982:3: rule__ProjectFX__NameAssignment_2
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
    // InternalJavaFXLang.g:990:1: rule__ProjectFX__Group__3 : rule__ProjectFX__Group__3__Impl rule__ProjectFX__Group__4 ;
    public final void rule__ProjectFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:994:1: ( rule__ProjectFX__Group__3__Impl rule__ProjectFX__Group__4 )
            // InternalJavaFXLang.g:995:2: rule__ProjectFX__Group__3__Impl rule__ProjectFX__Group__4
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
    // InternalJavaFXLang.g:1002:1: rule__ProjectFX__Group__3__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1006:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1007:1: ( '{' )
            {
            // InternalJavaFXLang.g:1007:1: ( '{' )
            // InternalJavaFXLang.g:1008:2: '{'
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
    // InternalJavaFXLang.g:1017:1: rule__ProjectFX__Group__4 : rule__ProjectFX__Group__4__Impl rule__ProjectFX__Group__5 ;
    public final void rule__ProjectFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1021:1: ( rule__ProjectFX__Group__4__Impl rule__ProjectFX__Group__5 )
            // InternalJavaFXLang.g:1022:2: rule__ProjectFX__Group__4__Impl rule__ProjectFX__Group__5
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
    // InternalJavaFXLang.g:1029:1: rule__ProjectFX__Group__4__Impl : ( ( rule__ProjectFX__Group_4__0 )? ) ;
    public final void rule__ProjectFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1033:1: ( ( ( rule__ProjectFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:1034:1: ( ( rule__ProjectFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:1034:1: ( ( rule__ProjectFX__Group_4__0 )? )
            // InternalJavaFXLang.g:1035:2: ( rule__ProjectFX__Group_4__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:1036:2: ( rule__ProjectFX__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJavaFXLang.g:1036:3: rule__ProjectFX__Group_4__0
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
    // InternalJavaFXLang.g:1044:1: rule__ProjectFX__Group__5 : rule__ProjectFX__Group__5__Impl rule__ProjectFX__Group__6 ;
    public final void rule__ProjectFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1048:1: ( rule__ProjectFX__Group__5__Impl rule__ProjectFX__Group__6 )
            // InternalJavaFXLang.g:1049:2: rule__ProjectFX__Group__5__Impl rule__ProjectFX__Group__6
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
    // InternalJavaFXLang.g:1056:1: rule__ProjectFX__Group__5__Impl : ( ( rule__ProjectFX__Group_5__0 )? ) ;
    public final void rule__ProjectFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1060:1: ( ( ( rule__ProjectFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:1061:1: ( ( rule__ProjectFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:1061:1: ( ( rule__ProjectFX__Group_5__0 )? )
            // InternalJavaFXLang.g:1062:2: ( rule__ProjectFX__Group_5__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:1063:2: ( rule__ProjectFX__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJavaFXLang.g:1063:3: rule__ProjectFX__Group_5__0
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
    // InternalJavaFXLang.g:1071:1: rule__ProjectFX__Group__6 : rule__ProjectFX__Group__6__Impl rule__ProjectFX__Group__7 ;
    public final void rule__ProjectFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1075:1: ( rule__ProjectFX__Group__6__Impl rule__ProjectFX__Group__7 )
            // InternalJavaFXLang.g:1076:2: rule__ProjectFX__Group__6__Impl rule__ProjectFX__Group__7
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
    // InternalJavaFXLang.g:1083:1: rule__ProjectFX__Group__6__Impl : ( ( rule__ProjectFX__Group_6__0 )? ) ;
    public final void rule__ProjectFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1087:1: ( ( ( rule__ProjectFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:1088:1: ( ( rule__ProjectFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:1088:1: ( ( rule__ProjectFX__Group_6__0 )? )
            // InternalJavaFXLang.g:1089:2: ( rule__ProjectFX__Group_6__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:1090:2: ( rule__ProjectFX__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJavaFXLang.g:1090:3: rule__ProjectFX__Group_6__0
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
    // InternalJavaFXLang.g:1098:1: rule__ProjectFX__Group__7 : rule__ProjectFX__Group__7__Impl rule__ProjectFX__Group__8 ;
    public final void rule__ProjectFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1102:1: ( rule__ProjectFX__Group__7__Impl rule__ProjectFX__Group__8 )
            // InternalJavaFXLang.g:1103:2: rule__ProjectFX__Group__7__Impl rule__ProjectFX__Group__8
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
    // InternalJavaFXLang.g:1110:1: rule__ProjectFX__Group__7__Impl : ( ( rule__ProjectFX__Group_7__0 )? ) ;
    public final void rule__ProjectFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1114:1: ( ( ( rule__ProjectFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:1115:1: ( ( rule__ProjectFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:1115:1: ( ( rule__ProjectFX__Group_7__0 )? )
            // InternalJavaFXLang.g:1116:2: ( rule__ProjectFX__Group_7__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:1117:2: ( rule__ProjectFX__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJavaFXLang.g:1117:3: rule__ProjectFX__Group_7__0
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
    // InternalJavaFXLang.g:1125:1: rule__ProjectFX__Group__8 : rule__ProjectFX__Group__8__Impl rule__ProjectFX__Group__9 ;
    public final void rule__ProjectFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1129:1: ( rule__ProjectFX__Group__8__Impl rule__ProjectFX__Group__9 )
            // InternalJavaFXLang.g:1130:2: rule__ProjectFX__Group__8__Impl rule__ProjectFX__Group__9
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
    // InternalJavaFXLang.g:1137:1: rule__ProjectFX__Group__8__Impl : ( ( rule__ProjectFX__Group_8__0 )? ) ;
    public final void rule__ProjectFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1141:1: ( ( ( rule__ProjectFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:1142:1: ( ( rule__ProjectFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:1142:1: ( ( rule__ProjectFX__Group_8__0 )? )
            // InternalJavaFXLang.g:1143:2: ( rule__ProjectFX__Group_8__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:1144:2: ( rule__ProjectFX__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJavaFXLang.g:1144:3: rule__ProjectFX__Group_8__0
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
    // InternalJavaFXLang.g:1152:1: rule__ProjectFX__Group__9 : rule__ProjectFX__Group__9__Impl ;
    public final void rule__ProjectFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1156:1: ( rule__ProjectFX__Group__9__Impl )
            // InternalJavaFXLang.g:1157:2: rule__ProjectFX__Group__9__Impl
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
    // InternalJavaFXLang.g:1163:1: rule__ProjectFX__Group__9__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1167:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1168:1: ( '}' )
            {
            // InternalJavaFXLang.g:1168:1: ( '}' )
            // InternalJavaFXLang.g:1169:2: '}'
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
    // InternalJavaFXLang.g:1179:1: rule__ProjectFX__Group_4__0 : rule__ProjectFX__Group_4__0__Impl rule__ProjectFX__Group_4__1 ;
    public final void rule__ProjectFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1183:1: ( rule__ProjectFX__Group_4__0__Impl rule__ProjectFX__Group_4__1 )
            // InternalJavaFXLang.g:1184:2: rule__ProjectFX__Group_4__0__Impl rule__ProjectFX__Group_4__1
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
    // InternalJavaFXLang.g:1191:1: rule__ProjectFX__Group_4__0__Impl : ( 'packagePath' ) ;
    public final void rule__ProjectFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1195:1: ( ( 'packagePath' ) )
            // InternalJavaFXLang.g:1196:1: ( 'packagePath' )
            {
            // InternalJavaFXLang.g:1196:1: ( 'packagePath' )
            // InternalJavaFXLang.g:1197:2: 'packagePath'
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
    // InternalJavaFXLang.g:1206:1: rule__ProjectFX__Group_4__1 : rule__ProjectFX__Group_4__1__Impl ;
    public final void rule__ProjectFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1210:1: ( rule__ProjectFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:1211:2: rule__ProjectFX__Group_4__1__Impl
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
    // InternalJavaFXLang.g:1217:1: rule__ProjectFX__Group_4__1__Impl : ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) ) ;
    public final void rule__ProjectFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1221:1: ( ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:1222:1: ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:1222:1: ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) )
            // InternalJavaFXLang.g:1223:2: ( rule__ProjectFX__PackagePathAssignment_4_1 )
            {
             before(grammarAccess.getProjectFXAccess().getPackagePathAssignment_4_1()); 
            // InternalJavaFXLang.g:1224:2: ( rule__ProjectFX__PackagePathAssignment_4_1 )
            // InternalJavaFXLang.g:1224:3: rule__ProjectFX__PackagePathAssignment_4_1
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
    // InternalJavaFXLang.g:1233:1: rule__ProjectFX__Group_5__0 : rule__ProjectFX__Group_5__0__Impl rule__ProjectFX__Group_5__1 ;
    public final void rule__ProjectFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1237:1: ( rule__ProjectFX__Group_5__0__Impl rule__ProjectFX__Group_5__1 )
            // InternalJavaFXLang.g:1238:2: rule__ProjectFX__Group_5__0__Impl rule__ProjectFX__Group_5__1
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
    // InternalJavaFXLang.g:1245:1: rule__ProjectFX__Group_5__0__Impl : ( 'controls' ) ;
    public final void rule__ProjectFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1249:1: ( ( 'controls' ) )
            // InternalJavaFXLang.g:1250:1: ( 'controls' )
            {
            // InternalJavaFXLang.g:1250:1: ( 'controls' )
            // InternalJavaFXLang.g:1251:2: 'controls'
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
    // InternalJavaFXLang.g:1260:1: rule__ProjectFX__Group_5__1 : rule__ProjectFX__Group_5__1__Impl rule__ProjectFX__Group_5__2 ;
    public final void rule__ProjectFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1264:1: ( rule__ProjectFX__Group_5__1__Impl rule__ProjectFX__Group_5__2 )
            // InternalJavaFXLang.g:1265:2: rule__ProjectFX__Group_5__1__Impl rule__ProjectFX__Group_5__2
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
    // InternalJavaFXLang.g:1272:1: rule__ProjectFX__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1276:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1277:1: ( '{' )
            {
            // InternalJavaFXLang.g:1277:1: ( '{' )
            // InternalJavaFXLang.g:1278:2: '{'
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
    // InternalJavaFXLang.g:1287:1: rule__ProjectFX__Group_5__2 : rule__ProjectFX__Group_5__2__Impl rule__ProjectFX__Group_5__3 ;
    public final void rule__ProjectFX__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1291:1: ( rule__ProjectFX__Group_5__2__Impl rule__ProjectFX__Group_5__3 )
            // InternalJavaFXLang.g:1292:2: rule__ProjectFX__Group_5__2__Impl rule__ProjectFX__Group_5__3
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
    // InternalJavaFXLang.g:1299:1: rule__ProjectFX__Group_5__2__Impl : ( ( rule__ProjectFX__ControlsAssignment_5_2 ) ) ;
    public final void rule__ProjectFX__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1303:1: ( ( ( rule__ProjectFX__ControlsAssignment_5_2 ) ) )
            // InternalJavaFXLang.g:1304:1: ( ( rule__ProjectFX__ControlsAssignment_5_2 ) )
            {
            // InternalJavaFXLang.g:1304:1: ( ( rule__ProjectFX__ControlsAssignment_5_2 ) )
            // InternalJavaFXLang.g:1305:2: ( rule__ProjectFX__ControlsAssignment_5_2 )
            {
             before(grammarAccess.getProjectFXAccess().getControlsAssignment_5_2()); 
            // InternalJavaFXLang.g:1306:2: ( rule__ProjectFX__ControlsAssignment_5_2 )
            // InternalJavaFXLang.g:1306:3: rule__ProjectFX__ControlsAssignment_5_2
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
    // InternalJavaFXLang.g:1314:1: rule__ProjectFX__Group_5__3 : rule__ProjectFX__Group_5__3__Impl rule__ProjectFX__Group_5__4 ;
    public final void rule__ProjectFX__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1318:1: ( rule__ProjectFX__Group_5__3__Impl rule__ProjectFX__Group_5__4 )
            // InternalJavaFXLang.g:1319:2: rule__ProjectFX__Group_5__3__Impl rule__ProjectFX__Group_5__4
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
    // InternalJavaFXLang.g:1326:1: rule__ProjectFX__Group_5__3__Impl : ( ( rule__ProjectFX__ControlsAssignment_5_3 )* ) ;
    public final void rule__ProjectFX__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1330:1: ( ( ( rule__ProjectFX__ControlsAssignment_5_3 )* ) )
            // InternalJavaFXLang.g:1331:1: ( ( rule__ProjectFX__ControlsAssignment_5_3 )* )
            {
            // InternalJavaFXLang.g:1331:1: ( ( rule__ProjectFX__ControlsAssignment_5_3 )* )
            // InternalJavaFXLang.g:1332:2: ( rule__ProjectFX__ControlsAssignment_5_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getControlsAssignment_5_3()); 
            // InternalJavaFXLang.g:1333:2: ( rule__ProjectFX__ControlsAssignment_5_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==56||LA14_0==61) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJavaFXLang.g:1333:3: rule__ProjectFX__ControlsAssignment_5_3
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
    // InternalJavaFXLang.g:1341:1: rule__ProjectFX__Group_5__4 : rule__ProjectFX__Group_5__4__Impl ;
    public final void rule__ProjectFX__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1345:1: ( rule__ProjectFX__Group_5__4__Impl )
            // InternalJavaFXLang.g:1346:2: rule__ProjectFX__Group_5__4__Impl
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
    // InternalJavaFXLang.g:1352:1: rule__ProjectFX__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1356:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1357:1: ( '}' )
            {
            // InternalJavaFXLang.g:1357:1: ( '}' )
            // InternalJavaFXLang.g:1358:2: '}'
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
    // InternalJavaFXLang.g:1368:1: rule__ProjectFX__Group_6__0 : rule__ProjectFX__Group_6__0__Impl rule__ProjectFX__Group_6__1 ;
    public final void rule__ProjectFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1372:1: ( rule__ProjectFX__Group_6__0__Impl rule__ProjectFX__Group_6__1 )
            // InternalJavaFXLang.g:1373:2: rule__ProjectFX__Group_6__0__Impl rule__ProjectFX__Group_6__1
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
    // InternalJavaFXLang.g:1380:1: rule__ProjectFX__Group_6__0__Impl : ( 'models' ) ;
    public final void rule__ProjectFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1384:1: ( ( 'models' ) )
            // InternalJavaFXLang.g:1385:1: ( 'models' )
            {
            // InternalJavaFXLang.g:1385:1: ( 'models' )
            // InternalJavaFXLang.g:1386:2: 'models'
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
    // InternalJavaFXLang.g:1395:1: rule__ProjectFX__Group_6__1 : rule__ProjectFX__Group_6__1__Impl rule__ProjectFX__Group_6__2 ;
    public final void rule__ProjectFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1399:1: ( rule__ProjectFX__Group_6__1__Impl rule__ProjectFX__Group_6__2 )
            // InternalJavaFXLang.g:1400:2: rule__ProjectFX__Group_6__1__Impl rule__ProjectFX__Group_6__2
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
    // InternalJavaFXLang.g:1407:1: rule__ProjectFX__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1411:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1412:1: ( '{' )
            {
            // InternalJavaFXLang.g:1412:1: ( '{' )
            // InternalJavaFXLang.g:1413:2: '{'
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
    // InternalJavaFXLang.g:1422:1: rule__ProjectFX__Group_6__2 : rule__ProjectFX__Group_6__2__Impl rule__ProjectFX__Group_6__3 ;
    public final void rule__ProjectFX__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1426:1: ( rule__ProjectFX__Group_6__2__Impl rule__ProjectFX__Group_6__3 )
            // InternalJavaFXLang.g:1427:2: rule__ProjectFX__Group_6__2__Impl rule__ProjectFX__Group_6__3
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
    // InternalJavaFXLang.g:1434:1: rule__ProjectFX__Group_6__2__Impl : ( ( rule__ProjectFX__ModelsAssignment_6_2 ) ) ;
    public final void rule__ProjectFX__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1438:1: ( ( ( rule__ProjectFX__ModelsAssignment_6_2 ) ) )
            // InternalJavaFXLang.g:1439:1: ( ( rule__ProjectFX__ModelsAssignment_6_2 ) )
            {
            // InternalJavaFXLang.g:1439:1: ( ( rule__ProjectFX__ModelsAssignment_6_2 ) )
            // InternalJavaFXLang.g:1440:2: ( rule__ProjectFX__ModelsAssignment_6_2 )
            {
             before(grammarAccess.getProjectFXAccess().getModelsAssignment_6_2()); 
            // InternalJavaFXLang.g:1441:2: ( rule__ProjectFX__ModelsAssignment_6_2 )
            // InternalJavaFXLang.g:1441:3: rule__ProjectFX__ModelsAssignment_6_2
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
    // InternalJavaFXLang.g:1449:1: rule__ProjectFX__Group_6__3 : rule__ProjectFX__Group_6__3__Impl rule__ProjectFX__Group_6__4 ;
    public final void rule__ProjectFX__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1453:1: ( rule__ProjectFX__Group_6__3__Impl rule__ProjectFX__Group_6__4 )
            // InternalJavaFXLang.g:1454:2: rule__ProjectFX__Group_6__3__Impl rule__ProjectFX__Group_6__4
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
    // InternalJavaFXLang.g:1461:1: rule__ProjectFX__Group_6__3__Impl : ( ( rule__ProjectFX__ModelsAssignment_6_3 )* ) ;
    public final void rule__ProjectFX__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1465:1: ( ( ( rule__ProjectFX__ModelsAssignment_6_3 )* ) )
            // InternalJavaFXLang.g:1466:1: ( ( rule__ProjectFX__ModelsAssignment_6_3 )* )
            {
            // InternalJavaFXLang.g:1466:1: ( ( rule__ProjectFX__ModelsAssignment_6_3 )* )
            // InternalJavaFXLang.g:1467:2: ( rule__ProjectFX__ModelsAssignment_6_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getModelsAssignment_6_3()); 
            // InternalJavaFXLang.g:1468:2: ( rule__ProjectFX__ModelsAssignment_6_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==59) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalJavaFXLang.g:1468:3: rule__ProjectFX__ModelsAssignment_6_3
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
    // InternalJavaFXLang.g:1476:1: rule__ProjectFX__Group_6__4 : rule__ProjectFX__Group_6__4__Impl ;
    public final void rule__ProjectFX__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1480:1: ( rule__ProjectFX__Group_6__4__Impl )
            // InternalJavaFXLang.g:1481:2: rule__ProjectFX__Group_6__4__Impl
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
    // InternalJavaFXLang.g:1487:1: rule__ProjectFX__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1491:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1492:1: ( '}' )
            {
            // InternalJavaFXLang.g:1492:1: ( '}' )
            // InternalJavaFXLang.g:1493:2: '}'
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
    // InternalJavaFXLang.g:1503:1: rule__ProjectFX__Group_7__0 : rule__ProjectFX__Group_7__0__Impl rule__ProjectFX__Group_7__1 ;
    public final void rule__ProjectFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1507:1: ( rule__ProjectFX__Group_7__0__Impl rule__ProjectFX__Group_7__1 )
            // InternalJavaFXLang.g:1508:2: rule__ProjectFX__Group_7__0__Impl rule__ProjectFX__Group_7__1
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
    // InternalJavaFXLang.g:1515:1: rule__ProjectFX__Group_7__0__Impl : ( 'bindings' ) ;
    public final void rule__ProjectFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1519:1: ( ( 'bindings' ) )
            // InternalJavaFXLang.g:1520:1: ( 'bindings' )
            {
            // InternalJavaFXLang.g:1520:1: ( 'bindings' )
            // InternalJavaFXLang.g:1521:2: 'bindings'
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
    // InternalJavaFXLang.g:1530:1: rule__ProjectFX__Group_7__1 : rule__ProjectFX__Group_7__1__Impl rule__ProjectFX__Group_7__2 ;
    public final void rule__ProjectFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1534:1: ( rule__ProjectFX__Group_7__1__Impl rule__ProjectFX__Group_7__2 )
            // InternalJavaFXLang.g:1535:2: rule__ProjectFX__Group_7__1__Impl rule__ProjectFX__Group_7__2
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
    // InternalJavaFXLang.g:1542:1: rule__ProjectFX__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1546:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1547:1: ( '{' )
            {
            // InternalJavaFXLang.g:1547:1: ( '{' )
            // InternalJavaFXLang.g:1548:2: '{'
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
    // InternalJavaFXLang.g:1557:1: rule__ProjectFX__Group_7__2 : rule__ProjectFX__Group_7__2__Impl rule__ProjectFX__Group_7__3 ;
    public final void rule__ProjectFX__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1561:1: ( rule__ProjectFX__Group_7__2__Impl rule__ProjectFX__Group_7__3 )
            // InternalJavaFXLang.g:1562:2: rule__ProjectFX__Group_7__2__Impl rule__ProjectFX__Group_7__3
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
    // InternalJavaFXLang.g:1569:1: rule__ProjectFX__Group_7__2__Impl : ( ( rule__ProjectFX__BindingsAssignment_7_2 ) ) ;
    public final void rule__ProjectFX__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1573:1: ( ( ( rule__ProjectFX__BindingsAssignment_7_2 ) ) )
            // InternalJavaFXLang.g:1574:1: ( ( rule__ProjectFX__BindingsAssignment_7_2 ) )
            {
            // InternalJavaFXLang.g:1574:1: ( ( rule__ProjectFX__BindingsAssignment_7_2 ) )
            // InternalJavaFXLang.g:1575:2: ( rule__ProjectFX__BindingsAssignment_7_2 )
            {
             before(grammarAccess.getProjectFXAccess().getBindingsAssignment_7_2()); 
            // InternalJavaFXLang.g:1576:2: ( rule__ProjectFX__BindingsAssignment_7_2 )
            // InternalJavaFXLang.g:1576:3: rule__ProjectFX__BindingsAssignment_7_2
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
    // InternalJavaFXLang.g:1584:1: rule__ProjectFX__Group_7__3 : rule__ProjectFX__Group_7__3__Impl rule__ProjectFX__Group_7__4 ;
    public final void rule__ProjectFX__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1588:1: ( rule__ProjectFX__Group_7__3__Impl rule__ProjectFX__Group_7__4 )
            // InternalJavaFXLang.g:1589:2: rule__ProjectFX__Group_7__3__Impl rule__ProjectFX__Group_7__4
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
    // InternalJavaFXLang.g:1596:1: rule__ProjectFX__Group_7__3__Impl : ( ( rule__ProjectFX__BindingsAssignment_7_3 )* ) ;
    public final void rule__ProjectFX__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1600:1: ( ( ( rule__ProjectFX__BindingsAssignment_7_3 )* ) )
            // InternalJavaFXLang.g:1601:1: ( ( rule__ProjectFX__BindingsAssignment_7_3 )* )
            {
            // InternalJavaFXLang.g:1601:1: ( ( rule__ProjectFX__BindingsAssignment_7_3 )* )
            // InternalJavaFXLang.g:1602:2: ( rule__ProjectFX__BindingsAssignment_7_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getBindingsAssignment_7_3()); 
            // InternalJavaFXLang.g:1603:2: ( rule__ProjectFX__BindingsAssignment_7_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==55) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalJavaFXLang.g:1603:3: rule__ProjectFX__BindingsAssignment_7_3
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
    // InternalJavaFXLang.g:1611:1: rule__ProjectFX__Group_7__4 : rule__ProjectFX__Group_7__4__Impl ;
    public final void rule__ProjectFX__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1615:1: ( rule__ProjectFX__Group_7__4__Impl )
            // InternalJavaFXLang.g:1616:2: rule__ProjectFX__Group_7__4__Impl
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
    // InternalJavaFXLang.g:1622:1: rule__ProjectFX__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1626:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1627:1: ( '}' )
            {
            // InternalJavaFXLang.g:1627:1: ( '}' )
            // InternalJavaFXLang.g:1628:2: '}'
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
    // InternalJavaFXLang.g:1638:1: rule__ProjectFX__Group_8__0 : rule__ProjectFX__Group_8__0__Impl rule__ProjectFX__Group_8__1 ;
    public final void rule__ProjectFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1642:1: ( rule__ProjectFX__Group_8__0__Impl rule__ProjectFX__Group_8__1 )
            // InternalJavaFXLang.g:1643:2: rule__ProjectFX__Group_8__0__Impl rule__ProjectFX__Group_8__1
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
    // InternalJavaFXLang.g:1650:1: rule__ProjectFX__Group_8__0__Impl : ( 'charts' ) ;
    public final void rule__ProjectFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1654:1: ( ( 'charts' ) )
            // InternalJavaFXLang.g:1655:1: ( 'charts' )
            {
            // InternalJavaFXLang.g:1655:1: ( 'charts' )
            // InternalJavaFXLang.g:1656:2: 'charts'
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
    // InternalJavaFXLang.g:1665:1: rule__ProjectFX__Group_8__1 : rule__ProjectFX__Group_8__1__Impl rule__ProjectFX__Group_8__2 ;
    public final void rule__ProjectFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1669:1: ( rule__ProjectFX__Group_8__1__Impl rule__ProjectFX__Group_8__2 )
            // InternalJavaFXLang.g:1670:2: rule__ProjectFX__Group_8__1__Impl rule__ProjectFX__Group_8__2
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
    // InternalJavaFXLang.g:1677:1: rule__ProjectFX__Group_8__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1681:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1682:1: ( '{' )
            {
            // InternalJavaFXLang.g:1682:1: ( '{' )
            // InternalJavaFXLang.g:1683:2: '{'
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
    // InternalJavaFXLang.g:1692:1: rule__ProjectFX__Group_8__2 : rule__ProjectFX__Group_8__2__Impl rule__ProjectFX__Group_8__3 ;
    public final void rule__ProjectFX__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1696:1: ( rule__ProjectFX__Group_8__2__Impl rule__ProjectFX__Group_8__3 )
            // InternalJavaFXLang.g:1697:2: rule__ProjectFX__Group_8__2__Impl rule__ProjectFX__Group_8__3
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
    // InternalJavaFXLang.g:1704:1: rule__ProjectFX__Group_8__2__Impl : ( ( rule__ProjectFX__ChartsAssignment_8_2 ) ) ;
    public final void rule__ProjectFX__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1708:1: ( ( ( rule__ProjectFX__ChartsAssignment_8_2 ) ) )
            // InternalJavaFXLang.g:1709:1: ( ( rule__ProjectFX__ChartsAssignment_8_2 ) )
            {
            // InternalJavaFXLang.g:1709:1: ( ( rule__ProjectFX__ChartsAssignment_8_2 ) )
            // InternalJavaFXLang.g:1710:2: ( rule__ProjectFX__ChartsAssignment_8_2 )
            {
             before(grammarAccess.getProjectFXAccess().getChartsAssignment_8_2()); 
            // InternalJavaFXLang.g:1711:2: ( rule__ProjectFX__ChartsAssignment_8_2 )
            // InternalJavaFXLang.g:1711:3: rule__ProjectFX__ChartsAssignment_8_2
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
    // InternalJavaFXLang.g:1719:1: rule__ProjectFX__Group_8__3 : rule__ProjectFX__Group_8__3__Impl rule__ProjectFX__Group_8__4 ;
    public final void rule__ProjectFX__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1723:1: ( rule__ProjectFX__Group_8__3__Impl rule__ProjectFX__Group_8__4 )
            // InternalJavaFXLang.g:1724:2: rule__ProjectFX__Group_8__3__Impl rule__ProjectFX__Group_8__4
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
    // InternalJavaFXLang.g:1731:1: rule__ProjectFX__Group_8__3__Impl : ( ( rule__ProjectFX__ChartsAssignment_8_3 )* ) ;
    public final void rule__ProjectFX__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1735:1: ( ( ( rule__ProjectFX__ChartsAssignment_8_3 )* ) )
            // InternalJavaFXLang.g:1736:1: ( ( rule__ProjectFX__ChartsAssignment_8_3 )* )
            {
            // InternalJavaFXLang.g:1736:1: ( ( rule__ProjectFX__ChartsAssignment_8_3 )* )
            // InternalJavaFXLang.g:1737:2: ( rule__ProjectFX__ChartsAssignment_8_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getChartsAssignment_8_3()); 
            // InternalJavaFXLang.g:1738:2: ( rule__ProjectFX__ChartsAssignment_8_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34||(LA17_0>=44 && LA17_0<=48)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalJavaFXLang.g:1738:3: rule__ProjectFX__ChartsAssignment_8_3
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
    // InternalJavaFXLang.g:1746:1: rule__ProjectFX__Group_8__4 : rule__ProjectFX__Group_8__4__Impl ;
    public final void rule__ProjectFX__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1750:1: ( rule__ProjectFX__Group_8__4__Impl )
            // InternalJavaFXLang.g:1751:2: rule__ProjectFX__Group_8__4__Impl
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
    // InternalJavaFXLang.g:1757:1: rule__ProjectFX__Group_8__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1761:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1762:1: ( '}' )
            {
            // InternalJavaFXLang.g:1762:1: ( '}' )
            // InternalJavaFXLang.g:1763:2: '}'
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
    // InternalJavaFXLang.g:1773:1: rule__BarChartFX__Group__0 : rule__BarChartFX__Group__0__Impl rule__BarChartFX__Group__1 ;
    public final void rule__BarChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1777:1: ( rule__BarChartFX__Group__0__Impl rule__BarChartFX__Group__1 )
            // InternalJavaFXLang.g:1778:2: rule__BarChartFX__Group__0__Impl rule__BarChartFX__Group__1
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
    // InternalJavaFXLang.g:1785:1: rule__BarChartFX__Group__0__Impl : ( () ) ;
    public final void rule__BarChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1789:1: ( ( () ) )
            // InternalJavaFXLang.g:1790:1: ( () )
            {
            // InternalJavaFXLang.g:1790:1: ( () )
            // InternalJavaFXLang.g:1791:2: ()
            {
             before(grammarAccess.getBarChartFXAccess().getBarChartFXAction_0()); 
            // InternalJavaFXLang.g:1792:2: ()
            // InternalJavaFXLang.g:1792:3: 
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
    // InternalJavaFXLang.g:1800:1: rule__BarChartFX__Group__1 : rule__BarChartFX__Group__1__Impl rule__BarChartFX__Group__2 ;
    public final void rule__BarChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1804:1: ( rule__BarChartFX__Group__1__Impl rule__BarChartFX__Group__2 )
            // InternalJavaFXLang.g:1805:2: rule__BarChartFX__Group__1__Impl rule__BarChartFX__Group__2
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
    // InternalJavaFXLang.g:1812:1: rule__BarChartFX__Group__1__Impl : ( 'BarChart' ) ;
    public final void rule__BarChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1816:1: ( ( 'BarChart' ) )
            // InternalJavaFXLang.g:1817:1: ( 'BarChart' )
            {
            // InternalJavaFXLang.g:1817:1: ( 'BarChart' )
            // InternalJavaFXLang.g:1818:2: 'BarChart'
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
    // InternalJavaFXLang.g:1827:1: rule__BarChartFX__Group__2 : rule__BarChartFX__Group__2__Impl rule__BarChartFX__Group__3 ;
    public final void rule__BarChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1831:1: ( rule__BarChartFX__Group__2__Impl rule__BarChartFX__Group__3 )
            // InternalJavaFXLang.g:1832:2: rule__BarChartFX__Group__2__Impl rule__BarChartFX__Group__3
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
    // InternalJavaFXLang.g:1839:1: rule__BarChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__BarChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1843:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1844:1: ( '{' )
            {
            // InternalJavaFXLang.g:1844:1: ( '{' )
            // InternalJavaFXLang.g:1845:2: '{'
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
    // InternalJavaFXLang.g:1854:1: rule__BarChartFX__Group__3 : rule__BarChartFX__Group__3__Impl rule__BarChartFX__Group__4 ;
    public final void rule__BarChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1858:1: ( rule__BarChartFX__Group__3__Impl rule__BarChartFX__Group__4 )
            // InternalJavaFXLang.g:1859:2: rule__BarChartFX__Group__3__Impl rule__BarChartFX__Group__4
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
    // InternalJavaFXLang.g:1866:1: rule__BarChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__BarChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1870:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:1871:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:1871:1: ( 'name:' )
            // InternalJavaFXLang.g:1872:2: 'name:'
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
    // InternalJavaFXLang.g:1881:1: rule__BarChartFX__Group__4 : rule__BarChartFX__Group__4__Impl rule__BarChartFX__Group__5 ;
    public final void rule__BarChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1885:1: ( rule__BarChartFX__Group__4__Impl rule__BarChartFX__Group__5 )
            // InternalJavaFXLang.g:1886:2: rule__BarChartFX__Group__4__Impl rule__BarChartFX__Group__5
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
    // InternalJavaFXLang.g:1893:1: rule__BarChartFX__Group__4__Impl : ( ( rule__BarChartFX__NameAssignment_4 ) ) ;
    public final void rule__BarChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1897:1: ( ( ( rule__BarChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:1898:1: ( ( rule__BarChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:1898:1: ( ( rule__BarChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:1899:2: ( rule__BarChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getBarChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:1900:2: ( rule__BarChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:1900:3: rule__BarChartFX__NameAssignment_4
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
    // InternalJavaFXLang.g:1908:1: rule__BarChartFX__Group__5 : rule__BarChartFX__Group__5__Impl rule__BarChartFX__Group__6 ;
    public final void rule__BarChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1912:1: ( rule__BarChartFX__Group__5__Impl rule__BarChartFX__Group__6 )
            // InternalJavaFXLang.g:1913:2: rule__BarChartFX__Group__5__Impl rule__BarChartFX__Group__6
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
    // InternalJavaFXLang.g:1920:1: rule__BarChartFX__Group__5__Impl : ( ( rule__BarChartFX__Group_5__0 )? ) ;
    public final void rule__BarChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1924:1: ( ( ( rule__BarChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:1925:1: ( ( rule__BarChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:1925:1: ( ( rule__BarChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:1926:2: ( rule__BarChartFX__Group_5__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:1927:2: ( rule__BarChartFX__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJavaFXLang.g:1927:3: rule__BarChartFX__Group_5__0
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
    // InternalJavaFXLang.g:1935:1: rule__BarChartFX__Group__6 : rule__BarChartFX__Group__6__Impl rule__BarChartFX__Group__7 ;
    public final void rule__BarChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1939:1: ( rule__BarChartFX__Group__6__Impl rule__BarChartFX__Group__7 )
            // InternalJavaFXLang.g:1940:2: rule__BarChartFX__Group__6__Impl rule__BarChartFX__Group__7
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
    // InternalJavaFXLang.g:1947:1: rule__BarChartFX__Group__6__Impl : ( ( rule__BarChartFX__Group_6__0 )? ) ;
    public final void rule__BarChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1951:1: ( ( ( rule__BarChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:1952:1: ( ( rule__BarChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:1952:1: ( ( rule__BarChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:1953:2: ( rule__BarChartFX__Group_6__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:1954:2: ( rule__BarChartFX__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJavaFXLang.g:1954:3: rule__BarChartFX__Group_6__0
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
    // InternalJavaFXLang.g:1962:1: rule__BarChartFX__Group__7 : rule__BarChartFX__Group__7__Impl rule__BarChartFX__Group__8 ;
    public final void rule__BarChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1966:1: ( rule__BarChartFX__Group__7__Impl rule__BarChartFX__Group__8 )
            // InternalJavaFXLang.g:1967:2: rule__BarChartFX__Group__7__Impl rule__BarChartFX__Group__8
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
    // InternalJavaFXLang.g:1974:1: rule__BarChartFX__Group__7__Impl : ( ( rule__BarChartFX__Group_7__0 )? ) ;
    public final void rule__BarChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1978:1: ( ( ( rule__BarChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:1979:1: ( ( rule__BarChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:1979:1: ( ( rule__BarChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:1980:2: ( rule__BarChartFX__Group_7__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:1981:2: ( rule__BarChartFX__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJavaFXLang.g:1981:3: rule__BarChartFX__Group_7__0
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
    // InternalJavaFXLang.g:1989:1: rule__BarChartFX__Group__8 : rule__BarChartFX__Group__8__Impl rule__BarChartFX__Group__9 ;
    public final void rule__BarChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1993:1: ( rule__BarChartFX__Group__8__Impl rule__BarChartFX__Group__9 )
            // InternalJavaFXLang.g:1994:2: rule__BarChartFX__Group__8__Impl rule__BarChartFX__Group__9
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
    // InternalJavaFXLang.g:2001:1: rule__BarChartFX__Group__8__Impl : ( ( rule__BarChartFX__Group_8__0 )? ) ;
    public final void rule__BarChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2005:1: ( ( ( rule__BarChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:2006:1: ( ( rule__BarChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:2006:1: ( ( rule__BarChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:2007:2: ( rule__BarChartFX__Group_8__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:2008:2: ( rule__BarChartFX__Group_8__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJavaFXLang.g:2008:3: rule__BarChartFX__Group_8__0
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
    // InternalJavaFXLang.g:2016:1: rule__BarChartFX__Group__9 : rule__BarChartFX__Group__9__Impl rule__BarChartFX__Group__10 ;
    public final void rule__BarChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2020:1: ( rule__BarChartFX__Group__9__Impl rule__BarChartFX__Group__10 )
            // InternalJavaFXLang.g:2021:2: rule__BarChartFX__Group__9__Impl rule__BarChartFX__Group__10
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
    // InternalJavaFXLang.g:2028:1: rule__BarChartFX__Group__9__Impl : ( ( rule__BarChartFX__Group_9__0 )? ) ;
    public final void rule__BarChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2032:1: ( ( ( rule__BarChartFX__Group_9__0 )? ) )
            // InternalJavaFXLang.g:2033:1: ( ( rule__BarChartFX__Group_9__0 )? )
            {
            // InternalJavaFXLang.g:2033:1: ( ( rule__BarChartFX__Group_9__0 )? )
            // InternalJavaFXLang.g:2034:2: ( rule__BarChartFX__Group_9__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_9()); 
            // InternalJavaFXLang.g:2035:2: ( rule__BarChartFX__Group_9__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJavaFXLang.g:2035:3: rule__BarChartFX__Group_9__0
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
    // InternalJavaFXLang.g:2043:1: rule__BarChartFX__Group__10 : rule__BarChartFX__Group__10__Impl rule__BarChartFX__Group__11 ;
    public final void rule__BarChartFX__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2047:1: ( rule__BarChartFX__Group__10__Impl rule__BarChartFX__Group__11 )
            // InternalJavaFXLang.g:2048:2: rule__BarChartFX__Group__10__Impl rule__BarChartFX__Group__11
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
    // InternalJavaFXLang.g:2055:1: rule__BarChartFX__Group__10__Impl : ( ( rule__BarChartFX__Group_10__0 )? ) ;
    public final void rule__BarChartFX__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2059:1: ( ( ( rule__BarChartFX__Group_10__0 )? ) )
            // InternalJavaFXLang.g:2060:1: ( ( rule__BarChartFX__Group_10__0 )? )
            {
            // InternalJavaFXLang.g:2060:1: ( ( rule__BarChartFX__Group_10__0 )? )
            // InternalJavaFXLang.g:2061:2: ( rule__BarChartFX__Group_10__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_10()); 
            // InternalJavaFXLang.g:2062:2: ( rule__BarChartFX__Group_10__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalJavaFXLang.g:2062:3: rule__BarChartFX__Group_10__0
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
    // InternalJavaFXLang.g:2070:1: rule__BarChartFX__Group__11 : rule__BarChartFX__Group__11__Impl rule__BarChartFX__Group__12 ;
    public final void rule__BarChartFX__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2074:1: ( rule__BarChartFX__Group__11__Impl rule__BarChartFX__Group__12 )
            // InternalJavaFXLang.g:2075:2: rule__BarChartFX__Group__11__Impl rule__BarChartFX__Group__12
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
    // InternalJavaFXLang.g:2082:1: rule__BarChartFX__Group__11__Impl : ( ( rule__BarChartFX__Group_11__0 )? ) ;
    public final void rule__BarChartFX__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2086:1: ( ( ( rule__BarChartFX__Group_11__0 )? ) )
            // InternalJavaFXLang.g:2087:1: ( ( rule__BarChartFX__Group_11__0 )? )
            {
            // InternalJavaFXLang.g:2087:1: ( ( rule__BarChartFX__Group_11__0 )? )
            // InternalJavaFXLang.g:2088:2: ( rule__BarChartFX__Group_11__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_11()); 
            // InternalJavaFXLang.g:2089:2: ( rule__BarChartFX__Group_11__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJavaFXLang.g:2089:3: rule__BarChartFX__Group_11__0
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
    // InternalJavaFXLang.g:2097:1: rule__BarChartFX__Group__12 : rule__BarChartFX__Group__12__Impl rule__BarChartFX__Group__13 ;
    public final void rule__BarChartFX__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2101:1: ( rule__BarChartFX__Group__12__Impl rule__BarChartFX__Group__13 )
            // InternalJavaFXLang.g:2102:2: rule__BarChartFX__Group__12__Impl rule__BarChartFX__Group__13
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
    // InternalJavaFXLang.g:2109:1: rule__BarChartFX__Group__12__Impl : ( ( rule__BarChartFX__Group_12__0 )? ) ;
    public final void rule__BarChartFX__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2113:1: ( ( ( rule__BarChartFX__Group_12__0 )? ) )
            // InternalJavaFXLang.g:2114:1: ( ( rule__BarChartFX__Group_12__0 )? )
            {
            // InternalJavaFXLang.g:2114:1: ( ( rule__BarChartFX__Group_12__0 )? )
            // InternalJavaFXLang.g:2115:2: ( rule__BarChartFX__Group_12__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_12()); 
            // InternalJavaFXLang.g:2116:2: ( rule__BarChartFX__Group_12__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJavaFXLang.g:2116:3: rule__BarChartFX__Group_12__0
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
    // InternalJavaFXLang.g:2124:1: rule__BarChartFX__Group__13 : rule__BarChartFX__Group__13__Impl ;
    public final void rule__BarChartFX__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2128:1: ( rule__BarChartFX__Group__13__Impl )
            // InternalJavaFXLang.g:2129:2: rule__BarChartFX__Group__13__Impl
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
    // InternalJavaFXLang.g:2135:1: rule__BarChartFX__Group__13__Impl : ( '}' ) ;
    public final void rule__BarChartFX__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2139:1: ( ( '}' ) )
            // InternalJavaFXLang.g:2140:1: ( '}' )
            {
            // InternalJavaFXLang.g:2140:1: ( '}' )
            // InternalJavaFXLang.g:2141:2: '}'
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
    // InternalJavaFXLang.g:2151:1: rule__BarChartFX__Group_5__0 : rule__BarChartFX__Group_5__0__Impl rule__BarChartFX__Group_5__1 ;
    public final void rule__BarChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2155:1: ( rule__BarChartFX__Group_5__0__Impl rule__BarChartFX__Group_5__1 )
            // InternalJavaFXLang.g:2156:2: rule__BarChartFX__Group_5__0__Impl rule__BarChartFX__Group_5__1
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
    // InternalJavaFXLang.g:2163:1: rule__BarChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__BarChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2167:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:2168:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:2168:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:2169:2: 'legendSide:'
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
    // InternalJavaFXLang.g:2178:1: rule__BarChartFX__Group_5__1 : rule__BarChartFX__Group_5__1__Impl ;
    public final void rule__BarChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2182:1: ( rule__BarChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:2183:2: rule__BarChartFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:2189:1: rule__BarChartFX__Group_5__1__Impl : ( ( rule__BarChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__BarChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2193:1: ( ( ( rule__BarChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:2194:1: ( ( rule__BarChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:2194:1: ( ( rule__BarChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:2195:2: ( rule__BarChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:2196:2: ( rule__BarChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:2196:3: rule__BarChartFX__LegendSideAssignment_5_1
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
    // InternalJavaFXLang.g:2205:1: rule__BarChartFX__Group_6__0 : rule__BarChartFX__Group_6__0__Impl rule__BarChartFX__Group_6__1 ;
    public final void rule__BarChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2209:1: ( rule__BarChartFX__Group_6__0__Impl rule__BarChartFX__Group_6__1 )
            // InternalJavaFXLang.g:2210:2: rule__BarChartFX__Group_6__0__Impl rule__BarChartFX__Group_6__1
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
    // InternalJavaFXLang.g:2217:1: rule__BarChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__BarChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2221:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:2222:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:2222:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:2223:2: 'showLegend:'
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
    // InternalJavaFXLang.g:2232:1: rule__BarChartFX__Group_6__1 : rule__BarChartFX__Group_6__1__Impl ;
    public final void rule__BarChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2236:1: ( rule__BarChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:2237:2: rule__BarChartFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:2243:1: rule__BarChartFX__Group_6__1__Impl : ( ( rule__BarChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__BarChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2247:1: ( ( ( rule__BarChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:2248:1: ( ( rule__BarChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:2248:1: ( ( rule__BarChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:2249:2: ( rule__BarChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:2250:2: ( rule__BarChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:2250:3: rule__BarChartFX__ShowLegendAssignment_6_1
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
    // InternalJavaFXLang.g:2259:1: rule__BarChartFX__Group_7__0 : rule__BarChartFX__Group_7__0__Impl rule__BarChartFX__Group_7__1 ;
    public final void rule__BarChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2263:1: ( rule__BarChartFX__Group_7__0__Impl rule__BarChartFX__Group_7__1 )
            // InternalJavaFXLang.g:2264:2: rule__BarChartFX__Group_7__0__Impl rule__BarChartFX__Group_7__1
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
    // InternalJavaFXLang.g:2271:1: rule__BarChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__BarChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2275:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:2276:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:2276:1: ( 'title:' )
            // InternalJavaFXLang.g:2277:2: 'title:'
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
    // InternalJavaFXLang.g:2286:1: rule__BarChartFX__Group_7__1 : rule__BarChartFX__Group_7__1__Impl ;
    public final void rule__BarChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2290:1: ( rule__BarChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:2291:2: rule__BarChartFX__Group_7__1__Impl
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
    // InternalJavaFXLang.g:2297:1: rule__BarChartFX__Group_7__1__Impl : ( ( rule__BarChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__BarChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2301:1: ( ( ( rule__BarChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:2302:1: ( ( rule__BarChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:2302:1: ( ( rule__BarChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:2303:2: ( rule__BarChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:2304:2: ( rule__BarChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:2304:3: rule__BarChartFX__TitleAssignment_7_1
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
    // InternalJavaFXLang.g:2313:1: rule__BarChartFX__Group_8__0 : rule__BarChartFX__Group_8__0__Impl rule__BarChartFX__Group_8__1 ;
    public final void rule__BarChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2317:1: ( rule__BarChartFX__Group_8__0__Impl rule__BarChartFX__Group_8__1 )
            // InternalJavaFXLang.g:2318:2: rule__BarChartFX__Group_8__0__Impl rule__BarChartFX__Group_8__1
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
    // InternalJavaFXLang.g:2325:1: rule__BarChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__BarChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2329:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:2330:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:2330:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:2331:2: 'titleSide:'
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
    // InternalJavaFXLang.g:2340:1: rule__BarChartFX__Group_8__1 : rule__BarChartFX__Group_8__1__Impl ;
    public final void rule__BarChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2344:1: ( rule__BarChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:2345:2: rule__BarChartFX__Group_8__1__Impl
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
    // InternalJavaFXLang.g:2351:1: rule__BarChartFX__Group_8__1__Impl : ( ( rule__BarChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__BarChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2355:1: ( ( ( rule__BarChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:2356:1: ( ( rule__BarChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:2356:1: ( ( rule__BarChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:2357:2: ( rule__BarChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:2358:2: ( rule__BarChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:2358:3: rule__BarChartFX__TitleSideAssignment_8_1
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
    // InternalJavaFXLang.g:2367:1: rule__BarChartFX__Group_9__0 : rule__BarChartFX__Group_9__0__Impl rule__BarChartFX__Group_9__1 ;
    public final void rule__BarChartFX__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2371:1: ( rule__BarChartFX__Group_9__0__Impl rule__BarChartFX__Group_9__1 )
            // InternalJavaFXLang.g:2372:2: rule__BarChartFX__Group_9__0__Impl rule__BarChartFX__Group_9__1
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
    // InternalJavaFXLang.g:2379:1: rule__BarChartFX__Group_9__0__Impl : ( 'xAxisLabel:' ) ;
    public final void rule__BarChartFX__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2383:1: ( ( 'xAxisLabel:' ) )
            // InternalJavaFXLang.g:2384:1: ( 'xAxisLabel:' )
            {
            // InternalJavaFXLang.g:2384:1: ( 'xAxisLabel:' )
            // InternalJavaFXLang.g:2385:2: 'xAxisLabel:'
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
    // InternalJavaFXLang.g:2394:1: rule__BarChartFX__Group_9__1 : rule__BarChartFX__Group_9__1__Impl ;
    public final void rule__BarChartFX__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2398:1: ( rule__BarChartFX__Group_9__1__Impl )
            // InternalJavaFXLang.g:2399:2: rule__BarChartFX__Group_9__1__Impl
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
    // InternalJavaFXLang.g:2405:1: rule__BarChartFX__Group_9__1__Impl : ( ( rule__BarChartFX__XAxisLabelAssignment_9_1 ) ) ;
    public final void rule__BarChartFX__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2409:1: ( ( ( rule__BarChartFX__XAxisLabelAssignment_9_1 ) ) )
            // InternalJavaFXLang.g:2410:1: ( ( rule__BarChartFX__XAxisLabelAssignment_9_1 ) )
            {
            // InternalJavaFXLang.g:2410:1: ( ( rule__BarChartFX__XAxisLabelAssignment_9_1 ) )
            // InternalJavaFXLang.g:2411:2: ( rule__BarChartFX__XAxisLabelAssignment_9_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getXAxisLabelAssignment_9_1()); 
            // InternalJavaFXLang.g:2412:2: ( rule__BarChartFX__XAxisLabelAssignment_9_1 )
            // InternalJavaFXLang.g:2412:3: rule__BarChartFX__XAxisLabelAssignment_9_1
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
    // InternalJavaFXLang.g:2421:1: rule__BarChartFX__Group_10__0 : rule__BarChartFX__Group_10__0__Impl rule__BarChartFX__Group_10__1 ;
    public final void rule__BarChartFX__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2425:1: ( rule__BarChartFX__Group_10__0__Impl rule__BarChartFX__Group_10__1 )
            // InternalJavaFXLang.g:2426:2: rule__BarChartFX__Group_10__0__Impl rule__BarChartFX__Group_10__1
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
    // InternalJavaFXLang.g:2433:1: rule__BarChartFX__Group_10__0__Impl : ( 'xAxisType:' ) ;
    public final void rule__BarChartFX__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2437:1: ( ( 'xAxisType:' ) )
            // InternalJavaFXLang.g:2438:1: ( 'xAxisType:' )
            {
            // InternalJavaFXLang.g:2438:1: ( 'xAxisType:' )
            // InternalJavaFXLang.g:2439:2: 'xAxisType:'
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
    // InternalJavaFXLang.g:2448:1: rule__BarChartFX__Group_10__1 : rule__BarChartFX__Group_10__1__Impl ;
    public final void rule__BarChartFX__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2452:1: ( rule__BarChartFX__Group_10__1__Impl )
            // InternalJavaFXLang.g:2453:2: rule__BarChartFX__Group_10__1__Impl
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
    // InternalJavaFXLang.g:2459:1: rule__BarChartFX__Group_10__1__Impl : ( ( rule__BarChartFX__XAxisTypeAssignment_10_1 ) ) ;
    public final void rule__BarChartFX__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2463:1: ( ( ( rule__BarChartFX__XAxisTypeAssignment_10_1 ) ) )
            // InternalJavaFXLang.g:2464:1: ( ( rule__BarChartFX__XAxisTypeAssignment_10_1 ) )
            {
            // InternalJavaFXLang.g:2464:1: ( ( rule__BarChartFX__XAxisTypeAssignment_10_1 ) )
            // InternalJavaFXLang.g:2465:2: ( rule__BarChartFX__XAxisTypeAssignment_10_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getXAxisTypeAssignment_10_1()); 
            // InternalJavaFXLang.g:2466:2: ( rule__BarChartFX__XAxisTypeAssignment_10_1 )
            // InternalJavaFXLang.g:2466:3: rule__BarChartFX__XAxisTypeAssignment_10_1
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
    // InternalJavaFXLang.g:2475:1: rule__BarChartFX__Group_11__0 : rule__BarChartFX__Group_11__0__Impl rule__BarChartFX__Group_11__1 ;
    public final void rule__BarChartFX__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2479:1: ( rule__BarChartFX__Group_11__0__Impl rule__BarChartFX__Group_11__1 )
            // InternalJavaFXLang.g:2480:2: rule__BarChartFX__Group_11__0__Impl rule__BarChartFX__Group_11__1
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
    // InternalJavaFXLang.g:2487:1: rule__BarChartFX__Group_11__0__Impl : ( 'yAxisLabel:' ) ;
    public final void rule__BarChartFX__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2491:1: ( ( 'yAxisLabel:' ) )
            // InternalJavaFXLang.g:2492:1: ( 'yAxisLabel:' )
            {
            // InternalJavaFXLang.g:2492:1: ( 'yAxisLabel:' )
            // InternalJavaFXLang.g:2493:2: 'yAxisLabel:'
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
    // InternalJavaFXLang.g:2502:1: rule__BarChartFX__Group_11__1 : rule__BarChartFX__Group_11__1__Impl ;
    public final void rule__BarChartFX__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2506:1: ( rule__BarChartFX__Group_11__1__Impl )
            // InternalJavaFXLang.g:2507:2: rule__BarChartFX__Group_11__1__Impl
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
    // InternalJavaFXLang.g:2513:1: rule__BarChartFX__Group_11__1__Impl : ( ( rule__BarChartFX__YAxisLabelAssignment_11_1 ) ) ;
    public final void rule__BarChartFX__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2517:1: ( ( ( rule__BarChartFX__YAxisLabelAssignment_11_1 ) ) )
            // InternalJavaFXLang.g:2518:1: ( ( rule__BarChartFX__YAxisLabelAssignment_11_1 ) )
            {
            // InternalJavaFXLang.g:2518:1: ( ( rule__BarChartFX__YAxisLabelAssignment_11_1 ) )
            // InternalJavaFXLang.g:2519:2: ( rule__BarChartFX__YAxisLabelAssignment_11_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getYAxisLabelAssignment_11_1()); 
            // InternalJavaFXLang.g:2520:2: ( rule__BarChartFX__YAxisLabelAssignment_11_1 )
            // InternalJavaFXLang.g:2520:3: rule__BarChartFX__YAxisLabelAssignment_11_1
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
    // InternalJavaFXLang.g:2529:1: rule__BarChartFX__Group_12__0 : rule__BarChartFX__Group_12__0__Impl rule__BarChartFX__Group_12__1 ;
    public final void rule__BarChartFX__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2533:1: ( rule__BarChartFX__Group_12__0__Impl rule__BarChartFX__Group_12__1 )
            // InternalJavaFXLang.g:2534:2: rule__BarChartFX__Group_12__0__Impl rule__BarChartFX__Group_12__1
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
    // InternalJavaFXLang.g:2541:1: rule__BarChartFX__Group_12__0__Impl : ( 'yAxisType:' ) ;
    public final void rule__BarChartFX__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2545:1: ( ( 'yAxisType:' ) )
            // InternalJavaFXLang.g:2546:1: ( 'yAxisType:' )
            {
            // InternalJavaFXLang.g:2546:1: ( 'yAxisType:' )
            // InternalJavaFXLang.g:2547:2: 'yAxisType:'
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
    // InternalJavaFXLang.g:2556:1: rule__BarChartFX__Group_12__1 : rule__BarChartFX__Group_12__1__Impl ;
    public final void rule__BarChartFX__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2560:1: ( rule__BarChartFX__Group_12__1__Impl )
            // InternalJavaFXLang.g:2561:2: rule__BarChartFX__Group_12__1__Impl
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
    // InternalJavaFXLang.g:2567:1: rule__BarChartFX__Group_12__1__Impl : ( ( rule__BarChartFX__YAxisTypeAssignment_12_1 ) ) ;
    public final void rule__BarChartFX__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2571:1: ( ( ( rule__BarChartFX__YAxisTypeAssignment_12_1 ) ) )
            // InternalJavaFXLang.g:2572:1: ( ( rule__BarChartFX__YAxisTypeAssignment_12_1 ) )
            {
            // InternalJavaFXLang.g:2572:1: ( ( rule__BarChartFX__YAxisTypeAssignment_12_1 ) )
            // InternalJavaFXLang.g:2573:2: ( rule__BarChartFX__YAxisTypeAssignment_12_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getYAxisTypeAssignment_12_1()); 
            // InternalJavaFXLang.g:2574:2: ( rule__BarChartFX__YAxisTypeAssignment_12_1 )
            // InternalJavaFXLang.g:2574:3: rule__BarChartFX__YAxisTypeAssignment_12_1
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
    // InternalJavaFXLang.g:2583:1: rule__ScatterChartFX__Group__0 : rule__ScatterChartFX__Group__0__Impl rule__ScatterChartFX__Group__1 ;
    public final void rule__ScatterChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2587:1: ( rule__ScatterChartFX__Group__0__Impl rule__ScatterChartFX__Group__1 )
            // InternalJavaFXLang.g:2588:2: rule__ScatterChartFX__Group__0__Impl rule__ScatterChartFX__Group__1
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
    // InternalJavaFXLang.g:2595:1: rule__ScatterChartFX__Group__0__Impl : ( () ) ;
    public final void rule__ScatterChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2599:1: ( ( () ) )
            // InternalJavaFXLang.g:2600:1: ( () )
            {
            // InternalJavaFXLang.g:2600:1: ( () )
            // InternalJavaFXLang.g:2601:2: ()
            {
             before(grammarAccess.getScatterChartFXAccess().getScatterChartFXAction_0()); 
            // InternalJavaFXLang.g:2602:2: ()
            // InternalJavaFXLang.g:2602:3: 
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
    // InternalJavaFXLang.g:2610:1: rule__ScatterChartFX__Group__1 : rule__ScatterChartFX__Group__1__Impl rule__ScatterChartFX__Group__2 ;
    public final void rule__ScatterChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2614:1: ( rule__ScatterChartFX__Group__1__Impl rule__ScatterChartFX__Group__2 )
            // InternalJavaFXLang.g:2615:2: rule__ScatterChartFX__Group__1__Impl rule__ScatterChartFX__Group__2
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
    // InternalJavaFXLang.g:2622:1: rule__ScatterChartFX__Group__1__Impl : ( 'ScatterChart' ) ;
    public final void rule__ScatterChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2626:1: ( ( 'ScatterChart' ) )
            // InternalJavaFXLang.g:2627:1: ( 'ScatterChart' )
            {
            // InternalJavaFXLang.g:2627:1: ( 'ScatterChart' )
            // InternalJavaFXLang.g:2628:2: 'ScatterChart'
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
    // InternalJavaFXLang.g:2637:1: rule__ScatterChartFX__Group__2 : rule__ScatterChartFX__Group__2__Impl rule__ScatterChartFX__Group__3 ;
    public final void rule__ScatterChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2641:1: ( rule__ScatterChartFX__Group__2__Impl rule__ScatterChartFX__Group__3 )
            // InternalJavaFXLang.g:2642:2: rule__ScatterChartFX__Group__2__Impl rule__ScatterChartFX__Group__3
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
    // InternalJavaFXLang.g:2649:1: rule__ScatterChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__ScatterChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2653:1: ( ( '{' ) )
            // InternalJavaFXLang.g:2654:1: ( '{' )
            {
            // InternalJavaFXLang.g:2654:1: ( '{' )
            // InternalJavaFXLang.g:2655:2: '{'
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
    // InternalJavaFXLang.g:2664:1: rule__ScatterChartFX__Group__3 : rule__ScatterChartFX__Group__3__Impl rule__ScatterChartFX__Group__4 ;
    public final void rule__ScatterChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2668:1: ( rule__ScatterChartFX__Group__3__Impl rule__ScatterChartFX__Group__4 )
            // InternalJavaFXLang.g:2669:2: rule__ScatterChartFX__Group__3__Impl rule__ScatterChartFX__Group__4
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
    // InternalJavaFXLang.g:2676:1: rule__ScatterChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__ScatterChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2680:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:2681:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:2681:1: ( 'name:' )
            // InternalJavaFXLang.g:2682:2: 'name:'
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
    // InternalJavaFXLang.g:2691:1: rule__ScatterChartFX__Group__4 : rule__ScatterChartFX__Group__4__Impl rule__ScatterChartFX__Group__5 ;
    public final void rule__ScatterChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2695:1: ( rule__ScatterChartFX__Group__4__Impl rule__ScatterChartFX__Group__5 )
            // InternalJavaFXLang.g:2696:2: rule__ScatterChartFX__Group__4__Impl rule__ScatterChartFX__Group__5
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
    // InternalJavaFXLang.g:2703:1: rule__ScatterChartFX__Group__4__Impl : ( ( rule__ScatterChartFX__NameAssignment_4 ) ) ;
    public final void rule__ScatterChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2707:1: ( ( ( rule__ScatterChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:2708:1: ( ( rule__ScatterChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:2708:1: ( ( rule__ScatterChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:2709:2: ( rule__ScatterChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getScatterChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:2710:2: ( rule__ScatterChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:2710:3: rule__ScatterChartFX__NameAssignment_4
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
    // InternalJavaFXLang.g:2718:1: rule__ScatterChartFX__Group__5 : rule__ScatterChartFX__Group__5__Impl rule__ScatterChartFX__Group__6 ;
    public final void rule__ScatterChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2722:1: ( rule__ScatterChartFX__Group__5__Impl rule__ScatterChartFX__Group__6 )
            // InternalJavaFXLang.g:2723:2: rule__ScatterChartFX__Group__5__Impl rule__ScatterChartFX__Group__6
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
    // InternalJavaFXLang.g:2730:1: rule__ScatterChartFX__Group__5__Impl : ( ( rule__ScatterChartFX__Group_5__0 )? ) ;
    public final void rule__ScatterChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2734:1: ( ( ( rule__ScatterChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:2735:1: ( ( rule__ScatterChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:2735:1: ( ( rule__ScatterChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:2736:2: ( rule__ScatterChartFX__Group_5__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:2737:2: ( rule__ScatterChartFX__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJavaFXLang.g:2737:3: rule__ScatterChartFX__Group_5__0
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
    // InternalJavaFXLang.g:2745:1: rule__ScatterChartFX__Group__6 : rule__ScatterChartFX__Group__6__Impl rule__ScatterChartFX__Group__7 ;
    public final void rule__ScatterChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2749:1: ( rule__ScatterChartFX__Group__6__Impl rule__ScatterChartFX__Group__7 )
            // InternalJavaFXLang.g:2750:2: rule__ScatterChartFX__Group__6__Impl rule__ScatterChartFX__Group__7
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
    // InternalJavaFXLang.g:2757:1: rule__ScatterChartFX__Group__6__Impl : ( ( rule__ScatterChartFX__Group_6__0 )? ) ;
    public final void rule__ScatterChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2761:1: ( ( ( rule__ScatterChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:2762:1: ( ( rule__ScatterChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:2762:1: ( ( rule__ScatterChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:2763:2: ( rule__ScatterChartFX__Group_6__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:2764:2: ( rule__ScatterChartFX__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJavaFXLang.g:2764:3: rule__ScatterChartFX__Group_6__0
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
    // InternalJavaFXLang.g:2772:1: rule__ScatterChartFX__Group__7 : rule__ScatterChartFX__Group__7__Impl rule__ScatterChartFX__Group__8 ;
    public final void rule__ScatterChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2776:1: ( rule__ScatterChartFX__Group__7__Impl rule__ScatterChartFX__Group__8 )
            // InternalJavaFXLang.g:2777:2: rule__ScatterChartFX__Group__7__Impl rule__ScatterChartFX__Group__8
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
    // InternalJavaFXLang.g:2784:1: rule__ScatterChartFX__Group__7__Impl : ( ( rule__ScatterChartFX__Group_7__0 )? ) ;
    public final void rule__ScatterChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2788:1: ( ( ( rule__ScatterChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:2789:1: ( ( rule__ScatterChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:2789:1: ( ( rule__ScatterChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:2790:2: ( rule__ScatterChartFX__Group_7__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:2791:2: ( rule__ScatterChartFX__Group_7__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJavaFXLang.g:2791:3: rule__ScatterChartFX__Group_7__0
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
    // InternalJavaFXLang.g:2799:1: rule__ScatterChartFX__Group__8 : rule__ScatterChartFX__Group__8__Impl rule__ScatterChartFX__Group__9 ;
    public final void rule__ScatterChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2803:1: ( rule__ScatterChartFX__Group__8__Impl rule__ScatterChartFX__Group__9 )
            // InternalJavaFXLang.g:2804:2: rule__ScatterChartFX__Group__8__Impl rule__ScatterChartFX__Group__9
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
    // InternalJavaFXLang.g:2811:1: rule__ScatterChartFX__Group__8__Impl : ( ( rule__ScatterChartFX__Group_8__0 )? ) ;
    public final void rule__ScatterChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2815:1: ( ( ( rule__ScatterChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:2816:1: ( ( rule__ScatterChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:2816:1: ( ( rule__ScatterChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:2817:2: ( rule__ScatterChartFX__Group_8__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:2818:2: ( rule__ScatterChartFX__Group_8__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalJavaFXLang.g:2818:3: rule__ScatterChartFX__Group_8__0
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
    // InternalJavaFXLang.g:2826:1: rule__ScatterChartFX__Group__9 : rule__ScatterChartFX__Group__9__Impl rule__ScatterChartFX__Group__10 ;
    public final void rule__ScatterChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2830:1: ( rule__ScatterChartFX__Group__9__Impl rule__ScatterChartFX__Group__10 )
            // InternalJavaFXLang.g:2831:2: rule__ScatterChartFX__Group__9__Impl rule__ScatterChartFX__Group__10
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
    // InternalJavaFXLang.g:2838:1: rule__ScatterChartFX__Group__9__Impl : ( ( rule__ScatterChartFX__Group_9__0 )? ) ;
    public final void rule__ScatterChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2842:1: ( ( ( rule__ScatterChartFX__Group_9__0 )? ) )
            // InternalJavaFXLang.g:2843:1: ( ( rule__ScatterChartFX__Group_9__0 )? )
            {
            // InternalJavaFXLang.g:2843:1: ( ( rule__ScatterChartFX__Group_9__0 )? )
            // InternalJavaFXLang.g:2844:2: ( rule__ScatterChartFX__Group_9__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_9()); 
            // InternalJavaFXLang.g:2845:2: ( rule__ScatterChartFX__Group_9__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalJavaFXLang.g:2845:3: rule__ScatterChartFX__Group_9__0
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
    // InternalJavaFXLang.g:2853:1: rule__ScatterChartFX__Group__10 : rule__ScatterChartFX__Group__10__Impl rule__ScatterChartFX__Group__11 ;
    public final void rule__ScatterChartFX__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2857:1: ( rule__ScatterChartFX__Group__10__Impl rule__ScatterChartFX__Group__11 )
            // InternalJavaFXLang.g:2858:2: rule__ScatterChartFX__Group__10__Impl rule__ScatterChartFX__Group__11
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
    // InternalJavaFXLang.g:2865:1: rule__ScatterChartFX__Group__10__Impl : ( ( rule__ScatterChartFX__Group_10__0 )? ) ;
    public final void rule__ScatterChartFX__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2869:1: ( ( ( rule__ScatterChartFX__Group_10__0 )? ) )
            // InternalJavaFXLang.g:2870:1: ( ( rule__ScatterChartFX__Group_10__0 )? )
            {
            // InternalJavaFXLang.g:2870:1: ( ( rule__ScatterChartFX__Group_10__0 )? )
            // InternalJavaFXLang.g:2871:2: ( rule__ScatterChartFX__Group_10__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_10()); 
            // InternalJavaFXLang.g:2872:2: ( rule__ScatterChartFX__Group_10__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalJavaFXLang.g:2872:3: rule__ScatterChartFX__Group_10__0
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
    // InternalJavaFXLang.g:2880:1: rule__ScatterChartFX__Group__11 : rule__ScatterChartFX__Group__11__Impl rule__ScatterChartFX__Group__12 ;
    public final void rule__ScatterChartFX__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2884:1: ( rule__ScatterChartFX__Group__11__Impl rule__ScatterChartFX__Group__12 )
            // InternalJavaFXLang.g:2885:2: rule__ScatterChartFX__Group__11__Impl rule__ScatterChartFX__Group__12
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
    // InternalJavaFXLang.g:2892:1: rule__ScatterChartFX__Group__11__Impl : ( ( rule__ScatterChartFX__Group_11__0 )? ) ;
    public final void rule__ScatterChartFX__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2896:1: ( ( ( rule__ScatterChartFX__Group_11__0 )? ) )
            // InternalJavaFXLang.g:2897:1: ( ( rule__ScatterChartFX__Group_11__0 )? )
            {
            // InternalJavaFXLang.g:2897:1: ( ( rule__ScatterChartFX__Group_11__0 )? )
            // InternalJavaFXLang.g:2898:2: ( rule__ScatterChartFX__Group_11__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_11()); 
            // InternalJavaFXLang.g:2899:2: ( rule__ScatterChartFX__Group_11__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalJavaFXLang.g:2899:3: rule__ScatterChartFX__Group_11__0
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
    // InternalJavaFXLang.g:2907:1: rule__ScatterChartFX__Group__12 : rule__ScatterChartFX__Group__12__Impl rule__ScatterChartFX__Group__13 ;
    public final void rule__ScatterChartFX__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2911:1: ( rule__ScatterChartFX__Group__12__Impl rule__ScatterChartFX__Group__13 )
            // InternalJavaFXLang.g:2912:2: rule__ScatterChartFX__Group__12__Impl rule__ScatterChartFX__Group__13
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
    // InternalJavaFXLang.g:2919:1: rule__ScatterChartFX__Group__12__Impl : ( ( rule__ScatterChartFX__Group_12__0 )? ) ;
    public final void rule__ScatterChartFX__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2923:1: ( ( ( rule__ScatterChartFX__Group_12__0 )? ) )
            // InternalJavaFXLang.g:2924:1: ( ( rule__ScatterChartFX__Group_12__0 )? )
            {
            // InternalJavaFXLang.g:2924:1: ( ( rule__ScatterChartFX__Group_12__0 )? )
            // InternalJavaFXLang.g:2925:2: ( rule__ScatterChartFX__Group_12__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_12()); 
            // InternalJavaFXLang.g:2926:2: ( rule__ScatterChartFX__Group_12__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalJavaFXLang.g:2926:3: rule__ScatterChartFX__Group_12__0
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
    // InternalJavaFXLang.g:2934:1: rule__ScatterChartFX__Group__13 : rule__ScatterChartFX__Group__13__Impl ;
    public final void rule__ScatterChartFX__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2938:1: ( rule__ScatterChartFX__Group__13__Impl )
            // InternalJavaFXLang.g:2939:2: rule__ScatterChartFX__Group__13__Impl
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
    // InternalJavaFXLang.g:2945:1: rule__ScatterChartFX__Group__13__Impl : ( '}' ) ;
    public final void rule__ScatterChartFX__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2949:1: ( ( '}' ) )
            // InternalJavaFXLang.g:2950:1: ( '}' )
            {
            // InternalJavaFXLang.g:2950:1: ( '}' )
            // InternalJavaFXLang.g:2951:2: '}'
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
    // InternalJavaFXLang.g:2961:1: rule__ScatterChartFX__Group_5__0 : rule__ScatterChartFX__Group_5__0__Impl rule__ScatterChartFX__Group_5__1 ;
    public final void rule__ScatterChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2965:1: ( rule__ScatterChartFX__Group_5__0__Impl rule__ScatterChartFX__Group_5__1 )
            // InternalJavaFXLang.g:2966:2: rule__ScatterChartFX__Group_5__0__Impl rule__ScatterChartFX__Group_5__1
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
    // InternalJavaFXLang.g:2973:1: rule__ScatterChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__ScatterChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2977:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:2978:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:2978:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:2979:2: 'legendSide:'
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
    // InternalJavaFXLang.g:2988:1: rule__ScatterChartFX__Group_5__1 : rule__ScatterChartFX__Group_5__1__Impl ;
    public final void rule__ScatterChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2992:1: ( rule__ScatterChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:2993:2: rule__ScatterChartFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:2999:1: rule__ScatterChartFX__Group_5__1__Impl : ( ( rule__ScatterChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__ScatterChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3003:1: ( ( ( rule__ScatterChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:3004:1: ( ( rule__ScatterChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:3004:1: ( ( rule__ScatterChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:3005:2: ( rule__ScatterChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:3006:2: ( rule__ScatterChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:3006:3: rule__ScatterChartFX__LegendSideAssignment_5_1
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
    // InternalJavaFXLang.g:3015:1: rule__ScatterChartFX__Group_6__0 : rule__ScatterChartFX__Group_6__0__Impl rule__ScatterChartFX__Group_6__1 ;
    public final void rule__ScatterChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3019:1: ( rule__ScatterChartFX__Group_6__0__Impl rule__ScatterChartFX__Group_6__1 )
            // InternalJavaFXLang.g:3020:2: rule__ScatterChartFX__Group_6__0__Impl rule__ScatterChartFX__Group_6__1
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
    // InternalJavaFXLang.g:3027:1: rule__ScatterChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__ScatterChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3031:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:3032:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:3032:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:3033:2: 'showLegend:'
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
    // InternalJavaFXLang.g:3042:1: rule__ScatterChartFX__Group_6__1 : rule__ScatterChartFX__Group_6__1__Impl ;
    public final void rule__ScatterChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3046:1: ( rule__ScatterChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:3047:2: rule__ScatterChartFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:3053:1: rule__ScatterChartFX__Group_6__1__Impl : ( ( rule__ScatterChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__ScatterChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3057:1: ( ( ( rule__ScatterChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:3058:1: ( ( rule__ScatterChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:3058:1: ( ( rule__ScatterChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:3059:2: ( rule__ScatterChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:3060:2: ( rule__ScatterChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:3060:3: rule__ScatterChartFX__ShowLegendAssignment_6_1
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
    // InternalJavaFXLang.g:3069:1: rule__ScatterChartFX__Group_7__0 : rule__ScatterChartFX__Group_7__0__Impl rule__ScatterChartFX__Group_7__1 ;
    public final void rule__ScatterChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3073:1: ( rule__ScatterChartFX__Group_7__0__Impl rule__ScatterChartFX__Group_7__1 )
            // InternalJavaFXLang.g:3074:2: rule__ScatterChartFX__Group_7__0__Impl rule__ScatterChartFX__Group_7__1
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
    // InternalJavaFXLang.g:3081:1: rule__ScatterChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__ScatterChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3085:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:3086:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:3086:1: ( 'title:' )
            // InternalJavaFXLang.g:3087:2: 'title:'
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
    // InternalJavaFXLang.g:3096:1: rule__ScatterChartFX__Group_7__1 : rule__ScatterChartFX__Group_7__1__Impl ;
    public final void rule__ScatterChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3100:1: ( rule__ScatterChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:3101:2: rule__ScatterChartFX__Group_7__1__Impl
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
    // InternalJavaFXLang.g:3107:1: rule__ScatterChartFX__Group_7__1__Impl : ( ( rule__ScatterChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__ScatterChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3111:1: ( ( ( rule__ScatterChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:3112:1: ( ( rule__ScatterChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:3112:1: ( ( rule__ScatterChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:3113:2: ( rule__ScatterChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:3114:2: ( rule__ScatterChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:3114:3: rule__ScatterChartFX__TitleAssignment_7_1
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
    // InternalJavaFXLang.g:3123:1: rule__ScatterChartFX__Group_8__0 : rule__ScatterChartFX__Group_8__0__Impl rule__ScatterChartFX__Group_8__1 ;
    public final void rule__ScatterChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3127:1: ( rule__ScatterChartFX__Group_8__0__Impl rule__ScatterChartFX__Group_8__1 )
            // InternalJavaFXLang.g:3128:2: rule__ScatterChartFX__Group_8__0__Impl rule__ScatterChartFX__Group_8__1
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
    // InternalJavaFXLang.g:3135:1: rule__ScatterChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__ScatterChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3139:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:3140:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:3140:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:3141:2: 'titleSide:'
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
    // InternalJavaFXLang.g:3150:1: rule__ScatterChartFX__Group_8__1 : rule__ScatterChartFX__Group_8__1__Impl ;
    public final void rule__ScatterChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3154:1: ( rule__ScatterChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:3155:2: rule__ScatterChartFX__Group_8__1__Impl
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
    // InternalJavaFXLang.g:3161:1: rule__ScatterChartFX__Group_8__1__Impl : ( ( rule__ScatterChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__ScatterChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3165:1: ( ( ( rule__ScatterChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:3166:1: ( ( rule__ScatterChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:3166:1: ( ( rule__ScatterChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:3167:2: ( rule__ScatterChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:3168:2: ( rule__ScatterChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:3168:3: rule__ScatterChartFX__TitleSideAssignment_8_1
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
    // InternalJavaFXLang.g:3177:1: rule__ScatterChartFX__Group_9__0 : rule__ScatterChartFX__Group_9__0__Impl rule__ScatterChartFX__Group_9__1 ;
    public final void rule__ScatterChartFX__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3181:1: ( rule__ScatterChartFX__Group_9__0__Impl rule__ScatterChartFX__Group_9__1 )
            // InternalJavaFXLang.g:3182:2: rule__ScatterChartFX__Group_9__0__Impl rule__ScatterChartFX__Group_9__1
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
    // InternalJavaFXLang.g:3189:1: rule__ScatterChartFX__Group_9__0__Impl : ( 'xAxisLabel:' ) ;
    public final void rule__ScatterChartFX__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3193:1: ( ( 'xAxisLabel:' ) )
            // InternalJavaFXLang.g:3194:1: ( 'xAxisLabel:' )
            {
            // InternalJavaFXLang.g:3194:1: ( 'xAxisLabel:' )
            // InternalJavaFXLang.g:3195:2: 'xAxisLabel:'
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
    // InternalJavaFXLang.g:3204:1: rule__ScatterChartFX__Group_9__1 : rule__ScatterChartFX__Group_9__1__Impl ;
    public final void rule__ScatterChartFX__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3208:1: ( rule__ScatterChartFX__Group_9__1__Impl )
            // InternalJavaFXLang.g:3209:2: rule__ScatterChartFX__Group_9__1__Impl
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
    // InternalJavaFXLang.g:3215:1: rule__ScatterChartFX__Group_9__1__Impl : ( ( rule__ScatterChartFX__XAxisLabelAssignment_9_1 ) ) ;
    public final void rule__ScatterChartFX__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3219:1: ( ( ( rule__ScatterChartFX__XAxisLabelAssignment_9_1 ) ) )
            // InternalJavaFXLang.g:3220:1: ( ( rule__ScatterChartFX__XAxisLabelAssignment_9_1 ) )
            {
            // InternalJavaFXLang.g:3220:1: ( ( rule__ScatterChartFX__XAxisLabelAssignment_9_1 ) )
            // InternalJavaFXLang.g:3221:2: ( rule__ScatterChartFX__XAxisLabelAssignment_9_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getXAxisLabelAssignment_9_1()); 
            // InternalJavaFXLang.g:3222:2: ( rule__ScatterChartFX__XAxisLabelAssignment_9_1 )
            // InternalJavaFXLang.g:3222:3: rule__ScatterChartFX__XAxisLabelAssignment_9_1
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
    // InternalJavaFXLang.g:3231:1: rule__ScatterChartFX__Group_10__0 : rule__ScatterChartFX__Group_10__0__Impl rule__ScatterChartFX__Group_10__1 ;
    public final void rule__ScatterChartFX__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3235:1: ( rule__ScatterChartFX__Group_10__0__Impl rule__ScatterChartFX__Group_10__1 )
            // InternalJavaFXLang.g:3236:2: rule__ScatterChartFX__Group_10__0__Impl rule__ScatterChartFX__Group_10__1
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
    // InternalJavaFXLang.g:3243:1: rule__ScatterChartFX__Group_10__0__Impl : ( 'xAxisType:' ) ;
    public final void rule__ScatterChartFX__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3247:1: ( ( 'xAxisType:' ) )
            // InternalJavaFXLang.g:3248:1: ( 'xAxisType:' )
            {
            // InternalJavaFXLang.g:3248:1: ( 'xAxisType:' )
            // InternalJavaFXLang.g:3249:2: 'xAxisType:'
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
    // InternalJavaFXLang.g:3258:1: rule__ScatterChartFX__Group_10__1 : rule__ScatterChartFX__Group_10__1__Impl ;
    public final void rule__ScatterChartFX__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3262:1: ( rule__ScatterChartFX__Group_10__1__Impl )
            // InternalJavaFXLang.g:3263:2: rule__ScatterChartFX__Group_10__1__Impl
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
    // InternalJavaFXLang.g:3269:1: rule__ScatterChartFX__Group_10__1__Impl : ( ( rule__ScatterChartFX__XAxisTypeAssignment_10_1 ) ) ;
    public final void rule__ScatterChartFX__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3273:1: ( ( ( rule__ScatterChartFX__XAxisTypeAssignment_10_1 ) ) )
            // InternalJavaFXLang.g:3274:1: ( ( rule__ScatterChartFX__XAxisTypeAssignment_10_1 ) )
            {
            // InternalJavaFXLang.g:3274:1: ( ( rule__ScatterChartFX__XAxisTypeAssignment_10_1 ) )
            // InternalJavaFXLang.g:3275:2: ( rule__ScatterChartFX__XAxisTypeAssignment_10_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getXAxisTypeAssignment_10_1()); 
            // InternalJavaFXLang.g:3276:2: ( rule__ScatterChartFX__XAxisTypeAssignment_10_1 )
            // InternalJavaFXLang.g:3276:3: rule__ScatterChartFX__XAxisTypeAssignment_10_1
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
    // InternalJavaFXLang.g:3285:1: rule__ScatterChartFX__Group_11__0 : rule__ScatterChartFX__Group_11__0__Impl rule__ScatterChartFX__Group_11__1 ;
    public final void rule__ScatterChartFX__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3289:1: ( rule__ScatterChartFX__Group_11__0__Impl rule__ScatterChartFX__Group_11__1 )
            // InternalJavaFXLang.g:3290:2: rule__ScatterChartFX__Group_11__0__Impl rule__ScatterChartFX__Group_11__1
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
    // InternalJavaFXLang.g:3297:1: rule__ScatterChartFX__Group_11__0__Impl : ( 'yAxisLabel:' ) ;
    public final void rule__ScatterChartFX__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3301:1: ( ( 'yAxisLabel:' ) )
            // InternalJavaFXLang.g:3302:1: ( 'yAxisLabel:' )
            {
            // InternalJavaFXLang.g:3302:1: ( 'yAxisLabel:' )
            // InternalJavaFXLang.g:3303:2: 'yAxisLabel:'
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
    // InternalJavaFXLang.g:3312:1: rule__ScatterChartFX__Group_11__1 : rule__ScatterChartFX__Group_11__1__Impl ;
    public final void rule__ScatterChartFX__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3316:1: ( rule__ScatterChartFX__Group_11__1__Impl )
            // InternalJavaFXLang.g:3317:2: rule__ScatterChartFX__Group_11__1__Impl
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
    // InternalJavaFXLang.g:3323:1: rule__ScatterChartFX__Group_11__1__Impl : ( ( rule__ScatterChartFX__YAxisLabelAssignment_11_1 ) ) ;
    public final void rule__ScatterChartFX__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3327:1: ( ( ( rule__ScatterChartFX__YAxisLabelAssignment_11_1 ) ) )
            // InternalJavaFXLang.g:3328:1: ( ( rule__ScatterChartFX__YAxisLabelAssignment_11_1 ) )
            {
            // InternalJavaFXLang.g:3328:1: ( ( rule__ScatterChartFX__YAxisLabelAssignment_11_1 ) )
            // InternalJavaFXLang.g:3329:2: ( rule__ScatterChartFX__YAxisLabelAssignment_11_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getYAxisLabelAssignment_11_1()); 
            // InternalJavaFXLang.g:3330:2: ( rule__ScatterChartFX__YAxisLabelAssignment_11_1 )
            // InternalJavaFXLang.g:3330:3: rule__ScatterChartFX__YAxisLabelAssignment_11_1
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
    // InternalJavaFXLang.g:3339:1: rule__ScatterChartFX__Group_12__0 : rule__ScatterChartFX__Group_12__0__Impl rule__ScatterChartFX__Group_12__1 ;
    public final void rule__ScatterChartFX__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3343:1: ( rule__ScatterChartFX__Group_12__0__Impl rule__ScatterChartFX__Group_12__1 )
            // InternalJavaFXLang.g:3344:2: rule__ScatterChartFX__Group_12__0__Impl rule__ScatterChartFX__Group_12__1
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
    // InternalJavaFXLang.g:3351:1: rule__ScatterChartFX__Group_12__0__Impl : ( 'yAxisType:' ) ;
    public final void rule__ScatterChartFX__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3355:1: ( ( 'yAxisType:' ) )
            // InternalJavaFXLang.g:3356:1: ( 'yAxisType:' )
            {
            // InternalJavaFXLang.g:3356:1: ( 'yAxisType:' )
            // InternalJavaFXLang.g:3357:2: 'yAxisType:'
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
    // InternalJavaFXLang.g:3366:1: rule__ScatterChartFX__Group_12__1 : rule__ScatterChartFX__Group_12__1__Impl ;
    public final void rule__ScatterChartFX__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3370:1: ( rule__ScatterChartFX__Group_12__1__Impl )
            // InternalJavaFXLang.g:3371:2: rule__ScatterChartFX__Group_12__1__Impl
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
    // InternalJavaFXLang.g:3377:1: rule__ScatterChartFX__Group_12__1__Impl : ( ( rule__ScatterChartFX__YAxisTypeAssignment_12_1 ) ) ;
    public final void rule__ScatterChartFX__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3381:1: ( ( ( rule__ScatterChartFX__YAxisTypeAssignment_12_1 ) ) )
            // InternalJavaFXLang.g:3382:1: ( ( rule__ScatterChartFX__YAxisTypeAssignment_12_1 ) )
            {
            // InternalJavaFXLang.g:3382:1: ( ( rule__ScatterChartFX__YAxisTypeAssignment_12_1 ) )
            // InternalJavaFXLang.g:3383:2: ( rule__ScatterChartFX__YAxisTypeAssignment_12_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getYAxisTypeAssignment_12_1()); 
            // InternalJavaFXLang.g:3384:2: ( rule__ScatterChartFX__YAxisTypeAssignment_12_1 )
            // InternalJavaFXLang.g:3384:3: rule__ScatterChartFX__YAxisTypeAssignment_12_1
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
    // InternalJavaFXLang.g:3393:1: rule__BubbleChartFX__Group__0 : rule__BubbleChartFX__Group__0__Impl rule__BubbleChartFX__Group__1 ;
    public final void rule__BubbleChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3397:1: ( rule__BubbleChartFX__Group__0__Impl rule__BubbleChartFX__Group__1 )
            // InternalJavaFXLang.g:3398:2: rule__BubbleChartFX__Group__0__Impl rule__BubbleChartFX__Group__1
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
    // InternalJavaFXLang.g:3405:1: rule__BubbleChartFX__Group__0__Impl : ( () ) ;
    public final void rule__BubbleChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3409:1: ( ( () ) )
            // InternalJavaFXLang.g:3410:1: ( () )
            {
            // InternalJavaFXLang.g:3410:1: ( () )
            // InternalJavaFXLang.g:3411:2: ()
            {
             before(grammarAccess.getBubbleChartFXAccess().getBubbleChartFXAction_0()); 
            // InternalJavaFXLang.g:3412:2: ()
            // InternalJavaFXLang.g:3412:3: 
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
    // InternalJavaFXLang.g:3420:1: rule__BubbleChartFX__Group__1 : rule__BubbleChartFX__Group__1__Impl rule__BubbleChartFX__Group__2 ;
    public final void rule__BubbleChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3424:1: ( rule__BubbleChartFX__Group__1__Impl rule__BubbleChartFX__Group__2 )
            // InternalJavaFXLang.g:3425:2: rule__BubbleChartFX__Group__1__Impl rule__BubbleChartFX__Group__2
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
    // InternalJavaFXLang.g:3432:1: rule__BubbleChartFX__Group__1__Impl : ( 'BubbleChart' ) ;
    public final void rule__BubbleChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3436:1: ( ( 'BubbleChart' ) )
            // InternalJavaFXLang.g:3437:1: ( 'BubbleChart' )
            {
            // InternalJavaFXLang.g:3437:1: ( 'BubbleChart' )
            // InternalJavaFXLang.g:3438:2: 'BubbleChart'
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
    // InternalJavaFXLang.g:3447:1: rule__BubbleChartFX__Group__2 : rule__BubbleChartFX__Group__2__Impl rule__BubbleChartFX__Group__3 ;
    public final void rule__BubbleChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3451:1: ( rule__BubbleChartFX__Group__2__Impl rule__BubbleChartFX__Group__3 )
            // InternalJavaFXLang.g:3452:2: rule__BubbleChartFX__Group__2__Impl rule__BubbleChartFX__Group__3
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
    // InternalJavaFXLang.g:3459:1: rule__BubbleChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__BubbleChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3463:1: ( ( '{' ) )
            // InternalJavaFXLang.g:3464:1: ( '{' )
            {
            // InternalJavaFXLang.g:3464:1: ( '{' )
            // InternalJavaFXLang.g:3465:2: '{'
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
    // InternalJavaFXLang.g:3474:1: rule__BubbleChartFX__Group__3 : rule__BubbleChartFX__Group__3__Impl rule__BubbleChartFX__Group__4 ;
    public final void rule__BubbleChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3478:1: ( rule__BubbleChartFX__Group__3__Impl rule__BubbleChartFX__Group__4 )
            // InternalJavaFXLang.g:3479:2: rule__BubbleChartFX__Group__3__Impl rule__BubbleChartFX__Group__4
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
    // InternalJavaFXLang.g:3486:1: rule__BubbleChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__BubbleChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3490:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:3491:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:3491:1: ( 'name:' )
            // InternalJavaFXLang.g:3492:2: 'name:'
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
    // InternalJavaFXLang.g:3501:1: rule__BubbleChartFX__Group__4 : rule__BubbleChartFX__Group__4__Impl rule__BubbleChartFX__Group__5 ;
    public final void rule__BubbleChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3505:1: ( rule__BubbleChartFX__Group__4__Impl rule__BubbleChartFX__Group__5 )
            // InternalJavaFXLang.g:3506:2: rule__BubbleChartFX__Group__4__Impl rule__BubbleChartFX__Group__5
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
    // InternalJavaFXLang.g:3513:1: rule__BubbleChartFX__Group__4__Impl : ( ( rule__BubbleChartFX__NameAssignment_4 ) ) ;
    public final void rule__BubbleChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3517:1: ( ( ( rule__BubbleChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:3518:1: ( ( rule__BubbleChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:3518:1: ( ( rule__BubbleChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:3519:2: ( rule__BubbleChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:3520:2: ( rule__BubbleChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:3520:3: rule__BubbleChartFX__NameAssignment_4
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
    // InternalJavaFXLang.g:3528:1: rule__BubbleChartFX__Group__5 : rule__BubbleChartFX__Group__5__Impl rule__BubbleChartFX__Group__6 ;
    public final void rule__BubbleChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3532:1: ( rule__BubbleChartFX__Group__5__Impl rule__BubbleChartFX__Group__6 )
            // InternalJavaFXLang.g:3533:2: rule__BubbleChartFX__Group__5__Impl rule__BubbleChartFX__Group__6
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
    // InternalJavaFXLang.g:3540:1: rule__BubbleChartFX__Group__5__Impl : ( ( rule__BubbleChartFX__Group_5__0 )? ) ;
    public final void rule__BubbleChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3544:1: ( ( ( rule__BubbleChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:3545:1: ( ( rule__BubbleChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:3545:1: ( ( rule__BubbleChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:3546:2: ( rule__BubbleChartFX__Group_5__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:3547:2: ( rule__BubbleChartFX__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalJavaFXLang.g:3547:3: rule__BubbleChartFX__Group_5__0
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
    // InternalJavaFXLang.g:3555:1: rule__BubbleChartFX__Group__6 : rule__BubbleChartFX__Group__6__Impl rule__BubbleChartFX__Group__7 ;
    public final void rule__BubbleChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3559:1: ( rule__BubbleChartFX__Group__6__Impl rule__BubbleChartFX__Group__7 )
            // InternalJavaFXLang.g:3560:2: rule__BubbleChartFX__Group__6__Impl rule__BubbleChartFX__Group__7
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
    // InternalJavaFXLang.g:3567:1: rule__BubbleChartFX__Group__6__Impl : ( ( rule__BubbleChartFX__Group_6__0 )? ) ;
    public final void rule__BubbleChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3571:1: ( ( ( rule__BubbleChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:3572:1: ( ( rule__BubbleChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:3572:1: ( ( rule__BubbleChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:3573:2: ( rule__BubbleChartFX__Group_6__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:3574:2: ( rule__BubbleChartFX__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalJavaFXLang.g:3574:3: rule__BubbleChartFX__Group_6__0
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
    // InternalJavaFXLang.g:3582:1: rule__BubbleChartFX__Group__7 : rule__BubbleChartFX__Group__7__Impl rule__BubbleChartFX__Group__8 ;
    public final void rule__BubbleChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3586:1: ( rule__BubbleChartFX__Group__7__Impl rule__BubbleChartFX__Group__8 )
            // InternalJavaFXLang.g:3587:2: rule__BubbleChartFX__Group__7__Impl rule__BubbleChartFX__Group__8
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
    // InternalJavaFXLang.g:3594:1: rule__BubbleChartFX__Group__7__Impl : ( ( rule__BubbleChartFX__Group_7__0 )? ) ;
    public final void rule__BubbleChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3598:1: ( ( ( rule__BubbleChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:3599:1: ( ( rule__BubbleChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:3599:1: ( ( rule__BubbleChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:3600:2: ( rule__BubbleChartFX__Group_7__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:3601:2: ( rule__BubbleChartFX__Group_7__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalJavaFXLang.g:3601:3: rule__BubbleChartFX__Group_7__0
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
    // InternalJavaFXLang.g:3609:1: rule__BubbleChartFX__Group__8 : rule__BubbleChartFX__Group__8__Impl rule__BubbleChartFX__Group__9 ;
    public final void rule__BubbleChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3613:1: ( rule__BubbleChartFX__Group__8__Impl rule__BubbleChartFX__Group__9 )
            // InternalJavaFXLang.g:3614:2: rule__BubbleChartFX__Group__8__Impl rule__BubbleChartFX__Group__9
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
    // InternalJavaFXLang.g:3621:1: rule__BubbleChartFX__Group__8__Impl : ( ( rule__BubbleChartFX__Group_8__0 )? ) ;
    public final void rule__BubbleChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3625:1: ( ( ( rule__BubbleChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:3626:1: ( ( rule__BubbleChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:3626:1: ( ( rule__BubbleChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:3627:2: ( rule__BubbleChartFX__Group_8__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:3628:2: ( rule__BubbleChartFX__Group_8__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalJavaFXLang.g:3628:3: rule__BubbleChartFX__Group_8__0
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
    // InternalJavaFXLang.g:3636:1: rule__BubbleChartFX__Group__9 : rule__BubbleChartFX__Group__9__Impl rule__BubbleChartFX__Group__10 ;
    public final void rule__BubbleChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3640:1: ( rule__BubbleChartFX__Group__9__Impl rule__BubbleChartFX__Group__10 )
            // InternalJavaFXLang.g:3641:2: rule__BubbleChartFX__Group__9__Impl rule__BubbleChartFX__Group__10
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
    // InternalJavaFXLang.g:3648:1: rule__BubbleChartFX__Group__9__Impl : ( ( rule__BubbleChartFX__Group_9__0 )? ) ;
    public final void rule__BubbleChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3652:1: ( ( ( rule__BubbleChartFX__Group_9__0 )? ) )
            // InternalJavaFXLang.g:3653:1: ( ( rule__BubbleChartFX__Group_9__0 )? )
            {
            // InternalJavaFXLang.g:3653:1: ( ( rule__BubbleChartFX__Group_9__0 )? )
            // InternalJavaFXLang.g:3654:2: ( rule__BubbleChartFX__Group_9__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_9()); 
            // InternalJavaFXLang.g:3655:2: ( rule__BubbleChartFX__Group_9__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalJavaFXLang.g:3655:3: rule__BubbleChartFX__Group_9__0
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
    // InternalJavaFXLang.g:3663:1: rule__BubbleChartFX__Group__10 : rule__BubbleChartFX__Group__10__Impl rule__BubbleChartFX__Group__11 ;
    public final void rule__BubbleChartFX__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3667:1: ( rule__BubbleChartFX__Group__10__Impl rule__BubbleChartFX__Group__11 )
            // InternalJavaFXLang.g:3668:2: rule__BubbleChartFX__Group__10__Impl rule__BubbleChartFX__Group__11
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
    // InternalJavaFXLang.g:3675:1: rule__BubbleChartFX__Group__10__Impl : ( ( rule__BubbleChartFX__Group_10__0 )? ) ;
    public final void rule__BubbleChartFX__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3679:1: ( ( ( rule__BubbleChartFX__Group_10__0 )? ) )
            // InternalJavaFXLang.g:3680:1: ( ( rule__BubbleChartFX__Group_10__0 )? )
            {
            // InternalJavaFXLang.g:3680:1: ( ( rule__BubbleChartFX__Group_10__0 )? )
            // InternalJavaFXLang.g:3681:2: ( rule__BubbleChartFX__Group_10__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_10()); 
            // InternalJavaFXLang.g:3682:2: ( rule__BubbleChartFX__Group_10__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==41) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalJavaFXLang.g:3682:3: rule__BubbleChartFX__Group_10__0
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
    // InternalJavaFXLang.g:3690:1: rule__BubbleChartFX__Group__11 : rule__BubbleChartFX__Group__11__Impl rule__BubbleChartFX__Group__12 ;
    public final void rule__BubbleChartFX__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3694:1: ( rule__BubbleChartFX__Group__11__Impl rule__BubbleChartFX__Group__12 )
            // InternalJavaFXLang.g:3695:2: rule__BubbleChartFX__Group__11__Impl rule__BubbleChartFX__Group__12
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
    // InternalJavaFXLang.g:3702:1: rule__BubbleChartFX__Group__11__Impl : ( ( rule__BubbleChartFX__Group_11__0 )? ) ;
    public final void rule__BubbleChartFX__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3706:1: ( ( ( rule__BubbleChartFX__Group_11__0 )? ) )
            // InternalJavaFXLang.g:3707:1: ( ( rule__BubbleChartFX__Group_11__0 )? )
            {
            // InternalJavaFXLang.g:3707:1: ( ( rule__BubbleChartFX__Group_11__0 )? )
            // InternalJavaFXLang.g:3708:2: ( rule__BubbleChartFX__Group_11__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_11()); 
            // InternalJavaFXLang.g:3709:2: ( rule__BubbleChartFX__Group_11__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==42) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalJavaFXLang.g:3709:3: rule__BubbleChartFX__Group_11__0
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
    // InternalJavaFXLang.g:3717:1: rule__BubbleChartFX__Group__12 : rule__BubbleChartFX__Group__12__Impl rule__BubbleChartFX__Group__13 ;
    public final void rule__BubbleChartFX__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3721:1: ( rule__BubbleChartFX__Group__12__Impl rule__BubbleChartFX__Group__13 )
            // InternalJavaFXLang.g:3722:2: rule__BubbleChartFX__Group__12__Impl rule__BubbleChartFX__Group__13
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
    // InternalJavaFXLang.g:3729:1: rule__BubbleChartFX__Group__12__Impl : ( ( rule__BubbleChartFX__Group_12__0 )? ) ;
    public final void rule__BubbleChartFX__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3733:1: ( ( ( rule__BubbleChartFX__Group_12__0 )? ) )
            // InternalJavaFXLang.g:3734:1: ( ( rule__BubbleChartFX__Group_12__0 )? )
            {
            // InternalJavaFXLang.g:3734:1: ( ( rule__BubbleChartFX__Group_12__0 )? )
            // InternalJavaFXLang.g:3735:2: ( rule__BubbleChartFX__Group_12__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_12()); 
            // InternalJavaFXLang.g:3736:2: ( rule__BubbleChartFX__Group_12__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalJavaFXLang.g:3736:3: rule__BubbleChartFX__Group_12__0
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
    // InternalJavaFXLang.g:3744:1: rule__BubbleChartFX__Group__13 : rule__BubbleChartFX__Group__13__Impl ;
    public final void rule__BubbleChartFX__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3748:1: ( rule__BubbleChartFX__Group__13__Impl )
            // InternalJavaFXLang.g:3749:2: rule__BubbleChartFX__Group__13__Impl
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
    // InternalJavaFXLang.g:3755:1: rule__BubbleChartFX__Group__13__Impl : ( '}' ) ;
    public final void rule__BubbleChartFX__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3759:1: ( ( '}' ) )
            // InternalJavaFXLang.g:3760:1: ( '}' )
            {
            // InternalJavaFXLang.g:3760:1: ( '}' )
            // InternalJavaFXLang.g:3761:2: '}'
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
    // InternalJavaFXLang.g:3771:1: rule__BubbleChartFX__Group_5__0 : rule__BubbleChartFX__Group_5__0__Impl rule__BubbleChartFX__Group_5__1 ;
    public final void rule__BubbleChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3775:1: ( rule__BubbleChartFX__Group_5__0__Impl rule__BubbleChartFX__Group_5__1 )
            // InternalJavaFXLang.g:3776:2: rule__BubbleChartFX__Group_5__0__Impl rule__BubbleChartFX__Group_5__1
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
    // InternalJavaFXLang.g:3783:1: rule__BubbleChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__BubbleChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3787:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:3788:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:3788:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:3789:2: 'legendSide:'
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
    // InternalJavaFXLang.g:3798:1: rule__BubbleChartFX__Group_5__1 : rule__BubbleChartFX__Group_5__1__Impl ;
    public final void rule__BubbleChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3802:1: ( rule__BubbleChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:3803:2: rule__BubbleChartFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:3809:1: rule__BubbleChartFX__Group_5__1__Impl : ( ( rule__BubbleChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__BubbleChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3813:1: ( ( ( rule__BubbleChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:3814:1: ( ( rule__BubbleChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:3814:1: ( ( rule__BubbleChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:3815:2: ( rule__BubbleChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:3816:2: ( rule__BubbleChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:3816:3: rule__BubbleChartFX__LegendSideAssignment_5_1
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
    // InternalJavaFXLang.g:3825:1: rule__BubbleChartFX__Group_6__0 : rule__BubbleChartFX__Group_6__0__Impl rule__BubbleChartFX__Group_6__1 ;
    public final void rule__BubbleChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3829:1: ( rule__BubbleChartFX__Group_6__0__Impl rule__BubbleChartFX__Group_6__1 )
            // InternalJavaFXLang.g:3830:2: rule__BubbleChartFX__Group_6__0__Impl rule__BubbleChartFX__Group_6__1
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
    // InternalJavaFXLang.g:3837:1: rule__BubbleChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__BubbleChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3841:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:3842:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:3842:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:3843:2: 'showLegend:'
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
    // InternalJavaFXLang.g:3852:1: rule__BubbleChartFX__Group_6__1 : rule__BubbleChartFX__Group_6__1__Impl ;
    public final void rule__BubbleChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3856:1: ( rule__BubbleChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:3857:2: rule__BubbleChartFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:3863:1: rule__BubbleChartFX__Group_6__1__Impl : ( ( rule__BubbleChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__BubbleChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3867:1: ( ( ( rule__BubbleChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:3868:1: ( ( rule__BubbleChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:3868:1: ( ( rule__BubbleChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:3869:2: ( rule__BubbleChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:3870:2: ( rule__BubbleChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:3870:3: rule__BubbleChartFX__ShowLegendAssignment_6_1
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
    // InternalJavaFXLang.g:3879:1: rule__BubbleChartFX__Group_7__0 : rule__BubbleChartFX__Group_7__0__Impl rule__BubbleChartFX__Group_7__1 ;
    public final void rule__BubbleChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3883:1: ( rule__BubbleChartFX__Group_7__0__Impl rule__BubbleChartFX__Group_7__1 )
            // InternalJavaFXLang.g:3884:2: rule__BubbleChartFX__Group_7__0__Impl rule__BubbleChartFX__Group_7__1
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
    // InternalJavaFXLang.g:3891:1: rule__BubbleChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__BubbleChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3895:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:3896:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:3896:1: ( 'title:' )
            // InternalJavaFXLang.g:3897:2: 'title:'
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
    // InternalJavaFXLang.g:3906:1: rule__BubbleChartFX__Group_7__1 : rule__BubbleChartFX__Group_7__1__Impl ;
    public final void rule__BubbleChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3910:1: ( rule__BubbleChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:3911:2: rule__BubbleChartFX__Group_7__1__Impl
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
    // InternalJavaFXLang.g:3917:1: rule__BubbleChartFX__Group_7__1__Impl : ( ( rule__BubbleChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__BubbleChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3921:1: ( ( ( rule__BubbleChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:3922:1: ( ( rule__BubbleChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:3922:1: ( ( rule__BubbleChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:3923:2: ( rule__BubbleChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:3924:2: ( rule__BubbleChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:3924:3: rule__BubbleChartFX__TitleAssignment_7_1
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
    // InternalJavaFXLang.g:3933:1: rule__BubbleChartFX__Group_8__0 : rule__BubbleChartFX__Group_8__0__Impl rule__BubbleChartFX__Group_8__1 ;
    public final void rule__BubbleChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3937:1: ( rule__BubbleChartFX__Group_8__0__Impl rule__BubbleChartFX__Group_8__1 )
            // InternalJavaFXLang.g:3938:2: rule__BubbleChartFX__Group_8__0__Impl rule__BubbleChartFX__Group_8__1
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
    // InternalJavaFXLang.g:3945:1: rule__BubbleChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__BubbleChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3949:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:3950:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:3950:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:3951:2: 'titleSide:'
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
    // InternalJavaFXLang.g:3960:1: rule__BubbleChartFX__Group_8__1 : rule__BubbleChartFX__Group_8__1__Impl ;
    public final void rule__BubbleChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3964:1: ( rule__BubbleChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:3965:2: rule__BubbleChartFX__Group_8__1__Impl
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
    // InternalJavaFXLang.g:3971:1: rule__BubbleChartFX__Group_8__1__Impl : ( ( rule__BubbleChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__BubbleChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3975:1: ( ( ( rule__BubbleChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:3976:1: ( ( rule__BubbleChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:3976:1: ( ( rule__BubbleChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:3977:2: ( rule__BubbleChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:3978:2: ( rule__BubbleChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:3978:3: rule__BubbleChartFX__TitleSideAssignment_8_1
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
    // InternalJavaFXLang.g:3987:1: rule__BubbleChartFX__Group_9__0 : rule__BubbleChartFX__Group_9__0__Impl rule__BubbleChartFX__Group_9__1 ;
    public final void rule__BubbleChartFX__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3991:1: ( rule__BubbleChartFX__Group_9__0__Impl rule__BubbleChartFX__Group_9__1 )
            // InternalJavaFXLang.g:3992:2: rule__BubbleChartFX__Group_9__0__Impl rule__BubbleChartFX__Group_9__1
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
    // InternalJavaFXLang.g:3999:1: rule__BubbleChartFX__Group_9__0__Impl : ( 'xAxisLabel:' ) ;
    public final void rule__BubbleChartFX__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4003:1: ( ( 'xAxisLabel:' ) )
            // InternalJavaFXLang.g:4004:1: ( 'xAxisLabel:' )
            {
            // InternalJavaFXLang.g:4004:1: ( 'xAxisLabel:' )
            // InternalJavaFXLang.g:4005:2: 'xAxisLabel:'
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
    // InternalJavaFXLang.g:4014:1: rule__BubbleChartFX__Group_9__1 : rule__BubbleChartFX__Group_9__1__Impl ;
    public final void rule__BubbleChartFX__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4018:1: ( rule__BubbleChartFX__Group_9__1__Impl )
            // InternalJavaFXLang.g:4019:2: rule__BubbleChartFX__Group_9__1__Impl
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
    // InternalJavaFXLang.g:4025:1: rule__BubbleChartFX__Group_9__1__Impl : ( ( rule__BubbleChartFX__XAxisLabelAssignment_9_1 ) ) ;
    public final void rule__BubbleChartFX__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4029:1: ( ( ( rule__BubbleChartFX__XAxisLabelAssignment_9_1 ) ) )
            // InternalJavaFXLang.g:4030:1: ( ( rule__BubbleChartFX__XAxisLabelAssignment_9_1 ) )
            {
            // InternalJavaFXLang.g:4030:1: ( ( rule__BubbleChartFX__XAxisLabelAssignment_9_1 ) )
            // InternalJavaFXLang.g:4031:2: ( rule__BubbleChartFX__XAxisLabelAssignment_9_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getXAxisLabelAssignment_9_1()); 
            // InternalJavaFXLang.g:4032:2: ( rule__BubbleChartFX__XAxisLabelAssignment_9_1 )
            // InternalJavaFXLang.g:4032:3: rule__BubbleChartFX__XAxisLabelAssignment_9_1
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
    // InternalJavaFXLang.g:4041:1: rule__BubbleChartFX__Group_10__0 : rule__BubbleChartFX__Group_10__0__Impl rule__BubbleChartFX__Group_10__1 ;
    public final void rule__BubbleChartFX__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4045:1: ( rule__BubbleChartFX__Group_10__0__Impl rule__BubbleChartFX__Group_10__1 )
            // InternalJavaFXLang.g:4046:2: rule__BubbleChartFX__Group_10__0__Impl rule__BubbleChartFX__Group_10__1
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
    // InternalJavaFXLang.g:4053:1: rule__BubbleChartFX__Group_10__0__Impl : ( 'xAxisType:' ) ;
    public final void rule__BubbleChartFX__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4057:1: ( ( 'xAxisType:' ) )
            // InternalJavaFXLang.g:4058:1: ( 'xAxisType:' )
            {
            // InternalJavaFXLang.g:4058:1: ( 'xAxisType:' )
            // InternalJavaFXLang.g:4059:2: 'xAxisType:'
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
    // InternalJavaFXLang.g:4068:1: rule__BubbleChartFX__Group_10__1 : rule__BubbleChartFX__Group_10__1__Impl ;
    public final void rule__BubbleChartFX__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4072:1: ( rule__BubbleChartFX__Group_10__1__Impl )
            // InternalJavaFXLang.g:4073:2: rule__BubbleChartFX__Group_10__1__Impl
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
    // InternalJavaFXLang.g:4079:1: rule__BubbleChartFX__Group_10__1__Impl : ( ( rule__BubbleChartFX__XAxisTypeAssignment_10_1 ) ) ;
    public final void rule__BubbleChartFX__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4083:1: ( ( ( rule__BubbleChartFX__XAxisTypeAssignment_10_1 ) ) )
            // InternalJavaFXLang.g:4084:1: ( ( rule__BubbleChartFX__XAxisTypeAssignment_10_1 ) )
            {
            // InternalJavaFXLang.g:4084:1: ( ( rule__BubbleChartFX__XAxisTypeAssignment_10_1 ) )
            // InternalJavaFXLang.g:4085:2: ( rule__BubbleChartFX__XAxisTypeAssignment_10_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getXAxisTypeAssignment_10_1()); 
            // InternalJavaFXLang.g:4086:2: ( rule__BubbleChartFX__XAxisTypeAssignment_10_1 )
            // InternalJavaFXLang.g:4086:3: rule__BubbleChartFX__XAxisTypeAssignment_10_1
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
    // InternalJavaFXLang.g:4095:1: rule__BubbleChartFX__Group_11__0 : rule__BubbleChartFX__Group_11__0__Impl rule__BubbleChartFX__Group_11__1 ;
    public final void rule__BubbleChartFX__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4099:1: ( rule__BubbleChartFX__Group_11__0__Impl rule__BubbleChartFX__Group_11__1 )
            // InternalJavaFXLang.g:4100:2: rule__BubbleChartFX__Group_11__0__Impl rule__BubbleChartFX__Group_11__1
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
    // InternalJavaFXLang.g:4107:1: rule__BubbleChartFX__Group_11__0__Impl : ( 'yAxisLabel:' ) ;
    public final void rule__BubbleChartFX__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4111:1: ( ( 'yAxisLabel:' ) )
            // InternalJavaFXLang.g:4112:1: ( 'yAxisLabel:' )
            {
            // InternalJavaFXLang.g:4112:1: ( 'yAxisLabel:' )
            // InternalJavaFXLang.g:4113:2: 'yAxisLabel:'
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
    // InternalJavaFXLang.g:4122:1: rule__BubbleChartFX__Group_11__1 : rule__BubbleChartFX__Group_11__1__Impl ;
    public final void rule__BubbleChartFX__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4126:1: ( rule__BubbleChartFX__Group_11__1__Impl )
            // InternalJavaFXLang.g:4127:2: rule__BubbleChartFX__Group_11__1__Impl
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
    // InternalJavaFXLang.g:4133:1: rule__BubbleChartFX__Group_11__1__Impl : ( ( rule__BubbleChartFX__YAxisLabelAssignment_11_1 ) ) ;
    public final void rule__BubbleChartFX__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4137:1: ( ( ( rule__BubbleChartFX__YAxisLabelAssignment_11_1 ) ) )
            // InternalJavaFXLang.g:4138:1: ( ( rule__BubbleChartFX__YAxisLabelAssignment_11_1 ) )
            {
            // InternalJavaFXLang.g:4138:1: ( ( rule__BubbleChartFX__YAxisLabelAssignment_11_1 ) )
            // InternalJavaFXLang.g:4139:2: ( rule__BubbleChartFX__YAxisLabelAssignment_11_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getYAxisLabelAssignment_11_1()); 
            // InternalJavaFXLang.g:4140:2: ( rule__BubbleChartFX__YAxisLabelAssignment_11_1 )
            // InternalJavaFXLang.g:4140:3: rule__BubbleChartFX__YAxisLabelAssignment_11_1
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
    // InternalJavaFXLang.g:4149:1: rule__BubbleChartFX__Group_12__0 : rule__BubbleChartFX__Group_12__0__Impl rule__BubbleChartFX__Group_12__1 ;
    public final void rule__BubbleChartFX__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4153:1: ( rule__BubbleChartFX__Group_12__0__Impl rule__BubbleChartFX__Group_12__1 )
            // InternalJavaFXLang.g:4154:2: rule__BubbleChartFX__Group_12__0__Impl rule__BubbleChartFX__Group_12__1
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
    // InternalJavaFXLang.g:4161:1: rule__BubbleChartFX__Group_12__0__Impl : ( 'yAxisType:' ) ;
    public final void rule__BubbleChartFX__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4165:1: ( ( 'yAxisType:' ) )
            // InternalJavaFXLang.g:4166:1: ( 'yAxisType:' )
            {
            // InternalJavaFXLang.g:4166:1: ( 'yAxisType:' )
            // InternalJavaFXLang.g:4167:2: 'yAxisType:'
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
    // InternalJavaFXLang.g:4176:1: rule__BubbleChartFX__Group_12__1 : rule__BubbleChartFX__Group_12__1__Impl ;
    public final void rule__BubbleChartFX__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4180:1: ( rule__BubbleChartFX__Group_12__1__Impl )
            // InternalJavaFXLang.g:4181:2: rule__BubbleChartFX__Group_12__1__Impl
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
    // InternalJavaFXLang.g:4187:1: rule__BubbleChartFX__Group_12__1__Impl : ( ( rule__BubbleChartFX__YAxisTypeAssignment_12_1 ) ) ;
    public final void rule__BubbleChartFX__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4191:1: ( ( ( rule__BubbleChartFX__YAxisTypeAssignment_12_1 ) ) )
            // InternalJavaFXLang.g:4192:1: ( ( rule__BubbleChartFX__YAxisTypeAssignment_12_1 ) )
            {
            // InternalJavaFXLang.g:4192:1: ( ( rule__BubbleChartFX__YAxisTypeAssignment_12_1 ) )
            // InternalJavaFXLang.g:4193:2: ( rule__BubbleChartFX__YAxisTypeAssignment_12_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getYAxisTypeAssignment_12_1()); 
            // InternalJavaFXLang.g:4194:2: ( rule__BubbleChartFX__YAxisTypeAssignment_12_1 )
            // InternalJavaFXLang.g:4194:3: rule__BubbleChartFX__YAxisTypeAssignment_12_1
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
    // InternalJavaFXLang.g:4203:1: rule__AreaChartFX__Group__0 : rule__AreaChartFX__Group__0__Impl rule__AreaChartFX__Group__1 ;
    public final void rule__AreaChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4207:1: ( rule__AreaChartFX__Group__0__Impl rule__AreaChartFX__Group__1 )
            // InternalJavaFXLang.g:4208:2: rule__AreaChartFX__Group__0__Impl rule__AreaChartFX__Group__1
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
    // InternalJavaFXLang.g:4215:1: rule__AreaChartFX__Group__0__Impl : ( () ) ;
    public final void rule__AreaChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4219:1: ( ( () ) )
            // InternalJavaFXLang.g:4220:1: ( () )
            {
            // InternalJavaFXLang.g:4220:1: ( () )
            // InternalJavaFXLang.g:4221:2: ()
            {
             before(grammarAccess.getAreaChartFXAccess().getAreaChartFXAction_0()); 
            // InternalJavaFXLang.g:4222:2: ()
            // InternalJavaFXLang.g:4222:3: 
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
    // InternalJavaFXLang.g:4230:1: rule__AreaChartFX__Group__1 : rule__AreaChartFX__Group__1__Impl rule__AreaChartFX__Group__2 ;
    public final void rule__AreaChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4234:1: ( rule__AreaChartFX__Group__1__Impl rule__AreaChartFX__Group__2 )
            // InternalJavaFXLang.g:4235:2: rule__AreaChartFX__Group__1__Impl rule__AreaChartFX__Group__2
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
    // InternalJavaFXLang.g:4242:1: rule__AreaChartFX__Group__1__Impl : ( 'AreaChart' ) ;
    public final void rule__AreaChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4246:1: ( ( 'AreaChart' ) )
            // InternalJavaFXLang.g:4247:1: ( 'AreaChart' )
            {
            // InternalJavaFXLang.g:4247:1: ( 'AreaChart' )
            // InternalJavaFXLang.g:4248:2: 'AreaChart'
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
    // InternalJavaFXLang.g:4257:1: rule__AreaChartFX__Group__2 : rule__AreaChartFX__Group__2__Impl rule__AreaChartFX__Group__3 ;
    public final void rule__AreaChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4261:1: ( rule__AreaChartFX__Group__2__Impl rule__AreaChartFX__Group__3 )
            // InternalJavaFXLang.g:4262:2: rule__AreaChartFX__Group__2__Impl rule__AreaChartFX__Group__3
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
    // InternalJavaFXLang.g:4269:1: rule__AreaChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__AreaChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4273:1: ( ( '{' ) )
            // InternalJavaFXLang.g:4274:1: ( '{' )
            {
            // InternalJavaFXLang.g:4274:1: ( '{' )
            // InternalJavaFXLang.g:4275:2: '{'
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
    // InternalJavaFXLang.g:4284:1: rule__AreaChartFX__Group__3 : rule__AreaChartFX__Group__3__Impl rule__AreaChartFX__Group__4 ;
    public final void rule__AreaChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4288:1: ( rule__AreaChartFX__Group__3__Impl rule__AreaChartFX__Group__4 )
            // InternalJavaFXLang.g:4289:2: rule__AreaChartFX__Group__3__Impl rule__AreaChartFX__Group__4
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
    // InternalJavaFXLang.g:4296:1: rule__AreaChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__AreaChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4300:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:4301:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:4301:1: ( 'name:' )
            // InternalJavaFXLang.g:4302:2: 'name:'
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
    // InternalJavaFXLang.g:4311:1: rule__AreaChartFX__Group__4 : rule__AreaChartFX__Group__4__Impl rule__AreaChartFX__Group__5 ;
    public final void rule__AreaChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4315:1: ( rule__AreaChartFX__Group__4__Impl rule__AreaChartFX__Group__5 )
            // InternalJavaFXLang.g:4316:2: rule__AreaChartFX__Group__4__Impl rule__AreaChartFX__Group__5
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
    // InternalJavaFXLang.g:4323:1: rule__AreaChartFX__Group__4__Impl : ( ( rule__AreaChartFX__NameAssignment_4 ) ) ;
    public final void rule__AreaChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4327:1: ( ( ( rule__AreaChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:4328:1: ( ( rule__AreaChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:4328:1: ( ( rule__AreaChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:4329:2: ( rule__AreaChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getAreaChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:4330:2: ( rule__AreaChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:4330:3: rule__AreaChartFX__NameAssignment_4
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
    // InternalJavaFXLang.g:4338:1: rule__AreaChartFX__Group__5 : rule__AreaChartFX__Group__5__Impl rule__AreaChartFX__Group__6 ;
    public final void rule__AreaChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4342:1: ( rule__AreaChartFX__Group__5__Impl rule__AreaChartFX__Group__6 )
            // InternalJavaFXLang.g:4343:2: rule__AreaChartFX__Group__5__Impl rule__AreaChartFX__Group__6
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
    // InternalJavaFXLang.g:4350:1: rule__AreaChartFX__Group__5__Impl : ( ( rule__AreaChartFX__Group_5__0 )? ) ;
    public final void rule__AreaChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4354:1: ( ( ( rule__AreaChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:4355:1: ( ( rule__AreaChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:4355:1: ( ( rule__AreaChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:4356:2: ( rule__AreaChartFX__Group_5__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:4357:2: ( rule__AreaChartFX__Group_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalJavaFXLang.g:4357:3: rule__AreaChartFX__Group_5__0
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
    // InternalJavaFXLang.g:4365:1: rule__AreaChartFX__Group__6 : rule__AreaChartFX__Group__6__Impl rule__AreaChartFX__Group__7 ;
    public final void rule__AreaChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4369:1: ( rule__AreaChartFX__Group__6__Impl rule__AreaChartFX__Group__7 )
            // InternalJavaFXLang.g:4370:2: rule__AreaChartFX__Group__6__Impl rule__AreaChartFX__Group__7
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
    // InternalJavaFXLang.g:4377:1: rule__AreaChartFX__Group__6__Impl : ( ( rule__AreaChartFX__Group_6__0 )? ) ;
    public final void rule__AreaChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4381:1: ( ( ( rule__AreaChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:4382:1: ( ( rule__AreaChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:4382:1: ( ( rule__AreaChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:4383:2: ( rule__AreaChartFX__Group_6__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:4384:2: ( rule__AreaChartFX__Group_6__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalJavaFXLang.g:4384:3: rule__AreaChartFX__Group_6__0
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
    // InternalJavaFXLang.g:4392:1: rule__AreaChartFX__Group__7 : rule__AreaChartFX__Group__7__Impl rule__AreaChartFX__Group__8 ;
    public final void rule__AreaChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4396:1: ( rule__AreaChartFX__Group__7__Impl rule__AreaChartFX__Group__8 )
            // InternalJavaFXLang.g:4397:2: rule__AreaChartFX__Group__7__Impl rule__AreaChartFX__Group__8
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
    // InternalJavaFXLang.g:4404:1: rule__AreaChartFX__Group__7__Impl : ( ( rule__AreaChartFX__Group_7__0 )? ) ;
    public final void rule__AreaChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4408:1: ( ( ( rule__AreaChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:4409:1: ( ( rule__AreaChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:4409:1: ( ( rule__AreaChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:4410:2: ( rule__AreaChartFX__Group_7__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:4411:2: ( rule__AreaChartFX__Group_7__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==38) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalJavaFXLang.g:4411:3: rule__AreaChartFX__Group_7__0
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
    // InternalJavaFXLang.g:4419:1: rule__AreaChartFX__Group__8 : rule__AreaChartFX__Group__8__Impl rule__AreaChartFX__Group__9 ;
    public final void rule__AreaChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4423:1: ( rule__AreaChartFX__Group__8__Impl rule__AreaChartFX__Group__9 )
            // InternalJavaFXLang.g:4424:2: rule__AreaChartFX__Group__8__Impl rule__AreaChartFX__Group__9
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
    // InternalJavaFXLang.g:4431:1: rule__AreaChartFX__Group__8__Impl : ( ( rule__AreaChartFX__Group_8__0 )? ) ;
    public final void rule__AreaChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4435:1: ( ( ( rule__AreaChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:4436:1: ( ( rule__AreaChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:4436:1: ( ( rule__AreaChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:4437:2: ( rule__AreaChartFX__Group_8__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:4438:2: ( rule__AreaChartFX__Group_8__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==39) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalJavaFXLang.g:4438:3: rule__AreaChartFX__Group_8__0
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
    // InternalJavaFXLang.g:4446:1: rule__AreaChartFX__Group__9 : rule__AreaChartFX__Group__9__Impl rule__AreaChartFX__Group__10 ;
    public final void rule__AreaChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4450:1: ( rule__AreaChartFX__Group__9__Impl rule__AreaChartFX__Group__10 )
            // InternalJavaFXLang.g:4451:2: rule__AreaChartFX__Group__9__Impl rule__AreaChartFX__Group__10
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
    // InternalJavaFXLang.g:4458:1: rule__AreaChartFX__Group__9__Impl : ( ( rule__AreaChartFX__Group_9__0 )? ) ;
    public final void rule__AreaChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4462:1: ( ( ( rule__AreaChartFX__Group_9__0 )? ) )
            // InternalJavaFXLang.g:4463:1: ( ( rule__AreaChartFX__Group_9__0 )? )
            {
            // InternalJavaFXLang.g:4463:1: ( ( rule__AreaChartFX__Group_9__0 )? )
            // InternalJavaFXLang.g:4464:2: ( rule__AreaChartFX__Group_9__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_9()); 
            // InternalJavaFXLang.g:4465:2: ( rule__AreaChartFX__Group_9__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==40) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalJavaFXLang.g:4465:3: rule__AreaChartFX__Group_9__0
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
    // InternalJavaFXLang.g:4473:1: rule__AreaChartFX__Group__10 : rule__AreaChartFX__Group__10__Impl rule__AreaChartFX__Group__11 ;
    public final void rule__AreaChartFX__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4477:1: ( rule__AreaChartFX__Group__10__Impl rule__AreaChartFX__Group__11 )
            // InternalJavaFXLang.g:4478:2: rule__AreaChartFX__Group__10__Impl rule__AreaChartFX__Group__11
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
    // InternalJavaFXLang.g:4485:1: rule__AreaChartFX__Group__10__Impl : ( ( rule__AreaChartFX__Group_10__0 )? ) ;
    public final void rule__AreaChartFX__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4489:1: ( ( ( rule__AreaChartFX__Group_10__0 )? ) )
            // InternalJavaFXLang.g:4490:1: ( ( rule__AreaChartFX__Group_10__0 )? )
            {
            // InternalJavaFXLang.g:4490:1: ( ( rule__AreaChartFX__Group_10__0 )? )
            // InternalJavaFXLang.g:4491:2: ( rule__AreaChartFX__Group_10__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_10()); 
            // InternalJavaFXLang.g:4492:2: ( rule__AreaChartFX__Group_10__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==41) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalJavaFXLang.g:4492:3: rule__AreaChartFX__Group_10__0
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
    // InternalJavaFXLang.g:4500:1: rule__AreaChartFX__Group__11 : rule__AreaChartFX__Group__11__Impl rule__AreaChartFX__Group__12 ;
    public final void rule__AreaChartFX__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4504:1: ( rule__AreaChartFX__Group__11__Impl rule__AreaChartFX__Group__12 )
            // InternalJavaFXLang.g:4505:2: rule__AreaChartFX__Group__11__Impl rule__AreaChartFX__Group__12
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
    // InternalJavaFXLang.g:4512:1: rule__AreaChartFX__Group__11__Impl : ( ( rule__AreaChartFX__Group_11__0 )? ) ;
    public final void rule__AreaChartFX__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4516:1: ( ( ( rule__AreaChartFX__Group_11__0 )? ) )
            // InternalJavaFXLang.g:4517:1: ( ( rule__AreaChartFX__Group_11__0 )? )
            {
            // InternalJavaFXLang.g:4517:1: ( ( rule__AreaChartFX__Group_11__0 )? )
            // InternalJavaFXLang.g:4518:2: ( rule__AreaChartFX__Group_11__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_11()); 
            // InternalJavaFXLang.g:4519:2: ( rule__AreaChartFX__Group_11__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==42) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalJavaFXLang.g:4519:3: rule__AreaChartFX__Group_11__0
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
    // InternalJavaFXLang.g:4527:1: rule__AreaChartFX__Group__12 : rule__AreaChartFX__Group__12__Impl rule__AreaChartFX__Group__13 ;
    public final void rule__AreaChartFX__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4531:1: ( rule__AreaChartFX__Group__12__Impl rule__AreaChartFX__Group__13 )
            // InternalJavaFXLang.g:4532:2: rule__AreaChartFX__Group__12__Impl rule__AreaChartFX__Group__13
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
    // InternalJavaFXLang.g:4539:1: rule__AreaChartFX__Group__12__Impl : ( ( rule__AreaChartFX__Group_12__0 )? ) ;
    public final void rule__AreaChartFX__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4543:1: ( ( ( rule__AreaChartFX__Group_12__0 )? ) )
            // InternalJavaFXLang.g:4544:1: ( ( rule__AreaChartFX__Group_12__0 )? )
            {
            // InternalJavaFXLang.g:4544:1: ( ( rule__AreaChartFX__Group_12__0 )? )
            // InternalJavaFXLang.g:4545:2: ( rule__AreaChartFX__Group_12__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_12()); 
            // InternalJavaFXLang.g:4546:2: ( rule__AreaChartFX__Group_12__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==43) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalJavaFXLang.g:4546:3: rule__AreaChartFX__Group_12__0
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
    // InternalJavaFXLang.g:4554:1: rule__AreaChartFX__Group__13 : rule__AreaChartFX__Group__13__Impl ;
    public final void rule__AreaChartFX__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4558:1: ( rule__AreaChartFX__Group__13__Impl )
            // InternalJavaFXLang.g:4559:2: rule__AreaChartFX__Group__13__Impl
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
    // InternalJavaFXLang.g:4565:1: rule__AreaChartFX__Group__13__Impl : ( '}' ) ;
    public final void rule__AreaChartFX__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4569:1: ( ( '}' ) )
            // InternalJavaFXLang.g:4570:1: ( '}' )
            {
            // InternalJavaFXLang.g:4570:1: ( '}' )
            // InternalJavaFXLang.g:4571:2: '}'
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
    // InternalJavaFXLang.g:4581:1: rule__AreaChartFX__Group_5__0 : rule__AreaChartFX__Group_5__0__Impl rule__AreaChartFX__Group_5__1 ;
    public final void rule__AreaChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4585:1: ( rule__AreaChartFX__Group_5__0__Impl rule__AreaChartFX__Group_5__1 )
            // InternalJavaFXLang.g:4586:2: rule__AreaChartFX__Group_5__0__Impl rule__AreaChartFX__Group_5__1
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
    // InternalJavaFXLang.g:4593:1: rule__AreaChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__AreaChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4597:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:4598:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:4598:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:4599:2: 'legendSide:'
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
    // InternalJavaFXLang.g:4608:1: rule__AreaChartFX__Group_5__1 : rule__AreaChartFX__Group_5__1__Impl ;
    public final void rule__AreaChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4612:1: ( rule__AreaChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:4613:2: rule__AreaChartFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:4619:1: rule__AreaChartFX__Group_5__1__Impl : ( ( rule__AreaChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__AreaChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4623:1: ( ( ( rule__AreaChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:4624:1: ( ( rule__AreaChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:4624:1: ( ( rule__AreaChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:4625:2: ( rule__AreaChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:4626:2: ( rule__AreaChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:4626:3: rule__AreaChartFX__LegendSideAssignment_5_1
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
    // InternalJavaFXLang.g:4635:1: rule__AreaChartFX__Group_6__0 : rule__AreaChartFX__Group_6__0__Impl rule__AreaChartFX__Group_6__1 ;
    public final void rule__AreaChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4639:1: ( rule__AreaChartFX__Group_6__0__Impl rule__AreaChartFX__Group_6__1 )
            // InternalJavaFXLang.g:4640:2: rule__AreaChartFX__Group_6__0__Impl rule__AreaChartFX__Group_6__1
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
    // InternalJavaFXLang.g:4647:1: rule__AreaChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__AreaChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4651:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:4652:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:4652:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:4653:2: 'showLegend:'
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
    // InternalJavaFXLang.g:4662:1: rule__AreaChartFX__Group_6__1 : rule__AreaChartFX__Group_6__1__Impl ;
    public final void rule__AreaChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4666:1: ( rule__AreaChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:4667:2: rule__AreaChartFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:4673:1: rule__AreaChartFX__Group_6__1__Impl : ( ( rule__AreaChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__AreaChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4677:1: ( ( ( rule__AreaChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:4678:1: ( ( rule__AreaChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:4678:1: ( ( rule__AreaChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:4679:2: ( rule__AreaChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:4680:2: ( rule__AreaChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:4680:3: rule__AreaChartFX__ShowLegendAssignment_6_1
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
    // InternalJavaFXLang.g:4689:1: rule__AreaChartFX__Group_7__0 : rule__AreaChartFX__Group_7__0__Impl rule__AreaChartFX__Group_7__1 ;
    public final void rule__AreaChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4693:1: ( rule__AreaChartFX__Group_7__0__Impl rule__AreaChartFX__Group_7__1 )
            // InternalJavaFXLang.g:4694:2: rule__AreaChartFX__Group_7__0__Impl rule__AreaChartFX__Group_7__1
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
    // InternalJavaFXLang.g:4701:1: rule__AreaChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__AreaChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4705:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:4706:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:4706:1: ( 'title:' )
            // InternalJavaFXLang.g:4707:2: 'title:'
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
    // InternalJavaFXLang.g:4716:1: rule__AreaChartFX__Group_7__1 : rule__AreaChartFX__Group_7__1__Impl ;
    public final void rule__AreaChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4720:1: ( rule__AreaChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:4721:2: rule__AreaChartFX__Group_7__1__Impl
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
    // InternalJavaFXLang.g:4727:1: rule__AreaChartFX__Group_7__1__Impl : ( ( rule__AreaChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__AreaChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4731:1: ( ( ( rule__AreaChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:4732:1: ( ( rule__AreaChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:4732:1: ( ( rule__AreaChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:4733:2: ( rule__AreaChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:4734:2: ( rule__AreaChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:4734:3: rule__AreaChartFX__TitleAssignment_7_1
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
    // InternalJavaFXLang.g:4743:1: rule__AreaChartFX__Group_8__0 : rule__AreaChartFX__Group_8__0__Impl rule__AreaChartFX__Group_8__1 ;
    public final void rule__AreaChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4747:1: ( rule__AreaChartFX__Group_8__0__Impl rule__AreaChartFX__Group_8__1 )
            // InternalJavaFXLang.g:4748:2: rule__AreaChartFX__Group_8__0__Impl rule__AreaChartFX__Group_8__1
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
    // InternalJavaFXLang.g:4755:1: rule__AreaChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__AreaChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4759:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:4760:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:4760:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:4761:2: 'titleSide:'
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
    // InternalJavaFXLang.g:4770:1: rule__AreaChartFX__Group_8__1 : rule__AreaChartFX__Group_8__1__Impl ;
    public final void rule__AreaChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4774:1: ( rule__AreaChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:4775:2: rule__AreaChartFX__Group_8__1__Impl
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
    // InternalJavaFXLang.g:4781:1: rule__AreaChartFX__Group_8__1__Impl : ( ( rule__AreaChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__AreaChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4785:1: ( ( ( rule__AreaChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:4786:1: ( ( rule__AreaChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:4786:1: ( ( rule__AreaChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:4787:2: ( rule__AreaChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:4788:2: ( rule__AreaChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:4788:3: rule__AreaChartFX__TitleSideAssignment_8_1
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
    // InternalJavaFXLang.g:4797:1: rule__AreaChartFX__Group_9__0 : rule__AreaChartFX__Group_9__0__Impl rule__AreaChartFX__Group_9__1 ;
    public final void rule__AreaChartFX__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4801:1: ( rule__AreaChartFX__Group_9__0__Impl rule__AreaChartFX__Group_9__1 )
            // InternalJavaFXLang.g:4802:2: rule__AreaChartFX__Group_9__0__Impl rule__AreaChartFX__Group_9__1
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
    // InternalJavaFXLang.g:4809:1: rule__AreaChartFX__Group_9__0__Impl : ( 'xAxisLabel:' ) ;
    public final void rule__AreaChartFX__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4813:1: ( ( 'xAxisLabel:' ) )
            // InternalJavaFXLang.g:4814:1: ( 'xAxisLabel:' )
            {
            // InternalJavaFXLang.g:4814:1: ( 'xAxisLabel:' )
            // InternalJavaFXLang.g:4815:2: 'xAxisLabel:'
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
    // InternalJavaFXLang.g:4824:1: rule__AreaChartFX__Group_9__1 : rule__AreaChartFX__Group_9__1__Impl ;
    public final void rule__AreaChartFX__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4828:1: ( rule__AreaChartFX__Group_9__1__Impl )
            // InternalJavaFXLang.g:4829:2: rule__AreaChartFX__Group_9__1__Impl
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
    // InternalJavaFXLang.g:4835:1: rule__AreaChartFX__Group_9__1__Impl : ( ( rule__AreaChartFX__XAxisLabelAssignment_9_1 ) ) ;
    public final void rule__AreaChartFX__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4839:1: ( ( ( rule__AreaChartFX__XAxisLabelAssignment_9_1 ) ) )
            // InternalJavaFXLang.g:4840:1: ( ( rule__AreaChartFX__XAxisLabelAssignment_9_1 ) )
            {
            // InternalJavaFXLang.g:4840:1: ( ( rule__AreaChartFX__XAxisLabelAssignment_9_1 ) )
            // InternalJavaFXLang.g:4841:2: ( rule__AreaChartFX__XAxisLabelAssignment_9_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getXAxisLabelAssignment_9_1()); 
            // InternalJavaFXLang.g:4842:2: ( rule__AreaChartFX__XAxisLabelAssignment_9_1 )
            // InternalJavaFXLang.g:4842:3: rule__AreaChartFX__XAxisLabelAssignment_9_1
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
    // InternalJavaFXLang.g:4851:1: rule__AreaChartFX__Group_10__0 : rule__AreaChartFX__Group_10__0__Impl rule__AreaChartFX__Group_10__1 ;
    public final void rule__AreaChartFX__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4855:1: ( rule__AreaChartFX__Group_10__0__Impl rule__AreaChartFX__Group_10__1 )
            // InternalJavaFXLang.g:4856:2: rule__AreaChartFX__Group_10__0__Impl rule__AreaChartFX__Group_10__1
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
    // InternalJavaFXLang.g:4863:1: rule__AreaChartFX__Group_10__0__Impl : ( 'xAxisType:' ) ;
    public final void rule__AreaChartFX__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4867:1: ( ( 'xAxisType:' ) )
            // InternalJavaFXLang.g:4868:1: ( 'xAxisType:' )
            {
            // InternalJavaFXLang.g:4868:1: ( 'xAxisType:' )
            // InternalJavaFXLang.g:4869:2: 'xAxisType:'
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
    // InternalJavaFXLang.g:4878:1: rule__AreaChartFX__Group_10__1 : rule__AreaChartFX__Group_10__1__Impl ;
    public final void rule__AreaChartFX__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4882:1: ( rule__AreaChartFX__Group_10__1__Impl )
            // InternalJavaFXLang.g:4883:2: rule__AreaChartFX__Group_10__1__Impl
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
    // InternalJavaFXLang.g:4889:1: rule__AreaChartFX__Group_10__1__Impl : ( ( rule__AreaChartFX__XAxisTypeAssignment_10_1 ) ) ;
    public final void rule__AreaChartFX__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4893:1: ( ( ( rule__AreaChartFX__XAxisTypeAssignment_10_1 ) ) )
            // InternalJavaFXLang.g:4894:1: ( ( rule__AreaChartFX__XAxisTypeAssignment_10_1 ) )
            {
            // InternalJavaFXLang.g:4894:1: ( ( rule__AreaChartFX__XAxisTypeAssignment_10_1 ) )
            // InternalJavaFXLang.g:4895:2: ( rule__AreaChartFX__XAxisTypeAssignment_10_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getXAxisTypeAssignment_10_1()); 
            // InternalJavaFXLang.g:4896:2: ( rule__AreaChartFX__XAxisTypeAssignment_10_1 )
            // InternalJavaFXLang.g:4896:3: rule__AreaChartFX__XAxisTypeAssignment_10_1
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
    // InternalJavaFXLang.g:4905:1: rule__AreaChartFX__Group_11__0 : rule__AreaChartFX__Group_11__0__Impl rule__AreaChartFX__Group_11__1 ;
    public final void rule__AreaChartFX__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4909:1: ( rule__AreaChartFX__Group_11__0__Impl rule__AreaChartFX__Group_11__1 )
            // InternalJavaFXLang.g:4910:2: rule__AreaChartFX__Group_11__0__Impl rule__AreaChartFX__Group_11__1
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
    // InternalJavaFXLang.g:4917:1: rule__AreaChartFX__Group_11__0__Impl : ( 'yAxisLabel:' ) ;
    public final void rule__AreaChartFX__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4921:1: ( ( 'yAxisLabel:' ) )
            // InternalJavaFXLang.g:4922:1: ( 'yAxisLabel:' )
            {
            // InternalJavaFXLang.g:4922:1: ( 'yAxisLabel:' )
            // InternalJavaFXLang.g:4923:2: 'yAxisLabel:'
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
    // InternalJavaFXLang.g:4932:1: rule__AreaChartFX__Group_11__1 : rule__AreaChartFX__Group_11__1__Impl ;
    public final void rule__AreaChartFX__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4936:1: ( rule__AreaChartFX__Group_11__1__Impl )
            // InternalJavaFXLang.g:4937:2: rule__AreaChartFX__Group_11__1__Impl
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
    // InternalJavaFXLang.g:4943:1: rule__AreaChartFX__Group_11__1__Impl : ( ( rule__AreaChartFX__YAxisLabelAssignment_11_1 ) ) ;
    public final void rule__AreaChartFX__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4947:1: ( ( ( rule__AreaChartFX__YAxisLabelAssignment_11_1 ) ) )
            // InternalJavaFXLang.g:4948:1: ( ( rule__AreaChartFX__YAxisLabelAssignment_11_1 ) )
            {
            // InternalJavaFXLang.g:4948:1: ( ( rule__AreaChartFX__YAxisLabelAssignment_11_1 ) )
            // InternalJavaFXLang.g:4949:2: ( rule__AreaChartFX__YAxisLabelAssignment_11_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getYAxisLabelAssignment_11_1()); 
            // InternalJavaFXLang.g:4950:2: ( rule__AreaChartFX__YAxisLabelAssignment_11_1 )
            // InternalJavaFXLang.g:4950:3: rule__AreaChartFX__YAxisLabelAssignment_11_1
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
    // InternalJavaFXLang.g:4959:1: rule__AreaChartFX__Group_12__0 : rule__AreaChartFX__Group_12__0__Impl rule__AreaChartFX__Group_12__1 ;
    public final void rule__AreaChartFX__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4963:1: ( rule__AreaChartFX__Group_12__0__Impl rule__AreaChartFX__Group_12__1 )
            // InternalJavaFXLang.g:4964:2: rule__AreaChartFX__Group_12__0__Impl rule__AreaChartFX__Group_12__1
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
    // InternalJavaFXLang.g:4971:1: rule__AreaChartFX__Group_12__0__Impl : ( 'yAxisType:' ) ;
    public final void rule__AreaChartFX__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4975:1: ( ( 'yAxisType:' ) )
            // InternalJavaFXLang.g:4976:1: ( 'yAxisType:' )
            {
            // InternalJavaFXLang.g:4976:1: ( 'yAxisType:' )
            // InternalJavaFXLang.g:4977:2: 'yAxisType:'
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
    // InternalJavaFXLang.g:4986:1: rule__AreaChartFX__Group_12__1 : rule__AreaChartFX__Group_12__1__Impl ;
    public final void rule__AreaChartFX__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4990:1: ( rule__AreaChartFX__Group_12__1__Impl )
            // InternalJavaFXLang.g:4991:2: rule__AreaChartFX__Group_12__1__Impl
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
    // InternalJavaFXLang.g:4997:1: rule__AreaChartFX__Group_12__1__Impl : ( ( rule__AreaChartFX__YAxisTypeAssignment_12_1 ) ) ;
    public final void rule__AreaChartFX__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5001:1: ( ( ( rule__AreaChartFX__YAxisTypeAssignment_12_1 ) ) )
            // InternalJavaFXLang.g:5002:1: ( ( rule__AreaChartFX__YAxisTypeAssignment_12_1 ) )
            {
            // InternalJavaFXLang.g:5002:1: ( ( rule__AreaChartFX__YAxisTypeAssignment_12_1 ) )
            // InternalJavaFXLang.g:5003:2: ( rule__AreaChartFX__YAxisTypeAssignment_12_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getYAxisTypeAssignment_12_1()); 
            // InternalJavaFXLang.g:5004:2: ( rule__AreaChartFX__YAxisTypeAssignment_12_1 )
            // InternalJavaFXLang.g:5004:3: rule__AreaChartFX__YAxisTypeAssignment_12_1
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
    // InternalJavaFXLang.g:5013:1: rule__PieChartFX__Group__0 : rule__PieChartFX__Group__0__Impl rule__PieChartFX__Group__1 ;
    public final void rule__PieChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5017:1: ( rule__PieChartFX__Group__0__Impl rule__PieChartFX__Group__1 )
            // InternalJavaFXLang.g:5018:2: rule__PieChartFX__Group__0__Impl rule__PieChartFX__Group__1
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
    // InternalJavaFXLang.g:5025:1: rule__PieChartFX__Group__0__Impl : ( () ) ;
    public final void rule__PieChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5029:1: ( ( () ) )
            // InternalJavaFXLang.g:5030:1: ( () )
            {
            // InternalJavaFXLang.g:5030:1: ( () )
            // InternalJavaFXLang.g:5031:2: ()
            {
             before(grammarAccess.getPieChartFXAccess().getPieChartFXAction_0()); 
            // InternalJavaFXLang.g:5032:2: ()
            // InternalJavaFXLang.g:5032:3: 
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
    // InternalJavaFXLang.g:5040:1: rule__PieChartFX__Group__1 : rule__PieChartFX__Group__1__Impl rule__PieChartFX__Group__2 ;
    public final void rule__PieChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5044:1: ( rule__PieChartFX__Group__1__Impl rule__PieChartFX__Group__2 )
            // InternalJavaFXLang.g:5045:2: rule__PieChartFX__Group__1__Impl rule__PieChartFX__Group__2
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
    // InternalJavaFXLang.g:5052:1: rule__PieChartFX__Group__1__Impl : ( 'PieChart' ) ;
    public final void rule__PieChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5056:1: ( ( 'PieChart' ) )
            // InternalJavaFXLang.g:5057:1: ( 'PieChart' )
            {
            // InternalJavaFXLang.g:5057:1: ( 'PieChart' )
            // InternalJavaFXLang.g:5058:2: 'PieChart'
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
    // InternalJavaFXLang.g:5067:1: rule__PieChartFX__Group__2 : rule__PieChartFX__Group__2__Impl rule__PieChartFX__Group__3 ;
    public final void rule__PieChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5071:1: ( rule__PieChartFX__Group__2__Impl rule__PieChartFX__Group__3 )
            // InternalJavaFXLang.g:5072:2: rule__PieChartFX__Group__2__Impl rule__PieChartFX__Group__3
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
    // InternalJavaFXLang.g:5079:1: rule__PieChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__PieChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5083:1: ( ( '{' ) )
            // InternalJavaFXLang.g:5084:1: ( '{' )
            {
            // InternalJavaFXLang.g:5084:1: ( '{' )
            // InternalJavaFXLang.g:5085:2: '{'
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
    // InternalJavaFXLang.g:5094:1: rule__PieChartFX__Group__3 : rule__PieChartFX__Group__3__Impl rule__PieChartFX__Group__4 ;
    public final void rule__PieChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5098:1: ( rule__PieChartFX__Group__3__Impl rule__PieChartFX__Group__4 )
            // InternalJavaFXLang.g:5099:2: rule__PieChartFX__Group__3__Impl rule__PieChartFX__Group__4
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
    // InternalJavaFXLang.g:5106:1: rule__PieChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__PieChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5110:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:5111:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:5111:1: ( 'name:' )
            // InternalJavaFXLang.g:5112:2: 'name:'
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
    // InternalJavaFXLang.g:5121:1: rule__PieChartFX__Group__4 : rule__PieChartFX__Group__4__Impl rule__PieChartFX__Group__5 ;
    public final void rule__PieChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5125:1: ( rule__PieChartFX__Group__4__Impl rule__PieChartFX__Group__5 )
            // InternalJavaFXLang.g:5126:2: rule__PieChartFX__Group__4__Impl rule__PieChartFX__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalJavaFXLang.g:5133:1: rule__PieChartFX__Group__4__Impl : ( ( rule__PieChartFX__NameAssignment_4 ) ) ;
    public final void rule__PieChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5137:1: ( ( ( rule__PieChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:5138:1: ( ( rule__PieChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:5138:1: ( ( rule__PieChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:5139:2: ( rule__PieChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getPieChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:5140:2: ( rule__PieChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:5140:3: rule__PieChartFX__NameAssignment_4
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
    // InternalJavaFXLang.g:5148:1: rule__PieChartFX__Group__5 : rule__PieChartFX__Group__5__Impl rule__PieChartFX__Group__6 ;
    public final void rule__PieChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5152:1: ( rule__PieChartFX__Group__5__Impl rule__PieChartFX__Group__6 )
            // InternalJavaFXLang.g:5153:2: rule__PieChartFX__Group__5__Impl rule__PieChartFX__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalJavaFXLang.g:5160:1: rule__PieChartFX__Group__5__Impl : ( ( rule__PieChartFX__Group_5__0 )? ) ;
    public final void rule__PieChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5164:1: ( ( ( rule__PieChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:5165:1: ( ( rule__PieChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:5165:1: ( ( rule__PieChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:5166:2: ( rule__PieChartFX__Group_5__0 )?
            {
             before(grammarAccess.getPieChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:5167:2: ( rule__PieChartFX__Group_5__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==36) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalJavaFXLang.g:5167:3: rule__PieChartFX__Group_5__0
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
    // InternalJavaFXLang.g:5175:1: rule__PieChartFX__Group__6 : rule__PieChartFX__Group__6__Impl rule__PieChartFX__Group__7 ;
    public final void rule__PieChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5179:1: ( rule__PieChartFX__Group__6__Impl rule__PieChartFX__Group__7 )
            // InternalJavaFXLang.g:5180:2: rule__PieChartFX__Group__6__Impl rule__PieChartFX__Group__7
            {
            pushFollow(FOLLOW_28);
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
    // InternalJavaFXLang.g:5187:1: rule__PieChartFX__Group__6__Impl : ( ( rule__PieChartFX__Group_6__0 )? ) ;
    public final void rule__PieChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5191:1: ( ( ( rule__PieChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:5192:1: ( ( rule__PieChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:5192:1: ( ( rule__PieChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:5193:2: ( rule__PieChartFX__Group_6__0 )?
            {
             before(grammarAccess.getPieChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:5194:2: ( rule__PieChartFX__Group_6__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==37) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalJavaFXLang.g:5194:3: rule__PieChartFX__Group_6__0
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
    // InternalJavaFXLang.g:5202:1: rule__PieChartFX__Group__7 : rule__PieChartFX__Group__7__Impl rule__PieChartFX__Group__8 ;
    public final void rule__PieChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5206:1: ( rule__PieChartFX__Group__7__Impl rule__PieChartFX__Group__8 )
            // InternalJavaFXLang.g:5207:2: rule__PieChartFX__Group__7__Impl rule__PieChartFX__Group__8
            {
            pushFollow(FOLLOW_28);
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
    // InternalJavaFXLang.g:5214:1: rule__PieChartFX__Group__7__Impl : ( ( rule__PieChartFX__Group_7__0 )? ) ;
    public final void rule__PieChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5218:1: ( ( ( rule__PieChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:5219:1: ( ( rule__PieChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:5219:1: ( ( rule__PieChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:5220:2: ( rule__PieChartFX__Group_7__0 )?
            {
             before(grammarAccess.getPieChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:5221:2: ( rule__PieChartFX__Group_7__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==38) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalJavaFXLang.g:5221:3: rule__PieChartFX__Group_7__0
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
    // InternalJavaFXLang.g:5229:1: rule__PieChartFX__Group__8 : rule__PieChartFX__Group__8__Impl rule__PieChartFX__Group__9 ;
    public final void rule__PieChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5233:1: ( rule__PieChartFX__Group__8__Impl rule__PieChartFX__Group__9 )
            // InternalJavaFXLang.g:5234:2: rule__PieChartFX__Group__8__Impl rule__PieChartFX__Group__9
            {
            pushFollow(FOLLOW_28);
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
    // InternalJavaFXLang.g:5241:1: rule__PieChartFX__Group__8__Impl : ( ( rule__PieChartFX__Group_8__0 )? ) ;
    public final void rule__PieChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5245:1: ( ( ( rule__PieChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:5246:1: ( ( rule__PieChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:5246:1: ( ( rule__PieChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:5247:2: ( rule__PieChartFX__Group_8__0 )?
            {
             before(grammarAccess.getPieChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:5248:2: ( rule__PieChartFX__Group_8__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==39) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalJavaFXLang.g:5248:3: rule__PieChartFX__Group_8__0
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
    // InternalJavaFXLang.g:5256:1: rule__PieChartFX__Group__9 : rule__PieChartFX__Group__9__Impl ;
    public final void rule__PieChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5260:1: ( rule__PieChartFX__Group__9__Impl )
            // InternalJavaFXLang.g:5261:2: rule__PieChartFX__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieChartFX__Group__9__Impl();

            state._fsp--;


            }

        }
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
    // InternalJavaFXLang.g:5267:1: rule__PieChartFX__Group__9__Impl : ( '}' ) ;
    public final void rule__PieChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5271:1: ( ( '}' ) )
            // InternalJavaFXLang.g:5272:1: ( '}' )
            {
            // InternalJavaFXLang.g:5272:1: ( '}' )
            // InternalJavaFXLang.g:5273:2: '}'
            {
             before(grammarAccess.getPieChartFXAccess().getRightCurlyBracketKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPieChartFXAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__PieChartFX__Group_5__0"
    // InternalJavaFXLang.g:5283:1: rule__PieChartFX__Group_5__0 : rule__PieChartFX__Group_5__0__Impl rule__PieChartFX__Group_5__1 ;
    public final void rule__PieChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5287:1: ( rule__PieChartFX__Group_5__0__Impl rule__PieChartFX__Group_5__1 )
            // InternalJavaFXLang.g:5288:2: rule__PieChartFX__Group_5__0__Impl rule__PieChartFX__Group_5__1
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
    // InternalJavaFXLang.g:5295:1: rule__PieChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__PieChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5299:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:5300:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:5300:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:5301:2: 'legendSide:'
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
    // InternalJavaFXLang.g:5310:1: rule__PieChartFX__Group_5__1 : rule__PieChartFX__Group_5__1__Impl ;
    public final void rule__PieChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5314:1: ( rule__PieChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:5315:2: rule__PieChartFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:5321:1: rule__PieChartFX__Group_5__1__Impl : ( ( rule__PieChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__PieChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5325:1: ( ( ( rule__PieChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:5326:1: ( ( rule__PieChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:5326:1: ( ( rule__PieChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:5327:2: ( rule__PieChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getPieChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:5328:2: ( rule__PieChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:5328:3: rule__PieChartFX__LegendSideAssignment_5_1
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
    // InternalJavaFXLang.g:5337:1: rule__PieChartFX__Group_6__0 : rule__PieChartFX__Group_6__0__Impl rule__PieChartFX__Group_6__1 ;
    public final void rule__PieChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5341:1: ( rule__PieChartFX__Group_6__0__Impl rule__PieChartFX__Group_6__1 )
            // InternalJavaFXLang.g:5342:2: rule__PieChartFX__Group_6__0__Impl rule__PieChartFX__Group_6__1
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
    // InternalJavaFXLang.g:5349:1: rule__PieChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__PieChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5353:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:5354:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:5354:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:5355:2: 'showLegend:'
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
    // InternalJavaFXLang.g:5364:1: rule__PieChartFX__Group_6__1 : rule__PieChartFX__Group_6__1__Impl ;
    public final void rule__PieChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5368:1: ( rule__PieChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:5369:2: rule__PieChartFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:5375:1: rule__PieChartFX__Group_6__1__Impl : ( ( rule__PieChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__PieChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5379:1: ( ( ( rule__PieChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:5380:1: ( ( rule__PieChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:5380:1: ( ( rule__PieChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:5381:2: ( rule__PieChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getPieChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:5382:2: ( rule__PieChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:5382:3: rule__PieChartFX__ShowLegendAssignment_6_1
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
    // InternalJavaFXLang.g:5391:1: rule__PieChartFX__Group_7__0 : rule__PieChartFX__Group_7__0__Impl rule__PieChartFX__Group_7__1 ;
    public final void rule__PieChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5395:1: ( rule__PieChartFX__Group_7__0__Impl rule__PieChartFX__Group_7__1 )
            // InternalJavaFXLang.g:5396:2: rule__PieChartFX__Group_7__0__Impl rule__PieChartFX__Group_7__1
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
    // InternalJavaFXLang.g:5403:1: rule__PieChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__PieChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5407:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:5408:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:5408:1: ( 'title:' )
            // InternalJavaFXLang.g:5409:2: 'title:'
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
    // InternalJavaFXLang.g:5418:1: rule__PieChartFX__Group_7__1 : rule__PieChartFX__Group_7__1__Impl ;
    public final void rule__PieChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5422:1: ( rule__PieChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:5423:2: rule__PieChartFX__Group_7__1__Impl
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
    // InternalJavaFXLang.g:5429:1: rule__PieChartFX__Group_7__1__Impl : ( ( rule__PieChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__PieChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5433:1: ( ( ( rule__PieChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:5434:1: ( ( rule__PieChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:5434:1: ( ( rule__PieChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:5435:2: ( rule__PieChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getPieChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:5436:2: ( rule__PieChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:5436:3: rule__PieChartFX__TitleAssignment_7_1
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
    // InternalJavaFXLang.g:5445:1: rule__PieChartFX__Group_8__0 : rule__PieChartFX__Group_8__0__Impl rule__PieChartFX__Group_8__1 ;
    public final void rule__PieChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5449:1: ( rule__PieChartFX__Group_8__0__Impl rule__PieChartFX__Group_8__1 )
            // InternalJavaFXLang.g:5450:2: rule__PieChartFX__Group_8__0__Impl rule__PieChartFX__Group_8__1
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
    // InternalJavaFXLang.g:5457:1: rule__PieChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__PieChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5461:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:5462:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:5462:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:5463:2: 'titleSide:'
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
    // InternalJavaFXLang.g:5472:1: rule__PieChartFX__Group_8__1 : rule__PieChartFX__Group_8__1__Impl ;
    public final void rule__PieChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5476:1: ( rule__PieChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:5477:2: rule__PieChartFX__Group_8__1__Impl
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
    // InternalJavaFXLang.g:5483:1: rule__PieChartFX__Group_8__1__Impl : ( ( rule__PieChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__PieChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5487:1: ( ( ( rule__PieChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:5488:1: ( ( rule__PieChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:5488:1: ( ( rule__PieChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:5489:2: ( rule__PieChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getPieChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:5490:2: ( rule__PieChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:5490:3: rule__PieChartFX__TitleSideAssignment_8_1
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


    // $ANTLR start "rule__LineChartFX__Group__0"
    // InternalJavaFXLang.g:5499:1: rule__LineChartFX__Group__0 : rule__LineChartFX__Group__0__Impl rule__LineChartFX__Group__1 ;
    public final void rule__LineChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5503:1: ( rule__LineChartFX__Group__0__Impl rule__LineChartFX__Group__1 )
            // InternalJavaFXLang.g:5504:2: rule__LineChartFX__Group__0__Impl rule__LineChartFX__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalJavaFXLang.g:5511:1: rule__LineChartFX__Group__0__Impl : ( () ) ;
    public final void rule__LineChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5515:1: ( ( () ) )
            // InternalJavaFXLang.g:5516:1: ( () )
            {
            // InternalJavaFXLang.g:5516:1: ( () )
            // InternalJavaFXLang.g:5517:2: ()
            {
             before(grammarAccess.getLineChartFXAccess().getLineChartFXAction_0()); 
            // InternalJavaFXLang.g:5518:2: ()
            // InternalJavaFXLang.g:5518:3: 
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
    // InternalJavaFXLang.g:5526:1: rule__LineChartFX__Group__1 : rule__LineChartFX__Group__1__Impl rule__LineChartFX__Group__2 ;
    public final void rule__LineChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5530:1: ( rule__LineChartFX__Group__1__Impl rule__LineChartFX__Group__2 )
            // InternalJavaFXLang.g:5531:2: rule__LineChartFX__Group__1__Impl rule__LineChartFX__Group__2
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
    // InternalJavaFXLang.g:5538:1: rule__LineChartFX__Group__1__Impl : ( 'LineChart' ) ;
    public final void rule__LineChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5542:1: ( ( 'LineChart' ) )
            // InternalJavaFXLang.g:5543:1: ( 'LineChart' )
            {
            // InternalJavaFXLang.g:5543:1: ( 'LineChart' )
            // InternalJavaFXLang.g:5544:2: 'LineChart'
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
    // InternalJavaFXLang.g:5553:1: rule__LineChartFX__Group__2 : rule__LineChartFX__Group__2__Impl rule__LineChartFX__Group__3 ;
    public final void rule__LineChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5557:1: ( rule__LineChartFX__Group__2__Impl rule__LineChartFX__Group__3 )
            // InternalJavaFXLang.g:5558:2: rule__LineChartFX__Group__2__Impl rule__LineChartFX__Group__3
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
    // InternalJavaFXLang.g:5565:1: rule__LineChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__LineChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5569:1: ( ( '{' ) )
            // InternalJavaFXLang.g:5570:1: ( '{' )
            {
            // InternalJavaFXLang.g:5570:1: ( '{' )
            // InternalJavaFXLang.g:5571:2: '{'
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
    // InternalJavaFXLang.g:5580:1: rule__LineChartFX__Group__3 : rule__LineChartFX__Group__3__Impl rule__LineChartFX__Group__4 ;
    public final void rule__LineChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5584:1: ( rule__LineChartFX__Group__3__Impl rule__LineChartFX__Group__4 )
            // InternalJavaFXLang.g:5585:2: rule__LineChartFX__Group__3__Impl rule__LineChartFX__Group__4
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
    // InternalJavaFXLang.g:5592:1: rule__LineChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__LineChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5596:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:5597:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:5597:1: ( 'name:' )
            // InternalJavaFXLang.g:5598:2: 'name:'
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
    // InternalJavaFXLang.g:5607:1: rule__LineChartFX__Group__4 : rule__LineChartFX__Group__4__Impl rule__LineChartFX__Group__5 ;
    public final void rule__LineChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5611:1: ( rule__LineChartFX__Group__4__Impl rule__LineChartFX__Group__5 )
            // InternalJavaFXLang.g:5612:2: rule__LineChartFX__Group__4__Impl rule__LineChartFX__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalJavaFXLang.g:5619:1: rule__LineChartFX__Group__4__Impl : ( ( rule__LineChartFX__NameAssignment_4 ) ) ;
    public final void rule__LineChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5623:1: ( ( ( rule__LineChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:5624:1: ( ( rule__LineChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:5624:1: ( ( rule__LineChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:5625:2: ( rule__LineChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getLineChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:5626:2: ( rule__LineChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:5626:3: rule__LineChartFX__NameAssignment_4
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
    // InternalJavaFXLang.g:5634:1: rule__LineChartFX__Group__5 : rule__LineChartFX__Group__5__Impl rule__LineChartFX__Group__6 ;
    public final void rule__LineChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5638:1: ( rule__LineChartFX__Group__5__Impl rule__LineChartFX__Group__6 )
            // InternalJavaFXLang.g:5639:2: rule__LineChartFX__Group__5__Impl rule__LineChartFX__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalJavaFXLang.g:5646:1: rule__LineChartFX__Group__5__Impl : ( ( rule__LineChartFX__Group_5__0 )? ) ;
    public final void rule__LineChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5650:1: ( ( ( rule__LineChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:5651:1: ( ( rule__LineChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:5651:1: ( ( rule__LineChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:5652:2: ( rule__LineChartFX__Group_5__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:5653:2: ( rule__LineChartFX__Group_5__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==36) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalJavaFXLang.g:5653:3: rule__LineChartFX__Group_5__0
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
    // InternalJavaFXLang.g:5661:1: rule__LineChartFX__Group__6 : rule__LineChartFX__Group__6__Impl rule__LineChartFX__Group__7 ;
    public final void rule__LineChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5665:1: ( rule__LineChartFX__Group__6__Impl rule__LineChartFX__Group__7 )
            // InternalJavaFXLang.g:5666:2: rule__LineChartFX__Group__6__Impl rule__LineChartFX__Group__7
            {
            pushFollow(FOLLOW_30);
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
    // InternalJavaFXLang.g:5673:1: rule__LineChartFX__Group__6__Impl : ( ( rule__LineChartFX__Group_6__0 )? ) ;
    public final void rule__LineChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5677:1: ( ( ( rule__LineChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:5678:1: ( ( rule__LineChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:5678:1: ( ( rule__LineChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:5679:2: ( rule__LineChartFX__Group_6__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:5680:2: ( rule__LineChartFX__Group_6__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==37) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalJavaFXLang.g:5680:3: rule__LineChartFX__Group_6__0
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
    // InternalJavaFXLang.g:5688:1: rule__LineChartFX__Group__7 : rule__LineChartFX__Group__7__Impl rule__LineChartFX__Group__8 ;
    public final void rule__LineChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5692:1: ( rule__LineChartFX__Group__7__Impl rule__LineChartFX__Group__8 )
            // InternalJavaFXLang.g:5693:2: rule__LineChartFX__Group__7__Impl rule__LineChartFX__Group__8
            {
            pushFollow(FOLLOW_30);
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
    // InternalJavaFXLang.g:5700:1: rule__LineChartFX__Group__7__Impl : ( ( rule__LineChartFX__Group_7__0 )? ) ;
    public final void rule__LineChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5704:1: ( ( ( rule__LineChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:5705:1: ( ( rule__LineChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:5705:1: ( ( rule__LineChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:5706:2: ( rule__LineChartFX__Group_7__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:5707:2: ( rule__LineChartFX__Group_7__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==38) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalJavaFXLang.g:5707:3: rule__LineChartFX__Group_7__0
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
    // InternalJavaFXLang.g:5715:1: rule__LineChartFX__Group__8 : rule__LineChartFX__Group__8__Impl rule__LineChartFX__Group__9 ;
    public final void rule__LineChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5719:1: ( rule__LineChartFX__Group__8__Impl rule__LineChartFX__Group__9 )
            // InternalJavaFXLang.g:5720:2: rule__LineChartFX__Group__8__Impl rule__LineChartFX__Group__9
            {
            pushFollow(FOLLOW_30);
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
    // InternalJavaFXLang.g:5727:1: rule__LineChartFX__Group__8__Impl : ( ( rule__LineChartFX__Group_8__0 )? ) ;
    public final void rule__LineChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5731:1: ( ( ( rule__LineChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:5732:1: ( ( rule__LineChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:5732:1: ( ( rule__LineChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:5733:2: ( rule__LineChartFX__Group_8__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:5734:2: ( rule__LineChartFX__Group_8__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==39) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalJavaFXLang.g:5734:3: rule__LineChartFX__Group_8__0
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
    // InternalJavaFXLang.g:5742:1: rule__LineChartFX__Group__9 : rule__LineChartFX__Group__9__Impl rule__LineChartFX__Group__10 ;
    public final void rule__LineChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5746:1: ( rule__LineChartFX__Group__9__Impl rule__LineChartFX__Group__10 )
            // InternalJavaFXLang.g:5747:2: rule__LineChartFX__Group__9__Impl rule__LineChartFX__Group__10
            {
            pushFollow(FOLLOW_30);
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
    // InternalJavaFXLang.g:5754:1: rule__LineChartFX__Group__9__Impl : ( ( rule__LineChartFX__Group_9__0 )? ) ;
    public final void rule__LineChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5758:1: ( ( ( rule__LineChartFX__Group_9__0 )? ) )
            // InternalJavaFXLang.g:5759:1: ( ( rule__LineChartFX__Group_9__0 )? )
            {
            // InternalJavaFXLang.g:5759:1: ( ( rule__LineChartFX__Group_9__0 )? )
            // InternalJavaFXLang.g:5760:2: ( rule__LineChartFX__Group_9__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_9()); 
            // InternalJavaFXLang.g:5761:2: ( rule__LineChartFX__Group_9__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==40) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalJavaFXLang.g:5761:3: rule__LineChartFX__Group_9__0
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
    // InternalJavaFXLang.g:5769:1: rule__LineChartFX__Group__10 : rule__LineChartFX__Group__10__Impl rule__LineChartFX__Group__11 ;
    public final void rule__LineChartFX__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5773:1: ( rule__LineChartFX__Group__10__Impl rule__LineChartFX__Group__11 )
            // InternalJavaFXLang.g:5774:2: rule__LineChartFX__Group__10__Impl rule__LineChartFX__Group__11
            {
            pushFollow(FOLLOW_30);
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
    // InternalJavaFXLang.g:5781:1: rule__LineChartFX__Group__10__Impl : ( ( rule__LineChartFX__Group_10__0 )? ) ;
    public final void rule__LineChartFX__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5785:1: ( ( ( rule__LineChartFX__Group_10__0 )? ) )
            // InternalJavaFXLang.g:5786:1: ( ( rule__LineChartFX__Group_10__0 )? )
            {
            // InternalJavaFXLang.g:5786:1: ( ( rule__LineChartFX__Group_10__0 )? )
            // InternalJavaFXLang.g:5787:2: ( rule__LineChartFX__Group_10__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_10()); 
            // InternalJavaFXLang.g:5788:2: ( rule__LineChartFX__Group_10__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==41) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalJavaFXLang.g:5788:3: rule__LineChartFX__Group_10__0
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
    // InternalJavaFXLang.g:5796:1: rule__LineChartFX__Group__11 : rule__LineChartFX__Group__11__Impl rule__LineChartFX__Group__12 ;
    public final void rule__LineChartFX__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5800:1: ( rule__LineChartFX__Group__11__Impl rule__LineChartFX__Group__12 )
            // InternalJavaFXLang.g:5801:2: rule__LineChartFX__Group__11__Impl rule__LineChartFX__Group__12
            {
            pushFollow(FOLLOW_30);
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
    // InternalJavaFXLang.g:5808:1: rule__LineChartFX__Group__11__Impl : ( ( rule__LineChartFX__Group_11__0 )? ) ;
    public final void rule__LineChartFX__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5812:1: ( ( ( rule__LineChartFX__Group_11__0 )? ) )
            // InternalJavaFXLang.g:5813:1: ( ( rule__LineChartFX__Group_11__0 )? )
            {
            // InternalJavaFXLang.g:5813:1: ( ( rule__LineChartFX__Group_11__0 )? )
            // InternalJavaFXLang.g:5814:2: ( rule__LineChartFX__Group_11__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_11()); 
            // InternalJavaFXLang.g:5815:2: ( rule__LineChartFX__Group_11__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==42) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalJavaFXLang.g:5815:3: rule__LineChartFX__Group_11__0
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
    // InternalJavaFXLang.g:5823:1: rule__LineChartFX__Group__12 : rule__LineChartFX__Group__12__Impl rule__LineChartFX__Group__13 ;
    public final void rule__LineChartFX__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5827:1: ( rule__LineChartFX__Group__12__Impl rule__LineChartFX__Group__13 )
            // InternalJavaFXLang.g:5828:2: rule__LineChartFX__Group__12__Impl rule__LineChartFX__Group__13
            {
            pushFollow(FOLLOW_30);
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
    // InternalJavaFXLang.g:5835:1: rule__LineChartFX__Group__12__Impl : ( ( rule__LineChartFX__Group_12__0 )? ) ;
    public final void rule__LineChartFX__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5839:1: ( ( ( rule__LineChartFX__Group_12__0 )? ) )
            // InternalJavaFXLang.g:5840:1: ( ( rule__LineChartFX__Group_12__0 )? )
            {
            // InternalJavaFXLang.g:5840:1: ( ( rule__LineChartFX__Group_12__0 )? )
            // InternalJavaFXLang.g:5841:2: ( rule__LineChartFX__Group_12__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_12()); 
            // InternalJavaFXLang.g:5842:2: ( rule__LineChartFX__Group_12__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==43) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalJavaFXLang.g:5842:3: rule__LineChartFX__Group_12__0
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
    // InternalJavaFXLang.g:5850:1: rule__LineChartFX__Group__13 : rule__LineChartFX__Group__13__Impl rule__LineChartFX__Group__14 ;
    public final void rule__LineChartFX__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5854:1: ( rule__LineChartFX__Group__13__Impl rule__LineChartFX__Group__14 )
            // InternalJavaFXLang.g:5855:2: rule__LineChartFX__Group__13__Impl rule__LineChartFX__Group__14
            {
            pushFollow(FOLLOW_30);
            rule__LineChartFX__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group__14();

            state._fsp--;


            }

        }
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
    // InternalJavaFXLang.g:5862:1: rule__LineChartFX__Group__13__Impl : ( ( rule__LineChartFX__Group_13__0 )? ) ;
    public final void rule__LineChartFX__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5866:1: ( ( ( rule__LineChartFX__Group_13__0 )? ) )
            // InternalJavaFXLang.g:5867:1: ( ( rule__LineChartFX__Group_13__0 )? )
            {
            // InternalJavaFXLang.g:5867:1: ( ( rule__LineChartFX__Group_13__0 )? )
            // InternalJavaFXLang.g:5868:2: ( rule__LineChartFX__Group_13__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_13()); 
            // InternalJavaFXLang.g:5869:2: ( rule__LineChartFX__Group_13__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==49) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalJavaFXLang.g:5869:3: rule__LineChartFX__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineChartFX__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineChartFXAccess().getGroup_13()); 

            }


            }

        }
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


    // $ANTLR start "rule__LineChartFX__Group__14"
    // InternalJavaFXLang.g:5877:1: rule__LineChartFX__Group__14 : rule__LineChartFX__Group__14__Impl ;
    public final void rule__LineChartFX__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5881:1: ( rule__LineChartFX__Group__14__Impl )
            // InternalJavaFXLang.g:5882:2: rule__LineChartFX__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChartFX__Group__14"


    // $ANTLR start "rule__LineChartFX__Group__14__Impl"
    // InternalJavaFXLang.g:5888:1: rule__LineChartFX__Group__14__Impl : ( '}' ) ;
    public final void rule__LineChartFX__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5892:1: ( ( '}' ) )
            // InternalJavaFXLang.g:5893:1: ( '}' )
            {
            // InternalJavaFXLang.g:5893:1: ( '}' )
            // InternalJavaFXLang.g:5894:2: '}'
            {
             before(grammarAccess.getLineChartFXAccess().getRightCurlyBracketKeyword_14()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLineChartFXAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChartFX__Group__14__Impl"


    // $ANTLR start "rule__LineChartFX__Group_5__0"
    // InternalJavaFXLang.g:5904:1: rule__LineChartFX__Group_5__0 : rule__LineChartFX__Group_5__0__Impl rule__LineChartFX__Group_5__1 ;
    public final void rule__LineChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5908:1: ( rule__LineChartFX__Group_5__0__Impl rule__LineChartFX__Group_5__1 )
            // InternalJavaFXLang.g:5909:2: rule__LineChartFX__Group_5__0__Impl rule__LineChartFX__Group_5__1
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
    // InternalJavaFXLang.g:5916:1: rule__LineChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__LineChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5920:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:5921:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:5921:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:5922:2: 'legendSide:'
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
    // InternalJavaFXLang.g:5931:1: rule__LineChartFX__Group_5__1 : rule__LineChartFX__Group_5__1__Impl ;
    public final void rule__LineChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5935:1: ( rule__LineChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:5936:2: rule__LineChartFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:5942:1: rule__LineChartFX__Group_5__1__Impl : ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__LineChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5946:1: ( ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:5947:1: ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:5947:1: ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:5948:2: ( rule__LineChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:5949:2: ( rule__LineChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:5949:3: rule__LineChartFX__LegendSideAssignment_5_1
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
    // InternalJavaFXLang.g:5958:1: rule__LineChartFX__Group_6__0 : rule__LineChartFX__Group_6__0__Impl rule__LineChartFX__Group_6__1 ;
    public final void rule__LineChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5962:1: ( rule__LineChartFX__Group_6__0__Impl rule__LineChartFX__Group_6__1 )
            // InternalJavaFXLang.g:5963:2: rule__LineChartFX__Group_6__0__Impl rule__LineChartFX__Group_6__1
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
    // InternalJavaFXLang.g:5970:1: rule__LineChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__LineChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5974:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:5975:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:5975:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:5976:2: 'showLegend:'
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
    // InternalJavaFXLang.g:5985:1: rule__LineChartFX__Group_6__1 : rule__LineChartFX__Group_6__1__Impl ;
    public final void rule__LineChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5989:1: ( rule__LineChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:5990:2: rule__LineChartFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:5996:1: rule__LineChartFX__Group_6__1__Impl : ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__LineChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6000:1: ( ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:6001:1: ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:6001:1: ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:6002:2: ( rule__LineChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:6003:2: ( rule__LineChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:6003:3: rule__LineChartFX__ShowLegendAssignment_6_1
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
    // InternalJavaFXLang.g:6012:1: rule__LineChartFX__Group_7__0 : rule__LineChartFX__Group_7__0__Impl rule__LineChartFX__Group_7__1 ;
    public final void rule__LineChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6016:1: ( rule__LineChartFX__Group_7__0__Impl rule__LineChartFX__Group_7__1 )
            // InternalJavaFXLang.g:6017:2: rule__LineChartFX__Group_7__0__Impl rule__LineChartFX__Group_7__1
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
    // InternalJavaFXLang.g:6024:1: rule__LineChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__LineChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6028:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:6029:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:6029:1: ( 'title:' )
            // InternalJavaFXLang.g:6030:2: 'title:'
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
    // InternalJavaFXLang.g:6039:1: rule__LineChartFX__Group_7__1 : rule__LineChartFX__Group_7__1__Impl ;
    public final void rule__LineChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6043:1: ( rule__LineChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:6044:2: rule__LineChartFX__Group_7__1__Impl
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
    // InternalJavaFXLang.g:6050:1: rule__LineChartFX__Group_7__1__Impl : ( ( rule__LineChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__LineChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6054:1: ( ( ( rule__LineChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:6055:1: ( ( rule__LineChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:6055:1: ( ( rule__LineChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:6056:2: ( rule__LineChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:6057:2: ( rule__LineChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:6057:3: rule__LineChartFX__TitleAssignment_7_1
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
    // InternalJavaFXLang.g:6066:1: rule__LineChartFX__Group_8__0 : rule__LineChartFX__Group_8__0__Impl rule__LineChartFX__Group_8__1 ;
    public final void rule__LineChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6070:1: ( rule__LineChartFX__Group_8__0__Impl rule__LineChartFX__Group_8__1 )
            // InternalJavaFXLang.g:6071:2: rule__LineChartFX__Group_8__0__Impl rule__LineChartFX__Group_8__1
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
    // InternalJavaFXLang.g:6078:1: rule__LineChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__LineChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6082:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:6083:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:6083:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:6084:2: 'titleSide:'
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
    // InternalJavaFXLang.g:6093:1: rule__LineChartFX__Group_8__1 : rule__LineChartFX__Group_8__1__Impl ;
    public final void rule__LineChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6097:1: ( rule__LineChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:6098:2: rule__LineChartFX__Group_8__1__Impl
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
    // InternalJavaFXLang.g:6104:1: rule__LineChartFX__Group_8__1__Impl : ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__LineChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6108:1: ( ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:6109:1: ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:6109:1: ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:6110:2: ( rule__LineChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:6111:2: ( rule__LineChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:6111:3: rule__LineChartFX__TitleSideAssignment_8_1
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
    // InternalJavaFXLang.g:6120:1: rule__LineChartFX__Group_9__0 : rule__LineChartFX__Group_9__0__Impl rule__LineChartFX__Group_9__1 ;
    public final void rule__LineChartFX__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6124:1: ( rule__LineChartFX__Group_9__0__Impl rule__LineChartFX__Group_9__1 )
            // InternalJavaFXLang.g:6125:2: rule__LineChartFX__Group_9__0__Impl rule__LineChartFX__Group_9__1
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
    // InternalJavaFXLang.g:6132:1: rule__LineChartFX__Group_9__0__Impl : ( 'xAxisLabel:' ) ;
    public final void rule__LineChartFX__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6136:1: ( ( 'xAxisLabel:' ) )
            // InternalJavaFXLang.g:6137:1: ( 'xAxisLabel:' )
            {
            // InternalJavaFXLang.g:6137:1: ( 'xAxisLabel:' )
            // InternalJavaFXLang.g:6138:2: 'xAxisLabel:'
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
    // InternalJavaFXLang.g:6147:1: rule__LineChartFX__Group_9__1 : rule__LineChartFX__Group_9__1__Impl ;
    public final void rule__LineChartFX__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6151:1: ( rule__LineChartFX__Group_9__1__Impl )
            // InternalJavaFXLang.g:6152:2: rule__LineChartFX__Group_9__1__Impl
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
    // InternalJavaFXLang.g:6158:1: rule__LineChartFX__Group_9__1__Impl : ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) ) ;
    public final void rule__LineChartFX__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6162:1: ( ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) ) )
            // InternalJavaFXLang.g:6163:1: ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) )
            {
            // InternalJavaFXLang.g:6163:1: ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) )
            // InternalJavaFXLang.g:6164:2: ( rule__LineChartFX__XAxisLabelAssignment_9_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getXAxisLabelAssignment_9_1()); 
            // InternalJavaFXLang.g:6165:2: ( rule__LineChartFX__XAxisLabelAssignment_9_1 )
            // InternalJavaFXLang.g:6165:3: rule__LineChartFX__XAxisLabelAssignment_9_1
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
    // InternalJavaFXLang.g:6174:1: rule__LineChartFX__Group_10__0 : rule__LineChartFX__Group_10__0__Impl rule__LineChartFX__Group_10__1 ;
    public final void rule__LineChartFX__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6178:1: ( rule__LineChartFX__Group_10__0__Impl rule__LineChartFX__Group_10__1 )
            // InternalJavaFXLang.g:6179:2: rule__LineChartFX__Group_10__0__Impl rule__LineChartFX__Group_10__1
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
    // InternalJavaFXLang.g:6186:1: rule__LineChartFX__Group_10__0__Impl : ( 'xAxisType:' ) ;
    public final void rule__LineChartFX__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6190:1: ( ( 'xAxisType:' ) )
            // InternalJavaFXLang.g:6191:1: ( 'xAxisType:' )
            {
            // InternalJavaFXLang.g:6191:1: ( 'xAxisType:' )
            // InternalJavaFXLang.g:6192:2: 'xAxisType:'
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
    // InternalJavaFXLang.g:6201:1: rule__LineChartFX__Group_10__1 : rule__LineChartFX__Group_10__1__Impl ;
    public final void rule__LineChartFX__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6205:1: ( rule__LineChartFX__Group_10__1__Impl )
            // InternalJavaFXLang.g:6206:2: rule__LineChartFX__Group_10__1__Impl
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
    // InternalJavaFXLang.g:6212:1: rule__LineChartFX__Group_10__1__Impl : ( ( rule__LineChartFX__XAxisTypeAssignment_10_1 ) ) ;
    public final void rule__LineChartFX__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6216:1: ( ( ( rule__LineChartFX__XAxisTypeAssignment_10_1 ) ) )
            // InternalJavaFXLang.g:6217:1: ( ( rule__LineChartFX__XAxisTypeAssignment_10_1 ) )
            {
            // InternalJavaFXLang.g:6217:1: ( ( rule__LineChartFX__XAxisTypeAssignment_10_1 ) )
            // InternalJavaFXLang.g:6218:2: ( rule__LineChartFX__XAxisTypeAssignment_10_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getXAxisTypeAssignment_10_1()); 
            // InternalJavaFXLang.g:6219:2: ( rule__LineChartFX__XAxisTypeAssignment_10_1 )
            // InternalJavaFXLang.g:6219:3: rule__LineChartFX__XAxisTypeAssignment_10_1
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
    // InternalJavaFXLang.g:6228:1: rule__LineChartFX__Group_11__0 : rule__LineChartFX__Group_11__0__Impl rule__LineChartFX__Group_11__1 ;
    public final void rule__LineChartFX__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6232:1: ( rule__LineChartFX__Group_11__0__Impl rule__LineChartFX__Group_11__1 )
            // InternalJavaFXLang.g:6233:2: rule__LineChartFX__Group_11__0__Impl rule__LineChartFX__Group_11__1
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
    // InternalJavaFXLang.g:6240:1: rule__LineChartFX__Group_11__0__Impl : ( 'yAxisLabel:' ) ;
    public final void rule__LineChartFX__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6244:1: ( ( 'yAxisLabel:' ) )
            // InternalJavaFXLang.g:6245:1: ( 'yAxisLabel:' )
            {
            // InternalJavaFXLang.g:6245:1: ( 'yAxisLabel:' )
            // InternalJavaFXLang.g:6246:2: 'yAxisLabel:'
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
    // InternalJavaFXLang.g:6255:1: rule__LineChartFX__Group_11__1 : rule__LineChartFX__Group_11__1__Impl ;
    public final void rule__LineChartFX__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6259:1: ( rule__LineChartFX__Group_11__1__Impl )
            // InternalJavaFXLang.g:6260:2: rule__LineChartFX__Group_11__1__Impl
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
    // InternalJavaFXLang.g:6266:1: rule__LineChartFX__Group_11__1__Impl : ( ( rule__LineChartFX__YAxisLabelAssignment_11_1 ) ) ;
    public final void rule__LineChartFX__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6270:1: ( ( ( rule__LineChartFX__YAxisLabelAssignment_11_1 ) ) )
            // InternalJavaFXLang.g:6271:1: ( ( rule__LineChartFX__YAxisLabelAssignment_11_1 ) )
            {
            // InternalJavaFXLang.g:6271:1: ( ( rule__LineChartFX__YAxisLabelAssignment_11_1 ) )
            // InternalJavaFXLang.g:6272:2: ( rule__LineChartFX__YAxisLabelAssignment_11_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getYAxisLabelAssignment_11_1()); 
            // InternalJavaFXLang.g:6273:2: ( rule__LineChartFX__YAxisLabelAssignment_11_1 )
            // InternalJavaFXLang.g:6273:3: rule__LineChartFX__YAxisLabelAssignment_11_1
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
    // InternalJavaFXLang.g:6282:1: rule__LineChartFX__Group_12__0 : rule__LineChartFX__Group_12__0__Impl rule__LineChartFX__Group_12__1 ;
    public final void rule__LineChartFX__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6286:1: ( rule__LineChartFX__Group_12__0__Impl rule__LineChartFX__Group_12__1 )
            // InternalJavaFXLang.g:6287:2: rule__LineChartFX__Group_12__0__Impl rule__LineChartFX__Group_12__1
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
    // InternalJavaFXLang.g:6294:1: rule__LineChartFX__Group_12__0__Impl : ( 'yAxisType:' ) ;
    public final void rule__LineChartFX__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6298:1: ( ( 'yAxisType:' ) )
            // InternalJavaFXLang.g:6299:1: ( 'yAxisType:' )
            {
            // InternalJavaFXLang.g:6299:1: ( 'yAxisType:' )
            // InternalJavaFXLang.g:6300:2: 'yAxisType:'
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
    // InternalJavaFXLang.g:6309:1: rule__LineChartFX__Group_12__1 : rule__LineChartFX__Group_12__1__Impl ;
    public final void rule__LineChartFX__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6313:1: ( rule__LineChartFX__Group_12__1__Impl )
            // InternalJavaFXLang.g:6314:2: rule__LineChartFX__Group_12__1__Impl
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
    // InternalJavaFXLang.g:6320:1: rule__LineChartFX__Group_12__1__Impl : ( ( rule__LineChartFX__YAxisTypeAssignment_12_1 ) ) ;
    public final void rule__LineChartFX__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6324:1: ( ( ( rule__LineChartFX__YAxisTypeAssignment_12_1 ) ) )
            // InternalJavaFXLang.g:6325:1: ( ( rule__LineChartFX__YAxisTypeAssignment_12_1 ) )
            {
            // InternalJavaFXLang.g:6325:1: ( ( rule__LineChartFX__YAxisTypeAssignment_12_1 ) )
            // InternalJavaFXLang.g:6326:2: ( rule__LineChartFX__YAxisTypeAssignment_12_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getYAxisTypeAssignment_12_1()); 
            // InternalJavaFXLang.g:6327:2: ( rule__LineChartFX__YAxisTypeAssignment_12_1 )
            // InternalJavaFXLang.g:6327:3: rule__LineChartFX__YAxisTypeAssignment_12_1
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


    // $ANTLR start "rule__LineChartFX__Group_13__0"
    // InternalJavaFXLang.g:6336:1: rule__LineChartFX__Group_13__0 : rule__LineChartFX__Group_13__0__Impl rule__LineChartFX__Group_13__1 ;
    public final void rule__LineChartFX__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6340:1: ( rule__LineChartFX__Group_13__0__Impl rule__LineChartFX__Group_13__1 )
            // InternalJavaFXLang.g:6341:2: rule__LineChartFX__Group_13__0__Impl rule__LineChartFX__Group_13__1
            {
            pushFollow(FOLLOW_31);
            rule__LineChartFX__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChartFX__Group_13__0"


    // $ANTLR start "rule__LineChartFX__Group_13__0__Impl"
    // InternalJavaFXLang.g:6348:1: rule__LineChartFX__Group_13__0__Impl : ( ( rule__LineChartFX__SeriesAssignment_13_0 ) ) ;
    public final void rule__LineChartFX__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6352:1: ( ( ( rule__LineChartFX__SeriesAssignment_13_0 ) ) )
            // InternalJavaFXLang.g:6353:1: ( ( rule__LineChartFX__SeriesAssignment_13_0 ) )
            {
            // InternalJavaFXLang.g:6353:1: ( ( rule__LineChartFX__SeriesAssignment_13_0 ) )
            // InternalJavaFXLang.g:6354:2: ( rule__LineChartFX__SeriesAssignment_13_0 )
            {
             before(grammarAccess.getLineChartFXAccess().getSeriesAssignment_13_0()); 
            // InternalJavaFXLang.g:6355:2: ( rule__LineChartFX__SeriesAssignment_13_0 )
            // InternalJavaFXLang.g:6355:3: rule__LineChartFX__SeriesAssignment_13_0
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__SeriesAssignment_13_0();

            state._fsp--;


            }

             after(grammarAccess.getLineChartFXAccess().getSeriesAssignment_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChartFX__Group_13__0__Impl"


    // $ANTLR start "rule__LineChartFX__Group_13__1"
    // InternalJavaFXLang.g:6363:1: rule__LineChartFX__Group_13__1 : rule__LineChartFX__Group_13__1__Impl ;
    public final void rule__LineChartFX__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6367:1: ( rule__LineChartFX__Group_13__1__Impl )
            // InternalJavaFXLang.g:6368:2: rule__LineChartFX__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChartFX__Group_13__1"


    // $ANTLR start "rule__LineChartFX__Group_13__1__Impl"
    // InternalJavaFXLang.g:6374:1: rule__LineChartFX__Group_13__1__Impl : ( ( rule__LineChartFX__SeriesAssignment_13_1 )* ) ;
    public final void rule__LineChartFX__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6378:1: ( ( ( rule__LineChartFX__SeriesAssignment_13_1 )* ) )
            // InternalJavaFXLang.g:6379:1: ( ( rule__LineChartFX__SeriesAssignment_13_1 )* )
            {
            // InternalJavaFXLang.g:6379:1: ( ( rule__LineChartFX__SeriesAssignment_13_1 )* )
            // InternalJavaFXLang.g:6380:2: ( rule__LineChartFX__SeriesAssignment_13_1 )*
            {
             before(grammarAccess.getLineChartFXAccess().getSeriesAssignment_13_1()); 
            // InternalJavaFXLang.g:6381:2: ( rule__LineChartFX__SeriesAssignment_13_1 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==49) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalJavaFXLang.g:6381:3: rule__LineChartFX__SeriesAssignment_13_1
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__LineChartFX__SeriesAssignment_13_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

             after(grammarAccess.getLineChartFXAccess().getSeriesAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChartFX__Group_13__1__Impl"


    // $ANTLR start "rule__ChartSeries__Group__0"
    // InternalJavaFXLang.g:6390:1: rule__ChartSeries__Group__0 : rule__ChartSeries__Group__0__Impl rule__ChartSeries__Group__1 ;
    public final void rule__ChartSeries__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6394:1: ( rule__ChartSeries__Group__0__Impl rule__ChartSeries__Group__1 )
            // InternalJavaFXLang.g:6395:2: rule__ChartSeries__Group__0__Impl rule__ChartSeries__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__ChartSeries__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChartSeries__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group__0"


    // $ANTLR start "rule__ChartSeries__Group__0__Impl"
    // InternalJavaFXLang.g:6402:1: rule__ChartSeries__Group__0__Impl : ( () ) ;
    public final void rule__ChartSeries__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6406:1: ( ( () ) )
            // InternalJavaFXLang.g:6407:1: ( () )
            {
            // InternalJavaFXLang.g:6407:1: ( () )
            // InternalJavaFXLang.g:6408:2: ()
            {
             before(grammarAccess.getChartSeriesAccess().getChartSeriesAction_0()); 
            // InternalJavaFXLang.g:6409:2: ()
            // InternalJavaFXLang.g:6409:3: 
            {
            }

             after(grammarAccess.getChartSeriesAccess().getChartSeriesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group__0__Impl"


    // $ANTLR start "rule__ChartSeries__Group__1"
    // InternalJavaFXLang.g:6417:1: rule__ChartSeries__Group__1 : rule__ChartSeries__Group__1__Impl rule__ChartSeries__Group__2 ;
    public final void rule__ChartSeries__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6421:1: ( rule__ChartSeries__Group__1__Impl rule__ChartSeries__Group__2 )
            // InternalJavaFXLang.g:6422:2: rule__ChartSeries__Group__1__Impl rule__ChartSeries__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ChartSeries__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChartSeries__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group__1"


    // $ANTLR start "rule__ChartSeries__Group__1__Impl"
    // InternalJavaFXLang.g:6429:1: rule__ChartSeries__Group__1__Impl : ( 'series' ) ;
    public final void rule__ChartSeries__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6433:1: ( ( 'series' ) )
            // InternalJavaFXLang.g:6434:1: ( 'series' )
            {
            // InternalJavaFXLang.g:6434:1: ( 'series' )
            // InternalJavaFXLang.g:6435:2: 'series'
            {
             before(grammarAccess.getChartSeriesAccess().getSeriesKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getChartSeriesAccess().getSeriesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group__1__Impl"


    // $ANTLR start "rule__ChartSeries__Group__2"
    // InternalJavaFXLang.g:6444:1: rule__ChartSeries__Group__2 : rule__ChartSeries__Group__2__Impl rule__ChartSeries__Group__3 ;
    public final void rule__ChartSeries__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6448:1: ( rule__ChartSeries__Group__2__Impl rule__ChartSeries__Group__3 )
            // InternalJavaFXLang.g:6449:2: rule__ChartSeries__Group__2__Impl rule__ChartSeries__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ChartSeries__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChartSeries__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group__2"


    // $ANTLR start "rule__ChartSeries__Group__2__Impl"
    // InternalJavaFXLang.g:6456:1: rule__ChartSeries__Group__2__Impl : ( '{' ) ;
    public final void rule__ChartSeries__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6460:1: ( ( '{' ) )
            // InternalJavaFXLang.g:6461:1: ( '{' )
            {
            // InternalJavaFXLang.g:6461:1: ( '{' )
            // InternalJavaFXLang.g:6462:2: '{'
            {
             before(grammarAccess.getChartSeriesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChartSeriesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group__2__Impl"


    // $ANTLR start "rule__ChartSeries__Group__3"
    // InternalJavaFXLang.g:6471:1: rule__ChartSeries__Group__3 : rule__ChartSeries__Group__3__Impl rule__ChartSeries__Group__4 ;
    public final void rule__ChartSeries__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6475:1: ( rule__ChartSeries__Group__3__Impl rule__ChartSeries__Group__4 )
            // InternalJavaFXLang.g:6476:2: rule__ChartSeries__Group__3__Impl rule__ChartSeries__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ChartSeries__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChartSeries__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group__3"


    // $ANTLR start "rule__ChartSeries__Group__3__Impl"
    // InternalJavaFXLang.g:6483:1: rule__ChartSeries__Group__3__Impl : ( 'name:' ) ;
    public final void rule__ChartSeries__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6487:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:6488:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:6488:1: ( 'name:' )
            // InternalJavaFXLang.g:6489:2: 'name:'
            {
             before(grammarAccess.getChartSeriesAccess().getNameKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getChartSeriesAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group__3__Impl"


    // $ANTLR start "rule__ChartSeries__Group__4"
    // InternalJavaFXLang.g:6498:1: rule__ChartSeries__Group__4 : rule__ChartSeries__Group__4__Impl rule__ChartSeries__Group__5 ;
    public final void rule__ChartSeries__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6502:1: ( rule__ChartSeries__Group__4__Impl rule__ChartSeries__Group__5 )
            // InternalJavaFXLang.g:6503:2: rule__ChartSeries__Group__4__Impl rule__ChartSeries__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__ChartSeries__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChartSeries__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group__4"


    // $ANTLR start "rule__ChartSeries__Group__4__Impl"
    // InternalJavaFXLang.g:6510:1: rule__ChartSeries__Group__4__Impl : ( ( rule__ChartSeries__NameAssignment_4 ) ) ;
    public final void rule__ChartSeries__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6514:1: ( ( ( rule__ChartSeries__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:6515:1: ( ( rule__ChartSeries__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:6515:1: ( ( rule__ChartSeries__NameAssignment_4 ) )
            // InternalJavaFXLang.g:6516:2: ( rule__ChartSeries__NameAssignment_4 )
            {
             before(grammarAccess.getChartSeriesAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:6517:2: ( rule__ChartSeries__NameAssignment_4 )
            // InternalJavaFXLang.g:6517:3: rule__ChartSeries__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ChartSeries__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChartSeriesAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group__4__Impl"


    // $ANTLR start "rule__ChartSeries__Group__5"
    // InternalJavaFXLang.g:6525:1: rule__ChartSeries__Group__5 : rule__ChartSeries__Group__5__Impl rule__ChartSeries__Group__6 ;
    public final void rule__ChartSeries__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6529:1: ( rule__ChartSeries__Group__5__Impl rule__ChartSeries__Group__6 )
            // InternalJavaFXLang.g:6530:2: rule__ChartSeries__Group__5__Impl rule__ChartSeries__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__ChartSeries__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChartSeries__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group__5"


    // $ANTLR start "rule__ChartSeries__Group__5__Impl"
    // InternalJavaFXLang.g:6537:1: rule__ChartSeries__Group__5__Impl : ( ( rule__ChartSeries__Group_5__0 )? ) ;
    public final void rule__ChartSeries__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6541:1: ( ( ( rule__ChartSeries__Group_5__0 )? ) )
            // InternalJavaFXLang.g:6542:1: ( ( rule__ChartSeries__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:6542:1: ( ( rule__ChartSeries__Group_5__0 )? )
            // InternalJavaFXLang.g:6543:2: ( rule__ChartSeries__Group_5__0 )?
            {
             before(grammarAccess.getChartSeriesAccess().getGroup_5()); 
            // InternalJavaFXLang.g:6544:2: ( rule__ChartSeries__Group_5__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==50) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalJavaFXLang.g:6544:3: rule__ChartSeries__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChartSeries__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChartSeriesAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group__5__Impl"


    // $ANTLR start "rule__ChartSeries__Group__6"
    // InternalJavaFXLang.g:6552:1: rule__ChartSeries__Group__6 : rule__ChartSeries__Group__6__Impl ;
    public final void rule__ChartSeries__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6556:1: ( rule__ChartSeries__Group__6__Impl )
            // InternalJavaFXLang.g:6557:2: rule__ChartSeries__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChartSeries__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group__6"


    // $ANTLR start "rule__ChartSeries__Group__6__Impl"
    // InternalJavaFXLang.g:6563:1: rule__ChartSeries__Group__6__Impl : ( '}' ) ;
    public final void rule__ChartSeries__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6567:1: ( ( '}' ) )
            // InternalJavaFXLang.g:6568:1: ( '}' )
            {
            // InternalJavaFXLang.g:6568:1: ( '}' )
            // InternalJavaFXLang.g:6569:2: '}'
            {
             before(grammarAccess.getChartSeriesAccess().getRightCurlyBracketKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getChartSeriesAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group__6__Impl"


    // $ANTLR start "rule__ChartSeries__Group_5__0"
    // InternalJavaFXLang.g:6579:1: rule__ChartSeries__Group_5__0 : rule__ChartSeries__Group_5__0__Impl rule__ChartSeries__Group_5__1 ;
    public final void rule__ChartSeries__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6583:1: ( rule__ChartSeries__Group_5__0__Impl rule__ChartSeries__Group_5__1 )
            // InternalJavaFXLang.g:6584:2: rule__ChartSeries__Group_5__0__Impl rule__ChartSeries__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__ChartSeries__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChartSeries__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group_5__0"


    // $ANTLR start "rule__ChartSeries__Group_5__0__Impl"
    // InternalJavaFXLang.g:6591:1: rule__ChartSeries__Group_5__0__Impl : ( 'dataList' ) ;
    public final void rule__ChartSeries__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6595:1: ( ( 'dataList' ) )
            // InternalJavaFXLang.g:6596:1: ( 'dataList' )
            {
            // InternalJavaFXLang.g:6596:1: ( 'dataList' )
            // InternalJavaFXLang.g:6597:2: 'dataList'
            {
             before(grammarAccess.getChartSeriesAccess().getDataListKeyword_5_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getChartSeriesAccess().getDataListKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group_5__0__Impl"


    // $ANTLR start "rule__ChartSeries__Group_5__1"
    // InternalJavaFXLang.g:6606:1: rule__ChartSeries__Group_5__1 : rule__ChartSeries__Group_5__1__Impl rule__ChartSeries__Group_5__2 ;
    public final void rule__ChartSeries__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6610:1: ( rule__ChartSeries__Group_5__1__Impl rule__ChartSeries__Group_5__2 )
            // InternalJavaFXLang.g:6611:2: rule__ChartSeries__Group_5__1__Impl rule__ChartSeries__Group_5__2
            {
            pushFollow(FOLLOW_34);
            rule__ChartSeries__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChartSeries__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group_5__1"


    // $ANTLR start "rule__ChartSeries__Group_5__1__Impl"
    // InternalJavaFXLang.g:6618:1: rule__ChartSeries__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ChartSeries__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6622:1: ( ( '{' ) )
            // InternalJavaFXLang.g:6623:1: ( '{' )
            {
            // InternalJavaFXLang.g:6623:1: ( '{' )
            // InternalJavaFXLang.g:6624:2: '{'
            {
             before(grammarAccess.getChartSeriesAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChartSeriesAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group_5__1__Impl"


    // $ANTLR start "rule__ChartSeries__Group_5__2"
    // InternalJavaFXLang.g:6633:1: rule__ChartSeries__Group_5__2 : rule__ChartSeries__Group_5__2__Impl rule__ChartSeries__Group_5__3 ;
    public final void rule__ChartSeries__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6637:1: ( rule__ChartSeries__Group_5__2__Impl rule__ChartSeries__Group_5__3 )
            // InternalJavaFXLang.g:6638:2: rule__ChartSeries__Group_5__2__Impl rule__ChartSeries__Group_5__3
            {
            pushFollow(FOLLOW_35);
            rule__ChartSeries__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChartSeries__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group_5__2"


    // $ANTLR start "rule__ChartSeries__Group_5__2__Impl"
    // InternalJavaFXLang.g:6645:1: rule__ChartSeries__Group_5__2__Impl : ( ( rule__ChartSeries__Group_5_2__0 ) ) ;
    public final void rule__ChartSeries__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6649:1: ( ( ( rule__ChartSeries__Group_5_2__0 ) ) )
            // InternalJavaFXLang.g:6650:1: ( ( rule__ChartSeries__Group_5_2__0 ) )
            {
            // InternalJavaFXLang.g:6650:1: ( ( rule__ChartSeries__Group_5_2__0 ) )
            // InternalJavaFXLang.g:6651:2: ( rule__ChartSeries__Group_5_2__0 )
            {
             before(grammarAccess.getChartSeriesAccess().getGroup_5_2()); 
            // InternalJavaFXLang.g:6652:2: ( rule__ChartSeries__Group_5_2__0 )
            // InternalJavaFXLang.g:6652:3: rule__ChartSeries__Group_5_2__0
            {
            pushFollow(FOLLOW_2);
            rule__ChartSeries__Group_5_2__0();

            state._fsp--;


            }

             after(grammarAccess.getChartSeriesAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group_5__2__Impl"


    // $ANTLR start "rule__ChartSeries__Group_5__3"
    // InternalJavaFXLang.g:6660:1: rule__ChartSeries__Group_5__3 : rule__ChartSeries__Group_5__3__Impl ;
    public final void rule__ChartSeries__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6664:1: ( rule__ChartSeries__Group_5__3__Impl )
            // InternalJavaFXLang.g:6665:2: rule__ChartSeries__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChartSeries__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group_5__3"


    // $ANTLR start "rule__ChartSeries__Group_5__3__Impl"
    // InternalJavaFXLang.g:6671:1: rule__ChartSeries__Group_5__3__Impl : ( '}' ) ;
    public final void rule__ChartSeries__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6675:1: ( ( '}' ) )
            // InternalJavaFXLang.g:6676:1: ( '}' )
            {
            // InternalJavaFXLang.g:6676:1: ( '}' )
            // InternalJavaFXLang.g:6677:2: '}'
            {
             before(grammarAccess.getChartSeriesAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getChartSeriesAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group_5__3__Impl"


    // $ANTLR start "rule__ChartSeries__Group_5_2__0"
    // InternalJavaFXLang.g:6687:1: rule__ChartSeries__Group_5_2__0 : rule__ChartSeries__Group_5_2__0__Impl rule__ChartSeries__Group_5_2__1 ;
    public final void rule__ChartSeries__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6691:1: ( rule__ChartSeries__Group_5_2__0__Impl rule__ChartSeries__Group_5_2__1 )
            // InternalJavaFXLang.g:6692:2: rule__ChartSeries__Group_5_2__0__Impl rule__ChartSeries__Group_5_2__1
            {
            pushFollow(FOLLOW_34);
            rule__ChartSeries__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChartSeries__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group_5_2__0"


    // $ANTLR start "rule__ChartSeries__Group_5_2__0__Impl"
    // InternalJavaFXLang.g:6699:1: rule__ChartSeries__Group_5_2__0__Impl : ( ( rule__ChartSeries__DataListAssignment_5_2_0 ) ) ;
    public final void rule__ChartSeries__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6703:1: ( ( ( rule__ChartSeries__DataListAssignment_5_2_0 ) ) )
            // InternalJavaFXLang.g:6704:1: ( ( rule__ChartSeries__DataListAssignment_5_2_0 ) )
            {
            // InternalJavaFXLang.g:6704:1: ( ( rule__ChartSeries__DataListAssignment_5_2_0 ) )
            // InternalJavaFXLang.g:6705:2: ( rule__ChartSeries__DataListAssignment_5_2_0 )
            {
             before(grammarAccess.getChartSeriesAccess().getDataListAssignment_5_2_0()); 
            // InternalJavaFXLang.g:6706:2: ( rule__ChartSeries__DataListAssignment_5_2_0 )
            // InternalJavaFXLang.g:6706:3: rule__ChartSeries__DataListAssignment_5_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ChartSeries__DataListAssignment_5_2_0();

            state._fsp--;


            }

             after(grammarAccess.getChartSeriesAccess().getDataListAssignment_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group_5_2__0__Impl"


    // $ANTLR start "rule__ChartSeries__Group_5_2__1"
    // InternalJavaFXLang.g:6714:1: rule__ChartSeries__Group_5_2__1 : rule__ChartSeries__Group_5_2__1__Impl ;
    public final void rule__ChartSeries__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6718:1: ( rule__ChartSeries__Group_5_2__1__Impl )
            // InternalJavaFXLang.g:6719:2: rule__ChartSeries__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChartSeries__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group_5_2__1"


    // $ANTLR start "rule__ChartSeries__Group_5_2__1__Impl"
    // InternalJavaFXLang.g:6725:1: rule__ChartSeries__Group_5_2__1__Impl : ( ( rule__ChartSeries__DataListAssignment_5_2_1 )* ) ;
    public final void rule__ChartSeries__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6729:1: ( ( ( rule__ChartSeries__DataListAssignment_5_2_1 )* ) )
            // InternalJavaFXLang.g:6730:1: ( ( rule__ChartSeries__DataListAssignment_5_2_1 )* )
            {
            // InternalJavaFXLang.g:6730:1: ( ( rule__ChartSeries__DataListAssignment_5_2_1 )* )
            // InternalJavaFXLang.g:6731:2: ( rule__ChartSeries__DataListAssignment_5_2_1 )*
            {
             before(grammarAccess.getChartSeriesAccess().getDataListAssignment_5_2_1()); 
            // InternalJavaFXLang.g:6732:2: ( rule__ChartSeries__DataListAssignment_5_2_1 )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==51) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalJavaFXLang.g:6732:3: rule__ChartSeries__DataListAssignment_5_2_1
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__ChartSeries__DataListAssignment_5_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

             after(grammarAccess.getChartSeriesAccess().getDataListAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__Group_5_2__1__Impl"


    // $ANTLR start "rule__ChartFXData__Group__0"
    // InternalJavaFXLang.g:6741:1: rule__ChartFXData__Group__0 : rule__ChartFXData__Group__0__Impl rule__ChartFXData__Group__1 ;
    public final void rule__ChartFXData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6745:1: ( rule__ChartFXData__Group__0__Impl rule__ChartFXData__Group__1 )
            // InternalJavaFXLang.g:6746:2: rule__ChartFXData__Group__0__Impl rule__ChartFXData__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__ChartFXData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChartFXData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartFXData__Group__0"


    // $ANTLR start "rule__ChartFXData__Group__0__Impl"
    // InternalJavaFXLang.g:6753:1: rule__ChartFXData__Group__0__Impl : ( () ) ;
    public final void rule__ChartFXData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6757:1: ( ( () ) )
            // InternalJavaFXLang.g:6758:1: ( () )
            {
            // InternalJavaFXLang.g:6758:1: ( () )
            // InternalJavaFXLang.g:6759:2: ()
            {
             before(grammarAccess.getChartFXDataAccess().getChartFXDataAction_0()); 
            // InternalJavaFXLang.g:6760:2: ()
            // InternalJavaFXLang.g:6760:3: 
            {
            }

             after(grammarAccess.getChartFXDataAccess().getChartFXDataAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartFXData__Group__0__Impl"


    // $ANTLR start "rule__ChartFXData__Group__1"
    // InternalJavaFXLang.g:6768:1: rule__ChartFXData__Group__1 : rule__ChartFXData__Group__1__Impl rule__ChartFXData__Group__2 ;
    public final void rule__ChartFXData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6772:1: ( rule__ChartFXData__Group__1__Impl rule__ChartFXData__Group__2 )
            // InternalJavaFXLang.g:6773:2: rule__ChartFXData__Group__1__Impl rule__ChartFXData__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__ChartFXData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChartFXData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartFXData__Group__1"


    // $ANTLR start "rule__ChartFXData__Group__1__Impl"
    // InternalJavaFXLang.g:6780:1: rule__ChartFXData__Group__1__Impl : ( 'data' ) ;
    public final void rule__ChartFXData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6784:1: ( ( 'data' ) )
            // InternalJavaFXLang.g:6785:1: ( 'data' )
            {
            // InternalJavaFXLang.g:6785:1: ( 'data' )
            // InternalJavaFXLang.g:6786:2: 'data'
            {
             before(grammarAccess.getChartFXDataAccess().getDataKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getChartFXDataAccess().getDataKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartFXData__Group__1__Impl"


    // $ANTLR start "rule__ChartFXData__Group__2"
    // InternalJavaFXLang.g:6795:1: rule__ChartFXData__Group__2 : rule__ChartFXData__Group__2__Impl rule__ChartFXData__Group__3 ;
    public final void rule__ChartFXData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6799:1: ( rule__ChartFXData__Group__2__Impl rule__ChartFXData__Group__3 )
            // InternalJavaFXLang.g:6800:2: rule__ChartFXData__Group__2__Impl rule__ChartFXData__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ChartFXData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChartFXData__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartFXData__Group__2"


    // $ANTLR start "rule__ChartFXData__Group__2__Impl"
    // InternalJavaFXLang.g:6807:1: rule__ChartFXData__Group__2__Impl : ( '(' ) ;
    public final void rule__ChartFXData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6811:1: ( ( '(' ) )
            // InternalJavaFXLang.g:6812:1: ( '(' )
            {
            // InternalJavaFXLang.g:6812:1: ( '(' )
            // InternalJavaFXLang.g:6813:2: '('
            {
             before(grammarAccess.getChartFXDataAccess().getLeftParenthesisKeyword_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getChartFXDataAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartFXData__Group__2__Impl"


    // $ANTLR start "rule__ChartFXData__Group__3"
    // InternalJavaFXLang.g:6822:1: rule__ChartFXData__Group__3 : rule__ChartFXData__Group__3__Impl rule__ChartFXData__Group__4 ;
    public final void rule__ChartFXData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6826:1: ( rule__ChartFXData__Group__3__Impl rule__ChartFXData__Group__4 )
            // InternalJavaFXLang.g:6827:2: rule__ChartFXData__Group__3__Impl rule__ChartFXData__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__ChartFXData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChartFXData__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartFXData__Group__3"


    // $ANTLR start "rule__ChartFXData__Group__3__Impl"
    // InternalJavaFXLang.g:6834:1: rule__ChartFXData__Group__3__Impl : ( ( rule__ChartFXData__XValueAssignment_3 ) ) ;
    public final void rule__ChartFXData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6838:1: ( ( ( rule__ChartFXData__XValueAssignment_3 ) ) )
            // InternalJavaFXLang.g:6839:1: ( ( rule__ChartFXData__XValueAssignment_3 ) )
            {
            // InternalJavaFXLang.g:6839:1: ( ( rule__ChartFXData__XValueAssignment_3 ) )
            // InternalJavaFXLang.g:6840:2: ( rule__ChartFXData__XValueAssignment_3 )
            {
             before(grammarAccess.getChartFXDataAccess().getXValueAssignment_3()); 
            // InternalJavaFXLang.g:6841:2: ( rule__ChartFXData__XValueAssignment_3 )
            // InternalJavaFXLang.g:6841:3: rule__ChartFXData__XValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ChartFXData__XValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChartFXDataAccess().getXValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartFXData__Group__3__Impl"


    // $ANTLR start "rule__ChartFXData__Group__4"
    // InternalJavaFXLang.g:6849:1: rule__ChartFXData__Group__4 : rule__ChartFXData__Group__4__Impl rule__ChartFXData__Group__5 ;
    public final void rule__ChartFXData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6853:1: ( rule__ChartFXData__Group__4__Impl rule__ChartFXData__Group__5 )
            // InternalJavaFXLang.g:6854:2: rule__ChartFXData__Group__4__Impl rule__ChartFXData__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__ChartFXData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChartFXData__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartFXData__Group__4"


    // $ANTLR start "rule__ChartFXData__Group__4__Impl"
    // InternalJavaFXLang.g:6861:1: rule__ChartFXData__Group__4__Impl : ( ',' ) ;
    public final void rule__ChartFXData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6865:1: ( ( ',' ) )
            // InternalJavaFXLang.g:6866:1: ( ',' )
            {
            // InternalJavaFXLang.g:6866:1: ( ',' )
            // InternalJavaFXLang.g:6867:2: ','
            {
             before(grammarAccess.getChartFXDataAccess().getCommaKeyword_4()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getChartFXDataAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartFXData__Group__4__Impl"


    // $ANTLR start "rule__ChartFXData__Group__5"
    // InternalJavaFXLang.g:6876:1: rule__ChartFXData__Group__5 : rule__ChartFXData__Group__5__Impl rule__ChartFXData__Group__6 ;
    public final void rule__ChartFXData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6880:1: ( rule__ChartFXData__Group__5__Impl rule__ChartFXData__Group__6 )
            // InternalJavaFXLang.g:6881:2: rule__ChartFXData__Group__5__Impl rule__ChartFXData__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__ChartFXData__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChartFXData__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartFXData__Group__5"


    // $ANTLR start "rule__ChartFXData__Group__5__Impl"
    // InternalJavaFXLang.g:6888:1: rule__ChartFXData__Group__5__Impl : ( ( rule__ChartFXData__YValueAssignment_5 ) ) ;
    public final void rule__ChartFXData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6892:1: ( ( ( rule__ChartFXData__YValueAssignment_5 ) ) )
            // InternalJavaFXLang.g:6893:1: ( ( rule__ChartFXData__YValueAssignment_5 ) )
            {
            // InternalJavaFXLang.g:6893:1: ( ( rule__ChartFXData__YValueAssignment_5 ) )
            // InternalJavaFXLang.g:6894:2: ( rule__ChartFXData__YValueAssignment_5 )
            {
             before(grammarAccess.getChartFXDataAccess().getYValueAssignment_5()); 
            // InternalJavaFXLang.g:6895:2: ( rule__ChartFXData__YValueAssignment_5 )
            // InternalJavaFXLang.g:6895:3: rule__ChartFXData__YValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ChartFXData__YValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getChartFXDataAccess().getYValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartFXData__Group__5__Impl"


    // $ANTLR start "rule__ChartFXData__Group__6"
    // InternalJavaFXLang.g:6903:1: rule__ChartFXData__Group__6 : rule__ChartFXData__Group__6__Impl ;
    public final void rule__ChartFXData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6907:1: ( rule__ChartFXData__Group__6__Impl )
            // InternalJavaFXLang.g:6908:2: rule__ChartFXData__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChartFXData__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartFXData__Group__6"


    // $ANTLR start "rule__ChartFXData__Group__6__Impl"
    // InternalJavaFXLang.g:6914:1: rule__ChartFXData__Group__6__Impl : ( ')' ) ;
    public final void rule__ChartFXData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6918:1: ( ( ')' ) )
            // InternalJavaFXLang.g:6919:1: ( ')' )
            {
            // InternalJavaFXLang.g:6919:1: ( ')' )
            // InternalJavaFXLang.g:6920:2: ')'
            {
             before(grammarAccess.getChartFXDataAccess().getRightParenthesisKeyword_6()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getChartFXDataAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartFXData__Group__6__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalJavaFXLang.g:6930:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6934:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalJavaFXLang.g:6935:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
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
    // InternalJavaFXLang.g:6942:1: rule__Binding__Group__0__Impl : ( () ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6946:1: ( ( () ) )
            // InternalJavaFXLang.g:6947:1: ( () )
            {
            // InternalJavaFXLang.g:6947:1: ( () )
            // InternalJavaFXLang.g:6948:2: ()
            {
             before(grammarAccess.getBindingAccess().getBindingAction_0()); 
            // InternalJavaFXLang.g:6949:2: ()
            // InternalJavaFXLang.g:6949:3: 
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
    // InternalJavaFXLang.g:6957:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6961:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalJavaFXLang.g:6962:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
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
    // InternalJavaFXLang.g:6969:1: rule__Binding__Group__1__Impl : ( 'binding' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6973:1: ( ( 'binding' ) )
            // InternalJavaFXLang.g:6974:1: ( 'binding' )
            {
            // InternalJavaFXLang.g:6974:1: ( 'binding' )
            // InternalJavaFXLang.g:6975:2: 'binding'
            {
             before(grammarAccess.getBindingAccess().getBindingKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalJavaFXLang.g:6984:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6988:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalJavaFXLang.g:6989:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
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
    // InternalJavaFXLang.g:6996:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__NameAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7000:1: ( ( ( rule__Binding__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:7001:1: ( ( rule__Binding__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:7001:1: ( ( rule__Binding__NameAssignment_2 ) )
            // InternalJavaFXLang.g:7002:2: ( rule__Binding__NameAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:7003:2: ( rule__Binding__NameAssignment_2 )
            // InternalJavaFXLang.g:7003:3: rule__Binding__NameAssignment_2
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
    // InternalJavaFXLang.g:7011:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7015:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalJavaFXLang.g:7016:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalJavaFXLang.g:7023:1: rule__Binding__Group__3__Impl : ( '{' ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7027:1: ( ( '{' ) )
            // InternalJavaFXLang.g:7028:1: ( '{' )
            {
            // InternalJavaFXLang.g:7028:1: ( '{' )
            // InternalJavaFXLang.g:7029:2: '{'
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
    // InternalJavaFXLang.g:7038:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl rule__Binding__Group__5 ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7042:1: ( rule__Binding__Group__4__Impl rule__Binding__Group__5 )
            // InternalJavaFXLang.g:7043:2: rule__Binding__Group__4__Impl rule__Binding__Group__5
            {
            pushFollow(FOLLOW_40);
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
    // InternalJavaFXLang.g:7050:1: rule__Binding__Group__4__Impl : ( ( rule__Binding__Group_4__0 )? ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7054:1: ( ( ( rule__Binding__Group_4__0 )? ) )
            // InternalJavaFXLang.g:7055:1: ( ( rule__Binding__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:7055:1: ( ( rule__Binding__Group_4__0 )? )
            // InternalJavaFXLang.g:7056:2: ( rule__Binding__Group_4__0 )?
            {
             before(grammarAccess.getBindingAccess().getGroup_4()); 
            // InternalJavaFXLang.g:7057:2: ( rule__Binding__Group_4__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=19 && LA66_0<=25)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalJavaFXLang.g:7057:3: rule__Binding__Group_4__0
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
    // InternalJavaFXLang.g:7065:1: rule__Binding__Group__5 : rule__Binding__Group__5__Impl ;
    public final void rule__Binding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7069:1: ( rule__Binding__Group__5__Impl )
            // InternalJavaFXLang.g:7070:2: rule__Binding__Group__5__Impl
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
    // InternalJavaFXLang.g:7076:1: rule__Binding__Group__5__Impl : ( '}' ) ;
    public final void rule__Binding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7080:1: ( ( '}' ) )
            // InternalJavaFXLang.g:7081:1: ( '}' )
            {
            // InternalJavaFXLang.g:7081:1: ( '}' )
            // InternalJavaFXLang.g:7082:2: '}'
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
    // InternalJavaFXLang.g:7092:1: rule__Binding__Group_4__0 : rule__Binding__Group_4__0__Impl rule__Binding__Group_4__1 ;
    public final void rule__Binding__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7096:1: ( rule__Binding__Group_4__0__Impl rule__Binding__Group_4__1 )
            // InternalJavaFXLang.g:7097:2: rule__Binding__Group_4__0__Impl rule__Binding__Group_4__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalJavaFXLang.g:7104:1: rule__Binding__Group_4__0__Impl : ( ( rule__Binding__PropertyAssignment_4_0 ) ) ;
    public final void rule__Binding__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7108:1: ( ( ( rule__Binding__PropertyAssignment_4_0 ) ) )
            // InternalJavaFXLang.g:7109:1: ( ( rule__Binding__PropertyAssignment_4_0 ) )
            {
            // InternalJavaFXLang.g:7109:1: ( ( rule__Binding__PropertyAssignment_4_0 ) )
            // InternalJavaFXLang.g:7110:2: ( rule__Binding__PropertyAssignment_4_0 )
            {
             before(grammarAccess.getBindingAccess().getPropertyAssignment_4_0()); 
            // InternalJavaFXLang.g:7111:2: ( rule__Binding__PropertyAssignment_4_0 )
            // InternalJavaFXLang.g:7111:3: rule__Binding__PropertyAssignment_4_0
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
    // InternalJavaFXLang.g:7119:1: rule__Binding__Group_4__1 : rule__Binding__Group_4__1__Impl ;
    public final void rule__Binding__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7123:1: ( rule__Binding__Group_4__1__Impl )
            // InternalJavaFXLang.g:7124:2: rule__Binding__Group_4__1__Impl
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
    // InternalJavaFXLang.g:7130:1: rule__Binding__Group_4__1__Impl : ( ( rule__Binding__PropertyAssignment_4_1 )* ) ;
    public final void rule__Binding__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7134:1: ( ( ( rule__Binding__PropertyAssignment_4_1 )* ) )
            // InternalJavaFXLang.g:7135:1: ( ( rule__Binding__PropertyAssignment_4_1 )* )
            {
            // InternalJavaFXLang.g:7135:1: ( ( rule__Binding__PropertyAssignment_4_1 )* )
            // InternalJavaFXLang.g:7136:2: ( rule__Binding__PropertyAssignment_4_1 )*
            {
             before(grammarAccess.getBindingAccess().getPropertyAssignment_4_1()); 
            // InternalJavaFXLang.g:7137:2: ( rule__Binding__PropertyAssignment_4_1 )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=19 && LA67_0<=25)) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalJavaFXLang.g:7137:3: rule__Binding__PropertyAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_42);
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
    // InternalJavaFXLang.g:7146:1: rule__BindingProperty__Group__0 : rule__BindingProperty__Group__0__Impl rule__BindingProperty__Group__1 ;
    public final void rule__BindingProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7150:1: ( rule__BindingProperty__Group__0__Impl rule__BindingProperty__Group__1 )
            // InternalJavaFXLang.g:7151:2: rule__BindingProperty__Group__0__Impl rule__BindingProperty__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalJavaFXLang.g:7158:1: rule__BindingProperty__Group__0__Impl : ( () ) ;
    public final void rule__BindingProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7162:1: ( ( () ) )
            // InternalJavaFXLang.g:7163:1: ( () )
            {
            // InternalJavaFXLang.g:7163:1: ( () )
            // InternalJavaFXLang.g:7164:2: ()
            {
             before(grammarAccess.getBindingPropertyAccess().getBindingPropertyAction_0()); 
            // InternalJavaFXLang.g:7165:2: ()
            // InternalJavaFXLang.g:7165:3: 
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
    // InternalJavaFXLang.g:7173:1: rule__BindingProperty__Group__1 : rule__BindingProperty__Group__1__Impl rule__BindingProperty__Group__2 ;
    public final void rule__BindingProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7177:1: ( rule__BindingProperty__Group__1__Impl rule__BindingProperty__Group__2 )
            // InternalJavaFXLang.g:7178:2: rule__BindingProperty__Group__1__Impl rule__BindingProperty__Group__2
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
    // InternalJavaFXLang.g:7185:1: rule__BindingProperty__Group__1__Impl : ( ( rule__BindingProperty__TypeAssignment_1 ) ) ;
    public final void rule__BindingProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7189:1: ( ( ( rule__BindingProperty__TypeAssignment_1 ) ) )
            // InternalJavaFXLang.g:7190:1: ( ( rule__BindingProperty__TypeAssignment_1 ) )
            {
            // InternalJavaFXLang.g:7190:1: ( ( rule__BindingProperty__TypeAssignment_1 ) )
            // InternalJavaFXLang.g:7191:2: ( rule__BindingProperty__TypeAssignment_1 )
            {
             before(grammarAccess.getBindingPropertyAccess().getTypeAssignment_1()); 
            // InternalJavaFXLang.g:7192:2: ( rule__BindingProperty__TypeAssignment_1 )
            // InternalJavaFXLang.g:7192:3: rule__BindingProperty__TypeAssignment_1
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
    // InternalJavaFXLang.g:7200:1: rule__BindingProperty__Group__2 : rule__BindingProperty__Group__2__Impl ;
    public final void rule__BindingProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7204:1: ( rule__BindingProperty__Group__2__Impl )
            // InternalJavaFXLang.g:7205:2: rule__BindingProperty__Group__2__Impl
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
    // InternalJavaFXLang.g:7211:1: rule__BindingProperty__Group__2__Impl : ( ( rule__BindingProperty__NameAssignment_2 ) ) ;
    public final void rule__BindingProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7215:1: ( ( ( rule__BindingProperty__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:7216:1: ( ( rule__BindingProperty__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:7216:1: ( ( rule__BindingProperty__NameAssignment_2 ) )
            // InternalJavaFXLang.g:7217:2: ( rule__BindingProperty__NameAssignment_2 )
            {
             before(grammarAccess.getBindingPropertyAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:7218:2: ( rule__BindingProperty__NameAssignment_2 )
            // InternalJavaFXLang.g:7218:3: rule__BindingProperty__NameAssignment_2
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
    // InternalJavaFXLang.g:7227:1: rule__FilteredTableViewFX__Group__0 : rule__FilteredTableViewFX__Group__0__Impl rule__FilteredTableViewFX__Group__1 ;
    public final void rule__FilteredTableViewFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7231:1: ( rule__FilteredTableViewFX__Group__0__Impl rule__FilteredTableViewFX__Group__1 )
            // InternalJavaFXLang.g:7232:2: rule__FilteredTableViewFX__Group__0__Impl rule__FilteredTableViewFX__Group__1
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
    // InternalJavaFXLang.g:7239:1: rule__FilteredTableViewFX__Group__0__Impl : ( () ) ;
    public final void rule__FilteredTableViewFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7243:1: ( ( () ) )
            // InternalJavaFXLang.g:7244:1: ( () )
            {
            // InternalJavaFXLang.g:7244:1: ( () )
            // InternalJavaFXLang.g:7245:2: ()
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getFilteredTableViewFXAction_0()); 
            // InternalJavaFXLang.g:7246:2: ()
            // InternalJavaFXLang.g:7246:3: 
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
    // InternalJavaFXLang.g:7254:1: rule__FilteredTableViewFX__Group__1 : rule__FilteredTableViewFX__Group__1__Impl rule__FilteredTableViewFX__Group__2 ;
    public final void rule__FilteredTableViewFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7258:1: ( rule__FilteredTableViewFX__Group__1__Impl rule__FilteredTableViewFX__Group__2 )
            // InternalJavaFXLang.g:7259:2: rule__FilteredTableViewFX__Group__1__Impl rule__FilteredTableViewFX__Group__2
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
    // InternalJavaFXLang.g:7266:1: rule__FilteredTableViewFX__Group__1__Impl : ( 'FilteredTableView' ) ;
    public final void rule__FilteredTableViewFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7270:1: ( ( 'FilteredTableView' ) )
            // InternalJavaFXLang.g:7271:1: ( 'FilteredTableView' )
            {
            // InternalJavaFXLang.g:7271:1: ( 'FilteredTableView' )
            // InternalJavaFXLang.g:7272:2: 'FilteredTableView'
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getFilteredTableViewKeyword_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalJavaFXLang.g:7281:1: rule__FilteredTableViewFX__Group__2 : rule__FilteredTableViewFX__Group__2__Impl rule__FilteredTableViewFX__Group__3 ;
    public final void rule__FilteredTableViewFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7285:1: ( rule__FilteredTableViewFX__Group__2__Impl rule__FilteredTableViewFX__Group__3 )
            // InternalJavaFXLang.g:7286:2: rule__FilteredTableViewFX__Group__2__Impl rule__FilteredTableViewFX__Group__3
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
    // InternalJavaFXLang.g:7293:1: rule__FilteredTableViewFX__Group__2__Impl : ( '{' ) ;
    public final void rule__FilteredTableViewFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7297:1: ( ( '{' ) )
            // InternalJavaFXLang.g:7298:1: ( '{' )
            {
            // InternalJavaFXLang.g:7298:1: ( '{' )
            // InternalJavaFXLang.g:7299:2: '{'
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
    // InternalJavaFXLang.g:7308:1: rule__FilteredTableViewFX__Group__3 : rule__FilteredTableViewFX__Group__3__Impl rule__FilteredTableViewFX__Group__4 ;
    public final void rule__FilteredTableViewFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7312:1: ( rule__FilteredTableViewFX__Group__3__Impl rule__FilteredTableViewFX__Group__4 )
            // InternalJavaFXLang.g:7313:2: rule__FilteredTableViewFX__Group__3__Impl rule__FilteredTableViewFX__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalJavaFXLang.g:7320:1: rule__FilteredTableViewFX__Group__3__Impl : ( ( rule__FilteredTableViewFX__Group_3__0 ) ) ;
    public final void rule__FilteredTableViewFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7324:1: ( ( ( rule__FilteredTableViewFX__Group_3__0 ) ) )
            // InternalJavaFXLang.g:7325:1: ( ( rule__FilteredTableViewFX__Group_3__0 ) )
            {
            // InternalJavaFXLang.g:7325:1: ( ( rule__FilteredTableViewFX__Group_3__0 ) )
            // InternalJavaFXLang.g:7326:2: ( rule__FilteredTableViewFX__Group_3__0 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup_3()); 
            // InternalJavaFXLang.g:7327:2: ( rule__FilteredTableViewFX__Group_3__0 )
            // InternalJavaFXLang.g:7327:3: rule__FilteredTableViewFX__Group_3__0
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
    // InternalJavaFXLang.g:7335:1: rule__FilteredTableViewFX__Group__4 : rule__FilteredTableViewFX__Group__4__Impl rule__FilteredTableViewFX__Group__5 ;
    public final void rule__FilteredTableViewFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7339:1: ( rule__FilteredTableViewFX__Group__4__Impl rule__FilteredTableViewFX__Group__5 )
            // InternalJavaFXLang.g:7340:2: rule__FilteredTableViewFX__Group__4__Impl rule__FilteredTableViewFX__Group__5
            {
            pushFollow(FOLLOW_43);
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
    // InternalJavaFXLang.g:7347:1: rule__FilteredTableViewFX__Group__4__Impl : ( ( rule__FilteredTableViewFX__Group_4__0 )? ) ;
    public final void rule__FilteredTableViewFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7351:1: ( ( ( rule__FilteredTableViewFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:7352:1: ( ( rule__FilteredTableViewFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:7352:1: ( ( rule__FilteredTableViewFX__Group_4__0 )? )
            // InternalJavaFXLang.g:7353:2: ( rule__FilteredTableViewFX__Group_4__0 )?
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:7354:2: ( rule__FilteredTableViewFX__Group_4__0 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==57) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalJavaFXLang.g:7354:3: rule__FilteredTableViewFX__Group_4__0
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
    // InternalJavaFXLang.g:7362:1: rule__FilteredTableViewFX__Group__5 : rule__FilteredTableViewFX__Group__5__Impl rule__FilteredTableViewFX__Group__6 ;
    public final void rule__FilteredTableViewFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7366:1: ( rule__FilteredTableViewFX__Group__5__Impl rule__FilteredTableViewFX__Group__6 )
            // InternalJavaFXLang.g:7367:2: rule__FilteredTableViewFX__Group__5__Impl rule__FilteredTableViewFX__Group__6
            {
            pushFollow(FOLLOW_43);
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
    // InternalJavaFXLang.g:7374:1: rule__FilteredTableViewFX__Group__5__Impl : ( ( rule__FilteredTableViewFX__Group_5__0 )? ) ;
    public final void rule__FilteredTableViewFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7378:1: ( ( ( rule__FilteredTableViewFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:7379:1: ( ( rule__FilteredTableViewFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:7379:1: ( ( rule__FilteredTableViewFX__Group_5__0 )? )
            // InternalJavaFXLang.g:7380:2: ( rule__FilteredTableViewFX__Group_5__0 )?
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:7381:2: ( rule__FilteredTableViewFX__Group_5__0 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==58) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalJavaFXLang.g:7381:3: rule__FilteredTableViewFX__Group_5__0
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
    // InternalJavaFXLang.g:7389:1: rule__FilteredTableViewFX__Group__6 : rule__FilteredTableViewFX__Group__6__Impl rule__FilteredTableViewFX__Group__7 ;
    public final void rule__FilteredTableViewFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7393:1: ( rule__FilteredTableViewFX__Group__6__Impl rule__FilteredTableViewFX__Group__7 )
            // InternalJavaFXLang.g:7394:2: rule__FilteredTableViewFX__Group__6__Impl rule__FilteredTableViewFX__Group__7
            {
            pushFollow(FOLLOW_43);
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
    // InternalJavaFXLang.g:7401:1: rule__FilteredTableViewFX__Group__6__Impl : ( ( rule__FilteredTableViewFX__Group_6__0 )? ) ;
    public final void rule__FilteredTableViewFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7405:1: ( ( ( rule__FilteredTableViewFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:7406:1: ( ( rule__FilteredTableViewFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:7406:1: ( ( rule__FilteredTableViewFX__Group_6__0 )? )
            // InternalJavaFXLang.g:7407:2: ( rule__FilteredTableViewFX__Group_6__0 )?
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:7408:2: ( rule__FilteredTableViewFX__Group_6__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==62) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalJavaFXLang.g:7408:3: rule__FilteredTableViewFX__Group_6__0
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
    // InternalJavaFXLang.g:7416:1: rule__FilteredTableViewFX__Group__7 : rule__FilteredTableViewFX__Group__7__Impl ;
    public final void rule__FilteredTableViewFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7420:1: ( rule__FilteredTableViewFX__Group__7__Impl )
            // InternalJavaFXLang.g:7421:2: rule__FilteredTableViewFX__Group__7__Impl
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
    // InternalJavaFXLang.g:7427:1: rule__FilteredTableViewFX__Group__7__Impl : ( '}' ) ;
    public final void rule__FilteredTableViewFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7431:1: ( ( '}' ) )
            // InternalJavaFXLang.g:7432:1: ( '}' )
            {
            // InternalJavaFXLang.g:7432:1: ( '}' )
            // InternalJavaFXLang.g:7433:2: '}'
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
    // InternalJavaFXLang.g:7443:1: rule__FilteredTableViewFX__Group_3__0 : rule__FilteredTableViewFX__Group_3__0__Impl rule__FilteredTableViewFX__Group_3__1 ;
    public final void rule__FilteredTableViewFX__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7447:1: ( rule__FilteredTableViewFX__Group_3__0__Impl rule__FilteredTableViewFX__Group_3__1 )
            // InternalJavaFXLang.g:7448:2: rule__FilteredTableViewFX__Group_3__0__Impl rule__FilteredTableViewFX__Group_3__1
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
    // InternalJavaFXLang.g:7455:1: rule__FilteredTableViewFX__Group_3__0__Impl : ( 'name:' ) ;
    public final void rule__FilteredTableViewFX__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7459:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:7460:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:7460:1: ( 'name:' )
            // InternalJavaFXLang.g:7461:2: 'name:'
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
    // InternalJavaFXLang.g:7470:1: rule__FilteredTableViewFX__Group_3__1 : rule__FilteredTableViewFX__Group_3__1__Impl ;
    public final void rule__FilteredTableViewFX__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7474:1: ( rule__FilteredTableViewFX__Group_3__1__Impl )
            // InternalJavaFXLang.g:7475:2: rule__FilteredTableViewFX__Group_3__1__Impl
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
    // InternalJavaFXLang.g:7481:1: rule__FilteredTableViewFX__Group_3__1__Impl : ( ( rule__FilteredTableViewFX__NameAssignment_3_1 ) ) ;
    public final void rule__FilteredTableViewFX__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7485:1: ( ( ( rule__FilteredTableViewFX__NameAssignment_3_1 ) ) )
            // InternalJavaFXLang.g:7486:1: ( ( rule__FilteredTableViewFX__NameAssignment_3_1 ) )
            {
            // InternalJavaFXLang.g:7486:1: ( ( rule__FilteredTableViewFX__NameAssignment_3_1 ) )
            // InternalJavaFXLang.g:7487:2: ( rule__FilteredTableViewFX__NameAssignment_3_1 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getNameAssignment_3_1()); 
            // InternalJavaFXLang.g:7488:2: ( rule__FilteredTableViewFX__NameAssignment_3_1 )
            // InternalJavaFXLang.g:7488:3: rule__FilteredTableViewFX__NameAssignment_3_1
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
    // InternalJavaFXLang.g:7497:1: rule__FilteredTableViewFX__Group_4__0 : rule__FilteredTableViewFX__Group_4__0__Impl rule__FilteredTableViewFX__Group_4__1 ;
    public final void rule__FilteredTableViewFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7501:1: ( rule__FilteredTableViewFX__Group_4__0__Impl rule__FilteredTableViewFX__Group_4__1 )
            // InternalJavaFXLang.g:7502:2: rule__FilteredTableViewFX__Group_4__0__Impl rule__FilteredTableViewFX__Group_4__1
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
    // InternalJavaFXLang.g:7509:1: rule__FilteredTableViewFX__Group_4__0__Impl : ( 'usedModel:' ) ;
    public final void rule__FilteredTableViewFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7513:1: ( ( 'usedModel:' ) )
            // InternalJavaFXLang.g:7514:1: ( 'usedModel:' )
            {
            // InternalJavaFXLang.g:7514:1: ( 'usedModel:' )
            // InternalJavaFXLang.g:7515:2: 'usedModel:'
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUsedModelKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalJavaFXLang.g:7524:1: rule__FilteredTableViewFX__Group_4__1 : rule__FilteredTableViewFX__Group_4__1__Impl ;
    public final void rule__FilteredTableViewFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7528:1: ( rule__FilteredTableViewFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:7529:2: rule__FilteredTableViewFX__Group_4__1__Impl
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
    // InternalJavaFXLang.g:7535:1: rule__FilteredTableViewFX__Group_4__1__Impl : ( ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 ) ) ;
    public final void rule__FilteredTableViewFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7539:1: ( ( ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:7540:1: ( ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:7540:1: ( ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 ) )
            // InternalJavaFXLang.g:7541:2: ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUsedModelAssignment_4_1()); 
            // InternalJavaFXLang.g:7542:2: ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 )
            // InternalJavaFXLang.g:7542:3: rule__FilteredTableViewFX__UsedModelAssignment_4_1
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
    // InternalJavaFXLang.g:7551:1: rule__FilteredTableViewFX__Group_5__0 : rule__FilteredTableViewFX__Group_5__0__Impl rule__FilteredTableViewFX__Group_5__1 ;
    public final void rule__FilteredTableViewFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7555:1: ( rule__FilteredTableViewFX__Group_5__0__Impl rule__FilteredTableViewFX__Group_5__1 )
            // InternalJavaFXLang.g:7556:2: rule__FilteredTableViewFX__Group_5__0__Impl rule__FilteredTableViewFX__Group_5__1
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
    // InternalJavaFXLang.g:7563:1: rule__FilteredTableViewFX__Group_5__0__Impl : ( 'usedFilter:' ) ;
    public final void rule__FilteredTableViewFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7567:1: ( ( 'usedFilter:' ) )
            // InternalJavaFXLang.g:7568:1: ( 'usedFilter:' )
            {
            // InternalJavaFXLang.g:7568:1: ( 'usedFilter:' )
            // InternalJavaFXLang.g:7569:2: 'usedFilter:'
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUsedFilterKeyword_5_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJavaFXLang.g:7578:1: rule__FilteredTableViewFX__Group_5__1 : rule__FilteredTableViewFX__Group_5__1__Impl ;
    public final void rule__FilteredTableViewFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7582:1: ( rule__FilteredTableViewFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:7583:2: rule__FilteredTableViewFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:7589:1: rule__FilteredTableViewFX__Group_5__1__Impl : ( ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 ) ) ;
    public final void rule__FilteredTableViewFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7593:1: ( ( ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:7594:1: ( ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:7594:1: ( ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 ) )
            // InternalJavaFXLang.g:7595:2: ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUseFilterAssignment_5_1()); 
            // InternalJavaFXLang.g:7596:2: ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 )
            // InternalJavaFXLang.g:7596:3: rule__FilteredTableViewFX__UseFilterAssignment_5_1
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
    // InternalJavaFXLang.g:7605:1: rule__FilteredTableViewFX__Group_6__0 : rule__FilteredTableViewFX__Group_6__0__Impl rule__FilteredTableViewFX__Group_6__1 ;
    public final void rule__FilteredTableViewFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7609:1: ( rule__FilteredTableViewFX__Group_6__0__Impl rule__FilteredTableViewFX__Group_6__1 )
            // InternalJavaFXLang.g:7610:2: rule__FilteredTableViewFX__Group_6__0__Impl rule__FilteredTableViewFX__Group_6__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalJavaFXLang.g:7617:1: rule__FilteredTableViewFX__Group_6__0__Impl : ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 ) ) ;
    public final void rule__FilteredTableViewFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7621:1: ( ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 ) ) )
            // InternalJavaFXLang.g:7622:1: ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 ) )
            {
            // InternalJavaFXLang.g:7622:1: ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 ) )
            // InternalJavaFXLang.g:7623:2: ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getColumnsAssignment_6_0()); 
            // InternalJavaFXLang.g:7624:2: ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 )
            // InternalJavaFXLang.g:7624:3: rule__FilteredTableViewFX__ColumnsAssignment_6_0
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
    // InternalJavaFXLang.g:7632:1: rule__FilteredTableViewFX__Group_6__1 : rule__FilteredTableViewFX__Group_6__1__Impl ;
    public final void rule__FilteredTableViewFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7636:1: ( rule__FilteredTableViewFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:7637:2: rule__FilteredTableViewFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:7643:1: rule__FilteredTableViewFX__Group_6__1__Impl : ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )* ) ;
    public final void rule__FilteredTableViewFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7647:1: ( ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )* ) )
            // InternalJavaFXLang.g:7648:1: ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )* )
            {
            // InternalJavaFXLang.g:7648:1: ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )* )
            // InternalJavaFXLang.g:7649:2: ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )*
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getColumnsAssignment_6_1()); 
            // InternalJavaFXLang.g:7650:2: ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==62) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalJavaFXLang.g:7650:3: rule__FilteredTableViewFX__ColumnsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_45);
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
    // InternalJavaFXLang.g:7659:1: rule__DerivedBean__Group__0 : rule__DerivedBean__Group__0__Impl rule__DerivedBean__Group__1 ;
    public final void rule__DerivedBean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7663:1: ( rule__DerivedBean__Group__0__Impl rule__DerivedBean__Group__1 )
            // InternalJavaFXLang.g:7664:2: rule__DerivedBean__Group__0__Impl rule__DerivedBean__Group__1
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
    // InternalJavaFXLang.g:7671:1: rule__DerivedBean__Group__0__Impl : ( () ) ;
    public final void rule__DerivedBean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7675:1: ( ( () ) )
            // InternalJavaFXLang.g:7676:1: ( () )
            {
            // InternalJavaFXLang.g:7676:1: ( () )
            // InternalJavaFXLang.g:7677:2: ()
            {
             before(grammarAccess.getDerivedBeanAccess().getDerivedBeanAction_0()); 
            // InternalJavaFXLang.g:7678:2: ()
            // InternalJavaFXLang.g:7678:3: 
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
    // InternalJavaFXLang.g:7686:1: rule__DerivedBean__Group__1 : rule__DerivedBean__Group__1__Impl rule__DerivedBean__Group__2 ;
    public final void rule__DerivedBean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7690:1: ( rule__DerivedBean__Group__1__Impl rule__DerivedBean__Group__2 )
            // InternalJavaFXLang.g:7691:2: rule__DerivedBean__Group__1__Impl rule__DerivedBean__Group__2
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
    // InternalJavaFXLang.g:7698:1: rule__DerivedBean__Group__1__Impl : ( 'class' ) ;
    public final void rule__DerivedBean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7702:1: ( ( 'class' ) )
            // InternalJavaFXLang.g:7703:1: ( 'class' )
            {
            // InternalJavaFXLang.g:7703:1: ( 'class' )
            // InternalJavaFXLang.g:7704:2: 'class'
            {
             before(grammarAccess.getDerivedBeanAccess().getClassKeyword_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalJavaFXLang.g:7713:1: rule__DerivedBean__Group__2 : rule__DerivedBean__Group__2__Impl rule__DerivedBean__Group__3 ;
    public final void rule__DerivedBean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7717:1: ( rule__DerivedBean__Group__2__Impl rule__DerivedBean__Group__3 )
            // InternalJavaFXLang.g:7718:2: rule__DerivedBean__Group__2__Impl rule__DerivedBean__Group__3
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
    // InternalJavaFXLang.g:7725:1: rule__DerivedBean__Group__2__Impl : ( ( rule__DerivedBean__NameAssignment_2 ) ) ;
    public final void rule__DerivedBean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7729:1: ( ( ( rule__DerivedBean__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:7730:1: ( ( rule__DerivedBean__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:7730:1: ( ( rule__DerivedBean__NameAssignment_2 ) )
            // InternalJavaFXLang.g:7731:2: ( rule__DerivedBean__NameAssignment_2 )
            {
             before(grammarAccess.getDerivedBeanAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:7732:2: ( rule__DerivedBean__NameAssignment_2 )
            // InternalJavaFXLang.g:7732:3: rule__DerivedBean__NameAssignment_2
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
    // InternalJavaFXLang.g:7740:1: rule__DerivedBean__Group__3 : rule__DerivedBean__Group__3__Impl rule__DerivedBean__Group__4 ;
    public final void rule__DerivedBean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7744:1: ( rule__DerivedBean__Group__3__Impl rule__DerivedBean__Group__4 )
            // InternalJavaFXLang.g:7745:2: rule__DerivedBean__Group__3__Impl rule__DerivedBean__Group__4
            {
            pushFollow(FOLLOW_46);
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
    // InternalJavaFXLang.g:7752:1: rule__DerivedBean__Group__3__Impl : ( '{' ) ;
    public final void rule__DerivedBean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7756:1: ( ( '{' ) )
            // InternalJavaFXLang.g:7757:1: ( '{' )
            {
            // InternalJavaFXLang.g:7757:1: ( '{' )
            // InternalJavaFXLang.g:7758:2: '{'
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
    // InternalJavaFXLang.g:7767:1: rule__DerivedBean__Group__4 : rule__DerivedBean__Group__4__Impl rule__DerivedBean__Group__5 ;
    public final void rule__DerivedBean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7771:1: ( rule__DerivedBean__Group__4__Impl rule__DerivedBean__Group__5 )
            // InternalJavaFXLang.g:7772:2: rule__DerivedBean__Group__4__Impl rule__DerivedBean__Group__5
            {
            pushFollow(FOLLOW_47);
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
    // InternalJavaFXLang.g:7779:1: rule__DerivedBean__Group__4__Impl : ( ( rule__DerivedBean__Group_4__0 ) ) ;
    public final void rule__DerivedBean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7783:1: ( ( ( rule__DerivedBean__Group_4__0 ) ) )
            // InternalJavaFXLang.g:7784:1: ( ( rule__DerivedBean__Group_4__0 ) )
            {
            // InternalJavaFXLang.g:7784:1: ( ( rule__DerivedBean__Group_4__0 ) )
            // InternalJavaFXLang.g:7785:2: ( rule__DerivedBean__Group_4__0 )
            {
             before(grammarAccess.getDerivedBeanAccess().getGroup_4()); 
            // InternalJavaFXLang.g:7786:2: ( rule__DerivedBean__Group_4__0 )
            // InternalJavaFXLang.g:7786:3: rule__DerivedBean__Group_4__0
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
    // InternalJavaFXLang.g:7794:1: rule__DerivedBean__Group__5 : rule__DerivedBean__Group__5__Impl rule__DerivedBean__Group__6 ;
    public final void rule__DerivedBean__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7798:1: ( rule__DerivedBean__Group__5__Impl rule__DerivedBean__Group__6 )
            // InternalJavaFXLang.g:7799:2: rule__DerivedBean__Group__5__Impl rule__DerivedBean__Group__6
            {
            pushFollow(FOLLOW_47);
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
    // InternalJavaFXLang.g:7806:1: rule__DerivedBean__Group__5__Impl : ( ( rule__DerivedBean__Group_5__0 )? ) ;
    public final void rule__DerivedBean__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7810:1: ( ( ( rule__DerivedBean__Group_5__0 )? ) )
            // InternalJavaFXLang.g:7811:1: ( ( rule__DerivedBean__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:7811:1: ( ( rule__DerivedBean__Group_5__0 )? )
            // InternalJavaFXLang.g:7812:2: ( rule__DerivedBean__Group_5__0 )?
            {
             before(grammarAccess.getDerivedBeanAccess().getGroup_5()); 
            // InternalJavaFXLang.g:7813:2: ( rule__DerivedBean__Group_5__0 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=RULE_STRING && LA72_0<=RULE_ID)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalJavaFXLang.g:7813:3: rule__DerivedBean__Group_5__0
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
    // InternalJavaFXLang.g:7821:1: rule__DerivedBean__Group__6 : rule__DerivedBean__Group__6__Impl ;
    public final void rule__DerivedBean__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7825:1: ( rule__DerivedBean__Group__6__Impl )
            // InternalJavaFXLang.g:7826:2: rule__DerivedBean__Group__6__Impl
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
    // InternalJavaFXLang.g:7832:1: rule__DerivedBean__Group__6__Impl : ( '}' ) ;
    public final void rule__DerivedBean__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7836:1: ( ( '}' ) )
            // InternalJavaFXLang.g:7837:1: ( '}' )
            {
            // InternalJavaFXLang.g:7837:1: ( '}' )
            // InternalJavaFXLang.g:7838:2: '}'
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
    // InternalJavaFXLang.g:7848:1: rule__DerivedBean__Group_4__0 : rule__DerivedBean__Group_4__0__Impl rule__DerivedBean__Group_4__1 ;
    public final void rule__DerivedBean__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7852:1: ( rule__DerivedBean__Group_4__0__Impl rule__DerivedBean__Group_4__1 )
            // InternalJavaFXLang.g:7853:2: rule__DerivedBean__Group_4__0__Impl rule__DerivedBean__Group_4__1
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
    // InternalJavaFXLang.g:7860:1: rule__DerivedBean__Group_4__0__Impl : ( 'instanceType:' ) ;
    public final void rule__DerivedBean__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7864:1: ( ( 'instanceType:' ) )
            // InternalJavaFXLang.g:7865:1: ( 'instanceType:' )
            {
            // InternalJavaFXLang.g:7865:1: ( 'instanceType:' )
            // InternalJavaFXLang.g:7866:2: 'instanceType:'
            {
             before(grammarAccess.getDerivedBeanAccess().getInstanceTypeKeyword_4_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalJavaFXLang.g:7875:1: rule__DerivedBean__Group_4__1 : rule__DerivedBean__Group_4__1__Impl ;
    public final void rule__DerivedBean__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7879:1: ( rule__DerivedBean__Group_4__1__Impl )
            // InternalJavaFXLang.g:7880:2: rule__DerivedBean__Group_4__1__Impl
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
    // InternalJavaFXLang.g:7886:1: rule__DerivedBean__Group_4__1__Impl : ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) ) ;
    public final void rule__DerivedBean__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7890:1: ( ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:7891:1: ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:7891:1: ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) )
            // InternalJavaFXLang.g:7892:2: ( rule__DerivedBean__InstanceTypeAssignment_4_1 )
            {
             before(grammarAccess.getDerivedBeanAccess().getInstanceTypeAssignment_4_1()); 
            // InternalJavaFXLang.g:7893:2: ( rule__DerivedBean__InstanceTypeAssignment_4_1 )
            // InternalJavaFXLang.g:7893:3: rule__DerivedBean__InstanceTypeAssignment_4_1
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
    // InternalJavaFXLang.g:7902:1: rule__DerivedBean__Group_5__0 : rule__DerivedBean__Group_5__0__Impl rule__DerivedBean__Group_5__1 ;
    public final void rule__DerivedBean__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7906:1: ( rule__DerivedBean__Group_5__0__Impl rule__DerivedBean__Group_5__1 )
            // InternalJavaFXLang.g:7907:2: rule__DerivedBean__Group_5__0__Impl rule__DerivedBean__Group_5__1
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
    // InternalJavaFXLang.g:7914:1: rule__DerivedBean__Group_5__0__Impl : ( ( rule__DerivedBean__AttributesAssignment_5_0 ) ) ;
    public final void rule__DerivedBean__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7918:1: ( ( ( rule__DerivedBean__AttributesAssignment_5_0 ) ) )
            // InternalJavaFXLang.g:7919:1: ( ( rule__DerivedBean__AttributesAssignment_5_0 ) )
            {
            // InternalJavaFXLang.g:7919:1: ( ( rule__DerivedBean__AttributesAssignment_5_0 ) )
            // InternalJavaFXLang.g:7920:2: ( rule__DerivedBean__AttributesAssignment_5_0 )
            {
             before(grammarAccess.getDerivedBeanAccess().getAttributesAssignment_5_0()); 
            // InternalJavaFXLang.g:7921:2: ( rule__DerivedBean__AttributesAssignment_5_0 )
            // InternalJavaFXLang.g:7921:3: rule__DerivedBean__AttributesAssignment_5_0
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
    // InternalJavaFXLang.g:7929:1: rule__DerivedBean__Group_5__1 : rule__DerivedBean__Group_5__1__Impl ;
    public final void rule__DerivedBean__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7933:1: ( rule__DerivedBean__Group_5__1__Impl )
            // InternalJavaFXLang.g:7934:2: rule__DerivedBean__Group_5__1__Impl
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
    // InternalJavaFXLang.g:7940:1: rule__DerivedBean__Group_5__1__Impl : ( ( rule__DerivedBean__AttributesAssignment_5_1 )* ) ;
    public final void rule__DerivedBean__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7944:1: ( ( ( rule__DerivedBean__AttributesAssignment_5_1 )* ) )
            // InternalJavaFXLang.g:7945:1: ( ( rule__DerivedBean__AttributesAssignment_5_1 )* )
            {
            // InternalJavaFXLang.g:7945:1: ( ( rule__DerivedBean__AttributesAssignment_5_1 )* )
            // InternalJavaFXLang.g:7946:2: ( rule__DerivedBean__AttributesAssignment_5_1 )*
            {
             before(grammarAccess.getDerivedBeanAccess().getAttributesAssignment_5_1()); 
            // InternalJavaFXLang.g:7947:2: ( rule__DerivedBean__AttributesAssignment_5_1 )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( ((LA73_0>=RULE_STRING && LA73_0<=RULE_ID)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalJavaFXLang.g:7947:3: rule__DerivedBean__AttributesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_48);
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
    // InternalJavaFXLang.g:7956:1: rule__Bean__Group__0 : rule__Bean__Group__0__Impl rule__Bean__Group__1 ;
    public final void rule__Bean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7960:1: ( rule__Bean__Group__0__Impl rule__Bean__Group__1 )
            // InternalJavaFXLang.g:7961:2: rule__Bean__Group__0__Impl rule__Bean__Group__1
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
    // InternalJavaFXLang.g:7968:1: rule__Bean__Group__0__Impl : ( () ) ;
    public final void rule__Bean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7972:1: ( ( () ) )
            // InternalJavaFXLang.g:7973:1: ( () )
            {
            // InternalJavaFXLang.g:7973:1: ( () )
            // InternalJavaFXLang.g:7974:2: ()
            {
             before(grammarAccess.getBeanAccess().getBeanAction_0()); 
            // InternalJavaFXLang.g:7975:2: ()
            // InternalJavaFXLang.g:7975:3: 
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
    // InternalJavaFXLang.g:7983:1: rule__Bean__Group__1 : rule__Bean__Group__1__Impl rule__Bean__Group__2 ;
    public final void rule__Bean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7987:1: ( rule__Bean__Group__1__Impl rule__Bean__Group__2 )
            // InternalJavaFXLang.g:7988:2: rule__Bean__Group__1__Impl rule__Bean__Group__2
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
    // InternalJavaFXLang.g:7995:1: rule__Bean__Group__1__Impl : ( 'class' ) ;
    public final void rule__Bean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7999:1: ( ( 'class' ) )
            // InternalJavaFXLang.g:8000:1: ( 'class' )
            {
            // InternalJavaFXLang.g:8000:1: ( 'class' )
            // InternalJavaFXLang.g:8001:2: 'class'
            {
             before(grammarAccess.getBeanAccess().getClassKeyword_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8010:1: rule__Bean__Group__2 : rule__Bean__Group__2__Impl rule__Bean__Group__3 ;
    public final void rule__Bean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8014:1: ( rule__Bean__Group__2__Impl rule__Bean__Group__3 )
            // InternalJavaFXLang.g:8015:2: rule__Bean__Group__2__Impl rule__Bean__Group__3
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
    // InternalJavaFXLang.g:8022:1: rule__Bean__Group__2__Impl : ( ( rule__Bean__NameAssignment_2 ) ) ;
    public final void rule__Bean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8026:1: ( ( ( rule__Bean__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:8027:1: ( ( rule__Bean__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:8027:1: ( ( rule__Bean__NameAssignment_2 ) )
            // InternalJavaFXLang.g:8028:2: ( rule__Bean__NameAssignment_2 )
            {
             before(grammarAccess.getBeanAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:8029:2: ( rule__Bean__NameAssignment_2 )
            // InternalJavaFXLang.g:8029:3: rule__Bean__NameAssignment_2
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
    // InternalJavaFXLang.g:8037:1: rule__Bean__Group__3 : rule__Bean__Group__3__Impl rule__Bean__Group__4 ;
    public final void rule__Bean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8041:1: ( rule__Bean__Group__3__Impl rule__Bean__Group__4 )
            // InternalJavaFXLang.g:8042:2: rule__Bean__Group__3__Impl rule__Bean__Group__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalJavaFXLang.g:8049:1: rule__Bean__Group__3__Impl : ( '{' ) ;
    public final void rule__Bean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8053:1: ( ( '{' ) )
            // InternalJavaFXLang.g:8054:1: ( '{' )
            {
            // InternalJavaFXLang.g:8054:1: ( '{' )
            // InternalJavaFXLang.g:8055:2: '{'
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
    // InternalJavaFXLang.g:8064:1: rule__Bean__Group__4 : rule__Bean__Group__4__Impl rule__Bean__Group__5 ;
    public final void rule__Bean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8068:1: ( rule__Bean__Group__4__Impl rule__Bean__Group__5 )
            // InternalJavaFXLang.g:8069:2: rule__Bean__Group__4__Impl rule__Bean__Group__5
            {
            pushFollow(FOLLOW_47);
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
    // InternalJavaFXLang.g:8076:1: rule__Bean__Group__4__Impl : ( ( rule__Bean__Group_4__0 )? ) ;
    public final void rule__Bean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8080:1: ( ( ( rule__Bean__Group_4__0 )? ) )
            // InternalJavaFXLang.g:8081:1: ( ( rule__Bean__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:8081:1: ( ( rule__Bean__Group_4__0 )? )
            // InternalJavaFXLang.g:8082:2: ( rule__Bean__Group_4__0 )?
            {
             before(grammarAccess.getBeanAccess().getGroup_4()); 
            // InternalJavaFXLang.g:8083:2: ( rule__Bean__Group_4__0 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=RULE_STRING && LA74_0<=RULE_ID)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalJavaFXLang.g:8083:3: rule__Bean__Group_4__0
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
    // InternalJavaFXLang.g:8091:1: rule__Bean__Group__5 : rule__Bean__Group__5__Impl ;
    public final void rule__Bean__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8095:1: ( rule__Bean__Group__5__Impl )
            // InternalJavaFXLang.g:8096:2: rule__Bean__Group__5__Impl
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
    // InternalJavaFXLang.g:8102:1: rule__Bean__Group__5__Impl : ( '}' ) ;
    public final void rule__Bean__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8106:1: ( ( '}' ) )
            // InternalJavaFXLang.g:8107:1: ( '}' )
            {
            // InternalJavaFXLang.g:8107:1: ( '}' )
            // InternalJavaFXLang.g:8108:2: '}'
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
    // InternalJavaFXLang.g:8118:1: rule__Bean__Group_4__0 : rule__Bean__Group_4__0__Impl rule__Bean__Group_4__1 ;
    public final void rule__Bean__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8122:1: ( rule__Bean__Group_4__0__Impl rule__Bean__Group_4__1 )
            // InternalJavaFXLang.g:8123:2: rule__Bean__Group_4__0__Impl rule__Bean__Group_4__1
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
    // InternalJavaFXLang.g:8130:1: rule__Bean__Group_4__0__Impl : ( ( rule__Bean__AttributesAssignment_4_0 ) ) ;
    public final void rule__Bean__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8134:1: ( ( ( rule__Bean__AttributesAssignment_4_0 ) ) )
            // InternalJavaFXLang.g:8135:1: ( ( rule__Bean__AttributesAssignment_4_0 ) )
            {
            // InternalJavaFXLang.g:8135:1: ( ( rule__Bean__AttributesAssignment_4_0 ) )
            // InternalJavaFXLang.g:8136:2: ( rule__Bean__AttributesAssignment_4_0 )
            {
             before(grammarAccess.getBeanAccess().getAttributesAssignment_4_0()); 
            // InternalJavaFXLang.g:8137:2: ( rule__Bean__AttributesAssignment_4_0 )
            // InternalJavaFXLang.g:8137:3: rule__Bean__AttributesAssignment_4_0
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
    // InternalJavaFXLang.g:8145:1: rule__Bean__Group_4__1 : rule__Bean__Group_4__1__Impl ;
    public final void rule__Bean__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8149:1: ( rule__Bean__Group_4__1__Impl )
            // InternalJavaFXLang.g:8150:2: rule__Bean__Group_4__1__Impl
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
    // InternalJavaFXLang.g:8156:1: rule__Bean__Group_4__1__Impl : ( ( rule__Bean__AttributesAssignment_4_1 )* ) ;
    public final void rule__Bean__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8160:1: ( ( ( rule__Bean__AttributesAssignment_4_1 )* ) )
            // InternalJavaFXLang.g:8161:1: ( ( rule__Bean__AttributesAssignment_4_1 )* )
            {
            // InternalJavaFXLang.g:8161:1: ( ( rule__Bean__AttributesAssignment_4_1 )* )
            // InternalJavaFXLang.g:8162:2: ( rule__Bean__AttributesAssignment_4_1 )*
            {
             before(grammarAccess.getBeanAccess().getAttributesAssignment_4_1()); 
            // InternalJavaFXLang.g:8163:2: ( rule__Bean__AttributesAssignment_4_1 )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( ((LA75_0>=RULE_STRING && LA75_0<=RULE_ID)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalJavaFXLang.g:8163:3: rule__Bean__AttributesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_48);
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
    // InternalJavaFXLang.g:8172:1: rule__TableViewFX__Group__0 : rule__TableViewFX__Group__0__Impl rule__TableViewFX__Group__1 ;
    public final void rule__TableViewFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8176:1: ( rule__TableViewFX__Group__0__Impl rule__TableViewFX__Group__1 )
            // InternalJavaFXLang.g:8177:2: rule__TableViewFX__Group__0__Impl rule__TableViewFX__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalJavaFXLang.g:8184:1: rule__TableViewFX__Group__0__Impl : ( () ) ;
    public final void rule__TableViewFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8188:1: ( ( () ) )
            // InternalJavaFXLang.g:8189:1: ( () )
            {
            // InternalJavaFXLang.g:8189:1: ( () )
            // InternalJavaFXLang.g:8190:2: ()
            {
             before(grammarAccess.getTableViewFXAccess().getTableViewFXAction_0()); 
            // InternalJavaFXLang.g:8191:2: ()
            // InternalJavaFXLang.g:8191:3: 
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
    // InternalJavaFXLang.g:8199:1: rule__TableViewFX__Group__1 : rule__TableViewFX__Group__1__Impl rule__TableViewFX__Group__2 ;
    public final void rule__TableViewFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8203:1: ( rule__TableViewFX__Group__1__Impl rule__TableViewFX__Group__2 )
            // InternalJavaFXLang.g:8204:2: rule__TableViewFX__Group__1__Impl rule__TableViewFX__Group__2
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
    // InternalJavaFXLang.g:8211:1: rule__TableViewFX__Group__1__Impl : ( 'TableView' ) ;
    public final void rule__TableViewFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8215:1: ( ( 'TableView' ) )
            // InternalJavaFXLang.g:8216:1: ( 'TableView' )
            {
            // InternalJavaFXLang.g:8216:1: ( 'TableView' )
            // InternalJavaFXLang.g:8217:2: 'TableView'
            {
             before(grammarAccess.getTableViewFXAccess().getTableViewKeyword_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8226:1: rule__TableViewFX__Group__2 : rule__TableViewFX__Group__2__Impl rule__TableViewFX__Group__3 ;
    public final void rule__TableViewFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8230:1: ( rule__TableViewFX__Group__2__Impl rule__TableViewFX__Group__3 )
            // InternalJavaFXLang.g:8231:2: rule__TableViewFX__Group__2__Impl rule__TableViewFX__Group__3
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
    // InternalJavaFXLang.g:8238:1: rule__TableViewFX__Group__2__Impl : ( '{' ) ;
    public final void rule__TableViewFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8242:1: ( ( '{' ) )
            // InternalJavaFXLang.g:8243:1: ( '{' )
            {
            // InternalJavaFXLang.g:8243:1: ( '{' )
            // InternalJavaFXLang.g:8244:2: '{'
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
    // InternalJavaFXLang.g:8253:1: rule__TableViewFX__Group__3 : rule__TableViewFX__Group__3__Impl rule__TableViewFX__Group__4 ;
    public final void rule__TableViewFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8257:1: ( rule__TableViewFX__Group__3__Impl rule__TableViewFX__Group__4 )
            // InternalJavaFXLang.g:8258:2: rule__TableViewFX__Group__3__Impl rule__TableViewFX__Group__4
            {
            pushFollow(FOLLOW_50);
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
    // InternalJavaFXLang.g:8265:1: rule__TableViewFX__Group__3__Impl : ( ( rule__TableViewFX__Group_3__0 ) ) ;
    public final void rule__TableViewFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8269:1: ( ( ( rule__TableViewFX__Group_3__0 ) ) )
            // InternalJavaFXLang.g:8270:1: ( ( rule__TableViewFX__Group_3__0 ) )
            {
            // InternalJavaFXLang.g:8270:1: ( ( rule__TableViewFX__Group_3__0 ) )
            // InternalJavaFXLang.g:8271:2: ( rule__TableViewFX__Group_3__0 )
            {
             before(grammarAccess.getTableViewFXAccess().getGroup_3()); 
            // InternalJavaFXLang.g:8272:2: ( rule__TableViewFX__Group_3__0 )
            // InternalJavaFXLang.g:8272:3: rule__TableViewFX__Group_3__0
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
    // InternalJavaFXLang.g:8280:1: rule__TableViewFX__Group__4 : rule__TableViewFX__Group__4__Impl rule__TableViewFX__Group__5 ;
    public final void rule__TableViewFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8284:1: ( rule__TableViewFX__Group__4__Impl rule__TableViewFX__Group__5 )
            // InternalJavaFXLang.g:8285:2: rule__TableViewFX__Group__4__Impl rule__TableViewFX__Group__5
            {
            pushFollow(FOLLOW_50);
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
    // InternalJavaFXLang.g:8292:1: rule__TableViewFX__Group__4__Impl : ( ( rule__TableViewFX__Group_4__0 )? ) ;
    public final void rule__TableViewFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8296:1: ( ( ( rule__TableViewFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:8297:1: ( ( rule__TableViewFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:8297:1: ( ( rule__TableViewFX__Group_4__0 )? )
            // InternalJavaFXLang.g:8298:2: ( rule__TableViewFX__Group_4__0 )?
            {
             before(grammarAccess.getTableViewFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:8299:2: ( rule__TableViewFX__Group_4__0 )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==57) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalJavaFXLang.g:8299:3: rule__TableViewFX__Group_4__0
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
    // InternalJavaFXLang.g:8307:1: rule__TableViewFX__Group__5 : rule__TableViewFX__Group__5__Impl rule__TableViewFX__Group__6 ;
    public final void rule__TableViewFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8311:1: ( rule__TableViewFX__Group__5__Impl rule__TableViewFX__Group__6 )
            // InternalJavaFXLang.g:8312:2: rule__TableViewFX__Group__5__Impl rule__TableViewFX__Group__6
            {
            pushFollow(FOLLOW_50);
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
    // InternalJavaFXLang.g:8319:1: rule__TableViewFX__Group__5__Impl : ( ( rule__TableViewFX__Group_5__0 )? ) ;
    public final void rule__TableViewFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8323:1: ( ( ( rule__TableViewFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:8324:1: ( ( rule__TableViewFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:8324:1: ( ( rule__TableViewFX__Group_5__0 )? )
            // InternalJavaFXLang.g:8325:2: ( rule__TableViewFX__Group_5__0 )?
            {
             before(grammarAccess.getTableViewFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:8326:2: ( rule__TableViewFX__Group_5__0 )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==62) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalJavaFXLang.g:8326:3: rule__TableViewFX__Group_5__0
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
    // InternalJavaFXLang.g:8334:1: rule__TableViewFX__Group__6 : rule__TableViewFX__Group__6__Impl ;
    public final void rule__TableViewFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8338:1: ( rule__TableViewFX__Group__6__Impl )
            // InternalJavaFXLang.g:8339:2: rule__TableViewFX__Group__6__Impl
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
    // InternalJavaFXLang.g:8345:1: rule__TableViewFX__Group__6__Impl : ( '}' ) ;
    public final void rule__TableViewFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8349:1: ( ( '}' ) )
            // InternalJavaFXLang.g:8350:1: ( '}' )
            {
            // InternalJavaFXLang.g:8350:1: ( '}' )
            // InternalJavaFXLang.g:8351:2: '}'
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
    // InternalJavaFXLang.g:8361:1: rule__TableViewFX__Group_3__0 : rule__TableViewFX__Group_3__0__Impl rule__TableViewFX__Group_3__1 ;
    public final void rule__TableViewFX__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8365:1: ( rule__TableViewFX__Group_3__0__Impl rule__TableViewFX__Group_3__1 )
            // InternalJavaFXLang.g:8366:2: rule__TableViewFX__Group_3__0__Impl rule__TableViewFX__Group_3__1
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
    // InternalJavaFXLang.g:8373:1: rule__TableViewFX__Group_3__0__Impl : ( 'name:' ) ;
    public final void rule__TableViewFX__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8377:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:8378:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:8378:1: ( 'name:' )
            // InternalJavaFXLang.g:8379:2: 'name:'
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
    // InternalJavaFXLang.g:8388:1: rule__TableViewFX__Group_3__1 : rule__TableViewFX__Group_3__1__Impl ;
    public final void rule__TableViewFX__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8392:1: ( rule__TableViewFX__Group_3__1__Impl )
            // InternalJavaFXLang.g:8393:2: rule__TableViewFX__Group_3__1__Impl
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
    // InternalJavaFXLang.g:8399:1: rule__TableViewFX__Group_3__1__Impl : ( ( rule__TableViewFX__NameAssignment_3_1 ) ) ;
    public final void rule__TableViewFX__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8403:1: ( ( ( rule__TableViewFX__NameAssignment_3_1 ) ) )
            // InternalJavaFXLang.g:8404:1: ( ( rule__TableViewFX__NameAssignment_3_1 ) )
            {
            // InternalJavaFXLang.g:8404:1: ( ( rule__TableViewFX__NameAssignment_3_1 ) )
            // InternalJavaFXLang.g:8405:2: ( rule__TableViewFX__NameAssignment_3_1 )
            {
             before(grammarAccess.getTableViewFXAccess().getNameAssignment_3_1()); 
            // InternalJavaFXLang.g:8406:2: ( rule__TableViewFX__NameAssignment_3_1 )
            // InternalJavaFXLang.g:8406:3: rule__TableViewFX__NameAssignment_3_1
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
    // InternalJavaFXLang.g:8415:1: rule__TableViewFX__Group_4__0 : rule__TableViewFX__Group_4__0__Impl rule__TableViewFX__Group_4__1 ;
    public final void rule__TableViewFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8419:1: ( rule__TableViewFX__Group_4__0__Impl rule__TableViewFX__Group_4__1 )
            // InternalJavaFXLang.g:8420:2: rule__TableViewFX__Group_4__0__Impl rule__TableViewFX__Group_4__1
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
    // InternalJavaFXLang.g:8427:1: rule__TableViewFX__Group_4__0__Impl : ( 'usedModel:' ) ;
    public final void rule__TableViewFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8431:1: ( ( 'usedModel:' ) )
            // InternalJavaFXLang.g:8432:1: ( 'usedModel:' )
            {
            // InternalJavaFXLang.g:8432:1: ( 'usedModel:' )
            // InternalJavaFXLang.g:8433:2: 'usedModel:'
            {
             before(grammarAccess.getTableViewFXAccess().getUsedModelKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8442:1: rule__TableViewFX__Group_4__1 : rule__TableViewFX__Group_4__1__Impl ;
    public final void rule__TableViewFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8446:1: ( rule__TableViewFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:8447:2: rule__TableViewFX__Group_4__1__Impl
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
    // InternalJavaFXLang.g:8453:1: rule__TableViewFX__Group_4__1__Impl : ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) ) ;
    public final void rule__TableViewFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8457:1: ( ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:8458:1: ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:8458:1: ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) )
            // InternalJavaFXLang.g:8459:2: ( rule__TableViewFX__UsedModelAssignment_4_1 )
            {
             before(grammarAccess.getTableViewFXAccess().getUsedModelAssignment_4_1()); 
            // InternalJavaFXLang.g:8460:2: ( rule__TableViewFX__UsedModelAssignment_4_1 )
            // InternalJavaFXLang.g:8460:3: rule__TableViewFX__UsedModelAssignment_4_1
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
    // InternalJavaFXLang.g:8469:1: rule__TableViewFX__Group_5__0 : rule__TableViewFX__Group_5__0__Impl rule__TableViewFX__Group_5__1 ;
    public final void rule__TableViewFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8473:1: ( rule__TableViewFX__Group_5__0__Impl rule__TableViewFX__Group_5__1 )
            // InternalJavaFXLang.g:8474:2: rule__TableViewFX__Group_5__0__Impl rule__TableViewFX__Group_5__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalJavaFXLang.g:8481:1: rule__TableViewFX__Group_5__0__Impl : ( ( rule__TableViewFX__ColumnsAssignment_5_0 ) ) ;
    public final void rule__TableViewFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8485:1: ( ( ( rule__TableViewFX__ColumnsAssignment_5_0 ) ) )
            // InternalJavaFXLang.g:8486:1: ( ( rule__TableViewFX__ColumnsAssignment_5_0 ) )
            {
            // InternalJavaFXLang.g:8486:1: ( ( rule__TableViewFX__ColumnsAssignment_5_0 ) )
            // InternalJavaFXLang.g:8487:2: ( rule__TableViewFX__ColumnsAssignment_5_0 )
            {
             before(grammarAccess.getTableViewFXAccess().getColumnsAssignment_5_0()); 
            // InternalJavaFXLang.g:8488:2: ( rule__TableViewFX__ColumnsAssignment_5_0 )
            // InternalJavaFXLang.g:8488:3: rule__TableViewFX__ColumnsAssignment_5_0
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
    // InternalJavaFXLang.g:8496:1: rule__TableViewFX__Group_5__1 : rule__TableViewFX__Group_5__1__Impl ;
    public final void rule__TableViewFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8500:1: ( rule__TableViewFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:8501:2: rule__TableViewFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:8507:1: rule__TableViewFX__Group_5__1__Impl : ( ( rule__TableViewFX__ColumnsAssignment_5_1 )* ) ;
    public final void rule__TableViewFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8511:1: ( ( ( rule__TableViewFX__ColumnsAssignment_5_1 )* ) )
            // InternalJavaFXLang.g:8512:1: ( ( rule__TableViewFX__ColumnsAssignment_5_1 )* )
            {
            // InternalJavaFXLang.g:8512:1: ( ( rule__TableViewFX__ColumnsAssignment_5_1 )* )
            // InternalJavaFXLang.g:8513:2: ( rule__TableViewFX__ColumnsAssignment_5_1 )*
            {
             before(grammarAccess.getTableViewFXAccess().getColumnsAssignment_5_1()); 
            // InternalJavaFXLang.g:8514:2: ( rule__TableViewFX__ColumnsAssignment_5_1 )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==62) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalJavaFXLang.g:8514:3: rule__TableViewFX__ColumnsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_45);
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
    // InternalJavaFXLang.g:8523:1: rule__TableColumnFX__Group__0 : rule__TableColumnFX__Group__0__Impl rule__TableColumnFX__Group__1 ;
    public final void rule__TableColumnFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8527:1: ( rule__TableColumnFX__Group__0__Impl rule__TableColumnFX__Group__1 )
            // InternalJavaFXLang.g:8528:2: rule__TableColumnFX__Group__0__Impl rule__TableColumnFX__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalJavaFXLang.g:8535:1: rule__TableColumnFX__Group__0__Impl : ( () ) ;
    public final void rule__TableColumnFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8539:1: ( ( () ) )
            // InternalJavaFXLang.g:8540:1: ( () )
            {
            // InternalJavaFXLang.g:8540:1: ( () )
            // InternalJavaFXLang.g:8541:2: ()
            {
             before(grammarAccess.getTableColumnFXAccess().getTableColumnFXAction_0()); 
            // InternalJavaFXLang.g:8542:2: ()
            // InternalJavaFXLang.g:8542:3: 
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
    // InternalJavaFXLang.g:8550:1: rule__TableColumnFX__Group__1 : rule__TableColumnFX__Group__1__Impl rule__TableColumnFX__Group__2 ;
    public final void rule__TableColumnFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8554:1: ( rule__TableColumnFX__Group__1__Impl rule__TableColumnFX__Group__2 )
            // InternalJavaFXLang.g:8555:2: rule__TableColumnFX__Group__1__Impl rule__TableColumnFX__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalJavaFXLang.g:8562:1: rule__TableColumnFX__Group__1__Impl : ( 'Column' ) ;
    public final void rule__TableColumnFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8566:1: ( ( 'Column' ) )
            // InternalJavaFXLang.g:8567:1: ( 'Column' )
            {
            // InternalJavaFXLang.g:8567:1: ( 'Column' )
            // InternalJavaFXLang.g:8568:2: 'Column'
            {
             before(grammarAccess.getTableColumnFXAccess().getColumnKeyword_1()); 
            match(input,62,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8577:1: rule__TableColumnFX__Group__2 : rule__TableColumnFX__Group__2__Impl rule__TableColumnFX__Group__3 ;
    public final void rule__TableColumnFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8581:1: ( rule__TableColumnFX__Group__2__Impl rule__TableColumnFX__Group__3 )
            // InternalJavaFXLang.g:8582:2: rule__TableColumnFX__Group__2__Impl rule__TableColumnFX__Group__3
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
    // InternalJavaFXLang.g:8589:1: rule__TableColumnFX__Group__2__Impl : ( '(' ) ;
    public final void rule__TableColumnFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8593:1: ( ( '(' ) )
            // InternalJavaFXLang.g:8594:1: ( '(' )
            {
            // InternalJavaFXLang.g:8594:1: ( '(' )
            // InternalJavaFXLang.g:8595:2: '('
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
    // InternalJavaFXLang.g:8604:1: rule__TableColumnFX__Group__3 : rule__TableColumnFX__Group__3__Impl rule__TableColumnFX__Group__4 ;
    public final void rule__TableColumnFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8608:1: ( rule__TableColumnFX__Group__3__Impl rule__TableColumnFX__Group__4 )
            // InternalJavaFXLang.g:8609:2: rule__TableColumnFX__Group__3__Impl rule__TableColumnFX__Group__4
            {
            pushFollow(FOLLOW_51);
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
    // InternalJavaFXLang.g:8616:1: rule__TableColumnFX__Group__3__Impl : ( ( rule__TableColumnFX__Group_3__0 ) ) ;
    public final void rule__TableColumnFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8620:1: ( ( ( rule__TableColumnFX__Group_3__0 ) ) )
            // InternalJavaFXLang.g:8621:1: ( ( rule__TableColumnFX__Group_3__0 ) )
            {
            // InternalJavaFXLang.g:8621:1: ( ( rule__TableColumnFX__Group_3__0 ) )
            // InternalJavaFXLang.g:8622:2: ( rule__TableColumnFX__Group_3__0 )
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_3()); 
            // InternalJavaFXLang.g:8623:2: ( rule__TableColumnFX__Group_3__0 )
            // InternalJavaFXLang.g:8623:3: rule__TableColumnFX__Group_3__0
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
    // InternalJavaFXLang.g:8631:1: rule__TableColumnFX__Group__4 : rule__TableColumnFX__Group__4__Impl rule__TableColumnFX__Group__5 ;
    public final void rule__TableColumnFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8635:1: ( rule__TableColumnFX__Group__4__Impl rule__TableColumnFX__Group__5 )
            // InternalJavaFXLang.g:8636:2: rule__TableColumnFX__Group__4__Impl rule__TableColumnFX__Group__5
            {
            pushFollow(FOLLOW_51);
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
    // InternalJavaFXLang.g:8643:1: rule__TableColumnFX__Group__4__Impl : ( ( rule__TableColumnFX__Group_4__0 )? ) ;
    public final void rule__TableColumnFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8647:1: ( ( ( rule__TableColumnFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:8648:1: ( ( rule__TableColumnFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:8648:1: ( ( rule__TableColumnFX__Group_4__0 )? )
            // InternalJavaFXLang.g:8649:2: ( rule__TableColumnFX__Group_4__0 )?
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:8650:2: ( rule__TableColumnFX__Group_4__0 )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==63) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalJavaFXLang.g:8650:3: rule__TableColumnFX__Group_4__0
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
    // InternalJavaFXLang.g:8658:1: rule__TableColumnFX__Group__5 : rule__TableColumnFX__Group__5__Impl rule__TableColumnFX__Group__6 ;
    public final void rule__TableColumnFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8662:1: ( rule__TableColumnFX__Group__5__Impl rule__TableColumnFX__Group__6 )
            // InternalJavaFXLang.g:8663:2: rule__TableColumnFX__Group__5__Impl rule__TableColumnFX__Group__6
            {
            pushFollow(FOLLOW_51);
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
    // InternalJavaFXLang.g:8670:1: rule__TableColumnFX__Group__5__Impl : ( ( rule__TableColumnFX__Group_5__0 )? ) ;
    public final void rule__TableColumnFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8674:1: ( ( ( rule__TableColumnFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:8675:1: ( ( rule__TableColumnFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:8675:1: ( ( rule__TableColumnFX__Group_5__0 )? )
            // InternalJavaFXLang.g:8676:2: ( rule__TableColumnFX__Group_5__0 )?
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:8677:2: ( rule__TableColumnFX__Group_5__0 )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==64) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalJavaFXLang.g:8677:3: rule__TableColumnFX__Group_5__0
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
    // InternalJavaFXLang.g:8685:1: rule__TableColumnFX__Group__6 : rule__TableColumnFX__Group__6__Impl rule__TableColumnFX__Group__7 ;
    public final void rule__TableColumnFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8689:1: ( rule__TableColumnFX__Group__6__Impl rule__TableColumnFX__Group__7 )
            // InternalJavaFXLang.g:8690:2: rule__TableColumnFX__Group__6__Impl rule__TableColumnFX__Group__7
            {
            pushFollow(FOLLOW_51);
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
    // InternalJavaFXLang.g:8697:1: rule__TableColumnFX__Group__6__Impl : ( ( rule__TableColumnFX__Group_6__0 )? ) ;
    public final void rule__TableColumnFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8701:1: ( ( ( rule__TableColumnFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:8702:1: ( ( rule__TableColumnFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:8702:1: ( ( rule__TableColumnFX__Group_6__0 )? )
            // InternalJavaFXLang.g:8703:2: ( rule__TableColumnFX__Group_6__0 )?
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:8704:2: ( rule__TableColumnFX__Group_6__0 )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==65) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalJavaFXLang.g:8704:3: rule__TableColumnFX__Group_6__0
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
    // InternalJavaFXLang.g:8712:1: rule__TableColumnFX__Group__7 : rule__TableColumnFX__Group__7__Impl ;
    public final void rule__TableColumnFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8716:1: ( rule__TableColumnFX__Group__7__Impl )
            // InternalJavaFXLang.g:8717:2: rule__TableColumnFX__Group__7__Impl
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
    // InternalJavaFXLang.g:8723:1: rule__TableColumnFX__Group__7__Impl : ( ')' ) ;
    public final void rule__TableColumnFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8727:1: ( ( ')' ) )
            // InternalJavaFXLang.g:8728:1: ( ')' )
            {
            // InternalJavaFXLang.g:8728:1: ( ')' )
            // InternalJavaFXLang.g:8729:2: ')'
            {
             before(grammarAccess.getTableColumnFXAccess().getRightParenthesisKeyword_7()); 
            match(input,54,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8739:1: rule__TableColumnFX__Group_3__0 : rule__TableColumnFX__Group_3__0__Impl rule__TableColumnFX__Group_3__1 ;
    public final void rule__TableColumnFX__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8743:1: ( rule__TableColumnFX__Group_3__0__Impl rule__TableColumnFX__Group_3__1 )
            // InternalJavaFXLang.g:8744:2: rule__TableColumnFX__Group_3__0__Impl rule__TableColumnFX__Group_3__1
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
    // InternalJavaFXLang.g:8751:1: rule__TableColumnFX__Group_3__0__Impl : ( 'name:' ) ;
    public final void rule__TableColumnFX__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8755:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:8756:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:8756:1: ( 'name:' )
            // InternalJavaFXLang.g:8757:2: 'name:'
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
    // InternalJavaFXLang.g:8766:1: rule__TableColumnFX__Group_3__1 : rule__TableColumnFX__Group_3__1__Impl ;
    public final void rule__TableColumnFX__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8770:1: ( rule__TableColumnFX__Group_3__1__Impl )
            // InternalJavaFXLang.g:8771:2: rule__TableColumnFX__Group_3__1__Impl
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
    // InternalJavaFXLang.g:8777:1: rule__TableColumnFX__Group_3__1__Impl : ( ( rule__TableColumnFX__NameAssignment_3_1 ) ) ;
    public final void rule__TableColumnFX__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8781:1: ( ( ( rule__TableColumnFX__NameAssignment_3_1 ) ) )
            // InternalJavaFXLang.g:8782:1: ( ( rule__TableColumnFX__NameAssignment_3_1 ) )
            {
            // InternalJavaFXLang.g:8782:1: ( ( rule__TableColumnFX__NameAssignment_3_1 ) )
            // InternalJavaFXLang.g:8783:2: ( rule__TableColumnFX__NameAssignment_3_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getNameAssignment_3_1()); 
            // InternalJavaFXLang.g:8784:2: ( rule__TableColumnFX__NameAssignment_3_1 )
            // InternalJavaFXLang.g:8784:3: rule__TableColumnFX__NameAssignment_3_1
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
    // InternalJavaFXLang.g:8793:1: rule__TableColumnFX__Group_4__0 : rule__TableColumnFX__Group_4__0__Impl rule__TableColumnFX__Group_4__1 ;
    public final void rule__TableColumnFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8797:1: ( rule__TableColumnFX__Group_4__0__Impl rule__TableColumnFX__Group_4__1 )
            // InternalJavaFXLang.g:8798:2: rule__TableColumnFX__Group_4__0__Impl rule__TableColumnFX__Group_4__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalJavaFXLang.g:8805:1: rule__TableColumnFX__Group_4__0__Impl : ( 'width:' ) ;
    public final void rule__TableColumnFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8809:1: ( ( 'width:' ) )
            // InternalJavaFXLang.g:8810:1: ( 'width:' )
            {
            // InternalJavaFXLang.g:8810:1: ( 'width:' )
            // InternalJavaFXLang.g:8811:2: 'width:'
            {
             before(grammarAccess.getTableColumnFXAccess().getWidthKeyword_4_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8820:1: rule__TableColumnFX__Group_4__1 : rule__TableColumnFX__Group_4__1__Impl ;
    public final void rule__TableColumnFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8824:1: ( rule__TableColumnFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:8825:2: rule__TableColumnFX__Group_4__1__Impl
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
    // InternalJavaFXLang.g:8831:1: rule__TableColumnFX__Group_4__1__Impl : ( ( rule__TableColumnFX__WidthAssignment_4_1 ) ) ;
    public final void rule__TableColumnFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8835:1: ( ( ( rule__TableColumnFX__WidthAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:8836:1: ( ( rule__TableColumnFX__WidthAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:8836:1: ( ( rule__TableColumnFX__WidthAssignment_4_1 ) )
            // InternalJavaFXLang.g:8837:2: ( rule__TableColumnFX__WidthAssignment_4_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getWidthAssignment_4_1()); 
            // InternalJavaFXLang.g:8838:2: ( rule__TableColumnFX__WidthAssignment_4_1 )
            // InternalJavaFXLang.g:8838:3: rule__TableColumnFX__WidthAssignment_4_1
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
    // InternalJavaFXLang.g:8847:1: rule__TableColumnFX__Group_5__0 : rule__TableColumnFX__Group_5__0__Impl rule__TableColumnFX__Group_5__1 ;
    public final void rule__TableColumnFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8851:1: ( rule__TableColumnFX__Group_5__0__Impl rule__TableColumnFX__Group_5__1 )
            // InternalJavaFXLang.g:8852:2: rule__TableColumnFX__Group_5__0__Impl rule__TableColumnFX__Group_5__1
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
    // InternalJavaFXLang.g:8859:1: rule__TableColumnFX__Group_5__0__Impl : ( 'attribute:' ) ;
    public final void rule__TableColumnFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8863:1: ( ( 'attribute:' ) )
            // InternalJavaFXLang.g:8864:1: ( 'attribute:' )
            {
            // InternalJavaFXLang.g:8864:1: ( 'attribute:' )
            // InternalJavaFXLang.g:8865:2: 'attribute:'
            {
             before(grammarAccess.getTableColumnFXAccess().getAttributeKeyword_5_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8874:1: rule__TableColumnFX__Group_5__1 : rule__TableColumnFX__Group_5__1__Impl ;
    public final void rule__TableColumnFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8878:1: ( rule__TableColumnFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:8879:2: rule__TableColumnFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:8885:1: rule__TableColumnFX__Group_5__1__Impl : ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) ) ;
    public final void rule__TableColumnFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8889:1: ( ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:8890:1: ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:8890:1: ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) )
            // InternalJavaFXLang.g:8891:2: ( rule__TableColumnFX__UsedAttributeAssignment_5_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getUsedAttributeAssignment_5_1()); 
            // InternalJavaFXLang.g:8892:2: ( rule__TableColumnFX__UsedAttributeAssignment_5_1 )
            // InternalJavaFXLang.g:8892:3: rule__TableColumnFX__UsedAttributeAssignment_5_1
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
    // InternalJavaFXLang.g:8901:1: rule__TableColumnFX__Group_6__0 : rule__TableColumnFX__Group_6__0__Impl rule__TableColumnFX__Group_6__1 ;
    public final void rule__TableColumnFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8905:1: ( rule__TableColumnFX__Group_6__0__Impl rule__TableColumnFX__Group_6__1 )
            // InternalJavaFXLang.g:8906:2: rule__TableColumnFX__Group_6__0__Impl rule__TableColumnFX__Group_6__1
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
    // InternalJavaFXLang.g:8913:1: rule__TableColumnFX__Group_6__0__Impl : ( 'useFilter:' ) ;
    public final void rule__TableColumnFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8917:1: ( ( 'useFilter:' ) )
            // InternalJavaFXLang.g:8918:1: ( 'useFilter:' )
            {
            // InternalJavaFXLang.g:8918:1: ( 'useFilter:' )
            // InternalJavaFXLang.g:8919:2: 'useFilter:'
            {
             before(grammarAccess.getTableColumnFXAccess().getUseFilterKeyword_6_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8928:1: rule__TableColumnFX__Group_6__1 : rule__TableColumnFX__Group_6__1__Impl ;
    public final void rule__TableColumnFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8932:1: ( rule__TableColumnFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:8933:2: rule__TableColumnFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:8939:1: rule__TableColumnFX__Group_6__1__Impl : ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) ) ;
    public final void rule__TableColumnFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8943:1: ( ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:8944:1: ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:8944:1: ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) )
            // InternalJavaFXLang.g:8945:2: ( rule__TableColumnFX__UseFilterAssignment_6_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getUseFilterAssignment_6_1()); 
            // InternalJavaFXLang.g:8946:2: ( rule__TableColumnFX__UseFilterAssignment_6_1 )
            // InternalJavaFXLang.g:8946:3: rule__TableColumnFX__UseFilterAssignment_6_1
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
    // InternalJavaFXLang.g:8955:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8959:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalJavaFXLang.g:8960:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalJavaFXLang.g:8967:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8971:1: ( ( ( '-' )? ) )
            // InternalJavaFXLang.g:8972:1: ( ( '-' )? )
            {
            // InternalJavaFXLang.g:8972:1: ( ( '-' )? )
            // InternalJavaFXLang.g:8973:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalJavaFXLang.g:8974:2: ( '-' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==66) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalJavaFXLang.g:8974:3: '-'
                    {
                    match(input,66,FOLLOW_2); 

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
    // InternalJavaFXLang.g:8982:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8986:1: ( rule__EInt__Group__1__Impl )
            // InternalJavaFXLang.g:8987:2: rule__EInt__Group__1__Impl
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
    // InternalJavaFXLang.g:8993:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8997:1: ( ( RULE_INT ) )
            // InternalJavaFXLang.g:8998:1: ( RULE_INT )
            {
            // InternalJavaFXLang.g:8998:1: ( RULE_INT )
            // InternalJavaFXLang.g:8999:2: RULE_INT
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
    // InternalJavaFXLang.g:9009:1: rule__AttributeFX__Group__0 : rule__AttributeFX__Group__0__Impl rule__AttributeFX__Group__1 ;
    public final void rule__AttributeFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9013:1: ( rule__AttributeFX__Group__0__Impl rule__AttributeFX__Group__1 )
            // InternalJavaFXLang.g:9014:2: rule__AttributeFX__Group__0__Impl rule__AttributeFX__Group__1
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
    // InternalJavaFXLang.g:9021:1: rule__AttributeFX__Group__0__Impl : ( () ) ;
    public final void rule__AttributeFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9025:1: ( ( () ) )
            // InternalJavaFXLang.g:9026:1: ( () )
            {
            // InternalJavaFXLang.g:9026:1: ( () )
            // InternalJavaFXLang.g:9027:2: ()
            {
             before(grammarAccess.getAttributeFXAccess().getAttributeFXAction_0()); 
            // InternalJavaFXLang.g:9028:2: ()
            // InternalJavaFXLang.g:9028:3: 
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
    // InternalJavaFXLang.g:9036:1: rule__AttributeFX__Group__1 : rule__AttributeFX__Group__1__Impl rule__AttributeFX__Group__2 ;
    public final void rule__AttributeFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9040:1: ( rule__AttributeFX__Group__1__Impl rule__AttributeFX__Group__2 )
            // InternalJavaFXLang.g:9041:2: rule__AttributeFX__Group__1__Impl rule__AttributeFX__Group__2
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
    // InternalJavaFXLang.g:9048:1: rule__AttributeFX__Group__1__Impl : ( ( rule__AttributeFX__TypeAssignment_1 ) ) ;
    public final void rule__AttributeFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9052:1: ( ( ( rule__AttributeFX__TypeAssignment_1 ) ) )
            // InternalJavaFXLang.g:9053:1: ( ( rule__AttributeFX__TypeAssignment_1 ) )
            {
            // InternalJavaFXLang.g:9053:1: ( ( rule__AttributeFX__TypeAssignment_1 ) )
            // InternalJavaFXLang.g:9054:2: ( rule__AttributeFX__TypeAssignment_1 )
            {
             before(grammarAccess.getAttributeFXAccess().getTypeAssignment_1()); 
            // InternalJavaFXLang.g:9055:2: ( rule__AttributeFX__TypeAssignment_1 )
            // InternalJavaFXLang.g:9055:3: rule__AttributeFX__TypeAssignment_1
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
    // InternalJavaFXLang.g:9063:1: rule__AttributeFX__Group__2 : rule__AttributeFX__Group__2__Impl ;
    public final void rule__AttributeFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9067:1: ( rule__AttributeFX__Group__2__Impl )
            // InternalJavaFXLang.g:9068:2: rule__AttributeFX__Group__2__Impl
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
    // InternalJavaFXLang.g:9074:1: rule__AttributeFX__Group__2__Impl : ( ( rule__AttributeFX__NameAssignment_2 ) ) ;
    public final void rule__AttributeFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9078:1: ( ( ( rule__AttributeFX__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:9079:1: ( ( rule__AttributeFX__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:9079:1: ( ( rule__AttributeFX__NameAssignment_2 ) )
            // InternalJavaFXLang.g:9080:2: ( rule__AttributeFX__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeFXAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:9081:2: ( rule__AttributeFX__NameAssignment_2 )
            // InternalJavaFXLang.g:9081:3: rule__AttributeFX__NameAssignment_2
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
    // InternalJavaFXLang.g:9090:1: rule__ProjectFX__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ProjectFX__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9094:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9095:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9095:2: ( ruleEString )
            // InternalJavaFXLang.g:9096:3: ruleEString
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
    // InternalJavaFXLang.g:9105:1: rule__ProjectFX__PackagePathAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ProjectFX__PackagePathAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9109:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9110:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9110:2: ( ruleEString )
            // InternalJavaFXLang.g:9111:3: ruleEString
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
    // InternalJavaFXLang.g:9120:1: rule__ProjectFX__ControlsAssignment_5_2 : ( ruleControlFX ) ;
    public final void rule__ProjectFX__ControlsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9124:1: ( ( ruleControlFX ) )
            // InternalJavaFXLang.g:9125:2: ( ruleControlFX )
            {
            // InternalJavaFXLang.g:9125:2: ( ruleControlFX )
            // InternalJavaFXLang.g:9126:3: ruleControlFX
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
    // InternalJavaFXLang.g:9135:1: rule__ProjectFX__ControlsAssignment_5_3 : ( ruleControlFX ) ;
    public final void rule__ProjectFX__ControlsAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9139:1: ( ( ruleControlFX ) )
            // InternalJavaFXLang.g:9140:2: ( ruleControlFX )
            {
            // InternalJavaFXLang.g:9140:2: ( ruleControlFX )
            // InternalJavaFXLang.g:9141:3: ruleControlFX
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
    // InternalJavaFXLang.g:9150:1: rule__ProjectFX__ModelsAssignment_6_2 : ( ruleModelFX ) ;
    public final void rule__ProjectFX__ModelsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9154:1: ( ( ruleModelFX ) )
            // InternalJavaFXLang.g:9155:2: ( ruleModelFX )
            {
            // InternalJavaFXLang.g:9155:2: ( ruleModelFX )
            // InternalJavaFXLang.g:9156:3: ruleModelFX
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
    // InternalJavaFXLang.g:9165:1: rule__ProjectFX__ModelsAssignment_6_3 : ( ruleModelFX ) ;
    public final void rule__ProjectFX__ModelsAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9169:1: ( ( ruleModelFX ) )
            // InternalJavaFXLang.g:9170:2: ( ruleModelFX )
            {
            // InternalJavaFXLang.g:9170:2: ( ruleModelFX )
            // InternalJavaFXLang.g:9171:3: ruleModelFX
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
    // InternalJavaFXLang.g:9180:1: rule__ProjectFX__BindingsAssignment_7_2 : ( ruleBinding ) ;
    public final void rule__ProjectFX__BindingsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9184:1: ( ( ruleBinding ) )
            // InternalJavaFXLang.g:9185:2: ( ruleBinding )
            {
            // InternalJavaFXLang.g:9185:2: ( ruleBinding )
            // InternalJavaFXLang.g:9186:3: ruleBinding
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
    // InternalJavaFXLang.g:9195:1: rule__ProjectFX__BindingsAssignment_7_3 : ( ruleBinding ) ;
    public final void rule__ProjectFX__BindingsAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9199:1: ( ( ruleBinding ) )
            // InternalJavaFXLang.g:9200:2: ( ruleBinding )
            {
            // InternalJavaFXLang.g:9200:2: ( ruleBinding )
            // InternalJavaFXLang.g:9201:3: ruleBinding
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
    // InternalJavaFXLang.g:9210:1: rule__ProjectFX__ChartsAssignment_8_2 : ( ruleChartFX ) ;
    public final void rule__ProjectFX__ChartsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9214:1: ( ( ruleChartFX ) )
            // InternalJavaFXLang.g:9215:2: ( ruleChartFX )
            {
            // InternalJavaFXLang.g:9215:2: ( ruleChartFX )
            // InternalJavaFXLang.g:9216:3: ruleChartFX
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
    // InternalJavaFXLang.g:9225:1: rule__ProjectFX__ChartsAssignment_8_3 : ( ruleChartFX ) ;
    public final void rule__ProjectFX__ChartsAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9229:1: ( ( ruleChartFX ) )
            // InternalJavaFXLang.g:9230:2: ( ruleChartFX )
            {
            // InternalJavaFXLang.g:9230:2: ( ruleChartFX )
            // InternalJavaFXLang.g:9231:3: ruleChartFX
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
    // InternalJavaFXLang.g:9240:1: rule__BarChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__BarChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9244:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9245:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9245:2: ( ruleEString )
            // InternalJavaFXLang.g:9246:3: ruleEString
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
    // InternalJavaFXLang.g:9255:1: rule__BarChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__BarChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9259:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9260:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9260:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9261:3: ruleOrientation
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
    // InternalJavaFXLang.g:9270:1: rule__BarChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__BarChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9274:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:9275:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:9275:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:9276:3: ruleEBoolean
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
    // InternalJavaFXLang.g:9285:1: rule__BarChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__BarChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9289:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9290:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9290:2: ( ruleEString )
            // InternalJavaFXLang.g:9291:3: ruleEString
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
    // InternalJavaFXLang.g:9300:1: rule__BarChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__BarChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9304:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9305:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9305:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9306:3: ruleOrientation
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
    // InternalJavaFXLang.g:9315:1: rule__BarChartFX__XAxisLabelAssignment_9_1 : ( ruleEString ) ;
    public final void rule__BarChartFX__XAxisLabelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9319:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9320:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9320:2: ( ruleEString )
            // InternalJavaFXLang.g:9321:3: ruleEString
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
    // InternalJavaFXLang.g:9330:1: rule__BarChartFX__XAxisTypeAssignment_10_1 : ( ruleAxisType ) ;
    public final void rule__BarChartFX__XAxisTypeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9334:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9335:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9335:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9336:3: ruleAxisType
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
    // InternalJavaFXLang.g:9345:1: rule__BarChartFX__YAxisLabelAssignment_11_1 : ( ruleEString ) ;
    public final void rule__BarChartFX__YAxisLabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9349:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9350:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9350:2: ( ruleEString )
            // InternalJavaFXLang.g:9351:3: ruleEString
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
    // InternalJavaFXLang.g:9360:1: rule__BarChartFX__YAxisTypeAssignment_12_1 : ( ruleAxisType ) ;
    public final void rule__BarChartFX__YAxisTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9364:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9365:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9365:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9366:3: ruleAxisType
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
    // InternalJavaFXLang.g:9375:1: rule__ScatterChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__ScatterChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9379:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9380:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9380:2: ( ruleEString )
            // InternalJavaFXLang.g:9381:3: ruleEString
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
    // InternalJavaFXLang.g:9390:1: rule__ScatterChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__ScatterChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9394:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9395:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9395:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9396:3: ruleOrientation
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
    // InternalJavaFXLang.g:9405:1: rule__ScatterChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__ScatterChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9409:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:9410:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:9410:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:9411:3: ruleEBoolean
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
    // InternalJavaFXLang.g:9420:1: rule__ScatterChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__ScatterChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9424:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9425:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9425:2: ( ruleEString )
            // InternalJavaFXLang.g:9426:3: ruleEString
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
    // InternalJavaFXLang.g:9435:1: rule__ScatterChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__ScatterChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9439:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9440:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9440:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9441:3: ruleOrientation
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
    // InternalJavaFXLang.g:9450:1: rule__ScatterChartFX__XAxisLabelAssignment_9_1 : ( ruleEString ) ;
    public final void rule__ScatterChartFX__XAxisLabelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9454:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9455:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9455:2: ( ruleEString )
            // InternalJavaFXLang.g:9456:3: ruleEString
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
    // InternalJavaFXLang.g:9465:1: rule__ScatterChartFX__XAxisTypeAssignment_10_1 : ( ruleAxisType ) ;
    public final void rule__ScatterChartFX__XAxisTypeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9469:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9470:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9470:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9471:3: ruleAxisType
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
    // InternalJavaFXLang.g:9480:1: rule__ScatterChartFX__YAxisLabelAssignment_11_1 : ( ruleEString ) ;
    public final void rule__ScatterChartFX__YAxisLabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9484:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9485:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9485:2: ( ruleEString )
            // InternalJavaFXLang.g:9486:3: ruleEString
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
    // InternalJavaFXLang.g:9495:1: rule__ScatterChartFX__YAxisTypeAssignment_12_1 : ( ruleAxisType ) ;
    public final void rule__ScatterChartFX__YAxisTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9499:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9500:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9500:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9501:3: ruleAxisType
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
    // InternalJavaFXLang.g:9510:1: rule__BubbleChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__BubbleChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9514:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9515:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9515:2: ( ruleEString )
            // InternalJavaFXLang.g:9516:3: ruleEString
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
    // InternalJavaFXLang.g:9525:1: rule__BubbleChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__BubbleChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9529:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9530:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9530:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9531:3: ruleOrientation
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
    // InternalJavaFXLang.g:9540:1: rule__BubbleChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__BubbleChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9544:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:9545:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:9545:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:9546:3: ruleEBoolean
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
    // InternalJavaFXLang.g:9555:1: rule__BubbleChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__BubbleChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9559:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9560:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9560:2: ( ruleEString )
            // InternalJavaFXLang.g:9561:3: ruleEString
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
    // InternalJavaFXLang.g:9570:1: rule__BubbleChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__BubbleChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9574:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9575:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9575:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9576:3: ruleOrientation
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
    // InternalJavaFXLang.g:9585:1: rule__BubbleChartFX__XAxisLabelAssignment_9_1 : ( ruleEString ) ;
    public final void rule__BubbleChartFX__XAxisLabelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9589:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9590:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9590:2: ( ruleEString )
            // InternalJavaFXLang.g:9591:3: ruleEString
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
    // InternalJavaFXLang.g:9600:1: rule__BubbleChartFX__XAxisTypeAssignment_10_1 : ( ruleAxisType ) ;
    public final void rule__BubbleChartFX__XAxisTypeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9604:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9605:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9605:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9606:3: ruleAxisType
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
    // InternalJavaFXLang.g:9615:1: rule__BubbleChartFX__YAxisLabelAssignment_11_1 : ( ruleEString ) ;
    public final void rule__BubbleChartFX__YAxisLabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9619:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9620:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9620:2: ( ruleEString )
            // InternalJavaFXLang.g:9621:3: ruleEString
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
    // InternalJavaFXLang.g:9630:1: rule__BubbleChartFX__YAxisTypeAssignment_12_1 : ( ruleAxisType ) ;
    public final void rule__BubbleChartFX__YAxisTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9634:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9635:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9635:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9636:3: ruleAxisType
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
    // InternalJavaFXLang.g:9645:1: rule__AreaChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__AreaChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9649:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9650:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9650:2: ( ruleEString )
            // InternalJavaFXLang.g:9651:3: ruleEString
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
    // InternalJavaFXLang.g:9660:1: rule__AreaChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__AreaChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9664:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9665:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9665:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9666:3: ruleOrientation
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
    // InternalJavaFXLang.g:9675:1: rule__AreaChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__AreaChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9679:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:9680:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:9680:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:9681:3: ruleEBoolean
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
    // InternalJavaFXLang.g:9690:1: rule__AreaChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__AreaChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9694:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9695:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9695:2: ( ruleEString )
            // InternalJavaFXLang.g:9696:3: ruleEString
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
    // InternalJavaFXLang.g:9705:1: rule__AreaChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__AreaChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9709:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9710:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9710:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9711:3: ruleOrientation
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
    // InternalJavaFXLang.g:9720:1: rule__AreaChartFX__XAxisLabelAssignment_9_1 : ( ruleEString ) ;
    public final void rule__AreaChartFX__XAxisLabelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9724:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9725:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9725:2: ( ruleEString )
            // InternalJavaFXLang.g:9726:3: ruleEString
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
    // InternalJavaFXLang.g:9735:1: rule__AreaChartFX__XAxisTypeAssignment_10_1 : ( ruleAxisType ) ;
    public final void rule__AreaChartFX__XAxisTypeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9739:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9740:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9740:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9741:3: ruleAxisType
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
    // InternalJavaFXLang.g:9750:1: rule__AreaChartFX__YAxisLabelAssignment_11_1 : ( ruleEString ) ;
    public final void rule__AreaChartFX__YAxisLabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9754:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9755:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9755:2: ( ruleEString )
            // InternalJavaFXLang.g:9756:3: ruleEString
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
    // InternalJavaFXLang.g:9765:1: rule__AreaChartFX__YAxisTypeAssignment_12_1 : ( ruleAxisType ) ;
    public final void rule__AreaChartFX__YAxisTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9769:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9770:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9770:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9771:3: ruleAxisType
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
    // InternalJavaFXLang.g:9780:1: rule__PieChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__PieChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9784:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9785:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9785:2: ( ruleEString )
            // InternalJavaFXLang.g:9786:3: ruleEString
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
    // InternalJavaFXLang.g:9795:1: rule__PieChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__PieChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9799:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9800:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9800:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9801:3: ruleOrientation
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
    // InternalJavaFXLang.g:9810:1: rule__PieChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__PieChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9814:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:9815:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:9815:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:9816:3: ruleEBoolean
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
    // InternalJavaFXLang.g:9825:1: rule__PieChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__PieChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9829:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9830:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9830:2: ( ruleEString )
            // InternalJavaFXLang.g:9831:3: ruleEString
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
    // InternalJavaFXLang.g:9840:1: rule__PieChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__PieChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9844:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9845:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9845:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9846:3: ruleOrientation
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


    // $ANTLR start "rule__LineChartFX__NameAssignment_4"
    // InternalJavaFXLang.g:9855:1: rule__LineChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__LineChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9859:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9860:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9860:2: ( ruleEString )
            // InternalJavaFXLang.g:9861:3: ruleEString
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
    // InternalJavaFXLang.g:9870:1: rule__LineChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__LineChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9874:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9875:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9875:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9876:3: ruleOrientation
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
    // InternalJavaFXLang.g:9885:1: rule__LineChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__LineChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9889:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:9890:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:9890:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:9891:3: ruleEBoolean
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
    // InternalJavaFXLang.g:9900:1: rule__LineChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__LineChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9904:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9905:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9905:2: ( ruleEString )
            // InternalJavaFXLang.g:9906:3: ruleEString
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
    // InternalJavaFXLang.g:9915:1: rule__LineChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__LineChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9919:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9920:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9920:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9921:3: ruleOrientation
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
    // InternalJavaFXLang.g:9930:1: rule__LineChartFX__XAxisLabelAssignment_9_1 : ( ruleEString ) ;
    public final void rule__LineChartFX__XAxisLabelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9934:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9935:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9935:2: ( ruleEString )
            // InternalJavaFXLang.g:9936:3: ruleEString
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
    // InternalJavaFXLang.g:9945:1: rule__LineChartFX__XAxisTypeAssignment_10_1 : ( ruleAxisType ) ;
    public final void rule__LineChartFX__XAxisTypeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9949:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9950:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9950:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9951:3: ruleAxisType
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
    // InternalJavaFXLang.g:9960:1: rule__LineChartFX__YAxisLabelAssignment_11_1 : ( ruleEString ) ;
    public final void rule__LineChartFX__YAxisLabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9964:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9965:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9965:2: ( ruleEString )
            // InternalJavaFXLang.g:9966:3: ruleEString
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
    // InternalJavaFXLang.g:9975:1: rule__LineChartFX__YAxisTypeAssignment_12_1 : ( ruleAxisType ) ;
    public final void rule__LineChartFX__YAxisTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9979:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9980:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9980:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9981:3: ruleAxisType
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


    // $ANTLR start "rule__LineChartFX__SeriesAssignment_13_0"
    // InternalJavaFXLang.g:9990:1: rule__LineChartFX__SeriesAssignment_13_0 : ( ruleChartSeries ) ;
    public final void rule__LineChartFX__SeriesAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9994:1: ( ( ruleChartSeries ) )
            // InternalJavaFXLang.g:9995:2: ( ruleChartSeries )
            {
            // InternalJavaFXLang.g:9995:2: ( ruleChartSeries )
            // InternalJavaFXLang.g:9996:3: ruleChartSeries
            {
             before(grammarAccess.getLineChartFXAccess().getSeriesChartSeriesParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_2);
            ruleChartSeries();

            state._fsp--;

             after(grammarAccess.getLineChartFXAccess().getSeriesChartSeriesParserRuleCall_13_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChartFX__SeriesAssignment_13_0"


    // $ANTLR start "rule__LineChartFX__SeriesAssignment_13_1"
    // InternalJavaFXLang.g:10005:1: rule__LineChartFX__SeriesAssignment_13_1 : ( ruleChartSeries ) ;
    public final void rule__LineChartFX__SeriesAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10009:1: ( ( ruleChartSeries ) )
            // InternalJavaFXLang.g:10010:2: ( ruleChartSeries )
            {
            // InternalJavaFXLang.g:10010:2: ( ruleChartSeries )
            // InternalJavaFXLang.g:10011:3: ruleChartSeries
            {
             before(grammarAccess.getLineChartFXAccess().getSeriesChartSeriesParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleChartSeries();

            state._fsp--;

             after(grammarAccess.getLineChartFXAccess().getSeriesChartSeriesParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChartFX__SeriesAssignment_13_1"


    // $ANTLR start "rule__ChartSeries__NameAssignment_4"
    // InternalJavaFXLang.g:10020:1: rule__ChartSeries__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__ChartSeries__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10024:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10025:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10025:2: ( ruleEString )
            // InternalJavaFXLang.g:10026:3: ruleEString
            {
             before(grammarAccess.getChartSeriesAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChartSeriesAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__NameAssignment_4"


    // $ANTLR start "rule__ChartSeries__DataListAssignment_5_2_0"
    // InternalJavaFXLang.g:10035:1: rule__ChartSeries__DataListAssignment_5_2_0 : ( ruleChartFXData ) ;
    public final void rule__ChartSeries__DataListAssignment_5_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10039:1: ( ( ruleChartFXData ) )
            // InternalJavaFXLang.g:10040:2: ( ruleChartFXData )
            {
            // InternalJavaFXLang.g:10040:2: ( ruleChartFXData )
            // InternalJavaFXLang.g:10041:3: ruleChartFXData
            {
             before(grammarAccess.getChartSeriesAccess().getDataListChartFXDataParserRuleCall_5_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleChartFXData();

            state._fsp--;

             after(grammarAccess.getChartSeriesAccess().getDataListChartFXDataParserRuleCall_5_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__DataListAssignment_5_2_0"


    // $ANTLR start "rule__ChartSeries__DataListAssignment_5_2_1"
    // InternalJavaFXLang.g:10050:1: rule__ChartSeries__DataListAssignment_5_2_1 : ( ruleChartFXData ) ;
    public final void rule__ChartSeries__DataListAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10054:1: ( ( ruleChartFXData ) )
            // InternalJavaFXLang.g:10055:2: ( ruleChartFXData )
            {
            // InternalJavaFXLang.g:10055:2: ( ruleChartFXData )
            // InternalJavaFXLang.g:10056:3: ruleChartFXData
            {
             before(grammarAccess.getChartSeriesAccess().getDataListChartFXDataParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleChartFXData();

            state._fsp--;

             after(grammarAccess.getChartSeriesAccess().getDataListChartFXDataParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartSeries__DataListAssignment_5_2_1"


    // $ANTLR start "rule__ChartFXData__XValueAssignment_3"
    // InternalJavaFXLang.g:10065:1: rule__ChartFXData__XValueAssignment_3 : ( ruleEString ) ;
    public final void rule__ChartFXData__XValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10069:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10070:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10070:2: ( ruleEString )
            // InternalJavaFXLang.g:10071:3: ruleEString
            {
             before(grammarAccess.getChartFXDataAccess().getXValueEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChartFXDataAccess().getXValueEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartFXData__XValueAssignment_3"


    // $ANTLR start "rule__ChartFXData__YValueAssignment_5"
    // InternalJavaFXLang.g:10080:1: rule__ChartFXData__YValueAssignment_5 : ( ruleEString ) ;
    public final void rule__ChartFXData__YValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10084:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10085:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10085:2: ( ruleEString )
            // InternalJavaFXLang.g:10086:3: ruleEString
            {
             before(grammarAccess.getChartFXDataAccess().getYValueEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChartFXDataAccess().getYValueEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChartFXData__YValueAssignment_5"


    // $ANTLR start "rule__Binding__NameAssignment_2"
    // InternalJavaFXLang.g:10095:1: rule__Binding__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Binding__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10099:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10100:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10100:2: ( ruleEString )
            // InternalJavaFXLang.g:10101:3: ruleEString
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
    // InternalJavaFXLang.g:10110:1: rule__Binding__PropertyAssignment_4_0 : ( ruleBindingProperty ) ;
    public final void rule__Binding__PropertyAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10114:1: ( ( ruleBindingProperty ) )
            // InternalJavaFXLang.g:10115:2: ( ruleBindingProperty )
            {
            // InternalJavaFXLang.g:10115:2: ( ruleBindingProperty )
            // InternalJavaFXLang.g:10116:3: ruleBindingProperty
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
    // InternalJavaFXLang.g:10125:1: rule__Binding__PropertyAssignment_4_1 : ( ruleBindingProperty ) ;
    public final void rule__Binding__PropertyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10129:1: ( ( ruleBindingProperty ) )
            // InternalJavaFXLang.g:10130:2: ( ruleBindingProperty )
            {
            // InternalJavaFXLang.g:10130:2: ( ruleBindingProperty )
            // InternalJavaFXLang.g:10131:3: ruleBindingProperty
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
    // InternalJavaFXLang.g:10140:1: rule__BindingProperty__TypeAssignment_1 : ( ruleBindinType ) ;
    public final void rule__BindingProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10144:1: ( ( ruleBindinType ) )
            // InternalJavaFXLang.g:10145:2: ( ruleBindinType )
            {
            // InternalJavaFXLang.g:10145:2: ( ruleBindinType )
            // InternalJavaFXLang.g:10146:3: ruleBindinType
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
    // InternalJavaFXLang.g:10155:1: rule__BindingProperty__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BindingProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10159:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10160:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10160:2: ( ruleEString )
            // InternalJavaFXLang.g:10161:3: ruleEString
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
    // InternalJavaFXLang.g:10170:1: rule__FilteredTableViewFX__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__FilteredTableViewFX__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10174:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10175:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10175:2: ( ruleEString )
            // InternalJavaFXLang.g:10176:3: ruleEString
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
    // InternalJavaFXLang.g:10185:1: rule__FilteredTableViewFX__UsedModelAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__FilteredTableViewFX__UsedModelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10189:1: ( ( ( ruleEString ) ) )
            // InternalJavaFXLang.g:10190:2: ( ( ruleEString ) )
            {
            // InternalJavaFXLang.g:10190:2: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10191:3: ( ruleEString )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUsedModelModelFXCrossReference_4_1_0()); 
            // InternalJavaFXLang.g:10192:3: ( ruleEString )
            // InternalJavaFXLang.g:10193:4: ruleEString
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
    // InternalJavaFXLang.g:10204:1: rule__FilteredTableViewFX__UseFilterAssignment_5_1 : ( ruleEBoolean ) ;
    public final void rule__FilteredTableViewFX__UseFilterAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10208:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:10209:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:10209:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:10210:3: ruleEBoolean
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
    // InternalJavaFXLang.g:10219:1: rule__FilteredTableViewFX__ColumnsAssignment_6_0 : ( ruleTableColumnFX ) ;
    public final void rule__FilteredTableViewFX__ColumnsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10223:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:10224:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:10224:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:10225:3: ruleTableColumnFX
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
    // InternalJavaFXLang.g:10234:1: rule__FilteredTableViewFX__ColumnsAssignment_6_1 : ( ruleTableColumnFX ) ;
    public final void rule__FilteredTableViewFX__ColumnsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10238:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:10239:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:10239:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:10240:3: ruleTableColumnFX
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
    // InternalJavaFXLang.g:10249:1: rule__DerivedBean__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DerivedBean__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10253:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10254:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10254:2: ( ruleEString )
            // InternalJavaFXLang.g:10255:3: ruleEString
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
    // InternalJavaFXLang.g:10264:1: rule__DerivedBean__InstanceTypeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__DerivedBean__InstanceTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10268:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10269:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10269:2: ( ruleEString )
            // InternalJavaFXLang.g:10270:3: ruleEString
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
    // InternalJavaFXLang.g:10279:1: rule__DerivedBean__AttributesAssignment_5_0 : ( ruleAttributeFX ) ;
    public final void rule__DerivedBean__AttributesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10283:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:10284:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:10284:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:10285:3: ruleAttributeFX
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
    // InternalJavaFXLang.g:10294:1: rule__DerivedBean__AttributesAssignment_5_1 : ( ruleAttributeFX ) ;
    public final void rule__DerivedBean__AttributesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10298:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:10299:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:10299:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:10300:3: ruleAttributeFX
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
    // InternalJavaFXLang.g:10309:1: rule__Bean__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Bean__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10313:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10314:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10314:2: ( ruleEString )
            // InternalJavaFXLang.g:10315:3: ruleEString
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
    // InternalJavaFXLang.g:10324:1: rule__Bean__AttributesAssignment_4_0 : ( ruleAttributeFX ) ;
    public final void rule__Bean__AttributesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10328:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:10329:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:10329:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:10330:3: ruleAttributeFX
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
    // InternalJavaFXLang.g:10339:1: rule__Bean__AttributesAssignment_4_1 : ( ruleAttributeFX ) ;
    public final void rule__Bean__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10343:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:10344:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:10344:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:10345:3: ruleAttributeFX
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
    // InternalJavaFXLang.g:10354:1: rule__TableViewFX__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__TableViewFX__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10358:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10359:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10359:2: ( ruleEString )
            // InternalJavaFXLang.g:10360:3: ruleEString
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
    // InternalJavaFXLang.g:10369:1: rule__TableViewFX__UsedModelAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__TableViewFX__UsedModelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10373:1: ( ( ( ruleEString ) ) )
            // InternalJavaFXLang.g:10374:2: ( ( ruleEString ) )
            {
            // InternalJavaFXLang.g:10374:2: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10375:3: ( ruleEString )
            {
             before(grammarAccess.getTableViewFXAccess().getUsedModelModelFXCrossReference_4_1_0()); 
            // InternalJavaFXLang.g:10376:3: ( ruleEString )
            // InternalJavaFXLang.g:10377:4: ruleEString
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
    // InternalJavaFXLang.g:10388:1: rule__TableViewFX__ColumnsAssignment_5_0 : ( ruleTableColumnFX ) ;
    public final void rule__TableViewFX__ColumnsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10392:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:10393:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:10393:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:10394:3: ruleTableColumnFX
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
    // InternalJavaFXLang.g:10403:1: rule__TableViewFX__ColumnsAssignment_5_1 : ( ruleTableColumnFX ) ;
    public final void rule__TableViewFX__ColumnsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10407:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:10408:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:10408:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:10409:3: ruleTableColumnFX
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
    // InternalJavaFXLang.g:10418:1: rule__TableColumnFX__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__TableColumnFX__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10422:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10423:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10423:2: ( ruleEString )
            // InternalJavaFXLang.g:10424:3: ruleEString
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
    // InternalJavaFXLang.g:10433:1: rule__TableColumnFX__WidthAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__TableColumnFX__WidthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10437:1: ( ( ruleEInt ) )
            // InternalJavaFXLang.g:10438:2: ( ruleEInt )
            {
            // InternalJavaFXLang.g:10438:2: ( ruleEInt )
            // InternalJavaFXLang.g:10439:3: ruleEInt
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
    // InternalJavaFXLang.g:10448:1: rule__TableColumnFX__UsedAttributeAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__TableColumnFX__UsedAttributeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10452:1: ( ( ( ruleEString ) ) )
            // InternalJavaFXLang.g:10453:2: ( ( ruleEString ) )
            {
            // InternalJavaFXLang.g:10453:2: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10454:3: ( ruleEString )
            {
             before(grammarAccess.getTableColumnFXAccess().getUsedAttributeAttributeFXCrossReference_5_1_0()); 
            // InternalJavaFXLang.g:10455:3: ( ruleEString )
            // InternalJavaFXLang.g:10456:4: ruleEString
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
    // InternalJavaFXLang.g:10467:1: rule__TableColumnFX__UseFilterAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__TableColumnFX__UseFilterAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10471:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:10472:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:10472:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:10473:3: ruleEBoolean
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
    // InternalJavaFXLang.g:10482:1: rule__AttributeFX__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__AttributeFX__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10486:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10487:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10487:2: ( ruleEString )
            // InternalJavaFXLang.g:10488:3: ruleEString
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
    // InternalJavaFXLang.g:10497:1: rule__AttributeFX__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__AttributeFX__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10501:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10502:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10502:2: ( ruleEString )
            // InternalJavaFXLang.g:10503:3: ruleEString
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x2100000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x2100000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x2100000000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0800000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0080000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0080000000000002L});
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
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000F010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00020FF010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0004000010000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000013F80000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000003F80000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000003F80002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x4600000010000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x4200000010000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x8040000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000004L});

}