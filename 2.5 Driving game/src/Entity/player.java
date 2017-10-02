package Entity;

public class player  
{	
	private boolean RturningState;
	private boolean standarState;
	private boolean LturnState;
	
	private int xPos;
	private int yPos;
	
	private  final int  IDLE =0;
	private final int TURN = 1;
	
	private  final int  actionAmount =2;;
	
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
		
	}

}
