package TwoDimensionalArray;

public class Traversal {
    public static void main(String agrs[]){
        System.out.println("Traversal of 2d arrays:");
        int[][] arr = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");//mooves to the next column
            }
            System.out.println();//mooves to the next row
        }
    }
}
