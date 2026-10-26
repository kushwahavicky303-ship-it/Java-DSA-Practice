package Recursion;

public class PrintDecreasingtoN {
    static void printDecreasing(int n){
        //base case
        if(n == 1){
            System.out.println(n);
            return;
        }
        //self work
        System.out.println(n);//prints 10 only
        printDecreasing(n-1);//9 8 7...1
    }
    public static void main(String args[]){
        System.out.println("print decreasing number to n");
        int n = 10;
        printDecreasing(n);
    }
}
