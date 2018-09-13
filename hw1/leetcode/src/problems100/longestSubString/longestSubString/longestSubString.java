package problems100.longestSubString.longestSubString;

import java.util.HashSet;

public class longestSubString {

    public static int application(String s){
        HashSet<Character> hs = new HashSet<>();

        int res = 0;
        for (int i=0,j=0;i<s.length();i++){
            while (hs.contains(s.charAt(i))){
                hs.remove(s.charAt(j++));
            }
            hs.add(s.charAt(i));
            res = Math.max(res,hs.size());
        }
        return res;
    }
}
