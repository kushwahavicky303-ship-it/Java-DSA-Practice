package Arrays;

public class ReverseArray {
    public static void main(String args[]){
        System.out.println("Reversing an arrays: ");
        int[] arr =  {10, 20, 30, 40, 50};
        for(int i=arr.length-1; i>=0; i--) {
            System.out.println(arr[i]);
        }
    }
}
