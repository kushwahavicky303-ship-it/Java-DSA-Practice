package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[]){
        System.out.println("printing sum of digits using recursion");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digits: ");
        int N = sc.nextInt();
        System.out.println(sumDigits(N));

    }
    static int sumDigits(int N){
        if(N==0){
            return 0;
        }
//        int smallerAns = sumDigits(N/10);
//        int ans = smallerAns+(N%10);
//        return ans;
        return sumDigits(N/10)+(N%10);//shortcutes
    }
}
