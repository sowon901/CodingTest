import java.util.*;
class Solution {
    
    public ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] array = new int[3];
        int[] sOne =  {1,2,3,4,5};
        int[] sTwo =  {2,1,2,3,2,4,2,5};
        int[] sThree =  {3,3,1,1,2,2,4,4,5,5};
        int max = 0;
        
        
        for(int i=0; i<answers.length; i++) {
            
            if(answers[i]==sOne[i%5]){
                array[0]++;
            }
            if(answers[i]==sTwo[i%8]){
                array[1]++;
            }
            if(answers[i]==sThree[i%10]){
                array[2]++; 
            }
        }
        
        max = Math.max(array[0], array[1]);
        max = Math.max(max, array[2]);
        
        
        for(int i=0; i<3; i++){
            if(array[i]==max)
                answer.add(i+1);
        }
        
        
        return answer;
    }
}