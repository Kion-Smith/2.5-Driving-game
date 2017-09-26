package GameStates;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class mainMenuState extends gameStates 
{
	public mainMenuState(gameStateManager gsm) 
	{
		super(gsm);
	}

	
	public void init() 
	{
		
		
	}

	public void update() 
	{
	
		handleInput();
	}

	
	public void draw(Graphics2D g) 
	{
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 1024, 768);
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("Arial",Font.PLAIN,48));
		g.drawString("DRIVING GAME", (1024/2) - 150, (768/2) - 150);
		g.setFont(new Font("Arial",Font.PLAIN,32));
		g.drawString("Place holder until graphics are done", (1024/2) - 150, (768/2) - 50);
		
	}

	
	public void handleInput() 
	{
		
		
	}
}
