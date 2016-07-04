package com.shengli.hivepro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.hadoop.hive.ql.exec.UDF;
//String url = "http://cms.yhd.com/sale/IhSwTYNxnzS?tc=
//ad.0.0.15116-32638141.1&tp=1.1.708.0.3.LEHaQW1-10-35dOM&ti=4FAK" ;
public class GetSaleName extends UDF {
	public String evaluate(String url) {
		String str = null;
		Pattern pattern = Pattern.compile("sale/[a-zA-Z0-9]+");
		Matcher m = pattern.matcher(url);
		if(m.find()) {
			str = m.group(0).toLowerCase().split("/")[1];
			System.out.print(str);
		}
		return null;
	}
	
	public static void main(String [] args) {
		GetSaleName gsn = new GetSaleName();
		String url = "http://cms.yhd.com/sale/IhSwTYNxnzS?tc=";
		gsn.evaluate(url);
	}
}
