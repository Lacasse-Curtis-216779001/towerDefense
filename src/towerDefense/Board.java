package towerDefense;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;


public class Board extends JPanel implements KeyListener {
	public static final int TILE_SIZE = 50;
    public static final int ROWS = 12;
    public static final int COLUMNS = 18;
	
	
	public Board() {
		setPreferredSize(new Dimension(TILE_SIZE * COLUMNS, TILE_SIZE * ROWS));
		setBackground(new Color(112,232,220));
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
	}
}
