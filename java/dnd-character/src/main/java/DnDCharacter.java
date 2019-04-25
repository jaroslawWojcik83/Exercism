import java.util.*;

class DnDCharacter {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    private final int startLifePoints = 10;

    public DnDCharacter() {
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
    }

    int ability() {

        Random random = new Random();
        List list = new ArrayList();

        for (int i = 0; i < 4; i++) {
            list.add(random.nextInt(5) + 1);
        }

        Collections.sort(list);
        list.remove(0);

        int sumListElement = 0;

        for (Object element : list) {
            sumListElement = sumListElement + (int) element;
        }

        list.clear();

        return sumListElement;
    }

    int modifier(int input) {
        return Math.floorDiv((input - startLifePoints), 2);
    }

    public int getHitpoints() {
        return startLifePoints + modifier(constitution);
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }
}
