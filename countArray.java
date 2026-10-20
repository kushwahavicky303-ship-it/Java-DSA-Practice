package Arrays;

import java.util.Scanner;

public class countArray {
    public static void main(String args[]){
        System.out.println("welcome to the counting in arrays:");
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter X:");
        int X = sc.nextInt();
        int count =0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]==X){
                count++;
            }

        }
        System.out.println("count: " +count);
        sc.close();

    }
}
