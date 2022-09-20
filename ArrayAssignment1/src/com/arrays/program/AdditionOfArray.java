package com.arrays.program;
public class AdditionOfArray {
	public static void main(String[] args) {
		additionOfArrays();
		}
	public static void additionOfArrays() {
		int arr1[]= {5,4,6};
		int arr2[]= {7,5,8};
		int add[]= new int[arr1.length];
		
		System.out.println("first array: ");
		for(int i=0; i<arr1.length; i++)
			System.out.print("\t"+arr1[i]);
		
		System.out.println("\nsecond array: ");
		for(int i=0; i<arr2.length; i++)
			System.out.print("\t"+arr2[i]);

		System.out.print("\nAddition of two arrays: \n");
		for(int i=0; i<arr1.length; i++)
		{
			add[i]=arr1[i]+arr2[i];
		
		System.out.print("\t"+add[i]);		
		}
}
}