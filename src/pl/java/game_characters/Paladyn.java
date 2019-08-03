package pl.java.game_characters;

public class Paladyn extends AbstractCharacter {
    String topor = "topor";
    String tarcza = "tarcza";

    public Paladyn(String name, String age, int lenght, int power, int protect, int kindOfPower) {
        super();
    }


    @Override
    public String toString() {
        return super.toString() + "Paladyn{" +
                "topor='" + topor + '\'' +
                ", tarcza='" + tarcza + '\'' +
                '}';
    }

    @Override
    public void fight() {
        System.out.println("Paladyn walczy za pomoca " + topor + " oraz broni się " + tarcza);
    }
}
