package org.cidarlab.minieugene;

import java.io.File;
import java.io.IOException;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.cidarlab.minieugene.parser.MiniEugeneLexer;
import org.cidarlab.minieugene.parser.MiniEugeneParser;
import org.cidarlab.minieugene.util.FileUtil;

/**
 * 
 * @author Ernst Oberortner
 */
public class ParserTest {

	public static void main(String[] args) 
			throws IOException {
		ParserTest pt = new ParserTest();
		pt.parse(FileUtil.readFile(new File("./tests/basic.eug")));
		pt.parse(FileUtil.readFile(new File("./tests/contains.eug")));
		pt.parse(FileUtil.readFile(new File("./tests/drives.eug")));
		pt.parse(FileUtil.readFile(new File("./tests/interactions.eug")));
		pt.parse(FileUtil.readFile(new File("./tests/not-morethan.eug")));
		pt.parse(FileUtil.readFile(new File("./tests/not.eug")));
		pt.parse(FileUtil.readFile(new File("./tests/operand-naming.eug")));
		pt.parse(FileUtil.readFile(new File("./tests/bryan/ex1")));
		pt.parse(FileUtil.readFile(new File("./tests/bryan/ex2")));
		pt.parse(FileUtil.readFile(new File("./tests/bryan/ex3")));
		pt.parse(FileUtil.readFile(new File("./tests/bryan/ex4")));
		pt.parse(FileUtil.readFile(new File("./tests/swati/test01")));
		pt.parse(FileUtil.readFile(new File("./tests/then/then01")));
	}
	
	/**
	 * 
	 * @param script
	 */
	private void parse(String script) {
		MiniEugeneLexer lexer = new MiniEugeneLexer(
				new ANTLRStringStream(script));
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		MiniEugeneParser parser = new MiniEugeneParser(tokens);

		try {
			parser.miniEugene();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
