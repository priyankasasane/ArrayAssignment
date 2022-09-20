package com.arrays.program;
public class ReverseArray {
	public static void main(String[] args) {
		reverseArray();
		}
	public static void reverseArray() {
		int[] array= {2,5,6,8};
		
		System.out.println("***Original Array***");
	for(int i=0; i<array.length; i++)
		{System.out.print(" " +array[i]);}
		
	System.out.println("\n***Reverse Array***");
	for(int i=array.length-1; i>=0;i--)
		{System.out.print(" " +array[i]);}		
	}
}