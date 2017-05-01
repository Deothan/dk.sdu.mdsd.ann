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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'alpha'", "'epochs'", "'}'", "'.'", "'hidden'", "'size'", "'activation'", "'in'", "'out'", "'(x)'", "'function'", "'='", "'derivative'", "'external'", "'sigmoid'", "'tansig'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'x'"
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
    // InternalAnn.g:71:1: ruleANNModel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_Activation_6_0= ruleActivation ) )* ( (lv_Layer_7_0= ruleLayer ) )* otherlv_8= '}' ) ;
    public final EObject ruleANNModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_epochs_5_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_alpha_3_0 = null;

        EObject lv_Activation_6_0 = null;

        EObject lv_Layer_7_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:77:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_Activation_6_0= ruleActivation ) )* ( (lv_Layer_7_0= ruleLayer ) )* otherlv_8= '}' ) )
            // InternalAnn.g:78:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_Activation_6_0= ruleActivation ) )* ( (lv_Layer_7_0= ruleLayer ) )* otherlv_8= '}' )
            {
            // InternalAnn.g:78:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_Activation_6_0= ruleActivation ) )* ( (lv_Layer_7_0= ruleLayer ) )* otherlv_8= '}' )
            // InternalAnn.g:79:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'alpha' ( (lv_alpha_3_0= ruleDECIMAL ) ) otherlv_4= 'epochs' ( (lv_epochs_5_0= RULE_INT ) ) ( (lv_Activation_6_0= ruleActivation ) )* ( (lv_Layer_7_0= ruleLayer ) )* otherlv_8= '}'
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

            // InternalAnn.g:146:3: ( (lv_Activation_6_0= ruleActivation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAnn.g:147:4: (lv_Activation_6_0= ruleActivation )
            	    {
            	    // InternalAnn.g:147:4: (lv_Activation_6_0= ruleActivation )
            	    // InternalAnn.g:148:5: lv_Activation_6_0= ruleActivation
            	    {

            	    					newCompositeNode(grammarAccess.getANNModelAccess().getActivationActivationParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_Activation_6_0=ruleActivation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getANNModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Activation",
            	    						lv_Activation_6_0,
            	    						"dk.sdu.mdsd.ann.Ann.Activation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalAnn.g:165:3: ( (lv_Layer_7_0= ruleLayer ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||(LA2_0>=19 && LA2_0<=20)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAnn.g:166:4: (lv_Layer_7_0= ruleLayer )
            	    {
            	    // InternalAnn.g:166:4: (lv_Layer_7_0= ruleLayer )
            	    // InternalAnn.g:167:5: lv_Layer_7_0= ruleLayer
            	    {

            	    					newCompositeNode(grammarAccess.getANNModelAccess().getLayerLayerParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_Layer_7_0=ruleLayer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getANNModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Layer",
            	    						lv_Layer_7_0,
            	    						"dk.sdu.mdsd.ann.Ann.Layer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getANNModelAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalAnn.g:192:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalAnn.g:192:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalAnn.g:193:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalAnn.g:199:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalAnn.g:205:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalAnn.g:206:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalAnn.g:206:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalAnn.g:207:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
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
    // InternalAnn.g:230:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalAnn.g:230:46: (iv_ruleLayer= ruleLayer EOF )
            // InternalAnn.g:231:2: iv_ruleLayer= ruleLayer EOF
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
    // InternalAnn.g:237:1: ruleLayer returns [EObject current=null] : (this_Hidden_0= ruleHidden | this_Input_1= ruleInput | this_Output_2= ruleOutput ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        EObject this_Hidden_0 = null;

        EObject this_Input_1 = null;

        EObject this_Output_2 = null;



        	enterRule();

        try {
            // InternalAnn.g:243:2: ( (this_Hidden_0= ruleHidden | this_Input_1= ruleInput | this_Output_2= ruleOutput ) )
            // InternalAnn.g:244:2: (this_Hidden_0= ruleHidden | this_Input_1= ruleInput | this_Output_2= ruleOutput )
            {
            // InternalAnn.g:244:2: (this_Hidden_0= ruleHidden | this_Input_1= ruleInput | this_Output_2= ruleOutput )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
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
                    // InternalAnn.g:245:3: this_Hidden_0= ruleHidden
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
                    // InternalAnn.g:254:3: this_Input_1= ruleInput
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
                    // InternalAnn.g:263:3: this_Output_2= ruleOutput
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
    // InternalAnn.g:275:1: entryRuleHidden returns [EObject current=null] : iv_ruleHidden= ruleHidden EOF ;
    public final EObject entryRuleHidden() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHidden = null;


        try {
            // InternalAnn.g:275:47: (iv_ruleHidden= ruleHidden EOF )
            // InternalAnn.g:276:2: iv_ruleHidden= ruleHidden EOF
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
    // InternalAnn.g:282:1: ruleHidden returns [EObject current=null] : (otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) ;
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
            // InternalAnn.g:288:2: ( (otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) )
            // InternalAnn.g:289:2: (otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            {
            // InternalAnn.g:289:2: (otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            // InternalAnn.g:290:3: otherlv_0= 'hidden' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHiddenAccess().getHiddenKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getHiddenAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getHiddenAccess().getSizeKeyword_2());
            		
            // InternalAnn.g:302:3: ( (lv_size_3_0= RULE_INT ) )
            // InternalAnn.g:303:4: (lv_size_3_0= RULE_INT )
            {
            // InternalAnn.g:303:4: (lv_size_3_0= RULE_INT )
            // InternalAnn.g:304:5: lv_size_3_0= RULE_INT
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

            			newLeafNode(otherlv_4, grammarAccess.getHiddenAccess().getActivationKeyword_4());
            		
            // InternalAnn.g:324:3: ( (otherlv_5= RULE_ID ) )
            // InternalAnn.g:325:4: (otherlv_5= RULE_ID )
            {
            // InternalAnn.g:325:4: (otherlv_5= RULE_ID )
            // InternalAnn.g:326:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHiddenRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); 

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
    // InternalAnn.g:345:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalAnn.g:345:46: (iv_ruleInput= ruleInput EOF )
            // InternalAnn.g:346:2: iv_ruleInput= ruleInput EOF
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
    // InternalAnn.g:352:1: ruleInput returns [EObject current=null] : (otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= '}' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAnn.g:358:2: ( (otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= '}' ) )
            // InternalAnn.g:359:2: (otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= '}' )
            {
            // InternalAnn.g:359:2: (otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= '}' )
            // InternalAnn.g:360:3: otherlv_0= 'in' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getSizeKeyword_2());
            		
            // InternalAnn.g:372:3: ( (lv_size_3_0= RULE_INT ) )
            // InternalAnn.g:373:4: (lv_size_3_0= RULE_INT )
            {
            // InternalAnn.g:373:4: (lv_size_3_0= RULE_INT )
            // InternalAnn.g:374:5: lv_size_3_0= RULE_INT
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
    // InternalAnn.g:398:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalAnn.g:398:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalAnn.g:399:2: iv_ruleOutput= ruleOutput EOF
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
    // InternalAnn.g:405:1: ruleOutput returns [EObject current=null] : (otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) ;
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
            // InternalAnn.g:411:2: ( (otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) )
            // InternalAnn.g:412:2: (otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            {
            // InternalAnn.g:412:2: (otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            // InternalAnn.g:413:3: otherlv_0= 'out' otherlv_1= '{' otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'activation' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getSizeKeyword_2());
            		
            // InternalAnn.g:425:3: ( (lv_size_3_0= RULE_INT ) )
            // InternalAnn.g:426:4: (lv_size_3_0= RULE_INT )
            {
            // InternalAnn.g:426:4: (lv_size_3_0= RULE_INT )
            // InternalAnn.g:427:5: lv_size_3_0= RULE_INT
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

            			newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getActivationKeyword_4());
            		
            // InternalAnn.g:447:3: ( (otherlv_5= RULE_ID ) )
            // InternalAnn.g:448:4: (otherlv_5= RULE_ID )
            {
            // InternalAnn.g:448:4: (otherlv_5= RULE_ID )
            // InternalAnn.g:449:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); 

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
    // InternalAnn.g:468:1: entryRuleActivation returns [EObject current=null] : iv_ruleActivation= ruleActivation EOF ;
    public final EObject entryRuleActivation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivation = null;


        try {
            // InternalAnn.g:468:51: (iv_ruleActivation= ruleActivation EOF )
            // InternalAnn.g:469:2: iv_ruleActivation= ruleActivation EOF
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
    // InternalAnn.g:475:1: ruleActivation returns [EObject current=null] : (this_Sigmoid_0= ruleSigmoid | this_Tansig_1= ruleTansig | this_External_2= ruleExternal | this_Custom_3= ruleCustom ) ;
    public final EObject ruleActivation() throws RecognitionException {
        EObject current = null;

        EObject this_Sigmoid_0 = null;

        EObject this_Tansig_1 = null;

        EObject this_External_2 = null;

        EObject this_Custom_3 = null;



        	enterRule();

        try {
            // InternalAnn.g:481:2: ( (this_Sigmoid_0= ruleSigmoid | this_Tansig_1= ruleTansig | this_External_2= ruleExternal | this_Custom_3= ruleCustom ) )
            // InternalAnn.g:482:2: (this_Sigmoid_0= ruleSigmoid | this_Tansig_1= ruleTansig | this_External_2= ruleExternal | this_Custom_3= ruleCustom )
            {
            // InternalAnn.g:482:2: (this_Sigmoid_0= ruleSigmoid | this_Tansig_1= ruleTansig | this_External_2= ruleExternal | this_Custom_3= ruleCustom )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt4=3;
                    }
                    break;
                case 21:
                    {
                    alt4=4;
                    }
                    break;
                case 26:
                    {
                    alt4=1;
                    }
                    break;
                case 27:
                    {
                    alt4=2;
                    }
                    break;
                default:
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
                    // InternalAnn.g:483:3: this_Sigmoid_0= ruleSigmoid
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
                    // InternalAnn.g:492:3: this_Tansig_1= ruleTansig
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
                    // InternalAnn.g:501:3: this_External_2= ruleExternal
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
                    // InternalAnn.g:510:3: this_Custom_3= ruleCustom
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


    // $ANTLR start "entryRuleCustom"
    // InternalAnn.g:522:1: entryRuleCustom returns [EObject current=null] : iv_ruleCustom= ruleCustom EOF ;
    public final EObject entryRuleCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustom = null;


        try {
            // InternalAnn.g:522:47: (iv_ruleCustom= ruleCustom EOF )
            // InternalAnn.g:523:2: iv_ruleCustom= ruleCustom EOF
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
    // InternalAnn.g:529:1: ruleCustom returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(x)' otherlv_2= '{' otherlv_3= 'function' otherlv_4= '=' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= 'derivative' otherlv_7= '=' ( (lv_der_8_0= ruleExpression ) ) otherlv_9= '}' ) ;
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
            // InternalAnn.g:535:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(x)' otherlv_2= '{' otherlv_3= 'function' otherlv_4= '=' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= 'derivative' otherlv_7= '=' ( (lv_der_8_0= ruleExpression ) ) otherlv_9= '}' ) )
            // InternalAnn.g:536:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(x)' otherlv_2= '{' otherlv_3= 'function' otherlv_4= '=' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= 'derivative' otherlv_7= '=' ( (lv_der_8_0= ruleExpression ) ) otherlv_9= '}' )
            {
            // InternalAnn.g:536:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(x)' otherlv_2= '{' otherlv_3= 'function' otherlv_4= '=' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= 'derivative' otherlv_7= '=' ( (lv_der_8_0= ruleExpression ) ) otherlv_9= '}' )
            // InternalAnn.g:537:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(x)' otherlv_2= '{' otherlv_3= 'function' otherlv_4= '=' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= 'derivative' otherlv_7= '=' ( (lv_der_8_0= ruleExpression ) ) otherlv_9= '}'
            {
            // InternalAnn.g:537:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnn.g:538:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnn.g:538:4: (lv_name_0_0= RULE_ID )
            // InternalAnn.g:539:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomAccess().getXKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomAccess().getFunctionKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getCustomAccess().getEqualsSignKeyword_4());
            		
            // InternalAnn.g:571:3: ( (lv_exp_5_0= ruleExpression ) )
            // InternalAnn.g:572:4: (lv_exp_5_0= ruleExpression )
            {
            // InternalAnn.g:572:4: (lv_exp_5_0= ruleExpression )
            // InternalAnn.g:573:5: lv_exp_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCustomAccess().getExpExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_6=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getCustomAccess().getDerivativeKeyword_6());
            		
            otherlv_7=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getCustomAccess().getEqualsSignKeyword_7());
            		
            // InternalAnn.g:598:3: ( (lv_der_8_0= ruleExpression ) )
            // InternalAnn.g:599:4: (lv_der_8_0= ruleExpression )
            {
            // InternalAnn.g:599:4: (lv_der_8_0= ruleExpression )
            // InternalAnn.g:600:5: lv_der_8_0= ruleExpression
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


    // $ANTLR start "entryRuleExternal"
    // InternalAnn.g:625:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalAnn.g:625:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalAnn.g:626:2: iv_ruleExternal= ruleExternal EOF
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
    // InternalAnn.g:632:1: ruleExternal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external' ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAnn.g:638:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external' ) )
            // InternalAnn.g:639:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external' )
            {
            // InternalAnn.g:639:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external' )
            // InternalAnn.g:640:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'external'
            {
            // InternalAnn.g:640:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnn.g:641:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnn.g:641:4: (lv_name_0_0= RULE_ID )
            // InternalAnn.g:642:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

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
    // InternalAnn.g:666:1: entryRuleSigmoid returns [EObject current=null] : iv_ruleSigmoid= ruleSigmoid EOF ;
    public final EObject entryRuleSigmoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigmoid = null;


        try {
            // InternalAnn.g:666:48: (iv_ruleSigmoid= ruleSigmoid EOF )
            // InternalAnn.g:667:2: iv_ruleSigmoid= ruleSigmoid EOF
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
    // InternalAnn.g:673:1: ruleSigmoid returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'sigmoid' ) ) ) ;
    public final EObject ruleSigmoid() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_rule_1_0=null;


        	enterRule();

        try {
            // InternalAnn.g:679:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'sigmoid' ) ) ) )
            // InternalAnn.g:680:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'sigmoid' ) ) )
            {
            // InternalAnn.g:680:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'sigmoid' ) ) )
            // InternalAnn.g:681:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'sigmoid' ) )
            {
            // InternalAnn.g:681:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnn.g:682:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnn.g:682:4: (lv_name_0_0= RULE_ID )
            // InternalAnn.g:683:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            // InternalAnn.g:699:3: ( (lv_rule_1_0= 'sigmoid' ) )
            // InternalAnn.g:700:4: (lv_rule_1_0= 'sigmoid' )
            {
            // InternalAnn.g:700:4: (lv_rule_1_0= 'sigmoid' )
            // InternalAnn.g:701:5: lv_rule_1_0= 'sigmoid'
            {
            lv_rule_1_0=(Token)match(input,26,FOLLOW_2); 

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
    // InternalAnn.g:717:1: entryRuleTansig returns [EObject current=null] : iv_ruleTansig= ruleTansig EOF ;
    public final EObject entryRuleTansig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTansig = null;


        try {
            // InternalAnn.g:717:47: (iv_ruleTansig= ruleTansig EOF )
            // InternalAnn.g:718:2: iv_ruleTansig= ruleTansig EOF
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
    // InternalAnn.g:724:1: ruleTansig returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'tansig' ) ) ) ;
    public final EObject ruleTansig() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_rule_1_0=null;


        	enterRule();

        try {
            // InternalAnn.g:730:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'tansig' ) ) ) )
            // InternalAnn.g:731:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'tansig' ) ) )
            {
            // InternalAnn.g:731:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'tansig' ) ) )
            // InternalAnn.g:732:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= 'tansig' ) )
            {
            // InternalAnn.g:732:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnn.g:733:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnn.g:733:4: (lv_name_0_0= RULE_ID )
            // InternalAnn.g:734:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            // InternalAnn.g:750:3: ( (lv_rule_1_0= 'tansig' ) )
            // InternalAnn.g:751:4: (lv_rule_1_0= 'tansig' )
            {
            // InternalAnn.g:751:4: (lv_rule_1_0= 'tansig' )
            // InternalAnn.g:752:5: lv_rule_1_0= 'tansig'
            {
            lv_rule_1_0=(Token)match(input,27,FOLLOW_2); 

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


    // $ANTLR start "entryRuleExpression"
    // InternalAnn.g:768:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAnn.g:768:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAnn.g:769:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAnn.g:775:1: ruleExpression returns [EObject current=null] : (this_Substraction_0= ruleSubstraction ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubstraction ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Substraction_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:781:2: ( (this_Substraction_0= ruleSubstraction ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubstraction ) ) )* ) )
            // InternalAnn.g:782:2: (this_Substraction_0= ruleSubstraction ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubstraction ) ) )* )
            {
            // InternalAnn.g:782:2: (this_Substraction_0= ruleSubstraction ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubstraction ) ) )* )
            // InternalAnn.g:783:3: this_Substraction_0= ruleSubstraction ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubstraction ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getSubstractionParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_Substraction_0=ruleSubstraction();

            state._fsp--;


            			current = this_Substraction_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAnn.g:791:3: ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubstraction ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAnn.g:792:4: () otherlv_2= '+' ( (lv_right_3_0= ruleSubstraction ) )
            	    {
            	    // InternalAnn.g:792:4: ()
            	    // InternalAnn.g:793:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getAddLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalAnn.g:803:4: ( (lv_right_3_0= ruleSubstraction ) )
            	    // InternalAnn.g:804:5: (lv_right_3_0= ruleSubstraction )
            	    {
            	    // InternalAnn.g:804:5: (lv_right_3_0= ruleSubstraction )
            	    // InternalAnn.g:805:6: lv_right_3_0= ruleSubstraction
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightSubstractionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSubstraction"
    // InternalAnn.g:827:1: entryRuleSubstraction returns [EObject current=null] : iv_ruleSubstraction= ruleSubstraction EOF ;
    public final EObject entryRuleSubstraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstraction = null;


        try {
            // InternalAnn.g:827:53: (iv_ruleSubstraction= ruleSubstraction EOF )
            // InternalAnn.g:828:2: iv_ruleSubstraction= ruleSubstraction EOF
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
    // InternalAnn.g:834:1: ruleSubstraction returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleSubstraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:840:2: ( (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalAnn.g:841:2: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalAnn.g:841:2: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalAnn.g:842:3: this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getSubstractionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAnn.g:850:3: ( () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAnn.g:851:4: () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalAnn.g:851:4: ()
            	    // InternalAnn.g:852:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSubstractionAccess().getSubLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSubstractionAccess().getHyphenMinusKeyword_1_1());
            	    			
            	    // InternalAnn.g:862:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalAnn.g:863:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalAnn.g:863:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalAnn.g:864:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getSubstractionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
    // $ANTLR end "ruleSubstraction"


    // $ANTLR start "entryRuleMultiplication"
    // InternalAnn.g:886:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalAnn.g:886:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalAnn.g:887:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalAnn.g:893:1: ruleMultiplication returns [EObject current=null] : (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Division_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:899:2: ( (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* ) )
            // InternalAnn.g:900:2: (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* )
            {
            // InternalAnn.g:900:2: (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* )
            // InternalAnn.g:901:3: this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_Division_0=ruleDivision();

            state._fsp--;


            			current = this_Division_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAnn.g:909:3: ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAnn.g:910:4: () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) )
            	    {
            	    // InternalAnn.g:910:4: ()
            	    // InternalAnn.g:911:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,30,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1());
            	    			
            	    // InternalAnn.g:921:4: ( (lv_right_3_0= ruleDivision ) )
            	    // InternalAnn.g:922:5: (lv_right_3_0= ruleDivision )
            	    {
            	    // InternalAnn.g:922:5: (lv_right_3_0= ruleDivision )
            	    // InternalAnn.g:923:6: lv_right_3_0= ruleDivision
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // InternalAnn.g:945:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // InternalAnn.g:945:49: (iv_ruleDivision= ruleDivision EOF )
            // InternalAnn.g:946:2: iv_ruleDivision= ruleDivision EOF
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
    // InternalAnn.g:952:1: ruleDivision returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:958:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalAnn.g:959:2: (this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalAnn.g:959:2: (this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalAnn.g:960:3: this_Primary_0= rulePrimary ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getDivisionAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAnn.g:968:3: ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAnn.g:969:4: () otherlv_2= '/' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalAnn.g:969:4: ()
            	    // InternalAnn.g:970:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDivisionAccess().getDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDivisionAccess().getSolidusKeyword_1_1());
            	    			
            	    // InternalAnn.g:980:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalAnn.g:981:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalAnn.g:981:5: (lv_right_3_0= rulePrimary )
            	    // InternalAnn.g:982:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getDivisionAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop8;
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
    // InternalAnn.g:1004:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalAnn.g:1004:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalAnn.g:1005:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalAnn.g:1011:1: rulePrimary returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_Letter_1= ruleLetter | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_NumberLiteral_0 = null;

        EObject this_Letter_1 = null;

        EObject this_Expression_3 = null;



        	enterRule();

        try {
            // InternalAnn.g:1017:2: ( (this_NumberLiteral_0= ruleNumberLiteral | this_Letter_1= ruleLetter | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) )
            // InternalAnn.g:1018:2: (this_NumberLiteral_0= ruleNumberLiteral | this_Letter_1= ruleLetter | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            {
            // InternalAnn.g:1018:2: (this_NumberLiteral_0= ruleNumberLiteral | this_Letter_1= ruleLetter | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case 34:
                {
                alt9=2;
                }
                break;
            case 32:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAnn.g:1019:3: this_NumberLiteral_0= ruleNumberLiteral
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
                    // InternalAnn.g:1028:3: this_Letter_1= ruleLetter
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
                    // InternalAnn.g:1037:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    {
                    // InternalAnn.g:1037:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    // InternalAnn.g:1038:4: otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_26);
                    this_Expression_3=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,33,FOLLOW_2); 

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
    // InternalAnn.g:1059:1: entryRuleLetter returns [EObject current=null] : iv_ruleLetter= ruleLetter EOF ;
    public final EObject entryRuleLetter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetter = null;


        try {
            // InternalAnn.g:1059:47: (iv_ruleLetter= ruleLetter EOF )
            // InternalAnn.g:1060:2: iv_ruleLetter= ruleLetter EOF
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
    // InternalAnn.g:1066:1: ruleLetter returns [EObject current=null] : ( (lv_value_0_0= 'x' ) ) ;
    public final EObject ruleLetter() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAnn.g:1072:2: ( ( (lv_value_0_0= 'x' ) ) )
            // InternalAnn.g:1073:2: ( (lv_value_0_0= 'x' ) )
            {
            // InternalAnn.g:1073:2: ( (lv_value_0_0= 'x' ) )
            // InternalAnn.g:1074:3: (lv_value_0_0= 'x' )
            {
            // InternalAnn.g:1074:3: (lv_value_0_0= 'x' )
            // InternalAnn.g:1075:4: lv_value_0_0= 'x'
            {
            lv_value_0_0=(Token)match(input,34,FOLLOW_2); 

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
    // InternalAnn.g:1090:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalAnn.g:1090:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalAnn.g:1091:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
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
    // InternalAnn.g:1097:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleDECIMAL ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAnn.g:1103:2: ( ( (lv_value_0_0= ruleDECIMAL ) ) )
            // InternalAnn.g:1104:2: ( (lv_value_0_0= ruleDECIMAL ) )
            {
            // InternalAnn.g:1104:2: ( (lv_value_0_0= ruleDECIMAL ) )
            // InternalAnn.g:1105:3: (lv_value_0_0= ruleDECIMAL )
            {
            // InternalAnn.g:1105:3: (lv_value_0_0= ruleDECIMAL )
            // InternalAnn.g:1106:4: lv_value_0_0= ruleDECIMAL
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000194010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000194000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000500000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});

}