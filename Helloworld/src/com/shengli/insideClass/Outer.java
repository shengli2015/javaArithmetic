package com.shengli.insideClass;

public class Outer {
	public static 
	void main(String [] args) {
		Face f = new Face();
		Face.Nose n = f.new Nose();
		//n.breath();
		//Ear e = new Ear();
		Face.Ear e = new Face.Ear();
		e.listen();
	}
}

class Face {
	int type = 2;
	String shape = "shape";
	static String color = "color";
	class Nose {
		String type;
		void breath() {
			System.out.print("huxi"); 
			System.out.print(Face.this.type);
			System.out.print(color);
		}
	}
	static class Ear {
		public void listen() {
			System.out.print("listen");
			//System.out.print(shape);
			System.out.print(color);
		}
	}
	
}








