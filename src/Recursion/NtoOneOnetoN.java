package Recursion;

import java.util.Scanner;

public class NtoOneOnetoN {
    public static void main(String args[]){
        System.out.println("Print numbers from 1 to N, then N to 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("please value of N");
        int N = sc.nextInt();
        fun1(N);
        fun2(N);
    }
    //first method from 1 to N
    static void fun1(int N){
        if(N == 1){
            System.out.println(N);
            return;
        }
        fun1(N-1);
        System.out.println(N);
    }
    //second method from N to 1
    static void fun2(int N){
        if(N == 1){
            System.out.println(N);
            return;
        }
        System.out.println(N);//self work
        fun2(N-1);//recursion call
    }
}
