// Majority Elements:Given an integer array of size n,find all the elements that appear  more than n/3 times.
import java.util.HashMap;
import java.util.Set;
public class majority_element {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> mp=new HashMap<>();
        int limit=arr.length/3;

        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(mp.containsKey(num)){
                mp.put(num,mp.get(num)+1 );
            }
            else{
                mp.put(num,1);
            }
        }

        Set<Integer> keys=mp.keySet(); 
        for(Integer i:keys){
            if(mp.get(i)>limit){
                System.out.println(i);
            }
        }

    }
}
