package com.logics;

import java.util.Arrays;
import java.util.Scanner;

public class NextGreatsetElem {

	public static void nextgreatest(int a[], int n)
	{
		int max=a[n-1], temp;
		a[n-1]=0;
		for(int i=n-2; i>=0; i--)
		{
			temp=a[i];
			a[i]=max;
			if(max<temp)
			{
				max=temp;
			}
		}
		System.out.println("After Replacement with Next Greatest Elements of Given Array is: "+Arrays.toString(a));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of an array");
		int len=sc.nextInt();
		int a[]= new int[len];
		System.out.println("Enter Array Elements: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Entered Array is: "+Arrays.toString(a));
		nextgreatest(a, len);
	}
}
