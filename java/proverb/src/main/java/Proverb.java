class Proverb {

    private String [] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {

        StringBuilder sb = new StringBuilder();
        String returnTextNext  = "For want of a %s the %s was lost.\n";
        String returnTextLast = "And all for the want of a %s.";

        if (words.length == 0) {
            return "";
        }

        for (int i = 0; i < words.length-1; i++)
            sb.append(String.format(returnTextNext, words[i], words[i + 1]));

        sb.append(String.format(returnTextLast, words[0]));

        return sb.toString();
    }
}
