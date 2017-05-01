/*
 * generated by Xtext 2.11.0
 */
grammar InternalAnn;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package dk.sdu.mdsd.ann.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleANNModel
entryRuleANNModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getANNModelRule()); }
	iv_ruleANNModel=ruleANNModel
	{ $current=$iv_ruleANNModel.current; }
	EOF;

// Rule ANNModel
ruleANNModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getANNModelAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getANNModelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getANNModelAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='alpha'
		{
			newLeafNode(otherlv_2, grammarAccess.getANNModelAccess().getAlphaKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getANNModelAccess().getAlphaDECIMALParserRuleCall_3_0());
				}
				lv_alpha_3_0=ruleDECIMAL
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getANNModelRule());
					}
					set(
						$current,
						"alpha",
						lv_alpha_3_0,
						"dk.sdu.mdsd.ann.Ann.DECIMAL");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='epochs'
		{
			newLeafNode(otherlv_4, grammarAccess.getANNModelAccess().getEpochsKeyword_4());
		}
		(
			(
				lv_epochs_5_0=RULE_INT
				{
					newLeafNode(lv_epochs_5_0, grammarAccess.getANNModelAccess().getEpochsINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getANNModelRule());
					}
					setWithLastConsumed(
						$current,
						"epochs",
						lv_epochs_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getANNModelAccess().getActivationActivationParserRuleCall_6_0());
				}
				lv_Activation_6_0=ruleActivation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getANNModelRule());
					}
					add(
						$current,
						"Activation",
						lv_Activation_6_0,
						"dk.sdu.mdsd.ann.Ann.Activation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getANNModelAccess().getLayerLayerParserRuleCall_7_0());
				}
				lv_Layer_7_0=ruleLayer
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getANNModelRule());
					}
					add(
						$current,
						"Layer",
						lv_Layer_7_0,
						"dk.sdu.mdsd.ann.Ann.Layer");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getANNModelAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleDECIMAL
entryRuleDECIMAL returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDECIMALRule()); }
	iv_ruleDECIMAL=ruleDECIMAL
	{ $current=$iv_ruleDECIMAL.current.getText(); }
	EOF;

// Rule DECIMAL
ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0());
		}
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleLayer
entryRuleLayer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLayerRule()); }
	iv_ruleLayer=ruleLayer
	{ $current=$iv_ruleLayer.current; }
	EOF;

// Rule Layer
ruleLayer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getLayerAccess().getHiddenParserRuleCall_0());
		}
		this_Hidden_0=ruleHidden
		{
			$current = $this_Hidden_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLayerAccess().getInputParserRuleCall_1());
		}
		this_Input_1=ruleInput
		{
			$current = $this_Input_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLayerAccess().getOutputParserRuleCall_2());
		}
		this_Output_2=ruleOutput
		{
			$current = $this_Output_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleHidden
entryRuleHidden returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHiddenRule()); }
	iv_ruleHidden=ruleHidden
	{ $current=$iv_ruleHidden.current; }
	EOF;

