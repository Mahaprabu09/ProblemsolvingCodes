package Codingexcercise;

import java.util.Scanner;

public class Swithexample {
	/*public static void main(String args[])
	{
	*/
	
	/*	String num="5";
		
		switch(num)
		{
		
		case "1":
			System.out.println("value is 1");
			break;
		case "2":
			System.out.println("value is 2");
			break;
		case "3": case "4": case "5":
			System.out.println("values are 3,4 and 5");
			break;
		default:
			System.out.println("The default value is 123");
			break;
			}
			*/
		

/*	 char ch='H';
		
		switch(ch)
		{
		case 'A':
			System.out.println("The given character is A");
			break;
		case 'B':
			System.out.println("The given character is B");
			break;
		case 'C':
			System.out.println("The given character is C");
			break;
		case 'D':
			System.out.println("The given character is D");		
			break;
		default:
			System.out.println("The given character is not matching with following characters");
		}	
		
		*/
		
		
/*		String word="University";
		
		switch(word)
		{
		case "college":
			System.out.println("String is college");
			break;
		case "school":
			System.out.println("String is school");
			break;
		case "organization":
			System.out.println("String is organization");
		    break;
		case "University":
			System.out.println("String is University");
			break;
		default:
			System.out.println("Stirng is not matching with following strings ");
		}
		*/
		
//determine whether given character is vowel or not
	/*
		char char1='e';
		switch(Character.toUpperCase(char1))
		{
		case 'A':
			System.out.println("It is vowel");
			break;
		case 'E':
			System.out.println("It is vowel");
			break;
		case 'I':
			System.out.println("It is vowel");
			break;
		case 'O':
			System.out.println("It is vowel");
			break;
		case 'U':
			System.out.println("It is vowel");
			break;
		case 'h':
			System.out.println("It is not vowel");
			break;
		default:
			System.out.println("It is not vowel");
		}
/*
		
Write a method called printNumberInWord. The method has one parameter number which is the whole number.
The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" 
if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers.
You can use if-else statement or switch statement whatever is easier for you.
		*/
		/*		
		int num=10;
		printNumberInWord(num);
		
	}
		public static void printNumberInWord(int num)
		{
			switch(num)
			{
			case 0:
				System.out.println("ZERO");
			    break;
			case 1:
				System.out.println("ONE");
				break;
			case 2:
				System.out.println("TWO");
				break;
			case 3:
				System.out.println("THREE");
				break;
			case 4:
				System.out.println("FOUR");
				break;
			case 5:
				System.out.println("FIVE");
				break;
			case 6:
				System.out.println("SIX");
				break;
			case 7:
				System.out.println("SEVEN");
				break;
			case 8:
				System.out.println("EIGHT");
				break;
			case 9:
				System.out.println("NINE");
				break;
			default:
				System.out.println("OTHER");
				break;
			}
			
			*/
		
		
/*	(Find the number of days in a month) Write a program that prompts the user to
 *  enter the month and year and displays the number of days in the month.
 *   For example, if the user entered month 2 and year 2012, the program should display that February 2012 has 29 days.
 *    If the user entered month 3 and year 2015, the program should display that March 2015 has 31 days		
 */
	
		public static boolean isLeapYear (int year)
	    {
	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 != 0))
	            return true;
	        else
	            return false;
	    }
		
		public static void FindMonthYear(int month,int year)
		{
			switch(month)
			{
			case 1:
			System.out.println("Janawary"+year+"31 days");
			break;
			case 2:
			System.out.println("Febravary"+year+"29 days");
			break;
			case 3:
			System.out.println("March"+year+"31 days");
			break;
			case 4:
			System.out.println("April"+year+"30 days");
			break;
			case 5:
			System.out.println("May"+year+"31 days");
			break;
			case 6:
			System.out.println("June"+year+"30 days");
			break;
			case 7:
			System.out.println("july"+year+"31 days");
			break;
			case 8:
			System.out.println("augest"+year+"31 days");
			break;
			case 9:
		    System.out.println("September"+year+"30 days");
			break;
			case 10:
			System.out.println("October"+year+"31 days");
			break;
			case 11:
			System.out.println("November"+year+"30 days");
			break;
			case 12:
			System.out.println("December"+year+"31 days");
			break;
			}
		
		}	
		
		public static void main(String[]args)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the month");
			int month=scan.nextInt();
			System.out.println("Enter the year");
			int year=scan.nextInt();
			FindMonthYear(month,year);
			
			
		}
		}
	