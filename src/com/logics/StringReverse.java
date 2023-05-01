package com.logics;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		InputStreamReader ii=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ii);
		System.out.println("Enter the String value:");
		String name=br.readLine();
	//	String name="Margott Robbie";
		String res="";
		for(int i=name.length()-1; i>=0; i--)
		{
			res=res+name.charAt(i);
		}
		System.out.println("Reverse string of string value is:"+res);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
