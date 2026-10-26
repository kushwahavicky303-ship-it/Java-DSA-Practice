package Recursion;

import java.util.Scanner;

public class PrintFibonacciseriesN {
    public static void main(String args[]){
        System.out.println("print Fibonacci series to N: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter value of N");
        int N = sc.nextInt();
        for(int i=0; i<=N; i++){
            System.out.println("Fibonacci series is: " +fib(i));
        }
    }
    static int fib(int N){
        if(N == 0 || N == 1){
            return N;
        }

        //recursion work
        return fib(N-1)+fib(N-2);
    }
}
