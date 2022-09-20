package com.arrays.program;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveElement {
	public static void main(String[] args) {
		removeElement();
		    }
	public static void removeElement() {
		Scanner s= new Scanner(System.in);     
		int[] arr = new int[5];
		System.out.println("Enter elements of array : ");
for(int i=0; i<arr.length; i++ )
			arr[i]= s.nextInt();
		System.out.println("Given Array is : "+ Arrays.toString(arr));
        int[] arr2 = new int[arr.length-1];
		System.out.println("Enter element you want to remove : ");
        	int element= s.nextInt();
        	int x=0, j=0;
for(int i=0;i<arr.length;i++)
	{
    if(arr[i]==element)
    	x++;
    }
if(x!=0)
	{
	for(int i=0; i<arr.length;i++)
		{
        if(arr[i]!=element)		       
			{ arr2[j]=arr[i];
                j++;
			}
		}
	   	System.out.println("After removing element :" + Arrays.toString(arr2));
	}
	   	else
    	System.out.println("Given element not found :" + element);		
	}
		}