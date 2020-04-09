package BlackJack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BlackJackPlayer extends Player {

    Scanner input = new Scanner(System.in);
    private int cash = 1000;
    private int playerbet = 0;

    public void bet() {

        System.out.println("Place your Bet");
        try {
            playerbet = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Not a Vaild bet");
            input.nextLine();
            bet();

        }
        
        if (checkBet(playerbet,cash)==false){
            bet();
        }
        
        cash = cash - playerbet;
        
        
        if (cash < 0) {

            System.out.println("Your out of Cash");

            System.exit(0);

        }


        input.nextLine();

    }
    
    
    public boolean checkBet(int bet, int cash){
        
        if (bet > cash) {
            System.out.println("Not enough cash to place bet");
     
            return false;
        }

        if (bet == 0) {
            System.out.println("Cannot have a bet of Zero");
    
            return false;
        }
        
        if (bet < 0 ){
            
            System.out.println("invalid bet");
          
            return false;
        
        }
              
        if (bet > 999999999 ){
            
            System.out.println("invalid bet");
          
            return false;
        
        }
        return true;
    
    }
    
    

    public void payOutWin() {
        cash = cash + playerbet + playerbet;

    }

    public void payOutTie() {
        cash = cash + playerbet;

    }

    public void checkcash() {

        playerbet = 0;

        if (cash <= 0) {
            System.out.println("Your out of Cash");

            System.exit(0);

        }

    }

    public void showCash() {

        System.out.println("Cash " + cash);
        if (playerbet > 0) {
            System.out.println("You bet " + playerbet);

        }

    }

}