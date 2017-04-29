/**
 * generated by Xtext 2.11.0
 */
package dk.sdu.mdsd.ann.generator;

import com.google.common.collect.Iterators;
import dk.sdu.mdsd.ann.ann.ANNModel;
import dk.sdu.mdsd.ann.ann.Add;
import dk.sdu.mdsd.ann.ann.Custom;
import dk.sdu.mdsd.ann.ann.Div;
import dk.sdu.mdsd.ann.ann.Expression;
import dk.sdu.mdsd.ann.ann.Hidden;
import dk.sdu.mdsd.ann.ann.Input;
import dk.sdu.mdsd.ann.ann.Layer;
import dk.sdu.mdsd.ann.ann.LearningRule;
import dk.sdu.mdsd.ann.ann.Letter;
import dk.sdu.mdsd.ann.ann.Multi;
import dk.sdu.mdsd.ann.ann.NumberLiteral;
import dk.sdu.mdsd.ann.ann.Output;
import dk.sdu.mdsd.ann.ann.Sigmoid;
import dk.sdu.mdsd.ann.ann.Stub;
import dk.sdu.mdsd.ann.ann.Sub;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class AnnGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Procedure1<ANNModel> _function = (ANNModel it) -> {
      this.generateANNFile(it, fsa, resource);
    };
    IteratorExtensions.<ANNModel>forEach(Iterators.<ANNModel>filter(resource.getAllContents(), ANNModel.class), _function);
    final Procedure1<Custom> _function_1 = (Custom it) -> {
      this.generateCustomFunctionFile(it, fsa, resource);
    };
    IteratorExtensions.<Custom>forEach(Iterators.<Custom>filter(resource.getAllContents(), Custom.class), _function_1);
  }
  
  public void generateANNFile(final ANNModel m, final IFileSystemAccess2 access2, final Resource resource) {
    String _name = m.getName();
    String _plus = (_name + ".java");
    access2.generateFile(_plus, this.generateNetwork(m));
    access2.generateFile("ITransfer.java", this.generateITransfer());
    access2.generateFile("Sigmoid.java", this.generateSigmoid());
    access2.generateFile("Helpers.java", this.generateHelpers());
    access2.generateFile("JavaANN.java", this.generateJavaANN());
  }
  
  public void generateCustomFunctionFile(final Custom c, final IFileSystemAccess2 access2, final Resource resource) {
    String _name = c.getName();
    String _plus = (_name + ".java");
    access2.generateFile(_plus, this.generateCustomFunction(c));
  }
  
  public CharSequence generateITransfer() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public interface ITransfer {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("double transfer(double x);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("double derivative(double x);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateSigmoid() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class Sigmoid implements ITransfer {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public double transfer(double x){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return (1 / (1 + Math.exp(x)));\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public double derivative(double x){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return x*(1-x);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateHelpers() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class Helpers {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static double dot(double[] a, double[] b) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("int n = a.length;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("double sum = 0;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (int i = 0; i < n; i++) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("sum += a[i] * b[i];");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return sum;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static double[][] transpose(double[][] array) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (array == null || array.length == 0)//empty or unset array, nothing do to here");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return array;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("int width = array.length - 1;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("int height = array[0].length;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("double[][] array_new = new double[height][width];");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (int x = 0; x < width; x++) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("for (int y = 0; y < height; y++) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("array_new[y][x] = array[x][y];");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return array_new;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateJavaANN() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import transfer.ITransfer;");
    _builder.newLine();
    _builder.append("import java.lang.reflect.Array;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.Arrays;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ANN {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("int[] l_size;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("double[][] layers;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ArrayList<double[][]> weights;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("double[][] errors;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("double[][] deltas;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ArrayList<ITransfer> transfers;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ArrayList<double[]> input;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("int[] y;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("double alpha;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("int epochs;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ANN(int[] sizes, ArrayList<ITransfer> transfers, double alpha, int epochs, ArrayList<double[]> input, int[] y) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.weights = new ArrayList<>();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.layers = new double[sizes.length - 1][];");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.deltas = new double[sizes.length][];");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.transfers = new ArrayList<>(transfers);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.errors = new double[sizes.length][];");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.l_size = sizes;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.y = y;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.input = input;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.alpha = alpha;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.epochs = epochs;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("//Random initialization of weights");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setupWeights() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (int i = 0; i < layers.length; i++) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("double[][] tmp = new double[l_size[i]][l_size[i + 1]];");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("for (int j = 0; j < tmp.length; j++) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("for (int k = 0; k < tmp[0].length; k++) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("tmp[j][k] = 2 * Math.random() - 1;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("weights.add(tmp);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("//taking the input through the layers");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void runThroughLayers(double[] in) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("double[] tmp = in;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("//Run through all layers, using weights");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (int i = 0; i < l_size.length - 1; i++) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("//Temporary array with layer results");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("double[] t = new double[l_size[i + 1]];");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("for (int k = 0; k < weights.get(i)[0].length; k++) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("double sum = 0;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("for (int j = 0; j < tmp.length - 1; j++) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("sum += weights.get(i)[j][k] * tmp[j];");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("t[k] = transfers.get(i).tranfer(sum);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("layers[i] = t;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("tmp = layers[i];");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void calcErrorAndDelta(int y) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("//This is for the output layer");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("double[] tmpError;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("double[] tmpDelta;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("tmpError = new double[]{layers[layers.length - 1][0] - y};");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("errors[errors.length - 1] = tmpError;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("tmpDelta = new double[]{errors[errors.length - 1][0] * transfers.get(transfers.size() - 1).derivative(layers[layers.length - 1][0])};");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("deltas[deltas.length - 1] = tmpDelta;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("//Now for the rest of the layers.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (int i = layers.length - 1; i >= 0; i--) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("tmpDelta = new double[layers[i].length];");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("tmpError = new double[layers[i].length];");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("double[][] tmpLayer = Helpers.transpose(weights.get(i));");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("int count = 0;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("for (double[] t : tmpLayer) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("double sum = 0;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("for (double d : t) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("for (double s : deltas[i + 1]) {");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("sum += d * s;");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("tmpError[count] = sum;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("count++;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("count = 0;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("for (double d : tmpError) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("double sum = 0;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("for (double s : layers[i]) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("sum += d * (transfers.get(i).derivative(s));");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("tmpDelta[count] = sum;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("count++;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("errors[i] = tmpError;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("deltas[i] = tmpDelta;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void updateWeights() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (int i = layers.length - 1; i >= 1; i--) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("double[][] full = new double[l_size[i]][];");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("double sum = 0;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("for (int l = 0; l < layers[i - 1].length; l++) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("double[] temp = new double[l_size[i + 1]];");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("for (int t = 0; t < deltas[i + 1].length; t++) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("sum = weights.get(i)[l][t] + (alpha * (layers[i - 1][l] * deltas[i + 1][t]));");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("temp[t] = sum;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("full[l] = temp;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("weights.set(i, full);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("double[][] full = new double[l_size[0]][];");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("double sum = 0;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (int l = 0; l < l_size[0] - 1; l++) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("double[] temp = new double[l_size[1]];");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("for (int t = 0; t < deltas[0].length; t++) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("sum = weights.get(0)[l][t] + (alpha * (layers[0][l] * deltas[0][t]));");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("temp[t] = sum;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("full[l] = temp;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("weights.set(0, full);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void run() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("setupWeights();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (int j = 0; j < epochs; j++) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("for (int i = 0; i < input.size(); i++) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("runThroughLayers(input.get(i));");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("calcErrorAndDelta(y[i]);");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("updateWeights();");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("System.out.println(\"Prediction = \" + Math.round(layers[layers.length - 1][0]) + \" Actual = \" + y[i]);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateNetwork(final ANNModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = model.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private double alpha = ");
    String _alpha = model.getAlpha();
    _builder.append(_alpha, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private int epochs = ");
    int _epochs = model.getEpochs();
    _builder.append(_epochs, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private List<Double> layers;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private List<String> transfers;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_1 = model.getName();
    _builder.append(_name_1, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("layers = new ArrayList<>();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("transfers = new ArrayList<>();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("init();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Double[] getLayers() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return (Double[])this.layers.toArray();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String[] getTransfers() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return (String[])this.transfers.toArray();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void addLayerWithTransfer(double size, ITransfer transfer) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.layers.add(size);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.transfers.add(transfer);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public double getAlpha() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.alpha;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void setAlpha(double alpha) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.alpha = alpha;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public int getEpochs() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.epochs;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void setEpochs(int epochs) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.epochs = epochs;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private void init() {");
    _builder.newLine();
    {
      EList<Layer> _layer = model.getLayer();
      for(final Layer l : _layer) {
        _builder.append("\t\t");
        CharSequence _generateLayer = this.generateLayer(l);
        _builder.append(_generateLayer, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateCustomFunction(final Custom customFunction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.append("import java.lang.Math.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = customFunction.getName();
    _builder.append(_name);
    _builder.append(" implements ITransfer {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public double transfer(double x) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return ");
    CharSequence _generateCustomExp = this.generateCustomExp(customFunction);
    _builder.append(_generateCustomExp, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public double derivative(double x) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return ");
    CharSequence _generateCustomDer = this.generateCustomDer(customFunction);
    _builder.append(_generateCustomDer, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateCustomExp(final Custom custom) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateExp = this.generateExp(custom.getExp());
    _builder.append(_generateExp);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateCustomDer(final Custom custom) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateExp = this.generateExp(custom.getDer());
    _builder.append(_generateExp);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateExp(final Add exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateExp = this.generateExp(exp.getLeft());
    _builder.append(_generateExp);
    _builder.append("+");
    CharSequence _generateExp_1 = this.generateExp(exp.getRight());
    _builder.append(_generateExp_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _generateExp(final Sub exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateExp = this.generateExp(exp.getLeft());
    _builder.append(_generateExp);
    _builder.append("-");
    CharSequence _generateExp_1 = this.generateExp(exp.getRight());
    _builder.append(_generateExp_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _generateExp(final Multi exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateExp = this.generateExp(exp.getLeft());
    _builder.append(_generateExp);
    _builder.append("*");
    CharSequence _generateExp_1 = this.generateExp(exp.getRight());
    _builder.append(_generateExp_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _generateExp(final Div exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateExp = this.generateExp(exp.getLeft());
    _builder.append(_generateExp);
    _builder.append("/");
    CharSequence _generateExp_1 = this.generateExp(exp.getRight());
    _builder.append(_generateExp_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _generateExp(final NumberLiteral exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = exp.getValue();
    _builder.append(_value);
    return _builder;
  }
  
  protected CharSequence _generateExp(final Letter exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = exp.getValue();
    _builder.append(_value);
    return _builder;
  }
  
  protected CharSequence _generateLayer(final Hidden layer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("addLayerWithTransfer(");
    int _size = layer.getSize();
    _builder.append(_size);
    _builder.append(", ");
    CharSequence _generateRule = this.generateRule(layer.getL_rule());
    _builder.append(_generateRule);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateLayer(final Input layer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("addLayerWithTransfer(");
    int _size = layer.getSize();
    _builder.append(_size);
    _builder.append(", \"\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateLayer(final Output layer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("addLayerWithTransfer(");
    int _size = layer.getSize();
    _builder.append(_size);
    _builder.append(", ");
    CharSequence _generateRule = this.generateRule(layer.getL_rule());
    _builder.append(_generateRule);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateRule(final Sigmoid rule) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new Sigmoid()");
    return _builder;
  }
  
  protected CharSequence _generateRule(final Stub rule) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new ");
    String _name = rule.getName();
    _builder.append(_name);
    _builder.append("()");
    return _builder;
  }
  
  protected CharSequence _generateRule(final Custom rule) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new ");
    String _name = rule.getName();
    _builder.append(_name);
    _builder.append("()");
    return _builder;
  }
  
  public CharSequence generateExp(final Expression exp) {
    if (exp instanceof Add) {
      return _generateExp((Add)exp);
    } else if (exp instanceof Div) {
      return _generateExp((Div)exp);
    } else if (exp instanceof Letter) {
      return _generateExp((Letter)exp);
    } else if (exp instanceof Multi) {
      return _generateExp((Multi)exp);
    } else if (exp instanceof NumberLiteral) {
      return _generateExp((NumberLiteral)exp);
    } else if (exp instanceof Sub) {
      return _generateExp((Sub)exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
  
  public CharSequence generateLayer(final Layer layer) {
    if (layer instanceof Hidden) {
      return _generateLayer((Hidden)layer);
    } else if (layer instanceof Input) {
      return _generateLayer((Input)layer);
    } else if (layer instanceof Output) {
      return _generateLayer((Output)layer);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(layer).toString());
    }
  }
  
  public CharSequence generateRule(final LearningRule rule) {
    if (rule instanceof Custom) {
      return _generateRule((Custom)rule);
    } else if (rule instanceof Sigmoid) {
      return _generateRule((Sigmoid)rule);
    } else if (rule instanceof Stub) {
      return _generateRule((Stub)rule);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(rule).toString());
    }
  }
}
