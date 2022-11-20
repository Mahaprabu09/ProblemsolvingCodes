package Codingexcercise;

/*isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45
 isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35 (summer parameter is false)
 isCatPlaying(false, 35); should return true since temperature is in range 25 - 35
 */
public class PlayingCat {
	public static boolean isCatPlaying(boolean b,int t)
	{
	   if(b=true)
	   {
		   if(t>=25&&t<=45)
		   {
			   return true;
		   }
		   else
			   return false;
	   }
	   
	   else
		   if(b=false)
		   {
			   if(t>=25&&t<=35)
			   {
				   return true;
			   }
			   else
				   return false;
		   }
		   else
			   return false;
	}
	  
	 public static void main(String[]args)
	 {
		System.out.println(isCatPlaying(true,10));
		System.out.println(isCatPlaying(false,36));
	    System.out.println(isCatPlaying(false,35));
	 }
	   
	   }
	   
	
	


