import java.util.*;

public class Yacht {

    private static YachtCategory yachtCategory;
    private int points;
    private int [] arr;
    private ArrayList<Integer> arrayList = new ArrayList<>();

    private static Map<YachtCategory, Integer> map = new HashMap<>();
    private static Map<FullHouseAndFourOfAKindCounter, Integer> map2 = new HashMap<>();

    CheckCategory checkCategory = new CheckCategory();

    static {
        map.put(YachtCategory.YACHT, 50);
        map.put(YachtCategory.ONES, 1);
        map.put(YachtCategory.TWOS, 2);
        map.put(YachtCategory.THREES, 3);
        map.put(YachtCategory.FOURS, 4);
        map.put(YachtCategory.FIVES, 5);
        map.put(YachtCategory.SIXES, 6);
        map.put(YachtCategory.FULL_HOUSE, 0);
        map.put(YachtCategory.FOUR_OF_A_KIND, 0);
        map.put(YachtCategory.LITTLE_STRAIGHT, 30);
        map.put(YachtCategory.BIG_STRAIGHT, 30);
        map.put(YachtCategory.CHOICE, 0);
        map2.put(FullHouseAndFourOfAKindCounter.FULL_HOUSE_FIRST_GIVEN , 2);
        map2.put(FullHouseAndFourOfAKindCounter.FULL_HOUSE_SECOND_GIVEN , 3);
        map2.put(FullHouseAndFourOfAKindCounter.FOUR_OF_A_KIND_FIRST_GIVEN , 1);
        map2.put(FullHouseAndFourOfAKindCounter.FOUR_OF_A_KIND_SECOND_GIVEN , 4);
    }

    public Yacht() {
    }

    public Yacht(int [] arr, YachtCategory yachtCategory) {
        this.arr = arr;
        Yacht.yachtCategory = yachtCategory;
    }

    int Score() {

        switch (yachtCategory) {
            case YACHT : {
                if (checkCategory.isYacht(arr)) {
                    points = map.get(YachtCategory.YACHT);
                }
                break;
            }
            case ONES : {
                if (checkCategory.isYachtCategory(arr, map.get(YachtCategory.ONES))) {
                    points = checkCategory.calculate(arr, map.get(YachtCategory.ONES));
                }
                break;
            }
            case TWOS : {
                if (checkCategory.isYachtCategory(arr, map.get(YachtCategory.TWOS))) {
                    points = checkCategory.calculate(arr, map.get(YachtCategory.TWOS));
                }
                break;
            }
            case THREES : {
                if (checkCategory.isYachtCategory(arr, map.get(YachtCategory.THREES))) {
                    points = checkCategory.calculate(arr, map.get(YachtCategory.THREES));
                }
                break;
            }
            case FOURS : {
                if (checkCategory.isYachtCategory(arr, map.get(YachtCategory.FOURS))) {
                    points = checkCategory.calculate(arr, map.get(YachtCategory.FOURS));
                }
                break;
            }
            case FIVES : {
                if (checkCategory.isYachtCategory(arr, map.get(YachtCategory.FIVES))) {
                    points = checkCategory.calculate(arr, map.get(YachtCategory.FIVES));
                }
                break;
            }
            case SIXES : {
                if (checkCategory.isYachtCategory(arr, map.get(YachtCategory.SIXES))) {
                    points = checkCategory.calculate(arr, map.get(YachtCategory.SIXES));
                }
                break;
            }
            case FULL_HOUSE : {
                if (checkCategory.isFullHouseOrFourOfAKindCategory(arr,
                        arrayList,
                        map2.get(FullHouseAndFourOfAKindCounter.FULL_HOUSE_FIRST_GIVEN),
                        map2.get(FullHouseAndFourOfAKindCounter.FULL_HOUSE_SECOND_GIVEN))) {
                    points = checkCategory.calculate(arr);
                }
                break;
            }
            case FOUR_OF_A_KIND : {
                if (checkCategory.isFullHouseOrFourOfAKindCategory(arr,
                        arrayList,
                        map2.get(FullHouseAndFourOfAKindCounter.FOUR_OF_A_KIND_FIRST_GIVEN),
                        map2.get(FullHouseAndFourOfAKindCounter.FOUR_OF_A_KIND_SECOND_GIVEN))) {
                    points = checkCategory.calculate(arr, checkCategory.returnMaxFourOfAKind(arr, arrayList));
                } else if (checkCategory.isYacht(arr)) {
                    points = checkCategory.calculate(arr) - checkCategory.returnMaxFourOfAKind(arr, arrayList) ;
                }
                break;
            }
            case LITTLE_STRAIGHT : {
                int numberStartLittleStraight = 1;
                if (checkCategory.isStraightCategory(arr, arrayList) && checkCategory.numberStartStraight(arr, arrayList) == numberStartLittleStraight) {
                    points = map.get(YachtCategory.LITTLE_STRAIGHT);
                }
                break;
            }
            case BIG_STRAIGHT : {
                int numberStartBigStraight = 2;
                if (checkCategory.isStraightCategory(arr, arrayList) && checkCategory.numberStartStraight(arr, arrayList) == numberStartBigStraight) {
                    points = map.get(YachtCategory.BIG_STRAIGHT);
                }
                break;
            }
            case CHOICE : {
                points = checkCategory.calculate(arr);
                break;
            }
        }

        return points;
    }
}
