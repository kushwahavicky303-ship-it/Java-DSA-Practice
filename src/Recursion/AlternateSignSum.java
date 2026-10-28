package Recursion;

import java.util.Scanner;

public class AlternateSignSum {
    public static void main(String args[]){
        System.out.println("Alternate sign sum series:");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(alternateSum(N));
    }
    static int alternateSum(int N){
        //base case
        if(N == 0){
            return 0;
        }
        if(N%2 == 0){
            return alternateSum(N-1)-N;
        }
        else{
            return alternateSum(N-1)+N;
        }
    }
}
//Base case: n == 0 → return 0.
//If n is even, subtract it.
//If n is odd, add it.
//Recursively calculate the answer for n - 1.