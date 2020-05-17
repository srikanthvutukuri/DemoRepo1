package com.sreekanth.package1;

public class Number_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=1;
/*
 1 2 3 4 
 2 3 4 1
 3 4 1 2	
 4 1 2 3 
	
*/ 
for(int i=1;i<=4;i++)
 {
 for(int j=1;j<=4;j++)
 {
 System.out.print(x);
 x=x+1;
 }	
 x=1;
 System.out.println();
		 
 }		 
	}

}
