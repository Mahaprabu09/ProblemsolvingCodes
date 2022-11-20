package Codingexcercise;

/*Write a method printEqual with 3 parameters of type int. The method should not return anything (void).

If one of the parameters is less than 0, print text "Invalid Value".  

If all numbers are equal print text "All numbers are equal"  

If all numbers are different print text "All numbers are different".   Otherwise, print "Neither all are equal or different". 
*/
public class Equalprint {
	public static void FinsEqual(int one,int two,int three)
	{
		if(one<0||two<0||three<0)
		{
			System.out.println("Invalid value");
		}
		else if(one==two&&two==three&&three==one)
		{
			System.out.println("All numbers are equal");
		}
		else if(one!=two&&two!=three&&three!=one)
		{
			System.out.println("All numbers are different");
		}
		else
		{
			System.out.println("All the numbers are neither or equal to eachother");
		}
	}
	public static void main(String[]args)
	{
		FinsEqual(2,2,3);
		FinsEqual(3,3,3);
	}

}
