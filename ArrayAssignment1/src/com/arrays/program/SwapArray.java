package com.arrays.program;
import java.util.Scanner;
public class SwapArray {
	public static void main(String[] args) {
		swapingOfArray();
	}
	public static void swapingOfArray() {
		Scanner s=new Scanner(System.in);
		int arr1[]= new int[4];
		int arr2[]= new int[4];
		int arr3[]= new int[4];
		System.out.println("enter elements of first array");
		for(int i=0; i<arr1.length-1; i++ )
			{	arr1[i]=s.nextInt();	}
		System.out.println("enter elements of second array");
		for( int i=0; i<arr2.length-1; i++ )
			{	arr2[i]=s.nextInt();	}
		for( int i=0; i<arr1.length-1; i++ )
		{  	arr3[i]=arr1[i];
			arr1[i]=arr2[i];
			arr2[i]=arr3[i];
		}
		System.out.println("After swaping of array: ");
        System.out.println("First Array: ");
		for( int i=0; i<arr1.length-1; i++ )
			System.out.print("\t"+arr1[i]);
        System.out.println("\nSecond Array: ");
		for( int i=0; i<arr2.length-1; i++ )
			System.out.print("\t"+arr2[i]);		
	}
}