package howtoprogram.Chapter07.examples;

/**
 * @author imlucky
 * @Created: 2019/02/27
 * @Examples: Fig. 7.11: DeckOfCardsTest.java
 */
public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();

        for (int i = 1; i <= 52; i++) {
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }
}
