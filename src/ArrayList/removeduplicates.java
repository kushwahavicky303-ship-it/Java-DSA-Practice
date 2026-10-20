package ArrayList;

import java.util.ArrayList;

public class removeduplicates {
    public static void main(String args[]){
        System.out.println("Removing duplicates elements in this arraylist");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : list) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        System.out.println(result);


    }
}
