package ArrayList;
import java.util.ArrayList;

public class ReverseArraList2 {
    public static void main(String args[]){
        System.out.println("reverse an arraylist using loops:");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Before reverse: " +list);
        int i = 0;
        int j = list.size() -1;
        while(i<j){
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j,temp);
            j--;
            i++;
        }
        System.out.println(list);

    }
}
