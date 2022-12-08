package unoworkout.controller;

import unoworkout.model.Hand;
import unoworkout.model.card.Card;
import unoworkout.model.card.Color;
import unoworkout.model.card.ColorCard;
import unoworkout.model.card.WildCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameController {

    public static final int CARDS_IN_A_DECK = 108;

    List<Card> deck;
    Hand currentHand;

    public GameController(int numberOfDecks, boolean shuffleTogether) {
        this.deck = new ArrayList<>();
        fillNDecks(numberOfDecks);
        shuffle(shuffleTogether);
    }

    public Hand drawHand() {
        int handSize = 7;
        Hand hand = new Hand();
        for (int i = 0; i < handSize; i++) {
            if (!deck.isEmpty()) {
                hand.addCard(deck.remove(0));
            }
            else
                break;
        }
        sortHand(hand);
        return hand;

    }

    private void sortHand(Hand hand) {

    }

    public int remainingCardsInDeck() {
        return deck.size();
    }

    private void shuffle(boolean shuffleTogether) {
        if (!shuffleTogether) {
            shuffle(0, 108);
            shuffle(108,216);
            shuffle(216, 324);
        }
        else
            shuffle(0,324);
    }

    private void shuffle(int start, int end) {
        Random random = new Random();
        for (int i = start; i < end; i++) {
            int j = start + random.nextInt(end-start);
            this.swap(i, j);
        }
    }

    private void swap(int i, int j) {
        Card temp = this.deck.get(i);
        this.deck.set(i, this.deck.get(j));
        this.deck.set(j, temp);
    }

    private void fillNDecks(int numDecks) {
        for (int i = 0; i < numDecks; i++) {
            String[] values = new String[] {"ZERO", "ONE", "ONE", "TWO", "TWO", "THREE",
                    "THREE", "FOUR", "FOUR", "FIVE", "FIVE", "SIX", "SIX", "SEVEN",
                    "SEVEN", "EIGHT", "EIGHT", "NINE", "NINE", "SKIP", "SKIP",
                    "REVERSE", "REVERSE", "DRAW2", "DRAW2"};
            int idx = 0;
            for (Color color: Color.values()) {
                for (String value: values) {
                    deck.add(new ColorCard(color, value));
                }
                deck.add(new WildCard("WILD"));
                deck.add(new WildCard("WILDDRAW4"));
            }
        }
    }


}
