package TwoDimensionalArray;

import java.util.Scanner;

public class UserInput {
    public static void main(String args[]){
        System.out.println("taking input in 2d arrays");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Row:");
        int r = sc.nextInt();
        System.out.println("Enter the number of colum:");
        int c = sc.nextInt();
        int [][] arr = new int[r][c];//total =r*c
        System.out.println("Enter the elements:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your 2D array is:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
