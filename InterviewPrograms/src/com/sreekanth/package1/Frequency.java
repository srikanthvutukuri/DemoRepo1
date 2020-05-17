package com.sreekanth.package1;

import java.util.HashMap;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	
		convert the given string to char array , take another array
		same characters
		compare each character of 1st array with the each char of 
		2nd array,if it is true then put that in hashmap(char,count)
		
*/		
		
	Scanner s =new Scanner(System.in);
	
	System.out.println("enter the string to which the frequency has to be calculated");
	String str=s.nextLine();
			
	
		
		char [] as1=str.toCharArray();
		char [] as2=str.toCharArray();
		int count=0;
	HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++)
		{

			for(int j=0;j<str.length();j++)
			{
				
			if(as1[i]==as2[j])
			{
				count=count+1;
				hm.put(as1[i], count);
			}
			
			}
			count=0;
			
		}
System.out.println(hm);
	}

}
