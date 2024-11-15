package lmarlowe_week13;

/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: LV Marlowe
 * @Assignment Name: lmarlowe_week13
 * @Date: Aug 14, 2022
 * @Subclass Fingered Description: This abstract class extends the Instrument
 * subclass and overrides the play method
 */

//Begin Subclass Fingered
public abstract class Fingered  extends Instrument {

   protected String method;
        
    /**
     * Default constructor
     */
    public Fingered() {
        super();
        this.instrument = "instrument";
        this.method = "played using fingers or a bow";
    }

    /**
     * Constructor for user entered data
     *
     * @param fingered
     */
    public Fingered(String fingered) {
        super();
        this.instrument = fingered;
        this.method = "played using fingers or a bow";
    }

    /**
     * Method play: Overriding method to play fingered instruments
     **/
    @Override
    public void play() {
        System.out.printf("The %s is %s.\n", instrument, 
                method);
    } //End play method
} //End Subclass Fingered