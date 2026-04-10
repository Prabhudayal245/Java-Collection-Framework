import java.util.HashMap;
import java.util.Set;

public class iteration_hashmap {
    public static void main(String[] args) {
        // creation 
        HashMap<String,Integer> hm=new HashMap<>();

        // insertion
        hm.put("india",150);
        hm.put("nepal",70);
        hm.put("china",140); 
        hm.put("sri lanka",110); 
        hm.put("japan",50);
        hm.put("africa",100);   
        
        // iteration
        Set<String> keys=hm.keySet();

        // set of keys
        System.out.println(keys);

        // for 
        for (String k : keys) {
            System.out.println("Keys="+k+",Value="+hm.get(k));
        }

        // finding the max value through iteration
        int max=0;
        for(String s:keys){
            if(max<hm.get(s)){
                max=hm.get(s);
            }
        }
        System.out.println("maximum:"+max);
    }
}
