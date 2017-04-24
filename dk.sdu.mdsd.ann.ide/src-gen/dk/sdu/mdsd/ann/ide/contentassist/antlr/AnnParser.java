/*
 * generated by Xtext 2.11.0
 */
package dk.sdu.mdsd.ann.ide.contentassist.antlr;

import com.google.inject.Inject;
import dk.sdu.mdsd.ann.ide.contentassist.antlr.internal.InternalAnnParser;
import dk.sdu.mdsd.ann.services.AnnGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class AnnParser extends AbstractContentAssistParser {

	@Inject
	private AnnGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalAnnParser createParser() {
		InternalAnnParser result = new InternalAnnParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getLayerAccess().getAlternatives(), "rule__Layer__Alternatives");
					put(grammarAccess.getLearningRuleAccess().getAlternatives(), "rule__LearningRule__Alternatives");
					put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
					put(grammarAccess.getANNModelAccess().getGroup(), "rule__ANNModel__Group__0");
					put(grammarAccess.getDECIMALAccess().getGroup(), "rule__DECIMAL__Group__0");
					put(grammarAccess.getHiddenAccess().getGroup(), "rule__Hidden__Group__0");
					put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
					put(grammarAccess.getOutputAccess().getGroup(), "rule__Output__Group__0");
					put(grammarAccess.getStubAccess().getGroup(), "rule__Stub__Group__0");
					put(grammarAccess.getCustomAccess().getGroup(), "rule__Custom__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getSubstractionAccess().getGroup(), "rule__Substraction__Group__0");
					put(grammarAccess.getSubstractionAccess().getGroup_1(), "rule__Substraction__Group_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
					put(grammarAccess.getDivisionAccess().getGroup(), "rule__Division__Group__0");
					put(grammarAccess.getDivisionAccess().getGroup_1(), "rule__Division__Group_1__0");
					put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
					put(grammarAccess.getANNModelAccess().getNameAssignment_0(), "rule__ANNModel__NameAssignment_0");
					put(grammarAccess.getANNModelAccess().getAlphaAssignment_3(), "rule__ANNModel__AlphaAssignment_3");
					put(grammarAccess.getANNModelAccess().getEpochsAssignment_5(), "rule__ANNModel__EpochsAssignment_5");
					put(grammarAccess.getANNModelAccess().getLayerAssignment_6(), "rule__ANNModel__LayerAssignment_6");
					put(grammarAccess.getHiddenAccess().getSizeAssignment_3(), "rule__Hidden__SizeAssignment_3");
					put(grammarAccess.getHiddenAccess().getL_ruleAssignment_5(), "rule__Hidden__L_ruleAssignment_5");
					put(grammarAccess.getInputAccess().getSizeAssignment_3(), "rule__Input__SizeAssignment_3");
					put(grammarAccess.getOutputAccess().getSizeAssignment_3(), "rule__Output__SizeAssignment_3");
					put(grammarAccess.getOutputAccess().getL_ruleAssignment_5(), "rule__Output__L_ruleAssignment_5");
					put(grammarAccess.getSigmoidAccess().getRuleAssignment(), "rule__Sigmoid__RuleAssignment");
					put(grammarAccess.getStubAccess().getRuleAssignment_0(), "rule__Stub__RuleAssignment_0");
					put(grammarAccess.getStubAccess().getNameAssignment_1(), "rule__Stub__NameAssignment_1");
					put(grammarAccess.getCustomAccess().getNameAssignment_0(), "rule__Custom__NameAssignment_0");
					put(grammarAccess.getCustomAccess().getExpAssignment_4(), "rule__Custom__ExpAssignment_4");
					put(grammarAccess.getExpressionAccess().getRightAssignment_1_2(), "rule__Expression__RightAssignment_1_2");
					put(grammarAccess.getSubstractionAccess().getRightAssignment_1_2(), "rule__Substraction__RightAssignment_1_2");
					put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2(), "rule__Multiplication__RightAssignment_1_2");
					put(grammarAccess.getDivisionAccess().getRightAssignment_1_2(), "rule__Division__RightAssignment_1_2");
					put(grammarAccess.getNumberLiteralAccess().getValueAssignment(), "rule__NumberLiteral__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AnnGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AnnGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
