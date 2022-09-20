package com.arrays.program;

public class LargestNumber {

	public static void main(String[] args) {
		findLargestNumber();
		}
	public static void findLargestNumber() {
		int ar[]= {3,88,61,2,58};
		int max=ar[0];
		int i;
		for(i=0; i<ar.length-1; i++)
		{
			if(ar[i]>max)
				{max= ar[i];}
		}
		System.out.println("Largest number is : "+max);
	}
}