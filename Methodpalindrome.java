package Codingexcercise;

import java.util.Scanner;

//Create a function isPalindrome with one int parameter number and Check if the number is palindrome number or not.
//If it is palindrome return true, otherwise return false.
public class Methodpalindrome {
	
	public static boolean Ispalindrome(int number)
	{
    	
		int reverse=0;
		int temp=number;
		
		while(temp!=0)
		{
			reverse=reverse*10+temp%10;
			temp=temp/10;
		}
		if(number==reverse)
			return true;
		else
			return false;
		}
	public static void main(String[]args)
	{
		int num=347;
		if(Ispalindrome(num))
		{
			System.out.println("It is palindrome");
		}
		else
			System.out.println("It is not palindrome");
	}
	
	
	}
