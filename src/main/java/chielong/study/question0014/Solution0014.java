package chielong.study.question0014;

/**
 * 最长公共前缀。
 * ["flower","flow","flight"] => "fl"
 *
 * Created by chielong on 2019-04-18.
 */
public class Solution0014 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length <= 0) {
            return "";
        }

        int colSize = Integer.MAX_VALUE;
        for(int i = 0 ; i < strs.length ; i++) {
            if(colSize > strs[i].length()) {
                colSize = strs[i].length();
            }
        }

        int index = 0;
        for(index = 0 ; index < colSize ; index++) {
            for(int i = 1 ; i < strs.length ; i++) {
                if(strs[0].charAt(index) != strs[i].charAt(index)) {
                    return strs[0].substring(0 , index);
                }
            }
        }

        if(index == 0) {
            return "";
        } else {
            return strs[0].substring(0 , index);
        }
    }
}