
package BlackJack;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BlackJackCardTest {
    
    public BlackJackCardTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testCreatedeck() {
        System.out.println("createdeck");
        BlackJackCard instance = new BlackJackCard();
        instance.createdeck();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testShuffleDeck() {
        System.out.println("shuffleDeck");
        BlackJackCard instance = new BlackJackCard();
        instance.shuffleDeck();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDealToDealer() {
        System.out.println("dealToDealer");
        BlackJackCard instance = new BlackJackCard();
        instance.dealToDealer();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDealToPlayer() {
        System.out.println("dealToPlayer");
        BlackJackCard instance = new BlackJackCard();
        instance.dealToPlayer();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCalcDealerSum() {
        System.out.println("calcDealerSum");
        BlackJackCard instance = new BlackJackCard();
        int expResult = 0;
        int result = instance.calcDealerSum();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCalcPlayerSum() {
        System.out.println("calcPlayerSum");
        BlackJackCard instance = new BlackJackCard();
        int expResult = 0;
        int result = instance.calcPlayerSum();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
