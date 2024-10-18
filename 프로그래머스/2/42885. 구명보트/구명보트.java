import java.util.*;

class Solution {
//two pointer algorithm    
    public int solution(int[] people, int limit) {
        int answer = 0;
        int startIndex = 0;
        int endIndex = people.length-1;
        boolean flag = false;
        
        //10 20 50 50 70 80 90
            
        Arrays.sort(people);
        
        while(startIndex <= endIndex) {
            
            if(people[startIndex] + people[endIndex] <= limit) {
                startIndex++; 
            }
            
            endIndex--;
            answer++;
        }
        
        
        
        return answer;
    }
}