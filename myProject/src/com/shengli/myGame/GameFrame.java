package com.shengli.myGame;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame extends Frame {
	public void launchFrame() {
		setSize(500, 500);
		setLocation(100, 100);
		setVisible(true);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
	}



	public static void main(String[] args) {
		GameFrame gf = new GameFrame(); 
		gf.launchFrame();
	}
}
 