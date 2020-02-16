package com.almondtools.antlr4multichannel;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.junit.Test;


public class XQueryTest {

	@Test
	public void testEnable() throws Exception {
		XQueryParser parser = new XQueryParser(new MultiChannelTokenStream(new XQueryLexer(new ANTLRInputStream(
			"let $x := ' h           jjjjjjjjjj  kkll ll  jhgg h '\nlet $y := \" jj kk ll kk \""
			))));
		XQueryParser.MainModuleContext context = parser.mainModule();
		String text = context.getText();
		System.out.println(text);
	}

}
