package InsertionSort;

public class InsertionShifting {
    public static void main(String args[]){
        System.out.println("Insertion sorting using shifting method:");
        int[] arr = {8,3,6,5,4,2};
        int n = arr.length;
        for(int i=1; i<n; i++){//i = 1 First element is already considered sorted.
            int key = arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int num:arr){
            System.out.print(num+ " ");
        }

    }
}
//Why i = 1? First element is already considered sorted.
//Why key? Stores the current element.
//Why j = i - 1? Starts checking from the previous element.
//Why j >= 0? Prevents going outside the array.
//Why arr[j] > key? Checks whether the previous element is greater than the key.
//Why arr[j+1] = arr[j]? Shifts the greater element one position right.
//Why j--? Moves left to check the next element.
//Why arr[j+1] = key? Places the key in its correct position.