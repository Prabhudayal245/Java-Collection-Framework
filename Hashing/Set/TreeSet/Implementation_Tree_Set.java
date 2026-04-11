// it store the value in sorted form
// it cannot contain the NULL values unlike the hashset and linkedhashset
import java.util.HashSet;
import java.util.TreeSet;

public class Implementation_Tree_Set{
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();

        set.add("mumbai");
        set.add("noida");
        set.add("pune");
        set.add("delhi");
        set.add("kanpur");
        set.add("varansi");
        System.out.println("unsorted:"+set);

        TreeSet<String> ts=new TreeSet<>();
        ts.add("mumbai");
        ts.add("noida");
        ts.add("pune");
        ts.add("delhi");
        ts.add("kanpur");
        ts.add("varansi");
        System.out.println("sorted:"+ts);
    }
}