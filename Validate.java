package lmarlowe_week13;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: LV Marlowe
 * @Assignment Name: lmarlowe_week12
 * @Date: Aug 14, 2022
 * @Subclass Validate Description: This subclass validates user input
 */

//Begin Validate subclass
public class Validate {

    //Declare variable
    private boolean FLAG;

    /**
     * Method @setYesNo: Method to check if answer is Y or N
     *
     * @param answer
     */
    public void setYesNo(String answer) {
        if (!(answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N"))) {
            System.err.print("Invalid input. Please enter only a Y for Yes or "
                    + "an N for No: ");
            FLAG = false;
        } else if (answer.equalsIgnoreCase("y")) {
            //System.out.println();
            FLAG = true;
        } else {
            FLAG = true;
        }
    } //End setYesNo method

    /**
     * Method @getYesNo: Method to return flag for yes or no
     *
     * @return
     */
    public boolean getYesNo() {
        return FLAG;
    } //End getYesNo method

    /**
     * Method @setValidateRange: Method to validate a range
     *
     * @param x
     * @param minVal
     * @param maxVal
     */
    public void setValidateRange(int x, int minVal, int maxVal) {
        if ((x < minVal) || (x > maxVal) /*|| (!isInteger(x))*/) {
            System.err.printf("Invalid input. Please limit your choice to "
                    + "between %d and %d: ", minVal, maxVal);
            FLAG = false;
        } else {
            FLAG = true;
        }
    } //End setValidateRange method

    /**
     * Method @getRange: Method to return flag for range
     *
     * @return
     */
    public boolean getRange() {
        return FLAG;
    } //End method getRange
} //End Subclass Validate
