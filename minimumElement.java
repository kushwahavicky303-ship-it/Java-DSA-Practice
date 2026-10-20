package Arrays;

public class minimumElement {
    public static void main(String args[]){
        System.out.println("finding the minimum elements: ");
        int[] arr = {12, 5, 8, 2, 19,-3, 7};
        int Min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<Min){
                Min = arr[i];
            }
        }
        System.out.println(Min);
    }
}
