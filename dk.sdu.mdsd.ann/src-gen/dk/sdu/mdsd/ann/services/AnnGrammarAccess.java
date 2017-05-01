/*
 * generated by Xtext 2.11.0
 */
package dk.sdu.mdsd.ann.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class AnnGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ANNModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mdsd.ann.Ann.ANNModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAlphaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAlphaAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAlphaDECIMALParserRuleCall_3_0 = (RuleCall)cAlphaAssignment_3.eContents().get(0);
		private final Keyword cEpochsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cEpochsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cEpochsINTTerminalRuleCall_5_0 = (RuleCall)cEpochsAssignment_5.eContents().get(0);
		private final Assignment cLayerAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cLayerLayerParserRuleCall_6_0 = (RuleCall)cLayerAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//ANNModel:
		//	name=ID '{'
		//	'alpha' alpha=DECIMAL
		//	'epochs' epochs=INT
		//	Layer+=Layer+ '}';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID '{' 'alpha' alpha=DECIMAL 'epochs' epochs=INT Layer+=Layer+ '}'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'alpha'
		public Keyword getAlphaKeyword_2() { return cAlphaKeyword_2; }
		
		//alpha=DECIMAL
		public Assignment getAlphaAssignment_3() { return cAlphaAssignment_3; }
		
		//DECIMAL
		public RuleCall getAlphaDECIMALParserRuleCall_3_0() { return cAlphaDECIMALParserRuleCall_3_0; }
		
		//'epochs'
		public Keyword getEpochsKeyword_4() { return cEpochsKeyword_4; }
		
		//epochs=INT
		public Assignment getEpochsAssignment_5() { return cEpochsAssignment_5; }
		
		//INT
		public RuleCall getEpochsINTTerminalRuleCall_5_0() { return cEpochsINTTerminalRuleCall_5_0; }
		
		//Layer+=Layer+
		public Assignment getLayerAssignment_6() { return cLayerAssignment_6; }
		
		//Layer
		public RuleCall getLayerLayerParserRuleCall_6_0() { return cLayerLayerParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class DECIMALElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mdsd.ann.Ann.DECIMAL");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//DECIMAL:
		//	INT '.' INT;
		@Override public ParserRule getRule() { return rule; }
		
		//INT '.' INT
		public Group getGroup() { return cGroup; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
	}
	public class LayerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mdsd.ann.Ann.Layer");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cHiddenParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cInputParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cOutputParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Layer:
		//	Hidden | Input | Output;
		@Override public ParserRule getRule() { return rule; }
		
		//Hidden | Input | Output
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Hidden
		public RuleCall getHiddenParserRuleCall_0() { return cHiddenParserRuleCall_0; }
		
		//Input
		public RuleCall getInputParserRuleCall_1() { return cInputParserRuleCall_1; }
		
		//Output
		public RuleCall getOutputParserRuleCall_2() { return cOutputParserRuleCall_2; }
	}
	public class HiddenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mdsd.ann.Ann.Hidden");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHiddenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSizeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSizeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSizeINTTerminalRuleCall_3_0 = (RuleCall)cSizeAssignment_3.eContents().get(0);
		private final Keyword cLearningRuleKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cL_ruleAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cL_ruleLearningRuleParserRuleCall_5_0 = (RuleCall)cL_ruleAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Hidden:
		//	'hidden' '{'
		//	'size' size=INT
		//	'learningRule' l_rule=LearningRule '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'hidden' '{' 'size' size=INT 'learningRule' l_rule=LearningRule '}'
		public Group getGroup() { return cGroup; }
		
		//'hidden'
		public Keyword getHiddenKeyword_0() { return cHiddenKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'size'
		public Keyword getSizeKeyword_2() { return cSizeKeyword_2; }
		
		//size=INT
		public Assignment getSizeAssignment_3() { return cSizeAssignment_3; }
		
		//INT
		public RuleCall getSizeINTTerminalRuleCall_3_0() { return cSizeINTTerminalRuleCall_3_0; }
		
		//'learningRule'
		public Keyword getLearningRuleKeyword_4() { return cLearningRuleKeyword_4; }
		
		//l_rule=LearningRule
		public Assignment getL_ruleAssignment_5() { return cL_ruleAssignment_5; }
		
		//LearningRule
		public RuleCall getL_ruleLearningRuleParserRuleCall_5_0() { return cL_ruleLearningRuleParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class InputElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mdsd.ann.Ann.Input");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSizeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSizeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSizeINTTerminalRuleCall_3_0 = (RuleCall)cSizeAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Input:
		//	'in' '{'
		//	'size' size=INT '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'in' '{' 'size' size=INT '}'
		public Group getGroup() { return cGroup; }
		
		//'in'
		public Keyword getInKeyword_0() { return cInKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'size'
		public Keyword getSizeKeyword_2() { return cSizeKeyword_2; }
		
		//size=INT
		public Assignment getSizeAssignment_3() { return cSizeAssignment_3; }
		
		//INT
		public RuleCall getSizeINTTerminalRuleCall_3_0() { return cSizeINTTerminalRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class OutputElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mdsd.ann.Ann.Output");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOutKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSizeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSizeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSizeINTTerminalRuleCall_3_0 = (RuleCall)cSizeAssignment_3.eContents().get(0);
		private final Keyword cLearningRuleKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cL_ruleAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cL_ruleLearningRuleParserRuleCall_5_0 = (RuleCall)cL_ruleAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Output:
		//	'out' '{'
		//	'size' size=INT
		//	'learningRule' l_rule=LearningRule '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'out' '{' 'size' size=INT 'learningRule' l_rule=LearningRule '}'
		public Group getGroup() { return cGroup; }
		
		//'out'
		public Keyword getOutKeyword_0() { return cOutKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'size'
		public Keyword getSizeKeyword_2() { return cSizeKeyword_2; }
		
		//size=INT
		public Assignment getSizeAssignment_3() { return cSizeAssignment_3; }
		
		//INT
		public RuleCall getSizeINTTerminalRuleCall_3_0() { return cSizeINTTerminalRuleCall_3_0; }
		
		//'learningRule'
		public Keyword getLearningRuleKeyword_4() { return cLearningRuleKeyword_4; }
		
		//l_rule=LearningRule
		public Assignment getL_ruleAssignment_5() { return cL_ruleAssignment_5; }
		
		//LearningRule
		public RuleCall getL_ruleLearningRuleParserRuleCall_5_0() { return cL_ruleLearningRuleParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class LearningRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mdsd.ann.Ann.LearningRule");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSigmoidParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cExternalParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cCustomParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//LearningRule:
		//	Sigmoid | External | Custom;
		@Override public ParserRule getRule() { return rule; }
		
		//Sigmoid | External | Custom
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Sigmoid
		public RuleCall getSigmoidParserRuleCall_0() { return cSigmoidParserRuleCall_0; }
		
		//External
		public RuleCall getExternalParserRuleCall_1() { return cExternalParserRuleCall_1; }
		
		//Custom
		public RuleCall getCustomParserRuleCall_2() { return cCustomParserRuleCall_2; }
	}
	public class SigmoidElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mdsd.ann.Ann.Sigmoid");
		private final Assignment cRuleAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cRuleSigmoidKeyword_0 = (Keyword)cRuleAssignment.eContents().get(0);
		
		//Sigmoid:
		//	rule='sigmoid';
		@Override public ParserRule getRule() { return rule; }
		
		//rule='sigmoid'
		public Assignment getRuleAssignment() { return cRuleAssignment; }
		
		//'sigmoid'
		public Keyword getRuleSigmoidKeyword_0() { return cRuleSigmoidKeyword_0; }
	}
	public class ExternalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mdsd.ann.Ann.External");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cExternalKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//External:
		//	name=ID 'external';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID 'external'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'external'
		public Keyword getExternalKeyword_1() { return cExternalKeyword_1; }
	}
	public class CustomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mdsd.ann.Ann.Custom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cXKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cFunctionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cEqualsSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cExpAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cExpExpressionParserRuleCall_5_0 = (RuleCall)cExpAssignment_5.eContents().get(0);
		private final Keyword cDerivativeKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cDerAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cDerExpressionParserRuleCall_8_0 = (RuleCall)cDerAssignment_8.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Custom:
		//	name=ID '(x)' '{'
		//	'function' '=' exp=Expression
		//	'derivative' '=' der=Expression '}';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID '(x)' '{' 'function' '=' exp=Expression 'derivative' '=' der=Expression '}'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'(x)'
		public Keyword getXKeyword_1() { return cXKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'function'
		public Keyword getFunctionKeyword_3() { return cFunctionKeyword_3; }
		
		//'='
		public Keyword getEqualsSignKeyword_4() { return cEqualsSignKeyword_4; }
		
		//exp=Expression
		public Assignment getExpAssignment_5() { return cExpAssignment_5; }
		
		//Expression
		public RuleCall getExpExpressionParserRuleCall_5_0() { return cExpExpressionParserRuleCall_5_0; }
		
		//'derivative'
		public Keyword getDerivativeKeyword_6() { return cDerivativeKeyword_6; }
		
		//'='
		public Keyword getEqualsSignKeyword_7() { return cEqualsSignKeyword_7; }
		
		//der=Expression
		public Assignment getDerAssignment_8() { return cDerAssignment_8; }
		
		//Expression
		public RuleCall getDerExpressionParserRuleCall_8_0() { return cDerExpressionParserRuleCall_8_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mdsd.ann.Ann.Expression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSubstractionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAddLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightSubstractionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Expression:
		//	Substraction ({Add.left=current} '+' right=Substraction)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Substraction ({Add.left=current} '+' right=Substraction)*
		public Group getGroup() { return cGroup; }
		
		//Substraction
		public RuleCall getSubstractionParserRuleCall_0() { return cSubstractionParserRuleCall_0; }
		
		//({Add.left=current} '+' right=Substraction)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Add.left=current}
		public Action getAddLeftAction_1_0() { return cAddLeftAction_1_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_1() { return cPlusSignKeyword_1_1; }
		
		//right=Substraction
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Substraction
		public RuleCall getRightSubstractionParserRuleCall_1_2_0() { return cRightSubstractionParserRuleCall_1_2_0; }
	}
	public class SubstractionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mdsd.ann.Ann.Substraction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMultiplicationParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cSubLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightMultiplicationParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Substraction Expression:
		//	Multiplication ({Sub.left=current} '-' right=Multiplication)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Multiplication ({Sub.left=current} '-' right=Multiplication)*
		public Group getGroup() { return cGroup; }
		
		//Multiplication
		public RuleCall getMultiplicationParserRuleCall_0() { return cMultiplicationParserRuleCall_0; }
		
		//({Sub.left=current} '-' right=Multiplication)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Sub.left=current}
		public Action getSubLeftAction_1_0() { return cSubLeftAction_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_1() { return cHyphenMinusKeyword_1_1; }
		
		//right=Multiplication
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Multiplication
		public RuleCall getRightMultiplicationParserRuleCall_1_2_0() { return cRightMultiplicationParserRuleCall_1_2_0; }
	}
	public class MultiplicationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mdsd.ann.Ann.Multiplication");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDivisionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cMultiLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightDivisionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Multiplication Expression:
		//	Division ({Multi.left=current} '*' right=Division)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Division ({Multi.left=current} '*' right=Division)*
		public Group getGroup() { return cGroup; }
		
		//Division
		public RuleCall getDivisionParserRuleCall_0() { return cDivisionParserRuleCall_0; }
		
		//({Multi.left=current} '*' right=Division)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Multi.left=current}
		public Action getMultiLeftAction_1_0() { return cMultiLeftAction_1_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1_1() { return cAsteriskKeyword_1_1; }
		
		//right=Division
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Division
		public RuleCall getRightDivisionParserRuleCall_1_2_0() { return cRightDivisionParserRuleCall_1_2_0; }
	}
	public class DivisionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mdsd.ann.Ann.Division");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cDivLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cSolidusKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightPrimaryParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Division Expression:
		//	Primary ({Div.left=current} '/' right=Primary)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Primary ({Div.left=current} '/' right=Primary)*
		public Group getGroup() { return cGroup; }
		
		//Primary
		public RuleCall getPrimaryParserRuleCall_0() { return cPrimaryParserRuleCall_0; }
		
		//({Div.left=current} '/' right=Primary)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Div.left=current}
		public Action getDivLeftAction_1_0() { return cDivLeftAction_1_0; }
		
		//'/'
		public Keyword getSolidusKeyword_1_1() { return cSolidusKeyword_1_1; }
		
		//right=Primary
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Primary
		public RuleCall getRightPrimaryParserRuleCall_1_2_0() { return cRightPrimaryParserRuleCall_1_2_0; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mdsd.ann.Ann.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNumberLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLetterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		
		//Primary Expression:
		//	NumberLiteral | Letter | '(' Expression ')';
		@Override public ParserRule getRule() { return rule; }
		
		//NumberLiteral | Letter | '(' Expression ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//NumberLiteral
		public RuleCall getNumberLiteralParserRuleCall_0() { return cNumberLiteralParserRuleCall_0; }
		
		//Letter
		public RuleCall getLetterParserRuleCall_1() { return cLetterParserRuleCall_1; }
		
		//'(' Expression ')'
		public Group getGroup_2() { return cGroup_2; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }
		
		//Expression
		public RuleCall getExpressionParserRuleCall_2_1() { return cExpressionParserRuleCall_2_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_2() { return cRightParenthesisKeyword_2_2; }
	}
	public class LetterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mdsd.ann.Ann.Letter");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cValueXKeyword_0 = (Keyword)cValueAssignment.eContents().get(0);
		
		//Letter:
		//	value="x";
		@Override public ParserRule getRule() { return rule; }
		
		//value="x"
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//"x"
		public Keyword getValueXKeyword_0() { return cValueXKeyword_0; }
	}
	public class NumberLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mdsd.ann.Ann.NumberLiteral");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueDECIMALParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//NumberLiteral:
		//	value=DECIMAL;
		@Override public ParserRule getRule() { return rule; }
		
		//value=DECIMAL
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//DECIMAL
		public RuleCall getValueDECIMALParserRuleCall_0() { return cValueDECIMALParserRuleCall_0; }
	}
	
	
	private final ANNModelElements pANNModel;
	private final DECIMALElements pDECIMAL;
	private final LayerElements pLayer;
	private final HiddenElements pHidden;
	private final InputElements pInput;
	private final OutputElements pOutput;
	private final LearningRuleElements pLearningRule;
	private final SigmoidElements pSigmoid;
	private final ExternalElements pExternal;
	private final CustomElements pCustom;
	private final ExpressionElements pExpression;
	private final SubstractionElements pSubstraction;
	private final MultiplicationElements pMultiplication;
	private final DivisionElements pDivision;
	private final PrimaryElements pPrimary;
	private final LetterElements pLetter;
	private final NumberLiteralElements pNumberLiteral;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public AnnGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pANNModel = new ANNModelElements();
		this.pDECIMAL = new DECIMALElements();
		this.pLayer = new LayerElements();
		this.pHidden = new HiddenElements();
		this.pInput = new InputElements();
		this.pOutput = new OutputElements();
		this.pLearningRule = new LearningRuleElements();
		this.pSigmoid = new SigmoidElements();
		this.pExternal = new ExternalElements();
		this.pCustom = new CustomElements();
		this.pExpression = new ExpressionElements();
		this.pSubstraction = new SubstractionElements();
		this.pMultiplication = new MultiplicationElements();
		this.pDivision = new DivisionElements();
		this.pPrimary = new PrimaryElements();
		this.pLetter = new LetterElements();
		this.pNumberLiteral = new NumberLiteralElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("dk.sdu.mdsd.ann.Ann".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ANNModel:
	//	name=ID '{'
	//	'alpha' alpha=DECIMAL
	//	'epochs' epochs=INT
	//	Layer+=Layer+ '}';
	public ANNModelElements getANNModelAccess() {
		return pANNModel;
	}
	
	public ParserRule getANNModelRule() {
		return getANNModelAccess().getRule();
	}
	
	//DECIMAL:
	//	INT '.' INT;
	public DECIMALElements getDECIMALAccess() {
		return pDECIMAL;
	}
	
	public ParserRule getDECIMALRule() {
		return getDECIMALAccess().getRule();
	}
	
	//Layer:
	//	Hidden | Input | Output;
	public LayerElements getLayerAccess() {
		return pLayer;
	}
	
	public ParserRule getLayerRule() {
		return getLayerAccess().getRule();
	}
	
	//Hidden:
	//	'hidden' '{'
	//	'size' size=INT
	//	'learningRule' l_rule=LearningRule '}';
	public HiddenElements getHiddenAccess() {
		return pHidden;
	}
	
	public ParserRule getHiddenRule() {
		return getHiddenAccess().getRule();
	}
	
	//Input:
	//	'in' '{'
	//	'size' size=INT '}';
	public InputElements getInputAccess() {
		return pInput;
	}
	
	public ParserRule getInputRule() {
		return getInputAccess().getRule();
	}
	
	//Output:
	//	'out' '{'
	//	'size' size=INT
	//	'learningRule' l_rule=LearningRule '}';
	public OutputElements getOutputAccess() {
		return pOutput;
	}
	
	public ParserRule getOutputRule() {
		return getOutputAccess().getRule();
	}
	
	//LearningRule:
	//	Sigmoid | External | Custom;
	public LearningRuleElements getLearningRuleAccess() {
		return pLearningRule;
	}
	
	public ParserRule getLearningRuleRule() {
		return getLearningRuleAccess().getRule();
	}
	
	//Sigmoid:
	//	rule='sigmoid';
	public SigmoidElements getSigmoidAccess() {
		return pSigmoid;
	}
	
	public ParserRule getSigmoidRule() {
		return getSigmoidAccess().getRule();
	}
	
	//External:
	//	name=ID 'external';
	public ExternalElements getExternalAccess() {
		return pExternal;
	}
	
	public ParserRule getExternalRule() {
		return getExternalAccess().getRule();
	}
	
	//Custom:
	//	name=ID '(x)' '{'
	//	'function' '=' exp=Expression
	//	'derivative' '=' der=Expression '}';
	public CustomElements getCustomAccess() {
		return pCustom;
	}
	
	public ParserRule getCustomRule() {
		return getCustomAccess().getRule();
	}
	
	//Expression:
	//	Substraction ({Add.left=current} '+' right=Substraction)*;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//Substraction Expression:
	//	Multiplication ({Sub.left=current} '-' right=Multiplication)*;
	public SubstractionElements getSubstractionAccess() {
		return pSubstraction;
	}
	
	public ParserRule getSubstractionRule() {
		return getSubstractionAccess().getRule();
	}
	
	//Multiplication Expression:
	//	Division ({Multi.left=current} '*' right=Division)*;
	public MultiplicationElements getMultiplicationAccess() {
		return pMultiplication;
	}
	
	public ParserRule getMultiplicationRule() {
		return getMultiplicationAccess().getRule();
	}
	
	//Division Expression:
	//	Primary ({Div.left=current} '/' right=Primary)*;
	public DivisionElements getDivisionAccess() {
		return pDivision;
	}
	
	public ParserRule getDivisionRule() {
		return getDivisionAccess().getRule();
	}
	
	//Primary Expression:
	//	NumberLiteral | Letter | '(' Expression ')';
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//Letter:
	//	value="x";
	public LetterElements getLetterAccess() {
		return pLetter;
	}
	
	public ParserRule getLetterRule() {
		return getLetterAccess().getRule();
	}
	
	//NumberLiteral:
	//	value=DECIMAL;
	public NumberLiteralElements getNumberLiteralAccess() {
		return pNumberLiteral;
	}
	
	public ParserRule getNumberLiteralRule() {
		return getNumberLiteralAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
