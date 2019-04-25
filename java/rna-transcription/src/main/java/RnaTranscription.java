import java.util.HashMap;

class RnaTranscription {

    String transcribe(String dnaStrand) {

        HashMap<Character, Character> hm = new HashMap<>();
        hm.put('G','C');
        hm.put('C','G');
        hm.put('T','A');
        hm.put('A','U');

        char []  arrDnaStand = dnaStrand.toCharArray();
        StringBuilder rna = new StringBuilder();

        for (int i = 0; i < dnaStrand.length(); i++) {
            rna.append(hm.get(arrDnaStand[i]));
        }

        return rna.toString();

    }

}
