package pl.java.game_characters;

public class Warrior extends AbstractCharacter {
    String miecz;

    @Override
    public void fight() {
        System.out.println("Mag walczy za pomoca " + miecz);
    }
}
