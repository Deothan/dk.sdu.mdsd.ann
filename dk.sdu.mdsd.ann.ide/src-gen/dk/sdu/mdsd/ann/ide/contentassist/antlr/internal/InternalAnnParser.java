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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'alpha'", "'epochs'", "'}'", "'.'", "'hidden'", "'size'", "'learningRule'", "'in'", "'out'", "'external'", "'(x)'", "'function'", "'='", "'derivative'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'sigmoid'", "'x'"
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


    // $ANTLR start "entryRuleLearningRule"
    // InternalAnn.g:203:1: entryRuleLearningRule : ruleLearningRule EOF ;
    public final void entryRuleLearningRule() throws RecognitionException {
        try {
            // InternalAnn.g:204:1: ( ruleLearningRule EOF )
            // InternalAnn.g:205:1: ruleLearningRule EOF
            {
             before(grammarAccess.getLearningRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleLearningRule();

            state._fsp--;

             after(grammarAccess.getLearningRuleRule()); 
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
    // $ANTLR end "entryRuleLearningRule"


    // $ANTLR start "ruleLearningRule"
    // InternalAnn.g:212:1: ruleLearningRule : ( ( rule__LearningRule__Alternatives ) ) ;
    public final void ruleLearningRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:216:2: ( ( ( rule__LearningRule__Alternatives ) ) )
            // InternalAnn.g:217:2: ( ( rule__LearningRule__Alternatives ) )
            {
            // InternalAnn.g:217:2: ( ( rule__LearningRule__Alternatives ) )
            // InternalAnn.g:218:3: ( rule__LearningRule__Alternatives )
            {
             before(grammarAccess.getLearningRuleAccess().getAlternatives()); 
            // InternalAnn.g:219:3: ( rule__LearningRule__Alternatives )
            // InternalAnn.g:219:4: rule__LearningRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LearningRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLearningRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLearningRule"


    // $ANTLR start "entryRuleSigmoid"
    // InternalAnn.g:228:1: entryRuleSigmoid : ruleSigmoid EOF ;
    public final void entryRuleSigmoid() throws RecognitionException {
        try {
            // InternalAnn.g:229:1: ( ruleSigmoid EOF )
            // InternalAnn.g:230:1: ruleSigmoid EOF
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
    // InternalAnn.g:237:1: ruleSigmoid : ( ( rule__Sigmoid__RuleAssignment ) ) ;
    public final void ruleSigmoid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:241:2: ( ( ( rule__Sigmoid__RuleAssignment ) ) )
            // InternalAnn.g:242:2: ( ( rule__Sigmoid__RuleAssignment ) )
            {
            // InternalAnn.g:242:2: ( ( rule__Sigmoid__RuleAssignment ) )
            // InternalAnn.g:243:3: ( rule__Sigmoid__RuleAssignment )
            {
             before(grammarAccess.getSigmoidAccess().getRuleAssignment()); 
            // InternalAnn.g:244:3: ( rule__Sigmoid__RuleAssignment )
            // InternalAnn.g:244:4: rule__Sigmoid__RuleAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Sigmoid__RuleAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSigmoidAccess().getRuleAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleCustom"
    // InternalAnn.g:278:1: entryRuleCustom : ruleCustom EOF ;
    public final void entryRuleCustom() throws RecognitionException {
        try {
            // InternalAnn.g:279:1: ( ruleCustom EOF )
            // InternalAnn.g:280:1: ruleCustom EOF
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
    // InternalAnn.g:287:1: ruleCustom : ( ( rule__Custom__Group__0 ) ) ;
    public final void ruleCustom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:291:2: ( ( ( rule__Custom__Group__0 ) ) )
            // InternalAnn.g:292:2: ( ( rule__Custom__Group__0 ) )
            {
            // InternalAnn.g:292:2: ( ( rule__Custom__Group__0 ) )
            // InternalAnn.g:293:3: ( rule__Custom__Group__0 )
            {
             before(grammarAccess.getCustomAccess().getGroup()); 
            // InternalAnn.g:294:3: ( rule__Custom__Group__0 )
            // InternalAnn.g:294:4: rule__Custom__Group__0
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
    // InternalAnn.g:303:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalAnn.g:304:1: ( ruleExpression EOF )
            // InternalAnn.g:305:1: ruleExpression EOF
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
    // InternalAnn.g:312:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:316:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalAnn.g:317:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalAnn.g:317:2: ( ( rule__Expression__Group__0 ) )
            // InternalAnn.g:318:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalAnn.g:319:3: ( rule__Expression__Group__0 )
            // InternalAnn.g:319:4: rule__Expression__Group__0
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
    // InternalAnn.g:328:1: entryRuleSubstraction : ruleSubstraction EOF ;
    public final void entryRuleSubstraction() throws RecognitionException {
        try {
            // InternalAnn.g:329:1: ( ruleSubstraction EOF )
            // InternalAnn.g:330:1: ruleSubstraction EOF
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
    // InternalAnn.g:337:1: ruleSubstraction : ( ( rule__Substraction__Group__0 ) ) ;
    public final void ruleSubstraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:341:2: ( ( ( rule__Substraction__Group__0 ) ) )
            // InternalAnn.g:342:2: ( ( rule__Substraction__Group__0 ) )
            {
            // InternalAnn.g:342:2: ( ( rule__Substraction__Group__0 ) )
            // InternalAnn.g:343:3: ( rule__Substraction__Group__0 )
            {
             before(grammarAccess.getSubstractionAccess().getGroup()); 
            // InternalAnn.g:344:3: ( rule__Substraction__Group__0 )
            // InternalAnn.g:344:4: rule__Substraction__Group__0
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
    // InternalAnn.g:353:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalAnn.g:354:1: ( ruleMultiplication EOF )
            // InternalAnn.g:355:1: ruleMultiplication EOF
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
    // InternalAnn.g:362:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:366:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalAnn.g:367:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalAnn.g:367:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalAnn.g:368:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalAnn.g:369:3: ( rule__Multiplication__Group__0 )
            // InternalAnn.g:369:4: rule__Multiplication__Group__0
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
    // InternalAnn.g:378:1: entryRuleDivision : ruleDivision EOF ;
    public final void entryRuleDivision() throws RecognitionException {
        try {
            // InternalAnn.g:379:1: ( ruleDivision EOF )
            // InternalAnn.g:380:1: ruleDivision EOF
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
    // InternalAnn.g:387:1: ruleDivision : ( ( rule__Division__Group__0 ) ) ;
    public final void ruleDivision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:391:2: ( ( ( rule__Division__Group__0 ) ) )
            // InternalAnn.g:392:2: ( ( rule__Division__Group__0 ) )
            {
            // InternalAnn.g:392:2: ( ( rule__Division__Group__0 ) )
            // InternalAnn.g:393:3: ( rule__Division__Group__0 )
            {
             before(grammarAccess.getDivisionAccess().getGroup()); 
            // InternalAnn.g:394:3: ( rule__Division__Group__0 )
            // InternalAnn.g:394:4: rule__Division__Group__0
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
    // InternalAnn.g:403:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalAnn.g:404:1: ( rulePrimary EOF )
            // InternalAnn.g:405:1: rulePrimary EOF
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
    // InternalAnn.g:412:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:416:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalAnn.g:417:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalAnn.g:417:2: ( ( rule__Primary__Alternatives ) )
            // InternalAnn.g:418:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalAnn.g:419:3: ( rule__Primary__Alternatives )
            // InternalAnn.g:419:4: rule__Primary__Alternatives
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
    // InternalAnn.g:428:1: entryRuleLetter : ruleLetter EOF ;
    public final void entryRuleLetter() throws RecognitionException {
        try {
            // InternalAnn.g:429:1: ( ruleLetter EOF )
            // InternalAnn.g:430:1: ruleLetter EOF
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
    // InternalAnn.g:437:1: ruleLetter : ( ( rule__Letter__ValueAssignment ) ) ;
    public final void ruleLetter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:441:2: ( ( ( rule__Letter__ValueAssignment ) ) )
            // InternalAnn.g:442:2: ( ( rule__Letter__ValueAssignment ) )
            {
            // InternalAnn.g:442:2: ( ( rule__Letter__ValueAssignment ) )
            // InternalAnn.g:443:3: ( rule__Letter__ValueAssignment )
            {
             before(grammarAccess.getLetterAccess().getValueAssignment()); 
            // InternalAnn.g:444:3: ( rule__Letter__ValueAssignment )
            // InternalAnn.g:444:4: rule__Letter__ValueAssignment
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
    // InternalAnn.g:453:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalAnn.g:454:1: ( ruleNumberLiteral EOF )
            // InternalAnn.g:455:1: ruleNumberLiteral EOF
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
    // InternalAnn.g:462:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValueAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:466:2: ( ( ( rule__NumberLiteral__ValueAssignment ) ) )
            // InternalAnn.g:467:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            {
            // InternalAnn.g:467:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            // InternalAnn.g:468:3: ( rule__NumberLiteral__ValueAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            // InternalAnn.g:469:3: ( rule__NumberLiteral__ValueAssignment )
            // InternalAnn.g:469:4: rule__NumberLiteral__ValueAssignment
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
    // InternalAnn.g:477:1: rule__Layer__Alternatives : ( ( ruleHidden ) | ( ruleInput ) | ( ruleOutput ) );
    public final void rule__Layer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:481:1: ( ( ruleHidden ) | ( ruleInput ) | ( ruleOutput ) )
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
                    // InternalAnn.g:482:2: ( ruleHidden )
                    {
                    // InternalAnn.g:482:2: ( ruleHidden )
                    // InternalAnn.g:483:3: ruleHidden
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
                    // InternalAnn.g:488:2: ( ruleInput )
                    {
                    // InternalAnn.g:488:2: ( ruleInput )
                    // InternalAnn.g:489:3: ruleInput
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
                    // InternalAnn.g:494:2: ( ruleOutput )
                    {
                    // InternalAnn.g:494:2: ( ruleOutput )
                    // InternalAnn.g:495:3: ruleOutput
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


    // $ANTLR start "rule__LearningRule__Alternatives"
    // InternalAnn.g:504:1: rule__LearningRule__Alternatives : ( ( ruleSigmoid ) | ( ruleExternal ) | ( ruleCustom ) );
    public final void rule__LearningRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:508:1: ( ( ruleSigmoid ) | ( ruleExternal ) | ( ruleCustom ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==32) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==22) ) {
                    alt2=3;
                }
                else if ( (LA2_2==21) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

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
                    // InternalAnn.g:509:2: ( ruleSigmoid )
                    {
                    // InternalAnn.g:509:2: ( ruleSigmoid )
                    // InternalAnn.g:510:3: ruleSigmoid
                    {
                     before(grammarAccess.getLearningRuleAccess().getSigmoidParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSigmoid();

                    state._fsp--;

                     after(grammarAccess.getLearningRuleAccess().getSigmoidParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:515:2: ( ruleExternal )
                    {
                    // InternalAnn.g:515:2: ( ruleExternal )
                    // InternalAnn.g:516:3: ruleExternal
                    {
                     before(grammarAccess.getLearningRuleAccess().getExternalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExternal();

                    state._fsp--;

                     after(grammarAccess.getLearningRuleAccess().getExternalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAnn.g:521:2: ( ruleCustom )
                    {
                    // InternalAnn.g:521:2: ( ruleCustom )
                    // InternalAnn.g:522:3: ruleCustom
                    {
                     before(grammarAccess.getLearningRuleAccess().getCustomParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCustom();

                    state._fsp--;

                     after(grammarAccess.getLearningRuleAccess().getCustomParserRuleCall_2()); 

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
    // $ANTLR end "rule__LearningRule__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalAnn.g:531:1: rule__Primary__Alternatives : ( ( ruleNumberLiteral ) | ( ruleLetter ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:535:1: ( ( ruleNumberLiteral ) | ( ruleLetter ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case 33:
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
                    // InternalAnn.g:536:2: ( ruleNumberLiteral )
                    {
                    // InternalAnn.g:536:2: ( ruleNumberLiteral )
                    // InternalAnn.g:537:3: ruleNumberLiteral
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
                    // InternalAnn.g:542:2: ( ruleLetter )
                    {
                    // InternalAnn.g:542:2: ( ruleLetter )
                    // InternalAnn.g:543:3: ruleLetter
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
                    // InternalAnn.g:548:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalAnn.g:548:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalAnn.g:549:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalAnn.g:550:3: ( rule__Primary__Group_2__0 )
                    // InternalAnn.g:550:4: rule__Primary__Group_2__0
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
    // InternalAnn.g:558:1: rule__ANNModel__Group__0 : rule__ANNModel__Group__0__Impl rule__ANNModel__Group__1 ;
    public final void rule__ANNModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:562:1: ( rule__ANNModel__Group__0__Impl rule__ANNModel__Group__1 )
            // InternalAnn.g:563:2: rule__ANNModel__Group__0__Impl rule__ANNModel__Group__1
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
    // InternalAnn.g:570:1: rule__ANNModel__Group__0__Impl : ( ( rule__ANNModel__NameAssignment_0 ) ) ;
    public final void rule__ANNModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:574:1: ( ( ( rule__ANNModel__NameAssignment_0 ) ) )
            // InternalAnn.g:575:1: ( ( rule__ANNModel__NameAssignment_0 ) )
            {
            // InternalAnn.g:575:1: ( ( rule__ANNModel__NameAssignment_0 ) )
            // InternalAnn.g:576:2: ( rule__ANNModel__NameAssignment_0 )
            {
             before(grammarAccess.getANNModelAccess().getNameAssignment_0()); 
            // InternalAnn.g:577:2: ( rule__ANNModel__NameAssignment_0 )
            // InternalAnn.g:577:3: rule__ANNModel__NameAssignment_0
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
    // InternalAnn.g:585:1: rule__ANNModel__Group__1 : rule__ANNModel__Group__1__Impl rule__ANNModel__Group__2 ;
    public final void rule__ANNModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:589:1: ( rule__ANNModel__Group__1__Impl rule__ANNModel__Group__2 )
            // InternalAnn.g:590:2: rule__ANNModel__Group__1__Impl rule__ANNModel__Group__2
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
    // InternalAnn.g:597:1: rule__ANNModel__Group__1__Impl : ( '{' ) ;
    public final void rule__ANNModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:601:1: ( ( '{' ) )
            // InternalAnn.g:602:1: ( '{' )
            {
            // InternalAnn.g:602:1: ( '{' )
            // InternalAnn.g:603:2: '{'
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
    // InternalAnn.g:612:1: rule__ANNModel__Group__2 : rule__ANNModel__Group__2__Impl rule__ANNModel__Group__3 ;
    public final void rule__ANNModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:616:1: ( rule__ANNModel__Group__2__Impl rule__ANNModel__Group__3 )
            // InternalAnn.g:617:2: rule__ANNModel__Group__2__Impl rule__ANNModel__Group__3
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
    // InternalAnn.g:624:1: rule__ANNModel__Group__2__Impl : ( 'alpha' ) ;
    public final void rule__ANNModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:628:1: ( ( 'alpha' ) )
            // InternalAnn.g:629:1: ( 'alpha' )
            {
            // InternalAnn.g:629:1: ( 'alpha' )
            // InternalAnn.g:630:2: 'alpha'
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
    // InternalAnn.g:639:1: rule__ANNModel__Group__3 : rule__ANNModel__Group__3__Impl rule__ANNModel__Group__4 ;
    public final void rule__ANNModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:643:1: ( rule__ANNModel__Group__3__Impl rule__ANNModel__Group__4 )
            // InternalAnn.g:644:2: rule__ANNModel__Group__3__Impl rule__ANNModel__Group__4
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
    // InternalAnn.g:651:1: rule__ANNModel__Group__3__Impl : ( ( rule__ANNModel__AlphaAssignment_3 ) ) ;
    public final void rule__ANNModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:655:1: ( ( ( rule__ANNModel__AlphaAssignment_3 ) ) )
            // InternalAnn.g:656:1: ( ( rule__ANNModel__AlphaAssignment_3 ) )
            {
            // InternalAnn.g:656:1: ( ( rule__ANNModel__AlphaAssignment_3 ) )
            // InternalAnn.g:657:2: ( rule__ANNModel__AlphaAssignment_3 )
            {
             before(grammarAccess.getANNModelAccess().getAlphaAssignment_3()); 
            // InternalAnn.g:658:2: ( rule__ANNModel__AlphaAssignment_3 )
            // InternalAnn.g:658:3: rule__ANNModel__AlphaAssignment_3
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
    // InternalAnn.g:666:1: rule__ANNModel__Group__4 : rule__ANNModel__Group__4__Impl rule__ANNModel__Group__5 ;
    public final void rule__ANNModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:670:1: ( rule__ANNModel__Group__4__Impl rule__ANNModel__Group__5 )
            // InternalAnn.g:671:2: rule__ANNModel__Group__4__Impl rule__ANNModel__Group__5
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
    // InternalAnn.g:678:1: rule__ANNModel__Group__4__Impl : ( 'epochs' ) ;
    public final void rule__ANNModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:682:1: ( ( 'epochs' ) )
            // InternalAnn.g:683:1: ( 'epochs' )
            {
            // InternalAnn.g:683:1: ( 'epochs' )
            // InternalAnn.g:684:2: 'epochs'
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
    // InternalAnn.g:693:1: rule__ANNModel__Group__5 : rule__ANNModel__Group__5__Impl rule__ANNModel__Group__6 ;
    public final void rule__ANNModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:697:1: ( rule__ANNModel__Group__5__Impl rule__ANNModel__Group__6 )
            // InternalAnn.g:698:2: rule__ANNModel__Group__5__Impl rule__ANNModel__Group__6
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
    // InternalAnn.g:705:1: rule__ANNModel__Group__5__Impl : ( ( rule__ANNModel__EpochsAssignment_5 ) ) ;
    public final void rule__ANNModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:709:1: ( ( ( rule__ANNModel__EpochsAssignment_5 ) ) )
            // InternalAnn.g:710:1: ( ( rule__ANNModel__EpochsAssignment_5 ) )
            {
            // InternalAnn.g:710:1: ( ( rule__ANNModel__EpochsAssignment_5 ) )
            // InternalAnn.g:711:2: ( rule__ANNModel__EpochsAssignment_5 )
            {
             before(grammarAccess.getANNModelAccess().getEpochsAssignment_5()); 
            // InternalAnn.g:712:2: ( rule__ANNModel__EpochsAssignment_5 )
            // InternalAnn.g:712:3: rule__ANNModel__EpochsAssignment_5
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
    // InternalAnn.g:720:1: rule__ANNModel__Group__6 : rule__ANNModel__Group__6__Impl rule__ANNModel__Group__7 ;
    public final void rule__ANNModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:724:1: ( rule__ANNModel__Group__6__Impl rule__ANNModel__Group__7 )
            // InternalAnn.g:725:2: rule__ANNModel__Group__6__Impl rule__ANNModel__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalAnn.g:732:1: rule__ANNModel__Group__6__Impl : ( ( ( rule__ANNModel__LayerAssignment_6 ) ) ( ( rule__ANNModel__LayerAssignment_6 )* ) ) ;
    public final void rule__ANNModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:736:1: ( ( ( ( rule__ANNModel__LayerAssignment_6 ) ) ( ( rule__ANNModel__LayerAssignment_6 )* ) ) )
            // InternalAnn.g:737:1: ( ( ( rule__ANNModel__LayerAssignment_6 ) ) ( ( rule__ANNModel__LayerAssignment_6 )* ) )
            {
            // InternalAnn.g:737:1: ( ( ( rule__ANNModel__LayerAssignment_6 ) ) ( ( rule__ANNModel__LayerAssignment_6 )* ) )
            // InternalAnn.g:738:2: ( ( rule__ANNModel__LayerAssignment_6 ) ) ( ( rule__ANNModel__LayerAssignment_6 )* )
            {
            // InternalAnn.g:738:2: ( ( rule__ANNModel__LayerAssignment_6 ) )
            // InternalAnn.g:739:3: ( rule__ANNModel__LayerAssignment_6 )
            {
             before(grammarAccess.getANNModelAccess().getLayerAssignment_6()); 
            // InternalAnn.g:740:3: ( rule__ANNModel__LayerAssignment_6 )
            // InternalAnn.g:740:4: rule__ANNModel__LayerAssignment_6
            {
            pushFollow(FOLLOW_9);
            rule__ANNModel__LayerAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getANNModelAccess().getLayerAssignment_6()); 

            }

            // InternalAnn.g:743:2: ( ( rule__ANNModel__LayerAssignment_6 )* )
            // InternalAnn.g:744:3: ( rule__ANNModel__LayerAssignment_6 )*
            {
             before(grammarAccess.getANNModelAccess().getLayerAssignment_6()); 
            // InternalAnn.g:745:3: ( rule__ANNModel__LayerAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16||(LA4_0>=19 && LA4_0<=20)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAnn.g:745:4: rule__ANNModel__LayerAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ANNModel__LayerAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getANNModelAccess().getLayerAssignment_6()); 

            }


            }


            }

        }
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
    // InternalAnn.g:754:1: rule__ANNModel__Group__7 : rule__ANNModel__Group__7__Impl ;
    public final void rule__ANNModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:758:1: ( rule__ANNModel__Group__7__Impl )
            // InternalAnn.g:759:2: rule__ANNModel__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnn.g:765:1: rule__ANNModel__Group__7__Impl : ( '}' ) ;
    public final void rule__ANNModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:769:1: ( ( '}' ) )
            // InternalAnn.g:770:1: ( '}' )
            {
            // InternalAnn.g:770:1: ( '}' )
            // InternalAnn.g:771:2: '}'
            {
             before(grammarAccess.getANNModelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getANNModelAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__DECIMAL__Group__0"
    // InternalAnn.g:781:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:785:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalAnn.g:786:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
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
    // InternalAnn.g:793:1: rule__DECIMAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:797:1: ( ( RULE_INT ) )
            // InternalAnn.g:798:1: ( RULE_INT )
            {
            // InternalAnn.g:798:1: ( RULE_INT )
            // InternalAnn.g:799:2: RULE_INT
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
    // InternalAnn.g:808:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:812:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalAnn.g:813:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
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
    // InternalAnn.g:820:1: rule__DECIMAL__Group__1__Impl : ( '.' ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:824:1: ( ( '.' ) )
            // InternalAnn.g:825:1: ( '.' )
            {
            // InternalAnn.g:825:1: ( '.' )
            // InternalAnn.g:826:2: '.'
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
    // InternalAnn.g:835:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:839:1: ( rule__DECIMAL__Group__2__Impl )
            // InternalAnn.g:840:2: rule__DECIMAL__Group__2__Impl
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
    // InternalAnn.g:846:1: rule__DECIMAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:850:1: ( ( RULE_INT ) )
            // InternalAnn.g:851:1: ( RULE_INT )
            {
            // InternalAnn.g:851:1: ( RULE_INT )
            // InternalAnn.g:852:2: RULE_INT
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
    // InternalAnn.g:862:1: rule__Hidden__Group__0 : rule__Hidden__Group__0__Impl rule__Hidden__Group__1 ;
    public final void rule__Hidden__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:866:1: ( rule__Hidden__Group__0__Impl rule__Hidden__Group__1 )
            // InternalAnn.g:867:2: rule__Hidden__Group__0__Impl rule__Hidden__Group__1
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
    // InternalAnn.g:874:1: rule__Hidden__Group__0__Impl : ( 'hidden' ) ;
    public final void rule__Hidden__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:878:1: ( ( 'hidden' ) )
            // InternalAnn.g:879:1: ( 'hidden' )
            {
            // InternalAnn.g:879:1: ( 'hidden' )
            // InternalAnn.g:880:2: 'hidden'
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
    // InternalAnn.g:889:1: rule__Hidden__Group__1 : rule__Hidden__Group__1__Impl rule__Hidden__Group__2 ;
    public final void rule__Hidden__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:893:1: ( rule__Hidden__Group__1__Impl rule__Hidden__Group__2 )
            // InternalAnn.g:894:2: rule__Hidden__Group__1__Impl rule__Hidden__Group__2
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
    // InternalAnn.g:901:1: rule__Hidden__Group__1__Impl : ( '{' ) ;
    public final void rule__Hidden__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:905:1: ( ( '{' ) )
            // InternalAnn.g:906:1: ( '{' )
            {
            // InternalAnn.g:906:1: ( '{' )
            // InternalAnn.g:907:2: '{'
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
    // InternalAnn.g:916:1: rule__Hidden__Group__2 : rule__Hidden__Group__2__Impl rule__Hidden__Group__3 ;
    public final void rule__Hidden__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:920:1: ( rule__Hidden__Group__2__Impl rule__Hidden__Group__3 )
            // InternalAnn.g:921:2: rule__Hidden__Group__2__Impl rule__Hidden__Group__3
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
    // InternalAnn.g:928:1: rule__Hidden__Group__2__Impl : ( 'size' ) ;
    public final void rule__Hidden__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:932:1: ( ( 'size' ) )
            // InternalAnn.g:933:1: ( 'size' )
            {
            // InternalAnn.g:933:1: ( 'size' )
            // InternalAnn.g:934:2: 'size'
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
    // InternalAnn.g:943:1: rule__Hidden__Group__3 : rule__Hidden__Group__3__Impl rule__Hidden__Group__4 ;
    public final void rule__Hidden__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:947:1: ( rule__Hidden__Group__3__Impl rule__Hidden__Group__4 )
            // InternalAnn.g:948:2: rule__Hidden__Group__3__Impl rule__Hidden__Group__4
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
    // InternalAnn.g:955:1: rule__Hidden__Group__3__Impl : ( ( rule__Hidden__SizeAssignment_3 ) ) ;
    public final void rule__Hidden__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:959:1: ( ( ( rule__Hidden__SizeAssignment_3 ) ) )
            // InternalAnn.g:960:1: ( ( rule__Hidden__SizeAssignment_3 ) )
            {
            // InternalAnn.g:960:1: ( ( rule__Hidden__SizeAssignment_3 ) )
            // InternalAnn.g:961:2: ( rule__Hidden__SizeAssignment_3 )
            {
             before(grammarAccess.getHiddenAccess().getSizeAssignment_3()); 
            // InternalAnn.g:962:2: ( rule__Hidden__SizeAssignment_3 )
            // InternalAnn.g:962:3: rule__Hidden__SizeAssignment_3
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
    // InternalAnn.g:970:1: rule__Hidden__Group__4 : rule__Hidden__Group__4__Impl rule__Hidden__Group__5 ;
    public final void rule__Hidden__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:974:1: ( rule__Hidden__Group__4__Impl rule__Hidden__Group__5 )
            // InternalAnn.g:975:2: rule__Hidden__Group__4__Impl rule__Hidden__Group__5
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
    // InternalAnn.g:982:1: rule__Hidden__Group__4__Impl : ( 'learningRule' ) ;
    public final void rule__Hidden__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:986:1: ( ( 'learningRule' ) )
            // InternalAnn.g:987:1: ( 'learningRule' )
            {
            // InternalAnn.g:987:1: ( 'learningRule' )
            // InternalAnn.g:988:2: 'learningRule'
            {
             before(grammarAccess.getHiddenAccess().getLearningRuleKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getHiddenAccess().getLearningRuleKeyword_4()); 

            }


            }

        }
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
    // InternalAnn.g:997:1: rule__Hidden__Group__5 : rule__Hidden__Group__5__Impl rule__Hidden__Group__6 ;
    public final void rule__Hidden__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1001:1: ( rule__Hidden__Group__5__Impl rule__Hidden__Group__6 )
            // InternalAnn.g:1002:2: rule__Hidden__Group__5__Impl rule__Hidden__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalAnn.g:1009:1: rule__Hidden__Group__5__Impl : ( ( rule__Hidden__L_ruleAssignment_5 ) ) ;
    public final void rule__Hidden__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1013:1: ( ( ( rule__Hidden__L_ruleAssignment_5 ) ) )
            // InternalAnn.g:1014:1: ( ( rule__Hidden__L_ruleAssignment_5 ) )
            {
            // InternalAnn.g:1014:1: ( ( rule__Hidden__L_ruleAssignment_5 ) )
            // InternalAnn.g:1015:2: ( rule__Hidden__L_ruleAssignment_5 )
            {
             before(grammarAccess.getHiddenAccess().getL_ruleAssignment_5()); 
            // InternalAnn.g:1016:2: ( rule__Hidden__L_ruleAssignment_5 )
            // InternalAnn.g:1016:3: rule__Hidden__L_ruleAssignment_5
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
    // InternalAnn.g:1024:1: rule__Hidden__Group__6 : rule__Hidden__Group__6__Impl ;
    public final void rule__Hidden__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1028:1: ( rule__Hidden__Group__6__Impl )
            // InternalAnn.g:1029:2: rule__Hidden__Group__6__Impl
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
    // InternalAnn.g:1035:1: rule__Hidden__Group__6__Impl : ( '}' ) ;
    public final void rule__Hidden__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1039:1: ( ( '}' ) )
            // InternalAnn.g:1040:1: ( '}' )
            {
            // InternalAnn.g:1040:1: ( '}' )
            // InternalAnn.g:1041:2: '}'
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
    // InternalAnn.g:1051:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1055:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalAnn.g:1056:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalAnn.g:1063:1: rule__Input__Group__0__Impl : ( 'in' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1067:1: ( ( 'in' ) )
            // InternalAnn.g:1068:1: ( 'in' )
            {
            // InternalAnn.g:1068:1: ( 'in' )
            // InternalAnn.g:1069:2: 'in'
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
    // InternalAnn.g:1078:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1082:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalAnn.g:1083:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalAnn.g:1090:1: rule__Input__Group__1__Impl : ( '{' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1094:1: ( ( '{' ) )
            // InternalAnn.g:1095:1: ( '{' )
            {
            // InternalAnn.g:1095:1: ( '{' )
            // InternalAnn.g:1096:2: '{'
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
    // InternalAnn.g:1105:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1109:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalAnn.g:1110:2: rule__Input__Group__2__Impl rule__Input__Group__3
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
    // InternalAnn.g:1117:1: rule__Input__Group__2__Impl : ( 'size' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1121:1: ( ( 'size' ) )
            // InternalAnn.g:1122:1: ( 'size' )
            {
            // InternalAnn.g:1122:1: ( 'size' )
            // InternalAnn.g:1123:2: 'size'
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
    // InternalAnn.g:1132:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1136:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalAnn.g:1137:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalAnn.g:1144:1: rule__Input__Group__3__Impl : ( ( rule__Input__SizeAssignment_3 ) ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1148:1: ( ( ( rule__Input__SizeAssignment_3 ) ) )
            // InternalAnn.g:1149:1: ( ( rule__Input__SizeAssignment_3 ) )
            {
            // InternalAnn.g:1149:1: ( ( rule__Input__SizeAssignment_3 ) )
            // InternalAnn.g:1150:2: ( rule__Input__SizeAssignment_3 )
            {
             before(grammarAccess.getInputAccess().getSizeAssignment_3()); 
            // InternalAnn.g:1151:2: ( rule__Input__SizeAssignment_3 )
            // InternalAnn.g:1151:3: rule__Input__SizeAssignment_3
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
    // InternalAnn.g:1159:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1163:1: ( rule__Input__Group__4__Impl )
            // InternalAnn.g:1164:2: rule__Input__Group__4__Impl
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
    // InternalAnn.g:1170:1: rule__Input__Group__4__Impl : ( '}' ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1174:1: ( ( '}' ) )
            // InternalAnn.g:1175:1: ( '}' )
            {
            // InternalAnn.g:1175:1: ( '}' )
            // InternalAnn.g:1176:2: '}'
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
    // InternalAnn.g:1186:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1190:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalAnn.g:1191:2: rule__Output__Group__0__Impl rule__Output__Group__1
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
    // InternalAnn.g:1198:1: rule__Output__Group__0__Impl : ( 'out' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1202:1: ( ( 'out' ) )
            // InternalAnn.g:1203:1: ( 'out' )
            {
            // InternalAnn.g:1203:1: ( 'out' )
            // InternalAnn.g:1204:2: 'out'
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
    // InternalAnn.g:1213:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1217:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalAnn.g:1218:2: rule__Output__Group__1__Impl rule__Output__Group__2
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
    // InternalAnn.g:1225:1: rule__Output__Group__1__Impl : ( '{' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1229:1: ( ( '{' ) )
            // InternalAnn.g:1230:1: ( '{' )
            {
            // InternalAnn.g:1230:1: ( '{' )
            // InternalAnn.g:1231:2: '{'
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
    // InternalAnn.g:1240:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1244:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalAnn.g:1245:2: rule__Output__Group__2__Impl rule__Output__Group__3
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
    // InternalAnn.g:1252:1: rule__Output__Group__2__Impl : ( 'size' ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1256:1: ( ( 'size' ) )
            // InternalAnn.g:1257:1: ( 'size' )
            {
            // InternalAnn.g:1257:1: ( 'size' )
            // InternalAnn.g:1258:2: 'size'
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
    // InternalAnn.g:1267:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1271:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalAnn.g:1272:2: rule__Output__Group__3__Impl rule__Output__Group__4
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
    // InternalAnn.g:1279:1: rule__Output__Group__3__Impl : ( ( rule__Output__SizeAssignment_3 ) ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1283:1: ( ( ( rule__Output__SizeAssignment_3 ) ) )
            // InternalAnn.g:1284:1: ( ( rule__Output__SizeAssignment_3 ) )
            {
            // InternalAnn.g:1284:1: ( ( rule__Output__SizeAssignment_3 ) )
            // InternalAnn.g:1285:2: ( rule__Output__SizeAssignment_3 )
            {
             before(grammarAccess.getOutputAccess().getSizeAssignment_3()); 
            // InternalAnn.g:1286:2: ( rule__Output__SizeAssignment_3 )
            // InternalAnn.g:1286:3: rule__Output__SizeAssignment_3
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
    // InternalAnn.g:1294:1: rule__Output__Group__4 : rule__Output__Group__4__Impl rule__Output__Group__5 ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1298:1: ( rule__Output__Group__4__Impl rule__Output__Group__5 )
            // InternalAnn.g:1299:2: rule__Output__Group__4__Impl rule__Output__Group__5
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
    // InternalAnn.g:1306:1: rule__Output__Group__4__Impl : ( 'learningRule' ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1310:1: ( ( 'learningRule' ) )
            // InternalAnn.g:1311:1: ( 'learningRule' )
            {
            // InternalAnn.g:1311:1: ( 'learningRule' )
            // InternalAnn.g:1312:2: 'learningRule'
            {
             before(grammarAccess.getOutputAccess().getLearningRuleKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getLearningRuleKeyword_4()); 

            }


            }

        }
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
    // InternalAnn.g:1321:1: rule__Output__Group__5 : rule__Output__Group__5__Impl rule__Output__Group__6 ;
    public final void rule__Output__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1325:1: ( rule__Output__Group__5__Impl rule__Output__Group__6 )
            // InternalAnn.g:1326:2: rule__Output__Group__5__Impl rule__Output__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalAnn.g:1333:1: rule__Output__Group__5__Impl : ( ( rule__Output__L_ruleAssignment_5 ) ) ;
    public final void rule__Output__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1337:1: ( ( ( rule__Output__L_ruleAssignment_5 ) ) )
            // InternalAnn.g:1338:1: ( ( rule__Output__L_ruleAssignment_5 ) )
            {
            // InternalAnn.g:1338:1: ( ( rule__Output__L_ruleAssignment_5 ) )
            // InternalAnn.g:1339:2: ( rule__Output__L_ruleAssignment_5 )
            {
             before(grammarAccess.getOutputAccess().getL_ruleAssignment_5()); 
            // InternalAnn.g:1340:2: ( rule__Output__L_ruleAssignment_5 )
            // InternalAnn.g:1340:3: rule__Output__L_ruleAssignment_5
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
    // InternalAnn.g:1348:1: rule__Output__Group__6 : rule__Output__Group__6__Impl ;
    public final void rule__Output__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1352:1: ( rule__Output__Group__6__Impl )
            // InternalAnn.g:1353:2: rule__Output__Group__6__Impl
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
    // InternalAnn.g:1359:1: rule__Output__Group__6__Impl : ( '}' ) ;
    public final void rule__Output__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1363:1: ( ( '}' ) )
            // InternalAnn.g:1364:1: ( '}' )
            {
            // InternalAnn.g:1364:1: ( '}' )
            // InternalAnn.g:1365:2: '}'
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


    // $ANTLR start "rule__External__Group__0"
    // InternalAnn.g:1375:1: rule__External__Group__0 : rule__External__Group__0__Impl rule__External__Group__1 ;
    public final void rule__External__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1379:1: ( rule__External__Group__0__Impl rule__External__Group__1 )
            // InternalAnn.g:1380:2: rule__External__Group__0__Impl rule__External__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalAnn.g:1387:1: rule__External__Group__0__Impl : ( ( rule__External__NameAssignment_0 ) ) ;
    public final void rule__External__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1391:1: ( ( ( rule__External__NameAssignment_0 ) ) )
            // InternalAnn.g:1392:1: ( ( rule__External__NameAssignment_0 ) )
            {
            // InternalAnn.g:1392:1: ( ( rule__External__NameAssignment_0 ) )
            // InternalAnn.g:1393:2: ( rule__External__NameAssignment_0 )
            {
             before(grammarAccess.getExternalAccess().getNameAssignment_0()); 
            // InternalAnn.g:1394:2: ( rule__External__NameAssignment_0 )
            // InternalAnn.g:1394:3: rule__External__NameAssignment_0
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
    // InternalAnn.g:1402:1: rule__External__Group__1 : rule__External__Group__1__Impl ;
    public final void rule__External__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1406:1: ( rule__External__Group__1__Impl )
            // InternalAnn.g:1407:2: rule__External__Group__1__Impl
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
    // InternalAnn.g:1413:1: rule__External__Group__1__Impl : ( 'external' ) ;
    public final void rule__External__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1417:1: ( ( 'external' ) )
            // InternalAnn.g:1418:1: ( 'external' )
            {
            // InternalAnn.g:1418:1: ( 'external' )
            // InternalAnn.g:1419:2: 'external'
            {
             before(grammarAccess.getExternalAccess().getExternalKeyword_1()); 
            match(input,21,FOLLOW_2); 
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


    // $ANTLR start "rule__Custom__Group__0"
    // InternalAnn.g:1429:1: rule__Custom__Group__0 : rule__Custom__Group__0__Impl rule__Custom__Group__1 ;
    public final void rule__Custom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1433:1: ( rule__Custom__Group__0__Impl rule__Custom__Group__1 )
            // InternalAnn.g:1434:2: rule__Custom__Group__0__Impl rule__Custom__Group__1
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
    // InternalAnn.g:1441:1: rule__Custom__Group__0__Impl : ( ( rule__Custom__NameAssignment_0 ) ) ;
    public final void rule__Custom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1445:1: ( ( ( rule__Custom__NameAssignment_0 ) ) )
            // InternalAnn.g:1446:1: ( ( rule__Custom__NameAssignment_0 ) )
            {
            // InternalAnn.g:1446:1: ( ( rule__Custom__NameAssignment_0 ) )
            // InternalAnn.g:1447:2: ( rule__Custom__NameAssignment_0 )
            {
             before(grammarAccess.getCustomAccess().getNameAssignment_0()); 
            // InternalAnn.g:1448:2: ( rule__Custom__NameAssignment_0 )
            // InternalAnn.g:1448:3: rule__Custom__NameAssignment_0
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
    // InternalAnn.g:1456:1: rule__Custom__Group__1 : rule__Custom__Group__1__Impl rule__Custom__Group__2 ;
    public final void rule__Custom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1460:1: ( rule__Custom__Group__1__Impl rule__Custom__Group__2 )
            // InternalAnn.g:1461:2: rule__Custom__Group__1__Impl rule__Custom__Group__2
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
    // InternalAnn.g:1468:1: rule__Custom__Group__1__Impl : ( '(x)' ) ;
    public final void rule__Custom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1472:1: ( ( '(x)' ) )
            // InternalAnn.g:1473:1: ( '(x)' )
            {
            // InternalAnn.g:1473:1: ( '(x)' )
            // InternalAnn.g:1474:2: '(x)'
            {
             before(grammarAccess.getCustomAccess().getXKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAnn.g:1483:1: rule__Custom__Group__2 : rule__Custom__Group__2__Impl rule__Custom__Group__3 ;
    public final void rule__Custom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1487:1: ( rule__Custom__Group__2__Impl rule__Custom__Group__3 )
            // InternalAnn.g:1488:2: rule__Custom__Group__2__Impl rule__Custom__Group__3
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
    // InternalAnn.g:1495:1: rule__Custom__Group__2__Impl : ( '{' ) ;
    public final void rule__Custom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1499:1: ( ( '{' ) )
            // InternalAnn.g:1500:1: ( '{' )
            {
            // InternalAnn.g:1500:1: ( '{' )
            // InternalAnn.g:1501:2: '{'
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
    // InternalAnn.g:1510:1: rule__Custom__Group__3 : rule__Custom__Group__3__Impl rule__Custom__Group__4 ;
    public final void rule__Custom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1514:1: ( rule__Custom__Group__3__Impl rule__Custom__Group__4 )
            // InternalAnn.g:1515:2: rule__Custom__Group__3__Impl rule__Custom__Group__4
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
    // InternalAnn.g:1522:1: rule__Custom__Group__3__Impl : ( 'function' ) ;
    public final void rule__Custom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1526:1: ( ( 'function' ) )
            // InternalAnn.g:1527:1: ( 'function' )
            {
            // InternalAnn.g:1527:1: ( 'function' )
            // InternalAnn.g:1528:2: 'function'
            {
             before(grammarAccess.getCustomAccess().getFunctionKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAnn.g:1537:1: rule__Custom__Group__4 : rule__Custom__Group__4__Impl rule__Custom__Group__5 ;
    public final void rule__Custom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1541:1: ( rule__Custom__Group__4__Impl rule__Custom__Group__5 )
            // InternalAnn.g:1542:2: rule__Custom__Group__4__Impl rule__Custom__Group__5
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
    // InternalAnn.g:1549:1: rule__Custom__Group__4__Impl : ( '=' ) ;
    public final void rule__Custom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1553:1: ( ( '=' ) )
            // InternalAnn.g:1554:1: ( '=' )
            {
            // InternalAnn.g:1554:1: ( '=' )
            // InternalAnn.g:1555:2: '='
            {
             before(grammarAccess.getCustomAccess().getEqualsSignKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAnn.g:1564:1: rule__Custom__Group__5 : rule__Custom__Group__5__Impl rule__Custom__Group__6 ;
    public final void rule__Custom__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1568:1: ( rule__Custom__Group__5__Impl rule__Custom__Group__6 )
            // InternalAnn.g:1569:2: rule__Custom__Group__5__Impl rule__Custom__Group__6
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
    // InternalAnn.g:1576:1: rule__Custom__Group__5__Impl : ( ( rule__Custom__ExpAssignment_5 ) ) ;
    public final void rule__Custom__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1580:1: ( ( ( rule__Custom__ExpAssignment_5 ) ) )
            // InternalAnn.g:1581:1: ( ( rule__Custom__ExpAssignment_5 ) )
            {
            // InternalAnn.g:1581:1: ( ( rule__Custom__ExpAssignment_5 ) )
            // InternalAnn.g:1582:2: ( rule__Custom__ExpAssignment_5 )
            {
             before(grammarAccess.getCustomAccess().getExpAssignment_5()); 
            // InternalAnn.g:1583:2: ( rule__Custom__ExpAssignment_5 )
            // InternalAnn.g:1583:3: rule__Custom__ExpAssignment_5
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
    // InternalAnn.g:1591:1: rule__Custom__Group__6 : rule__Custom__Group__6__Impl rule__Custom__Group__7 ;
    public final void rule__Custom__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1595:1: ( rule__Custom__Group__6__Impl rule__Custom__Group__7 )
            // InternalAnn.g:1596:2: rule__Custom__Group__6__Impl rule__Custom__Group__7
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
    // InternalAnn.g:1603:1: rule__Custom__Group__6__Impl : ( 'derivative' ) ;
    public final void rule__Custom__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1607:1: ( ( 'derivative' ) )
            // InternalAnn.g:1608:1: ( 'derivative' )
            {
            // InternalAnn.g:1608:1: ( 'derivative' )
            // InternalAnn.g:1609:2: 'derivative'
            {
             before(grammarAccess.getCustomAccess().getDerivativeKeyword_6()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAnn.g:1618:1: rule__Custom__Group__7 : rule__Custom__Group__7__Impl rule__Custom__Group__8 ;
    public final void rule__Custom__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1622:1: ( rule__Custom__Group__7__Impl rule__Custom__Group__8 )
            // InternalAnn.g:1623:2: rule__Custom__Group__7__Impl rule__Custom__Group__8
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
    // InternalAnn.g:1630:1: rule__Custom__Group__7__Impl : ( '=' ) ;
    public final void rule__Custom__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1634:1: ( ( '=' ) )
            // InternalAnn.g:1635:1: ( '=' )
            {
            // InternalAnn.g:1635:1: ( '=' )
            // InternalAnn.g:1636:2: '='
            {
             before(grammarAccess.getCustomAccess().getEqualsSignKeyword_7()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAnn.g:1645:1: rule__Custom__Group__8 : rule__Custom__Group__8__Impl rule__Custom__Group__9 ;
    public final void rule__Custom__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1649:1: ( rule__Custom__Group__8__Impl rule__Custom__Group__9 )
            // InternalAnn.g:1650:2: rule__Custom__Group__8__Impl rule__Custom__Group__9
            {
            pushFollow(FOLLOW_8);
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
    // InternalAnn.g:1657:1: rule__Custom__Group__8__Impl : ( ( rule__Custom__DerAssignment_8 ) ) ;
    public final void rule__Custom__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1661:1: ( ( ( rule__Custom__DerAssignment_8 ) ) )
            // InternalAnn.g:1662:1: ( ( rule__Custom__DerAssignment_8 ) )
            {
            // InternalAnn.g:1662:1: ( ( rule__Custom__DerAssignment_8 ) )
            // InternalAnn.g:1663:2: ( rule__Custom__DerAssignment_8 )
            {
             before(grammarAccess.getCustomAccess().getDerAssignment_8()); 
            // InternalAnn.g:1664:2: ( rule__Custom__DerAssignment_8 )
            // InternalAnn.g:1664:3: rule__Custom__DerAssignment_8
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
    // InternalAnn.g:1672:1: rule__Custom__Group__9 : rule__Custom__Group__9__Impl ;
    public final void rule__Custom__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1676:1: ( rule__Custom__Group__9__Impl )
            // InternalAnn.g:1677:2: rule__Custom__Group__9__Impl
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
    // InternalAnn.g:1683:1: rule__Custom__Group__9__Impl : ( '}' ) ;
    public final void rule__Custom__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1687:1: ( ( '}' ) )
            // InternalAnn.g:1688:1: ( '}' )
            {
            // InternalAnn.g:1688:1: ( '}' )
            // InternalAnn.g:1689:2: '}'
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


    // $ANTLR start "rule__Expression__Group__0"
    // InternalAnn.g:1699:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1703:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalAnn.g:1704:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalAnn.g:1711:1: rule__Expression__Group__0__Impl : ( ruleSubstraction ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1715:1: ( ( ruleSubstraction ) )
            // InternalAnn.g:1716:1: ( ruleSubstraction )
            {
            // InternalAnn.g:1716:1: ( ruleSubstraction )
            // InternalAnn.g:1717:2: ruleSubstraction
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
    // InternalAnn.g:1726:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1730:1: ( rule__Expression__Group__1__Impl )
            // InternalAnn.g:1731:2: rule__Expression__Group__1__Impl
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
    // InternalAnn.g:1737:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1741:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalAnn.g:1742:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalAnn.g:1742:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalAnn.g:1743:2: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalAnn.g:1744:2: ( rule__Expression__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAnn.g:1744:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalAnn.g:1753:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1757:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalAnn.g:1758:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalAnn.g:1765:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1769:1: ( ( () ) )
            // InternalAnn.g:1770:1: ( () )
            {
            // InternalAnn.g:1770:1: ( () )
            // InternalAnn.g:1771:2: ()
            {
             before(grammarAccess.getExpressionAccess().getAddLeftAction_1_0()); 
            // InternalAnn.g:1772:2: ()
            // InternalAnn.g:1772:3: 
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
    // InternalAnn.g:1780:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1784:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalAnn.g:1785:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
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
    // InternalAnn.g:1792:1: rule__Expression__Group_1__1__Impl : ( '+' ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1796:1: ( ( '+' ) )
            // InternalAnn.g:1797:1: ( '+' )
            {
            // InternalAnn.g:1797:1: ( '+' )
            // InternalAnn.g:1798:2: '+'
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
    // InternalAnn.g:1807:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1811:1: ( rule__Expression__Group_1__2__Impl )
            // InternalAnn.g:1812:2: rule__Expression__Group_1__2__Impl
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
    // InternalAnn.g:1818:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1822:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // InternalAnn.g:1823:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // InternalAnn.g:1823:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // InternalAnn.g:1824:2: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // InternalAnn.g:1825:2: ( rule__Expression__RightAssignment_1_2 )
            // InternalAnn.g:1825:3: rule__Expression__RightAssignment_1_2
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
    // InternalAnn.g:1834:1: rule__Substraction__Group__0 : rule__Substraction__Group__0__Impl rule__Substraction__Group__1 ;
    public final void rule__Substraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1838:1: ( rule__Substraction__Group__0__Impl rule__Substraction__Group__1 )
            // InternalAnn.g:1839:2: rule__Substraction__Group__0__Impl rule__Substraction__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAnn.g:1846:1: rule__Substraction__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Substraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1850:1: ( ( ruleMultiplication ) )
            // InternalAnn.g:1851:1: ( ruleMultiplication )
            {
            // InternalAnn.g:1851:1: ( ruleMultiplication )
            // InternalAnn.g:1852:2: ruleMultiplication
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
    // InternalAnn.g:1861:1: rule__Substraction__Group__1 : rule__Substraction__Group__1__Impl ;
    public final void rule__Substraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1865:1: ( rule__Substraction__Group__1__Impl )
            // InternalAnn.g:1866:2: rule__Substraction__Group__1__Impl
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
    // InternalAnn.g:1872:1: rule__Substraction__Group__1__Impl : ( ( rule__Substraction__Group_1__0 )* ) ;
    public final void rule__Substraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1876:1: ( ( ( rule__Substraction__Group_1__0 )* ) )
            // InternalAnn.g:1877:1: ( ( rule__Substraction__Group_1__0 )* )
            {
            // InternalAnn.g:1877:1: ( ( rule__Substraction__Group_1__0 )* )
            // InternalAnn.g:1878:2: ( rule__Substraction__Group_1__0 )*
            {
             before(grammarAccess.getSubstractionAccess().getGroup_1()); 
            // InternalAnn.g:1879:2: ( rule__Substraction__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAnn.g:1879:3: rule__Substraction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Substraction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalAnn.g:1888:1: rule__Substraction__Group_1__0 : rule__Substraction__Group_1__0__Impl rule__Substraction__Group_1__1 ;
    public final void rule__Substraction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1892:1: ( rule__Substraction__Group_1__0__Impl rule__Substraction__Group_1__1 )
            // InternalAnn.g:1893:2: rule__Substraction__Group_1__0__Impl rule__Substraction__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAnn.g:1900:1: rule__Substraction__Group_1__0__Impl : ( () ) ;
    public final void rule__Substraction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1904:1: ( ( () ) )
            // InternalAnn.g:1905:1: ( () )
            {
            // InternalAnn.g:1905:1: ( () )
            // InternalAnn.g:1906:2: ()
            {
             before(grammarAccess.getSubstractionAccess().getSubLeftAction_1_0()); 
            // InternalAnn.g:1907:2: ()
            // InternalAnn.g:1907:3: 
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
    // InternalAnn.g:1915:1: rule__Substraction__Group_1__1 : rule__Substraction__Group_1__1__Impl rule__Substraction__Group_1__2 ;
    public final void rule__Substraction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1919:1: ( rule__Substraction__Group_1__1__Impl rule__Substraction__Group_1__2 )
            // InternalAnn.g:1920:2: rule__Substraction__Group_1__1__Impl rule__Substraction__Group_1__2
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
    // InternalAnn.g:1927:1: rule__Substraction__Group_1__1__Impl : ( '-' ) ;
    public final void rule__Substraction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1931:1: ( ( '-' ) )
            // InternalAnn.g:1932:1: ( '-' )
            {
            // InternalAnn.g:1932:1: ( '-' )
            // InternalAnn.g:1933:2: '-'
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
    // InternalAnn.g:1942:1: rule__Substraction__Group_1__2 : rule__Substraction__Group_1__2__Impl ;
    public final void rule__Substraction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1946:1: ( rule__Substraction__Group_1__2__Impl )
            // InternalAnn.g:1947:2: rule__Substraction__Group_1__2__Impl
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
    // InternalAnn.g:1953:1: rule__Substraction__Group_1__2__Impl : ( ( rule__Substraction__RightAssignment_1_2 ) ) ;
    public final void rule__Substraction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1957:1: ( ( ( rule__Substraction__RightAssignment_1_2 ) ) )
            // InternalAnn.g:1958:1: ( ( rule__Substraction__RightAssignment_1_2 ) )
            {
            // InternalAnn.g:1958:1: ( ( rule__Substraction__RightAssignment_1_2 ) )
            // InternalAnn.g:1959:2: ( rule__Substraction__RightAssignment_1_2 )
            {
             before(grammarAccess.getSubstractionAccess().getRightAssignment_1_2()); 
            // InternalAnn.g:1960:2: ( rule__Substraction__RightAssignment_1_2 )
            // InternalAnn.g:1960:3: rule__Substraction__RightAssignment_1_2
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
    // InternalAnn.g:1969:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1973:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalAnn.g:1974:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalAnn.g:1981:1: rule__Multiplication__Group__0__Impl : ( ruleDivision ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1985:1: ( ( ruleDivision ) )
            // InternalAnn.g:1986:1: ( ruleDivision )
            {
            // InternalAnn.g:1986:1: ( ruleDivision )
            // InternalAnn.g:1987:2: ruleDivision
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
    // InternalAnn.g:1996:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2000:1: ( rule__Multiplication__Group__1__Impl )
            // InternalAnn.g:2001:2: rule__Multiplication__Group__1__Impl
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
    // InternalAnn.g:2007:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2011:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalAnn.g:2012:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalAnn.g:2012:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalAnn.g:2013:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalAnn.g:2014:2: ( rule__Multiplication__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAnn.g:2014:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalAnn.g:2023:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2027:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalAnn.g:2028:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalAnn.g:2035:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2039:1: ( ( () ) )
            // InternalAnn.g:2040:1: ( () )
            {
            // InternalAnn.g:2040:1: ( () )
            // InternalAnn.g:2041:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0()); 
            // InternalAnn.g:2042:2: ()
            // InternalAnn.g:2042:3: 
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
    // InternalAnn.g:2050:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2054:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalAnn.g:2055:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
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
    // InternalAnn.g:2062:1: rule__Multiplication__Group_1__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2066:1: ( ( '*' ) )
            // InternalAnn.g:2067:1: ( '*' )
            {
            // InternalAnn.g:2067:1: ( '*' )
            // InternalAnn.g:2068:2: '*'
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
    // InternalAnn.g:2077:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2081:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalAnn.g:2082:2: rule__Multiplication__Group_1__2__Impl
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
    // InternalAnn.g:2088:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2092:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalAnn.g:2093:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalAnn.g:2093:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalAnn.g:2094:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalAnn.g:2095:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalAnn.g:2095:3: rule__Multiplication__RightAssignment_1_2
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
    // InternalAnn.g:2104:1: rule__Division__Group__0 : rule__Division__Group__0__Impl rule__Division__Group__1 ;
    public final void rule__Division__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2108:1: ( rule__Division__Group__0__Impl rule__Division__Group__1 )
            // InternalAnn.g:2109:2: rule__Division__Group__0__Impl rule__Division__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalAnn.g:2116:1: rule__Division__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Division__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2120:1: ( ( rulePrimary ) )
            // InternalAnn.g:2121:1: ( rulePrimary )
            {
            // InternalAnn.g:2121:1: ( rulePrimary )
            // InternalAnn.g:2122:2: rulePrimary
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
    // InternalAnn.g:2131:1: rule__Division__Group__1 : rule__Division__Group__1__Impl ;
    public final void rule__Division__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2135:1: ( rule__Division__Group__1__Impl )
            // InternalAnn.g:2136:2: rule__Division__Group__1__Impl
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
    // InternalAnn.g:2142:1: rule__Division__Group__1__Impl : ( ( rule__Division__Group_1__0 )* ) ;
    public final void rule__Division__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2146:1: ( ( ( rule__Division__Group_1__0 )* ) )
            // InternalAnn.g:2147:1: ( ( rule__Division__Group_1__0 )* )
            {
            // InternalAnn.g:2147:1: ( ( rule__Division__Group_1__0 )* )
            // InternalAnn.g:2148:2: ( rule__Division__Group_1__0 )*
            {
             before(grammarAccess.getDivisionAccess().getGroup_1()); 
            // InternalAnn.g:2149:2: ( rule__Division__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAnn.g:2149:3: rule__Division__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Division__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalAnn.g:2158:1: rule__Division__Group_1__0 : rule__Division__Group_1__0__Impl rule__Division__Group_1__1 ;
    public final void rule__Division__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2162:1: ( rule__Division__Group_1__0__Impl rule__Division__Group_1__1 )
            // InternalAnn.g:2163:2: rule__Division__Group_1__0__Impl rule__Division__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalAnn.g:2170:1: rule__Division__Group_1__0__Impl : ( () ) ;
    public final void rule__Division__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2174:1: ( ( () ) )
            // InternalAnn.g:2175:1: ( () )
            {
            // InternalAnn.g:2175:1: ( () )
            // InternalAnn.g:2176:2: ()
            {
             before(grammarAccess.getDivisionAccess().getDivLeftAction_1_0()); 
            // InternalAnn.g:2177:2: ()
            // InternalAnn.g:2177:3: 
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
    // InternalAnn.g:2185:1: rule__Division__Group_1__1 : rule__Division__Group_1__1__Impl rule__Division__Group_1__2 ;
    public final void rule__Division__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2189:1: ( rule__Division__Group_1__1__Impl rule__Division__Group_1__2 )
            // InternalAnn.g:2190:2: rule__Division__Group_1__1__Impl rule__Division__Group_1__2
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
    // InternalAnn.g:2197:1: rule__Division__Group_1__1__Impl : ( '/' ) ;
    public final void rule__Division__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2201:1: ( ( '/' ) )
            // InternalAnn.g:2202:1: ( '/' )
            {
            // InternalAnn.g:2202:1: ( '/' )
            // InternalAnn.g:2203:2: '/'
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
    // InternalAnn.g:2212:1: rule__Division__Group_1__2 : rule__Division__Group_1__2__Impl ;
    public final void rule__Division__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2216:1: ( rule__Division__Group_1__2__Impl )
            // InternalAnn.g:2217:2: rule__Division__Group_1__2__Impl
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
    // InternalAnn.g:2223:1: rule__Division__Group_1__2__Impl : ( ( rule__Division__RightAssignment_1_2 ) ) ;
    public final void rule__Division__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2227:1: ( ( ( rule__Division__RightAssignment_1_2 ) ) )
            // InternalAnn.g:2228:1: ( ( rule__Division__RightAssignment_1_2 ) )
            {
            // InternalAnn.g:2228:1: ( ( rule__Division__RightAssignment_1_2 ) )
            // InternalAnn.g:2229:2: ( rule__Division__RightAssignment_1_2 )
            {
             before(grammarAccess.getDivisionAccess().getRightAssignment_1_2()); 
            // InternalAnn.g:2230:2: ( rule__Division__RightAssignment_1_2 )
            // InternalAnn.g:2230:3: rule__Division__RightAssignment_1_2
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
    // InternalAnn.g:2239:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2243:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalAnn.g:2244:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
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
    // InternalAnn.g:2251:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2255:1: ( ( '(' ) )
            // InternalAnn.g:2256:1: ( '(' )
            {
            // InternalAnn.g:2256:1: ( '(' )
            // InternalAnn.g:2257:2: '('
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
    // InternalAnn.g:2266:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2270:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalAnn.g:2271:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalAnn.g:2278:1: rule__Primary__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2282:1: ( ( ruleExpression ) )
            // InternalAnn.g:2283:1: ( ruleExpression )
            {
            // InternalAnn.g:2283:1: ( ruleExpression )
            // InternalAnn.g:2284:2: ruleExpression
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
    // InternalAnn.g:2293:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2297:1: ( rule__Primary__Group_2__2__Impl )
            // InternalAnn.g:2298:2: rule__Primary__Group_2__2__Impl
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
    // InternalAnn.g:2304:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2308:1: ( ( ')' ) )
            // InternalAnn.g:2309:1: ( ')' )
            {
            // InternalAnn.g:2309:1: ( ')' )
            // InternalAnn.g:2310:2: ')'
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
    // InternalAnn.g:2320:1: rule__ANNModel__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ANNModel__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2324:1: ( ( RULE_ID ) )
            // InternalAnn.g:2325:2: ( RULE_ID )
            {
            // InternalAnn.g:2325:2: ( RULE_ID )
            // InternalAnn.g:2326:3: RULE_ID
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
    // InternalAnn.g:2335:1: rule__ANNModel__AlphaAssignment_3 : ( ruleDECIMAL ) ;
    public final void rule__ANNModel__AlphaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2339:1: ( ( ruleDECIMAL ) )
            // InternalAnn.g:2340:2: ( ruleDECIMAL )
            {
            // InternalAnn.g:2340:2: ( ruleDECIMAL )
            // InternalAnn.g:2341:3: ruleDECIMAL
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
    // InternalAnn.g:2350:1: rule__ANNModel__EpochsAssignment_5 : ( RULE_INT ) ;
    public final void rule__ANNModel__EpochsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2354:1: ( ( RULE_INT ) )
            // InternalAnn.g:2355:2: ( RULE_INT )
            {
            // InternalAnn.g:2355:2: ( RULE_INT )
            // InternalAnn.g:2356:3: RULE_INT
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


    // $ANTLR start "rule__ANNModel__LayerAssignment_6"
    // InternalAnn.g:2365:1: rule__ANNModel__LayerAssignment_6 : ( ruleLayer ) ;
    public final void rule__ANNModel__LayerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2369:1: ( ( ruleLayer ) )
            // InternalAnn.g:2370:2: ( ruleLayer )
            {
            // InternalAnn.g:2370:2: ( ruleLayer )
            // InternalAnn.g:2371:3: ruleLayer
            {
             before(grammarAccess.getANNModelAccess().getLayerLayerParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getANNModelAccess().getLayerLayerParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__LayerAssignment_6"


    // $ANTLR start "rule__Hidden__SizeAssignment_3"
    // InternalAnn.g:2380:1: rule__Hidden__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__Hidden__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2384:1: ( ( RULE_INT ) )
            // InternalAnn.g:2385:2: ( RULE_INT )
            {
            // InternalAnn.g:2385:2: ( RULE_INT )
            // InternalAnn.g:2386:3: RULE_INT
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
    // InternalAnn.g:2395:1: rule__Hidden__L_ruleAssignment_5 : ( ruleLearningRule ) ;
    public final void rule__Hidden__L_ruleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2399:1: ( ( ruleLearningRule ) )
            // InternalAnn.g:2400:2: ( ruleLearningRule )
            {
            // InternalAnn.g:2400:2: ( ruleLearningRule )
            // InternalAnn.g:2401:3: ruleLearningRule
            {
             before(grammarAccess.getHiddenAccess().getL_ruleLearningRuleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLearningRule();

            state._fsp--;

             after(grammarAccess.getHiddenAccess().getL_ruleLearningRuleParserRuleCall_5_0()); 

            }


            }

        }
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
    // InternalAnn.g:2410:1: rule__Input__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__Input__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2414:1: ( ( RULE_INT ) )
            // InternalAnn.g:2415:2: ( RULE_INT )
            {
            // InternalAnn.g:2415:2: ( RULE_INT )
            // InternalAnn.g:2416:3: RULE_INT
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
    // InternalAnn.g:2425:1: rule__Output__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__Output__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2429:1: ( ( RULE_INT ) )
            // InternalAnn.g:2430:2: ( RULE_INT )
            {
            // InternalAnn.g:2430:2: ( RULE_INT )
            // InternalAnn.g:2431:3: RULE_INT
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
    // InternalAnn.g:2440:1: rule__Output__L_ruleAssignment_5 : ( ruleLearningRule ) ;
    public final void rule__Output__L_ruleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2444:1: ( ( ruleLearningRule ) )
            // InternalAnn.g:2445:2: ( ruleLearningRule )
            {
            // InternalAnn.g:2445:2: ( ruleLearningRule )
            // InternalAnn.g:2446:3: ruleLearningRule
            {
             before(grammarAccess.getOutputAccess().getL_ruleLearningRuleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLearningRule();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getL_ruleLearningRuleParserRuleCall_5_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Sigmoid__RuleAssignment"
    // InternalAnn.g:2455:1: rule__Sigmoid__RuleAssignment : ( ( 'sigmoid' ) ) ;
    public final void rule__Sigmoid__RuleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2459:1: ( ( ( 'sigmoid' ) ) )
            // InternalAnn.g:2460:2: ( ( 'sigmoid' ) )
            {
            // InternalAnn.g:2460:2: ( ( 'sigmoid' ) )
            // InternalAnn.g:2461:3: ( 'sigmoid' )
            {
             before(grammarAccess.getSigmoidAccess().getRuleSigmoidKeyword_0()); 
            // InternalAnn.g:2462:3: ( 'sigmoid' )
            // InternalAnn.g:2463:4: 'sigmoid'
            {
             before(grammarAccess.getSigmoidAccess().getRuleSigmoidKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSigmoidAccess().getRuleSigmoidKeyword_0()); 

            }

             after(grammarAccess.getSigmoidAccess().getRuleSigmoidKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sigmoid__RuleAssignment"


    // $ANTLR start "rule__External__NameAssignment_0"
    // InternalAnn.g:2474:1: rule__External__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__External__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2478:1: ( ( RULE_ID ) )
            // InternalAnn.g:2479:2: ( RULE_ID )
            {
            // InternalAnn.g:2479:2: ( RULE_ID )
            // InternalAnn.g:2480:3: RULE_ID
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


    // $ANTLR start "rule__Custom__NameAssignment_0"
    // InternalAnn.g:2489:1: rule__Custom__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Custom__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2493:1: ( ( RULE_ID ) )
            // InternalAnn.g:2494:2: ( RULE_ID )
            {
            // InternalAnn.g:2494:2: ( RULE_ID )
            // InternalAnn.g:2495:3: RULE_ID
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
    // InternalAnn.g:2504:1: rule__Custom__ExpAssignment_5 : ( ruleExpression ) ;
    public final void rule__Custom__ExpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2508:1: ( ( ruleExpression ) )
            // InternalAnn.g:2509:2: ( ruleExpression )
            {
            // InternalAnn.g:2509:2: ( ruleExpression )
            // InternalAnn.g:2510:3: ruleExpression
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
    // InternalAnn.g:2519:1: rule__Custom__DerAssignment_8 : ( ruleExpression ) ;
    public final void rule__Custom__DerAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2523:1: ( ( ruleExpression ) )
            // InternalAnn.g:2524:2: ( ruleExpression )
            {
            // InternalAnn.g:2524:2: ( ruleExpression )
            // InternalAnn.g:2525:3: ruleExpression
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


    // $ANTLR start "rule__Expression__RightAssignment_1_2"
    // InternalAnn.g:2534:1: rule__Expression__RightAssignment_1_2 : ( ruleSubstraction ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2538:1: ( ( ruleSubstraction ) )
            // InternalAnn.g:2539:2: ( ruleSubstraction )
            {
            // InternalAnn.g:2539:2: ( ruleSubstraction )
            // InternalAnn.g:2540:3: ruleSubstraction
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
    // InternalAnn.g:2549:1: rule__Substraction__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Substraction__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2553:1: ( ( ruleMultiplication ) )
            // InternalAnn.g:2554:2: ( ruleMultiplication )
            {
            // InternalAnn.g:2554:2: ( ruleMultiplication )
            // InternalAnn.g:2555:3: ruleMultiplication
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
    // InternalAnn.g:2564:1: rule__Multiplication__RightAssignment_1_2 : ( ruleDivision ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2568:1: ( ( ruleDivision ) )
            // InternalAnn.g:2569:2: ( ruleDivision )
            {
            // InternalAnn.g:2569:2: ( ruleDivision )
            // InternalAnn.g:2570:3: ruleDivision
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
    // InternalAnn.g:2579:1: rule__Division__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Division__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2583:1: ( ( rulePrimary ) )
            // InternalAnn.g:2584:2: ( rulePrimary )
            {
            // InternalAnn.g:2584:2: ( rulePrimary )
            // InternalAnn.g:2585:3: rulePrimary
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
    // InternalAnn.g:2594:1: rule__Letter__ValueAssignment : ( ( 'x' ) ) ;
    public final void rule__Letter__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2598:1: ( ( ( 'x' ) ) )
            // InternalAnn.g:2599:2: ( ( 'x' ) )
            {
            // InternalAnn.g:2599:2: ( ( 'x' ) )
            // InternalAnn.g:2600:3: ( 'x' )
            {
             before(grammarAccess.getLetterAccess().getValueXKeyword_0()); 
            // InternalAnn.g:2601:3: ( 'x' )
            // InternalAnn.g:2602:4: 'x'
            {
             before(grammarAccess.getLetterAccess().getValueXKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAnn.g:2613:1: rule__NumberLiteral__ValueAssignment : ( ruleDECIMAL ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2617:1: ( ( ruleDECIMAL ) )
            // InternalAnn.g:2618:2: ( ruleDECIMAL )
            {
            // InternalAnn.g:2618:2: ( ruleDECIMAL )
            // InternalAnn.g:2619:3: ruleDECIMAL
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000190000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000190002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000240000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});

}