package dk.sdu.mdsd.ann.ide.contentassist.antlr.internal;

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
import dk.sdu.mdsd.ann.services.AnnGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'{'", "'alpha'", "'epochs'", "'}'", "'.'", "'hidden'", "'size'", "'activation'", "'in'", "'out'", "'external'", "'(x)'", "'function'", "'='", "'derivative'", "'('", "')'", "'e('", "'nlog('", "'sin('", "'cos('", "'sqrt('", "'pow('", "','", "'sigmoid'", "'tansig'", "'x'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAnnParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnnParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnnParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAnn.g"; }


    	private AnnGrammarAccess grammarAccess;

    	public void setGrammarAccess(AnnGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleANNModel"
    // InternalAnn.g:53:1: entryRuleANNModel : ruleANNModel EOF ;
    public final void entryRuleANNModel() throws RecognitionException {
        try {
            // InternalAnn.g:54:1: ( ruleANNModel EOF )
            // InternalAnn.g:55:1: ruleANNModel EOF
            {
             before(grammarAccess.getANNModelRule()); 
            pushFollow(FOLLOW_1);
            ruleANNModel();

            state._fsp--;

             after(grammarAccess.getANNModelRule()); 
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
    // $ANTLR end "entryRuleANNModel"


    // $ANTLR start "ruleANNModel"
    // InternalAnn.g:62:1: ruleANNModel : ( ( rule__ANNModel__Group__0 ) ) ;
    public final void ruleANNModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:66:2: ( ( ( rule__ANNModel__Group__0 ) ) )
            // InternalAnn.g:67:2: ( ( rule__ANNModel__Group__0 ) )
            {
            // InternalAnn.g:67:2: ( ( rule__ANNModel__Group__0 ) )
            // InternalAnn.g:68:3: ( rule__ANNModel__Group__0 )
            {
             before(grammarAccess.getANNModelAccess().getGroup()); 
            // InternalAnn.g:69:3: ( rule__ANNModel__Group__0 )
            // InternalAnn.g:69:4: rule__ANNModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getANNModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleANNModel"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalAnn.g:78:1: entryRuleDECIMAL : ruleDECIMAL EOF ;
    public final void entryRuleDECIMAL() throws RecognitionException {
        try {
            // InternalAnn.g:79:1: ( ruleDECIMAL EOF )
            // InternalAnn.g:80:1: ruleDECIMAL EOF
            {
             before(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_1);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getDECIMALRule()); 
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
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalAnn.g:87:1: ruleDECIMAL : ( ( rule__DECIMAL__Group__0 ) ) ;
    public final void ruleDECIMAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:91:2: ( ( ( rule__DECIMAL__Group__0 ) ) )
            // InternalAnn.g:92:2: ( ( rule__DECIMAL__Group__0 ) )
            {
            // InternalAnn.g:92:2: ( ( rule__DECIMAL__Group__0 ) )
            // InternalAnn.g:93:3: ( rule__DECIMAL__Group__0 )
            {
             before(grammarAccess.getDECIMALAccess().getGroup()); 
            // InternalAnn.g:94:3: ( rule__DECIMAL__Group__0 )
            // InternalAnn.g:94:4: rule__DECIMAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDECIMALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "entryRuleLayer"
    // InternalAnn.g:103:1: entryRuleLayer : ruleLayer EOF ;
    public final void entryRuleLayer() throws RecognitionException {
        try {
            // InternalAnn.g:104:1: ( ruleLayer EOF )
            // InternalAnn.g:105:1: ruleLayer EOF
            {
             before(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getLayerRule()); 
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
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalAnn.g:112:1: ruleLayer : ( ( rule__Layer__Alternatives ) ) ;
    public final void ruleLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:116:2: ( ( ( rule__Layer__Alternatives ) ) )
            // InternalAnn.g:117:2: ( ( rule__Layer__Alternatives ) )
            {
            // InternalAnn.g:117:2: ( ( rule__Layer__Alternatives ) )
            // InternalAnn.g:118:3: ( rule__Layer__Alternatives )
            {
             before(grammarAccess.getLayerAccess().getAlternatives()); 
            // InternalAnn.g:119:3: ( rule__Layer__Alternatives )
            // InternalAnn.g:119:4: rule__Layer__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleHidden"
    // InternalAnn.g:128:1: entryRuleHidden : ruleHidden EOF ;
    public final void entryRuleHidden() throws RecognitionException {
        try {
            // InternalAnn.g:129:1: ( ruleHidden EOF )
            // InternalAnn.g:130:1: ruleHidden EOF
            {
             before(grammarAccess.getHiddenRule()); 
            pushFollow(FOLLOW_1);
            ruleHidden();

            state._fsp--;

             after(grammarAccess.getHiddenRule()); 
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
    // $ANTLR end "entryRuleHidden"


    // $ANTLR start "ruleHidden"
    // InternalAnn.g:137:1: ruleHidden : ( ( rule__Hidden__Group__0 ) ) ;
    public final void ruleHidden() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:141:2: ( ( ( rule__Hidden__Group__0 ) ) )
            // InternalAnn.g:142:2: ( ( rule__Hidden__Group__0 ) )
            {
            // InternalAnn.g:142:2: ( ( rule__Hidden__Group__0 ) )
            // InternalAnn.g:143:3: ( rule__Hidden__Group__0 )
            {
             before(grammarAccess.getHiddenAccess().getGroup()); 
            // InternalAnn.g:144:3: ( rule__Hidden__Group__0 )
            // InternalAnn.g:144:4: rule__Hidden__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hidden__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHiddenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHidden"


    // $ANTLR start "entryRuleInput"
    // InternalAnn.g:153:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalAnn.g:154:1: ( ruleInput EOF )
            // InternalAnn.g:155:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalAnn.g:162:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:166:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalAnn.g:167:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalAnn.g:167:2: ( ( rule__Input__Group__0 ) )
            // InternalAnn.g:168:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalAnn.g:169:3: ( rule__Input__Group__0 )
            // InternalAnn.g:169:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalAnn.g:178:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalAnn.g:179:1: ( ruleOutput EOF )
            // InternalAnn.g:180:1: ruleOutput EOF
            {
             before(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputRule()); 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalAnn.g:187:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:191:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalAnn.g:192:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalAnn.g:192:2: ( ( rule__Output__Group__0 ) )
            // InternalAnn.g:193:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalAnn.g:194:3: ( rule__Output__Group__0 )
            // InternalAnn.g:194:4: rule__Output__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleActivation"
    // InternalAnn.g:203:1: entryRuleActivation : ruleActivation EOF ;
    public final void entryRuleActivation() throws RecognitionException {
        try {
            // InternalAnn.g:204:1: ( ruleActivation EOF )
            // InternalAnn.g:205:1: ruleActivation EOF
            {
             before(grammarAccess.getActivationRule()); 
            pushFollow(FOLLOW_1);
            ruleActivation();

            state._fsp--;

             after(grammarAccess.getActivationRule()); 
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
    // $ANTLR end "entryRuleActivation"


    // $ANTLR start "ruleActivation"
    // InternalAnn.g:212:1: ruleActivation : ( ( rule__Activation__Alternatives ) ) ;
    public final void ruleActivation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:216:2: ( ( ( rule__Activation__Alternatives ) ) )
            // InternalAnn.g:217:2: ( ( rule__Activation__Alternatives ) )
            {
            // InternalAnn.g:217:2: ( ( rule__Activation__Alternatives ) )
            // InternalAnn.g:218:3: ( rule__Activation__Alternatives )
            {
             before(grammarAccess.getActivationAccess().getAlternatives()); 
            // InternalAnn.g:219:3: ( rule__Activation__Alternatives )
            // InternalAnn.g:219:4: rule__Activation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Activation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivation"


    // $ANTLR start "entryRuleExternal"
    // InternalAnn.g:228:1: entryRuleExternal : ruleExternal EOF ;
    public final void entryRuleExternal() throws RecognitionException {
        try {
            // InternalAnn.g:229:1: ( ruleExternal EOF )
            // InternalAnn.g:230:1: ruleExternal EOF
            {
             before(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_1);
            ruleExternal();

            state._fsp--;

             after(grammarAccess.getExternalRule()); 
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
    // $ANTLR end "entryRuleExternal"


    // $ANTLR start "ruleExternal"
    // InternalAnn.g:237:1: ruleExternal : ( ( rule__External__Group__0 ) ) ;
    public final void ruleExternal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:241:2: ( ( ( rule__External__Group__0 ) ) )
            // InternalAnn.g:242:2: ( ( rule__External__Group__0 ) )
            {
            // InternalAnn.g:242:2: ( ( rule__External__Group__0 ) )
            // InternalAnn.g:243:3: ( rule__External__Group__0 )
            {
             before(grammarAccess.getExternalAccess().getGroup()); 
            // InternalAnn.g:244:3: ( rule__External__Group__0 )
            // InternalAnn.g:244:4: rule__External__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__External__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRuleSigmoid"
    // InternalAnn.g:253:1: entryRuleSigmoid : ruleSigmoid EOF ;
    public final void entryRuleSigmoid() throws RecognitionException {
        try {
            // InternalAnn.g:254:1: ( ruleSigmoid EOF )
            // InternalAnn.g:255:1: ruleSigmoid EOF
            {
             before(grammarAccess.getSigmoidRule()); 
            pushFollow(FOLLOW_1);
            ruleSigmoid();

            state._fsp--;

             after(grammarAccess.getSigmoidRule()); 
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
    // $ANTLR end "entryRuleSigmoid"


    // $ANTLR start "ruleSigmoid"
    // InternalAnn.g:262:1: ruleSigmoid : ( ( rule__Sigmoid__Group__0 ) ) ;
    public final void ruleSigmoid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:266:2: ( ( ( rule__Sigmoid__Group__0 ) ) )
            // InternalAnn.g:267:2: ( ( rule__Sigmoid__Group__0 ) )
            {
            // InternalAnn.g:267:2: ( ( rule__Sigmoid__Group__0 ) )
            // InternalAnn.g:268:3: ( rule__Sigmoid__Group__0 )
            {
             before(grammarAccess.getSigmoidAccess().getGroup()); 
            // InternalAnn.g:269:3: ( rule__Sigmoid__Group__0 )
            // InternalAnn.g:269:4: rule__Sigmoid__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sigmoid__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSigmoidAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSigmoid"


    // $ANTLR start "entryRuleTansig"
    // InternalAnn.g:278:1: entryRuleTansig : ruleTansig EOF ;
    public final void entryRuleTansig() throws RecognitionException {
        try {
            // InternalAnn.g:279:1: ( ruleTansig EOF )
            // InternalAnn.g:280:1: ruleTansig EOF
            {
             before(grammarAccess.getTansigRule()); 
            pushFollow(FOLLOW_1);
            ruleTansig();

            state._fsp--;

             after(grammarAccess.getTansigRule()); 
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
    // $ANTLR end "entryRuleTansig"


    // $ANTLR start "ruleTansig"
    // InternalAnn.g:287:1: ruleTansig : ( ( rule__Tansig__Group__0 ) ) ;
    public final void ruleTansig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:291:2: ( ( ( rule__Tansig__Group__0 ) ) )
            // InternalAnn.g:292:2: ( ( rule__Tansig__Group__0 ) )
            {
            // InternalAnn.g:292:2: ( ( rule__Tansig__Group__0 ) )
            // InternalAnn.g:293:3: ( rule__Tansig__Group__0 )
            {
             before(grammarAccess.getTansigAccess().getGroup()); 
            // InternalAnn.g:294:3: ( rule__Tansig__Group__0 )
            // InternalAnn.g:294:4: rule__Tansig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tansig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTansigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTansig"


    // $ANTLR start "entryRuleCustom"
    // InternalAnn.g:303:1: entryRuleCustom : ruleCustom EOF ;
    public final void entryRuleCustom() throws RecognitionException {
        try {
            // InternalAnn.g:304:1: ( ruleCustom EOF )
            // InternalAnn.g:305:1: ruleCustom EOF
            {
             before(grammarAccess.getCustomRule()); 
            pushFollow(FOLLOW_1);
            ruleCustom();

            state._fsp--;

             after(grammarAccess.getCustomRule()); 
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
    // $ANTLR end "entryRuleCustom"


    // $ANTLR start "ruleCustom"
    // InternalAnn.g:312:1: ruleCustom : ( ( rule__Custom__Group__0 ) ) ;
    public final void ruleCustom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:316:2: ( ( ( rule__Custom__Group__0 ) ) )
            // InternalAnn.g:317:2: ( ( rule__Custom__Group__0 ) )
            {
            // InternalAnn.g:317:2: ( ( rule__Custom__Group__0 ) )
            // InternalAnn.g:318:3: ( rule__Custom__Group__0 )
            {
             before(grammarAccess.getCustomAccess().getGroup()); 
            // InternalAnn.g:319:3: ( rule__Custom__Group__0 )
            // InternalAnn.g:319:4: rule__Custom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Custom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustom"


    // $ANTLR start "entryRuleExpression"
    // InternalAnn.g:328:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalAnn.g:329:1: ( ruleExpression EOF )
            // InternalAnn.g:330:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalAnn.g:337:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:341:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalAnn.g:342:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalAnn.g:342:2: ( ( rule__Expression__Group__0 ) )
            // InternalAnn.g:343:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalAnn.g:344:3: ( rule__Expression__Group__0 )
            // InternalAnn.g:344:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleFactor"
    // InternalAnn.g:353:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalAnn.g:354:1: ( ruleFactor EOF )
            // InternalAnn.g:355:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalAnn.g:362:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:366:2: ( ( ( rule__Factor__Group__0 ) ) )
            // InternalAnn.g:367:2: ( ( rule__Factor__Group__0 ) )
            {
            // InternalAnn.g:367:2: ( ( rule__Factor__Group__0 ) )
            // InternalAnn.g:368:3: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // InternalAnn.g:369:3: ( rule__Factor__Group__0 )
            // InternalAnn.g:369:4: rule__Factor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalAnn.g:378:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalAnn.g:379:1: ( rulePrimary EOF )
            // InternalAnn.g:380:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalAnn.g:387:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:391:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalAnn.g:392:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalAnn.g:392:2: ( ( rule__Primary__Alternatives ) )
            // InternalAnn.g:393:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalAnn.g:394:3: ( rule__Primary__Alternatives )
            // InternalAnn.g:394:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleMath"
    // InternalAnn.g:403:1: entryRuleMath : ruleMath EOF ;
    public final void entryRuleMath() throws RecognitionException {
        try {
            // InternalAnn.g:404:1: ( ruleMath EOF )
            // InternalAnn.g:405:1: ruleMath EOF
            {
             before(grammarAccess.getMathRule()); 
            pushFollow(FOLLOW_1);
            ruleMath();

            state._fsp--;

             after(grammarAccess.getMathRule()); 
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
    // $ANTLR end "entryRuleMath"


    // $ANTLR start "ruleMath"
    // InternalAnn.g:412:1: ruleMath : ( ( rule__Math__Alternatives ) ) ;
    public final void ruleMath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:416:2: ( ( ( rule__Math__Alternatives ) ) )
            // InternalAnn.g:417:2: ( ( rule__Math__Alternatives ) )
            {
            // InternalAnn.g:417:2: ( ( rule__Math__Alternatives ) )
            // InternalAnn.g:418:3: ( rule__Math__Alternatives )
            {
             before(grammarAccess.getMathAccess().getAlternatives()); 
            // InternalAnn.g:419:3: ( rule__Math__Alternatives )
            // InternalAnn.g:419:4: rule__Math__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Math__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMathAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMath"


    // $ANTLR start "entryRuleEuler"
    // InternalAnn.g:428:1: entryRuleEuler : ruleEuler EOF ;
    public final void entryRuleEuler() throws RecognitionException {
        try {
            // InternalAnn.g:429:1: ( ruleEuler EOF )
            // InternalAnn.g:430:1: ruleEuler EOF
            {
             before(grammarAccess.getEulerRule()); 
            pushFollow(FOLLOW_1);
            ruleEuler();

            state._fsp--;

             after(grammarAccess.getEulerRule()); 
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
    // $ANTLR end "entryRuleEuler"


    // $ANTLR start "ruleEuler"
    // InternalAnn.g:437:1: ruleEuler : ( ( rule__Euler__Group__0 ) ) ;
    public final void ruleEuler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:441:2: ( ( ( rule__Euler__Group__0 ) ) )
            // InternalAnn.g:442:2: ( ( rule__Euler__Group__0 ) )
            {
            // InternalAnn.g:442:2: ( ( rule__Euler__Group__0 ) )
            // InternalAnn.g:443:3: ( rule__Euler__Group__0 )
            {
             before(grammarAccess.getEulerAccess().getGroup()); 
            // InternalAnn.g:444:3: ( rule__Euler__Group__0 )
            // InternalAnn.g:444:4: rule__Euler__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Euler__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEulerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEuler"


    // $ANTLR start "entryRuleNLog"
    // InternalAnn.g:453:1: entryRuleNLog : ruleNLog EOF ;
    public final void entryRuleNLog() throws RecognitionException {
        try {
            // InternalAnn.g:454:1: ( ruleNLog EOF )
            // InternalAnn.g:455:1: ruleNLog EOF
            {
             before(grammarAccess.getNLogRule()); 
            pushFollow(FOLLOW_1);
            ruleNLog();

            state._fsp--;

             after(grammarAccess.getNLogRule()); 
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
    // $ANTLR end "entryRuleNLog"


    // $ANTLR start "ruleNLog"
    // InternalAnn.g:462:1: ruleNLog : ( ( rule__NLog__Group__0 ) ) ;
    public final void ruleNLog() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:466:2: ( ( ( rule__NLog__Group__0 ) ) )
            // InternalAnn.g:467:2: ( ( rule__NLog__Group__0 ) )
            {
            // InternalAnn.g:467:2: ( ( rule__NLog__Group__0 ) )
            // InternalAnn.g:468:3: ( rule__NLog__Group__0 )
            {
             before(grammarAccess.getNLogAccess().getGroup()); 
            // InternalAnn.g:469:3: ( rule__NLog__Group__0 )
            // InternalAnn.g:469:4: rule__NLog__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NLog__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNLogAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNLog"


    // $ANTLR start "entryRuleSin"
    // InternalAnn.g:478:1: entryRuleSin : ruleSin EOF ;
    public final void entryRuleSin() throws RecognitionException {
        try {
            // InternalAnn.g:479:1: ( ruleSin EOF )
            // InternalAnn.g:480:1: ruleSin EOF
            {
             before(grammarAccess.getSinRule()); 
            pushFollow(FOLLOW_1);
            ruleSin();

            state._fsp--;

             after(grammarAccess.getSinRule()); 
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
    // $ANTLR end "entryRuleSin"


    // $ANTLR start "ruleSin"
    // InternalAnn.g:487:1: ruleSin : ( ( rule__Sin__Group__0 ) ) ;
    public final void ruleSin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:491:2: ( ( ( rule__Sin__Group__0 ) ) )
            // InternalAnn.g:492:2: ( ( rule__Sin__Group__0 ) )
            {
            // InternalAnn.g:492:2: ( ( rule__Sin__Group__0 ) )
            // InternalAnn.g:493:3: ( rule__Sin__Group__0 )
            {
             before(grammarAccess.getSinAccess().getGroup()); 
            // InternalAnn.g:494:3: ( rule__Sin__Group__0 )
            // InternalAnn.g:494:4: rule__Sin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSin"


    // $ANTLR start "entryRuleCos"
    // InternalAnn.g:503:1: entryRuleCos : ruleCos EOF ;
    public final void entryRuleCos() throws RecognitionException {
        try {
            // InternalAnn.g:504:1: ( ruleCos EOF )
            // InternalAnn.g:505:1: ruleCos EOF
            {
             before(grammarAccess.getCosRule()); 
            pushFollow(FOLLOW_1);
            ruleCos();

            state._fsp--;

             after(grammarAccess.getCosRule()); 
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
    // $ANTLR end "entryRuleCos"


    // $ANTLR start "ruleCos"
    // InternalAnn.g:512:1: ruleCos : ( ( rule__Cos__Group__0 ) ) ;
    public final void ruleCos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:516:2: ( ( ( rule__Cos__Group__0 ) ) )
            // InternalAnn.g:517:2: ( ( rule__Cos__Group__0 ) )
            {
            // InternalAnn.g:517:2: ( ( rule__Cos__Group__0 ) )
            // InternalAnn.g:518:3: ( rule__Cos__Group__0 )
            {
             before(grammarAccess.getCosAccess().getGroup()); 
            // InternalAnn.g:519:3: ( rule__Cos__Group__0 )
            // InternalAnn.g:519:4: rule__Cos__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cos__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCosAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCos"


    // $ANTLR start "entryRuleSqrt"
    // InternalAnn.g:528:1: entryRuleSqrt : ruleSqrt EOF ;
    public final void entryRuleSqrt() throws RecognitionException {
        try {
            // InternalAnn.g:529:1: ( ruleSqrt EOF )
            // InternalAnn.g:530:1: ruleSqrt EOF
            {
             before(grammarAccess.getSqrtRule()); 
            pushFollow(FOLLOW_1);
            ruleSqrt();

            state._fsp--;

             after(grammarAccess.getSqrtRule()); 
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
    // $ANTLR end "entryRuleSqrt"


    // $ANTLR start "ruleSqrt"
    // InternalAnn.g:537:1: ruleSqrt : ( ( rule__Sqrt__Group__0 ) ) ;
    public final void ruleSqrt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:541:2: ( ( ( rule__Sqrt__Group__0 ) ) )
            // InternalAnn.g:542:2: ( ( rule__Sqrt__Group__0 ) )
            {
            // InternalAnn.g:542:2: ( ( rule__Sqrt__Group__0 ) )
            // InternalAnn.g:543:3: ( rule__Sqrt__Group__0 )
            {
             before(grammarAccess.getSqrtAccess().getGroup()); 
            // InternalAnn.g:544:3: ( rule__Sqrt__Group__0 )
            // InternalAnn.g:544:4: rule__Sqrt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sqrt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSqrtAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSqrt"


    // $ANTLR start "entryRulePower"
    // InternalAnn.g:553:1: entryRulePower : rulePower EOF ;
    public final void entryRulePower() throws RecognitionException {
        try {
            // InternalAnn.g:554:1: ( rulePower EOF )
            // InternalAnn.g:555:1: rulePower EOF
            {
             before(grammarAccess.getPowerRule()); 
            pushFollow(FOLLOW_1);
            rulePower();

            state._fsp--;

             after(grammarAccess.getPowerRule()); 
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
    // $ANTLR end "entryRulePower"


    // $ANTLR start "rulePower"
    // InternalAnn.g:562:1: rulePower : ( ( rule__Power__Group__0 ) ) ;
    public final void rulePower() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:566:2: ( ( ( rule__Power__Group__0 ) ) )
            // InternalAnn.g:567:2: ( ( rule__Power__Group__0 ) )
            {
            // InternalAnn.g:567:2: ( ( rule__Power__Group__0 ) )
            // InternalAnn.g:568:3: ( rule__Power__Group__0 )
            {
             before(grammarAccess.getPowerAccess().getGroup()); 
            // InternalAnn.g:569:3: ( rule__Power__Group__0 )
            // InternalAnn.g:569:4: rule__Power__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Power__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPowerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePower"


    // $ANTLR start "entryRuleLetter"
    // InternalAnn.g:578:1: entryRuleLetter : ruleLetter EOF ;
    public final void entryRuleLetter() throws RecognitionException {
        try {
            // InternalAnn.g:579:1: ( ruleLetter EOF )
            // InternalAnn.g:580:1: ruleLetter EOF
            {
             before(grammarAccess.getLetterRule()); 
            pushFollow(FOLLOW_1);
            ruleLetter();

            state._fsp--;

             after(grammarAccess.getLetterRule()); 
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
    // $ANTLR end "entryRuleLetter"


    // $ANTLR start "ruleLetter"
    // InternalAnn.g:587:1: ruleLetter : ( ( rule__Letter__Group__0 ) ) ;
    public final void ruleLetter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:591:2: ( ( ( rule__Letter__Group__0 ) ) )
            // InternalAnn.g:592:2: ( ( rule__Letter__Group__0 ) )
            {
            // InternalAnn.g:592:2: ( ( rule__Letter__Group__0 ) )
            // InternalAnn.g:593:3: ( rule__Letter__Group__0 )
            {
             before(grammarAccess.getLetterAccess().getGroup()); 
            // InternalAnn.g:594:3: ( rule__Letter__Group__0 )
            // InternalAnn.g:594:4: rule__Letter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Letter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLetter"


    // $ANTLR start "entryRulePartOperator"
    // InternalAnn.g:603:1: entryRulePartOperator : rulePartOperator EOF ;
    public final void entryRulePartOperator() throws RecognitionException {
        try {
            // InternalAnn.g:604:1: ( rulePartOperator EOF )
            // InternalAnn.g:605:1: rulePartOperator EOF
            {
             before(grammarAccess.getPartOperatorRule()); 
            pushFollow(FOLLOW_1);
            rulePartOperator();

            state._fsp--;

             after(grammarAccess.getPartOperatorRule()); 
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
    // $ANTLR end "entryRulePartOperator"


    // $ANTLR start "rulePartOperator"
    // InternalAnn.g:612:1: rulePartOperator : ( ( rule__PartOperator__Alternatives ) ) ;
    public final void rulePartOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:616:2: ( ( ( rule__PartOperator__Alternatives ) ) )
            // InternalAnn.g:617:2: ( ( rule__PartOperator__Alternatives ) )
            {
            // InternalAnn.g:617:2: ( ( rule__PartOperator__Alternatives ) )
            // InternalAnn.g:618:3: ( rule__PartOperator__Alternatives )
            {
             before(grammarAccess.getPartOperatorAccess().getAlternatives()); 
            // InternalAnn.g:619:3: ( rule__PartOperator__Alternatives )
            // InternalAnn.g:619:4: rule__PartOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PartOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPartOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePartOperator"


    // $ANTLR start "entryRuleFactorOperator"
    // InternalAnn.g:628:1: entryRuleFactorOperator : ruleFactorOperator EOF ;
    public final void entryRuleFactorOperator() throws RecognitionException {
        try {
            // InternalAnn.g:629:1: ( ruleFactorOperator EOF )
            // InternalAnn.g:630:1: ruleFactorOperator EOF
            {
             before(grammarAccess.getFactorOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactorOperator();

            state._fsp--;

             after(grammarAccess.getFactorOperatorRule()); 
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
    // $ANTLR end "entryRuleFactorOperator"


    // $ANTLR start "ruleFactorOperator"
    // InternalAnn.g:637:1: ruleFactorOperator : ( ( rule__FactorOperator__Alternatives ) ) ;
    public final void ruleFactorOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:641:2: ( ( ( rule__FactorOperator__Alternatives ) ) )
            // InternalAnn.g:642:2: ( ( rule__FactorOperator__Alternatives ) )
            {
            // InternalAnn.g:642:2: ( ( rule__FactorOperator__Alternatives ) )
            // InternalAnn.g:643:3: ( rule__FactorOperator__Alternatives )
            {
             before(grammarAccess.getFactorOperatorAccess().getAlternatives()); 
            // InternalAnn.g:644:3: ( rule__FactorOperator__Alternatives )
            // InternalAnn.g:644:4: rule__FactorOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FactorOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFactorOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactorOperator"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalAnn.g:653:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalAnn.g:654:1: ( ruleNumberLiteral EOF )
            // InternalAnn.g:655:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalAnn.g:662:1: ruleNumberLiteral : ( ( rule__NumberLiteral__Group__0 ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:666:2: ( ( ( rule__NumberLiteral__Group__0 ) ) )
            // InternalAnn.g:667:2: ( ( rule__NumberLiteral__Group__0 ) )
            {
            // InternalAnn.g:667:2: ( ( rule__NumberLiteral__Group__0 ) )
            // InternalAnn.g:668:3: ( rule__NumberLiteral__Group__0 )
            {
             before(grammarAccess.getNumberLiteralAccess().getGroup()); 
            // InternalAnn.g:669:3: ( rule__NumberLiteral__Group__0 )
            // InternalAnn.g:669:4: rule__NumberLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "rule__Layer__Alternatives"
    // InternalAnn.g:677:1: rule__Layer__Alternatives : ( ( ruleHidden ) | ( ruleInput ) | ( ruleOutput ) );
    public final void rule__Layer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:681:1: ( ( ruleHidden ) | ( ruleInput ) | ( ruleOutput ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalAnn.g:682:2: ( ruleHidden )
                    {
                    // InternalAnn.g:682:2: ( ruleHidden )
                    // InternalAnn.g:683:3: ruleHidden
                    {
                     before(grammarAccess.getLayerAccess().getHiddenParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleHidden();

                    state._fsp--;

                     after(grammarAccess.getLayerAccess().getHiddenParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:688:2: ( ruleInput )
                    {
                    // InternalAnn.g:688:2: ( ruleInput )
                    // InternalAnn.g:689:3: ruleInput
                    {
                     before(grammarAccess.getLayerAccess().getInputParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInput();

                    state._fsp--;

                     after(grammarAccess.getLayerAccess().getInputParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAnn.g:694:2: ( ruleOutput )
                    {
                    // InternalAnn.g:694:2: ( ruleOutput )
                    // InternalAnn.g:695:3: ruleOutput
                    {
                     before(grammarAccess.getLayerAccess().getOutputParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleOutput();

                    state._fsp--;

                     after(grammarAccess.getLayerAccess().getOutputParserRuleCall_2()); 

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
    // $ANTLR end "rule__Layer__Alternatives"


    // $ANTLR start "rule__Activation__Alternatives"
    // InternalAnn.g:704:1: rule__Activation__Alternatives : ( ( ruleSigmoid ) | ( ruleTansig ) | ( ruleExternal ) | ( ruleCustom ) );
    public final void rule__Activation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:708:1: ( ( ruleSigmoid ) | ( ruleTansig ) | ( ruleExternal ) | ( ruleCustom ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 39:
                    {
                    alt2=1;
                    }
                    break;
                case 26:
                    {
                    alt2=4;
                    }
                    break;
                case 40:
                    {
                    alt2=2;
                    }
                    break;
                case 25:
                    {
                    alt2=3;
                    }
                    break;
                default:
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
                    // InternalAnn.g:709:2: ( ruleSigmoid )
                    {
                    // InternalAnn.g:709:2: ( ruleSigmoid )
                    // InternalAnn.g:710:3: ruleSigmoid
                    {
                     before(grammarAccess.getActivationAccess().getSigmoidParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSigmoid();

                    state._fsp--;

                     after(grammarAccess.getActivationAccess().getSigmoidParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:715:2: ( ruleTansig )
                    {
                    // InternalAnn.g:715:2: ( ruleTansig )
                    // InternalAnn.g:716:3: ruleTansig
                    {
                     before(grammarAccess.getActivationAccess().getTansigParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTansig();

                    state._fsp--;

                     after(grammarAccess.getActivationAccess().getTansigParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAnn.g:721:2: ( ruleExternal )
                    {
                    // InternalAnn.g:721:2: ( ruleExternal )
                    // InternalAnn.g:722:3: ruleExternal
                    {
                     before(grammarAccess.getActivationAccess().getExternalParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExternal();

                    state._fsp--;

                     after(grammarAccess.getActivationAccess().getExternalParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAnn.g:727:2: ( ruleCustom )
                    {
                    // InternalAnn.g:727:2: ( ruleCustom )
                    // InternalAnn.g:728:3: ruleCustom
                    {
                     before(grammarAccess.getActivationAccess().getCustomParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCustom();

                    state._fsp--;

                     after(grammarAccess.getActivationAccess().getCustomParserRuleCall_3()); 

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
    // $ANTLR end "rule__Activation__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalAnn.g:737:1: rule__Primary__Alternatives : ( ( ruleNumberLiteral ) | ( ruleLetter ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleMath ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:741:1: ( ( ruleNumberLiteral ) | ( ruleLetter ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleMath ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_INT) ) {
                    alt3=1;
                }
                else if ( (LA3_1==41) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_INT) ) {
                    alt3=1;
                }
                else if ( (LA3_2==41) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case 41:
                {
                alt3=2;
                }
                break;
            case 30:
                {
                alt3=3;
                }
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAnn.g:742:2: ( ruleNumberLiteral )
                    {
                    // InternalAnn.g:742:2: ( ruleNumberLiteral )
                    // InternalAnn.g:743:3: ruleNumberLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:748:2: ( ruleLetter )
                    {
                    // InternalAnn.g:748:2: ( ruleLetter )
                    // InternalAnn.g:749:3: ruleLetter
                    {
                     before(grammarAccess.getPrimaryAccess().getLetterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLetter();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getLetterParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAnn.g:754:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalAnn.g:754:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalAnn.g:755:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalAnn.g:756:3: ( rule__Primary__Group_2__0 )
                    // InternalAnn.g:756:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAnn.g:760:2: ( ruleMath )
                    {
                    // InternalAnn.g:760:2: ( ruleMath )
                    // InternalAnn.g:761:3: ruleMath
                    {
                     before(grammarAccess.getPrimaryAccess().getMathParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMath();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getMathParserRuleCall_3()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Math__Alternatives"
    // InternalAnn.g:770:1: rule__Math__Alternatives : ( ( ruleEuler ) | ( ruleNLog ) | ( ruleSin ) | ( ruleCos ) | ( ruleSqrt ) | ( rulePower ) );
    public final void rule__Math__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:774:1: ( ( ruleEuler ) | ( ruleNLog ) | ( ruleSin ) | ( ruleCos ) | ( ruleSqrt ) | ( rulePower ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt4=1;
                }
                break;
            case 33:
                {
                alt4=2;
                }
                break;
            case 34:
                {
                alt4=3;
                }
                break;
            case 35:
                {
                alt4=4;
                }
                break;
            case 36:
                {
                alt4=5;
                }
                break;
            case 37:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAnn.g:775:2: ( ruleEuler )
                    {
                    // InternalAnn.g:775:2: ( ruleEuler )
                    // InternalAnn.g:776:3: ruleEuler
                    {
                     before(grammarAccess.getMathAccess().getEulerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEuler();

                    state._fsp--;

                     after(grammarAccess.getMathAccess().getEulerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:781:2: ( ruleNLog )
                    {
                    // InternalAnn.g:781:2: ( ruleNLog )
                    // InternalAnn.g:782:3: ruleNLog
                    {
                     before(grammarAccess.getMathAccess().getNLogParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNLog();

                    state._fsp--;

                     after(grammarAccess.getMathAccess().getNLogParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAnn.g:787:2: ( ruleSin )
                    {
                    // InternalAnn.g:787:2: ( ruleSin )
                    // InternalAnn.g:788:3: ruleSin
                    {
                     before(grammarAccess.getMathAccess().getSinParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSin();

                    state._fsp--;

                     after(grammarAccess.getMathAccess().getSinParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAnn.g:793:2: ( ruleCos )
                    {
                    // InternalAnn.g:793:2: ( ruleCos )
                    // InternalAnn.g:794:3: ruleCos
                    {
                     before(grammarAccess.getMathAccess().getCosParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCos();

                    state._fsp--;

                     after(grammarAccess.getMathAccess().getCosParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAnn.g:799:2: ( ruleSqrt )
                    {
                    // InternalAnn.g:799:2: ( ruleSqrt )
                    // InternalAnn.g:800:3: ruleSqrt
                    {
                     before(grammarAccess.getMathAccess().getSqrtParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSqrt();

                    state._fsp--;

                     after(grammarAccess.getMathAccess().getSqrtParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAnn.g:805:2: ( rulePower )
                    {
                    // InternalAnn.g:805:2: ( rulePower )
                    // InternalAnn.g:806:3: rulePower
                    {
                     before(grammarAccess.getMathAccess().getPowerParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    rulePower();

                    state._fsp--;

                     after(grammarAccess.getMathAccess().getPowerParserRuleCall_5()); 

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
    // $ANTLR end "rule__Math__Alternatives"


    // $ANTLR start "rule__PartOperator__Alternatives"
    // InternalAnn.g:815:1: rule__PartOperator__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__PartOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:819:1: ( ( '+' ) | ( '-' ) )
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
                    // InternalAnn.g:820:2: ( '+' )
                    {
                    // InternalAnn.g:820:2: ( '+' )
                    // InternalAnn.g:821:3: '+'
                    {
                     before(grammarAccess.getPartOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPartOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:826:2: ( '-' )
                    {
                    // InternalAnn.g:826:2: ( '-' )
                    // InternalAnn.g:827:3: '-'
                    {
                     before(grammarAccess.getPartOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPartOperatorAccess().getHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__PartOperator__Alternatives"


    // $ANTLR start "rule__FactorOperator__Alternatives"
    // InternalAnn.g:836:1: rule__FactorOperator__Alternatives : ( ( '*' ) | ( '/' ) );
    public final void rule__FactorOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:840:1: ( ( '*' ) | ( '/' ) )
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
                    // InternalAnn.g:841:2: ( '*' )
                    {
                    // InternalAnn.g:841:2: ( '*' )
                    // InternalAnn.g:842:3: '*'
                    {
                     before(grammarAccess.getFactorOperatorAccess().getAsteriskKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getFactorOperatorAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:847:2: ( '/' )
                    {
                    // InternalAnn.g:847:2: ( '/' )
                    // InternalAnn.g:848:3: '/'
                    {
                     before(grammarAccess.getFactorOperatorAccess().getSolidusKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getFactorOperatorAccess().getSolidusKeyword_1()); 

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
    // $ANTLR end "rule__FactorOperator__Alternatives"


    // $ANTLR start "rule__ANNModel__Group__0"
    // InternalAnn.g:857:1: rule__ANNModel__Group__0 : rule__ANNModel__Group__0__Impl rule__ANNModel__Group__1 ;
    public final void rule__ANNModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:861:1: ( rule__ANNModel__Group__0__Impl rule__ANNModel__Group__1 )
            // InternalAnn.g:862:2: rule__ANNModel__Group__0__Impl rule__ANNModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ANNModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__0"


    // $ANTLR start "rule__ANNModel__Group__0__Impl"
    // InternalAnn.g:869:1: rule__ANNModel__Group__0__Impl : ( ( rule__ANNModel__NameAssignment_0 ) ) ;
    public final void rule__ANNModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:873:1: ( ( ( rule__ANNModel__NameAssignment_0 ) ) )
            // InternalAnn.g:874:1: ( ( rule__ANNModel__NameAssignment_0 ) )
            {
            // InternalAnn.g:874:1: ( ( rule__ANNModel__NameAssignment_0 ) )
            // InternalAnn.g:875:2: ( rule__ANNModel__NameAssignment_0 )
            {
             before(grammarAccess.getANNModelAccess().getNameAssignment_0()); 
            // InternalAnn.g:876:2: ( rule__ANNModel__NameAssignment_0 )
            // InternalAnn.g:876:3: rule__ANNModel__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ANNModel__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getANNModelAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__0__Impl"


    // $ANTLR start "rule__ANNModel__Group__1"
    // InternalAnn.g:884:1: rule__ANNModel__Group__1 : rule__ANNModel__Group__1__Impl rule__ANNModel__Group__2 ;
    public final void rule__ANNModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:888:1: ( rule__ANNModel__Group__1__Impl rule__ANNModel__Group__2 )
            // InternalAnn.g:889:2: rule__ANNModel__Group__1__Impl rule__ANNModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ANNModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__1"


    // $ANTLR start "rule__ANNModel__Group__1__Impl"
    // InternalAnn.g:896:1: rule__ANNModel__Group__1__Impl : ( '{' ) ;
    public final void rule__ANNModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:900:1: ( ( '{' ) )
            // InternalAnn.g:901:1: ( '{' )
            {
            // InternalAnn.g:901:1: ( '{' )
            // InternalAnn.g:902:2: '{'
            {
             before(grammarAccess.getANNModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getANNModelAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__1__Impl"


    // $ANTLR start "rule__ANNModel__Group__2"
    // InternalAnn.g:911:1: rule__ANNModel__Group__2 : rule__ANNModel__Group__2__Impl rule__ANNModel__Group__3 ;
    public final void rule__ANNModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:915:1: ( rule__ANNModel__Group__2__Impl rule__ANNModel__Group__3 )
            // InternalAnn.g:916:2: rule__ANNModel__Group__2__Impl rule__ANNModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ANNModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__2"


    // $ANTLR start "rule__ANNModel__Group__2__Impl"
    // InternalAnn.g:923:1: rule__ANNModel__Group__2__Impl : ( 'alpha' ) ;
    public final void rule__ANNModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:927:1: ( ( 'alpha' ) )
            // InternalAnn.g:928:1: ( 'alpha' )
            {
            // InternalAnn.g:928:1: ( 'alpha' )
            // InternalAnn.g:929:2: 'alpha'
            {
             before(grammarAccess.getANNModelAccess().getAlphaKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getANNModelAccess().getAlphaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__2__Impl"


    // $ANTLR start "rule__ANNModel__Group__3"
    // InternalAnn.g:938:1: rule__ANNModel__Group__3 : rule__ANNModel__Group__3__Impl rule__ANNModel__Group__4 ;
    public final void rule__ANNModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:942:1: ( rule__ANNModel__Group__3__Impl rule__ANNModel__Group__4 )
            // InternalAnn.g:943:2: rule__ANNModel__Group__3__Impl rule__ANNModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ANNModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__3"


    // $ANTLR start "rule__ANNModel__Group__3__Impl"
    // InternalAnn.g:950:1: rule__ANNModel__Group__3__Impl : ( ( rule__ANNModel__AlphaAssignment_3 ) ) ;
    public final void rule__ANNModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:954:1: ( ( ( rule__ANNModel__AlphaAssignment_3 ) ) )
            // InternalAnn.g:955:1: ( ( rule__ANNModel__AlphaAssignment_3 ) )
            {
            // InternalAnn.g:955:1: ( ( rule__ANNModel__AlphaAssignment_3 ) )
            // InternalAnn.g:956:2: ( rule__ANNModel__AlphaAssignment_3 )
            {
             before(grammarAccess.getANNModelAccess().getAlphaAssignment_3()); 
            // InternalAnn.g:957:2: ( rule__ANNModel__AlphaAssignment_3 )
            // InternalAnn.g:957:3: rule__ANNModel__AlphaAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ANNModel__AlphaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getANNModelAccess().getAlphaAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__3__Impl"


    // $ANTLR start "rule__ANNModel__Group__4"
    // InternalAnn.g:965:1: rule__ANNModel__Group__4 : rule__ANNModel__Group__4__Impl rule__ANNModel__Group__5 ;
    public final void rule__ANNModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:969:1: ( rule__ANNModel__Group__4__Impl rule__ANNModel__Group__5 )
            // InternalAnn.g:970:2: rule__ANNModel__Group__4__Impl rule__ANNModel__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__ANNModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__4"


    // $ANTLR start "rule__ANNModel__Group__4__Impl"
    // InternalAnn.g:977:1: rule__ANNModel__Group__4__Impl : ( 'epochs' ) ;
    public final void rule__ANNModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:981:1: ( ( 'epochs' ) )
            // InternalAnn.g:982:1: ( 'epochs' )
            {
            // InternalAnn.g:982:1: ( 'epochs' )
            // InternalAnn.g:983:2: 'epochs'
            {
             before(grammarAccess.getANNModelAccess().getEpochsKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getANNModelAccess().getEpochsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__4__Impl"


    // $ANTLR start "rule__ANNModel__Group__5"
    // InternalAnn.g:992:1: rule__ANNModel__Group__5 : rule__ANNModel__Group__5__Impl rule__ANNModel__Group__6 ;
    public final void rule__ANNModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:996:1: ( rule__ANNModel__Group__5__Impl rule__ANNModel__Group__6 )
            // InternalAnn.g:997:2: rule__ANNModel__Group__5__Impl rule__ANNModel__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__ANNModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__5"


    // $ANTLR start "rule__ANNModel__Group__5__Impl"
    // InternalAnn.g:1004:1: rule__ANNModel__Group__5__Impl : ( ( rule__ANNModel__EpochsAssignment_5 ) ) ;
    public final void rule__ANNModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1008:1: ( ( ( rule__ANNModel__EpochsAssignment_5 ) ) )
            // InternalAnn.g:1009:1: ( ( rule__ANNModel__EpochsAssignment_5 ) )
            {
            // InternalAnn.g:1009:1: ( ( rule__ANNModel__EpochsAssignment_5 ) )
            // InternalAnn.g:1010:2: ( rule__ANNModel__EpochsAssignment_5 )
            {
             before(grammarAccess.getANNModelAccess().getEpochsAssignment_5()); 
            // InternalAnn.g:1011:2: ( rule__ANNModel__EpochsAssignment_5 )
            // InternalAnn.g:1011:3: rule__ANNModel__EpochsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ANNModel__EpochsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getANNModelAccess().getEpochsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__5__Impl"


    // $ANTLR start "rule__ANNModel__Group__6"
    // InternalAnn.g:1019:1: rule__ANNModel__Group__6 : rule__ANNModel__Group__6__Impl rule__ANNModel__Group__7 ;
    public final void rule__ANNModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1023:1: ( rule__ANNModel__Group__6__Impl rule__ANNModel__Group__7 )
            // InternalAnn.g:1024:2: rule__ANNModel__Group__6__Impl rule__ANNModel__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__ANNModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__6"


    // $ANTLR start "rule__ANNModel__Group__6__Impl"
    // InternalAnn.g:1031:1: rule__ANNModel__Group__6__Impl : ( ( rule__ANNModel__ActivationAssignment_6 )* ) ;
    public final void rule__ANNModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1035:1: ( ( ( rule__ANNModel__ActivationAssignment_6 )* ) )
            // InternalAnn.g:1036:1: ( ( rule__ANNModel__ActivationAssignment_6 )* )
            {
            // InternalAnn.g:1036:1: ( ( rule__ANNModel__ActivationAssignment_6 )* )
            // InternalAnn.g:1037:2: ( rule__ANNModel__ActivationAssignment_6 )*
            {
             before(grammarAccess.getANNModelAccess().getActivationAssignment_6()); 
            // InternalAnn.g:1038:2: ( rule__ANNModel__ActivationAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAnn.g:1038:3: rule__ANNModel__ActivationAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ANNModel__ActivationAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getANNModelAccess().getActivationAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__6__Impl"


    // $ANTLR start "rule__ANNModel__Group__7"
    // InternalAnn.g:1046:1: rule__ANNModel__Group__7 : rule__ANNModel__Group__7__Impl rule__ANNModel__Group__8 ;
    public final void rule__ANNModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1050:1: ( rule__ANNModel__Group__7__Impl rule__ANNModel__Group__8 )
            // InternalAnn.g:1051:2: rule__ANNModel__Group__7__Impl rule__ANNModel__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__ANNModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__7"


    // $ANTLR start "rule__ANNModel__Group__7__Impl"
    // InternalAnn.g:1058:1: rule__ANNModel__Group__7__Impl : ( ( rule__ANNModel__LayerAssignment_7 )* ) ;
    public final void rule__ANNModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1062:1: ( ( ( rule__ANNModel__LayerAssignment_7 )* ) )
            // InternalAnn.g:1063:1: ( ( rule__ANNModel__LayerAssignment_7 )* )
            {
            // InternalAnn.g:1063:1: ( ( rule__ANNModel__LayerAssignment_7 )* )
            // InternalAnn.g:1064:2: ( rule__ANNModel__LayerAssignment_7 )*
            {
             before(grammarAccess.getANNModelAccess().getLayerAssignment_7()); 
            // InternalAnn.g:1065:2: ( rule__ANNModel__LayerAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20||(LA8_0>=23 && LA8_0<=24)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAnn.g:1065:3: rule__ANNModel__LayerAssignment_7
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ANNModel__LayerAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getANNModelAccess().getLayerAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__7__Impl"


    // $ANTLR start "rule__ANNModel__Group__8"
    // InternalAnn.g:1073:1: rule__ANNModel__Group__8 : rule__ANNModel__Group__8__Impl ;
    public final void rule__ANNModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1077:1: ( rule__ANNModel__Group__8__Impl )
            // InternalAnn.g:1078:2: rule__ANNModel__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__8"


    // $ANTLR start "rule__ANNModel__Group__8__Impl"
    // InternalAnn.g:1084:1: rule__ANNModel__Group__8__Impl : ( '}' ) ;
    public final void rule__ANNModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1088:1: ( ( '}' ) )
            // InternalAnn.g:1089:1: ( '}' )
            {
            // InternalAnn.g:1089:1: ( '}' )
            // InternalAnn.g:1090:2: '}'
            {
             before(grammarAccess.getANNModelAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getANNModelAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__8__Impl"


    // $ANTLR start "rule__DECIMAL__Group__0"
    // InternalAnn.g:1100:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1104:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalAnn.g:1105:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DECIMAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__0"


    // $ANTLR start "rule__DECIMAL__Group__0__Impl"
    // InternalAnn.g:1112:1: rule__DECIMAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1116:1: ( ( RULE_INT ) )
            // InternalAnn.g:1117:1: ( RULE_INT )
            {
            // InternalAnn.g:1117:1: ( RULE_INT )
            // InternalAnn.g:1118:2: RULE_INT
            {
             before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__0__Impl"


    // $ANTLR start "rule__DECIMAL__Group__1"
    // InternalAnn.g:1127:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1131:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalAnn.g:1132:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DECIMAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__1"


    // $ANTLR start "rule__DECIMAL__Group__1__Impl"
    // InternalAnn.g:1139:1: rule__DECIMAL__Group__1__Impl : ( '.' ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1143:1: ( ( '.' ) )
            // InternalAnn.g:1144:1: ( '.' )
            {
            // InternalAnn.g:1144:1: ( '.' )
            // InternalAnn.g:1145:2: '.'
            {
             before(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__1__Impl"


    // $ANTLR start "rule__DECIMAL__Group__2"
    // InternalAnn.g:1154:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1158:1: ( rule__DECIMAL__Group__2__Impl )
            // InternalAnn.g:1159:2: rule__DECIMAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__2"


    // $ANTLR start "rule__DECIMAL__Group__2__Impl"
    // InternalAnn.g:1165:1: rule__DECIMAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1169:1: ( ( RULE_INT ) )
            // InternalAnn.g:1170:1: ( RULE_INT )
            {
            // InternalAnn.g:1170:1: ( RULE_INT )
            // InternalAnn.g:1171:2: RULE_INT
            {
             before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__2__Impl"


    // $ANTLR start "rule__Hidden__Group__0"
    // InternalAnn.g:1181:1: rule__Hidden__Group__0 : rule__Hidden__Group__0__Impl rule__Hidden__Group__1 ;
    public final void rule__Hidden__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1185:1: ( rule__Hidden__Group__0__Impl rule__Hidden__Group__1 )
            // InternalAnn.g:1186:2: rule__Hidden__Group__0__Impl rule__Hidden__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Hidden__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hidden__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__0"


    // $ANTLR start "rule__Hidden__Group__0__Impl"
    // InternalAnn.g:1193:1: rule__Hidden__Group__0__Impl : ( 'hidden' ) ;
    public final void rule__Hidden__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1197:1: ( ( 'hidden' ) )
            // InternalAnn.g:1198:1: ( 'hidden' )
            {
            // InternalAnn.g:1198:1: ( 'hidden' )
            // InternalAnn.g:1199:2: 'hidden'
            {
             before(grammarAccess.getHiddenAccess().getHiddenKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getHiddenAccess().getHiddenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__0__Impl"


    // $ANTLR start "rule__Hidden__Group__1"
    // InternalAnn.g:1208:1: rule__Hidden__Group__1 : rule__Hidden__Group__1__Impl rule__Hidden__Group__2 ;
    public final void rule__Hidden__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1212:1: ( rule__Hidden__Group__1__Impl rule__Hidden__Group__2 )
            // InternalAnn.g:1213:2: rule__Hidden__Group__1__Impl rule__Hidden__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Hidden__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hidden__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__1"


    // $ANTLR start "rule__Hidden__Group__1__Impl"
    // InternalAnn.g:1220:1: rule__Hidden__Group__1__Impl : ( '{' ) ;
    public final void rule__Hidden__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1224:1: ( ( '{' ) )
            // InternalAnn.g:1225:1: ( '{' )
            {
            // InternalAnn.g:1225:1: ( '{' )
            // InternalAnn.g:1226:2: '{'
            {
             before(grammarAccess.getHiddenAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getHiddenAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__1__Impl"


    // $ANTLR start "rule__Hidden__Group__2"
    // InternalAnn.g:1235:1: rule__Hidden__Group__2 : rule__Hidden__Group__2__Impl rule__Hidden__Group__3 ;
    public final void rule__Hidden__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1239:1: ( rule__Hidden__Group__2__Impl rule__Hidden__Group__3 )
            // InternalAnn.g:1240:2: rule__Hidden__Group__2__Impl rule__Hidden__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Hidden__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hidden__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__2"


    // $ANTLR start "rule__Hidden__Group__2__Impl"
    // InternalAnn.g:1247:1: rule__Hidden__Group__2__Impl : ( 'size' ) ;
    public final void rule__Hidden__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1251:1: ( ( 'size' ) )
            // InternalAnn.g:1252:1: ( 'size' )
            {
            // InternalAnn.g:1252:1: ( 'size' )
            // InternalAnn.g:1253:2: 'size'
            {
             before(grammarAccess.getHiddenAccess().getSizeKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getHiddenAccess().getSizeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__2__Impl"


    // $ANTLR start "rule__Hidden__Group__3"
    // InternalAnn.g:1262:1: rule__Hidden__Group__3 : rule__Hidden__Group__3__Impl rule__Hidden__Group__4 ;
    public final void rule__Hidden__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1266:1: ( rule__Hidden__Group__3__Impl rule__Hidden__Group__4 )
            // InternalAnn.g:1267:2: rule__Hidden__Group__3__Impl rule__Hidden__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Hidden__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hidden__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__3"


    // $ANTLR start "rule__Hidden__Group__3__Impl"
    // InternalAnn.g:1274:1: rule__Hidden__Group__3__Impl : ( ( rule__Hidden__SizeAssignment_3 ) ) ;
    public final void rule__Hidden__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1278:1: ( ( ( rule__Hidden__SizeAssignment_3 ) ) )
            // InternalAnn.g:1279:1: ( ( rule__Hidden__SizeAssignment_3 ) )
            {
            // InternalAnn.g:1279:1: ( ( rule__Hidden__SizeAssignment_3 ) )
            // InternalAnn.g:1280:2: ( rule__Hidden__SizeAssignment_3 )
            {
             before(grammarAccess.getHiddenAccess().getSizeAssignment_3()); 
            // InternalAnn.g:1281:2: ( rule__Hidden__SizeAssignment_3 )
            // InternalAnn.g:1281:3: rule__Hidden__SizeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Hidden__SizeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHiddenAccess().getSizeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__3__Impl"


    // $ANTLR start "rule__Hidden__Group__4"
    // InternalAnn.g:1289:1: rule__Hidden__Group__4 : rule__Hidden__Group__4__Impl rule__Hidden__Group__5 ;
    public final void rule__Hidden__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1293:1: ( rule__Hidden__Group__4__Impl rule__Hidden__Group__5 )
            // InternalAnn.g:1294:2: rule__Hidden__Group__4__Impl rule__Hidden__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Hidden__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hidden__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__4"


    // $ANTLR start "rule__Hidden__Group__4__Impl"
    // InternalAnn.g:1301:1: rule__Hidden__Group__4__Impl : ( 'activation' ) ;
    public final void rule__Hidden__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1305:1: ( ( 'activation' ) )
            // InternalAnn.g:1306:1: ( 'activation' )
            {
            // InternalAnn.g:1306:1: ( 'activation' )
            // InternalAnn.g:1307:2: 'activation'
            {
             before(grammarAccess.getHiddenAccess().getActivationKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getHiddenAccess().getActivationKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__4__Impl"


    // $ANTLR start "rule__Hidden__Group__5"
    // InternalAnn.g:1316:1: rule__Hidden__Group__5 : rule__Hidden__Group__5__Impl rule__Hidden__Group__6 ;
    public final void rule__Hidden__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1320:1: ( rule__Hidden__Group__5__Impl rule__Hidden__Group__6 )
            // InternalAnn.g:1321:2: rule__Hidden__Group__5__Impl rule__Hidden__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Hidden__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hidden__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__5"


    // $ANTLR start "rule__Hidden__Group__5__Impl"
    // InternalAnn.g:1328:1: rule__Hidden__Group__5__Impl : ( ( rule__Hidden__L_ruleAssignment_5 ) ) ;
    public final void rule__Hidden__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1332:1: ( ( ( rule__Hidden__L_ruleAssignment_5 ) ) )
            // InternalAnn.g:1333:1: ( ( rule__Hidden__L_ruleAssignment_5 ) )
            {
            // InternalAnn.g:1333:1: ( ( rule__Hidden__L_ruleAssignment_5 ) )
            // InternalAnn.g:1334:2: ( rule__Hidden__L_ruleAssignment_5 )
            {
             before(grammarAccess.getHiddenAccess().getL_ruleAssignment_5()); 
            // InternalAnn.g:1335:2: ( rule__Hidden__L_ruleAssignment_5 )
            // InternalAnn.g:1335:3: rule__Hidden__L_ruleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Hidden__L_ruleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getHiddenAccess().getL_ruleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__5__Impl"


    // $ANTLR start "rule__Hidden__Group__6"
    // InternalAnn.g:1343:1: rule__Hidden__Group__6 : rule__Hidden__Group__6__Impl ;
    public final void rule__Hidden__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1347:1: ( rule__Hidden__Group__6__Impl )
            // InternalAnn.g:1348:2: rule__Hidden__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hidden__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__6"


    // $ANTLR start "rule__Hidden__Group__6__Impl"
    // InternalAnn.g:1354:1: rule__Hidden__Group__6__Impl : ( '}' ) ;
    public final void rule__Hidden__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1358:1: ( ( '}' ) )
            // InternalAnn.g:1359:1: ( '}' )
            {
            // InternalAnn.g:1359:1: ( '}' )
            // InternalAnn.g:1360:2: '}'
            {
             before(grammarAccess.getHiddenAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getHiddenAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__Group__6__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // InternalAnn.g:1370:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1374:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalAnn.g:1375:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalAnn.g:1382:1: rule__Input__Group__0__Impl : ( 'in' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1386:1: ( ( 'in' ) )
            // InternalAnn.g:1387:1: ( 'in' )
            {
            // InternalAnn.g:1387:1: ( 'in' )
            // InternalAnn.g:1388:2: 'in'
            {
             before(grammarAccess.getInputAccess().getInKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getInKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalAnn.g:1397:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1401:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalAnn.g:1402:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalAnn.g:1409:1: rule__Input__Group__1__Impl : ( '{' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1413:1: ( ( '{' ) )
            // InternalAnn.g:1414:1: ( '{' )
            {
            // InternalAnn.g:1414:1: ( '{' )
            // InternalAnn.g:1415:2: '{'
            {
             before(grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // InternalAnn.g:1424:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1428:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalAnn.g:1429:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // InternalAnn.g:1436:1: rule__Input__Group__2__Impl : ( 'size' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1440:1: ( ( 'size' ) )
            // InternalAnn.g:1441:1: ( 'size' )
            {
            // InternalAnn.g:1441:1: ( 'size' )
            // InternalAnn.g:1442:2: 'size'
            {
             before(grammarAccess.getInputAccess().getSizeKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getSizeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__3"
    // InternalAnn.g:1451:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1455:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalAnn.g:1456:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Input__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3"


    // $ANTLR start "rule__Input__Group__3__Impl"
    // InternalAnn.g:1463:1: rule__Input__Group__3__Impl : ( ( rule__Input__SizeAssignment_3 ) ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1467:1: ( ( ( rule__Input__SizeAssignment_3 ) ) )
            // InternalAnn.g:1468:1: ( ( rule__Input__SizeAssignment_3 ) )
            {
            // InternalAnn.g:1468:1: ( ( rule__Input__SizeAssignment_3 ) )
            // InternalAnn.g:1469:2: ( rule__Input__SizeAssignment_3 )
            {
             before(grammarAccess.getInputAccess().getSizeAssignment_3()); 
            // InternalAnn.g:1470:2: ( rule__Input__SizeAssignment_3 )
            // InternalAnn.g:1470:3: rule__Input__SizeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Input__SizeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getSizeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3__Impl"


    // $ANTLR start "rule__Input__Group__4"
    // InternalAnn.g:1478:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1482:1: ( rule__Input__Group__4__Impl )
            // InternalAnn.g:1483:2: rule__Input__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4"


    // $ANTLR start "rule__Input__Group__4__Impl"
    // InternalAnn.g:1489:1: rule__Input__Group__4__Impl : ( '}' ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1493:1: ( ( '}' ) )
            // InternalAnn.g:1494:1: ( '}' )
            {
            // InternalAnn.g:1494:1: ( '}' )
            // InternalAnn.g:1495:2: '}'
            {
             before(grammarAccess.getInputAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // InternalAnn.g:1505:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1509:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalAnn.g:1510:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Output__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // InternalAnn.g:1517:1: rule__Output__Group__0__Impl : ( 'out' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1521:1: ( ( 'out' ) )
            // InternalAnn.g:1522:1: ( 'out' )
            {
            // InternalAnn.g:1522:1: ( 'out' )
            // InternalAnn.g:1523:2: 'out'
            {
             before(grammarAccess.getOutputAccess().getOutKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getOutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // InternalAnn.g:1532:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1536:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalAnn.g:1537:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Output__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // InternalAnn.g:1544:1: rule__Output__Group__1__Impl : ( '{' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1548:1: ( ( '{' ) )
            // InternalAnn.g:1549:1: ( '{' )
            {
            // InternalAnn.g:1549:1: ( '{' )
            // InternalAnn.g:1550:2: '{'
            {
             before(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group__2"
    // InternalAnn.g:1559:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1563:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalAnn.g:1564:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Output__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2"


    // $ANTLR start "rule__Output__Group__2__Impl"
    // InternalAnn.g:1571:1: rule__Output__Group__2__Impl : ( 'size' ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1575:1: ( ( 'size' ) )
            // InternalAnn.g:1576:1: ( 'size' )
            {
            // InternalAnn.g:1576:1: ( 'size' )
            // InternalAnn.g:1577:2: 'size'
            {
             before(grammarAccess.getOutputAccess().getSizeKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getSizeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2__Impl"


    // $ANTLR start "rule__Output__Group__3"
    // InternalAnn.g:1586:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1590:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalAnn.g:1591:2: rule__Output__Group__3__Impl rule__Output__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Output__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3"


    // $ANTLR start "rule__Output__Group__3__Impl"
    // InternalAnn.g:1598:1: rule__Output__Group__3__Impl : ( ( rule__Output__SizeAssignment_3 ) ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1602:1: ( ( ( rule__Output__SizeAssignment_3 ) ) )
            // InternalAnn.g:1603:1: ( ( rule__Output__SizeAssignment_3 ) )
            {
            // InternalAnn.g:1603:1: ( ( rule__Output__SizeAssignment_3 ) )
            // InternalAnn.g:1604:2: ( rule__Output__SizeAssignment_3 )
            {
             before(grammarAccess.getOutputAccess().getSizeAssignment_3()); 
            // InternalAnn.g:1605:2: ( rule__Output__SizeAssignment_3 )
            // InternalAnn.g:1605:3: rule__Output__SizeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Output__SizeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getSizeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3__Impl"


    // $ANTLR start "rule__Output__Group__4"
    // InternalAnn.g:1613:1: rule__Output__Group__4 : rule__Output__Group__4__Impl rule__Output__Group__5 ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1617:1: ( rule__Output__Group__4__Impl rule__Output__Group__5 )
            // InternalAnn.g:1618:2: rule__Output__Group__4__Impl rule__Output__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Output__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__4"


    // $ANTLR start "rule__Output__Group__4__Impl"
    // InternalAnn.g:1625:1: rule__Output__Group__4__Impl : ( 'activation' ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1629:1: ( ( 'activation' ) )
            // InternalAnn.g:1630:1: ( 'activation' )
            {
            // InternalAnn.g:1630:1: ( 'activation' )
            // InternalAnn.g:1631:2: 'activation'
            {
             before(grammarAccess.getOutputAccess().getActivationKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getActivationKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__4__Impl"


    // $ANTLR start "rule__Output__Group__5"
    // InternalAnn.g:1640:1: rule__Output__Group__5 : rule__Output__Group__5__Impl rule__Output__Group__6 ;
    public final void rule__Output__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1644:1: ( rule__Output__Group__5__Impl rule__Output__Group__6 )
            // InternalAnn.g:1645:2: rule__Output__Group__5__Impl rule__Output__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Output__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__5"


    // $ANTLR start "rule__Output__Group__5__Impl"
    // InternalAnn.g:1652:1: rule__Output__Group__5__Impl : ( ( rule__Output__L_ruleAssignment_5 ) ) ;
    public final void rule__Output__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1656:1: ( ( ( rule__Output__L_ruleAssignment_5 ) ) )
            // InternalAnn.g:1657:1: ( ( rule__Output__L_ruleAssignment_5 ) )
            {
            // InternalAnn.g:1657:1: ( ( rule__Output__L_ruleAssignment_5 ) )
            // InternalAnn.g:1658:2: ( rule__Output__L_ruleAssignment_5 )
            {
             before(grammarAccess.getOutputAccess().getL_ruleAssignment_5()); 
            // InternalAnn.g:1659:2: ( rule__Output__L_ruleAssignment_5 )
            // InternalAnn.g:1659:3: rule__Output__L_ruleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Output__L_ruleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getL_ruleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__5__Impl"


    // $ANTLR start "rule__Output__Group__6"
    // InternalAnn.g:1667:1: rule__Output__Group__6 : rule__Output__Group__6__Impl ;
    public final void rule__Output__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1671:1: ( rule__Output__Group__6__Impl )
            // InternalAnn.g:1672:2: rule__Output__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__6"


    // $ANTLR start "rule__Output__Group__6__Impl"
    // InternalAnn.g:1678:1: rule__Output__Group__6__Impl : ( '}' ) ;
    public final void rule__Output__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1682:1: ( ( '}' ) )
            // InternalAnn.g:1683:1: ( '}' )
            {
            // InternalAnn.g:1683:1: ( '}' )
            // InternalAnn.g:1684:2: '}'
            {
             before(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__6__Impl"


    // $ANTLR start "rule__External__Group__0"
    // InternalAnn.g:1694:1: rule__External__Group__0 : rule__External__Group__0__Impl rule__External__Group__1 ;
    public final void rule__External__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1698:1: ( rule__External__Group__0__Impl rule__External__Group__1 )
            // InternalAnn.g:1699:2: rule__External__Group__0__Impl rule__External__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__External__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__0"


    // $ANTLR start "rule__External__Group__0__Impl"
    // InternalAnn.g:1706:1: rule__External__Group__0__Impl : ( ( rule__External__NameAssignment_0 ) ) ;
    public final void rule__External__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1710:1: ( ( ( rule__External__NameAssignment_0 ) ) )
            // InternalAnn.g:1711:1: ( ( rule__External__NameAssignment_0 ) )
            {
            // InternalAnn.g:1711:1: ( ( rule__External__NameAssignment_0 ) )
            // InternalAnn.g:1712:2: ( rule__External__NameAssignment_0 )
            {
             before(grammarAccess.getExternalAccess().getNameAssignment_0()); 
            // InternalAnn.g:1713:2: ( rule__External__NameAssignment_0 )
            // InternalAnn.g:1713:3: rule__External__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__External__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__0__Impl"


    // $ANTLR start "rule__External__Group__1"
    // InternalAnn.g:1721:1: rule__External__Group__1 : rule__External__Group__1__Impl ;
    public final void rule__External__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1725:1: ( rule__External__Group__1__Impl )
            // InternalAnn.g:1726:2: rule__External__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__External__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__1"


    // $ANTLR start "rule__External__Group__1__Impl"
    // InternalAnn.g:1732:1: rule__External__Group__1__Impl : ( 'external' ) ;
    public final void rule__External__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1736:1: ( ( 'external' ) )
            // InternalAnn.g:1737:1: ( 'external' )
            {
            // InternalAnn.g:1737:1: ( 'external' )
            // InternalAnn.g:1738:2: 'external'
            {
             before(grammarAccess.getExternalAccess().getExternalKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getExternalKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__1__Impl"


    // $ANTLR start "rule__Sigmoid__Group__0"
    // InternalAnn.g:1748:1: rule__Sigmoid__Group__0 : rule__Sigmoid__Group__0__Impl rule__Sigmoid__Group__1 ;
    public final void rule__Sigmoid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1752:1: ( rule__Sigmoid__Group__0__Impl rule__Sigmoid__Group__1 )
            // InternalAnn.g:1753:2: rule__Sigmoid__Group__0__Impl rule__Sigmoid__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Sigmoid__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sigmoid__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sigmoid__Group__0"


    // $ANTLR start "rule__Sigmoid__Group__0__Impl"
    // InternalAnn.g:1760:1: rule__Sigmoid__Group__0__Impl : ( ( rule__Sigmoid__NameAssignment_0 ) ) ;
    public final void rule__Sigmoid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1764:1: ( ( ( rule__Sigmoid__NameAssignment_0 ) ) )
            // InternalAnn.g:1765:1: ( ( rule__Sigmoid__NameAssignment_0 ) )
            {
            // InternalAnn.g:1765:1: ( ( rule__Sigmoid__NameAssignment_0 ) )
            // InternalAnn.g:1766:2: ( rule__Sigmoid__NameAssignment_0 )
            {
             before(grammarAccess.getSigmoidAccess().getNameAssignment_0()); 
            // InternalAnn.g:1767:2: ( rule__Sigmoid__NameAssignment_0 )
            // InternalAnn.g:1767:3: rule__Sigmoid__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Sigmoid__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSigmoidAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sigmoid__Group__0__Impl"


    // $ANTLR start "rule__Sigmoid__Group__1"
    // InternalAnn.g:1775:1: rule__Sigmoid__Group__1 : rule__Sigmoid__Group__1__Impl ;
    public final void rule__Sigmoid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1779:1: ( rule__Sigmoid__Group__1__Impl )
            // InternalAnn.g:1780:2: rule__Sigmoid__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sigmoid__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sigmoid__Group__1"


    // $ANTLR start "rule__Sigmoid__Group__1__Impl"
    // InternalAnn.g:1786:1: rule__Sigmoid__Group__1__Impl : ( ( rule__Sigmoid__RuleAssignment_1 ) ) ;
    public final void rule__Sigmoid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1790:1: ( ( ( rule__Sigmoid__RuleAssignment_1 ) ) )
            // InternalAnn.g:1791:1: ( ( rule__Sigmoid__RuleAssignment_1 ) )
            {
            // InternalAnn.g:1791:1: ( ( rule__Sigmoid__RuleAssignment_1 ) )
            // InternalAnn.g:1792:2: ( rule__Sigmoid__RuleAssignment_1 )
            {
             before(grammarAccess.getSigmoidAccess().getRuleAssignment_1()); 
            // InternalAnn.g:1793:2: ( rule__Sigmoid__RuleAssignment_1 )
            // InternalAnn.g:1793:3: rule__Sigmoid__RuleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sigmoid__RuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSigmoidAccess().getRuleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sigmoid__Group__1__Impl"


    // $ANTLR start "rule__Tansig__Group__0"
    // InternalAnn.g:1802:1: rule__Tansig__Group__0 : rule__Tansig__Group__0__Impl rule__Tansig__Group__1 ;
    public final void rule__Tansig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1806:1: ( rule__Tansig__Group__0__Impl rule__Tansig__Group__1 )
            // InternalAnn.g:1807:2: rule__Tansig__Group__0__Impl rule__Tansig__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Tansig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tansig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tansig__Group__0"


    // $ANTLR start "rule__Tansig__Group__0__Impl"
    // InternalAnn.g:1814:1: rule__Tansig__Group__0__Impl : ( ( rule__Tansig__NameAssignment_0 ) ) ;
    public final void rule__Tansig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1818:1: ( ( ( rule__Tansig__NameAssignment_0 ) ) )
            // InternalAnn.g:1819:1: ( ( rule__Tansig__NameAssignment_0 ) )
            {
            // InternalAnn.g:1819:1: ( ( rule__Tansig__NameAssignment_0 ) )
            // InternalAnn.g:1820:2: ( rule__Tansig__NameAssignment_0 )
            {
             before(grammarAccess.getTansigAccess().getNameAssignment_0()); 
            // InternalAnn.g:1821:2: ( rule__Tansig__NameAssignment_0 )
            // InternalAnn.g:1821:3: rule__Tansig__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Tansig__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTansigAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tansig__Group__0__Impl"


    // $ANTLR start "rule__Tansig__Group__1"
    // InternalAnn.g:1829:1: rule__Tansig__Group__1 : rule__Tansig__Group__1__Impl ;
    public final void rule__Tansig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1833:1: ( rule__Tansig__Group__1__Impl )
            // InternalAnn.g:1834:2: rule__Tansig__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tansig__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tansig__Group__1"


    // $ANTLR start "rule__Tansig__Group__1__Impl"
    // InternalAnn.g:1840:1: rule__Tansig__Group__1__Impl : ( ( rule__Tansig__RuleAssignment_1 ) ) ;
    public final void rule__Tansig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1844:1: ( ( ( rule__Tansig__RuleAssignment_1 ) ) )
            // InternalAnn.g:1845:1: ( ( rule__Tansig__RuleAssignment_1 ) )
            {
            // InternalAnn.g:1845:1: ( ( rule__Tansig__RuleAssignment_1 ) )
            // InternalAnn.g:1846:2: ( rule__Tansig__RuleAssignment_1 )
            {
             before(grammarAccess.getTansigAccess().getRuleAssignment_1()); 
            // InternalAnn.g:1847:2: ( rule__Tansig__RuleAssignment_1 )
            // InternalAnn.g:1847:3: rule__Tansig__RuleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tansig__RuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTansigAccess().getRuleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tansig__Group__1__Impl"


    // $ANTLR start "rule__Custom__Group__0"
    // InternalAnn.g:1856:1: rule__Custom__Group__0 : rule__Custom__Group__0__Impl rule__Custom__Group__1 ;
    public final void rule__Custom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1860:1: ( rule__Custom__Group__0__Impl rule__Custom__Group__1 )
            // InternalAnn.g:1861:2: rule__Custom__Group__0__Impl rule__Custom__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Custom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__0"


    // $ANTLR start "rule__Custom__Group__0__Impl"
    // InternalAnn.g:1868:1: rule__Custom__Group__0__Impl : ( ( rule__Custom__NameAssignment_0 ) ) ;
    public final void rule__Custom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1872:1: ( ( ( rule__Custom__NameAssignment_0 ) ) )
            // InternalAnn.g:1873:1: ( ( rule__Custom__NameAssignment_0 ) )
            {
            // InternalAnn.g:1873:1: ( ( rule__Custom__NameAssignment_0 ) )
            // InternalAnn.g:1874:2: ( rule__Custom__NameAssignment_0 )
            {
             before(grammarAccess.getCustomAccess().getNameAssignment_0()); 
            // InternalAnn.g:1875:2: ( rule__Custom__NameAssignment_0 )
            // InternalAnn.g:1875:3: rule__Custom__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Custom__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCustomAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__0__Impl"


    // $ANTLR start "rule__Custom__Group__1"
    // InternalAnn.g:1883:1: rule__Custom__Group__1 : rule__Custom__Group__1__Impl rule__Custom__Group__2 ;
    public final void rule__Custom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1887:1: ( rule__Custom__Group__1__Impl rule__Custom__Group__2 )
            // InternalAnn.g:1888:2: rule__Custom__Group__1__Impl rule__Custom__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Custom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__1"


    // $ANTLR start "rule__Custom__Group__1__Impl"
    // InternalAnn.g:1895:1: rule__Custom__Group__1__Impl : ( '(x)' ) ;
    public final void rule__Custom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1899:1: ( ( '(x)' ) )
            // InternalAnn.g:1900:1: ( '(x)' )
            {
            // InternalAnn.g:1900:1: ( '(x)' )
            // InternalAnn.g:1901:2: '(x)'
            {
             before(grammarAccess.getCustomAccess().getXKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCustomAccess().getXKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__1__Impl"


    // $ANTLR start "rule__Custom__Group__2"
    // InternalAnn.g:1910:1: rule__Custom__Group__2 : rule__Custom__Group__2__Impl rule__Custom__Group__3 ;
    public final void rule__Custom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1914:1: ( rule__Custom__Group__2__Impl rule__Custom__Group__3 )
            // InternalAnn.g:1915:2: rule__Custom__Group__2__Impl rule__Custom__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Custom__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__2"


    // $ANTLR start "rule__Custom__Group__2__Impl"
    // InternalAnn.g:1922:1: rule__Custom__Group__2__Impl : ( '{' ) ;
    public final void rule__Custom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1926:1: ( ( '{' ) )
            // InternalAnn.g:1927:1: ( '{' )
            {
            // InternalAnn.g:1927:1: ( '{' )
            // InternalAnn.g:1928:2: '{'
            {
             before(grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__2__Impl"


    // $ANTLR start "rule__Custom__Group__3"
    // InternalAnn.g:1937:1: rule__Custom__Group__3 : rule__Custom__Group__3__Impl rule__Custom__Group__4 ;
    public final void rule__Custom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1941:1: ( rule__Custom__Group__3__Impl rule__Custom__Group__4 )
            // InternalAnn.g:1942:2: rule__Custom__Group__3__Impl rule__Custom__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Custom__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__3"


    // $ANTLR start "rule__Custom__Group__3__Impl"
    // InternalAnn.g:1949:1: rule__Custom__Group__3__Impl : ( 'function' ) ;
    public final void rule__Custom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1953:1: ( ( 'function' ) )
            // InternalAnn.g:1954:1: ( 'function' )
            {
            // InternalAnn.g:1954:1: ( 'function' )
            // InternalAnn.g:1955:2: 'function'
            {
             before(grammarAccess.getCustomAccess().getFunctionKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCustomAccess().getFunctionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__3__Impl"


    // $ANTLR start "rule__Custom__Group__4"
    // InternalAnn.g:1964:1: rule__Custom__Group__4 : rule__Custom__Group__4__Impl rule__Custom__Group__5 ;
    public final void rule__Custom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1968:1: ( rule__Custom__Group__4__Impl rule__Custom__Group__5 )
            // InternalAnn.g:1969:2: rule__Custom__Group__4__Impl rule__Custom__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Custom__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__4"


    // $ANTLR start "rule__Custom__Group__4__Impl"
    // InternalAnn.g:1976:1: rule__Custom__Group__4__Impl : ( '=' ) ;
    public final void rule__Custom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1980:1: ( ( '=' ) )
            // InternalAnn.g:1981:1: ( '=' )
            {
            // InternalAnn.g:1981:1: ( '=' )
            // InternalAnn.g:1982:2: '='
            {
             before(grammarAccess.getCustomAccess().getEqualsSignKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCustomAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__4__Impl"


    // $ANTLR start "rule__Custom__Group__5"
    // InternalAnn.g:1991:1: rule__Custom__Group__5 : rule__Custom__Group__5__Impl rule__Custom__Group__6 ;
    public final void rule__Custom__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1995:1: ( rule__Custom__Group__5__Impl rule__Custom__Group__6 )
            // InternalAnn.g:1996:2: rule__Custom__Group__5__Impl rule__Custom__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Custom__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__5"


    // $ANTLR start "rule__Custom__Group__5__Impl"
    // InternalAnn.g:2003:1: rule__Custom__Group__5__Impl : ( ( rule__Custom__ExpAssignment_5 ) ) ;
    public final void rule__Custom__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2007:1: ( ( ( rule__Custom__ExpAssignment_5 ) ) )
            // InternalAnn.g:2008:1: ( ( rule__Custom__ExpAssignment_5 ) )
            {
            // InternalAnn.g:2008:1: ( ( rule__Custom__ExpAssignment_5 ) )
            // InternalAnn.g:2009:2: ( rule__Custom__ExpAssignment_5 )
            {
             before(grammarAccess.getCustomAccess().getExpAssignment_5()); 
            // InternalAnn.g:2010:2: ( rule__Custom__ExpAssignment_5 )
            // InternalAnn.g:2010:3: rule__Custom__ExpAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Custom__ExpAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCustomAccess().getExpAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__5__Impl"


    // $ANTLR start "rule__Custom__Group__6"
    // InternalAnn.g:2018:1: rule__Custom__Group__6 : rule__Custom__Group__6__Impl rule__Custom__Group__7 ;
    public final void rule__Custom__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2022:1: ( rule__Custom__Group__6__Impl rule__Custom__Group__7 )
            // InternalAnn.g:2023:2: rule__Custom__Group__6__Impl rule__Custom__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Custom__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__6"


    // $ANTLR start "rule__Custom__Group__6__Impl"
    // InternalAnn.g:2030:1: rule__Custom__Group__6__Impl : ( 'derivative' ) ;
    public final void rule__Custom__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2034:1: ( ( 'derivative' ) )
            // InternalAnn.g:2035:1: ( 'derivative' )
            {
            // InternalAnn.g:2035:1: ( 'derivative' )
            // InternalAnn.g:2036:2: 'derivative'
            {
             before(grammarAccess.getCustomAccess().getDerivativeKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCustomAccess().getDerivativeKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__6__Impl"


    // $ANTLR start "rule__Custom__Group__7"
    // InternalAnn.g:2045:1: rule__Custom__Group__7 : rule__Custom__Group__7__Impl rule__Custom__Group__8 ;
    public final void rule__Custom__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2049:1: ( rule__Custom__Group__7__Impl rule__Custom__Group__8 )
            // InternalAnn.g:2050:2: rule__Custom__Group__7__Impl rule__Custom__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Custom__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__7"


    // $ANTLR start "rule__Custom__Group__7__Impl"
    // InternalAnn.g:2057:1: rule__Custom__Group__7__Impl : ( '=' ) ;
    public final void rule__Custom__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2061:1: ( ( '=' ) )
            // InternalAnn.g:2062:1: ( '=' )
            {
            // InternalAnn.g:2062:1: ( '=' )
            // InternalAnn.g:2063:2: '='
            {
             before(grammarAccess.getCustomAccess().getEqualsSignKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCustomAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__7__Impl"


    // $ANTLR start "rule__Custom__Group__8"
    // InternalAnn.g:2072:1: rule__Custom__Group__8 : rule__Custom__Group__8__Impl rule__Custom__Group__9 ;
    public final void rule__Custom__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2076:1: ( rule__Custom__Group__8__Impl rule__Custom__Group__9 )
            // InternalAnn.g:2077:2: rule__Custom__Group__8__Impl rule__Custom__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Custom__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Custom__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__8"


    // $ANTLR start "rule__Custom__Group__8__Impl"
    // InternalAnn.g:2084:1: rule__Custom__Group__8__Impl : ( ( rule__Custom__DerAssignment_8 ) ) ;
    public final void rule__Custom__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2088:1: ( ( ( rule__Custom__DerAssignment_8 ) ) )
            // InternalAnn.g:2089:1: ( ( rule__Custom__DerAssignment_8 ) )
            {
            // InternalAnn.g:2089:1: ( ( rule__Custom__DerAssignment_8 ) )
            // InternalAnn.g:2090:2: ( rule__Custom__DerAssignment_8 )
            {
             before(grammarAccess.getCustomAccess().getDerAssignment_8()); 
            // InternalAnn.g:2091:2: ( rule__Custom__DerAssignment_8 )
            // InternalAnn.g:2091:3: rule__Custom__DerAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Custom__DerAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCustomAccess().getDerAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__8__Impl"


    // $ANTLR start "rule__Custom__Group__9"
    // InternalAnn.g:2099:1: rule__Custom__Group__9 : rule__Custom__Group__9__Impl ;
    public final void rule__Custom__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2103:1: ( rule__Custom__Group__9__Impl )
            // InternalAnn.g:2104:2: rule__Custom__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Custom__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__9"


    // $ANTLR start "rule__Custom__Group__9__Impl"
    // InternalAnn.g:2110:1: rule__Custom__Group__9__Impl : ( '}' ) ;
    public final void rule__Custom__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2114:1: ( ( '}' ) )
            // InternalAnn.g:2115:1: ( '}' )
            {
            // InternalAnn.g:2115:1: ( '}' )
            // InternalAnn.g:2116:2: '}'
            {
             before(grammarAccess.getCustomAccess().getRightCurlyBracketKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCustomAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__Group__9__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalAnn.g:2126:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2130:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalAnn.g:2131:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalAnn.g:2138:1: rule__Expression__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2142:1: ( ( ruleFactor ) )
            // InternalAnn.g:2143:1: ( ruleFactor )
            {
            // InternalAnn.g:2143:1: ( ruleFactor )
            // InternalAnn.g:2144:2: ruleFactor
            {
             before(grammarAccess.getExpressionAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getFactorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalAnn.g:2153:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2157:1: ( rule__Expression__Group__1__Impl )
            // InternalAnn.g:2158:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalAnn.g:2164:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2168:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalAnn.g:2169:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalAnn.g:2169:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalAnn.g:2170:2: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalAnn.g:2171:2: ( rule__Expression__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=11 && LA9_0<=12)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAnn.g:2171:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalAnn.g:2180:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2184:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalAnn.g:2185:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalAnn.g:2192:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2196:1: ( ( () ) )
            // InternalAnn.g:2197:1: ( () )
            {
            // InternalAnn.g:2197:1: ( () )
            // InternalAnn.g:2198:2: ()
            {
             before(grammarAccess.getExpressionAccess().getPartLeftAction_1_0()); 
            // InternalAnn.g:2199:2: ()
            // InternalAnn.g:2199:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getPartLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalAnn.g:2207:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2211:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalAnn.g:2212:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalAnn.g:2219:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OperatorAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2223:1: ( ( ( rule__Expression__OperatorAssignment_1_1 ) ) )
            // InternalAnn.g:2224:1: ( ( rule__Expression__OperatorAssignment_1_1 ) )
            {
            // InternalAnn.g:2224:1: ( ( rule__Expression__OperatorAssignment_1_1 ) )
            // InternalAnn.g:2225:2: ( rule__Expression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAnn.g:2226:2: ( rule__Expression__OperatorAssignment_1_1 )
            // InternalAnn.g:2226:3: rule__Expression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__2"
    // InternalAnn.g:2234:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2238:1: ( rule__Expression__Group_1__2__Impl )
            // InternalAnn.g:2239:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__2"


    // $ANTLR start "rule__Expression__Group_1__2__Impl"
    // InternalAnn.g:2245:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2249:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // InternalAnn.g:2250:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // InternalAnn.g:2250:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // InternalAnn.g:2251:2: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // InternalAnn.g:2252:2: ( rule__Expression__RightAssignment_1_2 )
            // InternalAnn.g:2252:3: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__2__Impl"


    // $ANTLR start "rule__Factor__Group__0"
    // InternalAnn.g:2261:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2265:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalAnn.g:2266:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Factor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0"


    // $ANTLR start "rule__Factor__Group__0__Impl"
    // InternalAnn.g:2273:1: rule__Factor__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2277:1: ( ( rulePrimary ) )
            // InternalAnn.g:2278:1: ( rulePrimary )
            {
            // InternalAnn.g:2278:1: ( rulePrimary )
            // InternalAnn.g:2279:2: rulePrimary
            {
             before(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0__Impl"


    // $ANTLR start "rule__Factor__Group__1"
    // InternalAnn.g:2288:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2292:1: ( rule__Factor__Group__1__Impl )
            // InternalAnn.g:2293:2: rule__Factor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1"


    // $ANTLR start "rule__Factor__Group__1__Impl"
    // InternalAnn.g:2299:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )* ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2303:1: ( ( ( rule__Factor__Group_1__0 )* ) )
            // InternalAnn.g:2304:1: ( ( rule__Factor__Group_1__0 )* )
            {
            // InternalAnn.g:2304:1: ( ( rule__Factor__Group_1__0 )* )
            // InternalAnn.g:2305:2: ( rule__Factor__Group_1__0 )*
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // InternalAnn.g:2306:2: ( rule__Factor__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=13 && LA10_0<=14)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAnn.g:2306:3: rule__Factor__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Factor__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFactorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__0"
    // InternalAnn.g:2315:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2319:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalAnn.g:2320:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0"


    // $ANTLR start "rule__Factor__Group_1__0__Impl"
    // InternalAnn.g:2327:1: rule__Factor__Group_1__0__Impl : ( () ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2331:1: ( ( () ) )
            // InternalAnn.g:2332:1: ( () )
            {
            // InternalAnn.g:2332:1: ( () )
            // InternalAnn.g:2333:2: ()
            {
             before(grammarAccess.getFactorAccess().getFacLeftAction_1_0()); 
            // InternalAnn.g:2334:2: ()
            // InternalAnn.g:2334:3: 
            {
            }

             after(grammarAccess.getFactorAccess().getFacLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1__1"
    // InternalAnn.g:2342:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2346:1: ( rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 )
            // InternalAnn.g:2347:2: rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__Factor__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1"


    // $ANTLR start "rule__Factor__Group_1__1__Impl"
    // InternalAnn.g:2354:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__OperatorAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2358:1: ( ( ( rule__Factor__OperatorAssignment_1_1 ) ) )
            // InternalAnn.g:2359:1: ( ( rule__Factor__OperatorAssignment_1_1 ) )
            {
            // InternalAnn.g:2359:1: ( ( rule__Factor__OperatorAssignment_1_1 ) )
            // InternalAnn.g:2360:2: ( rule__Factor__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getOperatorAssignment_1_1()); 
            // InternalAnn.g:2361:2: ( rule__Factor__OperatorAssignment_1_1 )
            // InternalAnn.g:2361:3: rule__Factor__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__2"
    // InternalAnn.g:2369:1: rule__Factor__Group_1__2 : rule__Factor__Group_1__2__Impl ;
    public final void rule__Factor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2373:1: ( rule__Factor__Group_1__2__Impl )
            // InternalAnn.g:2374:2: rule__Factor__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__2"


    // $ANTLR start "rule__Factor__Group_1__2__Impl"
    // InternalAnn.g:2380:1: rule__Factor__Group_1__2__Impl : ( ( rule__Factor__RightAssignment_1_2 ) ) ;
    public final void rule__Factor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2384:1: ( ( ( rule__Factor__RightAssignment_1_2 ) ) )
            // InternalAnn.g:2385:1: ( ( rule__Factor__RightAssignment_1_2 ) )
            {
            // InternalAnn.g:2385:1: ( ( rule__Factor__RightAssignment_1_2 ) )
            // InternalAnn.g:2386:2: ( rule__Factor__RightAssignment_1_2 )
            {
             before(grammarAccess.getFactorAccess().getRightAssignment_1_2()); 
            // InternalAnn.g:2387:2: ( rule__Factor__RightAssignment_1_2 )
            // InternalAnn.g:2387:3: rule__Factor__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Factor__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalAnn.g:2396:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2400:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalAnn.g:2401:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalAnn.g:2408:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2412:1: ( ( '(' ) )
            // InternalAnn.g:2413:1: ( '(' )
            {
            // InternalAnn.g:2413:1: ( '(' )
            // InternalAnn.g:2414:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalAnn.g:2423:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2427:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalAnn.g:2428:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_27);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalAnn.g:2435:1: rule__Primary__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2439:1: ( ( ruleExpression ) )
            // InternalAnn.g:2440:1: ( ruleExpression )
            {
            // InternalAnn.g:2440:1: ( ruleExpression )
            // InternalAnn.g:2441:2: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // InternalAnn.g:2450:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2454:1: ( rule__Primary__Group_2__2__Impl )
            // InternalAnn.g:2455:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // InternalAnn.g:2461:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2465:1: ( ( ')' ) )
            // InternalAnn.g:2466:1: ( ')' )
            {
            // InternalAnn.g:2466:1: ( ')' )
            // InternalAnn.g:2467:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__Euler__Group__0"
    // InternalAnn.g:2477:1: rule__Euler__Group__0 : rule__Euler__Group__0__Impl rule__Euler__Group__1 ;
    public final void rule__Euler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2481:1: ( rule__Euler__Group__0__Impl rule__Euler__Group__1 )
            // InternalAnn.g:2482:2: rule__Euler__Group__0__Impl rule__Euler__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Euler__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Euler__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Euler__Group__0"


    // $ANTLR start "rule__Euler__Group__0__Impl"
    // InternalAnn.g:2489:1: rule__Euler__Group__0__Impl : ( 'e(' ) ;
    public final void rule__Euler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2493:1: ( ( 'e(' ) )
            // InternalAnn.g:2494:1: ( 'e(' )
            {
            // InternalAnn.g:2494:1: ( 'e(' )
            // InternalAnn.g:2495:2: 'e('
            {
             before(grammarAccess.getEulerAccess().getEKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEulerAccess().getEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Euler__Group__0__Impl"


    // $ANTLR start "rule__Euler__Group__1"
    // InternalAnn.g:2504:1: rule__Euler__Group__1 : rule__Euler__Group__1__Impl rule__Euler__Group__2 ;
    public final void rule__Euler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2508:1: ( rule__Euler__Group__1__Impl rule__Euler__Group__2 )
            // InternalAnn.g:2509:2: rule__Euler__Group__1__Impl rule__Euler__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Euler__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Euler__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Euler__Group__1"


    // $ANTLR start "rule__Euler__Group__1__Impl"
    // InternalAnn.g:2516:1: rule__Euler__Group__1__Impl : ( ( rule__Euler__ValueAssignment_1 ) ) ;
    public final void rule__Euler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2520:1: ( ( ( rule__Euler__ValueAssignment_1 ) ) )
            // InternalAnn.g:2521:1: ( ( rule__Euler__ValueAssignment_1 ) )
            {
            // InternalAnn.g:2521:1: ( ( rule__Euler__ValueAssignment_1 ) )
            // InternalAnn.g:2522:2: ( rule__Euler__ValueAssignment_1 )
            {
             before(grammarAccess.getEulerAccess().getValueAssignment_1()); 
            // InternalAnn.g:2523:2: ( rule__Euler__ValueAssignment_1 )
            // InternalAnn.g:2523:3: rule__Euler__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Euler__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEulerAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Euler__Group__1__Impl"


    // $ANTLR start "rule__Euler__Group__2"
    // InternalAnn.g:2531:1: rule__Euler__Group__2 : rule__Euler__Group__2__Impl ;
    public final void rule__Euler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2535:1: ( rule__Euler__Group__2__Impl )
            // InternalAnn.g:2536:2: rule__Euler__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Euler__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Euler__Group__2"


    // $ANTLR start "rule__Euler__Group__2__Impl"
    // InternalAnn.g:2542:1: rule__Euler__Group__2__Impl : ( ')' ) ;
    public final void rule__Euler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2546:1: ( ( ')' ) )
            // InternalAnn.g:2547:1: ( ')' )
            {
            // InternalAnn.g:2547:1: ( ')' )
            // InternalAnn.g:2548:2: ')'
            {
             before(grammarAccess.getEulerAccess().getRightParenthesisKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEulerAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Euler__Group__2__Impl"


    // $ANTLR start "rule__NLog__Group__0"
    // InternalAnn.g:2558:1: rule__NLog__Group__0 : rule__NLog__Group__0__Impl rule__NLog__Group__1 ;
    public final void rule__NLog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2562:1: ( rule__NLog__Group__0__Impl rule__NLog__Group__1 )
            // InternalAnn.g:2563:2: rule__NLog__Group__0__Impl rule__NLog__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__NLog__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NLog__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NLog__Group__0"


    // $ANTLR start "rule__NLog__Group__0__Impl"
    // InternalAnn.g:2570:1: rule__NLog__Group__0__Impl : ( 'nlog(' ) ;
    public final void rule__NLog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2574:1: ( ( 'nlog(' ) )
            // InternalAnn.g:2575:1: ( 'nlog(' )
            {
            // InternalAnn.g:2575:1: ( 'nlog(' )
            // InternalAnn.g:2576:2: 'nlog('
            {
             before(grammarAccess.getNLogAccess().getNlogKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNLogAccess().getNlogKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NLog__Group__0__Impl"


    // $ANTLR start "rule__NLog__Group__1"
    // InternalAnn.g:2585:1: rule__NLog__Group__1 : rule__NLog__Group__1__Impl rule__NLog__Group__2 ;
    public final void rule__NLog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2589:1: ( rule__NLog__Group__1__Impl rule__NLog__Group__2 )
            // InternalAnn.g:2590:2: rule__NLog__Group__1__Impl rule__NLog__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__NLog__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NLog__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NLog__Group__1"


    // $ANTLR start "rule__NLog__Group__1__Impl"
    // InternalAnn.g:2597:1: rule__NLog__Group__1__Impl : ( ( rule__NLog__ValueAssignment_1 ) ) ;
    public final void rule__NLog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2601:1: ( ( ( rule__NLog__ValueAssignment_1 ) ) )
            // InternalAnn.g:2602:1: ( ( rule__NLog__ValueAssignment_1 ) )
            {
            // InternalAnn.g:2602:1: ( ( rule__NLog__ValueAssignment_1 ) )
            // InternalAnn.g:2603:2: ( rule__NLog__ValueAssignment_1 )
            {
             before(grammarAccess.getNLogAccess().getValueAssignment_1()); 
            // InternalAnn.g:2604:2: ( rule__NLog__ValueAssignment_1 )
            // InternalAnn.g:2604:3: rule__NLog__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NLog__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNLogAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NLog__Group__1__Impl"


    // $ANTLR start "rule__NLog__Group__2"
    // InternalAnn.g:2612:1: rule__NLog__Group__2 : rule__NLog__Group__2__Impl ;
    public final void rule__NLog__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2616:1: ( rule__NLog__Group__2__Impl )
            // InternalAnn.g:2617:2: rule__NLog__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NLog__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NLog__Group__2"


    // $ANTLR start "rule__NLog__Group__2__Impl"
    // InternalAnn.g:2623:1: rule__NLog__Group__2__Impl : ( ')' ) ;
    public final void rule__NLog__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2627:1: ( ( ')' ) )
            // InternalAnn.g:2628:1: ( ')' )
            {
            // InternalAnn.g:2628:1: ( ')' )
            // InternalAnn.g:2629:2: ')'
            {
             before(grammarAccess.getNLogAccess().getRightParenthesisKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getNLogAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NLog__Group__2__Impl"


    // $ANTLR start "rule__Sin__Group__0"
    // InternalAnn.g:2639:1: rule__Sin__Group__0 : rule__Sin__Group__0__Impl rule__Sin__Group__1 ;
    public final void rule__Sin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2643:1: ( rule__Sin__Group__0__Impl rule__Sin__Group__1 )
            // InternalAnn.g:2644:2: rule__Sin__Group__0__Impl rule__Sin__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Sin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__0"


    // $ANTLR start "rule__Sin__Group__0__Impl"
    // InternalAnn.g:2651:1: rule__Sin__Group__0__Impl : ( 'sin(' ) ;
    public final void rule__Sin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2655:1: ( ( 'sin(' ) )
            // InternalAnn.g:2656:1: ( 'sin(' )
            {
            // InternalAnn.g:2656:1: ( 'sin(' )
            // InternalAnn.g:2657:2: 'sin('
            {
             before(grammarAccess.getSinAccess().getSinKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSinAccess().getSinKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__0__Impl"


    // $ANTLR start "rule__Sin__Group__1"
    // InternalAnn.g:2666:1: rule__Sin__Group__1 : rule__Sin__Group__1__Impl rule__Sin__Group__2 ;
    public final void rule__Sin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2670:1: ( rule__Sin__Group__1__Impl rule__Sin__Group__2 )
            // InternalAnn.g:2671:2: rule__Sin__Group__1__Impl rule__Sin__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Sin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__1"


    // $ANTLR start "rule__Sin__Group__1__Impl"
    // InternalAnn.g:2678:1: rule__Sin__Group__1__Impl : ( ( rule__Sin__ValueAssignment_1 ) ) ;
    public final void rule__Sin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2682:1: ( ( ( rule__Sin__ValueAssignment_1 ) ) )
            // InternalAnn.g:2683:1: ( ( rule__Sin__ValueAssignment_1 ) )
            {
            // InternalAnn.g:2683:1: ( ( rule__Sin__ValueAssignment_1 ) )
            // InternalAnn.g:2684:2: ( rule__Sin__ValueAssignment_1 )
            {
             before(grammarAccess.getSinAccess().getValueAssignment_1()); 
            // InternalAnn.g:2685:2: ( rule__Sin__ValueAssignment_1 )
            // InternalAnn.g:2685:3: rule__Sin__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sin__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSinAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__1__Impl"


    // $ANTLR start "rule__Sin__Group__2"
    // InternalAnn.g:2693:1: rule__Sin__Group__2 : rule__Sin__Group__2__Impl ;
    public final void rule__Sin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2697:1: ( rule__Sin__Group__2__Impl )
            // InternalAnn.g:2698:2: rule__Sin__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sin__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__2"


    // $ANTLR start "rule__Sin__Group__2__Impl"
    // InternalAnn.g:2704:1: rule__Sin__Group__2__Impl : ( ')' ) ;
    public final void rule__Sin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2708:1: ( ( ')' ) )
            // InternalAnn.g:2709:1: ( ')' )
            {
            // InternalAnn.g:2709:1: ( ')' )
            // InternalAnn.g:2710:2: ')'
            {
             before(grammarAccess.getSinAccess().getRightParenthesisKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSinAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__Group__2__Impl"


    // $ANTLR start "rule__Cos__Group__0"
    // InternalAnn.g:2720:1: rule__Cos__Group__0 : rule__Cos__Group__0__Impl rule__Cos__Group__1 ;
    public final void rule__Cos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2724:1: ( rule__Cos__Group__0__Impl rule__Cos__Group__1 )
            // InternalAnn.g:2725:2: rule__Cos__Group__0__Impl rule__Cos__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Cos__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cos__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__0"


    // $ANTLR start "rule__Cos__Group__0__Impl"
    // InternalAnn.g:2732:1: rule__Cos__Group__0__Impl : ( 'cos(' ) ;
    public final void rule__Cos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2736:1: ( ( 'cos(' ) )
            // InternalAnn.g:2737:1: ( 'cos(' )
            {
            // InternalAnn.g:2737:1: ( 'cos(' )
            // InternalAnn.g:2738:2: 'cos('
            {
             before(grammarAccess.getCosAccess().getCosKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCosAccess().getCosKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__0__Impl"


    // $ANTLR start "rule__Cos__Group__1"
    // InternalAnn.g:2747:1: rule__Cos__Group__1 : rule__Cos__Group__1__Impl rule__Cos__Group__2 ;
    public final void rule__Cos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2751:1: ( rule__Cos__Group__1__Impl rule__Cos__Group__2 )
            // InternalAnn.g:2752:2: rule__Cos__Group__1__Impl rule__Cos__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Cos__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cos__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__1"


    // $ANTLR start "rule__Cos__Group__1__Impl"
    // InternalAnn.g:2759:1: rule__Cos__Group__1__Impl : ( ( rule__Cos__ValueAssignment_1 ) ) ;
    public final void rule__Cos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2763:1: ( ( ( rule__Cos__ValueAssignment_1 ) ) )
            // InternalAnn.g:2764:1: ( ( rule__Cos__ValueAssignment_1 ) )
            {
            // InternalAnn.g:2764:1: ( ( rule__Cos__ValueAssignment_1 ) )
            // InternalAnn.g:2765:2: ( rule__Cos__ValueAssignment_1 )
            {
             before(grammarAccess.getCosAccess().getValueAssignment_1()); 
            // InternalAnn.g:2766:2: ( rule__Cos__ValueAssignment_1 )
            // InternalAnn.g:2766:3: rule__Cos__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cos__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCosAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__1__Impl"


    // $ANTLR start "rule__Cos__Group__2"
    // InternalAnn.g:2774:1: rule__Cos__Group__2 : rule__Cos__Group__2__Impl ;
    public final void rule__Cos__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2778:1: ( rule__Cos__Group__2__Impl )
            // InternalAnn.g:2779:2: rule__Cos__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cos__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__2"


    // $ANTLR start "rule__Cos__Group__2__Impl"
    // InternalAnn.g:2785:1: rule__Cos__Group__2__Impl : ( ')' ) ;
    public final void rule__Cos__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2789:1: ( ( ')' ) )
            // InternalAnn.g:2790:1: ( ')' )
            {
            // InternalAnn.g:2790:1: ( ')' )
            // InternalAnn.g:2791:2: ')'
            {
             before(grammarAccess.getCosAccess().getRightParenthesisKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCosAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__Group__2__Impl"


    // $ANTLR start "rule__Sqrt__Group__0"
    // InternalAnn.g:2801:1: rule__Sqrt__Group__0 : rule__Sqrt__Group__0__Impl rule__Sqrt__Group__1 ;
    public final void rule__Sqrt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2805:1: ( rule__Sqrt__Group__0__Impl rule__Sqrt__Group__1 )
            // InternalAnn.g:2806:2: rule__Sqrt__Group__0__Impl rule__Sqrt__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Sqrt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sqrt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__0"


    // $ANTLR start "rule__Sqrt__Group__0__Impl"
    // InternalAnn.g:2813:1: rule__Sqrt__Group__0__Impl : ( 'sqrt(' ) ;
    public final void rule__Sqrt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2817:1: ( ( 'sqrt(' ) )
            // InternalAnn.g:2818:1: ( 'sqrt(' )
            {
            // InternalAnn.g:2818:1: ( 'sqrt(' )
            // InternalAnn.g:2819:2: 'sqrt('
            {
             before(grammarAccess.getSqrtAccess().getSqrtKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSqrtAccess().getSqrtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__0__Impl"


    // $ANTLR start "rule__Sqrt__Group__1"
    // InternalAnn.g:2828:1: rule__Sqrt__Group__1 : rule__Sqrt__Group__1__Impl rule__Sqrt__Group__2 ;
    public final void rule__Sqrt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2832:1: ( rule__Sqrt__Group__1__Impl rule__Sqrt__Group__2 )
            // InternalAnn.g:2833:2: rule__Sqrt__Group__1__Impl rule__Sqrt__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Sqrt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sqrt__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__1"


    // $ANTLR start "rule__Sqrt__Group__1__Impl"
    // InternalAnn.g:2840:1: rule__Sqrt__Group__1__Impl : ( ( rule__Sqrt__ValueAssignment_1 ) ) ;
    public final void rule__Sqrt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2844:1: ( ( ( rule__Sqrt__ValueAssignment_1 ) ) )
            // InternalAnn.g:2845:1: ( ( rule__Sqrt__ValueAssignment_1 ) )
            {
            // InternalAnn.g:2845:1: ( ( rule__Sqrt__ValueAssignment_1 ) )
            // InternalAnn.g:2846:2: ( rule__Sqrt__ValueAssignment_1 )
            {
             before(grammarAccess.getSqrtAccess().getValueAssignment_1()); 
            // InternalAnn.g:2847:2: ( rule__Sqrt__ValueAssignment_1 )
            // InternalAnn.g:2847:3: rule__Sqrt__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sqrt__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSqrtAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__1__Impl"


    // $ANTLR start "rule__Sqrt__Group__2"
    // InternalAnn.g:2855:1: rule__Sqrt__Group__2 : rule__Sqrt__Group__2__Impl ;
    public final void rule__Sqrt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2859:1: ( rule__Sqrt__Group__2__Impl )
            // InternalAnn.g:2860:2: rule__Sqrt__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sqrt__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__2"


    // $ANTLR start "rule__Sqrt__Group__2__Impl"
    // InternalAnn.g:2866:1: rule__Sqrt__Group__2__Impl : ( ')' ) ;
    public final void rule__Sqrt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2870:1: ( ( ')' ) )
            // InternalAnn.g:2871:1: ( ')' )
            {
            // InternalAnn.g:2871:1: ( ')' )
            // InternalAnn.g:2872:2: ')'
            {
             before(grammarAccess.getSqrtAccess().getRightParenthesisKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSqrtAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__Group__2__Impl"


    // $ANTLR start "rule__Power__Group__0"
    // InternalAnn.g:2882:1: rule__Power__Group__0 : rule__Power__Group__0__Impl rule__Power__Group__1 ;
    public final void rule__Power__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2886:1: ( rule__Power__Group__0__Impl rule__Power__Group__1 )
            // InternalAnn.g:2887:2: rule__Power__Group__0__Impl rule__Power__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Power__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Power__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__0"


    // $ANTLR start "rule__Power__Group__0__Impl"
    // InternalAnn.g:2894:1: rule__Power__Group__0__Impl : ( 'pow(' ) ;
    public final void rule__Power__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2898:1: ( ( 'pow(' ) )
            // InternalAnn.g:2899:1: ( 'pow(' )
            {
            // InternalAnn.g:2899:1: ( 'pow(' )
            // InternalAnn.g:2900:2: 'pow('
            {
             before(grammarAccess.getPowerAccess().getPowKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPowerAccess().getPowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__0__Impl"


    // $ANTLR start "rule__Power__Group__1"
    // InternalAnn.g:2909:1: rule__Power__Group__1 : rule__Power__Group__1__Impl rule__Power__Group__2 ;
    public final void rule__Power__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2913:1: ( rule__Power__Group__1__Impl rule__Power__Group__2 )
            // InternalAnn.g:2914:2: rule__Power__Group__1__Impl rule__Power__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Power__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Power__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__1"


    // $ANTLR start "rule__Power__Group__1__Impl"
    // InternalAnn.g:2921:1: rule__Power__Group__1__Impl : ( ( rule__Power__BaseAssignment_1 ) ) ;
    public final void rule__Power__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2925:1: ( ( ( rule__Power__BaseAssignment_1 ) ) )
            // InternalAnn.g:2926:1: ( ( rule__Power__BaseAssignment_1 ) )
            {
            // InternalAnn.g:2926:1: ( ( rule__Power__BaseAssignment_1 ) )
            // InternalAnn.g:2927:2: ( rule__Power__BaseAssignment_1 )
            {
             before(grammarAccess.getPowerAccess().getBaseAssignment_1()); 
            // InternalAnn.g:2928:2: ( rule__Power__BaseAssignment_1 )
            // InternalAnn.g:2928:3: rule__Power__BaseAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Power__BaseAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPowerAccess().getBaseAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__1__Impl"


    // $ANTLR start "rule__Power__Group__2"
    // InternalAnn.g:2936:1: rule__Power__Group__2 : rule__Power__Group__2__Impl rule__Power__Group__3 ;
    public final void rule__Power__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2940:1: ( rule__Power__Group__2__Impl rule__Power__Group__3 )
            // InternalAnn.g:2941:2: rule__Power__Group__2__Impl rule__Power__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Power__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Power__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__2"


    // $ANTLR start "rule__Power__Group__2__Impl"
    // InternalAnn.g:2948:1: rule__Power__Group__2__Impl : ( ',' ) ;
    public final void rule__Power__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2952:1: ( ( ',' ) )
            // InternalAnn.g:2953:1: ( ',' )
            {
            // InternalAnn.g:2953:1: ( ',' )
            // InternalAnn.g:2954:2: ','
            {
             before(grammarAccess.getPowerAccess().getCommaKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPowerAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__2__Impl"


    // $ANTLR start "rule__Power__Group__3"
    // InternalAnn.g:2963:1: rule__Power__Group__3 : rule__Power__Group__3__Impl rule__Power__Group__4 ;
    public final void rule__Power__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2967:1: ( rule__Power__Group__3__Impl rule__Power__Group__4 )
            // InternalAnn.g:2968:2: rule__Power__Group__3__Impl rule__Power__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Power__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Power__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__3"


    // $ANTLR start "rule__Power__Group__3__Impl"
    // InternalAnn.g:2975:1: rule__Power__Group__3__Impl : ( ( rule__Power__ExponentAssignment_3 ) ) ;
    public final void rule__Power__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2979:1: ( ( ( rule__Power__ExponentAssignment_3 ) ) )
            // InternalAnn.g:2980:1: ( ( rule__Power__ExponentAssignment_3 ) )
            {
            // InternalAnn.g:2980:1: ( ( rule__Power__ExponentAssignment_3 ) )
            // InternalAnn.g:2981:2: ( rule__Power__ExponentAssignment_3 )
            {
             before(grammarAccess.getPowerAccess().getExponentAssignment_3()); 
            // InternalAnn.g:2982:2: ( rule__Power__ExponentAssignment_3 )
            // InternalAnn.g:2982:3: rule__Power__ExponentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Power__ExponentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPowerAccess().getExponentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__3__Impl"


    // $ANTLR start "rule__Power__Group__4"
    // InternalAnn.g:2990:1: rule__Power__Group__4 : rule__Power__Group__4__Impl ;
    public final void rule__Power__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2994:1: ( rule__Power__Group__4__Impl )
            // InternalAnn.g:2995:2: rule__Power__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Power__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__4"


    // $ANTLR start "rule__Power__Group__4__Impl"
    // InternalAnn.g:3001:1: rule__Power__Group__4__Impl : ( ')' ) ;
    public final void rule__Power__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3005:1: ( ( ')' ) )
            // InternalAnn.g:3006:1: ( ')' )
            {
            // InternalAnn.g:3006:1: ( ')' )
            // InternalAnn.g:3007:2: ')'
            {
             before(grammarAccess.getPowerAccess().getRightParenthesisKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPowerAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__4__Impl"


    // $ANTLR start "rule__Letter__Group__0"
    // InternalAnn.g:3017:1: rule__Letter__Group__0 : rule__Letter__Group__0__Impl rule__Letter__Group__1 ;
    public final void rule__Letter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3021:1: ( rule__Letter__Group__0__Impl rule__Letter__Group__1 )
            // InternalAnn.g:3022:2: rule__Letter__Group__0__Impl rule__Letter__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Letter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Letter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Letter__Group__0"


    // $ANTLR start "rule__Letter__Group__0__Impl"
    // InternalAnn.g:3029:1: rule__Letter__Group__0__Impl : ( ( rule__Letter__OperatorAssignment_0 )? ) ;
    public final void rule__Letter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3033:1: ( ( ( rule__Letter__OperatorAssignment_0 )? ) )
            // InternalAnn.g:3034:1: ( ( rule__Letter__OperatorAssignment_0 )? )
            {
            // InternalAnn.g:3034:1: ( ( rule__Letter__OperatorAssignment_0 )? )
            // InternalAnn.g:3035:2: ( rule__Letter__OperatorAssignment_0 )?
            {
             before(grammarAccess.getLetterAccess().getOperatorAssignment_0()); 
            // InternalAnn.g:3036:2: ( rule__Letter__OperatorAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=11 && LA11_0<=12)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAnn.g:3036:3: rule__Letter__OperatorAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Letter__OperatorAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLetterAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Letter__Group__0__Impl"


    // $ANTLR start "rule__Letter__Group__1"
    // InternalAnn.g:3044:1: rule__Letter__Group__1 : rule__Letter__Group__1__Impl ;
    public final void rule__Letter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3048:1: ( rule__Letter__Group__1__Impl )
            // InternalAnn.g:3049:2: rule__Letter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Letter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Letter__Group__1"


    // $ANTLR start "rule__Letter__Group__1__Impl"
    // InternalAnn.g:3055:1: rule__Letter__Group__1__Impl : ( ( rule__Letter__ValueAssignment_1 ) ) ;
    public final void rule__Letter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3059:1: ( ( ( rule__Letter__ValueAssignment_1 ) ) )
            // InternalAnn.g:3060:1: ( ( rule__Letter__ValueAssignment_1 ) )
            {
            // InternalAnn.g:3060:1: ( ( rule__Letter__ValueAssignment_1 ) )
            // InternalAnn.g:3061:2: ( rule__Letter__ValueAssignment_1 )
            {
             before(grammarAccess.getLetterAccess().getValueAssignment_1()); 
            // InternalAnn.g:3062:2: ( rule__Letter__ValueAssignment_1 )
            // InternalAnn.g:3062:3: rule__Letter__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Letter__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLetterAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Letter__Group__1__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__0"
    // InternalAnn.g:3071:1: rule__NumberLiteral__Group__0 : rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 ;
    public final void rule__NumberLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3075:1: ( rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 )
            // InternalAnn.g:3076:2: rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__NumberLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__0"


    // $ANTLR start "rule__NumberLiteral__Group__0__Impl"
    // InternalAnn.g:3083:1: rule__NumberLiteral__Group__0__Impl : ( ( rule__NumberLiteral__OperatorAssignment_0 )? ) ;
    public final void rule__NumberLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3087:1: ( ( ( rule__NumberLiteral__OperatorAssignment_0 )? ) )
            // InternalAnn.g:3088:1: ( ( rule__NumberLiteral__OperatorAssignment_0 )? )
            {
            // InternalAnn.g:3088:1: ( ( rule__NumberLiteral__OperatorAssignment_0 )? )
            // InternalAnn.g:3089:2: ( rule__NumberLiteral__OperatorAssignment_0 )?
            {
             before(grammarAccess.getNumberLiteralAccess().getOperatorAssignment_0()); 
            // InternalAnn.g:3090:2: ( rule__NumberLiteral__OperatorAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=12)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAnn.g:3090:3: rule__NumberLiteral__OperatorAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumberLiteral__OperatorAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberLiteralAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__0__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__1"
    // InternalAnn.g:3098:1: rule__NumberLiteral__Group__1 : rule__NumberLiteral__Group__1__Impl ;
    public final void rule__NumberLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3102:1: ( rule__NumberLiteral__Group__1__Impl )
            // InternalAnn.g:3103:2: rule__NumberLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__1"


    // $ANTLR start "rule__NumberLiteral__Group__1__Impl"
    // InternalAnn.g:3109:1: rule__NumberLiteral__Group__1__Impl : ( ( rule__NumberLiteral__ValueAssignment_1 ) ) ;
    public final void rule__NumberLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3113:1: ( ( ( rule__NumberLiteral__ValueAssignment_1 ) ) )
            // InternalAnn.g:3114:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            {
            // InternalAnn.g:3114:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            // InternalAnn.g:3115:2: ( rule__NumberLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment_1()); 
            // InternalAnn.g:3116:2: ( rule__NumberLiteral__ValueAssignment_1 )
            // InternalAnn.g:3116:3: rule__NumberLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__1__Impl"


    // $ANTLR start "rule__ANNModel__NameAssignment_0"
    // InternalAnn.g:3125:1: rule__ANNModel__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ANNModel__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3129:1: ( ( RULE_ID ) )
            // InternalAnn.g:3130:2: ( RULE_ID )
            {
            // InternalAnn.g:3130:2: ( RULE_ID )
            // InternalAnn.g:3131:3: RULE_ID
            {
             before(grammarAccess.getANNModelAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getANNModelAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__NameAssignment_0"


    // $ANTLR start "rule__ANNModel__AlphaAssignment_3"
    // InternalAnn.g:3140:1: rule__ANNModel__AlphaAssignment_3 : ( ruleDECIMAL ) ;
    public final void rule__ANNModel__AlphaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3144:1: ( ( ruleDECIMAL ) )
            // InternalAnn.g:3145:2: ( ruleDECIMAL )
            {
            // InternalAnn.g:3145:2: ( ruleDECIMAL )
            // InternalAnn.g:3146:3: ruleDECIMAL
            {
             before(grammarAccess.getANNModelAccess().getAlphaDECIMALParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getANNModelAccess().getAlphaDECIMALParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__AlphaAssignment_3"


    // $ANTLR start "rule__ANNModel__EpochsAssignment_5"
    // InternalAnn.g:3155:1: rule__ANNModel__EpochsAssignment_5 : ( RULE_INT ) ;
    public final void rule__ANNModel__EpochsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3159:1: ( ( RULE_INT ) )
            // InternalAnn.g:3160:2: ( RULE_INT )
            {
            // InternalAnn.g:3160:2: ( RULE_INT )
            // InternalAnn.g:3161:3: RULE_INT
            {
             before(grammarAccess.getANNModelAccess().getEpochsINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getANNModelAccess().getEpochsINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__EpochsAssignment_5"


    // $ANTLR start "rule__ANNModel__ActivationAssignment_6"
    // InternalAnn.g:3170:1: rule__ANNModel__ActivationAssignment_6 : ( ruleActivation ) ;
    public final void rule__ANNModel__ActivationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3174:1: ( ( ruleActivation ) )
            // InternalAnn.g:3175:2: ( ruleActivation )
            {
            // InternalAnn.g:3175:2: ( ruleActivation )
            // InternalAnn.g:3176:3: ruleActivation
            {
             before(grammarAccess.getANNModelAccess().getActivationActivationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleActivation();

            state._fsp--;

             after(grammarAccess.getANNModelAccess().getActivationActivationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__ActivationAssignment_6"


    // $ANTLR start "rule__ANNModel__LayerAssignment_7"
    // InternalAnn.g:3185:1: rule__ANNModel__LayerAssignment_7 : ( ruleLayer ) ;
    public final void rule__ANNModel__LayerAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3189:1: ( ( ruleLayer ) )
            // InternalAnn.g:3190:2: ( ruleLayer )
            {
            // InternalAnn.g:3190:2: ( ruleLayer )
            // InternalAnn.g:3191:3: ruleLayer
            {
             before(grammarAccess.getANNModelAccess().getLayerLayerParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getANNModelAccess().getLayerLayerParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__LayerAssignment_7"


    // $ANTLR start "rule__Hidden__SizeAssignment_3"
    // InternalAnn.g:3200:1: rule__Hidden__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__Hidden__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3204:1: ( ( RULE_INT ) )
            // InternalAnn.g:3205:2: ( RULE_INT )
            {
            // InternalAnn.g:3205:2: ( RULE_INT )
            // InternalAnn.g:3206:3: RULE_INT
            {
             before(grammarAccess.getHiddenAccess().getSizeINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHiddenAccess().getSizeINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__SizeAssignment_3"


    // $ANTLR start "rule__Hidden__L_ruleAssignment_5"
    // InternalAnn.g:3215:1: rule__Hidden__L_ruleAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Hidden__L_ruleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3219:1: ( ( ( RULE_ID ) ) )
            // InternalAnn.g:3220:2: ( ( RULE_ID ) )
            {
            // InternalAnn.g:3220:2: ( ( RULE_ID ) )
            // InternalAnn.g:3221:3: ( RULE_ID )
            {
             before(grammarAccess.getHiddenAccess().getL_ruleActivationCrossReference_5_0()); 
            // InternalAnn.g:3222:3: ( RULE_ID )
            // InternalAnn.g:3223:4: RULE_ID
            {
             before(grammarAccess.getHiddenAccess().getL_ruleActivationIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHiddenAccess().getL_ruleActivationIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getHiddenAccess().getL_ruleActivationCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hidden__L_ruleAssignment_5"


    // $ANTLR start "rule__Input__SizeAssignment_3"
    // InternalAnn.g:3234:1: rule__Input__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__Input__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3238:1: ( ( RULE_INT ) )
            // InternalAnn.g:3239:2: ( RULE_INT )
            {
            // InternalAnn.g:3239:2: ( RULE_INT )
            // InternalAnn.g:3240:3: RULE_INT
            {
             before(grammarAccess.getInputAccess().getSizeINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getSizeINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__SizeAssignment_3"


    // $ANTLR start "rule__Output__SizeAssignment_3"
    // InternalAnn.g:3249:1: rule__Output__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__Output__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3253:1: ( ( RULE_INT ) )
            // InternalAnn.g:3254:2: ( RULE_INT )
            {
            // InternalAnn.g:3254:2: ( RULE_INT )
            // InternalAnn.g:3255:3: RULE_INT
            {
             before(grammarAccess.getOutputAccess().getSizeINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getSizeINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__SizeAssignment_3"


    // $ANTLR start "rule__Output__L_ruleAssignment_5"
    // InternalAnn.g:3264:1: rule__Output__L_ruleAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Output__L_ruleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3268:1: ( ( ( RULE_ID ) ) )
            // InternalAnn.g:3269:2: ( ( RULE_ID ) )
            {
            // InternalAnn.g:3269:2: ( ( RULE_ID ) )
            // InternalAnn.g:3270:3: ( RULE_ID )
            {
             before(grammarAccess.getOutputAccess().getL_ruleActivationCrossReference_5_0()); 
            // InternalAnn.g:3271:3: ( RULE_ID )
            // InternalAnn.g:3272:4: RULE_ID
            {
             before(grammarAccess.getOutputAccess().getL_ruleActivationIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getL_ruleActivationIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getOutputAccess().getL_ruleActivationCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__L_ruleAssignment_5"


    // $ANTLR start "rule__External__NameAssignment_0"
    // InternalAnn.g:3283:1: rule__External__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__External__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3287:1: ( ( RULE_ID ) )
            // InternalAnn.g:3288:2: ( RULE_ID )
            {
            // InternalAnn.g:3288:2: ( RULE_ID )
            // InternalAnn.g:3289:3: RULE_ID
            {
             before(grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__NameAssignment_0"


    // $ANTLR start "rule__Sigmoid__NameAssignment_0"
    // InternalAnn.g:3298:1: rule__Sigmoid__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Sigmoid__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3302:1: ( ( RULE_ID ) )
            // InternalAnn.g:3303:2: ( RULE_ID )
            {
            // InternalAnn.g:3303:2: ( RULE_ID )
            // InternalAnn.g:3304:3: RULE_ID
            {
             before(grammarAccess.getSigmoidAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSigmoidAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sigmoid__NameAssignment_0"


    // $ANTLR start "rule__Sigmoid__RuleAssignment_1"
    // InternalAnn.g:3313:1: rule__Sigmoid__RuleAssignment_1 : ( ( 'sigmoid' ) ) ;
    public final void rule__Sigmoid__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3317:1: ( ( ( 'sigmoid' ) ) )
            // InternalAnn.g:3318:2: ( ( 'sigmoid' ) )
            {
            // InternalAnn.g:3318:2: ( ( 'sigmoid' ) )
            // InternalAnn.g:3319:3: ( 'sigmoid' )
            {
             before(grammarAccess.getSigmoidAccess().getRuleSigmoidKeyword_1_0()); 
            // InternalAnn.g:3320:3: ( 'sigmoid' )
            // InternalAnn.g:3321:4: 'sigmoid'
            {
             before(grammarAccess.getSigmoidAccess().getRuleSigmoidKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSigmoidAccess().getRuleSigmoidKeyword_1_0()); 

            }

             after(grammarAccess.getSigmoidAccess().getRuleSigmoidKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sigmoid__RuleAssignment_1"


    // $ANTLR start "rule__Tansig__NameAssignment_0"
    // InternalAnn.g:3332:1: rule__Tansig__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Tansig__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3336:1: ( ( RULE_ID ) )
            // InternalAnn.g:3337:2: ( RULE_ID )
            {
            // InternalAnn.g:3337:2: ( RULE_ID )
            // InternalAnn.g:3338:3: RULE_ID
            {
             before(grammarAccess.getTansigAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTansigAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tansig__NameAssignment_0"


    // $ANTLR start "rule__Tansig__RuleAssignment_1"
    // InternalAnn.g:3347:1: rule__Tansig__RuleAssignment_1 : ( ( 'tansig' ) ) ;
    public final void rule__Tansig__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3351:1: ( ( ( 'tansig' ) ) )
            // InternalAnn.g:3352:2: ( ( 'tansig' ) )
            {
            // InternalAnn.g:3352:2: ( ( 'tansig' ) )
            // InternalAnn.g:3353:3: ( 'tansig' )
            {
             before(grammarAccess.getTansigAccess().getRuleTansigKeyword_1_0()); 
            // InternalAnn.g:3354:3: ( 'tansig' )
            // InternalAnn.g:3355:4: 'tansig'
            {
             before(grammarAccess.getTansigAccess().getRuleTansigKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTansigAccess().getRuleTansigKeyword_1_0()); 

            }

             after(grammarAccess.getTansigAccess().getRuleTansigKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tansig__RuleAssignment_1"


    // $ANTLR start "rule__Custom__NameAssignment_0"
    // InternalAnn.g:3366:1: rule__Custom__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Custom__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3370:1: ( ( RULE_ID ) )
            // InternalAnn.g:3371:2: ( RULE_ID )
            {
            // InternalAnn.g:3371:2: ( RULE_ID )
            // InternalAnn.g:3372:3: RULE_ID
            {
             before(grammarAccess.getCustomAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__NameAssignment_0"


    // $ANTLR start "rule__Custom__ExpAssignment_5"
    // InternalAnn.g:3381:1: rule__Custom__ExpAssignment_5 : ( ruleExpression ) ;
    public final void rule__Custom__ExpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3385:1: ( ( ruleExpression ) )
            // InternalAnn.g:3386:2: ( ruleExpression )
            {
            // InternalAnn.g:3386:2: ( ruleExpression )
            // InternalAnn.g:3387:3: ruleExpression
            {
             before(grammarAccess.getCustomAccess().getExpExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getCustomAccess().getExpExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__ExpAssignment_5"


    // $ANTLR start "rule__Custom__DerAssignment_8"
    // InternalAnn.g:3396:1: rule__Custom__DerAssignment_8 : ( ruleExpression ) ;
    public final void rule__Custom__DerAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3400:1: ( ( ruleExpression ) )
            // InternalAnn.g:3401:2: ( ruleExpression )
            {
            // InternalAnn.g:3401:2: ( ruleExpression )
            // InternalAnn.g:3402:3: ruleExpression
            {
             before(grammarAccess.getCustomAccess().getDerExpressionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getCustomAccess().getDerExpressionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Custom__DerAssignment_8"


    // $ANTLR start "rule__Expression__OperatorAssignment_1_1"
    // InternalAnn.g:3411:1: rule__Expression__OperatorAssignment_1_1 : ( rulePartOperator ) ;
    public final void rule__Expression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3415:1: ( ( rulePartOperator ) )
            // InternalAnn.g:3416:2: ( rulePartOperator )
            {
            // InternalAnn.g:3416:2: ( rulePartOperator )
            // InternalAnn.g:3417:3: rulePartOperator
            {
             before(grammarAccess.getExpressionAccess().getOperatorPartOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePartOperator();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOperatorPartOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__OperatorAssignment_1_1"


    // $ANTLR start "rule__Expression__RightAssignment_1_2"
    // InternalAnn.g:3426:1: rule__Expression__RightAssignment_1_2 : ( ruleFactor ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3430:1: ( ( ruleFactor ) )
            // InternalAnn.g:3431:2: ( ruleFactor )
            {
            // InternalAnn.g:3431:2: ( ruleFactor )
            // InternalAnn.g:3432:3: ruleFactor
            {
             before(grammarAccess.getExpressionAccess().getRightFactorParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightFactorParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RightAssignment_1_2"


    // $ANTLR start "rule__Factor__OperatorAssignment_1_1"
    // InternalAnn.g:3441:1: rule__Factor__OperatorAssignment_1_1 : ( ruleFactorOperator ) ;
    public final void rule__Factor__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3445:1: ( ( ruleFactorOperator ) )
            // InternalAnn.g:3446:2: ( ruleFactorOperator )
            {
            // InternalAnn.g:3446:2: ( ruleFactorOperator )
            // InternalAnn.g:3447:3: ruleFactorOperator
            {
             before(grammarAccess.getFactorAccess().getOperatorFactorOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFactorOperator();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getOperatorFactorOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__OperatorAssignment_1_1"


    // $ANTLR start "rule__Factor__RightAssignment_1_2"
    // InternalAnn.g:3456:1: rule__Factor__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Factor__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3460:1: ( ( rulePrimary ) )
            // InternalAnn.g:3461:2: ( rulePrimary )
            {
            // InternalAnn.g:3461:2: ( rulePrimary )
            // InternalAnn.g:3462:3: rulePrimary
            {
             before(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__RightAssignment_1_2"


    // $ANTLR start "rule__Euler__ValueAssignment_1"
    // InternalAnn.g:3471:1: rule__Euler__ValueAssignment_1 : ( ruleExpression ) ;
    public final void rule__Euler__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3475:1: ( ( ruleExpression ) )
            // InternalAnn.g:3476:2: ( ruleExpression )
            {
            // InternalAnn.g:3476:2: ( ruleExpression )
            // InternalAnn.g:3477:3: ruleExpression
            {
             before(grammarAccess.getEulerAccess().getValueExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getEulerAccess().getValueExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Euler__ValueAssignment_1"


    // $ANTLR start "rule__NLog__ValueAssignment_1"
    // InternalAnn.g:3486:1: rule__NLog__ValueAssignment_1 : ( ruleExpression ) ;
    public final void rule__NLog__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3490:1: ( ( ruleExpression ) )
            // InternalAnn.g:3491:2: ( ruleExpression )
            {
            // InternalAnn.g:3491:2: ( ruleExpression )
            // InternalAnn.g:3492:3: ruleExpression
            {
             before(grammarAccess.getNLogAccess().getValueExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getNLogAccess().getValueExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NLog__ValueAssignment_1"


    // $ANTLR start "rule__Sin__ValueAssignment_1"
    // InternalAnn.g:3501:1: rule__Sin__ValueAssignment_1 : ( ruleExpression ) ;
    public final void rule__Sin__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3505:1: ( ( ruleExpression ) )
            // InternalAnn.g:3506:2: ( ruleExpression )
            {
            // InternalAnn.g:3506:2: ( ruleExpression )
            // InternalAnn.g:3507:3: ruleExpression
            {
             before(grammarAccess.getSinAccess().getValueExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSinAccess().getValueExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sin__ValueAssignment_1"


    // $ANTLR start "rule__Cos__ValueAssignment_1"
    // InternalAnn.g:3516:1: rule__Cos__ValueAssignment_1 : ( ruleExpression ) ;
    public final void rule__Cos__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3520:1: ( ( ruleExpression ) )
            // InternalAnn.g:3521:2: ( ruleExpression )
            {
            // InternalAnn.g:3521:2: ( ruleExpression )
            // InternalAnn.g:3522:3: ruleExpression
            {
             before(grammarAccess.getCosAccess().getValueExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getCosAccess().getValueExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cos__ValueAssignment_1"


    // $ANTLR start "rule__Sqrt__ValueAssignment_1"
    // InternalAnn.g:3531:1: rule__Sqrt__ValueAssignment_1 : ( ruleExpression ) ;
    public final void rule__Sqrt__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3535:1: ( ( ruleExpression ) )
            // InternalAnn.g:3536:2: ( ruleExpression )
            {
            // InternalAnn.g:3536:2: ( ruleExpression )
            // InternalAnn.g:3537:3: ruleExpression
            {
             before(grammarAccess.getSqrtAccess().getValueExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSqrtAccess().getValueExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sqrt__ValueAssignment_1"


    // $ANTLR start "rule__Power__BaseAssignment_1"
    // InternalAnn.g:3546:1: rule__Power__BaseAssignment_1 : ( ruleExpression ) ;
    public final void rule__Power__BaseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3550:1: ( ( ruleExpression ) )
            // InternalAnn.g:3551:2: ( ruleExpression )
            {
            // InternalAnn.g:3551:2: ( ruleExpression )
            // InternalAnn.g:3552:3: ruleExpression
            {
             before(grammarAccess.getPowerAccess().getBaseExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPowerAccess().getBaseExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__BaseAssignment_1"


    // $ANTLR start "rule__Power__ExponentAssignment_3"
    // InternalAnn.g:3561:1: rule__Power__ExponentAssignment_3 : ( ruleExpression ) ;
    public final void rule__Power__ExponentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3565:1: ( ( ruleExpression ) )
            // InternalAnn.g:3566:2: ( ruleExpression )
            {
            // InternalAnn.g:3566:2: ( ruleExpression )
            // InternalAnn.g:3567:3: ruleExpression
            {
             before(grammarAccess.getPowerAccess().getExponentExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPowerAccess().getExponentExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__ExponentAssignment_3"


    // $ANTLR start "rule__Letter__OperatorAssignment_0"
    // InternalAnn.g:3576:1: rule__Letter__OperatorAssignment_0 : ( rulePartOperator ) ;
    public final void rule__Letter__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3580:1: ( ( rulePartOperator ) )
            // InternalAnn.g:3581:2: ( rulePartOperator )
            {
            // InternalAnn.g:3581:2: ( rulePartOperator )
            // InternalAnn.g:3582:3: rulePartOperator
            {
             before(grammarAccess.getLetterAccess().getOperatorPartOperatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePartOperator();

            state._fsp--;

             after(grammarAccess.getLetterAccess().getOperatorPartOperatorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Letter__OperatorAssignment_0"


    // $ANTLR start "rule__Letter__ValueAssignment_1"
    // InternalAnn.g:3591:1: rule__Letter__ValueAssignment_1 : ( ( 'x' ) ) ;
    public final void rule__Letter__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3595:1: ( ( ( 'x' ) ) )
            // InternalAnn.g:3596:2: ( ( 'x' ) )
            {
            // InternalAnn.g:3596:2: ( ( 'x' ) )
            // InternalAnn.g:3597:3: ( 'x' )
            {
             before(grammarAccess.getLetterAccess().getValueXKeyword_1_0()); 
            // InternalAnn.g:3598:3: ( 'x' )
            // InternalAnn.g:3599:4: 'x'
            {
             before(grammarAccess.getLetterAccess().getValueXKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLetterAccess().getValueXKeyword_1_0()); 

            }

             after(grammarAccess.getLetterAccess().getValueXKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Letter__ValueAssignment_1"


    // $ANTLR start "rule__NumberLiteral__OperatorAssignment_0"
    // InternalAnn.g:3610:1: rule__NumberLiteral__OperatorAssignment_0 : ( rulePartOperator ) ;
    public final void rule__NumberLiteral__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3614:1: ( ( rulePartOperator ) )
            // InternalAnn.g:3615:2: ( rulePartOperator )
            {
            // InternalAnn.g:3615:2: ( rulePartOperator )
            // InternalAnn.g:3616:3: rulePartOperator
            {
             before(grammarAccess.getNumberLiteralAccess().getOperatorPartOperatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePartOperator();

            state._fsp--;

             after(grammarAccess.getNumberLiteralAccess().getOperatorPartOperatorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__OperatorAssignment_0"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment_1"
    // InternalAnn.g:3625:1: rule__NumberLiteral__ValueAssignment_1 : ( ruleDECIMAL ) ;
    public final void rule__NumberLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3629:1: ( ( ruleDECIMAL ) )
            // InternalAnn.g:3630:2: ( ruleDECIMAL )
            {
            // InternalAnn.g:3630:2: ( ruleDECIMAL )
            // InternalAnn.g:3631:3: ruleDECIMAL
            {
             before(grammarAccess.getNumberLiteralAccess().getValueDECIMALParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getNumberLiteralAccess().getValueDECIMALParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001940020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001900002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000023F40001810L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000001800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001810L});

}