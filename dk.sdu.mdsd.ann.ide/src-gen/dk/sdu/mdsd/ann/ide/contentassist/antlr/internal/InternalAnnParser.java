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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'alpha'", "'epochs'", "'}'", "'.'", "'hidden'", "'size'", "'activation'", "'in'", "'out'", "'(x)'", "'function'", "'='", "'derivative'", "'external'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'sigmoid'", "'tansig'", "'x'"
    };
    public static final int RULE_STRING=6;
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
    public static final int T__14=14;
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


    // $ANTLR start "entryRuleCustom"
    // InternalAnn.g:228:1: entryRuleCustom : ruleCustom EOF ;
    public final void entryRuleCustom() throws RecognitionException {
        try {
            // InternalAnn.g:229:1: ( ruleCustom EOF )
            // InternalAnn.g:230:1: ruleCustom EOF
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
    // InternalAnn.g:237:1: ruleCustom : ( ( rule__Custom__Group__0 ) ) ;
    public final void ruleCustom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:241:2: ( ( ( rule__Custom__Group__0 ) ) )
            // InternalAnn.g:242:2: ( ( rule__Custom__Group__0 ) )
            {
            // InternalAnn.g:242:2: ( ( rule__Custom__Group__0 ) )
            // InternalAnn.g:243:3: ( rule__Custom__Group__0 )
            {
             before(grammarAccess.getCustomAccess().getGroup()); 
            // InternalAnn.g:244:3: ( rule__Custom__Group__0 )
            // InternalAnn.g:244:4: rule__Custom__Group__0
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


    // $ANTLR start "entryRuleExternal"
    // InternalAnn.g:253:1: entryRuleExternal : ruleExternal EOF ;
    public final void entryRuleExternal() throws RecognitionException {
        try {
            // InternalAnn.g:254:1: ( ruleExternal EOF )
            // InternalAnn.g:255:1: ruleExternal EOF
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
    // InternalAnn.g:262:1: ruleExternal : ( ( rule__External__Group__0 ) ) ;
    public final void ruleExternal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:266:2: ( ( ( rule__External__Group__0 ) ) )
            // InternalAnn.g:267:2: ( ( rule__External__Group__0 ) )
            {
            // InternalAnn.g:267:2: ( ( rule__External__Group__0 ) )
            // InternalAnn.g:268:3: ( rule__External__Group__0 )
            {
             before(grammarAccess.getExternalAccess().getGroup()); 
            // InternalAnn.g:269:3: ( rule__External__Group__0 )
            // InternalAnn.g:269:4: rule__External__Group__0
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
    // InternalAnn.g:278:1: entryRuleSigmoid : ruleSigmoid EOF ;
    public final void entryRuleSigmoid() throws RecognitionException {
        try {
            // InternalAnn.g:279:1: ( ruleSigmoid EOF )
            // InternalAnn.g:280:1: ruleSigmoid EOF
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
    // InternalAnn.g:287:1: ruleSigmoid : ( ( rule__Sigmoid__Group__0 ) ) ;
    public final void ruleSigmoid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:291:2: ( ( ( rule__Sigmoid__Group__0 ) ) )
            // InternalAnn.g:292:2: ( ( rule__Sigmoid__Group__0 ) )
            {
            // InternalAnn.g:292:2: ( ( rule__Sigmoid__Group__0 ) )
            // InternalAnn.g:293:3: ( rule__Sigmoid__Group__0 )
            {
             before(grammarAccess.getSigmoidAccess().getGroup()); 
            // InternalAnn.g:294:3: ( rule__Sigmoid__Group__0 )
            // InternalAnn.g:294:4: rule__Sigmoid__Group__0
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
    // InternalAnn.g:303:1: entryRuleTansig : ruleTansig EOF ;
    public final void entryRuleTansig() throws RecognitionException {
        try {
            // InternalAnn.g:304:1: ( ruleTansig EOF )
            // InternalAnn.g:305:1: ruleTansig EOF
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
    // InternalAnn.g:312:1: ruleTansig : ( ( rule__Tansig__Group__0 ) ) ;
    public final void ruleTansig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:316:2: ( ( ( rule__Tansig__Group__0 ) ) )
            // InternalAnn.g:317:2: ( ( rule__Tansig__Group__0 ) )
            {
            // InternalAnn.g:317:2: ( ( rule__Tansig__Group__0 ) )
            // InternalAnn.g:318:3: ( rule__Tansig__Group__0 )
            {
             before(grammarAccess.getTansigAccess().getGroup()); 
            // InternalAnn.g:319:3: ( rule__Tansig__Group__0 )
            // InternalAnn.g:319:4: rule__Tansig__Group__0
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


    // $ANTLR start "entryRuleSubstraction"
    // InternalAnn.g:353:1: entryRuleSubstraction : ruleSubstraction EOF ;
    public final void entryRuleSubstraction() throws RecognitionException {
        try {
            // InternalAnn.g:354:1: ( ruleSubstraction EOF )
            // InternalAnn.g:355:1: ruleSubstraction EOF
            {
             before(grammarAccess.getSubstractionRule()); 
            pushFollow(FOLLOW_1);
            ruleSubstraction();

            state._fsp--;

             after(grammarAccess.getSubstractionRule()); 
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
    // $ANTLR end "entryRuleSubstraction"


    // $ANTLR start "ruleSubstraction"
    // InternalAnn.g:362:1: ruleSubstraction : ( ( rule__Substraction__Group__0 ) ) ;
    public final void ruleSubstraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:366:2: ( ( ( rule__Substraction__Group__0 ) ) )
            // InternalAnn.g:367:2: ( ( rule__Substraction__Group__0 ) )
            {
            // InternalAnn.g:367:2: ( ( rule__Substraction__Group__0 ) )
            // InternalAnn.g:368:3: ( rule__Substraction__Group__0 )
            {
             before(grammarAccess.getSubstractionAccess().getGroup()); 
            // InternalAnn.g:369:3: ( rule__Substraction__Group__0 )
            // InternalAnn.g:369:4: rule__Substraction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Substraction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubstractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubstraction"


    // $ANTLR start "entryRuleMultiplication"
    // InternalAnn.g:378:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalAnn.g:379:1: ( ruleMultiplication EOF )
            // InternalAnn.g:380:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalAnn.g:387:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:391:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalAnn.g:392:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalAnn.g:392:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalAnn.g:393:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalAnn.g:394:3: ( rule__Multiplication__Group__0 )
            // InternalAnn.g:394:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // InternalAnn.g:403:1: entryRuleDivision : ruleDivision EOF ;
    public final void entryRuleDivision() throws RecognitionException {
        try {
            // InternalAnn.g:404:1: ( ruleDivision EOF )
            // InternalAnn.g:405:1: ruleDivision EOF
            {
             before(grammarAccess.getDivisionRule()); 
            pushFollow(FOLLOW_1);
            ruleDivision();

            state._fsp--;

             after(grammarAccess.getDivisionRule()); 
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
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // InternalAnn.g:412:1: ruleDivision : ( ( rule__Division__Group__0 ) ) ;
    public final void ruleDivision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:416:2: ( ( ( rule__Division__Group__0 ) ) )
            // InternalAnn.g:417:2: ( ( rule__Division__Group__0 ) )
            {
            // InternalAnn.g:417:2: ( ( rule__Division__Group__0 ) )
            // InternalAnn.g:418:3: ( rule__Division__Group__0 )
            {
             before(grammarAccess.getDivisionAccess().getGroup()); 
            // InternalAnn.g:419:3: ( rule__Division__Group__0 )
            // InternalAnn.g:419:4: rule__Division__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Division__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDivisionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRulePrimary"
    // InternalAnn.g:428:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalAnn.g:429:1: ( rulePrimary EOF )
            // InternalAnn.g:430:1: rulePrimary EOF
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
    // InternalAnn.g:437:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:441:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalAnn.g:442:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalAnn.g:442:2: ( ( rule__Primary__Alternatives ) )
            // InternalAnn.g:443:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalAnn.g:444:3: ( rule__Primary__Alternatives )
            // InternalAnn.g:444:4: rule__Primary__Alternatives
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


    // $ANTLR start "entryRuleLetter"
    // InternalAnn.g:453:1: entryRuleLetter : ruleLetter EOF ;
    public final void entryRuleLetter() throws RecognitionException {
        try {
            // InternalAnn.g:454:1: ( ruleLetter EOF )
            // InternalAnn.g:455:1: ruleLetter EOF
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
    // InternalAnn.g:462:1: ruleLetter : ( ( rule__Letter__ValueAssignment ) ) ;
    public final void ruleLetter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:466:2: ( ( ( rule__Letter__ValueAssignment ) ) )
            // InternalAnn.g:467:2: ( ( rule__Letter__ValueAssignment ) )
            {
            // InternalAnn.g:467:2: ( ( rule__Letter__ValueAssignment ) )
            // InternalAnn.g:468:3: ( rule__Letter__ValueAssignment )
            {
             before(grammarAccess.getLetterAccess().getValueAssignment()); 
            // InternalAnn.g:469:3: ( rule__Letter__ValueAssignment )
            // InternalAnn.g:469:4: rule__Letter__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Letter__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLetterAccess().getValueAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalAnn.g:478:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalAnn.g:479:1: ( ruleNumberLiteral EOF )
            // InternalAnn.g:480:1: ruleNumberLiteral EOF
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
    // InternalAnn.g:487:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValueAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:491:2: ( ( ( rule__NumberLiteral__ValueAssignment ) ) )
            // InternalAnn.g:492:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            {
            // InternalAnn.g:492:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            // InternalAnn.g:493:3: ( rule__NumberLiteral__ValueAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            // InternalAnn.g:494:3: ( rule__NumberLiteral__ValueAssignment )
            // InternalAnn.g:494:4: rule__NumberLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 

            }


            }

        }
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
    // InternalAnn.g:502:1: rule__Layer__Alternatives : ( ( ruleHidden ) | ( ruleInput ) | ( ruleOutput ) );
    public final void rule__Layer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:506:1: ( ( ruleHidden ) | ( ruleInput ) | ( ruleOutput ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 20:
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
                    // InternalAnn.g:507:2: ( ruleHidden )
                    {
                    // InternalAnn.g:507:2: ( ruleHidden )
                    // InternalAnn.g:508:3: ruleHidden
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
                    // InternalAnn.g:513:2: ( ruleInput )
                    {
                    // InternalAnn.g:513:2: ( ruleInput )
                    // InternalAnn.g:514:3: ruleInput
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
                    // InternalAnn.g:519:2: ( ruleOutput )
                    {
                    // InternalAnn.g:519:2: ( ruleOutput )
                    // InternalAnn.g:520:3: ruleOutput
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
    // InternalAnn.g:529:1: rule__Activation__Alternatives : ( ( ruleSigmoid ) | ( ruleTansig ) | ( ruleExternal ) | ( ruleCustom ) );
    public final void rule__Activation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:533:1: ( ( ruleSigmoid ) | ( ruleTansig ) | ( ruleExternal ) | ( ruleCustom ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 32:
                    {
                    alt2=1;
                    }
                    break;
                case 33:
                    {
                    alt2=2;
                    }
                    break;
                case 25:
                    {
                    alt2=3;
                    }
                    break;
                case 21:
                    {
                    alt2=4;
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
                    // InternalAnn.g:534:2: ( ruleSigmoid )
                    {
                    // InternalAnn.g:534:2: ( ruleSigmoid )
                    // InternalAnn.g:535:3: ruleSigmoid
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
                    // InternalAnn.g:540:2: ( ruleTansig )
                    {
                    // InternalAnn.g:540:2: ( ruleTansig )
                    // InternalAnn.g:541:3: ruleTansig
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
                    // InternalAnn.g:546:2: ( ruleExternal )
                    {
                    // InternalAnn.g:546:2: ( ruleExternal )
                    // InternalAnn.g:547:3: ruleExternal
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
                    // InternalAnn.g:552:2: ( ruleCustom )
                    {
                    // InternalAnn.g:552:2: ( ruleCustom )
                    // InternalAnn.g:553:3: ruleCustom
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
    // InternalAnn.g:562:1: rule__Primary__Alternatives : ( ( ruleNumberLiteral ) | ( ruleLetter ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:566:1: ( ( ruleNumberLiteral ) | ( ruleLetter ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case 34:
                {
                alt3=2;
                }
                break;
            case 30:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAnn.g:567:2: ( ruleNumberLiteral )
                    {
                    // InternalAnn.g:567:2: ( ruleNumberLiteral )
                    // InternalAnn.g:568:3: ruleNumberLiteral
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
                    // InternalAnn.g:573:2: ( ruleLetter )
                    {
                    // InternalAnn.g:573:2: ( ruleLetter )
                    // InternalAnn.g:574:3: ruleLetter
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
                    // InternalAnn.g:579:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalAnn.g:579:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalAnn.g:580:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalAnn.g:581:3: ( rule__Primary__Group_2__0 )
                    // InternalAnn.g:581:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

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


    // $ANTLR start "rule__ANNModel__Group__0"
    // InternalAnn.g:589:1: rule__ANNModel__Group__0 : rule__ANNModel__Group__0__Impl rule__ANNModel__Group__1 ;
    public final void rule__ANNModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:593:1: ( rule__ANNModel__Group__0__Impl rule__ANNModel__Group__1 )
            // InternalAnn.g:594:2: rule__ANNModel__Group__0__Impl rule__ANNModel__Group__1
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
    // InternalAnn.g:601:1: rule__ANNModel__Group__0__Impl : ( ( rule__ANNModel__NameAssignment_0 ) ) ;
    public final void rule__ANNModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:605:1: ( ( ( rule__ANNModel__NameAssignment_0 ) ) )
            // InternalAnn.g:606:1: ( ( rule__ANNModel__NameAssignment_0 ) )
            {
            // InternalAnn.g:606:1: ( ( rule__ANNModel__NameAssignment_0 ) )
            // InternalAnn.g:607:2: ( rule__ANNModel__NameAssignment_0 )
            {
             before(grammarAccess.getANNModelAccess().getNameAssignment_0()); 
            // InternalAnn.g:608:2: ( rule__ANNModel__NameAssignment_0 )
            // InternalAnn.g:608:3: rule__ANNModel__NameAssignment_0
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
    // InternalAnn.g:616:1: rule__ANNModel__Group__1 : rule__ANNModel__Group__1__Impl rule__ANNModel__Group__2 ;
    public final void rule__ANNModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:620:1: ( rule__ANNModel__Group__1__Impl rule__ANNModel__Group__2 )
            // InternalAnn.g:621:2: rule__ANNModel__Group__1__Impl rule__ANNModel__Group__2
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
    // InternalAnn.g:628:1: rule__ANNModel__Group__1__Impl : ( '{' ) ;
    public final void rule__ANNModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:632:1: ( ( '{' ) )
            // InternalAnn.g:633:1: ( '{' )
            {
            // InternalAnn.g:633:1: ( '{' )
            // InternalAnn.g:634:2: '{'
            {
             before(grammarAccess.getANNModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,11,FOLLOW_2); 
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
    // InternalAnn.g:643:1: rule__ANNModel__Group__2 : rule__ANNModel__Group__2__Impl rule__ANNModel__Group__3 ;
    public final void rule__ANNModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:647:1: ( rule__ANNModel__Group__2__Impl rule__ANNModel__Group__3 )
            // InternalAnn.g:648:2: rule__ANNModel__Group__2__Impl rule__ANNModel__Group__3
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
    // InternalAnn.g:655:1: rule__ANNModel__Group__2__Impl : ( 'alpha' ) ;
    public final void rule__ANNModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:659:1: ( ( 'alpha' ) )
            // InternalAnn.g:660:1: ( 'alpha' )
            {
            // InternalAnn.g:660:1: ( 'alpha' )
            // InternalAnn.g:661:2: 'alpha'
            {
             before(grammarAccess.getANNModelAccess().getAlphaKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalAnn.g:670:1: rule__ANNModel__Group__3 : rule__ANNModel__Group__3__Impl rule__ANNModel__Group__4 ;
    public final void rule__ANNModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:674:1: ( rule__ANNModel__Group__3__Impl rule__ANNModel__Group__4 )
            // InternalAnn.g:675:2: rule__ANNModel__Group__3__Impl rule__ANNModel__Group__4
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
    // InternalAnn.g:682:1: rule__ANNModel__Group__3__Impl : ( ( rule__ANNModel__AlphaAssignment_3 ) ) ;
    public final void rule__ANNModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:686:1: ( ( ( rule__ANNModel__AlphaAssignment_3 ) ) )
            // InternalAnn.g:687:1: ( ( rule__ANNModel__AlphaAssignment_3 ) )
            {
            // InternalAnn.g:687:1: ( ( rule__ANNModel__AlphaAssignment_3 ) )
            // InternalAnn.g:688:2: ( rule__ANNModel__AlphaAssignment_3 )
            {
             before(grammarAccess.getANNModelAccess().getAlphaAssignment_3()); 
            // InternalAnn.g:689:2: ( rule__ANNModel__AlphaAssignment_3 )
            // InternalAnn.g:689:3: rule__ANNModel__AlphaAssignment_3
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
    // InternalAnn.g:697:1: rule__ANNModel__Group__4 : rule__ANNModel__Group__4__Impl rule__ANNModel__Group__5 ;
    public final void rule__ANNModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:701:1: ( rule__ANNModel__Group__4__Impl rule__ANNModel__Group__5 )
            // InternalAnn.g:702:2: rule__ANNModel__Group__4__Impl rule__ANNModel__Group__5
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
    // InternalAnn.g:709:1: rule__ANNModel__Group__4__Impl : ( 'epochs' ) ;
    public final void rule__ANNModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:713:1: ( ( 'epochs' ) )
            // InternalAnn.g:714:1: ( 'epochs' )
            {
            // InternalAnn.g:714:1: ( 'epochs' )
            // InternalAnn.g:715:2: 'epochs'
            {
             before(grammarAccess.getANNModelAccess().getEpochsKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalAnn.g:724:1: rule__ANNModel__Group__5 : rule__ANNModel__Group__5__Impl rule__ANNModel__Group__6 ;
    public final void rule__ANNModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:728:1: ( rule__ANNModel__Group__5__Impl rule__ANNModel__Group__6 )
            // InternalAnn.g:729:2: rule__ANNModel__Group__5__Impl rule__ANNModel__Group__6
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
    // InternalAnn.g:736:1: rule__ANNModel__Group__5__Impl : ( ( rule__ANNModel__EpochsAssignment_5 ) ) ;
    public final void rule__ANNModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:740:1: ( ( ( rule__ANNModel__EpochsAssignment_5 ) ) )
            // InternalAnn.g:741:1: ( ( rule__ANNModel__EpochsAssignment_5 ) )
            {
            // InternalAnn.g:741:1: ( ( rule__ANNModel__EpochsAssignment_5 ) )
            // InternalAnn.g:742:2: ( rule__ANNModel__EpochsAssignment_5 )
            {
             before(grammarAccess.getANNModelAccess().getEpochsAssignment_5()); 
            // InternalAnn.g:743:2: ( rule__ANNModel__EpochsAssignment_5 )
            // InternalAnn.g:743:3: rule__ANNModel__EpochsAssignment_5
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
    // InternalAnn.g:751:1: rule__ANNModel__Group__6 : rule__ANNModel__Group__6__Impl rule__ANNModel__Group__7 ;
    public final void rule__ANNModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:755:1: ( rule__ANNModel__Group__6__Impl rule__ANNModel__Group__7 )
            // InternalAnn.g:756:2: rule__ANNModel__Group__6__Impl rule__ANNModel__Group__7
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
    // InternalAnn.g:763:1: rule__ANNModel__Group__6__Impl : ( ( rule__ANNModel__ActivationAssignment_6 )* ) ;
    public final void rule__ANNModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:767:1: ( ( ( rule__ANNModel__ActivationAssignment_6 )* ) )
            // InternalAnn.g:768:1: ( ( rule__ANNModel__ActivationAssignment_6 )* )
            {
            // InternalAnn.g:768:1: ( ( rule__ANNModel__ActivationAssignment_6 )* )
            // InternalAnn.g:769:2: ( rule__ANNModel__ActivationAssignment_6 )*
            {
             before(grammarAccess.getANNModelAccess().getActivationAssignment_6()); 
            // InternalAnn.g:770:2: ( rule__ANNModel__ActivationAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAnn.g:770:3: rule__ANNModel__ActivationAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ANNModel__ActivationAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalAnn.g:778:1: rule__ANNModel__Group__7 : rule__ANNModel__Group__7__Impl rule__ANNModel__Group__8 ;
    public final void rule__ANNModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:782:1: ( rule__ANNModel__Group__7__Impl rule__ANNModel__Group__8 )
            // InternalAnn.g:783:2: rule__ANNModel__Group__7__Impl rule__ANNModel__Group__8
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
    // InternalAnn.g:790:1: rule__ANNModel__Group__7__Impl : ( ( rule__ANNModel__LayerAssignment_7 )* ) ;
    public final void rule__ANNModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:794:1: ( ( ( rule__ANNModel__LayerAssignment_7 )* ) )
            // InternalAnn.g:795:1: ( ( rule__ANNModel__LayerAssignment_7 )* )
            {
            // InternalAnn.g:795:1: ( ( rule__ANNModel__LayerAssignment_7 )* )
            // InternalAnn.g:796:2: ( rule__ANNModel__LayerAssignment_7 )*
            {
             before(grammarAccess.getANNModelAccess().getLayerAssignment_7()); 
            // InternalAnn.g:797:2: ( rule__ANNModel__LayerAssignment_7 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16||(LA5_0>=19 && LA5_0<=20)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAnn.g:797:3: rule__ANNModel__LayerAssignment_7
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ANNModel__LayerAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalAnn.g:805:1: rule__ANNModel__Group__8 : rule__ANNModel__Group__8__Impl ;
    public final void rule__ANNModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:809:1: ( rule__ANNModel__Group__8__Impl )
            // InternalAnn.g:810:2: rule__ANNModel__Group__8__Impl
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
    // InternalAnn.g:816:1: rule__ANNModel__Group__8__Impl : ( '}' ) ;
    public final void rule__ANNModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:820:1: ( ( '}' ) )
            // InternalAnn.g:821:1: ( '}' )
            {
            // InternalAnn.g:821:1: ( '}' )
            // InternalAnn.g:822:2: '}'
            {
             before(grammarAccess.getANNModelAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
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
    // InternalAnn.g:832:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:836:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalAnn.g:837:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
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
    // InternalAnn.g:844:1: rule__DECIMAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:848:1: ( ( RULE_INT ) )
            // InternalAnn.g:849:1: ( RULE_INT )
            {
            // InternalAnn.g:849:1: ( RULE_INT )
            // InternalAnn.g:850:2: RULE_INT
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
    // InternalAnn.g:859:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:863:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalAnn.g:864:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
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
    // InternalAnn.g:871:1: rule__DECIMAL__Group__1__Impl : ( '.' ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:875:1: ( ( '.' ) )
            // InternalAnn.g:876:1: ( '.' )
            {
            // InternalAnn.g:876:1: ( '.' )
            // InternalAnn.g:877:2: '.'
            {
             before(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalAnn.g:886:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:890:1: ( rule__DECIMAL__Group__2__Impl )
            // InternalAnn.g:891:2: rule__DECIMAL__Group__2__Impl
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
    // InternalAnn.g:897:1: rule__DECIMAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:901:1: ( ( RULE_INT ) )
            // InternalAnn.g:902:1: ( RULE_INT )
            {
            // InternalAnn.g:902:1: ( RULE_INT )
            // InternalAnn.g:903:2: RULE_INT
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
    // InternalAnn.g:913:1: rule__Hidden__Group__0 : rule__Hidden__Group__0__Impl rule__Hidden__Group__1 ;
    public final void rule__Hidden__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:917:1: ( rule__Hidden__Group__0__Impl rule__Hidden__Group__1 )
            // InternalAnn.g:918:2: rule__Hidden__Group__0__Impl rule__Hidden__Group__1
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
    // InternalAnn.g:925:1: rule__Hidden__Group__0__Impl : ( 'hidden' ) ;
    public final void rule__Hidden__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:929:1: ( ( 'hidden' ) )
            // InternalAnn.g:930:1: ( 'hidden' )
            {
            // InternalAnn.g:930:1: ( 'hidden' )
            // InternalAnn.g:931:2: 'hidden'
            {
             before(grammarAccess.getHiddenAccess().getHiddenKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalAnn.g:940:1: rule__Hidden__Group__1 : rule__Hidden__Group__1__Impl rule__Hidden__Group__2 ;
    public final void rule__Hidden__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:944:1: ( rule__Hidden__Group__1__Impl rule__Hidden__Group__2 )
            // InternalAnn.g:945:2: rule__Hidden__Group__1__Impl rule__Hidden__Group__2
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
    // InternalAnn.g:952:1: rule__Hidden__Group__1__Impl : ( '{' ) ;
    public final void rule__Hidden__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:956:1: ( ( '{' ) )
            // InternalAnn.g:957:1: ( '{' )
            {
            // InternalAnn.g:957:1: ( '{' )
            // InternalAnn.g:958:2: '{'
            {
             before(grammarAccess.getHiddenAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,11,FOLLOW_2); 
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
    // InternalAnn.g:967:1: rule__Hidden__Group__2 : rule__Hidden__Group__2__Impl rule__Hidden__Group__3 ;
    public final void rule__Hidden__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:971:1: ( rule__Hidden__Group__2__Impl rule__Hidden__Group__3 )
            // InternalAnn.g:972:2: rule__Hidden__Group__2__Impl rule__Hidden__Group__3
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
    // InternalAnn.g:979:1: rule__Hidden__Group__2__Impl : ( 'size' ) ;
    public final void rule__Hidden__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:983:1: ( ( 'size' ) )
            // InternalAnn.g:984:1: ( 'size' )
            {
            // InternalAnn.g:984:1: ( 'size' )
            // InternalAnn.g:985:2: 'size'
            {
             before(grammarAccess.getHiddenAccess().getSizeKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalAnn.g:994:1: rule__Hidden__Group__3 : rule__Hidden__Group__3__Impl rule__Hidden__Group__4 ;
    public final void rule__Hidden__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:998:1: ( rule__Hidden__Group__3__Impl rule__Hidden__Group__4 )
            // InternalAnn.g:999:2: rule__Hidden__Group__3__Impl rule__Hidden__Group__4
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
    // InternalAnn.g:1006:1: rule__Hidden__Group__3__Impl : ( ( rule__Hidden__SizeAssignment_3 ) ) ;
    public final void rule__Hidden__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1010:1: ( ( ( rule__Hidden__SizeAssignment_3 ) ) )
            // InternalAnn.g:1011:1: ( ( rule__Hidden__SizeAssignment_3 ) )
            {
            // InternalAnn.g:1011:1: ( ( rule__Hidden__SizeAssignment_3 ) )
            // InternalAnn.g:1012:2: ( rule__Hidden__SizeAssignment_3 )
            {
             before(grammarAccess.getHiddenAccess().getSizeAssignment_3()); 
            // InternalAnn.g:1013:2: ( rule__Hidden__SizeAssignment_3 )
            // InternalAnn.g:1013:3: rule__Hidden__SizeAssignment_3
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
    // InternalAnn.g:1021:1: rule__Hidden__Group__4 : rule__Hidden__Group__4__Impl rule__Hidden__Group__5 ;
    public final void rule__Hidden__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1025:1: ( rule__Hidden__Group__4__Impl rule__Hidden__Group__5 )
            // InternalAnn.g:1026:2: rule__Hidden__Group__4__Impl rule__Hidden__Group__5
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
    // InternalAnn.g:1033:1: rule__Hidden__Group__4__Impl : ( 'activation' ) ;
    public final void rule__Hidden__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1037:1: ( ( 'activation' ) )
            // InternalAnn.g:1038:1: ( 'activation' )
            {
            // InternalAnn.g:1038:1: ( 'activation' )
            // InternalAnn.g:1039:2: 'activation'
            {
             before(grammarAccess.getHiddenAccess().getActivationKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalAnn.g:1048:1: rule__Hidden__Group__5 : rule__Hidden__Group__5__Impl rule__Hidden__Group__6 ;
    public final void rule__Hidden__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1052:1: ( rule__Hidden__Group__5__Impl rule__Hidden__Group__6 )
            // InternalAnn.g:1053:2: rule__Hidden__Group__5__Impl rule__Hidden__Group__6
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
    // InternalAnn.g:1060:1: rule__Hidden__Group__5__Impl : ( ( rule__Hidden__L_ruleAssignment_5 ) ) ;
    public final void rule__Hidden__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1064:1: ( ( ( rule__Hidden__L_ruleAssignment_5 ) ) )
            // InternalAnn.g:1065:1: ( ( rule__Hidden__L_ruleAssignment_5 ) )
            {
            // InternalAnn.g:1065:1: ( ( rule__Hidden__L_ruleAssignment_5 ) )
            // InternalAnn.g:1066:2: ( rule__Hidden__L_ruleAssignment_5 )
            {
             before(grammarAccess.getHiddenAccess().getL_ruleAssignment_5()); 
            // InternalAnn.g:1067:2: ( rule__Hidden__L_ruleAssignment_5 )
            // InternalAnn.g:1067:3: rule__Hidden__L_ruleAssignment_5
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
    // InternalAnn.g:1075:1: rule__Hidden__Group__6 : rule__Hidden__Group__6__Impl ;
    public final void rule__Hidden__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1079:1: ( rule__Hidden__Group__6__Impl )
            // InternalAnn.g:1080:2: rule__Hidden__Group__6__Impl
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
    // InternalAnn.g:1086:1: rule__Hidden__Group__6__Impl : ( '}' ) ;
    public final void rule__Hidden__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1090:1: ( ( '}' ) )
            // InternalAnn.g:1091:1: ( '}' )
            {
            // InternalAnn.g:1091:1: ( '}' )
            // InternalAnn.g:1092:2: '}'
            {
             before(grammarAccess.getHiddenAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
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
    // InternalAnn.g:1102:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1106:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalAnn.g:1107:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalAnn.g:1114:1: rule__Input__Group__0__Impl : ( 'in' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1118:1: ( ( 'in' ) )
            // InternalAnn.g:1119:1: ( 'in' )
            {
            // InternalAnn.g:1119:1: ( 'in' )
            // InternalAnn.g:1120:2: 'in'
            {
             before(grammarAccess.getInputAccess().getInKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalAnn.g:1129:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1133:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalAnn.g:1134:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalAnn.g:1141:1: rule__Input__Group__1__Impl : ( '{' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1145:1: ( ( '{' ) )
            // InternalAnn.g:1146:1: ( '{' )
            {
            // InternalAnn.g:1146:1: ( '{' )
            // InternalAnn.g:1147:2: '{'
            {
             before(grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,11,FOLLOW_2); 
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
    // InternalAnn.g:1156:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1160:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalAnn.g:1161:2: rule__Input__Group__2__Impl rule__Input__Group__3
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
    // InternalAnn.g:1168:1: rule__Input__Group__2__Impl : ( 'size' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1172:1: ( ( 'size' ) )
            // InternalAnn.g:1173:1: ( 'size' )
            {
            // InternalAnn.g:1173:1: ( 'size' )
            // InternalAnn.g:1174:2: 'size'
            {
             before(grammarAccess.getInputAccess().getSizeKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalAnn.g:1183:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1187:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalAnn.g:1188:2: rule__Input__Group__3__Impl rule__Input__Group__4
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
    // InternalAnn.g:1195:1: rule__Input__Group__3__Impl : ( ( rule__Input__SizeAssignment_3 ) ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1199:1: ( ( ( rule__Input__SizeAssignment_3 ) ) )
            // InternalAnn.g:1200:1: ( ( rule__Input__SizeAssignment_3 ) )
            {
            // InternalAnn.g:1200:1: ( ( rule__Input__SizeAssignment_3 ) )
            // InternalAnn.g:1201:2: ( rule__Input__SizeAssignment_3 )
            {
             before(grammarAccess.getInputAccess().getSizeAssignment_3()); 
            // InternalAnn.g:1202:2: ( rule__Input__SizeAssignment_3 )
            // InternalAnn.g:1202:3: rule__Input__SizeAssignment_3
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
    // InternalAnn.g:1210:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1214:1: ( rule__Input__Group__4__Impl )
            // InternalAnn.g:1215:2: rule__Input__Group__4__Impl
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
    // InternalAnn.g:1221:1: rule__Input__Group__4__Impl : ( '}' ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1225:1: ( ( '}' ) )
            // InternalAnn.g:1226:1: ( '}' )
            {
            // InternalAnn.g:1226:1: ( '}' )
            // InternalAnn.g:1227:2: '}'
            {
             before(grammarAccess.getInputAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalAnn.g:1237:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1241:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalAnn.g:1242:2: rule__Output__Group__0__Impl rule__Output__Group__1
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
    // InternalAnn.g:1249:1: rule__Output__Group__0__Impl : ( 'out' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1253:1: ( ( 'out' ) )
            // InternalAnn.g:1254:1: ( 'out' )
            {
            // InternalAnn.g:1254:1: ( 'out' )
            // InternalAnn.g:1255:2: 'out'
            {
             before(grammarAccess.getOutputAccess().getOutKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalAnn.g:1264:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1268:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalAnn.g:1269:2: rule__Output__Group__1__Impl rule__Output__Group__2
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
    // InternalAnn.g:1276:1: rule__Output__Group__1__Impl : ( '{' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1280:1: ( ( '{' ) )
            // InternalAnn.g:1281:1: ( '{' )
            {
            // InternalAnn.g:1281:1: ( '{' )
            // InternalAnn.g:1282:2: '{'
            {
             before(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,11,FOLLOW_2); 
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
    // InternalAnn.g:1291:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1295:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalAnn.g:1296:2: rule__Output__Group__2__Impl rule__Output__Group__3
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
    // InternalAnn.g:1303:1: rule__Output__Group__2__Impl : ( 'size' ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1307:1: ( ( 'size' ) )
            // InternalAnn.g:1308:1: ( 'size' )
            {
            // InternalAnn.g:1308:1: ( 'size' )
            // InternalAnn.g:1309:2: 'size'
            {
             before(grammarAccess.getOutputAccess().getSizeKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalAnn.g:1318:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1322:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalAnn.g:1323:2: rule__Output__Group__3__Impl rule__Output__Group__4
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
    // InternalAnn.g:1330:1: rule__Output__Group__3__Impl : ( ( rule__Output__SizeAssignment_3 ) ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1334:1: ( ( ( rule__Output__SizeAssignment_3 ) ) )
            // InternalAnn.g:1335:1: ( ( rule__Output__SizeAssignment_3 ) )
            {
            // InternalAnn.g:1335:1: ( ( rule__Output__SizeAssignment_3 ) )
            // InternalAnn.g:1336:2: ( rule__Output__SizeAssignment_3 )
            {
             before(grammarAccess.getOutputAccess().getSizeAssignment_3()); 
            // InternalAnn.g:1337:2: ( rule__Output__SizeAssignment_3 )
            // InternalAnn.g:1337:3: rule__Output__SizeAssignment_3
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
    // InternalAnn.g:1345:1: rule__Output__Group__4 : rule__Output__Group__4__Impl rule__Output__Group__5 ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1349:1: ( rule__Output__Group__4__Impl rule__Output__Group__5 )
            // InternalAnn.g:1350:2: rule__Output__Group__4__Impl rule__Output__Group__5
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
    // InternalAnn.g:1357:1: rule__Output__Group__4__Impl : ( 'activation' ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1361:1: ( ( 'activation' ) )
            // InternalAnn.g:1362:1: ( 'activation' )
            {
            // InternalAnn.g:1362:1: ( 'activation' )
            // InternalAnn.g:1363:2: 'activation'
            {
             before(grammarAccess.getOutputAccess().getActivationKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalAnn.g:1372:1: rule__Output__Group__5 : rule__Output__Group__5__Impl rule__Output__Group__6 ;
    public final void rule__Output__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1376:1: ( rule__Output__Group__5__Impl rule__Output__Group__6 )
            // InternalAnn.g:1377:2: rule__Output__Group__5__Impl rule__Output__Group__6
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
    // InternalAnn.g:1384:1: rule__Output__Group__5__Impl : ( ( rule__Output__L_ruleAssignment_5 ) ) ;
    public final void rule__Output__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1388:1: ( ( ( rule__Output__L_ruleAssignment_5 ) ) )
            // InternalAnn.g:1389:1: ( ( rule__Output__L_ruleAssignment_5 ) )
            {
            // InternalAnn.g:1389:1: ( ( rule__Output__L_ruleAssignment_5 ) )
            // InternalAnn.g:1390:2: ( rule__Output__L_ruleAssignment_5 )
            {
             before(grammarAccess.getOutputAccess().getL_ruleAssignment_5()); 
            // InternalAnn.g:1391:2: ( rule__Output__L_ruleAssignment_5 )
            // InternalAnn.g:1391:3: rule__Output__L_ruleAssignment_5
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
    // InternalAnn.g:1399:1: rule__Output__Group__6 : rule__Output__Group__6__Impl ;
    public final void rule__Output__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1403:1: ( rule__Output__Group__6__Impl )
            // InternalAnn.g:1404:2: rule__Output__Group__6__Impl
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
    // InternalAnn.g:1410:1: rule__Output__Group__6__Impl : ( '}' ) ;
    public final void rule__Output__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1414:1: ( ( '}' ) )
            // InternalAnn.g:1415:1: ( '}' )
            {
            // InternalAnn.g:1415:1: ( '}' )
            // InternalAnn.g:1416:2: '}'
            {
             before(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
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


    // $ANTLR start "rule__Custom__Group__0"
    // InternalAnn.g:1426:1: rule__Custom__Group__0 : rule__Custom__Group__0__Impl rule__Custom__Group__1 ;
    public final void rule__Custom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1430:1: ( rule__Custom__Group__0__Impl rule__Custom__Group__1 )
            // InternalAnn.g:1431:2: rule__Custom__Group__0__Impl rule__Custom__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalAnn.g:1438:1: rule__Custom__Group__0__Impl : ( ( rule__Custom__NameAssignment_0 ) ) ;
    public final void rule__Custom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1442:1: ( ( ( rule__Custom__NameAssignment_0 ) ) )
            // InternalAnn.g:1443:1: ( ( rule__Custom__NameAssignment_0 ) )
            {
            // InternalAnn.g:1443:1: ( ( rule__Custom__NameAssignment_0 ) )
            // InternalAnn.g:1444:2: ( rule__Custom__NameAssignment_0 )
            {
             before(grammarAccess.getCustomAccess().getNameAssignment_0()); 
            // InternalAnn.g:1445:2: ( rule__Custom__NameAssignment_0 )
            // InternalAnn.g:1445:3: rule__Custom__NameAssignment_0
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
    // InternalAnn.g:1453:1: rule__Custom__Group__1 : rule__Custom__Group__1__Impl rule__Custom__Group__2 ;
    public final void rule__Custom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1457:1: ( rule__Custom__Group__1__Impl rule__Custom__Group__2 )
            // InternalAnn.g:1458:2: rule__Custom__Group__1__Impl rule__Custom__Group__2
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
    // InternalAnn.g:1465:1: rule__Custom__Group__1__Impl : ( '(x)' ) ;
    public final void rule__Custom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1469:1: ( ( '(x)' ) )
            // InternalAnn.g:1470:1: ( '(x)' )
            {
            // InternalAnn.g:1470:1: ( '(x)' )
            // InternalAnn.g:1471:2: '(x)'
            {
             before(grammarAccess.getCustomAccess().getXKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalAnn.g:1480:1: rule__Custom__Group__2 : rule__Custom__Group__2__Impl rule__Custom__Group__3 ;
    public final void rule__Custom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1484:1: ( rule__Custom__Group__2__Impl rule__Custom__Group__3 )
            // InternalAnn.g:1485:2: rule__Custom__Group__2__Impl rule__Custom__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalAnn.g:1492:1: rule__Custom__Group__2__Impl : ( '{' ) ;
    public final void rule__Custom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1496:1: ( ( '{' ) )
            // InternalAnn.g:1497:1: ( '{' )
            {
            // InternalAnn.g:1497:1: ( '{' )
            // InternalAnn.g:1498:2: '{'
            {
             before(grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,11,FOLLOW_2); 
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
    // InternalAnn.g:1507:1: rule__Custom__Group__3 : rule__Custom__Group__3__Impl rule__Custom__Group__4 ;
    public final void rule__Custom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1511:1: ( rule__Custom__Group__3__Impl rule__Custom__Group__4 )
            // InternalAnn.g:1512:2: rule__Custom__Group__3__Impl rule__Custom__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalAnn.g:1519:1: rule__Custom__Group__3__Impl : ( 'function' ) ;
    public final void rule__Custom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1523:1: ( ( 'function' ) )
            // InternalAnn.g:1524:1: ( 'function' )
            {
            // InternalAnn.g:1524:1: ( 'function' )
            // InternalAnn.g:1525:2: 'function'
            {
             before(grammarAccess.getCustomAccess().getFunctionKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAnn.g:1534:1: rule__Custom__Group__4 : rule__Custom__Group__4__Impl rule__Custom__Group__5 ;
    public final void rule__Custom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1538:1: ( rule__Custom__Group__4__Impl rule__Custom__Group__5 )
            // InternalAnn.g:1539:2: rule__Custom__Group__4__Impl rule__Custom__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalAnn.g:1546:1: rule__Custom__Group__4__Impl : ( '=' ) ;
    public final void rule__Custom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1550:1: ( ( '=' ) )
            // InternalAnn.g:1551:1: ( '=' )
            {
            // InternalAnn.g:1551:1: ( '=' )
            // InternalAnn.g:1552:2: '='
            {
             before(grammarAccess.getCustomAccess().getEqualsSignKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAnn.g:1561:1: rule__Custom__Group__5 : rule__Custom__Group__5__Impl rule__Custom__Group__6 ;
    public final void rule__Custom__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1565:1: ( rule__Custom__Group__5__Impl rule__Custom__Group__6 )
            // InternalAnn.g:1566:2: rule__Custom__Group__5__Impl rule__Custom__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalAnn.g:1573:1: rule__Custom__Group__5__Impl : ( ( rule__Custom__ExpAssignment_5 ) ) ;
    public final void rule__Custom__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1577:1: ( ( ( rule__Custom__ExpAssignment_5 ) ) )
            // InternalAnn.g:1578:1: ( ( rule__Custom__ExpAssignment_5 ) )
            {
            // InternalAnn.g:1578:1: ( ( rule__Custom__ExpAssignment_5 ) )
            // InternalAnn.g:1579:2: ( rule__Custom__ExpAssignment_5 )
            {
             before(grammarAccess.getCustomAccess().getExpAssignment_5()); 
            // InternalAnn.g:1580:2: ( rule__Custom__ExpAssignment_5 )
            // InternalAnn.g:1580:3: rule__Custom__ExpAssignment_5
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
    // InternalAnn.g:1588:1: rule__Custom__Group__6 : rule__Custom__Group__6__Impl rule__Custom__Group__7 ;
    public final void rule__Custom__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1592:1: ( rule__Custom__Group__6__Impl rule__Custom__Group__7 )
            // InternalAnn.g:1593:2: rule__Custom__Group__6__Impl rule__Custom__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalAnn.g:1600:1: rule__Custom__Group__6__Impl : ( 'derivative' ) ;
    public final void rule__Custom__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1604:1: ( ( 'derivative' ) )
            // InternalAnn.g:1605:1: ( 'derivative' )
            {
            // InternalAnn.g:1605:1: ( 'derivative' )
            // InternalAnn.g:1606:2: 'derivative'
            {
             before(grammarAccess.getCustomAccess().getDerivativeKeyword_6()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAnn.g:1615:1: rule__Custom__Group__7 : rule__Custom__Group__7__Impl rule__Custom__Group__8 ;
    public final void rule__Custom__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1619:1: ( rule__Custom__Group__7__Impl rule__Custom__Group__8 )
            // InternalAnn.g:1620:2: rule__Custom__Group__7__Impl rule__Custom__Group__8
            {
            pushFollow(FOLLOW_18);
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
    // InternalAnn.g:1627:1: rule__Custom__Group__7__Impl : ( '=' ) ;
    public final void rule__Custom__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1631:1: ( ( '=' ) )
            // InternalAnn.g:1632:1: ( '=' )
            {
            // InternalAnn.g:1632:1: ( '=' )
            // InternalAnn.g:1633:2: '='
            {
             before(grammarAccess.getCustomAccess().getEqualsSignKeyword_7()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAnn.g:1642:1: rule__Custom__Group__8 : rule__Custom__Group__8__Impl rule__Custom__Group__9 ;
    public final void rule__Custom__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1646:1: ( rule__Custom__Group__8__Impl rule__Custom__Group__9 )
            // InternalAnn.g:1647:2: rule__Custom__Group__8__Impl rule__Custom__Group__9
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
    // InternalAnn.g:1654:1: rule__Custom__Group__8__Impl : ( ( rule__Custom__DerAssignment_8 ) ) ;
    public final void rule__Custom__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1658:1: ( ( ( rule__Custom__DerAssignment_8 ) ) )
            // InternalAnn.g:1659:1: ( ( rule__Custom__DerAssignment_8 ) )
            {
            // InternalAnn.g:1659:1: ( ( rule__Custom__DerAssignment_8 ) )
            // InternalAnn.g:1660:2: ( rule__Custom__DerAssignment_8 )
            {
             before(grammarAccess.getCustomAccess().getDerAssignment_8()); 
            // InternalAnn.g:1661:2: ( rule__Custom__DerAssignment_8 )
            // InternalAnn.g:1661:3: rule__Custom__DerAssignment_8
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
    // InternalAnn.g:1669:1: rule__Custom__Group__9 : rule__Custom__Group__9__Impl ;
    public final void rule__Custom__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1673:1: ( rule__Custom__Group__9__Impl )
            // InternalAnn.g:1674:2: rule__Custom__Group__9__Impl
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
    // InternalAnn.g:1680:1: rule__Custom__Group__9__Impl : ( '}' ) ;
    public final void rule__Custom__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1684:1: ( ( '}' ) )
            // InternalAnn.g:1685:1: ( '}' )
            {
            // InternalAnn.g:1685:1: ( '}' )
            // InternalAnn.g:1686:2: '}'
            {
             before(grammarAccess.getCustomAccess().getRightCurlyBracketKeyword_9()); 
            match(input,14,FOLLOW_2); 
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


    // $ANTLR start "rule__External__Group__0"
    // InternalAnn.g:1696:1: rule__External__Group__0 : rule__External__Group__0__Impl rule__External__Group__1 ;
    public final void rule__External__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1700:1: ( rule__External__Group__0__Impl rule__External__Group__1 )
            // InternalAnn.g:1701:2: rule__External__Group__0__Impl rule__External__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalAnn.g:1708:1: rule__External__Group__0__Impl : ( ( rule__External__NameAssignment_0 ) ) ;
    public final void rule__External__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1712:1: ( ( ( rule__External__NameAssignment_0 ) ) )
            // InternalAnn.g:1713:1: ( ( rule__External__NameAssignment_0 ) )
            {
            // InternalAnn.g:1713:1: ( ( rule__External__NameAssignment_0 ) )
            // InternalAnn.g:1714:2: ( rule__External__NameAssignment_0 )
            {
             before(grammarAccess.getExternalAccess().getNameAssignment_0()); 
            // InternalAnn.g:1715:2: ( rule__External__NameAssignment_0 )
            // InternalAnn.g:1715:3: rule__External__NameAssignment_0
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
    // InternalAnn.g:1723:1: rule__External__Group__1 : rule__External__Group__1__Impl ;
    public final void rule__External__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1727:1: ( rule__External__Group__1__Impl )
            // InternalAnn.g:1728:2: rule__External__Group__1__Impl
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
    // InternalAnn.g:1734:1: rule__External__Group__1__Impl : ( 'external' ) ;
    public final void rule__External__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1738:1: ( ( 'external' ) )
            // InternalAnn.g:1739:1: ( 'external' )
            {
            // InternalAnn.g:1739:1: ( 'external' )
            // InternalAnn.g:1740:2: 'external'
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
    // InternalAnn.g:1750:1: rule__Sigmoid__Group__0 : rule__Sigmoid__Group__0__Impl rule__Sigmoid__Group__1 ;
    public final void rule__Sigmoid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1754:1: ( rule__Sigmoid__Group__0__Impl rule__Sigmoid__Group__1 )
            // InternalAnn.g:1755:2: rule__Sigmoid__Group__0__Impl rule__Sigmoid__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalAnn.g:1762:1: rule__Sigmoid__Group__0__Impl : ( ( rule__Sigmoid__NameAssignment_0 ) ) ;
    public final void rule__Sigmoid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1766:1: ( ( ( rule__Sigmoid__NameAssignment_0 ) ) )
            // InternalAnn.g:1767:1: ( ( rule__Sigmoid__NameAssignment_0 ) )
            {
            // InternalAnn.g:1767:1: ( ( rule__Sigmoid__NameAssignment_0 ) )
            // InternalAnn.g:1768:2: ( rule__Sigmoid__NameAssignment_0 )
            {
             before(grammarAccess.getSigmoidAccess().getNameAssignment_0()); 
            // InternalAnn.g:1769:2: ( rule__Sigmoid__NameAssignment_0 )
            // InternalAnn.g:1769:3: rule__Sigmoid__NameAssignment_0
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
    // InternalAnn.g:1777:1: rule__Sigmoid__Group__1 : rule__Sigmoid__Group__1__Impl ;
    public final void rule__Sigmoid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1781:1: ( rule__Sigmoid__Group__1__Impl )
            // InternalAnn.g:1782:2: rule__Sigmoid__Group__1__Impl
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
    // InternalAnn.g:1788:1: rule__Sigmoid__Group__1__Impl : ( ( rule__Sigmoid__RuleAssignment_1 ) ) ;
    public final void rule__Sigmoid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1792:1: ( ( ( rule__Sigmoid__RuleAssignment_1 ) ) )
            // InternalAnn.g:1793:1: ( ( rule__Sigmoid__RuleAssignment_1 ) )
            {
            // InternalAnn.g:1793:1: ( ( rule__Sigmoid__RuleAssignment_1 ) )
            // InternalAnn.g:1794:2: ( rule__Sigmoid__RuleAssignment_1 )
            {
             before(grammarAccess.getSigmoidAccess().getRuleAssignment_1()); 
            // InternalAnn.g:1795:2: ( rule__Sigmoid__RuleAssignment_1 )
            // InternalAnn.g:1795:3: rule__Sigmoid__RuleAssignment_1
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
    // InternalAnn.g:1804:1: rule__Tansig__Group__0 : rule__Tansig__Group__0__Impl rule__Tansig__Group__1 ;
    public final void rule__Tansig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1808:1: ( rule__Tansig__Group__0__Impl rule__Tansig__Group__1 )
            // InternalAnn.g:1809:2: rule__Tansig__Group__0__Impl rule__Tansig__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAnn.g:1816:1: rule__Tansig__Group__0__Impl : ( ( rule__Tansig__NameAssignment_0 ) ) ;
    public final void rule__Tansig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1820:1: ( ( ( rule__Tansig__NameAssignment_0 ) ) )
            // InternalAnn.g:1821:1: ( ( rule__Tansig__NameAssignment_0 ) )
            {
            // InternalAnn.g:1821:1: ( ( rule__Tansig__NameAssignment_0 ) )
            // InternalAnn.g:1822:2: ( rule__Tansig__NameAssignment_0 )
            {
             before(grammarAccess.getTansigAccess().getNameAssignment_0()); 
            // InternalAnn.g:1823:2: ( rule__Tansig__NameAssignment_0 )
            // InternalAnn.g:1823:3: rule__Tansig__NameAssignment_0
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
    // InternalAnn.g:1831:1: rule__Tansig__Group__1 : rule__Tansig__Group__1__Impl ;
    public final void rule__Tansig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1835:1: ( rule__Tansig__Group__1__Impl )
            // InternalAnn.g:1836:2: rule__Tansig__Group__1__Impl
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
    // InternalAnn.g:1842:1: rule__Tansig__Group__1__Impl : ( ( rule__Tansig__RuleAssignment_1 ) ) ;
    public final void rule__Tansig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1846:1: ( ( ( rule__Tansig__RuleAssignment_1 ) ) )
            // InternalAnn.g:1847:1: ( ( rule__Tansig__RuleAssignment_1 ) )
            {
            // InternalAnn.g:1847:1: ( ( rule__Tansig__RuleAssignment_1 ) )
            // InternalAnn.g:1848:2: ( rule__Tansig__RuleAssignment_1 )
            {
             before(grammarAccess.getTansigAccess().getRuleAssignment_1()); 
            // InternalAnn.g:1849:2: ( rule__Tansig__RuleAssignment_1 )
            // InternalAnn.g:1849:3: rule__Tansig__RuleAssignment_1
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


    // $ANTLR start "rule__Expression__Group__0"
    // InternalAnn.g:1858:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1862:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalAnn.g:1863:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
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
    // InternalAnn.g:1870:1: rule__Expression__Group__0__Impl : ( ruleSubstraction ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1874:1: ( ( ruleSubstraction ) )
            // InternalAnn.g:1875:1: ( ruleSubstraction )
            {
            // InternalAnn.g:1875:1: ( ruleSubstraction )
            // InternalAnn.g:1876:2: ruleSubstraction
            {
             before(grammarAccess.getExpressionAccess().getSubstractionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSubstraction();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getSubstractionParserRuleCall_0()); 

            }


            }

        }
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
    // InternalAnn.g:1885:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1889:1: ( rule__Expression__Group__1__Impl )
            // InternalAnn.g:1890:2: rule__Expression__Group__1__Impl
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
    // InternalAnn.g:1896:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1900:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalAnn.g:1901:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalAnn.g:1901:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalAnn.g:1902:2: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalAnn.g:1903:2: ( rule__Expression__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAnn.g:1903:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalAnn.g:1912:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1916:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalAnn.g:1917:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
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
    // InternalAnn.g:1924:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1928:1: ( ( () ) )
            // InternalAnn.g:1929:1: ( () )
            {
            // InternalAnn.g:1929:1: ( () )
            // InternalAnn.g:1930:2: ()
            {
             before(grammarAccess.getExpressionAccess().getAddLeftAction_1_0()); 
            // InternalAnn.g:1931:2: ()
            // InternalAnn.g:1931:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getAddLeftAction_1_0()); 

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
    // InternalAnn.g:1939:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1943:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalAnn.g:1944:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalAnn.g:1951:1: rule__Expression__Group_1__1__Impl : ( '+' ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1955:1: ( ( '+' ) )
            // InternalAnn.g:1956:1: ( '+' )
            {
            // InternalAnn.g:1956:1: ( '+' )
            // InternalAnn.g:1957:2: '+'
            {
             before(grammarAccess.getExpressionAccess().getPlusSignKeyword_1_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getPlusSignKeyword_1_1()); 

            }


            }

        }
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
    // InternalAnn.g:1966:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1970:1: ( rule__Expression__Group_1__2__Impl )
            // InternalAnn.g:1971:2: rule__Expression__Group_1__2__Impl
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
    // InternalAnn.g:1977:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1981:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // InternalAnn.g:1982:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // InternalAnn.g:1982:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // InternalAnn.g:1983:2: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // InternalAnn.g:1984:2: ( rule__Expression__RightAssignment_1_2 )
            // InternalAnn.g:1984:3: rule__Expression__RightAssignment_1_2
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


    // $ANTLR start "rule__Substraction__Group__0"
    // InternalAnn.g:1993:1: rule__Substraction__Group__0 : rule__Substraction__Group__0__Impl rule__Substraction__Group__1 ;
    public final void rule__Substraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1997:1: ( rule__Substraction__Group__0__Impl rule__Substraction__Group__1 )
            // InternalAnn.g:1998:2: rule__Substraction__Group__0__Impl rule__Substraction__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Substraction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Substraction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substraction__Group__0"


    // $ANTLR start "rule__Substraction__Group__0__Impl"
    // InternalAnn.g:2005:1: rule__Substraction__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Substraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2009:1: ( ( ruleMultiplication ) )
            // InternalAnn.g:2010:1: ( ruleMultiplication )
            {
            // InternalAnn.g:2010:1: ( ruleMultiplication )
            // InternalAnn.g:2011:2: ruleMultiplication
            {
             before(grammarAccess.getSubstractionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getSubstractionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substraction__Group__0__Impl"


    // $ANTLR start "rule__Substraction__Group__1"
    // InternalAnn.g:2020:1: rule__Substraction__Group__1 : rule__Substraction__Group__1__Impl ;
    public final void rule__Substraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2024:1: ( rule__Substraction__Group__1__Impl )
            // InternalAnn.g:2025:2: rule__Substraction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Substraction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substraction__Group__1"


    // $ANTLR start "rule__Substraction__Group__1__Impl"
    // InternalAnn.g:2031:1: rule__Substraction__Group__1__Impl : ( ( rule__Substraction__Group_1__0 )* ) ;
    public final void rule__Substraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2035:1: ( ( ( rule__Substraction__Group_1__0 )* ) )
            // InternalAnn.g:2036:1: ( ( rule__Substraction__Group_1__0 )* )
            {
            // InternalAnn.g:2036:1: ( ( rule__Substraction__Group_1__0 )* )
            // InternalAnn.g:2037:2: ( rule__Substraction__Group_1__0 )*
            {
             before(grammarAccess.getSubstractionAccess().getGroup_1()); 
            // InternalAnn.g:2038:2: ( rule__Substraction__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAnn.g:2038:3: rule__Substraction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Substraction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSubstractionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substraction__Group__1__Impl"


    // $ANTLR start "rule__Substraction__Group_1__0"
    // InternalAnn.g:2047:1: rule__Substraction__Group_1__0 : rule__Substraction__Group_1__0__Impl rule__Substraction__Group_1__1 ;
    public final void rule__Substraction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2051:1: ( rule__Substraction__Group_1__0__Impl rule__Substraction__Group_1__1 )
            // InternalAnn.g:2052:2: rule__Substraction__Group_1__0__Impl rule__Substraction__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Substraction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Substraction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substraction__Group_1__0"


    // $ANTLR start "rule__Substraction__Group_1__0__Impl"
    // InternalAnn.g:2059:1: rule__Substraction__Group_1__0__Impl : ( () ) ;
    public final void rule__Substraction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2063:1: ( ( () ) )
            // InternalAnn.g:2064:1: ( () )
            {
            // InternalAnn.g:2064:1: ( () )
            // InternalAnn.g:2065:2: ()
            {
             before(grammarAccess.getSubstractionAccess().getSubLeftAction_1_0()); 
            // InternalAnn.g:2066:2: ()
            // InternalAnn.g:2066:3: 
            {
            }

             after(grammarAccess.getSubstractionAccess().getSubLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substraction__Group_1__0__Impl"


    // $ANTLR start "rule__Substraction__Group_1__1"
    // InternalAnn.g:2074:1: rule__Substraction__Group_1__1 : rule__Substraction__Group_1__1__Impl rule__Substraction__Group_1__2 ;
    public final void rule__Substraction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2078:1: ( rule__Substraction__Group_1__1__Impl rule__Substraction__Group_1__2 )
            // InternalAnn.g:2079:2: rule__Substraction__Group_1__1__Impl rule__Substraction__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__Substraction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Substraction__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substraction__Group_1__1"


    // $ANTLR start "rule__Substraction__Group_1__1__Impl"
    // InternalAnn.g:2086:1: rule__Substraction__Group_1__1__Impl : ( '-' ) ;
    public final void rule__Substraction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2090:1: ( ( '-' ) )
            // InternalAnn.g:2091:1: ( '-' )
            {
            // InternalAnn.g:2091:1: ( '-' )
            // InternalAnn.g:2092:2: '-'
            {
             before(grammarAccess.getSubstractionAccess().getHyphenMinusKeyword_1_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSubstractionAccess().getHyphenMinusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substraction__Group_1__1__Impl"


    // $ANTLR start "rule__Substraction__Group_1__2"
    // InternalAnn.g:2101:1: rule__Substraction__Group_1__2 : rule__Substraction__Group_1__2__Impl ;
    public final void rule__Substraction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2105:1: ( rule__Substraction__Group_1__2__Impl )
            // InternalAnn.g:2106:2: rule__Substraction__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Substraction__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substraction__Group_1__2"


    // $ANTLR start "rule__Substraction__Group_1__2__Impl"
    // InternalAnn.g:2112:1: rule__Substraction__Group_1__2__Impl : ( ( rule__Substraction__RightAssignment_1_2 ) ) ;
    public final void rule__Substraction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2116:1: ( ( ( rule__Substraction__RightAssignment_1_2 ) ) )
            // InternalAnn.g:2117:1: ( ( rule__Substraction__RightAssignment_1_2 ) )
            {
            // InternalAnn.g:2117:1: ( ( rule__Substraction__RightAssignment_1_2 ) )
            // InternalAnn.g:2118:2: ( rule__Substraction__RightAssignment_1_2 )
            {
             before(grammarAccess.getSubstractionAccess().getRightAssignment_1_2()); 
            // InternalAnn.g:2119:2: ( rule__Substraction__RightAssignment_1_2 )
            // InternalAnn.g:2119:3: rule__Substraction__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Substraction__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSubstractionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substraction__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalAnn.g:2128:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2132:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalAnn.g:2133:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalAnn.g:2140:1: rule__Multiplication__Group__0__Impl : ( ruleDivision ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2144:1: ( ( ruleDivision ) )
            // InternalAnn.g:2145:1: ( ruleDivision )
            {
            // InternalAnn.g:2145:1: ( ruleDivision )
            // InternalAnn.g:2146:2: ruleDivision
            {
             before(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDivision();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalAnn.g:2155:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2159:1: ( rule__Multiplication__Group__1__Impl )
            // InternalAnn.g:2160:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalAnn.g:2166:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2170:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalAnn.g:2171:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalAnn.g:2171:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalAnn.g:2172:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalAnn.g:2173:2: ( rule__Multiplication__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAnn.g:2173:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalAnn.g:2182:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2186:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalAnn.g:2187:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalAnn.g:2194:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2198:1: ( ( () ) )
            // InternalAnn.g:2199:1: ( () )
            {
            // InternalAnn.g:2199:1: ( () )
            // InternalAnn.g:2200:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0()); 
            // InternalAnn.g:2201:2: ()
            // InternalAnn.g:2201:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalAnn.g:2209:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2213:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalAnn.g:2214:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalAnn.g:2221:1: rule__Multiplication__Group_1__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2225:1: ( ( '*' ) )
            // InternalAnn.g:2226:1: ( '*' )
            {
            // InternalAnn.g:2226:1: ( '*' )
            // InternalAnn.g:2227:2: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // InternalAnn.g:2236:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2240:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalAnn.g:2241:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // InternalAnn.g:2247:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2251:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalAnn.g:2252:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalAnn.g:2252:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalAnn.g:2253:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalAnn.g:2254:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalAnn.g:2254:3: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__Division__Group__0"
    // InternalAnn.g:2263:1: rule__Division__Group__0 : rule__Division__Group__0__Impl rule__Division__Group__1 ;
    public final void rule__Division__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2267:1: ( rule__Division__Group__0__Impl rule__Division__Group__1 )
            // InternalAnn.g:2268:2: rule__Division__Group__0__Impl rule__Division__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Division__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Division__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__0"


    // $ANTLR start "rule__Division__Group__0__Impl"
    // InternalAnn.g:2275:1: rule__Division__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Division__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2279:1: ( ( rulePrimary ) )
            // InternalAnn.g:2280:1: ( rulePrimary )
            {
            // InternalAnn.g:2280:1: ( rulePrimary )
            // InternalAnn.g:2281:2: rulePrimary
            {
             before(grammarAccess.getDivisionAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getDivisionAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__0__Impl"


    // $ANTLR start "rule__Division__Group__1"
    // InternalAnn.g:2290:1: rule__Division__Group__1 : rule__Division__Group__1__Impl ;
    public final void rule__Division__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2294:1: ( rule__Division__Group__1__Impl )
            // InternalAnn.g:2295:2: rule__Division__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Division__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__1"


    // $ANTLR start "rule__Division__Group__1__Impl"
    // InternalAnn.g:2301:1: rule__Division__Group__1__Impl : ( ( rule__Division__Group_1__0 )* ) ;
    public final void rule__Division__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2305:1: ( ( ( rule__Division__Group_1__0 )* ) )
            // InternalAnn.g:2306:1: ( ( rule__Division__Group_1__0 )* )
            {
            // InternalAnn.g:2306:1: ( ( rule__Division__Group_1__0 )* )
            // InternalAnn.g:2307:2: ( rule__Division__Group_1__0 )*
            {
             before(grammarAccess.getDivisionAccess().getGroup_1()); 
            // InternalAnn.g:2308:2: ( rule__Division__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAnn.g:2308:3: rule__Division__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Division__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDivisionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__1__Impl"


    // $ANTLR start "rule__Division__Group_1__0"
    // InternalAnn.g:2317:1: rule__Division__Group_1__0 : rule__Division__Group_1__0__Impl rule__Division__Group_1__1 ;
    public final void rule__Division__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2321:1: ( rule__Division__Group_1__0__Impl rule__Division__Group_1__1 )
            // InternalAnn.g:2322:2: rule__Division__Group_1__0__Impl rule__Division__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Division__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Division__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group_1__0"


    // $ANTLR start "rule__Division__Group_1__0__Impl"
    // InternalAnn.g:2329:1: rule__Division__Group_1__0__Impl : ( () ) ;
    public final void rule__Division__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2333:1: ( ( () ) )
            // InternalAnn.g:2334:1: ( () )
            {
            // InternalAnn.g:2334:1: ( () )
            // InternalAnn.g:2335:2: ()
            {
             before(grammarAccess.getDivisionAccess().getDivLeftAction_1_0()); 
            // InternalAnn.g:2336:2: ()
            // InternalAnn.g:2336:3: 
            {
            }

             after(grammarAccess.getDivisionAccess().getDivLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group_1__0__Impl"


    // $ANTLR start "rule__Division__Group_1__1"
    // InternalAnn.g:2344:1: rule__Division__Group_1__1 : rule__Division__Group_1__1__Impl rule__Division__Group_1__2 ;
    public final void rule__Division__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2348:1: ( rule__Division__Group_1__1__Impl rule__Division__Group_1__2 )
            // InternalAnn.g:2349:2: rule__Division__Group_1__1__Impl rule__Division__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__Division__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Division__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group_1__1"


    // $ANTLR start "rule__Division__Group_1__1__Impl"
    // InternalAnn.g:2356:1: rule__Division__Group_1__1__Impl : ( '/' ) ;
    public final void rule__Division__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2360:1: ( ( '/' ) )
            // InternalAnn.g:2361:1: ( '/' )
            {
            // InternalAnn.g:2361:1: ( '/' )
            // InternalAnn.g:2362:2: '/'
            {
             before(grammarAccess.getDivisionAccess().getSolidusKeyword_1_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDivisionAccess().getSolidusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group_1__1__Impl"


    // $ANTLR start "rule__Division__Group_1__2"
    // InternalAnn.g:2371:1: rule__Division__Group_1__2 : rule__Division__Group_1__2__Impl ;
    public final void rule__Division__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2375:1: ( rule__Division__Group_1__2__Impl )
            // InternalAnn.g:2376:2: rule__Division__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Division__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group_1__2"


    // $ANTLR start "rule__Division__Group_1__2__Impl"
    // InternalAnn.g:2382:1: rule__Division__Group_1__2__Impl : ( ( rule__Division__RightAssignment_1_2 ) ) ;
    public final void rule__Division__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2386:1: ( ( ( rule__Division__RightAssignment_1_2 ) ) )
            // InternalAnn.g:2387:1: ( ( rule__Division__RightAssignment_1_2 ) )
            {
            // InternalAnn.g:2387:1: ( ( rule__Division__RightAssignment_1_2 ) )
            // InternalAnn.g:2388:2: ( rule__Division__RightAssignment_1_2 )
            {
             before(grammarAccess.getDivisionAccess().getRightAssignment_1_2()); 
            // InternalAnn.g:2389:2: ( rule__Division__RightAssignment_1_2 )
            // InternalAnn.g:2389:3: rule__Division__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Division__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDivisionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalAnn.g:2398:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2402:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalAnn.g:2403:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalAnn.g:2410:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2414:1: ( ( '(' ) )
            // InternalAnn.g:2415:1: ( '(' )
            {
            // InternalAnn.g:2415:1: ( '(' )
            // InternalAnn.g:2416:2: '('
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
    // InternalAnn.g:2425:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2429:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalAnn.g:2430:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalAnn.g:2437:1: rule__Primary__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2441:1: ( ( ruleExpression ) )
            // InternalAnn.g:2442:1: ( ruleExpression )
            {
            // InternalAnn.g:2442:1: ( ruleExpression )
            // InternalAnn.g:2443:2: ruleExpression
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
    // InternalAnn.g:2452:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2456:1: ( rule__Primary__Group_2__2__Impl )
            // InternalAnn.g:2457:2: rule__Primary__Group_2__2__Impl
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
    // InternalAnn.g:2463:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2467:1: ( ( ')' ) )
            // InternalAnn.g:2468:1: ( ')' )
            {
            // InternalAnn.g:2468:1: ( ')' )
            // InternalAnn.g:2469:2: ')'
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


    // $ANTLR start "rule__ANNModel__NameAssignment_0"
    // InternalAnn.g:2479:1: rule__ANNModel__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ANNModel__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2483:1: ( ( RULE_ID ) )
            // InternalAnn.g:2484:2: ( RULE_ID )
            {
            // InternalAnn.g:2484:2: ( RULE_ID )
            // InternalAnn.g:2485:3: RULE_ID
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
    // InternalAnn.g:2494:1: rule__ANNModel__AlphaAssignment_3 : ( ruleDECIMAL ) ;
    public final void rule__ANNModel__AlphaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2498:1: ( ( ruleDECIMAL ) )
            // InternalAnn.g:2499:2: ( ruleDECIMAL )
            {
            // InternalAnn.g:2499:2: ( ruleDECIMAL )
            // InternalAnn.g:2500:3: ruleDECIMAL
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
    // InternalAnn.g:2509:1: rule__ANNModel__EpochsAssignment_5 : ( RULE_INT ) ;
    public final void rule__ANNModel__EpochsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2513:1: ( ( RULE_INT ) )
            // InternalAnn.g:2514:2: ( RULE_INT )
            {
            // InternalAnn.g:2514:2: ( RULE_INT )
            // InternalAnn.g:2515:3: RULE_INT
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
    // InternalAnn.g:2524:1: rule__ANNModel__ActivationAssignment_6 : ( ruleActivation ) ;
    public final void rule__ANNModel__ActivationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2528:1: ( ( ruleActivation ) )
            // InternalAnn.g:2529:2: ( ruleActivation )
            {
            // InternalAnn.g:2529:2: ( ruleActivation )
            // InternalAnn.g:2530:3: ruleActivation
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
    // InternalAnn.g:2539:1: rule__ANNModel__LayerAssignment_7 : ( ruleLayer ) ;
    public final void rule__ANNModel__LayerAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2543:1: ( ( ruleLayer ) )
            // InternalAnn.g:2544:2: ( ruleLayer )
            {
            // InternalAnn.g:2544:2: ( ruleLayer )
            // InternalAnn.g:2545:3: ruleLayer
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
    // InternalAnn.g:2554:1: rule__Hidden__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__Hidden__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2558:1: ( ( RULE_INT ) )
            // InternalAnn.g:2559:2: ( RULE_INT )
            {
            // InternalAnn.g:2559:2: ( RULE_INT )
            // InternalAnn.g:2560:3: RULE_INT
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
    // InternalAnn.g:2569:1: rule__Hidden__L_ruleAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Hidden__L_ruleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2573:1: ( ( ( RULE_ID ) ) )
            // InternalAnn.g:2574:2: ( ( RULE_ID ) )
            {
            // InternalAnn.g:2574:2: ( ( RULE_ID ) )
            // InternalAnn.g:2575:3: ( RULE_ID )
            {
             before(grammarAccess.getHiddenAccess().getL_ruleActivationCrossReference_5_0()); 
            // InternalAnn.g:2576:3: ( RULE_ID )
            // InternalAnn.g:2577:4: RULE_ID
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
    // InternalAnn.g:2588:1: rule__Input__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__Input__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2592:1: ( ( RULE_INT ) )
            // InternalAnn.g:2593:2: ( RULE_INT )
            {
            // InternalAnn.g:2593:2: ( RULE_INT )
            // InternalAnn.g:2594:3: RULE_INT
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
    // InternalAnn.g:2603:1: rule__Output__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__Output__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2607:1: ( ( RULE_INT ) )
            // InternalAnn.g:2608:2: ( RULE_INT )
            {
            // InternalAnn.g:2608:2: ( RULE_INT )
            // InternalAnn.g:2609:3: RULE_INT
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
    // InternalAnn.g:2618:1: rule__Output__L_ruleAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Output__L_ruleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2622:1: ( ( ( RULE_ID ) ) )
            // InternalAnn.g:2623:2: ( ( RULE_ID ) )
            {
            // InternalAnn.g:2623:2: ( ( RULE_ID ) )
            // InternalAnn.g:2624:3: ( RULE_ID )
            {
             before(grammarAccess.getOutputAccess().getL_ruleActivationCrossReference_5_0()); 
            // InternalAnn.g:2625:3: ( RULE_ID )
            // InternalAnn.g:2626:4: RULE_ID
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


    // $ANTLR start "rule__Custom__NameAssignment_0"
    // InternalAnn.g:2637:1: rule__Custom__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Custom__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2641:1: ( ( RULE_ID ) )
            // InternalAnn.g:2642:2: ( RULE_ID )
            {
            // InternalAnn.g:2642:2: ( RULE_ID )
            // InternalAnn.g:2643:3: RULE_ID
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
    // InternalAnn.g:2652:1: rule__Custom__ExpAssignment_5 : ( ruleExpression ) ;
    public final void rule__Custom__ExpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2656:1: ( ( ruleExpression ) )
            // InternalAnn.g:2657:2: ( ruleExpression )
            {
            // InternalAnn.g:2657:2: ( ruleExpression )
            // InternalAnn.g:2658:3: ruleExpression
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
    // InternalAnn.g:2667:1: rule__Custom__DerAssignment_8 : ( ruleExpression ) ;
    public final void rule__Custom__DerAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2671:1: ( ( ruleExpression ) )
            // InternalAnn.g:2672:2: ( ruleExpression )
            {
            // InternalAnn.g:2672:2: ( ruleExpression )
            // InternalAnn.g:2673:3: ruleExpression
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


    // $ANTLR start "rule__External__NameAssignment_0"
    // InternalAnn.g:2682:1: rule__External__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__External__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2686:1: ( ( RULE_ID ) )
            // InternalAnn.g:2687:2: ( RULE_ID )
            {
            // InternalAnn.g:2687:2: ( RULE_ID )
            // InternalAnn.g:2688:3: RULE_ID
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
    // InternalAnn.g:2697:1: rule__Sigmoid__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Sigmoid__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2701:1: ( ( RULE_ID ) )
            // InternalAnn.g:2702:2: ( RULE_ID )
            {
            // InternalAnn.g:2702:2: ( RULE_ID )
            // InternalAnn.g:2703:3: RULE_ID
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
    // InternalAnn.g:2712:1: rule__Sigmoid__RuleAssignment_1 : ( ( 'sigmoid' ) ) ;
    public final void rule__Sigmoid__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2716:1: ( ( ( 'sigmoid' ) ) )
            // InternalAnn.g:2717:2: ( ( 'sigmoid' ) )
            {
            // InternalAnn.g:2717:2: ( ( 'sigmoid' ) )
            // InternalAnn.g:2718:3: ( 'sigmoid' )
            {
             before(grammarAccess.getSigmoidAccess().getRuleSigmoidKeyword_1_0()); 
            // InternalAnn.g:2719:3: ( 'sigmoid' )
            // InternalAnn.g:2720:4: 'sigmoid'
            {
             before(grammarAccess.getSigmoidAccess().getRuleSigmoidKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalAnn.g:2731:1: rule__Tansig__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Tansig__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2735:1: ( ( RULE_ID ) )
            // InternalAnn.g:2736:2: ( RULE_ID )
            {
            // InternalAnn.g:2736:2: ( RULE_ID )
            // InternalAnn.g:2737:3: RULE_ID
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
    // InternalAnn.g:2746:1: rule__Tansig__RuleAssignment_1 : ( ( 'tansig' ) ) ;
    public final void rule__Tansig__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2750:1: ( ( ( 'tansig' ) ) )
            // InternalAnn.g:2751:2: ( ( 'tansig' ) )
            {
            // InternalAnn.g:2751:2: ( ( 'tansig' ) )
            // InternalAnn.g:2752:3: ( 'tansig' )
            {
             before(grammarAccess.getTansigAccess().getRuleTansigKeyword_1_0()); 
            // InternalAnn.g:2753:3: ( 'tansig' )
            // InternalAnn.g:2754:4: 'tansig'
            {
             before(grammarAccess.getTansigAccess().getRuleTansigKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
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


    // $ANTLR start "rule__Expression__RightAssignment_1_2"
    // InternalAnn.g:2765:1: rule__Expression__RightAssignment_1_2 : ( ruleSubstraction ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2769:1: ( ( ruleSubstraction ) )
            // InternalAnn.g:2770:2: ( ruleSubstraction )
            {
            // InternalAnn.g:2770:2: ( ruleSubstraction )
            // InternalAnn.g:2771:3: ruleSubstraction
            {
             before(grammarAccess.getExpressionAccess().getRightSubstractionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSubstraction();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightSubstractionParserRuleCall_1_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Substraction__RightAssignment_1_2"
    // InternalAnn.g:2780:1: rule__Substraction__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Substraction__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2784:1: ( ( ruleMultiplication ) )
            // InternalAnn.g:2785:2: ( ruleMultiplication )
            {
            // InternalAnn.g:2785:2: ( ruleMultiplication )
            // InternalAnn.g:2786:3: ruleMultiplication
            {
             before(grammarAccess.getSubstractionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getSubstractionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substraction__RightAssignment_1_2"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // InternalAnn.g:2795:1: rule__Multiplication__RightAssignment_1_2 : ( ruleDivision ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2799:1: ( ( ruleDivision ) )
            // InternalAnn.g:2800:2: ( ruleDivision )
            {
            // InternalAnn.g:2800:2: ( ruleDivision )
            // InternalAnn.g:2801:3: ruleDivision
            {
             before(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDivision();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_2"


    // $ANTLR start "rule__Division__RightAssignment_1_2"
    // InternalAnn.g:2810:1: rule__Division__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Division__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2814:1: ( ( rulePrimary ) )
            // InternalAnn.g:2815:2: ( rulePrimary )
            {
            // InternalAnn.g:2815:2: ( rulePrimary )
            // InternalAnn.g:2816:3: rulePrimary
            {
             before(grammarAccess.getDivisionAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getDivisionAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__RightAssignment_1_2"


    // $ANTLR start "rule__Letter__ValueAssignment"
    // InternalAnn.g:2825:1: rule__Letter__ValueAssignment : ( ( 'x' ) ) ;
    public final void rule__Letter__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2829:1: ( ( ( 'x' ) ) )
            // InternalAnn.g:2830:2: ( ( 'x' ) )
            {
            // InternalAnn.g:2830:2: ( ( 'x' ) )
            // InternalAnn.g:2831:3: ( 'x' )
            {
             before(grammarAccess.getLetterAccess().getValueXKeyword_0()); 
            // InternalAnn.g:2832:3: ( 'x' )
            // InternalAnn.g:2833:4: 'x'
            {
             before(grammarAccess.getLetterAccess().getValueXKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLetterAccess().getValueXKeyword_0()); 

            }

             after(grammarAccess.getLetterAccess().getValueXKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Letter__ValueAssignment"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment"
    // InternalAnn.g:2844:1: rule__NumberLiteral__ValueAssignment : ( ruleDECIMAL ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2848:1: ( ( ruleDECIMAL ) )
            // InternalAnn.g:2849:2: ( ruleDECIMAL )
            {
            // InternalAnn.g:2849:2: ( ruleDECIMAL )
            // InternalAnn.g:2850:3: ruleDECIMAL
            {
             before(grammarAccess.getNumberLiteralAccess().getValueDECIMALParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getNumberLiteralAccess().getValueDECIMALParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000194020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000190002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000440000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});

}