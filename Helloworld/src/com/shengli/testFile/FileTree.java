package com.shengli.testFile;

import java.io.File;

public class FileTree {
	
	public static void printFileTree(File f, int level) {
		for(int i=0;i<level;i++) {
			System.out.print("***");
		}
		System.out.println(f.getName());
		if(f.isDirectory()) {
			File [] fl = f.listFiles();
			for(File t:fl) {
				printFileTree(t, level+1);
			}
		}
	}

	public static void main(String[] args) {
		File file = new File("/Users/shengli/Desktop");
		FileTree.printFileTree(file, 0);
	}

}
