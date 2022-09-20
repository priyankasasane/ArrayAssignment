package com.arrays.program;
import java.util.Arrays;
import java.util.Scanner;
public class CompareTwoArrays {
	public static void main(String[] args) {
		compareTwoArrays();
	}
	public static void compareTwoArrays() {
		Scanner s= new Scanner(System.in);
		int arr1[]=new int[3];
		int arr2[]=new int[3];
		int x=0;
	System.out.println("Enter elements of first array : ");
		for(int i=0; i<arr1.length;i++)
			arr1[i]= s.nextInt();
	System.out.println("Enter elements of second array : ");
		for(int i=0; i<arr2.length;i++)
			arr2[i]= s.nextInt();
	System.out.println("First array : "+Arrays.toString(arr1));
	System.out.println("second array : "+Arrays.toString(arr2));
	if(arr1.length==arr2.length)
	{
		for(int i=0; i<arr1.length; i++)
			{if(arr1[i]==arr2[i])
				x++;
			}
		if(x!=0)
			System.out.println("Both arrays are same ");
		else
			System.out.println("Both arrays are not same ");
	}
	if(arr1.length!=arr2.length)
		System.out.println("length of both arrays is not same hence cannot compare ");


}

}
