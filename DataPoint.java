// TODO: Add the appropriate file header comment here.


// TODO: Add the appropriate class header comment here.
public class DataPoint {
    // The number and races represented in this data point.  DO NOT CHANGE.
    public int numRaces = 8;
    private String[] races = {"White", "Black", "LatinX", "Asian", "AIAN",
                              "NHPI", "Multiracial", "Other"};

    // TODO: Add private member variables here. *
    
    private String date;
    private String state;
    private int totalCases;
    private int[] casesByRace;



    // TODO: Add comment and implement *
    public DataPoint(String dateIn, String stateIn, int totalCasesIn, int[] casesByRaceIn){
        this.date = dateIn;
        this.state = stateIn;
        this.totalCases = totalCasesIn;
        this.casesByRace = casesByRaceIn;
        
    }

    public String getDate() {
        return this.date;
    }
 
    public String getState() {    
        return this.state;
    }

    public int getCasesByRace(int raceIndex) {
        return this.casesByRace[raceIndex];
    }
  
    public int getTotalCases() {
        return this.totalCases;
    }

    /**
    * Return the race name associated with the given index in this data point.
    * Preconditions: index is between 0 (inclusive) and numRaces (8) (exclusive)
    *
    * DO NOT CHANGE.
    *
    * @param index The index of the race.
    * @return The name of the race (e.g. "White" or "LatinX")
    */
    public String getRaceName(int index)
    {
        return this.races[index];
    }
}
