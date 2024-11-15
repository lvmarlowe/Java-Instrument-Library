package lmarlowe_week13;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: LV Marlowe
 * @Assignment Name: lmarlowe_week13
 * @Date: Aug 14, 2022
 * @Subclass Struck Description: This abstract class extends the Instrument
 * subclass and overrides the play method
 */
//Begin Subclass Struck
public abstract class Struck extends Instrument {

    protected String method;

    /**
     * Default constructor
     *
     */
    public Struck() {
        super();
        this.instrument = "instrument";
        this.method = "played by striking it";
    }

    /**
     * Constructor for user entered data
     *
     * @param struck
     *
     */
    public Struck(String struck) {
        super();
        this.instrument = struck;
        this.method = "played by striking it";
    }

    /**
     * Method play: Overriding method to play struck instruments
     *
     */
    @Override
    public void play() {
        System.out.printf("The %s is %s.\n", instrument,
                method);
    } //End play method
} //End Subclass Struck
