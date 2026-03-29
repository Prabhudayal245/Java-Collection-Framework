import java.util.Vector;

public class _02_operations_vector {
    public static void main(String[] args) {
        Vector<Integer> vec1=new Vector<>();

        // add()
        vec1.add(2);
        vec1.add(5);
        vec1.add(8);
        vec1.add(3);
        vec1.add(7);
        System.out.println(vec1);

        // add(index,element)
        vec1.add(3,6);
        System.out.println(vec1);

        // get()
        System.out.println(vec1.get(4));
        System.out.println(vec1.getFirst());

        // set()
        System.out.println(vec1.set(2,3));
        System.out.println(vec1);

        // remove()
        vec1.remove(4);
        System.out.println(vec1);

        // size()
        System.out.println(vec1.size());

        // isempty()
        System.out.println(vec1.isEmpty());

        // contains()
        System.out.println(vec1.contains(7));  // return true
        System.out.println(vec1.contains(4));    // return false

        // clear()
        vec1.clear();

        System.out.println(vec1);

    }
}
