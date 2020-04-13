
package BlackJack;

import org.junit.Before;
import org.junit.Test;

public class BlackJackGameTest {
    
    public BlackJackGameTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    /**
     * Test of checkWin method, of class BlackJackGame.
     */

    @Test
    public void testCheckWin() {
        System.out.println("checkWin");
        BlackJackGame instance = new BlackJackGame();
        instance.checkWin();
    }
    
    /**
     * Test of showDealerSum method, of class BlackJackGame.
     */

    @Test
    public void testShowdealerSum() {
        System.out.println("showdealerSum");
        BlackJackGame instance = new BlackJackGame();
        instance.showdealerSum();
    }
    
    /**
     * Test of showPlayerSum method, of class BlackJackGame.
     */

    @Test
    public void testShowPlayerSum() {
        System.out.println("showPlayerSum");
        BlackJackGame instance = new BlackJackGame();
        instance.showPlayerSum();
    }
    
    /**
     * Test of hiddenDealerHand method, of class BlackJackGame.
     */

    @Test
    public void testHiddenDealerHand() {
        System.out.println("hiddenDealerHand");
        BlackJackGame instance = new BlackJackGame();
        instance.hiddenDealerHand();
    }
    
    /**
     * Test of showDealerHand method, of class BlackJackGame.
     */

    @Test
    public void testShowDealerHand() {
        System.out.println("showDealerHand");
        BlackJackGame instance = new BlackJackGame();
        instance.showDealerHand();
    }
    
    /**
     * Test of showPlayerHand method, of class BlackJackGame.
     */

    @Test
    public void testShowPlayerHand() {
        System.out.println("showPlayerHand");
        BlackJackGame instance = new BlackJackGame();
        instance.showPlayerHand();
    }
}
