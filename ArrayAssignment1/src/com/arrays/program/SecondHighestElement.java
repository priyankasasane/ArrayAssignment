package com.arrays.program;
import java.util.Arrays;
import java.util.Scanner;
public class SecondHighestElement {
	public static void main(String[] args) {
		findSecondHighestElement();
			}
	private static void findSecondHighestElement() {
		int a[]=new int[4];
		int i,j=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter elements of array : ");
		for(i=0; i<=a.length-1; i++)
		{
		a[i]= s.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Second highest element of array is : "+ a[a.length-2]);	
	}
}