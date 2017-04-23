/*
 * generated by Xtext 2.11.0
 */
grammar InternalAnn;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package dk.sdu.mdsd.ann.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleANNModel
entryRuleANNModel
:
{ before(grammarAccess.getANNModelRule()); }
	 ruleANNModel
{ after(grammarAccess.getANNModelRule()); } 
	 EOF 
;

// Rule ANNModel
ruleANNModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getANNModelAccess().getGroup()); }
		(rule__ANNModel__Group__0)
		{ after(grammarAccess.getANNModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDECIMAL
entryRuleDECIMAL
:
{ before(grammarAccess.getDECIMALRule()); }
	 ruleDECIMAL
{ after(grammarAccess.getDECIMALRule()); } 
	 EOF 
;

// Rule DECIMAL
ruleDECIMAL 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDECIMALAccess().getGroup()); }
		(rule__DECIMAL__Group__0)
		{ after(grammarAccess.getDECIMALAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLayer
entryRuleLayer
:
{ before(grammarAccess.getLayerRule()); }
	 ruleLayer
{ after(grammarAccess.getLayerRule()); } 
	 EOF 
;

// Rule Layer
ruleLayer 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLayerAccess().getAlternatives()); }
		(rule__Layer__Alternatives)
		{ after(grammarAccess.getLayerAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleHidden
entryRuleHidden
:
{ before(grammarAccess.getHiddenRule()); }
	 ruleHidden
{ after(grammarAccess.getHiddenRule()); } 
	 EOF 
;

// Rule Hidden
ruleHidden 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getHiddenAccess().getGroup()); }
		(rule__Hidden__Group__0)
		{ after(grammarAccess.getHiddenAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInput
entryRuleInput
:
{ before(grammarAccess.getInputRule()); }
	 ruleInput
{ after(grammarAccess.getInputRule()); } 
	 EOF 
;

// Rule Input
ruleInput 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInputAccess().getGroup()); }
		(rule__Input__Group__0)
		{ after(grammarAccess.getInputAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOutput
entryRuleOutput
:
{ before(grammarAccess.getOutputRule()); }
	 ruleOutput
{ after(grammarAccess.getOutputRule()); } 
	 EOF 
;

// Rule Output
ruleOutput 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOutputAccess().getGroup()); }
		(rule__Output__Group__0)
		{ after(grammarAccess.getOutputAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLearningRule
entryRuleLearningRule
:
{ before(grammarAccess.getLearningRuleRule()); }
	 ruleLearningRule
{ after(grammarAccess.getLearningRuleRule()); } 
	 EOF 
;

// Rule LearningRule
ruleLearningRule 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLearningRuleAccess().getAlternatives()); }
		(rule__LearningRule__Alternatives)
		{ after(grammarAccess.getLearningRuleAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSigmoid
entryRuleSigmoid
:
{ before(grammarAccess.getSigmoidRule()); }
	 ruleSigmoid
{ after(grammarAccess.getSigmoidRule()); } 
	 EOF 
;

// Rule Sigmoid
ruleSigmoid 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSigmoidAccess().getRuleAssignment()); }
		(rule__Sigmoid__RuleAssignment)
		{ after(grammarAccess.getSigmoidAccess().getRuleAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleThreshold
entryRuleThreshold
:
{ before(grammarAccess.getThresholdRule()); }
	 ruleThreshold
{ after(grammarAccess.getThresholdRule()); } 
	 EOF 
;

// Rule Threshold
ruleThreshold 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getThresholdAccess().getRuleAssignment()); }
		(rule__Threshold__RuleAssignment)
		{ after(grammarAccess.getThresholdAccess().getRuleAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCustom
entryRuleCustom
:
{ before(grammarAccess.getCustomRule()); }
	 ruleCustom
{ after(grammarAccess.getCustomRule()); } 
	 EOF 
;

// Rule Custom
ruleCustom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCustomAccess().getGroup()); }
		(rule__Custom__Group__0)
		{ after(grammarAccess.getCustomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLayerAccess().getHiddenParserRuleCall_0()); }
		ruleHidden
		{ after(grammarAccess.getLayerAccess().getHiddenParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getLayerAccess().getInputParserRuleCall_1()); }
		ruleInput
		{ after(grammarAccess.getLayerAccess().getInputParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getLayerAccess().getOutputParserRuleCall_2()); }
		ruleOutput
		{ after(grammarAccess.getLayerAccess().getOutputParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LearningRule__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLearningRuleAccess().getSigmoidParserRuleCall_0()); }
		ruleSigmoid
		{ after(grammarAccess.getLearningRuleAccess().getSigmoidParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getLearningRuleAccess().getThresholdParserRuleCall_1()); }
		ruleThreshold
		{ after(grammarAccess.getLearningRuleAccess().getThresholdParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getLearningRuleAccess().getCustomParserRuleCall_2()); }
		ruleCustom
		{ after(grammarAccess.getLearningRuleAccess().getCustomParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ANNModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ANNModel__Group__0__Impl
	rule__ANNModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ANNModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getANNModelAccess().getNameAssignment_0()); }
	(rule__ANNModel__NameAssignment_0)
	{ after(grammarAccess.getANNModelAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ANNModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ANNModel__Group__1__Impl
	rule__ANNModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ANNModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getANNModelAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getANNModelAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ANNModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ANNModel__Group__2__Impl
	rule__ANNModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ANNModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getANNModelAccess().getAlphaKeyword_2()); }
	'alpha'
	{ after(grammarAccess.getANNModelAccess().getAlphaKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ANNModel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ANNModel__Group__3__Impl
	rule__ANNModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ANNModel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getANNModelAccess().getAlphaAssignment_3()); }
	(rule__ANNModel__AlphaAssignment_3)
	{ after(grammarAccess.getANNModelAccess().getAlphaAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ANNModel__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ANNModel__Group__4__Impl
	rule__ANNModel__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ANNModel__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getANNModelAccess().getEpochsKeyword_4()); }
	'epochs'
	{ after(grammarAccess.getANNModelAccess().getEpochsKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ANNModel__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ANNModel__Group__5__Impl
	rule__ANNModel__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ANNModel__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getANNModelAccess().getEpochsAssignment_5()); }
	(rule__ANNModel__EpochsAssignment_5)
	{ after(grammarAccess.getANNModelAccess().getEpochsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ANNModel__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ANNModel__Group__6__Impl
	rule__ANNModel__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ANNModel__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getANNModelAccess().getLayerAssignment_6()); }
		(rule__ANNModel__LayerAssignment_6)
		{ after(grammarAccess.getANNModelAccess().getLayerAssignment_6()); }
	)
	(
		{ before(grammarAccess.getANNModelAccess().getLayerAssignment_6()); }
		(rule__ANNModel__LayerAssignment_6)*
		{ after(grammarAccess.getANNModelAccess().getLayerAssignment_6()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ANNModel__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ANNModel__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ANNModel__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getANNModelAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getANNModelAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DECIMAL__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DECIMAL__Group__0__Impl
	rule__DECIMAL__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DECIMAL__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); }
	RULE_INT
	{ after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DECIMAL__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DECIMAL__Group__1__Impl
	rule__DECIMAL__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DECIMAL__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); }
	'.'
	{ after(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DECIMAL__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DECIMAL__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DECIMAL__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2()); }
	RULE_INT
	{ after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Hidden__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Hidden__Group__0__Impl
	rule__Hidden__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Hidden__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHiddenAccess().getHiddenKeyword_0()); }
	'hidden'
	{ after(grammarAccess.getHiddenAccess().getHiddenKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Hidden__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Hidden__Group__1__Impl
	rule__Hidden__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Hidden__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHiddenAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getHiddenAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Hidden__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Hidden__Group__2__Impl
	rule__Hidden__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Hidden__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHiddenAccess().getSizeKeyword_2()); }
	'size'
	{ after(grammarAccess.getHiddenAccess().getSizeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Hidden__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Hidden__Group__3__Impl
	rule__Hidden__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Hidden__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHiddenAccess().getSizeAssignment_3()); }
	(rule__Hidden__SizeAssignment_3)
	{ after(grammarAccess.getHiddenAccess().getSizeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Hidden__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Hidden__Group__4__Impl
	rule__Hidden__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Hidden__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHiddenAccess().getLearningRuleKeyword_4()); }
	'learningRule'
	{ after(grammarAccess.getHiddenAccess().getLearningRuleKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Hidden__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Hidden__Group__5__Impl
	rule__Hidden__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Hidden__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHiddenAccess().getL_ruleAssignment_5()); }
	(rule__Hidden__L_ruleAssignment_5)
	{ after(grammarAccess.getHiddenAccess().getL_ruleAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Hidden__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Hidden__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Hidden__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHiddenAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getHiddenAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Input__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Input__Group__0__Impl
	rule__Input__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputAccess().getInKeyword_0()); }
	'in'
	{ after(grammarAccess.getInputAccess().getInKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Input__Group__1__Impl
	rule__Input__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Input__Group__2__Impl
	rule__Input__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputAccess().getSizeKeyword_2()); }
	'size'
	{ after(grammarAccess.getInputAccess().getSizeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Input__Group__3__Impl
	rule__Input__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputAccess().getSizeAssignment_3()); }
	(rule__Input__SizeAssignment_3)
	{ after(grammarAccess.getInputAccess().getSizeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Input__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getInputAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Output__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Output__Group__0__Impl
	rule__Output__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputAccess().getOutKeyword_0()); }
	'out'
	{ after(grammarAccess.getOutputAccess().getOutKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Output__Group__1__Impl
	rule__Output__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Output__Group__2__Impl
	rule__Output__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputAccess().getSizeKeyword_2()); }
	'size'
	{ after(grammarAccess.getOutputAccess().getSizeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Output__Group__3__Impl
	rule__Output__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputAccess().getSizeAssignment_3()); }
	(rule__Output__SizeAssignment_3)
	{ after(grammarAccess.getOutputAccess().getSizeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Output__Group__4__Impl
	rule__Output__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputAccess().getLearningRuleKeyword_4()); }
	'learningRule'
	{ after(grammarAccess.getOutputAccess().getLearningRuleKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Output__Group__5__Impl
	rule__Output__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputAccess().getL_ruleAssignment_5()); }
	(rule__Output__L_ruleAssignment_5)
	{ after(grammarAccess.getOutputAccess().getL_ruleAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Output__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Custom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Custom__Group__0__Impl
	rule__Custom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Custom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCustomAccess().getNameAssignment_0()); }
	(rule__Custom__NameAssignment_0)
	{ after(grammarAccess.getCustomAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Custom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Custom__Group__1__Impl
	rule__Custom__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Custom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Custom__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Custom__Group__2__Impl
	rule__Custom__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Custom__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCustomAccess().getFunctionAssignment_2()); }
	(rule__Custom__FunctionAssignment_2)
	{ after(grammarAccess.getCustomAccess().getFunctionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Custom__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Custom__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Custom__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCustomAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getCustomAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ANNModel__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getANNModelAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getANNModelAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ANNModel__AlphaAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getANNModelAccess().getAlphaDECIMALParserRuleCall_3_0()); }
		ruleDECIMAL
		{ after(grammarAccess.getANNModelAccess().getAlphaDECIMALParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ANNModel__EpochsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getANNModelAccess().getEpochsINTTerminalRuleCall_5_0()); }
		RULE_INT
		{ after(grammarAccess.getANNModelAccess().getEpochsINTTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ANNModel__LayerAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getANNModelAccess().getLayerLayerParserRuleCall_6_0()); }
		ruleLayer
		{ after(grammarAccess.getANNModelAccess().getLayerLayerParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Hidden__SizeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHiddenAccess().getSizeINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getHiddenAccess().getSizeINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Hidden__L_ruleAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHiddenAccess().getL_ruleLearningRuleParserRuleCall_5_0()); }
		ruleLearningRule
		{ after(grammarAccess.getHiddenAccess().getL_ruleLearningRuleParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__SizeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputAccess().getSizeINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getInputAccess().getSizeINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__SizeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOutputAccess().getSizeINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getOutputAccess().getSizeINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__L_ruleAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOutputAccess().getL_ruleLearningRuleParserRuleCall_5_0()); }
		ruleLearningRule
		{ after(grammarAccess.getOutputAccess().getL_ruleLearningRuleParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sigmoid__RuleAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSigmoidAccess().getRuleSigmoidKeyword_0()); }
		(
			{ before(grammarAccess.getSigmoidAccess().getRuleSigmoidKeyword_0()); }
			'sigmoid'
			{ after(grammarAccess.getSigmoidAccess().getRuleSigmoidKeyword_0()); }
		)
		{ after(grammarAccess.getSigmoidAccess().getRuleSigmoidKeyword_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Threshold__RuleAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getThresholdAccess().getRuleThresholdKeyword_0()); }
		(
			{ before(grammarAccess.getThresholdAccess().getRuleThresholdKeyword_0()); }
			'threshold'
			{ after(grammarAccess.getThresholdAccess().getRuleThresholdKeyword_0()); }
		)
		{ after(grammarAccess.getThresholdAccess().getRuleThresholdKeyword_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Custom__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCustomAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getCustomAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Custom__FunctionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCustomAccess().getFunctionIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getCustomAccess().getFunctionIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
