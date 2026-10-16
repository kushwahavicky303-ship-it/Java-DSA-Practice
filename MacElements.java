package Arrays;

import java.util.Scanner;

public class MacElements {
    public static void main(String args[]){
        System.out.println("find the max elelments in array:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max =arr[0];//we can zero
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("max: " +max);
    }
}
