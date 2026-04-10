// count distinct (unique) elements
import java.util.HashSet;

public class count_distinct_element {
    public static void main(String[] args) {
        int arr[]={4,3,2,5,6,7,3,4,2,1};

        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){    // O(n)
            set.add(arr[i]);
        }

        System.out.println("The number of Distinct elements in given array is:"+set.size());
    }
}
