import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        int count = 1;
        
        int[] left = new int[progresses.length]; //걸리는 날짜 배열
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> returns = new ArrayList<>();
        
         for(int i=progresses.length-1; i>=0; i--) {                
                if((100-progresses[i])%speeds[i] == 0)
                    stack.push((100-progresses[i])/speeds[i]);
                else 
                    stack.push((100-progresses[i])/speeds[i]+1);
        }
        //걸리는 숫자를 stack에 넣음    
        int top = 0;
        // System.out.println(stack);
        int first = 0;//맨 위에 있는 값
        while(!stack.isEmpty()) {
            
            first = stack.pop();
            count = 1;
            
            // break;
            while(!stack.isEmpty() && stack.peek()<=first)    //peek한 것이 pop한 값보다 작을경우
            { 
                stack.pop(); 
                count++;
            } 
            
            returns.add(count);
            
        }

        return returns;
        
    }
}