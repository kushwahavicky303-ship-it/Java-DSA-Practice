package ArrayList;
import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedHashSet;
public class DuplicatesArraylist {
    public static void main(String args[]){
        System.out.println("Remove duplicates elements ");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(30);
        System.out.println("Before removing duplicates: " +list);
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        System.out.println(set);
        ArrayList<Integer> result = new ArrayList<>(set);
        System.out.println("Final result: " + result);
    }
}
