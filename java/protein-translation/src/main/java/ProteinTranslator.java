import java.util.*;

class ProteinTranslator {

    private static Map<String, String> mapCodonsProtein = new HashMap<>();

    static {
        mapCodonsProtein.put("AUG","Methionine");
        mapCodonsProtein.put("UUU","Phenylalanine");
        mapCodonsProtein.put("UUC","Phenylalanine");
        mapCodonsProtein.put("UUA","Leucine");
        mapCodonsProtein.put("UUG","Leucine");
        mapCodonsProtein.put("UCU","Serine");
        mapCodonsProtein.put("UCC","Serine");
        mapCodonsProtein.put("UCA","Serine");
        mapCodonsProtein.put("UCG","Serine");
        mapCodonsProtein.put("UAU","Tyrosine");
        mapCodonsProtein.put("UAC","Tyrosine");
        mapCodonsProtein.put("UGU","Cysteine");
        mapCodonsProtein.put("UGC","Cysteine");
        mapCodonsProtein.put("UGG","Tryptophan");
        mapCodonsProtein.put("UAA","STOP");
        mapCodonsProtein.put("UAG","STOP");
        mapCodonsProtein.put("UGA","STOP");
    }

    List<String> translate(String rnaSequence) {

        List<String> listOfProteinRNA = new ArrayList<>();
        String [] arrRNASequence = rnaSequence.split("(?<=\\G.{3})");

        for (String elements : arrRNASequence) {
            if (mapCodonsProtein.get(elements) == null || mapCodonsProtein.get(elements).equals("STOP")) {
                break;
            }

            listOfProteinRNA.add(mapCodonsProtein.get(elements));
        }

        return listOfProteinRNA;
    }
}