class ReverseString {

    String reverse(String inputString) {

        String outputString = new StringBuilder(inputString).reverse().toString();

        return outputString;
    }
}