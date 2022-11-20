package Codingexcercise;
import java.util.Scanner;
public class Findradius {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num1=scan.nextInt();
		;
		double radius=num1*num1*Math.PI;
		System.out.println("Radius value of given number is :"+radius);
	}

}
