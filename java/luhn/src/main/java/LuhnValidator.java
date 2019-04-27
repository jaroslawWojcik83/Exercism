import java.util.*;
import java.util.stream.Collectors;

class LuhnValidator {

    boolean isValid(String candidate) {

        List<String>  myList =  new ArrayList(Arrays.asList(candidate.replaceAll(" ", "").split("")));
        List<Integer> myList2 = new ArrayList<>();
        boolean result = false;

        Collections.reverse(myList);

        try {
            if (myList.size() > 1) {

                for (int i = 0; i < myList.size(); i++) {
                    if (i % 2 != 0) {
                        int checkNumber = Integer.parseInt(myList.get(i)) * 2;
                        myList2.add(checkNumber > 9 ? checkNumber - 9 : checkNumber);
                    } else {
                        myList2.add(Integer.parseInt(myList.get(i)));
                    }
                }

                Collections.reverse(myList2);
                result = myList2.stream()
                        .mapToInt(Integer::intValue)
                        .sum() % 10 == 0;
            }

        } catch (NumberFormatException e) {
            result = false;
        }

        return result;
    }

}
