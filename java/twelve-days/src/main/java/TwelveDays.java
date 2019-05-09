public class TwelveDays {

    private String verse1  = "a Partridge in a Pear Tree.\n";
    private String verse2  = "two Turtle Doves, and " + verse1;
    private String verse3  = "three French Hens, " + verse2;
    private String verse4  = "four Calling Birds, " + verse3;
    private String verse5  = "five Gold Rings, " + verse4;
    private String verse6  = "six Geese-a-Laying, " + verse5;
    private String verse7  = "seven Swans-a-Swimming, " + verse6;
    private String verse8  = "eight Maids-a-Milking, " + verse7;
    private String verse9  = "nine Ladies Dancing, " + verse8;
    private String verse10 = "ten Lords-a-Leaping, " + verse9;
    private String verse11 = "eleven Pipers Piping, " + verse10;
    private String verse12 = "twelve Drummers Drumming, " + verse11;

    private String verse;
    private String text1;

    public String verse(int i) {

        String text2 = "day of Christmas my true love gave to me:";
        String templateText = "%s %s ";

        switch (i) {
            case 1  : text1 = "On the first";
                verse = templateText + verse1;
                break;
            case 2  : text1 = "On the second";
                verse = templateText + verse2;
                break;
            case 3  : text1 = "On the third";
                verse = templateText + verse3;
                break;
            case 4  : text1 = "On the fourth";
                verse = templateText + verse4;
                break;
            case 5  : text1 = "On the fifth";
                verse = templateText + verse5;
                break;
            case 6  : text1 = "On the sixth";
                verse = templateText + verse6;
                break;
            case 7  : text1 = "On the seventh";
                verse = templateText + verse7;
                break;
            case 8  : text1 = "On the eighth";
                verse = templateText + verse8;
                break;
            case 9  : text1 = "On the ninth";
                verse = templateText + verse9;
                break;
            case 10 : text1 = "On the tenth";
                verse = templateText + verse10;
                break;
            case 11 : text1 = "On the eleventh";
                verse = templateText + verse11;
                break;
            case 12 : text1 = "On the twelfth";
                verse = templateText + verse12;
                break;

        }

        return String.format(verse, text1, text2);
    }

    public String verses(int from, int to) {
        StringBuilder sb = new StringBuilder();

        for (int j = from; j <= to; j++) {
            sb.append(verse(j));
            if (j < to) {sb.append("\n");}
        }

        return sb.toString();
    }

    public String sing() {
        StringBuilder sb = new StringBuilder();
        int firstVerse = 1;
        int lastVerse = 12;

        for (int j = firstVerse; j <= lastVerse; j++) {
            sb.append(verse(j));
            if (j < lastVerse) {sb.append("\n");}
        }

        return sb.toString();
    }
}