// Rule Hidden
ruleHidden returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='hidden'
		{
			newLeafNode(otherlv_0, grammarAccess.getHiddenAccess().getHiddenKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getHiddenAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='size'
		{
			newLeafNode(otherlv_2, grammarAccess.getHiddenAccess().getSizeKeyword_2());
		}
		(
			(
				lv_size_3_0=RULE_INT
				{
					newLeafNode(lv_size_3_0, grammarAccess.getHiddenAccess().getSizeINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHiddenRule());
					}
					setWithLastConsumed(
						$current,
						"size",
						lv_size_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_4='activation'
		{
			newLeafNode(otherlv_4, grammarAccess.getHiddenAccess().getActivationKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHiddenRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getHiddenAccess().getL_ruleActivationCrossReference_5_0());
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getHiddenAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleInput
entryRuleInput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputRule()); }
	iv_ruleInput=ruleInput
	{ $current=$iv_ruleInput.current; }
	EOF;

// Rule Input
ruleInput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='in'
		{
			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='size'
		{
			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getSizeKeyword_2());
		}
		(
			(
				lv_size_3_0=RULE_INT
				{
					newLeafNode(lv_size_3_0, grammarAccess.getInputAccess().getSizeINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputRule());
					}
					setWithLastConsumed(
						$current,
						"size",
						lv_size_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getInputAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleOutput
entryRuleOutput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOutputRule()); }
	iv_ruleOutput=ruleOutput
	{ $current=$iv_ruleOutput.current; }
	EOF;

// Rule Output
ruleOutput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='out'
		{
			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='size'
		{
			newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getSizeKeyword_2());
		}
		(
			(
				lv_size_3_0=RULE_INT
				{
					newLeafNode(lv_size_3_0, grammarAccess.getOutputAccess().getSizeINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOutputRule());
					}
					setWithLastConsumed(
						$current,
						"size",
						lv_size_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_4='activation'
		{
			newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getActivationKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOutputRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getOutputAccess().getL_ruleActivationCrossReference_5_0());
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleActivation
entryRuleActivation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActivationRule()); }
	iv_ruleActivation=ruleActivation
	{ $current=$iv_ruleActivation.current; }
	EOF;

// Rule Activation
ruleActivation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getActivationAccess().getSigmoidParserRuleCall_0());
		}
		this_Sigmoid_0=ruleSigmoid
		{
			$current = $this_Sigmoid_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActivationAccess().getTansigParserRuleCall_1());
		}
		this_Tansig_1=ruleTansig
		{
			$current = $this_Tansig_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActivationAccess().getExternalParserRuleCall_2());
		}
		this_External_2=ruleExternal
		{
			$current = $this_External_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActivationAccess().getCustomParserRuleCall_3());
		}
		this_Custom_3=ruleCustom
		{
			$current = $this_Custom_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCustom
entryRuleCustom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCustomRule()); }
	iv_ruleCustom=ruleCustom
	{ $current=$iv_ruleCustom.current; }
	EOF;

// Rule Custom
ruleCustom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getCustomAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCustomRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='(x)'
		{
			newLeafNode(otherlv_1, grammarAccess.getCustomAccess().getXKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='function'
		{
			newLeafNode(otherlv_3, grammarAccess.getCustomAccess().getFunctionKeyword_3());
		}
		otherlv_4='='
		{
			newLeafNode(otherlv_4, grammarAccess.getCustomAccess().getEqualsSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCustomAccess().getExpExpressionParserRuleCall_5_0());
				}
				lv_exp_5_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCustomRule());
					}
					set(
						$current,
						"exp",
						lv_exp_5_0,
						"dk.sdu.mdsd.ann.Ann.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='derivative'
		{
			newLeafNode(otherlv_6, grammarAccess.getCustomAccess().getDerivativeKeyword_6());
		}
		otherlv_7='='
		{
			newLeafNode(otherlv_7, grammarAccess.getCustomAccess().getEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCustomAccess().getDerExpressionParserRuleCall_8_0());
				}
				lv_der_8_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCustomRule());
					}
					set(
						$current,
						"der",
						lv_der_8_0,
						"dk.sdu.mdsd.ann.Ann.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getCustomAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleExternal
entryRuleExternal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExternalRule()); }
	iv_ruleExternal=ruleExternal
	{ $current=$iv_ruleExternal.current; }
	EOF;

// Rule External
ruleExternal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='external'
		{
			newLeafNode(otherlv_1, grammarAccess.getExternalAccess().getExternalKeyword_1());
		}
	)
;

// Entry rule entryRuleSigmoid
entryRuleSigmoid returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSigmoidRule()); }
	iv_ruleSigmoid=ruleSigmoid
	{ $current=$iv_ruleSigmoid.current; }
	EOF;

// Rule Sigmoid
ruleSigmoid returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getSigmoidAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSigmoidRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_rule_1_0='sigmoid'
				{
					newLeafNode(lv_rule_1_0, grammarAccess.getSigmoidAccess().getRuleSigmoidKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSigmoidRule());
					}
					setWithLastConsumed($current, "rule", lv_rule_1_0, "sigmoid");
				}
			)
		)
	)
;

