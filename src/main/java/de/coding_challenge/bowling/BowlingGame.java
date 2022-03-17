package de.coding_challenge.bowling;


import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a bowling game
 */
public class BowlingGame {

    // List of all rolls
    private List<Integer> all_rolls = new ArrayList<>(21);

    /**
     * Add knocked out pins to the list of all rolls
     * @param pins
     */
    public void roll(int pins){
        all_rolls.add(pins);
    }

    /**
     * Add a list of rolls to BowlingGame
     * @param rolls
     */
    public void addRolls(int[] rolls){
        for(int roll : rolls){
            roll(roll);
        }
    }

    /**
     * Return the actual score of the player
     * @return
     */
    public int getScore(){
        int score = 0;
        int index = 0;

        for(int i = 0; i < 10; i++){
            if(isStrike(index)){
                score += all_rolls.get(index) + all_rolls.get(index + 1) + all_rolls.get(index + 2);
                index++;
            }else if(isSpare(index, index + 1)) {
                score += all_rolls.get(index) + all_rolls.get(index + 1) + all_rolls.get(index + 2);
                index += 2;
            }else {
                score += all_rolls.get(index) + all_rolls.get(index + 1);
                index += 2;
            }
        }

        return score;
    }

    /**
     * Check if the first roll was a strike
     * @param first_roll
     * @return
     */
    private Boolean isStrike(int first_roll){
        return all_rolls.get(first_roll) == 10;
    }

    /**
     * Check if current frame is a spare
     * @param first_roll
     * @param second_roll
     * @return
     */
    private Boolean isSpare(int first_roll, int second_roll){
        return all_rolls.get(first_roll) + all_rolls.get(second_roll) == 10;
    }
}
