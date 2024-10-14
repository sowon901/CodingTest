import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] cloth = new int[n];
        Arrays.fill(cloth, 1);
        
        for(int i=0; i<lost.length; i++) {
            cloth[lost[i]-1] -= 1;
        }
        
        for(int i=0; i<reserve.length; i++) {
            cloth[reserve[i]-1] += 1;
        }
                  
        for(int i=0; i<cloth.length; i++) {
            if(cloth[i]==2) {
                if(i-1>=0 && cloth[i-1] == 0) {
                    cloth[i-1] = 1;
                    cloth[i] = 1;
                }else if(i+1 < cloth.length && cloth[i+1]==0) {
                    cloth[i+1] = 1;
                    cloth[i] = 1;
                }
            }
        }          
                
        
        for(int i:cloth) {
            if(i >= 1) 
                answer++;
        }
                  
        return answer;
    }
}