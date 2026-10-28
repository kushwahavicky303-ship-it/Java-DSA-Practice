package SortingAlgorithm;

public class BubbleSort {
    public static void main(String args[]){
        System.out.println("Bubble sort is sorting:");
        //Create an array of 5 elements
        int[] arr = {9,5,4,3,1};
        int n = arr.length;

        for(int i=0; i<n-1; i++){//controls the number of passes
            for(int j=0; j<n-i-1; j++){//compares adjacent elements
                //condition for swapping
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];//5 stores in temp variable
                    arr[j] = arr[j+1];//
                    arr[j+1] = temp;
                }
            }
        }
        //Enhanced for loop visits each element of the sorted array
//        for(int num:arr){
//            System.out.print(num+ " ");
//        }
        //this is normal loop
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

}
