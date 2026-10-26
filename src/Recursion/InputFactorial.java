package Recursion;

import java.util.Scanner;

public class InputFactorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please value of N");
        int N = sc.nextInt();

        System.out.println("factorial value is: " +factorial(N));
        //call the method and print its returned result.
        sc.close();
    }
    static int factorial(int N){
        if(N == 0)
            return 1;
        return N*factorial(N-1);
    }
}
