package GameStates;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import Entity.player;
import Input.keyHandler;

public class playState extends gameStates
{
	
	BufferedImage test;
	player p;

	public playState(gameStateManager gsm) 
	{
		super(gsm);
		
	}

	public void init() 
	{
		test = new BufferedImage(1024,768,BufferedImage.TYPE_INT_RGB);
		p = new player();
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
			
			
			if(keyHandler.isPressed(keyHandler.LEFT)) 
			{
				p.setCarState(1);
				p.draw(g);
				test = ImageIO.read(getClass().getResourceAsStream("/picture(not pixilized and turning).png"));
			//	g.drawImage(test, 0, 0, 1024, 768, null);
			}
			else if(keyHandler.isPressed(keyHandler.RIGHT))
			{
				p.setCarState(1);
				p.draw(g);
				test = ImageIO.read(getClass().getResourceAsStream("/picture(not pixilized and turning).png"));
			//	g.drawImage(test, 0+1024, 0, -1024, 768, null);
			}
			else
			{
				p.setCarState(0);
				p.draw(g);
				test = ImageIO.read(getClass().getResourceAsStream("/2.5 driving game ideas/Pictues/CarHud(WIPS).png"));
			//	g.drawImage(test, 0, 0, 1024, 768, null);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		////PLAYER RAYCAST///////////////////
		
	
		/*
		if(keyHandler.isPressed(keyHandler.LEFT))
		{
			
		}
		else if(keyHandler.isPressed(keyHandler.RIGHT))
		{
			//g.rotate(-30,p.x, p.y);
		}
		*/
		
	}
	

	public void handleInput() 
	{
		
	}

}
