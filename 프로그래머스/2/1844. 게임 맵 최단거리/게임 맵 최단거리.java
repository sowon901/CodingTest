import java.util.*;

class Solution {

    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    
    public int solution(int[][] maps) {
        int answer = -1;
        
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        int[][] distance = new int[maps.length][maps[0].length];
        
        answer = dfs(maps, visited, distance);
        
        
        return answer;
    }
    
    public int dfs(int[][] maps, boolean[][] visited, int[][] distance) {
        
        Queue<int[]> queue = new LinkedList<>();
        
        queue.offer(new int[] {0,0}); //처음 위치 queue에 삽입
        
        visited[0][0] = true;
        distance[0][0] = 1;
        
        if(maps[0][0]==0) return -1;
        // System.out.println("while loop 드가욤 뿌잉");
        while(!queue.isEmpty()) {
            // System.out.println("while loop 와쪄염 뿌잉");
            //현재 위치
            int[] poll = queue.poll();
            int xLoc = poll[0];
            int yLoc = poll[1];
            
            for(int i=0; i<4; i++) {
                
                int x = xLoc + dx[i];
                int y = yLoc + dy[i];
                
                // 맵 밖으로 나가면 캇뜨
                if(x<0 || x >= maps.length || y < 0 || y >= maps[0].length)
                    continue;
                
                // 벽
                if(maps[x][y] == 0)
                    continue;
                
                if(visited[x][y] == true) continue;
                
                visited[x][y] = true;
                    
                //다음 위치는 현재 위치보다 거리가 + 1
                distance[x][y] = distance[xLoc][yLoc] + 1;
                
                queue.offer(new int[] {x, y});
                
                // 막힘핑
            }
            
            //xLoc과 yLoc의 위치가 적군의 위치일 경우
            if(xLoc == maps.length-1 && yLoc== maps[0].length-1) {
                return distance[xLoc][yLoc];
            }
        }
        return -1;
    }
    
}