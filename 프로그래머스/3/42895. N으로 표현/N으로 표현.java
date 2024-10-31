import java.util.*;

class Solution {
    public int solution(int N, int number) {
        int answer = 0;
        
        List<HashSet<Integer>> list = new ArrayList<HashSet<Integer>>();
        
        if(N==number) return 1;
        
        for(int i=0; i<= 8; i++) {
            list.add(new HashSet<>());
        }
        
        list.get(1).add(N);
        
        for(int i= 2; i<= 8; i++) {
            
            HashSet<Integer> totalSet = list.get(i);
            //i번째의 HashSet 통 저장소
            
            for(int j= 1; j<= i; j++){
                HashSet<Integer> a = list.get(j);
                HashSet<Integer> b = list.get(i-j);
                
                for(int x: a) {
                    for(int y:b) {
                        totalSet.add(x+y);
                        totalSet.add(x-y);
                        totalSet.add(x*y);
                        if(x!=0&&y!=0)
                            totalSet.add(x/y);
                    }
                }
                
                totalSet.add(Integer.parseInt(String.valueOf(N).repeat(i)));
                
            }
            
            if(totalSet.contains(number))
                return i;
            
        }
        
        //8까지 했는데 만약 만족하는 number가 없으면
        
        return -1;
    }
}