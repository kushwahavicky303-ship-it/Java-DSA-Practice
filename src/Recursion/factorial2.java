package Recursion;

import java.util.Scanner;

public class factorial2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the value of N: ");
        int N = sc.nextInt();
        System.out.println("Factorial value is: " +fact(N));

    }
    static int fact(int N){
        if(N==0){
            return 1;
        }
        //recursion relation
//        int smallerAns = fact(N-1);
//        //biggest problem
//        int ans  = N*smallerAns;
//        return ans;
        return N*fact(N-1);
    }
}
