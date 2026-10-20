
package TwoDimensionalArray;

import java.util.Scanner;

public class SpiralOrder {
    public static void main(String args[]) {
        System.out.println("Spiral matrix order:");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row and column size:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter the elements of matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int toprow = 0;
        int bottomrow = r - 1;
        int leftcol = 0;
        int rightcol = c - 1;

        System.out.println("Spiral Order:");

        while (toprow <= bottomrow && leftcol <= rightcol) {

            // Top row: left to right
            for (int j = leftcol; j <= rightcol; j++) {
                System.out.print(arr[toprow][j] + " ");
            }
            toprow++;

            // Right column: top to bottom
            for (int i = toprow; i <= bottomrow; i++) {
                System.out.print(arr[i][rightcol] + " ");
            }
            rightcol--;

            // Bottom row: right to left
            if (toprow <= bottomrow) {
                for (int j = rightcol; j >= leftcol; j--) {
                    System.out.print(arr[bottomrow][j] + " ");
                }
                bottomrow--;
            }

            // Left column: bottom to top
            if (leftcol <= rightcol) {
                for (int i = bottomrow; i >= toprow; i--) {
                    System.out.print(arr[i][leftcol] + " ");
                }
                leftcol++;
            }
        }

        sc.close();
    }
}
