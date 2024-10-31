import java.util.*;

class Solution {
   
    public int solution(int m, int n, int[][] puddles) {
        
        return path(m, n, puddles);
    }
    
    public int path(int m, int n, int[][] puddles) {
        
        int[][] maps = new int[n][m];
        maps[0][0] = 1;
        
        for(int i=0; i<puddles.length; i++) {
            maps[puddles[i][1]-1][puddles[i][0]-1] = -1;
        }
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                
                if(maps[i][j] == -1){
                    maps[i][j] = 0;
                }else {
                    
                    //위에서 오는 경우의 수

                    if(i!=0)    maps[i][j] = maps[i-1][j];
                    //왼쪽에서 오는 경우의 수
                    if(j!=0)    maps[i][j] += maps[i][j-1];
                    maps[i][j] %= 1000000007;
                }
            }
        }
        
        
        return maps[n-1][m-1];
        
        
    }   
                
}
