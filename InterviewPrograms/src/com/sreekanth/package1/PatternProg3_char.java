package com.sreekanth.package1;

public class PatternProg3_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		
		J A V A
		  A V A
		    V A
		      A

*/	
		
	String s="JAVA";
	
	String str=s;
	
	for(int i=1;i<=4;i++)
	{
		
		System.out.println(str+" ");
		str=s.substring(i, s.length());
	}
	
	
	
	}

}
