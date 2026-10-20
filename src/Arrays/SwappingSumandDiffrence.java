package Arrays;

public class SwappingSumandDiffrence {
    public static void main(String args[]){
        System.out.println("Swapping using sum and diffrence method:");
        int a =10;
        int b =20;
        System.out.println("Before Swapping:");
        System.out.println("a: " +a);
        System.out.println("b: " +b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping:");
        System.out.println("a: " +a);
        System.out.println("b: " +b);

    }
}
