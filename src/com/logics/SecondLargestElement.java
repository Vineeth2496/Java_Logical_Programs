package com.logics;

import java.util.Scanner;

public class SecondLargestElement {

	public static int secondlargest(int[] arr)
	{
		//	declaring variables
		int fmax=0;
		int smax=0;
		//	Assign first element for fmax, smax
		fmax=arr[0];
		smax=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(fmax < arr[i])
			{
				smax=fmax;
				fmax=arr[i];
			}
			else if(smax < arr[i])
			{
				smax=arr[i];
			}
		}
		return smax;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int len=0;
		int num[]=null;
		System.out.println("Enter length of an Array:");
		len=sc.nextInt();
		// Creating an Array
		
		num=new int[len];	
		// take array inputs
		System.out.println("Enter Array Elements:");
		for(int i=0; i<num.length; i++)
		{
			num[i]=sc.nextInt();
		}
		
		System.out.println("Second largest elements= "+ secondlargest(num));
		
		// close Scanner
		
		sc.close();
		
	}

}
