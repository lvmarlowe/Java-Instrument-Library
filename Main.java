package lmarlowe_week13;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: LV Marlowe
 * @Assignment Name: lmarlowe_week13
 * @Date: Aug 14, 2022
 * @Description: This programs requests instruments by family and displays them
 */
//Imports
import java.util.Scanner;
import java.io.IOException;

//Begin Class Main
public class Main {

    //Create Validate and Scanner objects
    static Validate validator = new Validate();
    static Scanner input = new Scanner(System.in);

    //Create instrument objects
    static Strings myStrings = new Strings();
    static Woodwind myWoodwind = new Woodwind();
    static Percussion myPercussion = new Percussion();
    static Brass myBrass = new Brass();

    //Begin Main Method
    public static void main(String[] args) throws IOException, Exception {

        //Declare variables
        int menuOption = 0;
        int instrumentQuantity = 0;
        final int LOW = 1;
        final int HIGH = 6;
        String answerYesNo = null;
        String instrumentName = null;
        String instrumentFamily;

        //Begin main do-while loop
        do {

            //Begin menu do-while loop
            do {

                //Ask user to select option from menu
                menuOption = getMenuOption(input, menuOption, LOW, HIGH);

                //Begin read-write loop
                switch (menuOption) {

                    //If user selects 1, request brass instruments
                    case 1:
                        instrumentFamily = "brass";
                        instrumentsToArray(input, instrumentName,
                                instrumentQuantity, instrumentFamily);

                        //If user wants to display instruments, display them
                        if (displayInstruments(answerYesNo, instrumentFamily)
                                .equalsIgnoreCase("Y")) {
                            myBrass.play();
                        }
                        break;

                    //If user selects 2, request string instruments    
                    case 2:
                        instrumentFamily = "string";
                        instrumentsToArray(input, instrumentName,
                                instrumentQuantity, instrumentFamily);

                        //If user wants to display instruments, display them
                        if (displayInstruments(answerYesNo, instrumentFamily)
                                .equalsIgnoreCase("Y")) {
                            myStrings.play();
                        }
                        break;

                    //If user selects 3, request woodwind instruments    
                    case 3:
                        instrumentFamily = "woodwind";
                        instrumentsToArray(input, instrumentName,
                                instrumentQuantity, instrumentFamily);

                        //If user wants to display instruments, display them
                        if (displayInstruments(answerYesNo, instrumentFamily)
                                .equalsIgnoreCase("Y")) {
                            myWoodwind.play();
                        }
                        break;

                    //If user selects 4, request percussion instruments    
                    case 4:
                        instrumentFamily = "percussion";
                        instrumentsToArray(input, instrumentName,
                                instrumentQuantity, instrumentFamily);

                        //If user wants to display instruments, display them
                        if (displayInstruments(answerYesNo, instrumentFamily)
                                .equalsIgnoreCase("Y")) {
                            myPercussion.play();
                        }
                        break;

                    //If user selects 5, display instruments    
                    case 5:

                        //If file is empty, notify user
                        if (myBrass.getInstruments().isEmpty()
                                && myStrings.getInstruments().isEmpty()
                                && myWoodwind.getInstruments().isEmpty()
                                && myPercussion.getInstruments().isEmpty()) {
                            System.out.println("You haven't entered any "
                                    + "instruments");
                        }

                        //If instrument array lists are not empty, display them
                        if (!myBrass.getInstruments().isEmpty()) {
                            myBrass.play();
                        }
                        if (!myStrings.getInstruments().isEmpty()) {
                            myStrings.play();
                        }
                        if (!myWoodwind.getInstruments().isEmpty()) {
                            myWoodwind.play();
                        }
                        if (!myPercussion.getInstruments().isEmpty()) {
                            myPercussion.play();
                        }
                        break;

                    //If user chooses 6, exit program    
                    case 6:
                        sayGoodbye();
                        break;

                    //Otherwise, tell user they broke my program    
                    default:
                        System.out.print("\nYou broke my program. Congrats!\n\n");
                        System.exit(0);
                        break;
                } //End switch-case block

                //Repeat until user chooses not to enter instruments
            } while (enterInstruments(answerYesNo).equalsIgnoreCase("Y"));

            //Repeat until user chooses not to rerun program    
        } while (runAgain(answerYesNo).equalsIgnoreCase("Y"));

        //End program
        sayGoodbye();
    } //End main method

