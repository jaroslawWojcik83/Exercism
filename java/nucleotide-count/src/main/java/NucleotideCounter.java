import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NucleotideCounter {

    private String given;
    private Map<Character, Integer> map = new HashMap<>();
    
    public NucleotideCounter(String given) {
        this.given = given;
        if (!validateDNAString()) {
            throw new IllegalArgumentException();
        }
    }

    public Map<Character, Integer> nucleotideCounts() {
        
        map.entrySet().clear();
        addElementMap(map);

        for (Character ch : given.toCharArray()) {
            for (Map.Entry<Character, Integer> element : map.entrySet()) {
                if (element.getKey() == ch) {
                    element.setValue(element.getValue() + 1);
                }
            }
        }

        return map;
    }

    public boolean validateDNAString() {

        boolean result = true;
        addElementMap(map);

        List<Character> arrList = map.entrySet()
                .stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        for (Character ch : given.toCharArray()) {
            if (!Arrays.asList(arrList).toString().contains(ch.toString())) {
                result = false;
                break;
            }
        }

        return result;
    }

    public void addElementMap(Map<Character, Integer> map) {
        map.put('A', 0);
        map.put('C', 0);
        map.put('G', 0);
        map.put('T', 0);
    }
}
