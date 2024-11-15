package lmarlowe_week13;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: LV Marlowe
 * @Assignment Name: lmarlowe_week13
 * @Date: Aug 14, 2022
 * @Subclass Blown Description: This abstract class extends the Instrument
 * subclass and overrides the play method
 */
 
//Begin Subclass Blown
public abstract class Blown extends Instrument {

    //Declare variable
    protected String method;
        
    /**
     * Default constructor
     **/
    public Blown() {
        super();
        this.instrument = "instrument";
        this.method = "played by blowing into it";
    }

    /**
     * Constructor for user entered data
     *
     * @param blown
     **/
    public Blown(String blown) {
        super();
        this.instrument = blown;
        this.method = "played by blowing into it";
    }

    /**
     * Method play: Overriding method to play blown instruments
     **/
    @Override
    public void play() {
        System.out.printf("The %s is %s.\n", instrument, 
                method);
    } //End play method
} //End Subclass Blown
