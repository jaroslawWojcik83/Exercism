import java.util.ArrayList;

class NaturalNumber {

    private int given;

    public NaturalNumber(int given) {
        this.given = given;
        if (given <= 0)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
    }

    public Classification getClassification() {

        Classification classification;
        Integer resultSum = 0;

        for (int i = 1; i < given; i++) {
            if (given%i == 0) {
                resultSum += i;
            }
        }

        if (resultSum == given) {
            classification = Classification.PERFECT;
        } else if (resultSum < given) {
            classification = Classification.DEFICIENT;
        } else classification = Classification.ABUNDANT;

        return classification;
    }
}
