// it is sorted in keys 
// it's time complexity is O(logn)
// it is used Red Black Tree Data structure
import java.util.TreeMap;

public class initialization{
    public static void main(String[] args) {
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("pune", 100);
        tm.put("mumbai", 150);
        tm.put("delhi", 110);
        tm.put("noida", 68);
        tm.put("lukhnow", 93);

        System.out.println(tm);
    }
}