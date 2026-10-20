package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sortzeroesOne {
    public static void main(String args[]){
        System.out.println("sort zeroes and ones in an array:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int left =0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]==0){
                left++;
            } else if (arr[right]==1) {
                right--;
            }
            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
