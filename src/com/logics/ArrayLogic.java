package com.logics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLogic {
	public static void main(String[] args) 
	{
		
	/*	// Length of Array
		Integer A[]=new Integer[5]; //{1,2,3,4,7,8,2};
		System.out.println("Length of Array A is: "+A.length);
		
		Integer B[]=new Integer[]{1,2,5,8,2,9,7};
		System.out.println("Length of Array B is: "+B.length);
		
		String s[]=new String[]{"Hai darling","How r u ", "Darling"};
		System.out.println("Length of String is: "+s.length);
		
		String s1=new String("Hai darling");
		System.out.println("Length of String is: "+s1.length());
	*/
	
	/*
	 	//1. Find the sum of array 
		Integer arr1[]=new Integer[8];
		Integer sum=0;
		arr1[0]=1;
	 	arr1[1]=2;
		arr1[2]=3;
		arr1[3]=4;
		arr1[4]=5;
		arr1[5]=6;
		arr1[6]=7;
		arr1[7]=8;
		for(int i=0; i<arr1.length; i++)
			{
			sum=sum+arr1[i];
			}
		System.out.println("Sum of Array is: "+sum);

		//2. Find the sum of array 
		Integer arr2[]=new Integer[]{8, 7, 6, 5, 4, 3, 2, 1};
		Integer sum1=0;
		for(int i=0; i<arr2.length; i++)
			{
			sum1=sum1+arr2[i];
			}
		System.out.println("Sum of Array is: "+sum1);
	*/
	/*
		// Find the avarage of array
		Integer arr3[]=new Integer[5];
		Integer sum2=0;
		Double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array elements"+"\n");
		for(int i=0; i<5; i++)
			{
			arr3[i]=sc.nextInt();		
			}
		System.out.println("Array Elements are: ");
		for(int i=0; i<5; i++)
			{
			System.out.print(arr3[i]+", ");
			}
		for(int i=0; i<5; i++)
			{
			sum2=arr3[i]+sum2;
			}
		avg=(double) (sum2/(double)arr3.length);
		System.out.println("\n"+"Sum of Array Elements is: "+sum2+"\n"+"Avarage of Array Elements is: "+avg);
	*/
		
	/*	// Find the Sum of Two Array Elements
		
		// take number of elements in both array
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter number of elements size in first array: ");
	    int array1size = sc.nextInt();
	    System.out.print("Enter number of elements size in second array: ");
	    int array2size = sc.nextInt();

	    // both array must have same number of elements
	    if(array1size != array2size) {
	      System.out.println("Both array must have same number of elements");
	      return; 
	    }

	    // declare three array with given size
	    int array1[] = new int[array1size];
	    int array2[] = new int[array1size];
	    int array3[] = new int[array1size];

	    // take input for array1 elements
	    System.out.println("Enter first array elements: ");
	    for (int i=0; i<array1.length; i++) {
	      array1[i] = sc.nextInt();
	    }

	    // take input for array2 elements
	    System.out.println("Enter second array elements: ");
	    for (int i=0; i<array2.length; i++) {
	      array2[i] = sc.nextInt();
	    }

	    // loop to iterate through the array
	    for (int i=0; i<array3.length; i++) {
	      // add array elements
	      array3[i] = array1[i] + array2[i];
	     }

	    // display the third array
	   System.out.println("Resultant Array: " + Arrays.toString(array3));
	  
	*/
		
		// To Find the Duplicate Values in Array
	/*	
		Integer arr3[]=new Integer[] {2,3,2,3,7,8,7};
		for(int i=0; i<arr3.length; i++)
		{
			{
			for(int j=i+1; j<arr3.length; j++)
				if(arr3[i]==arr3[j])
				{
					System.out.println("Duplicate Elements in a Array are: "+arr3[j]);
				}
			}
		}
	*/
	/*	
		//	Sort an integer array elements in Descending & Ascending order
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of elements to read:");
		int len=sc.nextInt();
		int arr1[]=new int[len];
		System.out.println("Enter Array Element:");
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Unsorted Array Elements:"+Arrays.toString(arr1));
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=i+1; j<arr1.length; j++)
			{
				int temp=0;
				if(arr1[i]<arr1[j])
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		System.out.println("Sortted Descending Order Array Elements:"+Arrays.toString(arr1));
	
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=i+1; j<arr1.length; j++)
			{
				int temp=0;
				if(arr1[i]>arr1[j])
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		System.out.println("Sortted Ascending Order Array Elements:"+Arrays.toString(arr1));
	*/
	/*	
		char ch;
		System.out.println("yadhav");
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
		System.out.println(ch);
		
	*/
	/*	
	char ch[]=null;	
		
	String str[]=new String[]{"Ram","shyam","Ali","Heera"};
	int index=0;
	for(int i=0; i<str.length; i++)
	{	
			ch=str[i].toCharArray();
			if(ch[i]=='m') 
			{
			index=i;
			//	System.out.print("Given chracter exist in element:"+index);
			System.out.print("Given chracter exist in element:"+index);
			}
	}
	
	*/
	/*
	String str[]=new String[] {"Ram","Shyam","Ali","Heera"};
	char h1[]=str[0].toCharArray();
	char h2[]=str[1].toCharArray();
	char h3[]=str[2].toCharArray();
	char h4[]=str[3].toCharArray();
	int index=0, strindex=0;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a character to find String Index:");
	for(int i=0;i<h1.length;i++)
	{
		if(h1[i]=='m') 
		{
		index=i;
		if(str[0]=="Ram")
			{
			strindex=0;
		//	System.out.print("Given chracter exist in element:"+index);
			System.out.print("Given chracter exist in element:"+strindex);
			}
		}
	}
	for(int i=0;i<h2.length;i++)
	{
	
		if(h2[i]=='m') 
		{
		index=i;
		if(str[1]=="Shyam")
			{
			strindex=1;
			System.out.print(", "+strindex);
			}
		}
	}
	for(int i=0;i<h3.length;i++)
	{
		if(h3[i]=='m') 
		{
		index=i;
		if(str[2]=="Ali")
			{
			strindex=2;
			System.out.print(", "+strindex);
			}
		}
	}
	for(int i=0;i<h4.length;i++)
	{
		if(h4[i]=='m') 
		{
		index=i;
		if(str[3]=="Heera")
			{
			strindex=3;
			System.out.print(", "+strindex+". ");
			}
		}
	}
//	System.out.println("Index of hello is:"+index);
	*/
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of String: ");
		Integer len=sc.nextInt();
		String str[]=new String[len];
		System.out.println("Enter String Elements: ");
		for(int i=0; i<str.length; i++)
		{
			str[i]=sc.next();
		}
		System.out.println("Entered String is"+Arrays.toString(str));
		
		String tempstr[]=str;
	*/	
	/*	for(int i=0; i<str.length; i++)
		{
			char ch[i]=str[i].toCharArray();
		}
		
		String str[]=new String[] {"ram", "shyam", "ali", "heear"};
		Character ch='m';
		for(int i=0; i<str.length; i++)
		{
			for(int j=0; j<str.length; j++ )
			{
				if(ch==str[j])
				{
					
				}
			}
		}
 	*/
	/*	//	Single time Appered elements
	 	Integer a[]=new Integer[] {5,3,4,5,4,2,3};
		Integer res=a[0];
		for(int i=1; i<a.length; i++)
		{
			res=res^a[i];
		}
		System.out.println("Single time appered element is:"+res);
	*/
		
	/*	//	Length of an Array
	 	int a[]= {5,3,4,5,2,1,5};
		int len=0;
		for(int x:a)
		{
			len++;
		}
		System.out.println("Length of Array:"+len);
	*/	
		
	/*	// Sum and Average of an Array
	  	Integer a[] = new Integer [] {1,2,3,4,5,6};  
		Integer sum=0;  
		int i = 0;
		for (i = 0; i < 6; i++) 
		{  
			sum = sum + a[i];
		}
		System.out.println("the sum of array: "+sum); 
		Integer ave=sum/i;
		System.out.println("average of all the elementes in an array: " + ave);  
	*/
	/*
	 	// Merging two Arrays
		Integer a[] =new Integer[]{2,6,5,8,4,9,7};
		Integer b[] =new Integer[]{12,22,33,44,54,21};
		Integer count=0;
		Integer count1=0;
		Integer j;
		Integer i;  
		for(int x : a)
	    	{
			count++;
	    	}
		System.out.println("enter the elements in a: ");   
		System.out.println("length of a : "+count);
		for(i=0;i<count;i++)
			{
			System.out.println(a[i]);
			}
			
		System.out.println("Array A Elements:"+Arrays.toString(a));
		for(int y : b)
	    	{
			count1++;
	    	}
		System.out.println("enter the elements in b: ");    
		System.out.println("length of b : "+count1);
		for(i=0;i<count1;i++)
			{
			System.out.println(b[i]);
			}
			
		
		System.out.println("Array B Elements:"+Arrays.toString(b));
		int mergingelements=count+count1;
		System.out.println("the length of mergingelements ="+mergingelements);
		System.out.println("After Merging the array is =");
		int mergedarray[] = new int[mergingelements];
		for ( i = 0; i <count; i++)
	    	{
			mergedarray[i] = a[i];
	    	}
		for ( i = 0, j = count; j < mergingelements && i < count1; i++, j++)
			{
			mergedarray[j] = b[i];
			}
		for(i=0;i< mergingelements;i++)
	    	{
			System.out.println(mergedarray[i]);
	    	}
	  	
		System.out.println("Array After Merged Elements:"+Arrays.toString(mergedarray));
	 */
	/*	// Largest Number of an Array
		Integer a[]=new Integer[]{52,64,113,46,224,66,1,9};
		Integer largenumber=a[0];
		Integer count=0;

		for(int x:a)
	    	{
			count++;
	    	}
	    for(int i=0;i<count;i++)
	    	{
			if(a[i]>largenumber)
				{
				largenumber=a[i];
				}
	    	}
			System.out.println("The largest number in an array is : "+largenumber);
		*/
		/*	// Largest Number of an Array
			Integer a[]=new Integer[]{52,64,113,46,224,66,1,9};
			Integer smallnumber=a[0];
			Integer count=0;

			for(int x:a)
		    	{
				count++;
		    	}
		    for(int i=0;i<count;i++)
		    	{
				if(a[i]<smallnumber)
					{
					smallnumber=a[i];
					}
		    	}
				System.out.println("The Smallest number in an array is : "+smallnumber);
		*/
		
		// Second largest number  //52,64,113,46,224,66,1,9,220
		Integer a[]=new Integer[]{52,64,113,46,224,66,1,9,220};
		Integer secondlargenumber;
		Integer count=0;
		for(int x:a)
	    	{
			count++;
	    	}
	    for(int i=0;i<count;i++)
	      	{
	    	for(int j=i+1;j<count;j++)		
				{
	    		if(a[i]>a[j])
			    	{
	    			secondlargenumber=a[i];
	    			a[i]=a[j];
	    			a[j]=secondlargenumber;
			    	}
				}
	     	}
	    secondlargenumber=a[count-2];		
	    System.out.println("The secondlargest number in an array is : "+secondlargenumber);
		
		// Linear Search
		/*
		Integer a[]=new Integer[]{5,6,11,25,9,5};
		Integer count=0;
		Integer b;
		for(int x:a)
			{
		   	count++;
		 	}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element : ");
		b=sc.nextInt();
		for(int i=0;i<count;i++)
			{
		 	if(a[i]==b)
		  		{
				System.out.println(b+" is placed at index :"+i);
		     	}
		 	}
		*/
		/*
		// 	Remove Odd numbers
		Integer a[]=new Integer[]{1,2,3,4,5,6,7,8,9};
		Integer count=0;
		for(int x:a)
			{
			count++;
			}
		System.out.println("length of elements : "+count);
		System.out.println("the elements in array : ");
		for(int i=0;i<count;i++)
			{
			System.out.println(a[i]);
			}
		System.out.println("remove odd numbers in array");
		System.out.println("the updated array is : ");
		for(int n=0; n<count; n++)
			{
			if(a[n]%2==0)
				{
				System.out.println(a[n]);
				}
			}
		*/
	}
}
