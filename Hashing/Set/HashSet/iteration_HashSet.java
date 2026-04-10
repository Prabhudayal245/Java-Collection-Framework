import java.util.HashSet;
import java.util.Iterator;

public class iteration_HashSet {
    public static void main(String[] args) {
        HashSet<String> city=new HashSet<>();

        city.add("Mumbai");
        city.add("delhi");
        city.add("pune");
        city.add("kanpur");
        city.add("banglore");
        city.add("kolkata");
        city.add("lukhnow");

        System.out.println(city);

        // by using iterator
        System.out.println("Iteration on set By using Iterator interface:");
        Iterator it=city.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());            
        }
        System.out.println("");
        System.out.println("Iteration on set By using Foreach:");
        for(String i:city){
            System.out.println(i);
        }
    }
}
