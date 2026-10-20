package TwoDimensionalArray;

import java.util.Scanner;

public class RotationMatrix {
    public static void main(String args[]){
        System.out.println("Rotation 90 degree matrix:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row and Columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements of matrix:");
        for(int i=0; i<r ; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //step->1 First Transpose the matrix:
        for(int i=0; i<r; i++){
            for(int j=i+1; j<c; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //Reverse each row
        for(int i=0; i<r; i++){
            int left=0;
            int right = c-1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
        // Print rotated matrix
        System.out.println("Matrix after 90-degree clockwise rotation:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
