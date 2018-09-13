package problems100;

import ds.hashtable.HashTable;

public class longestIncreaseSubsequence {

    public static void main(String[] args) {
        int[] test = new int[] {4, 7, 8, 9, 5, 2};
        System.out.println(lengthOfLIS(test));
    }

    public static int lengthOfLIS(int[] nums) {
        if (nums.length==0) return 0;
        int[] lis = new int[nums.length];
        int j=0;
        int max = 0;
        for (int i=0;i<nums.length;i++) {
            lis[i] = 1;
            while (j!=i){
                if (nums[j]<nums[i]){
                    lis[i] = Math.max(lis[i],lis[j++]+1);
                }else{
                    j ++;
                }
            }
            if (lis[i]>max){
                max = lis[i];
            }
        }
        return max;
    }
}
