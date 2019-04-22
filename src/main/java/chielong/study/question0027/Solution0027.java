package chielong.study.question0027;

/**
 * 移除元素
 *
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素
 *
 * nums = [3,2,2,3], val = 3            => nums = [2,2] , len = 2
 * nums = [0,1,2,2,3,0,4,2], val = 2    => nums = [0, 1, 3, 0, 4] , len = 5
 *
 * Created by chielong on 2019-04-19.
 */
public class Solution0027 {
    public int removeElement(int[] nums, int val) {
        int head = 0;
        int tail = nums.length - 1;

        if(nums.length == 0) {
            return 0;
        }

        while (head < tail) {
            while(head < tail && nums[head] != val) {
                head++;
            }
            while(head < tail && nums[tail] == val) {
                tail--;
            }
            nums[head] = nums[tail];
            tail--;
        }

        return nums[head] == val ? head : head + 1;
    }
}
