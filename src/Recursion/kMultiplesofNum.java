package Recursion;

public class kMultiplesofNum {
    public static void main(String args[]) {
        System.out.println("K multiples of Num:");
        int N = 5;
        int K = 4;
//        System.out.println(printMultiples(N, K));
        printMultiples(N,K);
    }


    static void printMultiples(int N, int K) {
        if (K == 0) {
            return ;
        }
        printMultiples(N, K - 1);
        System.out.println(N * K);
    }
}

