package Main;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class gamePanel extends JPanel 
{
	// Dimensions
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	//time keeping
	private final int FPS = 60;
	private final int targetTime = 1000/FPS;
	//if the game is running
	private boolean isRunning;
	// objects
	private Thread thread;// threads
	private BufferedImage image;// for render
	private Graphics2D g;// for drawing
	
	
	public gamePanel()
	{
		setPreferredSize(new Dimension(WIDTH,HEIGHT));//set size
		setFocusable(true);
		requestFocus();
	}
}
