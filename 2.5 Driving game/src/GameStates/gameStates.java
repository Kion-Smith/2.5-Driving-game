package GameStates;

import java.awt.Graphics2D;


public abstract class gameStates 
{
protected gameStateManager gsm;
	
	public gameStates(gameStateManager gsm)
	{
		this.gsm =gsm;
	}
	
	public abstract void init();
	public abstract void update();
	public abstract void draw(Graphics2D g);
	public abstract void handleInput();
}
