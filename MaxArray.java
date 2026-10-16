package Arrays;

public class MaxArray {
    static void main() {
        System.out.println("welcome to the max array:");
        int[] arr = {10,23,43,5,6,3,55,33};
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        System.out.println("Max: " +ans);
    }
}
