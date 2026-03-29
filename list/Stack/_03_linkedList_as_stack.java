// linkedlist can be used as a stack but only in single threaded system
import java.util.LinkedList;

public class _03_linkedList_as_stack {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(3);  //push
        list.addLast(6);  //push
        list.addLast(2);  //push
        list.addLast(0);   //push

        list.removeLast();  //pop

        list.getLast(); //peek
    }
}
