package InsertionSort;

public class insertionascending {
    public static void main(String args[]){
        int[] arr = {8,3,6,5,4,2};
        int n = arr.length;
        for(int i=1; i<n; i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                //swap arr[j],arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(int num:arr){
            System.out.print(num+ " ");
        }
    }
}
