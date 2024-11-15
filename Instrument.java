package lmarlowe_week13;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: LV Marlowe
 * @Assignment Name: lmarlowe_week13
 * @Date: Aug 14, 2022
 * @Subclass Instrument Description: This class is an abstract class for all
 * instruments
 */

//Begin Subclass Instrument
public abstract class Instrument {

    //Declare variable
    protected String instrument;

    /**
     * Method play: Abstract method for any class to use
     **/
    abstract public void play();
} //End Subclass Instrument
