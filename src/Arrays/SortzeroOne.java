package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortzeroOne {
    public static void main(String args[]){
        System.out.println("Sort an array consisting 0 and 1:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
          int i=0;
        int j= arr.length-1;
        while(i<j){
            if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println("Sorted array is:");
        System.out.println(Arrays.toString(arr));
    }
}
