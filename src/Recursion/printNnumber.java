package Recursion;

import java.util.Scanner;

public class printNnumber {

    static void printIncreasing(int n){
        if(n == 1){//base case or haulting problem
            System.out.println(n);//if this false then pi work
            return;
        }
        printIncreasing(n-1);//1 2 3 4...n-1//sub problem
        System.out.println(n);//->4 self work
    }


    public static void main(String args[]){
        System.out.println("printing n natural number using recursion:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of n:");
        int n = sc.nextInt();
        printIncreasing(n);
    }
}
