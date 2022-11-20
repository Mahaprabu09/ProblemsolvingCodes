package Codingexcercise;

public class Forloopcount {
		
		
		
	/*	for(int i=1;i<10;i++)
		{
			System.out.println("Count of the given number is til :"+i);
		}  */
		
/*		while(count<10)
		{
			count++;
			System.out.println("Count of the given number is til :"+count);
		}   */
		
/*		do
		{
			count++;
			System.out.println("Count of the given number is til :"+count);
		}while(count<8);
*/
		
	/*	do{
			System.out.println("Count of the given number is til :"+count);
			count+=2;
		}while(count!=20);
		
		*/
		
		
		
/*		while(true)
		{
			if(count==10)
			{
				break;
			}
			System.out.println("Count of the given number is til :"+count);
			count++;
		}
	*/	
	
	
/*	public static boolean Evenfind(int num)
	{
		if(num%2!=0)
		{
			return true;	
		}
		else
		{
			return false;		
		}
	}	
	public static void main(String[]args)
	{
		int start=5;
		int end=30;
		
		while(start<=end)
		{
			start++;
			if(!Evenfind(start))
			{
				continue;
			}
			System.out.println("Count of the odd number :"+start);
		}
	} */
		
/*	
	public static void main(String[]args)
	{
		int num=28;
		int temp=0;
		
		if(num%2==0)
		{
			System.out.println("EVEN");
			
		}
		else
		{
			System.out.println("ODD");
		}
	
	*/
	public static void main(String[] args) {
		int start=1;
		int end=10;
		
/*		while(start<=end)
		{
			System.out.println("Series of given numbers "+start);
			start+=2;
	}    */
	    
		
		do
		{
			System.out.println("Series of given number :"+start);
			start+=2;
		}
		while(start<=end);
		
	}

}
	
	
	
