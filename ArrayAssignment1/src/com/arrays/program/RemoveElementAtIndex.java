package com.arrays.program;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveElementAtIndex {
    public static void main(String[] args) {
    	removeElementAtIndex();
     }
	public static void removeElementAtIndex() {
		Scanner s=new Scanner(System.in);
    	int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[arr.length-1];
         int k=0;
        System.out.println("Given array :" + Arrays.toString(arr));

        System.out.println("Enter index: ");
        int j= s.nextInt();
        for(int i=0 ;i<arr.length;i++){
            if(i!=j){
                arr2[k]=arr[i];
                k++;
            }
        }
        System.out.println("After deletion :" + Arrays.toString(arr2));
	}
}