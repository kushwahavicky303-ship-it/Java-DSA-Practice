package Recursion;

import java.util.Scanner;

public class PowerPq {
    public static void main(String args[] ){
        System.out.println("Multiplying P itself as a power q using recursion");
        Scanner sc = new Scanner(System.in);
        System.out.println("Value of P");
        int p =sc.nextInt();
        System.out.println("Value of q");
        int q = sc.nextInt();
        System.out.println("power of p ,q: " +power(p,q));

    }
    static int power(int p , int q){
        if(q == 0){
            return 1;
        }
//        int smallerAns = power(p,q-1);
//        int ans = p*smallerAns;
//        return ans;
        return power(p,q-1)*p;
    }
}
