package GameStates;

import java.awt.Graphics2D;

public class gameStateManager 
{
	private boolean paused;
	private pauseState pS;
	
	private gameStates[] gS;
	private int curState;
	private int prevState;
	private final int NUMSTATES = 4;
	private final int MENU =0;
	public final int PLAY =1;
	private final int WIN = 2;
	private final int GAMEOVER =3;
	
	public gameStateManager()
	{
		paused = false;
		pS = new pauseState(this);
		gS = new gameStates[NUMSTATES];
		
		setState(MENU);
	}
	
	public void setState(int i)
	{
		prevState = curState;
		unloadState(prevState);
		curState = i;
		if(i == MENU)
		{
			gS[i] = new mainMenuState(this);
			gS[i].init();
		}
		else if(i == PLAY)
		{
			gS[i] = new playState(this);
			gS[i].init();
		}
		else if(i == WIN)
		{
			gS[i] = new winState(this);
			gS[i].init();
		}
		else if(i == GAMEOVER) 
		{
			gS[i] = new gameOverState(this);
			gS[i].init();
		}
	}
	
	public void unloadState(int i)
	{
		gS[i] = null;
	}
	public void setPaused(boolean b)
	{
		paused = b;
	}
	public void update()
	{
		if(paused)
		{
			pS.update();
		}
		else if(gS[curState] != null)
		{
			gS[curState].update();
		}
	}
	
	public void draw(Graphics2D g)
	{
		if(paused)
		{
			pS.draw(g);
		}
		else if(gS[curState] != null)
		{
			gS[curState].draw(g);
		}
	}
}
