import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        if(s.charAt(0)==')')
            return false;
        
        for(char c: s.toCharArray()) {
            if(c == '(')
                stack.push(c);
            else {
                if(stack.isEmpty())
                    return false;
                stack.pop();
            }
        }
       return stack.size()==0?true:false;
    }
}