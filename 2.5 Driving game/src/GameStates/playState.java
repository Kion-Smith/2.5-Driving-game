package GameStates;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import Input.keyHandler;

public class playState extends gameStates
{
	BufferedImage test;

	public playState(gameStateManager gsm) 
	{
		super(gsm);
		
	}

	public void init() 
	{
		test = new BufferedImage(1024,768,BufferedImage.TYPE_INT_RGB);
	}

	public void update() 
	{
		init();
		handleInput();
	}

	public void draw(Graphics2D g) 
	{
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, 1024, 768);
		
		
		try
		{
			
			//Isolate the background to be the car
			//		- Change turning to be an object
			// 		-create road
			if(keyHandler.isPressed(keyHandler.RIGHT)) 
			{
				test = ImageIO.read(getClass().getResourceAsStream("/picture(not pixilized and turning).png"));
				g.drawImage(test, 0, 0, 1024, 768, null);
			}
			else if(keyHandler.isPressed(keyHandler.LEFT))
			{
				
				test = ImageIO.read(getClass().getResourceAsStream("/picture(not pixilized and turning).png"));
				g.drawImage(test, 0+1024, 0, -1024, 768, null);
			}
			else
			{
				test = ImageIO.read(getClass().getResourceAsStream("/picture(not pixilized and defaault).png"));
				g.drawImage(test, 0, 0, 1024, 768, null);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

	public void handleInput() 
	{
		
	}

}
