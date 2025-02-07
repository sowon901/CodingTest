import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] money) {
        int answer = 0;
        
        //마지막 집이 안털릴 때
        int[] notStolenLast = new int[money.length];
        notStolenLast[0] = money[0];
        //두번째 집까지 방문했을 때 첫번째 집과 비교하여 둘 중 돈이 높은 집 털기
        notStolenLast[1] = Math.max(money[0],money[1]);
        
                     
        for(int i=2; i<money.length-1; i++) {
            notStolenLast[i] = Math.max(notStolenLast[i-2]+ money[i], notStolenLast[i-1]);
        }
        
        
        //마지막 집이 털릴 때
        int[] stolenLast = new int[money.length];
        stolenLast[0] = 0;
        stolenLast[1] = money[1];
        
        for(int i=2; i<money.length; i++) {
            stolenLast[i] = Math.max(stolenLast[i-2]+ money[i], stolenLast[i-1]);
        }
        
        answer = Math.max(notStolenLast[money.length-2], stolenLast[money.length-1]);
        
        return answer;
    }
}