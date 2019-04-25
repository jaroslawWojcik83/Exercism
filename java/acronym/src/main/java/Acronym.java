public class Acronym {

    private String acronym;

    public Acronym(String fullSentence) {

        String [] arrFullSentence  = fullSentence.split("[-/\\s,._]");
        StringBuilder outText =  new StringBuilder();

        for (String elem : arrFullSentence) {
            if (elem.length() != 0 ) {
                Character character = elem.toUpperCase().charAt(0);
                outText = outText.append(character);
            }
        }

        this.acronym = outText.toString();
    }

    public String get() {
        return this.acronym;
    }

}
