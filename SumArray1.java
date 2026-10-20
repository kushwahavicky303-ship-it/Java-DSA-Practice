package Arrays;

public class SumArray1 {
    public static void main(String args[]){
        System.out.println("welcome to the sum of array:");
        int[] arr= {1,4,5,6,1};
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];

        }
        System.out.println("sum of array: " +sum);
    }
}
