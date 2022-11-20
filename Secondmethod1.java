package Codingexcercise;

public class Secondmethod1 {
	public static String timeCalculate(long minutes,long seconds){
		if(minutes<0||seconds<0||seconds>59)
		{
			return "invalid value";
		}
		long hours=minutes/60;
		long minuteRemainder=minutes%60;
		return hours+"H "+minuteRemainder+"M "+seconds+"S ";
		
	}
	public static String timeCalculate(long seconds)
	{
		if(seconds<0)
		{
			return "invalid value";
		}
		long minutes=seconds/60;
		long secondRemainder=seconds%60;
		return timeCalculate(minutes,secondRemainder);
	}
	public static void main(String[]args)
	{
		System.out.println(timeCalculate(66,59));
		System.out.println(timeCalculate(4555L));
	}

}
