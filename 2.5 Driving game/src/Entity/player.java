package Entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class player  
{	
	
	//might be temp
	public int xH = 5;
	public int xW = 5;
	
	public int angle;//angle currently at

	public int x;
	public int y;
	private int height;//aka z
	
	private int fov;
	
	private  final int  IDLE =0;
	private final int TURN = 1;
	
	private  final int  actionAmount =2;
	
	private String fileName;
	
	private BufferedImage playerImage;
	
	//Some sort of private information for other turning animation
	private boolean[] carSprite;
	
	public player()
	{
		playerImage = new BufferedImage(1024,768,BufferedImage.TYPE_INT_RGB);
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
				setImage();
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
			fileName = "/2.5 driving game ideas/Pictues/CarHud(WIPS).png";
		}
		else if(getCarState() == TURN)
		{
			fileName = "/picture(not pixilized and turning).png";
		}
		else
		{
			fileName = "";
		}
		
		return fileName;
	}
	public void draw(Graphics2D g)
	{
		try
		{
			playerImage = ImageIO.read(getClass().getResourceAsStream(fileName));
			g.drawImage(playerImage,0,0,1024,768,null);
		}
		catch(Exception e)
		{
			
		}
	}

}
