package com.sreekanth.package1;

import java.util.Scanner;

public class Pyramid_numbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		
		int z=n;
		
		int a=1;
		
		String str=null;
		
		
		for(int i=1;i<=n;i++)
		{

			for(int sp=n-1;sp>=i;sp--)
			{
			System.out.print(" ");
			}

		for(int l=1;l<i;l++)
		{
		System.out.print(a+" ");
		a=a+1;
		}
		
		System.out.println();
		
		}

	}

}
