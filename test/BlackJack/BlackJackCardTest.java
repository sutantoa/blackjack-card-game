
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
    
    /**
     * Test of createDeck method, of class BlackJackCard.
     */

    @Test
    public void testCreatedeck() {
        System.out.println("createdeck");
        BlackJackCard instance = new BlackJackCard();
        instance.createdeck();
    }

    /**
     * Test of shuffleDeck method, of class BlackJackCard.
     */
    
    @Test
    public void testShuffleDeck() {
        System.out.println("shuffleDeck");
        BlackJackCard instance = new BlackJackCard();
        instance.shuffleDeck();
    }
    
    /**
     * Test of dealToDealer method, of class BlackJackCard.
     */

    @Test
    public void testDealToDealer() {
        System.out.println("dealToDealer");
        BlackJackCard instance = new BlackJackCard();
        instance.dealToDealer();
    }

    /**
     * Test of dealToPlayer method, of class BlackJackCard.
     */
    
    @Test
    public void testDealToPlayer() {
        System.out.println("dealToPlayer");
        BlackJackCard instance = new BlackJackCard();
        instance.dealToPlayer();
    }
    
    /**
     * Test of calcDealerSum method, of class BlackJackCard.
     */

    @Test
    public void testCalcDealerSum() {
        System.out.println("calcDealerSum");
        BlackJackCard instance = new BlackJackCard();
        int expResult = 0;
        int result = instance.calcDealerSum();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of calcPlayerSum method, of class BlackJackCard.
     */

    @Test
    public void testCalcPlayerSum() {
        System.out.println("calcPlayerSum");
        BlackJackCard instance = new BlackJackCard();
        int expResult = 0;
        int result = instance.calcPlayerSum();
        assertEquals(expResult, result);
    }
}
