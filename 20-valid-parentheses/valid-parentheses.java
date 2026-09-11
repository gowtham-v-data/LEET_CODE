class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cha = s.charAt(i);
            if (cha == '(' || cha == '{' || cha == '[') {
                stack.push(cha);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char ch = stack.pop();
                if ((cha == ')' && ch == '(') ||
                    (cha == '}' && ch == '{') ||
                    (cha == ']' && ch == '[')) {

                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}