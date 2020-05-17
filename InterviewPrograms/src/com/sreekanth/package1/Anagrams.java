package com.sreekanth.package1;

import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {

	static HashMap< Character, Integer>  freq(String s)
	{
		HashMap< Character, Integer> hm=new HashMap< Character, Integer>();
		String str=s;
		char [] as1=str.toCharArray();
		char [] as2=str.toCharArray();
		int count=0;

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
		return hm;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		//declaration and instantiation of an array
		String [] sa =new String[2];
		for(int i=0;i<2;i++)
		{
			sa[i]=s.nextLine();
		}
		
		String s1=sa[0];
		
		String s2=sa[1];
	
		
		HashMap<Character, Integer> hm_s1=new HashMap<Character, Integer>();
		HashMap<Character, Integer> hm_s2=new HashMap<Character, Integer>();
		hm_s1=freq(s1);	
		hm_s2=freq(s2);	
		
		if(hm_s1.equals(hm_s2))
		{
			System.out.println("1 st freq :"+hm_s1);
			System.out.println("2 st freq :"+hm_s2);
			
			System.out.println("the two strings are anagrams");
		}
		else
		{
			System.out.println("1 st freq :"+hm_s1);
			System.out.println("2 st freq :"+hm_s2);
			
			System.out.println("the two strings are not anagrams");
			
		}
		
	}

}
