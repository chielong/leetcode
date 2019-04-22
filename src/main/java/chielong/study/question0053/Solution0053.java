package chielong.study.question0053;

/**
 * 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * [-2,1,-3,4,-1,2,1,-5,4] => 6
 *
 * Created by chielong on 2019-04-19.
 */
public class Solution0053 {
    public int maxSubArray(int[] nums) {
        if(nums.length < 0) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int tmp = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            tmp += nums[i];
            if(max < tmp) {
                max = tmp;
            }
            if(tmp < 0) {
                tmp = 0;
            }
        }

        return max;
    }
}
