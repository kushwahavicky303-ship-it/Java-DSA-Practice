package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum1 {
    public static void main(String args[]){
        System.out.println("Presfix sum using user input:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the siez eof array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int value =arr.length;
        int[] pref = new int[value];
        pref[0] = arr[0];
        for (int i=1; i<arr.length; i++){
            pref[i] = pref[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(pref));
    }
}
