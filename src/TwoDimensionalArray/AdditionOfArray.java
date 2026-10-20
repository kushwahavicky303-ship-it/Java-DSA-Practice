package TwoDimensionalArray;

import java.util.Scanner;

public class AdditionOfArray {
    public static void main(String args[]){
        System.out.println("Addition of two D arrays:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row:");
        int r = sc.nextInt();
        System.out.println("Enter size of columns:");
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] sum = new int[r][c];
//        if(r!=c){
//            System.out.println("Wrong input-Addition not possible");
//        }

        System.out.println("Enter elements of first array:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second array:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                b[i][j] = sc.nextInt();
            }
        }
        // Add corresponding elements
        for(int i=0; i<r; i++){//row number
            for(int j=0; j<c; j++){//column number
                sum[i][j] = a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum of two D array:");
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
