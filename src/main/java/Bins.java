
public class Bins {
    /*
    Create instant variables
    -=-=-=-=-=-=-=-=-=-=-=-=-
    Highest Roll
    Lowest Roll
    An array of Result
    -=-=-=-=-=-=-=-=-=-=-=-=-
     */
    private Integer highRoll;
    private Integer lowRoll;
    private Integer[] result;

    /*
    Create a constructor for Bins
     */
    public Bins(int lowRoll, int highRoll){
        this.highRoll = highRoll;
        this.lowRoll = lowRoll;
        result = new Integer[this.highRoll - this.lowRoll + 1];
    }

    /*
    Create Method for increment of Result[]
     */

    public void incrementBin(int rollTotal){
        result[rollTotal - lowRoll] += 1;
    }

    /*
    Create Method for getBin
    -=-=-=-=-=-=-=-=-=-=-
    return Result[]
     */

    public Integer getBin(Integer roll) {
        return result[roll - lowRoll];
    }
}
