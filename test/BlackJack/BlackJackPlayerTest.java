
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

    @Test
    public void testBet() {
        System.out.println("bet");
        BlackJackPlayer instance = new BlackJackPlayer();
        instance.bet();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCheckBet() {
        System.out.println("checkBet");
        BlackJackPlayer instance = new BlackJackPlayer();
        boolean expResult = false;
        boolean result = instance.checkBet();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPayOutWin() {
        System.out.println("payOutWin");
        BlackJackPlayer instance = new BlackJackPlayer();
        instance.payOutWin();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPayOutTie() {
        System.out.println("payOutTie");
        BlackJackPlayer instance = new BlackJackPlayer();
        instance.payOutTie();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCheckcash() {
        System.out.println("checkcash");
        BlackJackPlayer instance = new BlackJackPlayer();
        instance.checkcash();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testShowCash() {
        System.out.println("showCash");
        BlackJackPlayer instance = new BlackJackPlayer();
        instance.showCash();
        //fail("The test case is a prototype.");
    }
    
}
