import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[][] cardsArray = new int[sizes.length][2];
        cardsArray = sizes;
        int maxWidth = 0;
        int maxHeight = 0;
        
        for(int i=0; i<sizes.length; i++) {
            Arrays.sort(cardsArray[i]);
            maxWidth = Math.max(cardsArray[i][0], maxWidth);
            maxHeight = Math.max(cardsArray[i][1], maxHeight);
        }
        
        answer = maxWidth*maxHeight;
        
        
        
        return answer;
    }
}