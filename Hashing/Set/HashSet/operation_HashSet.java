import java.util.HashSet;

public class operation_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        // add()
        set.add(3);
        set.add(5);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(9);
        set.add(5);

        System.out.println(set);

        // contains()
        if(set.contains(2)){
            System.out.println(true);
        }

        // remove()
        System.out.println(set);
        set.remove(3);
        System.out.println(set);

        // size()
        System.out.println(set.size());

        // isempty()
        System.out.println(set.isEmpty());

        // claer()
        set.clear();
        System.out.println(set);
    }
}
