package lmarlowe_week13;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: LV Marlowe
 * @Assignment Name: lmarlowe_week13
 * @Date: Aug 14, 2022
 * @Subclass Brass Description: This class extends the Blown class and overrides
 * the play method
 */

//Imports
import java.util.ArrayList;

//Begin Subclass Brass
public class Brass extends Blown {
    
    //Declare variables
    ArrayList<String> brassArrayList = new ArrayList<>();
    protected String family;

    /**
     * Method Brass: Method to hard code values
     **/
    public Brass() {
        super();
        this.instrument = "instrument";
        this.family = "brass";
        this.method = "played by blowing into it";
    } //End Brass method

    /**
     *Method setInstruments: Method to set brass instruments
     * 
     * @param brass
     **/
    public void setInstruments(String brass) {
        brassArrayList.add(brass);
    } //End setInstruments method

    /**
     *Method getInstruments: Method to get brass instruments
     * 
     * @return
     **/
    public ArrayList getInstruments() {
        return brassArrayList;
    } //End getInstruments method

    /**
     * Method play: Overriding method to play brass instruments
     **/
    @Override
    public void play() {
        for (int i = 0; i < brassArrayList.size(); i++) {
            instrument = brassArrayList.get(i);
            System.out.printf("The %s is a %s instrument, which is %s.\n",
                    instrument, family, method);
        }
    } //End play method

} //End Subclass Brass
