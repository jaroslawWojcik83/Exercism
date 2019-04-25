import java.util.*;

class Anagram{

    private String given;

    public Anagram(String given) {
        this.given = given;
    }

    public ArrayList<String> match(List<String> listOfWords) {

        ArrayList<String> arrayListAnagrams = new ArrayList<>();
        ArrayList<Character> arrayListCharOfGiven = new ArrayList<>();
        ArrayList<Character> arrayListTemp = new ArrayList<>();

        for (char e : given.toLowerCase().toCharArray()) {
            arrayListCharOfGiven.add(e);
        }

        Collections.sort(arrayListCharOfGiven);

        for (String elements : listOfWords) {
            arrayListTemp.clear();

            char [] arrayCharOfWord = elements.toLowerCase().toCharArray();

            for (char element : arrayCharOfWord) {
                arrayListTemp.add(element);
            }

            Collections.sort(arrayListTemp);

            if (arrayListCharOfGiven.equals(arrayListTemp) && !elements.toLowerCase().equals(given.toLowerCase())) {
                arrayListAnagrams.add(elements);
            }
        }
        return arrayListAnagrams;
    }
}
