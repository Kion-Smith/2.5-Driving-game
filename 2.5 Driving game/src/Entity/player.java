package Entity;

public class player  
{	

	
	private int xPos;
	private int yPos;
	
	private  final int  IDLE =0;
	private final int TURN = 1;
	
	private  final int  actionAmount =2;
	
	private String fileName;
	
	//Some sort of private information for other turning animation
	private boolean[] carSprite ;
	
	public player()
	{
		carSprite = new boolean[actionAmount];
	}
	
	public void setCarState(int state)
	{
		for(int i =0;i<carSprite.length;i++)
		{
			if(i==state)
			{
				carSprite[i] = true;
			}
			else
			{
				carSprite[i] = false;
			}
		}
	}

	public void setImage()
	{
		for(int i =0;i<carSprite.length;i++)
		{
			if(carSprite[i] == true)
			{
				if(i == IDLE)
				{
					fileName = "/idle.png";
				}
				else
				{
					fileName = "/turing.png";
				}
			}
		}
	}

	public void setXPos(int x)
	{
		xPos = x;
		
	}
	public int getXPos()
	{
		return xPos;
	}
	
	public void setYPos(int y)
	{
		yPos = y;
		
	}
	public int getYPos()
	{
		return yPos;
	}
}
