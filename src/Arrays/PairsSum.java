package Arrays;

import java.util.Scanner;

public class  PairsSum {
    public static void main(String args[]){
        System.out.println("welcome to the sum of pairs:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements of array:");
        for (int i=0; i<arr.length; i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("Enter target sum");
        int target = sc.nextInt();

        int ans =0;
        for(int i=0; i<arr.length; i++){//i selects the first element.
            for (int j= i+1; j<arr.length; j++){//j = i + 1 selects a different element, avoiding duplicate pairs.
                if(arr[i]+arr[j]==target){
                    ans++;//ans++ counts each matching pair.
                }
            }
        }
        System.out.println("sum is" +ans);
    }
}
