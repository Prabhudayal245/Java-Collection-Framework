import java.util.HashMap;

public class Valid_Anagram {
    public static boolean anagram(String s,String t){
        HashMap<Character,Integer> map=new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }

        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)==1){
                    map.remove(ch);
                }
                else{
                    map.put(ch, map.get(ch)-1);
                }
            }
            else{
                return false;
            }
        }

        if(map.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s="earth";
        String t="heart";

        boolean result= anagram(s, t);

        if(result==true){
            System.out.println("The string is a anagram");
        }
        else{
            System.out.println("Not anagram");
        }

    }
}
