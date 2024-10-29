import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        
        int choice = nums.length/2;
        

        for(int i: nums) {
            set.add(i);
        }
        
        answer = Math.min(choice, set.size());
        
        return answer;
    }
}