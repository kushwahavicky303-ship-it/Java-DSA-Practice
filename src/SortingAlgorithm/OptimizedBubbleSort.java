package SortingAlgorithm;

public class OptimizedBubbleSort {
    public static void main(String args[]){
        System.out.println("Optimized Bubble Sort");
        int[] arr = {1, 2, 3, 4, 5};
        int n= arr.length;
        for(int i=0; i<n-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            //if (!swapped) break;=agar koi swap nahi hua, toh sorting stop.
            if(!swapped){
                break;
            }
        }
        for(int num:arr){
            System.out.print(num+ " ");
        }
    }
}
//swapped = false — har pass ki starting mein.
//swapped = true — jab bhi swapping hoti hai.
//Best case: O(n)
//Average/Worst case: O(n^2)
//Space complexity: O(1)