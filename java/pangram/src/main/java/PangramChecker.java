import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {

        Set hs = new HashSet();
        char character;
        for (character = 'a'; character <= 'z' ; character++) {
            hs.add(character);
        }

        char [] arrChar = input.toLowerCase().toCharArray();

        if (arrChar.length == 0) {
            return false;
        } else {
            Set hs2 = new HashSet();
            for (int i = 0; i <  arrChar.length; i++) {
                hs2.add(arrChar[i]);
            }
            return hs2.containsAll(hs);
        }
    }
}
