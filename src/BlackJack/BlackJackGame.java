
import java.util.Scanner;

public class BlackJackGame {

    Scanner input = new Scanner(System.in);
    BlackJackCard Card = new BlackJackCard();
    BlackJackPlayer Bet = new BlackJackPlayer();

    public void play() {
        System.out.println();

        Bet.checkcash();
        Bet.showCash();
        Bet.bet();

        Card.createdeck();
        Card.shuffleDeck();

        Card.dealToPlayer();
        Card.dealToDealer();
        Card.dealToPlayer();
        Card.dealToDealer();

        showPlayerHand();
        Card.calcPlayerSum();
        System.out.println();
        showPlayerSum();

        hiddenDealerHand();

        System.out.println();
        System.out.println();
        playerTurn();

        showPlayerHand();
        System.out.println();
        showPlayerSum();

        System.out.println();
        showDealerHand();

        System.out.println();
        showdealerSum();

        dealerTurn();
        checkWin();

    }

    public void checkWin() {
        if (Card.calcDealerSum() < 22 && Card.calcPlayerSum() < 22) {
            if (Card.calcDealerSum() > Card.calcPlayerSum()) {
                System.out.println("Dealer wins");
                Bet.showCash();
            }
            if (Card.calcPlayerSum() > Card.calcDealerSum()) {
                System.out.println("You win");
                Bet.payOutWin();
                Bet.showCash();

            }

            if (Card.calcPlayerSum() == Card.calcDealerSum()) {
                System.out.println("Draw");
                Bet.payOutTie();
                Bet.showCash();
            }
            System.out.println();
            Bet.checkcash();
            newHand();
        }

    }

    private void playerTurn() {

        while (true) {
            System.out.println("Hit or Stay");
            String choice = input.nextLine();
            if (choice.toUpperCase().equals("HIT")) {

                Card.dealToPlayer();
                System.out.println();
                showPlayerHand();
                System.out.println();
                showPlayerSum();
                System.out.println();
                playerBust();
                System.out.println();
                hiddenDealerHand();
                System.out.println();

            }

            else if (choice.toUpperCase().equals("STAY")) {
                break;
            } else {
                playerTurn();
            }

        }
    }

    private void dealerTurn() {
        while (true) {

            if (Card.calcDealerSum() < 16) {
                Card.dealToDealer();
                System.out.println();
                showDealerHand();
                System.out.println();
                showdealerSum();
            } else if (Card.calcDealerSum() >= 16) {
                System.out.println();
                if (Card.calcDealerSum() > 21) {
                    Bet.payOutWin();
                    System.out.println("Dealer has Busted");
                    System.out.println();
                    Bet.showCash();
                    newHand();
                } else {
                    System.out.println("Dealer Stays");
                }

                break;

            }
        }

    }

    private void newHand() {
        Bet.checkcash();
        System.out.println("Next hand? Yes or No");
        System.out.println();
        String playagain = input.nextLine();
        if (playagain.toUpperCase().equals("YES")) {
            Card.playercard.clear();
            Card.dealercard.clear();
            Card.deck.clear();
            play();

        } else if (playagain.toUpperCase().equals("NO")) {
            System.exit(0);
        } else {
            newHand();
        }
    }

    private void playerBust() {

        if (Card.calcPlayerSum() > 21) {
            System.out.println("Busted");
            System.out.println();
            newHand();

        }
    }

    public void showdealerSum() {
        System.out.println("Dealer has " + Card.calcDealerSum());

    }

    public void showPlayerSum() {
        System.out.println("You have " + Card.calcPlayerSum());

    }

    public void hiddenDealerHand() {
        System.out.println();
        System.out.println("Dealer Cards");

        for (int i = 0; i < Card.dealercard.size(); i++) {
            System.out.print("[ ] ");
        }

    }

    public void showDealerHand() {
        System.out.println();
        System.out.println("Dealer Cards");

        for (int i = 0; i < Card.dealercard.size(); i++) {
            BlackJackCard dc = Card.dealercard.get(i);

            if (dc.rank == 11) {
                System.out.print("J of " + dc.suit + "  ");
            }
            if (dc.rank == 12) {
                System.out.print("Q of " + dc.suit + "  ");
            }
            if (dc.rank == 13) {
                System.out.print("K of " + dc.suit + "  ");
            }
            if (dc.rank < 11 && dc.rank > 1) {
                System.out.print(dc.rank + " of " + dc.suit + "  ");
            }
            if (dc.rank == 1) {
                System.out.print("Ace of " + dc.suit + "  ");
            }
        }

    }

    public void showPlayerHand() {
        System.out.println();
        System.out.println("Player Cards");

        for (int i = 0; i < Card.playercard.size(); i++) {
            BlackJackCard pc = Card.playercard.get(i);
            if (pc.rank == 11) {
                System.out.print("J of " + pc.suit + "  ");
            }
            if (pc.rank == 12) {
                System.out.print("Q of " + pc.suit + "  ");
            }
            if (pc.rank == 13) {
                System.out.print("K of " + pc.suit + "  ");
            }
            if (pc.rank < 11 && pc.rank > 1) {
                System.out.print(pc.rank + " of " + pc.suit + "  ");
            }
            if (pc.rank == 1) {
                System.out.print("Ace of " + pc.suit + "  ");
            }

        }
    }
}
