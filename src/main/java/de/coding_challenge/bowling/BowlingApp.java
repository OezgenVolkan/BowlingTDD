package de.coding_challenge.bowling;

/**
 * Main
 */
public class BowlingApp
{
    public static void main( String[] args )
    {
        BowlingGame bowling = new BowlingGame();
        int[] rolls = new int[]{1,4, 4,5, 6,4, 5,5, 10, 0,1, 7,3, 6,4, 10, 2,8,6};
        bowling.addRolls(rolls);

        System.out.println("Players score is: " + bowling.getScore());
    }
}
