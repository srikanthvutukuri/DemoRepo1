package com.sreekanth.package1;

public class PatternProg1 {

	static int toggle_01(int a)
	{
		int res=0;
		if(a==1)
		{
			res=0;
		}
		
		if(a==0)
		{
			res=1;
		}
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		int x;
		x=1;

/*		
		1
		01
		101
		0101
		10101

*/
		for(int i=1;i<=5;i++)
		{
			
		for(int j=1;j<=i;j++)
		{
			sum=i+j;
			
			if(sum%2==0)
			{
		System.out.print(1);

			}
			else
			{
		System.out.print(0);
	
			}

		}
		System.out.println();
		
		}
	}

}
