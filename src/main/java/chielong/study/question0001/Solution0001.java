package chielong.study.question0001;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * nums = [3, 3] , target = 6
 * [0, 1]
 *
 * ===================================
 * Created by chielong on 2019-04-17.
 *
 * best:
 * 一遍map。边走边放+找
 */
public class Solution0001 {
    public int[] twoSum(int[] nums, int target) {
        //   值         下标
        Map<Integer , Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < nums.length ; i++) {
            map.put(nums[i] , i);
        }

        // 这个遍历保证重复值的有序性
        for(int i = 0 ; i < nums.length ; i++) {
            int sub = target - nums[i];

            if(map.containsKey(sub)) {
                int index = map.get(sub);
                // 当出现[3, 3]的情况，map中是(3:0)被(3:1)覆盖。所以判断index和i值不相等则为不同的"3"值。
                if(index == i) {
                    // 如果是相同的"3"，下一个。
                    continue;
                }

                int[] result = new int[2];
                result[0] = i;
                result[1] = index;
                return result;
            }
        }

        return null;
    }
}
