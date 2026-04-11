import java.util.HashSet;

public class union_intersection{
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};

        HashSet<Integer> set=new HashSet<>();

        // Union:

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        System.out.println("Union elements of the both the arrays is:"+set);
        System.out.println("The count of union element of both arrays is:"+set.size());

        // Intersection:

        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> set3=new HashSet<>();


        for(int i=0;i<arr1.length;i++){
            set2.add(arr1[i]);
        }

        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(set2.contains(arr2[i])){
                count++;
                set2.remove(arr2[i]);
                set3.add(arr2[i]);
            }
        }

        System.out.println("The Intersection elements of both arrays is:"+set3);
        System.out.println("the count of intersection elements is:"+count);
    }
}