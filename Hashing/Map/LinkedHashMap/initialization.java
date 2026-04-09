// it is ordered and the time complexity of all function is same as hashmap.
// it is used doubly linked list 
// it is used when we want to print the our key value pairs in order 
import java.util.LinkedHashMap;

public class initialization{
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();

        lhm.put("india", 155);
        lhm.put("China",125);
        lhm.put("Nepal",65);
        lhm.put("Russia",89);

        System.out.println(lhm);


    }
}