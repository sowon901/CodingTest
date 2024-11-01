import java.util.*;
class Solution {
    
    public int[] parent;
    
    public int solution(int n, int[][] costs) {
        int answer = 0;
        parent = new int[n];
        
        for(int i=0; i<n; i++) {
            parent[i] = i;
        }
        
        Arrays.sort(costs, (o1,o2)-> o1[2]-o2[2]);
        //짧은 경로니까 오름차순 정렬
        
        
        for(int i=0; i<costs.length; i++) {
            
            int a = costs[i][0];
            int b = costs[i][1];
            int c = costs[i][2];
            
            if(findParent(a) != findParent(b)) {
                union(a,b);
                answer += c;
            }
            
        }
        
        return answer;
    }
    
    public void union(int node1, int node2) {
        
        if(findParent(node1) != findParent(node2))
            parent[findParent(node2)] = findParent(node1);
        //부모의 부모를 node1으로 설정
            
        
    }   //두 노드를 연결하는 작업(부모 합침)
    
    public int findParent(int node) {
        
        if(parent[node] == node)
            return node;
        else
            return parent[node] = findParent(parent[node]);
        
    }
    
}