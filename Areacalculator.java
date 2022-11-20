package Codingexcercise;

public class Areacalculator {
	public static double FindArea(double radius)
	{
		if(radius<=0)
		{
			return 0;
			
		}
		return radius*radius*Math.PI;
		  
	}
	public static double FindArea(double x,double y)
	{
		if(x<=0||y<=0)
		{
			return 0;
		}
		double rect=x*y;
		return FindArea(rect);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FindArea(5.0));
		System.out.println(FindArea(5.0,4.0));

	}

}
