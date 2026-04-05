import java.util.HashMap;

public class Hashmap_operation{
    public static void main(String[] args) {
        // creation
        HashMap<String,Integer> hm=new HashMap<>();

        // insert  -O(1)
        hm.put("india",150);
        hm.put("China",130);
        hm.put("US",45);
        hm.put("Australia",80);

        System.out.println(hm);

        //get() -O(1)

        int population=hm.get("india");    // return the value 
        System.out.println(population);     

        // if we try to print the value of key which not present in the hashmap then it return null
        System.out.println(hm.get("nepal"));    // return null

        // containsKey() -O(1)
        System.out.println(hm.containsKey("US"));   // return true
        System.out.println(hm.containsKey("bhutan"));  // return false

        //  remove() -O(1)
        // it remove the keys with value from hashmap and return the value after removed
        System.out.println(hm.remove("US"));   // return the value of US :45
        System.out.println(hm);


        // size() :it gives the size of hashmap
        System.out.println("The size of hashmap is:"+hm.size());

        // isempty():It check our hashmap is empty or not
        System.out.println(hm.isEmpty());   // return false


        // clear():It is use to clear our hashmap
        hm.clear();
        System.out.println(hm);     // now our hasmap is empty
    }
}