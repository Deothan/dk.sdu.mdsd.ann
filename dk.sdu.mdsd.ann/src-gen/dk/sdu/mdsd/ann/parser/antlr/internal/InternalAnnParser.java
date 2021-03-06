package dk.sdu.mdsd.ann.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mdsd.ann.services.AnnGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'alpha'", "'epochs'", "'}'", "'.'", "'hidden'", "'size'", "'activation'", "'in'", "'source'", "'constraints'", "','", "'constraint'", "'('", "')'", "'=='", "'<'", "'>'", "'<='", "'>='", "'out'", "'external'", "'sigmoid'", "'tansig'", "'(x)'", "'function'", "'='", "'derivative'", "'e('", "'nlog('", "'sin('", "'cos('", "'sqrt('", "'pow('", "'x'", "'+'", "'-'", "'*'", "'/'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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

        public InternalAnnParser(TokenStream input, AnnGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ANNModel";
       	}

       	@Override
       	protected AnnGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleANNModel"
    // InternalAnn.g:64:1: entryRuleANNModel returns [EObject current=null] : iv_ruleANNModel= ruleANNModel EOF ;
    public final EObject entryRuleANNModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANNModel = null;


        try {
            // InternalAnn.g:64:49: (iv_ruleANNModel= ruleANNModel EOF )
            // InternalAnn.g:65:2: iv_ruleANNModel= ruleANNModel EOF
            {
             newCompositeNode(grammarAccess.getANNModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleANNModel=ruleANNModel();

            state._fsp--;

             current =iv_ruleANNModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleANNModel"


    // $ANTLR start "ruleANNModel"
    // InternalAnn.g:71:1: ruleANNModel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_constraints_6_0= ruleConstraint ) )* ( (lv_Activation_7_0= ruleActivation ) )* ( (lv_Layer_8_0= ruleLayer ) )* otherlv_9= '}' ) ;
    public final EObject ruleANNModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_epochs_5_0=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_alpha_3_0 = null;

        EObject lv_constraints_6_0 = null;

        EObject lv_Activation_7_0 = null;

        EObject lv_Layer_8_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:77:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_constraints_6_0= ruleConstraint ) )* ( (lv_Activation_7_0= ruleActivation ) )* ( (lv_Layer_8_0= ruleLayer ) )* otherlv_9= '}' ) )
            // InternalAnn.g:78:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_constraints_6_0= ruleConstraint ) )* ( (lv_Activation_7_0= ruleActivation ) )* ( (lv_Layer_8_0= ruleLayer ) )* otherlv_9= '}' )
            {
            // InternalAnn.g:78:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_constraints_6_0= ruleConstraint ) )* ( (lv_Activation_7_0= ruleActivation ) )* ( (lv_Layer_8_0= ruleLayer ) )* otherlv_9= '}' )
            // InternalAnn.g:79:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_constraints_6_0= ruleConstraint ) )* ( (lv_Activation_7_0= ruleActivation ) )* ( (lv_Layer_8_0= ruleLayer ) )* otherlv_9= '}'
            {
            // InternalAnn.g:79:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnn.g:80:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnn.g:80:4: (lv_name_0_0= RULE_ID )
            // InternalAnn.g:81:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getANNModelAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getANNModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getANNModelAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getANNModelAccess().getAlphaKeyword_2());
            		
            // InternalAnn.g:105:3: ( (lv_alpha_3_0= ruleDECIMAL ) )
            // InternalAnn.g:106:4: (lv_alpha_3_0= ruleDECIMAL )
            {
            // InternalAnn.g:106:4: (lv_alpha_3_0= ruleDECIMAL )
            // InternalAnn.g:107:5: lv_alpha_3_0= ruleDECIMAL
            {

            					newCompositeNode(grammarAccess.getANNModelAccess().getAlphaDECIMALParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_alpha_3_0=ruleDECIMAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getANNModelRule());
            					}
            					set(
            						current,
            						"alpha",
            						lv_alpha_3_0,
            						"dk.sdu.mdsd.ann.Ann.DECIMAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getANNModelAccess().getEpochsKeyword_4());
            		
            // InternalAnn.g:128:3: ( (lv_epochs_5_0= RULE_INT ) )
            // InternalAnn.g:129:4: (lv_epochs_5_0= RULE_INT )
            {
            // InternalAnn.g:129:4: (lv_epochs_5_0= RULE_INT )
            // InternalAnn.g:130:5: lv_epochs_5_0= RULE_INT
            {
            lv_epochs_5_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_epochs_5_0, grammarAccess.getANNModelAccess().getEpochsINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getANNModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"epochs",
            						lv_epochs_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalAnn.g:146:3: ( (lv_constraints_6_0= ruleConstraint ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAnn.g:147:4: (lv_constraints_6_0= ruleConstraint )
            	    {
            	    // InternalAnn.g:147:4: (lv_constraints_6_0= ruleConstraint )
            	    // InternalAnn.g:148:5: lv_constraints_6_0= ruleConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getANNModelAccess().getConstraintsConstraintParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_constraints_6_0=ruleConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getANNModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_6_0,
            	    						"dk.sdu.mdsd.ann.Ann.Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalAnn.g:165:3: ( (lv_Activation_7_0= ruleActivation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAnn.g:166:4: (lv_Activation_7_0= ruleActivation )
            	    {
            	    // InternalAnn.g:166:4: (lv_Activation_7_0= ruleActivation )
            	    // InternalAnn.g:167:5: lv_Activation_7_0= ruleActivation
            	    {

            	    					newCompositeNode(grammarAccess.getANNModelAccess().getActivationActivationParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_Activation_7_0=ruleActivation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getANNModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Activation",
            	    						lv_Activation_7_0,
            	    						"dk.sdu.mdsd.ann.Ann.Activation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalAnn.g:184:3: ( (lv_Layer_8_0= ruleLayer ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||LA3_0==19||LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAnn.g:185:4: (lv_Layer_8_0= ruleLayer )
            	    {
            	    // InternalAnn.g:185:4: (lv_Layer_8_0= ruleLayer )
            	    // InternalAnn.g:186:5: lv_Layer_8_0= ruleLayer
            	    {

            	    					newCompositeNode(grammarAccess.getANNModelAccess().getLayerLayerParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_Layer_8_0=ruleLayer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getANNModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Layer",
            	    						lv_Layer_8_0,
            	    						"dk.sdu.mdsd.ann.Ann.Layer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getANNModelAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleANNModel"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalAnn.g:211:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalAnn.g:211:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalAnn.g:212:2: iv_ruleDECIMAL= ruleDECIMAL EOF
            {
             newCompositeNode(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDECIMAL=ruleDECIMAL();

            state._fsp--;

             current =iv_ruleDECIMAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalAnn.g:218:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalAnn.g:224:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalAnn.g:225:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalAnn.g:225:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalAnn.g:226:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,15,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "entryRuleLayer"
    // InternalAnn.g:249:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalAnn.g:249:46: (iv_ruleLayer= ruleLayer EOF )
            // InternalAnn.g:250:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalAnn.g:256:1: ruleLayer returns [EObject current=null] : (this_Hidden_0= ruleHidden | this_Input_1= ruleInput | this_Output_2= ruleOutput ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        EObject this_Hidden_0 = null;

        EObject this_Input_1 = null;

        EObject this_Output_2 = null;



        	enterRule();

        try {
            // InternalAnn.g:262:2: ( (this_Hidden_0= ruleHidden | this_Input_1= ruleInput | this_Output_2= ruleOutput ) )
            // InternalAnn.g:263:2: (this_Hidden_0= ruleHidden | this_Input_1= ruleInput | this_Output_2= ruleOutput )
            {
            // InternalAnn.g:263:2: (this_Hidden_0= ruleHidden | this_Input_1= ruleInput | this_Output_2= ruleOutput )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 31:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAnn.g:264:3: this_Hidden_0= ruleHidden
                    {

                    			newCompositeNode(grammarAccess.getLayerAccess().getHiddenParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Hidden_0=ruleHidden();

                    state._fsp--;


                    			current = this_Hidden_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnn.g:273:3: this_Input_1= ruleInput
                    {

                    			newCompositeNode(grammarAccess.getLayerAccess().getInputParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Input_1=ruleInput();

                    state._fsp--;


                    			current = this_Input_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAnn.g:282:3: this_Output_2= ruleOutput
                    {

                    			newCompositeNode(grammarAccess.getLayerAccess().getOutputParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Output_2=ruleOutput();

                    state._fsp--;


                    			current = this_Output_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleHidden"
    // InternalAnn.g:294:1: entryRuleHidden returns [EObject current=null] : iv_ruleHidden= ruleHidden EOF ;
    public final EObject entryRuleHidden() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHidden = null;


        try {
            // InternalAnn.g:294:47: (iv_ruleHidden= ruleHidden EOF )
            // InternalAnn.g:295:2: iv_ruleHidden= ruleHidden EOF
            {
             newCompositeNode(grammarAccess.getHiddenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHidden=ruleHidden();

            state._fsp--;

             current =iv_ruleHidden; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHidden"


    // $ANTLR start "ruleHidden"
    // InternalAnn.g:301:1: ruleHidden returns [EObject current=null] : (otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) ;
    public final EObject ruleHidden() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalAnn.g:307:2: ( (otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) )
            // InternalAnn.g:308:2: (otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            {
            // InternalAnn.g:308:2: (otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            // InternalAnn.g:309:3: otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHiddenAccess().getHiddenKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getHiddenAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getHiddenAccess().getSizeKeyword_2());
            		
            // InternalAnn.g:321:3: ( (lv_size_3_0= RULE_INT ) )
            // InternalAnn.g:322:4: (lv_size_3_0= RULE_INT )
            {
            // InternalAnn.g:322:4: (lv_size_3_0= RULE_INT )
            // InternalAnn.g:323:5: lv_size_3_0= RULE_INT
            {
            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_size_3_0, grammarAccess.getHiddenAccess().getSizeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHiddenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size",
            						lv_size_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getHiddenAccess().getActivationKeyword_4());
            		
            // InternalAnn.g:343:3: ( (otherlv_5= RULE_ID ) )
            // InternalAnn.g:344:4: (otherlv_5= RULE_ID )
            {
            // InternalAnn.g:344:4: (otherlv_5= RULE_ID )
            // InternalAnn.g:345:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHiddenRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_5, grammarAccess.getHiddenAccess().getL_ruleActivationCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getHiddenAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHidden"


    // $ANTLR start "entryRuleInput"
    // InternalAnn.g:364:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalAnn.g:364:46: (iv_ruleInput= ruleInput EOF )
            // InternalAnn.g:365:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalAnn.g:371:1: ruleInput returns [EObject current=null] : (otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'source' ( (lv_source_5_0= RULE_STRING ) ) (otherlv_6= 'constraints' ( (otherlv_7= RULE_ID ) )? ( (lv_moreRestrictions_8_0= ruleRestriction ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token otherlv_4=null;
        Token lv_source_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_moreRestrictions_8_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:377:2: ( (otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'source' ( (lv_source_5_0= RULE_STRING ) ) (otherlv_6= 'constraints' ( (otherlv_7= RULE_ID ) )? ( (lv_moreRestrictions_8_0= ruleRestriction ) )* )? otherlv_9= '}' ) )
            // InternalAnn.g:378:2: (otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'source' ( (lv_source_5_0= RULE_STRING ) ) (otherlv_6= 'constraints' ( (otherlv_7= RULE_ID ) )? ( (lv_moreRestrictions_8_0= ruleRestriction ) )* )? otherlv_9= '}' )
            {
            // InternalAnn.g:378:2: (otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'source' ( (lv_source_5_0= RULE_STRING ) ) (otherlv_6= 'constraints' ( (otherlv_7= RULE_ID ) )? ( (lv_moreRestrictions_8_0= ruleRestriction ) )* )? otherlv_9= '}' )
            // InternalAnn.g:379:3: otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'source' ( (lv_source_5_0= RULE_STRING ) ) (otherlv_6= 'constraints' ( (otherlv_7= RULE_ID ) )? ( (lv_moreRestrictions_8_0= ruleRestriction ) )* )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getSizeKeyword_2());
            		
            // InternalAnn.g:391:3: ( (lv_size_3_0= RULE_INT ) )
            // InternalAnn.g:392:4: (lv_size_3_0= RULE_INT )
            {
            // InternalAnn.g:392:4: (lv_size_3_0= RULE_INT )
            // InternalAnn.g:393:5: lv_size_3_0= RULE_INT
            {
            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_size_3_0, grammarAccess.getInputAccess().getSizeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size",
            						lv_size_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getInputAccess().getSourceKeyword_4());
            		
            // InternalAnn.g:413:3: ( (lv_source_5_0= RULE_STRING ) )
            // InternalAnn.g:414:4: (lv_source_5_0= RULE_STRING )
            {
            // InternalAnn.g:414:4: (lv_source_5_0= RULE_STRING )
            // InternalAnn.g:415:5: lv_source_5_0= RULE_STRING
            {
            lv_source_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_source_5_0, grammarAccess.getInputAccess().getSourceSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAnn.g:431:3: (otherlv_6= 'constraints' ( (otherlv_7= RULE_ID ) )? ( (lv_moreRestrictions_8_0= ruleRestriction ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAnn.g:432:4: otherlv_6= 'constraints' ( (otherlv_7= RULE_ID ) )? ( (lv_moreRestrictions_8_0= ruleRestriction ) )*
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getInputAccess().getConstraintsKeyword_6_0());
                    			
                    // InternalAnn.g:436:4: ( (otherlv_7= RULE_ID ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_ID) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalAnn.g:437:5: (otherlv_7= RULE_ID )
                            {
                            // InternalAnn.g:437:5: (otherlv_7= RULE_ID )
                            // InternalAnn.g:438:6: otherlv_7= RULE_ID
                            {

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getInputRule());
                            						}
                            					
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_19); 

                            						newLeafNode(otherlv_7, grammarAccess.getInputAccess().getRestrictionsConstraintCrossReference_6_1_0());
                            					

                            }


                            }
                            break;

                    }

                    // InternalAnn.g:449:4: ( (lv_moreRestrictions_8_0= ruleRestriction ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==22) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAnn.g:450:5: (lv_moreRestrictions_8_0= ruleRestriction )
                    	    {
                    	    // InternalAnn.g:450:5: (lv_moreRestrictions_8_0= ruleRestriction )
                    	    // InternalAnn.g:451:6: lv_moreRestrictions_8_0= ruleRestriction
                    	    {

                    	    						newCompositeNode(grammarAccess.getInputAccess().getMoreRestrictionsRestrictionParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_moreRestrictions_8_0=ruleRestriction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInputRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"moreRestrictions",
                    	    							lv_moreRestrictions_8_0,
                    	    							"dk.sdu.mdsd.ann.Ann.Restriction");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getInputAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleRestriction"
    // InternalAnn.g:477:1: entryRuleRestriction returns [EObject current=null] : iv_ruleRestriction= ruleRestriction EOF ;
    public final EObject entryRuleRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestriction = null;


        try {
            // InternalAnn.g:477:52: (iv_ruleRestriction= ruleRestriction EOF )
            // InternalAnn.g:478:2: iv_ruleRestriction= ruleRestriction EOF
            {
             newCompositeNode(grammarAccess.getRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestriction=ruleRestriction();

            state._fsp--;

             current =iv_ruleRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestriction"


    // $ANTLR start "ruleRestriction"
    // InternalAnn.g:484:1: ruleRestriction returns [EObject current=null] : (otherlv_0= ',' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRestriction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAnn.g:490:2: ( (otherlv_0= ',' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalAnn.g:491:2: (otherlv_0= ',' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalAnn.g:491:2: (otherlv_0= ',' ( (otherlv_1= RULE_ID ) ) )
            // InternalAnn.g:492:3: otherlv_0= ',' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRestrictionAccess().getCommaKeyword_0());
            		
            // InternalAnn.g:496:3: ( (otherlv_1= RULE_ID ) )
            // InternalAnn.g:497:4: (otherlv_1= RULE_ID )
            {
            // InternalAnn.g:497:4: (otherlv_1= RULE_ID )
            // InternalAnn.g:498:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestrictionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getRestrictionAccess().getConstraintConstraintCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestriction"


    // $ANTLR start "entryRuleConstraint"
    // InternalAnn.g:513:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalAnn.g:513:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalAnn.g:514:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalAnn.g:520:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_field_3_0= RULE_INT ) ) ( (lv_fields_4_0= ruleField ) )* otherlv_5= ')' otherlv_6= '{' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_field_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_fields_4_0 = null;

        EObject lv_condition_7_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:526:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_field_3_0= RULE_INT ) ) ( (lv_fields_4_0= ruleField ) )* otherlv_5= ')' otherlv_6= '{' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= '}' ) )
            // InternalAnn.g:527:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_field_3_0= RULE_INT ) ) ( (lv_fields_4_0= ruleField ) )* otherlv_5= ')' otherlv_6= '{' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= '}' )
            {
            // InternalAnn.g:527:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_field_3_0= RULE_INT ) ) ( (lv_fields_4_0= ruleField ) )* otherlv_5= ')' otherlv_6= '{' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= '}' )
            // InternalAnn.g:528:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_field_3_0= RULE_INT ) ) ( (lv_fields_4_0= ruleField ) )* otherlv_5= ')' otherlv_6= '{' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalAnn.g:532:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAnn.g:533:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAnn.g:533:4: (lv_name_1_0= RULE_ID )
            // InternalAnn.g:534:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_2());
            		
            // InternalAnn.g:554:3: ( (lv_field_3_0= RULE_INT ) )
            // InternalAnn.g:555:4: (lv_field_3_0= RULE_INT )
            {
            // InternalAnn.g:555:4: (lv_field_3_0= RULE_INT )
            // InternalAnn.g:556:5: lv_field_3_0= RULE_INT
            {
            lv_field_3_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_field_3_0, grammarAccess.getConstraintAccess().getFieldINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"field",
            						lv_field_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalAnn.g:572:3: ( (lv_fields_4_0= ruleField ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAnn.g:573:4: (lv_fields_4_0= ruleField )
            	    {
            	    // InternalAnn.g:573:4: (lv_fields_4_0= ruleField )
            	    // InternalAnn.g:574:5: lv_fields_4_0= ruleField
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintAccess().getFieldsFieldParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_fields_4_0=ruleField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConstraintRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_4_0,
            	    						"dk.sdu.mdsd.ann.Ann.Field");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,11,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalAnn.g:599:3: ( (lv_condition_7_0= ruleCondition ) )
            // InternalAnn.g:600:4: (lv_condition_7_0= ruleCondition )
            {
            // InternalAnn.g:600:4: (lv_condition_7_0= ruleCondition )
            // InternalAnn.g:601:5: lv_condition_7_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getConditionConditionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_14);
            lv_condition_7_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_7_0,
            						"dk.sdu.mdsd.ann.Ann.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleField"
    // InternalAnn.g:626:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalAnn.g:626:46: (iv_ruleField= ruleField EOF )
            // InternalAnn.g:627:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalAnn.g:633:1: ruleField returns [EObject current=null] : (otherlv_0= ',' ( (lv_field_1_0= RULE_INT ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_field_1_0=null;


        	enterRule();

        try {
            // InternalAnn.g:639:2: ( (otherlv_0= ',' ( (lv_field_1_0= RULE_INT ) ) ) )
            // InternalAnn.g:640:2: (otherlv_0= ',' ( (lv_field_1_0= RULE_INT ) ) )
            {
            // InternalAnn.g:640:2: (otherlv_0= ',' ( (lv_field_1_0= RULE_INT ) ) )
            // InternalAnn.g:641:3: otherlv_0= ',' ( (lv_field_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getCommaKeyword_0());
            		
            // InternalAnn.g:645:3: ( (lv_field_1_0= RULE_INT ) )
            // InternalAnn.g:646:4: (lv_field_1_0= RULE_INT )
            {
            // InternalAnn.g:646:4: (lv_field_1_0= RULE_INT )
            // InternalAnn.g:647:5: lv_field_1_0= RULE_INT
            {
            lv_field_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_field_1_0, grammarAccess.getFieldAccess().getFieldINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"field",
            						lv_field_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleCondition"
    // InternalAnn.g:667:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalAnn.g:667:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalAnn.g:668:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalAnn.g:674:1: ruleCondition returns [EObject current=null] : ( ( (lv_condition_0_0= ruleConditionalOperator ) ) ( (lv_num2_1_0= ruleNumberTypes ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_condition_0_0 = null;

        AntlrDatatypeRuleToken lv_num2_1_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:680:2: ( ( ( (lv_condition_0_0= ruleConditionalOperator ) ) ( (lv_num2_1_0= ruleNumberTypes ) ) ) )
            // InternalAnn.g:681:2: ( ( (lv_condition_0_0= ruleConditionalOperator ) ) ( (lv_num2_1_0= ruleNumberTypes ) ) )
            {
            // InternalAnn.g:681:2: ( ( (lv_condition_0_0= ruleConditionalOperator ) ) ( (lv_num2_1_0= ruleNumberTypes ) ) )
            // InternalAnn.g:682:3: ( (lv_condition_0_0= ruleConditionalOperator ) ) ( (lv_num2_1_0= ruleNumberTypes ) )
            {
            // InternalAnn.g:682:3: ( (lv_condition_0_0= ruleConditionalOperator ) )
            // InternalAnn.g:683:4: (lv_condition_0_0= ruleConditionalOperator )
            {
            // InternalAnn.g:683:4: (lv_condition_0_0= ruleConditionalOperator )
            // InternalAnn.g:684:5: lv_condition_0_0= ruleConditionalOperator
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getConditionConditionalOperatorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_condition_0_0=ruleConditionalOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_0_0,
            						"dk.sdu.mdsd.ann.Ann.ConditionalOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnn.g:701:3: ( (lv_num2_1_0= ruleNumberTypes ) )
            // InternalAnn.g:702:4: (lv_num2_1_0= ruleNumberTypes )
            {
            // InternalAnn.g:702:4: (lv_num2_1_0= ruleNumberTypes )
            // InternalAnn.g:703:5: lv_num2_1_0= ruleNumberTypes
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getNum2NumberTypesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_num2_1_0=ruleNumberTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"num2",
            						lv_num2_1_0,
            						"dk.sdu.mdsd.ann.Ann.NumberTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConditionalOperator"
    // InternalAnn.g:724:1: entryRuleConditionalOperator returns [String current=null] : iv_ruleConditionalOperator= ruleConditionalOperator EOF ;
    public final String entryRuleConditionalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionalOperator = null;


        try {
            // InternalAnn.g:724:59: (iv_ruleConditionalOperator= ruleConditionalOperator EOF )
            // InternalAnn.g:725:2: iv_ruleConditionalOperator= ruleConditionalOperator EOF
            {
             newCompositeNode(grammarAccess.getConditionalOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalOperator=ruleConditionalOperator();

            state._fsp--;

             current =iv_ruleConditionalOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalOperator"


    // $ANTLR start "ruleConditionalOperator"
    // InternalAnn.g:731:1: ruleConditionalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleConditionalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAnn.g:737:2: ( (kw= '==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // InternalAnn.g:738:2: (kw= '==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // InternalAnn.g:738:2: (kw= '==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case 28:
                {
                alt9=3;
                }
                break;
            case 29:
                {
                alt9=4;
                }
                break;
            case 30:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAnn.g:739:3: kw= '=='
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConditionalOperatorAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAnn.g:745:3: kw= '<'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConditionalOperatorAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAnn.g:751:3: kw= '>'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConditionalOperatorAccess().getGreaterThanSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAnn.g:757:3: kw= '<='
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConditionalOperatorAccess().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAnn.g:763:3: kw= '>='
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConditionalOperatorAccess().getGreaterThanSignEqualsSignKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalOperator"


    // $ANTLR start "entryRuleOutput"
    // InternalAnn.g:772:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalAnn.g:772:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalAnn.g:773:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalAnn.g:779:1: ruleOutput returns [EObject current=null] : (otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalAnn.g:785:2: ( (otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) )
            // InternalAnn.g:786:2: (otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            {
            // InternalAnn.g:786:2: (otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            // InternalAnn.g:787:3: otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getSizeKeyword_2());
            		
            // InternalAnn.g:799:3: ( (lv_size_3_0= RULE_INT ) )
            // InternalAnn.g:800:4: (lv_size_3_0= RULE_INT )
            {
            // InternalAnn.g:800:4: (lv_size_3_0= RULE_INT )
            // InternalAnn.g:801:5: lv_size_3_0= RULE_INT
            {
            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_size_3_0, grammarAccess.getOutputAccess().getSizeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size",
            						lv_size_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getActivationKeyword_4());
            		
            // InternalAnn.g:821:3: ( (otherlv_5= RULE_ID ) )
            // InternalAnn.g:822:4: (otherlv_5= RULE_ID )
            {
            // InternalAnn.g:822:4: (otherlv_5= RULE_ID )
            // InternalAnn.g:823:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_5, grammarAccess.getOutputAccess().getL_ruleActivationCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleActivation"
    // InternalAnn.g:842:1: entryRuleActivation returns [EObject current=null] : iv_ruleActivation= ruleActivation EOF ;
    public final EObject entryRuleActivation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivation = null;


        try {
            // InternalAnn.g:842:51: (iv_ruleActivation= ruleActivation EOF )
            // InternalAnn.g:843:2: iv_ruleActivation= ruleActivation EOF
            {
             newCompositeNode(grammarAccess.getActivationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivation=ruleActivation();

            state._fsp--;

             current =iv_ruleActivation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivation"


    // $ANTLR start "ruleActivation"
    // InternalAnn.g:849:1: ruleActivation returns [EObject current=null] : (this_Sigmoid_0= ruleSigmoid | this_Tansig_1= ruleTansig | this_External_2= ruleExternal | this_Custom_3= ruleCustom ) ;
    public final EObject ruleActivation() throws RecognitionException {
        EObject current = null;

        EObject this_Sigmoid_0 = null;

        EObject this_Tansig_1 = null;

        EObject this_External_2 = null;

        EObject this_Custom_3 = null;



        	enterRule();

        try {
            // InternalAnn.g:855:2: ( (this_Sigmoid_0= ruleSigmoid | this_Tansig_1= ruleTansig | this_External_2= ruleExternal | this_Custom_3= ruleCustom ) )
            // InternalAnn.g:856:2: (this_Sigmoid_0= ruleSigmoid | this_Tansig_1= ruleTansig | this_External_2= ruleExternal | this_Custom_3= ruleCustom )
            {
            // InternalAnn.g:856:2: (this_Sigmoid_0= ruleSigmoid | this_Tansig_1= ruleTansig | this_External_2= ruleExternal | this_Custom_3= ruleCustom )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 33:
                    {
                    alt10=1;
                    }
                    break;
                case 34:
                    {
                    alt10=2;
                    }
                    break;
                case 32:
                    {
                    alt10=3;
                    }
                    break;
                case 35:
                    {
                    alt10=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAnn.g:857:3: this_Sigmoid_0= ruleSigmoid
                    {

                    			newCompositeNode(grammarAccess.getActivationAccess().getSigmoidParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sigmoid_0=ruleSigmoid();

                    state._fsp--;


                    			current = this_Sigmoid_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnn.g:866:3: this_Tansig_1= ruleTansig
                    {

                    			newCompositeNode(grammarAccess.getActivationAccess().getTansigParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tansig_1=ruleTansig();

                    state._fsp--;


                    			current = this_Tansig_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAnn.g:875:3: this_External_2= ruleExternal
                    {

                    			newCompositeNode(grammarAccess.getActivationAccess().getExternalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_External_2=ruleExternal();

                    state._fsp--;


                    			current = this_External_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAnn.g:884:3: this_Custom_3= ruleCustom
                    {

                    			newCompositeNode(grammarAccess.getActivationAccess().getCustomParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Custom_3=ruleCustom();

                    state._fsp--;


                    			current = this_Custom_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivation"


    // $ANTLR start "entryRuleExternal"
    // InternalAnn.g:896:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalAnn.g:896:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalAnn.g:897:2: iv_ruleExternal= ruleExternal EOF
            {
             newCompositeNode(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternal=ruleExternal();

            state._fsp--;

             current =iv_ruleExternal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternal"


    // $ANTLR start "ruleExternal"
    // InternalAnn.g:903:1: ruleExternal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external' ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAnn.g:909:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external' ) )
            // InternalAnn.g:910:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external' )
            {
            // InternalAnn.g:910:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external' )
            // InternalAnn.g:911:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external'
            {
            // InternalAnn.g:911:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnn.g:912:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnn.g:912:4: (lv_name_0_0= RULE_ID )
            // InternalAnn.g:913:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalAccess().getExternalKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRuleSigmoid"
    // InternalAnn.g:937:1: entryRuleSigmoid returns [EObject current=null] : iv_ruleSigmoid= ruleSigmoid EOF ;
    public final EObject entryRuleSigmoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigmoid = null;


        try {
            // InternalAnn.g:937:48: (iv_ruleSigmoid= ruleSigmoid EOF )
            // InternalAnn.g:938:2: iv_ruleSigmoid= ruleSigmoid EOF
            {
             newCompositeNode(grammarAccess.getSigmoidRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSigmoid=ruleSigmoid();

            state._fsp--;

             current =iv_ruleSigmoid; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSigmoid"


    // $ANTLR start "ruleSigmoid"
    // InternalAnn.g:944:1: ruleSigmoid returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'sigmoid' ) ) ) ;
    public final EObject ruleSigmoid() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_rule_1_0=null;


        	enterRule();

        try {
            // InternalAnn.g:950:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'sigmoid' ) ) ) )
            // InternalAnn.g:951:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'sigmoid' ) ) )
            {
            // InternalAnn.g:951:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'sigmoid' ) ) )
            // InternalAnn.g:952:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'sigmoid' ) )
            {
            // InternalAnn.g:952:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnn.g:953:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnn.g:953:4: (lv_name_0_0= RULE_ID )
            // InternalAnn.g:954:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSigmoidAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSigmoidRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAnn.g:970:3: ( (lv_rule_1_0= 'sigmoid' ) )
            // InternalAnn.g:971:4: (lv_rule_1_0= 'sigmoid' )
            {
            // InternalAnn.g:971:4: (lv_rule_1_0= 'sigmoid' )
            // InternalAnn.g:972:5: lv_rule_1_0= 'sigmoid'
            {
            lv_rule_1_0=(Token)match(input,33,FOLLOW_2); 

            					newLeafNode(lv_rule_1_0, grammarAccess.getSigmoidAccess().getRuleSigmoidKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSigmoidRule());
            					}
            					setWithLastConsumed(current, "rule", lv_rule_1_0, "sigmoid");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSigmoid"


    // $ANTLR start "entryRuleTansig"
    // InternalAnn.g:988:1: entryRuleTansig returns [EObject current=null] : iv_ruleTansig= ruleTansig EOF ;
    public final EObject entryRuleTansig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTansig = null;


        try {
            // InternalAnn.g:988:47: (iv_ruleTansig= ruleTansig EOF )
            // InternalAnn.g:989:2: iv_ruleTansig= ruleTansig EOF
            {
             newCompositeNode(grammarAccess.getTansigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTansig=ruleTansig();

            state._fsp--;

             current =iv_ruleTansig; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTansig"


    // $ANTLR start "ruleTansig"
    // InternalAnn.g:995:1: ruleTansig returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'tansig' ) ) ) ;
    public final EObject ruleTansig() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_rule_1_0=null;


        	enterRule();

        try {
            // InternalAnn.g:1001:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'tansig' ) ) ) )
            // InternalAnn.g:1002:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'tansig' ) ) )
            {
            // InternalAnn.g:1002:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'tansig' ) ) )
            // InternalAnn.g:1003:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'tansig' ) )
            {
            // InternalAnn.g:1003:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnn.g:1004:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnn.g:1004:4: (lv_name_0_0= RULE_ID )
            // InternalAnn.g:1005:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTansigAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTansigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAnn.g:1021:3: ( (lv_rule_1_0= 'tansig' ) )
            // InternalAnn.g:1022:4: (lv_rule_1_0= 'tansig' )
            {
            // InternalAnn.g:1022:4: (lv_rule_1_0= 'tansig' )
            // InternalAnn.g:1023:5: lv_rule_1_0= 'tansig'
            {
            lv_rule_1_0=(Token)match(input,34,FOLLOW_2); 

            					newLeafNode(lv_rule_1_0, grammarAccess.getTansigAccess().getRuleTansigKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTansigRule());
            					}
            					setWithLastConsumed(current, "rule", lv_rule_1_0, "tansig");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTansig"


    // $ANTLR start "entryRuleCustom"
    // InternalAnn.g:1039:1: entryRuleCustom returns [EObject current=null] : iv_ruleCustom= ruleCustom EOF ;
    public final EObject entryRuleCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustom = null;


        try {
            // InternalAnn.g:1039:47: (iv_ruleCustom= ruleCustom EOF )
            // InternalAnn.g:1040:2: iv_ruleCustom= ruleCustom EOF
            {
             newCompositeNode(grammarAccess.getCustomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustom=ruleCustom();

            state._fsp--;

             current =iv_ruleCustom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustom"


    // $ANTLR start "ruleCustom"
    // InternalAnn.g:1046:1: ruleCustom returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(x)' otherlv_2= '{' otherlv_3= 'function' otherlv_4= '=' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= 'derivative' otherlv_7= '=' ( (lv_der_8_0= ruleExpression ) ) otherlv_9= '}' ) ;
    public final EObject ruleCustom() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_exp_5_0 = null;

        EObject lv_der_8_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1052:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(x)' otherlv_2= '{' otherlv_3= 'function' otherlv_4= '=' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= 'derivative' otherlv_7= '=' ( (lv_der_8_0= ruleExpression ) ) otherlv_9= '}' ) )
            // InternalAnn.g:1053:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(x)' otherlv_2= '{' otherlv_3= 'function' otherlv_4= '=' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= 'derivative' otherlv_7= '=' ( (lv_der_8_0= ruleExpression ) ) otherlv_9= '}' )
            {
            // InternalAnn.g:1053:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(x)' otherlv_2= '{' otherlv_3= 'function' otherlv_4= '=' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= 'derivative' otherlv_7= '=' ( (lv_der_8_0= ruleExpression ) ) otherlv_9= '}' )
            // InternalAnn.g:1054:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(x)' otherlv_2= '{' otherlv_3= 'function' otherlv_4= '=' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= 'derivative' otherlv_7= '=' ( (lv_der_8_0= ruleExpression ) ) otherlv_9= '}'
            {
            // InternalAnn.g:1054:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnn.g:1055:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnn.g:1055:4: (lv_name_0_0= RULE_ID )
            // InternalAnn.g:1056:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCustomAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomAccess().getXKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomAccess().getFunctionKeyword_3());
            		
            otherlv_4=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getCustomAccess().getEqualsSignKeyword_4());
            		
            // InternalAnn.g:1088:3: ( (lv_exp_5_0= ruleExpression ) )
            // InternalAnn.g:1089:4: (lv_exp_5_0= ruleExpression )
            {
            // InternalAnn.g:1089:4: (lv_exp_5_0= ruleExpression )
            // InternalAnn.g:1090:5: lv_exp_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCustomAccess().getExpExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_30);
            lv_exp_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_5_0,
            						"dk.sdu.mdsd.ann.Ann.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,38,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getCustomAccess().getDerivativeKeyword_6());
            		
            otherlv_7=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_7, grammarAccess.getCustomAccess().getEqualsSignKeyword_7());
            		
            // InternalAnn.g:1115:3: ( (lv_der_8_0= ruleExpression ) )
            // InternalAnn.g:1116:4: (lv_der_8_0= ruleExpression )
            {
            // InternalAnn.g:1116:4: (lv_der_8_0= ruleExpression )
            // InternalAnn.g:1117:5: lv_der_8_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCustomAccess().getDerExpressionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_14);
            lv_der_8_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomRule());
            					}
            					set(
            						current,
            						"der",
            						lv_der_8_0,
            						"dk.sdu.mdsd.ann.Ann.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCustomAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustom"


    // $ANTLR start "entryRuleExpression"
    // InternalAnn.g:1142:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAnn.g:1142:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAnn.g:1143:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalAnn.g:1149:1: ruleExpression returns [EObject current=null] : (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Factor_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1155:2: ( (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) ) )* ) )
            // InternalAnn.g:1156:2: (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) ) )* )
            {
            // InternalAnn.g:1156:2: (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) ) )* )
            // InternalAnn.g:1157:3: this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAnn.g:1165:3: ( () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=46 && LA11_0<=47)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAnn.g:1166:4: () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) )
            	    {
            	    // InternalAnn.g:1166:4: ()
            	    // InternalAnn.g:1167:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getPartLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAnn.g:1173:4: ( (lv_operator_2_0= rulePartOperator ) )
            	    // InternalAnn.g:1174:5: (lv_operator_2_0= rulePartOperator )
            	    {
            	    // InternalAnn.g:1174:5: (lv_operator_2_0= rulePartOperator )
            	    // InternalAnn.g:1175:6: lv_operator_2_0= rulePartOperator
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getOperatorPartOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_operator_2_0=rulePartOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"dk.sdu.mdsd.ann.Ann.PartOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAnn.g:1192:4: ( (lv_right_3_0= ruleFactor ) )
            	    // InternalAnn.g:1193:5: (lv_right_3_0= ruleFactor )
            	    {
            	    // InternalAnn.g:1193:5: (lv_right_3_0= ruleFactor )
            	    // InternalAnn.g:1194:6: lv_right_3_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_right_3_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.mdsd.ann.Ann.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleFactor"
    // InternalAnn.g:1216:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalAnn.g:1216:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalAnn.g:1217:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalAnn.g:1223:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        EObject this_Primary_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1229:2: ( (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalAnn.g:1230:2: (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalAnn.g:1230:2: (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalAnn.g:1231:3: this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAnn.g:1239:3: ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=48 && LA12_0<=49)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAnn.g:1240:4: () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalAnn.g:1240:4: ()
            	    // InternalAnn.g:1241:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFactorAccess().getFacLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAnn.g:1247:4: ( (lv_operator_2_0= ruleFactorOperator ) )
            	    // InternalAnn.g:1248:5: (lv_operator_2_0= ruleFactorOperator )
            	    {
            	    // InternalAnn.g:1248:5: (lv_operator_2_0= ruleFactorOperator )
            	    // InternalAnn.g:1249:6: lv_operator_2_0= ruleFactorOperator
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getOperatorFactorOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_operator_2_0=ruleFactorOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"dk.sdu.mdsd.ann.Ann.FactorOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAnn.g:1266:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalAnn.g:1267:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalAnn.g:1267:5: (lv_right_3_0= rulePrimary )
            	    // InternalAnn.g:1268:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.mdsd.ann.Ann.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalAnn.g:1290:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalAnn.g:1290:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalAnn.g:1291:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalAnn.g:1297:1: rulePrimary returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_Letter_1= ruleLetter | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) | this_Math_5= ruleMath ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_NumberLiteral_0 = null;

        EObject this_Letter_1 = null;

        EObject this_Expression_3 = null;

        EObject this_Math_5 = null;



        	enterRule();

        try {
            // InternalAnn.g:1303:2: ( (this_NumberLiteral_0= ruleNumberLiteral | this_Letter_1= ruleLetter | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) | this_Math_5= ruleMath ) )
            // InternalAnn.g:1304:2: (this_NumberLiteral_0= ruleNumberLiteral | this_Letter_1= ruleLetter | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) | this_Math_5= ruleMath )
            {
            // InternalAnn.g:1304:2: (this_NumberLiteral_0= ruleNumberLiteral | this_Letter_1= ruleLetter | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) | this_Math_5= ruleMath )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_INT) ) {
                    alt13=1;
                }
                else if ( (LA13_1==45) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==45) ) {
                    alt13=2;
                }
                else if ( (LA13_2==RULE_INT) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt13=1;
                }
                break;
            case 45:
                {
                alt13=2;
                }
                break;
            case 24:
                {
                alt13=3;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalAnn.g:1305:3: this_NumberLiteral_0= ruleNumberLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;


                    			current = this_NumberLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnn.g:1314:3: this_Letter_1= ruleLetter
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Letter_1=ruleLetter();

                    state._fsp--;


                    			current = this_Letter_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAnn.g:1323:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    {
                    // InternalAnn.g:1323:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    // InternalAnn.g:1324:4: otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_33);
                    this_Expression_3=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAnn.g:1342:3: this_Math_5= ruleMath
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getMathParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Math_5=ruleMath();

                    state._fsp--;


                    			current = this_Math_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleMath"
    // InternalAnn.g:1354:1: entryRuleMath returns [EObject current=null] : iv_ruleMath= ruleMath EOF ;
    public final EObject entryRuleMath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMath = null;


        try {
            // InternalAnn.g:1354:45: (iv_ruleMath= ruleMath EOF )
            // InternalAnn.g:1355:2: iv_ruleMath= ruleMath EOF
            {
             newCompositeNode(grammarAccess.getMathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMath=ruleMath();

            state._fsp--;

             current =iv_ruleMath; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMath"


    // $ANTLR start "ruleMath"
    // InternalAnn.g:1361:1: ruleMath returns [EObject current=null] : (this_Euler_0= ruleEuler | this_NLog_1= ruleNLog | this_Sin_2= ruleSin | this_Cos_3= ruleCos | this_Sqrt_4= ruleSqrt | this_Power_5= rulePower ) ;
    public final EObject ruleMath() throws RecognitionException {
        EObject current = null;

        EObject this_Euler_0 = null;

        EObject this_NLog_1 = null;

        EObject this_Sin_2 = null;

        EObject this_Cos_3 = null;

        EObject this_Sqrt_4 = null;

        EObject this_Power_5 = null;



        	enterRule();

        try {
            // InternalAnn.g:1367:2: ( (this_Euler_0= ruleEuler | this_NLog_1= ruleNLog | this_Sin_2= ruleSin | this_Cos_3= ruleCos | this_Sqrt_4= ruleSqrt | this_Power_5= rulePower ) )
            // InternalAnn.g:1368:2: (this_Euler_0= ruleEuler | this_NLog_1= ruleNLog | this_Sin_2= ruleSin | this_Cos_3= ruleCos | this_Sqrt_4= ruleSqrt | this_Power_5= rulePower )
            {
            // InternalAnn.g:1368:2: (this_Euler_0= ruleEuler | this_NLog_1= ruleNLog | this_Sin_2= ruleSin | this_Cos_3= ruleCos | this_Sqrt_4= ruleSqrt | this_Power_5= rulePower )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt14=1;
                }
                break;
            case 40:
                {
                alt14=2;
                }
                break;
            case 41:
                {
                alt14=3;
                }
                break;
            case 42:
                {
                alt14=4;
                }
                break;
            case 43:
                {
                alt14=5;
                }
                break;
            case 44:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalAnn.g:1369:3: this_Euler_0= ruleEuler
                    {

                    			newCompositeNode(grammarAccess.getMathAccess().getEulerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Euler_0=ruleEuler();

                    state._fsp--;


                    			current = this_Euler_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnn.g:1378:3: this_NLog_1= ruleNLog
                    {

                    			newCompositeNode(grammarAccess.getMathAccess().getNLogParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NLog_1=ruleNLog();

                    state._fsp--;


                    			current = this_NLog_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAnn.g:1387:3: this_Sin_2= ruleSin
                    {

                    			newCompositeNode(grammarAccess.getMathAccess().getSinParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sin_2=ruleSin();

                    state._fsp--;


                    			current = this_Sin_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAnn.g:1396:3: this_Cos_3= ruleCos
                    {

                    			newCompositeNode(grammarAccess.getMathAccess().getCosParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cos_3=ruleCos();

                    state._fsp--;


                    			current = this_Cos_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAnn.g:1405:3: this_Sqrt_4= ruleSqrt
                    {

                    			newCompositeNode(grammarAccess.getMathAccess().getSqrtParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sqrt_4=ruleSqrt();

                    state._fsp--;


                    			current = this_Sqrt_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAnn.g:1414:3: this_Power_5= rulePower
                    {

                    			newCompositeNode(grammarAccess.getMathAccess().getPowerParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Power_5=rulePower();

                    state._fsp--;


                    			current = this_Power_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMath"


    // $ANTLR start "entryRuleEuler"
    // InternalAnn.g:1426:1: entryRuleEuler returns [EObject current=null] : iv_ruleEuler= ruleEuler EOF ;
    public final EObject entryRuleEuler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEuler = null;


        try {
            // InternalAnn.g:1426:46: (iv_ruleEuler= ruleEuler EOF )
            // InternalAnn.g:1427:2: iv_ruleEuler= ruleEuler EOF
            {
             newCompositeNode(grammarAccess.getEulerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEuler=ruleEuler();

            state._fsp--;

             current =iv_ruleEuler; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEuler"


    // $ANTLR start "ruleEuler"
    // InternalAnn.g:1433:1: ruleEuler returns [EObject current=null] : (otherlv_0= 'e(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleEuler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1439:2: ( (otherlv_0= 'e(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalAnn.g:1440:2: (otherlv_0= 'e(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalAnn.g:1440:2: (otherlv_0= 'e(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalAnn.g:1441:3: otherlv_0= 'e(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getEulerAccess().getEKeyword_0());
            		
            // InternalAnn.g:1445:3: ( (lv_value_1_0= ruleExpression ) )
            // InternalAnn.g:1446:4: (lv_value_1_0= ruleExpression )
            {
            // InternalAnn.g:1446:4: (lv_value_1_0= ruleExpression )
            // InternalAnn.g:1447:5: lv_value_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEulerAccess().getValueExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_value_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEulerRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"dk.sdu.mdsd.ann.Ann.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEulerAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEuler"


    // $ANTLR start "entryRuleNLog"
    // InternalAnn.g:1472:1: entryRuleNLog returns [EObject current=null] : iv_ruleNLog= ruleNLog EOF ;
    public final EObject entryRuleNLog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNLog = null;


        try {
            // InternalAnn.g:1472:45: (iv_ruleNLog= ruleNLog EOF )
            // InternalAnn.g:1473:2: iv_ruleNLog= ruleNLog EOF
            {
             newCompositeNode(grammarAccess.getNLogRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNLog=ruleNLog();

            state._fsp--;

             current =iv_ruleNLog; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNLog"


    // $ANTLR start "ruleNLog"
    // InternalAnn.g:1479:1: ruleNLog returns [EObject current=null] : (otherlv_0= 'nlog(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleNLog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1485:2: ( (otherlv_0= 'nlog(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalAnn.g:1486:2: (otherlv_0= 'nlog(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalAnn.g:1486:2: (otherlv_0= 'nlog(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalAnn.g:1487:3: otherlv_0= 'nlog(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getNLogAccess().getNlogKeyword_0());
            		
            // InternalAnn.g:1491:3: ( (lv_value_1_0= ruleExpression ) )
            // InternalAnn.g:1492:4: (lv_value_1_0= ruleExpression )
            {
            // InternalAnn.g:1492:4: (lv_value_1_0= ruleExpression )
            // InternalAnn.g:1493:5: lv_value_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNLogAccess().getValueExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_value_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNLogRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"dk.sdu.mdsd.ann.Ann.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getNLogAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNLog"


    // $ANTLR start "entryRuleSin"
    // InternalAnn.g:1518:1: entryRuleSin returns [EObject current=null] : iv_ruleSin= ruleSin EOF ;
    public final EObject entryRuleSin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSin = null;


        try {
            // InternalAnn.g:1518:44: (iv_ruleSin= ruleSin EOF )
            // InternalAnn.g:1519:2: iv_ruleSin= ruleSin EOF
            {
             newCompositeNode(grammarAccess.getSinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSin=ruleSin();

            state._fsp--;

             current =iv_ruleSin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSin"


    // $ANTLR start "ruleSin"
    // InternalAnn.g:1525:1: ruleSin returns [EObject current=null] : (otherlv_0= 'sin(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleSin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1531:2: ( (otherlv_0= 'sin(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalAnn.g:1532:2: (otherlv_0= 'sin(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalAnn.g:1532:2: (otherlv_0= 'sin(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalAnn.g:1533:3: otherlv_0= 'sin(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getSinAccess().getSinKeyword_0());
            		
            // InternalAnn.g:1537:3: ( (lv_value_1_0= ruleExpression ) )
            // InternalAnn.g:1538:4: (lv_value_1_0= ruleExpression )
            {
            // InternalAnn.g:1538:4: (lv_value_1_0= ruleExpression )
            // InternalAnn.g:1539:5: lv_value_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSinAccess().getValueExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_value_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSinRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"dk.sdu.mdsd.ann.Ann.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSinAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSin"


    // $ANTLR start "entryRuleCos"
    // InternalAnn.g:1564:1: entryRuleCos returns [EObject current=null] : iv_ruleCos= ruleCos EOF ;
    public final EObject entryRuleCos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCos = null;


        try {
            // InternalAnn.g:1564:44: (iv_ruleCos= ruleCos EOF )
            // InternalAnn.g:1565:2: iv_ruleCos= ruleCos EOF
            {
             newCompositeNode(grammarAccess.getCosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCos=ruleCos();

            state._fsp--;

             current =iv_ruleCos; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCos"


    // $ANTLR start "ruleCos"
    // InternalAnn.g:1571:1: ruleCos returns [EObject current=null] : (otherlv_0= 'cos(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleCos() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1577:2: ( (otherlv_0= 'cos(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalAnn.g:1578:2: (otherlv_0= 'cos(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalAnn.g:1578:2: (otherlv_0= 'cos(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalAnn.g:1579:3: otherlv_0= 'cos(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getCosAccess().getCosKeyword_0());
            		
            // InternalAnn.g:1583:3: ( (lv_value_1_0= ruleExpression ) )
            // InternalAnn.g:1584:4: (lv_value_1_0= ruleExpression )
            {
            // InternalAnn.g:1584:4: (lv_value_1_0= ruleExpression )
            // InternalAnn.g:1585:5: lv_value_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCosAccess().getValueExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_value_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCosRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"dk.sdu.mdsd.ann.Ann.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCosAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCos"


    // $ANTLR start "entryRuleSqrt"
    // InternalAnn.g:1610:1: entryRuleSqrt returns [EObject current=null] : iv_ruleSqrt= ruleSqrt EOF ;
    public final EObject entryRuleSqrt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqrt = null;


        try {
            // InternalAnn.g:1610:45: (iv_ruleSqrt= ruleSqrt EOF )
            // InternalAnn.g:1611:2: iv_ruleSqrt= ruleSqrt EOF
            {
             newCompositeNode(grammarAccess.getSqrtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSqrt=ruleSqrt();

            state._fsp--;

             current =iv_ruleSqrt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSqrt"


    // $ANTLR start "ruleSqrt"
    // InternalAnn.g:1617:1: ruleSqrt returns [EObject current=null] : (otherlv_0= 'sqrt(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleSqrt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1623:2: ( (otherlv_0= 'sqrt(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalAnn.g:1624:2: (otherlv_0= 'sqrt(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalAnn.g:1624:2: (otherlv_0= 'sqrt(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalAnn.g:1625:3: otherlv_0= 'sqrt(' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getSqrtAccess().getSqrtKeyword_0());
            		
            // InternalAnn.g:1629:3: ( (lv_value_1_0= ruleExpression ) )
            // InternalAnn.g:1630:4: (lv_value_1_0= ruleExpression )
            {
            // InternalAnn.g:1630:4: (lv_value_1_0= ruleExpression )
            // InternalAnn.g:1631:5: lv_value_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSqrtAccess().getValueExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_value_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSqrtRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"dk.sdu.mdsd.ann.Ann.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSqrtAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSqrt"


    // $ANTLR start "entryRulePower"
    // InternalAnn.g:1656:1: entryRulePower returns [EObject current=null] : iv_rulePower= rulePower EOF ;
    public final EObject entryRulePower() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePower = null;


        try {
            // InternalAnn.g:1656:46: (iv_rulePower= rulePower EOF )
            // InternalAnn.g:1657:2: iv_rulePower= rulePower EOF
            {
             newCompositeNode(grammarAccess.getPowerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePower=rulePower();

            state._fsp--;

             current =iv_rulePower; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePower"


    // $ANTLR start "rulePower"
    // InternalAnn.g:1663:1: rulePower returns [EObject current=null] : (otherlv_0= 'pow(' ( (lv_base_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_exponent_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject rulePower() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_base_1_0 = null;

        EObject lv_exponent_3_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1669:2: ( (otherlv_0= 'pow(' ( (lv_base_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_exponent_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalAnn.g:1670:2: (otherlv_0= 'pow(' ( (lv_base_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_exponent_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalAnn.g:1670:2: (otherlv_0= 'pow(' ( (lv_base_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_exponent_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalAnn.g:1671:3: otherlv_0= 'pow(' ( (lv_base_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_exponent_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getPowerAccess().getPowKeyword_0());
            		
            // InternalAnn.g:1675:3: ( (lv_base_1_0= ruleExpression ) )
            // InternalAnn.g:1676:4: (lv_base_1_0= ruleExpression )
            {
            // InternalAnn.g:1676:4: (lv_base_1_0= ruleExpression )
            // InternalAnn.g:1677:5: lv_base_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPowerAccess().getBaseExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_base_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPowerRule());
            					}
            					set(
            						current,
            						"base",
            						lv_base_1_0,
            						"dk.sdu.mdsd.ann.Ann.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getPowerAccess().getCommaKeyword_2());
            		
            // InternalAnn.g:1698:3: ( (lv_exponent_3_0= ruleExpression ) )
            // InternalAnn.g:1699:4: (lv_exponent_3_0= ruleExpression )
            {
            // InternalAnn.g:1699:4: (lv_exponent_3_0= ruleExpression )
            // InternalAnn.g:1700:5: lv_exponent_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPowerAccess().getExponentExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_33);
            lv_exponent_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPowerRule());
            					}
            					set(
            						current,
            						"exponent",
            						lv_exponent_3_0,
            						"dk.sdu.mdsd.ann.Ann.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPowerAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePower"


    // $ANTLR start "entryRuleLetter"
    // InternalAnn.g:1725:1: entryRuleLetter returns [EObject current=null] : iv_ruleLetter= ruleLetter EOF ;
    public final EObject entryRuleLetter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetter = null;


        try {
            // InternalAnn.g:1725:47: (iv_ruleLetter= ruleLetter EOF )
            // InternalAnn.g:1726:2: iv_ruleLetter= ruleLetter EOF
            {
             newCompositeNode(grammarAccess.getLetterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetter=ruleLetter();

            state._fsp--;

             current =iv_ruleLetter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetter"


    // $ANTLR start "ruleLetter"
    // InternalAnn.g:1732:1: ruleLetter returns [EObject current=null] : ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= 'x' ) ) ) ;
    public final EObject ruleLetter() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_operator_0_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1738:2: ( ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= 'x' ) ) ) )
            // InternalAnn.g:1739:2: ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= 'x' ) ) )
            {
            // InternalAnn.g:1739:2: ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= 'x' ) ) )
            // InternalAnn.g:1740:3: ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= 'x' ) )
            {
            // InternalAnn.g:1740:3: ( (lv_operator_0_0= rulePartOperator ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=46 && LA15_0<=47)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAnn.g:1741:4: (lv_operator_0_0= rulePartOperator )
                    {
                    // InternalAnn.g:1741:4: (lv_operator_0_0= rulePartOperator )
                    // InternalAnn.g:1742:5: lv_operator_0_0= rulePartOperator
                    {

                    					newCompositeNode(grammarAccess.getLetterAccess().getOperatorPartOperatorParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_35);
                    lv_operator_0_0=rulePartOperator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLetterRule());
                    					}
                    					set(
                    						current,
                    						"operator",
                    						lv_operator_0_0,
                    						"dk.sdu.mdsd.ann.Ann.PartOperator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnn.g:1759:3: ( (lv_value_1_0= 'x' ) )
            // InternalAnn.g:1760:4: (lv_value_1_0= 'x' )
            {
            // InternalAnn.g:1760:4: (lv_value_1_0= 'x' )
            // InternalAnn.g:1761:5: lv_value_1_0= 'x'
            {
            lv_value_1_0=(Token)match(input,45,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getLetterAccess().getValueXKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetterRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_1_0, "x");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetter"


    // $ANTLR start "entryRulePartOperator"
    // InternalAnn.g:1777:1: entryRulePartOperator returns [String current=null] : iv_rulePartOperator= rulePartOperator EOF ;
    public final String entryRulePartOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePartOperator = null;


        try {
            // InternalAnn.g:1777:52: (iv_rulePartOperator= rulePartOperator EOF )
            // InternalAnn.g:1778:2: iv_rulePartOperator= rulePartOperator EOF
            {
             newCompositeNode(grammarAccess.getPartOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartOperator=rulePartOperator();

            state._fsp--;

             current =iv_rulePartOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartOperator"


    // $ANTLR start "rulePartOperator"
    // InternalAnn.g:1784:1: rulePartOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulePartOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAnn.g:1790:2: ( (kw= '+' | kw= '-' ) )
            // InternalAnn.g:1791:2: (kw= '+' | kw= '-' )
            {
            // InternalAnn.g:1791:2: (kw= '+' | kw= '-' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==46) ) {
                alt16=1;
            }
            else if ( (LA16_0==47) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalAnn.g:1792:3: kw= '+'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPartOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAnn.g:1798:3: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPartOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartOperator"


    // $ANTLR start "entryRuleFactorOperator"
    // InternalAnn.g:1807:1: entryRuleFactorOperator returns [String current=null] : iv_ruleFactorOperator= ruleFactorOperator EOF ;
    public final String entryRuleFactorOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFactorOperator = null;


        try {
            // InternalAnn.g:1807:54: (iv_ruleFactorOperator= ruleFactorOperator EOF )
            // InternalAnn.g:1808:2: iv_ruleFactorOperator= ruleFactorOperator EOF
            {
             newCompositeNode(grammarAccess.getFactorOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactorOperator=ruleFactorOperator();

            state._fsp--;

             current =iv_ruleFactorOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactorOperator"


    // $ANTLR start "ruleFactorOperator"
    // InternalAnn.g:1814:1: ruleFactorOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleFactorOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAnn.g:1820:2: ( (kw= '*' | kw= '/' ) )
            // InternalAnn.g:1821:2: (kw= '*' | kw= '/' )
            {
            // InternalAnn.g:1821:2: (kw= '*' | kw= '/' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==48) ) {
                alt17=1;
            }
            else if ( (LA17_0==49) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalAnn.g:1822:3: kw= '*'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFactorOperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAnn.g:1828:3: kw= '/'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFactorOperatorAccess().getSolidusKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactorOperator"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalAnn.g:1837:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalAnn.g:1837:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalAnn.g:1838:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalAnn.g:1844:1: ruleNumberLiteral returns [EObject current=null] : ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= ruleNumberTypes ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_0_0 = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1850:2: ( ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= ruleNumberTypes ) ) ) )
            // InternalAnn.g:1851:2: ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= ruleNumberTypes ) ) )
            {
            // InternalAnn.g:1851:2: ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= ruleNumberTypes ) ) )
            // InternalAnn.g:1852:3: ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= ruleNumberTypes ) )
            {
            // InternalAnn.g:1852:3: ( (lv_operator_0_0= rulePartOperator ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=46 && LA18_0<=47)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAnn.g:1853:4: (lv_operator_0_0= rulePartOperator )
                    {
                    // InternalAnn.g:1853:4: (lv_operator_0_0= rulePartOperator )
                    // InternalAnn.g:1854:5: lv_operator_0_0= rulePartOperator
                    {

                    					newCompositeNode(grammarAccess.getNumberLiteralAccess().getOperatorPartOperatorParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_operator_0_0=rulePartOperator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
                    					}
                    					set(
                    						current,
                    						"operator",
                    						lv_operator_0_0,
                    						"dk.sdu.mdsd.ann.Ann.PartOperator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnn.g:1871:3: ( (lv_value_1_0= ruleNumberTypes ) )
            // InternalAnn.g:1872:4: (lv_value_1_0= ruleNumberTypes )
            {
            // InternalAnn.g:1872:4: (lv_value_1_0= ruleNumberTypes )
            // InternalAnn.g:1873:5: lv_value_1_0= ruleNumberTypes
            {

            					newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberTypesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleNumberTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"dk.sdu.mdsd.ann.Ann.NumberTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleNumberTypes"
    // InternalAnn.g:1894:1: entryRuleNumberTypes returns [String current=null] : iv_ruleNumberTypes= ruleNumberTypes EOF ;
    public final String entryRuleNumberTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberTypes = null;


        try {
            // InternalAnn.g:1894:51: (iv_ruleNumberTypes= ruleNumberTypes EOF )
            // InternalAnn.g:1895:2: iv_ruleNumberTypes= ruleNumberTypes EOF
            {
             newCompositeNode(grammarAccess.getNumberTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberTypes=ruleNumberTypes();

            state._fsp--;

             current =iv_ruleNumberTypes.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberTypes"


    // $ANTLR start "ruleNumberTypes"
    // InternalAnn.g:1901:1: ruleNumberTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DECIMAL_0= ruleDECIMAL | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleNumberTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        AntlrDatatypeRuleToken this_DECIMAL_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1907:2: ( (this_DECIMAL_0= ruleDECIMAL | this_INT_1= RULE_INT ) )
            // InternalAnn.g:1908:2: (this_DECIMAL_0= ruleDECIMAL | this_INT_1= RULE_INT )
            {
            // InternalAnn.g:1908:2: (this_DECIMAL_0= ruleDECIMAL | this_INT_1= RULE_INT )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==EOF||LA19_1==14||LA19_1==22||LA19_1==25||LA19_1==38||(LA19_1>=46 && LA19_1<=49)) ) {
                    alt19=2;
                }
                else if ( (LA19_1==15) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalAnn.g:1909:3: this_DECIMAL_0= ruleDECIMAL
                    {

                    			newCompositeNode(grammarAccess.getNumberTypesAccess().getDECIMALParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DECIMAL_0=ruleDECIMAL();

                    state._fsp--;


                    			current.merge(this_DECIMAL_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnn.g:1920:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getNumberTypesAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080894010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080094010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080094000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000404010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000FF8001000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});

}