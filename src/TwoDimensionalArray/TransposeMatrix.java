package TwoDimensionalArray;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String args[]){
        System.out.println("Transpose of a matrix:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        int[][] transpose = new int[c][r];
        System.out.println("Enter the elements of matrix:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //Calculate transpose matrix:
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("Transpose matrix is: ");
        for(int i=0; i<c; i++){
            for (int j=0; j<r; j++){
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
