package Arrays;

import java.util.Scanner;

public class Increaseelement {
    public static void main(String args[]){
        System.out.println("increase each element by 5 and print updated elements:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<arr.length; i++){
            arr[i] = arr[i]+5;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
//arr[i] = arr[i] + 5; → element update karta hai.
//System.out.print(arr[i] + " "); → updated element print karta hai.
//ans variable ki zaroorat nahi hai, is question mein.