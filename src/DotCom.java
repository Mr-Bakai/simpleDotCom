
import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;


    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);   // google it

        if (index >= 0) {
            locationCells.remove(index);                //Using ArrayList’s remove( ) method to delete an entry

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("\tOuch! you sunk" + name + " :");
            } else {
                result = "hit";

            }
        }

        return result;
    }
}



    /*
    //private int[] locationCells;


    private ArrayList  locationCells;
    private int numOfHits = 0;

    public void setLocationCells(ArrayList locationCells){
        this.locationCells = locationCells;
    }


    public String checkYourself(String userInput){        //GET the user guess
        String result = "\nmiss ";

        //int guess = Integer.parseInt(stringGuess);       // CONVERT   the user guess to an int

        int index = locationCells.indexOf(userInput);


        if(index >= 0){
            locationCells.remove(index);


            if(locationCells.isEmpty()){

                result = "kill";
            }else {
                result = "hit";
            }
        }                                                     //for (int cell: locationCells ) {                    //REPEAT with each cell in the int array
                                                             //    if(guess == cell){                              //IF the user guess matches
                                                             //        result = "\nhit";
                                                             //        numOfHits++;
                                                             //        break;                                      //Get out of the loop, no need to test the other cells
                                                             //    }
                                                             //}


                                                            //if(numOfHits == locationCells.length ){             //// FIND OUT if it was the last cell
                                                            //   result = "kill";
                                                            //  }
                                                           // System.out.println(result);
        return result;

     */