// Entry rule entryRuleTansig
entryRuleTansig returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTansigRule()); }
	iv_ruleTansig=ruleTansig
	{ $current=$iv_ruleTansig.current; }
	EOF;

// Rule Tansig
ruleTansig returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getTansigAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTansigRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_rule_1_0='tansig'
				{
					newLeafNode(lv_rule_1_0, grammarAccess.getTansigAccess().getRuleTansigKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTansigRule());
					}
					setWithLastConsumed($current, "rule", lv_rule_1_0, "tansig");
				}
			)
		)
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getSubstractionParserRuleCall_0());
		}
		this_Substraction_0=ruleSubstraction
		{
			$current = $this_Substraction_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getExpressionAccess().getAddLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='+'
			{
				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExpressionAccess().getRightSubstractionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleSubstraction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"dk.sdu.mdsd.ann.Ann.Substraction");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleSubstraction
entryRuleSubstraction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubstractionRule()); }
	iv_ruleSubstraction=ruleSubstraction
	{ $current=$iv_ruleSubstraction.current; }
	EOF;

// Rule Substraction
ruleSubstraction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSubstractionAccess().getMultiplicationParserRuleCall_0());
		}
		this_Multiplication_0=ruleMultiplication
		{
			$current = $this_Multiplication_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getSubstractionAccess().getSubLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='-'
			{
				newLeafNode(otherlv_2, grammarAccess.getSubstractionAccess().getHyphenMinusKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSubstractionAccess().getRightMultiplicationParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMultiplication
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSubstractionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"dk.sdu.mdsd.ann.Ann.Multiplication");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMultiplication
entryRuleMultiplication returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplicationRule()); }
	iv_ruleMultiplication=ruleMultiplication
	{ $current=$iv_ruleMultiplication.current; }
	EOF;

// Rule Multiplication
ruleMultiplication returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0());
		}
		this_Division_0=ruleDivision
		{
			$current = $this_Division_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='*'
			{
				newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleDivision
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiplicationRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"dk.sdu.mdsd.ann.Ann.Division");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleDivision
entryRuleDivision returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDivisionRule()); }
	iv_ruleDivision=ruleDivision
	{ $current=$iv_ruleDivision.current; }
	EOF;

// Rule Division
ruleDivision returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDivisionAccess().getPrimaryParserRuleCall_0());
		}
		this_Primary_0=rulePrimary
		{
			$current = $this_Primary_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getDivisionAccess().getDivLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='/'
			{
				newLeafNode(otherlv_2, grammarAccess.getDivisionAccess().getSolidusKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDivisionAccess().getRightPrimaryParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDivisionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"dk.sdu.mdsd.ann.Ann.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_0());
		}
		this_NumberLiteral_0=ruleNumberLiteral
		{
			$current = $this_NumberLiteral_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getLetterParserRuleCall_1());
		}
		this_Letter_1=ruleLetter
		{
			$current = $this_Letter_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
			}
			{
				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_2_1());
			}
			this_Expression_3=ruleExpression
			{
				$current = $this_Expression_3.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_4=')'
			{
				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2());
			}
		)
	)
;

// Entry rule entryRuleLetter
entryRuleLetter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLetterRule()); }
	iv_ruleLetter=ruleLetter
	{ $current=$iv_ruleLetter.current; }
	EOF;

// Rule Letter
ruleLetter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0='x'
			{
				newLeafNode(lv_value_0_0, grammarAccess.getLetterAccess().getValueXKeyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getLetterRule());
				}
				setWithLastConsumed($current, "value", lv_value_0_0, "x");
			}
		)
	)
;

// Entry rule entryRuleNumberLiteral
entryRuleNumberLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumberLiteralRule()); }
	iv_ruleNumberLiteral=ruleNumberLiteral
	{ $current=$iv_ruleNumberLiteral.current; }
	EOF;

// Rule NumberLiteral
ruleNumberLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueDECIMALParserRuleCall_0());
			}
			lv_value_0_0=ruleDECIMAL
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
				}
				set(
					$current,
					"value",
					lv_value_0_0,
					"dk.sdu.mdsd.ann.Ann.DECIMAL");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
