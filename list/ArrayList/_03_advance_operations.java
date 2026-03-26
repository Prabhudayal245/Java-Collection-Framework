import java.util.ArrayList;
import java.util.Collections;
public class _03_advance_operations {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(222);
        list.add(45);
        list.add(300);
        list.add(51);

        // add element in between the list
        list.add(3,54) ;   // at index 3 the element 54 is inserted

        //if we want to replace the element
        list.set(2,67); // it replace the element at index 2 .now 34 relpace with 57

        // sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
 