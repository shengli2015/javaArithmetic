package com.shengli.hivepro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.hadoop.hive.ql.exec.UDF;
//String url = "http://cms.yhd.com/sale/IhSwTYNxnzS?tc=
//ad.0.0.15116-32638141.1&tp=1.1.708.0.3.LEHaQW1-10-35dOM&ti=4FAK" ;
public class GetCommonNameOrId extends UDF {
	public String evaluate(String url, String flag) {
		String str = null;
		Pattern p = Pattern.compile(flag+"/[a-zA-Z0-9]+");
		Matcher m = p.matcher(url);
		if (m.find()) {
			str = m.group(0).toLowerCase().split("/")[1];
        }
		
		return str;
	}
	
	public static void main(String [] args) {
		String url = "http://cms.yhd.com/sale/IhSwTYNxnzS?tc=ad.0.0.15116-32638141.1&tp=1.1.708.0.3.LEHaQW1-10-35dOM&ti=4FAK" ;
		GetCommonNameOrId gs = new GetCommonNameOrId();
		System.out.println(gs.evaluate(url,"sale")) ;
	}
}
