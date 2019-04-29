class LargestSeriesProductCalculator {

    private String givenString;

    public LargestSeriesProductCalculator(String givenString) {
        this.givenString = givenString;

        if (!givenString.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException("String to search may only contain digits.");
        }
    }

    public long calculateLargestProductForSeriesLength(int input) {

        if (givenString.length() < input) {
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }

        if (input < 0) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        }

        char[] arr = givenString.toCharArray();
        long digit = 0;

        for (int i = 0; i < arr.length+1-input; i++) {
            long digitTemp = 1;
            for (int j = i; j < i + input; j++) {
                 digitTemp = digitTemp * Integer.parseInt("" + arr[j]);
            }

            if (digitTemp > digit) {
                digit = digitTemp;
            }
        }
        return digit;
    }
}
