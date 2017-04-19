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

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AnnGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		resource.allContents.filter(typeof(ANNModel)).forEach[generateANNFile(fsa, resource)]
	}
	
	def generateANNFile(ANNModel m, IFileSystemAccess2 access2, Resource resource) {
		access2.generateFile(m.name+".java", m.generateNetwork)
	
	}
	
	def CharSequence generateNetwork(ANNModel model) '''
		public class �model.name� {
			private double alpha = �model.alpha�;
			private int epochs = �model.epochs�;
			
			public �model.name�() {
			
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
			
			�FOR l: model.layer�
			�l.generateLayer�
			�ENDFOR�
		}
	'''
	
	def dispatch generateLayer(Hidden layer) '''
	
	'''
	
	def dispatch generateLayer(Input layer) '''
	
	'''
		
	def dispatch generateLayer(Output layer) '''
	
	'''
}