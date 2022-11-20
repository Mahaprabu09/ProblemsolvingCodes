package Codingexcercise;

public class StringHandling {
	public static void main(String[]args)
	{
		
		// FIND STRING LENGTH 
		System.out.println("// FIND STRING LENGTH ");
        String str="hello everyone";
		
		System.out.println(str.length());
		
		//java Modificaition 
		System.out.println("JAVA MODIFICATION ");
		String var1="java";
		int num=10;
		
		System.out.println(" Learn "+var1);
		System.out.println(var1+" version "+num);
	//Java concat inbuilt keyword to join word as sentence
		System.out.println("Java concat inbuilt keyword to join word as sentence");
		String v1="Hi there";
		String v2=" this is mahaprabu here ";
		
		//v1.concat(v2);
		
		System.out.println(v1);
		System.out.println(v1.concat(" Welcome back to java programming"));
		System.out.println(v1.concat(v2));
		System.out.println();
		
		
		//EXTRACTION SUBSTRING
		System.out.println("EXTRACTION SUBSTRING");
		
		String ex="Welcome back to programming";
		System.out.println(ex.substring(3));
		System.out.println(ex.substring(1,10));
		
		//REPLACE STRING CHARACTER OR WORD
		
		System.out.println("REPLACE STRING CHARACTER OR WORD");
		String c="haw yau daing there ";
		System.out.println(c.replace('a','o'));
		
		System.out.println(c.replace("haw", "how are"));
		
		// TRIM KEYWORD IN JAVA FOR REMOVE WHITE SPACES 
		
		System.out.println("TRIM KEYWORD IN JAVA FOR REMOVE WHITE SPACES");
		String Trim1="           Welcome back to programming lessions";
		String Trim2=" hi there how the programming classes are going on";
		
		System.out.println("  Normal "+Trim1);
		
		System.out.println(Trim1.trim());
		System.out.println(Trim2.trim());
		
		
		// LETTER CASE CONVERSION
		System.out.println("LETTER CASE CONVERSION");
		String case1="Welcome back to programming";
		String case2="hELLO PROGRAMMERS I REALLY GLAD TO WELCOME YOU ALL";
		System.out.println(case2.toLowerCase());
		System.out.println(case1.toUpperCase());
		
		//STRING COMPARISION
		
		System.out.println("STRING COMPARISION ");
		
		String cp="program";
		String cp1="program";
		String cp2="welcome";
		
		System.out.println(cp.equals(cp1));
		System.out.println(cp.equals(cp2));
		
		//COMPARETO String IF a>b(how many characters are greater then the count would be the answer ><)
		
		System.out.println("COMPARETO STRING");
		
		String compare1="journey";
		String compare2="journey";
		String compare3="beautiful";
		String compare4="coolclimate";
		
		System.out.println(compare1.compareTo(compare2));
		System.out.println(compare1.compareTo(compare3));
		System.out.println(compare3.compareTo(compare1));
		
		//STARTS WITH AND ENDS WITH
		System.out.println("STRATS WITH AND ENDS WITH");
		String s="How are you";
		String end="you doing there";
		System.out.println(s.startsWith("How"));
		System.out.println(s.endsWith("you"));
		System.out.println(s.startsWith("you"));
		System.out.println(s.endsWith("how"));
		
		//STRING VS STRINGBUILDER
		
		String sc1="coder";
		System.out.println(sc1.replace("co", "Tra"));
		
		String strvar=new String("Ra");
		strvar=strvar+"dar";
		System.out.println(strvar);
		System.out.println();
		
		StringBuilder sbc=new StringBuilder("Programmer ");
	    sbc.append("welcome");
		sbc.append(" Back to code");
		System.out.println(sbc);
		
		//STRING VS STRINGBUFFER HASHCODE GENERATION
		
		System.out.println("String hashcode test :");
		String hcs="hello people";
		System.out.println(hcs.hashCode());
		hcs=hcs+"i hope all of you doing well";
		System.out.println(hcs.hashCode());
		System.out.println();
		
		System.out.println("String buffer hashcode test :");
		StringBuffer sbhc=new StringBuffer("i am");
		System.out.println(sbhc.hashCode());
		sbhc.append("Mahaprabu");
		System.out.println(sbhc.hashCode());
		System.out.println();
		
/*		for(int i=0;i<=ch1.length;i++)
		{
			System.out.println(str.charAt(i));
		}
	*/	
	}
}
