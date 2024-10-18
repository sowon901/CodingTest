import java.util.*;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        int remove = 0;
                
        Stack<Character> stack = new Stack<>();
        
        for(char c:number.toCharArray()) {
            
            while(remove<k && !stack.isEmpty() && stack.peek()< c){
                stack.pop();
                remove++;   
            }
             
            stack.push(c);
        }
                
        while(!stack.isEmpty() && remove < k) {
            stack.pop();
            remove++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<stack.size(); i++) {
            sb.append(stack.get(i));
        }
        
        answer = sb.toString();
        
        return answer;
    }
}