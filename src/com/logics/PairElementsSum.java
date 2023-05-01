package com.logics;

import java.util.Arrays;
import java.util.Scanner;

public class PairElementsSum {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of an Array:");
		Integer length=sc.nextInt();
		Integer count=0;
		Integer arr[]=new Integer[length];
		System.out.println("Enter an Array Elements:");
		for(int i=0; i<length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Given Array is: "+Arrays.toString(arr));
		System.out.println("Enter Sum value of Pair Elements :");
		Integer sum=sc.nextInt();
		System.out.println("Sum of Pair Elements of "+ sum +" is:");
		for(int i=0; i<length; i++)
		{
			for(int j=i+1; j<length; j++)
			{
				if((arr[i] + arr[j])== sum)
				{
			
					System.out.println(arr[i]+" + "+arr[j]+" = "+sum);
					count++;
				}
			}
		}
		System.out.println("Number of Pair Elements are: "+count);
	}

}
