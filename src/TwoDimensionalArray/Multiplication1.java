package TwoDimensionalArray;

import java.util.Scanner;

public class Multiplication1 {
    public static void main(String args[]){
        System.out.println("Multiplication of 2D array:");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Row1 and columm1:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.println("Enter the number of Row2 and column2:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        //Matrix Multiplication Condition:
        if(c1!=r2){
            System.out.println("Multiplication not possible:");
            return;
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] result = new int[r1][c2];
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        // Multiply matrices
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Multiplication result:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
