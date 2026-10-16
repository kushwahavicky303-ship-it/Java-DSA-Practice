package Arrays;

public class EvenOddCount {
    public static void main(String args[]){
        System.out.println("count even and odd elements in Array:");
        int[] arr = {12, 5, 8, 3, 19, 6, 7, 10};
        int even =0;
        int odd =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even: " +even);
        System.out.println("Odd: " +odd);

    }
}
