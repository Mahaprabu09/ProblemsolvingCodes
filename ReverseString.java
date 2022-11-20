package Codingexcercise;


import java.util.Scanner;
public class ReverseString {
	public static void main(String[]args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a String");
	String str=scan.nextLine();
	String reverse="";
	
	for(int i=str.length()-1;i>=0;i--)
	{
		reverse=reverse+str.charAt(i);	
	}
	System.out.println("Given reverse string is :"+reverse);
	

}}