package Arrays;

import java.util.Scanner;

public class StrictlyGreaterarray {
    public static void main(String args[]){
        System.out.println("welcome to the count Strictly greater than arrays:");
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Array:");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("please Eneter X");
        int X= sc.nextInt();
        int count =0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>X){
                count++;
            }
        }
        System.out.println("count: " +count);
        sc.close();
    }
}
