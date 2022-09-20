package com.arrays.program;
import java.util.Scanner;
public class AverageOfArray {
	public static void main(String[] args) {
		averageOfArray();    
	}
	public static void averageOfArray() {
		Scanner sc=new Scanner(System.in);
        int n; 
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();    
      int arr[]=new int[n];
      int sum= 0;
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)     
        {	 arr[i]=sc.nextInt();	}
        for(int i=0;i<n;i++)     
        { 	sum+=arr[i];	
        }
        int avg= sum/n;
        System.out.println("average is : "+avg);		
	}
}