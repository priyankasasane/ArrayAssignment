package com.arrays.program;
import java.util.Arrays;
public class SortingOfArray {
	public static void main(String[] args) {
		sortingArrays();
		}
	public static void sortingArrays() {
		int arr[]= {92,5,35,60};
		int arr2[]=new int[4];
		int j=0;
		System.out.println("original Array : "+ Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("\t***After sorting***");
		System.out.println("Ascending order : "+ Arrays.toString(arr));
    for(int i=arr2.length-1; i>=0; i--)
   {
	   arr2[j]=arr[i];
	   j++;
   }
   		System.out.println("Descending order: "+ Arrays.toString(arr2));		
	}
}