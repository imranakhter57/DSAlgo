import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacter {
    public static void main(String[] args) {
        String s = "aeroplane";
        Map<Character, Integer> tracker =  new HashMap<>();
        for(Character c: s.toCharArray()){
            tracker.put(c, tracker.getOrDefault(c,0)+1);
        }
        tracker.entrySet().forEach((entry)-> {
            System.out.println("Key:"+ entry.getKey() +" with no of occurence : "+entry.getValue());
        });
    }
}
