package lmarlowe_week13;

/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: LV Marlowe
 * @Assignment Name: lmarlowe_week13
 * @Date: Aug 14, 2022
 * @Subclass Strings Description:  This class extends the Fingered subclass and
 * overrides the play method
 */

//Imports
import java.util.ArrayList;

//Begin Subclass Strings
public class Strings extends Fingered {
    
    //Declare variables
    ArrayList<String> stringsArrayList = new ArrayList<>();
    protected String family;

    /**
     * Method Strings: Method to hard code values
     */
    public Strings() {
        super();
        this.instrument = "instrument";
        this.family = "string";
        this.method = "played with fingers or a bow";
    } //End Strings method

    /**
     * Method setInstruments: Method to set string instruments
     * 
     * @param strings
     **/
    public void setInstruments(String strings) {
        stringsArrayList.add(strings);
    } //End setInstruments method

    /**
     * Method getInstruments: Method to get string instruments
     * 
     * @return
     **/
    public ArrayList getInstruments() {
        return stringsArrayList;
    } //End getInstruments method

    /**
     * Method play: Overriding method to play string instruments
     **/
    @Override
    public void play() {

        for (int i = 0; i < stringsArrayList.size(); i++) {
            instrument = stringsArrayList.get(i);
            System.out.printf("The %s is a %s instrument, which is %s.\n",
                    instrument, family, method);
        }
    } //End play method

} //End Subclass Strings