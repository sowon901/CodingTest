import java.util.*; 
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        
        for(int i=0; i<nums.length-2; i++) {
            for(int j=i+1; j<nums.length-1; j++) {
                for(int k = j+1; k<nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum))
                        answer ++;
                }
            }
            
        }

        return answer;
    }
    
    public static boolean isPrime(int number) {
        boolean answer = true;
        
        if(number ==2) return true;
        
        for(int i=2; i<=Math.sqrt(number); i++) {
            if(number % i == 0)
                return false;
        }
        return answer;
    }
}