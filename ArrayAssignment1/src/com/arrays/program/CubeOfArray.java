package com.arrays.program;
import java.util.Arrays;
import java.util.Scanner;
public class CubeOfArray {
	public static void main(String[] args) {
		cubeOfArray();
	}
	public static void cubeOfArray() {
		int r[]=new int[4];
		int cube[]=new int[4];
		int i,j=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter elements of array : ");
		for(i=0; i<=r.length-1; i++)
		{
		r[i]= s.nextInt();
		}
		System.out.println("Original Array : "+ Arrays.toString(r));
		for(i=0; i<=r.length-1;i++)
		{
			cube[j]=r[i]*r[i]*r[i];
			j++;
		}
		System.out.println("Cube of Array : "+ Arrays.toString(cube));
	}

	}