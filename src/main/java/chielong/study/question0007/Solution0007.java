package chielong.study.question0007;

/**
 * 整数反转
 * 123 => 321
 * -123 => -321
 * 120 => 21
 * ===================================
 * Created by chielong on 2019-04-17.
 */
public class Solution0007 {
    public int reverse(int x) {
        if(x == 0) {
            return 0;
        }

        boolean isNegative = (x < 0) ;

        StringBuffer sb = new StringBuffer(isNegative ? Integer.toString(x).substring(1) : Integer.toString(x));
        sb.reverse();
        Long value = Long.valueOf(new String(sb));
        if(value > Integer.MAX_VALUE || value < Integer.MIN_VALUE) {
            return 0;
        }

        return (int)(isNegative ? -value : value);
    }
}
