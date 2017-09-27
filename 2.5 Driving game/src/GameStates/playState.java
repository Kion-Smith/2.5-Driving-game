package GameStates;

import java.awt.Color;
import java.awt.Graphics2D;

public class playState extends gameStates
{

	public playState(gameStateManager gsm) 
	{
		super(gsm);
		
	}

	public void init() 
	{
		
	}

	public void update() 
	{
		
	}

	public void draw(Graphics2D g) 
	{
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, 1024, 768);
	}

	public void handleInput() 
	{
		
	}

}
