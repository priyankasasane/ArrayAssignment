package com.arrays.program;
import java.util.Arrays;
public class ConcatTwoArrays {
 public static void main(String[] args) {
	 concatingTwoArrays();
}
public static void concatingTwoArrays() {
	int a[]= {2,3,7,8};
	 System.out.println("First Array : "+Arrays.toString(a));
	 int b[]= {6,8,2,4};
	 System.out.println("Second Array : "+Arrays.toString(b));
	 int j=0;
	 int c[]= new int[a.length+b.length];
	 for(int i=0; i<a.length; i++)
		 c[i]=a[i];
	 for(int i=a.length; i<c.length; i++)
	 { c[i]=b[j];
	 j++;
	 }
	 System.out.println("Array after concatination : "+Arrays.toString(c));}
}
