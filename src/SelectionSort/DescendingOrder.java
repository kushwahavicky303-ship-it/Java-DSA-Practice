package SelectionSort;

public class DescendingOrder {
    public static void main(String args[]){
        System.out.println("Descending order using selection order:");
        int[] arr = {29, 10, 14, 37, 13};
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            int min_index = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]>arr[min_index]){
                    min_index =j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] =temp;
        }
        for(int num:arr){
            System.out.print(num+ " ");
        }
    }
}
