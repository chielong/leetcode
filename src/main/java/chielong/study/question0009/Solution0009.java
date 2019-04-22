package chielong.study.question0009;

/**
 * 回文数
 * 121
 * true
 *
 * 坑：StringBuffer的equals()方法
 * ===================================
 * Created by chielong on 2019-04-17.
 *
 * best:
 *
 * 1221:
 * 122  1
 * 12   12 => true;
 *
 * 121:
 * 12   1 => 12/10 : 1 => ture
 */
public class Solution0009 {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        if(x == 0) {
            return true;
        }

        StringBuffer oldStr = new StringBuffer(String.valueOf(x));
        String oldString = new String(oldStr);

        return oldString.equals(new String(oldStr.reverse()));
    }
}
