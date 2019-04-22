package chielong.study.question0020;

import java.util.Stack;

/**
 * 有效的括号
 * ()       => true
 * ()[]{}   => true
 * (]       => flase
 * ([)]     => false
 *
 * Created by chielong on 2019-04-18.
 */
public class Solution0020 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();

        for(int i = 0 ; i < chars.length ; i++) {
            if(chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                stack.push(chars[i]);
                continue;
            }

            if(stack.isEmpty()) {
                return false;
            }

            char c = stack.pop();
            if(c == '(' && chars[i] == ')') {
                continue;
            } else if (c == '[' && chars[i] == ']') {
                continue;
            } else if (c == '{' && chars[i] == '}') {
                continue;
            } else {
                return false;
            }
        }

        return stack.empty() ? true : false;
    }
}
