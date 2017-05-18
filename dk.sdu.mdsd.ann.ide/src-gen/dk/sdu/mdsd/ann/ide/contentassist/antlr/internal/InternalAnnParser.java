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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'{'", "'alpha'", "'epochs'", "'}'", "'.'", "'hidden'", "'size'", "'activation'", "'in'", "'source'", "'constraints'", "','", "'constraint'", "'('", "')'", "'out'", "'external'", "'(x)'", "'function'", "'='", "'derivative'", "'e('", "'nlog('", "'sin('", "'cos('", "'sqrt('", "'pow('", "'sigmoid'", "'tansig'", "'x'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=6;
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


    // $ANTLR start "entryRuleRestriction"
    // InternalAnn.g:178:1: entryRuleRestriction : ruleRestriction EOF ;
    public final void entryRuleRestriction() throws RecognitionException {
        try {
            // InternalAnn.g:179:1: ( ruleRestriction EOF )
            // InternalAnn.g:180:1: ruleRestriction EOF
            {
             before(grammarAccess.getRestrictionRule()); 
            pushFollow(FOLLOW_1);
            ruleRestriction();

            state._fsp--;

             after(grammarAccess.getRestrictionRule()); 
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
    // $ANTLR end "entryRuleRestriction"


    // $ANTLR start "ruleRestriction"
    // InternalAnn.g:187:1: ruleRestriction : ( ( rule__Restriction__Group__0 ) ) ;
    public final void ruleRestriction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:191:2: ( ( ( rule__Restriction__Group__0 ) ) )
            // InternalAnn.g:192:2: ( ( rule__Restriction__Group__0 ) )
            {
            // InternalAnn.g:192:2: ( ( rule__Restriction__Group__0 ) )
            // InternalAnn.g:193:3: ( rule__Restriction__Group__0 )
            {
             before(grammarAccess.getRestrictionAccess().getGroup()); 
            // InternalAnn.g:194:3: ( rule__Restriction__Group__0 )
            // InternalAnn.g:194:4: rule__Restriction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Restriction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestriction"


    // $ANTLR start "entryRuleConstraint"
    // InternalAnn.g:203:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalAnn.g:204:1: ( ruleConstraint EOF )
            // InternalAnn.g:205:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalAnn.g:212:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:216:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalAnn.g:217:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalAnn.g:217:2: ( ( rule__Constraint__Group__0 ) )
            // InternalAnn.g:218:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalAnn.g:219:3: ( rule__Constraint__Group__0 )
            // InternalAnn.g:219:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleField"
    // InternalAnn.g:228:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalAnn.g:229:1: ( ruleField EOF )
            // InternalAnn.g:230:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalAnn.g:237:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:241:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalAnn.g:242:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalAnn.g:242:2: ( ( rule__Field__Group__0 ) )
            // InternalAnn.g:243:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalAnn.g:244:3: ( rule__Field__Group__0 )
            // InternalAnn.g:244:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleCondition"
    // InternalAnn.g:253:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalAnn.g:254:1: ( ruleCondition EOF )
            // InternalAnn.g:255:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalAnn.g:262:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:266:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalAnn.g:267:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalAnn.g:267:2: ( ( rule__Condition__Group__0 ) )
            // InternalAnn.g:268:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalAnn.g:269:3: ( rule__Condition__Group__0 )
            // InternalAnn.g:269:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConditionalOperator"
    // InternalAnn.g:278:1: entryRuleConditionalOperator : ruleConditionalOperator EOF ;
    public final void entryRuleConditionalOperator() throws RecognitionException {
        try {
            // InternalAnn.g:279:1: ( ruleConditionalOperator EOF )
            // InternalAnn.g:280:1: ruleConditionalOperator EOF
            {
             before(grammarAccess.getConditionalOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalOperator();

            state._fsp--;

             after(grammarAccess.getConditionalOperatorRule()); 
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
    // $ANTLR end "entryRuleConditionalOperator"


    // $ANTLR start "ruleConditionalOperator"
    // InternalAnn.g:287:1: ruleConditionalOperator : ( ( rule__ConditionalOperator__Alternatives ) ) ;
    public final void ruleConditionalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:291:2: ( ( ( rule__ConditionalOperator__Alternatives ) ) )
            // InternalAnn.g:292:2: ( ( rule__ConditionalOperator__Alternatives ) )
            {
            // InternalAnn.g:292:2: ( ( rule__ConditionalOperator__Alternatives ) )
            // InternalAnn.g:293:3: ( rule__ConditionalOperator__Alternatives )
            {
             before(grammarAccess.getConditionalOperatorAccess().getAlternatives()); 
            // InternalAnn.g:294:3: ( rule__ConditionalOperator__Alternatives )
            // InternalAnn.g:294:4: rule__ConditionalOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionalOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalOperator"


    // $ANTLR start "entryRuleOutput"
    // InternalAnn.g:303:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalAnn.g:304:1: ( ruleOutput EOF )
            // InternalAnn.g:305:1: ruleOutput EOF
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
    // InternalAnn.g:312:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:316:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalAnn.g:317:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalAnn.g:317:2: ( ( rule__Output__Group__0 ) )
            // InternalAnn.g:318:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalAnn.g:319:3: ( rule__Output__Group__0 )
            // InternalAnn.g:319:4: rule__Output__Group__0
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
    // InternalAnn.g:328:1: entryRuleActivation : ruleActivation EOF ;
    public final void entryRuleActivation() throws RecognitionException {
        try {
            // InternalAnn.g:329:1: ( ruleActivation EOF )
            // InternalAnn.g:330:1: ruleActivation EOF
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
    // InternalAnn.g:337:1: ruleActivation : ( ( rule__Activation__Alternatives ) ) ;
    public final void ruleActivation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:341:2: ( ( ( rule__Activation__Alternatives ) ) )
            // InternalAnn.g:342:2: ( ( rule__Activation__Alternatives ) )
            {
            // InternalAnn.g:342:2: ( ( rule__Activation__Alternatives ) )
            // InternalAnn.g:343:3: ( rule__Activation__Alternatives )
            {
             before(grammarAccess.getActivationAccess().getAlternatives()); 
            // InternalAnn.g:344:3: ( rule__Activation__Alternatives )
            // InternalAnn.g:344:4: rule__Activation__Alternatives
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
    // InternalAnn.g:353:1: entryRuleExternal : ruleExternal EOF ;
    public final void entryRuleExternal() throws RecognitionException {
        try {
            // InternalAnn.g:354:1: ( ruleExternal EOF )
            // InternalAnn.g:355:1: ruleExternal EOF
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
    // InternalAnn.g:362:1: ruleExternal : ( ( rule__External__Group__0 ) ) ;
    public final void ruleExternal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:366:2: ( ( ( rule__External__Group__0 ) ) )
            // InternalAnn.g:367:2: ( ( rule__External__Group__0 ) )
            {
            // InternalAnn.g:367:2: ( ( rule__External__Group__0 ) )
            // InternalAnn.g:368:3: ( rule__External__Group__0 )
            {
             before(grammarAccess.getExternalAccess().getGroup()); 
            // InternalAnn.g:369:3: ( rule__External__Group__0 )
            // InternalAnn.g:369:4: rule__External__Group__0
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
    // InternalAnn.g:378:1: entryRuleSigmoid : ruleSigmoid EOF ;
    public final void entryRuleSigmoid() throws RecognitionException {
        try {
            // InternalAnn.g:379:1: ( ruleSigmoid EOF )
            // InternalAnn.g:380:1: ruleSigmoid EOF
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
    // InternalAnn.g:387:1: ruleSigmoid : ( ( rule__Sigmoid__Group__0 ) ) ;
    public final void ruleSigmoid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:391:2: ( ( ( rule__Sigmoid__Group__0 ) ) )
            // InternalAnn.g:392:2: ( ( rule__Sigmoid__Group__0 ) )
            {
            // InternalAnn.g:392:2: ( ( rule__Sigmoid__Group__0 ) )
            // InternalAnn.g:393:3: ( rule__Sigmoid__Group__0 )
            {
             before(grammarAccess.getSigmoidAccess().getGroup()); 
            // InternalAnn.g:394:3: ( rule__Sigmoid__Group__0 )
            // InternalAnn.g:394:4: rule__Sigmoid__Group__0
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
    // InternalAnn.g:403:1: entryRuleTansig : ruleTansig EOF ;
    public final void entryRuleTansig() throws RecognitionException {
        try {
            // InternalAnn.g:404:1: ( ruleTansig EOF )
            // InternalAnn.g:405:1: ruleTansig EOF
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
    // InternalAnn.g:412:1: ruleTansig : ( ( rule__Tansig__Group__0 ) ) ;
    public final void ruleTansig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:416:2: ( ( ( rule__Tansig__Group__0 ) ) )
            // InternalAnn.g:417:2: ( ( rule__Tansig__Group__0 ) )
            {
            // InternalAnn.g:417:2: ( ( rule__Tansig__Group__0 ) )
            // InternalAnn.g:418:3: ( rule__Tansig__Group__0 )
            {
             before(grammarAccess.getTansigAccess().getGroup()); 
            // InternalAnn.g:419:3: ( rule__Tansig__Group__0 )
            // InternalAnn.g:419:4: rule__Tansig__Group__0
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
    // InternalAnn.g:428:1: entryRuleCustom : ruleCustom EOF ;
    public final void entryRuleCustom() throws RecognitionException {
        try {
            // InternalAnn.g:429:1: ( ruleCustom EOF )
            // InternalAnn.g:430:1: ruleCustom EOF
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
    // InternalAnn.g:437:1: ruleCustom : ( ( rule__Custom__Group__0 ) ) ;
    public final void ruleCustom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:441:2: ( ( ( rule__Custom__Group__0 ) ) )
            // InternalAnn.g:442:2: ( ( rule__Custom__Group__0 ) )
            {
            // InternalAnn.g:442:2: ( ( rule__Custom__Group__0 ) )
            // InternalAnn.g:443:3: ( rule__Custom__Group__0 )
            {
             before(grammarAccess.getCustomAccess().getGroup()); 
            // InternalAnn.g:444:3: ( rule__Custom__Group__0 )
            // InternalAnn.g:444:4: rule__Custom__Group__0
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
    // InternalAnn.g:453:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalAnn.g:454:1: ( ruleExpression EOF )
            // InternalAnn.g:455:1: ruleExpression EOF
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
    // InternalAnn.g:462:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:466:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalAnn.g:467:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalAnn.g:467:2: ( ( rule__Expression__Group__0 ) )
            // InternalAnn.g:468:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalAnn.g:469:3: ( rule__Expression__Group__0 )
            // InternalAnn.g:469:4: rule__Expression__Group__0
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
    // InternalAnn.g:478:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalAnn.g:479:1: ( ruleFactor EOF )
            // InternalAnn.g:480:1: ruleFactor EOF
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
    // InternalAnn.g:487:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:491:2: ( ( ( rule__Factor__Group__0 ) ) )
            // InternalAnn.g:492:2: ( ( rule__Factor__Group__0 ) )
            {
            // InternalAnn.g:492:2: ( ( rule__Factor__Group__0 ) )
            // InternalAnn.g:493:3: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // InternalAnn.g:494:3: ( rule__Factor__Group__0 )
            // InternalAnn.g:494:4: rule__Factor__Group__0
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
    // InternalAnn.g:503:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalAnn.g:504:1: ( rulePrimary EOF )
            // InternalAnn.g:505:1: rulePrimary EOF
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
    // InternalAnn.g:512:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:516:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalAnn.g:517:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalAnn.g:517:2: ( ( rule__Primary__Alternatives ) )
            // InternalAnn.g:518:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalAnn.g:519:3: ( rule__Primary__Alternatives )
            // InternalAnn.g:519:4: rule__Primary__Alternatives
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
    // InternalAnn.g:528:1: entryRuleMath : ruleMath EOF ;
    public final void entryRuleMath() throws RecognitionException {
        try {
            // InternalAnn.g:529:1: ( ruleMath EOF )
            // InternalAnn.g:530:1: ruleMath EOF
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
    // InternalAnn.g:537:1: ruleMath : ( ( rule__Math__Alternatives ) ) ;
    public final void ruleMath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:541:2: ( ( ( rule__Math__Alternatives ) ) )
            // InternalAnn.g:542:2: ( ( rule__Math__Alternatives ) )
            {
            // InternalAnn.g:542:2: ( ( rule__Math__Alternatives ) )
            // InternalAnn.g:543:3: ( rule__Math__Alternatives )
            {
             before(grammarAccess.getMathAccess().getAlternatives()); 
            // InternalAnn.g:544:3: ( rule__Math__Alternatives )
            // InternalAnn.g:544:4: rule__Math__Alternatives
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
    // InternalAnn.g:553:1: entryRuleEuler : ruleEuler EOF ;
    public final void entryRuleEuler() throws RecognitionException {
        try {
            // InternalAnn.g:554:1: ( ruleEuler EOF )
            // InternalAnn.g:555:1: ruleEuler EOF
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
    // InternalAnn.g:562:1: ruleEuler : ( ( rule__Euler__Group__0 ) ) ;
    public final void ruleEuler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:566:2: ( ( ( rule__Euler__Group__0 ) ) )
            // InternalAnn.g:567:2: ( ( rule__Euler__Group__0 ) )
            {
            // InternalAnn.g:567:2: ( ( rule__Euler__Group__0 ) )
            // InternalAnn.g:568:3: ( rule__Euler__Group__0 )
            {
             before(grammarAccess.getEulerAccess().getGroup()); 
            // InternalAnn.g:569:3: ( rule__Euler__Group__0 )
            // InternalAnn.g:569:4: rule__Euler__Group__0
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
    // InternalAnn.g:578:1: entryRuleNLog : ruleNLog EOF ;
    public final void entryRuleNLog() throws RecognitionException {
        try {
            // InternalAnn.g:579:1: ( ruleNLog EOF )
            // InternalAnn.g:580:1: ruleNLog EOF
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
    // InternalAnn.g:587:1: ruleNLog : ( ( rule__NLog__Group__0 ) ) ;
    public final void ruleNLog() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:591:2: ( ( ( rule__NLog__Group__0 ) ) )
            // InternalAnn.g:592:2: ( ( rule__NLog__Group__0 ) )
            {
            // InternalAnn.g:592:2: ( ( rule__NLog__Group__0 ) )
            // InternalAnn.g:593:3: ( rule__NLog__Group__0 )
            {
             before(grammarAccess.getNLogAccess().getGroup()); 
            // InternalAnn.g:594:3: ( rule__NLog__Group__0 )
            // InternalAnn.g:594:4: rule__NLog__Group__0
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
    // InternalAnn.g:603:1: entryRuleSin : ruleSin EOF ;
    public final void entryRuleSin() throws RecognitionException {
        try {
            // InternalAnn.g:604:1: ( ruleSin EOF )
            // InternalAnn.g:605:1: ruleSin EOF
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
    // InternalAnn.g:612:1: ruleSin : ( ( rule__Sin__Group__0 ) ) ;
    public final void ruleSin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:616:2: ( ( ( rule__Sin__Group__0 ) ) )
            // InternalAnn.g:617:2: ( ( rule__Sin__Group__0 ) )
            {
            // InternalAnn.g:617:2: ( ( rule__Sin__Group__0 ) )
            // InternalAnn.g:618:3: ( rule__Sin__Group__0 )
            {
             before(grammarAccess.getSinAccess().getGroup()); 
            // InternalAnn.g:619:3: ( rule__Sin__Group__0 )
            // InternalAnn.g:619:4: rule__Sin__Group__0
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
    // InternalAnn.g:628:1: entryRuleCos : ruleCos EOF ;
    public final void entryRuleCos() throws RecognitionException {
        try {
            // InternalAnn.g:629:1: ( ruleCos EOF )
            // InternalAnn.g:630:1: ruleCos EOF
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
    // InternalAnn.g:637:1: ruleCos : ( ( rule__Cos__Group__0 ) ) ;
    public final void ruleCos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:641:2: ( ( ( rule__Cos__Group__0 ) ) )
            // InternalAnn.g:642:2: ( ( rule__Cos__Group__0 ) )
            {
            // InternalAnn.g:642:2: ( ( rule__Cos__Group__0 ) )
            // InternalAnn.g:643:3: ( rule__Cos__Group__0 )
            {
             before(grammarAccess.getCosAccess().getGroup()); 
            // InternalAnn.g:644:3: ( rule__Cos__Group__0 )
            // InternalAnn.g:644:4: rule__Cos__Group__0
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
    // InternalAnn.g:653:1: entryRuleSqrt : ruleSqrt EOF ;
    public final void entryRuleSqrt() throws RecognitionException {
        try {
            // InternalAnn.g:654:1: ( ruleSqrt EOF )
            // InternalAnn.g:655:1: ruleSqrt EOF
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
    // InternalAnn.g:662:1: ruleSqrt : ( ( rule__Sqrt__Group__0 ) ) ;
    public final void ruleSqrt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:666:2: ( ( ( rule__Sqrt__Group__0 ) ) )
            // InternalAnn.g:667:2: ( ( rule__Sqrt__Group__0 ) )
            {
            // InternalAnn.g:667:2: ( ( rule__Sqrt__Group__0 ) )
            // InternalAnn.g:668:3: ( rule__Sqrt__Group__0 )
            {
             before(grammarAccess.getSqrtAccess().getGroup()); 
            // InternalAnn.g:669:3: ( rule__Sqrt__Group__0 )
            // InternalAnn.g:669:4: rule__Sqrt__Group__0
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
    // InternalAnn.g:678:1: entryRulePower : rulePower EOF ;
    public final void entryRulePower() throws RecognitionException {
        try {
            // InternalAnn.g:679:1: ( rulePower EOF )
            // InternalAnn.g:680:1: rulePower EOF
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
    // InternalAnn.g:687:1: rulePower : ( ( rule__Power__Group__0 ) ) ;
    public final void rulePower() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:691:2: ( ( ( rule__Power__Group__0 ) ) )
            // InternalAnn.g:692:2: ( ( rule__Power__Group__0 ) )
            {
            // InternalAnn.g:692:2: ( ( rule__Power__Group__0 ) )
            // InternalAnn.g:693:3: ( rule__Power__Group__0 )
            {
             before(grammarAccess.getPowerAccess().getGroup()); 
            // InternalAnn.g:694:3: ( rule__Power__Group__0 )
            // InternalAnn.g:694:4: rule__Power__Group__0
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
    // InternalAnn.g:703:1: entryRuleLetter : ruleLetter EOF ;
    public final void entryRuleLetter() throws RecognitionException {
        try {
            // InternalAnn.g:704:1: ( ruleLetter EOF )
            // InternalAnn.g:705:1: ruleLetter EOF
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
    // InternalAnn.g:712:1: ruleLetter : ( ( rule__Letter__Group__0 ) ) ;
    public final void ruleLetter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:716:2: ( ( ( rule__Letter__Group__0 ) ) )
            // InternalAnn.g:717:2: ( ( rule__Letter__Group__0 ) )
            {
            // InternalAnn.g:717:2: ( ( rule__Letter__Group__0 ) )
            // InternalAnn.g:718:3: ( rule__Letter__Group__0 )
            {
             before(grammarAccess.getLetterAccess().getGroup()); 
            // InternalAnn.g:719:3: ( rule__Letter__Group__0 )
            // InternalAnn.g:719:4: rule__Letter__Group__0
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
    // InternalAnn.g:728:1: entryRulePartOperator : rulePartOperator EOF ;
    public final void entryRulePartOperator() throws RecognitionException {
        try {
            // InternalAnn.g:729:1: ( rulePartOperator EOF )
            // InternalAnn.g:730:1: rulePartOperator EOF
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
    // InternalAnn.g:737:1: rulePartOperator : ( ( rule__PartOperator__Alternatives ) ) ;
    public final void rulePartOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:741:2: ( ( ( rule__PartOperator__Alternatives ) ) )
            // InternalAnn.g:742:2: ( ( rule__PartOperator__Alternatives ) )
            {
            // InternalAnn.g:742:2: ( ( rule__PartOperator__Alternatives ) )
            // InternalAnn.g:743:3: ( rule__PartOperator__Alternatives )
            {
             before(grammarAccess.getPartOperatorAccess().getAlternatives()); 
            // InternalAnn.g:744:3: ( rule__PartOperator__Alternatives )
            // InternalAnn.g:744:4: rule__PartOperator__Alternatives
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
    // InternalAnn.g:753:1: entryRuleFactorOperator : ruleFactorOperator EOF ;
    public final void entryRuleFactorOperator() throws RecognitionException {
        try {
            // InternalAnn.g:754:1: ( ruleFactorOperator EOF )
            // InternalAnn.g:755:1: ruleFactorOperator EOF
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
    // InternalAnn.g:762:1: ruleFactorOperator : ( ( rule__FactorOperator__Alternatives ) ) ;
    public final void ruleFactorOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:766:2: ( ( ( rule__FactorOperator__Alternatives ) ) )
            // InternalAnn.g:767:2: ( ( rule__FactorOperator__Alternatives ) )
            {
            // InternalAnn.g:767:2: ( ( rule__FactorOperator__Alternatives ) )
            // InternalAnn.g:768:3: ( rule__FactorOperator__Alternatives )
            {
             before(grammarAccess.getFactorOperatorAccess().getAlternatives()); 
            // InternalAnn.g:769:3: ( rule__FactorOperator__Alternatives )
            // InternalAnn.g:769:4: rule__FactorOperator__Alternatives
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
    // InternalAnn.g:778:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalAnn.g:779:1: ( ruleNumberLiteral EOF )
            // InternalAnn.g:780:1: ruleNumberLiteral EOF
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
    // InternalAnn.g:787:1: ruleNumberLiteral : ( ( rule__NumberLiteral__Group__0 ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:791:2: ( ( ( rule__NumberLiteral__Group__0 ) ) )
            // InternalAnn.g:792:2: ( ( rule__NumberLiteral__Group__0 ) )
            {
            // InternalAnn.g:792:2: ( ( rule__NumberLiteral__Group__0 ) )
            // InternalAnn.g:793:3: ( rule__NumberLiteral__Group__0 )
            {
             before(grammarAccess.getNumberLiteralAccess().getGroup()); 
            // InternalAnn.g:794:3: ( rule__NumberLiteral__Group__0 )
            // InternalAnn.g:794:4: rule__NumberLiteral__Group__0
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


    // $ANTLR start "entryRuleNumberTypes"
    // InternalAnn.g:803:1: entryRuleNumberTypes : ruleNumberTypes EOF ;
    public final void entryRuleNumberTypes() throws RecognitionException {
        try {
            // InternalAnn.g:804:1: ( ruleNumberTypes EOF )
            // InternalAnn.g:805:1: ruleNumberTypes EOF
            {
             before(grammarAccess.getNumberTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberTypes();

            state._fsp--;

             after(grammarAccess.getNumberTypesRule()); 
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
    // $ANTLR end "entryRuleNumberTypes"


    // $ANTLR start "ruleNumberTypes"
    // InternalAnn.g:812:1: ruleNumberTypes : ( ( rule__NumberTypes__Alternatives ) ) ;
    public final void ruleNumberTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:816:2: ( ( ( rule__NumberTypes__Alternatives ) ) )
            // InternalAnn.g:817:2: ( ( rule__NumberTypes__Alternatives ) )
            {
            // InternalAnn.g:817:2: ( ( rule__NumberTypes__Alternatives ) )
            // InternalAnn.g:818:3: ( rule__NumberTypes__Alternatives )
            {
             before(grammarAccess.getNumberTypesAccess().getAlternatives()); 
            // InternalAnn.g:819:3: ( rule__NumberTypes__Alternatives )
            // InternalAnn.g:819:4: rule__NumberTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumberTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberTypes"


    // $ANTLR start "rule__Layer__Alternatives"
    // InternalAnn.g:827:1: rule__Layer__Alternatives : ( ( ruleHidden ) | ( ruleInput ) | ( ruleOutput ) );
    public final void rule__Layer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:831:1: ( ( ruleHidden ) | ( ruleInput ) | ( ruleOutput ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt1=1;
                }
                break;
            case 28:
                {
                alt1=2;
                }
                break;
            case 35:
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
                    // InternalAnn.g:832:2: ( ruleHidden )
                    {
                    // InternalAnn.g:832:2: ( ruleHidden )
                    // InternalAnn.g:833:3: ruleHidden
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
                    // InternalAnn.g:838:2: ( ruleInput )
                    {
                    // InternalAnn.g:838:2: ( ruleInput )
                    // InternalAnn.g:839:3: ruleInput
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
                    // InternalAnn.g:844:2: ( ruleOutput )
                    {
                    // InternalAnn.g:844:2: ( ruleOutput )
                    // InternalAnn.g:845:3: ruleOutput
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


    // $ANTLR start "rule__ConditionalOperator__Alternatives"
    // InternalAnn.g:854:1: rule__ConditionalOperator__Alternatives : ( ( '==' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__ConditionalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:858:1: ( ( '==' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAnn.g:859:2: ( '==' )
                    {
                    // InternalAnn.g:859:2: ( '==' )
                    // InternalAnn.g:860:3: '=='
                    {
                     before(grammarAccess.getConditionalOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getConditionalOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:865:2: ( '<' )
                    {
                    // InternalAnn.g:865:2: ( '<' )
                    // InternalAnn.g:866:3: '<'
                    {
                     before(grammarAccess.getConditionalOperatorAccess().getLessThanSignKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getConditionalOperatorAccess().getLessThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAnn.g:871:2: ( '>' )
                    {
                    // InternalAnn.g:871:2: ( '>' )
                    // InternalAnn.g:872:3: '>'
                    {
                     before(grammarAccess.getConditionalOperatorAccess().getGreaterThanSignKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getConditionalOperatorAccess().getGreaterThanSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAnn.g:877:2: ( '<=' )
                    {
                    // InternalAnn.g:877:2: ( '<=' )
                    // InternalAnn.g:878:3: '<='
                    {
                     before(grammarAccess.getConditionalOperatorAccess().getLessThanSignEqualsSignKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getConditionalOperatorAccess().getLessThanSignEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAnn.g:883:2: ( '>=' )
                    {
                    // InternalAnn.g:883:2: ( '>=' )
                    // InternalAnn.g:884:3: '>='
                    {
                     before(grammarAccess.getConditionalOperatorAccess().getGreaterThanSignEqualsSignKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getConditionalOperatorAccess().getGreaterThanSignEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__ConditionalOperator__Alternatives"


    // $ANTLR start "rule__Activation__Alternatives"
    // InternalAnn.g:893:1: rule__Activation__Alternatives : ( ( ruleSigmoid ) | ( ruleTansig ) | ( ruleExternal ) | ( ruleCustom ) );
    public final void rule__Activation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:897:1: ( ( ruleSigmoid ) | ( ruleTansig ) | ( ruleExternal ) | ( ruleCustom ) )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 47:
                    {
                    alt3=1;
                    }
                    break;
                case 37:
                    {
                    alt3=4;
                    }
                    break;
                case 48:
                    {
                    alt3=2;
                    }
                    break;
                case 36:
                    {
                    alt3=3;
                    }
                    break;
                default:
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
                    // InternalAnn.g:898:2: ( ruleSigmoid )
                    {
                    // InternalAnn.g:898:2: ( ruleSigmoid )
                    // InternalAnn.g:899:3: ruleSigmoid
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
                    // InternalAnn.g:904:2: ( ruleTansig )
                    {
                    // InternalAnn.g:904:2: ( ruleTansig )
                    // InternalAnn.g:905:3: ruleTansig
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
                    // InternalAnn.g:910:2: ( ruleExternal )
                    {
                    // InternalAnn.g:910:2: ( ruleExternal )
                    // InternalAnn.g:911:3: ruleExternal
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
                    // InternalAnn.g:916:2: ( ruleCustom )
                    {
                    // InternalAnn.g:916:2: ( ruleCustom )
                    // InternalAnn.g:917:3: ruleCustom
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
    // InternalAnn.g:926:1: rule__Primary__Alternatives : ( ( ruleNumberLiteral ) | ( ruleLetter ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleMath ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:930:1: ( ( ruleNumberLiteral ) | ( ruleLetter ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleMath ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_INT) ) {
                    alt4=1;
                }
                else if ( (LA4_1==49) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==49) ) {
                    alt4=2;
                }
                else if ( (LA4_2==RULE_INT) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case 49:
                {
                alt4=2;
                }
                break;
            case 33:
                {
                alt4=3;
                }
                break;
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
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
                    // InternalAnn.g:931:2: ( ruleNumberLiteral )
                    {
                    // InternalAnn.g:931:2: ( ruleNumberLiteral )
                    // InternalAnn.g:932:3: ruleNumberLiteral
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
                    // InternalAnn.g:937:2: ( ruleLetter )
                    {
                    // InternalAnn.g:937:2: ( ruleLetter )
                    // InternalAnn.g:938:3: ruleLetter
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
                    // InternalAnn.g:943:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalAnn.g:943:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalAnn.g:944:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalAnn.g:945:3: ( rule__Primary__Group_2__0 )
                    // InternalAnn.g:945:4: rule__Primary__Group_2__0
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
                    // InternalAnn.g:949:2: ( ruleMath )
                    {
                    // InternalAnn.g:949:2: ( ruleMath )
                    // InternalAnn.g:950:3: ruleMath
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
    // InternalAnn.g:959:1: rule__Math__Alternatives : ( ( ruleEuler ) | ( ruleNLog ) | ( ruleSin ) | ( ruleCos ) | ( ruleSqrt ) | ( rulePower ) );
    public final void rule__Math__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:963:1: ( ( ruleEuler ) | ( ruleNLog ) | ( ruleSin ) | ( ruleCos ) | ( ruleSqrt ) | ( rulePower ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt5=1;
                }
                break;
            case 42:
                {
                alt5=2;
                }
                break;
            case 43:
                {
                alt5=3;
                }
                break;
            case 44:
                {
                alt5=4;
                }
                break;
            case 45:
                {
                alt5=5;
                }
                break;
            case 46:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalAnn.g:964:2: ( ruleEuler )
                    {
                    // InternalAnn.g:964:2: ( ruleEuler )
                    // InternalAnn.g:965:3: ruleEuler
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
                    // InternalAnn.g:970:2: ( ruleNLog )
                    {
                    // InternalAnn.g:970:2: ( ruleNLog )
                    // InternalAnn.g:971:3: ruleNLog
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
                    // InternalAnn.g:976:2: ( ruleSin )
                    {
                    // InternalAnn.g:976:2: ( ruleSin )
                    // InternalAnn.g:977:3: ruleSin
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
                    // InternalAnn.g:982:2: ( ruleCos )
                    {
                    // InternalAnn.g:982:2: ( ruleCos )
                    // InternalAnn.g:983:3: ruleCos
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
                    // InternalAnn.g:988:2: ( ruleSqrt )
                    {
                    // InternalAnn.g:988:2: ( ruleSqrt )
                    // InternalAnn.g:989:3: ruleSqrt
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
                    // InternalAnn.g:994:2: ( rulePower )
                    {
                    // InternalAnn.g:994:2: ( rulePower )
                    // InternalAnn.g:995:3: rulePower
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
    // InternalAnn.g:1004:1: rule__PartOperator__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__PartOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1008:1: ( ( '+' ) | ( '-' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAnn.g:1009:2: ( '+' )
                    {
                    // InternalAnn.g:1009:2: ( '+' )
                    // InternalAnn.g:1010:3: '+'
                    {
                     before(grammarAccess.getPartOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getPartOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:1015:2: ( '-' )
                    {
                    // InternalAnn.g:1015:2: ( '-' )
                    // InternalAnn.g:1016:3: '-'
                    {
                     before(grammarAccess.getPartOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalAnn.g:1025:1: rule__FactorOperator__Alternatives : ( ( '*' ) | ( '/' ) );
    public final void rule__FactorOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1029:1: ( ( '*' ) | ( '/' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAnn.g:1030:2: ( '*' )
                    {
                    // InternalAnn.g:1030:2: ( '*' )
                    // InternalAnn.g:1031:3: '*'
                    {
                     before(grammarAccess.getFactorOperatorAccess().getAsteriskKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getFactorOperatorAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:1036:2: ( '/' )
                    {
                    // InternalAnn.g:1036:2: ( '/' )
                    // InternalAnn.g:1037:3: '/'
                    {
                     before(grammarAccess.getFactorOperatorAccess().getSolidusKeyword_1()); 
                    match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__NumberTypes__Alternatives"
    // InternalAnn.g:1046:1: rule__NumberTypes__Alternatives : ( ( ruleDECIMAL ) | ( RULE_INT ) );
    public final void rule__NumberTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1050:1: ( ( ruleDECIMAL ) | ( RULE_INT ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==24) ) {
                    alt8=1;
                }
                else if ( (LA8_1==EOF||(LA8_1>=16 && LA8_1<=19)||LA8_1==23||LA8_1==31||LA8_1==34||LA8_1==40) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAnn.g:1051:2: ( ruleDECIMAL )
                    {
                    // InternalAnn.g:1051:2: ( ruleDECIMAL )
                    // InternalAnn.g:1052:3: ruleDECIMAL
                    {
                     before(grammarAccess.getNumberTypesAccess().getDECIMALParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDECIMAL();

                    state._fsp--;

                     after(grammarAccess.getNumberTypesAccess().getDECIMALParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnn.g:1057:2: ( RULE_INT )
                    {
                    // InternalAnn.g:1057:2: ( RULE_INT )
                    // InternalAnn.g:1058:3: RULE_INT
                    {
                     before(grammarAccess.getNumberTypesAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getNumberTypesAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__NumberTypes__Alternatives"


    // $ANTLR start "rule__ANNModel__Group__0"
    // InternalAnn.g:1067:1: rule__ANNModel__Group__0 : rule__ANNModel__Group__0__Impl rule__ANNModel__Group__1 ;
    public final void rule__ANNModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1071:1: ( rule__ANNModel__Group__0__Impl rule__ANNModel__Group__1 )
            // InternalAnn.g:1072:2: rule__ANNModel__Group__0__Impl rule__ANNModel__Group__1
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
    // InternalAnn.g:1079:1: rule__ANNModel__Group__0__Impl : ( ( rule__ANNModel__NameAssignment_0 ) ) ;
    public final void rule__ANNModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1083:1: ( ( ( rule__ANNModel__NameAssignment_0 ) ) )
            // InternalAnn.g:1084:1: ( ( rule__ANNModel__NameAssignment_0 ) )
            {
            // InternalAnn.g:1084:1: ( ( rule__ANNModel__NameAssignment_0 ) )
            // InternalAnn.g:1085:2: ( rule__ANNModel__NameAssignment_0 )
            {
             before(grammarAccess.getANNModelAccess().getNameAssignment_0()); 
            // InternalAnn.g:1086:2: ( rule__ANNModel__NameAssignment_0 )
            // InternalAnn.g:1086:3: rule__ANNModel__NameAssignment_0
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
    // InternalAnn.g:1094:1: rule__ANNModel__Group__1 : rule__ANNModel__Group__1__Impl rule__ANNModel__Group__2 ;
    public final void rule__ANNModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1098:1: ( rule__ANNModel__Group__1__Impl rule__ANNModel__Group__2 )
            // InternalAnn.g:1099:2: rule__ANNModel__Group__1__Impl rule__ANNModel__Group__2
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
    // InternalAnn.g:1106:1: rule__ANNModel__Group__1__Impl : ( '{' ) ;
    public final void rule__ANNModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1110:1: ( ( '{' ) )
            // InternalAnn.g:1111:1: ( '{' )
            {
            // InternalAnn.g:1111:1: ( '{' )
            // InternalAnn.g:1112:2: '{'
            {
             before(grammarAccess.getANNModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalAnn.g:1121:1: rule__ANNModel__Group__2 : rule__ANNModel__Group__2__Impl rule__ANNModel__Group__3 ;
    public final void rule__ANNModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1125:1: ( rule__ANNModel__Group__2__Impl rule__ANNModel__Group__3 )
            // InternalAnn.g:1126:2: rule__ANNModel__Group__2__Impl rule__ANNModel__Group__3
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
    // InternalAnn.g:1133:1: rule__ANNModel__Group__2__Impl : ( 'alpha' ) ;
    public final void rule__ANNModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1137:1: ( ( 'alpha' ) )
            // InternalAnn.g:1138:1: ( 'alpha' )
            {
            // InternalAnn.g:1138:1: ( 'alpha' )
            // InternalAnn.g:1139:2: 'alpha'
            {
             before(grammarAccess.getANNModelAccess().getAlphaKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalAnn.g:1148:1: rule__ANNModel__Group__3 : rule__ANNModel__Group__3__Impl rule__ANNModel__Group__4 ;
    public final void rule__ANNModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1152:1: ( rule__ANNModel__Group__3__Impl rule__ANNModel__Group__4 )
            // InternalAnn.g:1153:2: rule__ANNModel__Group__3__Impl rule__ANNModel__Group__4
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
    // InternalAnn.g:1160:1: rule__ANNModel__Group__3__Impl : ( ( rule__ANNModel__AlphaAssignment_3 ) ) ;
    public final void rule__ANNModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1164:1: ( ( ( rule__ANNModel__AlphaAssignment_3 ) ) )
            // InternalAnn.g:1165:1: ( ( rule__ANNModel__AlphaAssignment_3 ) )
            {
            // InternalAnn.g:1165:1: ( ( rule__ANNModel__AlphaAssignment_3 ) )
            // InternalAnn.g:1166:2: ( rule__ANNModel__AlphaAssignment_3 )
            {
             before(grammarAccess.getANNModelAccess().getAlphaAssignment_3()); 
            // InternalAnn.g:1167:2: ( rule__ANNModel__AlphaAssignment_3 )
            // InternalAnn.g:1167:3: rule__ANNModel__AlphaAssignment_3
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
    // InternalAnn.g:1175:1: rule__ANNModel__Group__4 : rule__ANNModel__Group__4__Impl rule__ANNModel__Group__5 ;
    public final void rule__ANNModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1179:1: ( rule__ANNModel__Group__4__Impl rule__ANNModel__Group__5 )
            // InternalAnn.g:1180:2: rule__ANNModel__Group__4__Impl rule__ANNModel__Group__5
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
    // InternalAnn.g:1187:1: rule__ANNModel__Group__4__Impl : ( 'epochs' ) ;
    public final void rule__ANNModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1191:1: ( ( 'epochs' ) )
            // InternalAnn.g:1192:1: ( 'epochs' )
            {
            // InternalAnn.g:1192:1: ( 'epochs' )
            // InternalAnn.g:1193:2: 'epochs'
            {
             before(grammarAccess.getANNModelAccess().getEpochsKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAnn.g:1202:1: rule__ANNModel__Group__5 : rule__ANNModel__Group__5__Impl rule__ANNModel__Group__6 ;
    public final void rule__ANNModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1206:1: ( rule__ANNModel__Group__5__Impl rule__ANNModel__Group__6 )
            // InternalAnn.g:1207:2: rule__ANNModel__Group__5__Impl rule__ANNModel__Group__6
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
    // InternalAnn.g:1214:1: rule__ANNModel__Group__5__Impl : ( ( rule__ANNModel__EpochsAssignment_5 ) ) ;
    public final void rule__ANNModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1218:1: ( ( ( rule__ANNModel__EpochsAssignment_5 ) ) )
            // InternalAnn.g:1219:1: ( ( rule__ANNModel__EpochsAssignment_5 ) )
            {
            // InternalAnn.g:1219:1: ( ( rule__ANNModel__EpochsAssignment_5 ) )
            // InternalAnn.g:1220:2: ( rule__ANNModel__EpochsAssignment_5 )
            {
             before(grammarAccess.getANNModelAccess().getEpochsAssignment_5()); 
            // InternalAnn.g:1221:2: ( rule__ANNModel__EpochsAssignment_5 )
            // InternalAnn.g:1221:3: rule__ANNModel__EpochsAssignment_5
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
    // InternalAnn.g:1229:1: rule__ANNModel__Group__6 : rule__ANNModel__Group__6__Impl rule__ANNModel__Group__7 ;
    public final void rule__ANNModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1233:1: ( rule__ANNModel__Group__6__Impl rule__ANNModel__Group__7 )
            // InternalAnn.g:1234:2: rule__ANNModel__Group__6__Impl rule__ANNModel__Group__7
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
    // InternalAnn.g:1241:1: rule__ANNModel__Group__6__Impl : ( ( rule__ANNModel__ConstraintsAssignment_6 )* ) ;
    public final void rule__ANNModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1245:1: ( ( ( rule__ANNModel__ConstraintsAssignment_6 )* ) )
            // InternalAnn.g:1246:1: ( ( rule__ANNModel__ConstraintsAssignment_6 )* )
            {
            // InternalAnn.g:1246:1: ( ( rule__ANNModel__ConstraintsAssignment_6 )* )
            // InternalAnn.g:1247:2: ( rule__ANNModel__ConstraintsAssignment_6 )*
            {
             before(grammarAccess.getANNModelAccess().getConstraintsAssignment_6()); 
            // InternalAnn.g:1248:2: ( rule__ANNModel__ConstraintsAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAnn.g:1248:3: rule__ANNModel__ConstraintsAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ANNModel__ConstraintsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getANNModelAccess().getConstraintsAssignment_6()); 

            }


            }

        }
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
    // InternalAnn.g:1256:1: rule__ANNModel__Group__7 : rule__ANNModel__Group__7__Impl rule__ANNModel__Group__8 ;
    public final void rule__ANNModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1260:1: ( rule__ANNModel__Group__7__Impl rule__ANNModel__Group__8 )
            // InternalAnn.g:1261:2: rule__ANNModel__Group__7__Impl rule__ANNModel__Group__8
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
    // InternalAnn.g:1268:1: rule__ANNModel__Group__7__Impl : ( ( rule__ANNModel__ActivationAssignment_7 )* ) ;
    public final void rule__ANNModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1272:1: ( ( ( rule__ANNModel__ActivationAssignment_7 )* ) )
            // InternalAnn.g:1273:1: ( ( rule__ANNModel__ActivationAssignment_7 )* )
            {
            // InternalAnn.g:1273:1: ( ( rule__ANNModel__ActivationAssignment_7 )* )
            // InternalAnn.g:1274:2: ( rule__ANNModel__ActivationAssignment_7 )*
            {
             before(grammarAccess.getANNModelAccess().getActivationAssignment_7()); 
            // InternalAnn.g:1275:2: ( rule__ANNModel__ActivationAssignment_7 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAnn.g:1275:3: rule__ANNModel__ActivationAssignment_7
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ANNModel__ActivationAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getANNModelAccess().getActivationAssignment_7()); 

            }


            }

        }
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
    // InternalAnn.g:1283:1: rule__ANNModel__Group__8 : rule__ANNModel__Group__8__Impl rule__ANNModel__Group__9 ;
    public final void rule__ANNModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1287:1: ( rule__ANNModel__Group__8__Impl rule__ANNModel__Group__9 )
            // InternalAnn.g:1288:2: rule__ANNModel__Group__8__Impl rule__ANNModel__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__ANNModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__9();

            state._fsp--;


            }

        }
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
    // InternalAnn.g:1295:1: rule__ANNModel__Group__8__Impl : ( ( rule__ANNModel__LayerAssignment_8 )* ) ;
    public final void rule__ANNModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1299:1: ( ( ( rule__ANNModel__LayerAssignment_8 )* ) )
            // InternalAnn.g:1300:1: ( ( rule__ANNModel__LayerAssignment_8 )* )
            {
            // InternalAnn.g:1300:1: ( ( rule__ANNModel__LayerAssignment_8 )* )
            // InternalAnn.g:1301:2: ( rule__ANNModel__LayerAssignment_8 )*
            {
             before(grammarAccess.getANNModelAccess().getLayerAssignment_8()); 
            // InternalAnn.g:1302:2: ( rule__ANNModel__LayerAssignment_8 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25||LA11_0==28||LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAnn.g:1302:3: rule__ANNModel__LayerAssignment_8
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ANNModel__LayerAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getANNModelAccess().getLayerAssignment_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__ANNModel__Group__9"
    // InternalAnn.g:1310:1: rule__ANNModel__Group__9 : rule__ANNModel__Group__9__Impl ;
    public final void rule__ANNModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1314:1: ( rule__ANNModel__Group__9__Impl )
            // InternalAnn.g:1315:2: rule__ANNModel__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ANNModel__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__9"


    // $ANTLR start "rule__ANNModel__Group__9__Impl"
    // InternalAnn.g:1321:1: rule__ANNModel__Group__9__Impl : ( '}' ) ;
    public final void rule__ANNModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1325:1: ( ( '}' ) )
            // InternalAnn.g:1326:1: ( '}' )
            {
            // InternalAnn.g:1326:1: ( '}' )
            // InternalAnn.g:1327:2: '}'
            {
             before(grammarAccess.getANNModelAccess().getRightCurlyBracketKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getANNModelAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__Group__9__Impl"


    // $ANTLR start "rule__DECIMAL__Group__0"
    // InternalAnn.g:1337:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1341:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalAnn.g:1342:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalAnn.g:1349:1: rule__DECIMAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1353:1: ( ( RULE_INT ) )
            // InternalAnn.g:1354:1: ( RULE_INT )
            {
            // InternalAnn.g:1354:1: ( RULE_INT )
            // InternalAnn.g:1355:2: RULE_INT
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
    // InternalAnn.g:1364:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1368:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalAnn.g:1369:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
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
    // InternalAnn.g:1376:1: rule__DECIMAL__Group__1__Impl : ( '.' ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1380:1: ( ( '.' ) )
            // InternalAnn.g:1381:1: ( '.' )
            {
            // InternalAnn.g:1381:1: ( '.' )
            // InternalAnn.g:1382:2: '.'
            {
             before(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAnn.g:1391:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1395:1: ( rule__DECIMAL__Group__2__Impl )
            // InternalAnn.g:1396:2: rule__DECIMAL__Group__2__Impl
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
    // InternalAnn.g:1402:1: rule__DECIMAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1406:1: ( ( RULE_INT ) )
            // InternalAnn.g:1407:1: ( RULE_INT )
            {
            // InternalAnn.g:1407:1: ( RULE_INT )
            // InternalAnn.g:1408:2: RULE_INT
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
    // InternalAnn.g:1418:1: rule__Hidden__Group__0 : rule__Hidden__Group__0__Impl rule__Hidden__Group__1 ;
    public final void rule__Hidden__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1422:1: ( rule__Hidden__Group__0__Impl rule__Hidden__Group__1 )
            // InternalAnn.g:1423:2: rule__Hidden__Group__0__Impl rule__Hidden__Group__1
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
    // InternalAnn.g:1430:1: rule__Hidden__Group__0__Impl : ( 'hidden' ) ;
    public final void rule__Hidden__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1434:1: ( ( 'hidden' ) )
            // InternalAnn.g:1435:1: ( 'hidden' )
            {
            // InternalAnn.g:1435:1: ( 'hidden' )
            // InternalAnn.g:1436:2: 'hidden'
            {
             before(grammarAccess.getHiddenAccess().getHiddenKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAnn.g:1445:1: rule__Hidden__Group__1 : rule__Hidden__Group__1__Impl rule__Hidden__Group__2 ;
    public final void rule__Hidden__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1449:1: ( rule__Hidden__Group__1__Impl rule__Hidden__Group__2 )
            // InternalAnn.g:1450:2: rule__Hidden__Group__1__Impl rule__Hidden__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalAnn.g:1457:1: rule__Hidden__Group__1__Impl : ( '{' ) ;
    public final void rule__Hidden__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1461:1: ( ( '{' ) )
            // InternalAnn.g:1462:1: ( '{' )
            {
            // InternalAnn.g:1462:1: ( '{' )
            // InternalAnn.g:1463:2: '{'
            {
             before(grammarAccess.getHiddenAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalAnn.g:1472:1: rule__Hidden__Group__2 : rule__Hidden__Group__2__Impl rule__Hidden__Group__3 ;
    public final void rule__Hidden__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1476:1: ( rule__Hidden__Group__2__Impl rule__Hidden__Group__3 )
            // InternalAnn.g:1477:2: rule__Hidden__Group__2__Impl rule__Hidden__Group__3
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
    // InternalAnn.g:1484:1: rule__Hidden__Group__2__Impl : ( 'size' ) ;
    public final void rule__Hidden__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1488:1: ( ( 'size' ) )
            // InternalAnn.g:1489:1: ( 'size' )
            {
            // InternalAnn.g:1489:1: ( 'size' )
            // InternalAnn.g:1490:2: 'size'
            {
             before(grammarAccess.getHiddenAccess().getSizeKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAnn.g:1499:1: rule__Hidden__Group__3 : rule__Hidden__Group__3__Impl rule__Hidden__Group__4 ;
    public final void rule__Hidden__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1503:1: ( rule__Hidden__Group__3__Impl rule__Hidden__Group__4 )
            // InternalAnn.g:1504:2: rule__Hidden__Group__3__Impl rule__Hidden__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalAnn.g:1511:1: rule__Hidden__Group__3__Impl : ( ( rule__Hidden__SizeAssignment_3 ) ) ;
    public final void rule__Hidden__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1515:1: ( ( ( rule__Hidden__SizeAssignment_3 ) ) )
            // InternalAnn.g:1516:1: ( ( rule__Hidden__SizeAssignment_3 ) )
            {
            // InternalAnn.g:1516:1: ( ( rule__Hidden__SizeAssignment_3 ) )
            // InternalAnn.g:1517:2: ( rule__Hidden__SizeAssignment_3 )
            {
             before(grammarAccess.getHiddenAccess().getSizeAssignment_3()); 
            // InternalAnn.g:1518:2: ( rule__Hidden__SizeAssignment_3 )
            // InternalAnn.g:1518:3: rule__Hidden__SizeAssignment_3
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
    // InternalAnn.g:1526:1: rule__Hidden__Group__4 : rule__Hidden__Group__4__Impl rule__Hidden__Group__5 ;
    public final void rule__Hidden__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1530:1: ( rule__Hidden__Group__4__Impl rule__Hidden__Group__5 )
            // InternalAnn.g:1531:2: rule__Hidden__Group__4__Impl rule__Hidden__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalAnn.g:1538:1: rule__Hidden__Group__4__Impl : ( 'activation' ) ;
    public final void rule__Hidden__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1542:1: ( ( 'activation' ) )
            // InternalAnn.g:1543:1: ( 'activation' )
            {
            // InternalAnn.g:1543:1: ( 'activation' )
            // InternalAnn.g:1544:2: 'activation'
            {
             before(grammarAccess.getHiddenAccess().getActivationKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAnn.g:1553:1: rule__Hidden__Group__5 : rule__Hidden__Group__5__Impl rule__Hidden__Group__6 ;
    public final void rule__Hidden__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1557:1: ( rule__Hidden__Group__5__Impl rule__Hidden__Group__6 )
            // InternalAnn.g:1558:2: rule__Hidden__Group__5__Impl rule__Hidden__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalAnn.g:1565:1: rule__Hidden__Group__5__Impl : ( ( rule__Hidden__L_ruleAssignment_5 ) ) ;
    public final void rule__Hidden__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1569:1: ( ( ( rule__Hidden__L_ruleAssignment_5 ) ) )
            // InternalAnn.g:1570:1: ( ( rule__Hidden__L_ruleAssignment_5 ) )
            {
            // InternalAnn.g:1570:1: ( ( rule__Hidden__L_ruleAssignment_5 ) )
            // InternalAnn.g:1571:2: ( rule__Hidden__L_ruleAssignment_5 )
            {
             before(grammarAccess.getHiddenAccess().getL_ruleAssignment_5()); 
            // InternalAnn.g:1572:2: ( rule__Hidden__L_ruleAssignment_5 )
            // InternalAnn.g:1572:3: rule__Hidden__L_ruleAssignment_5
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
    // InternalAnn.g:1580:1: rule__Hidden__Group__6 : rule__Hidden__Group__6__Impl ;
    public final void rule__Hidden__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1584:1: ( rule__Hidden__Group__6__Impl )
            // InternalAnn.g:1585:2: rule__Hidden__Group__6__Impl
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
    // InternalAnn.g:1591:1: rule__Hidden__Group__6__Impl : ( '}' ) ;
    public final void rule__Hidden__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1595:1: ( ( '}' ) )
            // InternalAnn.g:1596:1: ( '}' )
            {
            // InternalAnn.g:1596:1: ( '}' )
            // InternalAnn.g:1597:2: '}'
            {
             before(grammarAccess.getHiddenAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAnn.g:1607:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1611:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalAnn.g:1612:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalAnn.g:1619:1: rule__Input__Group__0__Impl : ( 'in' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1623:1: ( ( 'in' ) )
            // InternalAnn.g:1624:1: ( 'in' )
            {
            // InternalAnn.g:1624:1: ( 'in' )
            // InternalAnn.g:1625:2: 'in'
            {
             before(grammarAccess.getInputAccess().getInKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAnn.g:1634:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1638:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalAnn.g:1639:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalAnn.g:1646:1: rule__Input__Group__1__Impl : ( '{' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1650:1: ( ( '{' ) )
            // InternalAnn.g:1651:1: ( '{' )
            {
            // InternalAnn.g:1651:1: ( '{' )
            // InternalAnn.g:1652:2: '{'
            {
             before(grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalAnn.g:1661:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1665:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalAnn.g:1666:2: rule__Input__Group__2__Impl rule__Input__Group__3
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
    // InternalAnn.g:1673:1: rule__Input__Group__2__Impl : ( 'size' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1677:1: ( ( 'size' ) )
            // InternalAnn.g:1678:1: ( 'size' )
            {
            // InternalAnn.g:1678:1: ( 'size' )
            // InternalAnn.g:1679:2: 'size'
            {
             before(grammarAccess.getInputAccess().getSizeKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAnn.g:1688:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1692:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalAnn.g:1693:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalAnn.g:1700:1: rule__Input__Group__3__Impl : ( ( rule__Input__SizeAssignment_3 ) ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1704:1: ( ( ( rule__Input__SizeAssignment_3 ) ) )
            // InternalAnn.g:1705:1: ( ( rule__Input__SizeAssignment_3 ) )
            {
            // InternalAnn.g:1705:1: ( ( rule__Input__SizeAssignment_3 ) )
            // InternalAnn.g:1706:2: ( rule__Input__SizeAssignment_3 )
            {
             before(grammarAccess.getInputAccess().getSizeAssignment_3()); 
            // InternalAnn.g:1707:2: ( rule__Input__SizeAssignment_3 )
            // InternalAnn.g:1707:3: rule__Input__SizeAssignment_3
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
    // InternalAnn.g:1715:1: rule__Input__Group__4 : rule__Input__Group__4__Impl rule__Input__Group__5 ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1719:1: ( rule__Input__Group__4__Impl rule__Input__Group__5 )
            // InternalAnn.g:1720:2: rule__Input__Group__4__Impl rule__Input__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Input__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__5();

            state._fsp--;


            }

        }
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
    // InternalAnn.g:1727:1: rule__Input__Group__4__Impl : ( 'source' ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1731:1: ( ( 'source' ) )
            // InternalAnn.g:1732:1: ( 'source' )
            {
            // InternalAnn.g:1732:1: ( 'source' )
            // InternalAnn.g:1733:2: 'source'
            {
             before(grammarAccess.getInputAccess().getSourceKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getSourceKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Input__Group__5"
    // InternalAnn.g:1742:1: rule__Input__Group__5 : rule__Input__Group__5__Impl rule__Input__Group__6 ;
    public final void rule__Input__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1746:1: ( rule__Input__Group__5__Impl rule__Input__Group__6 )
            // InternalAnn.g:1747:2: rule__Input__Group__5__Impl rule__Input__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Input__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__5"


    // $ANTLR start "rule__Input__Group__5__Impl"
    // InternalAnn.g:1754:1: rule__Input__Group__5__Impl : ( ( rule__Input__SourceAssignment_5 ) ) ;
    public final void rule__Input__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1758:1: ( ( ( rule__Input__SourceAssignment_5 ) ) )
            // InternalAnn.g:1759:1: ( ( rule__Input__SourceAssignment_5 ) )
            {
            // InternalAnn.g:1759:1: ( ( rule__Input__SourceAssignment_5 ) )
            // InternalAnn.g:1760:2: ( rule__Input__SourceAssignment_5 )
            {
             before(grammarAccess.getInputAccess().getSourceAssignment_5()); 
            // InternalAnn.g:1761:2: ( rule__Input__SourceAssignment_5 )
            // InternalAnn.g:1761:3: rule__Input__SourceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Input__SourceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getSourceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__5__Impl"


    // $ANTLR start "rule__Input__Group__6"
    // InternalAnn.g:1769:1: rule__Input__Group__6 : rule__Input__Group__6__Impl rule__Input__Group__7 ;
    public final void rule__Input__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1773:1: ( rule__Input__Group__6__Impl rule__Input__Group__7 )
            // InternalAnn.g:1774:2: rule__Input__Group__6__Impl rule__Input__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Input__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__6"


    // $ANTLR start "rule__Input__Group__6__Impl"
    // InternalAnn.g:1781:1: rule__Input__Group__6__Impl : ( 'constraints' ) ;
    public final void rule__Input__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1785:1: ( ( 'constraints' ) )
            // InternalAnn.g:1786:1: ( 'constraints' )
            {
            // InternalAnn.g:1786:1: ( 'constraints' )
            // InternalAnn.g:1787:2: 'constraints'
            {
             before(grammarAccess.getInputAccess().getConstraintsKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getConstraintsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__6__Impl"


    // $ANTLR start "rule__Input__Group__7"
    // InternalAnn.g:1796:1: rule__Input__Group__7 : rule__Input__Group__7__Impl rule__Input__Group__8 ;
    public final void rule__Input__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1800:1: ( rule__Input__Group__7__Impl rule__Input__Group__8 )
            // InternalAnn.g:1801:2: rule__Input__Group__7__Impl rule__Input__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Input__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__7"


    // $ANTLR start "rule__Input__Group__7__Impl"
    // InternalAnn.g:1808:1: rule__Input__Group__7__Impl : ( ( rule__Input__RestrictionsAssignment_7 )? ) ;
    public final void rule__Input__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1812:1: ( ( ( rule__Input__RestrictionsAssignment_7 )? ) )
            // InternalAnn.g:1813:1: ( ( rule__Input__RestrictionsAssignment_7 )? )
            {
            // InternalAnn.g:1813:1: ( ( rule__Input__RestrictionsAssignment_7 )? )
            // InternalAnn.g:1814:2: ( rule__Input__RestrictionsAssignment_7 )?
            {
             before(grammarAccess.getInputAccess().getRestrictionsAssignment_7()); 
            // InternalAnn.g:1815:2: ( rule__Input__RestrictionsAssignment_7 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAnn.g:1815:3: rule__Input__RestrictionsAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Input__RestrictionsAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputAccess().getRestrictionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__7__Impl"


    // $ANTLR start "rule__Input__Group__8"
    // InternalAnn.g:1823:1: rule__Input__Group__8 : rule__Input__Group__8__Impl rule__Input__Group__9 ;
    public final void rule__Input__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1827:1: ( rule__Input__Group__8__Impl rule__Input__Group__9 )
            // InternalAnn.g:1828:2: rule__Input__Group__8__Impl rule__Input__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Input__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__8"


    // $ANTLR start "rule__Input__Group__8__Impl"
    // InternalAnn.g:1835:1: rule__Input__Group__8__Impl : ( ( rule__Input__MoreRestrictionsAssignment_8 )* ) ;
    public final void rule__Input__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1839:1: ( ( ( rule__Input__MoreRestrictionsAssignment_8 )* ) )
            // InternalAnn.g:1840:1: ( ( rule__Input__MoreRestrictionsAssignment_8 )* )
            {
            // InternalAnn.g:1840:1: ( ( rule__Input__MoreRestrictionsAssignment_8 )* )
            // InternalAnn.g:1841:2: ( rule__Input__MoreRestrictionsAssignment_8 )*
            {
             before(grammarAccess.getInputAccess().getMoreRestrictionsAssignment_8()); 
            // InternalAnn.g:1842:2: ( rule__Input__MoreRestrictionsAssignment_8 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAnn.g:1842:3: rule__Input__MoreRestrictionsAssignment_8
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Input__MoreRestrictionsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getInputAccess().getMoreRestrictionsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__8__Impl"


    // $ANTLR start "rule__Input__Group__9"
    // InternalAnn.g:1850:1: rule__Input__Group__9 : rule__Input__Group__9__Impl ;
    public final void rule__Input__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1854:1: ( rule__Input__Group__9__Impl )
            // InternalAnn.g:1855:2: rule__Input__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__9"


    // $ANTLR start "rule__Input__Group__9__Impl"
    // InternalAnn.g:1861:1: rule__Input__Group__9__Impl : ( '}' ) ;
    public final void rule__Input__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1865:1: ( ( '}' ) )
            // InternalAnn.g:1866:1: ( '}' )
            {
            // InternalAnn.g:1866:1: ( '}' )
            // InternalAnn.g:1867:2: '}'
            {
             before(grammarAccess.getInputAccess().getRightCurlyBracketKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__9__Impl"


    // $ANTLR start "rule__Restriction__Group__0"
    // InternalAnn.g:1877:1: rule__Restriction__Group__0 : rule__Restriction__Group__0__Impl rule__Restriction__Group__1 ;
    public final void rule__Restriction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1881:1: ( rule__Restriction__Group__0__Impl rule__Restriction__Group__1 )
            // InternalAnn.g:1882:2: rule__Restriction__Group__0__Impl rule__Restriction__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Restriction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restriction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__0"


    // $ANTLR start "rule__Restriction__Group__0__Impl"
    // InternalAnn.g:1889:1: rule__Restriction__Group__0__Impl : ( ',' ) ;
    public final void rule__Restriction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1893:1: ( ( ',' ) )
            // InternalAnn.g:1894:1: ( ',' )
            {
            // InternalAnn.g:1894:1: ( ',' )
            // InternalAnn.g:1895:2: ','
            {
             before(grammarAccess.getRestrictionAccess().getCommaKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRestrictionAccess().getCommaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__0__Impl"


    // $ANTLR start "rule__Restriction__Group__1"
    // InternalAnn.g:1904:1: rule__Restriction__Group__1 : rule__Restriction__Group__1__Impl ;
    public final void rule__Restriction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1908:1: ( rule__Restriction__Group__1__Impl )
            // InternalAnn.g:1909:2: rule__Restriction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Restriction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__1"


    // $ANTLR start "rule__Restriction__Group__1__Impl"
    // InternalAnn.g:1915:1: rule__Restriction__Group__1__Impl : ( ( rule__Restriction__ConstraintAssignment_1 ) ) ;
    public final void rule__Restriction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1919:1: ( ( ( rule__Restriction__ConstraintAssignment_1 ) ) )
            // InternalAnn.g:1920:1: ( ( rule__Restriction__ConstraintAssignment_1 ) )
            {
            // InternalAnn.g:1920:1: ( ( rule__Restriction__ConstraintAssignment_1 ) )
            // InternalAnn.g:1921:2: ( rule__Restriction__ConstraintAssignment_1 )
            {
             before(grammarAccess.getRestrictionAccess().getConstraintAssignment_1()); 
            // InternalAnn.g:1922:2: ( rule__Restriction__ConstraintAssignment_1 )
            // InternalAnn.g:1922:3: rule__Restriction__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Restriction__ConstraintAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionAccess().getConstraintAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalAnn.g:1931:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1935:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalAnn.g:1936:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalAnn.g:1943:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1947:1: ( ( 'constraint' ) )
            // InternalAnn.g:1948:1: ( 'constraint' )
            {
            // InternalAnn.g:1948:1: ( 'constraint' )
            // InternalAnn.g:1949:2: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalAnn.g:1958:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1962:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalAnn.g:1963:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalAnn.g:1970:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1974:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalAnn.g:1975:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalAnn.g:1975:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalAnn.g:1976:2: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalAnn.g:1977:2: ( rule__Constraint__NameAssignment_1 )
            // InternalAnn.g:1977:3: rule__Constraint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // InternalAnn.g:1985:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:1989:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalAnn.g:1990:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalAnn.g:1997:1: rule__Constraint__Group__2__Impl : ( '(' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2001:1: ( ( '(' ) )
            // InternalAnn.g:2002:1: ( '(' )
            {
            // InternalAnn.g:2002:1: ( '(' )
            // InternalAnn.g:2003:2: '('
            {
             before(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__3"
    // InternalAnn.g:2012:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2016:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalAnn.g:2017:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Constraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3"


    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalAnn.g:2024:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__FieldAssignment_3 ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2028:1: ( ( ( rule__Constraint__FieldAssignment_3 ) ) )
            // InternalAnn.g:2029:1: ( ( rule__Constraint__FieldAssignment_3 ) )
            {
            // InternalAnn.g:2029:1: ( ( rule__Constraint__FieldAssignment_3 ) )
            // InternalAnn.g:2030:2: ( rule__Constraint__FieldAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getFieldAssignment_3()); 
            // InternalAnn.g:2031:2: ( rule__Constraint__FieldAssignment_3 )
            // InternalAnn.g:2031:3: rule__Constraint__FieldAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__FieldAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getFieldAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group__4"
    // InternalAnn.g:2039:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl rule__Constraint__Group__5 ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2043:1: ( rule__Constraint__Group__4__Impl rule__Constraint__Group__5 )
            // InternalAnn.g:2044:2: rule__Constraint__Group__4__Impl rule__Constraint__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Constraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4"


    // $ANTLR start "rule__Constraint__Group__4__Impl"
    // InternalAnn.g:2051:1: rule__Constraint__Group__4__Impl : ( ( rule__Constraint__FieldsAssignment_4 )* ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2055:1: ( ( ( rule__Constraint__FieldsAssignment_4 )* ) )
            // InternalAnn.g:2056:1: ( ( rule__Constraint__FieldsAssignment_4 )* )
            {
            // InternalAnn.g:2056:1: ( ( rule__Constraint__FieldsAssignment_4 )* )
            // InternalAnn.g:2057:2: ( rule__Constraint__FieldsAssignment_4 )*
            {
             before(grammarAccess.getConstraintAccess().getFieldsAssignment_4()); 
            // InternalAnn.g:2058:2: ( rule__Constraint__FieldsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAnn.g:2058:3: rule__Constraint__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Constraint__FieldsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getConstraintAccess().getFieldsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4__Impl"


    // $ANTLR start "rule__Constraint__Group__5"
    // InternalAnn.g:2066:1: rule__Constraint__Group__5 : rule__Constraint__Group__5__Impl rule__Constraint__Group__6 ;
    public final void rule__Constraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2070:1: ( rule__Constraint__Group__5__Impl rule__Constraint__Group__6 )
            // InternalAnn.g:2071:2: rule__Constraint__Group__5__Impl rule__Constraint__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Constraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__5"


    // $ANTLR start "rule__Constraint__Group__5__Impl"
    // InternalAnn.g:2078:1: rule__Constraint__Group__5__Impl : ( ')' ) ;
    public final void rule__Constraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2082:1: ( ( ')' ) )
            // InternalAnn.g:2083:1: ( ')' )
            {
            // InternalAnn.g:2083:1: ( ')' )
            // InternalAnn.g:2084:2: ')'
            {
             before(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__5__Impl"


    // $ANTLR start "rule__Constraint__Group__6"
    // InternalAnn.g:2093:1: rule__Constraint__Group__6 : rule__Constraint__Group__6__Impl rule__Constraint__Group__7 ;
    public final void rule__Constraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2097:1: ( rule__Constraint__Group__6__Impl rule__Constraint__Group__7 )
            // InternalAnn.g:2098:2: rule__Constraint__Group__6__Impl rule__Constraint__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Constraint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__6"


    // $ANTLR start "rule__Constraint__Group__6__Impl"
    // InternalAnn.g:2105:1: rule__Constraint__Group__6__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2109:1: ( ( '{' ) )
            // InternalAnn.g:2110:1: ( '{' )
            {
            // InternalAnn.g:2110:1: ( '{' )
            // InternalAnn.g:2111:2: '{'
            {
             before(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__6__Impl"


    // $ANTLR start "rule__Constraint__Group__7"
    // InternalAnn.g:2120:1: rule__Constraint__Group__7 : rule__Constraint__Group__7__Impl rule__Constraint__Group__8 ;
    public final void rule__Constraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2124:1: ( rule__Constraint__Group__7__Impl rule__Constraint__Group__8 )
            // InternalAnn.g:2125:2: rule__Constraint__Group__7__Impl rule__Constraint__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Constraint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__7"


    // $ANTLR start "rule__Constraint__Group__7__Impl"
    // InternalAnn.g:2132:1: rule__Constraint__Group__7__Impl : ( ( rule__Constraint__ConditionAssignment_7 ) ) ;
    public final void rule__Constraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2136:1: ( ( ( rule__Constraint__ConditionAssignment_7 ) ) )
            // InternalAnn.g:2137:1: ( ( rule__Constraint__ConditionAssignment_7 ) )
            {
            // InternalAnn.g:2137:1: ( ( rule__Constraint__ConditionAssignment_7 ) )
            // InternalAnn.g:2138:2: ( rule__Constraint__ConditionAssignment_7 )
            {
             before(grammarAccess.getConstraintAccess().getConditionAssignment_7()); 
            // InternalAnn.g:2139:2: ( rule__Constraint__ConditionAssignment_7 )
            // InternalAnn.g:2139:3: rule__Constraint__ConditionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ConditionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getConditionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__7__Impl"


    // $ANTLR start "rule__Constraint__Group__8"
    // InternalAnn.g:2147:1: rule__Constraint__Group__8 : rule__Constraint__Group__8__Impl ;
    public final void rule__Constraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2151:1: ( rule__Constraint__Group__8__Impl )
            // InternalAnn.g:2152:2: rule__Constraint__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__8"


    // $ANTLR start "rule__Constraint__Group__8__Impl"
    // InternalAnn.g:2158:1: rule__Constraint__Group__8__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2162:1: ( ( '}' ) )
            // InternalAnn.g:2163:1: ( '}' )
            {
            // InternalAnn.g:2163:1: ( '}' )
            // InternalAnn.g:2164:2: '}'
            {
             before(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__8__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalAnn.g:2174:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2178:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalAnn.g:2179:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalAnn.g:2186:1: rule__Field__Group__0__Impl : ( ',' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2190:1: ( ( ',' ) )
            // InternalAnn.g:2191:1: ( ',' )
            {
            // InternalAnn.g:2191:1: ( ',' )
            // InternalAnn.g:2192:2: ','
            {
             before(grammarAccess.getFieldAccess().getCommaKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getCommaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalAnn.g:2201:1: rule__Field__Group__1 : rule__Field__Group__1__Impl ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2205:1: ( rule__Field__Group__1__Impl )
            // InternalAnn.g:2206:2: rule__Field__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalAnn.g:2212:1: rule__Field__Group__1__Impl : ( ( rule__Field__FieldAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2216:1: ( ( ( rule__Field__FieldAssignment_1 ) ) )
            // InternalAnn.g:2217:1: ( ( rule__Field__FieldAssignment_1 ) )
            {
            // InternalAnn.g:2217:1: ( ( rule__Field__FieldAssignment_1 ) )
            // InternalAnn.g:2218:2: ( rule__Field__FieldAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getFieldAssignment_1()); 
            // InternalAnn.g:2219:2: ( rule__Field__FieldAssignment_1 )
            // InternalAnn.g:2219:3: rule__Field__FieldAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__FieldAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getFieldAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalAnn.g:2228:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2232:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalAnn.g:2233:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalAnn.g:2240:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__ConditionAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2244:1: ( ( ( rule__Condition__ConditionAssignment_0 ) ) )
            // InternalAnn.g:2245:1: ( ( rule__Condition__ConditionAssignment_0 ) )
            {
            // InternalAnn.g:2245:1: ( ( rule__Condition__ConditionAssignment_0 ) )
            // InternalAnn.g:2246:2: ( rule__Condition__ConditionAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getConditionAssignment_0()); 
            // InternalAnn.g:2247:2: ( rule__Condition__ConditionAssignment_0 )
            // InternalAnn.g:2247:3: rule__Condition__ConditionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ConditionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getConditionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalAnn.g:2255:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2259:1: ( rule__Condition__Group__1__Impl )
            // InternalAnn.g:2260:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalAnn.g:2266:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Num2Assignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2270:1: ( ( ( rule__Condition__Num2Assignment_1 ) ) )
            // InternalAnn.g:2271:1: ( ( rule__Condition__Num2Assignment_1 ) )
            {
            // InternalAnn.g:2271:1: ( ( rule__Condition__Num2Assignment_1 ) )
            // InternalAnn.g:2272:2: ( rule__Condition__Num2Assignment_1 )
            {
             before(grammarAccess.getConditionAccess().getNum2Assignment_1()); 
            // InternalAnn.g:2273:2: ( rule__Condition__Num2Assignment_1 )
            // InternalAnn.g:2273:3: rule__Condition__Num2Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Num2Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getNum2Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // InternalAnn.g:2282:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2286:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalAnn.g:2287:2: rule__Output__Group__0__Impl rule__Output__Group__1
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
    // InternalAnn.g:2294:1: rule__Output__Group__0__Impl : ( 'out' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2298:1: ( ( 'out' ) )
            // InternalAnn.g:2299:1: ( 'out' )
            {
            // InternalAnn.g:2299:1: ( 'out' )
            // InternalAnn.g:2300:2: 'out'
            {
             before(grammarAccess.getOutputAccess().getOutKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAnn.g:2309:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2313:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalAnn.g:2314:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalAnn.g:2321:1: rule__Output__Group__1__Impl : ( '{' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2325:1: ( ( '{' ) )
            // InternalAnn.g:2326:1: ( '{' )
            {
            // InternalAnn.g:2326:1: ( '{' )
            // InternalAnn.g:2327:2: '{'
            {
             before(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalAnn.g:2336:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2340:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalAnn.g:2341:2: rule__Output__Group__2__Impl rule__Output__Group__3
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
    // InternalAnn.g:2348:1: rule__Output__Group__2__Impl : ( 'size' ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2352:1: ( ( 'size' ) )
            // InternalAnn.g:2353:1: ( 'size' )
            {
            // InternalAnn.g:2353:1: ( 'size' )
            // InternalAnn.g:2354:2: 'size'
            {
             before(grammarAccess.getOutputAccess().getSizeKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAnn.g:2363:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2367:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalAnn.g:2368:2: rule__Output__Group__3__Impl rule__Output__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalAnn.g:2375:1: rule__Output__Group__3__Impl : ( ( rule__Output__SizeAssignment_3 ) ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2379:1: ( ( ( rule__Output__SizeAssignment_3 ) ) )
            // InternalAnn.g:2380:1: ( ( rule__Output__SizeAssignment_3 ) )
            {
            // InternalAnn.g:2380:1: ( ( rule__Output__SizeAssignment_3 ) )
            // InternalAnn.g:2381:2: ( rule__Output__SizeAssignment_3 )
            {
             before(grammarAccess.getOutputAccess().getSizeAssignment_3()); 
            // InternalAnn.g:2382:2: ( rule__Output__SizeAssignment_3 )
            // InternalAnn.g:2382:3: rule__Output__SizeAssignment_3
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
    // InternalAnn.g:2390:1: rule__Output__Group__4 : rule__Output__Group__4__Impl rule__Output__Group__5 ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2394:1: ( rule__Output__Group__4__Impl rule__Output__Group__5 )
            // InternalAnn.g:2395:2: rule__Output__Group__4__Impl rule__Output__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalAnn.g:2402:1: rule__Output__Group__4__Impl : ( 'activation' ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2406:1: ( ( 'activation' ) )
            // InternalAnn.g:2407:1: ( 'activation' )
            {
            // InternalAnn.g:2407:1: ( 'activation' )
            // InternalAnn.g:2408:2: 'activation'
            {
             before(grammarAccess.getOutputAccess().getActivationKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAnn.g:2417:1: rule__Output__Group__5 : rule__Output__Group__5__Impl rule__Output__Group__6 ;
    public final void rule__Output__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2421:1: ( rule__Output__Group__5__Impl rule__Output__Group__6 )
            // InternalAnn.g:2422:2: rule__Output__Group__5__Impl rule__Output__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalAnn.g:2429:1: rule__Output__Group__5__Impl : ( ( rule__Output__L_ruleAssignment_5 ) ) ;
    public final void rule__Output__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2433:1: ( ( ( rule__Output__L_ruleAssignment_5 ) ) )
            // InternalAnn.g:2434:1: ( ( rule__Output__L_ruleAssignment_5 ) )
            {
            // InternalAnn.g:2434:1: ( ( rule__Output__L_ruleAssignment_5 ) )
            // InternalAnn.g:2435:2: ( rule__Output__L_ruleAssignment_5 )
            {
             before(grammarAccess.getOutputAccess().getL_ruleAssignment_5()); 
            // InternalAnn.g:2436:2: ( rule__Output__L_ruleAssignment_5 )
            // InternalAnn.g:2436:3: rule__Output__L_ruleAssignment_5
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
    // InternalAnn.g:2444:1: rule__Output__Group__6 : rule__Output__Group__6__Impl ;
    public final void rule__Output__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2448:1: ( rule__Output__Group__6__Impl )
            // InternalAnn.g:2449:2: rule__Output__Group__6__Impl
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
    // InternalAnn.g:2455:1: rule__Output__Group__6__Impl : ( '}' ) ;
    public final void rule__Output__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2459:1: ( ( '}' ) )
            // InternalAnn.g:2460:1: ( '}' )
            {
            // InternalAnn.g:2460:1: ( '}' )
            // InternalAnn.g:2461:2: '}'
            {
             before(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAnn.g:2471:1: rule__External__Group__0 : rule__External__Group__0__Impl rule__External__Group__1 ;
    public final void rule__External__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2475:1: ( rule__External__Group__0__Impl rule__External__Group__1 )
            // InternalAnn.g:2476:2: rule__External__Group__0__Impl rule__External__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalAnn.g:2483:1: rule__External__Group__0__Impl : ( ( rule__External__NameAssignment_0 ) ) ;
    public final void rule__External__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2487:1: ( ( ( rule__External__NameAssignment_0 ) ) )
            // InternalAnn.g:2488:1: ( ( rule__External__NameAssignment_0 ) )
            {
            // InternalAnn.g:2488:1: ( ( rule__External__NameAssignment_0 ) )
            // InternalAnn.g:2489:2: ( rule__External__NameAssignment_0 )
            {
             before(grammarAccess.getExternalAccess().getNameAssignment_0()); 
            // InternalAnn.g:2490:2: ( rule__External__NameAssignment_0 )
            // InternalAnn.g:2490:3: rule__External__NameAssignment_0
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
    // InternalAnn.g:2498:1: rule__External__Group__1 : rule__External__Group__1__Impl ;
    public final void rule__External__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2502:1: ( rule__External__Group__1__Impl )
            // InternalAnn.g:2503:2: rule__External__Group__1__Impl
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
    // InternalAnn.g:2509:1: rule__External__Group__1__Impl : ( 'external' ) ;
    public final void rule__External__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2513:1: ( ( 'external' ) )
            // InternalAnn.g:2514:1: ( 'external' )
            {
            // InternalAnn.g:2514:1: ( 'external' )
            // InternalAnn.g:2515:2: 'external'
            {
             before(grammarAccess.getExternalAccess().getExternalKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAnn.g:2525:1: rule__Sigmoid__Group__0 : rule__Sigmoid__Group__0__Impl rule__Sigmoid__Group__1 ;
    public final void rule__Sigmoid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2529:1: ( rule__Sigmoid__Group__0__Impl rule__Sigmoid__Group__1 )
            // InternalAnn.g:2530:2: rule__Sigmoid__Group__0__Impl rule__Sigmoid__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAnn.g:2537:1: rule__Sigmoid__Group__0__Impl : ( ( rule__Sigmoid__NameAssignment_0 ) ) ;
    public final void rule__Sigmoid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2541:1: ( ( ( rule__Sigmoid__NameAssignment_0 ) ) )
            // InternalAnn.g:2542:1: ( ( rule__Sigmoid__NameAssignment_0 ) )
            {
            // InternalAnn.g:2542:1: ( ( rule__Sigmoid__NameAssignment_0 ) )
            // InternalAnn.g:2543:2: ( rule__Sigmoid__NameAssignment_0 )
            {
             before(grammarAccess.getSigmoidAccess().getNameAssignment_0()); 
            // InternalAnn.g:2544:2: ( rule__Sigmoid__NameAssignment_0 )
            // InternalAnn.g:2544:3: rule__Sigmoid__NameAssignment_0
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
    // InternalAnn.g:2552:1: rule__Sigmoid__Group__1 : rule__Sigmoid__Group__1__Impl ;
    public final void rule__Sigmoid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2556:1: ( rule__Sigmoid__Group__1__Impl )
            // InternalAnn.g:2557:2: rule__Sigmoid__Group__1__Impl
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
    // InternalAnn.g:2563:1: rule__Sigmoid__Group__1__Impl : ( ( rule__Sigmoid__RuleAssignment_1 ) ) ;
    public final void rule__Sigmoid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2567:1: ( ( ( rule__Sigmoid__RuleAssignment_1 ) ) )
            // InternalAnn.g:2568:1: ( ( rule__Sigmoid__RuleAssignment_1 ) )
            {
            // InternalAnn.g:2568:1: ( ( rule__Sigmoid__RuleAssignment_1 ) )
            // InternalAnn.g:2569:2: ( rule__Sigmoid__RuleAssignment_1 )
            {
             before(grammarAccess.getSigmoidAccess().getRuleAssignment_1()); 
            // InternalAnn.g:2570:2: ( rule__Sigmoid__RuleAssignment_1 )
            // InternalAnn.g:2570:3: rule__Sigmoid__RuleAssignment_1
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
    // InternalAnn.g:2579:1: rule__Tansig__Group__0 : rule__Tansig__Group__0__Impl rule__Tansig__Group__1 ;
    public final void rule__Tansig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2583:1: ( rule__Tansig__Group__0__Impl rule__Tansig__Group__1 )
            // InternalAnn.g:2584:2: rule__Tansig__Group__0__Impl rule__Tansig__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalAnn.g:2591:1: rule__Tansig__Group__0__Impl : ( ( rule__Tansig__NameAssignment_0 ) ) ;
    public final void rule__Tansig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2595:1: ( ( ( rule__Tansig__NameAssignment_0 ) ) )
            // InternalAnn.g:2596:1: ( ( rule__Tansig__NameAssignment_0 ) )
            {
            // InternalAnn.g:2596:1: ( ( rule__Tansig__NameAssignment_0 ) )
            // InternalAnn.g:2597:2: ( rule__Tansig__NameAssignment_0 )
            {
             before(grammarAccess.getTansigAccess().getNameAssignment_0()); 
            // InternalAnn.g:2598:2: ( rule__Tansig__NameAssignment_0 )
            // InternalAnn.g:2598:3: rule__Tansig__NameAssignment_0
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
    // InternalAnn.g:2606:1: rule__Tansig__Group__1 : rule__Tansig__Group__1__Impl ;
    public final void rule__Tansig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2610:1: ( rule__Tansig__Group__1__Impl )
            // InternalAnn.g:2611:2: rule__Tansig__Group__1__Impl
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
    // InternalAnn.g:2617:1: rule__Tansig__Group__1__Impl : ( ( rule__Tansig__RuleAssignment_1 ) ) ;
    public final void rule__Tansig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2621:1: ( ( ( rule__Tansig__RuleAssignment_1 ) ) )
            // InternalAnn.g:2622:1: ( ( rule__Tansig__RuleAssignment_1 ) )
            {
            // InternalAnn.g:2622:1: ( ( rule__Tansig__RuleAssignment_1 ) )
            // InternalAnn.g:2623:2: ( rule__Tansig__RuleAssignment_1 )
            {
             before(grammarAccess.getTansigAccess().getRuleAssignment_1()); 
            // InternalAnn.g:2624:2: ( rule__Tansig__RuleAssignment_1 )
            // InternalAnn.g:2624:3: rule__Tansig__RuleAssignment_1
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
    // InternalAnn.g:2633:1: rule__Custom__Group__0 : rule__Custom__Group__0__Impl rule__Custom__Group__1 ;
    public final void rule__Custom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2637:1: ( rule__Custom__Group__0__Impl rule__Custom__Group__1 )
            // InternalAnn.g:2638:2: rule__Custom__Group__0__Impl rule__Custom__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalAnn.g:2645:1: rule__Custom__Group__0__Impl : ( ( rule__Custom__NameAssignment_0 ) ) ;
    public final void rule__Custom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2649:1: ( ( ( rule__Custom__NameAssignment_0 ) ) )
            // InternalAnn.g:2650:1: ( ( rule__Custom__NameAssignment_0 ) )
            {
            // InternalAnn.g:2650:1: ( ( rule__Custom__NameAssignment_0 ) )
            // InternalAnn.g:2651:2: ( rule__Custom__NameAssignment_0 )
            {
             before(grammarAccess.getCustomAccess().getNameAssignment_0()); 
            // InternalAnn.g:2652:2: ( rule__Custom__NameAssignment_0 )
            // InternalAnn.g:2652:3: rule__Custom__NameAssignment_0
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
    // InternalAnn.g:2660:1: rule__Custom__Group__1 : rule__Custom__Group__1__Impl rule__Custom__Group__2 ;
    public final void rule__Custom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2664:1: ( rule__Custom__Group__1__Impl rule__Custom__Group__2 )
            // InternalAnn.g:2665:2: rule__Custom__Group__1__Impl rule__Custom__Group__2
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
    // InternalAnn.g:2672:1: rule__Custom__Group__1__Impl : ( '(x)' ) ;
    public final void rule__Custom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2676:1: ( ( '(x)' ) )
            // InternalAnn.g:2677:1: ( '(x)' )
            {
            // InternalAnn.g:2677:1: ( '(x)' )
            // InternalAnn.g:2678:2: '(x)'
            {
             before(grammarAccess.getCustomAccess().getXKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAnn.g:2687:1: rule__Custom__Group__2 : rule__Custom__Group__2__Impl rule__Custom__Group__3 ;
    public final void rule__Custom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2691:1: ( rule__Custom__Group__2__Impl rule__Custom__Group__3 )
            // InternalAnn.g:2692:2: rule__Custom__Group__2__Impl rule__Custom__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalAnn.g:2699:1: rule__Custom__Group__2__Impl : ( '{' ) ;
    public final void rule__Custom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2703:1: ( ( '{' ) )
            // InternalAnn.g:2704:1: ( '{' )
            {
            // InternalAnn.g:2704:1: ( '{' )
            // InternalAnn.g:2705:2: '{'
            {
             before(grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalAnn.g:2714:1: rule__Custom__Group__3 : rule__Custom__Group__3__Impl rule__Custom__Group__4 ;
    public final void rule__Custom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2718:1: ( rule__Custom__Group__3__Impl rule__Custom__Group__4 )
            // InternalAnn.g:2719:2: rule__Custom__Group__3__Impl rule__Custom__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalAnn.g:2726:1: rule__Custom__Group__3__Impl : ( 'function' ) ;
    public final void rule__Custom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2730:1: ( ( 'function' ) )
            // InternalAnn.g:2731:1: ( 'function' )
            {
            // InternalAnn.g:2731:1: ( 'function' )
            // InternalAnn.g:2732:2: 'function'
            {
             before(grammarAccess.getCustomAccess().getFunctionKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAnn.g:2741:1: rule__Custom__Group__4 : rule__Custom__Group__4__Impl rule__Custom__Group__5 ;
    public final void rule__Custom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2745:1: ( rule__Custom__Group__4__Impl rule__Custom__Group__5 )
            // InternalAnn.g:2746:2: rule__Custom__Group__4__Impl rule__Custom__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalAnn.g:2753:1: rule__Custom__Group__4__Impl : ( '=' ) ;
    public final void rule__Custom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2757:1: ( ( '=' ) )
            // InternalAnn.g:2758:1: ( '=' )
            {
            // InternalAnn.g:2758:1: ( '=' )
            // InternalAnn.g:2759:2: '='
            {
             before(grammarAccess.getCustomAccess().getEqualsSignKeyword_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalAnn.g:2768:1: rule__Custom__Group__5 : rule__Custom__Group__5__Impl rule__Custom__Group__6 ;
    public final void rule__Custom__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2772:1: ( rule__Custom__Group__5__Impl rule__Custom__Group__6 )
            // InternalAnn.g:2773:2: rule__Custom__Group__5__Impl rule__Custom__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalAnn.g:2780:1: rule__Custom__Group__5__Impl : ( ( rule__Custom__ExpAssignment_5 ) ) ;
    public final void rule__Custom__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2784:1: ( ( ( rule__Custom__ExpAssignment_5 ) ) )
            // InternalAnn.g:2785:1: ( ( rule__Custom__ExpAssignment_5 ) )
            {
            // InternalAnn.g:2785:1: ( ( rule__Custom__ExpAssignment_5 ) )
            // InternalAnn.g:2786:2: ( rule__Custom__ExpAssignment_5 )
            {
             before(grammarAccess.getCustomAccess().getExpAssignment_5()); 
            // InternalAnn.g:2787:2: ( rule__Custom__ExpAssignment_5 )
            // InternalAnn.g:2787:3: rule__Custom__ExpAssignment_5
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
    // InternalAnn.g:2795:1: rule__Custom__Group__6 : rule__Custom__Group__6__Impl rule__Custom__Group__7 ;
    public final void rule__Custom__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2799:1: ( rule__Custom__Group__6__Impl rule__Custom__Group__7 )
            // InternalAnn.g:2800:2: rule__Custom__Group__6__Impl rule__Custom__Group__7
            {
            pushFollow(FOLLOW_29);
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
    // InternalAnn.g:2807:1: rule__Custom__Group__6__Impl : ( 'derivative' ) ;
    public final void rule__Custom__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2811:1: ( ( 'derivative' ) )
            // InternalAnn.g:2812:1: ( 'derivative' )
            {
            // InternalAnn.g:2812:1: ( 'derivative' )
            // InternalAnn.g:2813:2: 'derivative'
            {
             before(grammarAccess.getCustomAccess().getDerivativeKeyword_6()); 
            match(input,40,FOLLOW_2); 
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
    // InternalAnn.g:2822:1: rule__Custom__Group__7 : rule__Custom__Group__7__Impl rule__Custom__Group__8 ;
    public final void rule__Custom__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2826:1: ( rule__Custom__Group__7__Impl rule__Custom__Group__8 )
            // InternalAnn.g:2827:2: rule__Custom__Group__7__Impl rule__Custom__Group__8
            {
            pushFollow(FOLLOW_30);
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
    // InternalAnn.g:2834:1: rule__Custom__Group__7__Impl : ( '=' ) ;
    public final void rule__Custom__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2838:1: ( ( '=' ) )
            // InternalAnn.g:2839:1: ( '=' )
            {
            // InternalAnn.g:2839:1: ( '=' )
            // InternalAnn.g:2840:2: '='
            {
             before(grammarAccess.getCustomAccess().getEqualsSignKeyword_7()); 
            match(input,39,FOLLOW_2); 
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
    // InternalAnn.g:2849:1: rule__Custom__Group__8 : rule__Custom__Group__8__Impl rule__Custom__Group__9 ;
    public final void rule__Custom__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2853:1: ( rule__Custom__Group__8__Impl rule__Custom__Group__9 )
            // InternalAnn.g:2854:2: rule__Custom__Group__8__Impl rule__Custom__Group__9
            {
            pushFollow(FOLLOW_15);
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
    // InternalAnn.g:2861:1: rule__Custom__Group__8__Impl : ( ( rule__Custom__DerAssignment_8 ) ) ;
    public final void rule__Custom__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2865:1: ( ( ( rule__Custom__DerAssignment_8 ) ) )
            // InternalAnn.g:2866:1: ( ( rule__Custom__DerAssignment_8 ) )
            {
            // InternalAnn.g:2866:1: ( ( rule__Custom__DerAssignment_8 ) )
            // InternalAnn.g:2867:2: ( rule__Custom__DerAssignment_8 )
            {
             before(grammarAccess.getCustomAccess().getDerAssignment_8()); 
            // InternalAnn.g:2868:2: ( rule__Custom__DerAssignment_8 )
            // InternalAnn.g:2868:3: rule__Custom__DerAssignment_8
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
    // InternalAnn.g:2876:1: rule__Custom__Group__9 : rule__Custom__Group__9__Impl ;
    public final void rule__Custom__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2880:1: ( rule__Custom__Group__9__Impl )
            // InternalAnn.g:2881:2: rule__Custom__Group__9__Impl
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
    // InternalAnn.g:2887:1: rule__Custom__Group__9__Impl : ( '}' ) ;
    public final void rule__Custom__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2891:1: ( ( '}' ) )
            // InternalAnn.g:2892:1: ( '}' )
            {
            // InternalAnn.g:2892:1: ( '}' )
            // InternalAnn.g:2893:2: '}'
            {
             before(grammarAccess.getCustomAccess().getRightCurlyBracketKeyword_9()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAnn.g:2903:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2907:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalAnn.g:2908:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAnn.g:2915:1: rule__Expression__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2919:1: ( ( ruleFactor ) )
            // InternalAnn.g:2920:1: ( ruleFactor )
            {
            // InternalAnn.g:2920:1: ( ruleFactor )
            // InternalAnn.g:2921:2: ruleFactor
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
    // InternalAnn.g:2930:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2934:1: ( rule__Expression__Group__1__Impl )
            // InternalAnn.g:2935:2: rule__Expression__Group__1__Impl
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
    // InternalAnn.g:2941:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2945:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalAnn.g:2946:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalAnn.g:2946:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalAnn.g:2947:2: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalAnn.g:2948:2: ( rule__Expression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=16 && LA15_0<=17)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAnn.g:2948:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalAnn.g:2957:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2961:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalAnn.g:2962:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAnn.g:2969:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2973:1: ( ( () ) )
            // InternalAnn.g:2974:1: ( () )
            {
            // InternalAnn.g:2974:1: ( () )
            // InternalAnn.g:2975:2: ()
            {
             before(grammarAccess.getExpressionAccess().getPartLeftAction_1_0()); 
            // InternalAnn.g:2976:2: ()
            // InternalAnn.g:2976:3: 
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
    // InternalAnn.g:2984:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:2988:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalAnn.g:2989:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalAnn.g:2996:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OperatorAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3000:1: ( ( ( rule__Expression__OperatorAssignment_1_1 ) ) )
            // InternalAnn.g:3001:1: ( ( rule__Expression__OperatorAssignment_1_1 ) )
            {
            // InternalAnn.g:3001:1: ( ( rule__Expression__OperatorAssignment_1_1 ) )
            // InternalAnn.g:3002:2: ( rule__Expression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAnn.g:3003:2: ( rule__Expression__OperatorAssignment_1_1 )
            // InternalAnn.g:3003:3: rule__Expression__OperatorAssignment_1_1
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
    // InternalAnn.g:3011:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3015:1: ( rule__Expression__Group_1__2__Impl )
            // InternalAnn.g:3016:2: rule__Expression__Group_1__2__Impl
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
    // InternalAnn.g:3022:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3026:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // InternalAnn.g:3027:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // InternalAnn.g:3027:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // InternalAnn.g:3028:2: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // InternalAnn.g:3029:2: ( rule__Expression__RightAssignment_1_2 )
            // InternalAnn.g:3029:3: rule__Expression__RightAssignment_1_2
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
    // InternalAnn.g:3038:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3042:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalAnn.g:3043:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalAnn.g:3050:1: rule__Factor__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3054:1: ( ( rulePrimary ) )
            // InternalAnn.g:3055:1: ( rulePrimary )
            {
            // InternalAnn.g:3055:1: ( rulePrimary )
            // InternalAnn.g:3056:2: rulePrimary
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
    // InternalAnn.g:3065:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3069:1: ( rule__Factor__Group__1__Impl )
            // InternalAnn.g:3070:2: rule__Factor__Group__1__Impl
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
    // InternalAnn.g:3076:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )* ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3080:1: ( ( ( rule__Factor__Group_1__0 )* ) )
            // InternalAnn.g:3081:1: ( ( rule__Factor__Group_1__0 )* )
            {
            // InternalAnn.g:3081:1: ( ( rule__Factor__Group_1__0 )* )
            // InternalAnn.g:3082:2: ( rule__Factor__Group_1__0 )*
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // InternalAnn.g:3083:2: ( rule__Factor__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=18 && LA16_0<=19)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAnn.g:3083:3: rule__Factor__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Factor__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalAnn.g:3092:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3096:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalAnn.g:3097:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalAnn.g:3104:1: rule__Factor__Group_1__0__Impl : ( () ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3108:1: ( ( () ) )
            // InternalAnn.g:3109:1: ( () )
            {
            // InternalAnn.g:3109:1: ( () )
            // InternalAnn.g:3110:2: ()
            {
             before(grammarAccess.getFactorAccess().getFacLeftAction_1_0()); 
            // InternalAnn.g:3111:2: ()
            // InternalAnn.g:3111:3: 
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
    // InternalAnn.g:3119:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3123:1: ( rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 )
            // InternalAnn.g:3124:2: rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalAnn.g:3131:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__OperatorAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3135:1: ( ( ( rule__Factor__OperatorAssignment_1_1 ) ) )
            // InternalAnn.g:3136:1: ( ( rule__Factor__OperatorAssignment_1_1 ) )
            {
            // InternalAnn.g:3136:1: ( ( rule__Factor__OperatorAssignment_1_1 ) )
            // InternalAnn.g:3137:2: ( rule__Factor__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getOperatorAssignment_1_1()); 
            // InternalAnn.g:3138:2: ( rule__Factor__OperatorAssignment_1_1 )
            // InternalAnn.g:3138:3: rule__Factor__OperatorAssignment_1_1
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
    // InternalAnn.g:3146:1: rule__Factor__Group_1__2 : rule__Factor__Group_1__2__Impl ;
    public final void rule__Factor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3150:1: ( rule__Factor__Group_1__2__Impl )
            // InternalAnn.g:3151:2: rule__Factor__Group_1__2__Impl
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
    // InternalAnn.g:3157:1: rule__Factor__Group_1__2__Impl : ( ( rule__Factor__RightAssignment_1_2 ) ) ;
    public final void rule__Factor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3161:1: ( ( ( rule__Factor__RightAssignment_1_2 ) ) )
            // InternalAnn.g:3162:1: ( ( rule__Factor__RightAssignment_1_2 ) )
            {
            // InternalAnn.g:3162:1: ( ( rule__Factor__RightAssignment_1_2 ) )
            // InternalAnn.g:3163:2: ( rule__Factor__RightAssignment_1_2 )
            {
             before(grammarAccess.getFactorAccess().getRightAssignment_1_2()); 
            // InternalAnn.g:3164:2: ( rule__Factor__RightAssignment_1_2 )
            // InternalAnn.g:3164:3: rule__Factor__RightAssignment_1_2
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
    // InternalAnn.g:3173:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3177:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalAnn.g:3178:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAnn.g:3185:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3189:1: ( ( '(' ) )
            // InternalAnn.g:3190:1: ( '(' )
            {
            // InternalAnn.g:3190:1: ( '(' )
            // InternalAnn.g:3191:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAnn.g:3200:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3204:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalAnn.g:3205:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalAnn.g:3212:1: rule__Primary__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3216:1: ( ( ruleExpression ) )
            // InternalAnn.g:3217:1: ( ruleExpression )
            {
            // InternalAnn.g:3217:1: ( ruleExpression )
            // InternalAnn.g:3218:2: ruleExpression
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
    // InternalAnn.g:3227:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3231:1: ( rule__Primary__Group_2__2__Impl )
            // InternalAnn.g:3232:2: rule__Primary__Group_2__2__Impl
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
    // InternalAnn.g:3238:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3242:1: ( ( ')' ) )
            // InternalAnn.g:3243:1: ( ')' )
            {
            // InternalAnn.g:3243:1: ( ')' )
            // InternalAnn.g:3244:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAnn.g:3254:1: rule__Euler__Group__0 : rule__Euler__Group__0__Impl rule__Euler__Group__1 ;
    public final void rule__Euler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3258:1: ( rule__Euler__Group__0__Impl rule__Euler__Group__1 )
            // InternalAnn.g:3259:2: rule__Euler__Group__0__Impl rule__Euler__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAnn.g:3266:1: rule__Euler__Group__0__Impl : ( 'e(' ) ;
    public final void rule__Euler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3270:1: ( ( 'e(' ) )
            // InternalAnn.g:3271:1: ( 'e(' )
            {
            // InternalAnn.g:3271:1: ( 'e(' )
            // InternalAnn.g:3272:2: 'e('
            {
             before(grammarAccess.getEulerAccess().getEKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalAnn.g:3281:1: rule__Euler__Group__1 : rule__Euler__Group__1__Impl rule__Euler__Group__2 ;
    public final void rule__Euler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3285:1: ( rule__Euler__Group__1__Impl rule__Euler__Group__2 )
            // InternalAnn.g:3286:2: rule__Euler__Group__1__Impl rule__Euler__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalAnn.g:3293:1: rule__Euler__Group__1__Impl : ( ( rule__Euler__ValueAssignment_1 ) ) ;
    public final void rule__Euler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3297:1: ( ( ( rule__Euler__ValueAssignment_1 ) ) )
            // InternalAnn.g:3298:1: ( ( rule__Euler__ValueAssignment_1 ) )
            {
            // InternalAnn.g:3298:1: ( ( rule__Euler__ValueAssignment_1 ) )
            // InternalAnn.g:3299:2: ( rule__Euler__ValueAssignment_1 )
            {
             before(grammarAccess.getEulerAccess().getValueAssignment_1()); 
            // InternalAnn.g:3300:2: ( rule__Euler__ValueAssignment_1 )
            // InternalAnn.g:3300:3: rule__Euler__ValueAssignment_1
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
    // InternalAnn.g:3308:1: rule__Euler__Group__2 : rule__Euler__Group__2__Impl ;
    public final void rule__Euler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3312:1: ( rule__Euler__Group__2__Impl )
            // InternalAnn.g:3313:2: rule__Euler__Group__2__Impl
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
    // InternalAnn.g:3319:1: rule__Euler__Group__2__Impl : ( ')' ) ;
    public final void rule__Euler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3323:1: ( ( ')' ) )
            // InternalAnn.g:3324:1: ( ')' )
            {
            // InternalAnn.g:3324:1: ( ')' )
            // InternalAnn.g:3325:2: ')'
            {
             before(grammarAccess.getEulerAccess().getRightParenthesisKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAnn.g:3335:1: rule__NLog__Group__0 : rule__NLog__Group__0__Impl rule__NLog__Group__1 ;
    public final void rule__NLog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3339:1: ( rule__NLog__Group__0__Impl rule__NLog__Group__1 )
            // InternalAnn.g:3340:2: rule__NLog__Group__0__Impl rule__NLog__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAnn.g:3347:1: rule__NLog__Group__0__Impl : ( 'nlog(' ) ;
    public final void rule__NLog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3351:1: ( ( 'nlog(' ) )
            // InternalAnn.g:3352:1: ( 'nlog(' )
            {
            // InternalAnn.g:3352:1: ( 'nlog(' )
            // InternalAnn.g:3353:2: 'nlog('
            {
             before(grammarAccess.getNLogAccess().getNlogKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalAnn.g:3362:1: rule__NLog__Group__1 : rule__NLog__Group__1__Impl rule__NLog__Group__2 ;
    public final void rule__NLog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3366:1: ( rule__NLog__Group__1__Impl rule__NLog__Group__2 )
            // InternalAnn.g:3367:2: rule__NLog__Group__1__Impl rule__NLog__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalAnn.g:3374:1: rule__NLog__Group__1__Impl : ( ( rule__NLog__ValueAssignment_1 ) ) ;
    public final void rule__NLog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3378:1: ( ( ( rule__NLog__ValueAssignment_1 ) ) )
            // InternalAnn.g:3379:1: ( ( rule__NLog__ValueAssignment_1 ) )
            {
            // InternalAnn.g:3379:1: ( ( rule__NLog__ValueAssignment_1 ) )
            // InternalAnn.g:3380:2: ( rule__NLog__ValueAssignment_1 )
            {
             before(grammarAccess.getNLogAccess().getValueAssignment_1()); 
            // InternalAnn.g:3381:2: ( rule__NLog__ValueAssignment_1 )
            // InternalAnn.g:3381:3: rule__NLog__ValueAssignment_1
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
    // InternalAnn.g:3389:1: rule__NLog__Group__2 : rule__NLog__Group__2__Impl ;
    public final void rule__NLog__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3393:1: ( rule__NLog__Group__2__Impl )
            // InternalAnn.g:3394:2: rule__NLog__Group__2__Impl
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
    // InternalAnn.g:3400:1: rule__NLog__Group__2__Impl : ( ')' ) ;
    public final void rule__NLog__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3404:1: ( ( ')' ) )
            // InternalAnn.g:3405:1: ( ')' )
            {
            // InternalAnn.g:3405:1: ( ')' )
            // InternalAnn.g:3406:2: ')'
            {
             before(grammarAccess.getNLogAccess().getRightParenthesisKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAnn.g:3416:1: rule__Sin__Group__0 : rule__Sin__Group__0__Impl rule__Sin__Group__1 ;
    public final void rule__Sin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3420:1: ( rule__Sin__Group__0__Impl rule__Sin__Group__1 )
            // InternalAnn.g:3421:2: rule__Sin__Group__0__Impl rule__Sin__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAnn.g:3428:1: rule__Sin__Group__0__Impl : ( 'sin(' ) ;
    public final void rule__Sin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3432:1: ( ( 'sin(' ) )
            // InternalAnn.g:3433:1: ( 'sin(' )
            {
            // InternalAnn.g:3433:1: ( 'sin(' )
            // InternalAnn.g:3434:2: 'sin('
            {
             before(grammarAccess.getSinAccess().getSinKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalAnn.g:3443:1: rule__Sin__Group__1 : rule__Sin__Group__1__Impl rule__Sin__Group__2 ;
    public final void rule__Sin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3447:1: ( rule__Sin__Group__1__Impl rule__Sin__Group__2 )
            // InternalAnn.g:3448:2: rule__Sin__Group__1__Impl rule__Sin__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalAnn.g:3455:1: rule__Sin__Group__1__Impl : ( ( rule__Sin__ValueAssignment_1 ) ) ;
    public final void rule__Sin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3459:1: ( ( ( rule__Sin__ValueAssignment_1 ) ) )
            // InternalAnn.g:3460:1: ( ( rule__Sin__ValueAssignment_1 ) )
            {
            // InternalAnn.g:3460:1: ( ( rule__Sin__ValueAssignment_1 ) )
            // InternalAnn.g:3461:2: ( rule__Sin__ValueAssignment_1 )
            {
             before(grammarAccess.getSinAccess().getValueAssignment_1()); 
            // InternalAnn.g:3462:2: ( rule__Sin__ValueAssignment_1 )
            // InternalAnn.g:3462:3: rule__Sin__ValueAssignment_1
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
    // InternalAnn.g:3470:1: rule__Sin__Group__2 : rule__Sin__Group__2__Impl ;
    public final void rule__Sin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3474:1: ( rule__Sin__Group__2__Impl )
            // InternalAnn.g:3475:2: rule__Sin__Group__2__Impl
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
    // InternalAnn.g:3481:1: rule__Sin__Group__2__Impl : ( ')' ) ;
    public final void rule__Sin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3485:1: ( ( ')' ) )
            // InternalAnn.g:3486:1: ( ')' )
            {
            // InternalAnn.g:3486:1: ( ')' )
            // InternalAnn.g:3487:2: ')'
            {
             before(grammarAccess.getSinAccess().getRightParenthesisKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAnn.g:3497:1: rule__Cos__Group__0 : rule__Cos__Group__0__Impl rule__Cos__Group__1 ;
    public final void rule__Cos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3501:1: ( rule__Cos__Group__0__Impl rule__Cos__Group__1 )
            // InternalAnn.g:3502:2: rule__Cos__Group__0__Impl rule__Cos__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAnn.g:3509:1: rule__Cos__Group__0__Impl : ( 'cos(' ) ;
    public final void rule__Cos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3513:1: ( ( 'cos(' ) )
            // InternalAnn.g:3514:1: ( 'cos(' )
            {
            // InternalAnn.g:3514:1: ( 'cos(' )
            // InternalAnn.g:3515:2: 'cos('
            {
             before(grammarAccess.getCosAccess().getCosKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAnn.g:3524:1: rule__Cos__Group__1 : rule__Cos__Group__1__Impl rule__Cos__Group__2 ;
    public final void rule__Cos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3528:1: ( rule__Cos__Group__1__Impl rule__Cos__Group__2 )
            // InternalAnn.g:3529:2: rule__Cos__Group__1__Impl rule__Cos__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalAnn.g:3536:1: rule__Cos__Group__1__Impl : ( ( rule__Cos__ValueAssignment_1 ) ) ;
    public final void rule__Cos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3540:1: ( ( ( rule__Cos__ValueAssignment_1 ) ) )
            // InternalAnn.g:3541:1: ( ( rule__Cos__ValueAssignment_1 ) )
            {
            // InternalAnn.g:3541:1: ( ( rule__Cos__ValueAssignment_1 ) )
            // InternalAnn.g:3542:2: ( rule__Cos__ValueAssignment_1 )
            {
             before(grammarAccess.getCosAccess().getValueAssignment_1()); 
            // InternalAnn.g:3543:2: ( rule__Cos__ValueAssignment_1 )
            // InternalAnn.g:3543:3: rule__Cos__ValueAssignment_1
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
    // InternalAnn.g:3551:1: rule__Cos__Group__2 : rule__Cos__Group__2__Impl ;
    public final void rule__Cos__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3555:1: ( rule__Cos__Group__2__Impl )
            // InternalAnn.g:3556:2: rule__Cos__Group__2__Impl
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
    // InternalAnn.g:3562:1: rule__Cos__Group__2__Impl : ( ')' ) ;
    public final void rule__Cos__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3566:1: ( ( ')' ) )
            // InternalAnn.g:3567:1: ( ')' )
            {
            // InternalAnn.g:3567:1: ( ')' )
            // InternalAnn.g:3568:2: ')'
            {
             before(grammarAccess.getCosAccess().getRightParenthesisKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAnn.g:3578:1: rule__Sqrt__Group__0 : rule__Sqrt__Group__0__Impl rule__Sqrt__Group__1 ;
    public final void rule__Sqrt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3582:1: ( rule__Sqrt__Group__0__Impl rule__Sqrt__Group__1 )
            // InternalAnn.g:3583:2: rule__Sqrt__Group__0__Impl rule__Sqrt__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAnn.g:3590:1: rule__Sqrt__Group__0__Impl : ( 'sqrt(' ) ;
    public final void rule__Sqrt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3594:1: ( ( 'sqrt(' ) )
            // InternalAnn.g:3595:1: ( 'sqrt(' )
            {
            // InternalAnn.g:3595:1: ( 'sqrt(' )
            // InternalAnn.g:3596:2: 'sqrt('
            {
             before(grammarAccess.getSqrtAccess().getSqrtKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAnn.g:3605:1: rule__Sqrt__Group__1 : rule__Sqrt__Group__1__Impl rule__Sqrt__Group__2 ;
    public final void rule__Sqrt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3609:1: ( rule__Sqrt__Group__1__Impl rule__Sqrt__Group__2 )
            // InternalAnn.g:3610:2: rule__Sqrt__Group__1__Impl rule__Sqrt__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalAnn.g:3617:1: rule__Sqrt__Group__1__Impl : ( ( rule__Sqrt__ValueAssignment_1 ) ) ;
    public final void rule__Sqrt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3621:1: ( ( ( rule__Sqrt__ValueAssignment_1 ) ) )
            // InternalAnn.g:3622:1: ( ( rule__Sqrt__ValueAssignment_1 ) )
            {
            // InternalAnn.g:3622:1: ( ( rule__Sqrt__ValueAssignment_1 ) )
            // InternalAnn.g:3623:2: ( rule__Sqrt__ValueAssignment_1 )
            {
             before(grammarAccess.getSqrtAccess().getValueAssignment_1()); 
            // InternalAnn.g:3624:2: ( rule__Sqrt__ValueAssignment_1 )
            // InternalAnn.g:3624:3: rule__Sqrt__ValueAssignment_1
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
    // InternalAnn.g:3632:1: rule__Sqrt__Group__2 : rule__Sqrt__Group__2__Impl ;
    public final void rule__Sqrt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3636:1: ( rule__Sqrt__Group__2__Impl )
            // InternalAnn.g:3637:2: rule__Sqrt__Group__2__Impl
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
    // InternalAnn.g:3643:1: rule__Sqrt__Group__2__Impl : ( ')' ) ;
    public final void rule__Sqrt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3647:1: ( ( ')' ) )
            // InternalAnn.g:3648:1: ( ')' )
            {
            // InternalAnn.g:3648:1: ( ')' )
            // InternalAnn.g:3649:2: ')'
            {
             before(grammarAccess.getSqrtAccess().getRightParenthesisKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAnn.g:3659:1: rule__Power__Group__0 : rule__Power__Group__0__Impl rule__Power__Group__1 ;
    public final void rule__Power__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3663:1: ( rule__Power__Group__0__Impl rule__Power__Group__1 )
            // InternalAnn.g:3664:2: rule__Power__Group__0__Impl rule__Power__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAnn.g:3671:1: rule__Power__Group__0__Impl : ( 'pow(' ) ;
    public final void rule__Power__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3675:1: ( ( 'pow(' ) )
            // InternalAnn.g:3676:1: ( 'pow(' )
            {
            // InternalAnn.g:3676:1: ( 'pow(' )
            // InternalAnn.g:3677:2: 'pow('
            {
             before(grammarAccess.getPowerAccess().getPowKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalAnn.g:3686:1: rule__Power__Group__1 : rule__Power__Group__1__Impl rule__Power__Group__2 ;
    public final void rule__Power__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3690:1: ( rule__Power__Group__1__Impl rule__Power__Group__2 )
            // InternalAnn.g:3691:2: rule__Power__Group__1__Impl rule__Power__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalAnn.g:3698:1: rule__Power__Group__1__Impl : ( ( rule__Power__BaseAssignment_1 ) ) ;
    public final void rule__Power__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3702:1: ( ( ( rule__Power__BaseAssignment_1 ) ) )
            // InternalAnn.g:3703:1: ( ( rule__Power__BaseAssignment_1 ) )
            {
            // InternalAnn.g:3703:1: ( ( rule__Power__BaseAssignment_1 ) )
            // InternalAnn.g:3704:2: ( rule__Power__BaseAssignment_1 )
            {
             before(grammarAccess.getPowerAccess().getBaseAssignment_1()); 
            // InternalAnn.g:3705:2: ( rule__Power__BaseAssignment_1 )
            // InternalAnn.g:3705:3: rule__Power__BaseAssignment_1
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
    // InternalAnn.g:3713:1: rule__Power__Group__2 : rule__Power__Group__2__Impl rule__Power__Group__3 ;
    public final void rule__Power__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3717:1: ( rule__Power__Group__2__Impl rule__Power__Group__3 )
            // InternalAnn.g:3718:2: rule__Power__Group__2__Impl rule__Power__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalAnn.g:3725:1: rule__Power__Group__2__Impl : ( ',' ) ;
    public final void rule__Power__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3729:1: ( ( ',' ) )
            // InternalAnn.g:3730:1: ( ',' )
            {
            // InternalAnn.g:3730:1: ( ',' )
            // InternalAnn.g:3731:2: ','
            {
             before(grammarAccess.getPowerAccess().getCommaKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAnn.g:3740:1: rule__Power__Group__3 : rule__Power__Group__3__Impl rule__Power__Group__4 ;
    public final void rule__Power__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3744:1: ( rule__Power__Group__3__Impl rule__Power__Group__4 )
            // InternalAnn.g:3745:2: rule__Power__Group__3__Impl rule__Power__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalAnn.g:3752:1: rule__Power__Group__3__Impl : ( ( rule__Power__ExponentAssignment_3 ) ) ;
    public final void rule__Power__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3756:1: ( ( ( rule__Power__ExponentAssignment_3 ) ) )
            // InternalAnn.g:3757:1: ( ( rule__Power__ExponentAssignment_3 ) )
            {
            // InternalAnn.g:3757:1: ( ( rule__Power__ExponentAssignment_3 ) )
            // InternalAnn.g:3758:2: ( rule__Power__ExponentAssignment_3 )
            {
             before(grammarAccess.getPowerAccess().getExponentAssignment_3()); 
            // InternalAnn.g:3759:2: ( rule__Power__ExponentAssignment_3 )
            // InternalAnn.g:3759:3: rule__Power__ExponentAssignment_3
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
    // InternalAnn.g:3767:1: rule__Power__Group__4 : rule__Power__Group__4__Impl ;
    public final void rule__Power__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3771:1: ( rule__Power__Group__4__Impl )
            // InternalAnn.g:3772:2: rule__Power__Group__4__Impl
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
    // InternalAnn.g:3778:1: rule__Power__Group__4__Impl : ( ')' ) ;
    public final void rule__Power__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3782:1: ( ( ')' ) )
            // InternalAnn.g:3783:1: ( ')' )
            {
            // InternalAnn.g:3783:1: ( ')' )
            // InternalAnn.g:3784:2: ')'
            {
             before(grammarAccess.getPowerAccess().getRightParenthesisKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAnn.g:3794:1: rule__Letter__Group__0 : rule__Letter__Group__0__Impl rule__Letter__Group__1 ;
    public final void rule__Letter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3798:1: ( rule__Letter__Group__0__Impl rule__Letter__Group__1 )
            // InternalAnn.g:3799:2: rule__Letter__Group__0__Impl rule__Letter__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalAnn.g:3806:1: rule__Letter__Group__0__Impl : ( ( rule__Letter__OperatorAssignment_0 )? ) ;
    public final void rule__Letter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3810:1: ( ( ( rule__Letter__OperatorAssignment_0 )? ) )
            // InternalAnn.g:3811:1: ( ( rule__Letter__OperatorAssignment_0 )? )
            {
            // InternalAnn.g:3811:1: ( ( rule__Letter__OperatorAssignment_0 )? )
            // InternalAnn.g:3812:2: ( rule__Letter__OperatorAssignment_0 )?
            {
             before(grammarAccess.getLetterAccess().getOperatorAssignment_0()); 
            // InternalAnn.g:3813:2: ( rule__Letter__OperatorAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=16 && LA17_0<=17)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAnn.g:3813:3: rule__Letter__OperatorAssignment_0
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
    // InternalAnn.g:3821:1: rule__Letter__Group__1 : rule__Letter__Group__1__Impl ;
    public final void rule__Letter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3825:1: ( rule__Letter__Group__1__Impl )
            // InternalAnn.g:3826:2: rule__Letter__Group__1__Impl
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
    // InternalAnn.g:3832:1: rule__Letter__Group__1__Impl : ( ( rule__Letter__ValueAssignment_1 ) ) ;
    public final void rule__Letter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3836:1: ( ( ( rule__Letter__ValueAssignment_1 ) ) )
            // InternalAnn.g:3837:1: ( ( rule__Letter__ValueAssignment_1 ) )
            {
            // InternalAnn.g:3837:1: ( ( rule__Letter__ValueAssignment_1 ) )
            // InternalAnn.g:3838:2: ( rule__Letter__ValueAssignment_1 )
            {
             before(grammarAccess.getLetterAccess().getValueAssignment_1()); 
            // InternalAnn.g:3839:2: ( rule__Letter__ValueAssignment_1 )
            // InternalAnn.g:3839:3: rule__Letter__ValueAssignment_1
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
    // InternalAnn.g:3848:1: rule__NumberLiteral__Group__0 : rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 ;
    public final void rule__NumberLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3852:1: ( rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 )
            // InternalAnn.g:3853:2: rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalAnn.g:3860:1: rule__NumberLiteral__Group__0__Impl : ( ( rule__NumberLiteral__OperatorAssignment_0 )? ) ;
    public final void rule__NumberLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3864:1: ( ( ( rule__NumberLiteral__OperatorAssignment_0 )? ) )
            // InternalAnn.g:3865:1: ( ( rule__NumberLiteral__OperatorAssignment_0 )? )
            {
            // InternalAnn.g:3865:1: ( ( rule__NumberLiteral__OperatorAssignment_0 )? )
            // InternalAnn.g:3866:2: ( rule__NumberLiteral__OperatorAssignment_0 )?
            {
             before(grammarAccess.getNumberLiteralAccess().getOperatorAssignment_0()); 
            // InternalAnn.g:3867:2: ( rule__NumberLiteral__OperatorAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=16 && LA18_0<=17)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAnn.g:3867:3: rule__NumberLiteral__OperatorAssignment_0
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
    // InternalAnn.g:3875:1: rule__NumberLiteral__Group__1 : rule__NumberLiteral__Group__1__Impl ;
    public final void rule__NumberLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3879:1: ( rule__NumberLiteral__Group__1__Impl )
            // InternalAnn.g:3880:2: rule__NumberLiteral__Group__1__Impl
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
    // InternalAnn.g:3886:1: rule__NumberLiteral__Group__1__Impl : ( ( rule__NumberLiteral__ValueAssignment_1 ) ) ;
    public final void rule__NumberLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3890:1: ( ( ( rule__NumberLiteral__ValueAssignment_1 ) ) )
            // InternalAnn.g:3891:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            {
            // InternalAnn.g:3891:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            // InternalAnn.g:3892:2: ( rule__NumberLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment_1()); 
            // InternalAnn.g:3893:2: ( rule__NumberLiteral__ValueAssignment_1 )
            // InternalAnn.g:3893:3: rule__NumberLiteral__ValueAssignment_1
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
    // InternalAnn.g:3902:1: rule__ANNModel__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ANNModel__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3906:1: ( ( RULE_ID ) )
            // InternalAnn.g:3907:2: ( RULE_ID )
            {
            // InternalAnn.g:3907:2: ( RULE_ID )
            // InternalAnn.g:3908:3: RULE_ID
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
    // InternalAnn.g:3917:1: rule__ANNModel__AlphaAssignment_3 : ( ruleDECIMAL ) ;
    public final void rule__ANNModel__AlphaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3921:1: ( ( ruleDECIMAL ) )
            // InternalAnn.g:3922:2: ( ruleDECIMAL )
            {
            // InternalAnn.g:3922:2: ( ruleDECIMAL )
            // InternalAnn.g:3923:3: ruleDECIMAL
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
    // InternalAnn.g:3932:1: rule__ANNModel__EpochsAssignment_5 : ( RULE_INT ) ;
    public final void rule__ANNModel__EpochsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3936:1: ( ( RULE_INT ) )
            // InternalAnn.g:3937:2: ( RULE_INT )
            {
            // InternalAnn.g:3937:2: ( RULE_INT )
            // InternalAnn.g:3938:3: RULE_INT
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


    // $ANTLR start "rule__ANNModel__ConstraintsAssignment_6"
    // InternalAnn.g:3947:1: rule__ANNModel__ConstraintsAssignment_6 : ( ruleConstraint ) ;
    public final void rule__ANNModel__ConstraintsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3951:1: ( ( ruleConstraint ) )
            // InternalAnn.g:3952:2: ( ruleConstraint )
            {
            // InternalAnn.g:3952:2: ( ruleConstraint )
            // InternalAnn.g:3953:3: ruleConstraint
            {
             before(grammarAccess.getANNModelAccess().getConstraintsConstraintParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getANNModelAccess().getConstraintsConstraintParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__ConstraintsAssignment_6"


    // $ANTLR start "rule__ANNModel__ActivationAssignment_7"
    // InternalAnn.g:3962:1: rule__ANNModel__ActivationAssignment_7 : ( ruleActivation ) ;
    public final void rule__ANNModel__ActivationAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3966:1: ( ( ruleActivation ) )
            // InternalAnn.g:3967:2: ( ruleActivation )
            {
            // InternalAnn.g:3967:2: ( ruleActivation )
            // InternalAnn.g:3968:3: ruleActivation
            {
             before(grammarAccess.getANNModelAccess().getActivationActivationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleActivation();

            state._fsp--;

             after(grammarAccess.getANNModelAccess().getActivationActivationParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__ActivationAssignment_7"


    // $ANTLR start "rule__ANNModel__LayerAssignment_8"
    // InternalAnn.g:3977:1: rule__ANNModel__LayerAssignment_8 : ( ruleLayer ) ;
    public final void rule__ANNModel__LayerAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3981:1: ( ( ruleLayer ) )
            // InternalAnn.g:3982:2: ( ruleLayer )
            {
            // InternalAnn.g:3982:2: ( ruleLayer )
            // InternalAnn.g:3983:3: ruleLayer
            {
             before(grammarAccess.getANNModelAccess().getLayerLayerParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getANNModelAccess().getLayerLayerParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANNModel__LayerAssignment_8"


    // $ANTLR start "rule__Hidden__SizeAssignment_3"
    // InternalAnn.g:3992:1: rule__Hidden__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__Hidden__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:3996:1: ( ( RULE_INT ) )
            // InternalAnn.g:3997:2: ( RULE_INT )
            {
            // InternalAnn.g:3997:2: ( RULE_INT )
            // InternalAnn.g:3998:3: RULE_INT
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
    // InternalAnn.g:4007:1: rule__Hidden__L_ruleAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Hidden__L_ruleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4011:1: ( ( ( RULE_ID ) ) )
            // InternalAnn.g:4012:2: ( ( RULE_ID ) )
            {
            // InternalAnn.g:4012:2: ( ( RULE_ID ) )
            // InternalAnn.g:4013:3: ( RULE_ID )
            {
             before(grammarAccess.getHiddenAccess().getL_ruleActivationCrossReference_5_0()); 
            // InternalAnn.g:4014:3: ( RULE_ID )
            // InternalAnn.g:4015:4: RULE_ID
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
    // InternalAnn.g:4026:1: rule__Input__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__Input__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4030:1: ( ( RULE_INT ) )
            // InternalAnn.g:4031:2: ( RULE_INT )
            {
            // InternalAnn.g:4031:2: ( RULE_INT )
            // InternalAnn.g:4032:3: RULE_INT
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


    // $ANTLR start "rule__Input__SourceAssignment_5"
    // InternalAnn.g:4041:1: rule__Input__SourceAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Input__SourceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4045:1: ( ( RULE_STRING ) )
            // InternalAnn.g:4046:2: ( RULE_STRING )
            {
            // InternalAnn.g:4046:2: ( RULE_STRING )
            // InternalAnn.g:4047:3: RULE_STRING
            {
             before(grammarAccess.getInputAccess().getSourceSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getSourceSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__SourceAssignment_5"


    // $ANTLR start "rule__Input__RestrictionsAssignment_7"
    // InternalAnn.g:4056:1: rule__Input__RestrictionsAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Input__RestrictionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4060:1: ( ( ( RULE_ID ) ) )
            // InternalAnn.g:4061:2: ( ( RULE_ID ) )
            {
            // InternalAnn.g:4061:2: ( ( RULE_ID ) )
            // InternalAnn.g:4062:3: ( RULE_ID )
            {
             before(grammarAccess.getInputAccess().getRestrictionsConstraintCrossReference_7_0()); 
            // InternalAnn.g:4063:3: ( RULE_ID )
            // InternalAnn.g:4064:4: RULE_ID
            {
             before(grammarAccess.getInputAccess().getRestrictionsConstraintIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getRestrictionsConstraintIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getInputAccess().getRestrictionsConstraintCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__RestrictionsAssignment_7"


    // $ANTLR start "rule__Input__MoreRestrictionsAssignment_8"
    // InternalAnn.g:4075:1: rule__Input__MoreRestrictionsAssignment_8 : ( ruleRestriction ) ;
    public final void rule__Input__MoreRestrictionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4079:1: ( ( ruleRestriction ) )
            // InternalAnn.g:4080:2: ( ruleRestriction )
            {
            // InternalAnn.g:4080:2: ( ruleRestriction )
            // InternalAnn.g:4081:3: ruleRestriction
            {
             before(grammarAccess.getInputAccess().getMoreRestrictionsRestrictionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleRestriction();

            state._fsp--;

             after(grammarAccess.getInputAccess().getMoreRestrictionsRestrictionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__MoreRestrictionsAssignment_8"


    // $ANTLR start "rule__Restriction__ConstraintAssignment_1"
    // InternalAnn.g:4090:1: rule__Restriction__ConstraintAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Restriction__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4094:1: ( ( ( RULE_ID ) ) )
            // InternalAnn.g:4095:2: ( ( RULE_ID ) )
            {
            // InternalAnn.g:4095:2: ( ( RULE_ID ) )
            // InternalAnn.g:4096:3: ( RULE_ID )
            {
             before(grammarAccess.getRestrictionAccess().getConstraintConstraintCrossReference_1_0()); 
            // InternalAnn.g:4097:3: ( RULE_ID )
            // InternalAnn.g:4098:4: RULE_ID
            {
             before(grammarAccess.getRestrictionAccess().getConstraintConstraintIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRestrictionAccess().getConstraintConstraintIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRestrictionAccess().getConstraintConstraintCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__ConstraintAssignment_1"


    // $ANTLR start "rule__Constraint__NameAssignment_1"
    // InternalAnn.g:4109:1: rule__Constraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4113:1: ( ( RULE_ID ) )
            // InternalAnn.g:4114:2: ( RULE_ID )
            {
            // InternalAnn.g:4114:2: ( RULE_ID )
            // InternalAnn.g:4115:3: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__NameAssignment_1"


    // $ANTLR start "rule__Constraint__FieldAssignment_3"
    // InternalAnn.g:4124:1: rule__Constraint__FieldAssignment_3 : ( RULE_INT ) ;
    public final void rule__Constraint__FieldAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4128:1: ( ( RULE_INT ) )
            // InternalAnn.g:4129:2: ( RULE_INT )
            {
            // InternalAnn.g:4129:2: ( RULE_INT )
            // InternalAnn.g:4130:3: RULE_INT
            {
             before(grammarAccess.getConstraintAccess().getFieldINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getFieldINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__FieldAssignment_3"


    // $ANTLR start "rule__Constraint__FieldsAssignment_4"
    // InternalAnn.g:4139:1: rule__Constraint__FieldsAssignment_4 : ( ruleField ) ;
    public final void rule__Constraint__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4143:1: ( ( ruleField ) )
            // InternalAnn.g:4144:2: ( ruleField )
            {
            // InternalAnn.g:4144:2: ( ruleField )
            // InternalAnn.g:4145:3: ruleField
            {
             before(grammarAccess.getConstraintAccess().getFieldsFieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getFieldsFieldParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__FieldsAssignment_4"


    // $ANTLR start "rule__Constraint__ConditionAssignment_7"
    // InternalAnn.g:4154:1: rule__Constraint__ConditionAssignment_7 : ( ruleCondition ) ;
    public final void rule__Constraint__ConditionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4158:1: ( ( ruleCondition ) )
            // InternalAnn.g:4159:2: ( ruleCondition )
            {
            // InternalAnn.g:4159:2: ( ruleCondition )
            // InternalAnn.g:4160:3: ruleCondition
            {
             before(grammarAccess.getConstraintAccess().getConditionConditionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getConditionConditionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ConditionAssignment_7"


    // $ANTLR start "rule__Field__FieldAssignment_1"
    // InternalAnn.g:4169:1: rule__Field__FieldAssignment_1 : ( RULE_INT ) ;
    public final void rule__Field__FieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4173:1: ( ( RULE_INT ) )
            // InternalAnn.g:4174:2: ( RULE_INT )
            {
            // InternalAnn.g:4174:2: ( RULE_INT )
            // InternalAnn.g:4175:3: RULE_INT
            {
             before(grammarAccess.getFieldAccess().getFieldINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getFieldINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__FieldAssignment_1"


    // $ANTLR start "rule__Condition__ConditionAssignment_0"
    // InternalAnn.g:4184:1: rule__Condition__ConditionAssignment_0 : ( ruleConditionalOperator ) ;
    public final void rule__Condition__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4188:1: ( ( ruleConditionalOperator ) )
            // InternalAnn.g:4189:2: ( ruleConditionalOperator )
            {
            // InternalAnn.g:4189:2: ( ruleConditionalOperator )
            // InternalAnn.g:4190:3: ruleConditionalOperator
            {
             before(grammarAccess.getConditionAccess().getConditionConditionalOperatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalOperator();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getConditionConditionalOperatorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ConditionAssignment_0"


    // $ANTLR start "rule__Condition__Num2Assignment_1"
    // InternalAnn.g:4199:1: rule__Condition__Num2Assignment_1 : ( ruleNumberTypes ) ;
    public final void rule__Condition__Num2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4203:1: ( ( ruleNumberTypes ) )
            // InternalAnn.g:4204:2: ( ruleNumberTypes )
            {
            // InternalAnn.g:4204:2: ( ruleNumberTypes )
            // InternalAnn.g:4205:3: ruleNumberTypes
            {
             before(grammarAccess.getConditionAccess().getNum2NumberTypesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberTypes();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getNum2NumberTypesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Num2Assignment_1"


    // $ANTLR start "rule__Output__SizeAssignment_3"
    // InternalAnn.g:4214:1: rule__Output__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__Output__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4218:1: ( ( RULE_INT ) )
            // InternalAnn.g:4219:2: ( RULE_INT )
            {
            // InternalAnn.g:4219:2: ( RULE_INT )
            // InternalAnn.g:4220:3: RULE_INT
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
    // InternalAnn.g:4229:1: rule__Output__L_ruleAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Output__L_ruleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4233:1: ( ( ( RULE_ID ) ) )
            // InternalAnn.g:4234:2: ( ( RULE_ID ) )
            {
            // InternalAnn.g:4234:2: ( ( RULE_ID ) )
            // InternalAnn.g:4235:3: ( RULE_ID )
            {
             before(grammarAccess.getOutputAccess().getL_ruleActivationCrossReference_5_0()); 
            // InternalAnn.g:4236:3: ( RULE_ID )
            // InternalAnn.g:4237:4: RULE_ID
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
    // InternalAnn.g:4248:1: rule__External__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__External__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4252:1: ( ( RULE_ID ) )
            // InternalAnn.g:4253:2: ( RULE_ID )
            {
            // InternalAnn.g:4253:2: ( RULE_ID )
            // InternalAnn.g:4254:3: RULE_ID
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
    // InternalAnn.g:4263:1: rule__Sigmoid__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Sigmoid__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4267:1: ( ( RULE_ID ) )
            // InternalAnn.g:4268:2: ( RULE_ID )
            {
            // InternalAnn.g:4268:2: ( RULE_ID )
            // InternalAnn.g:4269:3: RULE_ID
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
    // InternalAnn.g:4278:1: rule__Sigmoid__RuleAssignment_1 : ( ( 'sigmoid' ) ) ;
    public final void rule__Sigmoid__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4282:1: ( ( ( 'sigmoid' ) ) )
            // InternalAnn.g:4283:2: ( ( 'sigmoid' ) )
            {
            // InternalAnn.g:4283:2: ( ( 'sigmoid' ) )
            // InternalAnn.g:4284:3: ( 'sigmoid' )
            {
             before(grammarAccess.getSigmoidAccess().getRuleSigmoidKeyword_1_0()); 
            // InternalAnn.g:4285:3: ( 'sigmoid' )
            // InternalAnn.g:4286:4: 'sigmoid'
            {
             before(grammarAccess.getSigmoidAccess().getRuleSigmoidKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalAnn.g:4297:1: rule__Tansig__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Tansig__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4301:1: ( ( RULE_ID ) )
            // InternalAnn.g:4302:2: ( RULE_ID )
            {
            // InternalAnn.g:4302:2: ( RULE_ID )
            // InternalAnn.g:4303:3: RULE_ID
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
    // InternalAnn.g:4312:1: rule__Tansig__RuleAssignment_1 : ( ( 'tansig' ) ) ;
    public final void rule__Tansig__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4316:1: ( ( ( 'tansig' ) ) )
            // InternalAnn.g:4317:2: ( ( 'tansig' ) )
            {
            // InternalAnn.g:4317:2: ( ( 'tansig' ) )
            // InternalAnn.g:4318:3: ( 'tansig' )
            {
             before(grammarAccess.getTansigAccess().getRuleTansigKeyword_1_0()); 
            // InternalAnn.g:4319:3: ( 'tansig' )
            // InternalAnn.g:4320:4: 'tansig'
            {
             before(grammarAccess.getTansigAccess().getRuleTansigKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalAnn.g:4331:1: rule__Custom__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Custom__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4335:1: ( ( RULE_ID ) )
            // InternalAnn.g:4336:2: ( RULE_ID )
            {
            // InternalAnn.g:4336:2: ( RULE_ID )
            // InternalAnn.g:4337:3: RULE_ID
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
    // InternalAnn.g:4346:1: rule__Custom__ExpAssignment_5 : ( ruleExpression ) ;
    public final void rule__Custom__ExpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4350:1: ( ( ruleExpression ) )
            // InternalAnn.g:4351:2: ( ruleExpression )
            {
            // InternalAnn.g:4351:2: ( ruleExpression )
            // InternalAnn.g:4352:3: ruleExpression
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
    // InternalAnn.g:4361:1: rule__Custom__DerAssignment_8 : ( ruleExpression ) ;
    public final void rule__Custom__DerAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4365:1: ( ( ruleExpression ) )
            // InternalAnn.g:4366:2: ( ruleExpression )
            {
            // InternalAnn.g:4366:2: ( ruleExpression )
            // InternalAnn.g:4367:3: ruleExpression
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
    // InternalAnn.g:4376:1: rule__Expression__OperatorAssignment_1_1 : ( rulePartOperator ) ;
    public final void rule__Expression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4380:1: ( ( rulePartOperator ) )
            // InternalAnn.g:4381:2: ( rulePartOperator )
            {
            // InternalAnn.g:4381:2: ( rulePartOperator )
            // InternalAnn.g:4382:3: rulePartOperator
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
    // InternalAnn.g:4391:1: rule__Expression__RightAssignment_1_2 : ( ruleFactor ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4395:1: ( ( ruleFactor ) )
            // InternalAnn.g:4396:2: ( ruleFactor )
            {
            // InternalAnn.g:4396:2: ( ruleFactor )
            // InternalAnn.g:4397:3: ruleFactor
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
    // InternalAnn.g:4406:1: rule__Factor__OperatorAssignment_1_1 : ( ruleFactorOperator ) ;
    public final void rule__Factor__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4410:1: ( ( ruleFactorOperator ) )
            // InternalAnn.g:4411:2: ( ruleFactorOperator )
            {
            // InternalAnn.g:4411:2: ( ruleFactorOperator )
            // InternalAnn.g:4412:3: ruleFactorOperator
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
    // InternalAnn.g:4421:1: rule__Factor__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Factor__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4425:1: ( ( rulePrimary ) )
            // InternalAnn.g:4426:2: ( rulePrimary )
            {
            // InternalAnn.g:4426:2: ( rulePrimary )
            // InternalAnn.g:4427:3: rulePrimary
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
    // InternalAnn.g:4436:1: rule__Euler__ValueAssignment_1 : ( ruleExpression ) ;
    public final void rule__Euler__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4440:1: ( ( ruleExpression ) )
            // InternalAnn.g:4441:2: ( ruleExpression )
            {
            // InternalAnn.g:4441:2: ( ruleExpression )
            // InternalAnn.g:4442:3: ruleExpression
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
    // InternalAnn.g:4451:1: rule__NLog__ValueAssignment_1 : ( ruleExpression ) ;
    public final void rule__NLog__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4455:1: ( ( ruleExpression ) )
            // InternalAnn.g:4456:2: ( ruleExpression )
            {
            // InternalAnn.g:4456:2: ( ruleExpression )
            // InternalAnn.g:4457:3: ruleExpression
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
    // InternalAnn.g:4466:1: rule__Sin__ValueAssignment_1 : ( ruleExpression ) ;
    public final void rule__Sin__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4470:1: ( ( ruleExpression ) )
            // InternalAnn.g:4471:2: ( ruleExpression )
            {
            // InternalAnn.g:4471:2: ( ruleExpression )
            // InternalAnn.g:4472:3: ruleExpression
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
    // InternalAnn.g:4481:1: rule__Cos__ValueAssignment_1 : ( ruleExpression ) ;
    public final void rule__Cos__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4485:1: ( ( ruleExpression ) )
            // InternalAnn.g:4486:2: ( ruleExpression )
            {
            // InternalAnn.g:4486:2: ( ruleExpression )
            // InternalAnn.g:4487:3: ruleExpression
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
    // InternalAnn.g:4496:1: rule__Sqrt__ValueAssignment_1 : ( ruleExpression ) ;
    public final void rule__Sqrt__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4500:1: ( ( ruleExpression ) )
            // InternalAnn.g:4501:2: ( ruleExpression )
            {
            // InternalAnn.g:4501:2: ( ruleExpression )
            // InternalAnn.g:4502:3: ruleExpression
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
    // InternalAnn.g:4511:1: rule__Power__BaseAssignment_1 : ( ruleExpression ) ;
    public final void rule__Power__BaseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4515:1: ( ( ruleExpression ) )
            // InternalAnn.g:4516:2: ( ruleExpression )
            {
            // InternalAnn.g:4516:2: ( ruleExpression )
            // InternalAnn.g:4517:3: ruleExpression
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
    // InternalAnn.g:4526:1: rule__Power__ExponentAssignment_3 : ( ruleExpression ) ;
    public final void rule__Power__ExponentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4530:1: ( ( ruleExpression ) )
            // InternalAnn.g:4531:2: ( ruleExpression )
            {
            // InternalAnn.g:4531:2: ( ruleExpression )
            // InternalAnn.g:4532:3: ruleExpression
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
    // InternalAnn.g:4541:1: rule__Letter__OperatorAssignment_0 : ( rulePartOperator ) ;
    public final void rule__Letter__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4545:1: ( ( rulePartOperator ) )
            // InternalAnn.g:4546:2: ( rulePartOperator )
            {
            // InternalAnn.g:4546:2: ( rulePartOperator )
            // InternalAnn.g:4547:3: rulePartOperator
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
    // InternalAnn.g:4556:1: rule__Letter__ValueAssignment_1 : ( ( 'x' ) ) ;
    public final void rule__Letter__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4560:1: ( ( ( 'x' ) ) )
            // InternalAnn.g:4561:2: ( ( 'x' ) )
            {
            // InternalAnn.g:4561:2: ( ( 'x' ) )
            // InternalAnn.g:4562:3: ( 'x' )
            {
             before(grammarAccess.getLetterAccess().getValueXKeyword_1_0()); 
            // InternalAnn.g:4563:3: ( 'x' )
            // InternalAnn.g:4564:4: 'x'
            {
             before(grammarAccess.getLetterAccess().getValueXKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalAnn.g:4575:1: rule__NumberLiteral__OperatorAssignment_0 : ( rulePartOperator ) ;
    public final void rule__NumberLiteral__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4579:1: ( ( rulePartOperator ) )
            // InternalAnn.g:4580:2: ( rulePartOperator )
            {
            // InternalAnn.g:4580:2: ( rulePartOperator )
            // InternalAnn.g:4581:3: rulePartOperator
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
    // InternalAnn.g:4590:1: rule__NumberLiteral__ValueAssignment_1 : ( ruleNumberTypes ) ;
    public final void rule__NumberLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnn.g:4594:1: ( ( ruleNumberTypes ) )
            // InternalAnn.g:4595:2: ( ruleNumberTypes )
            {
            // InternalAnn.g:4595:2: ( ruleNumberTypes )
            // InternalAnn.g:4596:3: ruleNumberTypes
            {
             before(grammarAccess.getNumberLiteralAccess().getValueNumberTypesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberTypes();

            state._fsp--;

             after(grammarAccess.getNumberLiteralAccess().getValueNumberTypesParserRuleCall_1_0()); 

            }


            }

        }
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000912800020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000812000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080800020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00027E0200030010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000030000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000030010L});

}