package towerDefense;

import javax.swing.*;
class tdMain {

	private static void initWindow() {
		JFrame window = new JFrame("Towel Towers");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Board board = new Board();
		window.add(board);
		window.addKeyListener(board);
	}
	
}

