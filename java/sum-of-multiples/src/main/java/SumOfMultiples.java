import java.util.HashSet;
import java.util.Set;

class SumOfMultiples {

    private int number;
    private int [] set;

    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }

    int getSum() {

        Set<Integer> setResult = new HashSet<>();

        for (int element : set) {

            for (int i = 1; i < number; i++) {
                int multiply = element * i;
                if (multiply < number) {
                    setResult.add(multiply);
                }
            }
        }

        return setResult.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
