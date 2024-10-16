import java.util.*;

class Solution {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static int[] oil;
    public static int answer = 0;
    public static int x,y;
    public static boolean[][] visited;
    public static int[][] map;
    
    public int solution(int[][] land) {
        
        x = land[0].length; //8
        y = land.length;    //5 
        oil = new int[x];   
        visited = new boolean[y][x];
        map = land;
        
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                if(land[j][i]==1&&!visited[j][i])
                    bfs(j,i);
            }
        }
        
        for(int i: oil) {
            answer =  Math.max(i, answer);
        }
        
        return answer;
    }
    
    static void bfs(int a, int b) {     
        Queue<int[] > q = new ArrayDeque<>();
        q.offer(new int[] {a,b});
        HashSet<Integer> set = new HashSet<>();
        visited[a][b] = true;     
        int oilValue = 1;    //석유가 있는 곳의 좌표를 탐색하니까 기본 석유량 1로 초기화
     
        while(!q.isEmpty()){   //52문장에 있는 queue에 새로 쌓인 좌표들 포함
            int[] now = q.poll();
            set.add(now[1]);  //y좌표(열) (3,1)좌표일 때 1을 저장 (1의 석유량 저장 set)
            
            for(int i =0; i<4; i++){
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i]; 

                if(!Range(nx,ny) || map[nx][ny] ==0 || visited[nx][ny]) 
                    continue;
                
                q.offer(new int[] {nx,ny});     //좌표(nx,ny)가 land 범위 안에 있고 석유가                                             존재하고  방문 하지 않은 곳일 경우 큐에 좌표 저장
                                        
                visited[nx][ny] = true; 
                oilValue ++;    // 새로운 좌표 발견시 석유량 1씩 증가
            }
        }

        
        for(int i: set)
            oil[i] += oilValue; 
    }
    
    
    
    public static boolean Range(int nx, int ny) {
        if(nx >=0 && nx < map.length && ny >=0 && ny < map[0].length)
            return true;
        else 
            return false;
    }  
    
}