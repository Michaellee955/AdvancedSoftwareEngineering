package problems100;

import java.util.HashMap;
import java.util.HashSet;

public class FirstUniqueChar {

    private static int app(String s){
        HashMap<Character,Integer> res = new HashMap<>();
        for (char c:s.toCharArray()){
            if (res.get(c)==null){
                res.put(c,1);
            }else{
                res.replace(c,res.get(c)+1);
            }
        }

        for (int i=0;i<s.length();i++){
            if (res.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}
