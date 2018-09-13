package problems100;

import java.util.HashMap;
import java.util.HashSet;

public class anagrams {

    public static void main(String[] args){
        int[] a = new int[] {12, 28, 46, 32, 50};
        int[] b = new int[] {50, 12, 32, 46, 28};
        int[] res = application2(a,b);
        for (int num: res){
            System.out.println(num);
        }
    }

    private static int[] application(int[] a, int[] b){
        HashSet<Integer> keyJ = new HashSet();
        int L = a.length;
        int[] res = new int[L];
        for (int i=0;i<L;i++){
            for (int j=0;j<L;j++){
                if (a[i]==b[j] && !keyJ.contains(j)){
                    res[i] = j;
                    keyJ.add(j);
                }
            }
        }
        return res;
    }

    private static int[] application2(int[] a, int[] b){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<b.length;i++){
            map.put(b[i],i);
        }

        int[] mappings = new int[a.length];
        for (int i=0;i<a.length;i++){
            mappings[i] = map.get(a[i]);
        }
        return mappings;
    }

}
