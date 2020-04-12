package BlackJack;
import java.util.Scanner;

public class BlackJackGame {

    Scanner input = new Scanner(System.in);
    private BlackJackCard card = new BlackJackCard();
    private BlackJackPlayer bet = new BlackJackPlayer();

    public void play() {
        System.out.println();

        bet.checkcash();
        bet.showCash();
        bet.bet();

        card.createdeck();
        card.shuffleDeck();

        card.dealToPlayer();
        card.dealToDealer();
        card.dealToPlayer();
        card.dealToDealer();

        showPlayerHand();
        card.calcPlayerSum();
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
        if (card.calcDealerSum() < 22 && card.calcPlayerSum() < 22) {
            if (card.calcDealerSum() > card.calcPlayerSum()) {
                System.out.println("Dealer wins");
                bet.showCash();
            }
            if (card.calcPlayerSum() > card.calcDealerSum()) {
                System.out.println("You win");
                bet.payOutWin();
                bet.showCash();

            }

            if (card.calcPlayerSum() == card.calcDealerSum()) {
                System.out.println("Draw");
                bet.payOutTie();
                bet.showCash();
            }
            System.out.println();
            bet.checkcash();
            newHand();
        }

    }

    private void playerTurn() {

        while (true) {
            System.out.println("Hit or Stay");
            String choice = input.nextLine();
            if (choice.toUpperCase().equals("HIT")) {

                card.dealToPlayer();
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

            if (card.calcDealerSum() < 16) {
                card.dealToDealer();
                System.out.println();
                showDealerHand();
                System.out.println();
                showdealerSum();
            } else if (card.calcDealerSum() >= 16) {
                System.out.println();
                if (card.calcDealerSum() > 21) {
                    bet.payOutWin();
                    System.out.println("Dealer has Busted");
                    System.out.println();
                    bet.showCash();
                    newHand();
                } else {
                    System.out.println("Dealer Stays");
                }

                break;

            }
        }

    }

    private void newHand() {
        bet.checkcash();
        System.out.println("Next hand? Yes or No");
        System.out.println();
        if(input.hasNextLine()){
            String playagain = input.nextLine();
            if (playagain.toUpperCase().equals("YES")) {
                card.getPlayercard().clear();
                card.getDealercard().clear();
                card.getDeck().clear();
                play();

            } else if (playagain.toUpperCase().equals("NO")) {
                System.exit(0);
            } else {
                newHand();
            }
        }
    }

    private void playerBust() {

        if (card.calcPlayerSum() > 21) {
            System.out.println("Busted");
            System.out.println();
            newHand();

        }
    }

    public void showdealerSum() {
        System.out.println("Dealer has " + card.calcDealerSum());

    }

    public void showPlayerSum() {
        System.out.println("You have " + card.calcPlayerSum());

    }

    public void hiddenDealerHand() {
        System.out.println();
        System.out.println("Dealer Cards");

        for (int i = 0; i < card.getDealercard().size(); i++) {
            System.out.print("[ ] ");
        }

    }

    public void showDealerHand() {
        System.out.println();
        System.out.println("Dealer Cards");

        for (int i = 0; i < card.getDealercard().size(); i++) {
            BlackJackCard dc = card.getDealercard().get(i);

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

        for (int i = 0; i < card.getPlayercard().size(); i++) {
            BlackJackCard pc = card.getPlayercard().get(i);
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
