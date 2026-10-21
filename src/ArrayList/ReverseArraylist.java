package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraylist{
    public static void main(String args[]){
        System.out.println("reverse an arraylist :");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Before reverse: " +list);
        Collections.reverse(list);
        System.out.println("After reverse: " +list);
    }
}
