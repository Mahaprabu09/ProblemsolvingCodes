package Codingexcercise;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();
		int reverse=0;
		
		while(number!=0)
		{
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number/=10;
		}
		System.out.println("Reverse of the given number is :"+reverse);

	}

}
