/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rajvindersandhu
 */
public class BlackJackPlayerTest {
    
    public BlackJackPlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of clearBet method, of class BlackJackPlayer.
     */
    @Test
    public void testClearBet() {
        System.out.println("clearBet");
        BlackJackPlayer instance = new BlackJackPlayer();
        int expResult = 0;
        int result = instance.clearBet();
        assertEquals(expResult, result);
    }


    @Test
    public void testCheckBet() {
        System.out.println("checkBet");
        int bet = 100;
        int cash = 10000;
        BlackJackPlayer instance = new BlackJackPlayer();
        boolean expResult = true;
        boolean result = instance.checkBet(bet, cash);
        assertEquals(expResult, result);

    }
    @Test
    public void testCheckBetNegitve() {
        System.out.println("checkBet");
        int bet = -100;
        int cash = 10000;
        BlackJackPlayer instance = new BlackJackPlayer();
        boolean expResult = false;
        boolean result = instance.checkBet(bet, cash);
        assertEquals(expResult, result);

    }
    @Test
    public void testCheckBetBoundry() {
        System.out.println("checkBet");
        int bet = 1000000000;
        int cash = 10000;
        BlackJackPlayer instance = new BlackJackPlayer();
        boolean expResult = false;
        boolean result = instance.checkBet(bet, cash);
        assertEquals(expResult, result);

    }
    @Test
    public void testCheckOverbet() {
        System.out.println("checkBet");
        int bet =  10001;
        int cash = 10000;
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
