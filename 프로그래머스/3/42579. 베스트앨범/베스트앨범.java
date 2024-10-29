import java.util.*;

class Solution {
    
    class Music {
        
        int index= 0;
        String genres = "";
        int play = 0;
        
        Music(int index, String genres, int play) {
            this.index = index;
            this.genres = genres;
            this.play = play;
        }
    }    
    
    
    public ArrayList<Integer> solution(String[] genres, int[] plays) {
        // int[] answer = {};
        
        // HashMap<String, ArrayList<Integer, Integer>> map = new HashMap<>();
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Music> musicList = new ArrayList<>();
        
        for(int i=0; i<genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
            musicList.add(new Music(i, genres[i], plays[i]));
        }
     
        //같은 장르를 재생수대로 정렬
        Collections.sort(musicList, (o1,o2) -> (o2.play - o1.play)); 
        
        // ArrayList<String> genresArray = new ArrayList<>();
        //장르랑 재생수 저장된 정렬(맵을 arrayList로)
        ArrayList<Map.Entry<String, Integer>> genreArray = new ArrayList<>(map.entrySet());    
        
//         for(Map.entry<String, Integer> maps : map.entrySet()) {
//             genresArray.add(maps.getKey, maps.value(maps.getKey()));
//         }
        
        Collections.sort(genreArray, (m1, m2) -> (m2.getValue() - m1.getValue()));
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(Map.Entry<String, Integer> genresList: genreArray) {
            int count = 0;
            for(Music list: musicList) {
                if(list.genres.equals(genresList.getKey())) {
                    if(count==2) {
                        break;
                    }else {
                        answer.add(list.index);
                    }
                    count++;

                }
            }
        }
        
        
        System.out.println();
        
        
        
        
        return answer;
    }
}