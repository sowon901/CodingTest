class Solution {
    
    
    
    public int target(int[] numbers, int targets, int index, int sum) {
        if(index == numbers.length){
            return sum == targets ? 1 : 0;
        }
         
        
        return target(numbers, targets, index+1, sum + numbers[index])
            + target(numbers, targets, index+1, sum - numbers[index]);
        
    }
    
    
    public int solution(int[] numbers, int target) {
        //index, sum
        return target(numbers, target, 0, 0);
    }
}