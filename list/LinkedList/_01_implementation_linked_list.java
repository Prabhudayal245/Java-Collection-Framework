import java.util.Arrays;
import java.util.LinkedList;
public class _01_implementation_linked_list{
    public static void main(String[] args) {
        // integer
    LinkedList<Integer> list=new LinkedList<>();

    // adding the element in linked list
    list.add(3);
    list.add(5);
    list.add(8);
    list.add(1);
    System.out.println(list);

    // add the element at the Start and at End of likedlist
    list.addFirst(0);  // O(1)
    list.addLast(9);  //O(1)
    System.out.println(list);

    // access the element
    System.out.println(list.get(3));  // O(N)

    // accessing the element from first and last index
    System.out.println(list.getFirst());
    System.out.println(list.getLast());

    // deleting or removing element from list
    list.remove(2);  // remove the element from index 2
    System.out.println(list); 

    // remove the element on the given condition
    list.removeIf(x->x%2!=0);
    System.out.println(list);


    LinkedList<String> animal=new LinkedList<>(Arrays.asList("cat","dog","lion","Elephant"));
    LinkedList<String> animaltoRemove=new LinkedList<>(Arrays.asList("dog","parrot","cow"));
    animal.removeAll(animaltoRemove);
    System.out.println(animal);

    

    }
}