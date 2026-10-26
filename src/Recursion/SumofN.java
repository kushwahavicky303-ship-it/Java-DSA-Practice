package Recursion;

import java.util.Scanner;

public class SumofN {
    public static void main(String args[]){
        System.out.println("sum of 1 to N numbers:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N");
        int N = sc.nextInt();
        System.out.println("Sum of N numbers: " +sum(N));
    }
    static int sum(int N){
        if(N == 0)
            return 0;
        return N+sum(N-1);
    }
}
