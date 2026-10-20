package TwoDimensionalArray;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Addition2 {
    public static void main(String args[]){
        System.out.println("Addition of two MAtrices");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of row and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        int[][] sum  = new int[r][c];
        System.out.println("Enter the elememnts of first matrix:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second elements:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                B[i][j] = sc.nextInt();
            }
        }
        // Add corressponding elements:
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                sum[i][j] = A[i][j]+B[i][j];
            }
        }
        System.out.println("Sum of 2D arrays;");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
