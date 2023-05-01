package com.logics;

import java.util.Scanner;

public class FrequentElements {
	public static void main(String[] args) {
		//	Alphabets count 26
		try
		{
		final int size=26;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.next();
		//	Size of String
		Integer n=str.length();
		
		//	Array of frequency 
		Integer freq[]=new Integer[size];
		
		for(int i=0; i<n; i++)
		{
			freq[str.charAt(i) - 'a']++;
		}
		for(int i=0; i<n; i++)
		{
			if(freq[str.charAt(i)-'a'] !=0)
			{
				System.out.println(str.charAt(i)+" = "+freq[str.charAt(i)-'a']);
				freq[str.charAt(i)-'a']=0;	
			}
			
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
