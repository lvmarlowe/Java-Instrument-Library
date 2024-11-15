package lmarlowe_week13;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: LV Marlowe
 * @Assignment Name: lmarlowe_week13
 * @Date: Aug 14, 2022
 * @Subclass Percussion Description: This class extends the Struck subclass and
 * overrides the play method
 */

//Imports
import java.util.ArrayList;

//Begin Subclass Percussion
public class Percussion extends Struck {

    //Declare variables
    ArrayList<String> percussionArrayList = new ArrayList<>();
    protected String family;

    /**
     * Method Percussion: Method to hard code values
     **/
    public Percussion() {
        super();
        this.instrument = "instrument";
        this.family = "percussion";
        this.method = "played by striking it";
    }

    /**
     * Method setInstruments: Method to set percussion instruments
     *
     * @param percussion
     *
     */
    public void setInstruments(String percussion) {
        percussionArrayList.add(percussion);
    } //End setInstruments method

    /**
     * Method getInstruments: Method to get percussion instruments
     *
     * @return
     */
    public ArrayList getInstruments() {
        return percussionArrayList;
    } //End getInstruments method

    /**
     * Method play: Overriding method to play percussion instruments
     **/
    @Override
    public void play() {
        for (int i = 0; i < percussionArrayList.size(); i++) {
            instrument = percussionArrayList.get(i);
            System.out.printf("The %s is a %s instrument, which is %s.\n",
                    instrument, family, method);
        }
    } //End play method
} //End Subclass Percussion
