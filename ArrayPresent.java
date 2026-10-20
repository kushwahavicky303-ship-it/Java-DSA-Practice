package Arrays;

public class ArrayPresent {
    public static void main(String args[]){
        System.out.println("welcome to searching a value in a array:");
        int[] arr = {1,5,3};
        int x =5;
        int ans =-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                x =arr[i];
                break;
            }
        }
        if (ans != -1) {
            System.out.println("Found " + x + " at index " + ans);
        } else {
            System.out.println("Index -1");
        }
    }
}
