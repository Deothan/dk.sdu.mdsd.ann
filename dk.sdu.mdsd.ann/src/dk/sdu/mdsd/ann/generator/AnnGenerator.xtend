/*
 * generated by Xtext 2.11.0
 */
package dk.sdu.mdsd.ann.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import dk.sdu.mdsd.ann.ann.ANNModel
import dk.sdu.mdsd.ann.ann.Hidden
import dk.sdu.mdsd.ann.ann.Input
import dk.sdu.mdsd.ann.ann.Output
import dk.sdu.mdsd.ann.ann.Sigmoid
import dk.sdu.mdsd.ann.ann.Custom
import dk.sdu.mdsd.ann.ann.Stub
import dk.sdu.mdsd.ann.ann.Multi
import dk.sdu.mdsd.ann.ann.Add
import dk.sdu.mdsd.ann.ann.NumberLiteral
import dk.sdu.mdsd.ann.ann.Sub
import dk.sdu.mdsd.ann.ann.Div
import dk.sdu.mdsd.ann.ann.Letter

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AnnGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		resource.allContents.filter(typeof(ANNModel)).forEach[generateANNFile(fsa, resource)]
		resource.allContents.filter(typeof(Custom)).forEach[generateCustomFunctionFile(fsa, resource)]
	}
	
	def generateANNFile(ANNModel m, IFileSystemAccess2 access2, Resource resource) {
		access2.generateFile(m.name+".java", m.generateNetwork)
		access2.generateFile("ITransfer.java", generateITransfer())
	}
	
	def generateCustomFunctionFile(Custom c, IFileSystemAccess2 access2, Resource resource) {
		access2.generateFile(c.name + ".java", c.generateCustomFunction)
	}
	
	def generateITransfer() '''
	public interface ITransfer {
		double transfer(double x);
		double derivative(double x);
	}
	'''
	
	def CharSequence generateNetwork(ANNModel model) '''
	import java.util.*;

	public class �model.name� {
		private double alpha = �model.alpha�;
		private int epochs = �model.epochs�;
		private List<Double> layers;
		private List<String> transfers;
		
		public �model.name�() {
			layers = new ArrayList<>();
			transfers = new ArrayList<>();
			init();
		}
		
		public Double[] getLayers() {
			return (Double[])this.layers.toArray();
		}
		
		public String[] getTransfers() {
			return (String[])this.transfers.toArray();
		}
		
		public void addLayerWithTransfer(double size, ITransfer transfer) {
			this.layers.add(size);
			this.transfers.add(transfer);
		}
		
		public double getAlpha() {
			return this.alpha;
		}
		
		public void setAlpha(double alpha) {
			this.alpha = alpha;
		}
		
		public int getEpochs() {
			return this.epochs;
		}
		
		public void setEpochs(int epochs) {
			this.epochs = epochs;
		}
		
		private void init() {
			�FOR l: model.layer�
			�l.generateLayer�
			�ENDFOR�
		}
	}
	'''
	
	def CharSequence generateCustomFunction(Custom customFunction) '''
	import java.util.*;
	import java.lang.Math.*;
	
	public class �customFunction.name� implements ITransfer {
		
		public double transfer(double x) {
			return �customFunction.generateCustomExp�
		}
		public double derivative(double x) {
			return �customFunction.generateCustomDer�
		}
	}
	'''
	
	def generateCustomExp(Custom custom) '''
		�custom.exp.generateExp�;
	'''
	
	def generateCustomDer(Custom custom) '''
		�custom.der.generateExp�;
	'''
		
	def dispatch CharSequence generateExp(Add exp) '''(�exp.left.generateExp�+�exp.right.generateExp�)'''
	
	def dispatch CharSequence generateExp(Sub exp) '''(�exp.left.generateExp�-�exp.right.generateExp�)'''
	
	def dispatch CharSequence generateExp(Multi exp) '''(�exp.left.generateExp�*�exp.right.generateExp�)'''
	
	def dispatch CharSequence generateExp(Div exp) '''(�exp.left.generateExp�/�exp.right.generateExp�)'''
	
	def dispatch CharSequence generateExp(NumberLiteral exp) '''�exp.value�'''
	
	def dispatch CharSequence generateExp(Letter exp) '''�exp.value�'''
	
	def dispatch generateLayer(Hidden layer) '''
		addLayerWithTransfer(�layer.size�, �layer.l_rule.generateRule�);
	'''
	
	def dispatch generateLayer(Input layer) '''
		addLayerWithTransfer(�layer.size�, "");
	'''
		
	def dispatch generateLayer(Output layer) '''
		addLayerWithTransfer(�layer.size�, �layer.l_rule.generateRule�);

	'''
	
	def dispatch generateRule(Sigmoid rule)'''new Sigmoid()'''
		
	
	def dispatch generateRule(Stub rule)'''new �rule.name�()'''
		
	
	def dispatch generateRule(Custom rule)'''new �rule.name�()'''
	
}