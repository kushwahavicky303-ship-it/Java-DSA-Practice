package Recursion;
import java.util.Scanner;

public class CountDigits {
    public static void main(String args[]){
        System.out.println("counting digits using recursion: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits: ");
        int N = sc.nextInt();
        System.out.println(countDigits(N));
    }
    static int countDigits(int N){
        if(N == 0){
            return 0;
        }
//        int smallerAns = countDigits(N/10);
//        int ans = smallerAns+1;
//        return ans;
        return countDigits(N/10)+1;
    }
}