    /**
     * Method instrumentsToArray: Method to request instruments and add to array
     *
     * @param in
     * @param menu
     * @param L
     * @param H
     * @return 
     *
     */
    public static int getMenuOption(Scanner in, int menu, int L, int H) {
        do {
            //Request user selection
            System.out.println("What type of instrument would you like to enter?");
            System.out.println("\t1. Brass");
            System.out.println("\t2. String");
            System.out.println("\t3. Woodwind");
            System.out.println("\t4. Percussion");
            System.out.println("Or you can:");
            System.out.println("\t5. Display all instruments");
            System.out.println("\t6. Exit the program");
            System.out.print("RESPONSE: ");
            do {
                menu = getInteger(in);
                in.nextLine();
                validator.setValidateRange(menu, L, H);
            } while (!validator.getRange());
        } while (!validator.getRange());
        return menu;
    } //End getMenuOption

    /**
     * Method getInteger: Method to request integer upon invalid input
     *
     * @param in
     * @return
     *
     * Code borrowed from Lowe, Doug. Java All-in-One For Dummies, 6th Edition
     * (For Dummies (Computer/Tech)). 6th ed., For Dummies, 2020.
     *
     */
    public static int getInteger(Scanner in) {
        while (!in.hasNextInt()) {
            in.next();
            System.err.print("You must enter an integer. Try again: ");
        }
        return in.nextInt();
    } //End getInteger method

    /**
     * Method instrumentsToArray: Method to request instruments and add to array
     *
     * @param in
     * @param n
     * @param q
     * @param f
     *
     */
    public static void instrumentsToArray(Scanner in, String n, int q, String f) {
        System.out.printf("How many %s instruments would you like to enter?",
                f);
        System.out.print("\nRESPONSE: ");
        q = getInteger(in);
        for (int i = 0; i < q; i++) {
            System.out.printf("Enter %s instrument %d: ", f, i + 1);     
            n = in.next();
            switch (f) {
                case "brass":
                    myBrass.setInstruments(n);
                    break;
                case "string":
                    myStrings.setInstruments(n);
                    break;
                case "woodwind":
                    myWoodwind.setInstruments(n);
                    break;
                case "percussion":
                    myPercussion.setInstruments(n);
                    break;
            }
        }
    } //End instrumentsToArray method

    /**
     * Method enterInstruments: Method to ask if user wants to enter instruments
     *
     * @param a
     * @return
     *
     */
    public static String enterInstruments(String a) {
        System.out.println("Enter instruments? (Y or N)");
        System.out.print("RESPONSE: ");
        do {
            a = input.next();
            validator.setYesNo(a);
        } while (!validator.getYesNo());
        return a;
    } //End enterInstruments method

    /**
     * Method runAgain: Method to ask if user wants to rerun program
     *
     * @param a
     * @return 
     *
     */
    public static String runAgain(String a) {
        System.out.println("Run program again? (Y or N)");
        System.out.print("RESPONSE: ");
        do {
            a = input.next();
            validator.setYesNo(a);
        } while (!validator.getYesNo());
        return a;
    } //End runAgain method

    /**
     * Method displayInstruments: Method to display instruments
     *
     * @param a
     * @param f
     * @return 
     *
     */
    public static String displayInstruments(String a, String f) {
        System.out.printf("Display %s instruments? (Y or N) ", f);
        System.out.print("\nRESPONSE: ");
        do {
            a = input.next();
            validator.setYesNo(a);
        } while (!validator.getYesNo());
        return a;
    } //End displayInstruments method

    /**
     * Method sayGoodbye: Method to exit program
     *
     *
     */
    public static void sayGoodbye() {
        System.out.print("\nThank you for using the instrument list. "
                + "Goodbye!\n\n");
        System.exit(0);
    }
} //End Main Method

