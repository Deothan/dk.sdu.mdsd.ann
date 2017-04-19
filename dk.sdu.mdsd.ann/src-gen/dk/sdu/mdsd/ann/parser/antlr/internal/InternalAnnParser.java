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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'alpha'", "'epochs'", "'}'", "'.'", "'hidden'", "'size'", "'learningRule'", "'in'", "'out'", "'sigmoid'", "'threshold'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
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
    // InternalAnn.g:468:1: ruleLearningRule returns [EObject current=null] : (this_Sigmoid_0= ruleSigmoid | this_Threshold_1= ruleThreshold | this_Custom_2= ruleCustom ) ;
    public final EObject ruleLearningRule() throws RecognitionException {
        EObject current = null;

        EObject this_Sigmoid_0 = null;

        EObject this_Threshold_1 = null;

        EObject this_Custom_2 = null;



        	enterRule();

        try {
            // InternalAnn.g:474:2: ( (this_Sigmoid_0= ruleSigmoid | this_Threshold_1= ruleThreshold | this_Custom_2= ruleCustom ) )
            // InternalAnn.g:475:2: (this_Sigmoid_0= ruleSigmoid | this_Threshold_1= ruleThreshold | this_Custom_2= ruleCustom )
            {
            // InternalAnn.g:475:2: (this_Sigmoid_0= ruleSigmoid | this_Threshold_1= ruleThreshold | this_Custom_2= ruleCustom )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
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
                    // InternalAnn.g:485:3: this_Threshold_1= ruleThreshold
                    {

                    			newCompositeNode(grammarAccess.getLearningRuleAccess().getThresholdParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Threshold_1=ruleThreshold();

                    state._fsp--;


                    			current = this_Threshold_1;
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
    // InternalAnn.g:513:1: ruleSigmoid returns [EObject current=null] : (otherlv_0= 'sigmoid' ( (lv_name_1_0= 'sigmoid' ) ) ) ;
    public final EObject ruleSigmoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAnn.g:519:2: ( (otherlv_0= 'sigmoid' ( (lv_name_1_0= 'sigmoid' ) ) ) )
            // InternalAnn.g:520:2: (otherlv_0= 'sigmoid' ( (lv_name_1_0= 'sigmoid' ) ) )
            {
            // InternalAnn.g:520:2: (otherlv_0= 'sigmoid' ( (lv_name_1_0= 'sigmoid' ) ) )
            // InternalAnn.g:521:3: otherlv_0= 'sigmoid' ( (lv_name_1_0= 'sigmoid' ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSigmoidAccess().getSigmoidKeyword_0());
            		
            // InternalAnn.g:525:3: ( (lv_name_1_0= 'sigmoid' ) )
            // InternalAnn.g:526:4: (lv_name_1_0= 'sigmoid' )
            {
            // InternalAnn.g:526:4: (lv_name_1_0= 'sigmoid' )
            // InternalAnn.g:527:5: lv_name_1_0= 'sigmoid'
            {
            lv_name_1_0=(Token)match(input,21,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSigmoidAccess().getNameSigmoidKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSigmoidRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "sigmoid");
            				

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


    // $ANTLR start "entryRuleThreshold"
    // InternalAnn.g:543:1: entryRuleThreshold returns [EObject current=null] : iv_ruleThreshold= ruleThreshold EOF ;
    public final EObject entryRuleThreshold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThreshold = null;


        try {
            // InternalAnn.g:543:50: (iv_ruleThreshold= ruleThreshold EOF )
            // InternalAnn.g:544:2: iv_ruleThreshold= ruleThreshold EOF
            {
             newCompositeNode(grammarAccess.getThresholdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThreshold=ruleThreshold();

            state._fsp--;

             current =iv_ruleThreshold; 
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
    // $ANTLR end "entryRuleThreshold"


    // $ANTLR start "ruleThreshold"
    // InternalAnn.g:550:1: ruleThreshold returns [EObject current=null] : (otherlv_0= 'threshold' ( (lv_name_1_0= 'threshold' ) ) ) ;
    public final EObject ruleThreshold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAnn.g:556:2: ( (otherlv_0= 'threshold' ( (lv_name_1_0= 'threshold' ) ) ) )
            // InternalAnn.g:557:2: (otherlv_0= 'threshold' ( (lv_name_1_0= 'threshold' ) ) )
            {
            // InternalAnn.g:557:2: (otherlv_0= 'threshold' ( (lv_name_1_0= 'threshold' ) ) )
            // InternalAnn.g:558:3: otherlv_0= 'threshold' ( (lv_name_1_0= 'threshold' ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getThresholdAccess().getThresholdKeyword_0());
            		
            // InternalAnn.g:562:3: ( (lv_name_1_0= 'threshold' ) )
            // InternalAnn.g:563:4: (lv_name_1_0= 'threshold' )
            {
            // InternalAnn.g:563:4: (lv_name_1_0= 'threshold' )
            // InternalAnn.g:564:5: lv_name_1_0= 'threshold'
            {
            lv_name_1_0=(Token)match(input,22,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getThresholdAccess().getNameThresholdKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThresholdRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "threshold");
            				

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
    // $ANTLR end "ruleThreshold"


    // $ANTLR start "entryRuleCustom"
    // InternalAnn.g:580:1: entryRuleCustom returns [EObject current=null] : iv_ruleCustom= ruleCustom EOF ;
    public final EObject entryRuleCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustom = null;


        try {
            // InternalAnn.g:580:47: (iv_ruleCustom= ruleCustom EOF )
            // InternalAnn.g:581:2: iv_ruleCustom= ruleCustom EOF
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
    // InternalAnn.g:587:1: ruleCustom returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= '}' ) ;
    public final EObject ruleCustom() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_function_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAnn.g:593:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= '}' ) )
            // InternalAnn.g:594:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= '}' )
            {
            // InternalAnn.g:594:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= '}' )
            // InternalAnn.g:595:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= '}'
            {
            // InternalAnn.g:595:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnn.g:596:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnn.g:596:4: (lv_name_0_0= RULE_ID )
            // InternalAnn.g:597:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

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

            otherlv_1=(Token)match(input,11,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAnn.g:617:3: ( (lv_function_2_0= RULE_ID ) )
            // InternalAnn.g:618:4: (lv_function_2_0= RULE_ID )
            {
            // InternalAnn.g:618:4: (lv_function_2_0= RULE_ID )
            // InternalAnn.g:619:5: lv_function_2_0= RULE_ID
            {
            lv_function_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_function_2_0, grammarAccess.getCustomAccess().getFunctionIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"function",
            						lv_function_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomAccess().getRightCurlyBracketKeyword_3());
            		

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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});

}