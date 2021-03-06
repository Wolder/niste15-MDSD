/*
 * generated by Xtext 2.22.0
 */
package org.xtext.niste15.mdsd.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.niste15.mdsd.android.ui.internal.AndroidActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AndroidExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(AndroidActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		AndroidActivator activator = AndroidActivator.getInstance();
		return activator != null ? activator.getInjector(AndroidActivator.ORG_XTEXT_NISTE15_MDSD_ANDROID) : null;
	}

}
