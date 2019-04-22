package chielong.study.question0013;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字转整数
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * III          3
 * IV           4
 * IX           9
 * LVIII        58
 * MCMXCIV      1994
 *
 * 实现1-3999
 *
 * Created by chielong on 2019-04-18.
 */
public class Solution0013 {
    public int romanToInt(String s) {
        Map<Character , Integer> map = new HashMap<Character, Integer>();
        map.put('M' , 1000);
        map.put('D' , 500);
        map.put('C' , 100);
        map.put('L' , 50);
        map.put('X' , 10);
        map.put('V' , 5);
        map.put('I' , 1);

        char[] chars = s.toCharArray();
        int value = 0;
        for(int i = 0 ; i < chars.length ; i++) {
            value += map.get(chars[i]);
        }

        if(value > 3999) {

        }


        return 0;
    }
}