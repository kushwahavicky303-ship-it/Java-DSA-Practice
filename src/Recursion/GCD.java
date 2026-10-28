package Recursion;

import java.util.Scanner;

public class GCD {
    public static void main(String args[]){
        System.out.println("Finding greatest common divisor:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values of a ,b: ");
        int a =sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD is: " +gcd(a,b));
    }
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
