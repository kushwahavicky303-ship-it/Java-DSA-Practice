package Arrays;

import java.util.Arrays;

public class SortGiven {
    public static void main(String args[]){
        System.out.println("Sort an array of 0s and 1s");
        int[] arr = {1, 0, 1, 1, 0, 0, 1, 0};
        int left =0;
        int right =arr.length-1;
        while(left<right){
            if(arr[left]==0){
                left++;
            } else if (arr[right] ==1) {
                right--;
            }
            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("Sorted array is: " + Arrays.toString(arr));
    }
}
