package Recursion;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class PrintArray {
    public static void main(String args[]){
        System.out.println("Printing array recusrion ");
        int[] arr = {1,2,3,4,5,6,7,8,9};
        printArray(arr,0);
    }
    static void printArray(int[] arr , int index){
      if(index == arr.length){
          return;
      }
        System.out.println(arr[index]);
        printArray(arr, index + 1);
    }
}
