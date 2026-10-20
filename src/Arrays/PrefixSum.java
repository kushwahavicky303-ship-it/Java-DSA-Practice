package Arrays;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String args[]){
        System.out.println("Solving prefix Sum arrays:");
        int[] arr ={3, 2, 5, 1, 4};
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] =arr[0];
        for(int i=1; i<arr.length; i++){
            pref[i] = pref[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(pref));
    }
}
