package Day9;
import java.util.*;
public class PangramString {
    public static void main(String[] args) {
        String str="Pack my box with five dozen liquor jugs";
        str=str.toLowerCase();
        Set<Character> letters=new HashSet<>();
        for(char c: str.toCharArray()){
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }
        if(letters.size()==26){
            System.out.println("Pangram String");
        }
        else{
            System.out.println("Not Pangram");
        }

    }
}
