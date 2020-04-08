package BlackJack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BlackJackPlayer extends Player {

    Scanner input = new Scanner(System.in);
    private int cash = 1000;
    private int playerbet = 0;
    
    public int clearBet(){
    
        this.playerbet = 0;
        return this.playerbet;
        
    }

    public void setBet(){
            System.out.println("Place your Bet");
        try {
            playerbet = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Not a Vaild bet");
            input.nextLine();
            bet();

        }
    }
    
    public boolean checkBet (int bet, int cash){
        
        cash = this.cash;
        
        cash = cash - bet;
        
        if(bet < 0 ){
            return false;
        }
         
        if(bet > cash ){
            return false;
        }
        if (bet > 999999999){
            
            return false;
        
        }
        return true; 
        
    }
    
    public void bet() {
        
        if(checkBet(playerbet, cash) == false){
        System.out.println("invaild bet"); 
        bet();
        }
        cash = cash - playerbet;
        
        if (playerbet == 0){
            System.out.println("Can't Bet Zero");
            bet();
        }

        if (playerbet > cash) {
            System.out.println("Not enough cash to place bet");
            bet();
        }

        if (playerbet == 0) {
            System.out.println("Cannot have a bet of Zero");
            bet();
        }
        

        if (cash < 0) {

            System.out.println("Your out of Cash");

            System.exit(0);

        }
        input.nextLine();

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