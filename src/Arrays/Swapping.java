package Arrays;

public class Swapping {
    public static void main(String args[]){
        System.out.println("swapping in arrays:");
        int[] arr= {10,20,30,40,50,60};
        int a=9;
        int b=3;
        System.out.println("Original values Before swapping:");
        System.out.println("a: " +a);
        System.out.println("b: " +b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values After Swapping");
        System.out.println("a: " +a);
        System.out.println("b: " +b);
    }
}
