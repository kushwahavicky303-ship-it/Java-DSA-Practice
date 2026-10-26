package Recursion;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String args[]){
        System.out.println("calculate fibonacci series:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N = sc.nextInt();
        System.out.println("Fibonacci Series term is : " +fib(N));
    }
    static int fib(int N){
        if(N==0 || N==1){
            return N;
        }
        return fib(N-1)+fib(N-2);//this is shortcuts
//        //recursion work
//        int prev = fib(N-1);
//        int prevPrev = fib(N-2);
//        //self work
//        int ans = prev+prevPrev;
//        return ans;


    }
}
