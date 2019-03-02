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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ProjectFX'", "'{'", "'}'", "'packagePath'", "'controls'", "','", "'models'", "'ModelFX'", "'attributes'", "'TableViewFX'", "'usedModel'", "'columns'", "'TableColumnFX'", "'width'", "'-'", "'AttributeFX'", "'type'"
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


    // $ANTLR start "entryRuleControlFX"
    // InternalJavaFXLang.g:78:1: entryRuleControlFX : ruleControlFX EOF ;
    public final void entryRuleControlFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:79:1: ( ruleControlFX EOF )
            // InternalJavaFXLang.g:80:1: ruleControlFX EOF
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
    // InternalJavaFXLang.g:87:1: ruleControlFX : ( ruleTableViewFX ) ;
    public final void ruleControlFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:91:2: ( ( ruleTableViewFX ) )
            // InternalJavaFXLang.g:92:2: ( ruleTableViewFX )
            {
            // InternalJavaFXLang.g:92:2: ( ruleTableViewFX )
            // InternalJavaFXLang.g:93:3: ruleTableViewFX
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
    // InternalJavaFXLang.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:104:1: ( ruleEString EOF )
            // InternalJavaFXLang.g:105:1: ruleEString EOF
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
    // InternalJavaFXLang.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalJavaFXLang.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalJavaFXLang.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalJavaFXLang.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalJavaFXLang.g:119:3: ( rule__EString__Alternatives )
            // InternalJavaFXLang.g:119:4: rule__EString__Alternatives
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
    // InternalJavaFXLang.g:128:1: entryRuleModelFX : ruleModelFX EOF ;
    public final void entryRuleModelFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:129:1: ( ruleModelFX EOF )
            // InternalJavaFXLang.g:130:1: ruleModelFX EOF
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
    // InternalJavaFXLang.g:137:1: ruleModelFX : ( ( rule__ModelFX__Group__0 ) ) ;
    public final void ruleModelFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:141:2: ( ( ( rule__ModelFX__Group__0 ) ) )
            // InternalJavaFXLang.g:142:2: ( ( rule__ModelFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:142:2: ( ( rule__ModelFX__Group__0 ) )
            // InternalJavaFXLang.g:143:3: ( rule__ModelFX__Group__0 )
            {
             before(grammarAccess.getModelFXAccess().getGroup()); 
            // InternalJavaFXLang.g:144:3: ( rule__ModelFX__Group__0 )
            // InternalJavaFXLang.g:144:4: rule__ModelFX__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelFX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelFXAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleTableViewFX"
    // InternalJavaFXLang.g:153:1: entryRuleTableViewFX : ruleTableViewFX EOF ;
    public final void entryRuleTableViewFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:154:1: ( ruleTableViewFX EOF )
            // InternalJavaFXLang.g:155:1: ruleTableViewFX EOF
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
    // InternalJavaFXLang.g:162:1: ruleTableViewFX : ( ( rule__TableViewFX__Group__0 ) ) ;
    public final void ruleTableViewFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:166:2: ( ( ( rule__TableViewFX__Group__0 ) ) )
            // InternalJavaFXLang.g:167:2: ( ( rule__TableViewFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:167:2: ( ( rule__TableViewFX__Group__0 ) )
            // InternalJavaFXLang.g:168:3: ( rule__TableViewFX__Group__0 )
            {
             before(grammarAccess.getTableViewFXAccess().getGroup()); 
            // InternalJavaFXLang.g:169:3: ( rule__TableViewFX__Group__0 )
            // InternalJavaFXLang.g:169:4: rule__TableViewFX__Group__0
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
    // InternalJavaFXLang.g:178:1: entryRuleTableColumnFX : ruleTableColumnFX EOF ;
    public final void entryRuleTableColumnFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:179:1: ( ruleTableColumnFX EOF )
            // InternalJavaFXLang.g:180:1: ruleTableColumnFX EOF
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
    // InternalJavaFXLang.g:187:1: ruleTableColumnFX : ( ( rule__TableColumnFX__Group__0 ) ) ;
    public final void ruleTableColumnFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:191:2: ( ( ( rule__TableColumnFX__Group__0 ) ) )
            // InternalJavaFXLang.g:192:2: ( ( rule__TableColumnFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:192:2: ( ( rule__TableColumnFX__Group__0 ) )
            // InternalJavaFXLang.g:193:3: ( rule__TableColumnFX__Group__0 )
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup()); 
            // InternalJavaFXLang.g:194:3: ( rule__TableColumnFX__Group__0 )
            // InternalJavaFXLang.g:194:4: rule__TableColumnFX__Group__0
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


    // $ANTLR start "entryRuleEInt"
    // InternalJavaFXLang.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:204:1: ( ruleEInt EOF )
            // InternalJavaFXLang.g:205:1: ruleEInt EOF
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
    // InternalJavaFXLang.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalJavaFXLang.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalJavaFXLang.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalJavaFXLang.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalJavaFXLang.g:219:3: ( rule__EInt__Group__0 )
            // InternalJavaFXLang.g:219:4: rule__EInt__Group__0
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
    // InternalJavaFXLang.g:228:1: entryRuleAttributeFX : ruleAttributeFX EOF ;
    public final void entryRuleAttributeFX() throws RecognitionException {
        try {
            // InternalJavaFXLang.g:229:1: ( ruleAttributeFX EOF )
            // InternalJavaFXLang.g:230:1: ruleAttributeFX EOF
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
    // InternalJavaFXLang.g:237:1: ruleAttributeFX : ( ( rule__AttributeFX__Group__0 ) ) ;
    public final void ruleAttributeFX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:241:2: ( ( ( rule__AttributeFX__Group__0 ) ) )
            // InternalJavaFXLang.g:242:2: ( ( rule__AttributeFX__Group__0 ) )
            {
            // InternalJavaFXLang.g:242:2: ( ( rule__AttributeFX__Group__0 ) )
            // InternalJavaFXLang.g:243:3: ( rule__AttributeFX__Group__0 )
            {
             before(grammarAccess.getAttributeFXAccess().getGroup()); 
            // InternalJavaFXLang.g:244:3: ( rule__AttributeFX__Group__0 )
            // InternalJavaFXLang.g:244:4: rule__AttributeFX__Group__0
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalJavaFXLang.g:252:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:256:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalJavaFXLang.g:257:2: ( RULE_STRING )
                    {
                    // InternalJavaFXLang.g:257:2: ( RULE_STRING )
                    // InternalJavaFXLang.g:258:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaFXLang.g:263:2: ( RULE_ID )
                    {
                    // InternalJavaFXLang.g:263:2: ( RULE_ID )
                    // InternalJavaFXLang.g:264:3: RULE_ID
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


    // $ANTLR start "rule__ProjectFX__Group__0"
    // InternalJavaFXLang.g:273:1: rule__ProjectFX__Group__0 : rule__ProjectFX__Group__0__Impl rule__ProjectFX__Group__1 ;
    public final void rule__ProjectFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:277:1: ( rule__ProjectFX__Group__0__Impl rule__ProjectFX__Group__1 )
            // InternalJavaFXLang.g:278:2: rule__ProjectFX__Group__0__Impl rule__ProjectFX__Group__1
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
    // InternalJavaFXLang.g:285:1: rule__ProjectFX__Group__0__Impl : ( () ) ;
    public final void rule__ProjectFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:289:1: ( ( () ) )
            // InternalJavaFXLang.g:290:1: ( () )
            {
            // InternalJavaFXLang.g:290:1: ( () )
            // InternalJavaFXLang.g:291:2: ()
            {
             before(grammarAccess.getProjectFXAccess().getProjectFXAction_0()); 
            // InternalJavaFXLang.g:292:2: ()
            // InternalJavaFXLang.g:292:3: 
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
    // InternalJavaFXLang.g:300:1: rule__ProjectFX__Group__1 : rule__ProjectFX__Group__1__Impl rule__ProjectFX__Group__2 ;
    public final void rule__ProjectFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:304:1: ( rule__ProjectFX__Group__1__Impl rule__ProjectFX__Group__2 )
            // InternalJavaFXLang.g:305:2: rule__ProjectFX__Group__1__Impl rule__ProjectFX__Group__2
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
    // InternalJavaFXLang.g:312:1: rule__ProjectFX__Group__1__Impl : ( 'ProjectFX' ) ;
    public final void rule__ProjectFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:316:1: ( ( 'ProjectFX' ) )
            // InternalJavaFXLang.g:317:1: ( 'ProjectFX' )
            {
            // InternalJavaFXLang.g:317:1: ( 'ProjectFX' )
            // InternalJavaFXLang.g:318:2: 'ProjectFX'
            {
             before(grammarAccess.getProjectFXAccess().getProjectFXKeyword_1()); 
            match(input,11,FOLLOW_2); 
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
    // InternalJavaFXLang.g:327:1: rule__ProjectFX__Group__2 : rule__ProjectFX__Group__2__Impl rule__ProjectFX__Group__3 ;
    public final void rule__ProjectFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:331:1: ( rule__ProjectFX__Group__2__Impl rule__ProjectFX__Group__3 )
            // InternalJavaFXLang.g:332:2: rule__ProjectFX__Group__2__Impl rule__ProjectFX__Group__3
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
    // InternalJavaFXLang.g:339:1: rule__ProjectFX__Group__2__Impl : ( ( rule__ProjectFX__NameAssignment_2 ) ) ;
    public final void rule__ProjectFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:343:1: ( ( ( rule__ProjectFX__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:344:1: ( ( rule__ProjectFX__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:344:1: ( ( rule__ProjectFX__NameAssignment_2 ) )
            // InternalJavaFXLang.g:345:2: ( rule__ProjectFX__NameAssignment_2 )
            {
             before(grammarAccess.getProjectFXAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:346:2: ( rule__ProjectFX__NameAssignment_2 )
            // InternalJavaFXLang.g:346:3: rule__ProjectFX__NameAssignment_2
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
    // InternalJavaFXLang.g:354:1: rule__ProjectFX__Group__3 : rule__ProjectFX__Group__3__Impl rule__ProjectFX__Group__4 ;
    public final void rule__ProjectFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:358:1: ( rule__ProjectFX__Group__3__Impl rule__ProjectFX__Group__4 )
            // InternalJavaFXLang.g:359:2: rule__ProjectFX__Group__3__Impl rule__ProjectFX__Group__4
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
    // InternalJavaFXLang.g:366:1: rule__ProjectFX__Group__3__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:370:1: ( ( '{' ) )
            // InternalJavaFXLang.g:371:1: ( '{' )
            {
            // InternalJavaFXLang.g:371:1: ( '{' )
            // InternalJavaFXLang.g:372:2: '{'
            {
             before(grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
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
    // InternalJavaFXLang.g:381:1: rule__ProjectFX__Group__4 : rule__ProjectFX__Group__4__Impl rule__ProjectFX__Group__5 ;
    public final void rule__ProjectFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:385:1: ( rule__ProjectFX__Group__4__Impl rule__ProjectFX__Group__5 )
            // InternalJavaFXLang.g:386:2: rule__ProjectFX__Group__4__Impl rule__ProjectFX__Group__5
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
    // InternalJavaFXLang.g:393:1: rule__ProjectFX__Group__4__Impl : ( ( rule__ProjectFX__Group_4__0 )? ) ;
    public final void rule__ProjectFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:397:1: ( ( ( rule__ProjectFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:398:1: ( ( rule__ProjectFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:398:1: ( ( rule__ProjectFX__Group_4__0 )? )
            // InternalJavaFXLang.g:399:2: ( rule__ProjectFX__Group_4__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:400:2: ( rule__ProjectFX__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalJavaFXLang.g:400:3: rule__ProjectFX__Group_4__0
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
    // InternalJavaFXLang.g:408:1: rule__ProjectFX__Group__5 : rule__ProjectFX__Group__5__Impl rule__ProjectFX__Group__6 ;
    public final void rule__ProjectFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:412:1: ( rule__ProjectFX__Group__5__Impl rule__ProjectFX__Group__6 )
            // InternalJavaFXLang.g:413:2: rule__ProjectFX__Group__5__Impl rule__ProjectFX__Group__6
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
    // InternalJavaFXLang.g:420:1: rule__ProjectFX__Group__5__Impl : ( ( rule__ProjectFX__Group_5__0 )? ) ;
    public final void rule__ProjectFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:424:1: ( ( ( rule__ProjectFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:425:1: ( ( rule__ProjectFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:425:1: ( ( rule__ProjectFX__Group_5__0 )? )
            // InternalJavaFXLang.g:426:2: ( rule__ProjectFX__Group_5__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:427:2: ( rule__ProjectFX__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJavaFXLang.g:427:3: rule__ProjectFX__Group_5__0
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
    // InternalJavaFXLang.g:435:1: rule__ProjectFX__Group__6 : rule__ProjectFX__Group__6__Impl rule__ProjectFX__Group__7 ;
    public final void rule__ProjectFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:439:1: ( rule__ProjectFX__Group__6__Impl rule__ProjectFX__Group__7 )
            // InternalJavaFXLang.g:440:2: rule__ProjectFX__Group__6__Impl rule__ProjectFX__Group__7
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
    // InternalJavaFXLang.g:447:1: rule__ProjectFX__Group__6__Impl : ( ( rule__ProjectFX__Group_6__0 )? ) ;
    public final void rule__ProjectFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:451:1: ( ( ( rule__ProjectFX__Group_6__0 )? ) )
            // InternalJavaFXLang.g:452:1: ( ( rule__ProjectFX__Group_6__0 )? )
            {
            // InternalJavaFXLang.g:452:1: ( ( rule__ProjectFX__Group_6__0 )? )
            // InternalJavaFXLang.g:453:2: ( rule__ProjectFX__Group_6__0 )?
            {
             before(grammarAccess.getProjectFXAccess().getGroup_6()); 
            // InternalJavaFXLang.g:454:2: ( rule__ProjectFX__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJavaFXLang.g:454:3: rule__ProjectFX__Group_6__0
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
    // InternalJavaFXLang.g:462:1: rule__ProjectFX__Group__7 : rule__ProjectFX__Group__7__Impl ;
    public final void rule__ProjectFX__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:466:1: ( rule__ProjectFX__Group__7__Impl )
            // InternalJavaFXLang.g:467:2: rule__ProjectFX__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalJavaFXLang.g:473:1: rule__ProjectFX__Group__7__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:477:1: ( ( '}' ) )
            // InternalJavaFXLang.g:478:1: ( '}' )
            {
            // InternalJavaFXLang.g:478:1: ( '}' )
            // InternalJavaFXLang.g:479:2: '}'
            {
             before(grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__ProjectFX__Group_4__0"
    // InternalJavaFXLang.g:489:1: rule__ProjectFX__Group_4__0 : rule__ProjectFX__Group_4__0__Impl rule__ProjectFX__Group_4__1 ;
    public final void rule__ProjectFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:493:1: ( rule__ProjectFX__Group_4__0__Impl rule__ProjectFX__Group_4__1 )
            // InternalJavaFXLang.g:494:2: rule__ProjectFX__Group_4__0__Impl rule__ProjectFX__Group_4__1
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
    // InternalJavaFXLang.g:501:1: rule__ProjectFX__Group_4__0__Impl : ( 'packagePath' ) ;
    public final void rule__ProjectFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:505:1: ( ( 'packagePath' ) )
            // InternalJavaFXLang.g:506:1: ( 'packagePath' )
            {
            // InternalJavaFXLang.g:506:1: ( 'packagePath' )
            // InternalJavaFXLang.g:507:2: 'packagePath'
            {
             before(grammarAccess.getProjectFXAccess().getPackagePathKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalJavaFXLang.g:516:1: rule__ProjectFX__Group_4__1 : rule__ProjectFX__Group_4__1__Impl ;
    public final void rule__ProjectFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:520:1: ( rule__ProjectFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:521:2: rule__ProjectFX__Group_4__1__Impl
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
    // InternalJavaFXLang.g:527:1: rule__ProjectFX__Group_4__1__Impl : ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) ) ;
    public final void rule__ProjectFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:531:1: ( ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:532:1: ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:532:1: ( ( rule__ProjectFX__PackagePathAssignment_4_1 ) )
            // InternalJavaFXLang.g:533:2: ( rule__ProjectFX__PackagePathAssignment_4_1 )
            {
             before(grammarAccess.getProjectFXAccess().getPackagePathAssignment_4_1()); 
            // InternalJavaFXLang.g:534:2: ( rule__ProjectFX__PackagePathAssignment_4_1 )
            // InternalJavaFXLang.g:534:3: rule__ProjectFX__PackagePathAssignment_4_1
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
    // InternalJavaFXLang.g:543:1: rule__ProjectFX__Group_5__0 : rule__ProjectFX__Group_5__0__Impl rule__ProjectFX__Group_5__1 ;
    public final void rule__ProjectFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:547:1: ( rule__ProjectFX__Group_5__0__Impl rule__ProjectFX__Group_5__1 )
            // InternalJavaFXLang.g:548:2: rule__ProjectFX__Group_5__0__Impl rule__ProjectFX__Group_5__1
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
    // InternalJavaFXLang.g:555:1: rule__ProjectFX__Group_5__0__Impl : ( 'controls' ) ;
    public final void rule__ProjectFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:559:1: ( ( 'controls' ) )
            // InternalJavaFXLang.g:560:1: ( 'controls' )
            {
            // InternalJavaFXLang.g:560:1: ( 'controls' )
            // InternalJavaFXLang.g:561:2: 'controls'
            {
             before(grammarAccess.getProjectFXAccess().getControlsKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalJavaFXLang.g:570:1: rule__ProjectFX__Group_5__1 : rule__ProjectFX__Group_5__1__Impl rule__ProjectFX__Group_5__2 ;
    public final void rule__ProjectFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:574:1: ( rule__ProjectFX__Group_5__1__Impl rule__ProjectFX__Group_5__2 )
            // InternalJavaFXLang.g:575:2: rule__ProjectFX__Group_5__1__Impl rule__ProjectFX__Group_5__2
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
    // InternalJavaFXLang.g:582:1: rule__ProjectFX__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:586:1: ( ( '{' ) )
            // InternalJavaFXLang.g:587:1: ( '{' )
            {
            // InternalJavaFXLang.g:587:1: ( '{' )
            // InternalJavaFXLang.g:588:2: '{'
            {
             before(grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalJavaFXLang.g:597:1: rule__ProjectFX__Group_5__2 : rule__ProjectFX__Group_5__2__Impl rule__ProjectFX__Group_5__3 ;
    public final void rule__ProjectFX__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:601:1: ( rule__ProjectFX__Group_5__2__Impl rule__ProjectFX__Group_5__3 )
            // InternalJavaFXLang.g:602:2: rule__ProjectFX__Group_5__2__Impl rule__ProjectFX__Group_5__3
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
    // InternalJavaFXLang.g:609:1: rule__ProjectFX__Group_5__2__Impl : ( ( rule__ProjectFX__ControlsAssignment_5_2 ) ) ;
    public final void rule__ProjectFX__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:613:1: ( ( ( rule__ProjectFX__ControlsAssignment_5_2 ) ) )
            // InternalJavaFXLang.g:614:1: ( ( rule__ProjectFX__ControlsAssignment_5_2 ) )
            {
            // InternalJavaFXLang.g:614:1: ( ( rule__ProjectFX__ControlsAssignment_5_2 ) )
            // InternalJavaFXLang.g:615:2: ( rule__ProjectFX__ControlsAssignment_5_2 )
            {
             before(grammarAccess.getProjectFXAccess().getControlsAssignment_5_2()); 
            // InternalJavaFXLang.g:616:2: ( rule__ProjectFX__ControlsAssignment_5_2 )
            // InternalJavaFXLang.g:616:3: rule__ProjectFX__ControlsAssignment_5_2
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
    // InternalJavaFXLang.g:624:1: rule__ProjectFX__Group_5__3 : rule__ProjectFX__Group_5__3__Impl rule__ProjectFX__Group_5__4 ;
    public final void rule__ProjectFX__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:628:1: ( rule__ProjectFX__Group_5__3__Impl rule__ProjectFX__Group_5__4 )
            // InternalJavaFXLang.g:629:2: rule__ProjectFX__Group_5__3__Impl rule__ProjectFX__Group_5__4
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
    // InternalJavaFXLang.g:636:1: rule__ProjectFX__Group_5__3__Impl : ( ( rule__ProjectFX__Group_5_3__0 )* ) ;
    public final void rule__ProjectFX__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:640:1: ( ( ( rule__ProjectFX__Group_5_3__0 )* ) )
            // InternalJavaFXLang.g:641:1: ( ( rule__ProjectFX__Group_5_3__0 )* )
            {
            // InternalJavaFXLang.g:641:1: ( ( rule__ProjectFX__Group_5_3__0 )* )
            // InternalJavaFXLang.g:642:2: ( rule__ProjectFX__Group_5_3__0 )*
            {
             before(grammarAccess.getProjectFXAccess().getGroup_5_3()); 
            // InternalJavaFXLang.g:643:2: ( rule__ProjectFX__Group_5_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalJavaFXLang.g:643:3: rule__ProjectFX__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ProjectFX__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProjectFXAccess().getGroup_5_3()); 

            }


            }

        }
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
    // InternalJavaFXLang.g:651:1: rule__ProjectFX__Group_5__4 : rule__ProjectFX__Group_5__4__Impl ;
    public final void rule__ProjectFX__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:655:1: ( rule__ProjectFX__Group_5__4__Impl )
            // InternalJavaFXLang.g:656:2: rule__ProjectFX__Group_5__4__Impl
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
    // InternalJavaFXLang.g:662:1: rule__ProjectFX__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:666:1: ( ( '}' ) )
            // InternalJavaFXLang.g:667:1: ( '}' )
            {
            // InternalJavaFXLang.g:667:1: ( '}' )
            // InternalJavaFXLang.g:668:2: '}'
            {
             before(grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__ProjectFX__Group_5_3__0"
    // InternalJavaFXLang.g:678:1: rule__ProjectFX__Group_5_3__0 : rule__ProjectFX__Group_5_3__0__Impl rule__ProjectFX__Group_5_3__1 ;
    public final void rule__ProjectFX__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:682:1: ( rule__ProjectFX__Group_5_3__0__Impl rule__ProjectFX__Group_5_3__1 )
            // InternalJavaFXLang.g:683:2: rule__ProjectFX__Group_5_3__0__Impl rule__ProjectFX__Group_5_3__1
            {
            pushFollow(FOLLOW_7);
            rule__ProjectFX__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectFX__Group_5_3__0"


    // $ANTLR start "rule__ProjectFX__Group_5_3__0__Impl"
    // InternalJavaFXLang.g:690:1: rule__ProjectFX__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ProjectFX__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:694:1: ( ( ',' ) )
            // InternalJavaFXLang.g:695:1: ( ',' )
            {
            // InternalJavaFXLang.g:695:1: ( ',' )
            // InternalJavaFXLang.g:696:2: ','
            {
             before(grammarAccess.getProjectFXAccess().getCommaKeyword_5_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProjectFXAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectFX__Group_5_3__0__Impl"


    // $ANTLR start "rule__ProjectFX__Group_5_3__1"
    // InternalJavaFXLang.g:705:1: rule__ProjectFX__Group_5_3__1 : rule__ProjectFX__Group_5_3__1__Impl ;
    public final void rule__ProjectFX__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:709:1: ( rule__ProjectFX__Group_5_3__1__Impl )
            // InternalJavaFXLang.g:710:2: rule__ProjectFX__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectFX__Group_5_3__1"


    // $ANTLR start "rule__ProjectFX__Group_5_3__1__Impl"
    // InternalJavaFXLang.g:716:1: rule__ProjectFX__Group_5_3__1__Impl : ( ( rule__ProjectFX__ControlsAssignment_5_3_1 ) ) ;
    public final void rule__ProjectFX__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:720:1: ( ( ( rule__ProjectFX__ControlsAssignment_5_3_1 ) ) )
            // InternalJavaFXLang.g:721:1: ( ( rule__ProjectFX__ControlsAssignment_5_3_1 ) )
            {
            // InternalJavaFXLang.g:721:1: ( ( rule__ProjectFX__ControlsAssignment_5_3_1 ) )
            // InternalJavaFXLang.g:722:2: ( rule__ProjectFX__ControlsAssignment_5_3_1 )
            {
             before(grammarAccess.getProjectFXAccess().getControlsAssignment_5_3_1()); 
            // InternalJavaFXLang.g:723:2: ( rule__ProjectFX__ControlsAssignment_5_3_1 )
            // InternalJavaFXLang.g:723:3: rule__ProjectFX__ControlsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectFX__ControlsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectFXAccess().getControlsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectFX__Group_5_3__1__Impl"


    // $ANTLR start "rule__ProjectFX__Group_6__0"
    // InternalJavaFXLang.g:732:1: rule__ProjectFX__Group_6__0 : rule__ProjectFX__Group_6__0__Impl rule__ProjectFX__Group_6__1 ;
    public final void rule__ProjectFX__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:736:1: ( rule__ProjectFX__Group_6__0__Impl rule__ProjectFX__Group_6__1 )
            // InternalJavaFXLang.g:737:2: rule__ProjectFX__Group_6__0__Impl rule__ProjectFX__Group_6__1
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
    // InternalJavaFXLang.g:744:1: rule__ProjectFX__Group_6__0__Impl : ( 'models' ) ;
    public final void rule__ProjectFX__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:748:1: ( ( 'models' ) )
            // InternalJavaFXLang.g:749:1: ( 'models' )
            {
            // InternalJavaFXLang.g:749:1: ( 'models' )
            // InternalJavaFXLang.g:750:2: 'models'
            {
             before(grammarAccess.getProjectFXAccess().getModelsKeyword_6_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalJavaFXLang.g:759:1: rule__ProjectFX__Group_6__1 : rule__ProjectFX__Group_6__1__Impl rule__ProjectFX__Group_6__2 ;
    public final void rule__ProjectFX__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:763:1: ( rule__ProjectFX__Group_6__1__Impl rule__ProjectFX__Group_6__2 )
            // InternalJavaFXLang.g:764:2: rule__ProjectFX__Group_6__1__Impl rule__ProjectFX__Group_6__2
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
    // InternalJavaFXLang.g:771:1: rule__ProjectFX__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ProjectFX__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:775:1: ( ( '{' ) )
            // InternalJavaFXLang.g:776:1: ( '{' )
            {
            // InternalJavaFXLang.g:776:1: ( '{' )
            // InternalJavaFXLang.g:777:2: '{'
            {
             before(grammarAccess.getProjectFXAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalJavaFXLang.g:786:1: rule__ProjectFX__Group_6__2 : rule__ProjectFX__Group_6__2__Impl rule__ProjectFX__Group_6__3 ;
    public final void rule__ProjectFX__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:790:1: ( rule__ProjectFX__Group_6__2__Impl rule__ProjectFX__Group_6__3 )
            // InternalJavaFXLang.g:791:2: rule__ProjectFX__Group_6__2__Impl rule__ProjectFX__Group_6__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalJavaFXLang.g:798:1: rule__ProjectFX__Group_6__2__Impl : ( ( rule__ProjectFX__ModelsAssignment_6_2 ) ) ;
    public final void rule__ProjectFX__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:802:1: ( ( ( rule__ProjectFX__ModelsAssignment_6_2 ) ) )
            // InternalJavaFXLang.g:803:1: ( ( rule__ProjectFX__ModelsAssignment_6_2 ) )
            {
            // InternalJavaFXLang.g:803:1: ( ( rule__ProjectFX__ModelsAssignment_6_2 ) )
            // InternalJavaFXLang.g:804:2: ( rule__ProjectFX__ModelsAssignment_6_2 )
            {
             before(grammarAccess.getProjectFXAccess().getModelsAssignment_6_2()); 
            // InternalJavaFXLang.g:805:2: ( rule__ProjectFX__ModelsAssignment_6_2 )
            // InternalJavaFXLang.g:805:3: rule__ProjectFX__ModelsAssignment_6_2
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
    // InternalJavaFXLang.g:813:1: rule__ProjectFX__Group_6__3 : rule__ProjectFX__Group_6__3__Impl rule__ProjectFX__Group_6__4 ;
    public final void rule__ProjectFX__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:817:1: ( rule__ProjectFX__Group_6__3__Impl rule__ProjectFX__Group_6__4 )
            // InternalJavaFXLang.g:818:2: rule__ProjectFX__Group_6__3__Impl rule__ProjectFX__Group_6__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalJavaFXLang.g:825:1: rule__ProjectFX__Group_6__3__Impl : ( ( rule__ProjectFX__Group_6_3__0 )* ) ;
    public final void rule__ProjectFX__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:829:1: ( ( ( rule__ProjectFX__Group_6_3__0 )* ) )
            // InternalJavaFXLang.g:830:1: ( ( rule__ProjectFX__Group_6_3__0 )* )
            {
            // InternalJavaFXLang.g:830:1: ( ( rule__ProjectFX__Group_6_3__0 )* )
            // InternalJavaFXLang.g:831:2: ( rule__ProjectFX__Group_6_3__0 )*
            {
             before(grammarAccess.getProjectFXAccess().getGroup_6_3()); 
            // InternalJavaFXLang.g:832:2: ( rule__ProjectFX__Group_6_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalJavaFXLang.g:832:3: rule__ProjectFX__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ProjectFX__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProjectFXAccess().getGroup_6_3()); 

            }


            }

        }
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
    // InternalJavaFXLang.g:840:1: rule__ProjectFX__Group_6__4 : rule__ProjectFX__Group_6__4__Impl ;
    public final void rule__ProjectFX__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:844:1: ( rule__ProjectFX__Group_6__4__Impl )
            // InternalJavaFXLang.g:845:2: rule__ProjectFX__Group_6__4__Impl
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
    // InternalJavaFXLang.g:851:1: rule__ProjectFX__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ProjectFX__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:855:1: ( ( '}' ) )
            // InternalJavaFXLang.g:856:1: ( '}' )
            {
            // InternalJavaFXLang.g:856:1: ( '}' )
            // InternalJavaFXLang.g:857:2: '}'
            {
             before(grammarAccess.getProjectFXAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__ProjectFX__Group_6_3__0"
    // InternalJavaFXLang.g:867:1: rule__ProjectFX__Group_6_3__0 : rule__ProjectFX__Group_6_3__0__Impl rule__ProjectFX__Group_6_3__1 ;
    public final void rule__ProjectFX__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:871:1: ( rule__ProjectFX__Group_6_3__0__Impl rule__ProjectFX__Group_6_3__1 )
            // InternalJavaFXLang.g:872:2: rule__ProjectFX__Group_6_3__0__Impl rule__ProjectFX__Group_6_3__1
            {
            pushFollow(FOLLOW_10);
            rule__ProjectFX__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectFX__Group_6_3__0"


    // $ANTLR start "rule__ProjectFX__Group_6_3__0__Impl"
    // InternalJavaFXLang.g:879:1: rule__ProjectFX__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ProjectFX__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:883:1: ( ( ',' ) )
            // InternalJavaFXLang.g:884:1: ( ',' )
            {
            // InternalJavaFXLang.g:884:1: ( ',' )
            // InternalJavaFXLang.g:885:2: ','
            {
             before(grammarAccess.getProjectFXAccess().getCommaKeyword_6_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProjectFXAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectFX__Group_6_3__0__Impl"


    // $ANTLR start "rule__ProjectFX__Group_6_3__1"
    // InternalJavaFXLang.g:894:1: rule__ProjectFX__Group_6_3__1 : rule__ProjectFX__Group_6_3__1__Impl ;
    public final void rule__ProjectFX__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:898:1: ( rule__ProjectFX__Group_6_3__1__Impl )
            // InternalJavaFXLang.g:899:2: rule__ProjectFX__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectFX__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectFX__Group_6_3__1"


    // $ANTLR start "rule__ProjectFX__Group_6_3__1__Impl"
    // InternalJavaFXLang.g:905:1: rule__ProjectFX__Group_6_3__1__Impl : ( ( rule__ProjectFX__ModelsAssignment_6_3_1 ) ) ;
    public final void rule__ProjectFX__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:909:1: ( ( ( rule__ProjectFX__ModelsAssignment_6_3_1 ) ) )
            // InternalJavaFXLang.g:910:1: ( ( rule__ProjectFX__ModelsAssignment_6_3_1 ) )
            {
            // InternalJavaFXLang.g:910:1: ( ( rule__ProjectFX__ModelsAssignment_6_3_1 ) )
            // InternalJavaFXLang.g:911:2: ( rule__ProjectFX__ModelsAssignment_6_3_1 )
            {
             before(grammarAccess.getProjectFXAccess().getModelsAssignment_6_3_1()); 
            // InternalJavaFXLang.g:912:2: ( rule__ProjectFX__ModelsAssignment_6_3_1 )
            // InternalJavaFXLang.g:912:3: rule__ProjectFX__ModelsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectFX__ModelsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectFXAccess().getModelsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectFX__Group_6_3__1__Impl"


    // $ANTLR start "rule__ModelFX__Group__0"
    // InternalJavaFXLang.g:921:1: rule__ModelFX__Group__0 : rule__ModelFX__Group__0__Impl rule__ModelFX__Group__1 ;
    public final void rule__ModelFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:925:1: ( rule__ModelFX__Group__0__Impl rule__ModelFX__Group__1 )
            // InternalJavaFXLang.g:926:2: rule__ModelFX__Group__0__Impl rule__ModelFX__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ModelFX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelFX__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group__0"


    // $ANTLR start "rule__ModelFX__Group__0__Impl"
    // InternalJavaFXLang.g:933:1: rule__ModelFX__Group__0__Impl : ( () ) ;
    public final void rule__ModelFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:937:1: ( ( () ) )
            // InternalJavaFXLang.g:938:1: ( () )
            {
            // InternalJavaFXLang.g:938:1: ( () )
            // InternalJavaFXLang.g:939:2: ()
            {
             before(grammarAccess.getModelFXAccess().getModelFXAction_0()); 
            // InternalJavaFXLang.g:940:2: ()
            // InternalJavaFXLang.g:940:3: 
            {
            }

             after(grammarAccess.getModelFXAccess().getModelFXAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group__0__Impl"


    // $ANTLR start "rule__ModelFX__Group__1"
    // InternalJavaFXLang.g:948:1: rule__ModelFX__Group__1 : rule__ModelFX__Group__1__Impl rule__ModelFX__Group__2 ;
    public final void rule__ModelFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:952:1: ( rule__ModelFX__Group__1__Impl rule__ModelFX__Group__2 )
            // InternalJavaFXLang.g:953:2: rule__ModelFX__Group__1__Impl rule__ModelFX__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ModelFX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelFX__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group__1"


    // $ANTLR start "rule__ModelFX__Group__1__Impl"
    // InternalJavaFXLang.g:960:1: rule__ModelFX__Group__1__Impl : ( 'ModelFX' ) ;
    public final void rule__ModelFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:964:1: ( ( 'ModelFX' ) )
            // InternalJavaFXLang.g:965:1: ( 'ModelFX' )
            {
            // InternalJavaFXLang.g:965:1: ( 'ModelFX' )
            // InternalJavaFXLang.g:966:2: 'ModelFX'
            {
             before(grammarAccess.getModelFXAccess().getModelFXKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelFXAccess().getModelFXKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group__1__Impl"


    // $ANTLR start "rule__ModelFX__Group__2"
    // InternalJavaFXLang.g:975:1: rule__ModelFX__Group__2 : rule__ModelFX__Group__2__Impl rule__ModelFX__Group__3 ;
    public final void rule__ModelFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:979:1: ( rule__ModelFX__Group__2__Impl rule__ModelFX__Group__3 )
            // InternalJavaFXLang.g:980:2: rule__ModelFX__Group__2__Impl rule__ModelFX__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ModelFX__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelFX__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group__2"


    // $ANTLR start "rule__ModelFX__Group__2__Impl"
    // InternalJavaFXLang.g:987:1: rule__ModelFX__Group__2__Impl : ( ( rule__ModelFX__NameAssignment_2 ) ) ;
    public final void rule__ModelFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:991:1: ( ( ( rule__ModelFX__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:992:1: ( ( rule__ModelFX__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:992:1: ( ( rule__ModelFX__NameAssignment_2 ) )
            // InternalJavaFXLang.g:993:2: ( rule__ModelFX__NameAssignment_2 )
            {
             before(grammarAccess.getModelFXAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:994:2: ( rule__ModelFX__NameAssignment_2 )
            // InternalJavaFXLang.g:994:3: rule__ModelFX__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ModelFX__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelFXAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group__2__Impl"


    // $ANTLR start "rule__ModelFX__Group__3"
    // InternalJavaFXLang.g:1002:1: rule__ModelFX__Group__3 : rule__ModelFX__Group__3__Impl rule__ModelFX__Group__4 ;
    public final void rule__ModelFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1006:1: ( rule__ModelFX__Group__3__Impl rule__ModelFX__Group__4 )
            // InternalJavaFXLang.g:1007:2: rule__ModelFX__Group__3__Impl rule__ModelFX__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__ModelFX__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelFX__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group__3"


    // $ANTLR start "rule__ModelFX__Group__3__Impl"
    // InternalJavaFXLang.g:1014:1: rule__ModelFX__Group__3__Impl : ( '{' ) ;
    public final void rule__ModelFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1018:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1019:1: ( '{' )
            {
            // InternalJavaFXLang.g:1019:1: ( '{' )
            // InternalJavaFXLang.g:1020:2: '{'
            {
             before(grammarAccess.getModelFXAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModelFXAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group__3__Impl"


    // $ANTLR start "rule__ModelFX__Group__4"
    // InternalJavaFXLang.g:1029:1: rule__ModelFX__Group__4 : rule__ModelFX__Group__4__Impl rule__ModelFX__Group__5 ;
    public final void rule__ModelFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1033:1: ( rule__ModelFX__Group__4__Impl rule__ModelFX__Group__5 )
            // InternalJavaFXLang.g:1034:2: rule__ModelFX__Group__4__Impl rule__ModelFX__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__ModelFX__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelFX__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group__4"


    // $ANTLR start "rule__ModelFX__Group__4__Impl"
    // InternalJavaFXLang.g:1041:1: rule__ModelFX__Group__4__Impl : ( ( rule__ModelFX__Group_4__0 )? ) ;
    public final void rule__ModelFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1045:1: ( ( ( rule__ModelFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:1046:1: ( ( rule__ModelFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:1046:1: ( ( rule__ModelFX__Group_4__0 )? )
            // InternalJavaFXLang.g:1047:2: ( rule__ModelFX__Group_4__0 )?
            {
             before(grammarAccess.getModelFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:1048:2: ( rule__ModelFX__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJavaFXLang.g:1048:3: rule__ModelFX__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelFX__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelFXAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group__4__Impl"


    // $ANTLR start "rule__ModelFX__Group__5"
    // InternalJavaFXLang.g:1056:1: rule__ModelFX__Group__5 : rule__ModelFX__Group__5__Impl ;
    public final void rule__ModelFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1060:1: ( rule__ModelFX__Group__5__Impl )
            // InternalJavaFXLang.g:1061:2: rule__ModelFX__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelFX__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group__5"


    // $ANTLR start "rule__ModelFX__Group__5__Impl"
    // InternalJavaFXLang.g:1067:1: rule__ModelFX__Group__5__Impl : ( '}' ) ;
    public final void rule__ModelFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1071:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1072:1: ( '}' )
            {
            // InternalJavaFXLang.g:1072:1: ( '}' )
            // InternalJavaFXLang.g:1073:2: '}'
            {
             before(grammarAccess.getModelFXAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelFXAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group__5__Impl"


    // $ANTLR start "rule__ModelFX__Group_4__0"
    // InternalJavaFXLang.g:1083:1: rule__ModelFX__Group_4__0 : rule__ModelFX__Group_4__0__Impl rule__ModelFX__Group_4__1 ;
    public final void rule__ModelFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1087:1: ( rule__ModelFX__Group_4__0__Impl rule__ModelFX__Group_4__1 )
            // InternalJavaFXLang.g:1088:2: rule__ModelFX__Group_4__0__Impl rule__ModelFX__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ModelFX__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelFX__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group_4__0"


    // $ANTLR start "rule__ModelFX__Group_4__0__Impl"
    // InternalJavaFXLang.g:1095:1: rule__ModelFX__Group_4__0__Impl : ( 'attributes' ) ;
    public final void rule__ModelFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1099:1: ( ( 'attributes' ) )
            // InternalJavaFXLang.g:1100:1: ( 'attributes' )
            {
            // InternalJavaFXLang.g:1100:1: ( 'attributes' )
            // InternalJavaFXLang.g:1101:2: 'attributes'
            {
             before(grammarAccess.getModelFXAccess().getAttributesKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getModelFXAccess().getAttributesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group_4__0__Impl"


    // $ANTLR start "rule__ModelFX__Group_4__1"
    // InternalJavaFXLang.g:1110:1: rule__ModelFX__Group_4__1 : rule__ModelFX__Group_4__1__Impl rule__ModelFX__Group_4__2 ;
    public final void rule__ModelFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1114:1: ( rule__ModelFX__Group_4__1__Impl rule__ModelFX__Group_4__2 )
            // InternalJavaFXLang.g:1115:2: rule__ModelFX__Group_4__1__Impl rule__ModelFX__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__ModelFX__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelFX__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group_4__1"


    // $ANTLR start "rule__ModelFX__Group_4__1__Impl"
    // InternalJavaFXLang.g:1122:1: rule__ModelFX__Group_4__1__Impl : ( '{' ) ;
    public final void rule__ModelFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1126:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1127:1: ( '{' )
            {
            // InternalJavaFXLang.g:1127:1: ( '{' )
            // InternalJavaFXLang.g:1128:2: '{'
            {
             before(grammarAccess.getModelFXAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModelFXAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group_4__1__Impl"


    // $ANTLR start "rule__ModelFX__Group_4__2"
    // InternalJavaFXLang.g:1137:1: rule__ModelFX__Group_4__2 : rule__ModelFX__Group_4__2__Impl rule__ModelFX__Group_4__3 ;
    public final void rule__ModelFX__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1141:1: ( rule__ModelFX__Group_4__2__Impl rule__ModelFX__Group_4__3 )
            // InternalJavaFXLang.g:1142:2: rule__ModelFX__Group_4__2__Impl rule__ModelFX__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__ModelFX__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelFX__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group_4__2"


    // $ANTLR start "rule__ModelFX__Group_4__2__Impl"
    // InternalJavaFXLang.g:1149:1: rule__ModelFX__Group_4__2__Impl : ( ( rule__ModelFX__AttributesAssignment_4_2 ) ) ;
    public final void rule__ModelFX__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1153:1: ( ( ( rule__ModelFX__AttributesAssignment_4_2 ) ) )
            // InternalJavaFXLang.g:1154:1: ( ( rule__ModelFX__AttributesAssignment_4_2 ) )
            {
            // InternalJavaFXLang.g:1154:1: ( ( rule__ModelFX__AttributesAssignment_4_2 ) )
            // InternalJavaFXLang.g:1155:2: ( rule__ModelFX__AttributesAssignment_4_2 )
            {
             before(grammarAccess.getModelFXAccess().getAttributesAssignment_4_2()); 
            // InternalJavaFXLang.g:1156:2: ( rule__ModelFX__AttributesAssignment_4_2 )
            // InternalJavaFXLang.g:1156:3: rule__ModelFX__AttributesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ModelFX__AttributesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getModelFXAccess().getAttributesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group_4__2__Impl"


    // $ANTLR start "rule__ModelFX__Group_4__3"
    // InternalJavaFXLang.g:1164:1: rule__ModelFX__Group_4__3 : rule__ModelFX__Group_4__3__Impl rule__ModelFX__Group_4__4 ;
    public final void rule__ModelFX__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1168:1: ( rule__ModelFX__Group_4__3__Impl rule__ModelFX__Group_4__4 )
            // InternalJavaFXLang.g:1169:2: rule__ModelFX__Group_4__3__Impl rule__ModelFX__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__ModelFX__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelFX__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group_4__3"


    // $ANTLR start "rule__ModelFX__Group_4__3__Impl"
    // InternalJavaFXLang.g:1176:1: rule__ModelFX__Group_4__3__Impl : ( ( rule__ModelFX__Group_4_3__0 )* ) ;
    public final void rule__ModelFX__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1180:1: ( ( ( rule__ModelFX__Group_4_3__0 )* ) )
            // InternalJavaFXLang.g:1181:1: ( ( rule__ModelFX__Group_4_3__0 )* )
            {
            // InternalJavaFXLang.g:1181:1: ( ( rule__ModelFX__Group_4_3__0 )* )
            // InternalJavaFXLang.g:1182:2: ( rule__ModelFX__Group_4_3__0 )*
            {
             before(grammarAccess.getModelFXAccess().getGroup_4_3()); 
            // InternalJavaFXLang.g:1183:2: ( rule__ModelFX__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJavaFXLang.g:1183:3: rule__ModelFX__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ModelFX__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelFXAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group_4__3__Impl"


    // $ANTLR start "rule__ModelFX__Group_4__4"
    // InternalJavaFXLang.g:1191:1: rule__ModelFX__Group_4__4 : rule__ModelFX__Group_4__4__Impl ;
    public final void rule__ModelFX__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1195:1: ( rule__ModelFX__Group_4__4__Impl )
            // InternalJavaFXLang.g:1196:2: rule__ModelFX__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelFX__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group_4__4"


    // $ANTLR start "rule__ModelFX__Group_4__4__Impl"
    // InternalJavaFXLang.g:1202:1: rule__ModelFX__Group_4__4__Impl : ( '}' ) ;
    public final void rule__ModelFX__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1206:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1207:1: ( '}' )
            {
            // InternalJavaFXLang.g:1207:1: ( '}' )
            // InternalJavaFXLang.g:1208:2: '}'
            {
             before(grammarAccess.getModelFXAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelFXAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group_4__4__Impl"


    // $ANTLR start "rule__ModelFX__Group_4_3__0"
    // InternalJavaFXLang.g:1218:1: rule__ModelFX__Group_4_3__0 : rule__ModelFX__Group_4_3__0__Impl rule__ModelFX__Group_4_3__1 ;
    public final void rule__ModelFX__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1222:1: ( rule__ModelFX__Group_4_3__0__Impl rule__ModelFX__Group_4_3__1 )
            // InternalJavaFXLang.g:1223:2: rule__ModelFX__Group_4_3__0__Impl rule__ModelFX__Group_4_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ModelFX__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelFX__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group_4_3__0"


    // $ANTLR start "rule__ModelFX__Group_4_3__0__Impl"
    // InternalJavaFXLang.g:1230:1: rule__ModelFX__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ModelFX__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1234:1: ( ( ',' ) )
            // InternalJavaFXLang.g:1235:1: ( ',' )
            {
            // InternalJavaFXLang.g:1235:1: ( ',' )
            // InternalJavaFXLang.g:1236:2: ','
            {
             before(grammarAccess.getModelFXAccess().getCommaKeyword_4_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelFXAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group_4_3__0__Impl"


    // $ANTLR start "rule__ModelFX__Group_4_3__1"
    // InternalJavaFXLang.g:1245:1: rule__ModelFX__Group_4_3__1 : rule__ModelFX__Group_4_3__1__Impl ;
    public final void rule__ModelFX__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1249:1: ( rule__ModelFX__Group_4_3__1__Impl )
            // InternalJavaFXLang.g:1250:2: rule__ModelFX__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelFX__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group_4_3__1"


    // $ANTLR start "rule__ModelFX__Group_4_3__1__Impl"
    // InternalJavaFXLang.g:1256:1: rule__ModelFX__Group_4_3__1__Impl : ( ( rule__ModelFX__AttributesAssignment_4_3_1 ) ) ;
    public final void rule__ModelFX__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1260:1: ( ( ( rule__ModelFX__AttributesAssignment_4_3_1 ) ) )
            // InternalJavaFXLang.g:1261:1: ( ( rule__ModelFX__AttributesAssignment_4_3_1 ) )
            {
            // InternalJavaFXLang.g:1261:1: ( ( rule__ModelFX__AttributesAssignment_4_3_1 ) )
            // InternalJavaFXLang.g:1262:2: ( rule__ModelFX__AttributesAssignment_4_3_1 )
            {
             before(grammarAccess.getModelFXAccess().getAttributesAssignment_4_3_1()); 
            // InternalJavaFXLang.g:1263:2: ( rule__ModelFX__AttributesAssignment_4_3_1 )
            // InternalJavaFXLang.g:1263:3: rule__ModelFX__AttributesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelFX__AttributesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModelFXAccess().getAttributesAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__Group_4_3__1__Impl"


    // $ANTLR start "rule__TableViewFX__Group__0"
    // InternalJavaFXLang.g:1272:1: rule__TableViewFX__Group__0 : rule__TableViewFX__Group__0__Impl rule__TableViewFX__Group__1 ;
    public final void rule__TableViewFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1276:1: ( rule__TableViewFX__Group__0__Impl rule__TableViewFX__Group__1 )
            // InternalJavaFXLang.g:1277:2: rule__TableViewFX__Group__0__Impl rule__TableViewFX__Group__1
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
    // InternalJavaFXLang.g:1284:1: rule__TableViewFX__Group__0__Impl : ( () ) ;
    public final void rule__TableViewFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1288:1: ( ( () ) )
            // InternalJavaFXLang.g:1289:1: ( () )
            {
            // InternalJavaFXLang.g:1289:1: ( () )
            // InternalJavaFXLang.g:1290:2: ()
            {
             before(grammarAccess.getTableViewFXAccess().getTableViewFXAction_0()); 
            // InternalJavaFXLang.g:1291:2: ()
            // InternalJavaFXLang.g:1291:3: 
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
    // InternalJavaFXLang.g:1299:1: rule__TableViewFX__Group__1 : rule__TableViewFX__Group__1__Impl rule__TableViewFX__Group__2 ;
    public final void rule__TableViewFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1303:1: ( rule__TableViewFX__Group__1__Impl rule__TableViewFX__Group__2 )
            // InternalJavaFXLang.g:1304:2: rule__TableViewFX__Group__1__Impl rule__TableViewFX__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalJavaFXLang.g:1311:1: rule__TableViewFX__Group__1__Impl : ( 'TableViewFX' ) ;
    public final void rule__TableViewFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1315:1: ( ( 'TableViewFX' ) )
            // InternalJavaFXLang.g:1316:1: ( 'TableViewFX' )
            {
            // InternalJavaFXLang.g:1316:1: ( 'TableViewFX' )
            // InternalJavaFXLang.g:1317:2: 'TableViewFX'
            {
             before(grammarAccess.getTableViewFXAccess().getTableViewFXKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTableViewFXAccess().getTableViewFXKeyword_1()); 

            }


            }

        }
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
    // InternalJavaFXLang.g:1326:1: rule__TableViewFX__Group__2 : rule__TableViewFX__Group__2__Impl rule__TableViewFX__Group__3 ;
    public final void rule__TableViewFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1330:1: ( rule__TableViewFX__Group__2__Impl rule__TableViewFX__Group__3 )
            // InternalJavaFXLang.g:1331:2: rule__TableViewFX__Group__2__Impl rule__TableViewFX__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalJavaFXLang.g:1338:1: rule__TableViewFX__Group__2__Impl : ( ( rule__TableViewFX__NameAssignment_2 ) ) ;
    public final void rule__TableViewFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1342:1: ( ( ( rule__TableViewFX__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:1343:1: ( ( rule__TableViewFX__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:1343:1: ( ( rule__TableViewFX__NameAssignment_2 ) )
            // InternalJavaFXLang.g:1344:2: ( rule__TableViewFX__NameAssignment_2 )
            {
             before(grammarAccess.getTableViewFXAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:1345:2: ( rule__TableViewFX__NameAssignment_2 )
            // InternalJavaFXLang.g:1345:3: rule__TableViewFX__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TableViewFX__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableViewFXAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalJavaFXLang.g:1353:1: rule__TableViewFX__Group__3 : rule__TableViewFX__Group__3__Impl rule__TableViewFX__Group__4 ;
    public final void rule__TableViewFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1357:1: ( rule__TableViewFX__Group__3__Impl rule__TableViewFX__Group__4 )
            // InternalJavaFXLang.g:1358:2: rule__TableViewFX__Group__3__Impl rule__TableViewFX__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalJavaFXLang.g:1365:1: rule__TableViewFX__Group__3__Impl : ( '{' ) ;
    public final void rule__TableViewFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1369:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1370:1: ( '{' )
            {
            // InternalJavaFXLang.g:1370:1: ( '{' )
            // InternalJavaFXLang.g:1371:2: '{'
            {
             before(grammarAccess.getTableViewFXAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTableViewFXAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalJavaFXLang.g:1380:1: rule__TableViewFX__Group__4 : rule__TableViewFX__Group__4__Impl rule__TableViewFX__Group__5 ;
    public final void rule__TableViewFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1384:1: ( rule__TableViewFX__Group__4__Impl rule__TableViewFX__Group__5 )
            // InternalJavaFXLang.g:1385:2: rule__TableViewFX__Group__4__Impl rule__TableViewFX__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalJavaFXLang.g:1392:1: rule__TableViewFX__Group__4__Impl : ( ( rule__TableViewFX__Group_4__0 )? ) ;
    public final void rule__TableViewFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1396:1: ( ( ( rule__TableViewFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:1397:1: ( ( rule__TableViewFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:1397:1: ( ( rule__TableViewFX__Group_4__0 )? )
            // InternalJavaFXLang.g:1398:2: ( rule__TableViewFX__Group_4__0 )?
            {
             before(grammarAccess.getTableViewFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:1399:2: ( rule__TableViewFX__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJavaFXLang.g:1399:3: rule__TableViewFX__Group_4__0
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
    // InternalJavaFXLang.g:1407:1: rule__TableViewFX__Group__5 : rule__TableViewFX__Group__5__Impl rule__TableViewFX__Group__6 ;
    public final void rule__TableViewFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1411:1: ( rule__TableViewFX__Group__5__Impl rule__TableViewFX__Group__6 )
            // InternalJavaFXLang.g:1412:2: rule__TableViewFX__Group__5__Impl rule__TableViewFX__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalJavaFXLang.g:1419:1: rule__TableViewFX__Group__5__Impl : ( ( rule__TableViewFX__Group_5__0 )? ) ;
    public final void rule__TableViewFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1423:1: ( ( ( rule__TableViewFX__Group_5__0 )? ) )
            // InternalJavaFXLang.g:1424:1: ( ( rule__TableViewFX__Group_5__0 )? )
            {
            // InternalJavaFXLang.g:1424:1: ( ( rule__TableViewFX__Group_5__0 )? )
            // InternalJavaFXLang.g:1425:2: ( rule__TableViewFX__Group_5__0 )?
            {
             before(grammarAccess.getTableViewFXAccess().getGroup_5()); 
            // InternalJavaFXLang.g:1426:2: ( rule__TableViewFX__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJavaFXLang.g:1426:3: rule__TableViewFX__Group_5__0
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
    // InternalJavaFXLang.g:1434:1: rule__TableViewFX__Group__6 : rule__TableViewFX__Group__6__Impl ;
    public final void rule__TableViewFX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1438:1: ( rule__TableViewFX__Group__6__Impl )
            // InternalJavaFXLang.g:1439:2: rule__TableViewFX__Group__6__Impl
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
    // InternalJavaFXLang.g:1445:1: rule__TableViewFX__Group__6__Impl : ( '}' ) ;
    public final void rule__TableViewFX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1449:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1450:1: ( '}' )
            {
            // InternalJavaFXLang.g:1450:1: ( '}' )
            // InternalJavaFXLang.g:1451:2: '}'
            {
             before(grammarAccess.getTableViewFXAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__TableViewFX__Group_4__0"
    // InternalJavaFXLang.g:1461:1: rule__TableViewFX__Group_4__0 : rule__TableViewFX__Group_4__0__Impl rule__TableViewFX__Group_4__1 ;
    public final void rule__TableViewFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1465:1: ( rule__TableViewFX__Group_4__0__Impl rule__TableViewFX__Group_4__1 )
            // InternalJavaFXLang.g:1466:2: rule__TableViewFX__Group_4__0__Impl rule__TableViewFX__Group_4__1
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
    // InternalJavaFXLang.g:1473:1: rule__TableViewFX__Group_4__0__Impl : ( 'usedModel' ) ;
    public final void rule__TableViewFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1477:1: ( ( 'usedModel' ) )
            // InternalJavaFXLang.g:1478:1: ( 'usedModel' )
            {
            // InternalJavaFXLang.g:1478:1: ( 'usedModel' )
            // InternalJavaFXLang.g:1479:2: 'usedModel'
            {
             before(grammarAccess.getTableViewFXAccess().getUsedModelKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalJavaFXLang.g:1488:1: rule__TableViewFX__Group_4__1 : rule__TableViewFX__Group_4__1__Impl ;
    public final void rule__TableViewFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1492:1: ( rule__TableViewFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:1493:2: rule__TableViewFX__Group_4__1__Impl
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
    // InternalJavaFXLang.g:1499:1: rule__TableViewFX__Group_4__1__Impl : ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) ) ;
    public final void rule__TableViewFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1503:1: ( ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:1504:1: ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:1504:1: ( ( rule__TableViewFX__UsedModelAssignment_4_1 ) )
            // InternalJavaFXLang.g:1505:2: ( rule__TableViewFX__UsedModelAssignment_4_1 )
            {
             before(grammarAccess.getTableViewFXAccess().getUsedModelAssignment_4_1()); 
            // InternalJavaFXLang.g:1506:2: ( rule__TableViewFX__UsedModelAssignment_4_1 )
            // InternalJavaFXLang.g:1506:3: rule__TableViewFX__UsedModelAssignment_4_1
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
    // InternalJavaFXLang.g:1515:1: rule__TableViewFX__Group_5__0 : rule__TableViewFX__Group_5__0__Impl rule__TableViewFX__Group_5__1 ;
    public final void rule__TableViewFX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1519:1: ( rule__TableViewFX__Group_5__0__Impl rule__TableViewFX__Group_5__1 )
            // InternalJavaFXLang.g:1520:2: rule__TableViewFX__Group_5__0__Impl rule__TableViewFX__Group_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalJavaFXLang.g:1527:1: rule__TableViewFX__Group_5__0__Impl : ( 'columns' ) ;
    public final void rule__TableViewFX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1531:1: ( ( 'columns' ) )
            // InternalJavaFXLang.g:1532:1: ( 'columns' )
            {
            // InternalJavaFXLang.g:1532:1: ( 'columns' )
            // InternalJavaFXLang.g:1533:2: 'columns'
            {
             before(grammarAccess.getTableViewFXAccess().getColumnsKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTableViewFXAccess().getColumnsKeyword_5_0()); 

            }


            }

        }
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
    // InternalJavaFXLang.g:1542:1: rule__TableViewFX__Group_5__1 : rule__TableViewFX__Group_5__1__Impl rule__TableViewFX__Group_5__2 ;
    public final void rule__TableViewFX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1546:1: ( rule__TableViewFX__Group_5__1__Impl rule__TableViewFX__Group_5__2 )
            // InternalJavaFXLang.g:1547:2: rule__TableViewFX__Group_5__1__Impl rule__TableViewFX__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__TableViewFX__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group_5__2();

            state._fsp--;


            }

        }
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
    // InternalJavaFXLang.g:1554:1: rule__TableViewFX__Group_5__1__Impl : ( '{' ) ;
    public final void rule__TableViewFX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1558:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1559:1: ( '{' )
            {
            // InternalJavaFXLang.g:1559:1: ( '{' )
            // InternalJavaFXLang.g:1560:2: '{'
            {
             before(grammarAccess.getTableViewFXAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTableViewFXAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__TableViewFX__Group_5__2"
    // InternalJavaFXLang.g:1569:1: rule__TableViewFX__Group_5__2 : rule__TableViewFX__Group_5__2__Impl rule__TableViewFX__Group_5__3 ;
    public final void rule__TableViewFX__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1573:1: ( rule__TableViewFX__Group_5__2__Impl rule__TableViewFX__Group_5__3 )
            // InternalJavaFXLang.g:1574:2: rule__TableViewFX__Group_5__2__Impl rule__TableViewFX__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__TableViewFX__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableViewFX__Group_5__2"


    // $ANTLR start "rule__TableViewFX__Group_5__2__Impl"
    // InternalJavaFXLang.g:1581:1: rule__TableViewFX__Group_5__2__Impl : ( ( rule__TableViewFX__ColumnsAssignment_5_2 ) ) ;
    public final void rule__TableViewFX__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1585:1: ( ( ( rule__TableViewFX__ColumnsAssignment_5_2 ) ) )
            // InternalJavaFXLang.g:1586:1: ( ( rule__TableViewFX__ColumnsAssignment_5_2 ) )
            {
            // InternalJavaFXLang.g:1586:1: ( ( rule__TableViewFX__ColumnsAssignment_5_2 ) )
            // InternalJavaFXLang.g:1587:2: ( rule__TableViewFX__ColumnsAssignment_5_2 )
            {
             before(grammarAccess.getTableViewFXAccess().getColumnsAssignment_5_2()); 
            // InternalJavaFXLang.g:1588:2: ( rule__TableViewFX__ColumnsAssignment_5_2 )
            // InternalJavaFXLang.g:1588:3: rule__TableViewFX__ColumnsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__TableViewFX__ColumnsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTableViewFXAccess().getColumnsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableViewFX__Group_5__2__Impl"


    // $ANTLR start "rule__TableViewFX__Group_5__3"
    // InternalJavaFXLang.g:1596:1: rule__TableViewFX__Group_5__3 : rule__TableViewFX__Group_5__3__Impl rule__TableViewFX__Group_5__4 ;
    public final void rule__TableViewFX__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1600:1: ( rule__TableViewFX__Group_5__3__Impl rule__TableViewFX__Group_5__4 )
            // InternalJavaFXLang.g:1601:2: rule__TableViewFX__Group_5__3__Impl rule__TableViewFX__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__TableViewFX__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableViewFX__Group_5__3"


    // $ANTLR start "rule__TableViewFX__Group_5__3__Impl"
    // InternalJavaFXLang.g:1608:1: rule__TableViewFX__Group_5__3__Impl : ( ( rule__TableViewFX__Group_5_3__0 )* ) ;
    public final void rule__TableViewFX__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1612:1: ( ( ( rule__TableViewFX__Group_5_3__0 )* ) )
            // InternalJavaFXLang.g:1613:1: ( ( rule__TableViewFX__Group_5_3__0 )* )
            {
            // InternalJavaFXLang.g:1613:1: ( ( rule__TableViewFX__Group_5_3__0 )* )
            // InternalJavaFXLang.g:1614:2: ( rule__TableViewFX__Group_5_3__0 )*
            {
             before(grammarAccess.getTableViewFXAccess().getGroup_5_3()); 
            // InternalJavaFXLang.g:1615:2: ( rule__TableViewFX__Group_5_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJavaFXLang.g:1615:3: rule__TableViewFX__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__TableViewFX__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTableViewFXAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableViewFX__Group_5__3__Impl"


    // $ANTLR start "rule__TableViewFX__Group_5__4"
    // InternalJavaFXLang.g:1623:1: rule__TableViewFX__Group_5__4 : rule__TableViewFX__Group_5__4__Impl ;
    public final void rule__TableViewFX__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1627:1: ( rule__TableViewFX__Group_5__4__Impl )
            // InternalJavaFXLang.g:1628:2: rule__TableViewFX__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableViewFX__Group_5__4"


    // $ANTLR start "rule__TableViewFX__Group_5__4__Impl"
    // InternalJavaFXLang.g:1634:1: rule__TableViewFX__Group_5__4__Impl : ( '}' ) ;
    public final void rule__TableViewFX__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1638:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1639:1: ( '}' )
            {
            // InternalJavaFXLang.g:1639:1: ( '}' )
            // InternalJavaFXLang.g:1640:2: '}'
            {
             before(grammarAccess.getTableViewFXAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTableViewFXAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableViewFX__Group_5__4__Impl"


    // $ANTLR start "rule__TableViewFX__Group_5_3__0"
    // InternalJavaFXLang.g:1650:1: rule__TableViewFX__Group_5_3__0 : rule__TableViewFX__Group_5_3__0__Impl rule__TableViewFX__Group_5_3__1 ;
    public final void rule__TableViewFX__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1654:1: ( rule__TableViewFX__Group_5_3__0__Impl rule__TableViewFX__Group_5_3__1 )
            // InternalJavaFXLang.g:1655:2: rule__TableViewFX__Group_5_3__0__Impl rule__TableViewFX__Group_5_3__1
            {
            pushFollow(FOLLOW_14);
            rule__TableViewFX__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableViewFX__Group_5_3__0"


    // $ANTLR start "rule__TableViewFX__Group_5_3__0__Impl"
    // InternalJavaFXLang.g:1662:1: rule__TableViewFX__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__TableViewFX__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1666:1: ( ( ',' ) )
            // InternalJavaFXLang.g:1667:1: ( ',' )
            {
            // InternalJavaFXLang.g:1667:1: ( ',' )
            // InternalJavaFXLang.g:1668:2: ','
            {
             before(grammarAccess.getTableViewFXAccess().getCommaKeyword_5_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTableViewFXAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableViewFX__Group_5_3__0__Impl"


    // $ANTLR start "rule__TableViewFX__Group_5_3__1"
    // InternalJavaFXLang.g:1677:1: rule__TableViewFX__Group_5_3__1 : rule__TableViewFX__Group_5_3__1__Impl ;
    public final void rule__TableViewFX__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1681:1: ( rule__TableViewFX__Group_5_3__1__Impl )
            // InternalJavaFXLang.g:1682:2: rule__TableViewFX__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableViewFX__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableViewFX__Group_5_3__1"


    // $ANTLR start "rule__TableViewFX__Group_5_3__1__Impl"
    // InternalJavaFXLang.g:1688:1: rule__TableViewFX__Group_5_3__1__Impl : ( ( rule__TableViewFX__ColumnsAssignment_5_3_1 ) ) ;
    public final void rule__TableViewFX__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1692:1: ( ( ( rule__TableViewFX__ColumnsAssignment_5_3_1 ) ) )
            // InternalJavaFXLang.g:1693:1: ( ( rule__TableViewFX__ColumnsAssignment_5_3_1 ) )
            {
            // InternalJavaFXLang.g:1693:1: ( ( rule__TableViewFX__ColumnsAssignment_5_3_1 ) )
            // InternalJavaFXLang.g:1694:2: ( rule__TableViewFX__ColumnsAssignment_5_3_1 )
            {
             before(grammarAccess.getTableViewFXAccess().getColumnsAssignment_5_3_1()); 
            // InternalJavaFXLang.g:1695:2: ( rule__TableViewFX__ColumnsAssignment_5_3_1 )
            // InternalJavaFXLang.g:1695:3: rule__TableViewFX__ColumnsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TableViewFX__ColumnsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTableViewFXAccess().getColumnsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableViewFX__Group_5_3__1__Impl"


    // $ANTLR start "rule__TableColumnFX__Group__0"
    // InternalJavaFXLang.g:1704:1: rule__TableColumnFX__Group__0 : rule__TableColumnFX__Group__0__Impl rule__TableColumnFX__Group__1 ;
    public final void rule__TableColumnFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1708:1: ( rule__TableColumnFX__Group__0__Impl rule__TableColumnFX__Group__1 )
            // InternalJavaFXLang.g:1709:2: rule__TableColumnFX__Group__0__Impl rule__TableColumnFX__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalJavaFXLang.g:1716:1: rule__TableColumnFX__Group__0__Impl : ( () ) ;
    public final void rule__TableColumnFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1720:1: ( ( () ) )
            // InternalJavaFXLang.g:1721:1: ( () )
            {
            // InternalJavaFXLang.g:1721:1: ( () )
            // InternalJavaFXLang.g:1722:2: ()
            {
             before(grammarAccess.getTableColumnFXAccess().getTableColumnFXAction_0()); 
            // InternalJavaFXLang.g:1723:2: ()
            // InternalJavaFXLang.g:1723:3: 
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
    // InternalJavaFXLang.g:1731:1: rule__TableColumnFX__Group__1 : rule__TableColumnFX__Group__1__Impl rule__TableColumnFX__Group__2 ;
    public final void rule__TableColumnFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1735:1: ( rule__TableColumnFX__Group__1__Impl rule__TableColumnFX__Group__2 )
            // InternalJavaFXLang.g:1736:2: rule__TableColumnFX__Group__1__Impl rule__TableColumnFX__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalJavaFXLang.g:1743:1: rule__TableColumnFX__Group__1__Impl : ( 'TableColumnFX' ) ;
    public final void rule__TableColumnFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1747:1: ( ( 'TableColumnFX' ) )
            // InternalJavaFXLang.g:1748:1: ( 'TableColumnFX' )
            {
            // InternalJavaFXLang.g:1748:1: ( 'TableColumnFX' )
            // InternalJavaFXLang.g:1749:2: 'TableColumnFX'
            {
             before(grammarAccess.getTableColumnFXAccess().getTableColumnFXKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTableColumnFXAccess().getTableColumnFXKeyword_1()); 

            }


            }

        }
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
    // InternalJavaFXLang.g:1758:1: rule__TableColumnFX__Group__2 : rule__TableColumnFX__Group__2__Impl rule__TableColumnFX__Group__3 ;
    public final void rule__TableColumnFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1762:1: ( rule__TableColumnFX__Group__2__Impl rule__TableColumnFX__Group__3 )
            // InternalJavaFXLang.g:1763:2: rule__TableColumnFX__Group__2__Impl rule__TableColumnFX__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalJavaFXLang.g:1770:1: rule__TableColumnFX__Group__2__Impl : ( ( rule__TableColumnFX__NameAssignment_2 ) ) ;
    public final void rule__TableColumnFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1774:1: ( ( ( rule__TableColumnFX__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:1775:1: ( ( rule__TableColumnFX__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:1775:1: ( ( rule__TableColumnFX__NameAssignment_2 ) )
            // InternalJavaFXLang.g:1776:2: ( rule__TableColumnFX__NameAssignment_2 )
            {
             before(grammarAccess.getTableColumnFXAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:1777:2: ( rule__TableColumnFX__NameAssignment_2 )
            // InternalJavaFXLang.g:1777:3: rule__TableColumnFX__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TableColumnFX__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableColumnFXAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalJavaFXLang.g:1785:1: rule__TableColumnFX__Group__3 : rule__TableColumnFX__Group__3__Impl rule__TableColumnFX__Group__4 ;
    public final void rule__TableColumnFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1789:1: ( rule__TableColumnFX__Group__3__Impl rule__TableColumnFX__Group__4 )
            // InternalJavaFXLang.g:1790:2: rule__TableColumnFX__Group__3__Impl rule__TableColumnFX__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalJavaFXLang.g:1797:1: rule__TableColumnFX__Group__3__Impl : ( '{' ) ;
    public final void rule__TableColumnFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1801:1: ( ( '{' ) )
            // InternalJavaFXLang.g:1802:1: ( '{' )
            {
            // InternalJavaFXLang.g:1802:1: ( '{' )
            // InternalJavaFXLang.g:1803:2: '{'
            {
             before(grammarAccess.getTableColumnFXAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTableColumnFXAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalJavaFXLang.g:1812:1: rule__TableColumnFX__Group__4 : rule__TableColumnFX__Group__4__Impl rule__TableColumnFX__Group__5 ;
    public final void rule__TableColumnFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1816:1: ( rule__TableColumnFX__Group__4__Impl rule__TableColumnFX__Group__5 )
            // InternalJavaFXLang.g:1817:2: rule__TableColumnFX__Group__4__Impl rule__TableColumnFX__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalJavaFXLang.g:1824:1: rule__TableColumnFX__Group__4__Impl : ( ( rule__TableColumnFX__Group_4__0 )? ) ;
    public final void rule__TableColumnFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1828:1: ( ( ( rule__TableColumnFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:1829:1: ( ( rule__TableColumnFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:1829:1: ( ( rule__TableColumnFX__Group_4__0 )? )
            // InternalJavaFXLang.g:1830:2: ( rule__TableColumnFX__Group_4__0 )?
            {
             before(grammarAccess.getTableColumnFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:1831:2: ( rule__TableColumnFX__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJavaFXLang.g:1831:3: rule__TableColumnFX__Group_4__0
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
    // InternalJavaFXLang.g:1839:1: rule__TableColumnFX__Group__5 : rule__TableColumnFX__Group__5__Impl ;
    public final void rule__TableColumnFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1843:1: ( rule__TableColumnFX__Group__5__Impl )
            // InternalJavaFXLang.g:1844:2: rule__TableColumnFX__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableColumnFX__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalJavaFXLang.g:1850:1: rule__TableColumnFX__Group__5__Impl : ( '}' ) ;
    public final void rule__TableColumnFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1854:1: ( ( '}' ) )
            // InternalJavaFXLang.g:1855:1: ( '}' )
            {
            // InternalJavaFXLang.g:1855:1: ( '}' )
            // InternalJavaFXLang.g:1856:2: '}'
            {
             before(grammarAccess.getTableColumnFXAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTableColumnFXAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__TableColumnFX__Group_4__0"
    // InternalJavaFXLang.g:1866:1: rule__TableColumnFX__Group_4__0 : rule__TableColumnFX__Group_4__0__Impl rule__TableColumnFX__Group_4__1 ;
    public final void rule__TableColumnFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1870:1: ( rule__TableColumnFX__Group_4__0__Impl rule__TableColumnFX__Group_4__1 )
            // InternalJavaFXLang.g:1871:2: rule__TableColumnFX__Group_4__0__Impl rule__TableColumnFX__Group_4__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalJavaFXLang.g:1878:1: rule__TableColumnFX__Group_4__0__Impl : ( 'width' ) ;
    public final void rule__TableColumnFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1882:1: ( ( 'width' ) )
            // InternalJavaFXLang.g:1883:1: ( 'width' )
            {
            // InternalJavaFXLang.g:1883:1: ( 'width' )
            // InternalJavaFXLang.g:1884:2: 'width'
            {
             before(grammarAccess.getTableColumnFXAccess().getWidthKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalJavaFXLang.g:1893:1: rule__TableColumnFX__Group_4__1 : rule__TableColumnFX__Group_4__1__Impl ;
    public final void rule__TableColumnFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1897:1: ( rule__TableColumnFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:1898:2: rule__TableColumnFX__Group_4__1__Impl
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
    // InternalJavaFXLang.g:1904:1: rule__TableColumnFX__Group_4__1__Impl : ( ( rule__TableColumnFX__WidthAssignment_4_1 ) ) ;
    public final void rule__TableColumnFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1908:1: ( ( ( rule__TableColumnFX__WidthAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:1909:1: ( ( rule__TableColumnFX__WidthAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:1909:1: ( ( rule__TableColumnFX__WidthAssignment_4_1 ) )
            // InternalJavaFXLang.g:1910:2: ( rule__TableColumnFX__WidthAssignment_4_1 )
            {
             before(grammarAccess.getTableColumnFXAccess().getWidthAssignment_4_1()); 
            // InternalJavaFXLang.g:1911:2: ( rule__TableColumnFX__WidthAssignment_4_1 )
            // InternalJavaFXLang.g:1911:3: rule__TableColumnFX__WidthAssignment_4_1
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


    // $ANTLR start "rule__EInt__Group__0"
    // InternalJavaFXLang.g:1920:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1924:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalJavaFXLang.g:1925:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalJavaFXLang.g:1932:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1936:1: ( ( ( '-' )? ) )
            // InternalJavaFXLang.g:1937:1: ( ( '-' )? )
            {
            // InternalJavaFXLang.g:1937:1: ( ( '-' )? )
            // InternalJavaFXLang.g:1938:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalJavaFXLang.g:1939:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJavaFXLang.g:1939:3: '-'
                    {
                    match(input,25,FOLLOW_2); 

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
    // InternalJavaFXLang.g:1947:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1951:1: ( rule__EInt__Group__1__Impl )
            // InternalJavaFXLang.g:1952:2: rule__EInt__Group__1__Impl
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
    // InternalJavaFXLang.g:1958:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1962:1: ( ( RULE_INT ) )
            // InternalJavaFXLang.g:1963:1: ( RULE_INT )
            {
            // InternalJavaFXLang.g:1963:1: ( RULE_INT )
            // InternalJavaFXLang.g:1964:2: RULE_INT
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
    // InternalJavaFXLang.g:1974:1: rule__AttributeFX__Group__0 : rule__AttributeFX__Group__0__Impl rule__AttributeFX__Group__1 ;
    public final void rule__AttributeFX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1978:1: ( rule__AttributeFX__Group__0__Impl rule__AttributeFX__Group__1 )
            // InternalJavaFXLang.g:1979:2: rule__AttributeFX__Group__0__Impl rule__AttributeFX__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalJavaFXLang.g:1986:1: rule__AttributeFX__Group__0__Impl : ( () ) ;
    public final void rule__AttributeFX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:1990:1: ( ( () ) )
            // InternalJavaFXLang.g:1991:1: ( () )
            {
            // InternalJavaFXLang.g:1991:1: ( () )
            // InternalJavaFXLang.g:1992:2: ()
            {
             before(grammarAccess.getAttributeFXAccess().getAttributeFXAction_0()); 
            // InternalJavaFXLang.g:1993:2: ()
            // InternalJavaFXLang.g:1993:3: 
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
    // InternalJavaFXLang.g:2001:1: rule__AttributeFX__Group__1 : rule__AttributeFX__Group__1__Impl rule__AttributeFX__Group__2 ;
    public final void rule__AttributeFX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2005:1: ( rule__AttributeFX__Group__1__Impl rule__AttributeFX__Group__2 )
            // InternalJavaFXLang.g:2006:2: rule__AttributeFX__Group__1__Impl rule__AttributeFX__Group__2
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
    // InternalJavaFXLang.g:2013:1: rule__AttributeFX__Group__1__Impl : ( 'AttributeFX' ) ;
    public final void rule__AttributeFX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2017:1: ( ( 'AttributeFX' ) )
            // InternalJavaFXLang.g:2018:1: ( 'AttributeFX' )
            {
            // InternalJavaFXLang.g:2018:1: ( 'AttributeFX' )
            // InternalJavaFXLang.g:2019:2: 'AttributeFX'
            {
             before(grammarAccess.getAttributeFXAccess().getAttributeFXKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAttributeFXAccess().getAttributeFXKeyword_1()); 

            }


            }

        }
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
    // InternalJavaFXLang.g:2028:1: rule__AttributeFX__Group__2 : rule__AttributeFX__Group__2__Impl rule__AttributeFX__Group__3 ;
    public final void rule__AttributeFX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2032:1: ( rule__AttributeFX__Group__2__Impl rule__AttributeFX__Group__3 )
            // InternalJavaFXLang.g:2033:2: rule__AttributeFX__Group__2__Impl rule__AttributeFX__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__AttributeFX__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFX__Group__3();

            state._fsp--;


            }

        }
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
    // InternalJavaFXLang.g:2040:1: rule__AttributeFX__Group__2__Impl : ( ( rule__AttributeFX__NameAssignment_2 ) ) ;
    public final void rule__AttributeFX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2044:1: ( ( ( rule__AttributeFX__NameAssignment_2 ) ) )
            // InternalJavaFXLang.g:2045:1: ( ( rule__AttributeFX__NameAssignment_2 ) )
            {
            // InternalJavaFXLang.g:2045:1: ( ( rule__AttributeFX__NameAssignment_2 ) )
            // InternalJavaFXLang.g:2046:2: ( rule__AttributeFX__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeFXAccess().getNameAssignment_2()); 
            // InternalJavaFXLang.g:2047:2: ( rule__AttributeFX__NameAssignment_2 )
            // InternalJavaFXLang.g:2047:3: rule__AttributeFX__NameAssignment_2
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


    // $ANTLR start "rule__AttributeFX__Group__3"
    // InternalJavaFXLang.g:2055:1: rule__AttributeFX__Group__3 : rule__AttributeFX__Group__3__Impl rule__AttributeFX__Group__4 ;
    public final void rule__AttributeFX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2059:1: ( rule__AttributeFX__Group__3__Impl rule__AttributeFX__Group__4 )
            // InternalJavaFXLang.g:2060:2: rule__AttributeFX__Group__3__Impl rule__AttributeFX__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__AttributeFX__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFX__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFX__Group__3"


    // $ANTLR start "rule__AttributeFX__Group__3__Impl"
    // InternalJavaFXLang.g:2067:1: rule__AttributeFX__Group__3__Impl : ( '{' ) ;
    public final void rule__AttributeFX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2071:1: ( ( '{' ) )
            // InternalJavaFXLang.g:2072:1: ( '{' )
            {
            // InternalJavaFXLang.g:2072:1: ( '{' )
            // InternalJavaFXLang.g:2073:2: '{'
            {
             before(grammarAccess.getAttributeFXAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAttributeFXAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFX__Group__3__Impl"


    // $ANTLR start "rule__AttributeFX__Group__4"
    // InternalJavaFXLang.g:2082:1: rule__AttributeFX__Group__4 : rule__AttributeFX__Group__4__Impl rule__AttributeFX__Group__5 ;
    public final void rule__AttributeFX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2086:1: ( rule__AttributeFX__Group__4__Impl rule__AttributeFX__Group__5 )
            // InternalJavaFXLang.g:2087:2: rule__AttributeFX__Group__4__Impl rule__AttributeFX__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__AttributeFX__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFX__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFX__Group__4"


    // $ANTLR start "rule__AttributeFX__Group__4__Impl"
    // InternalJavaFXLang.g:2094:1: rule__AttributeFX__Group__4__Impl : ( ( rule__AttributeFX__Group_4__0 )? ) ;
    public final void rule__AttributeFX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2098:1: ( ( ( rule__AttributeFX__Group_4__0 )? ) )
            // InternalJavaFXLang.g:2099:1: ( ( rule__AttributeFX__Group_4__0 )? )
            {
            // InternalJavaFXLang.g:2099:1: ( ( rule__AttributeFX__Group_4__0 )? )
            // InternalJavaFXLang.g:2100:2: ( rule__AttributeFX__Group_4__0 )?
            {
             before(grammarAccess.getAttributeFXAccess().getGroup_4()); 
            // InternalJavaFXLang.g:2101:2: ( rule__AttributeFX__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJavaFXLang.g:2101:3: rule__AttributeFX__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeFX__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeFXAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFX__Group__4__Impl"


    // $ANTLR start "rule__AttributeFX__Group__5"
    // InternalJavaFXLang.g:2109:1: rule__AttributeFX__Group__5 : rule__AttributeFX__Group__5__Impl ;
    public final void rule__AttributeFX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2113:1: ( rule__AttributeFX__Group__5__Impl )
            // InternalJavaFXLang.g:2114:2: rule__AttributeFX__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFX__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFX__Group__5"


    // $ANTLR start "rule__AttributeFX__Group__5__Impl"
    // InternalJavaFXLang.g:2120:1: rule__AttributeFX__Group__5__Impl : ( '}' ) ;
    public final void rule__AttributeFX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2124:1: ( ( '}' ) )
            // InternalJavaFXLang.g:2125:1: ( '}' )
            {
            // InternalJavaFXLang.g:2125:1: ( '}' )
            // InternalJavaFXLang.g:2126:2: '}'
            {
             before(grammarAccess.getAttributeFXAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAttributeFXAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFX__Group__5__Impl"


    // $ANTLR start "rule__AttributeFX__Group_4__0"
    // InternalJavaFXLang.g:2136:1: rule__AttributeFX__Group_4__0 : rule__AttributeFX__Group_4__0__Impl rule__AttributeFX__Group_4__1 ;
    public final void rule__AttributeFX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2140:1: ( rule__AttributeFX__Group_4__0__Impl rule__AttributeFX__Group_4__1 )
            // InternalJavaFXLang.g:2141:2: rule__AttributeFX__Group_4__0__Impl rule__AttributeFX__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__AttributeFX__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFX__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFX__Group_4__0"


    // $ANTLR start "rule__AttributeFX__Group_4__0__Impl"
    // InternalJavaFXLang.g:2148:1: rule__AttributeFX__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__AttributeFX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2152:1: ( ( 'type' ) )
            // InternalJavaFXLang.g:2153:1: ( 'type' )
            {
            // InternalJavaFXLang.g:2153:1: ( 'type' )
            // InternalJavaFXLang.g:2154:2: 'type'
            {
             before(grammarAccess.getAttributeFXAccess().getTypeKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAttributeFXAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFX__Group_4__0__Impl"


    // $ANTLR start "rule__AttributeFX__Group_4__1"
    // InternalJavaFXLang.g:2163:1: rule__AttributeFX__Group_4__1 : rule__AttributeFX__Group_4__1__Impl ;
    public final void rule__AttributeFX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2167:1: ( rule__AttributeFX__Group_4__1__Impl )
            // InternalJavaFXLang.g:2168:2: rule__AttributeFX__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFX__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFX__Group_4__1"


    // $ANTLR start "rule__AttributeFX__Group_4__1__Impl"
    // InternalJavaFXLang.g:2174:1: rule__AttributeFX__Group_4__1__Impl : ( ( rule__AttributeFX__TypeAssignment_4_1 ) ) ;
    public final void rule__AttributeFX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2178:1: ( ( ( rule__AttributeFX__TypeAssignment_4_1 ) ) )
            // InternalJavaFXLang.g:2179:1: ( ( rule__AttributeFX__TypeAssignment_4_1 ) )
            {
            // InternalJavaFXLang.g:2179:1: ( ( rule__AttributeFX__TypeAssignment_4_1 ) )
            // InternalJavaFXLang.g:2180:2: ( rule__AttributeFX__TypeAssignment_4_1 )
            {
             before(grammarAccess.getAttributeFXAccess().getTypeAssignment_4_1()); 
            // InternalJavaFXLang.g:2181:2: ( rule__AttributeFX__TypeAssignment_4_1 )
            // InternalJavaFXLang.g:2181:3: rule__AttributeFX__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFX__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFXAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFX__Group_4__1__Impl"


    // $ANTLR start "rule__ProjectFX__NameAssignment_2"
    // InternalJavaFXLang.g:2190:1: rule__ProjectFX__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ProjectFX__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2194:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:2195:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:2195:2: ( ruleEString )
            // InternalJavaFXLang.g:2196:3: ruleEString
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
    // InternalJavaFXLang.g:2205:1: rule__ProjectFX__PackagePathAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ProjectFX__PackagePathAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2209:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:2210:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:2210:2: ( ruleEString )
            // InternalJavaFXLang.g:2211:3: ruleEString
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
    // InternalJavaFXLang.g:2220:1: rule__ProjectFX__ControlsAssignment_5_2 : ( ruleControlFX ) ;
    public final void rule__ProjectFX__ControlsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2224:1: ( ( ruleControlFX ) )
            // InternalJavaFXLang.g:2225:2: ( ruleControlFX )
            {
            // InternalJavaFXLang.g:2225:2: ( ruleControlFX )
            // InternalJavaFXLang.g:2226:3: ruleControlFX
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


    // $ANTLR start "rule__ProjectFX__ControlsAssignment_5_3_1"
    // InternalJavaFXLang.g:2235:1: rule__ProjectFX__ControlsAssignment_5_3_1 : ( ruleControlFX ) ;
    public final void rule__ProjectFX__ControlsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2239:1: ( ( ruleControlFX ) )
            // InternalJavaFXLang.g:2240:2: ( ruleControlFX )
            {
            // InternalJavaFXLang.g:2240:2: ( ruleControlFX )
            // InternalJavaFXLang.g:2241:3: ruleControlFX
            {
             before(grammarAccess.getProjectFXAccess().getControlsControlFXParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleControlFX();

            state._fsp--;

             after(grammarAccess.getProjectFXAccess().getControlsControlFXParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectFX__ControlsAssignment_5_3_1"


    // $ANTLR start "rule__ProjectFX__ModelsAssignment_6_2"
    // InternalJavaFXLang.g:2250:1: rule__ProjectFX__ModelsAssignment_6_2 : ( ruleModelFX ) ;
    public final void rule__ProjectFX__ModelsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2254:1: ( ( ruleModelFX ) )
            // InternalJavaFXLang.g:2255:2: ( ruleModelFX )
            {
            // InternalJavaFXLang.g:2255:2: ( ruleModelFX )
            // InternalJavaFXLang.g:2256:3: ruleModelFX
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


    // $ANTLR start "rule__ProjectFX__ModelsAssignment_6_3_1"
    // InternalJavaFXLang.g:2265:1: rule__ProjectFX__ModelsAssignment_6_3_1 : ( ruleModelFX ) ;
    public final void rule__ProjectFX__ModelsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2269:1: ( ( ruleModelFX ) )
            // InternalJavaFXLang.g:2270:2: ( ruleModelFX )
            {
            // InternalJavaFXLang.g:2270:2: ( ruleModelFX )
            // InternalJavaFXLang.g:2271:3: ruleModelFX
            {
             before(grammarAccess.getProjectFXAccess().getModelsModelFXParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModelFX();

            state._fsp--;

             after(grammarAccess.getProjectFXAccess().getModelsModelFXParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectFX__ModelsAssignment_6_3_1"


    // $ANTLR start "rule__ModelFX__NameAssignment_2"
    // InternalJavaFXLang.g:2280:1: rule__ModelFX__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ModelFX__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2284:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:2285:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:2285:2: ( ruleEString )
            // InternalJavaFXLang.g:2286:3: ruleEString
            {
             before(grammarAccess.getModelFXAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModelFXAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__NameAssignment_2"


    // $ANTLR start "rule__ModelFX__AttributesAssignment_4_2"
    // InternalJavaFXLang.g:2295:1: rule__ModelFX__AttributesAssignment_4_2 : ( ruleAttributeFX ) ;
    public final void rule__ModelFX__AttributesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2299:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:2300:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:2300:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:2301:3: ruleAttributeFX
            {
             before(grammarAccess.getModelFXAccess().getAttributesAttributeFXParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeFX();

            state._fsp--;

             after(grammarAccess.getModelFXAccess().getAttributesAttributeFXParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__AttributesAssignment_4_2"


    // $ANTLR start "rule__ModelFX__AttributesAssignment_4_3_1"
    // InternalJavaFXLang.g:2310:1: rule__ModelFX__AttributesAssignment_4_3_1 : ( ruleAttributeFX ) ;
    public final void rule__ModelFX__AttributesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2314:1: ( ( ruleAttributeFX ) )
            // InternalJavaFXLang.g:2315:2: ( ruleAttributeFX )
            {
            // InternalJavaFXLang.g:2315:2: ( ruleAttributeFX )
            // InternalJavaFXLang.g:2316:3: ruleAttributeFX
            {
             before(grammarAccess.getModelFXAccess().getAttributesAttributeFXParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeFX();

            state._fsp--;

             after(grammarAccess.getModelFXAccess().getAttributesAttributeFXParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFX__AttributesAssignment_4_3_1"


    // $ANTLR start "rule__TableViewFX__NameAssignment_2"
    // InternalJavaFXLang.g:2325:1: rule__TableViewFX__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__TableViewFX__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2329:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:2330:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:2330:2: ( ruleEString )
            // InternalJavaFXLang.g:2331:3: ruleEString
            {
             before(grammarAccess.getTableViewFXAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableViewFXAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableViewFX__NameAssignment_2"


    // $ANTLR start "rule__TableViewFX__UsedModelAssignment_4_1"
    // InternalJavaFXLang.g:2340:1: rule__TableViewFX__UsedModelAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__TableViewFX__UsedModelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2344:1: ( ( ( ruleEString ) ) )
            // InternalJavaFXLang.g:2345:2: ( ( ruleEString ) )
            {
            // InternalJavaFXLang.g:2345:2: ( ( ruleEString ) )
            // InternalJavaFXLang.g:2346:3: ( ruleEString )
            {
             before(grammarAccess.getTableViewFXAccess().getUsedModelModelFXCrossReference_4_1_0()); 
            // InternalJavaFXLang.g:2347:3: ( ruleEString )
            // InternalJavaFXLang.g:2348:4: ruleEString
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


    // $ANTLR start "rule__TableViewFX__ColumnsAssignment_5_2"
    // InternalJavaFXLang.g:2359:1: rule__TableViewFX__ColumnsAssignment_5_2 : ( ruleTableColumnFX ) ;
    public final void rule__TableViewFX__ColumnsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2363:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:2364:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:2364:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:2365:3: ruleTableColumnFX
            {
             before(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTableColumnFX();

            state._fsp--;

             after(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableViewFX__ColumnsAssignment_5_2"


    // $ANTLR start "rule__TableViewFX__ColumnsAssignment_5_3_1"
    // InternalJavaFXLang.g:2374:1: rule__TableViewFX__ColumnsAssignment_5_3_1 : ( ruleTableColumnFX ) ;
    public final void rule__TableViewFX__ColumnsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2378:1: ( ( ruleTableColumnFX ) )
            // InternalJavaFXLang.g:2379:2: ( ruleTableColumnFX )
            {
            // InternalJavaFXLang.g:2379:2: ( ruleTableColumnFX )
            // InternalJavaFXLang.g:2380:3: ruleTableColumnFX
            {
             before(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTableColumnFX();

            state._fsp--;

             after(grammarAccess.getTableViewFXAccess().getColumnsTableColumnFXParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableViewFX__ColumnsAssignment_5_3_1"


    // $ANTLR start "rule__TableColumnFX__NameAssignment_2"
    // InternalJavaFXLang.g:2389:1: rule__TableColumnFX__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__TableColumnFX__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2393:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:2394:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:2394:2: ( ruleEString )
            // InternalJavaFXLang.g:2395:3: ruleEString
            {
             before(grammarAccess.getTableColumnFXAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableColumnFXAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableColumnFX__NameAssignment_2"


    // $ANTLR start "rule__TableColumnFX__WidthAssignment_4_1"
    // InternalJavaFXLang.g:2404:1: rule__TableColumnFX__WidthAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__TableColumnFX__WidthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2408:1: ( ( ruleEInt ) )
            // InternalJavaFXLang.g:2409:2: ( ruleEInt )
            {
            // InternalJavaFXLang.g:2409:2: ( ruleEInt )
            // InternalJavaFXLang.g:2410:3: ruleEInt
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


    // $ANTLR start "rule__AttributeFX__NameAssignment_2"
    // InternalJavaFXLang.g:2419:1: rule__AttributeFX__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__AttributeFX__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2423:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:2424:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:2424:2: ( ruleEString )
            // InternalJavaFXLang.g:2425:3: ruleEString
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


    // $ANTLR start "rule__AttributeFX__TypeAssignment_4_1"
    // InternalJavaFXLang.g:2434:1: rule__AttributeFX__TypeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__AttributeFX__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaFXLang.g:2438:1: ( ( ruleEString ) )
            // InternalJavaFXLang.g:2439:2: ( ruleEString )
            {
            // InternalJavaFXLang.g:2439:2: ( ruleEString )
            // InternalJavaFXLang.g:2440:3: ruleEString
            {
             before(grammarAccess.getAttributeFXAccess().getTypeEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeFXAccess().getTypeEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFX__TypeAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000002E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000602000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008002000L});

}