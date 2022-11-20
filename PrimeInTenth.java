package Codingexcercise;
import java.util.Scanner;
//A prime number is a number which is divisible by 1 and itself.
//Print Prime numbers from 1 to n.
public class PrimeInTenth {
    public static void main(String[]args)
    {
/*	int n=100;
	for(int i=1;i<n;i++)
	{
		Primecheck(i);
	}
}
  public static void Primecheck(int n)
  {
	  int count=0;
	  
	  for(int j=1;j<=n;j++)
	  {
		  if(n % j==0)
		  {
			  count +=1;
		  }}
		   if(count==2)
		  {
			  System.out.println(n+"is prime number");
		  }
		  */
    	
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the number :");
    	int num=scan.nextInt();
    	int count=0;
    	for(int i=2;i<num;i++)
    	{
    		if(num%i==0)
    		{
    			count+=1;
    	
    		}
    	}
    	if(count==1)
    		System.out.println(num+" It is not prime number");
    	else
    		System.out.println(num+" It is prime number");
    	
	  }
	  
}
	