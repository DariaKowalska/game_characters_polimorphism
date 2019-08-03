package pl.java.game_characters;

public class Main {
    public static void main(String[] args) {
        AbstractCharacter postac = new Paladyn("x", "y", 4, 4, 44, 4);
        System.out.println(postac.toString());
        postac.fight();
        postac = new Mag("x", "y", 4, 4, 44, 4);
        System.out.println(postac.toString());
        postac.fight();

    }
}
