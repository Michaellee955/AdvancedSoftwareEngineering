package problems100;
import java.util.*;

public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {

        Integer[] what = Arrays.stream(nums).boxed().toArray( Integer[]::new );
        Set<Integer> mySet = new HashSet<Integer>(Arrays.asList(what));

        int c = 0;
        for (int num: mySet){
            nums[c++] = num;
        }

        List<List<Integer>> res = new LinkedList<>();

        for (int i=0; i<nums.length-2;i++){
            for (int j=i+1; j<nums.length-1; j++){
                for (int w=j+1; w<nums.length; w++){
                    if (nums[i]+nums[j]+nums[w]==0){
                        res.add(Arrays.asList(nums[i], nums[j], nums[w]));
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
