package Recursion;

public class Factorial {
    public static void main(String args[]){
        System.out.println("value of factorial N:");
        System.out.println(factorial(5));
    }
    static int factorial(int N){
        //base case
       if(N == 0)
           return 1;
           return N*factorial(N-1);
    }
}
