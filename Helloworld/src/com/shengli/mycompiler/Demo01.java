package com.shengli.mycompiler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class Demo01 {
	public static void main(String[] args) throws IOException {
		JavaCompiler jc = ToolProvider.getSystemJavaCompiler();
		int ret = jc.run(null, null, null, "/Users/shengli/tmp_shengli/java_test/HelloWorld.java");
		if(ret == 0) {
			System.out.print("success");
		}
		Runtime r = Runtime.getRuntime();
		Process pro = r.exec("java -cp /Users/shengli/tmp_shengli/java_test HelloWorld");
		InputStream in = pro.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String info = "";
		while((info=br.readLine())!= null) {
			System.out.println(info);
		}
	}
}
