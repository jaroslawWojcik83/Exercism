class DifferenceOfSquaresCalculator {

    private int squareOfSum = 0;
    private int SumOfSquares;

    int computeSquareOfSumTo(int input) {

        for (int i = 1; i <= input; i++) {
            squareOfSum += i;
        }

        return (int) Math.pow(squareOfSum, 2);
    }

    int computeSumOfSquaresTo(int input) {

        for (int i = 1; i <= input; i++) {
            SumOfSquares += Math.pow(i, 2) ;
        }

        return SumOfSquares;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
