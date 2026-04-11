// it is ordered
// it has low performance then hashset
import java.util.HashSet;
import java.util.LinkedHashSet;

public class implementation_linkedHashSet{
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("mumbai");
        set.add("delhi");
        set.add("banglore");
        set.add("noida");
        set.add("pune");
        set.add("kanpur");
        System.out.println("Unordered:"+set);

        LinkedHashSet<String> lhs=new LinkedHashSet<>();

        lhs.add("mumbai");
        lhs.add("delhi");
        lhs.add("banglore");
        lhs.add("noida");
        lhs.add("pune");
        lhs.add("kanpur");
        System.out.println("Ordered"+lhs);
    }
}