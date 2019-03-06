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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Category'", "'Number'", "'Bottom'", "'Left'", "'Right'", "'Top'", "'BooleanProperty'", "'DoubleProperty'", "'FloatProperty'", "'IntegerProperty'", "'ObservableList'", "'ObjectProperty'", "'StringProperty'", "'ProjectFX'", "'{'", "'}'", "'packagePath'", "'controls'", "'models'", "'bindings'", "'charts'", "'BarChart'", "'name:'", "'legendSide:'", "'showLegend:'", "'title:'", "'titleSide:'", "'xAxisLabel:'", "'xAxisType:'", "'yAxisLabel:'", "'yAxisType:'", "'ScatterChart'", "'BubbleChart'", "'AreaChart'", "'PieChart'", "'LineChart'", "'dataList'", "'data'", "'('", "','", "')'", "'binding'", "'FilteredTableView'", "'usedModel:'", "'usedFilter:'", "'class'", "'instanceType:'", "'TableView'", "'Column'", "'width:'", "'attribute:'", "'useFilter:'", "'-'"
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


    // $ANTLR start "entryRuleChartFXData"
    // InternalJavaFXLang.g:253:1: entryRuleChartFXData : ruleChartFXData EOF ;
    public final void entryRuleChartFXData() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:254:1: ( ruleChartFXData EOF )
            // InternalJavaFXLang.g:255:1: ruleChartFXData EOF
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
    // InternalJavaFXLang.g:262:1: ruleChartFXData : ( ( rule__ChartFXData__Group__0 ) ) ;
    public final void ruleChartFXData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:266:2: ( ( ( rule__ChartFXData__Group__0 ) ) )
            // InternalJavaFXLang.g:267:2: ( ( rule__ChartFXData__Group__0 ) )
            {
            // InternalJavaFXLang.g:267:2: ( ( rule__ChartFXData__Group__0 ) )
            // InternalJavaFXLang.g:268:3: ( rule__ChartFXData__Group__0 )
            {
             before(grammarAccess.getChartFXDataAccess().getGroup()); 
            // InternalJavaFXLang.g:269:3: ( rule__ChartFXData__Group__0 )
            // InternalJavaFXLang.g:269:4: rule__ChartFXData__Group__0
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
    // InternalJavaFXLang.g:278:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:279:1: ( ruleBinding EOF )
            // InternalJavaFXLang.g:280:1: ruleBinding EOF
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
    // InternalJavaFXLang.g:287:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:291:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalJavaFXLang.g:292:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalJavaFXLang.g:292:2: ( ( rule__Binding__Group__0 ) )
            // InternalJavaFXLang.g:293:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalJavaFXLang.g:294:3: ( rule__Binding__Group__0 )
            // InternalJavaFXLang.g:294:4: rule__Binding__Group__0
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
    // InternalJavaFXLang.g:303:1: entryRuleBindingProperty : ruleBindingProperty EOF ;
    public final void entryRuleBindingProperty() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:304:1: ( ruleBindingProperty EOF )
            // InternalJavaFXLang.g:305:1: ruleBindingProperty EOF
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
    // InternalJavaFXLang.g:312:1: ruleBindingProperty : ( ( rule__BindingProperty__Group__0 ) ) ;
    public final void ruleBindingProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:316:2: ( ( ( rule__BindingProperty__Group__0 ) ) )
            // InternalJavaFXLang.g:317:2: ( ( rule__BindingProperty__Group__0 ) )
            {
            // InternalJavaFXLang.g:317:2: ( ( rule__BindingProperty__Group__0 ) )
            // InternalJavaFXLang.g:318:3: ( rule__BindingProperty__Group__0 )
            {
             before(grammarAccess.getBindingPropertyAccess().getGroup()); 
            // InternalJavaFXLang.g:319:3: ( rule__BindingProperty__Group__0 )
            // InternalJavaFXLang.g:319:4: rule__BindingProperty__Group__0
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
    // InternalJavaFXLang.g:328:1: entryRuleControlFX : ruleControlFX EOF ;
    public final void entryRuleControlFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:329:1: ( ruleControlFX EOF )
            // InternalJavaFXLang.g:330:1: ruleControlFX EOF
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
    // InternalJavaFXLang.g:337:1: ruleControlFX : ( ( rule__ControlFX__Alternatives ) ) ;
    public final void ruleControlFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:341:2: ( ( ( rule__ControlFX__Alternatives ) ) )
            // InternalJavaFXLang.g:342:2: ( ( rule__ControlFX__Alternatives ) )
            {
            // InternalJavaFXLang.g:342:2: ( ( rule__ControlFX__Alternatives ) )
            // InternalJavaFXLang.g:343:3: ( rule__ControlFX__Alternatives )
            {
             before(grammarAccess.getControlFXAccess().getAlternatives()); 
            // InternalJavaFXLang.g:344:3: ( rule__ControlFX__Alternatives )
            // InternalJavaFXLang.g:344:4: rule__ControlFX__Alternatives
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
    // InternalJavaFXLang.g:353:1: entryRuleFilteredTableViewFX : ruleFilteredTableViewFX EOF ;
    public final void entryRuleFilteredTableViewFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:354:1: ( ruleFilteredTableViewFX EOF )
            // InternalJavaFXLang.g:355:1: ruleFilteredTableViewFX EOF
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
    // InternalJavaFXLang.g:362:1: ruleFilteredTableViewFX : ( ( rule__FilteredTableViewFX__Group__0 ) ) ;
    public final void ruleFilteredTableViewFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:366:2: ( ( ( rule__FilteredTableViewFX__Group__0 ) ) )
            // InternalJavaFXLang.g:367:2: ( ( rule__FilteredTableViewFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:367:2: ( ( rule__FilteredTableViewFX__Group__0 ) )
            // InternalJavaFXLang.g:368:3: ( rule__FilteredTableViewFX__Group__0 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup()); 
            // InternalJavaFXLang.g:369:3: ( rule__FilteredTableViewFX__Group__0 )
            // InternalJavaFXLang.g:369:4: rule__FilteredTableViewFX__Group__0
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
    // InternalJavaFXLang.g:378:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:379:1: ( ruleEString EOF )
            // InternalJavaFXLang.g:380:1: ruleEString EOF
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
    // InternalJavaFXLang.g:387:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:391:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalJavaFXLang.g:392:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalJavaFXLang.g:392:2: ( ( rule__EString__Alternatives ) )
            // InternalJavaFXLang.g:393:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalJavaFXLang.g:394:3: ( rule__EString__Alternatives )
            // InternalJavaFXLang.g:394:4: rule__EString__Alternatives
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
    // InternalJavaFXLang.g:403:1: entryRuleModelFX : ruleModelFX EOF ;
    public final void entryRuleModelFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:404:1: ( ruleModelFX EOF )
            // InternalJavaFXLang.g:405:1: ruleModelFX EOF
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
    // InternalJavaFXLang.g:412:1: ruleModelFX : ( ( rule__ModelFX__Alternatives ) ) ;
    public final void ruleModelFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:416:2: ( ( ( rule__ModelFX__Alternatives ) ) )
            // InternalJavaFXLang.g:417:2: ( ( rule__ModelFX__Alternatives ) )
            {
            // InternalJavaFXLang.g:417:2: ( ( rule__ModelFX__Alternatives ) )
            // InternalJavaFXLang.g:418:3: ( rule__ModelFX__Alternatives )
            {
             before(grammarAccess.getModelFXAccess().getAlternatives()); 
            // InternalJavaFXLang.g:419:3: ( rule__ModelFX__Alternatives )
            // InternalJavaFXLang.g:419:4: rule__ModelFX__Alternatives
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
    // InternalJavaFXLang.g:428:1: entryRuleDerivedBean : ruleDerivedBean EOF ;
    public final void entryRuleDerivedBean() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:429:1: ( ruleDerivedBean EOF )
            // InternalJavaFXLang.g:430:1: ruleDerivedBean EOF
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
    // InternalJavaFXLang.g:437:1: ruleDerivedBean : ( ( rule__DerivedBean__Group__0 ) ) ;
    public final void ruleDerivedBean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:441:2: ( ( ( rule__DerivedBean__Group__0 ) ) )
            // InternalJavaFXLang.g:442:2: ( ( rule__DerivedBean__Group__0 ) )
            {
            // InternalJavaFXLang.g:442:2: ( ( rule__DerivedBean__Group__0 ) )
            // InternalJavaFXLang.g:443:3: ( rule__DerivedBean__Group__0 )
            {
             before(grammarAccess.getDerivedBeanAccess().getGroup()); 
            // InternalJavaFXLang.g:444:3: ( rule__DerivedBean__Group__0 )
            // InternalJavaFXLang.g:444:4: rule__DerivedBean__Group__0
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
    // InternalJavaFXLang.g:453:1: entryRuleBean : ruleBean EOF ;
    public final void entryRuleBean() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:454:1: ( ruleBean EOF )
            // InternalJavaFXLang.g:455:1: ruleBean EOF
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
    // InternalJavaFXLang.g:462:1: ruleBean : ( ( rule__Bean__Group__0 ) ) ;
    public final void ruleBean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:466:2: ( ( ( rule__Bean__Group__0 ) ) )
            // InternalJavaFXLang.g:467:2: ( ( rule__Bean__Group__0 ) )
            {
            // InternalJavaFXLang.g:467:2: ( ( rule__Bean__Group__0 ) )
            // InternalJavaFXLang.g:468:3: ( rule__Bean__Group__0 )
            {
             before(grammarAccess.getBeanAccess().getGroup()); 
            // InternalJavaFXLang.g:469:3: ( rule__Bean__Group__0 )
            // InternalJavaFXLang.g:469:4: rule__Bean__Group__0
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
    // InternalJavaFXLang.g:478:1: entryRuleTableViewFX : ruleTableViewFX EOF ;
    public final void entryRuleTableViewFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:479:1: ( ruleTableViewFX EOF )
            // InternalJavaFXLang.g:480:1: ruleTableViewFX EOF
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
    // InternalJavaFXLang.g:487:1: ruleTableViewFX : ( ( rule__TableViewFX__Group__0 ) ) ;
    public final void ruleTableViewFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:491:2: ( ( ( rule__TableViewFX__Group__0 ) ) )
            // InternalJavaFXLang.g:492:2: ( ( rule__TableViewFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:492:2: ( ( rule__TableViewFX__Group__0 ) )
            // InternalJavaFXLang.g:493:3: ( rule__TableViewFX__Group__0 )
            {
             before(grammarAccess.getTableViewFXAccess().getGroup()); 
            // InternalJavaFXLang.g:494:3: ( rule__TableViewFX__Group__0 )
            // InternalJavaFXLang.g:494:4: rule__TableViewFX__Group__0
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
    // InternalJavaFXLang.g:503:1: entryRuleTableColumnFX : ruleTableColumnFX EOF ;
    public final void entryRuleTableColumnFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:504:1: ( ruleTableColumnFX EOF )
            // InternalJavaFXLang.g:505:1: ruleTableColumnFX EOF
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
    // InternalJavaFXLang.g:512:1: ruleTableColumnFX : ( ( rule__TableColumnFX__Group__0 ) ) ;
    public final void ruleTableColumnFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:516:2: ( ( ( rule__TableColumnFX__Group__0 ) ) )
            // InternalJavaFXLang.g:517:2: ( ( rule__TableColumnFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:517:2: ( ( rule__TableColumnFX__Group__0 ) )
            // InternalJavaFXLang.g:518:3: ( rule__TableColumnFX__Group__0 )
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup()); 
            // InternalJavaFXLang.g:519:3: ( rule__TableColumnFX__Group__0 )
            // InternalJavaFXLang.g:519:4: rule__TableColumnFX__Group__0
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
    // InternalJavaFXLang.g:528:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:529:1: ( ruleEBoolean EOF )
            // InternalJavaFXLang.g:530:1: ruleEBoolean EOF
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
    // InternalJavaFXLang.g:537:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:541:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalJavaFXLang.g:542:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalJavaFXLang.g:542:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalJavaFXLang.g:543:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalJavaFXLang.g:544:3: ( rule__EBoolean__Alternatives )
            // InternalJavaFXLang.g:544:4: rule__EBoolean__Alternatives
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
    // InternalJavaFXLang.g:553:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:554:1: ( ruleEInt EOF )
            // InternalJavaFXLang.g:555:1: ruleEInt EOF
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
    // InternalJavaFXLang.g:562:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:566:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalJavaFXLang.g:567:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalJavaFXLang.g:567:2: ( ( rule__EInt__Group__0 ) )
            // InternalJavaFXLang.g:568:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalJavaFXLang.g:569:3: ( rule__EInt__Group__0 )
            // InternalJavaFXLang.g:569:4: rule__EInt__Group__0
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
    // InternalJavaFXLang.g:578:1: entryRuleAttributeFX : ruleAttributeFX EOF ;
    public final void entryRuleAttributeFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:579:1: ( ruleAttributeFX EOF )
            // InternalJavaFXLang.g:580:1: ruleAttributeFX EOF
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
    // InternalJavaFXLang.g:587:1: ruleAttributeFX : ( ( rule__AttributeFX__Group__0 ) ) ;
    public final void ruleAttributeFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:591:2: ( ( ( rule__AttributeFX__Group__0 ) ) )
            // InternalJavaFXLang.g:592:2: ( ( rule__AttributeFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:592:2: ( ( rule__AttributeFX__Group__0 ) )
            // InternalJavaFXLang.g:593:3: ( rule__AttributeFX__Group__0 )
            {
             before(grammarAccess.getAttributeFXAccess().getGroup()); 
            // InternalJavaFXLang.g:594:3: ( rule__AttributeFX__Group__0 )
            // InternalJavaFXLang.g:594:4: rule__AttributeFX__Group__0
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
    // InternalJavaFXLang.g:603:1: ruleAxisType : ( ( rule__AxisType__Alternatives ) ) ;
    public final void ruleAxisType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:607:1: ( ( ( rule__AxisType__Alternatives ) ) )
            // InternalJavaFXLang.g:608:2: ( ( rule__AxisType__Alternatives ) )
            {
            // InternalJavaFXLang.g:608:2: ( ( rule__AxisType__Alternatives ) )
            // InternalJavaFXLang.g:609:3: ( rule__AxisType__Alternatives )
            {
             before(grammarAccess.getAxisTypeAccess().getAlternatives()); 
            // InternalJavaFXLang.g:610:3: ( rule__AxisType__Alternatives )
            // InternalJavaFXLang.g:610:4: rule__AxisType__Alternatives
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
    // InternalJavaFXLang.g:619:1: ruleOrientation : ( ( rule__Orientation__Alternatives ) ) ;
    public final void ruleOrientation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:623:1: ( ( ( rule__Orientation__Alternatives ) ) )
            // InternalJavaFXLang.g:624:2: ( ( rule__Orientation__Alternatives ) )
            {
            // InternalJavaFXLang.g:624:2: ( ( rule__Orientation__Alternatives ) )
            // InternalJavaFXLang.g:625:3: ( rule__Orientation__Alternatives )
            {
             before(grammarAccess.getOrientationAccess().getAlternatives()); 
            // InternalJavaFXLang.g:626:3: ( rule__Orientation__Alternatives )
            // InternalJavaFXLang.g:626:4: rule__Orientation__Alternatives
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
    // InternalJavaFXLang.g:635:1: ruleBindinType : ( ( rule__BindinType__Alternatives ) ) ;
    public final void ruleBindinType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:639:1: ( ( ( rule__BindinType__Alternatives ) ) )
            // InternalJavaFXLang.g:640:2: ( ( rule__BindinType__Alternatives ) )
            {
            // InternalJavaFXLang.g:640:2: ( ( rule__BindinType__Alternatives ) )
            // InternalJavaFXLang.g:641:3: ( rule__BindinType__Alternatives )
            {
             before(grammarAccess.getBindinTypeAccess().getAlternatives()); 
            // InternalJavaFXLang.g:642:3: ( rule__BindinType__Alternatives )
            // InternalJavaFXLang.g:642:4: rule__BindinType__Alternatives
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
    // InternalJavaFXLang.g:650:1: rule__ChartFX__Alternatives : ( ( ruleLineChartFX ) | ( rulePieChartFX ) | ( ruleAreaChartFX ) | ( ruleBubbleChartFX ) | ( ruleScatterChartFX ) | ( ruleBarChartFX ) );
    public final void rule__ChartFX__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:654:1: ( ( ruleLineChartFX ) | ( rulePieChartFX ) | ( ruleAreaChartFX ) | ( ruleBubbleChartFX ) | ( ruleScatterChartFX ) | ( ruleBarChartFX ) )
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
                    // InternalJavaFXLang.g:655:2: ( ruleLineChartFX )
                    {
                    // InternalJavaFXLang.g:655:2: ( ruleLineChartFX )
                    // InternalJavaFXLang.g:656:3: ruleLineChartFX
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
                    // InternalJavaFXLang.g:661:2: ( rulePieChartFX )
                    {
                    // InternalJavaFXLang.g:661:2: ( rulePieChartFX )
                    // InternalJavaFXLang.g:662:3: rulePieChartFX
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
                    // InternalJavaFXLang.g:667:2: ( ruleAreaChartFX )
                    {
                    // InternalJavaFXLang.g:667:2: ( ruleAreaChartFX )
                    // InternalJavaFXLang.g:668:3: ruleAreaChartFX
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
                    // InternalJavaFXLang.g:673:2: ( ruleBubbleChartFX )
                    {
                    // InternalJavaFXLang.g:673:2: ( ruleBubbleChartFX )
                    // InternalJavaFXLang.g:674:3: ruleBubbleChartFX
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
                    // InternalJavaFXLang.g:679:2: ( ruleScatterChartFX )
                    {
                    // InternalJavaFXLang.g:679:2: ( ruleScatterChartFX )
                    // InternalJavaFXLang.g:680:3: ruleScatterChartFX
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
                    // InternalJavaFXLang.g:685:2: ( ruleBarChartFX )
                    {
                    // InternalJavaFXLang.g:685:2: ( ruleBarChartFX )
                    // InternalJavaFXLang.g:686:3: ruleBarChartFX
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
    // InternalJavaFXLang.g:695:1: rule__ControlFX__Alternatives : ( ( ruleTableViewFX ) | ( ruleFilteredTableViewFX ) );
    public final void rule__ControlFX__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:699:1: ( ( ruleTableViewFX ) | ( ruleFilteredTableViewFX ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==60) ) {
                alt2=1;
            }
            else if ( (LA2_0==55) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJavaFXLang.g:700:2: ( ruleTableViewFX )
                    {
                    // InternalJavaFXLang.g:700:2: ( ruleTableViewFX )
                    // InternalJavaFXLang.g:701:3: ruleTableViewFX
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
                    // InternalJavaFXLang.g:706:2: ( ruleFilteredTableViewFX )
                    {
                    // InternalJavaFXLang.g:706:2: ( ruleFilteredTableViewFX )
                    // InternalJavaFXLang.g:707:3: ruleFilteredTableViewFX
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
    // InternalJavaFXLang.g:716:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:720:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalJavaFXLang.g:721:2: ( RULE_STRING )
                    {
                    // InternalJavaFXLang.g:721:2: ( RULE_STRING )
                    // InternalJavaFXLang.g:722:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:727:2: ( RULE_ID )
                    {
                    // InternalJavaFXLang.g:727:2: ( RULE_ID )
                    // InternalJavaFXLang.g:728:3: RULE_ID
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
    // InternalJavaFXLang.g:737:1: rule__ModelFX__Alternatives : ( ( ruleDerivedBean ) | ( ruleBean ) );
    public final void rule__ModelFX__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:741:1: ( ( ruleDerivedBean ) | ( ruleBean ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==58) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_STRING) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==27) ) {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4==59) ) {
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

                        if ( (LA4_4==59) ) {
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
                    // InternalJavaFXLang.g:742:2: ( ruleDerivedBean )
                    {
                    // InternalJavaFXLang.g:742:2: ( ruleDerivedBean )
                    // InternalJavaFXLang.g:743:3: ruleDerivedBean
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
                    // InternalJavaFXLang.g:748:2: ( ruleBean )
                    {
                    // InternalJavaFXLang.g:748:2: ( ruleBean )
                    // InternalJavaFXLang.g:749:3: ruleBean
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
    // InternalJavaFXLang.g:758:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:762:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalJavaFXLang.g:763:2: ( 'true' )
                    {
                    // InternalJavaFXLang.g:763:2: ( 'true' )
                    // InternalJavaFXLang.g:764:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:769:2: ( 'false' )
                    {
                    // InternalJavaFXLang.g:769:2: ( 'false' )
                    // InternalJavaFXLang.g:770:3: 'false'
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
    // InternalJavaFXLang.g:779:1: rule__AxisType__Alternatives : ( ( ( 'Category' ) ) | ( ( 'Number' ) ) );
    public final void rule__AxisType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:783:1: ( ( ( 'Category' ) ) | ( ( 'Number' ) ) )
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
                    // InternalJavaFXLang.g:784:2: ( ( 'Category' ) )
                    {
                    // InternalJavaFXLang.g:784:2: ( ( 'Category' ) )
                    // InternalJavaFXLang.g:785:3: ( 'Category' )
                    {
                     before(grammarAccess.getAxisTypeAccess().getCategoryEnumLiteralDeclaration_0()); 
                    // InternalJavaFXLang.g:786:3: ( 'Category' )
                    // InternalJavaFXLang.g:786:4: 'Category'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAxisTypeAccess().getCategoryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:790:2: ( ( 'Number' ) )
                    {
                    // InternalJavaFXLang.g:790:2: ( ( 'Number' ) )
                    // InternalJavaFXLang.g:791:3: ( 'Number' )
                    {
                     before(grammarAccess.getAxisTypeAccess().getNumberEnumLiteralDeclaration_1()); 
                    // InternalJavaFXLang.g:792:3: ( 'Number' )
                    // InternalJavaFXLang.g:792:4: 'Number'
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
    // InternalJavaFXLang.g:800:1: rule__Orientation__Alternatives : ( ( ( 'Bottom' ) ) | ( ( 'Left' ) ) | ( ( 'Right' ) ) | ( ( 'Top' ) ) );
    public final void rule__Orientation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:804:1: ( ( ( 'Bottom' ) ) | ( ( 'Left' ) ) | ( ( 'Right' ) ) | ( ( 'Top' ) ) )
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
                    // InternalJavaFXLang.g:805:2: ( ( 'Bottom' ) )
                    {
                    // InternalJavaFXLang.g:805:2: ( ( 'Bottom' ) )
                    // InternalJavaFXLang.g:806:3: ( 'Bottom' )
                    {
                     before(grammarAccess.getOrientationAccess().getBottomEnumLiteralDeclaration_0()); 
                    // InternalJavaFXLang.g:807:3: ( 'Bottom' )
                    // InternalJavaFXLang.g:807:4: 'Bottom'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrientationAccess().getBottomEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:811:2: ( ( 'Left' ) )
                    {
                    // InternalJavaFXLang.g:811:2: ( ( 'Left' ) )
                    // InternalJavaFXLang.g:812:3: ( 'Left' )
                    {
                     before(grammarAccess.getOrientationAccess().getLeftEnumLiteralDeclaration_1()); 
                    // InternalJavaFXLang.g:813:3: ( 'Left' )
                    // InternalJavaFXLang.g:813:4: 'Left'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrientationAccess().getLeftEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJavaFXLang.g:817:2: ( ( 'Right' ) )
                    {
                    // InternalJavaFXLang.g:817:2: ( ( 'Right' ) )
                    // InternalJavaFXLang.g:818:3: ( 'Right' )
                    {
                     before(grammarAccess.getOrientationAccess().getRightEnumLiteralDeclaration_2()); 
                    // InternalJavaFXLang.g:819:3: ( 'Right' )
                    // InternalJavaFXLang.g:819:4: 'Right'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrientationAccess().getRightEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJavaFXLang.g:823:2: ( ( 'Top' ) )
                    {
                    // InternalJavaFXLang.g:823:2: ( ( 'Top' ) )
                    // InternalJavaFXLang.g:824:3: ( 'Top' )
                    {
                     before(grammarAccess.getOrientationAccess().getTopEnumLiteralDeclaration_3()); 
                    // InternalJavaFXLang.g:825:3: ( 'Top' )
                    // InternalJavaFXLang.g:825:4: 'Top'
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
    // InternalJavaFXLang.g:833:1: rule__BindinType__Alternatives : ( ( ( 'BooleanProperty' ) ) | ( ( 'DoubleProperty' ) ) | ( ( 'FloatProperty' ) ) | ( ( 'IntegerProperty' ) ) | ( ( 'ObservableList' ) ) | ( ( 'ObjectProperty' ) ) | ( ( 'StringProperty' ) ) );
    public final void rule__BindinType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:837:1: ( ( ( 'BooleanProperty' ) ) | ( ( 'DoubleProperty' ) ) | ( ( 'FloatProperty' ) ) | ( ( 'IntegerProperty' ) ) | ( ( 'ObservableList' ) ) | ( ( 'ObjectProperty' ) ) | ( ( 'StringProperty' ) ) )
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
                    // InternalJavaFXLang.g:838:2: ( ( 'BooleanProperty' ) )
                    {
                    // InternalJavaFXLang.g:838:2: ( ( 'BooleanProperty' ) )
                    // InternalJavaFXLang.g:839:3: ( 'BooleanProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getBooleanPropertyEnumLiteralDeclaration_0()); 
                    // InternalJavaFXLang.g:840:3: ( 'BooleanProperty' )
                    // InternalJavaFXLang.g:840:4: 'BooleanProperty'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getBooleanPropertyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:844:2: ( ( 'DoubleProperty' ) )
                    {
                    // InternalJavaFXLang.g:844:2: ( ( 'DoubleProperty' ) )
                    // InternalJavaFXLang.g:845:3: ( 'DoubleProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getDoublePropertyEnumLiteralDeclaration_1()); 
                    // InternalJavaFXLang.g:846:3: ( 'DoubleProperty' )
                    // InternalJavaFXLang.g:846:4: 'DoubleProperty'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getDoublePropertyEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJavaFXLang.g:850:2: ( ( 'FloatProperty' ) )
                    {
                    // InternalJavaFXLang.g:850:2: ( ( 'FloatProperty' ) )
                    // InternalJavaFXLang.g:851:3: ( 'FloatProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getFloatPropertyEnumLiteralDeclaration_2()); 
                    // InternalJavaFXLang.g:852:3: ( 'FloatProperty' )
                    // InternalJavaFXLang.g:852:4: 'FloatProperty'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getFloatPropertyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJavaFXLang.g:856:2: ( ( 'IntegerProperty' ) )
                    {
                    // InternalJavaFXLang.g:856:2: ( ( 'IntegerProperty' ) )
                    // InternalJavaFXLang.g:857:3: ( 'IntegerProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getIntegerPropertyEnumLiteralDeclaration_3()); 
                    // InternalJavaFXLang.g:858:3: ( 'IntegerProperty' )
                    // InternalJavaFXLang.g:858:4: 'IntegerProperty'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getIntegerPropertyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJavaFXLang.g:862:2: ( ( 'ObservableList' ) )
                    {
                    // InternalJavaFXLang.g:862:2: ( ( 'ObservableList' ) )
                    // InternalJavaFXLang.g:863:3: ( 'ObservableList' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getObservableListEnumLiteralDeclaration_4()); 
                    // InternalJavaFXLang.g:864:3: ( 'ObservableList' )
                    // InternalJavaFXLang.g:864:4: 'ObservableList'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getObservableListEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJavaFXLang.g:868:2: ( ( 'ObjectProperty' ) )
                    {
                    // InternalJavaFXLang.g:868:2: ( ( 'ObjectProperty' ) )
                    // InternalJavaFXLang.g:869:3: ( 'ObjectProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getObjectPropertyEnumLiteralDeclaration_5()); 
                    // InternalJavaFXLang.g:870:3: ( 'ObjectProperty' )
                    // InternalJavaFXLang.g:870:4: 'ObjectProperty'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBindinTypeAccess().getObjectPropertyEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJavaFXLang.g:874:2: ( ( 'StringProperty' ) )
                    {
                    // InternalJavaFXLang.g:874:2: ( ( 'StringProperty' ) )
                    // InternalJavaFXLang.g:875:3: ( 'StringProperty' )
                    {
                     before(grammarAccess.getBindinTypeAccess().getStringPropertyEnumLiteralDeclaration_6()); 
                    // InternalJavaFXLang.g:876:3: ( 'StringProperty' )
                    // InternalJavaFXLang.g:876:4: 'StringProperty'
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
    // InternalJavaFXLang.g:884:1: rule__ProjectFX__Group__0 : rule__ProjectFX__Group__0__Impl rule__ProjectFX__Group__1 ;
    public final void rule__ProjectFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:888:1: ( rule__ProjectFX__Group__0__Impl rule__ProjectFX__Group__1 )
            // InternalJavaFXLang.g:889:2: rule__ProjectFX__Group__0__Impl rule__ProjectFX__Group__1
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
    // InternalJavaFXLang.g:896:1: rule__ProjectFX__Group__0__Impl : ( () ) ;
    public final void rule__ProjectFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:900:1: ( ( () ) )
            // InternalJavaFXLang.g:901:1: ( () )
            {
            // InternalJavaFXLang.g:901:1: ( () )
            // InternalJavaFXLang.g:902:2: ()
            {
             before(grammarAccess.getProjectFXAccess().getProjectFXAction_0()); 
            // InternalJavaFXLang.g:903:2: ()
            // InternalJavaFXLang.g:903:3: 
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
    // InternalJavaFXLang.g:911:1: rule__ProjectFX__Group__1 : rule__ProjectFX__Group__1__Impl rule__ProjectFX__Group__2 ;
    public final void rule__ProjectFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:915:1: ( rule__ProjectFX__Group__1__Impl rule__ProjectFX__Group__2 )
            // InternalJavaFXLang.g:916:2: rule__ProjectFX__Group__1__Impl rule__ProjectFX__Group__2
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
    // InternalJavaFXLang.g:923:1: rule__ProjectFX__Group__1__Impl : ( 'ProjectFX' ) ;
    public final void rule__ProjectFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:927:1: ( ( 'ProjectFX' ) )
            // InternalJavaFXLang.g:928:1: ( 'ProjectFX' )
            {
            // InternalJavaFXLang.g:928:1: ( 'ProjectFX' )
            // InternalJavaFXLang.g:929:2: 'ProjectFX'
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
    // InternalJavaFXLang.g:938:1: rule__ProjectFX__Group__2 : rule__ProjectFX__Group__2__Impl rule__ProjectFX__Group__3 ;
    public final void rule__ProjectFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:942:1: ( rule__ProjectFX__Group__2__Impl rule__ProjectFX__Group__3 )
            // InternalJavaFXLang.g:943:2: rule__ProjectFX__Group__2__Impl rule__ProjectFX__Group__3
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
    // InternalJavaFXLang.g:950:1: rule__ProjectFX__Group__2__Impl : ( ( rule__ProjectFX__NameAssignment_2 ) ) ;
    public final void rule__ProjectFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:954:1: ( ( ( rule__ProjectFX__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:955:1: ( ( rule__ProjectFX__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:955:1: ( ( rule__ProjectFX__NameAssignment_2 ) )
            // InternalJavaFXLang.g:956:2: ( rule__ProjectFX__NameAssignment_2 )
            {
             before(grammarAccess.getProjectFXAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:957:2: ( rule__ProjectFX__NameAssignment_2 )
            // InternalJavaFXLang.g:957:3: rule__ProjectFX__NameAssignment_2
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
    // InternalJavaFXLang.g:965:1: rule__ProjectFX__Group__3 : rule__ProjectFX__Group__3__Impl rule__ProjectFX__Group__4 ;
    public final void rule__ProjectFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:969:1: ( rule__ProjectFX__Group__3__Impl rule__ProjectFX__Group__4 )
            // InternalJavaFXLang.g:970:2: rule__ProjectFX__Group__3__Impl rule__ProjectFX__Group__4
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
    // InternalJavaFXLang.g:977:1: rule__ProjectFX__Group__3__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:981:1: ( ( '{' ) )
            // InternalJavaFXLang.g:982:1: ( '{' )
            {
            // InternalJavaFXLang.g:982:1: ( '{' )
            // InternalJavaFXLang.g:983:2: '{'
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
    // InternalJavaFXLang.g:992:1: rule__ProjectFX__Group__4 : rule__ProjectFX__Group__4__Impl rule__ProjectFX__Group__5 ;
    public final void rule__ProjectFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:996:1: ( rule__ProjectFX__Group__4__Impl rule__ProjectFX__Group__5 )
            // InternalJavaFXLang.g:997:2: rule__ProjectFX__Group__4__Impl rule__ProjectFX__Group__5
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
    // InternalJavaFXLang.g:1004:1: rule__ProjectFX__Group__4__Impl : ( ( rule__ProjectFX__Group_4__0 )? ) ;
    public final void rule__ProjectFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1008:1: ( ( ( rule__ProjectFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:1009:1: ( ( rule__ProjectFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:1009:1: ( ( rule__ProjectFX__Group_4__0 )? )
            // InternalJavaFXLang.g:1010:2: ( rule__ProjectFX__Group_4__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:1011:2: ( rule__ProjectFX__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJavaFXLang.g:1011:3: rule__ProjectFX__Group_4__0
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
    // InternalJavaFXLang.g:1019:1: rule__ProjectFX__Group__5 : rule__ProjectFX__Group__5__Impl rule__ProjectFX__Group__6 ;
    public final void rule__ProjectFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1023:1: ( rule__ProjectFX__Group__5__Impl rule__ProjectFX__Group__6 )
            // InternalJavaFXLang.g:1024:2: rule__ProjectFX__Group__5__Impl rule__ProjectFX__Group__6
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
    // InternalJavaFXLang.g:1031:1: rule__ProjectFX__Group__5__Impl : ( ( rule__ProjectFX__Group_5__0 )? ) ;
    public final void rule__ProjectFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1035:1: ( ( ( rule__ProjectFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:1036:1: ( ( rule__ProjectFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:1036:1: ( ( rule__ProjectFX__Group_5__0 )? )
            // InternalJavaFXLang.g:1037:2: ( rule__ProjectFX__Group_5__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:1038:2: ( rule__ProjectFX__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJavaFXLang.g:1038:3: rule__ProjectFX__Group_5__0
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
    // InternalJavaFXLang.g:1046:1: rule__ProjectFX__Group__6 : rule__ProjectFX__Group__6__Impl rule__ProjectFX__Group__7 ;
    public final void rule__ProjectFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1050:1: ( rule__ProjectFX__Group__6__Impl rule__ProjectFX__Group__7 )
            // InternalJavaFXLang.g:1051:2: rule__ProjectFX__Group__6__Impl rule__ProjectFX__Group__7
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
    // InternalJavaFXLang.g:1058:1: rule__ProjectFX__Group__6__Impl : ( ( rule__ProjectFX__Group_6__0 )? ) ;
    public final void rule__ProjectFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1062:1: ( ( ( rule__ProjectFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:1063:1: ( ( rule__ProjectFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:1063:1: ( ( rule__ProjectFX__Group_6__0 )? )
            // InternalJavaFXLang.g:1064:2: ( rule__ProjectFX__Group_6__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:1065:2: ( rule__ProjectFX__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJavaFXLang.g:1065:3: rule__ProjectFX__Group_6__0
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
    // InternalJavaFXLang.g:1073:1: rule__ProjectFX__Group__7 : rule__ProjectFX__Group__7__Impl rule__ProjectFX__Group__8 ;
    public final void rule__ProjectFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1077:1: ( rule__ProjectFX__Group__7__Impl rule__ProjectFX__Group__8 )
            // InternalJavaFXLang.g:1078:2: rule__ProjectFX__Group__7__Impl rule__ProjectFX__Group__8
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
    // InternalJavaFXLang.g:1085:1: rule__ProjectFX__Group__7__Impl : ( ( rule__ProjectFX__Group_7__0 )? ) ;
    public final void rule__ProjectFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1089:1: ( ( ( rule__ProjectFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:1090:1: ( ( rule__ProjectFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:1090:1: ( ( rule__ProjectFX__Group_7__0 )? )
            // InternalJavaFXLang.g:1091:2: ( rule__ProjectFX__Group_7__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:1092:2: ( rule__ProjectFX__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJavaFXLang.g:1092:3: rule__ProjectFX__Group_7__0
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
    // InternalJavaFXLang.g:1100:1: rule__ProjectFX__Group__8 : rule__ProjectFX__Group__8__Impl rule__ProjectFX__Group__9 ;
    public final void rule__ProjectFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1104:1: ( rule__ProjectFX__Group__8__Impl rule__ProjectFX__Group__9 )
            // InternalJavaFXLang.g:1105:2: rule__ProjectFX__Group__8__Impl rule__ProjectFX__Group__9
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
    // InternalJavaFXLang.g:1112:1: rule__ProjectFX__Group__8__Impl : ( ( rule__ProjectFX__Group_8__0 )? ) ;
    public final void rule__ProjectFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1116:1: ( ( ( rule__ProjectFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:1117:1: ( ( rule__ProjectFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:1117:1: ( ( rule__ProjectFX__Group_8__0 )? )
            // InternalJavaFXLang.g:1118:2: ( rule__ProjectFX__Group_8__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:1119:2: ( rule__ProjectFX__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJavaFXLang.g:1119:3: rule__ProjectFX__Group_8__0
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
    // InternalJavaFXLang.g:1127:1: rule__ProjectFX__Group__9 : rule__ProjectFX__Group__9__Impl ;
    public final void rule__ProjectFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1131:1: ( rule__ProjectFX__Group__9__Impl )
            // InternalJavaFXLang.g:1132:2: rule__ProjectFX__Group__9__Impl
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
    // InternalJavaFXLang.g:1138:1: rule__ProjectFX__Group__9__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1142:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1143:1: ( '}' )
            {
            // InternalJavaFXLang.g:1143:1: ( '}' )
            // InternalJavaFXLang.g:1144:2: '}'
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
    // InternalJavaFXLang.g:1154:1: rule__ProjectFX__Group_4__0 : rule__ProjectFX__Group_4__0__Impl rule__ProjectFX__Group_4__1 ;
    public final void rule__ProjectFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1158:1: ( rule__ProjectFX__Group_4__0__Impl rule__ProjectFX__Group_4__1 )
            // InternalJavaFXLang.g:1159:2: rule__ProjectFX__Group_4__0__Impl rule__ProjectFX__Group_4__1
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
    // InternalJavaFXLang.g:1166:1: rule__ProjectFX__Group_4__0__Impl : ( 'packagePath' ) ;
    public final void rule__ProjectFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1170:1: ( ( 'packagePath' ) )
            // InternalJavaFXLang.g:1171:1: ( 'packagePath' )
            {
            // InternalJavaFXLang.g:1171:1: ( 'packagePath' )
            // InternalJavaFXLang.g:1172:2: 'packagePath'
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
    // InternalJavaFXLang.g:1181:1: rule__ProjectFX__Group_4__1 : rule__ProjectFX__Group_4__1__Impl ;
    public final void rule__ProjectFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1185:1: ( rule__ProjectFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:1186:2: rule__ProjectFX__Group_4__1__Impl
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
    // InternalJavaFXLang.g:1192:1: rule__ProjectFX__Group_4__1__Impl : ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) ) ;
    public final void rule__ProjectFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1196:1: ( ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:1197:1: ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:1197:1: ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) )
            // InternalJavaFXLang.g:1198:2: ( rule__ProjectFX__PackagePathAssignment_4_1 )
            {
             before(grammarAccess.getProjectFXAccess().getPackagePathAssignment_4_1()); 
            // InternalJavaFXLang.g:1199:2: ( rule__ProjectFX__PackagePathAssignment_4_1 )
            // InternalJavaFXLang.g:1199:3: rule__ProjectFX__PackagePathAssignment_4_1
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
    // InternalJavaFXLang.g:1208:1: rule__ProjectFX__Group_5__0 : rule__ProjectFX__Group_5__0__Impl rule__ProjectFX__Group_5__1 ;
    public final void rule__ProjectFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1212:1: ( rule__ProjectFX__Group_5__0__Impl rule__ProjectFX__Group_5__1 )
            // InternalJavaFXLang.g:1213:2: rule__ProjectFX__Group_5__0__Impl rule__ProjectFX__Group_5__1
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
    // InternalJavaFXLang.g:1220:1: rule__ProjectFX__Group_5__0__Impl : ( 'controls' ) ;
    public final void rule__ProjectFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1224:1: ( ( 'controls' ) )
            // InternalJavaFXLang.g:1225:1: ( 'controls' )
            {
            // InternalJavaFXLang.g:1225:1: ( 'controls' )
            // InternalJavaFXLang.g:1226:2: 'controls'
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
    // InternalJavaFXLang.g:1235:1: rule__ProjectFX__Group_5__1 : rule__ProjectFX__Group_5__1__Impl rule__ProjectFX__Group_5__2 ;
    public final void rule__ProjectFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1239:1: ( rule__ProjectFX__Group_5__1__Impl rule__ProjectFX__Group_5__2 )
            // InternalJavaFXLang.g:1240:2: rule__ProjectFX__Group_5__1__Impl rule__ProjectFX__Group_5__2
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
    // InternalJavaFXLang.g:1247:1: rule__ProjectFX__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1251:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1252:1: ( '{' )
            {
            // InternalJavaFXLang.g:1252:1: ( '{' )
            // InternalJavaFXLang.g:1253:2: '{'
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
    // InternalJavaFXLang.g:1262:1: rule__ProjectFX__Group_5__2 : rule__ProjectFX__Group_5__2__Impl rule__ProjectFX__Group_5__3 ;
    public final void rule__ProjectFX__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1266:1: ( rule__ProjectFX__Group_5__2__Impl rule__ProjectFX__Group_5__3 )
            // InternalJavaFXLang.g:1267:2: rule__ProjectFX__Group_5__2__Impl rule__ProjectFX__Group_5__3
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
    // InternalJavaFXLang.g:1274:1: rule__ProjectFX__Group_5__2__Impl : ( ( rule__ProjectFX__ControlsAssignment_5_2 ) ) ;
    public final void rule__ProjectFX__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1278:1: ( ( ( rule__ProjectFX__ControlsAssignment_5_2 ) ) )
            // InternalJavaFXLang.g:1279:1: ( ( rule__ProjectFX__ControlsAssignment_5_2 ) )
            {
            // InternalJavaFXLang.g:1279:1: ( ( rule__ProjectFX__ControlsAssignment_5_2 ) )
            // InternalJavaFXLang.g:1280:2: ( rule__ProjectFX__ControlsAssignment_5_2 )
            {
             before(grammarAccess.getProjectFXAccess().getControlsAssignment_5_2()); 
            // InternalJavaFXLang.g:1281:2: ( rule__ProjectFX__ControlsAssignment_5_2 )
            // InternalJavaFXLang.g:1281:3: rule__ProjectFX__ControlsAssignment_5_2
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
    // InternalJavaFXLang.g:1289:1: rule__ProjectFX__Group_5__3 : rule__ProjectFX__Group_5__3__Impl rule__ProjectFX__Group_5__4 ;
    public final void rule__ProjectFX__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1293:1: ( rule__ProjectFX__Group_5__3__Impl rule__ProjectFX__Group_5__4 )
            // InternalJavaFXLang.g:1294:2: rule__ProjectFX__Group_5__3__Impl rule__ProjectFX__Group_5__4
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
    // InternalJavaFXLang.g:1301:1: rule__ProjectFX__Group_5__3__Impl : ( ( rule__ProjectFX__ControlsAssignment_5_3 )* ) ;
    public final void rule__ProjectFX__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1305:1: ( ( ( rule__ProjectFX__ControlsAssignment_5_3 )* ) )
            // InternalJavaFXLang.g:1306:1: ( ( rule__ProjectFX__ControlsAssignment_5_3 )* )
            {
            // InternalJavaFXLang.g:1306:1: ( ( rule__ProjectFX__ControlsAssignment_5_3 )* )
            // InternalJavaFXLang.g:1307:2: ( rule__ProjectFX__ControlsAssignment_5_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getControlsAssignment_5_3()); 
            // InternalJavaFXLang.g:1308:2: ( rule__ProjectFX__ControlsAssignment_5_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==55||LA14_0==60) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJavaFXLang.g:1308:3: rule__ProjectFX__ControlsAssignment_5_3
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
    // InternalJavaFXLang.g:1316:1: rule__ProjectFX__Group_5__4 : rule__ProjectFX__Group_5__4__Impl ;
    public final void rule__ProjectFX__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1320:1: ( rule__ProjectFX__Group_5__4__Impl )
            // InternalJavaFXLang.g:1321:2: rule__ProjectFX__Group_5__4__Impl
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
    // InternalJavaFXLang.g:1327:1: rule__ProjectFX__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1331:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1332:1: ( '}' )
            {
            // InternalJavaFXLang.g:1332:1: ( '}' )
            // InternalJavaFXLang.g:1333:2: '}'
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
    // InternalJavaFXLang.g:1343:1: rule__ProjectFX__Group_6__0 : rule__ProjectFX__Group_6__0__Impl rule__ProjectFX__Group_6__1 ;
    public final void rule__ProjectFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1347:1: ( rule__ProjectFX__Group_6__0__Impl rule__ProjectFX__Group_6__1 )
            // InternalJavaFXLang.g:1348:2: rule__ProjectFX__Group_6__0__Impl rule__ProjectFX__Group_6__1
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
    // InternalJavaFXLang.g:1355:1: rule__ProjectFX__Group_6__0__Impl : ( 'models' ) ;
    public final void rule__ProjectFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1359:1: ( ( 'models' ) )
            // InternalJavaFXLang.g:1360:1: ( 'models' )
            {
            // InternalJavaFXLang.g:1360:1: ( 'models' )
            // InternalJavaFXLang.g:1361:2: 'models'
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
    // InternalJavaFXLang.g:1370:1: rule__ProjectFX__Group_6__1 : rule__ProjectFX__Group_6__1__Impl rule__ProjectFX__Group_6__2 ;
    public final void rule__ProjectFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1374:1: ( rule__ProjectFX__Group_6__1__Impl rule__ProjectFX__Group_6__2 )
            // InternalJavaFXLang.g:1375:2: rule__ProjectFX__Group_6__1__Impl rule__ProjectFX__Group_6__2
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
    // InternalJavaFXLang.g:1382:1: rule__ProjectFX__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1386:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1387:1: ( '{' )
            {
            // InternalJavaFXLang.g:1387:1: ( '{' )
            // InternalJavaFXLang.g:1388:2: '{'
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
    // InternalJavaFXLang.g:1397:1: rule__ProjectFX__Group_6__2 : rule__ProjectFX__Group_6__2__Impl rule__ProjectFX__Group_6__3 ;
    public final void rule__ProjectFX__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1401:1: ( rule__ProjectFX__Group_6__2__Impl rule__ProjectFX__Group_6__3 )
            // InternalJavaFXLang.g:1402:2: rule__ProjectFX__Group_6__2__Impl rule__ProjectFX__Group_6__3
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
    // InternalJavaFXLang.g:1409:1: rule__ProjectFX__Group_6__2__Impl : ( ( rule__ProjectFX__ModelsAssignment_6_2 ) ) ;
    public final void rule__ProjectFX__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1413:1: ( ( ( rule__ProjectFX__ModelsAssignment_6_2 ) ) )
            // InternalJavaFXLang.g:1414:1: ( ( rule__ProjectFX__ModelsAssignment_6_2 ) )
            {
            // InternalJavaFXLang.g:1414:1: ( ( rule__ProjectFX__ModelsAssignment_6_2 ) )
            // InternalJavaFXLang.g:1415:2: ( rule__ProjectFX__ModelsAssignment_6_2 )
            {
             before(grammarAccess.getProjectFXAccess().getModelsAssignment_6_2()); 
            // InternalJavaFXLang.g:1416:2: ( rule__ProjectFX__ModelsAssignment_6_2 )
            // InternalJavaFXLang.g:1416:3: rule__ProjectFX__ModelsAssignment_6_2
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
    // InternalJavaFXLang.g:1424:1: rule__ProjectFX__Group_6__3 : rule__ProjectFX__Group_6__3__Impl rule__ProjectFX__Group_6__4 ;
    public final void rule__ProjectFX__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1428:1: ( rule__ProjectFX__Group_6__3__Impl rule__ProjectFX__Group_6__4 )
            // InternalJavaFXLang.g:1429:2: rule__ProjectFX__Group_6__3__Impl rule__ProjectFX__Group_6__4
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
    // InternalJavaFXLang.g:1436:1: rule__ProjectFX__Group_6__3__Impl : ( ( rule__ProjectFX__ModelsAssignment_6_3 )* ) ;
    public final void rule__ProjectFX__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1440:1: ( ( ( rule__ProjectFX__ModelsAssignment_6_3 )* ) )
            // InternalJavaFXLang.g:1441:1: ( ( rule__ProjectFX__ModelsAssignment_6_3 )* )
            {
            // InternalJavaFXLang.g:1441:1: ( ( rule__ProjectFX__ModelsAssignment_6_3 )* )
            // InternalJavaFXLang.g:1442:2: ( rule__ProjectFX__ModelsAssignment_6_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getModelsAssignment_6_3()); 
            // InternalJavaFXLang.g:1443:2: ( rule__ProjectFX__ModelsAssignment_6_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==58) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalJavaFXLang.g:1443:3: rule__ProjectFX__ModelsAssignment_6_3
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
    // InternalJavaFXLang.g:1451:1: rule__ProjectFX__Group_6__4 : rule__ProjectFX__Group_6__4__Impl ;
    public final void rule__ProjectFX__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1455:1: ( rule__ProjectFX__Group_6__4__Impl )
            // InternalJavaFXLang.g:1456:2: rule__ProjectFX__Group_6__4__Impl
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
    // InternalJavaFXLang.g:1462:1: rule__ProjectFX__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1466:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1467:1: ( '}' )
            {
            // InternalJavaFXLang.g:1467:1: ( '}' )
            // InternalJavaFXLang.g:1468:2: '}'
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
    // InternalJavaFXLang.g:1478:1: rule__ProjectFX__Group_7__0 : rule__ProjectFX__Group_7__0__Impl rule__ProjectFX__Group_7__1 ;
    public final void rule__ProjectFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1482:1: ( rule__ProjectFX__Group_7__0__Impl rule__ProjectFX__Group_7__1 )
            // InternalJavaFXLang.g:1483:2: rule__ProjectFX__Group_7__0__Impl rule__ProjectFX__Group_7__1
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
    // InternalJavaFXLang.g:1490:1: rule__ProjectFX__Group_7__0__Impl : ( 'bindings' ) ;
    public final void rule__ProjectFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1494:1: ( ( 'bindings' ) )
            // InternalJavaFXLang.g:1495:1: ( 'bindings' )
            {
            // InternalJavaFXLang.g:1495:1: ( 'bindings' )
            // InternalJavaFXLang.g:1496:2: 'bindings'
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
    // InternalJavaFXLang.g:1505:1: rule__ProjectFX__Group_7__1 : rule__ProjectFX__Group_7__1__Impl rule__ProjectFX__Group_7__2 ;
    public final void rule__ProjectFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1509:1: ( rule__ProjectFX__Group_7__1__Impl rule__ProjectFX__Group_7__2 )
            // InternalJavaFXLang.g:1510:2: rule__ProjectFX__Group_7__1__Impl rule__ProjectFX__Group_7__2
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
    // InternalJavaFXLang.g:1517:1: rule__ProjectFX__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1521:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1522:1: ( '{' )
            {
            // InternalJavaFXLang.g:1522:1: ( '{' )
            // InternalJavaFXLang.g:1523:2: '{'
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
    // InternalJavaFXLang.g:1532:1: rule__ProjectFX__Group_7__2 : rule__ProjectFX__Group_7__2__Impl rule__ProjectFX__Group_7__3 ;
    public final void rule__ProjectFX__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1536:1: ( rule__ProjectFX__Group_7__2__Impl rule__ProjectFX__Group_7__3 )
            // InternalJavaFXLang.g:1537:2: rule__ProjectFX__Group_7__2__Impl rule__ProjectFX__Group_7__3
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
    // InternalJavaFXLang.g:1544:1: rule__ProjectFX__Group_7__2__Impl : ( ( rule__ProjectFX__BindingsAssignment_7_2 ) ) ;
    public final void rule__ProjectFX__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1548:1: ( ( ( rule__ProjectFX__BindingsAssignment_7_2 ) ) )
            // InternalJavaFXLang.g:1549:1: ( ( rule__ProjectFX__BindingsAssignment_7_2 ) )
            {
            // InternalJavaFXLang.g:1549:1: ( ( rule__ProjectFX__BindingsAssignment_7_2 ) )
            // InternalJavaFXLang.g:1550:2: ( rule__ProjectFX__BindingsAssignment_7_2 )
            {
             before(grammarAccess.getProjectFXAccess().getBindingsAssignment_7_2()); 
            // InternalJavaFXLang.g:1551:2: ( rule__ProjectFX__BindingsAssignment_7_2 )
            // InternalJavaFXLang.g:1551:3: rule__ProjectFX__BindingsAssignment_7_2
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
    // InternalJavaFXLang.g:1559:1: rule__ProjectFX__Group_7__3 : rule__ProjectFX__Group_7__3__Impl rule__ProjectFX__Group_7__4 ;
    public final void rule__ProjectFX__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1563:1: ( rule__ProjectFX__Group_7__3__Impl rule__ProjectFX__Group_7__4 )
            // InternalJavaFXLang.g:1564:2: rule__ProjectFX__Group_7__3__Impl rule__ProjectFX__Group_7__4
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
    // InternalJavaFXLang.g:1571:1: rule__ProjectFX__Group_7__3__Impl : ( ( rule__ProjectFX__BindingsAssignment_7_3 )* ) ;
    public final void rule__ProjectFX__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1575:1: ( ( ( rule__ProjectFX__BindingsAssignment_7_3 )* ) )
            // InternalJavaFXLang.g:1576:1: ( ( rule__ProjectFX__BindingsAssignment_7_3 )* )
            {
            // InternalJavaFXLang.g:1576:1: ( ( rule__ProjectFX__BindingsAssignment_7_3 )* )
            // InternalJavaFXLang.g:1577:2: ( rule__ProjectFX__BindingsAssignment_7_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getBindingsAssignment_7_3()); 
            // InternalJavaFXLang.g:1578:2: ( rule__ProjectFX__BindingsAssignment_7_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==54) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalJavaFXLang.g:1578:3: rule__ProjectFX__BindingsAssignment_7_3
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
    // InternalJavaFXLang.g:1586:1: rule__ProjectFX__Group_7__4 : rule__ProjectFX__Group_7__4__Impl ;
    public final void rule__ProjectFX__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1590:1: ( rule__ProjectFX__Group_7__4__Impl )
            // InternalJavaFXLang.g:1591:2: rule__ProjectFX__Group_7__4__Impl
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
    // InternalJavaFXLang.g:1597:1: rule__ProjectFX__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1601:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1602:1: ( '}' )
            {
            // InternalJavaFXLang.g:1602:1: ( '}' )
            // InternalJavaFXLang.g:1603:2: '}'
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
    // InternalJavaFXLang.g:1613:1: rule__ProjectFX__Group_8__0 : rule__ProjectFX__Group_8__0__Impl rule__ProjectFX__Group_8__1 ;
    public final void rule__ProjectFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1617:1: ( rule__ProjectFX__Group_8__0__Impl rule__ProjectFX__Group_8__1 )
            // InternalJavaFXLang.g:1618:2: rule__ProjectFX__Group_8__0__Impl rule__ProjectFX__Group_8__1
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
    // InternalJavaFXLang.g:1625:1: rule__ProjectFX__Group_8__0__Impl : ( 'charts' ) ;
    public final void rule__ProjectFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1629:1: ( ( 'charts' ) )
            // InternalJavaFXLang.g:1630:1: ( 'charts' )
            {
            // InternalJavaFXLang.g:1630:1: ( 'charts' )
            // InternalJavaFXLang.g:1631:2: 'charts'
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
    // InternalJavaFXLang.g:1640:1: rule__ProjectFX__Group_8__1 : rule__ProjectFX__Group_8__1__Impl rule__ProjectFX__Group_8__2 ;
    public final void rule__ProjectFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1644:1: ( rule__ProjectFX__Group_8__1__Impl rule__ProjectFX__Group_8__2 )
            // InternalJavaFXLang.g:1645:2: rule__ProjectFX__Group_8__1__Impl rule__ProjectFX__Group_8__2
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
    // InternalJavaFXLang.g:1652:1: rule__ProjectFX__Group_8__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1656:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1657:1: ( '{' )
            {
            // InternalJavaFXLang.g:1657:1: ( '{' )
            // InternalJavaFXLang.g:1658:2: '{'
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
    // InternalJavaFXLang.g:1667:1: rule__ProjectFX__Group_8__2 : rule__ProjectFX__Group_8__2__Impl rule__ProjectFX__Group_8__3 ;
    public final void rule__ProjectFX__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1671:1: ( rule__ProjectFX__Group_8__2__Impl rule__ProjectFX__Group_8__3 )
            // InternalJavaFXLang.g:1672:2: rule__ProjectFX__Group_8__2__Impl rule__ProjectFX__Group_8__3
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
    // InternalJavaFXLang.g:1679:1: rule__ProjectFX__Group_8__2__Impl : ( ( rule__ProjectFX__ChartsAssignment_8_2 ) ) ;
    public final void rule__ProjectFX__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1683:1: ( ( ( rule__ProjectFX__ChartsAssignment_8_2 ) ) )
            // InternalJavaFXLang.g:1684:1: ( ( rule__ProjectFX__ChartsAssignment_8_2 ) )
            {
            // InternalJavaFXLang.g:1684:1: ( ( rule__ProjectFX__ChartsAssignment_8_2 ) )
            // InternalJavaFXLang.g:1685:2: ( rule__ProjectFX__ChartsAssignment_8_2 )
            {
             before(grammarAccess.getProjectFXAccess().getChartsAssignment_8_2()); 
            // InternalJavaFXLang.g:1686:2: ( rule__ProjectFX__ChartsAssignment_8_2 )
            // InternalJavaFXLang.g:1686:3: rule__ProjectFX__ChartsAssignment_8_2
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
    // InternalJavaFXLang.g:1694:1: rule__ProjectFX__Group_8__3 : rule__ProjectFX__Group_8__3__Impl rule__ProjectFX__Group_8__4 ;
    public final void rule__ProjectFX__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1698:1: ( rule__ProjectFX__Group_8__3__Impl rule__ProjectFX__Group_8__4 )
            // InternalJavaFXLang.g:1699:2: rule__ProjectFX__Group_8__3__Impl rule__ProjectFX__Group_8__4
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
    // InternalJavaFXLang.g:1706:1: rule__ProjectFX__Group_8__3__Impl : ( ( rule__ProjectFX__ChartsAssignment_8_3 )* ) ;
    public final void rule__ProjectFX__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1710:1: ( ( ( rule__ProjectFX__ChartsAssignment_8_3 )* ) )
            // InternalJavaFXLang.g:1711:1: ( ( rule__ProjectFX__ChartsAssignment_8_3 )* )
            {
            // InternalJavaFXLang.g:1711:1: ( ( rule__ProjectFX__ChartsAssignment_8_3 )* )
            // InternalJavaFXLang.g:1712:2: ( rule__ProjectFX__ChartsAssignment_8_3 )*
            {
             before(grammarAccess.getProjectFXAccess().getChartsAssignment_8_3()); 
            // InternalJavaFXLang.g:1713:2: ( rule__ProjectFX__ChartsAssignment_8_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34||(LA17_0>=44 && LA17_0<=48)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalJavaFXLang.g:1713:3: rule__ProjectFX__ChartsAssignment_8_3
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
    // InternalJavaFXLang.g:1721:1: rule__ProjectFX__Group_8__4 : rule__ProjectFX__Group_8__4__Impl ;
    public final void rule__ProjectFX__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1725:1: ( rule__ProjectFX__Group_8__4__Impl )
            // InternalJavaFXLang.g:1726:2: rule__ProjectFX__Group_8__4__Impl
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
    // InternalJavaFXLang.g:1732:1: rule__ProjectFX__Group_8__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1736:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1737:1: ( '}' )
            {
            // InternalJavaFXLang.g:1737:1: ( '}' )
            // InternalJavaFXLang.g:1738:2: '}'
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
    // InternalJavaFXLang.g:1748:1: rule__BarChartFX__Group__0 : rule__BarChartFX__Group__0__Impl rule__BarChartFX__Group__1 ;
    public final void rule__BarChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1752:1: ( rule__BarChartFX__Group__0__Impl rule__BarChartFX__Group__1 )
            // InternalJavaFXLang.g:1753:2: rule__BarChartFX__Group__0__Impl rule__BarChartFX__Group__1
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
    // InternalJavaFXLang.g:1760:1: rule__BarChartFX__Group__0__Impl : ( () ) ;
    public final void rule__BarChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1764:1: ( ( () ) )
            // InternalJavaFXLang.g:1765:1: ( () )
            {
            // InternalJavaFXLang.g:1765:1: ( () )
            // InternalJavaFXLang.g:1766:2: ()
            {
             before(grammarAccess.getBarChartFXAccess().getBarChartFXAction_0()); 
            // InternalJavaFXLang.g:1767:2: ()
            // InternalJavaFXLang.g:1767:3: 
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
    // InternalJavaFXLang.g:1775:1: rule__BarChartFX__Group__1 : rule__BarChartFX__Group__1__Impl rule__BarChartFX__Group__2 ;
    public final void rule__BarChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1779:1: ( rule__BarChartFX__Group__1__Impl rule__BarChartFX__Group__2 )
            // InternalJavaFXLang.g:1780:2: rule__BarChartFX__Group__1__Impl rule__BarChartFX__Group__2
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
    // InternalJavaFXLang.g:1787:1: rule__BarChartFX__Group__1__Impl : ( 'BarChart' ) ;
    public final void rule__BarChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1791:1: ( ( 'BarChart' ) )
            // InternalJavaFXLang.g:1792:1: ( 'BarChart' )
            {
            // InternalJavaFXLang.g:1792:1: ( 'BarChart' )
            // InternalJavaFXLang.g:1793:2: 'BarChart'
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
    // InternalJavaFXLang.g:1802:1: rule__BarChartFX__Group__2 : rule__BarChartFX__Group__2__Impl rule__BarChartFX__Group__3 ;
    public final void rule__BarChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1806:1: ( rule__BarChartFX__Group__2__Impl rule__BarChartFX__Group__3 )
            // InternalJavaFXLang.g:1807:2: rule__BarChartFX__Group__2__Impl rule__BarChartFX__Group__3
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
    // InternalJavaFXLang.g:1814:1: rule__BarChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__BarChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1818:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1819:1: ( '{' )
            {
            // InternalJavaFXLang.g:1819:1: ( '{' )
            // InternalJavaFXLang.g:1820:2: '{'
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
    // InternalJavaFXLang.g:1829:1: rule__BarChartFX__Group__3 : rule__BarChartFX__Group__3__Impl rule__BarChartFX__Group__4 ;
    public final void rule__BarChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1833:1: ( rule__BarChartFX__Group__3__Impl rule__BarChartFX__Group__4 )
            // InternalJavaFXLang.g:1834:2: rule__BarChartFX__Group__3__Impl rule__BarChartFX__Group__4
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
    // InternalJavaFXLang.g:1841:1: rule__BarChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__BarChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1845:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:1846:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:1846:1: ( 'name:' )
            // InternalJavaFXLang.g:1847:2: 'name:'
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
    // InternalJavaFXLang.g:1856:1: rule__BarChartFX__Group__4 : rule__BarChartFX__Group__4__Impl rule__BarChartFX__Group__5 ;
    public final void rule__BarChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1860:1: ( rule__BarChartFX__Group__4__Impl rule__BarChartFX__Group__5 )
            // InternalJavaFXLang.g:1861:2: rule__BarChartFX__Group__4__Impl rule__BarChartFX__Group__5
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
    // InternalJavaFXLang.g:1868:1: rule__BarChartFX__Group__4__Impl : ( ( rule__BarChartFX__NameAssignment_4 ) ) ;
    public final void rule__BarChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1872:1: ( ( ( rule__BarChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:1873:1: ( ( rule__BarChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:1873:1: ( ( rule__BarChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:1874:2: ( rule__BarChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getBarChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:1875:2: ( rule__BarChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:1875:3: rule__BarChartFX__NameAssignment_4
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
    // InternalJavaFXLang.g:1883:1: rule__BarChartFX__Group__5 : rule__BarChartFX__Group__5__Impl rule__BarChartFX__Group__6 ;
    public final void rule__BarChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1887:1: ( rule__BarChartFX__Group__5__Impl rule__BarChartFX__Group__6 )
            // InternalJavaFXLang.g:1888:2: rule__BarChartFX__Group__5__Impl rule__BarChartFX__Group__6
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
    // InternalJavaFXLang.g:1895:1: rule__BarChartFX__Group__5__Impl : ( ( rule__BarChartFX__Group_5__0 )? ) ;
    public final void rule__BarChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1899:1: ( ( ( rule__BarChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:1900:1: ( ( rule__BarChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:1900:1: ( ( rule__BarChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:1901:2: ( rule__BarChartFX__Group_5__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:1902:2: ( rule__BarChartFX__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJavaFXLang.g:1902:3: rule__BarChartFX__Group_5__0
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
    // InternalJavaFXLang.g:1910:1: rule__BarChartFX__Group__6 : rule__BarChartFX__Group__6__Impl rule__BarChartFX__Group__7 ;
    public final void rule__BarChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1914:1: ( rule__BarChartFX__Group__6__Impl rule__BarChartFX__Group__7 )
            // InternalJavaFXLang.g:1915:2: rule__BarChartFX__Group__6__Impl rule__BarChartFX__Group__7
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
    // InternalJavaFXLang.g:1922:1: rule__BarChartFX__Group__6__Impl : ( ( rule__BarChartFX__Group_6__0 )? ) ;
    public final void rule__BarChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1926:1: ( ( ( rule__BarChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:1927:1: ( ( rule__BarChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:1927:1: ( ( rule__BarChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:1928:2: ( rule__BarChartFX__Group_6__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:1929:2: ( rule__BarChartFX__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJavaFXLang.g:1929:3: rule__BarChartFX__Group_6__0
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
    // InternalJavaFXLang.g:1937:1: rule__BarChartFX__Group__7 : rule__BarChartFX__Group__7__Impl rule__BarChartFX__Group__8 ;
    public final void rule__BarChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1941:1: ( rule__BarChartFX__Group__7__Impl rule__BarChartFX__Group__8 )
            // InternalJavaFXLang.g:1942:2: rule__BarChartFX__Group__7__Impl rule__BarChartFX__Group__8
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
    // InternalJavaFXLang.g:1949:1: rule__BarChartFX__Group__7__Impl : ( ( rule__BarChartFX__Group_7__0 )? ) ;
    public final void rule__BarChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1953:1: ( ( ( rule__BarChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:1954:1: ( ( rule__BarChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:1954:1: ( ( rule__BarChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:1955:2: ( rule__BarChartFX__Group_7__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:1956:2: ( rule__BarChartFX__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJavaFXLang.g:1956:3: rule__BarChartFX__Group_7__0
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
    // InternalJavaFXLang.g:1964:1: rule__BarChartFX__Group__8 : rule__BarChartFX__Group__8__Impl rule__BarChartFX__Group__9 ;
    public final void rule__BarChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1968:1: ( rule__BarChartFX__Group__8__Impl rule__BarChartFX__Group__9 )
            // InternalJavaFXLang.g:1969:2: rule__BarChartFX__Group__8__Impl rule__BarChartFX__Group__9
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
    // InternalJavaFXLang.g:1976:1: rule__BarChartFX__Group__8__Impl : ( ( rule__BarChartFX__Group_8__0 )? ) ;
    public final void rule__BarChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1980:1: ( ( ( rule__BarChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:1981:1: ( ( rule__BarChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:1981:1: ( ( rule__BarChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:1982:2: ( rule__BarChartFX__Group_8__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:1983:2: ( rule__BarChartFX__Group_8__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJavaFXLang.g:1983:3: rule__BarChartFX__Group_8__0
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
    // InternalJavaFXLang.g:1991:1: rule__BarChartFX__Group__9 : rule__BarChartFX__Group__9__Impl rule__BarChartFX__Group__10 ;
    public final void rule__BarChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1995:1: ( rule__BarChartFX__Group__9__Impl rule__BarChartFX__Group__10 )
            // InternalJavaFXLang.g:1996:2: rule__BarChartFX__Group__9__Impl rule__BarChartFX__Group__10
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
    // InternalJavaFXLang.g:2003:1: rule__BarChartFX__Group__9__Impl : ( ( rule__BarChartFX__Group_9__0 )? ) ;
    public final void rule__BarChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2007:1: ( ( ( rule__BarChartFX__Group_9__0 )? ) )
            // InternalJavaFXLang.g:2008:1: ( ( rule__BarChartFX__Group_9__0 )? )
            {
            // InternalJavaFXLang.g:2008:1: ( ( rule__BarChartFX__Group_9__0 )? )
            // InternalJavaFXLang.g:2009:2: ( rule__BarChartFX__Group_9__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_9()); 
            // InternalJavaFXLang.g:2010:2: ( rule__BarChartFX__Group_9__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJavaFXLang.g:2010:3: rule__BarChartFX__Group_9__0
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
    // InternalJavaFXLang.g:2018:1: rule__BarChartFX__Group__10 : rule__BarChartFX__Group__10__Impl rule__BarChartFX__Group__11 ;
    public final void rule__BarChartFX__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2022:1: ( rule__BarChartFX__Group__10__Impl rule__BarChartFX__Group__11 )
            // InternalJavaFXLang.g:2023:2: rule__BarChartFX__Group__10__Impl rule__BarChartFX__Group__11
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
    // InternalJavaFXLang.g:2030:1: rule__BarChartFX__Group__10__Impl : ( ( rule__BarChartFX__Group_10__0 )? ) ;
    public final void rule__BarChartFX__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2034:1: ( ( ( rule__BarChartFX__Group_10__0 )? ) )
            // InternalJavaFXLang.g:2035:1: ( ( rule__BarChartFX__Group_10__0 )? )
            {
            // InternalJavaFXLang.g:2035:1: ( ( rule__BarChartFX__Group_10__0 )? )
            // InternalJavaFXLang.g:2036:2: ( rule__BarChartFX__Group_10__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_10()); 
            // InternalJavaFXLang.g:2037:2: ( rule__BarChartFX__Group_10__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalJavaFXLang.g:2037:3: rule__BarChartFX__Group_10__0
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
    // InternalJavaFXLang.g:2045:1: rule__BarChartFX__Group__11 : rule__BarChartFX__Group__11__Impl rule__BarChartFX__Group__12 ;
    public final void rule__BarChartFX__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2049:1: ( rule__BarChartFX__Group__11__Impl rule__BarChartFX__Group__12 )
            // InternalJavaFXLang.g:2050:2: rule__BarChartFX__Group__11__Impl rule__BarChartFX__Group__12
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
    // InternalJavaFXLang.g:2057:1: rule__BarChartFX__Group__11__Impl : ( ( rule__BarChartFX__Group_11__0 )? ) ;
    public final void rule__BarChartFX__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2061:1: ( ( ( rule__BarChartFX__Group_11__0 )? ) )
            // InternalJavaFXLang.g:2062:1: ( ( rule__BarChartFX__Group_11__0 )? )
            {
            // InternalJavaFXLang.g:2062:1: ( ( rule__BarChartFX__Group_11__0 )? )
            // InternalJavaFXLang.g:2063:2: ( rule__BarChartFX__Group_11__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_11()); 
            // InternalJavaFXLang.g:2064:2: ( rule__BarChartFX__Group_11__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJavaFXLang.g:2064:3: rule__BarChartFX__Group_11__0
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
    // InternalJavaFXLang.g:2072:1: rule__BarChartFX__Group__12 : rule__BarChartFX__Group__12__Impl rule__BarChartFX__Group__13 ;
    public final void rule__BarChartFX__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2076:1: ( rule__BarChartFX__Group__12__Impl rule__BarChartFX__Group__13 )
            // InternalJavaFXLang.g:2077:2: rule__BarChartFX__Group__12__Impl rule__BarChartFX__Group__13
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
    // InternalJavaFXLang.g:2084:1: rule__BarChartFX__Group__12__Impl : ( ( rule__BarChartFX__Group_12__0 )? ) ;
    public final void rule__BarChartFX__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2088:1: ( ( ( rule__BarChartFX__Group_12__0 )? ) )
            // InternalJavaFXLang.g:2089:1: ( ( rule__BarChartFX__Group_12__0 )? )
            {
            // InternalJavaFXLang.g:2089:1: ( ( rule__BarChartFX__Group_12__0 )? )
            // InternalJavaFXLang.g:2090:2: ( rule__BarChartFX__Group_12__0 )?
            {
             before(grammarAccess.getBarChartFXAccess().getGroup_12()); 
            // InternalJavaFXLang.g:2091:2: ( rule__BarChartFX__Group_12__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJavaFXLang.g:2091:3: rule__BarChartFX__Group_12__0
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
    // InternalJavaFXLang.g:2099:1: rule__BarChartFX__Group__13 : rule__BarChartFX__Group__13__Impl ;
    public final void rule__BarChartFX__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2103:1: ( rule__BarChartFX__Group__13__Impl )
            // InternalJavaFXLang.g:2104:2: rule__BarChartFX__Group__13__Impl
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
    // InternalJavaFXLang.g:2110:1: rule__BarChartFX__Group__13__Impl : ( '}' ) ;
    public final void rule__BarChartFX__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2114:1: ( ( '}' ) )
            // InternalJavaFXLang.g:2115:1: ( '}' )
            {
            // InternalJavaFXLang.g:2115:1: ( '}' )
            // InternalJavaFXLang.g:2116:2: '}'
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
    // InternalJavaFXLang.g:2126:1: rule__BarChartFX__Group_5__0 : rule__BarChartFX__Group_5__0__Impl rule__BarChartFX__Group_5__1 ;
    public final void rule__BarChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2130:1: ( rule__BarChartFX__Group_5__0__Impl rule__BarChartFX__Group_5__1 )
            // InternalJavaFXLang.g:2131:2: rule__BarChartFX__Group_5__0__Impl rule__BarChartFX__Group_5__1
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
    // InternalJavaFXLang.g:2138:1: rule__BarChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__BarChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2142:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:2143:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:2143:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:2144:2: 'legendSide:'
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
    // InternalJavaFXLang.g:2153:1: rule__BarChartFX__Group_5__1 : rule__BarChartFX__Group_5__1__Impl ;
    public final void rule__BarChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2157:1: ( rule__BarChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:2158:2: rule__BarChartFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:2164:1: rule__BarChartFX__Group_5__1__Impl : ( ( rule__BarChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__BarChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2168:1: ( ( ( rule__BarChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:2169:1: ( ( rule__BarChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:2169:1: ( ( rule__BarChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:2170:2: ( rule__BarChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:2171:2: ( rule__BarChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:2171:3: rule__BarChartFX__LegendSideAssignment_5_1
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
    // InternalJavaFXLang.g:2180:1: rule__BarChartFX__Group_6__0 : rule__BarChartFX__Group_6__0__Impl rule__BarChartFX__Group_6__1 ;
    public final void rule__BarChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2184:1: ( rule__BarChartFX__Group_6__0__Impl rule__BarChartFX__Group_6__1 )
            // InternalJavaFXLang.g:2185:2: rule__BarChartFX__Group_6__0__Impl rule__BarChartFX__Group_6__1
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
    // InternalJavaFXLang.g:2192:1: rule__BarChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__BarChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2196:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:2197:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:2197:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:2198:2: 'showLegend:'
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
    // InternalJavaFXLang.g:2207:1: rule__BarChartFX__Group_6__1 : rule__BarChartFX__Group_6__1__Impl ;
    public final void rule__BarChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2211:1: ( rule__BarChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:2212:2: rule__BarChartFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:2218:1: rule__BarChartFX__Group_6__1__Impl : ( ( rule__BarChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__BarChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2222:1: ( ( ( rule__BarChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:2223:1: ( ( rule__BarChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:2223:1: ( ( rule__BarChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:2224:2: ( rule__BarChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:2225:2: ( rule__BarChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:2225:3: rule__BarChartFX__ShowLegendAssignment_6_1
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
    // InternalJavaFXLang.g:2234:1: rule__BarChartFX__Group_7__0 : rule__BarChartFX__Group_7__0__Impl rule__BarChartFX__Group_7__1 ;
    public final void rule__BarChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2238:1: ( rule__BarChartFX__Group_7__0__Impl rule__BarChartFX__Group_7__1 )
            // InternalJavaFXLang.g:2239:2: rule__BarChartFX__Group_7__0__Impl rule__BarChartFX__Group_7__1
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
    // InternalJavaFXLang.g:2246:1: rule__BarChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__BarChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2250:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:2251:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:2251:1: ( 'title:' )
            // InternalJavaFXLang.g:2252:2: 'title:'
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
    // InternalJavaFXLang.g:2261:1: rule__BarChartFX__Group_7__1 : rule__BarChartFX__Group_7__1__Impl ;
    public final void rule__BarChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2265:1: ( rule__BarChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:2266:2: rule__BarChartFX__Group_7__1__Impl
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
    // InternalJavaFXLang.g:2272:1: rule__BarChartFX__Group_7__1__Impl : ( ( rule__BarChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__BarChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2276:1: ( ( ( rule__BarChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:2277:1: ( ( rule__BarChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:2277:1: ( ( rule__BarChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:2278:2: ( rule__BarChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:2279:2: ( rule__BarChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:2279:3: rule__BarChartFX__TitleAssignment_7_1
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
    // InternalJavaFXLang.g:2288:1: rule__BarChartFX__Group_8__0 : rule__BarChartFX__Group_8__0__Impl rule__BarChartFX__Group_8__1 ;
    public final void rule__BarChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2292:1: ( rule__BarChartFX__Group_8__0__Impl rule__BarChartFX__Group_8__1 )
            // InternalJavaFXLang.g:2293:2: rule__BarChartFX__Group_8__0__Impl rule__BarChartFX__Group_8__1
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
    // InternalJavaFXLang.g:2300:1: rule__BarChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__BarChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2304:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:2305:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:2305:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:2306:2: 'titleSide:'
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
    // InternalJavaFXLang.g:2315:1: rule__BarChartFX__Group_8__1 : rule__BarChartFX__Group_8__1__Impl ;
    public final void rule__BarChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2319:1: ( rule__BarChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:2320:2: rule__BarChartFX__Group_8__1__Impl
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
    // InternalJavaFXLang.g:2326:1: rule__BarChartFX__Group_8__1__Impl : ( ( rule__BarChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__BarChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2330:1: ( ( ( rule__BarChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:2331:1: ( ( rule__BarChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:2331:1: ( ( rule__BarChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:2332:2: ( rule__BarChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:2333:2: ( rule__BarChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:2333:3: rule__BarChartFX__TitleSideAssignment_8_1
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
    // InternalJavaFXLang.g:2342:1: rule__BarChartFX__Group_9__0 : rule__BarChartFX__Group_9__0__Impl rule__BarChartFX__Group_9__1 ;
    public final void rule__BarChartFX__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2346:1: ( rule__BarChartFX__Group_9__0__Impl rule__BarChartFX__Group_9__1 )
            // InternalJavaFXLang.g:2347:2: rule__BarChartFX__Group_9__0__Impl rule__BarChartFX__Group_9__1
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
    // InternalJavaFXLang.g:2354:1: rule__BarChartFX__Group_9__0__Impl : ( 'xAxisLabel:' ) ;
    public final void rule__BarChartFX__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2358:1: ( ( 'xAxisLabel:' ) )
            // InternalJavaFXLang.g:2359:1: ( 'xAxisLabel:' )
            {
            // InternalJavaFXLang.g:2359:1: ( 'xAxisLabel:' )
            // InternalJavaFXLang.g:2360:2: 'xAxisLabel:'
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
    // InternalJavaFXLang.g:2369:1: rule__BarChartFX__Group_9__1 : rule__BarChartFX__Group_9__1__Impl ;
    public final void rule__BarChartFX__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2373:1: ( rule__BarChartFX__Group_9__1__Impl )
            // InternalJavaFXLang.g:2374:2: rule__BarChartFX__Group_9__1__Impl
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
    // InternalJavaFXLang.g:2380:1: rule__BarChartFX__Group_9__1__Impl : ( ( rule__BarChartFX__XAxisLabelAssignment_9_1 ) ) ;
    public final void rule__BarChartFX__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2384:1: ( ( ( rule__BarChartFX__XAxisLabelAssignment_9_1 ) ) )
            // InternalJavaFXLang.g:2385:1: ( ( rule__BarChartFX__XAxisLabelAssignment_9_1 ) )
            {
            // InternalJavaFXLang.g:2385:1: ( ( rule__BarChartFX__XAxisLabelAssignment_9_1 ) )
            // InternalJavaFXLang.g:2386:2: ( rule__BarChartFX__XAxisLabelAssignment_9_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getXAxisLabelAssignment_9_1()); 
            // InternalJavaFXLang.g:2387:2: ( rule__BarChartFX__XAxisLabelAssignment_9_1 )
            // InternalJavaFXLang.g:2387:3: rule__BarChartFX__XAxisLabelAssignment_9_1
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
    // InternalJavaFXLang.g:2396:1: rule__BarChartFX__Group_10__0 : rule__BarChartFX__Group_10__0__Impl rule__BarChartFX__Group_10__1 ;
    public final void rule__BarChartFX__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2400:1: ( rule__BarChartFX__Group_10__0__Impl rule__BarChartFX__Group_10__1 )
            // InternalJavaFXLang.g:2401:2: rule__BarChartFX__Group_10__0__Impl rule__BarChartFX__Group_10__1
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
    // InternalJavaFXLang.g:2408:1: rule__BarChartFX__Group_10__0__Impl : ( 'xAxisType:' ) ;
    public final void rule__BarChartFX__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2412:1: ( ( 'xAxisType:' ) )
            // InternalJavaFXLang.g:2413:1: ( 'xAxisType:' )
            {
            // InternalJavaFXLang.g:2413:1: ( 'xAxisType:' )
            // InternalJavaFXLang.g:2414:2: 'xAxisType:'
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
    // InternalJavaFXLang.g:2423:1: rule__BarChartFX__Group_10__1 : rule__BarChartFX__Group_10__1__Impl ;
    public final void rule__BarChartFX__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2427:1: ( rule__BarChartFX__Group_10__1__Impl )
            // InternalJavaFXLang.g:2428:2: rule__BarChartFX__Group_10__1__Impl
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
    // InternalJavaFXLang.g:2434:1: rule__BarChartFX__Group_10__1__Impl : ( ( rule__BarChartFX__XAxisTypeAssignment_10_1 ) ) ;
    public final void rule__BarChartFX__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2438:1: ( ( ( rule__BarChartFX__XAxisTypeAssignment_10_1 ) ) )
            // InternalJavaFXLang.g:2439:1: ( ( rule__BarChartFX__XAxisTypeAssignment_10_1 ) )
            {
            // InternalJavaFXLang.g:2439:1: ( ( rule__BarChartFX__XAxisTypeAssignment_10_1 ) )
            // InternalJavaFXLang.g:2440:2: ( rule__BarChartFX__XAxisTypeAssignment_10_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getXAxisTypeAssignment_10_1()); 
            // InternalJavaFXLang.g:2441:2: ( rule__BarChartFX__XAxisTypeAssignment_10_1 )
            // InternalJavaFXLang.g:2441:3: rule__BarChartFX__XAxisTypeAssignment_10_1
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
    // InternalJavaFXLang.g:2450:1: rule__BarChartFX__Group_11__0 : rule__BarChartFX__Group_11__0__Impl rule__BarChartFX__Group_11__1 ;
    public final void rule__BarChartFX__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2454:1: ( rule__BarChartFX__Group_11__0__Impl rule__BarChartFX__Group_11__1 )
            // InternalJavaFXLang.g:2455:2: rule__BarChartFX__Group_11__0__Impl rule__BarChartFX__Group_11__1
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
    // InternalJavaFXLang.g:2462:1: rule__BarChartFX__Group_11__0__Impl : ( 'yAxisLabel:' ) ;
    public final void rule__BarChartFX__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2466:1: ( ( 'yAxisLabel:' ) )
            // InternalJavaFXLang.g:2467:1: ( 'yAxisLabel:' )
            {
            // InternalJavaFXLang.g:2467:1: ( 'yAxisLabel:' )
            // InternalJavaFXLang.g:2468:2: 'yAxisLabel:'
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
    // InternalJavaFXLang.g:2477:1: rule__BarChartFX__Group_11__1 : rule__BarChartFX__Group_11__1__Impl ;
    public final void rule__BarChartFX__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2481:1: ( rule__BarChartFX__Group_11__1__Impl )
            // InternalJavaFXLang.g:2482:2: rule__BarChartFX__Group_11__1__Impl
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
    // InternalJavaFXLang.g:2488:1: rule__BarChartFX__Group_11__1__Impl : ( ( rule__BarChartFX__YAxisLabelAssignment_11_1 ) ) ;
    public final void rule__BarChartFX__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2492:1: ( ( ( rule__BarChartFX__YAxisLabelAssignment_11_1 ) ) )
            // InternalJavaFXLang.g:2493:1: ( ( rule__BarChartFX__YAxisLabelAssignment_11_1 ) )
            {
            // InternalJavaFXLang.g:2493:1: ( ( rule__BarChartFX__YAxisLabelAssignment_11_1 ) )
            // InternalJavaFXLang.g:2494:2: ( rule__BarChartFX__YAxisLabelAssignment_11_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getYAxisLabelAssignment_11_1()); 
            // InternalJavaFXLang.g:2495:2: ( rule__BarChartFX__YAxisLabelAssignment_11_1 )
            // InternalJavaFXLang.g:2495:3: rule__BarChartFX__YAxisLabelAssignment_11_1
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
    // InternalJavaFXLang.g:2504:1: rule__BarChartFX__Group_12__0 : rule__BarChartFX__Group_12__0__Impl rule__BarChartFX__Group_12__1 ;
    public final void rule__BarChartFX__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2508:1: ( rule__BarChartFX__Group_12__0__Impl rule__BarChartFX__Group_12__1 )
            // InternalJavaFXLang.g:2509:2: rule__BarChartFX__Group_12__0__Impl rule__BarChartFX__Group_12__1
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
    // InternalJavaFXLang.g:2516:1: rule__BarChartFX__Group_12__0__Impl : ( 'yAxisType:' ) ;
    public final void rule__BarChartFX__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2520:1: ( ( 'yAxisType:' ) )
            // InternalJavaFXLang.g:2521:1: ( 'yAxisType:' )
            {
            // InternalJavaFXLang.g:2521:1: ( 'yAxisType:' )
            // InternalJavaFXLang.g:2522:2: 'yAxisType:'
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
    // InternalJavaFXLang.g:2531:1: rule__BarChartFX__Group_12__1 : rule__BarChartFX__Group_12__1__Impl ;
    public final void rule__BarChartFX__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2535:1: ( rule__BarChartFX__Group_12__1__Impl )
            // InternalJavaFXLang.g:2536:2: rule__BarChartFX__Group_12__1__Impl
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
    // InternalJavaFXLang.g:2542:1: rule__BarChartFX__Group_12__1__Impl : ( ( rule__BarChartFX__YAxisTypeAssignment_12_1 ) ) ;
    public final void rule__BarChartFX__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2546:1: ( ( ( rule__BarChartFX__YAxisTypeAssignment_12_1 ) ) )
            // InternalJavaFXLang.g:2547:1: ( ( rule__BarChartFX__YAxisTypeAssignment_12_1 ) )
            {
            // InternalJavaFXLang.g:2547:1: ( ( rule__BarChartFX__YAxisTypeAssignment_12_1 ) )
            // InternalJavaFXLang.g:2548:2: ( rule__BarChartFX__YAxisTypeAssignment_12_1 )
            {
             before(grammarAccess.getBarChartFXAccess().getYAxisTypeAssignment_12_1()); 
            // InternalJavaFXLang.g:2549:2: ( rule__BarChartFX__YAxisTypeAssignment_12_1 )
            // InternalJavaFXLang.g:2549:3: rule__BarChartFX__YAxisTypeAssignment_12_1
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
    // InternalJavaFXLang.g:2558:1: rule__ScatterChartFX__Group__0 : rule__ScatterChartFX__Group__0__Impl rule__ScatterChartFX__Group__1 ;
    public final void rule__ScatterChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2562:1: ( rule__ScatterChartFX__Group__0__Impl rule__ScatterChartFX__Group__1 )
            // InternalJavaFXLang.g:2563:2: rule__ScatterChartFX__Group__0__Impl rule__ScatterChartFX__Group__1
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
    // InternalJavaFXLang.g:2570:1: rule__ScatterChartFX__Group__0__Impl : ( () ) ;
    public final void rule__ScatterChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2574:1: ( ( () ) )
            // InternalJavaFXLang.g:2575:1: ( () )
            {
            // InternalJavaFXLang.g:2575:1: ( () )
            // InternalJavaFXLang.g:2576:2: ()
            {
             before(grammarAccess.getScatterChartFXAccess().getScatterChartFXAction_0()); 
            // InternalJavaFXLang.g:2577:2: ()
            // InternalJavaFXLang.g:2577:3: 
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
    // InternalJavaFXLang.g:2585:1: rule__ScatterChartFX__Group__1 : rule__ScatterChartFX__Group__1__Impl rule__ScatterChartFX__Group__2 ;
    public final void rule__ScatterChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2589:1: ( rule__ScatterChartFX__Group__1__Impl rule__ScatterChartFX__Group__2 )
            // InternalJavaFXLang.g:2590:2: rule__ScatterChartFX__Group__1__Impl rule__ScatterChartFX__Group__2
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
    // InternalJavaFXLang.g:2597:1: rule__ScatterChartFX__Group__1__Impl : ( 'ScatterChart' ) ;
    public final void rule__ScatterChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2601:1: ( ( 'ScatterChart' ) )
            // InternalJavaFXLang.g:2602:1: ( 'ScatterChart' )
            {
            // InternalJavaFXLang.g:2602:1: ( 'ScatterChart' )
            // InternalJavaFXLang.g:2603:2: 'ScatterChart'
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
    // InternalJavaFXLang.g:2612:1: rule__ScatterChartFX__Group__2 : rule__ScatterChartFX__Group__2__Impl rule__ScatterChartFX__Group__3 ;
    public final void rule__ScatterChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2616:1: ( rule__ScatterChartFX__Group__2__Impl rule__ScatterChartFX__Group__3 )
            // InternalJavaFXLang.g:2617:2: rule__ScatterChartFX__Group__2__Impl rule__ScatterChartFX__Group__3
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
    // InternalJavaFXLang.g:2624:1: rule__ScatterChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__ScatterChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2628:1: ( ( '{' ) )
            // InternalJavaFXLang.g:2629:1: ( '{' )
            {
            // InternalJavaFXLang.g:2629:1: ( '{' )
            // InternalJavaFXLang.g:2630:2: '{'
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
    // InternalJavaFXLang.g:2639:1: rule__ScatterChartFX__Group__3 : rule__ScatterChartFX__Group__3__Impl rule__ScatterChartFX__Group__4 ;
    public final void rule__ScatterChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2643:1: ( rule__ScatterChartFX__Group__3__Impl rule__ScatterChartFX__Group__4 )
            // InternalJavaFXLang.g:2644:2: rule__ScatterChartFX__Group__3__Impl rule__ScatterChartFX__Group__4
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
    // InternalJavaFXLang.g:2651:1: rule__ScatterChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__ScatterChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2655:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:2656:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:2656:1: ( 'name:' )
            // InternalJavaFXLang.g:2657:2: 'name:'
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
    // InternalJavaFXLang.g:2666:1: rule__ScatterChartFX__Group__4 : rule__ScatterChartFX__Group__4__Impl rule__ScatterChartFX__Group__5 ;
    public final void rule__ScatterChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2670:1: ( rule__ScatterChartFX__Group__4__Impl rule__ScatterChartFX__Group__5 )
            // InternalJavaFXLang.g:2671:2: rule__ScatterChartFX__Group__4__Impl rule__ScatterChartFX__Group__5
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
    // InternalJavaFXLang.g:2678:1: rule__ScatterChartFX__Group__4__Impl : ( ( rule__ScatterChartFX__NameAssignment_4 ) ) ;
    public final void rule__ScatterChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2682:1: ( ( ( rule__ScatterChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:2683:1: ( ( rule__ScatterChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:2683:1: ( ( rule__ScatterChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:2684:2: ( rule__ScatterChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getScatterChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:2685:2: ( rule__ScatterChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:2685:3: rule__ScatterChartFX__NameAssignment_4
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
    // InternalJavaFXLang.g:2693:1: rule__ScatterChartFX__Group__5 : rule__ScatterChartFX__Group__5__Impl rule__ScatterChartFX__Group__6 ;
    public final void rule__ScatterChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2697:1: ( rule__ScatterChartFX__Group__5__Impl rule__ScatterChartFX__Group__6 )
            // InternalJavaFXLang.g:2698:2: rule__ScatterChartFX__Group__5__Impl rule__ScatterChartFX__Group__6
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
    // InternalJavaFXLang.g:2705:1: rule__ScatterChartFX__Group__5__Impl : ( ( rule__ScatterChartFX__Group_5__0 )? ) ;
    public final void rule__ScatterChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2709:1: ( ( ( rule__ScatterChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:2710:1: ( ( rule__ScatterChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:2710:1: ( ( rule__ScatterChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:2711:2: ( rule__ScatterChartFX__Group_5__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:2712:2: ( rule__ScatterChartFX__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJavaFXLang.g:2712:3: rule__ScatterChartFX__Group_5__0
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
    // InternalJavaFXLang.g:2720:1: rule__ScatterChartFX__Group__6 : rule__ScatterChartFX__Group__6__Impl rule__ScatterChartFX__Group__7 ;
    public final void rule__ScatterChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2724:1: ( rule__ScatterChartFX__Group__6__Impl rule__ScatterChartFX__Group__7 )
            // InternalJavaFXLang.g:2725:2: rule__ScatterChartFX__Group__6__Impl rule__ScatterChartFX__Group__7
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
    // InternalJavaFXLang.g:2732:1: rule__ScatterChartFX__Group__6__Impl : ( ( rule__ScatterChartFX__Group_6__0 )? ) ;
    public final void rule__ScatterChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2736:1: ( ( ( rule__ScatterChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:2737:1: ( ( rule__ScatterChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:2737:1: ( ( rule__ScatterChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:2738:2: ( rule__ScatterChartFX__Group_6__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:2739:2: ( rule__ScatterChartFX__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJavaFXLang.g:2739:3: rule__ScatterChartFX__Group_6__0
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
    // InternalJavaFXLang.g:2747:1: rule__ScatterChartFX__Group__7 : rule__ScatterChartFX__Group__7__Impl rule__ScatterChartFX__Group__8 ;
    public final void rule__ScatterChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2751:1: ( rule__ScatterChartFX__Group__7__Impl rule__ScatterChartFX__Group__8 )
            // InternalJavaFXLang.g:2752:2: rule__ScatterChartFX__Group__7__Impl rule__ScatterChartFX__Group__8
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
    // InternalJavaFXLang.g:2759:1: rule__ScatterChartFX__Group__7__Impl : ( ( rule__ScatterChartFX__Group_7__0 )? ) ;
    public final void rule__ScatterChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2763:1: ( ( ( rule__ScatterChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:2764:1: ( ( rule__ScatterChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:2764:1: ( ( rule__ScatterChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:2765:2: ( rule__ScatterChartFX__Group_7__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:2766:2: ( rule__ScatterChartFX__Group_7__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJavaFXLang.g:2766:3: rule__ScatterChartFX__Group_7__0
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
    // InternalJavaFXLang.g:2774:1: rule__ScatterChartFX__Group__8 : rule__ScatterChartFX__Group__8__Impl rule__ScatterChartFX__Group__9 ;
    public final void rule__ScatterChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2778:1: ( rule__ScatterChartFX__Group__8__Impl rule__ScatterChartFX__Group__9 )
            // InternalJavaFXLang.g:2779:2: rule__ScatterChartFX__Group__8__Impl rule__ScatterChartFX__Group__9
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
    // InternalJavaFXLang.g:2786:1: rule__ScatterChartFX__Group__8__Impl : ( ( rule__ScatterChartFX__Group_8__0 )? ) ;
    public final void rule__ScatterChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2790:1: ( ( ( rule__ScatterChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:2791:1: ( ( rule__ScatterChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:2791:1: ( ( rule__ScatterChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:2792:2: ( rule__ScatterChartFX__Group_8__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:2793:2: ( rule__ScatterChartFX__Group_8__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalJavaFXLang.g:2793:3: rule__ScatterChartFX__Group_8__0
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
    // InternalJavaFXLang.g:2801:1: rule__ScatterChartFX__Group__9 : rule__ScatterChartFX__Group__9__Impl rule__ScatterChartFX__Group__10 ;
    public final void rule__ScatterChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2805:1: ( rule__ScatterChartFX__Group__9__Impl rule__ScatterChartFX__Group__10 )
            // InternalJavaFXLang.g:2806:2: rule__ScatterChartFX__Group__9__Impl rule__ScatterChartFX__Group__10
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
    // InternalJavaFXLang.g:2813:1: rule__ScatterChartFX__Group__9__Impl : ( ( rule__ScatterChartFX__Group_9__0 )? ) ;
    public final void rule__ScatterChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2817:1: ( ( ( rule__ScatterChartFX__Group_9__0 )? ) )
            // InternalJavaFXLang.g:2818:1: ( ( rule__ScatterChartFX__Group_9__0 )? )
            {
            // InternalJavaFXLang.g:2818:1: ( ( rule__ScatterChartFX__Group_9__0 )? )
            // InternalJavaFXLang.g:2819:2: ( rule__ScatterChartFX__Group_9__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_9()); 
            // InternalJavaFXLang.g:2820:2: ( rule__ScatterChartFX__Group_9__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalJavaFXLang.g:2820:3: rule__ScatterChartFX__Group_9__0
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
    // InternalJavaFXLang.g:2828:1: rule__ScatterChartFX__Group__10 : rule__ScatterChartFX__Group__10__Impl rule__ScatterChartFX__Group__11 ;
    public final void rule__ScatterChartFX__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2832:1: ( rule__ScatterChartFX__Group__10__Impl rule__ScatterChartFX__Group__11 )
            // InternalJavaFXLang.g:2833:2: rule__ScatterChartFX__Group__10__Impl rule__ScatterChartFX__Group__11
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
    // InternalJavaFXLang.g:2840:1: rule__ScatterChartFX__Group__10__Impl : ( ( rule__ScatterChartFX__Group_10__0 )? ) ;
    public final void rule__ScatterChartFX__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2844:1: ( ( ( rule__ScatterChartFX__Group_10__0 )? ) )
            // InternalJavaFXLang.g:2845:1: ( ( rule__ScatterChartFX__Group_10__0 )? )
            {
            // InternalJavaFXLang.g:2845:1: ( ( rule__ScatterChartFX__Group_10__0 )? )
            // InternalJavaFXLang.g:2846:2: ( rule__ScatterChartFX__Group_10__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_10()); 
            // InternalJavaFXLang.g:2847:2: ( rule__ScatterChartFX__Group_10__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalJavaFXLang.g:2847:3: rule__ScatterChartFX__Group_10__0
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
    // InternalJavaFXLang.g:2855:1: rule__ScatterChartFX__Group__11 : rule__ScatterChartFX__Group__11__Impl rule__ScatterChartFX__Group__12 ;
    public final void rule__ScatterChartFX__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2859:1: ( rule__ScatterChartFX__Group__11__Impl rule__ScatterChartFX__Group__12 )
            // InternalJavaFXLang.g:2860:2: rule__ScatterChartFX__Group__11__Impl rule__ScatterChartFX__Group__12
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
    // InternalJavaFXLang.g:2867:1: rule__ScatterChartFX__Group__11__Impl : ( ( rule__ScatterChartFX__Group_11__0 )? ) ;
    public final void rule__ScatterChartFX__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2871:1: ( ( ( rule__ScatterChartFX__Group_11__0 )? ) )
            // InternalJavaFXLang.g:2872:1: ( ( rule__ScatterChartFX__Group_11__0 )? )
            {
            // InternalJavaFXLang.g:2872:1: ( ( rule__ScatterChartFX__Group_11__0 )? )
            // InternalJavaFXLang.g:2873:2: ( rule__ScatterChartFX__Group_11__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_11()); 
            // InternalJavaFXLang.g:2874:2: ( rule__ScatterChartFX__Group_11__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalJavaFXLang.g:2874:3: rule__ScatterChartFX__Group_11__0
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
    // InternalJavaFXLang.g:2882:1: rule__ScatterChartFX__Group__12 : rule__ScatterChartFX__Group__12__Impl rule__ScatterChartFX__Group__13 ;
    public final void rule__ScatterChartFX__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2886:1: ( rule__ScatterChartFX__Group__12__Impl rule__ScatterChartFX__Group__13 )
            // InternalJavaFXLang.g:2887:2: rule__ScatterChartFX__Group__12__Impl rule__ScatterChartFX__Group__13
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
    // InternalJavaFXLang.g:2894:1: rule__ScatterChartFX__Group__12__Impl : ( ( rule__ScatterChartFX__Group_12__0 )? ) ;
    public final void rule__ScatterChartFX__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2898:1: ( ( ( rule__ScatterChartFX__Group_12__0 )? ) )
            // InternalJavaFXLang.g:2899:1: ( ( rule__ScatterChartFX__Group_12__0 )? )
            {
            // InternalJavaFXLang.g:2899:1: ( ( rule__ScatterChartFX__Group_12__0 )? )
            // InternalJavaFXLang.g:2900:2: ( rule__ScatterChartFX__Group_12__0 )?
            {
             before(grammarAccess.getScatterChartFXAccess().getGroup_12()); 
            // InternalJavaFXLang.g:2901:2: ( rule__ScatterChartFX__Group_12__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalJavaFXLang.g:2901:3: rule__ScatterChartFX__Group_12__0
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
    // InternalJavaFXLang.g:2909:1: rule__ScatterChartFX__Group__13 : rule__ScatterChartFX__Group__13__Impl ;
    public final void rule__ScatterChartFX__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2913:1: ( rule__ScatterChartFX__Group__13__Impl )
            // InternalJavaFXLang.g:2914:2: rule__ScatterChartFX__Group__13__Impl
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
    // InternalJavaFXLang.g:2920:1: rule__ScatterChartFX__Group__13__Impl : ( '}' ) ;
    public final void rule__ScatterChartFX__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2924:1: ( ( '}' ) )
            // InternalJavaFXLang.g:2925:1: ( '}' )
            {
            // InternalJavaFXLang.g:2925:1: ( '}' )
            // InternalJavaFXLang.g:2926:2: '}'
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
    // InternalJavaFXLang.g:2936:1: rule__ScatterChartFX__Group_5__0 : rule__ScatterChartFX__Group_5__0__Impl rule__ScatterChartFX__Group_5__1 ;
    public final void rule__ScatterChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2940:1: ( rule__ScatterChartFX__Group_5__0__Impl rule__ScatterChartFX__Group_5__1 )
            // InternalJavaFXLang.g:2941:2: rule__ScatterChartFX__Group_5__0__Impl rule__ScatterChartFX__Group_5__1
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
    // InternalJavaFXLang.g:2948:1: rule__ScatterChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__ScatterChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2952:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:2953:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:2953:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:2954:2: 'legendSide:'
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
    // InternalJavaFXLang.g:2963:1: rule__ScatterChartFX__Group_5__1 : rule__ScatterChartFX__Group_5__1__Impl ;
    public final void rule__ScatterChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2967:1: ( rule__ScatterChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:2968:2: rule__ScatterChartFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:2974:1: rule__ScatterChartFX__Group_5__1__Impl : ( ( rule__ScatterChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__ScatterChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2978:1: ( ( ( rule__ScatterChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:2979:1: ( ( rule__ScatterChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:2979:1: ( ( rule__ScatterChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:2980:2: ( rule__ScatterChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:2981:2: ( rule__ScatterChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:2981:3: rule__ScatterChartFX__LegendSideAssignment_5_1
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
    // InternalJavaFXLang.g:2990:1: rule__ScatterChartFX__Group_6__0 : rule__ScatterChartFX__Group_6__0__Impl rule__ScatterChartFX__Group_6__1 ;
    public final void rule__ScatterChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2994:1: ( rule__ScatterChartFX__Group_6__0__Impl rule__ScatterChartFX__Group_6__1 )
            // InternalJavaFXLang.g:2995:2: rule__ScatterChartFX__Group_6__0__Impl rule__ScatterChartFX__Group_6__1
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
    // InternalJavaFXLang.g:3002:1: rule__ScatterChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__ScatterChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3006:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:3007:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:3007:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:3008:2: 'showLegend:'
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
    // InternalJavaFXLang.g:3017:1: rule__ScatterChartFX__Group_6__1 : rule__ScatterChartFX__Group_6__1__Impl ;
    public final void rule__ScatterChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3021:1: ( rule__ScatterChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:3022:2: rule__ScatterChartFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:3028:1: rule__ScatterChartFX__Group_6__1__Impl : ( ( rule__ScatterChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__ScatterChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3032:1: ( ( ( rule__ScatterChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:3033:1: ( ( rule__ScatterChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:3033:1: ( ( rule__ScatterChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:3034:2: ( rule__ScatterChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:3035:2: ( rule__ScatterChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:3035:3: rule__ScatterChartFX__ShowLegendAssignment_6_1
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
    // InternalJavaFXLang.g:3044:1: rule__ScatterChartFX__Group_7__0 : rule__ScatterChartFX__Group_7__0__Impl rule__ScatterChartFX__Group_7__1 ;
    public final void rule__ScatterChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3048:1: ( rule__ScatterChartFX__Group_7__0__Impl rule__ScatterChartFX__Group_7__1 )
            // InternalJavaFXLang.g:3049:2: rule__ScatterChartFX__Group_7__0__Impl rule__ScatterChartFX__Group_7__1
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
    // InternalJavaFXLang.g:3056:1: rule__ScatterChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__ScatterChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3060:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:3061:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:3061:1: ( 'title:' )
            // InternalJavaFXLang.g:3062:2: 'title:'
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
    // InternalJavaFXLang.g:3071:1: rule__ScatterChartFX__Group_7__1 : rule__ScatterChartFX__Group_7__1__Impl ;
    public final void rule__ScatterChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3075:1: ( rule__ScatterChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:3076:2: rule__ScatterChartFX__Group_7__1__Impl
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
    // InternalJavaFXLang.g:3082:1: rule__ScatterChartFX__Group_7__1__Impl : ( ( rule__ScatterChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__ScatterChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3086:1: ( ( ( rule__ScatterChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:3087:1: ( ( rule__ScatterChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:3087:1: ( ( rule__ScatterChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:3088:2: ( rule__ScatterChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:3089:2: ( rule__ScatterChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:3089:3: rule__ScatterChartFX__TitleAssignment_7_1
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
    // InternalJavaFXLang.g:3098:1: rule__ScatterChartFX__Group_8__0 : rule__ScatterChartFX__Group_8__0__Impl rule__ScatterChartFX__Group_8__1 ;
    public final void rule__ScatterChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3102:1: ( rule__ScatterChartFX__Group_8__0__Impl rule__ScatterChartFX__Group_8__1 )
            // InternalJavaFXLang.g:3103:2: rule__ScatterChartFX__Group_8__0__Impl rule__ScatterChartFX__Group_8__1
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
    // InternalJavaFXLang.g:3110:1: rule__ScatterChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__ScatterChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3114:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:3115:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:3115:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:3116:2: 'titleSide:'
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
    // InternalJavaFXLang.g:3125:1: rule__ScatterChartFX__Group_8__1 : rule__ScatterChartFX__Group_8__1__Impl ;
    public final void rule__ScatterChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3129:1: ( rule__ScatterChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:3130:2: rule__ScatterChartFX__Group_8__1__Impl
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
    // InternalJavaFXLang.g:3136:1: rule__ScatterChartFX__Group_8__1__Impl : ( ( rule__ScatterChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__ScatterChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3140:1: ( ( ( rule__ScatterChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:3141:1: ( ( rule__ScatterChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:3141:1: ( ( rule__ScatterChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:3142:2: ( rule__ScatterChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:3143:2: ( rule__ScatterChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:3143:3: rule__ScatterChartFX__TitleSideAssignment_8_1
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
    // InternalJavaFXLang.g:3152:1: rule__ScatterChartFX__Group_9__0 : rule__ScatterChartFX__Group_9__0__Impl rule__ScatterChartFX__Group_9__1 ;
    public final void rule__ScatterChartFX__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3156:1: ( rule__ScatterChartFX__Group_9__0__Impl rule__ScatterChartFX__Group_9__1 )
            // InternalJavaFXLang.g:3157:2: rule__ScatterChartFX__Group_9__0__Impl rule__ScatterChartFX__Group_9__1
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
    // InternalJavaFXLang.g:3164:1: rule__ScatterChartFX__Group_9__0__Impl : ( 'xAxisLabel:' ) ;
    public final void rule__ScatterChartFX__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3168:1: ( ( 'xAxisLabel:' ) )
            // InternalJavaFXLang.g:3169:1: ( 'xAxisLabel:' )
            {
            // InternalJavaFXLang.g:3169:1: ( 'xAxisLabel:' )
            // InternalJavaFXLang.g:3170:2: 'xAxisLabel:'
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
    // InternalJavaFXLang.g:3179:1: rule__ScatterChartFX__Group_9__1 : rule__ScatterChartFX__Group_9__1__Impl ;
    public final void rule__ScatterChartFX__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3183:1: ( rule__ScatterChartFX__Group_9__1__Impl )
            // InternalJavaFXLang.g:3184:2: rule__ScatterChartFX__Group_9__1__Impl
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
    // InternalJavaFXLang.g:3190:1: rule__ScatterChartFX__Group_9__1__Impl : ( ( rule__ScatterChartFX__XAxisLabelAssignment_9_1 ) ) ;
    public final void rule__ScatterChartFX__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3194:1: ( ( ( rule__ScatterChartFX__XAxisLabelAssignment_9_1 ) ) )
            // InternalJavaFXLang.g:3195:1: ( ( rule__ScatterChartFX__XAxisLabelAssignment_9_1 ) )
            {
            // InternalJavaFXLang.g:3195:1: ( ( rule__ScatterChartFX__XAxisLabelAssignment_9_1 ) )
            // InternalJavaFXLang.g:3196:2: ( rule__ScatterChartFX__XAxisLabelAssignment_9_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getXAxisLabelAssignment_9_1()); 
            // InternalJavaFXLang.g:3197:2: ( rule__ScatterChartFX__XAxisLabelAssignment_9_1 )
            // InternalJavaFXLang.g:3197:3: rule__ScatterChartFX__XAxisLabelAssignment_9_1
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
    // InternalJavaFXLang.g:3206:1: rule__ScatterChartFX__Group_10__0 : rule__ScatterChartFX__Group_10__0__Impl rule__ScatterChartFX__Group_10__1 ;
    public final void rule__ScatterChartFX__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3210:1: ( rule__ScatterChartFX__Group_10__0__Impl rule__ScatterChartFX__Group_10__1 )
            // InternalJavaFXLang.g:3211:2: rule__ScatterChartFX__Group_10__0__Impl rule__ScatterChartFX__Group_10__1
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
    // InternalJavaFXLang.g:3218:1: rule__ScatterChartFX__Group_10__0__Impl : ( 'xAxisType:' ) ;
    public final void rule__ScatterChartFX__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3222:1: ( ( 'xAxisType:' ) )
            // InternalJavaFXLang.g:3223:1: ( 'xAxisType:' )
            {
            // InternalJavaFXLang.g:3223:1: ( 'xAxisType:' )
            // InternalJavaFXLang.g:3224:2: 'xAxisType:'
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
    // InternalJavaFXLang.g:3233:1: rule__ScatterChartFX__Group_10__1 : rule__ScatterChartFX__Group_10__1__Impl ;
    public final void rule__ScatterChartFX__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3237:1: ( rule__ScatterChartFX__Group_10__1__Impl )
            // InternalJavaFXLang.g:3238:2: rule__ScatterChartFX__Group_10__1__Impl
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
    // InternalJavaFXLang.g:3244:1: rule__ScatterChartFX__Group_10__1__Impl : ( ( rule__ScatterChartFX__XAxisTypeAssignment_10_1 ) ) ;
    public final void rule__ScatterChartFX__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3248:1: ( ( ( rule__ScatterChartFX__XAxisTypeAssignment_10_1 ) ) )
            // InternalJavaFXLang.g:3249:1: ( ( rule__ScatterChartFX__XAxisTypeAssignment_10_1 ) )
            {
            // InternalJavaFXLang.g:3249:1: ( ( rule__ScatterChartFX__XAxisTypeAssignment_10_1 ) )
            // InternalJavaFXLang.g:3250:2: ( rule__ScatterChartFX__XAxisTypeAssignment_10_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getXAxisTypeAssignment_10_1()); 
            // InternalJavaFXLang.g:3251:2: ( rule__ScatterChartFX__XAxisTypeAssignment_10_1 )
            // InternalJavaFXLang.g:3251:3: rule__ScatterChartFX__XAxisTypeAssignment_10_1
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
    // InternalJavaFXLang.g:3260:1: rule__ScatterChartFX__Group_11__0 : rule__ScatterChartFX__Group_11__0__Impl rule__ScatterChartFX__Group_11__1 ;
    public final void rule__ScatterChartFX__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3264:1: ( rule__ScatterChartFX__Group_11__0__Impl rule__ScatterChartFX__Group_11__1 )
            // InternalJavaFXLang.g:3265:2: rule__ScatterChartFX__Group_11__0__Impl rule__ScatterChartFX__Group_11__1
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
    // InternalJavaFXLang.g:3272:1: rule__ScatterChartFX__Group_11__0__Impl : ( 'yAxisLabel:' ) ;
    public final void rule__ScatterChartFX__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3276:1: ( ( 'yAxisLabel:' ) )
            // InternalJavaFXLang.g:3277:1: ( 'yAxisLabel:' )
            {
            // InternalJavaFXLang.g:3277:1: ( 'yAxisLabel:' )
            // InternalJavaFXLang.g:3278:2: 'yAxisLabel:'
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
    // InternalJavaFXLang.g:3287:1: rule__ScatterChartFX__Group_11__1 : rule__ScatterChartFX__Group_11__1__Impl ;
    public final void rule__ScatterChartFX__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3291:1: ( rule__ScatterChartFX__Group_11__1__Impl )
            // InternalJavaFXLang.g:3292:2: rule__ScatterChartFX__Group_11__1__Impl
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
    // InternalJavaFXLang.g:3298:1: rule__ScatterChartFX__Group_11__1__Impl : ( ( rule__ScatterChartFX__YAxisLabelAssignment_11_1 ) ) ;
    public final void rule__ScatterChartFX__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3302:1: ( ( ( rule__ScatterChartFX__YAxisLabelAssignment_11_1 ) ) )
            // InternalJavaFXLang.g:3303:1: ( ( rule__ScatterChartFX__YAxisLabelAssignment_11_1 ) )
            {
            // InternalJavaFXLang.g:3303:1: ( ( rule__ScatterChartFX__YAxisLabelAssignment_11_1 ) )
            // InternalJavaFXLang.g:3304:2: ( rule__ScatterChartFX__YAxisLabelAssignment_11_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getYAxisLabelAssignment_11_1()); 
            // InternalJavaFXLang.g:3305:2: ( rule__ScatterChartFX__YAxisLabelAssignment_11_1 )
            // InternalJavaFXLang.g:3305:3: rule__ScatterChartFX__YAxisLabelAssignment_11_1
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
    // InternalJavaFXLang.g:3314:1: rule__ScatterChartFX__Group_12__0 : rule__ScatterChartFX__Group_12__0__Impl rule__ScatterChartFX__Group_12__1 ;
    public final void rule__ScatterChartFX__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3318:1: ( rule__ScatterChartFX__Group_12__0__Impl rule__ScatterChartFX__Group_12__1 )
            // InternalJavaFXLang.g:3319:2: rule__ScatterChartFX__Group_12__0__Impl rule__ScatterChartFX__Group_12__1
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
    // InternalJavaFXLang.g:3326:1: rule__ScatterChartFX__Group_12__0__Impl : ( 'yAxisType:' ) ;
    public final void rule__ScatterChartFX__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3330:1: ( ( 'yAxisType:' ) )
            // InternalJavaFXLang.g:3331:1: ( 'yAxisType:' )
            {
            // InternalJavaFXLang.g:3331:1: ( 'yAxisType:' )
            // InternalJavaFXLang.g:3332:2: 'yAxisType:'
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
    // InternalJavaFXLang.g:3341:1: rule__ScatterChartFX__Group_12__1 : rule__ScatterChartFX__Group_12__1__Impl ;
    public final void rule__ScatterChartFX__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3345:1: ( rule__ScatterChartFX__Group_12__1__Impl )
            // InternalJavaFXLang.g:3346:2: rule__ScatterChartFX__Group_12__1__Impl
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
    // InternalJavaFXLang.g:3352:1: rule__ScatterChartFX__Group_12__1__Impl : ( ( rule__ScatterChartFX__YAxisTypeAssignment_12_1 ) ) ;
    public final void rule__ScatterChartFX__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3356:1: ( ( ( rule__ScatterChartFX__YAxisTypeAssignment_12_1 ) ) )
            // InternalJavaFXLang.g:3357:1: ( ( rule__ScatterChartFX__YAxisTypeAssignment_12_1 ) )
            {
            // InternalJavaFXLang.g:3357:1: ( ( rule__ScatterChartFX__YAxisTypeAssignment_12_1 ) )
            // InternalJavaFXLang.g:3358:2: ( rule__ScatterChartFX__YAxisTypeAssignment_12_1 )
            {
             before(grammarAccess.getScatterChartFXAccess().getYAxisTypeAssignment_12_1()); 
            // InternalJavaFXLang.g:3359:2: ( rule__ScatterChartFX__YAxisTypeAssignment_12_1 )
            // InternalJavaFXLang.g:3359:3: rule__ScatterChartFX__YAxisTypeAssignment_12_1
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
    // InternalJavaFXLang.g:3368:1: rule__BubbleChartFX__Group__0 : rule__BubbleChartFX__Group__0__Impl rule__BubbleChartFX__Group__1 ;
    public final void rule__BubbleChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3372:1: ( rule__BubbleChartFX__Group__0__Impl rule__BubbleChartFX__Group__1 )
            // InternalJavaFXLang.g:3373:2: rule__BubbleChartFX__Group__0__Impl rule__BubbleChartFX__Group__1
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
    // InternalJavaFXLang.g:3380:1: rule__BubbleChartFX__Group__0__Impl : ( () ) ;
    public final void rule__BubbleChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3384:1: ( ( () ) )
            // InternalJavaFXLang.g:3385:1: ( () )
            {
            // InternalJavaFXLang.g:3385:1: ( () )
            // InternalJavaFXLang.g:3386:2: ()
            {
             before(grammarAccess.getBubbleChartFXAccess().getBubbleChartFXAction_0()); 
            // InternalJavaFXLang.g:3387:2: ()
            // InternalJavaFXLang.g:3387:3: 
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
    // InternalJavaFXLang.g:3395:1: rule__BubbleChartFX__Group__1 : rule__BubbleChartFX__Group__1__Impl rule__BubbleChartFX__Group__2 ;
    public final void rule__BubbleChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3399:1: ( rule__BubbleChartFX__Group__1__Impl rule__BubbleChartFX__Group__2 )
            // InternalJavaFXLang.g:3400:2: rule__BubbleChartFX__Group__1__Impl rule__BubbleChartFX__Group__2
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
    // InternalJavaFXLang.g:3407:1: rule__BubbleChartFX__Group__1__Impl : ( 'BubbleChart' ) ;
    public final void rule__BubbleChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3411:1: ( ( 'BubbleChart' ) )
            // InternalJavaFXLang.g:3412:1: ( 'BubbleChart' )
            {
            // InternalJavaFXLang.g:3412:1: ( 'BubbleChart' )
            // InternalJavaFXLang.g:3413:2: 'BubbleChart'
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
    // InternalJavaFXLang.g:3422:1: rule__BubbleChartFX__Group__2 : rule__BubbleChartFX__Group__2__Impl rule__BubbleChartFX__Group__3 ;
    public final void rule__BubbleChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3426:1: ( rule__BubbleChartFX__Group__2__Impl rule__BubbleChartFX__Group__3 )
            // InternalJavaFXLang.g:3427:2: rule__BubbleChartFX__Group__2__Impl rule__BubbleChartFX__Group__3
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
    // InternalJavaFXLang.g:3434:1: rule__BubbleChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__BubbleChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3438:1: ( ( '{' ) )
            // InternalJavaFXLang.g:3439:1: ( '{' )
            {
            // InternalJavaFXLang.g:3439:1: ( '{' )
            // InternalJavaFXLang.g:3440:2: '{'
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
    // InternalJavaFXLang.g:3449:1: rule__BubbleChartFX__Group__3 : rule__BubbleChartFX__Group__3__Impl rule__BubbleChartFX__Group__4 ;
    public final void rule__BubbleChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3453:1: ( rule__BubbleChartFX__Group__3__Impl rule__BubbleChartFX__Group__4 )
            // InternalJavaFXLang.g:3454:2: rule__BubbleChartFX__Group__3__Impl rule__BubbleChartFX__Group__4
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
    // InternalJavaFXLang.g:3461:1: rule__BubbleChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__BubbleChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3465:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:3466:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:3466:1: ( 'name:' )
            // InternalJavaFXLang.g:3467:2: 'name:'
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
    // InternalJavaFXLang.g:3476:1: rule__BubbleChartFX__Group__4 : rule__BubbleChartFX__Group__4__Impl rule__BubbleChartFX__Group__5 ;
    public final void rule__BubbleChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3480:1: ( rule__BubbleChartFX__Group__4__Impl rule__BubbleChartFX__Group__5 )
            // InternalJavaFXLang.g:3481:2: rule__BubbleChartFX__Group__4__Impl rule__BubbleChartFX__Group__5
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
    // InternalJavaFXLang.g:3488:1: rule__BubbleChartFX__Group__4__Impl : ( ( rule__BubbleChartFX__NameAssignment_4 ) ) ;
    public final void rule__BubbleChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3492:1: ( ( ( rule__BubbleChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:3493:1: ( ( rule__BubbleChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:3493:1: ( ( rule__BubbleChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:3494:2: ( rule__BubbleChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:3495:2: ( rule__BubbleChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:3495:3: rule__BubbleChartFX__NameAssignment_4
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
    // InternalJavaFXLang.g:3503:1: rule__BubbleChartFX__Group__5 : rule__BubbleChartFX__Group__5__Impl rule__BubbleChartFX__Group__6 ;
    public final void rule__BubbleChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3507:1: ( rule__BubbleChartFX__Group__5__Impl rule__BubbleChartFX__Group__6 )
            // InternalJavaFXLang.g:3508:2: rule__BubbleChartFX__Group__5__Impl rule__BubbleChartFX__Group__6
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
    // InternalJavaFXLang.g:3515:1: rule__BubbleChartFX__Group__5__Impl : ( ( rule__BubbleChartFX__Group_5__0 )? ) ;
    public final void rule__BubbleChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3519:1: ( ( ( rule__BubbleChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:3520:1: ( ( rule__BubbleChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:3520:1: ( ( rule__BubbleChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:3521:2: ( rule__BubbleChartFX__Group_5__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:3522:2: ( rule__BubbleChartFX__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalJavaFXLang.g:3522:3: rule__BubbleChartFX__Group_5__0
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
    // InternalJavaFXLang.g:3530:1: rule__BubbleChartFX__Group__6 : rule__BubbleChartFX__Group__6__Impl rule__BubbleChartFX__Group__7 ;
    public final void rule__BubbleChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3534:1: ( rule__BubbleChartFX__Group__6__Impl rule__BubbleChartFX__Group__7 )
            // InternalJavaFXLang.g:3535:2: rule__BubbleChartFX__Group__6__Impl rule__BubbleChartFX__Group__7
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
    // InternalJavaFXLang.g:3542:1: rule__BubbleChartFX__Group__6__Impl : ( ( rule__BubbleChartFX__Group_6__0 )? ) ;
    public final void rule__BubbleChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3546:1: ( ( ( rule__BubbleChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:3547:1: ( ( rule__BubbleChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:3547:1: ( ( rule__BubbleChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:3548:2: ( rule__BubbleChartFX__Group_6__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:3549:2: ( rule__BubbleChartFX__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalJavaFXLang.g:3549:3: rule__BubbleChartFX__Group_6__0
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
    // InternalJavaFXLang.g:3557:1: rule__BubbleChartFX__Group__7 : rule__BubbleChartFX__Group__7__Impl rule__BubbleChartFX__Group__8 ;
    public final void rule__BubbleChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3561:1: ( rule__BubbleChartFX__Group__7__Impl rule__BubbleChartFX__Group__8 )
            // InternalJavaFXLang.g:3562:2: rule__BubbleChartFX__Group__7__Impl rule__BubbleChartFX__Group__8
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
    // InternalJavaFXLang.g:3569:1: rule__BubbleChartFX__Group__7__Impl : ( ( rule__BubbleChartFX__Group_7__0 )? ) ;
    public final void rule__BubbleChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3573:1: ( ( ( rule__BubbleChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:3574:1: ( ( rule__BubbleChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:3574:1: ( ( rule__BubbleChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:3575:2: ( rule__BubbleChartFX__Group_7__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:3576:2: ( rule__BubbleChartFX__Group_7__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalJavaFXLang.g:3576:3: rule__BubbleChartFX__Group_7__0
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
    // InternalJavaFXLang.g:3584:1: rule__BubbleChartFX__Group__8 : rule__BubbleChartFX__Group__8__Impl rule__BubbleChartFX__Group__9 ;
    public final void rule__BubbleChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3588:1: ( rule__BubbleChartFX__Group__8__Impl rule__BubbleChartFX__Group__9 )
            // InternalJavaFXLang.g:3589:2: rule__BubbleChartFX__Group__8__Impl rule__BubbleChartFX__Group__9
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
    // InternalJavaFXLang.g:3596:1: rule__BubbleChartFX__Group__8__Impl : ( ( rule__BubbleChartFX__Group_8__0 )? ) ;
    public final void rule__BubbleChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3600:1: ( ( ( rule__BubbleChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:3601:1: ( ( rule__BubbleChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:3601:1: ( ( rule__BubbleChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:3602:2: ( rule__BubbleChartFX__Group_8__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:3603:2: ( rule__BubbleChartFX__Group_8__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalJavaFXLang.g:3603:3: rule__BubbleChartFX__Group_8__0
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
    // InternalJavaFXLang.g:3611:1: rule__BubbleChartFX__Group__9 : rule__BubbleChartFX__Group__9__Impl rule__BubbleChartFX__Group__10 ;
    public final void rule__BubbleChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3615:1: ( rule__BubbleChartFX__Group__9__Impl rule__BubbleChartFX__Group__10 )
            // InternalJavaFXLang.g:3616:2: rule__BubbleChartFX__Group__9__Impl rule__BubbleChartFX__Group__10
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
    // InternalJavaFXLang.g:3623:1: rule__BubbleChartFX__Group__9__Impl : ( ( rule__BubbleChartFX__Group_9__0 )? ) ;
    public final void rule__BubbleChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3627:1: ( ( ( rule__BubbleChartFX__Group_9__0 )? ) )
            // InternalJavaFXLang.g:3628:1: ( ( rule__BubbleChartFX__Group_9__0 )? )
            {
            // InternalJavaFXLang.g:3628:1: ( ( rule__BubbleChartFX__Group_9__0 )? )
            // InternalJavaFXLang.g:3629:2: ( rule__BubbleChartFX__Group_9__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_9()); 
            // InternalJavaFXLang.g:3630:2: ( rule__BubbleChartFX__Group_9__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalJavaFXLang.g:3630:3: rule__BubbleChartFX__Group_9__0
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
    // InternalJavaFXLang.g:3638:1: rule__BubbleChartFX__Group__10 : rule__BubbleChartFX__Group__10__Impl rule__BubbleChartFX__Group__11 ;
    public final void rule__BubbleChartFX__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3642:1: ( rule__BubbleChartFX__Group__10__Impl rule__BubbleChartFX__Group__11 )
            // InternalJavaFXLang.g:3643:2: rule__BubbleChartFX__Group__10__Impl rule__BubbleChartFX__Group__11
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
    // InternalJavaFXLang.g:3650:1: rule__BubbleChartFX__Group__10__Impl : ( ( rule__BubbleChartFX__Group_10__0 )? ) ;
    public final void rule__BubbleChartFX__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3654:1: ( ( ( rule__BubbleChartFX__Group_10__0 )? ) )
            // InternalJavaFXLang.g:3655:1: ( ( rule__BubbleChartFX__Group_10__0 )? )
            {
            // InternalJavaFXLang.g:3655:1: ( ( rule__BubbleChartFX__Group_10__0 )? )
            // InternalJavaFXLang.g:3656:2: ( rule__BubbleChartFX__Group_10__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_10()); 
            // InternalJavaFXLang.g:3657:2: ( rule__BubbleChartFX__Group_10__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==41) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalJavaFXLang.g:3657:3: rule__BubbleChartFX__Group_10__0
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
    // InternalJavaFXLang.g:3665:1: rule__BubbleChartFX__Group__11 : rule__BubbleChartFX__Group__11__Impl rule__BubbleChartFX__Group__12 ;
    public final void rule__BubbleChartFX__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3669:1: ( rule__BubbleChartFX__Group__11__Impl rule__BubbleChartFX__Group__12 )
            // InternalJavaFXLang.g:3670:2: rule__BubbleChartFX__Group__11__Impl rule__BubbleChartFX__Group__12
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
    // InternalJavaFXLang.g:3677:1: rule__BubbleChartFX__Group__11__Impl : ( ( rule__BubbleChartFX__Group_11__0 )? ) ;
    public final void rule__BubbleChartFX__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3681:1: ( ( ( rule__BubbleChartFX__Group_11__0 )? ) )
            // InternalJavaFXLang.g:3682:1: ( ( rule__BubbleChartFX__Group_11__0 )? )
            {
            // InternalJavaFXLang.g:3682:1: ( ( rule__BubbleChartFX__Group_11__0 )? )
            // InternalJavaFXLang.g:3683:2: ( rule__BubbleChartFX__Group_11__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_11()); 
            // InternalJavaFXLang.g:3684:2: ( rule__BubbleChartFX__Group_11__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==42) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalJavaFXLang.g:3684:3: rule__BubbleChartFX__Group_11__0
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
    // InternalJavaFXLang.g:3692:1: rule__BubbleChartFX__Group__12 : rule__BubbleChartFX__Group__12__Impl rule__BubbleChartFX__Group__13 ;
    public final void rule__BubbleChartFX__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3696:1: ( rule__BubbleChartFX__Group__12__Impl rule__BubbleChartFX__Group__13 )
            // InternalJavaFXLang.g:3697:2: rule__BubbleChartFX__Group__12__Impl rule__BubbleChartFX__Group__13
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
    // InternalJavaFXLang.g:3704:1: rule__BubbleChartFX__Group__12__Impl : ( ( rule__BubbleChartFX__Group_12__0 )? ) ;
    public final void rule__BubbleChartFX__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3708:1: ( ( ( rule__BubbleChartFX__Group_12__0 )? ) )
            // InternalJavaFXLang.g:3709:1: ( ( rule__BubbleChartFX__Group_12__0 )? )
            {
            // InternalJavaFXLang.g:3709:1: ( ( rule__BubbleChartFX__Group_12__0 )? )
            // InternalJavaFXLang.g:3710:2: ( rule__BubbleChartFX__Group_12__0 )?
            {
             before(grammarAccess.getBubbleChartFXAccess().getGroup_12()); 
            // InternalJavaFXLang.g:3711:2: ( rule__BubbleChartFX__Group_12__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalJavaFXLang.g:3711:3: rule__BubbleChartFX__Group_12__0
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
    // InternalJavaFXLang.g:3719:1: rule__BubbleChartFX__Group__13 : rule__BubbleChartFX__Group__13__Impl ;
    public final void rule__BubbleChartFX__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3723:1: ( rule__BubbleChartFX__Group__13__Impl )
            // InternalJavaFXLang.g:3724:2: rule__BubbleChartFX__Group__13__Impl
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
    // InternalJavaFXLang.g:3730:1: rule__BubbleChartFX__Group__13__Impl : ( '}' ) ;
    public final void rule__BubbleChartFX__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3734:1: ( ( '}' ) )
            // InternalJavaFXLang.g:3735:1: ( '}' )
            {
            // InternalJavaFXLang.g:3735:1: ( '}' )
            // InternalJavaFXLang.g:3736:2: '}'
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
    // InternalJavaFXLang.g:3746:1: rule__BubbleChartFX__Group_5__0 : rule__BubbleChartFX__Group_5__0__Impl rule__BubbleChartFX__Group_5__1 ;
    public final void rule__BubbleChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3750:1: ( rule__BubbleChartFX__Group_5__0__Impl rule__BubbleChartFX__Group_5__1 )
            // InternalJavaFXLang.g:3751:2: rule__BubbleChartFX__Group_5__0__Impl rule__BubbleChartFX__Group_5__1
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
    // InternalJavaFXLang.g:3758:1: rule__BubbleChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__BubbleChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3762:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:3763:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:3763:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:3764:2: 'legendSide:'
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
    // InternalJavaFXLang.g:3773:1: rule__BubbleChartFX__Group_5__1 : rule__BubbleChartFX__Group_5__1__Impl ;
    public final void rule__BubbleChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3777:1: ( rule__BubbleChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:3778:2: rule__BubbleChartFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:3784:1: rule__BubbleChartFX__Group_5__1__Impl : ( ( rule__BubbleChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__BubbleChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3788:1: ( ( ( rule__BubbleChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:3789:1: ( ( rule__BubbleChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:3789:1: ( ( rule__BubbleChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:3790:2: ( rule__BubbleChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:3791:2: ( rule__BubbleChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:3791:3: rule__BubbleChartFX__LegendSideAssignment_5_1
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
    // InternalJavaFXLang.g:3800:1: rule__BubbleChartFX__Group_6__0 : rule__BubbleChartFX__Group_6__0__Impl rule__BubbleChartFX__Group_6__1 ;
    public final void rule__BubbleChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3804:1: ( rule__BubbleChartFX__Group_6__0__Impl rule__BubbleChartFX__Group_6__1 )
            // InternalJavaFXLang.g:3805:2: rule__BubbleChartFX__Group_6__0__Impl rule__BubbleChartFX__Group_6__1
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
    // InternalJavaFXLang.g:3812:1: rule__BubbleChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__BubbleChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3816:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:3817:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:3817:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:3818:2: 'showLegend:'
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
    // InternalJavaFXLang.g:3827:1: rule__BubbleChartFX__Group_6__1 : rule__BubbleChartFX__Group_6__1__Impl ;
    public final void rule__BubbleChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3831:1: ( rule__BubbleChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:3832:2: rule__BubbleChartFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:3838:1: rule__BubbleChartFX__Group_6__1__Impl : ( ( rule__BubbleChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__BubbleChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3842:1: ( ( ( rule__BubbleChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:3843:1: ( ( rule__BubbleChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:3843:1: ( ( rule__BubbleChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:3844:2: ( rule__BubbleChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:3845:2: ( rule__BubbleChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:3845:3: rule__BubbleChartFX__ShowLegendAssignment_6_1
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
    // InternalJavaFXLang.g:3854:1: rule__BubbleChartFX__Group_7__0 : rule__BubbleChartFX__Group_7__0__Impl rule__BubbleChartFX__Group_7__1 ;
    public final void rule__BubbleChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3858:1: ( rule__BubbleChartFX__Group_7__0__Impl rule__BubbleChartFX__Group_7__1 )
            // InternalJavaFXLang.g:3859:2: rule__BubbleChartFX__Group_7__0__Impl rule__BubbleChartFX__Group_7__1
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
    // InternalJavaFXLang.g:3866:1: rule__BubbleChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__BubbleChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3870:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:3871:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:3871:1: ( 'title:' )
            // InternalJavaFXLang.g:3872:2: 'title:'
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
    // InternalJavaFXLang.g:3881:1: rule__BubbleChartFX__Group_7__1 : rule__BubbleChartFX__Group_7__1__Impl ;
    public final void rule__BubbleChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3885:1: ( rule__BubbleChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:3886:2: rule__BubbleChartFX__Group_7__1__Impl
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
    // InternalJavaFXLang.g:3892:1: rule__BubbleChartFX__Group_7__1__Impl : ( ( rule__BubbleChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__BubbleChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3896:1: ( ( ( rule__BubbleChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:3897:1: ( ( rule__BubbleChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:3897:1: ( ( rule__BubbleChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:3898:2: ( rule__BubbleChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:3899:2: ( rule__BubbleChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:3899:3: rule__BubbleChartFX__TitleAssignment_7_1
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
    // InternalJavaFXLang.g:3908:1: rule__BubbleChartFX__Group_8__0 : rule__BubbleChartFX__Group_8__0__Impl rule__BubbleChartFX__Group_8__1 ;
    public final void rule__BubbleChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3912:1: ( rule__BubbleChartFX__Group_8__0__Impl rule__BubbleChartFX__Group_8__1 )
            // InternalJavaFXLang.g:3913:2: rule__BubbleChartFX__Group_8__0__Impl rule__BubbleChartFX__Group_8__1
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
    // InternalJavaFXLang.g:3920:1: rule__BubbleChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__BubbleChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3924:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:3925:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:3925:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:3926:2: 'titleSide:'
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
    // InternalJavaFXLang.g:3935:1: rule__BubbleChartFX__Group_8__1 : rule__BubbleChartFX__Group_8__1__Impl ;
    public final void rule__BubbleChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3939:1: ( rule__BubbleChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:3940:2: rule__BubbleChartFX__Group_8__1__Impl
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
    // InternalJavaFXLang.g:3946:1: rule__BubbleChartFX__Group_8__1__Impl : ( ( rule__BubbleChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__BubbleChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3950:1: ( ( ( rule__BubbleChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:3951:1: ( ( rule__BubbleChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:3951:1: ( ( rule__BubbleChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:3952:2: ( rule__BubbleChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:3953:2: ( rule__BubbleChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:3953:3: rule__BubbleChartFX__TitleSideAssignment_8_1
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
    // InternalJavaFXLang.g:3962:1: rule__BubbleChartFX__Group_9__0 : rule__BubbleChartFX__Group_9__0__Impl rule__BubbleChartFX__Group_9__1 ;
    public final void rule__BubbleChartFX__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3966:1: ( rule__BubbleChartFX__Group_9__0__Impl rule__BubbleChartFX__Group_9__1 )
            // InternalJavaFXLang.g:3967:2: rule__BubbleChartFX__Group_9__0__Impl rule__BubbleChartFX__Group_9__1
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
    // InternalJavaFXLang.g:3974:1: rule__BubbleChartFX__Group_9__0__Impl : ( 'xAxisLabel:' ) ;
    public final void rule__BubbleChartFX__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3978:1: ( ( 'xAxisLabel:' ) )
            // InternalJavaFXLang.g:3979:1: ( 'xAxisLabel:' )
            {
            // InternalJavaFXLang.g:3979:1: ( 'xAxisLabel:' )
            // InternalJavaFXLang.g:3980:2: 'xAxisLabel:'
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
    // InternalJavaFXLang.g:3989:1: rule__BubbleChartFX__Group_9__1 : rule__BubbleChartFX__Group_9__1__Impl ;
    public final void rule__BubbleChartFX__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:3993:1: ( rule__BubbleChartFX__Group_9__1__Impl )
            // InternalJavaFXLang.g:3994:2: rule__BubbleChartFX__Group_9__1__Impl
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
    // InternalJavaFXLang.g:4000:1: rule__BubbleChartFX__Group_9__1__Impl : ( ( rule__BubbleChartFX__XAxisLabelAssignment_9_1 ) ) ;
    public final void rule__BubbleChartFX__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4004:1: ( ( ( rule__BubbleChartFX__XAxisLabelAssignment_9_1 ) ) )
            // InternalJavaFXLang.g:4005:1: ( ( rule__BubbleChartFX__XAxisLabelAssignment_9_1 ) )
            {
            // InternalJavaFXLang.g:4005:1: ( ( rule__BubbleChartFX__XAxisLabelAssignment_9_1 ) )
            // InternalJavaFXLang.g:4006:2: ( rule__BubbleChartFX__XAxisLabelAssignment_9_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getXAxisLabelAssignment_9_1()); 
            // InternalJavaFXLang.g:4007:2: ( rule__BubbleChartFX__XAxisLabelAssignment_9_1 )
            // InternalJavaFXLang.g:4007:3: rule__BubbleChartFX__XAxisLabelAssignment_9_1
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
    // InternalJavaFXLang.g:4016:1: rule__BubbleChartFX__Group_10__0 : rule__BubbleChartFX__Group_10__0__Impl rule__BubbleChartFX__Group_10__1 ;
    public final void rule__BubbleChartFX__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4020:1: ( rule__BubbleChartFX__Group_10__0__Impl rule__BubbleChartFX__Group_10__1 )
            // InternalJavaFXLang.g:4021:2: rule__BubbleChartFX__Group_10__0__Impl rule__BubbleChartFX__Group_10__1
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
    // InternalJavaFXLang.g:4028:1: rule__BubbleChartFX__Group_10__0__Impl : ( 'xAxisType:' ) ;
    public final void rule__BubbleChartFX__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4032:1: ( ( 'xAxisType:' ) )
            // InternalJavaFXLang.g:4033:1: ( 'xAxisType:' )
            {
            // InternalJavaFXLang.g:4033:1: ( 'xAxisType:' )
            // InternalJavaFXLang.g:4034:2: 'xAxisType:'
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
    // InternalJavaFXLang.g:4043:1: rule__BubbleChartFX__Group_10__1 : rule__BubbleChartFX__Group_10__1__Impl ;
    public final void rule__BubbleChartFX__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4047:1: ( rule__BubbleChartFX__Group_10__1__Impl )
            // InternalJavaFXLang.g:4048:2: rule__BubbleChartFX__Group_10__1__Impl
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
    // InternalJavaFXLang.g:4054:1: rule__BubbleChartFX__Group_10__1__Impl : ( ( rule__BubbleChartFX__XAxisTypeAssignment_10_1 ) ) ;
    public final void rule__BubbleChartFX__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4058:1: ( ( ( rule__BubbleChartFX__XAxisTypeAssignment_10_1 ) ) )
            // InternalJavaFXLang.g:4059:1: ( ( rule__BubbleChartFX__XAxisTypeAssignment_10_1 ) )
            {
            // InternalJavaFXLang.g:4059:1: ( ( rule__BubbleChartFX__XAxisTypeAssignment_10_1 ) )
            // InternalJavaFXLang.g:4060:2: ( rule__BubbleChartFX__XAxisTypeAssignment_10_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getXAxisTypeAssignment_10_1()); 
            // InternalJavaFXLang.g:4061:2: ( rule__BubbleChartFX__XAxisTypeAssignment_10_1 )
            // InternalJavaFXLang.g:4061:3: rule__BubbleChartFX__XAxisTypeAssignment_10_1
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
    // InternalJavaFXLang.g:4070:1: rule__BubbleChartFX__Group_11__0 : rule__BubbleChartFX__Group_11__0__Impl rule__BubbleChartFX__Group_11__1 ;
    public final void rule__BubbleChartFX__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4074:1: ( rule__BubbleChartFX__Group_11__0__Impl rule__BubbleChartFX__Group_11__1 )
            // InternalJavaFXLang.g:4075:2: rule__BubbleChartFX__Group_11__0__Impl rule__BubbleChartFX__Group_11__1
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
    // InternalJavaFXLang.g:4082:1: rule__BubbleChartFX__Group_11__0__Impl : ( 'yAxisLabel:' ) ;
    public final void rule__BubbleChartFX__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4086:1: ( ( 'yAxisLabel:' ) )
            // InternalJavaFXLang.g:4087:1: ( 'yAxisLabel:' )
            {
            // InternalJavaFXLang.g:4087:1: ( 'yAxisLabel:' )
            // InternalJavaFXLang.g:4088:2: 'yAxisLabel:'
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
    // InternalJavaFXLang.g:4097:1: rule__BubbleChartFX__Group_11__1 : rule__BubbleChartFX__Group_11__1__Impl ;
    public final void rule__BubbleChartFX__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4101:1: ( rule__BubbleChartFX__Group_11__1__Impl )
            // InternalJavaFXLang.g:4102:2: rule__BubbleChartFX__Group_11__1__Impl
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
    // InternalJavaFXLang.g:4108:1: rule__BubbleChartFX__Group_11__1__Impl : ( ( rule__BubbleChartFX__YAxisLabelAssignment_11_1 ) ) ;
    public final void rule__BubbleChartFX__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4112:1: ( ( ( rule__BubbleChartFX__YAxisLabelAssignment_11_1 ) ) )
            // InternalJavaFXLang.g:4113:1: ( ( rule__BubbleChartFX__YAxisLabelAssignment_11_1 ) )
            {
            // InternalJavaFXLang.g:4113:1: ( ( rule__BubbleChartFX__YAxisLabelAssignment_11_1 ) )
            // InternalJavaFXLang.g:4114:2: ( rule__BubbleChartFX__YAxisLabelAssignment_11_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getYAxisLabelAssignment_11_1()); 
            // InternalJavaFXLang.g:4115:2: ( rule__BubbleChartFX__YAxisLabelAssignment_11_1 )
            // InternalJavaFXLang.g:4115:3: rule__BubbleChartFX__YAxisLabelAssignment_11_1
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
    // InternalJavaFXLang.g:4124:1: rule__BubbleChartFX__Group_12__0 : rule__BubbleChartFX__Group_12__0__Impl rule__BubbleChartFX__Group_12__1 ;
    public final void rule__BubbleChartFX__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4128:1: ( rule__BubbleChartFX__Group_12__0__Impl rule__BubbleChartFX__Group_12__1 )
            // InternalJavaFXLang.g:4129:2: rule__BubbleChartFX__Group_12__0__Impl rule__BubbleChartFX__Group_12__1
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
    // InternalJavaFXLang.g:4136:1: rule__BubbleChartFX__Group_12__0__Impl : ( 'yAxisType:' ) ;
    public final void rule__BubbleChartFX__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4140:1: ( ( 'yAxisType:' ) )
            // InternalJavaFXLang.g:4141:1: ( 'yAxisType:' )
            {
            // InternalJavaFXLang.g:4141:1: ( 'yAxisType:' )
            // InternalJavaFXLang.g:4142:2: 'yAxisType:'
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
    // InternalJavaFXLang.g:4151:1: rule__BubbleChartFX__Group_12__1 : rule__BubbleChartFX__Group_12__1__Impl ;
    public final void rule__BubbleChartFX__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4155:1: ( rule__BubbleChartFX__Group_12__1__Impl )
            // InternalJavaFXLang.g:4156:2: rule__BubbleChartFX__Group_12__1__Impl
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
    // InternalJavaFXLang.g:4162:1: rule__BubbleChartFX__Group_12__1__Impl : ( ( rule__BubbleChartFX__YAxisTypeAssignment_12_1 ) ) ;
    public final void rule__BubbleChartFX__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4166:1: ( ( ( rule__BubbleChartFX__YAxisTypeAssignment_12_1 ) ) )
            // InternalJavaFXLang.g:4167:1: ( ( rule__BubbleChartFX__YAxisTypeAssignment_12_1 ) )
            {
            // InternalJavaFXLang.g:4167:1: ( ( rule__BubbleChartFX__YAxisTypeAssignment_12_1 ) )
            // InternalJavaFXLang.g:4168:2: ( rule__BubbleChartFX__YAxisTypeAssignment_12_1 )
            {
             before(grammarAccess.getBubbleChartFXAccess().getYAxisTypeAssignment_12_1()); 
            // InternalJavaFXLang.g:4169:2: ( rule__BubbleChartFX__YAxisTypeAssignment_12_1 )
            // InternalJavaFXLang.g:4169:3: rule__BubbleChartFX__YAxisTypeAssignment_12_1
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
    // InternalJavaFXLang.g:4178:1: rule__AreaChartFX__Group__0 : rule__AreaChartFX__Group__0__Impl rule__AreaChartFX__Group__1 ;
    public final void rule__AreaChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4182:1: ( rule__AreaChartFX__Group__0__Impl rule__AreaChartFX__Group__1 )
            // InternalJavaFXLang.g:4183:2: rule__AreaChartFX__Group__0__Impl rule__AreaChartFX__Group__1
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
    // InternalJavaFXLang.g:4190:1: rule__AreaChartFX__Group__0__Impl : ( () ) ;
    public final void rule__AreaChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4194:1: ( ( () ) )
            // InternalJavaFXLang.g:4195:1: ( () )
            {
            // InternalJavaFXLang.g:4195:1: ( () )
            // InternalJavaFXLang.g:4196:2: ()
            {
             before(grammarAccess.getAreaChartFXAccess().getAreaChartFXAction_0()); 
            // InternalJavaFXLang.g:4197:2: ()
            // InternalJavaFXLang.g:4197:3: 
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
    // InternalJavaFXLang.g:4205:1: rule__AreaChartFX__Group__1 : rule__AreaChartFX__Group__1__Impl rule__AreaChartFX__Group__2 ;
    public final void rule__AreaChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4209:1: ( rule__AreaChartFX__Group__1__Impl rule__AreaChartFX__Group__2 )
            // InternalJavaFXLang.g:4210:2: rule__AreaChartFX__Group__1__Impl rule__AreaChartFX__Group__2
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
    // InternalJavaFXLang.g:4217:1: rule__AreaChartFX__Group__1__Impl : ( 'AreaChart' ) ;
    public final void rule__AreaChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4221:1: ( ( 'AreaChart' ) )
            // InternalJavaFXLang.g:4222:1: ( 'AreaChart' )
            {
            // InternalJavaFXLang.g:4222:1: ( 'AreaChart' )
            // InternalJavaFXLang.g:4223:2: 'AreaChart'
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
    // InternalJavaFXLang.g:4232:1: rule__AreaChartFX__Group__2 : rule__AreaChartFX__Group__2__Impl rule__AreaChartFX__Group__3 ;
    public final void rule__AreaChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4236:1: ( rule__AreaChartFX__Group__2__Impl rule__AreaChartFX__Group__3 )
            // InternalJavaFXLang.g:4237:2: rule__AreaChartFX__Group__2__Impl rule__AreaChartFX__Group__3
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
    // InternalJavaFXLang.g:4244:1: rule__AreaChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__AreaChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4248:1: ( ( '{' ) )
            // InternalJavaFXLang.g:4249:1: ( '{' )
            {
            // InternalJavaFXLang.g:4249:1: ( '{' )
            // InternalJavaFXLang.g:4250:2: '{'
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
    // InternalJavaFXLang.g:4259:1: rule__AreaChartFX__Group__3 : rule__AreaChartFX__Group__3__Impl rule__AreaChartFX__Group__4 ;
    public final void rule__AreaChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4263:1: ( rule__AreaChartFX__Group__3__Impl rule__AreaChartFX__Group__4 )
            // InternalJavaFXLang.g:4264:2: rule__AreaChartFX__Group__3__Impl rule__AreaChartFX__Group__4
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
    // InternalJavaFXLang.g:4271:1: rule__AreaChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__AreaChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4275:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:4276:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:4276:1: ( 'name:' )
            // InternalJavaFXLang.g:4277:2: 'name:'
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
    // InternalJavaFXLang.g:4286:1: rule__AreaChartFX__Group__4 : rule__AreaChartFX__Group__4__Impl rule__AreaChartFX__Group__5 ;
    public final void rule__AreaChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4290:1: ( rule__AreaChartFX__Group__4__Impl rule__AreaChartFX__Group__5 )
            // InternalJavaFXLang.g:4291:2: rule__AreaChartFX__Group__4__Impl rule__AreaChartFX__Group__5
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
    // InternalJavaFXLang.g:4298:1: rule__AreaChartFX__Group__4__Impl : ( ( rule__AreaChartFX__NameAssignment_4 ) ) ;
    public final void rule__AreaChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4302:1: ( ( ( rule__AreaChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:4303:1: ( ( rule__AreaChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:4303:1: ( ( rule__AreaChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:4304:2: ( rule__AreaChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getAreaChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:4305:2: ( rule__AreaChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:4305:3: rule__AreaChartFX__NameAssignment_4
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
    // InternalJavaFXLang.g:4313:1: rule__AreaChartFX__Group__5 : rule__AreaChartFX__Group__5__Impl rule__AreaChartFX__Group__6 ;
    public final void rule__AreaChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4317:1: ( rule__AreaChartFX__Group__5__Impl rule__AreaChartFX__Group__6 )
            // InternalJavaFXLang.g:4318:2: rule__AreaChartFX__Group__5__Impl rule__AreaChartFX__Group__6
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
    // InternalJavaFXLang.g:4325:1: rule__AreaChartFX__Group__5__Impl : ( ( rule__AreaChartFX__Group_5__0 )? ) ;
    public final void rule__AreaChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4329:1: ( ( ( rule__AreaChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:4330:1: ( ( rule__AreaChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:4330:1: ( ( rule__AreaChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:4331:2: ( rule__AreaChartFX__Group_5__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:4332:2: ( rule__AreaChartFX__Group_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalJavaFXLang.g:4332:3: rule__AreaChartFX__Group_5__0
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
    // InternalJavaFXLang.g:4340:1: rule__AreaChartFX__Group__6 : rule__AreaChartFX__Group__6__Impl rule__AreaChartFX__Group__7 ;
    public final void rule__AreaChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4344:1: ( rule__AreaChartFX__Group__6__Impl rule__AreaChartFX__Group__7 )
            // InternalJavaFXLang.g:4345:2: rule__AreaChartFX__Group__6__Impl rule__AreaChartFX__Group__7
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
    // InternalJavaFXLang.g:4352:1: rule__AreaChartFX__Group__6__Impl : ( ( rule__AreaChartFX__Group_6__0 )? ) ;
    public final void rule__AreaChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4356:1: ( ( ( rule__AreaChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:4357:1: ( ( rule__AreaChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:4357:1: ( ( rule__AreaChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:4358:2: ( rule__AreaChartFX__Group_6__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:4359:2: ( rule__AreaChartFX__Group_6__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalJavaFXLang.g:4359:3: rule__AreaChartFX__Group_6__0
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
    // InternalJavaFXLang.g:4367:1: rule__AreaChartFX__Group__7 : rule__AreaChartFX__Group__7__Impl rule__AreaChartFX__Group__8 ;
    public final void rule__AreaChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4371:1: ( rule__AreaChartFX__Group__7__Impl rule__AreaChartFX__Group__8 )
            // InternalJavaFXLang.g:4372:2: rule__AreaChartFX__Group__7__Impl rule__AreaChartFX__Group__8
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
    // InternalJavaFXLang.g:4379:1: rule__AreaChartFX__Group__7__Impl : ( ( rule__AreaChartFX__Group_7__0 )? ) ;
    public final void rule__AreaChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4383:1: ( ( ( rule__AreaChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:4384:1: ( ( rule__AreaChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:4384:1: ( ( rule__AreaChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:4385:2: ( rule__AreaChartFX__Group_7__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:4386:2: ( rule__AreaChartFX__Group_7__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==38) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalJavaFXLang.g:4386:3: rule__AreaChartFX__Group_7__0
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
    // InternalJavaFXLang.g:4394:1: rule__AreaChartFX__Group__8 : rule__AreaChartFX__Group__8__Impl rule__AreaChartFX__Group__9 ;
    public final void rule__AreaChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4398:1: ( rule__AreaChartFX__Group__8__Impl rule__AreaChartFX__Group__9 )
            // InternalJavaFXLang.g:4399:2: rule__AreaChartFX__Group__8__Impl rule__AreaChartFX__Group__9
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
    // InternalJavaFXLang.g:4406:1: rule__AreaChartFX__Group__8__Impl : ( ( rule__AreaChartFX__Group_8__0 )? ) ;
    public final void rule__AreaChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4410:1: ( ( ( rule__AreaChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:4411:1: ( ( rule__AreaChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:4411:1: ( ( rule__AreaChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:4412:2: ( rule__AreaChartFX__Group_8__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:4413:2: ( rule__AreaChartFX__Group_8__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==39) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalJavaFXLang.g:4413:3: rule__AreaChartFX__Group_8__0
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
    // InternalJavaFXLang.g:4421:1: rule__AreaChartFX__Group__9 : rule__AreaChartFX__Group__9__Impl rule__AreaChartFX__Group__10 ;
    public final void rule__AreaChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4425:1: ( rule__AreaChartFX__Group__9__Impl rule__AreaChartFX__Group__10 )
            // InternalJavaFXLang.g:4426:2: rule__AreaChartFX__Group__9__Impl rule__AreaChartFX__Group__10
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
    // InternalJavaFXLang.g:4433:1: rule__AreaChartFX__Group__9__Impl : ( ( rule__AreaChartFX__Group_9__0 )? ) ;
    public final void rule__AreaChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4437:1: ( ( ( rule__AreaChartFX__Group_9__0 )? ) )
            // InternalJavaFXLang.g:4438:1: ( ( rule__AreaChartFX__Group_9__0 )? )
            {
            // InternalJavaFXLang.g:4438:1: ( ( rule__AreaChartFX__Group_9__0 )? )
            // InternalJavaFXLang.g:4439:2: ( rule__AreaChartFX__Group_9__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_9()); 
            // InternalJavaFXLang.g:4440:2: ( rule__AreaChartFX__Group_9__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==40) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalJavaFXLang.g:4440:3: rule__AreaChartFX__Group_9__0
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
    // InternalJavaFXLang.g:4448:1: rule__AreaChartFX__Group__10 : rule__AreaChartFX__Group__10__Impl rule__AreaChartFX__Group__11 ;
    public final void rule__AreaChartFX__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4452:1: ( rule__AreaChartFX__Group__10__Impl rule__AreaChartFX__Group__11 )
            // InternalJavaFXLang.g:4453:2: rule__AreaChartFX__Group__10__Impl rule__AreaChartFX__Group__11
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
    // InternalJavaFXLang.g:4460:1: rule__AreaChartFX__Group__10__Impl : ( ( rule__AreaChartFX__Group_10__0 )? ) ;
    public final void rule__AreaChartFX__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4464:1: ( ( ( rule__AreaChartFX__Group_10__0 )? ) )
            // InternalJavaFXLang.g:4465:1: ( ( rule__AreaChartFX__Group_10__0 )? )
            {
            // InternalJavaFXLang.g:4465:1: ( ( rule__AreaChartFX__Group_10__0 )? )
            // InternalJavaFXLang.g:4466:2: ( rule__AreaChartFX__Group_10__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_10()); 
            // InternalJavaFXLang.g:4467:2: ( rule__AreaChartFX__Group_10__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==41) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalJavaFXLang.g:4467:3: rule__AreaChartFX__Group_10__0
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
    // InternalJavaFXLang.g:4475:1: rule__AreaChartFX__Group__11 : rule__AreaChartFX__Group__11__Impl rule__AreaChartFX__Group__12 ;
    public final void rule__AreaChartFX__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4479:1: ( rule__AreaChartFX__Group__11__Impl rule__AreaChartFX__Group__12 )
            // InternalJavaFXLang.g:4480:2: rule__AreaChartFX__Group__11__Impl rule__AreaChartFX__Group__12
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
    // InternalJavaFXLang.g:4487:1: rule__AreaChartFX__Group__11__Impl : ( ( rule__AreaChartFX__Group_11__0 )? ) ;
    public final void rule__AreaChartFX__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4491:1: ( ( ( rule__AreaChartFX__Group_11__0 )? ) )
            // InternalJavaFXLang.g:4492:1: ( ( rule__AreaChartFX__Group_11__0 )? )
            {
            // InternalJavaFXLang.g:4492:1: ( ( rule__AreaChartFX__Group_11__0 )? )
            // InternalJavaFXLang.g:4493:2: ( rule__AreaChartFX__Group_11__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_11()); 
            // InternalJavaFXLang.g:4494:2: ( rule__AreaChartFX__Group_11__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==42) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalJavaFXLang.g:4494:3: rule__AreaChartFX__Group_11__0
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
    // InternalJavaFXLang.g:4502:1: rule__AreaChartFX__Group__12 : rule__AreaChartFX__Group__12__Impl rule__AreaChartFX__Group__13 ;
    public final void rule__AreaChartFX__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4506:1: ( rule__AreaChartFX__Group__12__Impl rule__AreaChartFX__Group__13 )
            // InternalJavaFXLang.g:4507:2: rule__AreaChartFX__Group__12__Impl rule__AreaChartFX__Group__13
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
    // InternalJavaFXLang.g:4514:1: rule__AreaChartFX__Group__12__Impl : ( ( rule__AreaChartFX__Group_12__0 )? ) ;
    public final void rule__AreaChartFX__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4518:1: ( ( ( rule__AreaChartFX__Group_12__0 )? ) )
            // InternalJavaFXLang.g:4519:1: ( ( rule__AreaChartFX__Group_12__0 )? )
            {
            // InternalJavaFXLang.g:4519:1: ( ( rule__AreaChartFX__Group_12__0 )? )
            // InternalJavaFXLang.g:4520:2: ( rule__AreaChartFX__Group_12__0 )?
            {
             before(grammarAccess.getAreaChartFXAccess().getGroup_12()); 
            // InternalJavaFXLang.g:4521:2: ( rule__AreaChartFX__Group_12__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==43) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalJavaFXLang.g:4521:3: rule__AreaChartFX__Group_12__0
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
    // InternalJavaFXLang.g:4529:1: rule__AreaChartFX__Group__13 : rule__AreaChartFX__Group__13__Impl ;
    public final void rule__AreaChartFX__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4533:1: ( rule__AreaChartFX__Group__13__Impl )
            // InternalJavaFXLang.g:4534:2: rule__AreaChartFX__Group__13__Impl
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
    // InternalJavaFXLang.g:4540:1: rule__AreaChartFX__Group__13__Impl : ( '}' ) ;
    public final void rule__AreaChartFX__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4544:1: ( ( '}' ) )
            // InternalJavaFXLang.g:4545:1: ( '}' )
            {
            // InternalJavaFXLang.g:4545:1: ( '}' )
            // InternalJavaFXLang.g:4546:2: '}'
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
    // InternalJavaFXLang.g:4556:1: rule__AreaChartFX__Group_5__0 : rule__AreaChartFX__Group_5__0__Impl rule__AreaChartFX__Group_5__1 ;
    public final void rule__AreaChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4560:1: ( rule__AreaChartFX__Group_5__0__Impl rule__AreaChartFX__Group_5__1 )
            // InternalJavaFXLang.g:4561:2: rule__AreaChartFX__Group_5__0__Impl rule__AreaChartFX__Group_5__1
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
    // InternalJavaFXLang.g:4568:1: rule__AreaChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__AreaChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4572:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:4573:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:4573:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:4574:2: 'legendSide:'
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
    // InternalJavaFXLang.g:4583:1: rule__AreaChartFX__Group_5__1 : rule__AreaChartFX__Group_5__1__Impl ;
    public final void rule__AreaChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4587:1: ( rule__AreaChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:4588:2: rule__AreaChartFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:4594:1: rule__AreaChartFX__Group_5__1__Impl : ( ( rule__AreaChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__AreaChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4598:1: ( ( ( rule__AreaChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:4599:1: ( ( rule__AreaChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:4599:1: ( ( rule__AreaChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:4600:2: ( rule__AreaChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:4601:2: ( rule__AreaChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:4601:3: rule__AreaChartFX__LegendSideAssignment_5_1
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
    // InternalJavaFXLang.g:4610:1: rule__AreaChartFX__Group_6__0 : rule__AreaChartFX__Group_6__0__Impl rule__AreaChartFX__Group_6__1 ;
    public final void rule__AreaChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4614:1: ( rule__AreaChartFX__Group_6__0__Impl rule__AreaChartFX__Group_6__1 )
            // InternalJavaFXLang.g:4615:2: rule__AreaChartFX__Group_6__0__Impl rule__AreaChartFX__Group_6__1
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
    // InternalJavaFXLang.g:4622:1: rule__AreaChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__AreaChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4626:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:4627:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:4627:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:4628:2: 'showLegend:'
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
    // InternalJavaFXLang.g:4637:1: rule__AreaChartFX__Group_6__1 : rule__AreaChartFX__Group_6__1__Impl ;
    public final void rule__AreaChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4641:1: ( rule__AreaChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:4642:2: rule__AreaChartFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:4648:1: rule__AreaChartFX__Group_6__1__Impl : ( ( rule__AreaChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__AreaChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4652:1: ( ( ( rule__AreaChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:4653:1: ( ( rule__AreaChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:4653:1: ( ( rule__AreaChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:4654:2: ( rule__AreaChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:4655:2: ( rule__AreaChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:4655:3: rule__AreaChartFX__ShowLegendAssignment_6_1
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
    // InternalJavaFXLang.g:4664:1: rule__AreaChartFX__Group_7__0 : rule__AreaChartFX__Group_7__0__Impl rule__AreaChartFX__Group_7__1 ;
    public final void rule__AreaChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4668:1: ( rule__AreaChartFX__Group_7__0__Impl rule__AreaChartFX__Group_7__1 )
            // InternalJavaFXLang.g:4669:2: rule__AreaChartFX__Group_7__0__Impl rule__AreaChartFX__Group_7__1
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
    // InternalJavaFXLang.g:4676:1: rule__AreaChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__AreaChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4680:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:4681:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:4681:1: ( 'title:' )
            // InternalJavaFXLang.g:4682:2: 'title:'
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
    // InternalJavaFXLang.g:4691:1: rule__AreaChartFX__Group_7__1 : rule__AreaChartFX__Group_7__1__Impl ;
    public final void rule__AreaChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4695:1: ( rule__AreaChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:4696:2: rule__AreaChartFX__Group_7__1__Impl
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
    // InternalJavaFXLang.g:4702:1: rule__AreaChartFX__Group_7__1__Impl : ( ( rule__AreaChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__AreaChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4706:1: ( ( ( rule__AreaChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:4707:1: ( ( rule__AreaChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:4707:1: ( ( rule__AreaChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:4708:2: ( rule__AreaChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:4709:2: ( rule__AreaChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:4709:3: rule__AreaChartFX__TitleAssignment_7_1
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
    // InternalJavaFXLang.g:4718:1: rule__AreaChartFX__Group_8__0 : rule__AreaChartFX__Group_8__0__Impl rule__AreaChartFX__Group_8__1 ;
    public final void rule__AreaChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4722:1: ( rule__AreaChartFX__Group_8__0__Impl rule__AreaChartFX__Group_8__1 )
            // InternalJavaFXLang.g:4723:2: rule__AreaChartFX__Group_8__0__Impl rule__AreaChartFX__Group_8__1
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
    // InternalJavaFXLang.g:4730:1: rule__AreaChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__AreaChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4734:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:4735:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:4735:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:4736:2: 'titleSide:'
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
    // InternalJavaFXLang.g:4745:1: rule__AreaChartFX__Group_8__1 : rule__AreaChartFX__Group_8__1__Impl ;
    public final void rule__AreaChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4749:1: ( rule__AreaChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:4750:2: rule__AreaChartFX__Group_8__1__Impl
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
    // InternalJavaFXLang.g:4756:1: rule__AreaChartFX__Group_8__1__Impl : ( ( rule__AreaChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__AreaChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4760:1: ( ( ( rule__AreaChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:4761:1: ( ( rule__AreaChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:4761:1: ( ( rule__AreaChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:4762:2: ( rule__AreaChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:4763:2: ( rule__AreaChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:4763:3: rule__AreaChartFX__TitleSideAssignment_8_1
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
    // InternalJavaFXLang.g:4772:1: rule__AreaChartFX__Group_9__0 : rule__AreaChartFX__Group_9__0__Impl rule__AreaChartFX__Group_9__1 ;
    public final void rule__AreaChartFX__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4776:1: ( rule__AreaChartFX__Group_9__0__Impl rule__AreaChartFX__Group_9__1 )
            // InternalJavaFXLang.g:4777:2: rule__AreaChartFX__Group_9__0__Impl rule__AreaChartFX__Group_9__1
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
    // InternalJavaFXLang.g:4784:1: rule__AreaChartFX__Group_9__0__Impl : ( 'xAxisLabel:' ) ;
    public final void rule__AreaChartFX__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4788:1: ( ( 'xAxisLabel:' ) )
            // InternalJavaFXLang.g:4789:1: ( 'xAxisLabel:' )
            {
            // InternalJavaFXLang.g:4789:1: ( 'xAxisLabel:' )
            // InternalJavaFXLang.g:4790:2: 'xAxisLabel:'
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
    // InternalJavaFXLang.g:4799:1: rule__AreaChartFX__Group_9__1 : rule__AreaChartFX__Group_9__1__Impl ;
    public final void rule__AreaChartFX__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4803:1: ( rule__AreaChartFX__Group_9__1__Impl )
            // InternalJavaFXLang.g:4804:2: rule__AreaChartFX__Group_9__1__Impl
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
    // InternalJavaFXLang.g:4810:1: rule__AreaChartFX__Group_9__1__Impl : ( ( rule__AreaChartFX__XAxisLabelAssignment_9_1 ) ) ;
    public final void rule__AreaChartFX__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4814:1: ( ( ( rule__AreaChartFX__XAxisLabelAssignment_9_1 ) ) )
            // InternalJavaFXLang.g:4815:1: ( ( rule__AreaChartFX__XAxisLabelAssignment_9_1 ) )
            {
            // InternalJavaFXLang.g:4815:1: ( ( rule__AreaChartFX__XAxisLabelAssignment_9_1 ) )
            // InternalJavaFXLang.g:4816:2: ( rule__AreaChartFX__XAxisLabelAssignment_9_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getXAxisLabelAssignment_9_1()); 
            // InternalJavaFXLang.g:4817:2: ( rule__AreaChartFX__XAxisLabelAssignment_9_1 )
            // InternalJavaFXLang.g:4817:3: rule__AreaChartFX__XAxisLabelAssignment_9_1
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
    // InternalJavaFXLang.g:4826:1: rule__AreaChartFX__Group_10__0 : rule__AreaChartFX__Group_10__0__Impl rule__AreaChartFX__Group_10__1 ;
    public final void rule__AreaChartFX__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4830:1: ( rule__AreaChartFX__Group_10__0__Impl rule__AreaChartFX__Group_10__1 )
            // InternalJavaFXLang.g:4831:2: rule__AreaChartFX__Group_10__0__Impl rule__AreaChartFX__Group_10__1
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
    // InternalJavaFXLang.g:4838:1: rule__AreaChartFX__Group_10__0__Impl : ( 'xAxisType:' ) ;
    public final void rule__AreaChartFX__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4842:1: ( ( 'xAxisType:' ) )
            // InternalJavaFXLang.g:4843:1: ( 'xAxisType:' )
            {
            // InternalJavaFXLang.g:4843:1: ( 'xAxisType:' )
            // InternalJavaFXLang.g:4844:2: 'xAxisType:'
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
    // InternalJavaFXLang.g:4853:1: rule__AreaChartFX__Group_10__1 : rule__AreaChartFX__Group_10__1__Impl ;
    public final void rule__AreaChartFX__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4857:1: ( rule__AreaChartFX__Group_10__1__Impl )
            // InternalJavaFXLang.g:4858:2: rule__AreaChartFX__Group_10__1__Impl
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
    // InternalJavaFXLang.g:4864:1: rule__AreaChartFX__Group_10__1__Impl : ( ( rule__AreaChartFX__XAxisTypeAssignment_10_1 ) ) ;
    public final void rule__AreaChartFX__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4868:1: ( ( ( rule__AreaChartFX__XAxisTypeAssignment_10_1 ) ) )
            // InternalJavaFXLang.g:4869:1: ( ( rule__AreaChartFX__XAxisTypeAssignment_10_1 ) )
            {
            // InternalJavaFXLang.g:4869:1: ( ( rule__AreaChartFX__XAxisTypeAssignment_10_1 ) )
            // InternalJavaFXLang.g:4870:2: ( rule__AreaChartFX__XAxisTypeAssignment_10_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getXAxisTypeAssignment_10_1()); 
            // InternalJavaFXLang.g:4871:2: ( rule__AreaChartFX__XAxisTypeAssignment_10_1 )
            // InternalJavaFXLang.g:4871:3: rule__AreaChartFX__XAxisTypeAssignment_10_1
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
    // InternalJavaFXLang.g:4880:1: rule__AreaChartFX__Group_11__0 : rule__AreaChartFX__Group_11__0__Impl rule__AreaChartFX__Group_11__1 ;
    public final void rule__AreaChartFX__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4884:1: ( rule__AreaChartFX__Group_11__0__Impl rule__AreaChartFX__Group_11__1 )
            // InternalJavaFXLang.g:4885:2: rule__AreaChartFX__Group_11__0__Impl rule__AreaChartFX__Group_11__1
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
    // InternalJavaFXLang.g:4892:1: rule__AreaChartFX__Group_11__0__Impl : ( 'yAxisLabel:' ) ;
    public final void rule__AreaChartFX__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4896:1: ( ( 'yAxisLabel:' ) )
            // InternalJavaFXLang.g:4897:1: ( 'yAxisLabel:' )
            {
            // InternalJavaFXLang.g:4897:1: ( 'yAxisLabel:' )
            // InternalJavaFXLang.g:4898:2: 'yAxisLabel:'
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
    // InternalJavaFXLang.g:4907:1: rule__AreaChartFX__Group_11__1 : rule__AreaChartFX__Group_11__1__Impl ;
    public final void rule__AreaChartFX__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4911:1: ( rule__AreaChartFX__Group_11__1__Impl )
            // InternalJavaFXLang.g:4912:2: rule__AreaChartFX__Group_11__1__Impl
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
    // InternalJavaFXLang.g:4918:1: rule__AreaChartFX__Group_11__1__Impl : ( ( rule__AreaChartFX__YAxisLabelAssignment_11_1 ) ) ;
    public final void rule__AreaChartFX__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4922:1: ( ( ( rule__AreaChartFX__YAxisLabelAssignment_11_1 ) ) )
            // InternalJavaFXLang.g:4923:1: ( ( rule__AreaChartFX__YAxisLabelAssignment_11_1 ) )
            {
            // InternalJavaFXLang.g:4923:1: ( ( rule__AreaChartFX__YAxisLabelAssignment_11_1 ) )
            // InternalJavaFXLang.g:4924:2: ( rule__AreaChartFX__YAxisLabelAssignment_11_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getYAxisLabelAssignment_11_1()); 
            // InternalJavaFXLang.g:4925:2: ( rule__AreaChartFX__YAxisLabelAssignment_11_1 )
            // InternalJavaFXLang.g:4925:3: rule__AreaChartFX__YAxisLabelAssignment_11_1
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
    // InternalJavaFXLang.g:4934:1: rule__AreaChartFX__Group_12__0 : rule__AreaChartFX__Group_12__0__Impl rule__AreaChartFX__Group_12__1 ;
    public final void rule__AreaChartFX__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4938:1: ( rule__AreaChartFX__Group_12__0__Impl rule__AreaChartFX__Group_12__1 )
            // InternalJavaFXLang.g:4939:2: rule__AreaChartFX__Group_12__0__Impl rule__AreaChartFX__Group_12__1
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
    // InternalJavaFXLang.g:4946:1: rule__AreaChartFX__Group_12__0__Impl : ( 'yAxisType:' ) ;
    public final void rule__AreaChartFX__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4950:1: ( ( 'yAxisType:' ) )
            // InternalJavaFXLang.g:4951:1: ( 'yAxisType:' )
            {
            // InternalJavaFXLang.g:4951:1: ( 'yAxisType:' )
            // InternalJavaFXLang.g:4952:2: 'yAxisType:'
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
    // InternalJavaFXLang.g:4961:1: rule__AreaChartFX__Group_12__1 : rule__AreaChartFX__Group_12__1__Impl ;
    public final void rule__AreaChartFX__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4965:1: ( rule__AreaChartFX__Group_12__1__Impl )
            // InternalJavaFXLang.g:4966:2: rule__AreaChartFX__Group_12__1__Impl
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
    // InternalJavaFXLang.g:4972:1: rule__AreaChartFX__Group_12__1__Impl : ( ( rule__AreaChartFX__YAxisTypeAssignment_12_1 ) ) ;
    public final void rule__AreaChartFX__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4976:1: ( ( ( rule__AreaChartFX__YAxisTypeAssignment_12_1 ) ) )
            // InternalJavaFXLang.g:4977:1: ( ( rule__AreaChartFX__YAxisTypeAssignment_12_1 ) )
            {
            // InternalJavaFXLang.g:4977:1: ( ( rule__AreaChartFX__YAxisTypeAssignment_12_1 ) )
            // InternalJavaFXLang.g:4978:2: ( rule__AreaChartFX__YAxisTypeAssignment_12_1 )
            {
             before(grammarAccess.getAreaChartFXAccess().getYAxisTypeAssignment_12_1()); 
            // InternalJavaFXLang.g:4979:2: ( rule__AreaChartFX__YAxisTypeAssignment_12_1 )
            // InternalJavaFXLang.g:4979:3: rule__AreaChartFX__YAxisTypeAssignment_12_1
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
    // InternalJavaFXLang.g:4988:1: rule__PieChartFX__Group__0 : rule__PieChartFX__Group__0__Impl rule__PieChartFX__Group__1 ;
    public final void rule__PieChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:4992:1: ( rule__PieChartFX__Group__0__Impl rule__PieChartFX__Group__1 )
            // InternalJavaFXLang.g:4993:2: rule__PieChartFX__Group__0__Impl rule__PieChartFX__Group__1
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
    // InternalJavaFXLang.g:5000:1: rule__PieChartFX__Group__0__Impl : ( () ) ;
    public final void rule__PieChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5004:1: ( ( () ) )
            // InternalJavaFXLang.g:5005:1: ( () )
            {
            // InternalJavaFXLang.g:5005:1: ( () )
            // InternalJavaFXLang.g:5006:2: ()
            {
             before(grammarAccess.getPieChartFXAccess().getPieChartFXAction_0()); 
            // InternalJavaFXLang.g:5007:2: ()
            // InternalJavaFXLang.g:5007:3: 
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
    // InternalJavaFXLang.g:5015:1: rule__PieChartFX__Group__1 : rule__PieChartFX__Group__1__Impl rule__PieChartFX__Group__2 ;
    public final void rule__PieChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5019:1: ( rule__PieChartFX__Group__1__Impl rule__PieChartFX__Group__2 )
            // InternalJavaFXLang.g:5020:2: rule__PieChartFX__Group__1__Impl rule__PieChartFX__Group__2
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
    // InternalJavaFXLang.g:5027:1: rule__PieChartFX__Group__1__Impl : ( 'PieChart' ) ;
    public final void rule__PieChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5031:1: ( ( 'PieChart' ) )
            // InternalJavaFXLang.g:5032:1: ( 'PieChart' )
            {
            // InternalJavaFXLang.g:5032:1: ( 'PieChart' )
            // InternalJavaFXLang.g:5033:2: 'PieChart'
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
    // InternalJavaFXLang.g:5042:1: rule__PieChartFX__Group__2 : rule__PieChartFX__Group__2__Impl rule__PieChartFX__Group__3 ;
    public final void rule__PieChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5046:1: ( rule__PieChartFX__Group__2__Impl rule__PieChartFX__Group__3 )
            // InternalJavaFXLang.g:5047:2: rule__PieChartFX__Group__2__Impl rule__PieChartFX__Group__3
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
    // InternalJavaFXLang.g:5054:1: rule__PieChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__PieChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5058:1: ( ( '{' ) )
            // InternalJavaFXLang.g:5059:1: ( '{' )
            {
            // InternalJavaFXLang.g:5059:1: ( '{' )
            // InternalJavaFXLang.g:5060:2: '{'
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
    // InternalJavaFXLang.g:5069:1: rule__PieChartFX__Group__3 : rule__PieChartFX__Group__3__Impl rule__PieChartFX__Group__4 ;
    public final void rule__PieChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5073:1: ( rule__PieChartFX__Group__3__Impl rule__PieChartFX__Group__4 )
            // InternalJavaFXLang.g:5074:2: rule__PieChartFX__Group__3__Impl rule__PieChartFX__Group__4
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
    // InternalJavaFXLang.g:5081:1: rule__PieChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__PieChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5085:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:5086:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:5086:1: ( 'name:' )
            // InternalJavaFXLang.g:5087:2: 'name:'
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
    // InternalJavaFXLang.g:5096:1: rule__PieChartFX__Group__4 : rule__PieChartFX__Group__4__Impl rule__PieChartFX__Group__5 ;
    public final void rule__PieChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5100:1: ( rule__PieChartFX__Group__4__Impl rule__PieChartFX__Group__5 )
            // InternalJavaFXLang.g:5101:2: rule__PieChartFX__Group__4__Impl rule__PieChartFX__Group__5
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
    // InternalJavaFXLang.g:5108:1: rule__PieChartFX__Group__4__Impl : ( ( rule__PieChartFX__NameAssignment_4 ) ) ;
    public final void rule__PieChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5112:1: ( ( ( rule__PieChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:5113:1: ( ( rule__PieChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:5113:1: ( ( rule__PieChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:5114:2: ( rule__PieChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getPieChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:5115:2: ( rule__PieChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:5115:3: rule__PieChartFX__NameAssignment_4
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
    // InternalJavaFXLang.g:5123:1: rule__PieChartFX__Group__5 : rule__PieChartFX__Group__5__Impl rule__PieChartFX__Group__6 ;
    public final void rule__PieChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5127:1: ( rule__PieChartFX__Group__5__Impl rule__PieChartFX__Group__6 )
            // InternalJavaFXLang.g:5128:2: rule__PieChartFX__Group__5__Impl rule__PieChartFX__Group__6
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
    // InternalJavaFXLang.g:5135:1: rule__PieChartFX__Group__5__Impl : ( ( rule__PieChartFX__Group_5__0 )? ) ;
    public final void rule__PieChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5139:1: ( ( ( rule__PieChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:5140:1: ( ( rule__PieChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:5140:1: ( ( rule__PieChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:5141:2: ( rule__PieChartFX__Group_5__0 )?
            {
             before(grammarAccess.getPieChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:5142:2: ( rule__PieChartFX__Group_5__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==36) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalJavaFXLang.g:5142:3: rule__PieChartFX__Group_5__0
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
    // InternalJavaFXLang.g:5150:1: rule__PieChartFX__Group__6 : rule__PieChartFX__Group__6__Impl rule__PieChartFX__Group__7 ;
    public final void rule__PieChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5154:1: ( rule__PieChartFX__Group__6__Impl rule__PieChartFX__Group__7 )
            // InternalJavaFXLang.g:5155:2: rule__PieChartFX__Group__6__Impl rule__PieChartFX__Group__7
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
    // InternalJavaFXLang.g:5162:1: rule__PieChartFX__Group__6__Impl : ( ( rule__PieChartFX__Group_6__0 )? ) ;
    public final void rule__PieChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5166:1: ( ( ( rule__PieChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:5167:1: ( ( rule__PieChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:5167:1: ( ( rule__PieChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:5168:2: ( rule__PieChartFX__Group_6__0 )?
            {
             before(grammarAccess.getPieChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:5169:2: ( rule__PieChartFX__Group_6__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==37) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalJavaFXLang.g:5169:3: rule__PieChartFX__Group_6__0
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
    // InternalJavaFXLang.g:5177:1: rule__PieChartFX__Group__7 : rule__PieChartFX__Group__7__Impl rule__PieChartFX__Group__8 ;
    public final void rule__PieChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5181:1: ( rule__PieChartFX__Group__7__Impl rule__PieChartFX__Group__8 )
            // InternalJavaFXLang.g:5182:2: rule__PieChartFX__Group__7__Impl rule__PieChartFX__Group__8
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
    // InternalJavaFXLang.g:5189:1: rule__PieChartFX__Group__7__Impl : ( ( rule__PieChartFX__Group_7__0 )? ) ;
    public final void rule__PieChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5193:1: ( ( ( rule__PieChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:5194:1: ( ( rule__PieChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:5194:1: ( ( rule__PieChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:5195:2: ( rule__PieChartFX__Group_7__0 )?
            {
             before(grammarAccess.getPieChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:5196:2: ( rule__PieChartFX__Group_7__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==38) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalJavaFXLang.g:5196:3: rule__PieChartFX__Group_7__0
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
    // InternalJavaFXLang.g:5204:1: rule__PieChartFX__Group__8 : rule__PieChartFX__Group__8__Impl rule__PieChartFX__Group__9 ;
    public final void rule__PieChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5208:1: ( rule__PieChartFX__Group__8__Impl rule__PieChartFX__Group__9 )
            // InternalJavaFXLang.g:5209:2: rule__PieChartFX__Group__8__Impl rule__PieChartFX__Group__9
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
    // InternalJavaFXLang.g:5216:1: rule__PieChartFX__Group__8__Impl : ( ( rule__PieChartFX__Group_8__0 )? ) ;
    public final void rule__PieChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5220:1: ( ( ( rule__PieChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:5221:1: ( ( rule__PieChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:5221:1: ( ( rule__PieChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:5222:2: ( rule__PieChartFX__Group_8__0 )?
            {
             before(grammarAccess.getPieChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:5223:2: ( rule__PieChartFX__Group_8__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==39) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalJavaFXLang.g:5223:3: rule__PieChartFX__Group_8__0
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
    // InternalJavaFXLang.g:5231:1: rule__PieChartFX__Group__9 : rule__PieChartFX__Group__9__Impl ;
    public final void rule__PieChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5235:1: ( rule__PieChartFX__Group__9__Impl )
            // InternalJavaFXLang.g:5236:2: rule__PieChartFX__Group__9__Impl
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
    // InternalJavaFXLang.g:5242:1: rule__PieChartFX__Group__9__Impl : ( '}' ) ;
    public final void rule__PieChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5246:1: ( ( '}' ) )
            // InternalJavaFXLang.g:5247:1: ( '}' )
            {
            // InternalJavaFXLang.g:5247:1: ( '}' )
            // InternalJavaFXLang.g:5248:2: '}'
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
    // InternalJavaFXLang.g:5258:1: rule__PieChartFX__Group_5__0 : rule__PieChartFX__Group_5__0__Impl rule__PieChartFX__Group_5__1 ;
    public final void rule__PieChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5262:1: ( rule__PieChartFX__Group_5__0__Impl rule__PieChartFX__Group_5__1 )
            // InternalJavaFXLang.g:5263:2: rule__PieChartFX__Group_5__0__Impl rule__PieChartFX__Group_5__1
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
    // InternalJavaFXLang.g:5270:1: rule__PieChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__PieChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5274:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:5275:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:5275:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:5276:2: 'legendSide:'
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
    // InternalJavaFXLang.g:5285:1: rule__PieChartFX__Group_5__1 : rule__PieChartFX__Group_5__1__Impl ;
    public final void rule__PieChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5289:1: ( rule__PieChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:5290:2: rule__PieChartFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:5296:1: rule__PieChartFX__Group_5__1__Impl : ( ( rule__PieChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__PieChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5300:1: ( ( ( rule__PieChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:5301:1: ( ( rule__PieChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:5301:1: ( ( rule__PieChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:5302:2: ( rule__PieChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getPieChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:5303:2: ( rule__PieChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:5303:3: rule__PieChartFX__LegendSideAssignment_5_1
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
    // InternalJavaFXLang.g:5312:1: rule__PieChartFX__Group_6__0 : rule__PieChartFX__Group_6__0__Impl rule__PieChartFX__Group_6__1 ;
    public final void rule__PieChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5316:1: ( rule__PieChartFX__Group_6__0__Impl rule__PieChartFX__Group_6__1 )
            // InternalJavaFXLang.g:5317:2: rule__PieChartFX__Group_6__0__Impl rule__PieChartFX__Group_6__1
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
    // InternalJavaFXLang.g:5324:1: rule__PieChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__PieChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5328:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:5329:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:5329:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:5330:2: 'showLegend:'
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
    // InternalJavaFXLang.g:5339:1: rule__PieChartFX__Group_6__1 : rule__PieChartFX__Group_6__1__Impl ;
    public final void rule__PieChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5343:1: ( rule__PieChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:5344:2: rule__PieChartFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:5350:1: rule__PieChartFX__Group_6__1__Impl : ( ( rule__PieChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__PieChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5354:1: ( ( ( rule__PieChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:5355:1: ( ( rule__PieChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:5355:1: ( ( rule__PieChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:5356:2: ( rule__PieChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getPieChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:5357:2: ( rule__PieChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:5357:3: rule__PieChartFX__ShowLegendAssignment_6_1
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
    // InternalJavaFXLang.g:5366:1: rule__PieChartFX__Group_7__0 : rule__PieChartFX__Group_7__0__Impl rule__PieChartFX__Group_7__1 ;
    public final void rule__PieChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5370:1: ( rule__PieChartFX__Group_7__0__Impl rule__PieChartFX__Group_7__1 )
            // InternalJavaFXLang.g:5371:2: rule__PieChartFX__Group_7__0__Impl rule__PieChartFX__Group_7__1
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
    // InternalJavaFXLang.g:5378:1: rule__PieChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__PieChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5382:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:5383:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:5383:1: ( 'title:' )
            // InternalJavaFXLang.g:5384:2: 'title:'
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
    // InternalJavaFXLang.g:5393:1: rule__PieChartFX__Group_7__1 : rule__PieChartFX__Group_7__1__Impl ;
    public final void rule__PieChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5397:1: ( rule__PieChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:5398:2: rule__PieChartFX__Group_7__1__Impl
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
    // InternalJavaFXLang.g:5404:1: rule__PieChartFX__Group_7__1__Impl : ( ( rule__PieChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__PieChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5408:1: ( ( ( rule__PieChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:5409:1: ( ( rule__PieChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:5409:1: ( ( rule__PieChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:5410:2: ( rule__PieChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getPieChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:5411:2: ( rule__PieChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:5411:3: rule__PieChartFX__TitleAssignment_7_1
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
    // InternalJavaFXLang.g:5420:1: rule__PieChartFX__Group_8__0 : rule__PieChartFX__Group_8__0__Impl rule__PieChartFX__Group_8__1 ;
    public final void rule__PieChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5424:1: ( rule__PieChartFX__Group_8__0__Impl rule__PieChartFX__Group_8__1 )
            // InternalJavaFXLang.g:5425:2: rule__PieChartFX__Group_8__0__Impl rule__PieChartFX__Group_8__1
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
    // InternalJavaFXLang.g:5432:1: rule__PieChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__PieChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5436:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:5437:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:5437:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:5438:2: 'titleSide:'
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
    // InternalJavaFXLang.g:5447:1: rule__PieChartFX__Group_8__1 : rule__PieChartFX__Group_8__1__Impl ;
    public final void rule__PieChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5451:1: ( rule__PieChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:5452:2: rule__PieChartFX__Group_8__1__Impl
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
    // InternalJavaFXLang.g:5458:1: rule__PieChartFX__Group_8__1__Impl : ( ( rule__PieChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__PieChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5462:1: ( ( ( rule__PieChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:5463:1: ( ( rule__PieChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:5463:1: ( ( rule__PieChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:5464:2: ( rule__PieChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getPieChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:5465:2: ( rule__PieChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:5465:3: rule__PieChartFX__TitleSideAssignment_8_1
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
    // InternalJavaFXLang.g:5474:1: rule__LineChartFX__Group__0 : rule__LineChartFX__Group__0__Impl rule__LineChartFX__Group__1 ;
    public final void rule__LineChartFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5478:1: ( rule__LineChartFX__Group__0__Impl rule__LineChartFX__Group__1 )
            // InternalJavaFXLang.g:5479:2: rule__LineChartFX__Group__0__Impl rule__LineChartFX__Group__1
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
    // InternalJavaFXLang.g:5486:1: rule__LineChartFX__Group__0__Impl : ( () ) ;
    public final void rule__LineChartFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5490:1: ( ( () ) )
            // InternalJavaFXLang.g:5491:1: ( () )
            {
            // InternalJavaFXLang.g:5491:1: ( () )
            // InternalJavaFXLang.g:5492:2: ()
            {
             before(grammarAccess.getLineChartFXAccess().getLineChartFXAction_0()); 
            // InternalJavaFXLang.g:5493:2: ()
            // InternalJavaFXLang.g:5493:3: 
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
    // InternalJavaFXLang.g:5501:1: rule__LineChartFX__Group__1 : rule__LineChartFX__Group__1__Impl rule__LineChartFX__Group__2 ;
    public final void rule__LineChartFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5505:1: ( rule__LineChartFX__Group__1__Impl rule__LineChartFX__Group__2 )
            // InternalJavaFXLang.g:5506:2: rule__LineChartFX__Group__1__Impl rule__LineChartFX__Group__2
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
    // InternalJavaFXLang.g:5513:1: rule__LineChartFX__Group__1__Impl : ( 'LineChart' ) ;
    public final void rule__LineChartFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5517:1: ( ( 'LineChart' ) )
            // InternalJavaFXLang.g:5518:1: ( 'LineChart' )
            {
            // InternalJavaFXLang.g:5518:1: ( 'LineChart' )
            // InternalJavaFXLang.g:5519:2: 'LineChart'
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
    // InternalJavaFXLang.g:5528:1: rule__LineChartFX__Group__2 : rule__LineChartFX__Group__2__Impl rule__LineChartFX__Group__3 ;
    public final void rule__LineChartFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5532:1: ( rule__LineChartFX__Group__2__Impl rule__LineChartFX__Group__3 )
            // InternalJavaFXLang.g:5533:2: rule__LineChartFX__Group__2__Impl rule__LineChartFX__Group__3
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
    // InternalJavaFXLang.g:5540:1: rule__LineChartFX__Group__2__Impl : ( '{' ) ;
    public final void rule__LineChartFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5544:1: ( ( '{' ) )
            // InternalJavaFXLang.g:5545:1: ( '{' )
            {
            // InternalJavaFXLang.g:5545:1: ( '{' )
            // InternalJavaFXLang.g:5546:2: '{'
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
    // InternalJavaFXLang.g:5555:1: rule__LineChartFX__Group__3 : rule__LineChartFX__Group__3__Impl rule__LineChartFX__Group__4 ;
    public final void rule__LineChartFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5559:1: ( rule__LineChartFX__Group__3__Impl rule__LineChartFX__Group__4 )
            // InternalJavaFXLang.g:5560:2: rule__LineChartFX__Group__3__Impl rule__LineChartFX__Group__4
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
    // InternalJavaFXLang.g:5567:1: rule__LineChartFX__Group__3__Impl : ( 'name:' ) ;
    public final void rule__LineChartFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5571:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:5572:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:5572:1: ( 'name:' )
            // InternalJavaFXLang.g:5573:2: 'name:'
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
    // InternalJavaFXLang.g:5582:1: rule__LineChartFX__Group__4 : rule__LineChartFX__Group__4__Impl rule__LineChartFX__Group__5 ;
    public final void rule__LineChartFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5586:1: ( rule__LineChartFX__Group__4__Impl rule__LineChartFX__Group__5 )
            // InternalJavaFXLang.g:5587:2: rule__LineChartFX__Group__4__Impl rule__LineChartFX__Group__5
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
    // InternalJavaFXLang.g:5594:1: rule__LineChartFX__Group__4__Impl : ( ( rule__LineChartFX__NameAssignment_4 ) ) ;
    public final void rule__LineChartFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5598:1: ( ( ( rule__LineChartFX__NameAssignment_4 ) ) )
            // InternalJavaFXLang.g:5599:1: ( ( rule__LineChartFX__NameAssignment_4 ) )
            {
            // InternalJavaFXLang.g:5599:1: ( ( rule__LineChartFX__NameAssignment_4 ) )
            // InternalJavaFXLang.g:5600:2: ( rule__LineChartFX__NameAssignment_4 )
            {
             before(grammarAccess.getLineChartFXAccess().getNameAssignment_4()); 
            // InternalJavaFXLang.g:5601:2: ( rule__LineChartFX__NameAssignment_4 )
            // InternalJavaFXLang.g:5601:3: rule__LineChartFX__NameAssignment_4
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
    // InternalJavaFXLang.g:5609:1: rule__LineChartFX__Group__5 : rule__LineChartFX__Group__5__Impl rule__LineChartFX__Group__6 ;
    public final void rule__LineChartFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5613:1: ( rule__LineChartFX__Group__5__Impl rule__LineChartFX__Group__6 )
            // InternalJavaFXLang.g:5614:2: rule__LineChartFX__Group__5__Impl rule__LineChartFX__Group__6
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
    // InternalJavaFXLang.g:5621:1: rule__LineChartFX__Group__5__Impl : ( ( rule__LineChartFX__Group_5__0 )? ) ;
    public final void rule__LineChartFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5625:1: ( ( ( rule__LineChartFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:5626:1: ( ( rule__LineChartFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:5626:1: ( ( rule__LineChartFX__Group_5__0 )? )
            // InternalJavaFXLang.g:5627:2: ( rule__LineChartFX__Group_5__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:5628:2: ( rule__LineChartFX__Group_5__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==36) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalJavaFXLang.g:5628:3: rule__LineChartFX__Group_5__0
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
    // InternalJavaFXLang.g:5636:1: rule__LineChartFX__Group__6 : rule__LineChartFX__Group__6__Impl rule__LineChartFX__Group__7 ;
    public final void rule__LineChartFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5640:1: ( rule__LineChartFX__Group__6__Impl rule__LineChartFX__Group__7 )
            // InternalJavaFXLang.g:5641:2: rule__LineChartFX__Group__6__Impl rule__LineChartFX__Group__7
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
    // InternalJavaFXLang.g:5648:1: rule__LineChartFX__Group__6__Impl : ( ( rule__LineChartFX__Group_6__0 )? ) ;
    public final void rule__LineChartFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5652:1: ( ( ( rule__LineChartFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:5653:1: ( ( rule__LineChartFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:5653:1: ( ( rule__LineChartFX__Group_6__0 )? )
            // InternalJavaFXLang.g:5654:2: ( rule__LineChartFX__Group_6__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:5655:2: ( rule__LineChartFX__Group_6__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==37) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalJavaFXLang.g:5655:3: rule__LineChartFX__Group_6__0
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
    // InternalJavaFXLang.g:5663:1: rule__LineChartFX__Group__7 : rule__LineChartFX__Group__7__Impl rule__LineChartFX__Group__8 ;
    public final void rule__LineChartFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5667:1: ( rule__LineChartFX__Group__7__Impl rule__LineChartFX__Group__8 )
            // InternalJavaFXLang.g:5668:2: rule__LineChartFX__Group__7__Impl rule__LineChartFX__Group__8
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
    // InternalJavaFXLang.g:5675:1: rule__LineChartFX__Group__7__Impl : ( ( rule__LineChartFX__Group_7__0 )? ) ;
    public final void rule__LineChartFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5679:1: ( ( ( rule__LineChartFX__Group_7__0 )? ) )
            // InternalJavaFXLang.g:5680:1: ( ( rule__LineChartFX__Group_7__0 )? )
            {
            // InternalJavaFXLang.g:5680:1: ( ( rule__LineChartFX__Group_7__0 )? )
            // InternalJavaFXLang.g:5681:2: ( rule__LineChartFX__Group_7__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_7()); 
            // InternalJavaFXLang.g:5682:2: ( rule__LineChartFX__Group_7__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==38) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalJavaFXLang.g:5682:3: rule__LineChartFX__Group_7__0
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
    // InternalJavaFXLang.g:5690:1: rule__LineChartFX__Group__8 : rule__LineChartFX__Group__8__Impl rule__LineChartFX__Group__9 ;
    public final void rule__LineChartFX__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5694:1: ( rule__LineChartFX__Group__8__Impl rule__LineChartFX__Group__9 )
            // InternalJavaFXLang.g:5695:2: rule__LineChartFX__Group__8__Impl rule__LineChartFX__Group__9
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
    // InternalJavaFXLang.g:5702:1: rule__LineChartFX__Group__8__Impl : ( ( rule__LineChartFX__Group_8__0 )? ) ;
    public final void rule__LineChartFX__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5706:1: ( ( ( rule__LineChartFX__Group_8__0 )? ) )
            // InternalJavaFXLang.g:5707:1: ( ( rule__LineChartFX__Group_8__0 )? )
            {
            // InternalJavaFXLang.g:5707:1: ( ( rule__LineChartFX__Group_8__0 )? )
            // InternalJavaFXLang.g:5708:2: ( rule__LineChartFX__Group_8__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_8()); 
            // InternalJavaFXLang.g:5709:2: ( rule__LineChartFX__Group_8__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==39) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalJavaFXLang.g:5709:3: rule__LineChartFX__Group_8__0
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
    // InternalJavaFXLang.g:5717:1: rule__LineChartFX__Group__9 : rule__LineChartFX__Group__9__Impl rule__LineChartFX__Group__10 ;
    public final void rule__LineChartFX__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5721:1: ( rule__LineChartFX__Group__9__Impl rule__LineChartFX__Group__10 )
            // InternalJavaFXLang.g:5722:2: rule__LineChartFX__Group__9__Impl rule__LineChartFX__Group__10
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
    // InternalJavaFXLang.g:5729:1: rule__LineChartFX__Group__9__Impl : ( ( rule__LineChartFX__Group_9__0 )? ) ;
    public final void rule__LineChartFX__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5733:1: ( ( ( rule__LineChartFX__Group_9__0 )? ) )
            // InternalJavaFXLang.g:5734:1: ( ( rule__LineChartFX__Group_9__0 )? )
            {
            // InternalJavaFXLang.g:5734:1: ( ( rule__LineChartFX__Group_9__0 )? )
            // InternalJavaFXLang.g:5735:2: ( rule__LineChartFX__Group_9__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_9()); 
            // InternalJavaFXLang.g:5736:2: ( rule__LineChartFX__Group_9__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==40) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalJavaFXLang.g:5736:3: rule__LineChartFX__Group_9__0
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
    // InternalJavaFXLang.g:5744:1: rule__LineChartFX__Group__10 : rule__LineChartFX__Group__10__Impl rule__LineChartFX__Group__11 ;
    public final void rule__LineChartFX__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5748:1: ( rule__LineChartFX__Group__10__Impl rule__LineChartFX__Group__11 )
            // InternalJavaFXLang.g:5749:2: rule__LineChartFX__Group__10__Impl rule__LineChartFX__Group__11
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
    // InternalJavaFXLang.g:5756:1: rule__LineChartFX__Group__10__Impl : ( ( rule__LineChartFX__Group_10__0 )? ) ;
    public final void rule__LineChartFX__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5760:1: ( ( ( rule__LineChartFX__Group_10__0 )? ) )
            // InternalJavaFXLang.g:5761:1: ( ( rule__LineChartFX__Group_10__0 )? )
            {
            // InternalJavaFXLang.g:5761:1: ( ( rule__LineChartFX__Group_10__0 )? )
            // InternalJavaFXLang.g:5762:2: ( rule__LineChartFX__Group_10__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_10()); 
            // InternalJavaFXLang.g:5763:2: ( rule__LineChartFX__Group_10__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==41) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalJavaFXLang.g:5763:3: rule__LineChartFX__Group_10__0
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
    // InternalJavaFXLang.g:5771:1: rule__LineChartFX__Group__11 : rule__LineChartFX__Group__11__Impl rule__LineChartFX__Group__12 ;
    public final void rule__LineChartFX__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5775:1: ( rule__LineChartFX__Group__11__Impl rule__LineChartFX__Group__12 )
            // InternalJavaFXLang.g:5776:2: rule__LineChartFX__Group__11__Impl rule__LineChartFX__Group__12
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
    // InternalJavaFXLang.g:5783:1: rule__LineChartFX__Group__11__Impl : ( ( rule__LineChartFX__Group_11__0 )? ) ;
    public final void rule__LineChartFX__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5787:1: ( ( ( rule__LineChartFX__Group_11__0 )? ) )
            // InternalJavaFXLang.g:5788:1: ( ( rule__LineChartFX__Group_11__0 )? )
            {
            // InternalJavaFXLang.g:5788:1: ( ( rule__LineChartFX__Group_11__0 )? )
            // InternalJavaFXLang.g:5789:2: ( rule__LineChartFX__Group_11__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_11()); 
            // InternalJavaFXLang.g:5790:2: ( rule__LineChartFX__Group_11__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==42) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalJavaFXLang.g:5790:3: rule__LineChartFX__Group_11__0
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
    // InternalJavaFXLang.g:5798:1: rule__LineChartFX__Group__12 : rule__LineChartFX__Group__12__Impl rule__LineChartFX__Group__13 ;
    public final void rule__LineChartFX__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5802:1: ( rule__LineChartFX__Group__12__Impl rule__LineChartFX__Group__13 )
            // InternalJavaFXLang.g:5803:2: rule__LineChartFX__Group__12__Impl rule__LineChartFX__Group__13
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
    // InternalJavaFXLang.g:5810:1: rule__LineChartFX__Group__12__Impl : ( ( rule__LineChartFX__Group_12__0 )? ) ;
    public final void rule__LineChartFX__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5814:1: ( ( ( rule__LineChartFX__Group_12__0 )? ) )
            // InternalJavaFXLang.g:5815:1: ( ( rule__LineChartFX__Group_12__0 )? )
            {
            // InternalJavaFXLang.g:5815:1: ( ( rule__LineChartFX__Group_12__0 )? )
            // InternalJavaFXLang.g:5816:2: ( rule__LineChartFX__Group_12__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_12()); 
            // InternalJavaFXLang.g:5817:2: ( rule__LineChartFX__Group_12__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==43) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalJavaFXLang.g:5817:3: rule__LineChartFX__Group_12__0
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
    // InternalJavaFXLang.g:5825:1: rule__LineChartFX__Group__13 : rule__LineChartFX__Group__13__Impl rule__LineChartFX__Group__14 ;
    public final void rule__LineChartFX__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5829:1: ( rule__LineChartFX__Group__13__Impl rule__LineChartFX__Group__14 )
            // InternalJavaFXLang.g:5830:2: rule__LineChartFX__Group__13__Impl rule__LineChartFX__Group__14
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
    // InternalJavaFXLang.g:5837:1: rule__LineChartFX__Group__13__Impl : ( ( rule__LineChartFX__Group_13__0 )? ) ;
    public final void rule__LineChartFX__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5841:1: ( ( ( rule__LineChartFX__Group_13__0 )? ) )
            // InternalJavaFXLang.g:5842:1: ( ( rule__LineChartFX__Group_13__0 )? )
            {
            // InternalJavaFXLang.g:5842:1: ( ( rule__LineChartFX__Group_13__0 )? )
            // InternalJavaFXLang.g:5843:2: ( rule__LineChartFX__Group_13__0 )?
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_13()); 
            // InternalJavaFXLang.g:5844:2: ( rule__LineChartFX__Group_13__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==49) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalJavaFXLang.g:5844:3: rule__LineChartFX__Group_13__0
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
    // InternalJavaFXLang.g:5852:1: rule__LineChartFX__Group__14 : rule__LineChartFX__Group__14__Impl ;
    public final void rule__LineChartFX__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5856:1: ( rule__LineChartFX__Group__14__Impl )
            // InternalJavaFXLang.g:5857:2: rule__LineChartFX__Group__14__Impl
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
    // InternalJavaFXLang.g:5863:1: rule__LineChartFX__Group__14__Impl : ( '}' ) ;
    public final void rule__LineChartFX__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5867:1: ( ( '}' ) )
            // InternalJavaFXLang.g:5868:1: ( '}' )
            {
            // InternalJavaFXLang.g:5868:1: ( '}' )
            // InternalJavaFXLang.g:5869:2: '}'
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
    // InternalJavaFXLang.g:5879:1: rule__LineChartFX__Group_5__0 : rule__LineChartFX__Group_5__0__Impl rule__LineChartFX__Group_5__1 ;
    public final void rule__LineChartFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5883:1: ( rule__LineChartFX__Group_5__0__Impl rule__LineChartFX__Group_5__1 )
            // InternalJavaFXLang.g:5884:2: rule__LineChartFX__Group_5__0__Impl rule__LineChartFX__Group_5__1
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
    // InternalJavaFXLang.g:5891:1: rule__LineChartFX__Group_5__0__Impl : ( 'legendSide:' ) ;
    public final void rule__LineChartFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5895:1: ( ( 'legendSide:' ) )
            // InternalJavaFXLang.g:5896:1: ( 'legendSide:' )
            {
            // InternalJavaFXLang.g:5896:1: ( 'legendSide:' )
            // InternalJavaFXLang.g:5897:2: 'legendSide:'
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
    // InternalJavaFXLang.g:5906:1: rule__LineChartFX__Group_5__1 : rule__LineChartFX__Group_5__1__Impl ;
    public final void rule__LineChartFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5910:1: ( rule__LineChartFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:5911:2: rule__LineChartFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:5917:1: rule__LineChartFX__Group_5__1__Impl : ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) ) ;
    public final void rule__LineChartFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5921:1: ( ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:5922:1: ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:5922:1: ( ( rule__LineChartFX__LegendSideAssignment_5_1 ) )
            // InternalJavaFXLang.g:5923:2: ( rule__LineChartFX__LegendSideAssignment_5_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getLegendSideAssignment_5_1()); 
            // InternalJavaFXLang.g:5924:2: ( rule__LineChartFX__LegendSideAssignment_5_1 )
            // InternalJavaFXLang.g:5924:3: rule__LineChartFX__LegendSideAssignment_5_1
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
    // InternalJavaFXLang.g:5933:1: rule__LineChartFX__Group_6__0 : rule__LineChartFX__Group_6__0__Impl rule__LineChartFX__Group_6__1 ;
    public final void rule__LineChartFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5937:1: ( rule__LineChartFX__Group_6__0__Impl rule__LineChartFX__Group_6__1 )
            // InternalJavaFXLang.g:5938:2: rule__LineChartFX__Group_6__0__Impl rule__LineChartFX__Group_6__1
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
    // InternalJavaFXLang.g:5945:1: rule__LineChartFX__Group_6__0__Impl : ( 'showLegend:' ) ;
    public final void rule__LineChartFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5949:1: ( ( 'showLegend:' ) )
            // InternalJavaFXLang.g:5950:1: ( 'showLegend:' )
            {
            // InternalJavaFXLang.g:5950:1: ( 'showLegend:' )
            // InternalJavaFXLang.g:5951:2: 'showLegend:'
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
    // InternalJavaFXLang.g:5960:1: rule__LineChartFX__Group_6__1 : rule__LineChartFX__Group_6__1__Impl ;
    public final void rule__LineChartFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5964:1: ( rule__LineChartFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:5965:2: rule__LineChartFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:5971:1: rule__LineChartFX__Group_6__1__Impl : ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) ) ;
    public final void rule__LineChartFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5975:1: ( ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:5976:1: ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:5976:1: ( ( rule__LineChartFX__ShowLegendAssignment_6_1 ) )
            // InternalJavaFXLang.g:5977:2: ( rule__LineChartFX__ShowLegendAssignment_6_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getShowLegendAssignment_6_1()); 
            // InternalJavaFXLang.g:5978:2: ( rule__LineChartFX__ShowLegendAssignment_6_1 )
            // InternalJavaFXLang.g:5978:3: rule__LineChartFX__ShowLegendAssignment_6_1
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
    // InternalJavaFXLang.g:5987:1: rule__LineChartFX__Group_7__0 : rule__LineChartFX__Group_7__0__Impl rule__LineChartFX__Group_7__1 ;
    public final void rule__LineChartFX__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:5991:1: ( rule__LineChartFX__Group_7__0__Impl rule__LineChartFX__Group_7__1 )
            // InternalJavaFXLang.g:5992:2: rule__LineChartFX__Group_7__0__Impl rule__LineChartFX__Group_7__1
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
    // InternalJavaFXLang.g:5999:1: rule__LineChartFX__Group_7__0__Impl : ( 'title:' ) ;
    public final void rule__LineChartFX__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6003:1: ( ( 'title:' ) )
            // InternalJavaFXLang.g:6004:1: ( 'title:' )
            {
            // InternalJavaFXLang.g:6004:1: ( 'title:' )
            // InternalJavaFXLang.g:6005:2: 'title:'
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
    // InternalJavaFXLang.g:6014:1: rule__LineChartFX__Group_7__1 : rule__LineChartFX__Group_7__1__Impl ;
    public final void rule__LineChartFX__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6018:1: ( rule__LineChartFX__Group_7__1__Impl )
            // InternalJavaFXLang.g:6019:2: rule__LineChartFX__Group_7__1__Impl
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
    // InternalJavaFXLang.g:6025:1: rule__LineChartFX__Group_7__1__Impl : ( ( rule__LineChartFX__TitleAssignment_7_1 ) ) ;
    public final void rule__LineChartFX__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6029:1: ( ( ( rule__LineChartFX__TitleAssignment_7_1 ) ) )
            // InternalJavaFXLang.g:6030:1: ( ( rule__LineChartFX__TitleAssignment_7_1 ) )
            {
            // InternalJavaFXLang.g:6030:1: ( ( rule__LineChartFX__TitleAssignment_7_1 ) )
            // InternalJavaFXLang.g:6031:2: ( rule__LineChartFX__TitleAssignment_7_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getTitleAssignment_7_1()); 
            // InternalJavaFXLang.g:6032:2: ( rule__LineChartFX__TitleAssignment_7_1 )
            // InternalJavaFXLang.g:6032:3: rule__LineChartFX__TitleAssignment_7_1
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
    // InternalJavaFXLang.g:6041:1: rule__LineChartFX__Group_8__0 : rule__LineChartFX__Group_8__0__Impl rule__LineChartFX__Group_8__1 ;
    public final void rule__LineChartFX__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6045:1: ( rule__LineChartFX__Group_8__0__Impl rule__LineChartFX__Group_8__1 )
            // InternalJavaFXLang.g:6046:2: rule__LineChartFX__Group_8__0__Impl rule__LineChartFX__Group_8__1
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
    // InternalJavaFXLang.g:6053:1: rule__LineChartFX__Group_8__0__Impl : ( 'titleSide:' ) ;
    public final void rule__LineChartFX__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6057:1: ( ( 'titleSide:' ) )
            // InternalJavaFXLang.g:6058:1: ( 'titleSide:' )
            {
            // InternalJavaFXLang.g:6058:1: ( 'titleSide:' )
            // InternalJavaFXLang.g:6059:2: 'titleSide:'
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
    // InternalJavaFXLang.g:6068:1: rule__LineChartFX__Group_8__1 : rule__LineChartFX__Group_8__1__Impl ;
    public final void rule__LineChartFX__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6072:1: ( rule__LineChartFX__Group_8__1__Impl )
            // InternalJavaFXLang.g:6073:2: rule__LineChartFX__Group_8__1__Impl
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
    // InternalJavaFXLang.g:6079:1: rule__LineChartFX__Group_8__1__Impl : ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) ) ;
    public final void rule__LineChartFX__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6083:1: ( ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) ) )
            // InternalJavaFXLang.g:6084:1: ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) )
            {
            // InternalJavaFXLang.g:6084:1: ( ( rule__LineChartFX__TitleSideAssignment_8_1 ) )
            // InternalJavaFXLang.g:6085:2: ( rule__LineChartFX__TitleSideAssignment_8_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getTitleSideAssignment_8_1()); 
            // InternalJavaFXLang.g:6086:2: ( rule__LineChartFX__TitleSideAssignment_8_1 )
            // InternalJavaFXLang.g:6086:3: rule__LineChartFX__TitleSideAssignment_8_1
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
    // InternalJavaFXLang.g:6095:1: rule__LineChartFX__Group_9__0 : rule__LineChartFX__Group_9__0__Impl rule__LineChartFX__Group_9__1 ;
    public final void rule__LineChartFX__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6099:1: ( rule__LineChartFX__Group_9__0__Impl rule__LineChartFX__Group_9__1 )
            // InternalJavaFXLang.g:6100:2: rule__LineChartFX__Group_9__0__Impl rule__LineChartFX__Group_9__1
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
    // InternalJavaFXLang.g:6107:1: rule__LineChartFX__Group_9__0__Impl : ( 'xAxisLabel:' ) ;
    public final void rule__LineChartFX__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6111:1: ( ( 'xAxisLabel:' ) )
            // InternalJavaFXLang.g:6112:1: ( 'xAxisLabel:' )
            {
            // InternalJavaFXLang.g:6112:1: ( 'xAxisLabel:' )
            // InternalJavaFXLang.g:6113:2: 'xAxisLabel:'
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
    // InternalJavaFXLang.g:6122:1: rule__LineChartFX__Group_9__1 : rule__LineChartFX__Group_9__1__Impl ;
    public final void rule__LineChartFX__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6126:1: ( rule__LineChartFX__Group_9__1__Impl )
            // InternalJavaFXLang.g:6127:2: rule__LineChartFX__Group_9__1__Impl
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
    // InternalJavaFXLang.g:6133:1: rule__LineChartFX__Group_9__1__Impl : ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) ) ;
    public final void rule__LineChartFX__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6137:1: ( ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) ) )
            // InternalJavaFXLang.g:6138:1: ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) )
            {
            // InternalJavaFXLang.g:6138:1: ( ( rule__LineChartFX__XAxisLabelAssignment_9_1 ) )
            // InternalJavaFXLang.g:6139:2: ( rule__LineChartFX__XAxisLabelAssignment_9_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getXAxisLabelAssignment_9_1()); 
            // InternalJavaFXLang.g:6140:2: ( rule__LineChartFX__XAxisLabelAssignment_9_1 )
            // InternalJavaFXLang.g:6140:3: rule__LineChartFX__XAxisLabelAssignment_9_1
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
    // InternalJavaFXLang.g:6149:1: rule__LineChartFX__Group_10__0 : rule__LineChartFX__Group_10__0__Impl rule__LineChartFX__Group_10__1 ;
    public final void rule__LineChartFX__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6153:1: ( rule__LineChartFX__Group_10__0__Impl rule__LineChartFX__Group_10__1 )
            // InternalJavaFXLang.g:6154:2: rule__LineChartFX__Group_10__0__Impl rule__LineChartFX__Group_10__1
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
    // InternalJavaFXLang.g:6161:1: rule__LineChartFX__Group_10__0__Impl : ( 'xAxisType:' ) ;
    public final void rule__LineChartFX__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6165:1: ( ( 'xAxisType:' ) )
            // InternalJavaFXLang.g:6166:1: ( 'xAxisType:' )
            {
            // InternalJavaFXLang.g:6166:1: ( 'xAxisType:' )
            // InternalJavaFXLang.g:6167:2: 'xAxisType:'
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
    // InternalJavaFXLang.g:6176:1: rule__LineChartFX__Group_10__1 : rule__LineChartFX__Group_10__1__Impl ;
    public final void rule__LineChartFX__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6180:1: ( rule__LineChartFX__Group_10__1__Impl )
            // InternalJavaFXLang.g:6181:2: rule__LineChartFX__Group_10__1__Impl
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
    // InternalJavaFXLang.g:6187:1: rule__LineChartFX__Group_10__1__Impl : ( ( rule__LineChartFX__XAxisTypeAssignment_10_1 ) ) ;
    public final void rule__LineChartFX__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6191:1: ( ( ( rule__LineChartFX__XAxisTypeAssignment_10_1 ) ) )
            // InternalJavaFXLang.g:6192:1: ( ( rule__LineChartFX__XAxisTypeAssignment_10_1 ) )
            {
            // InternalJavaFXLang.g:6192:1: ( ( rule__LineChartFX__XAxisTypeAssignment_10_1 ) )
            // InternalJavaFXLang.g:6193:2: ( rule__LineChartFX__XAxisTypeAssignment_10_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getXAxisTypeAssignment_10_1()); 
            // InternalJavaFXLang.g:6194:2: ( rule__LineChartFX__XAxisTypeAssignment_10_1 )
            // InternalJavaFXLang.g:6194:3: rule__LineChartFX__XAxisTypeAssignment_10_1
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
    // InternalJavaFXLang.g:6203:1: rule__LineChartFX__Group_11__0 : rule__LineChartFX__Group_11__0__Impl rule__LineChartFX__Group_11__1 ;
    public final void rule__LineChartFX__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6207:1: ( rule__LineChartFX__Group_11__0__Impl rule__LineChartFX__Group_11__1 )
            // InternalJavaFXLang.g:6208:2: rule__LineChartFX__Group_11__0__Impl rule__LineChartFX__Group_11__1
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
    // InternalJavaFXLang.g:6215:1: rule__LineChartFX__Group_11__0__Impl : ( 'yAxisLabel:' ) ;
    public final void rule__LineChartFX__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6219:1: ( ( 'yAxisLabel:' ) )
            // InternalJavaFXLang.g:6220:1: ( 'yAxisLabel:' )
            {
            // InternalJavaFXLang.g:6220:1: ( 'yAxisLabel:' )
            // InternalJavaFXLang.g:6221:2: 'yAxisLabel:'
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
    // InternalJavaFXLang.g:6230:1: rule__LineChartFX__Group_11__1 : rule__LineChartFX__Group_11__1__Impl ;
    public final void rule__LineChartFX__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6234:1: ( rule__LineChartFX__Group_11__1__Impl )
            // InternalJavaFXLang.g:6235:2: rule__LineChartFX__Group_11__1__Impl
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
    // InternalJavaFXLang.g:6241:1: rule__LineChartFX__Group_11__1__Impl : ( ( rule__LineChartFX__YAxisLabelAssignment_11_1 ) ) ;
    public final void rule__LineChartFX__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6245:1: ( ( ( rule__LineChartFX__YAxisLabelAssignment_11_1 ) ) )
            // InternalJavaFXLang.g:6246:1: ( ( rule__LineChartFX__YAxisLabelAssignment_11_1 ) )
            {
            // InternalJavaFXLang.g:6246:1: ( ( rule__LineChartFX__YAxisLabelAssignment_11_1 ) )
            // InternalJavaFXLang.g:6247:2: ( rule__LineChartFX__YAxisLabelAssignment_11_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getYAxisLabelAssignment_11_1()); 
            // InternalJavaFXLang.g:6248:2: ( rule__LineChartFX__YAxisLabelAssignment_11_1 )
            // InternalJavaFXLang.g:6248:3: rule__LineChartFX__YAxisLabelAssignment_11_1
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
    // InternalJavaFXLang.g:6257:1: rule__LineChartFX__Group_12__0 : rule__LineChartFX__Group_12__0__Impl rule__LineChartFX__Group_12__1 ;
    public final void rule__LineChartFX__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6261:1: ( rule__LineChartFX__Group_12__0__Impl rule__LineChartFX__Group_12__1 )
            // InternalJavaFXLang.g:6262:2: rule__LineChartFX__Group_12__0__Impl rule__LineChartFX__Group_12__1
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
    // InternalJavaFXLang.g:6269:1: rule__LineChartFX__Group_12__0__Impl : ( 'yAxisType:' ) ;
    public final void rule__LineChartFX__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6273:1: ( ( 'yAxisType:' ) )
            // InternalJavaFXLang.g:6274:1: ( 'yAxisType:' )
            {
            // InternalJavaFXLang.g:6274:1: ( 'yAxisType:' )
            // InternalJavaFXLang.g:6275:2: 'yAxisType:'
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
    // InternalJavaFXLang.g:6284:1: rule__LineChartFX__Group_12__1 : rule__LineChartFX__Group_12__1__Impl ;
    public final void rule__LineChartFX__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6288:1: ( rule__LineChartFX__Group_12__1__Impl )
            // InternalJavaFXLang.g:6289:2: rule__LineChartFX__Group_12__1__Impl
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
    // InternalJavaFXLang.g:6295:1: rule__LineChartFX__Group_12__1__Impl : ( ( rule__LineChartFX__YAxisTypeAssignment_12_1 ) ) ;
    public final void rule__LineChartFX__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6299:1: ( ( ( rule__LineChartFX__YAxisTypeAssignment_12_1 ) ) )
            // InternalJavaFXLang.g:6300:1: ( ( rule__LineChartFX__YAxisTypeAssignment_12_1 ) )
            {
            // InternalJavaFXLang.g:6300:1: ( ( rule__LineChartFX__YAxisTypeAssignment_12_1 ) )
            // InternalJavaFXLang.g:6301:2: ( rule__LineChartFX__YAxisTypeAssignment_12_1 )
            {
             before(grammarAccess.getLineChartFXAccess().getYAxisTypeAssignment_12_1()); 
            // InternalJavaFXLang.g:6302:2: ( rule__LineChartFX__YAxisTypeAssignment_12_1 )
            // InternalJavaFXLang.g:6302:3: rule__LineChartFX__YAxisTypeAssignment_12_1
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
    // InternalJavaFXLang.g:6311:1: rule__LineChartFX__Group_13__0 : rule__LineChartFX__Group_13__0__Impl rule__LineChartFX__Group_13__1 ;
    public final void rule__LineChartFX__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6315:1: ( rule__LineChartFX__Group_13__0__Impl rule__LineChartFX__Group_13__1 )
            // InternalJavaFXLang.g:6316:2: rule__LineChartFX__Group_13__0__Impl rule__LineChartFX__Group_13__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalJavaFXLang.g:6323:1: rule__LineChartFX__Group_13__0__Impl : ( 'dataList' ) ;
    public final void rule__LineChartFX__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6327:1: ( ( 'dataList' ) )
            // InternalJavaFXLang.g:6328:1: ( 'dataList' )
            {
            // InternalJavaFXLang.g:6328:1: ( 'dataList' )
            // InternalJavaFXLang.g:6329:2: 'dataList'
            {
             before(grammarAccess.getLineChartFXAccess().getDataListKeyword_13_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLineChartFXAccess().getDataListKeyword_13_0()); 

            }


            }

        }
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
    // InternalJavaFXLang.g:6338:1: rule__LineChartFX__Group_13__1 : rule__LineChartFX__Group_13__1__Impl rule__LineChartFX__Group_13__2 ;
    public final void rule__LineChartFX__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6342:1: ( rule__LineChartFX__Group_13__1__Impl rule__LineChartFX__Group_13__2 )
            // InternalJavaFXLang.g:6343:2: rule__LineChartFX__Group_13__1__Impl rule__LineChartFX__Group_13__2
            {
            pushFollow(FOLLOW_31);
            rule__LineChartFX__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_13__2();

            state._fsp--;


            }

        }
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
    // InternalJavaFXLang.g:6350:1: rule__LineChartFX__Group_13__1__Impl : ( '{' ) ;
    public final void rule__LineChartFX__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6354:1: ( ( '{' ) )
            // InternalJavaFXLang.g:6355:1: ( '{' )
            {
            // InternalJavaFXLang.g:6355:1: ( '{' )
            // InternalJavaFXLang.g:6356:2: '{'
            {
             before(grammarAccess.getLineChartFXAccess().getLeftCurlyBracketKeyword_13_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLineChartFXAccess().getLeftCurlyBracketKeyword_13_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__LineChartFX__Group_13__2"
    // InternalJavaFXLang.g:6365:1: rule__LineChartFX__Group_13__2 : rule__LineChartFX__Group_13__2__Impl rule__LineChartFX__Group_13__3 ;
    public final void rule__LineChartFX__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6369:1: ( rule__LineChartFX__Group_13__2__Impl rule__LineChartFX__Group_13__3 )
            // InternalJavaFXLang.g:6370:2: rule__LineChartFX__Group_13__2__Impl rule__LineChartFX__Group_13__3
            {
            pushFollow(FOLLOW_32);
            rule__LineChartFX__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChartFX__Group_13__2"


    // $ANTLR start "rule__LineChartFX__Group_13__2__Impl"
    // InternalJavaFXLang.g:6377:1: rule__LineChartFX__Group_13__2__Impl : ( ( rule__LineChartFX__Group_13_2__0 ) ) ;
    public final void rule__LineChartFX__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6381:1: ( ( ( rule__LineChartFX__Group_13_2__0 ) ) )
            // InternalJavaFXLang.g:6382:1: ( ( rule__LineChartFX__Group_13_2__0 ) )
            {
            // InternalJavaFXLang.g:6382:1: ( ( rule__LineChartFX__Group_13_2__0 ) )
            // InternalJavaFXLang.g:6383:2: ( rule__LineChartFX__Group_13_2__0 )
            {
             before(grammarAccess.getLineChartFXAccess().getGroup_13_2()); 
            // InternalJavaFXLang.g:6384:2: ( rule__LineChartFX__Group_13_2__0 )
            // InternalJavaFXLang.g:6384:3: rule__LineChartFX__Group_13_2__0
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_13_2__0();

            state._fsp--;


            }

             after(grammarAccess.getLineChartFXAccess().getGroup_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChartFX__Group_13__2__Impl"


    // $ANTLR start "rule__LineChartFX__Group_13__3"
    // InternalJavaFXLang.g:6392:1: rule__LineChartFX__Group_13__3 : rule__LineChartFX__Group_13__3__Impl ;
    public final void rule__LineChartFX__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6396:1: ( rule__LineChartFX__Group_13__3__Impl )
            // InternalJavaFXLang.g:6397:2: rule__LineChartFX__Group_13__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_13__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChartFX__Group_13__3"


    // $ANTLR start "rule__LineChartFX__Group_13__3__Impl"
    // InternalJavaFXLang.g:6403:1: rule__LineChartFX__Group_13__3__Impl : ( '}' ) ;
    public final void rule__LineChartFX__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6407:1: ( ( '}' ) )
            // InternalJavaFXLang.g:6408:1: ( '}' )
            {
            // InternalJavaFXLang.g:6408:1: ( '}' )
            // InternalJavaFXLang.g:6409:2: '}'
            {
             before(grammarAccess.getLineChartFXAccess().getRightCurlyBracketKeyword_13_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLineChartFXAccess().getRightCurlyBracketKeyword_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChartFX__Group_13__3__Impl"


    // $ANTLR start "rule__LineChartFX__Group_13_2__0"
    // InternalJavaFXLang.g:6419:1: rule__LineChartFX__Group_13_2__0 : rule__LineChartFX__Group_13_2__0__Impl rule__LineChartFX__Group_13_2__1 ;
    public final void rule__LineChartFX__Group_13_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6423:1: ( rule__LineChartFX__Group_13_2__0__Impl rule__LineChartFX__Group_13_2__1 )
            // InternalJavaFXLang.g:6424:2: rule__LineChartFX__Group_13_2__0__Impl rule__LineChartFX__Group_13_2__1
            {
            pushFollow(FOLLOW_31);
            rule__LineChartFX__Group_13_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_13_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChartFX__Group_13_2__0"


    // $ANTLR start "rule__LineChartFX__Group_13_2__0__Impl"
    // InternalJavaFXLang.g:6431:1: rule__LineChartFX__Group_13_2__0__Impl : ( ( rule__LineChartFX__DataAssignment_13_2_0 ) ) ;
    public final void rule__LineChartFX__Group_13_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6435:1: ( ( ( rule__LineChartFX__DataAssignment_13_2_0 ) ) )
            // InternalJavaFXLang.g:6436:1: ( ( rule__LineChartFX__DataAssignment_13_2_0 ) )
            {
            // InternalJavaFXLang.g:6436:1: ( ( rule__LineChartFX__DataAssignment_13_2_0 ) )
            // InternalJavaFXLang.g:6437:2: ( rule__LineChartFX__DataAssignment_13_2_0 )
            {
             before(grammarAccess.getLineChartFXAccess().getDataAssignment_13_2_0()); 
            // InternalJavaFXLang.g:6438:2: ( rule__LineChartFX__DataAssignment_13_2_0 )
            // InternalJavaFXLang.g:6438:3: rule__LineChartFX__DataAssignment_13_2_0
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__DataAssignment_13_2_0();

            state._fsp--;


            }

             after(grammarAccess.getLineChartFXAccess().getDataAssignment_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChartFX__Group_13_2__0__Impl"


    // $ANTLR start "rule__LineChartFX__Group_13_2__1"
    // InternalJavaFXLang.g:6446:1: rule__LineChartFX__Group_13_2__1 : rule__LineChartFX__Group_13_2__1__Impl ;
    public final void rule__LineChartFX__Group_13_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6450:1: ( rule__LineChartFX__Group_13_2__1__Impl )
            // InternalJavaFXLang.g:6451:2: rule__LineChartFX__Group_13_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChartFX__Group_13_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChartFX__Group_13_2__1"


    // $ANTLR start "rule__LineChartFX__Group_13_2__1__Impl"
    // InternalJavaFXLang.g:6457:1: rule__LineChartFX__Group_13_2__1__Impl : ( ( rule__LineChartFX__DataAssignment_13_2_1 )* ) ;
    public final void rule__LineChartFX__Group_13_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6461:1: ( ( ( rule__LineChartFX__DataAssignment_13_2_1 )* ) )
            // InternalJavaFXLang.g:6462:1: ( ( rule__LineChartFX__DataAssignment_13_2_1 )* )
            {
            // InternalJavaFXLang.g:6462:1: ( ( rule__LineChartFX__DataAssignment_13_2_1 )* )
            // InternalJavaFXLang.g:6463:2: ( rule__LineChartFX__DataAssignment_13_2_1 )*
            {
             before(grammarAccess.getLineChartFXAccess().getDataAssignment_13_2_1()); 
            // InternalJavaFXLang.g:6464:2: ( rule__LineChartFX__DataAssignment_13_2_1 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==50) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalJavaFXLang.g:6464:3: rule__LineChartFX__DataAssignment_13_2_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__LineChartFX__DataAssignment_13_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

             after(grammarAccess.getLineChartFXAccess().getDataAssignment_13_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChartFX__Group_13_2__1__Impl"


    // $ANTLR start "rule__ChartFXData__Group__0"
    // InternalJavaFXLang.g:6473:1: rule__ChartFXData__Group__0 : rule__ChartFXData__Group__0__Impl rule__ChartFXData__Group__1 ;
    public final void rule__ChartFXData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6477:1: ( rule__ChartFXData__Group__0__Impl rule__ChartFXData__Group__1 )
            // InternalJavaFXLang.g:6478:2: rule__ChartFXData__Group__0__Impl rule__ChartFXData__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalJavaFXLang.g:6485:1: rule__ChartFXData__Group__0__Impl : ( () ) ;
    public final void rule__ChartFXData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6489:1: ( ( () ) )
            // InternalJavaFXLang.g:6490:1: ( () )
            {
            // InternalJavaFXLang.g:6490:1: ( () )
            // InternalJavaFXLang.g:6491:2: ()
            {
             before(grammarAccess.getChartFXDataAccess().getChartFXDataAction_0()); 
            // InternalJavaFXLang.g:6492:2: ()
            // InternalJavaFXLang.g:6492:3: 
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
    // InternalJavaFXLang.g:6500:1: rule__ChartFXData__Group__1 : rule__ChartFXData__Group__1__Impl rule__ChartFXData__Group__2 ;
    public final void rule__ChartFXData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6504:1: ( rule__ChartFXData__Group__1__Impl rule__ChartFXData__Group__2 )
            // InternalJavaFXLang.g:6505:2: rule__ChartFXData__Group__1__Impl rule__ChartFXData__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalJavaFXLang.g:6512:1: rule__ChartFXData__Group__1__Impl : ( 'data' ) ;
    public final void rule__ChartFXData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6516:1: ( ( 'data' ) )
            // InternalJavaFXLang.g:6517:1: ( 'data' )
            {
            // InternalJavaFXLang.g:6517:1: ( 'data' )
            // InternalJavaFXLang.g:6518:2: 'data'
            {
             before(grammarAccess.getChartFXDataAccess().getDataKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalJavaFXLang.g:6527:1: rule__ChartFXData__Group__2 : rule__ChartFXData__Group__2__Impl rule__ChartFXData__Group__3 ;
    public final void rule__ChartFXData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6531:1: ( rule__ChartFXData__Group__2__Impl rule__ChartFXData__Group__3 )
            // InternalJavaFXLang.g:6532:2: rule__ChartFXData__Group__2__Impl rule__ChartFXData__Group__3
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
    // InternalJavaFXLang.g:6539:1: rule__ChartFXData__Group__2__Impl : ( '(' ) ;
    public final void rule__ChartFXData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6543:1: ( ( '(' ) )
            // InternalJavaFXLang.g:6544:1: ( '(' )
            {
            // InternalJavaFXLang.g:6544:1: ( '(' )
            // InternalJavaFXLang.g:6545:2: '('
            {
             before(grammarAccess.getChartFXDataAccess().getLeftParenthesisKeyword_2()); 
            match(input,51,FOLLOW_2); 
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
    // InternalJavaFXLang.g:6554:1: rule__ChartFXData__Group__3 : rule__ChartFXData__Group__3__Impl rule__ChartFXData__Group__4 ;
    public final void rule__ChartFXData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6558:1: ( rule__ChartFXData__Group__3__Impl rule__ChartFXData__Group__4 )
            // InternalJavaFXLang.g:6559:2: rule__ChartFXData__Group__3__Impl rule__ChartFXData__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalJavaFXLang.g:6566:1: rule__ChartFXData__Group__3__Impl : ( ( rule__ChartFXData__XValueAssignment_3 ) ) ;
    public final void rule__ChartFXData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6570:1: ( ( ( rule__ChartFXData__XValueAssignment_3 ) ) )
            // InternalJavaFXLang.g:6571:1: ( ( rule__ChartFXData__XValueAssignment_3 ) )
            {
            // InternalJavaFXLang.g:6571:1: ( ( rule__ChartFXData__XValueAssignment_3 ) )
            // InternalJavaFXLang.g:6572:2: ( rule__ChartFXData__XValueAssignment_3 )
            {
             before(grammarAccess.getChartFXDataAccess().getXValueAssignment_3()); 
            // InternalJavaFXLang.g:6573:2: ( rule__ChartFXData__XValueAssignment_3 )
            // InternalJavaFXLang.g:6573:3: rule__ChartFXData__XValueAssignment_3
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
    // InternalJavaFXLang.g:6581:1: rule__ChartFXData__Group__4 : rule__ChartFXData__Group__4__Impl rule__ChartFXData__Group__5 ;
    public final void rule__ChartFXData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6585:1: ( rule__ChartFXData__Group__4__Impl rule__ChartFXData__Group__5 )
            // InternalJavaFXLang.g:6586:2: rule__ChartFXData__Group__4__Impl rule__ChartFXData__Group__5
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
    // InternalJavaFXLang.g:6593:1: rule__ChartFXData__Group__4__Impl : ( ',' ) ;
    public final void rule__ChartFXData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6597:1: ( ( ',' ) )
            // InternalJavaFXLang.g:6598:1: ( ',' )
            {
            // InternalJavaFXLang.g:6598:1: ( ',' )
            // InternalJavaFXLang.g:6599:2: ','
            {
             before(grammarAccess.getChartFXDataAccess().getCommaKeyword_4()); 
            match(input,52,FOLLOW_2); 
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
    // InternalJavaFXLang.g:6608:1: rule__ChartFXData__Group__5 : rule__ChartFXData__Group__5__Impl rule__ChartFXData__Group__6 ;
    public final void rule__ChartFXData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6612:1: ( rule__ChartFXData__Group__5__Impl rule__ChartFXData__Group__6 )
            // InternalJavaFXLang.g:6613:2: rule__ChartFXData__Group__5__Impl rule__ChartFXData__Group__6
            {
            pushFollow(FOLLOW_36);
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
    // InternalJavaFXLang.g:6620:1: rule__ChartFXData__Group__5__Impl : ( ( rule__ChartFXData__YValueAssignment_5 ) ) ;
    public final void rule__ChartFXData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6624:1: ( ( ( rule__ChartFXData__YValueAssignment_5 ) ) )
            // InternalJavaFXLang.g:6625:1: ( ( rule__ChartFXData__YValueAssignment_5 ) )
            {
            // InternalJavaFXLang.g:6625:1: ( ( rule__ChartFXData__YValueAssignment_5 ) )
            // InternalJavaFXLang.g:6626:2: ( rule__ChartFXData__YValueAssignment_5 )
            {
             before(grammarAccess.getChartFXDataAccess().getYValueAssignment_5()); 
            // InternalJavaFXLang.g:6627:2: ( rule__ChartFXData__YValueAssignment_5 )
            // InternalJavaFXLang.g:6627:3: rule__ChartFXData__YValueAssignment_5
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
    // InternalJavaFXLang.g:6635:1: rule__ChartFXData__Group__6 : rule__ChartFXData__Group__6__Impl ;
    public final void rule__ChartFXData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6639:1: ( rule__ChartFXData__Group__6__Impl )
            // InternalJavaFXLang.g:6640:2: rule__ChartFXData__Group__6__Impl
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
    // InternalJavaFXLang.g:6646:1: rule__ChartFXData__Group__6__Impl : ( ')' ) ;
    public final void rule__ChartFXData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6650:1: ( ( ')' ) )
            // InternalJavaFXLang.g:6651:1: ( ')' )
            {
            // InternalJavaFXLang.g:6651:1: ( ')' )
            // InternalJavaFXLang.g:6652:2: ')'
            {
             before(grammarAccess.getChartFXDataAccess().getRightParenthesisKeyword_6()); 
            match(input,53,FOLLOW_2); 
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
    // InternalJavaFXLang.g:6662:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6666:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalJavaFXLang.g:6667:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
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
    // InternalJavaFXLang.g:6674:1: rule__Binding__Group__0__Impl : ( () ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6678:1: ( ( () ) )
            // InternalJavaFXLang.g:6679:1: ( () )
            {
            // InternalJavaFXLang.g:6679:1: ( () )
            // InternalJavaFXLang.g:6680:2: ()
            {
             before(grammarAccess.getBindingAccess().getBindingAction_0()); 
            // InternalJavaFXLang.g:6681:2: ()
            // InternalJavaFXLang.g:6681:3: 
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
    // InternalJavaFXLang.g:6689:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6693:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalJavaFXLang.g:6694:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
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
    // InternalJavaFXLang.g:6701:1: rule__Binding__Group__1__Impl : ( 'binding' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6705:1: ( ( 'binding' ) )
            // InternalJavaFXLang.g:6706:1: ( 'binding' )
            {
            // InternalJavaFXLang.g:6706:1: ( 'binding' )
            // InternalJavaFXLang.g:6707:2: 'binding'
            {
             before(grammarAccess.getBindingAccess().getBindingKeyword_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalJavaFXLang.g:6716:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6720:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalJavaFXLang.g:6721:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
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
    // InternalJavaFXLang.g:6728:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__NameAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6732:1: ( ( ( rule__Binding__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:6733:1: ( ( rule__Binding__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:6733:1: ( ( rule__Binding__NameAssignment_2 ) )
            // InternalJavaFXLang.g:6734:2: ( rule__Binding__NameAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:6735:2: ( rule__Binding__NameAssignment_2 )
            // InternalJavaFXLang.g:6735:3: rule__Binding__NameAssignment_2
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
    // InternalJavaFXLang.g:6743:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6747:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalJavaFXLang.g:6748:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalJavaFXLang.g:6755:1: rule__Binding__Group__3__Impl : ( '{' ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6759:1: ( ( '{' ) )
            // InternalJavaFXLang.g:6760:1: ( '{' )
            {
            // InternalJavaFXLang.g:6760:1: ( '{' )
            // InternalJavaFXLang.g:6761:2: '{'
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
    // InternalJavaFXLang.g:6770:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl rule__Binding__Group__5 ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6774:1: ( rule__Binding__Group__4__Impl rule__Binding__Group__5 )
            // InternalJavaFXLang.g:6775:2: rule__Binding__Group__4__Impl rule__Binding__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalJavaFXLang.g:6782:1: rule__Binding__Group__4__Impl : ( ( rule__Binding__Group_4__0 )? ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6786:1: ( ( ( rule__Binding__Group_4__0 )? ) )
            // InternalJavaFXLang.g:6787:1: ( ( rule__Binding__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:6787:1: ( ( rule__Binding__Group_4__0 )? )
            // InternalJavaFXLang.g:6788:2: ( rule__Binding__Group_4__0 )?
            {
             before(grammarAccess.getBindingAccess().getGroup_4()); 
            // InternalJavaFXLang.g:6789:2: ( rule__Binding__Group_4__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=19 && LA64_0<=25)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalJavaFXLang.g:6789:3: rule__Binding__Group_4__0
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
    // InternalJavaFXLang.g:6797:1: rule__Binding__Group__5 : rule__Binding__Group__5__Impl ;
    public final void rule__Binding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6801:1: ( rule__Binding__Group__5__Impl )
            // InternalJavaFXLang.g:6802:2: rule__Binding__Group__5__Impl
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
    // InternalJavaFXLang.g:6808:1: rule__Binding__Group__5__Impl : ( '}' ) ;
    public final void rule__Binding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6812:1: ( ( '}' ) )
            // InternalJavaFXLang.g:6813:1: ( '}' )
            {
            // InternalJavaFXLang.g:6813:1: ( '}' )
            // InternalJavaFXLang.g:6814:2: '}'
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
    // InternalJavaFXLang.g:6824:1: rule__Binding__Group_4__0 : rule__Binding__Group_4__0__Impl rule__Binding__Group_4__1 ;
    public final void rule__Binding__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6828:1: ( rule__Binding__Group_4__0__Impl rule__Binding__Group_4__1 )
            // InternalJavaFXLang.g:6829:2: rule__Binding__Group_4__0__Impl rule__Binding__Group_4__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalJavaFXLang.g:6836:1: rule__Binding__Group_4__0__Impl : ( ( rule__Binding__PropertyAssignment_4_0 ) ) ;
    public final void rule__Binding__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6840:1: ( ( ( rule__Binding__PropertyAssignment_4_0 ) ) )
            // InternalJavaFXLang.g:6841:1: ( ( rule__Binding__PropertyAssignment_4_0 ) )
            {
            // InternalJavaFXLang.g:6841:1: ( ( rule__Binding__PropertyAssignment_4_0 ) )
            // InternalJavaFXLang.g:6842:2: ( rule__Binding__PropertyAssignment_4_0 )
            {
             before(grammarAccess.getBindingAccess().getPropertyAssignment_4_0()); 
            // InternalJavaFXLang.g:6843:2: ( rule__Binding__PropertyAssignment_4_0 )
            // InternalJavaFXLang.g:6843:3: rule__Binding__PropertyAssignment_4_0
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
    // InternalJavaFXLang.g:6851:1: rule__Binding__Group_4__1 : rule__Binding__Group_4__1__Impl ;
    public final void rule__Binding__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6855:1: ( rule__Binding__Group_4__1__Impl )
            // InternalJavaFXLang.g:6856:2: rule__Binding__Group_4__1__Impl
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
    // InternalJavaFXLang.g:6862:1: rule__Binding__Group_4__1__Impl : ( ( rule__Binding__PropertyAssignment_4_1 )* ) ;
    public final void rule__Binding__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6866:1: ( ( ( rule__Binding__PropertyAssignment_4_1 )* ) )
            // InternalJavaFXLang.g:6867:1: ( ( rule__Binding__PropertyAssignment_4_1 )* )
            {
            // InternalJavaFXLang.g:6867:1: ( ( rule__Binding__PropertyAssignment_4_1 )* )
            // InternalJavaFXLang.g:6868:2: ( rule__Binding__PropertyAssignment_4_1 )*
            {
             before(grammarAccess.getBindingAccess().getPropertyAssignment_4_1()); 
            // InternalJavaFXLang.g:6869:2: ( rule__Binding__PropertyAssignment_4_1 )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=19 && LA65_0<=25)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalJavaFXLang.g:6869:3: rule__Binding__PropertyAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Binding__PropertyAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
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
    // InternalJavaFXLang.g:6878:1: rule__BindingProperty__Group__0 : rule__BindingProperty__Group__0__Impl rule__BindingProperty__Group__1 ;
    public final void rule__BindingProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6882:1: ( rule__BindingProperty__Group__0__Impl rule__BindingProperty__Group__1 )
            // InternalJavaFXLang.g:6883:2: rule__BindingProperty__Group__0__Impl rule__BindingProperty__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalJavaFXLang.g:6890:1: rule__BindingProperty__Group__0__Impl : ( () ) ;
    public final void rule__BindingProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6894:1: ( ( () ) )
            // InternalJavaFXLang.g:6895:1: ( () )
            {
            // InternalJavaFXLang.g:6895:1: ( () )
            // InternalJavaFXLang.g:6896:2: ()
            {
             before(grammarAccess.getBindingPropertyAccess().getBindingPropertyAction_0()); 
            // InternalJavaFXLang.g:6897:2: ()
            // InternalJavaFXLang.g:6897:3: 
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
    // InternalJavaFXLang.g:6905:1: rule__BindingProperty__Group__1 : rule__BindingProperty__Group__1__Impl rule__BindingProperty__Group__2 ;
    public final void rule__BindingProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6909:1: ( rule__BindingProperty__Group__1__Impl rule__BindingProperty__Group__2 )
            // InternalJavaFXLang.g:6910:2: rule__BindingProperty__Group__1__Impl rule__BindingProperty__Group__2
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
    // InternalJavaFXLang.g:6917:1: rule__BindingProperty__Group__1__Impl : ( ( rule__BindingProperty__TypeAssignment_1 ) ) ;
    public final void rule__BindingProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6921:1: ( ( ( rule__BindingProperty__TypeAssignment_1 ) ) )
            // InternalJavaFXLang.g:6922:1: ( ( rule__BindingProperty__TypeAssignment_1 ) )
            {
            // InternalJavaFXLang.g:6922:1: ( ( rule__BindingProperty__TypeAssignment_1 ) )
            // InternalJavaFXLang.g:6923:2: ( rule__BindingProperty__TypeAssignment_1 )
            {
             before(grammarAccess.getBindingPropertyAccess().getTypeAssignment_1()); 
            // InternalJavaFXLang.g:6924:2: ( rule__BindingProperty__TypeAssignment_1 )
            // InternalJavaFXLang.g:6924:3: rule__BindingProperty__TypeAssignment_1
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
    // InternalJavaFXLang.g:6932:1: rule__BindingProperty__Group__2 : rule__BindingProperty__Group__2__Impl ;
    public final void rule__BindingProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6936:1: ( rule__BindingProperty__Group__2__Impl )
            // InternalJavaFXLang.g:6937:2: rule__BindingProperty__Group__2__Impl
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
    // InternalJavaFXLang.g:6943:1: rule__BindingProperty__Group__2__Impl : ( ( rule__BindingProperty__NameAssignment_2 ) ) ;
    public final void rule__BindingProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6947:1: ( ( ( rule__BindingProperty__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:6948:1: ( ( rule__BindingProperty__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:6948:1: ( ( rule__BindingProperty__NameAssignment_2 ) )
            // InternalJavaFXLang.g:6949:2: ( rule__BindingProperty__NameAssignment_2 )
            {
             before(grammarAccess.getBindingPropertyAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:6950:2: ( rule__BindingProperty__NameAssignment_2 )
            // InternalJavaFXLang.g:6950:3: rule__BindingProperty__NameAssignment_2
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
    // InternalJavaFXLang.g:6959:1: rule__FilteredTableViewFX__Group__0 : rule__FilteredTableViewFX__Group__0__Impl rule__FilteredTableViewFX__Group__1 ;
    public final void rule__FilteredTableViewFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6963:1: ( rule__FilteredTableViewFX__Group__0__Impl rule__FilteredTableViewFX__Group__1 )
            // InternalJavaFXLang.g:6964:2: rule__FilteredTableViewFX__Group__0__Impl rule__FilteredTableViewFX__Group__1
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
    // InternalJavaFXLang.g:6971:1: rule__FilteredTableViewFX__Group__0__Impl : ( () ) ;
    public final void rule__FilteredTableViewFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6975:1: ( ( () ) )
            // InternalJavaFXLang.g:6976:1: ( () )
            {
            // InternalJavaFXLang.g:6976:1: ( () )
            // InternalJavaFXLang.g:6977:2: ()
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getFilteredTableViewFXAction_0()); 
            // InternalJavaFXLang.g:6978:2: ()
            // InternalJavaFXLang.g:6978:3: 
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
    // InternalJavaFXLang.g:6986:1: rule__FilteredTableViewFX__Group__1 : rule__FilteredTableViewFX__Group__1__Impl rule__FilteredTableViewFX__Group__2 ;
    public final void rule__FilteredTableViewFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:6990:1: ( rule__FilteredTableViewFX__Group__1__Impl rule__FilteredTableViewFX__Group__2 )
            // InternalJavaFXLang.g:6991:2: rule__FilteredTableViewFX__Group__1__Impl rule__FilteredTableViewFX__Group__2
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
    // InternalJavaFXLang.g:6998:1: rule__FilteredTableViewFX__Group__1__Impl : ( 'FilteredTableView' ) ;
    public final void rule__FilteredTableViewFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7002:1: ( ( 'FilteredTableView' ) )
            // InternalJavaFXLang.g:7003:1: ( 'FilteredTableView' )
            {
            // InternalJavaFXLang.g:7003:1: ( 'FilteredTableView' )
            // InternalJavaFXLang.g:7004:2: 'FilteredTableView'
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getFilteredTableViewKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalJavaFXLang.g:7013:1: rule__FilteredTableViewFX__Group__2 : rule__FilteredTableViewFX__Group__2__Impl rule__FilteredTableViewFX__Group__3 ;
    public final void rule__FilteredTableViewFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7017:1: ( rule__FilteredTableViewFX__Group__2__Impl rule__FilteredTableViewFX__Group__3 )
            // InternalJavaFXLang.g:7018:2: rule__FilteredTableViewFX__Group__2__Impl rule__FilteredTableViewFX__Group__3
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
    // InternalJavaFXLang.g:7025:1: rule__FilteredTableViewFX__Group__2__Impl : ( '{' ) ;
    public final void rule__FilteredTableViewFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7029:1: ( ( '{' ) )
            // InternalJavaFXLang.g:7030:1: ( '{' )
            {
            // InternalJavaFXLang.g:7030:1: ( '{' )
            // InternalJavaFXLang.g:7031:2: '{'
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
    // InternalJavaFXLang.g:7040:1: rule__FilteredTableViewFX__Group__3 : rule__FilteredTableViewFX__Group__3__Impl rule__FilteredTableViewFX__Group__4 ;
    public final void rule__FilteredTableViewFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7044:1: ( rule__FilteredTableViewFX__Group__3__Impl rule__FilteredTableViewFX__Group__4 )
            // InternalJavaFXLang.g:7045:2: rule__FilteredTableViewFX__Group__3__Impl rule__FilteredTableViewFX__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalJavaFXLang.g:7052:1: rule__FilteredTableViewFX__Group__3__Impl : ( ( rule__FilteredTableViewFX__Group_3__0 ) ) ;
    public final void rule__FilteredTableViewFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7056:1: ( ( ( rule__FilteredTableViewFX__Group_3__0 ) ) )
            // InternalJavaFXLang.g:7057:1: ( ( rule__FilteredTableViewFX__Group_3__0 ) )
            {
            // InternalJavaFXLang.g:7057:1: ( ( rule__FilteredTableViewFX__Group_3__0 ) )
            // InternalJavaFXLang.g:7058:2: ( rule__FilteredTableViewFX__Group_3__0 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup_3()); 
            // InternalJavaFXLang.g:7059:2: ( rule__FilteredTableViewFX__Group_3__0 )
            // InternalJavaFXLang.g:7059:3: rule__FilteredTableViewFX__Group_3__0
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
    // InternalJavaFXLang.g:7067:1: rule__FilteredTableViewFX__Group__4 : rule__FilteredTableViewFX__Group__4__Impl rule__FilteredTableViewFX__Group__5 ;
    public final void rule__FilteredTableViewFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7071:1: ( rule__FilteredTableViewFX__Group__4__Impl rule__FilteredTableViewFX__Group__5 )
            // InternalJavaFXLang.g:7072:2: rule__FilteredTableViewFX__Group__4__Impl rule__FilteredTableViewFX__Group__5
            {
            pushFollow(FOLLOW_40);
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
    // InternalJavaFXLang.g:7079:1: rule__FilteredTableViewFX__Group__4__Impl : ( ( rule__FilteredTableViewFX__Group_4__0 )? ) ;
    public final void rule__FilteredTableViewFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7083:1: ( ( ( rule__FilteredTableViewFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:7084:1: ( ( rule__FilteredTableViewFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:7084:1: ( ( rule__FilteredTableViewFX__Group_4__0 )? )
            // InternalJavaFXLang.g:7085:2: ( rule__FilteredTableViewFX__Group_4__0 )?
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:7086:2: ( rule__FilteredTableViewFX__Group_4__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==56) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalJavaFXLang.g:7086:3: rule__FilteredTableViewFX__Group_4__0
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
    // InternalJavaFXLang.g:7094:1: rule__FilteredTableViewFX__Group__5 : rule__FilteredTableViewFX__Group__5__Impl rule__FilteredTableViewFX__Group__6 ;
    public final void rule__FilteredTableViewFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7098:1: ( rule__FilteredTableViewFX__Group__5__Impl rule__FilteredTableViewFX__Group__6 )
            // InternalJavaFXLang.g:7099:2: rule__FilteredTableViewFX__Group__5__Impl rule__FilteredTableViewFX__Group__6
            {
            pushFollow(FOLLOW_40);
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
    // InternalJavaFXLang.g:7106:1: rule__FilteredTableViewFX__Group__5__Impl : ( ( rule__FilteredTableViewFX__Group_5__0 )? ) ;
    public final void rule__FilteredTableViewFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7110:1: ( ( ( rule__FilteredTableViewFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:7111:1: ( ( rule__FilteredTableViewFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:7111:1: ( ( rule__FilteredTableViewFX__Group_5__0 )? )
            // InternalJavaFXLang.g:7112:2: ( rule__FilteredTableViewFX__Group_5__0 )?
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:7113:2: ( rule__FilteredTableViewFX__Group_5__0 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==57) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalJavaFXLang.g:7113:3: rule__FilteredTableViewFX__Group_5__0
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
    // InternalJavaFXLang.g:7121:1: rule__FilteredTableViewFX__Group__6 : rule__FilteredTableViewFX__Group__6__Impl rule__FilteredTableViewFX__Group__7 ;
    public final void rule__FilteredTableViewFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7125:1: ( rule__FilteredTableViewFX__Group__6__Impl rule__FilteredTableViewFX__Group__7 )
            // InternalJavaFXLang.g:7126:2: rule__FilteredTableViewFX__Group__6__Impl rule__FilteredTableViewFX__Group__7
            {
            pushFollow(FOLLOW_40);
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
    // InternalJavaFXLang.g:7133:1: rule__FilteredTableViewFX__Group__6__Impl : ( ( rule__FilteredTableViewFX__Group_6__0 )? ) ;
    public final void rule__FilteredTableViewFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7137:1: ( ( ( rule__FilteredTableViewFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:7138:1: ( ( rule__FilteredTableViewFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:7138:1: ( ( rule__FilteredTableViewFX__Group_6__0 )? )
            // InternalJavaFXLang.g:7139:2: ( rule__FilteredTableViewFX__Group_6__0 )?
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:7140:2: ( rule__FilteredTableViewFX__Group_6__0 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==61) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalJavaFXLang.g:7140:3: rule__FilteredTableViewFX__Group_6__0
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
    // InternalJavaFXLang.g:7148:1: rule__FilteredTableViewFX__Group__7 : rule__FilteredTableViewFX__Group__7__Impl ;
    public final void rule__FilteredTableViewFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7152:1: ( rule__FilteredTableViewFX__Group__7__Impl )
            // InternalJavaFXLang.g:7153:2: rule__FilteredTableViewFX__Group__7__Impl
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
    // InternalJavaFXLang.g:7159:1: rule__FilteredTableViewFX__Group__7__Impl : ( '}' ) ;
    public final void rule__FilteredTableViewFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7163:1: ( ( '}' ) )
            // InternalJavaFXLang.g:7164:1: ( '}' )
            {
            // InternalJavaFXLang.g:7164:1: ( '}' )
            // InternalJavaFXLang.g:7165:2: '}'
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
    // InternalJavaFXLang.g:7175:1: rule__FilteredTableViewFX__Group_3__0 : rule__FilteredTableViewFX__Group_3__0__Impl rule__FilteredTableViewFX__Group_3__1 ;
    public final void rule__FilteredTableViewFX__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7179:1: ( rule__FilteredTableViewFX__Group_3__0__Impl rule__FilteredTableViewFX__Group_3__1 )
            // InternalJavaFXLang.g:7180:2: rule__FilteredTableViewFX__Group_3__0__Impl rule__FilteredTableViewFX__Group_3__1
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
    // InternalJavaFXLang.g:7187:1: rule__FilteredTableViewFX__Group_3__0__Impl : ( 'name:' ) ;
    public final void rule__FilteredTableViewFX__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7191:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:7192:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:7192:1: ( 'name:' )
            // InternalJavaFXLang.g:7193:2: 'name:'
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
    // InternalJavaFXLang.g:7202:1: rule__FilteredTableViewFX__Group_3__1 : rule__FilteredTableViewFX__Group_3__1__Impl ;
    public final void rule__FilteredTableViewFX__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7206:1: ( rule__FilteredTableViewFX__Group_3__1__Impl )
            // InternalJavaFXLang.g:7207:2: rule__FilteredTableViewFX__Group_3__1__Impl
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
    // InternalJavaFXLang.g:7213:1: rule__FilteredTableViewFX__Group_3__1__Impl : ( ( rule__FilteredTableViewFX__NameAssignment_3_1 ) ) ;
    public final void rule__FilteredTableViewFX__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7217:1: ( ( ( rule__FilteredTableViewFX__NameAssignment_3_1 ) ) )
            // InternalJavaFXLang.g:7218:1: ( ( rule__FilteredTableViewFX__NameAssignment_3_1 ) )
            {
            // InternalJavaFXLang.g:7218:1: ( ( rule__FilteredTableViewFX__NameAssignment_3_1 ) )
            // InternalJavaFXLang.g:7219:2: ( rule__FilteredTableViewFX__NameAssignment_3_1 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getNameAssignment_3_1()); 
            // InternalJavaFXLang.g:7220:2: ( rule__FilteredTableViewFX__NameAssignment_3_1 )
            // InternalJavaFXLang.g:7220:3: rule__FilteredTableViewFX__NameAssignment_3_1
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
    // InternalJavaFXLang.g:7229:1: rule__FilteredTableViewFX__Group_4__0 : rule__FilteredTableViewFX__Group_4__0__Impl rule__FilteredTableViewFX__Group_4__1 ;
    public final void rule__FilteredTableViewFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7233:1: ( rule__FilteredTableViewFX__Group_4__0__Impl rule__FilteredTableViewFX__Group_4__1 )
            // InternalJavaFXLang.g:7234:2: rule__FilteredTableViewFX__Group_4__0__Impl rule__FilteredTableViewFX__Group_4__1
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
    // InternalJavaFXLang.g:7241:1: rule__FilteredTableViewFX__Group_4__0__Impl : ( 'usedModel:' ) ;
    public final void rule__FilteredTableViewFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7245:1: ( ( 'usedModel:' ) )
            // InternalJavaFXLang.g:7246:1: ( 'usedModel:' )
            {
            // InternalJavaFXLang.g:7246:1: ( 'usedModel:' )
            // InternalJavaFXLang.g:7247:2: 'usedModel:'
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUsedModelKeyword_4_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalJavaFXLang.g:7256:1: rule__FilteredTableViewFX__Group_4__1 : rule__FilteredTableViewFX__Group_4__1__Impl ;
    public final void rule__FilteredTableViewFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7260:1: ( rule__FilteredTableViewFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:7261:2: rule__FilteredTableViewFX__Group_4__1__Impl
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
    // InternalJavaFXLang.g:7267:1: rule__FilteredTableViewFX__Group_4__1__Impl : ( ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 ) ) ;
    public final void rule__FilteredTableViewFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7271:1: ( ( ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:7272:1: ( ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:7272:1: ( ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 ) )
            // InternalJavaFXLang.g:7273:2: ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUsedModelAssignment_4_1()); 
            // InternalJavaFXLang.g:7274:2: ( rule__FilteredTableViewFX__UsedModelAssignment_4_1 )
            // InternalJavaFXLang.g:7274:3: rule__FilteredTableViewFX__UsedModelAssignment_4_1
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
    // InternalJavaFXLang.g:7283:1: rule__FilteredTableViewFX__Group_5__0 : rule__FilteredTableViewFX__Group_5__0__Impl rule__FilteredTableViewFX__Group_5__1 ;
    public final void rule__FilteredTableViewFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7287:1: ( rule__FilteredTableViewFX__Group_5__0__Impl rule__FilteredTableViewFX__Group_5__1 )
            // InternalJavaFXLang.g:7288:2: rule__FilteredTableViewFX__Group_5__0__Impl rule__FilteredTableViewFX__Group_5__1
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
    // InternalJavaFXLang.g:7295:1: rule__FilteredTableViewFX__Group_5__0__Impl : ( 'usedFilter:' ) ;
    public final void rule__FilteredTableViewFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7299:1: ( ( 'usedFilter:' ) )
            // InternalJavaFXLang.g:7300:1: ( 'usedFilter:' )
            {
            // InternalJavaFXLang.g:7300:1: ( 'usedFilter:' )
            // InternalJavaFXLang.g:7301:2: 'usedFilter:'
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUsedFilterKeyword_5_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalJavaFXLang.g:7310:1: rule__FilteredTableViewFX__Group_5__1 : rule__FilteredTableViewFX__Group_5__1__Impl ;
    public final void rule__FilteredTableViewFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7314:1: ( rule__FilteredTableViewFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:7315:2: rule__FilteredTableViewFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:7321:1: rule__FilteredTableViewFX__Group_5__1__Impl : ( ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 ) ) ;
    public final void rule__FilteredTableViewFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7325:1: ( ( ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:7326:1: ( ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:7326:1: ( ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 ) )
            // InternalJavaFXLang.g:7327:2: ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUseFilterAssignment_5_1()); 
            // InternalJavaFXLang.g:7328:2: ( rule__FilteredTableViewFX__UseFilterAssignment_5_1 )
            // InternalJavaFXLang.g:7328:3: rule__FilteredTableViewFX__UseFilterAssignment_5_1
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
    // InternalJavaFXLang.g:7337:1: rule__FilteredTableViewFX__Group_6__0 : rule__FilteredTableViewFX__Group_6__0__Impl rule__FilteredTableViewFX__Group_6__1 ;
    public final void rule__FilteredTableViewFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7341:1: ( rule__FilteredTableViewFX__Group_6__0__Impl rule__FilteredTableViewFX__Group_6__1 )
            // InternalJavaFXLang.g:7342:2: rule__FilteredTableViewFX__Group_6__0__Impl rule__FilteredTableViewFX__Group_6__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalJavaFXLang.g:7349:1: rule__FilteredTableViewFX__Group_6__0__Impl : ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 ) ) ;
    public final void rule__FilteredTableViewFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7353:1: ( ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 ) ) )
            // InternalJavaFXLang.g:7354:1: ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 ) )
            {
            // InternalJavaFXLang.g:7354:1: ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 ) )
            // InternalJavaFXLang.g:7355:2: ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getColumnsAssignment_6_0()); 
            // InternalJavaFXLang.g:7356:2: ( rule__FilteredTableViewFX__ColumnsAssignment_6_0 )
            // InternalJavaFXLang.g:7356:3: rule__FilteredTableViewFX__ColumnsAssignment_6_0
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
    // InternalJavaFXLang.g:7364:1: rule__FilteredTableViewFX__Group_6__1 : rule__FilteredTableViewFX__Group_6__1__Impl ;
    public final void rule__FilteredTableViewFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7368:1: ( rule__FilteredTableViewFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:7369:2: rule__FilteredTableViewFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:7375:1: rule__FilteredTableViewFX__Group_6__1__Impl : ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )* ) ;
    public final void rule__FilteredTableViewFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7379:1: ( ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )* ) )
            // InternalJavaFXLang.g:7380:1: ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )* )
            {
            // InternalJavaFXLang.g:7380:1: ( ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )* )
            // InternalJavaFXLang.g:7381:2: ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )*
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getColumnsAssignment_6_1()); 
            // InternalJavaFXLang.g:7382:2: ( rule__FilteredTableViewFX__ColumnsAssignment_6_1 )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==61) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalJavaFXLang.g:7382:3: rule__FilteredTableViewFX__ColumnsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__FilteredTableViewFX__ColumnsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop69;
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
    // InternalJavaFXLang.g:7391:1: rule__DerivedBean__Group__0 : rule__DerivedBean__Group__0__Impl rule__DerivedBean__Group__1 ;
    public final void rule__DerivedBean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7395:1: ( rule__DerivedBean__Group__0__Impl rule__DerivedBean__Group__1 )
            // InternalJavaFXLang.g:7396:2: rule__DerivedBean__Group__0__Impl rule__DerivedBean__Group__1
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
    // InternalJavaFXLang.g:7403:1: rule__DerivedBean__Group__0__Impl : ( () ) ;
    public final void rule__DerivedBean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7407:1: ( ( () ) )
            // InternalJavaFXLang.g:7408:1: ( () )
            {
            // InternalJavaFXLang.g:7408:1: ( () )
            // InternalJavaFXLang.g:7409:2: ()
            {
             before(grammarAccess.getDerivedBeanAccess().getDerivedBeanAction_0()); 
            // InternalJavaFXLang.g:7410:2: ()
            // InternalJavaFXLang.g:7410:3: 
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
    // InternalJavaFXLang.g:7418:1: rule__DerivedBean__Group__1 : rule__DerivedBean__Group__1__Impl rule__DerivedBean__Group__2 ;
    public final void rule__DerivedBean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7422:1: ( rule__DerivedBean__Group__1__Impl rule__DerivedBean__Group__2 )
            // InternalJavaFXLang.g:7423:2: rule__DerivedBean__Group__1__Impl rule__DerivedBean__Group__2
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
    // InternalJavaFXLang.g:7430:1: rule__DerivedBean__Group__1__Impl : ( 'class' ) ;
    public final void rule__DerivedBean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7434:1: ( ( 'class' ) )
            // InternalJavaFXLang.g:7435:1: ( 'class' )
            {
            // InternalJavaFXLang.g:7435:1: ( 'class' )
            // InternalJavaFXLang.g:7436:2: 'class'
            {
             before(grammarAccess.getDerivedBeanAccess().getClassKeyword_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJavaFXLang.g:7445:1: rule__DerivedBean__Group__2 : rule__DerivedBean__Group__2__Impl rule__DerivedBean__Group__3 ;
    public final void rule__DerivedBean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7449:1: ( rule__DerivedBean__Group__2__Impl rule__DerivedBean__Group__3 )
            // InternalJavaFXLang.g:7450:2: rule__DerivedBean__Group__2__Impl rule__DerivedBean__Group__3
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
    // InternalJavaFXLang.g:7457:1: rule__DerivedBean__Group__2__Impl : ( ( rule__DerivedBean__NameAssignment_2 ) ) ;
    public final void rule__DerivedBean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7461:1: ( ( ( rule__DerivedBean__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:7462:1: ( ( rule__DerivedBean__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:7462:1: ( ( rule__DerivedBean__NameAssignment_2 ) )
            // InternalJavaFXLang.g:7463:2: ( rule__DerivedBean__NameAssignment_2 )
            {
             before(grammarAccess.getDerivedBeanAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:7464:2: ( rule__DerivedBean__NameAssignment_2 )
            // InternalJavaFXLang.g:7464:3: rule__DerivedBean__NameAssignment_2
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
    // InternalJavaFXLang.g:7472:1: rule__DerivedBean__Group__3 : rule__DerivedBean__Group__3__Impl rule__DerivedBean__Group__4 ;
    public final void rule__DerivedBean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7476:1: ( rule__DerivedBean__Group__3__Impl rule__DerivedBean__Group__4 )
            // InternalJavaFXLang.g:7477:2: rule__DerivedBean__Group__3__Impl rule__DerivedBean__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalJavaFXLang.g:7484:1: rule__DerivedBean__Group__3__Impl : ( '{' ) ;
    public final void rule__DerivedBean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7488:1: ( ( '{' ) )
            // InternalJavaFXLang.g:7489:1: ( '{' )
            {
            // InternalJavaFXLang.g:7489:1: ( '{' )
            // InternalJavaFXLang.g:7490:2: '{'
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
    // InternalJavaFXLang.g:7499:1: rule__DerivedBean__Group__4 : rule__DerivedBean__Group__4__Impl rule__DerivedBean__Group__5 ;
    public final void rule__DerivedBean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7503:1: ( rule__DerivedBean__Group__4__Impl rule__DerivedBean__Group__5 )
            // InternalJavaFXLang.g:7504:2: rule__DerivedBean__Group__4__Impl rule__DerivedBean__Group__5
            {
            pushFollow(FOLLOW_44);
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
    // InternalJavaFXLang.g:7511:1: rule__DerivedBean__Group__4__Impl : ( ( rule__DerivedBean__Group_4__0 ) ) ;
    public final void rule__DerivedBean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7515:1: ( ( ( rule__DerivedBean__Group_4__0 ) ) )
            // InternalJavaFXLang.g:7516:1: ( ( rule__DerivedBean__Group_4__0 ) )
            {
            // InternalJavaFXLang.g:7516:1: ( ( rule__DerivedBean__Group_4__0 ) )
            // InternalJavaFXLang.g:7517:2: ( rule__DerivedBean__Group_4__0 )
            {
             before(grammarAccess.getDerivedBeanAccess().getGroup_4()); 
            // InternalJavaFXLang.g:7518:2: ( rule__DerivedBean__Group_4__0 )
            // InternalJavaFXLang.g:7518:3: rule__DerivedBean__Group_4__0
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
    // InternalJavaFXLang.g:7526:1: rule__DerivedBean__Group__5 : rule__DerivedBean__Group__5__Impl rule__DerivedBean__Group__6 ;
    public final void rule__DerivedBean__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7530:1: ( rule__DerivedBean__Group__5__Impl rule__DerivedBean__Group__6 )
            // InternalJavaFXLang.g:7531:2: rule__DerivedBean__Group__5__Impl rule__DerivedBean__Group__6
            {
            pushFollow(FOLLOW_44);
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
    // InternalJavaFXLang.g:7538:1: rule__DerivedBean__Group__5__Impl : ( ( rule__DerivedBean__Group_5__0 )? ) ;
    public final void rule__DerivedBean__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7542:1: ( ( ( rule__DerivedBean__Group_5__0 )? ) )
            // InternalJavaFXLang.g:7543:1: ( ( rule__DerivedBean__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:7543:1: ( ( rule__DerivedBean__Group_5__0 )? )
            // InternalJavaFXLang.g:7544:2: ( rule__DerivedBean__Group_5__0 )?
            {
             before(grammarAccess.getDerivedBeanAccess().getGroup_5()); 
            // InternalJavaFXLang.g:7545:2: ( rule__DerivedBean__Group_5__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=RULE_STRING && LA70_0<=RULE_ID)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalJavaFXLang.g:7545:3: rule__DerivedBean__Group_5__0
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
    // InternalJavaFXLang.g:7553:1: rule__DerivedBean__Group__6 : rule__DerivedBean__Group__6__Impl ;
    public final void rule__DerivedBean__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7557:1: ( rule__DerivedBean__Group__6__Impl )
            // InternalJavaFXLang.g:7558:2: rule__DerivedBean__Group__6__Impl
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
    // InternalJavaFXLang.g:7564:1: rule__DerivedBean__Group__6__Impl : ( '}' ) ;
    public final void rule__DerivedBean__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7568:1: ( ( '}' ) )
            // InternalJavaFXLang.g:7569:1: ( '}' )
            {
            // InternalJavaFXLang.g:7569:1: ( '}' )
            // InternalJavaFXLang.g:7570:2: '}'
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
    // InternalJavaFXLang.g:7580:1: rule__DerivedBean__Group_4__0 : rule__DerivedBean__Group_4__0__Impl rule__DerivedBean__Group_4__1 ;
    public final void rule__DerivedBean__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7584:1: ( rule__DerivedBean__Group_4__0__Impl rule__DerivedBean__Group_4__1 )
            // InternalJavaFXLang.g:7585:2: rule__DerivedBean__Group_4__0__Impl rule__DerivedBean__Group_4__1
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
    // InternalJavaFXLang.g:7592:1: rule__DerivedBean__Group_4__0__Impl : ( 'instanceType:' ) ;
    public final void rule__DerivedBean__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7596:1: ( ( 'instanceType:' ) )
            // InternalJavaFXLang.g:7597:1: ( 'instanceType:' )
            {
            // InternalJavaFXLang.g:7597:1: ( 'instanceType:' )
            // InternalJavaFXLang.g:7598:2: 'instanceType:'
            {
             before(grammarAccess.getDerivedBeanAccess().getInstanceTypeKeyword_4_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalJavaFXLang.g:7607:1: rule__DerivedBean__Group_4__1 : rule__DerivedBean__Group_4__1__Impl ;
    public final void rule__DerivedBean__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7611:1: ( rule__DerivedBean__Group_4__1__Impl )
            // InternalJavaFXLang.g:7612:2: rule__DerivedBean__Group_4__1__Impl
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
    // InternalJavaFXLang.g:7618:1: rule__DerivedBean__Group_4__1__Impl : ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) ) ;
    public final void rule__DerivedBean__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7622:1: ( ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:7623:1: ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:7623:1: ( ( rule__DerivedBean__InstanceTypeAssignment_4_1 ) )
            // InternalJavaFXLang.g:7624:2: ( rule__DerivedBean__InstanceTypeAssignment_4_1 )
            {
             before(grammarAccess.getDerivedBeanAccess().getInstanceTypeAssignment_4_1()); 
            // InternalJavaFXLang.g:7625:2: ( rule__DerivedBean__InstanceTypeAssignment_4_1 )
            // InternalJavaFXLang.g:7625:3: rule__DerivedBean__InstanceTypeAssignment_4_1
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
    // InternalJavaFXLang.g:7634:1: rule__DerivedBean__Group_5__0 : rule__DerivedBean__Group_5__0__Impl rule__DerivedBean__Group_5__1 ;
    public final void rule__DerivedBean__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7638:1: ( rule__DerivedBean__Group_5__0__Impl rule__DerivedBean__Group_5__1 )
            // InternalJavaFXLang.g:7639:2: rule__DerivedBean__Group_5__0__Impl rule__DerivedBean__Group_5__1
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
    // InternalJavaFXLang.g:7646:1: rule__DerivedBean__Group_5__0__Impl : ( ( rule__DerivedBean__AttributesAssignment_5_0 ) ) ;
    public final void rule__DerivedBean__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7650:1: ( ( ( rule__DerivedBean__AttributesAssignment_5_0 ) ) )
            // InternalJavaFXLang.g:7651:1: ( ( rule__DerivedBean__AttributesAssignment_5_0 ) )
            {
            // InternalJavaFXLang.g:7651:1: ( ( rule__DerivedBean__AttributesAssignment_5_0 ) )
            // InternalJavaFXLang.g:7652:2: ( rule__DerivedBean__AttributesAssignment_5_0 )
            {
             before(grammarAccess.getDerivedBeanAccess().getAttributesAssignment_5_0()); 
            // InternalJavaFXLang.g:7653:2: ( rule__DerivedBean__AttributesAssignment_5_0 )
            // InternalJavaFXLang.g:7653:3: rule__DerivedBean__AttributesAssignment_5_0
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
    // InternalJavaFXLang.g:7661:1: rule__DerivedBean__Group_5__1 : rule__DerivedBean__Group_5__1__Impl ;
    public final void rule__DerivedBean__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7665:1: ( rule__DerivedBean__Group_5__1__Impl )
            // InternalJavaFXLang.g:7666:2: rule__DerivedBean__Group_5__1__Impl
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
    // InternalJavaFXLang.g:7672:1: rule__DerivedBean__Group_5__1__Impl : ( ( rule__DerivedBean__AttributesAssignment_5_1 )* ) ;
    public final void rule__DerivedBean__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7676:1: ( ( ( rule__DerivedBean__AttributesAssignment_5_1 )* ) )
            // InternalJavaFXLang.g:7677:1: ( ( rule__DerivedBean__AttributesAssignment_5_1 )* )
            {
            // InternalJavaFXLang.g:7677:1: ( ( rule__DerivedBean__AttributesAssignment_5_1 )* )
            // InternalJavaFXLang.g:7678:2: ( rule__DerivedBean__AttributesAssignment_5_1 )*
            {
             before(grammarAccess.getDerivedBeanAccess().getAttributesAssignment_5_1()); 
            // InternalJavaFXLang.g:7679:2: ( rule__DerivedBean__AttributesAssignment_5_1 )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=RULE_STRING && LA71_0<=RULE_ID)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalJavaFXLang.g:7679:3: rule__DerivedBean__AttributesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__DerivedBean__AttributesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop71;
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
    // InternalJavaFXLang.g:7688:1: rule__Bean__Group__0 : rule__Bean__Group__0__Impl rule__Bean__Group__1 ;
    public final void rule__Bean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7692:1: ( rule__Bean__Group__0__Impl rule__Bean__Group__1 )
            // InternalJavaFXLang.g:7693:2: rule__Bean__Group__0__Impl rule__Bean__Group__1
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
    // InternalJavaFXLang.g:7700:1: rule__Bean__Group__0__Impl : ( () ) ;
    public final void rule__Bean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7704:1: ( ( () ) )
            // InternalJavaFXLang.g:7705:1: ( () )
            {
            // InternalJavaFXLang.g:7705:1: ( () )
            // InternalJavaFXLang.g:7706:2: ()
            {
             before(grammarAccess.getBeanAccess().getBeanAction_0()); 
            // InternalJavaFXLang.g:7707:2: ()
            // InternalJavaFXLang.g:7707:3: 
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
    // InternalJavaFXLang.g:7715:1: rule__Bean__Group__1 : rule__Bean__Group__1__Impl rule__Bean__Group__2 ;
    public final void rule__Bean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7719:1: ( rule__Bean__Group__1__Impl rule__Bean__Group__2 )
            // InternalJavaFXLang.g:7720:2: rule__Bean__Group__1__Impl rule__Bean__Group__2
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
    // InternalJavaFXLang.g:7727:1: rule__Bean__Group__1__Impl : ( 'class' ) ;
    public final void rule__Bean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7731:1: ( ( 'class' ) )
            // InternalJavaFXLang.g:7732:1: ( 'class' )
            {
            // InternalJavaFXLang.g:7732:1: ( 'class' )
            // InternalJavaFXLang.g:7733:2: 'class'
            {
             before(grammarAccess.getBeanAccess().getClassKeyword_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJavaFXLang.g:7742:1: rule__Bean__Group__2 : rule__Bean__Group__2__Impl rule__Bean__Group__3 ;
    public final void rule__Bean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7746:1: ( rule__Bean__Group__2__Impl rule__Bean__Group__3 )
            // InternalJavaFXLang.g:7747:2: rule__Bean__Group__2__Impl rule__Bean__Group__3
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
    // InternalJavaFXLang.g:7754:1: rule__Bean__Group__2__Impl : ( ( rule__Bean__NameAssignment_2 ) ) ;
    public final void rule__Bean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7758:1: ( ( ( rule__Bean__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:7759:1: ( ( rule__Bean__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:7759:1: ( ( rule__Bean__NameAssignment_2 ) )
            // InternalJavaFXLang.g:7760:2: ( rule__Bean__NameAssignment_2 )
            {
             before(grammarAccess.getBeanAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:7761:2: ( rule__Bean__NameAssignment_2 )
            // InternalJavaFXLang.g:7761:3: rule__Bean__NameAssignment_2
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
    // InternalJavaFXLang.g:7769:1: rule__Bean__Group__3 : rule__Bean__Group__3__Impl rule__Bean__Group__4 ;
    public final void rule__Bean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7773:1: ( rule__Bean__Group__3__Impl rule__Bean__Group__4 )
            // InternalJavaFXLang.g:7774:2: rule__Bean__Group__3__Impl rule__Bean__Group__4
            {
            pushFollow(FOLLOW_44);
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
    // InternalJavaFXLang.g:7781:1: rule__Bean__Group__3__Impl : ( '{' ) ;
    public final void rule__Bean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7785:1: ( ( '{' ) )
            // InternalJavaFXLang.g:7786:1: ( '{' )
            {
            // InternalJavaFXLang.g:7786:1: ( '{' )
            // InternalJavaFXLang.g:7787:2: '{'
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
    // InternalJavaFXLang.g:7796:1: rule__Bean__Group__4 : rule__Bean__Group__4__Impl rule__Bean__Group__5 ;
    public final void rule__Bean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7800:1: ( rule__Bean__Group__4__Impl rule__Bean__Group__5 )
            // InternalJavaFXLang.g:7801:2: rule__Bean__Group__4__Impl rule__Bean__Group__5
            {
            pushFollow(FOLLOW_44);
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
    // InternalJavaFXLang.g:7808:1: rule__Bean__Group__4__Impl : ( ( rule__Bean__Group_4__0 )? ) ;
    public final void rule__Bean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7812:1: ( ( ( rule__Bean__Group_4__0 )? ) )
            // InternalJavaFXLang.g:7813:1: ( ( rule__Bean__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:7813:1: ( ( rule__Bean__Group_4__0 )? )
            // InternalJavaFXLang.g:7814:2: ( rule__Bean__Group_4__0 )?
            {
             before(grammarAccess.getBeanAccess().getGroup_4()); 
            // InternalJavaFXLang.g:7815:2: ( rule__Bean__Group_4__0 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=RULE_STRING && LA72_0<=RULE_ID)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalJavaFXLang.g:7815:3: rule__Bean__Group_4__0
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
    // InternalJavaFXLang.g:7823:1: rule__Bean__Group__5 : rule__Bean__Group__5__Impl ;
    public final void rule__Bean__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7827:1: ( rule__Bean__Group__5__Impl )
            // InternalJavaFXLang.g:7828:2: rule__Bean__Group__5__Impl
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
    // InternalJavaFXLang.g:7834:1: rule__Bean__Group__5__Impl : ( '}' ) ;
    public final void rule__Bean__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7838:1: ( ( '}' ) )
            // InternalJavaFXLang.g:7839:1: ( '}' )
            {
            // InternalJavaFXLang.g:7839:1: ( '}' )
            // InternalJavaFXLang.g:7840:2: '}'
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
    // InternalJavaFXLang.g:7850:1: rule__Bean__Group_4__0 : rule__Bean__Group_4__0__Impl rule__Bean__Group_4__1 ;
    public final void rule__Bean__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7854:1: ( rule__Bean__Group_4__0__Impl rule__Bean__Group_4__1 )
            // InternalJavaFXLang.g:7855:2: rule__Bean__Group_4__0__Impl rule__Bean__Group_4__1
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
    // InternalJavaFXLang.g:7862:1: rule__Bean__Group_4__0__Impl : ( ( rule__Bean__AttributesAssignment_4_0 ) ) ;
    public final void rule__Bean__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7866:1: ( ( ( rule__Bean__AttributesAssignment_4_0 ) ) )
            // InternalJavaFXLang.g:7867:1: ( ( rule__Bean__AttributesAssignment_4_0 ) )
            {
            // InternalJavaFXLang.g:7867:1: ( ( rule__Bean__AttributesAssignment_4_0 ) )
            // InternalJavaFXLang.g:7868:2: ( rule__Bean__AttributesAssignment_4_0 )
            {
             before(grammarAccess.getBeanAccess().getAttributesAssignment_4_0()); 
            // InternalJavaFXLang.g:7869:2: ( rule__Bean__AttributesAssignment_4_0 )
            // InternalJavaFXLang.g:7869:3: rule__Bean__AttributesAssignment_4_0
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
    // InternalJavaFXLang.g:7877:1: rule__Bean__Group_4__1 : rule__Bean__Group_4__1__Impl ;
    public final void rule__Bean__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7881:1: ( rule__Bean__Group_4__1__Impl )
            // InternalJavaFXLang.g:7882:2: rule__Bean__Group_4__1__Impl
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
    // InternalJavaFXLang.g:7888:1: rule__Bean__Group_4__1__Impl : ( ( rule__Bean__AttributesAssignment_4_1 )* ) ;
    public final void rule__Bean__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7892:1: ( ( ( rule__Bean__AttributesAssignment_4_1 )* ) )
            // InternalJavaFXLang.g:7893:1: ( ( rule__Bean__AttributesAssignment_4_1 )* )
            {
            // InternalJavaFXLang.g:7893:1: ( ( rule__Bean__AttributesAssignment_4_1 )* )
            // InternalJavaFXLang.g:7894:2: ( rule__Bean__AttributesAssignment_4_1 )*
            {
             before(grammarAccess.getBeanAccess().getAttributesAssignment_4_1()); 
            // InternalJavaFXLang.g:7895:2: ( rule__Bean__AttributesAssignment_4_1 )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( ((LA73_0>=RULE_STRING && LA73_0<=RULE_ID)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalJavaFXLang.g:7895:3: rule__Bean__AttributesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__Bean__AttributesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop73;
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
    // InternalJavaFXLang.g:7904:1: rule__TableViewFX__Group__0 : rule__TableViewFX__Group__0__Impl rule__TableViewFX__Group__1 ;
    public final void rule__TableViewFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7908:1: ( rule__TableViewFX__Group__0__Impl rule__TableViewFX__Group__1 )
            // InternalJavaFXLang.g:7909:2: rule__TableViewFX__Group__0__Impl rule__TableViewFX__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalJavaFXLang.g:7916:1: rule__TableViewFX__Group__0__Impl : ( () ) ;
    public final void rule__TableViewFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7920:1: ( ( () ) )
            // InternalJavaFXLang.g:7921:1: ( () )
            {
            // InternalJavaFXLang.g:7921:1: ( () )
            // InternalJavaFXLang.g:7922:2: ()
            {
             before(grammarAccess.getTableViewFXAccess().getTableViewFXAction_0()); 
            // InternalJavaFXLang.g:7923:2: ()
            // InternalJavaFXLang.g:7923:3: 
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
    // InternalJavaFXLang.g:7931:1: rule__TableViewFX__Group__1 : rule__TableViewFX__Group__1__Impl rule__TableViewFX__Group__2 ;
    public final void rule__TableViewFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7935:1: ( rule__TableViewFX__Group__1__Impl rule__TableViewFX__Group__2 )
            // InternalJavaFXLang.g:7936:2: rule__TableViewFX__Group__1__Impl rule__TableViewFX__Group__2
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
    // InternalJavaFXLang.g:7943:1: rule__TableViewFX__Group__1__Impl : ( 'TableView' ) ;
    public final void rule__TableViewFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7947:1: ( ( 'TableView' ) )
            // InternalJavaFXLang.g:7948:1: ( 'TableView' )
            {
            // InternalJavaFXLang.g:7948:1: ( 'TableView' )
            // InternalJavaFXLang.g:7949:2: 'TableView'
            {
             before(grammarAccess.getTableViewFXAccess().getTableViewKeyword_1()); 
            match(input,60,FOLLOW_2); 
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
    // InternalJavaFXLang.g:7958:1: rule__TableViewFX__Group__2 : rule__TableViewFX__Group__2__Impl rule__TableViewFX__Group__3 ;
    public final void rule__TableViewFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7962:1: ( rule__TableViewFX__Group__2__Impl rule__TableViewFX__Group__3 )
            // InternalJavaFXLang.g:7963:2: rule__TableViewFX__Group__2__Impl rule__TableViewFX__Group__3
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
    // InternalJavaFXLang.g:7970:1: rule__TableViewFX__Group__2__Impl : ( '{' ) ;
    public final void rule__TableViewFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7974:1: ( ( '{' ) )
            // InternalJavaFXLang.g:7975:1: ( '{' )
            {
            // InternalJavaFXLang.g:7975:1: ( '{' )
            // InternalJavaFXLang.g:7976:2: '{'
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
    // InternalJavaFXLang.g:7985:1: rule__TableViewFX__Group__3 : rule__TableViewFX__Group__3__Impl rule__TableViewFX__Group__4 ;
    public final void rule__TableViewFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:7989:1: ( rule__TableViewFX__Group__3__Impl rule__TableViewFX__Group__4 )
            // InternalJavaFXLang.g:7990:2: rule__TableViewFX__Group__3__Impl rule__TableViewFX__Group__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalJavaFXLang.g:7997:1: rule__TableViewFX__Group__3__Impl : ( ( rule__TableViewFX__Group_3__0 ) ) ;
    public final void rule__TableViewFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8001:1: ( ( ( rule__TableViewFX__Group_3__0 ) ) )
            // InternalJavaFXLang.g:8002:1: ( ( rule__TableViewFX__Group_3__0 ) )
            {
            // InternalJavaFXLang.g:8002:1: ( ( rule__TableViewFX__Group_3__0 ) )
            // InternalJavaFXLang.g:8003:2: ( rule__TableViewFX__Group_3__0 )
            {
             before(grammarAccess.getTableViewFXAccess().getGroup_3()); 
            // InternalJavaFXLang.g:8004:2: ( rule__TableViewFX__Group_3__0 )
            // InternalJavaFXLang.g:8004:3: rule__TableViewFX__Group_3__0
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
    // InternalJavaFXLang.g:8012:1: rule__TableViewFX__Group__4 : rule__TableViewFX__Group__4__Impl rule__TableViewFX__Group__5 ;
    public final void rule__TableViewFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8016:1: ( rule__TableViewFX__Group__4__Impl rule__TableViewFX__Group__5 )
            // InternalJavaFXLang.g:8017:2: rule__TableViewFX__Group__4__Impl rule__TableViewFX__Group__5
            {
            pushFollow(FOLLOW_47);
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
    // InternalJavaFXLang.g:8024:1: rule__TableViewFX__Group__4__Impl : ( ( rule__TableViewFX__Group_4__0 )? ) ;
    public final void rule__TableViewFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8028:1: ( ( ( rule__TableViewFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:8029:1: ( ( rule__TableViewFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:8029:1: ( ( rule__TableViewFX__Group_4__0 )? )
            // InternalJavaFXLang.g:8030:2: ( rule__TableViewFX__Group_4__0 )?
            {
             before(grammarAccess.getTableViewFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:8031:2: ( rule__TableViewFX__Group_4__0 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==56) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalJavaFXLang.g:8031:3: rule__TableViewFX__Group_4__0
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
    // InternalJavaFXLang.g:8039:1: rule__TableViewFX__Group__5 : rule__TableViewFX__Group__5__Impl rule__TableViewFX__Group__6 ;
    public final void rule__TableViewFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8043:1: ( rule__TableViewFX__Group__5__Impl rule__TableViewFX__Group__6 )
            // InternalJavaFXLang.g:8044:2: rule__TableViewFX__Group__5__Impl rule__TableViewFX__Group__6
            {
            pushFollow(FOLLOW_47);
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
    // InternalJavaFXLang.g:8051:1: rule__TableViewFX__Group__5__Impl : ( ( rule__TableViewFX__Group_5__0 )? ) ;
    public final void rule__TableViewFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8055:1: ( ( ( rule__TableViewFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:8056:1: ( ( rule__TableViewFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:8056:1: ( ( rule__TableViewFX__Group_5__0 )? )
            // InternalJavaFXLang.g:8057:2: ( rule__TableViewFX__Group_5__0 )?
            {
             before(grammarAccess.getTableViewFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:8058:2: ( rule__TableViewFX__Group_5__0 )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==61) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalJavaFXLang.g:8058:3: rule__TableViewFX__Group_5__0
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
    // InternalJavaFXLang.g:8066:1: rule__TableViewFX__Group__6 : rule__TableViewFX__Group__6__Impl ;
    public final void rule__TableViewFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8070:1: ( rule__TableViewFX__Group__6__Impl )
            // InternalJavaFXLang.g:8071:2: rule__TableViewFX__Group__6__Impl
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
    // InternalJavaFXLang.g:8077:1: rule__TableViewFX__Group__6__Impl : ( '}' ) ;
    public final void rule__TableViewFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8081:1: ( ( '}' ) )
            // InternalJavaFXLang.g:8082:1: ( '}' )
            {
            // InternalJavaFXLang.g:8082:1: ( '}' )
            // InternalJavaFXLang.g:8083:2: '}'
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
    // InternalJavaFXLang.g:8093:1: rule__TableViewFX__Group_3__0 : rule__TableViewFX__Group_3__0__Impl rule__TableViewFX__Group_3__1 ;
    public final void rule__TableViewFX__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8097:1: ( rule__TableViewFX__Group_3__0__Impl rule__TableViewFX__Group_3__1 )
            // InternalJavaFXLang.g:8098:2: rule__TableViewFX__Group_3__0__Impl rule__TableViewFX__Group_3__1
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
    // InternalJavaFXLang.g:8105:1: rule__TableViewFX__Group_3__0__Impl : ( 'name:' ) ;
    public final void rule__TableViewFX__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8109:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:8110:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:8110:1: ( 'name:' )
            // InternalJavaFXLang.g:8111:2: 'name:'
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
    // InternalJavaFXLang.g:8120:1: rule__TableViewFX__Group_3__1 : rule__TableViewFX__Group_3__1__Impl ;
    public final void rule__TableViewFX__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8124:1: ( rule__TableViewFX__Group_3__1__Impl )
            // InternalJavaFXLang.g:8125:2: rule__TableViewFX__Group_3__1__Impl
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
    // InternalJavaFXLang.g:8131:1: rule__TableViewFX__Group_3__1__Impl : ( ( rule__TableViewFX__NameAssignment_3_1 ) ) ;
    public final void rule__TableViewFX__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8135:1: ( ( ( rule__TableViewFX__NameAssignment_3_1 ) ) )
            // InternalJavaFXLang.g:8136:1: ( ( rule__TableViewFX__NameAssignment_3_1 ) )
            {
            // InternalJavaFXLang.g:8136:1: ( ( rule__TableViewFX__NameAssignment_3_1 ) )
            // InternalJavaFXLang.g:8137:2: ( rule__TableViewFX__NameAssignment_3_1 )
            {
             before(grammarAccess.getTableViewFXAccess().getNameAssignment_3_1()); 
            // InternalJavaFXLang.g:8138:2: ( rule__TableViewFX__NameAssignment_3_1 )
            // InternalJavaFXLang.g:8138:3: rule__TableViewFX__NameAssignment_3_1
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
    // InternalJavaFXLang.g:8147:1: rule__TableViewFX__Group_4__0 : rule__TableViewFX__Group_4__0__Impl rule__TableViewFX__Group_4__1 ;
    public final void rule__TableViewFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8151:1: ( rule__TableViewFX__Group_4__0__Impl rule__TableViewFX__Group_4__1 )
            // InternalJavaFXLang.g:8152:2: rule__TableViewFX__Group_4__0__Impl rule__TableViewFX__Group_4__1
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
    // InternalJavaFXLang.g:8159:1: rule__TableViewFX__Group_4__0__Impl : ( 'usedModel:' ) ;
    public final void rule__TableViewFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8163:1: ( ( 'usedModel:' ) )
            // InternalJavaFXLang.g:8164:1: ( 'usedModel:' )
            {
            // InternalJavaFXLang.g:8164:1: ( 'usedModel:' )
            // InternalJavaFXLang.g:8165:2: 'usedModel:'
            {
             before(grammarAccess.getTableViewFXAccess().getUsedModelKeyword_4_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8174:1: rule__TableViewFX__Group_4__1 : rule__TableViewFX__Group_4__1__Impl ;
    public final void rule__TableViewFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8178:1: ( rule__TableViewFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:8179:2: rule__TableViewFX__Group_4__1__Impl
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
    // InternalJavaFXLang.g:8185:1: rule__TableViewFX__Group_4__1__Impl : ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) ) ;
    public final void rule__TableViewFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8189:1: ( ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:8190:1: ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:8190:1: ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) )
            // InternalJavaFXLang.g:8191:2: ( rule__TableViewFX__UsedModelAssignment_4_1 )
            {
             before(grammarAccess.getTableViewFXAccess().getUsedModelAssignment_4_1()); 
            // InternalJavaFXLang.g:8192:2: ( rule__TableViewFX__UsedModelAssignment_4_1 )
            // InternalJavaFXLang.g:8192:3: rule__TableViewFX__UsedModelAssignment_4_1
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
    // InternalJavaFXLang.g:8201:1: rule__TableViewFX__Group_5__0 : rule__TableViewFX__Group_5__0__Impl rule__TableViewFX__Group_5__1 ;
    public final void rule__TableViewFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8205:1: ( rule__TableViewFX__Group_5__0__Impl rule__TableViewFX__Group_5__1 )
            // InternalJavaFXLang.g:8206:2: rule__TableViewFX__Group_5__0__Impl rule__TableViewFX__Group_5__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalJavaFXLang.g:8213:1: rule__TableViewFX__Group_5__0__Impl : ( ( rule__TableViewFX__ColumnsAssignment_5_0 ) ) ;
    public final void rule__TableViewFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8217:1: ( ( ( rule__TableViewFX__ColumnsAssignment_5_0 ) ) )
            // InternalJavaFXLang.g:8218:1: ( ( rule__TableViewFX__ColumnsAssignment_5_0 ) )
            {
            // InternalJavaFXLang.g:8218:1: ( ( rule__TableViewFX__ColumnsAssignment_5_0 ) )
            // InternalJavaFXLang.g:8219:2: ( rule__TableViewFX__ColumnsAssignment_5_0 )
            {
             before(grammarAccess.getTableViewFXAccess().getColumnsAssignment_5_0()); 
            // InternalJavaFXLang.g:8220:2: ( rule__TableViewFX__ColumnsAssignment_5_0 )
            // InternalJavaFXLang.g:8220:3: rule__TableViewFX__ColumnsAssignment_5_0
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
    // InternalJavaFXLang.g:8228:1: rule__TableViewFX__Group_5__1 : rule__TableViewFX__Group_5__1__Impl ;
    public final void rule__TableViewFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8232:1: ( rule__TableViewFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:8233:2: rule__TableViewFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:8239:1: rule__TableViewFX__Group_5__1__Impl : ( ( rule__TableViewFX__ColumnsAssignment_5_1 )* ) ;
    public final void rule__TableViewFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8243:1: ( ( ( rule__TableViewFX__ColumnsAssignment_5_1 )* ) )
            // InternalJavaFXLang.g:8244:1: ( ( rule__TableViewFX__ColumnsAssignment_5_1 )* )
            {
            // InternalJavaFXLang.g:8244:1: ( ( rule__TableViewFX__ColumnsAssignment_5_1 )* )
            // InternalJavaFXLang.g:8245:2: ( rule__TableViewFX__ColumnsAssignment_5_1 )*
            {
             before(grammarAccess.getTableViewFXAccess().getColumnsAssignment_5_1()); 
            // InternalJavaFXLang.g:8246:2: ( rule__TableViewFX__ColumnsAssignment_5_1 )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==61) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalJavaFXLang.g:8246:3: rule__TableViewFX__ColumnsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__TableViewFX__ColumnsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop76;
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
    // InternalJavaFXLang.g:8255:1: rule__TableColumnFX__Group__0 : rule__TableColumnFX__Group__0__Impl rule__TableColumnFX__Group__1 ;
    public final void rule__TableColumnFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8259:1: ( rule__TableColumnFX__Group__0__Impl rule__TableColumnFX__Group__1 )
            // InternalJavaFXLang.g:8260:2: rule__TableColumnFX__Group__0__Impl rule__TableColumnFX__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalJavaFXLang.g:8267:1: rule__TableColumnFX__Group__0__Impl : ( () ) ;
    public final void rule__TableColumnFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8271:1: ( ( () ) )
            // InternalJavaFXLang.g:8272:1: ( () )
            {
            // InternalJavaFXLang.g:8272:1: ( () )
            // InternalJavaFXLang.g:8273:2: ()
            {
             before(grammarAccess.getTableColumnFXAccess().getTableColumnFXAction_0()); 
            // InternalJavaFXLang.g:8274:2: ()
            // InternalJavaFXLang.g:8274:3: 
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
    // InternalJavaFXLang.g:8282:1: rule__TableColumnFX__Group__1 : rule__TableColumnFX__Group__1__Impl rule__TableColumnFX__Group__2 ;
    public final void rule__TableColumnFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8286:1: ( rule__TableColumnFX__Group__1__Impl rule__TableColumnFX__Group__2 )
            // InternalJavaFXLang.g:8287:2: rule__TableColumnFX__Group__1__Impl rule__TableColumnFX__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalJavaFXLang.g:8294:1: rule__TableColumnFX__Group__1__Impl : ( 'Column' ) ;
    public final void rule__TableColumnFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8298:1: ( ( 'Column' ) )
            // InternalJavaFXLang.g:8299:1: ( 'Column' )
            {
            // InternalJavaFXLang.g:8299:1: ( 'Column' )
            // InternalJavaFXLang.g:8300:2: 'Column'
            {
             before(grammarAccess.getTableColumnFXAccess().getColumnKeyword_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8309:1: rule__TableColumnFX__Group__2 : rule__TableColumnFX__Group__2__Impl rule__TableColumnFX__Group__3 ;
    public final void rule__TableColumnFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8313:1: ( rule__TableColumnFX__Group__2__Impl rule__TableColumnFX__Group__3 )
            // InternalJavaFXLang.g:8314:2: rule__TableColumnFX__Group__2__Impl rule__TableColumnFX__Group__3
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
    // InternalJavaFXLang.g:8321:1: rule__TableColumnFX__Group__2__Impl : ( '(' ) ;
    public final void rule__TableColumnFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8325:1: ( ( '(' ) )
            // InternalJavaFXLang.g:8326:1: ( '(' )
            {
            // InternalJavaFXLang.g:8326:1: ( '(' )
            // InternalJavaFXLang.g:8327:2: '('
            {
             before(grammarAccess.getTableColumnFXAccess().getLeftParenthesisKeyword_2()); 
            match(input,51,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8336:1: rule__TableColumnFX__Group__3 : rule__TableColumnFX__Group__3__Impl rule__TableColumnFX__Group__4 ;
    public final void rule__TableColumnFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8340:1: ( rule__TableColumnFX__Group__3__Impl rule__TableColumnFX__Group__4 )
            // InternalJavaFXLang.g:8341:2: rule__TableColumnFX__Group__3__Impl rule__TableColumnFX__Group__4
            {
            pushFollow(FOLLOW_48);
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
    // InternalJavaFXLang.g:8348:1: rule__TableColumnFX__Group__3__Impl : ( ( rule__TableColumnFX__Group_3__0 ) ) ;
    public final void rule__TableColumnFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8352:1: ( ( ( rule__TableColumnFX__Group_3__0 ) ) )
            // InternalJavaFXLang.g:8353:1: ( ( rule__TableColumnFX__Group_3__0 ) )
            {
            // InternalJavaFXLang.g:8353:1: ( ( rule__TableColumnFX__Group_3__0 ) )
            // InternalJavaFXLang.g:8354:2: ( rule__TableColumnFX__Group_3__0 )
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_3()); 
            // InternalJavaFXLang.g:8355:2: ( rule__TableColumnFX__Group_3__0 )
            // InternalJavaFXLang.g:8355:3: rule__TableColumnFX__Group_3__0
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
    // InternalJavaFXLang.g:8363:1: rule__TableColumnFX__Group__4 : rule__TableColumnFX__Group__4__Impl rule__TableColumnFX__Group__5 ;
    public final void rule__TableColumnFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8367:1: ( rule__TableColumnFX__Group__4__Impl rule__TableColumnFX__Group__5 )
            // InternalJavaFXLang.g:8368:2: rule__TableColumnFX__Group__4__Impl rule__TableColumnFX__Group__5
            {
            pushFollow(FOLLOW_48);
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
    // InternalJavaFXLang.g:8375:1: rule__TableColumnFX__Group__4__Impl : ( ( rule__TableColumnFX__Group_4__0 )? ) ;
    public final void rule__TableColumnFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8379:1: ( ( ( rule__TableColumnFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:8380:1: ( ( rule__TableColumnFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:8380:1: ( ( rule__TableColumnFX__Group_4__0 )? )
            // InternalJavaFXLang.g:8381:2: ( rule__TableColumnFX__Group_4__0 )?
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:8382:2: ( rule__TableColumnFX__Group_4__0 )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==62) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalJavaFXLang.g:8382:3: rule__TableColumnFX__Group_4__0
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
    // InternalJavaFXLang.g:8390:1: rule__TableColumnFX__Group__5 : rule__TableColumnFX__Group__5__Impl rule__TableColumnFX__Group__6 ;
    public final void rule__TableColumnFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8394:1: ( rule__TableColumnFX__Group__5__Impl rule__TableColumnFX__Group__6 )
            // InternalJavaFXLang.g:8395:2: rule__TableColumnFX__Group__5__Impl rule__TableColumnFX__Group__6
            {
            pushFollow(FOLLOW_48);
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
    // InternalJavaFXLang.g:8402:1: rule__TableColumnFX__Group__5__Impl : ( ( rule__TableColumnFX__Group_5__0 )? ) ;
    public final void rule__TableColumnFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8406:1: ( ( ( rule__TableColumnFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:8407:1: ( ( rule__TableColumnFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:8407:1: ( ( rule__TableColumnFX__Group_5__0 )? )
            // InternalJavaFXLang.g:8408:2: ( rule__TableColumnFX__Group_5__0 )?
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:8409:2: ( rule__TableColumnFX__Group_5__0 )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==63) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalJavaFXLang.g:8409:3: rule__TableColumnFX__Group_5__0
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
    // InternalJavaFXLang.g:8417:1: rule__TableColumnFX__Group__6 : rule__TableColumnFX__Group__6__Impl rule__TableColumnFX__Group__7 ;
    public final void rule__TableColumnFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8421:1: ( rule__TableColumnFX__Group__6__Impl rule__TableColumnFX__Group__7 )
            // InternalJavaFXLang.g:8422:2: rule__TableColumnFX__Group__6__Impl rule__TableColumnFX__Group__7
            {
            pushFollow(FOLLOW_48);
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
    // InternalJavaFXLang.g:8429:1: rule__TableColumnFX__Group__6__Impl : ( ( rule__TableColumnFX__Group_6__0 )? ) ;
    public final void rule__TableColumnFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8433:1: ( ( ( rule__TableColumnFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:8434:1: ( ( rule__TableColumnFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:8434:1: ( ( rule__TableColumnFX__Group_6__0 )? )
            // InternalJavaFXLang.g:8435:2: ( rule__TableColumnFX__Group_6__0 )?
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:8436:2: ( rule__TableColumnFX__Group_6__0 )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==64) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalJavaFXLang.g:8436:3: rule__TableColumnFX__Group_6__0
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
    // InternalJavaFXLang.g:8444:1: rule__TableColumnFX__Group__7 : rule__TableColumnFX__Group__7__Impl ;
    public final void rule__TableColumnFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8448:1: ( rule__TableColumnFX__Group__7__Impl )
            // InternalJavaFXLang.g:8449:2: rule__TableColumnFX__Group__7__Impl
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
    // InternalJavaFXLang.g:8455:1: rule__TableColumnFX__Group__7__Impl : ( ')' ) ;
    public final void rule__TableColumnFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8459:1: ( ( ')' ) )
            // InternalJavaFXLang.g:8460:1: ( ')' )
            {
            // InternalJavaFXLang.g:8460:1: ( ')' )
            // InternalJavaFXLang.g:8461:2: ')'
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
    // InternalJavaFXLang.g:8471:1: rule__TableColumnFX__Group_3__0 : rule__TableColumnFX__Group_3__0__Impl rule__TableColumnFX__Group_3__1 ;
    public final void rule__TableColumnFX__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8475:1: ( rule__TableColumnFX__Group_3__0__Impl rule__TableColumnFX__Group_3__1 )
            // InternalJavaFXLang.g:8476:2: rule__TableColumnFX__Group_3__0__Impl rule__TableColumnFX__Group_3__1
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
    // InternalJavaFXLang.g:8483:1: rule__TableColumnFX__Group_3__0__Impl : ( 'name:' ) ;
    public final void rule__TableColumnFX__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8487:1: ( ( 'name:' ) )
            // InternalJavaFXLang.g:8488:1: ( 'name:' )
            {
            // InternalJavaFXLang.g:8488:1: ( 'name:' )
            // InternalJavaFXLang.g:8489:2: 'name:'
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
    // InternalJavaFXLang.g:8498:1: rule__TableColumnFX__Group_3__1 : rule__TableColumnFX__Group_3__1__Impl ;
    public final void rule__TableColumnFX__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8502:1: ( rule__TableColumnFX__Group_3__1__Impl )
            // InternalJavaFXLang.g:8503:2: rule__TableColumnFX__Group_3__1__Impl
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
    // InternalJavaFXLang.g:8509:1: rule__TableColumnFX__Group_3__1__Impl : ( ( rule__TableColumnFX__NameAssignment_3_1 ) ) ;
    public final void rule__TableColumnFX__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8513:1: ( ( ( rule__TableColumnFX__NameAssignment_3_1 ) ) )
            // InternalJavaFXLang.g:8514:1: ( ( rule__TableColumnFX__NameAssignment_3_1 ) )
            {
            // InternalJavaFXLang.g:8514:1: ( ( rule__TableColumnFX__NameAssignment_3_1 ) )
            // InternalJavaFXLang.g:8515:2: ( rule__TableColumnFX__NameAssignment_3_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getNameAssignment_3_1()); 
            // InternalJavaFXLang.g:8516:2: ( rule__TableColumnFX__NameAssignment_3_1 )
            // InternalJavaFXLang.g:8516:3: rule__TableColumnFX__NameAssignment_3_1
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
    // InternalJavaFXLang.g:8525:1: rule__TableColumnFX__Group_4__0 : rule__TableColumnFX__Group_4__0__Impl rule__TableColumnFX__Group_4__1 ;
    public final void rule__TableColumnFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8529:1: ( rule__TableColumnFX__Group_4__0__Impl rule__TableColumnFX__Group_4__1 )
            // InternalJavaFXLang.g:8530:2: rule__TableColumnFX__Group_4__0__Impl rule__TableColumnFX__Group_4__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalJavaFXLang.g:8537:1: rule__TableColumnFX__Group_4__0__Impl : ( 'width:' ) ;
    public final void rule__TableColumnFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8541:1: ( ( 'width:' ) )
            // InternalJavaFXLang.g:8542:1: ( 'width:' )
            {
            // InternalJavaFXLang.g:8542:1: ( 'width:' )
            // InternalJavaFXLang.g:8543:2: 'width:'
            {
             before(grammarAccess.getTableColumnFXAccess().getWidthKeyword_4_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8552:1: rule__TableColumnFX__Group_4__1 : rule__TableColumnFX__Group_4__1__Impl ;
    public final void rule__TableColumnFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8556:1: ( rule__TableColumnFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:8557:2: rule__TableColumnFX__Group_4__1__Impl
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
    // InternalJavaFXLang.g:8563:1: rule__TableColumnFX__Group_4__1__Impl : ( ( rule__TableColumnFX__WidthAssignment_4_1 ) ) ;
    public final void rule__TableColumnFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8567:1: ( ( ( rule__TableColumnFX__WidthAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:8568:1: ( ( rule__TableColumnFX__WidthAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:8568:1: ( ( rule__TableColumnFX__WidthAssignment_4_1 ) )
            // InternalJavaFXLang.g:8569:2: ( rule__TableColumnFX__WidthAssignment_4_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getWidthAssignment_4_1()); 
            // InternalJavaFXLang.g:8570:2: ( rule__TableColumnFX__WidthAssignment_4_1 )
            // InternalJavaFXLang.g:8570:3: rule__TableColumnFX__WidthAssignment_4_1
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
    // InternalJavaFXLang.g:8579:1: rule__TableColumnFX__Group_5__0 : rule__TableColumnFX__Group_5__0__Impl rule__TableColumnFX__Group_5__1 ;
    public final void rule__TableColumnFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8583:1: ( rule__TableColumnFX__Group_5__0__Impl rule__TableColumnFX__Group_5__1 )
            // InternalJavaFXLang.g:8584:2: rule__TableColumnFX__Group_5__0__Impl rule__TableColumnFX__Group_5__1
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
    // InternalJavaFXLang.g:8591:1: rule__TableColumnFX__Group_5__0__Impl : ( 'attribute:' ) ;
    public final void rule__TableColumnFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8595:1: ( ( 'attribute:' ) )
            // InternalJavaFXLang.g:8596:1: ( 'attribute:' )
            {
            // InternalJavaFXLang.g:8596:1: ( 'attribute:' )
            // InternalJavaFXLang.g:8597:2: 'attribute:'
            {
             before(grammarAccess.getTableColumnFXAccess().getAttributeKeyword_5_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8606:1: rule__TableColumnFX__Group_5__1 : rule__TableColumnFX__Group_5__1__Impl ;
    public final void rule__TableColumnFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8610:1: ( rule__TableColumnFX__Group_5__1__Impl )
            // InternalJavaFXLang.g:8611:2: rule__TableColumnFX__Group_5__1__Impl
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
    // InternalJavaFXLang.g:8617:1: rule__TableColumnFX__Group_5__1__Impl : ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) ) ;
    public final void rule__TableColumnFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8621:1: ( ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) ) )
            // InternalJavaFXLang.g:8622:1: ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) )
            {
            // InternalJavaFXLang.g:8622:1: ( ( rule__TableColumnFX__UsedAttributeAssignment_5_1 ) )
            // InternalJavaFXLang.g:8623:2: ( rule__TableColumnFX__UsedAttributeAssignment_5_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getUsedAttributeAssignment_5_1()); 
            // InternalJavaFXLang.g:8624:2: ( rule__TableColumnFX__UsedAttributeAssignment_5_1 )
            // InternalJavaFXLang.g:8624:3: rule__TableColumnFX__UsedAttributeAssignment_5_1
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
    // InternalJavaFXLang.g:8633:1: rule__TableColumnFX__Group_6__0 : rule__TableColumnFX__Group_6__0__Impl rule__TableColumnFX__Group_6__1 ;
    public final void rule__TableColumnFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8637:1: ( rule__TableColumnFX__Group_6__0__Impl rule__TableColumnFX__Group_6__1 )
            // InternalJavaFXLang.g:8638:2: rule__TableColumnFX__Group_6__0__Impl rule__TableColumnFX__Group_6__1
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
    // InternalJavaFXLang.g:8645:1: rule__TableColumnFX__Group_6__0__Impl : ( 'useFilter:' ) ;
    public final void rule__TableColumnFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8649:1: ( ( 'useFilter:' ) )
            // InternalJavaFXLang.g:8650:1: ( 'useFilter:' )
            {
            // InternalJavaFXLang.g:8650:1: ( 'useFilter:' )
            // InternalJavaFXLang.g:8651:2: 'useFilter:'
            {
             before(grammarAccess.getTableColumnFXAccess().getUseFilterKeyword_6_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalJavaFXLang.g:8660:1: rule__TableColumnFX__Group_6__1 : rule__TableColumnFX__Group_6__1__Impl ;
    public final void rule__TableColumnFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8664:1: ( rule__TableColumnFX__Group_6__1__Impl )
            // InternalJavaFXLang.g:8665:2: rule__TableColumnFX__Group_6__1__Impl
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
    // InternalJavaFXLang.g:8671:1: rule__TableColumnFX__Group_6__1__Impl : ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) ) ;
    public final void rule__TableColumnFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8675:1: ( ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) ) )
            // InternalJavaFXLang.g:8676:1: ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) )
            {
            // InternalJavaFXLang.g:8676:1: ( ( rule__TableColumnFX__UseFilterAssignment_6_1 ) )
            // InternalJavaFXLang.g:8677:2: ( rule__TableColumnFX__UseFilterAssignment_6_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getUseFilterAssignment_6_1()); 
            // InternalJavaFXLang.g:8678:2: ( rule__TableColumnFX__UseFilterAssignment_6_1 )
            // InternalJavaFXLang.g:8678:3: rule__TableColumnFX__UseFilterAssignment_6_1
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
    // InternalJavaFXLang.g:8687:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8691:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalJavaFXLang.g:8692:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalJavaFXLang.g:8699:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8703:1: ( ( ( '-' )? ) )
            // InternalJavaFXLang.g:8704:1: ( ( '-' )? )
            {
            // InternalJavaFXLang.g:8704:1: ( ( '-' )? )
            // InternalJavaFXLang.g:8705:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalJavaFXLang.g:8706:2: ( '-' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==65) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalJavaFXLang.g:8706:3: '-'
                    {
                    match(input,65,FOLLOW_2); 

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
    // InternalJavaFXLang.g:8714:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8718:1: ( rule__EInt__Group__1__Impl )
            // InternalJavaFXLang.g:8719:2: rule__EInt__Group__1__Impl
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
    // InternalJavaFXLang.g:8725:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8729:1: ( ( RULE_INT ) )
            // InternalJavaFXLang.g:8730:1: ( RULE_INT )
            {
            // InternalJavaFXLang.g:8730:1: ( RULE_INT )
            // InternalJavaFXLang.g:8731:2: RULE_INT
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
    // InternalJavaFXLang.g:8741:1: rule__AttributeFX__Group__0 : rule__AttributeFX__Group__0__Impl rule__AttributeFX__Group__1 ;
    public final void rule__AttributeFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8745:1: ( rule__AttributeFX__Group__0__Impl rule__AttributeFX__Group__1 )
            // InternalJavaFXLang.g:8746:2: rule__AttributeFX__Group__0__Impl rule__AttributeFX__Group__1
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
    // InternalJavaFXLang.g:8753:1: rule__AttributeFX__Group__0__Impl : ( () ) ;
    public final void rule__AttributeFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8757:1: ( ( () ) )
            // InternalJavaFXLang.g:8758:1: ( () )
            {
            // InternalJavaFXLang.g:8758:1: ( () )
            // InternalJavaFXLang.g:8759:2: ()
            {
             before(grammarAccess.getAttributeFXAccess().getAttributeFXAction_0()); 
            // InternalJavaFXLang.g:8760:2: ()
            // InternalJavaFXLang.g:8760:3: 
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
    // InternalJavaFXLang.g:8768:1: rule__AttributeFX__Group__1 : rule__AttributeFX__Group__1__Impl rule__AttributeFX__Group__2 ;
    public final void rule__AttributeFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8772:1: ( rule__AttributeFX__Group__1__Impl rule__AttributeFX__Group__2 )
            // InternalJavaFXLang.g:8773:2: rule__AttributeFX__Group__1__Impl rule__AttributeFX__Group__2
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
    // InternalJavaFXLang.g:8780:1: rule__AttributeFX__Group__1__Impl : ( ( rule__AttributeFX__TypeAssignment_1 ) ) ;
    public final void rule__AttributeFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8784:1: ( ( ( rule__AttributeFX__TypeAssignment_1 ) ) )
            // InternalJavaFXLang.g:8785:1: ( ( rule__AttributeFX__TypeAssignment_1 ) )
            {
            // InternalJavaFXLang.g:8785:1: ( ( rule__AttributeFX__TypeAssignment_1 ) )
            // InternalJavaFXLang.g:8786:2: ( rule__AttributeFX__TypeAssignment_1 )
            {
             before(grammarAccess.getAttributeFXAccess().getTypeAssignment_1()); 
            // InternalJavaFXLang.g:8787:2: ( rule__AttributeFX__TypeAssignment_1 )
            // InternalJavaFXLang.g:8787:3: rule__AttributeFX__TypeAssignment_1
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
    // InternalJavaFXLang.g:8795:1: rule__AttributeFX__Group__2 : rule__AttributeFX__Group__2__Impl ;
    public final void rule__AttributeFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8799:1: ( rule__AttributeFX__Group__2__Impl )
            // InternalJavaFXLang.g:8800:2: rule__AttributeFX__Group__2__Impl
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
    // InternalJavaFXLang.g:8806:1: rule__AttributeFX__Group__2__Impl : ( ( rule__AttributeFX__NameAssignment_2 ) ) ;
    public final void rule__AttributeFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8810:1: ( ( ( rule__AttributeFX__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:8811:1: ( ( rule__AttributeFX__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:8811:1: ( ( rule__AttributeFX__NameAssignment_2 ) )
            // InternalJavaFXLang.g:8812:2: ( rule__AttributeFX__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeFXAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:8813:2: ( rule__AttributeFX__NameAssignment_2 )
            // InternalJavaFXLang.g:8813:3: rule__AttributeFX__NameAssignment_2
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
    // InternalJavaFXLang.g:8822:1: rule__ProjectFX__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ProjectFX__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8826:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:8827:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:8827:2: ( ruleEString )
            // InternalJavaFXLang.g:8828:3: ruleEString
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
    // InternalJavaFXLang.g:8837:1: rule__ProjectFX__PackagePathAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ProjectFX__PackagePathAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8841:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:8842:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:8842:2: ( ruleEString )
            // InternalJavaFXLang.g:8843:3: ruleEString
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
    // InternalJavaFXLang.g:8852:1: rule__ProjectFX__ControlsAssignment_5_2 : ( ruleControlFX ) ;
    public final void rule__ProjectFX__ControlsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8856:1: ( ( ruleControlFX ) )
            // InternalJavaFXLang.g:8857:2: ( ruleControlFX )
            {
            // InternalJavaFXLang.g:8857:2: ( ruleControlFX )
            // InternalJavaFXLang.g:8858:3: ruleControlFX
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
    // InternalJavaFXLang.g:8867:1: rule__ProjectFX__ControlsAssignment_5_3 : ( ruleControlFX ) ;
    public final void rule__ProjectFX__ControlsAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8871:1: ( ( ruleControlFX ) )
            // InternalJavaFXLang.g:8872:2: ( ruleControlFX )
            {
            // InternalJavaFXLang.g:8872:2: ( ruleControlFX )
            // InternalJavaFXLang.g:8873:3: ruleControlFX
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
    // InternalJavaFXLang.g:8882:1: rule__ProjectFX__ModelsAssignment_6_2 : ( ruleModelFX ) ;
    public final void rule__ProjectFX__ModelsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8886:1: ( ( ruleModelFX ) )
            // InternalJavaFXLang.g:8887:2: ( ruleModelFX )
            {
            // InternalJavaFXLang.g:8887:2: ( ruleModelFX )
            // InternalJavaFXLang.g:8888:3: ruleModelFX
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
    // InternalJavaFXLang.g:8897:1: rule__ProjectFX__ModelsAssignment_6_3 : ( ruleModelFX ) ;
    public final void rule__ProjectFX__ModelsAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8901:1: ( ( ruleModelFX ) )
            // InternalJavaFXLang.g:8902:2: ( ruleModelFX )
            {
            // InternalJavaFXLang.g:8902:2: ( ruleModelFX )
            // InternalJavaFXLang.g:8903:3: ruleModelFX
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
    // InternalJavaFXLang.g:8912:1: rule__ProjectFX__BindingsAssignment_7_2 : ( ruleBinding ) ;
    public final void rule__ProjectFX__BindingsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8916:1: ( ( ruleBinding ) )
            // InternalJavaFXLang.g:8917:2: ( ruleBinding )
            {
            // InternalJavaFXLang.g:8917:2: ( ruleBinding )
            // InternalJavaFXLang.g:8918:3: ruleBinding
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
    // InternalJavaFXLang.g:8927:1: rule__ProjectFX__BindingsAssignment_7_3 : ( ruleBinding ) ;
    public final void rule__ProjectFX__BindingsAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8931:1: ( ( ruleBinding ) )
            // InternalJavaFXLang.g:8932:2: ( ruleBinding )
            {
            // InternalJavaFXLang.g:8932:2: ( ruleBinding )
            // InternalJavaFXLang.g:8933:3: ruleBinding
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
    // InternalJavaFXLang.g:8942:1: rule__ProjectFX__ChartsAssignment_8_2 : ( ruleChartFX ) ;
    public final void rule__ProjectFX__ChartsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8946:1: ( ( ruleChartFX ) )
            // InternalJavaFXLang.g:8947:2: ( ruleChartFX )
            {
            // InternalJavaFXLang.g:8947:2: ( ruleChartFX )
            // InternalJavaFXLang.g:8948:3: ruleChartFX
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
    // InternalJavaFXLang.g:8957:1: rule__ProjectFX__ChartsAssignment_8_3 : ( ruleChartFX ) ;
    public final void rule__ProjectFX__ChartsAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8961:1: ( ( ruleChartFX ) )
            // InternalJavaFXLang.g:8962:2: ( ruleChartFX )
            {
            // InternalJavaFXLang.g:8962:2: ( ruleChartFX )
            // InternalJavaFXLang.g:8963:3: ruleChartFX
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
    // InternalJavaFXLang.g:8972:1: rule__BarChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__BarChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8976:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:8977:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:8977:2: ( ruleEString )
            // InternalJavaFXLang.g:8978:3: ruleEString
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
    // InternalJavaFXLang.g:8987:1: rule__BarChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__BarChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:8991:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:8992:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:8992:2: ( ruleOrientation )
            // InternalJavaFXLang.g:8993:3: ruleOrientation
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
    // InternalJavaFXLang.g:9002:1: rule__BarChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__BarChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9006:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:9007:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:9007:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:9008:3: ruleEBoolean
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
    // InternalJavaFXLang.g:9017:1: rule__BarChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__BarChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9021:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9022:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9022:2: ( ruleEString )
            // InternalJavaFXLang.g:9023:3: ruleEString
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
    // InternalJavaFXLang.g:9032:1: rule__BarChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__BarChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9036:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9037:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9037:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9038:3: ruleOrientation
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
    // InternalJavaFXLang.g:9047:1: rule__BarChartFX__XAxisLabelAssignment_9_1 : ( ruleEString ) ;
    public final void rule__BarChartFX__XAxisLabelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9051:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9052:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9052:2: ( ruleEString )
            // InternalJavaFXLang.g:9053:3: ruleEString
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
    // InternalJavaFXLang.g:9062:1: rule__BarChartFX__XAxisTypeAssignment_10_1 : ( ruleAxisType ) ;
    public final void rule__BarChartFX__XAxisTypeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9066:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9067:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9067:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9068:3: ruleAxisType
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
    // InternalJavaFXLang.g:9077:1: rule__BarChartFX__YAxisLabelAssignment_11_1 : ( ruleEString ) ;
    public final void rule__BarChartFX__YAxisLabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9081:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9082:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9082:2: ( ruleEString )
            // InternalJavaFXLang.g:9083:3: ruleEString
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
    // InternalJavaFXLang.g:9092:1: rule__BarChartFX__YAxisTypeAssignment_12_1 : ( ruleAxisType ) ;
    public final void rule__BarChartFX__YAxisTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9096:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9097:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9097:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9098:3: ruleAxisType
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
    // InternalJavaFXLang.g:9107:1: rule__ScatterChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__ScatterChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9111:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9112:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9112:2: ( ruleEString )
            // InternalJavaFXLang.g:9113:3: ruleEString
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
    // InternalJavaFXLang.g:9122:1: rule__ScatterChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__ScatterChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9126:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9127:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9127:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9128:3: ruleOrientation
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
    // InternalJavaFXLang.g:9137:1: rule__ScatterChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__ScatterChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9141:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:9142:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:9142:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:9143:3: ruleEBoolean
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
    // InternalJavaFXLang.g:9152:1: rule__ScatterChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__ScatterChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9156:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9157:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9157:2: ( ruleEString )
            // InternalJavaFXLang.g:9158:3: ruleEString
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
    // InternalJavaFXLang.g:9167:1: rule__ScatterChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__ScatterChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9171:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9172:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9172:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9173:3: ruleOrientation
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
    // InternalJavaFXLang.g:9182:1: rule__ScatterChartFX__XAxisLabelAssignment_9_1 : ( ruleEString ) ;
    public final void rule__ScatterChartFX__XAxisLabelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9186:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9187:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9187:2: ( ruleEString )
            // InternalJavaFXLang.g:9188:3: ruleEString
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
    // InternalJavaFXLang.g:9197:1: rule__ScatterChartFX__XAxisTypeAssignment_10_1 : ( ruleAxisType ) ;
    public final void rule__ScatterChartFX__XAxisTypeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9201:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9202:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9202:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9203:3: ruleAxisType
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
    // InternalJavaFXLang.g:9212:1: rule__ScatterChartFX__YAxisLabelAssignment_11_1 : ( ruleEString ) ;
    public final void rule__ScatterChartFX__YAxisLabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9216:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9217:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9217:2: ( ruleEString )
            // InternalJavaFXLang.g:9218:3: ruleEString
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
    // InternalJavaFXLang.g:9227:1: rule__ScatterChartFX__YAxisTypeAssignment_12_1 : ( ruleAxisType ) ;
    public final void rule__ScatterChartFX__YAxisTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9231:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9232:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9232:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9233:3: ruleAxisType
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
    // InternalJavaFXLang.g:9242:1: rule__BubbleChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__BubbleChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9246:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9247:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9247:2: ( ruleEString )
            // InternalJavaFXLang.g:9248:3: ruleEString
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
    // InternalJavaFXLang.g:9257:1: rule__BubbleChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__BubbleChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9261:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9262:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9262:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9263:3: ruleOrientation
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
    // InternalJavaFXLang.g:9272:1: rule__BubbleChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__BubbleChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9276:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:9277:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:9277:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:9278:3: ruleEBoolean
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
    // InternalJavaFXLang.g:9287:1: rule__BubbleChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__BubbleChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9291:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9292:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9292:2: ( ruleEString )
            // InternalJavaFXLang.g:9293:3: ruleEString
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
    // InternalJavaFXLang.g:9302:1: rule__BubbleChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__BubbleChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9306:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9307:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9307:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9308:3: ruleOrientation
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
    // InternalJavaFXLang.g:9317:1: rule__BubbleChartFX__XAxisLabelAssignment_9_1 : ( ruleEString ) ;
    public final void rule__BubbleChartFX__XAxisLabelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9321:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9322:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9322:2: ( ruleEString )
            // InternalJavaFXLang.g:9323:3: ruleEString
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
    // InternalJavaFXLang.g:9332:1: rule__BubbleChartFX__XAxisTypeAssignment_10_1 : ( ruleAxisType ) ;
    public final void rule__BubbleChartFX__XAxisTypeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9336:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9337:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9337:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9338:3: ruleAxisType
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
    // InternalJavaFXLang.g:9347:1: rule__BubbleChartFX__YAxisLabelAssignment_11_1 : ( ruleEString ) ;
    public final void rule__BubbleChartFX__YAxisLabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9351:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9352:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9352:2: ( ruleEString )
            // InternalJavaFXLang.g:9353:3: ruleEString
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
    // InternalJavaFXLang.g:9362:1: rule__BubbleChartFX__YAxisTypeAssignment_12_1 : ( ruleAxisType ) ;
    public final void rule__BubbleChartFX__YAxisTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9366:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9367:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9367:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9368:3: ruleAxisType
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
    // InternalJavaFXLang.g:9377:1: rule__AreaChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__AreaChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9381:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9382:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9382:2: ( ruleEString )
            // InternalJavaFXLang.g:9383:3: ruleEString
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
    // InternalJavaFXLang.g:9392:1: rule__AreaChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__AreaChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9396:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9397:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9397:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9398:3: ruleOrientation
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
    // InternalJavaFXLang.g:9407:1: rule__AreaChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__AreaChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9411:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:9412:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:9412:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:9413:3: ruleEBoolean
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
    // InternalJavaFXLang.g:9422:1: rule__AreaChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__AreaChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9426:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9427:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9427:2: ( ruleEString )
            // InternalJavaFXLang.g:9428:3: ruleEString
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
    // InternalJavaFXLang.g:9437:1: rule__AreaChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__AreaChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9441:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9442:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9442:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9443:3: ruleOrientation
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
    // InternalJavaFXLang.g:9452:1: rule__AreaChartFX__XAxisLabelAssignment_9_1 : ( ruleEString ) ;
    public final void rule__AreaChartFX__XAxisLabelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9456:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9457:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9457:2: ( ruleEString )
            // InternalJavaFXLang.g:9458:3: ruleEString
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
    // InternalJavaFXLang.g:9467:1: rule__AreaChartFX__XAxisTypeAssignment_10_1 : ( ruleAxisType ) ;
    public final void rule__AreaChartFX__XAxisTypeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9471:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9472:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9472:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9473:3: ruleAxisType
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
    // InternalJavaFXLang.g:9482:1: rule__AreaChartFX__YAxisLabelAssignment_11_1 : ( ruleEString ) ;
    public final void rule__AreaChartFX__YAxisLabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9486:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9487:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9487:2: ( ruleEString )
            // InternalJavaFXLang.g:9488:3: ruleEString
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
    // InternalJavaFXLang.g:9497:1: rule__AreaChartFX__YAxisTypeAssignment_12_1 : ( ruleAxisType ) ;
    public final void rule__AreaChartFX__YAxisTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9501:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9502:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9502:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9503:3: ruleAxisType
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
    // InternalJavaFXLang.g:9512:1: rule__PieChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__PieChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9516:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9517:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9517:2: ( ruleEString )
            // InternalJavaFXLang.g:9518:3: ruleEString
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
    // InternalJavaFXLang.g:9527:1: rule__PieChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__PieChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9531:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9532:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9532:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9533:3: ruleOrientation
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
    // InternalJavaFXLang.g:9542:1: rule__PieChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__PieChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9546:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:9547:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:9547:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:9548:3: ruleEBoolean
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
    // InternalJavaFXLang.g:9557:1: rule__PieChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__PieChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9561:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9562:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9562:2: ( ruleEString )
            // InternalJavaFXLang.g:9563:3: ruleEString
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
    // InternalJavaFXLang.g:9572:1: rule__PieChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__PieChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9576:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9577:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9577:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9578:3: ruleOrientation
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
    // InternalJavaFXLang.g:9587:1: rule__LineChartFX__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__LineChartFX__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9591:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9592:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9592:2: ( ruleEString )
            // InternalJavaFXLang.g:9593:3: ruleEString
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
    // InternalJavaFXLang.g:9602:1: rule__LineChartFX__LegendSideAssignment_5_1 : ( ruleOrientation ) ;
    public final void rule__LineChartFX__LegendSideAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9606:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9607:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9607:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9608:3: ruleOrientation
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
    // InternalJavaFXLang.g:9617:1: rule__LineChartFX__ShowLegendAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__LineChartFX__ShowLegendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9621:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:9622:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:9622:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:9623:3: ruleEBoolean
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
    // InternalJavaFXLang.g:9632:1: rule__LineChartFX__TitleAssignment_7_1 : ( ruleEString ) ;
    public final void rule__LineChartFX__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9636:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9637:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9637:2: ( ruleEString )
            // InternalJavaFXLang.g:9638:3: ruleEString
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
    // InternalJavaFXLang.g:9647:1: rule__LineChartFX__TitleSideAssignment_8_1 : ( ruleOrientation ) ;
    public final void rule__LineChartFX__TitleSideAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9651:1: ( ( ruleOrientation ) )
            // InternalJavaFXLang.g:9652:2: ( ruleOrientation )
            {
            // InternalJavaFXLang.g:9652:2: ( ruleOrientation )
            // InternalJavaFXLang.g:9653:3: ruleOrientation
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
    // InternalJavaFXLang.g:9662:1: rule__LineChartFX__XAxisLabelAssignment_9_1 : ( ruleEString ) ;
    public final void rule__LineChartFX__XAxisLabelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9666:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9667:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9667:2: ( ruleEString )
            // InternalJavaFXLang.g:9668:3: ruleEString
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
    // InternalJavaFXLang.g:9677:1: rule__LineChartFX__XAxisTypeAssignment_10_1 : ( ruleAxisType ) ;
    public final void rule__LineChartFX__XAxisTypeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9681:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9682:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9682:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9683:3: ruleAxisType
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
    // InternalJavaFXLang.g:9692:1: rule__LineChartFX__YAxisLabelAssignment_11_1 : ( ruleEString ) ;
    public final void rule__LineChartFX__YAxisLabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9696:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9697:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9697:2: ( ruleEString )
            // InternalJavaFXLang.g:9698:3: ruleEString
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
    // InternalJavaFXLang.g:9707:1: rule__LineChartFX__YAxisTypeAssignment_12_1 : ( ruleAxisType ) ;
    public final void rule__LineChartFX__YAxisTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9711:1: ( ( ruleAxisType ) )
            // InternalJavaFXLang.g:9712:2: ( ruleAxisType )
            {
            // InternalJavaFXLang.g:9712:2: ( ruleAxisType )
            // InternalJavaFXLang.g:9713:3: ruleAxisType
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


    // $ANTLR start "rule__LineChartFX__DataAssignment_13_2_0"
    // InternalJavaFXLang.g:9722:1: rule__LineChartFX__DataAssignment_13_2_0 : ( ruleChartFXData ) ;
    public final void rule__LineChartFX__DataAssignment_13_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9726:1: ( ( ruleChartFXData ) )
            // InternalJavaFXLang.g:9727:2: ( ruleChartFXData )
            {
            // InternalJavaFXLang.g:9727:2: ( ruleChartFXData )
            // InternalJavaFXLang.g:9728:3: ruleChartFXData
            {
             before(grammarAccess.getLineChartFXAccess().getDataChartFXDataParserRuleCall_13_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleChartFXData();

            state._fsp--;

             after(grammarAccess.getLineChartFXAccess().getDataChartFXDataParserRuleCall_13_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChartFX__DataAssignment_13_2_0"


    // $ANTLR start "rule__LineChartFX__DataAssignment_13_2_1"
    // InternalJavaFXLang.g:9737:1: rule__LineChartFX__DataAssignment_13_2_1 : ( ruleChartFXData ) ;
    public final void rule__LineChartFX__DataAssignment_13_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9741:1: ( ( ruleChartFXData ) )
            // InternalJavaFXLang.g:9742:2: ( ruleChartFXData )
            {
            // InternalJavaFXLang.g:9742:2: ( ruleChartFXData )
            // InternalJavaFXLang.g:9743:3: ruleChartFXData
            {
             before(grammarAccess.getLineChartFXAccess().getDataChartFXDataParserRuleCall_13_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleChartFXData();

            state._fsp--;

             after(grammarAccess.getLineChartFXAccess().getDataChartFXDataParserRuleCall_13_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChartFX__DataAssignment_13_2_1"


    // $ANTLR start "rule__ChartFXData__XValueAssignment_3"
    // InternalJavaFXLang.g:9752:1: rule__ChartFXData__XValueAssignment_3 : ( ruleEString ) ;
    public final void rule__ChartFXData__XValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9756:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9757:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9757:2: ( ruleEString )
            // InternalJavaFXLang.g:9758:3: ruleEString
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
    // InternalJavaFXLang.g:9767:1: rule__ChartFXData__YValueAssignment_5 : ( ruleEString ) ;
    public final void rule__ChartFXData__YValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9771:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9772:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9772:2: ( ruleEString )
            // InternalJavaFXLang.g:9773:3: ruleEString
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
    // InternalJavaFXLang.g:9782:1: rule__Binding__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Binding__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9786:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9787:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9787:2: ( ruleEString )
            // InternalJavaFXLang.g:9788:3: ruleEString
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
    // InternalJavaFXLang.g:9797:1: rule__Binding__PropertyAssignment_4_0 : ( ruleBindingProperty ) ;
    public final void rule__Binding__PropertyAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9801:1: ( ( ruleBindingProperty ) )
            // InternalJavaFXLang.g:9802:2: ( ruleBindingProperty )
            {
            // InternalJavaFXLang.g:9802:2: ( ruleBindingProperty )
            // InternalJavaFXLang.g:9803:3: ruleBindingProperty
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
    // InternalJavaFXLang.g:9812:1: rule__Binding__PropertyAssignment_4_1 : ( ruleBindingProperty ) ;
    public final void rule__Binding__PropertyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9816:1: ( ( ruleBindingProperty ) )
            // InternalJavaFXLang.g:9817:2: ( ruleBindingProperty )
            {
            // InternalJavaFXLang.g:9817:2: ( ruleBindingProperty )
            // InternalJavaFXLang.g:9818:3: ruleBindingProperty
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
    // InternalJavaFXLang.g:9827:1: rule__BindingProperty__TypeAssignment_1 : ( ruleBindinType ) ;
    public final void rule__BindingProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9831:1: ( ( ruleBindinType ) )
            // InternalJavaFXLang.g:9832:2: ( ruleBindinType )
            {
            // InternalJavaFXLang.g:9832:2: ( ruleBindinType )
            // InternalJavaFXLang.g:9833:3: ruleBindinType
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
    // InternalJavaFXLang.g:9842:1: rule__BindingProperty__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BindingProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9846:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9847:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9847:2: ( ruleEString )
            // InternalJavaFXLang.g:9848:3: ruleEString
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
    // InternalJavaFXLang.g:9857:1: rule__FilteredTableViewFX__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__FilteredTableViewFX__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9861:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9862:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9862:2: ( ruleEString )
            // InternalJavaFXLang.g:9863:3: ruleEString
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
    // InternalJavaFXLang.g:9872:1: rule__FilteredTableViewFX__UsedModelAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__FilteredTableViewFX__UsedModelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9876:1: ( ( ( ruleEString ) ) )
            // InternalJavaFXLang.g:9877:2: ( ( ruleEString ) )
            {
            // InternalJavaFXLang.g:9877:2: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9878:3: ( ruleEString )
            {
             before(grammarAccess.getFilteredTableViewFXAccess().getUsedModelModelFXCrossReference_4_1_0()); 
            // InternalJavaFXLang.g:9879:3: ( ruleEString )
            // InternalJavaFXLang.g:9880:4: ruleEString
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
    // InternalJavaFXLang.g:9891:1: rule__FilteredTableViewFX__UseFilterAssignment_5_1 : ( ruleEBoolean ) ;
    public final void rule__FilteredTableViewFX__UseFilterAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9895:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:9896:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:9896:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:9897:3: ruleEBoolean
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
    // InternalJavaFXLang.g:9906:1: rule__FilteredTableViewFX__ColumnsAssignment_6_0 : ( ruleTableColumnFX ) ;
    public final void rule__FilteredTableViewFX__ColumnsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9910:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:9911:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:9911:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:9912:3: ruleTableColumnFX
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
    // InternalJavaFXLang.g:9921:1: rule__FilteredTableViewFX__ColumnsAssignment_6_1 : ( ruleTableColumnFX ) ;
    public final void rule__FilteredTableViewFX__ColumnsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9925:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:9926:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:9926:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:9927:3: ruleTableColumnFX
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
    // InternalJavaFXLang.g:9936:1: rule__DerivedBean__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DerivedBean__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9940:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9941:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9941:2: ( ruleEString )
            // InternalJavaFXLang.g:9942:3: ruleEString
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
    // InternalJavaFXLang.g:9951:1: rule__DerivedBean__InstanceTypeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__DerivedBean__InstanceTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9955:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:9956:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:9956:2: ( ruleEString )
            // InternalJavaFXLang.g:9957:3: ruleEString
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
    // InternalJavaFXLang.g:9966:1: rule__DerivedBean__AttributesAssignment_5_0 : ( ruleAttributeFX ) ;
    public final void rule__DerivedBean__AttributesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9970:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:9971:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:9971:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:9972:3: ruleAttributeFX
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
    // InternalJavaFXLang.g:9981:1: rule__DerivedBean__AttributesAssignment_5_1 : ( ruleAttributeFX ) ;
    public final void rule__DerivedBean__AttributesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:9985:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:9986:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:9986:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:9987:3: ruleAttributeFX
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
    // InternalJavaFXLang.g:9996:1: rule__Bean__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Bean__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10000:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10001:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10001:2: ( ruleEString )
            // InternalJavaFXLang.g:10002:3: ruleEString
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
    // InternalJavaFXLang.g:10011:1: rule__Bean__AttributesAssignment_4_0 : ( ruleAttributeFX ) ;
    public final void rule__Bean__AttributesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10015:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:10016:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:10016:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:10017:3: ruleAttributeFX
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
    // InternalJavaFXLang.g:10026:1: rule__Bean__AttributesAssignment_4_1 : ( ruleAttributeFX ) ;
    public final void rule__Bean__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10030:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:10031:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:10031:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:10032:3: ruleAttributeFX
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
    // InternalJavaFXLang.g:10041:1: rule__TableViewFX__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__TableViewFX__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10045:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10046:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10046:2: ( ruleEString )
            // InternalJavaFXLang.g:10047:3: ruleEString
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
    // InternalJavaFXLang.g:10056:1: rule__TableViewFX__UsedModelAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__TableViewFX__UsedModelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10060:1: ( ( ( ruleEString ) ) )
            // InternalJavaFXLang.g:10061:2: ( ( ruleEString ) )
            {
            // InternalJavaFXLang.g:10061:2: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10062:3: ( ruleEString )
            {
             before(grammarAccess.getTableViewFXAccess().getUsedModelModelFXCrossReference_4_1_0()); 
            // InternalJavaFXLang.g:10063:3: ( ruleEString )
            // InternalJavaFXLang.g:10064:4: ruleEString
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
    // InternalJavaFXLang.g:10075:1: rule__TableViewFX__ColumnsAssignment_5_0 : ( ruleTableColumnFX ) ;
    public final void rule__TableViewFX__ColumnsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10079:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:10080:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:10080:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:10081:3: ruleTableColumnFX
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
    // InternalJavaFXLang.g:10090:1: rule__TableViewFX__ColumnsAssignment_5_1 : ( ruleTableColumnFX ) ;
    public final void rule__TableViewFX__ColumnsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10094:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:10095:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:10095:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:10096:3: ruleTableColumnFX
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
    // InternalJavaFXLang.g:10105:1: rule__TableColumnFX__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__TableColumnFX__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10109:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10110:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10110:2: ( ruleEString )
            // InternalJavaFXLang.g:10111:3: ruleEString
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
    // InternalJavaFXLang.g:10120:1: rule__TableColumnFX__WidthAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__TableColumnFX__WidthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10124:1: ( ( ruleEInt ) )
            // InternalJavaFXLang.g:10125:2: ( ruleEInt )
            {
            // InternalJavaFXLang.g:10125:2: ( ruleEInt )
            // InternalJavaFXLang.g:10126:3: ruleEInt
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
    // InternalJavaFXLang.g:10135:1: rule__TableColumnFX__UsedAttributeAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__TableColumnFX__UsedAttributeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10139:1: ( ( ( ruleEString ) ) )
            // InternalJavaFXLang.g:10140:2: ( ( ruleEString ) )
            {
            // InternalJavaFXLang.g:10140:2: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10141:3: ( ruleEString )
            {
             before(grammarAccess.getTableColumnFXAccess().getUsedAttributeAttributeFXCrossReference_5_1_0()); 
            // InternalJavaFXLang.g:10142:3: ( ruleEString )
            // InternalJavaFXLang.g:10143:4: ruleEString
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
    // InternalJavaFXLang.g:10154:1: rule__TableColumnFX__UseFilterAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__TableColumnFX__UseFilterAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10158:1: ( ( ruleEBoolean ) )
            // InternalJavaFXLang.g:10159:2: ( ruleEBoolean )
            {
            // InternalJavaFXLang.g:10159:2: ( ruleEBoolean )
            // InternalJavaFXLang.g:10160:3: ruleEBoolean
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
    // InternalJavaFXLang.g:10169:1: rule__AttributeFX__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__AttributeFX__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10173:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10174:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10174:2: ( ruleEString )
            // InternalJavaFXLang.g:10175:3: ruleEString
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
    // InternalJavaFXLang.g:10184:1: rule__AttributeFX__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__AttributeFX__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:10188:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:10189:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:10189:2: ( ruleEString )
            // InternalJavaFXLang.g:10190:3: ruleEString
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x1080000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x1080000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x1080000000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0400000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0040000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0040000000000002L});
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
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000013F80000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000003F80000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000003F80002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x2300000010000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2100000010000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0xC020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000002L});

}