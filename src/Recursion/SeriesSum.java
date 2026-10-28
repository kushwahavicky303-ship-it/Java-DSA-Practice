package Recursion;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String args[]){
        System.out.println("Sum of series:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Number:");
        int N = sc.nextInt();
        System.out.println("Sum of series: " +sum(N));


    }
    static int sum(int N){
        if(N ==0){
            return 0;
        }
        return sum(N-1)+N;
    }
}
