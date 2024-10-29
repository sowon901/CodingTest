import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<completion.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0)+1);
            map.put(completion[i], map.getOrDefault(completion[i],0)-1);

        }
        
        map.put(participant[participant.length-1], map.getOrDefault(participant[participant.length-1],0)+1);
        
        
        for(String key : map.keySet()) {
            if(map.get(key)==1){
                answer = key;
                break;
            }
        }
        
        return answer;
    }
}