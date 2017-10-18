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
				test = ImageIO.read(getClass().getResourceAsStream("/picture(not pixilized and turning).png"));
				g.drawImage(test, 0, 0, 1024, 768, null);
			}
			else if(keyHandler.isPressed(keyHandler.RIGHT))
			{
				
				test = ImageIO.read(getClass().getResourceAsStream("/picture(not pixilized and turning).png"));
				g.drawImage(test, 0+1024, 0, -1024, 768, null);
			}
			else
			{
				test = ImageIO.read(getClass().getResourceAsStream("/2.5 driving game ideas/Pictues/CarHud(WIPS).png"));
				g.drawImage(test, 0, 0, 1024, 768, null);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		////PLAYER RAYCAST///////////////////
		
		g.setColor(Color.WHITE);
		g.fillRect(1024, 0, 1024, 768);
		
		p.x = 1024+300;
		p.y =768/2;
		
		g.setColor(Color.BLUE);
		g.fillRect(p.x, p.y, p.xW, p.xH);
		
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
