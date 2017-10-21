package World;

import java.io.File;
import java.util.Scanner;

public class projectionPlane 
{
	public int[][] level;
	
	
	
	public projectionPlane(String map)
	{
		//create level array
	
		
		try
		{
			File file = new File("Map1.txt");
			Scanner sc = new Scanner(file);
			
			int row=0;
			int col =0;
			while(sc.hasNextLine())
			{
				row++;
				int i = sc.nextInt();
				level[row][col] = i;
			}
		}
		catch(Exception e)
		{
			
		}
	}
	
	//add calculations
}
