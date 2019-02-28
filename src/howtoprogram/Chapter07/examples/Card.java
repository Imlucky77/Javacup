package howtoprogram.Chapter07.examples;

/**
 * @author imlucky
 * @Created: 2019/02/27
 * @Examples: Fig. 7.9: StudentPoll.java
 */
public class Card {
    private final String face;
    private final String suit;

    public Card(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}
