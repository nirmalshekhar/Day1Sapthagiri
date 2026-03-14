package Day11;

import java.util.Stack;

public class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution20 sol = new Solution20();
        System.out.println(sol.isValid("()"));
        System.out.println(sol.isValid("({[]})"));
        System.out.println(sol.isValid("(]"));
        System.out.println(sol.isValid("([)]"));
        System.out.println(sol.isValid("{[]}"));
    }
}

