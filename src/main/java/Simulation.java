public class Simulation {
    /*
    Create Instance Variables
    -=-=-=-=-=-=-=-=-=-=-=-=-
    Bins to call Bins.
    Integer Number of Dice.
    Integer Number of Tosses.
    -=-=-=-=-=-=-=-=-=-=-=-=-
    */
    private Bins bins;
    private int numDice;
    private int numTosses;

    /*
    Create Constructor for Simulation class.
    */
    public Simulation(int numDice, int numTosses, int highRoll, int lowRoll){
        this.numDice = numDice;
        this.numTosses = numTosses;
        this.bins = new Bins(highRoll, lowRoll);
    }

    public void runSimulation() {
        Dice dice = new Dice(numDice);

        for (int i = 0; i < numTosses; i++) {
            int sum = dice.tossAndSum();
            bins.incrementBin(sum);
        }
    }

    public String game(){
        System.out.println("***\n" + "Simulation of " + numDice + " dice tossed for " +
                numTosses + " times.\n" + "***\n\n");

        for (int i = numDice; i <= 6 * numDice; i++) {
            System.out.printf("%2d : %8d: %.2f ", i, bins.getBin(i), (double) bins.getBin(i) / numTosses);
            for (int j = 0; j < (double) bins.getBin(i) / numTosses * 100; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        return "";
    }

    public static void main(String[] args) {
        Simulation simulation = new Simulation(2, 1000000, 2, 12);
        simulation.runSimulation();
        System.out.println(simulation.game());
    }

}
