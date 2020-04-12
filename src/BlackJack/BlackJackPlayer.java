package BlackJack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BlackJackPlayer extends Player {

    Scanner input = new Scanner(System.in);
    private int cash = 1000;
    private int playerbet = 0;

    public void bet() {
        
        do{

            System.out.println("Place your Bet");
            try {

                if(input.hasNextLine()){


                    playerbet = Integer.parseInt(input.nextLine());

                    System.out.println("Bet: " + playerbet);

                    /*if (cash < 0) {

                        System.out.println("You're out of Cash");

                        System.exit(0);

                    }*/
                }

            } catch (InputMismatchException e) {
                System.out.println("Not a Vaild bet");

                /*if(input.hasNextLine()){
                    playerbet = input.nextInt();
                    //bet();
                }*/

            }catch (NumberFormatException e){
                System.out.println("Not a Valid bet");
            }

            /*if (!checkBet(playerbet,cash)){
                bet();
            }*/

            //input.nextLine();

        }while(!checkBet());
        
        cash = cash - playerbet;

    }
    
    
    public boolean checkBet(){
        
        if (playerbet > cash) {
            System.out.println("Not enough cash to place bet");
     
            return false;
        }

        /*if (playerbet == 0) {
            System.out.println("Cannot have a bet of Zero");
    
            return false;
        }*/
        
        if (playerbet <= 0 ){
            
            System.out.println("Invalid bet");
          
            return false;
        
        }
              
        if (playerbet > 999999999 ){
            
            System.out.println("Invalid bet");
          
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
            System.out.println("You're out of Cash");

            System.exit(0);

        }

    }

    public void showCash() {

        System.out.println("Cash: " + cash);
        if (playerbet > 0) {
            System.out.println("You bet " + playerbet);

        }

    }

}