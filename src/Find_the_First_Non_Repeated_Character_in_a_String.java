import java.util.LinkedHashMap;
import java.util.Map;

public class Find_the_First_Non_Repeated_Character_in_a_String {
    public static void main(String[] args){
        String str = "swiss";
        Map<Character, Integer>charCount = new LinkedHashMap<>();
        for (char c:str.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c,0)+1);

        }
        for (Map.Entry<Character, Integer>entry:charCount.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }

    }
}
