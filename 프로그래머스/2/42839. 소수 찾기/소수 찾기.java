import java.util.*;
class Solution {
    HashSet<Integer> set;
    boolean[] visited;
    char[] number;
    
    public int solution(String numbers) {
        int answer = 0;
        set = new HashSet<>();
        number = new char[numbers.length()];   //숫자들을 저장하는 char 배열 생성
        visited = new boolean[number.length];
        
        //한자리
        for(int i=0; i<numbers.length(); i++) {
            number[i] = numbers.charAt(i);
        }    
        
        dfs("",0);
        
        answer = set.size();
            
        return answer;
    }
    
    public void dfs(String str, int index){
        int num = 0;
        
        if(!str.equals("")) {
            num = Integer.parseInt(str);
            if(isPrime(num))    
                set.add(num);       //만약 소수이면 set에 숫자 저장
        }
        
        if(index == number.length)
            return;
        
        for(int i=0; i<number.length; i++) {
            if(visited[i]==true)
                continue;
            
            visited[i] = true;
            dfs(str+number[i], index+1);
            visited[i] = false;
        }
    }
    
    public boolean isPrime(int num) {        
        
        if(num==0) return false;
        if(num==1) return false;
        if(num==2) return true;
        
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i==0)
                return false;
        }
        
        return true;
    }
}