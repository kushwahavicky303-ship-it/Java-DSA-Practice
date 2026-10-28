package Recursion;

public class maxArray {
    public static void main(String args[]){
        System.out.println("mAx elements in recursive arrays:");
        int[] arr ={10,20,30,40,50,60,70,80,90,100};
        System.out.println(maxArray(arr,0));

    }
    static int maxArray(int[] arr, int idx){
        if(idx ==arr.length-1){
            return arr[idx];
        }
        int smallerAns = maxArray(arr,idx+1);
        return Math.max(arr[idx],smallerAns);
    }
}
