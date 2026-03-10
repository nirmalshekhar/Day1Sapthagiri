package Day9;
import java.util.*;
public class IsogramCheck {
    public static void main(String[] args) {
        String word="Thor@123";
        word=word.toLowerCase().replaceAll("[^a-z0-9]"," ");
        Set<Character> set=new HashSet<>();
        boolean isIsogram=true;
        for(char c:word.toCharArray()){
            if(!set.add(c)){
                isIsogram=false;
                break;
            }
        }
        System.out.println(word + (isIsogram?"->Isogram": "->Not Isogram"));

    }
}
