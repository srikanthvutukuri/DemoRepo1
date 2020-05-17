package com.sreekanth.package1;

import java.util.Scanner;

public class Square_star_pattern {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the size of the pattern");
int n=s.nextInt();
/*
  1234
1 ****
2 *  *
3 *  *
4 ****
*/

for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
	if(i==1 ||i==n ||j==1 ||j==n)
	{
	System.out.print("*");

	}else
	{
		System.out.print(" ");
	
	}
	
}
System.out.println();
	
}	
	
	
	
	
	
	
	}

}
