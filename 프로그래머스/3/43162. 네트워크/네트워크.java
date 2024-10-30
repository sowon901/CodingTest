import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        int result=0;
        
        for(int i=0; i<n; i++) {
            if(visited[i]==false){
                result++;
                dfs(computers, visited, i);
            }
        }
        
        return result;
    }
    
    public static void dfs(int[][] computers, boolean[] visited, int number) {
        
        visited[number] = true;
        
        for(int i = 0; i < computers[0].length; i++) {
            if(visited[i]==true || computers[number][i] == 0)
                continue;
                          
            dfs(computers, visited, i);
        }
        
    }
    
}