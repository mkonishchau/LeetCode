package common.easy;

import java.util.ArrayDeque;

public class ValidParentheses {
    static void main() {
        ValidParentheses solution = new ValidParentheses();
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("([)]"));
        System.out.println(solution.isValid("()"));
    }

    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        String opened = "([{";
        String closed = ")]}";
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (opened.indexOf(current) > -1) {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (closed.indexOf(current) != opened.indexOf(top)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
