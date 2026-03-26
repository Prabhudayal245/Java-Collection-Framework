import java.util.ArrayList;
public class _02_Basic_operation{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        // adding the element in the list
        list.add(1);  //0 (index)
        list.add(20);  //1
        list.add(12);  //2
        list.add(56);  //3

        // prints the list
        System.out.println("the arraylist is:"+list);

        //retriveing the element from the list
        System.out.println(list.get(2));  // returns the value at index 2

        // size of the list
        System.out.println(list.size());

        // iterate into the list method 01:
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        // iteration for each loop method 02:
        for(int x:list){
            System.out.println(x);
        }

        System.out.println(list.contains(3));  // return true 
        System.out.println(list.contains(20));  // return false

        System.out.println("Element remove from index 2");
        list.remove(2);  // it remove the element from index 2 
        list.remove(Integer.valueOf(1));   // it remove the given element 

        for(int x:list){
            System.out.println(x);
        }


    }
}
