package problems100;

public class HouseRoberII {

    public static void main(String[] args){
        //int[] nums = new int[] {1,2,3,1};
        //System.out.println(application(nums));
        System.out.println(true&&true&&true);
    }

    private static int application(int[] nums){
        if (nums.length==0){
            return 0;
        }

        return Math.max(rob(nums, 0, nums.length-2),rob(nums, 1, nums.length-1));
    }

    private static int rob(int[] nums, int lo, int hi){
        if (lo==hi) return nums[lo];
        if (hi-lo==1) return Math.max(nums[hi],nums[lo]);

        int[] dp = new int[hi-lo+2];
        dp[0] = 0;
        dp[1] = nums[lo];

        for (int i=lo+1;i<=hi;i++){
            dp[i+1-lo] = Math.max(dp[i-1-lo]+nums[i],dp[i-lo]);
        }

        return dp[hi-lo+1];
    }
}
