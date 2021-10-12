package baseline;

import static java.lang.Integer.parseInt;

public class Calculator {
    //Create a function: boolean validateInput (String number)
    public boolean validateInput(String number) {
        //  if the string is not numeric or 0, input is invalid
        if (!number.matches("[0-9]+") || parseInt(number) == 0) {
            System.out.println("Sorry. That's not valid input.");
            return false;
        }
        else
            return true;
    }

    //Create a function: int calculateReturn (int rate)
    public int calculateReturn(int rate) {
        int returnTime = 72/rate;
        if (72 % rate != 0) {
            //  if the rate divides unevenly into 72,
            //  round up a year by adding one
            returnTime ++;
        }
        return returnTime;
    }
}
