public class CollatzCalculator {

    public int computeStepCount(int i) {

        if (i <= 0) {
            throw new IllegalArgumentException("Only natural numbers are allowed");
        }

        int counter = 0;

        while (i != 1) {
            i = (i % 2 == 0) ? i / 2 : i * 3 + 1;
            counter ++;
        }

        return counter;
    }
}