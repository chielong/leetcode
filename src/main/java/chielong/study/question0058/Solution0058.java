package chielong.study.question0058;

/**
 * 最后一个单词的长度
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 *
 * Created by chielong on 2019-04-19.
 */
public class Solution0058 {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }

        String[] spiltStrs = s.split(" ");
        if(spiltStrs == null || spiltStrs.length == 0) {
            return 0;
        }
        String lastStr = spiltStrs[spiltStrs.length - 1];
        if(lastStr == null || lastStr.length() == 0) {
            return 0;
        }

        return lastStr.length();
    }
}
