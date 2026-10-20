package Arrays;

public class Array2 {
    public static void main(String args[]){
        int[] arr = {10,20,30,40,50};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[4]);
        //update elememts or mutability
        arr[0] =15;
        arr[1] =21;
        arr[4] =55;
        System.out.println("Updated elements:");
        System.out.println( arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[4]);
        System.out.println(arr.length);
    }
}
