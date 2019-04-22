package chielong.study.question0026;

/**
 * 删除排序数组中的重复项
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * [1,1,2] => len: 2  [1,2]
 *
 * Created by chielong on 2019-04-18.
 */
public class Solution0026 {
    public int removeDuplicates(int[] nums) {
        int count = 0;

        for(int i = 1 ; i < nums.length ; i++) {
            if(nums[i] == nums[count]) {
                continue;
            }
            count++;
            nums[count] = nums[i];
        }

        return count + 1;
    }
}
