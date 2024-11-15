package lmarlowe_week13;

/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: LV Marlowe
 * @Assignment Name: lmarlowe_week13
 * @Date: Aug 14, 2022
 * @Subclass Woodwind Description: 
 */

//Imports
import java.util.ArrayList;

//Begin Subclass Woodwind
public class Woodwind extends Blown {

    ArrayList<String> woodwindArrayList = new ArrayList<>();
    protected String family;

    /**
     * Method Color. Takes no parameters. Hard-coded values.
     */
    public Woodwind() {
        super();
        this.instrument = "instrument";
        this.family = "woodwind";
        this.method = "played by blowing into it";
    }

    /**
     *
     * @param woodwind
     */
    public void setInstruments(String woodwind) {
        woodwindArrayList.add(woodwind);
    }

    public ArrayList getInstruments() {
        return woodwindArrayList;
    }

    /**
     * Method play: Overriding method to play woodwind instruments
     **/
    @Override
    public void play() {
        for (int i = 0; i < woodwindArrayList.size(); i++) {
            instrument = woodwindArrayList.get(i);
            System.out.printf("The %s is a %s instrument, which is %s.\n",
                    instrument, family, method);
        }
    } //End play method
} //End Subclass Woodwind