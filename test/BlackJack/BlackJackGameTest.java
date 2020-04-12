
package BlackJack;

import org.junit.Before;
import org.junit.Test;
//import static org.junit.Assert.*;

/**
 *
 * @author MANDA
 */
public class BlackJackGameTest {
    
    public BlackJackGameTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testPlay() {
        System.out.println("play");
        BlackJackGame instance = new BlackJackGame();
        instance.play();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCheckWin() {
        System.out.println("checkWin");
        BlackJackGame instance = new BlackJackGame();
        instance.checkWin();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testShowdealerSum() {
        System.out.println("showdealerSum");
        BlackJackGame instance = new BlackJackGame();
        instance.showdealerSum();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testShowPlayerSum() {
        System.out.println("showPlayerSum");
        BlackJackGame instance = new BlackJackGame();
        instance.showPlayerSum();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testHiddenDealerHand() {
        System.out.println("hiddenDealerHand");
        BlackJackGame instance = new BlackJackGame();
        instance.hiddenDealerHand();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testShowDealerHand() {
        System.out.println("showDealerHand");
        BlackJackGame instance = new BlackJackGame();
        instance.showDealerHand();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testShowPlayerHand() {
        System.out.println("showPlayerHand");
        BlackJackGame instance = new BlackJackGame();
        instance.showPlayerHand();
        //fail("The test case is a prototype.");
    }
    
}
