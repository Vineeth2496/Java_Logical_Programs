package com.logics;

public class PerfectNo {
	static
	{
		System.out.println("**************HAI*******************");
	}
	static boolean check(int number)
	{
		int sum=1;
		
		for(int j=2; j*j<=number; j++)
		{
			if(number%j==0)
			{
				if(j*j!=number)
				{
					sum=sum+j+number/j;
				}
				else
				{
					sum=sum+j;
				}
			}
		}
		
		if(sum==number && number !=1)
		return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Perfect numbers between 1 to 5000");
		for(int n=2; n<500; n++)
		{
			if(check(n))
			{
				System.out.println(n+" is perfect number");
			}
		/*	else
			{
				System.out.println(n+"is not a perfect number");
			}
		*/	
		}
	}

}
