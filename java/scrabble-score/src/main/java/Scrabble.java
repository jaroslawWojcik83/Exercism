import java.util.HashMap;

public class Scrabble {

    private static final HashMap<Character, Integer> hm = new HashMap();
    private  int score = 0;

    public Scrabble(String input) {

        hm.put('a', 1);
        hm.put('e', 1);
        hm.put('i', 1);
        hm.put('o', 1);
        hm.put('u', 1);
        hm.put('l', 1);
        hm.put('n', 1);
        hm.put('r', 1);
        hm.put('s', 1);
        hm.put('t', 1);
        hm.put('d', 2);
        hm.put('g', 2);
        hm.put('b', 3);
        hm.put('c', 3);
        hm.put('m', 3);
        hm.put('p', 3);
        hm.put('f', 4);
        hm.put('h', 4);
        hm.put('v', 4);
        hm.put('w', 4);
        hm.put('y', 4);
        hm.put('k', 5);
        hm.put('j', 8);
        hm.put('x', 8);
        hm.put('q', 10);
        hm.put('z', 10);

        char [] arrArgs = input.toLowerCase().toCharArray();

        for (Character c : arrArgs) {
            score += hm.get(c);
        }
    }

    public int getScore() {
       return this.score;

    }
}