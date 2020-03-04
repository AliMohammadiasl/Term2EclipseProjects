import java.awt.Color;

public class Point {
	
	int x, y;
	Color c;
	
	public Point(int param_x, int param_y){
		
		//assign the instance vars
		x = param_x;
		y = param_y;
		
		int red = (int)(Math.random()*(255+1)+0); //[0 255]
		int green = (int)(Math.random()*(255+1)+0);
		int blue = (int)(Math.random()*(255+1)+0);
		
		//set c to color created by the random vals
		c = new Color(red, green, blue);
	
		
		
	}

}