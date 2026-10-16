package Arrays;

import java.util.Scanner;

public class TripletsSum {
    public static void main(String args[]){
        System.out.println("welcome to the count no. of triplets sum =target:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an arrays:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Target is= ");
        int target = sc.nextInt();
        int ans=0;
        for (int i=0; i<arr.length; i++){//first number finding
            for (int j= i+1; j<arr.length; j++){//second umber finding
                for (int k= j+1; k<arr.length; k++){//third number finding
                    if (arr[i]+arr[j]+arr[k] == target){
                        System.out.println(arr[i] + " + " + arr[j] + " + " + arr[k]);
                        //Triplets bhi print karne hain: if ke andar sout likho.
                        ans++;
                    }
                }
            }
        }
        System.out.println("Number of triplets: " +ans);
        sc.close();
    }
}
