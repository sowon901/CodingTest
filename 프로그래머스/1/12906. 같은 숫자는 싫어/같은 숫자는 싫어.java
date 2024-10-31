import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        // int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]!=arr[i])
                list.add(arr[i]);
            else
                continue;

        }
        return list;
    }
}