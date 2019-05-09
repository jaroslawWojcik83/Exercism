import java.util.*;
import java.util.stream.Collectors;

class Sieve {

    private int maxPrime;

    Sieve(int maxPrime) {
        this.maxPrime = maxPrime;
    }

    List<Integer> getPrimes() {

        List<Integer> listResult = new ArrayList<>();
        Set<Integer> setOfIndex = new HashSet<>();

        for (int i = 2; i <= maxPrime; i++) {
            listResult.add(i);
        }

        for (int i = 2; i < listResult.size(); i++) {
            for (int j = i; j < listResult.size(); j++) {
                if (listResult.get(j) != i && listResult.get(j) % i == 0) {
                    setOfIndex.add(listResult.get(j));
                }
            }
        }

        for (Integer element : setOfIndex) {
            listResult.remove(element);
        }

        return listResult;
    }
}