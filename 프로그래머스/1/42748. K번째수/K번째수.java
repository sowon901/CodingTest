import java.util.*;

class Solution {
    public static List<Integer> list = new ArrayList<>();

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int s=0; s<commands.length; s++) {
            int[] arrays = new int[commands[s][1]-commands[s][0]+1];
            int index = 0;
            
            for(int i= commands[s][0]-1; i<commands[s][1]; i++) {
                arrays[index] = array[i];
                index++;
            }
            
            Arrays.sort(arrays);

            answer[s] = arrays[commands[s][2]-1];
        }
        
        
        return answer;
    }
}