package agprojects.pokerapp.controllers;

import agprojects.pokerapp.models.Deck;
import agprojects.pokerapp.models.card.Card;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Stack;


@RestController
@RequestMapping("/poker/")
public class CardController {

    @GetMapping("draw")
    public Stack<Card> hi(){
        Deck deck = new Deck();
        Collections.shuffle(deck.getCards());
        return deck.getCards();
    }

}
