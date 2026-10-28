package Recursion;

public class SumofArray {
    public static void main(String args[]){
        System.out.println("Sum of arrays in recursion:");
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(arraySum(arr,0));

    }
    static int arraySum(int[] arr, int index){
        //Base case
        if(index == arr.length){
            return 0;
        }
        return arr[index]+arraySum(arr,index+1);
        //index+1=moves to the next element
        //index tells us which element we are processing
        //return adds the current element while recursive calls return.
    }
}
