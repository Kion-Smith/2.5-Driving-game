package Main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class gamePanel extends JPanel implements Runnable,KeyListener
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
	public void addNotify()
	{
		super.addNotify();
		if(thread == null)
		{
			thread = new Thread(this);
			thread.start();
		}
	}
	public void init()
	{
		isRunning = true;
		image = new BufferedImage(WIDTH,HEIGHT,1);
		g = (Graphics2D) image.getGraphics();

	}
	public void run() 
	{
		long startTime;
		long elapsedTime;
		long waitTime;
		init();
		while(isRunning)
		{
			
				startTime = System.nanoTime();	
				
				update();
				draw();
				render();
				
				elapsedTime = System.nanoTime() - startTime ;
				waitTime = targetTime -elapsedTime /1000000;
				
				if(waitTime<0)
				{
					waitTime = targetTime;
				}
			try 
			{
				Thread.sleep(waitTime);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	public void render() 
	{
		BufferedImage test = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
		try
		{
			test = ImageIO.read(new File("C:\\Users\\NeonKion\\Desktop\\2.5 driving game ideas\\Pictues\\picture(not pixilized and defaault).png"));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		g.drawImage(test, 0, 0, WIDTH, HEIGHT, null);
		
	}
	public void draw()
	{
		
	}
	public void update() 
	{
		Graphics g2 = getGraphics();
		g2.drawImage(image,0,0,WIDTH,HEIGHT,null );
		g2.dispose();
	}

	public void keyPressed(KeyEvent e) 
	{
		
	}
	
	public void keyReleased(KeyEvent e) 
	{

	}

	public void keyTyped(KeyEvent e) 
	{
		
	}
	
}
