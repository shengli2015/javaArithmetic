package com.shengli.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shengli.abstracclass.Test;
//? ֻ�����������������β���
//����û�ж�̬������ 
//extends ���ޣ����������Ϣ
//super ���ޣ�������Ӹ���Ϣ
public class WideCard {

	public static void test(List<?> list) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<?> list = new ArrayList<Integer>();
		list = new ArrayList<String>();
		test(list);
		Map m  = new HashMap();
		
		String [] str = {"a", "b", "c"};
		str = Arrays.copyOf(str, 5);
		//System.arraycopy(str, 2, str, 1, 1);
		System.out.println(str[3]);
	}
	

}
