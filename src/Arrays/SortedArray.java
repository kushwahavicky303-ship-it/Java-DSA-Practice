package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String args[]){
        System.out.println("welcome to the Sorted or non sorted arrays:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of arrays: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        boolean chek = true;
        for (int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                chek =false;
                break;
            }
        }
        System.out.println(chek);
    }
}
