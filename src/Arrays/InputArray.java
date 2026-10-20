package Arrays;

import java.util.Scanner;

public class InputArray {
    public static void main(String args[]){
        System.out.println("welcome to the input taking arrays: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
