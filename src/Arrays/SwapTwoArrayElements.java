package Arrays;

public class SwapTwoArrayElements {
    public static void main(String args[]){
        System.out.println("Swapping two Array elements: ");
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Before Swapping array elements: ");
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        int temp =arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
        System.out.println("After Swapping:");
        System.out.println(arr[0]);
        System.out.println(arr[4]);
    }
}
