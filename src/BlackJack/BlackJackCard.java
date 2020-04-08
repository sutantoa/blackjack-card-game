package BlackJack;

import java.util.ArrayList;
import java.util.Collections;

public class BlackJackCard extends Card {
    ArrayList<BlackJackCard> deck = new ArrayList<>();
    ArrayList<BlackJackCard> playercard = new ArrayList<>();
    ArrayList<BlackJackCard> dealercard = new ArrayList<>();
    private int ptotal = 0;
    private int dtotal = 0;

    public void createdeck() {

        String[] suit = new String[] { "Spades", "Heart", "Clubs", "Diamonds" };

        for (int j = 0; j < 4; j++) {

            for (int i = 1; i <= 13; i++) {

                BlackJackCard card = new BlackJackCard();
                card.suit = suit[j];
                card.rank = i;
                deck.add(card);
            }

        }

    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public void dealToDealer() {
        BlackJackCard c = deck.remove(0);
        dealercard.add(c);

    }

    public void dealToPlayer() {
        BlackJackCard c = deck.remove(0);
        playercard.add(c);

    }

    public int calcDealerSum() {
        dtotal = 0;

        for (int i = 0; i < dealercard.size(); i++) {
            BlackJackCard c = dealercard.get(i);
            if (c.rank > 10) {
                dtotal = dtotal + 10;
            } else if (c.rank == 1) {
                dtotal = dtotal + 1;
            } else {
                dtotal = dtotal + c.rank;
            }

        }
        if (dtotal > 21) {
            dtotal = 0;
            for (int i = 0; i < dealercard.size(); i++) {
                BlackJackCard c = dealercard.get(i);
                if (c.rank > 10) {
                    dtotal = dtotal + 10;

                } else if (c.rank == 1) {
                    dtotal = dtotal + 1;
                } else {
                    dtotal = dtotal + c.rank;

                }

            }

        }

        return dtotal;

    }

    public int calcPlayerSum() {
        ptotal = 0;

        for (int i = 0; i < playercard.size(); i++) {
            BlackJackCard c = playercard.get(i);
            if (c.rank > 10) {
                ptotal = ptotal + 10;

            } else if (c.rank == 1) {
                ptotal = ptotal + 11;
            } else {
                ptotal = ptotal + c.rank;

            }

        }

        if (ptotal > 21) {
            ptotal = 0;
            for (int i = 0; i < playercard.size(); i++) {
                BlackJackCard c = playercard.get(i);
                if (c.rank > 10) {
                    ptotal = ptotal + 10;

                } else if (c.rank == 1) {
                    ptotal = ptotal + 1;
                } else {
                    ptotal = ptotal + c.rank;

                }

            }

        }

        return ptotal;

    }

}
