package com.sreekanth.package1;

public class SubArrays_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5};
		int sum=0;
		
		
		int res[]=new int[5];
		
		
		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=i;j++)
		{
		sum=sum+a[j-1];
		}
		System.out.println(sum);
		sum=0;
		}
		
		
		

	}

}
