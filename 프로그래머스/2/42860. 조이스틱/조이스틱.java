import java.util.*;

class Solution {
    public int solution(String name) {
        int next;
        int min=0; 
        int answer = 0;
        int move = name.length()-1;
        
        
        for(int i=0; i<name.length(); i++) {
            //위로 할 경우
            char c = name.charAt(i);
            min += (c-'A')>=('Z'-c+1)?('Z'-c+1):(c-'A');
            
            next = i+1; //다음 char의 위치
            
            while(next <name.length()&& name.charAt(next)=='A') { 
                                //A가 끝나는 지점의 다음칸 보기
                next++; //위치 늘려주면서 확인
            }
            //오른쪽으로 갔다가 왼쪽으로 틀기
            move = Math.min(move, i*2 + name.length() - next);
            //왼쪽으로 갔다가 오른쪽으로 틀기
            move = Math.min(move, (name.length()-next)*2 + i);
            
        }
        answer = min + move;
        
        return answer;
        
    }
}