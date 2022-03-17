package de.coding_challenge.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test Driven Development approach of Bowling game cata
 */
public class BowlingGameTest{

    BowlingGame bowling;

    // Initialize BowlingGame before starting any Testcase
    @Before
    public void setup(){
        bowling = new BowlingGame();
    }

//    /**
//     * Test if a player can create a BowlingGame
//     * TDD - Test is obsolete after created the BowlingGame class
//     */
//    @Test
//    public void testIfPlayerCanCreateNewBowlingGame() {
//        BowlingGame bowling = new BowlingGame();
//    }

//    /**
//     * Test if a player can roll a ball in a bowling game
//     * TDD - Test is obsolete after created the roll method
//     */
//    @Test
//    public void testIfPlayerCanRollABall(){
//        BowlingGame bowling = new BowlingGame();
//        bowling.roll();
//    }

//    /**
//     * Test if a player can knock down pins in first roll
//     * TDD - Test is obsolete after updated the roll method with int parameter in the signature
//     */
//    @Test
//    public void testIfPlayerCanKnockOutPinsInFirstAndSecondRoll(){
//        bowling.roll(1);
//        bowling.roll(7);
//    }

//    /**
//     * Test if BowlingGame can get a list of rolls
//     * TDD - Test is obsolete after creating the method
//     */
//    @Test
//    public void testIfBowlingGameCanGetAListOfRolls(){
//        int[] rolls = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
//        bowling.getRolls(rolls);
//    }

    /**
     * Test if a player can have an open frame (a frame with score zero)
     */
    @Test
    public void testIfAPlayerCanHaveAnOpenFrame(){
        int[] rolls = new int[]{0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        bowling.addRolls(rolls);
        assertEquals(0, bowling.getScore());
    }

    /**
     * Test if a player ca knock down 1 pin in first roll and 7 pins in second roll
     */
    @Test
    public void testIfAPlayerCanRollOneThanSevenInFirstFrame(){
        int[] rolls = new int[]{1,7, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        bowling.addRolls(rolls);
        assertEquals(8, bowling.getScore());
    }


    /**
     * Test if a player can score a strike followed by two ones
     */
    @Test
    public void testIfAPlayerCanScoreAStrikeAndThanOneAndOne(){
        int[] rolls = new int[]{10, 1,1, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        bowling.addRolls(rolls);
        assertEquals(14, bowling.getScore());
    }

    /**
     * Test if a player can score a spare
     */
    @Test
    public void testIfAPlayerCanScoreASpareAndThanOneAndOne(){
        int[] rolls = new int[]{8,2, 1,1, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        bowling.addRolls(rolls);
        assertEquals(13, bowling.getScore());
    }

    /**
     * Test if a player can score a double (two strikes in a row) followed by two ones
     */
    @Test
    public void testIfAPlayerCanScoreADoubleAndThanOneAndOne(){
        int[] rolls = new int[]{10, 10, 1,1, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        bowling.addRolls(rolls);
        assertEquals(35, bowling.getScore());
    }

    /**
     * Test if a player can score a turkey (three strikes in a row) followed by two ones
     */
    @Test
    public void testIfAPlayerCanScoreATurkeyAndThanOneAndOne(){
        int[] rolls = new int[]{10, 10, 10, 1,1, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        bowling.addRolls(rolls);
        assertEquals(65, bowling.getScore());
    }

    /**
     * Test if a player can score a perfect game (strikes only)
     */
    @Test
    public void testIfAPlayerCanScoreAPerfectGame(){
        int[] rolls = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        bowling.addRolls(rolls);
        assertEquals(300, bowling.getScore());
    }
}
