package com.logics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacters {
	
	public  static void duplicatechar(String str)
	{
		if(str==null)
		{
			System.out.println("Null String");
			return;
		}
		if(str.isEmpty())
		{
			System.out.println("Empty String");
			return;
		}
		if(str.length()==1)
		{
			System.out.println("Single character String");
			return;
		}
		char word[]=str.toCharArray();
		
		Map<Character, Integer> charMap=new Hashtable<Character, Integer>();
		
		for(Character ch: word)
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		}
		
		Set<Map.Entry<Character,Integer>> entry=charMap.entrySet();
		
		for(Map.Entry<Character, Integer> st: entry)
		{
			if(st.getValue()>1)
			{
			System.out.println(st.getKey()+" Duplicate value count: "+st.getValue());
			}
		}
		
		
	}
	
	
	public static void main(String[]args)
	{
		try
		{
		InputStreamReader ii=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ii);
		System.out.println("Enter String Value for Duplicate values");
		String a=br.readLine();
				
		duplicatechar(a);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
