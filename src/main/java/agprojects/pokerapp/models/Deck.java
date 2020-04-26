package agprojects.pokerapp.models;

import agprojects.pokerapp.models.card.Card;
import agprojects.pokerapp.models.card.CardType;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

/**
 * Holds all the cards that are not used on the board,
 * or for any of the players.
 */
public final class Deck {

    /**
     * All cards in the deck, cannot be higher than 52.
     */
    private final Stack<Card> cards;

    /**
     * Instantiates a list of cards and fills this list with all
     * the cards from the enum CardType.
     * All the cards will be shuffled when the list is created.
     *
     * @see CardType
     * @see Card
     */
    public Deck() {
        this.cards = new Stack<>();
        Arrays.stream(CardType.values()).forEach(c -> cards.add(new Card(c)));
        Collections.shuffle(cards);
    }

    /**
     * @return removes the first card from the stack.
     */
    public Card getCard() {
        return this.cards.pop();
    }

    /**
     * @return the number of cards still available in the deck.
     */
    int getNumberOfCards() {
        return cards.size();
    }

    public Stack<Card> getCards() {
        return cards;
    }

}