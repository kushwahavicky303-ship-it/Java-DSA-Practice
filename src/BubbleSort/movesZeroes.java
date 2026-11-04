package BubbleSort;

public class movesZeroes {
    public static void main(String args[]){
        System.out.println("moves all zeroes at the end:");
        int[] arr = {0,5,0,3,42};
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    //swap arr[j],arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        for(int num:arr){
            System.out.print(num+ " ");
        }
    }
}
//time complexity = O(n^2)
//space complexity = O(1)
