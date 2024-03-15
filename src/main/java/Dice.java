import java.util.Random;

public class Dice {

    /*
    Create Instant Variables
    -=-=-=-=-=-=-=-=-=-=-=-=-
    Int Number of Rolls.
    Random for random number.
    -=-=-=-=-=-=-=-=-=-=-=-=-
     */
    private Integer numRolls;
    private Random random;


    // Create Constructor for Dice
    public Dice(int numRolls){
        this.numRolls = numRolls;
        this.random = new Random();
    }

    // Create method for Toss and Sum.
    private Integer tossAndSum() {
        int sum = 0;

        for (int i = 0; i < this.numRolls; i++) {
            sum += random.nextInt(6) + 1;   // Gets random number from dice.
        }
        return sum;
    }

}
