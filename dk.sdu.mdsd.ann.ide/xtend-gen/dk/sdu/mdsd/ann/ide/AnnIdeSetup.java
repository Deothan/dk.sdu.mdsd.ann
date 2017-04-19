/**
 * generated by Xtext 2.11.0
 */
package dk.sdu.mdsd.ann.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import dk.sdu.mdsd.ann.AnnRuntimeModule;
import dk.sdu.mdsd.ann.AnnStandaloneSetup;
import dk.sdu.mdsd.ann.ide.AnnIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class AnnIdeSetup extends AnnStandaloneSetup {
  @Override
  public Injector createInjector() {
    AnnRuntimeModule _annRuntimeModule = new AnnRuntimeModule();
    AnnIdeModule _annIdeModule = new AnnIdeModule();
    return Guice.createInjector(Modules2.mixin(_annRuntimeModule, _annIdeModule));
  }
}