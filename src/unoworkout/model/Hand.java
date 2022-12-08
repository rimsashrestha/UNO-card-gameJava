package unoworkout.model;

import unoworkout.model.card.Card;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private int handSize;

    public Hand() {
        this.cards = new ArrayList<>();
    }


    public void addCard(Card card) {
        cards.add(card);
    }
}
