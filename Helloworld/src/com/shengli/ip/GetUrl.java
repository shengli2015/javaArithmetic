package com.shengli.ip;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class GetUrl {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.baidu.com");
		/*
		InputStream is = url.openStream();
		byte [] b = new byte[1024];
		int len = 0;
		while((len=is.read(b)) != -1) {
			System.out.println(new String(b, 0, len));
		}
		is.close();
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/Users/shengli/Desktop/ss.txt"), "utf-8"));
		String str = null;
		while((str=br.readLine()) != null) {
			//System.out.println(str);
			bw.append(str);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
