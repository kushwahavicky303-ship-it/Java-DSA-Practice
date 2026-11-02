package SelectionSort;

public class AscendingOrder {
    public static void main(String args[]){
        System.out.println("ascending order by selection sort");
        int[] arr = {7,4,5,1,2};
        int n = arr.length;
        for(int i=0; i<n-1; i++){//I represent the current index
            //find minimum element in unsorted part of array
            int min_index = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]< arr[min_index]) {
                    min_index = j;
                }
            }
            //swap current element and minimum element
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
//min_index represents the index of the smallest element.
//arr[min_index] represents the value stored at that index.
