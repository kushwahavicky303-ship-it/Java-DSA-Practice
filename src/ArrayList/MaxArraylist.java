package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MaxArraylist {
    public static void main(String args[]){
        System.out.println("Max element in arraylist:");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(25);
        list.add(7);
        list.add(42);
        list.add(18);
//        System.out.println(Collections.max(list));
        //we can find using this direct
        int max = list.get(0);
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        System.out.println("Max: " +max);
    }
}
