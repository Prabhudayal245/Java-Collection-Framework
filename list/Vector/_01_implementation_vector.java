import java.util.Arrays;
import java.util.Vector;
public class _01_implementation_vector{
    public static void main(String[] args) {
        // intitalize the vector
        Vector<Integer> vector1=new Vector<>();  // it's initial capacity is by default 10

        System.out.println("Initial capacity of vector By deafult:"+vector1.capacity());
        
        // if we want to increase the intial capacity
        Vector<Integer> vector2=new Vector<>(15);  // now it's inital capacity is 15

        System.out.println("Initial capacity of vector:"+vector2.capacity());

        // if the capacity is full then it is expand it's capacity by 2x
        
        for(int i=1;i<=vector1.capacity();i++){
            vector1.add(i);
        }

        System.out.println(vector1);
        System.out.println(vector1.capacity());  // it's capacity is 10

        vector1.add(11);  // now il's capacity increases 20
        System.out.println(vector1.capacity());

        // another method to initialize the Vector
        Vector<String> vec1=new Vector<>(Arrays.asList("mango","apple","banana","grapes"));

        System.out.println(vec1);
    }
}