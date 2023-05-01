package com.logics;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, a, temp;
		int number=153;
		temp=number;
		while(number>0)
		{
			a=number%10; 		// will get last digit
			number=number/10;	// removing last digit
			sum=sum+(a*a*a);
		}
		if(temp==sum)
		{
			System.out.println(temp+" : is an amstrong number");
		}
		else
		{
			System.out.println(temp+" : is not an amstrong number");
		}

	}

}
