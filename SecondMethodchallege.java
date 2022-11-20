package Codingexcercise;

public class SecondMethodchallege {

    public static String getTimes(long minutes,long seconds)
    {
    	if(minutes<0||seconds<0||seconds>59)
    	{
    		return "invalid value";
    	}
    	long hours=minutes/60;
    	long remainingminutes=minutes %60;
    	return hours+"H "+remainingminutes+"M "+seconds+"S ";
    }
      public static String getTimes(long seconds)
      {
    	  if(seconds<0)
    	  {
    		  return "invalid value";
    	  }
    	  long minutes=seconds/60;
    	  long remainingseconds=seconds%60;
    	  return getTimes(minutes,remainingseconds);
      }
      public static void main(String[]args)
      {
    	  System.out.println(getTimes(65,58));
    	  System.out.println(getTimes(8767L));
    	  
      }
    }
/*
public static void main(String[] args) {
    System.out.println(getDurationString(78, 45));
    System.out.println(getDurationString(39455L));
}

private static String getDurationString(long minutes, long seconds) {
    if((minutes < 0) || (seconds <0) || (seconds > 59)) {
        return "Invalid value";
    }

    long hours = minutes / 60;
    long remainingMinutes = minutes % 60;
    return hours + "h " +remainingMinutes + "m " + seconds + "s";
}

private static String getDurationString(long seconds) {
    if(seconds < 0) {
        return "Invalid value";
    }

    long minutes = seconds / 60;
    long remainingSeconds = seconds % 60;

    return getDurationString(minutes, remainingSeconds);
}
}
	*/