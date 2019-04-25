import java.util.*;
import java.util.stream.Collectors;

class ResistorColor {

    private static HashMap<String, Integer> hm = new HashMap<>();

    static {
        hm.put("black", 0);
        hm.put("brown", 1);
        hm.put("red", 2);
        hm.put("orange", 3);
        hm.put("yellow", 4);
        hm.put("green", 5);
        hm.put("blue", 6);
        hm.put("violet", 7);
        hm.put("grey", 8);
        hm.put("white", 9);
    }

    int colorCode(String color) {
        return hm.get(color);
    }

    String[] colors() {

        List<String > list = hm.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(color -> color.getKey())
                .collect(Collectors.toList());

        return list.stream().toArray(String[]::new);

        //String[] arrColors = list.stream().toArray(String[]::new);
        //return arrColors;
    }
}