package chielong.study.question0035;

/**
 * 搜索插入位置
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 *
 * Created by chielong on 2019-04-19.
 */
public class Solution0035 {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0) {
            return 0;
        }

        for(int i = 0 ; i < nums.length; i++) {
            if(nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
