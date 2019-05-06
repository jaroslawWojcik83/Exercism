class RotationalCipher {

    private int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {

        StringBuilder sb = new StringBuilder();
        char[] arr = data.toCharArray();

        for (Character element : arr) {
            if (Character.isLetter(element)) {
                if (Character.isLowerCase(element)) {
                    sb.append((char) ('a' + ((element - 'a' + shiftKey) % 26)));
                } else {
                    sb.append((char) ('A' + ((element - 'A' + shiftKey) % 26)));
                }
            } else {
                sb.append(element);
            }
        }

        return sb.toString();
    }
}
