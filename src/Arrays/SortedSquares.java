package Arrays;

import java.util.Arrays;

public class SortedSquares {
    public static void main(String args[]){
        System.out.println("Squares of a Sorted Array:");
        int[] arr = {-4, -1, 0, 3, 10};
        int n =arr.length;
        int left =0;
        int right = n-1;
        int index = n-1;
        int[] result = new int[n];
        while(left<=right){
            int leftSquare =arr[left]*arr[left];
            int rightSquare =arr[right]*arr[right];
            if(leftSquare>rightSquare){
                result[index] = leftSquare;
                left++;
            }
            else{
                result[index] = rightSquare;
                right--;
            }
            index--;
        }
        System.out.println("Sorted Square:" + Arrays.toString(result));

    }
}
