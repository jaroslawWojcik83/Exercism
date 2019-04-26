import java.util.*;
import java.util.stream.Collectors;

public class CheckCategory {

    private static Set set = new HashSet();
    private static int number2;
    static boolean isYacht(int [] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    static int numberStartStraight(int [] arr, ArrayList<Integer> arrayList) {

        for (int anArr : arr) {
            arrayList.add(anArr);
        }

        Collections.sort(arrayList);

        return arrayList.get(0);
    }

    static boolean isStraightCategory(int [] arr, ArrayList<Integer> arrayList) {
        for (int anArr : arr) {
            arrayList.add(anArr);
        }

        Collections.sort(arrayList);

        for (int i = 0; i < arrayList.size()-1; i++) {
            if (arrayList.get(i) + 1 != arrayList.get(i + 1)) {
                return false;
            }
        }

        return true;
    }

    static boolean isYachtCategory(int [] arr, int given) {
        for (int anArr : arr) {
            if (anArr == given) {
                return true;
            }
        }
        return false;
    }

    static boolean isFullHouseOrFourOfAKindCategory(int [] arr, ArrayList<Integer> arrayList, int given1, int given2) {

        int number1;
        int countNumber1;
        boolean result = false;

        set.clear();

        for (int anArr1 : arr) {
            set.add(anArr1);
        }

        if (set.size() == 2) {

            arrayList.addAll((Collection<? extends Integer>) set.stream()
                    .map(elem -> elem)
                    .collect(Collectors.toList()));

            number1 = arrayList.get(0);
            countNumber1 = 0;

            for (int anArr : arr) {
                if (anArr != number1) {
                    continue;
                }
                countNumber1++;
            }

            if (countNumber1 == given1 || countNumber1 == given2)
                result = true;
        }

        return result;
    }

    static int returnMaxFourOfAKind(int [] arr, ArrayList<Integer> arrayList) {

        int counterNumber1 = 0;
        int counterNumber2 = 0;

        for (int anArr1 : arr) {
            set.add(anArr1);
        }

        if (set.size() == 2) {

            arrayList.addAll((Collection<? extends Integer>) set.stream()
                    .map(elem -> elem)
                    .collect(Collectors.toList()));
            number2 = arrayList.get(1);
        }

        if (set.size() == 1) {
            arrayList.add(arr[0]) ;
        }

        int number1 = arrayList.get(0);

        for (int anArr : arr) {
            if (anArr != number1) {
                counterNumber2 += 1;
                continue;
            }
            counterNumber1 += 1;
        }

        if (counterNumber1 > counterNumber2) {
            return number1;
        } else return number2;
    }

    int calculate(int [] arr, int given) {
        int sum = 0;
        for (int anArr : arr) {
            if (anArr == given) {
                sum += anArr;
            }
        }
        return sum;
    }

    int calculate(int [] arr) {
        int sum = 0;
        for (int anArr : arr) {
            sum += anArr;
        }
        return sum;
    }
}
