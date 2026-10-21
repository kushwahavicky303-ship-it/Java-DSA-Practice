package ArrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class SecondLagest {
    public static void main(String args[]){
        System.out.println("Second largest distinct elements:");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(20);
        list.add(40);
        list.add(30);
        list.add(10);
        System.out.println("Original list: " +list);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        ArrayList<Integer> result = new ArrayList<>(set);
        System.out.println("Finsl result: " +result.get(1));
    }
}
