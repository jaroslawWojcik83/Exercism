import java.util.HashSet;
import java.util.Set;

class IsogramChecker {

    boolean isIsogram(String phrase) {

        if (phrase == null) {
            throw new IllegalArgumentException();
        }

        Set set = new HashSet();
        char [] arrPhrase = phrase.toUpperCase().replaceAll("-","").replaceAll(" ", "").toCharArray();

        if (arrPhrase.length > 0) {
            for (char element : arrPhrase) {
                set.add(element);
            }
        }

        return arrPhrase.length == set.size();

    }
}

/*  swietne rozwiazanie */
/*
class IsogramChecker {

    boolean isIsogram(String phrase) {
        String normPhrase = phrase.replaceAll("-", "")
                .replaceAll(" ", "")
                .toLowerCase();
        return normPhrase.chars().distinct().count() == normPhrase.length();

    }

}*/
