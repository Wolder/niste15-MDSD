/*
 * generated by Xtext 2.22.0
 */
package org.xtext.niste15.mdsd.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AndroidAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/niste15/mdsd/parser/antlr/internal/InternalAndroid.tokens");
	}
}
