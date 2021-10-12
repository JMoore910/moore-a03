package baseline;

public class Password {
    public int passwordValidator(String password) {
        if (password.length() < 8) {
            //string is less than 8 characters
            //strength is either very weak, weak, or unknown(less than 8 but mix of chars)

            //password is purely numeric, return 1 (very weak)
            if (password.matches("[0-9]+"))
                return 1;

                //password is purely letters , return 2 (weak)
            else if (password.matches("[a-zA-Z]+"))
                return 2;

                //neither case is met, return 0 (unknown)
            else
                return 0;
        } else {
            //more than 8 characters
            //strength is either strong, very strong, or unknown
            return strengthValidator(password);
        }
    }


    private int strengthValidator(String password) {

        int numCount = 0;
        int alphaCount = 0;
        //use .isDigit and .isAlphabetic to find the count of letters, numbers, and special characters
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)))
                numCount++;
            else if (Character.isAlphabetic(password.charAt(i)))
                alphaCount++;
            else
            if (alphaCount > 0 && numCount > 0)
                return 4;
        }
        if (alphaCount > 0 && numCount > 0)
                return 3;

        //password contains only one type of char, return 0 (unknown)
        return 0;
    }
}
