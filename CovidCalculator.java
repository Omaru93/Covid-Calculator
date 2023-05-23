//import jdk.tools.jlink.internal.plugins.VendorVMBugURLPlugin;
import java.util.HashMap;
import java.util.*; 

 
import java.util.Collections;
import java.util.List;

// TODO: Add the appropriate file header comment

// TODO: Add the appropriate class header comment
class CovidCalculator {
    private DataPoint[] points;  // The data points to use in the calculations

    // TODO: add comment and implement method.
    public CovidCalculator(DataPoint[] input)
    {
        this.points = new DataPoint[input.length];
        for (int index = 0; index < this.points.length; index++){
            this.points[index] = input[index];
        }     
    }

    // TODO: Add comment and implement method.
    public double findAverageCases(String date)
    {   int listOfStates = 0;
        double totalCases = 0;
        double averageCases = 0;
        for (DataPoint currentData : this.points){
            if (date.equals(currentData.getDate())){
                listOfStates += 1;
                totalCases += currentData.getTotalCases();
                averageCases = totalCases / listOfStates;
            }                                        
        }        

        return averageCases;
    }
    // private String[] races = {"White", "Black", "LatinX", "Asian", "AIAN",
    // "NHPI", "Multiracial", "Other"};
    // TODO: Add comment and implement method.
    public String findRaceWithHighestCases(String date, String state){
        int highestCases = 0;
        String nameOfHighestCase = ""; 
        for (int index = 0; index < this.points.length; ++index){
            if (date.equals(this.points[index].getDate()) && state.equals(this.points[index].getState())){
                for (int i = 0; i < 8; ++i){
                    if (this.points[index].getCasesByRace(i) > highestCases){

                        highestCases = this.points[index].getCasesByRace(i);
                        nameOfHighestCase = this.points[index].getRaceName(i);
                    
                    }   
                        
                    
                } 

            }
        } return nameOfHighestCase;
    }





    public List myStat(String date, int threshold){
        String lowestCases = "";
        List<String> statesWithLowCases = new ArrayList<>();         
        for (int index = 0; index < this.points.length; ++index){
            if (date.equals(this.points[index].getDate())){
                if (this.points[index].getTotalCases() < threshold){
                    lowestCases = this.points[index].getState();                    
                    statesWithLowCases.add(lowestCases);
                }

            }
        } return statesWithLowCases;

    }
        

    public String dateWithLowestCases(String state){
        String lowestCases = "";
        int lowestNumOfCases = 1000000000;         
        for (int index = 0; index < this.points.length; ++index){
            if (state.equals(this.points[index].getState())){
                if (this.points[index].getTotalCases() < lowestNumOfCases){
                    lowestCases = this.points[index].getState();                    
                    
                }

            }
        } return lowestCases;
    }

        
}
