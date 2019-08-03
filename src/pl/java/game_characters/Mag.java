package pl.java.game_characters;

public class Mag extends AbstractCharacter {
    String kostur = "kostur";
    String ksiega = "ksiega";

    public Mag(String name, String age, int lenght, int power, int protect, int kindOfPower) {
        super();
    }

    @Override
    public void fight() {
        System.out.println("Mag walczy za pomoca " + kostur + " oraz rzuca zaklecia z " + ksiega);
    }
}
