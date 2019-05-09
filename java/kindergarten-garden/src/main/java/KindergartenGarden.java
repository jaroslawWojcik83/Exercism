import java.util.*;

public class KindergartenGarden {

    private String plants;
    private static List<String> students = new ArrayList<>();
    private static Map<String, Integer> map = new HashMap<>();

    static {
        int i = 0;

        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Eve");
        students.add("Fred");
        students.add("Ginny");
        students.add("Harriet");
        students.add("Ileana");
        students.add("Joseph");
        students.add("Larry");
        students.add("Kincaid");

        Collections.sort(students);

        for (String student : students) {
            map.put(student, i);
            i += 2;
        }
    }

    KindergartenGarden(String plants) {
        this.plants = plants;
    }

    List<Plant> getPlantsOfStudent(String student) {

        List<Plant> plantList = new ArrayList<>();

        String [] parts = plants.split("\n");
        char [] arrPart1 = parts[0].toCharArray();
        char [] arrPart2 = parts[1].toCharArray();
        int indexOfStudent = map.get(student);

        plantList.add(Plant.getPlant(arrPart1[indexOfStudent]));
        plantList.add(Plant.getPlant(arrPart1[indexOfStudent + 1]));
        plantList.add(Plant.getPlant(arrPart2[indexOfStudent]));
        plantList.add(Plant.getPlant(arrPart2[indexOfStudent + 1]));

        return plantList;
    }
}
