package com.shengli.jvm;

public class FileSystemClassLoader extends ClassLoader{
	private String rootDir;
	public FileSystemClassLoader(String rootDir){
		this.rootDir = rootDir;
	}
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		Class<?> c = findLoadedClass(name);
		if(c != null) {
			return c;
		} else {
			return null;
		}
	}
	
}
