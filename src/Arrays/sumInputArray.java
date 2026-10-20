package Arrays;

import java.util.Scanner;

public class sumInputArray {
   public  static void main(String[] args) {
        System.out.println("Sum of an Arrays:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements of an array:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
