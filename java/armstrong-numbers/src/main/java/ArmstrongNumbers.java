class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		char[] tabChar = String.valueOf(numberToCheck).toCharArray();
		int n = tabChar.length;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += Math.pow(Character.getNumericValue(tabChar[i]), n);
		}

		return sum == numberToCheck;
	}

}
