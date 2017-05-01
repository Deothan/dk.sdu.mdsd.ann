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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'alpha'", "'epochs'", "'}'", "'.'", "'hidden'", "'size'", "'learningRule'", "'in'", "'out'", "'sigmoid'", "'external'", "'(x)'", "'function'", "'='", "'derivative'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'x'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalAnn.g:71:1: ruleANNModel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_Layer_6_0= ruleLayer ) )+ otherlv_7= '}' ) ;
    public final EObject ruleANNModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_epochs_5_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_alpha_3_0 = null;

        EObject lv_Layer_6_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:77:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_Layer_6_0= ruleLayer ) )+ otherlv_7= '}' ) )
            // InternalAnn.g:78:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_Layer_6_0= ruleLayer ) )+ otherlv_7= '}' )
            {
            // InternalAnn.g:78:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_Layer_6_0= ruleLayer ) )+ otherlv_7= '}' )
            // InternalAnn.g:79:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_Layer_6_0= ruleLayer ) )+ otherlv_7= '}'
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

            // InternalAnn.g:146:3: ( (lv_Layer_6_0= ruleLayer ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||(LA1_0>=19 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAnn.g:147:4: (lv_Layer_6_0= ruleLayer )
            	    {
            	    // InternalAnn.g:147:4: (lv_Layer_6_0= ruleLayer )
            	    // InternalAnn.g:148:5: lv_Layer_6_0= ruleLayer
            	    {

            	    					newCompositeNode(grammarAccess.getANNModelAccess().getLayerLayerParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_Layer_6_0=ruleLayer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getANNModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Layer",
            	    						lv_Layer_6_0,
            	    						"dk.sdu.mdsd.ann.Ann.Layer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getANNModelAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalAnn.g:173:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalAnn.g:173:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalAnn.g:174:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalAnn.g:180:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalAnn.g:186:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalAnn.g:187:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalAnn.g:187:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalAnn.g:188:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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
    // InternalAnn.g:211:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalAnn.g:211:46: (iv_ruleLayer= ruleLayer EOF )
            // InternalAnn.g:212:2: iv_ruleLayer= ruleLayer EOF
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
    // InternalAnn.g:218:1: ruleLayer returns [EObject current=null] : (this_Hidden_0= ruleHidden | this_Input_1= ruleInput | this_Output_2= ruleOutput ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        EObject this_Hidden_0 = null;

        EObject this_Input_1 = null;

        EObject this_Output_2 = null;



        	enterRule();

        try {
            // InternalAnn.g:224:2: ( (this_Hidden_0= ruleHidden | this_Input_1= ruleInput | this_Output_2= ruleOutput ) )
            // InternalAnn.g:225:2: (this_Hidden_0= ruleHidden | this_Input_1= ruleInput | this_Output_2= ruleOutput )
            {
            // InternalAnn.g:225:2: (this_Hidden_0= ruleHidden | this_Input_1= ruleInput | this_Output_2= ruleOutput )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAnn.g:226:3: this_Hidden_0= ruleHidden
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
                    // InternalAnn.g:235:3: this_Input_1= ruleInput
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
                    // InternalAnn.g:244:3: this_Output_2= ruleOutput
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
    // InternalAnn.g:256:1: entryRuleHidden returns [EObject current=null] : iv_ruleHidden= ruleHidden EOF ;
    public final EObject entryRuleHidden() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHidden = null;


        try {
            // InternalAnn.g:256:47: (iv_ruleHidden= ruleHidden EOF )
            // InternalAnn.g:257:2: iv_ruleHidden= ruleHidden EOF
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
    // InternalAnn.g:263:1: ruleHidden returns [EObject current=null] : (otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'learningRule' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}' ) ;
    public final EObject ruleHidden() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_l_rule_5_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:269:2: ( (otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'learningRule' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}' ) )
            // InternalAnn.g:270:2: (otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'learningRule' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}' )
            {
            // InternalAnn.g:270:2: (otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'learningRule' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}' )
            // InternalAnn.g:271:3: otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'learningRule' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHiddenAccess().getHiddenKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getHiddenAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getHiddenAccess().getSizeKeyword_2());
            		
            // InternalAnn.g:283:3: ( (lv_size_3_0= RULE_INT ) )
            // InternalAnn.g:284:4: (lv_size_3_0= RULE_INT )
            {
            // InternalAnn.g:284:4: (lv_size_3_0= RULE_INT )
            // InternalAnn.g:285:5: lv_size_3_0= RULE_INT
            {
            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

            otherlv_4=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getHiddenAccess().getLearningRuleKeyword_4());
            		
            // InternalAnn.g:305:3: ( (lv_l_rule_5_0= ruleLearningRule ) )
            // InternalAnn.g:306:4: (lv_l_rule_5_0= ruleLearningRule )
            {
            // InternalAnn.g:306:4: (lv_l_rule_5_0= ruleLearningRule )
            // InternalAnn.g:307:5: lv_l_rule_5_0= ruleLearningRule
            {

            					newCompositeNode(grammarAccess.getHiddenAccess().getL_ruleLearningRuleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_l_rule_5_0=ruleLearningRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHiddenRule());
            					}
            					set(
            						current,
            						"l_rule",
            						lv_l_rule_5_0,
            						"dk.sdu.mdsd.ann.Ann.LearningRule");
            					afterParserOrEnumRuleCall();
            				

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
    // InternalAnn.g:332:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalAnn.g:332:46: (iv_ruleInput= ruleInput EOF )
            // InternalAnn.g:333:2: iv_ruleInput= ruleInput EOF
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
    // InternalAnn.g:339:1: ruleInput returns [EObject current=null] : (otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= '}' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAnn.g:345:2: ( (otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= '}' ) )
            // InternalAnn.g:346:2: (otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= '}' )
            {
            // InternalAnn.g:346:2: (otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= '}' )
            // InternalAnn.g:347:3: otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getSizeKeyword_2());
            		
            // InternalAnn.g:359:3: ( (lv_size_3_0= RULE_INT ) )
            // InternalAnn.g:360:4: (lv_size_3_0= RULE_INT )
            {
            // InternalAnn.g:360:4: (lv_size_3_0= RULE_INT )
            // InternalAnn.g:361:5: lv_size_3_0= RULE_INT
            {
            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInputAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleOutput"
    // InternalAnn.g:385:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalAnn.g:385:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalAnn.g:386:2: iv_ruleOutput= ruleOutput EOF
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
    // InternalAnn.g:392:1: ruleOutput returns [EObject current=null] : (otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'learningRule' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_l_rule_5_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:398:2: ( (otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'learningRule' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}' ) )
            // InternalAnn.g:399:2: (otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'learningRule' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}' )
            {
            // InternalAnn.g:399:2: (otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'learningRule' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}' )
            // InternalAnn.g:400:3: otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'learningRule' ( (lv_l_rule_5_0= ruleLearningRule ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getSizeKeyword_2());
            		
            // InternalAnn.g:412:3: ( (lv_size_3_0= RULE_INT ) )
            // InternalAnn.g:413:4: (lv_size_3_0= RULE_INT )
            {
            // InternalAnn.g:413:4: (lv_size_3_0= RULE_INT )
            // InternalAnn.g:414:5: lv_size_3_0= RULE_INT
            {
            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

            otherlv_4=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getLearningRuleKeyword_4());
            		
            // InternalAnn.g:434:3: ( (lv_l_rule_5_0= ruleLearningRule ) )
            // InternalAnn.g:435:4: (lv_l_rule_5_0= ruleLearningRule )
            {
            // InternalAnn.g:435:4: (lv_l_rule_5_0= ruleLearningRule )
            // InternalAnn.g:436:5: lv_l_rule_5_0= ruleLearningRule
            {

            					newCompositeNode(grammarAccess.getOutputAccess().getL_ruleLearningRuleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_l_rule_5_0=ruleLearningRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputRule());
            					}
            					set(
            						current,
            						"l_rule",
            						lv_l_rule_5_0,
            						"dk.sdu.mdsd.ann.Ann.LearningRule");
            					afterParserOrEnumRuleCall();
            				

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


    // $ANTLR start "entryRuleLearningRule"
    // InternalAnn.g:461:1: entryRuleLearningRule returns [EObject current=null] : iv_ruleLearningRule= ruleLearningRule EOF ;
    public final EObject entryRuleLearningRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLearningRule = null;


        try {
            // InternalAnn.g:461:53: (iv_ruleLearningRule= ruleLearningRule EOF )
            // InternalAnn.g:462:2: iv_ruleLearningRule= ruleLearningRule EOF
            {
             newCompositeNode(grammarAccess.getLearningRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLearningRule=ruleLearningRule();

            state._fsp--;

             current =iv_ruleLearningRule; 
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
    // $ANTLR end "entryRuleLearningRule"


    // $ANTLR start "ruleLearningRule"
    // InternalAnn.g:468:1: ruleLearningRule returns [EObject current=null] : (this_Sigmoid_0= ruleSigmoid | this_External_1= ruleExternal | this_Custom_2= ruleCustom ) ;
    public final EObject ruleLearningRule() throws RecognitionException {
        EObject current = null;

        EObject this_Sigmoid_0 = null;

        EObject this_External_1 = null;

        EObject this_Custom_2 = null;



        	enterRule();

        try {
            // InternalAnn.g:474:2: ( (this_Sigmoid_0= ruleSigmoid | this_External_1= ruleExternal | this_Custom_2= ruleCustom ) )
            // InternalAnn.g:475:2: (this_Sigmoid_0= ruleSigmoid | this_External_1= ruleExternal | this_Custom_2= ruleCustom )
            {
            // InternalAnn.g:475:2: (this_Sigmoid_0= ruleSigmoid | this_External_1= ruleExternal | this_Custom_2= ruleCustom )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==23) ) {
                    alt3=3;
                }
                else if ( (LA3_2==22) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

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
                    // InternalAnn.g:476:3: this_Sigmoid_0= ruleSigmoid
                    {

                    			newCompositeNode(grammarAccess.getLearningRuleAccess().getSigmoidParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sigmoid_0=ruleSigmoid();

                    state._fsp--;


                    			current = this_Sigmoid_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnn.g:485:3: this_External_1= ruleExternal
                    {

                    			newCompositeNode(grammarAccess.getLearningRuleAccess().getExternalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_External_1=ruleExternal();

                    state._fsp--;


                    			current = this_External_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAnn.g:494:3: this_Custom_2= ruleCustom
                    {

                    			newCompositeNode(grammarAccess.getLearningRuleAccess().getCustomParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Custom_2=ruleCustom();

                    state._fsp--;


                    			current = this_Custom_2;
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
    // $ANTLR end "ruleLearningRule"


    // $ANTLR start "entryRuleSigmoid"
    // InternalAnn.g:506:1: entryRuleSigmoid returns [EObject current=null] : iv_ruleSigmoid= ruleSigmoid EOF ;
    public final EObject entryRuleSigmoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigmoid = null;


        try {
            // InternalAnn.g:506:48: (iv_ruleSigmoid= ruleSigmoid EOF )
            // InternalAnn.g:507:2: iv_ruleSigmoid= ruleSigmoid EOF
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
    // InternalAnn.g:513:1: ruleSigmoid returns [EObject current=null] : ( (lv_rule_0_0= 'sigmoid' ) ) ;
    public final EObject ruleSigmoid() throws RecognitionException {
        EObject current = null;

        Token lv_rule_0_0=null;


        	enterRule();

        try {
            // InternalAnn.g:519:2: ( ( (lv_rule_0_0= 'sigmoid' ) ) )
            // InternalAnn.g:520:2: ( (lv_rule_0_0= 'sigmoid' ) )
            {
            // InternalAnn.g:520:2: ( (lv_rule_0_0= 'sigmoid' ) )
            // InternalAnn.g:521:3: (lv_rule_0_0= 'sigmoid' )
            {
            // InternalAnn.g:521:3: (lv_rule_0_0= 'sigmoid' )
            // InternalAnn.g:522:4: lv_rule_0_0= 'sigmoid'
            {
            lv_rule_0_0=(Token)match(input,21,FOLLOW_2); 

            				newLeafNode(lv_rule_0_0, grammarAccess.getSigmoidAccess().getRuleSigmoidKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSigmoidRule());
            				}
            				setWithLastConsumed(current, "rule", lv_rule_0_0, "sigmoid");
            			

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


    // $ANTLR start "entryRuleExternal"
    // InternalAnn.g:537:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalAnn.g:537:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalAnn.g:538:2: iv_ruleExternal= ruleExternal EOF
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
    // InternalAnn.g:544:1: ruleExternal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external' ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAnn.g:550:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external' ) )
            // InternalAnn.g:551:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external' )
            {
            // InternalAnn.g:551:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external' )
            // InternalAnn.g:552:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external'
            {
            // InternalAnn.g:552:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnn.g:553:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnn.g:553:4: (lv_name_0_0= RULE_ID )
            // InternalAnn.g:554:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

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


    // $ANTLR start "entryRuleCustom"
    // InternalAnn.g:578:1: entryRuleCustom returns [EObject current=null] : iv_ruleCustom= ruleCustom EOF ;
    public final EObject entryRuleCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustom = null;


        try {
            // InternalAnn.g:578:47: (iv_ruleCustom= ruleCustom EOF )
            // InternalAnn.g:579:2: iv_ruleCustom= ruleCustom EOF
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
    // InternalAnn.g:585:1: ruleCustom returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(x)' otherlv_2= '{' otherlv_3= 'function' otherlv_4= '=' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= 'derivative' otherlv_7= '=' ( (lv_der_8_0= ruleExpression ) ) otherlv_9= '}' ) ;
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
            // InternalAnn.g:591:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(x)' otherlv_2= '{' otherlv_3= 'function' otherlv_4= '=' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= 'derivative' otherlv_7= '=' ( (lv_der_8_0= ruleExpression ) ) otherlv_9= '}' ) )
            // InternalAnn.g:592:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(x)' otherlv_2= '{' otherlv_3= 'function' otherlv_4= '=' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= 'derivative' otherlv_7= '=' ( (lv_der_8_0= ruleExpression ) ) otherlv_9= '}' )
            {
            // InternalAnn.g:592:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(x)' otherlv_2= '{' otherlv_3= 'function' otherlv_4= '=' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= 'derivative' otherlv_7= '=' ( (lv_der_8_0= ruleExpression ) ) otherlv_9= '}' )
            // InternalAnn.g:593:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(x)' otherlv_2= '{' otherlv_3= 'function' otherlv_4= '=' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= 'derivative' otherlv_7= '=' ( (lv_der_8_0= ruleExpression ) ) otherlv_9= '}'
            {
            // InternalAnn.g:593:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnn.g:594:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnn.g:594:4: (lv_name_0_0= RULE_ID )
            // InternalAnn.g:595:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomAccess().getXKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomAccess().getFunctionKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getCustomAccess().getEqualsSignKeyword_4());
            		
            // InternalAnn.g:627:3: ( (lv_exp_5_0= ruleExpression ) )
            // InternalAnn.g:628:4: (lv_exp_5_0= ruleExpression )
            {
            // InternalAnn.g:628:4: (lv_exp_5_0= ruleExpression )
            // InternalAnn.g:629:5: lv_exp_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCustomAccess().getExpExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_6=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getCustomAccess().getDerivativeKeyword_6());
            		
            otherlv_7=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getCustomAccess().getEqualsSignKeyword_7());
            		
            // InternalAnn.g:654:3: ( (lv_der_8_0= ruleExpression ) )
            // InternalAnn.g:655:4: (lv_der_8_0= ruleExpression )
            {
            // InternalAnn.g:655:4: (lv_der_8_0= ruleExpression )
            // InternalAnn.g:656:5: lv_der_8_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCustomAccess().getDerExpressionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_13);
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
    // InternalAnn.g:681:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAnn.g:681:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAnn.g:682:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAnn.g:688:1: ruleExpression returns [EObject current=null] : (this_Substraction_0= ruleSubstraction ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubstraction ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Substraction_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:694:2: ( (this_Substraction_0= ruleSubstraction ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubstraction ) ) )* ) )
            // InternalAnn.g:695:2: (this_Substraction_0= ruleSubstraction ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubstraction ) ) )* )
            {
            // InternalAnn.g:695:2: (this_Substraction_0= ruleSubstraction ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubstraction ) ) )* )
            // InternalAnn.g:696:3: this_Substraction_0= ruleSubstraction ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubstraction ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getSubstractionParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Substraction_0=ruleSubstraction();

            state._fsp--;


            			current = this_Substraction_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAnn.g:704:3: ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubstraction ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAnn.g:705:4: () otherlv_2= '+' ( (lv_right_3_0= ruleSubstraction ) )
            	    {
            	    // InternalAnn.g:705:4: ()
            	    // InternalAnn.g:706:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getAddLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalAnn.g:716:4: ( (lv_right_3_0= ruleSubstraction ) )
            	    // InternalAnn.g:717:5: (lv_right_3_0= ruleSubstraction )
            	    {
            	    // InternalAnn.g:717:5: (lv_right_3_0= ruleSubstraction )
            	    // InternalAnn.g:718:6: lv_right_3_0= ruleSubstraction
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightSubstractionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleSubstraction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.mdsd.ann.Ann.Substraction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "entryRuleSubstraction"
    // InternalAnn.g:740:1: entryRuleSubstraction returns [EObject current=null] : iv_ruleSubstraction= ruleSubstraction EOF ;
    public final EObject entryRuleSubstraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstraction = null;


        try {
            // InternalAnn.g:740:53: (iv_ruleSubstraction= ruleSubstraction EOF )
            // InternalAnn.g:741:2: iv_ruleSubstraction= ruleSubstraction EOF
            {
             newCompositeNode(grammarAccess.getSubstractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubstraction=ruleSubstraction();

            state._fsp--;

             current =iv_ruleSubstraction; 
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
    // $ANTLR end "entryRuleSubstraction"


    // $ANTLR start "ruleSubstraction"
    // InternalAnn.g:747:1: ruleSubstraction returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleSubstraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:753:2: ( (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalAnn.g:754:2: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalAnn.g:754:2: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalAnn.g:755:3: this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getSubstractionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAnn.g:763:3: ( () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAnn.g:764:4: () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalAnn.g:764:4: ()
            	    // InternalAnn.g:765:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSubstractionAccess().getSubLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSubstractionAccess().getHyphenMinusKeyword_1_1());
            	    			
            	    // InternalAnn.g:775:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalAnn.g:776:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalAnn.g:776:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalAnn.g:777:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getSubstractionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubstractionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.mdsd.ann.Ann.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleSubstraction"


    // $ANTLR start "entryRuleMultiplication"
    // InternalAnn.g:799:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalAnn.g:799:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalAnn.g:800:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalAnn.g:806:1: ruleMultiplication returns [EObject current=null] : (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Division_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:812:2: ( (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* ) )
            // InternalAnn.g:813:2: (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* )
            {
            // InternalAnn.g:813:2: (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* )
            // InternalAnn.g:814:3: this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_Division_0=ruleDivision();

            state._fsp--;


            			current = this_Division_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAnn.g:822:3: ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAnn.g:823:4: () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) )
            	    {
            	    // InternalAnn.g:823:4: ()
            	    // InternalAnn.g:824:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1());
            	    			
            	    // InternalAnn.g:834:4: ( (lv_right_3_0= ruleDivision ) )
            	    // InternalAnn.g:835:5: (lv_right_3_0= ruleDivision )
            	    {
            	    // InternalAnn.g:835:5: (lv_right_3_0= ruleDivision )
            	    // InternalAnn.g:836:6: lv_right_3_0= ruleDivision
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=ruleDivision();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.mdsd.ann.Ann.Division");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // InternalAnn.g:858:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // InternalAnn.g:858:49: (iv_ruleDivision= ruleDivision EOF )
            // InternalAnn.g:859:2: iv_ruleDivision= ruleDivision EOF
            {
             newCompositeNode(grammarAccess.getDivisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivision=ruleDivision();

            state._fsp--;

             current =iv_ruleDivision; 
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
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // InternalAnn.g:865:1: ruleDivision returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:871:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalAnn.g:872:2: (this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalAnn.g:872:2: (this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalAnn.g:873:3: this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getDivisionAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAnn.g:881:3: ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAnn.g:882:4: () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalAnn.g:882:4: ()
            	    // InternalAnn.g:883:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDivisionAccess().getDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,30,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDivisionAccess().getSolidusKeyword_1_1());
            	    			
            	    // InternalAnn.g:893:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalAnn.g:894:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalAnn.g:894:5: (lv_right_3_0= rulePrimary )
            	    // InternalAnn.g:895:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getDivisionAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDivisionRule());
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
            	    break loop7;
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
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRulePrimary"
    // InternalAnn.g:917:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalAnn.g:917:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalAnn.g:918:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalAnn.g:924:1: rulePrimary returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_Letter_1= ruleLetter | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_NumberLiteral_0 = null;

        EObject this_Letter_1 = null;

        EObject this_Expression_3 = null;



        	enterRule();

        try {
            // InternalAnn.g:930:2: ( (this_NumberLiteral_0= ruleNumberLiteral | this_Letter_1= ruleLetter | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) )
            // InternalAnn.g:931:2: (this_NumberLiteral_0= ruleNumberLiteral | this_Letter_1= ruleLetter | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            {
            // InternalAnn.g:931:2: (this_NumberLiteral_0= ruleNumberLiteral | this_Letter_1= ruleLetter | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case 33:
                {
                alt8=2;
                }
                break;
            case 31:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalAnn.g:932:3: this_NumberLiteral_0= ruleNumberLiteral
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
                    // InternalAnn.g:941:3: this_Letter_1= ruleLetter
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
                    // InternalAnn.g:950:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    {
                    // InternalAnn.g:950:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    // InternalAnn.g:951:4: otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_24);
                    this_Expression_3=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


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


    // $ANTLR start "entryRuleLetter"
    // InternalAnn.g:972:1: entryRuleLetter returns [EObject current=null] : iv_ruleLetter= ruleLetter EOF ;
    public final EObject entryRuleLetter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetter = null;


        try {
            // InternalAnn.g:972:47: (iv_ruleLetter= ruleLetter EOF )
            // InternalAnn.g:973:2: iv_ruleLetter= ruleLetter EOF
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
    // InternalAnn.g:979:1: ruleLetter returns [EObject current=null] : ( (lv_value_0_0= 'x' ) ) ;
    public final EObject ruleLetter() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAnn.g:985:2: ( ( (lv_value_0_0= 'x' ) ) )
            // InternalAnn.g:986:2: ( (lv_value_0_0= 'x' ) )
            {
            // InternalAnn.g:986:2: ( (lv_value_0_0= 'x' ) )
            // InternalAnn.g:987:3: (lv_value_0_0= 'x' )
            {
            // InternalAnn.g:987:3: (lv_value_0_0= 'x' )
            // InternalAnn.g:988:4: lv_value_0_0= 'x'
            {
            lv_value_0_0=(Token)match(input,33,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getLetterAccess().getValueXKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLetterRule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, "x");
            			

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


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalAnn.g:1003:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalAnn.g:1003:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalAnn.g:1004:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
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
    // InternalAnn.g:1010:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleDECIMAL ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1016:2: ( ( (lv_value_0_0= ruleDECIMAL ) ) )
            // InternalAnn.g:1017:2: ( (lv_value_0_0= ruleDECIMAL ) )
            {
            // InternalAnn.g:1017:2: ( (lv_value_0_0= ruleDECIMAL ) )
            // InternalAnn.g:1018:3: (lv_value_0_0= ruleDECIMAL )
            {
            // InternalAnn.g:1018:3: (lv_value_0_0= ruleDECIMAL )
            // InternalAnn.g:1019:4: lv_value_0_0= ruleDECIMAL
            {

            				newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueDECIMALParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDECIMAL();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"dk.sdu.mdsd.ann.Ann.DECIMAL");
            				afterParserOrEnumRuleCall();
            			

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000190000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000194000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000280000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});

}