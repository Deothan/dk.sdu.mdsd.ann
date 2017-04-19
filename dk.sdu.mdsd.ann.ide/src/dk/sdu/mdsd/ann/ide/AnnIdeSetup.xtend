/*
 * generated by Xtext 2.11.0
 */
package dk.sdu.mdsd.ann.ide

import com.google.inject.Guice
import dk.sdu.mdsd.ann.AnnRuntimeModule
import dk.sdu.mdsd.ann.AnnStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class AnnIdeSetup extends AnnStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new AnnRuntimeModule, new AnnIdeModule))
	}
	
}
