/*
 * generated by Xtext 2.22.0
 */
package org.xtext.niste15.mdsd.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.niste15.mdsd.AndroidRuntimeModule;
import org.xtext.niste15.mdsd.AndroidStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class AndroidIdeSetup extends AndroidStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new AndroidRuntimeModule(), new AndroidIdeModule()));
	}
	
}
