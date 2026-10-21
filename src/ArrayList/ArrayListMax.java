package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMax {
    public static void main(String args[]){
        System.out.println("MAx elements in arraylist");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(8);
        list.add(32);
        list.add(4);
        list.add(21);
        System.out.println(Collections.min(list));
    }
}
