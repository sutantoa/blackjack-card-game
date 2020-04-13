
package BlackJack;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BlackJackPlayerTest {
    
    public BlackJackPlayerTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of checkBet method, of class BlackJackPlayer.
     */
    @Test
    public void testCheckBet() {
        System.out.println("checkBet");
        int bet = 100;
        int cash = 1000;
        BlackJackPlayer instance = new BlackJackPlayer();
        boolean expResult = true;
        boolean result = instance.checkBet(bet, cash);
        assertEquals(expResult, result);
    }
    @Test
    public void testCheckBetNeg() {
        System.out.println("checkBet");
        int bet = -990;
        int cash = 1000;
        BlackJackPlayer instance = new BlackJackPlayer();
        boolean expResult = false;
        boolean result = instance.checkBet(bet, cash);
        assertEquals(expResult, result);
    }
    @Test
    public void testCheckBetBoundry() {
        System.out.println("checkBet");
        int bet = 1999999990;
        int cash = 100;
        BlackJackPlayer instance = new BlackJackPlayer();
        boolean expResult = false;
        boolean result = instance.checkBet(bet, cash);
        assertEquals(expResult, result);
    }
    @Test
    public void testCheckBetOverbet() {
        System.out.println("checkBet");
        int bet = 12000;
        int cash = 1000;
        BlackJackPlayer instance = new BlackJackPlayer();
        boolean expResult = false;
        boolean result = instance.checkBet(bet, cash);
        assertEquals(expResult, result);
    }

    /**
     * Test of payOutWin method, of class BlackJackPlayer.
     */
    
    @Test
    public void testPayOutWin() {
        System.out.println("payOutWin");
        BlackJackPlayer instance = new BlackJackPlayer();
        instance.payOutWin();
    }

    /**
     * Test of payOutTie method, of class BlackJackPlayer.
     */
    
    @Test
    public void testPayOutTie() {
        System.out.println("payOutTie");
        BlackJackPlayer instance = new BlackJackPlayer();
        instance.payOutTie();
    }

    /**
     * Test of checkcash method, of class BlackJackPlayer.
     */
    
    @Test
    public void testCheckcash() {
        System.out.println("checkcash");
        BlackJackPlayer instance = new BlackJackPlayer();
        instance.checkcash();
    }

    /**
     * Test of showCash method, of class BlackJackPlayer.
     */
    
    @Test
    public void testShowCash() {
        System.out.println("showCash");
        BlackJackPlayer instance = new BlackJackPlayer();
        instance.showCash();
    }
}
