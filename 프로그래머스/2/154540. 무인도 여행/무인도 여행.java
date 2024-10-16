import java.util.*;

class Solution {
    public static ArrayList<Integer> arrays;
    public static int sum;
    public static int[] dx = {-1,1,0,0};
    public static int[] dy = {0,0,-1,1};
    public static boolean[][] visited;
    
    public int[] solution(String[] maps) {
        arrays = new ArrayList<>();
        visited = new boolean[maps.length][maps[0].length()];
        
        for(int i=0; i<maps.length; i++) {  //4 
            for(int j=0; j<maps[i].length(); j++) {   //5
                
                if(maps[i].charAt(j)!='X' && !visited[i][j]){
                    sum = 0;
                    bfs(i, j, maps);
                    arrays.add(sum);   
                }
            }
        }
        
        if(arrays.isEmpty()) {
           return new int[] {-1};
        }
        
        Collections.sort(arrays);
        
        int[] answer = new int[arrays.size()];
        
        for(int i=0; i< arrays.size(); i++)  
            answer[i] = arrays.get(i);
        
        return answer;
    }
    
    
    public static void bfs(int x, int y, String[] maps) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {x, y});
        
        sum += maps[x].charAt(y)-'0';
        visited[x][y] = true;
        
        while(!queue.isEmpty()){
            
            int[] current = queue.poll();
            int curX = current[0];
            int curY = current[1];
        
            for(int i=0; i<4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];


                if(nx < 0 || nx >= maps.length || ny < 0 || ny >= maps[0].length())
                    continue;

                if(!visited[nx][ny] && maps[nx].charAt(ny)!='X'){
                    visited[nx][ny] = true;
                    sum += maps[nx].charAt(ny) - '0';
                    queue.add(new int[] {nx,ny});
                    
                }


            }
        }
        
    }
    
}