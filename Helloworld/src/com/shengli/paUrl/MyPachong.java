package com.shengli.paUrl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyPachong {
	
	public static String getUrl(String webUrl, String charset) {
		StringBuilder sb = new StringBuilder();
		try {
			URL url = new URL(webUrl);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), Charset.forName(charset)));
			String str = null;
			while((str = br.readLine()) != null) {
				sb.append(str);
			}
			return sb.toString();
		} catch (MalformedURLException e) {
			return null;
		} catch (IOException e) {
			return null;
		}
	}
	
	public static List<String> getMatcher(String orgStr, String regx) {
		//Pattern p = Pattern.compile("<a[\\s\\S]+?</a>");
		Pattern p = Pattern.compile(regx);      //"href=\"(.+?)\""
		Matcher m = p.matcher(orgStr);
		List<String> list = new ArrayList<String>();
		while(m.find()) {
			list.add(m.group(1));
		}
		return list;	
	}
	
	public static void main(String[] args) {
		String str = getUrl("http://www.163.com", "gbk");
		List<String> myList = getMatcher(str, "href=\"(.+?)\"");
		for(String temp : myList) {
			System.out.println(temp);
		}
	}
}
