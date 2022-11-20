package Codingexcercise;

public class Methodoverload {
	public static void main(String[]args)
	{
		int length=3;
		int  breadth=2;
		double height=3.33;
		
		Methodoverload sq=new Methodoverload();
		sq.area(length);
		area(length,breadth);
		area(breadth,height);
		
	}
	  public void area(int length1)
	  {
		  double sq_area=length1*length1;
		  System.out.println("area of square length is :"+sq_area);
	  }
	  public static void area(int length2,int breadth2)
	  {
		  double rect_area=length2*breadth2;
		  System.out.println("area of rectangle is :"+rect_area);
	  }
	  public static void area(int breadth3,double height3)
	  {
		  double tri_area=breadth3*height3;
		  System.out.println("area of triangle is :"+tri_area);
	  }
}
