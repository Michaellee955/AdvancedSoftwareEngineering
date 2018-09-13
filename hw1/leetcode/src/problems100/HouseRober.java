package problems100;

public class HouseRober {

    public static void main(String[] args){
        int[] nums = new int[] {100,1,1,200};
        System.out.println(application(nums));
    }

    private static int application(int[] nums){
        if (nums.length==0){
            return 0;
        }

        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i=1;i<nums.length;i++){
            dp[i+1] = Math.max(dp[i-1]+nums[i],dp[i]);
        }
        return dp[nums.length];
    }
}
