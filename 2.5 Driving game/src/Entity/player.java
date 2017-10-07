package Entity;

public class player  
{	
	
	//might be temp
	public int xH = 5;
	public int xW = 5;
	

	public int x;
	public int y;
	
	private int height;
	
	private int fov;
	
	private  final int  IDLE =0;
	private final int TURN = 1;
	
	private  final int  actionAmount =2;
	
	private String fileName;
	
	//Some sort of private information for other turning animation
	private boolean[] carSprite;
	
	public player()
	{
		carSprite = new boolean[actionAmount];
	}
	
	public void setLocation(int x,int y)
	{
		this.x = x;
		this.y = y;
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
	public int getCarState()
	{
		for(int i =0;i<carSprite.length;i++)
		{
			if(carSprite[i] == true)
			{
				return i;
			}
		}
		return -1;
	}
	public String setImage()
	{
		if(getCarState() == IDLE)
		{
			fileName = "/idle";
		}
		else if(getCarState() == TURN)
		{
			fileName = "/turn";
		}
		else
		{
			fileName = "";
		}
		
		return fileName;
	}

}
