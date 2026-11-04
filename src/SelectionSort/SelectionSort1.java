package SelectionSort;

public class SelectionSort1 {
    public static void main(String args[]){
        System.out.println("Selection sort is in ascending order:");
        int[] arr = {64, 25, 12, 22, 11};
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            int min_index =i;

            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            //swap arr[j] ,arr[min_index]
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        for(int num:arr){
            System.out.print(num+ " ");
        }
    }
}
