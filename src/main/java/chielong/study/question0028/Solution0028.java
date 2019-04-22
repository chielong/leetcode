package chielong.study.question0028;

/**
 * 实现 strStr() 函数。
 * 给定一个 haystack 字符串和一个 needle 字符串
 * 在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * hello ll  => 2
 *
 * Created by chielong on 2019-04-18.
 */
public class Solution0028 {
    public int strStr(String haystack, String needle) {
        if(needle == "") {
            return 0;
        }

        return haystack.indexOf(needle);
    }
}
