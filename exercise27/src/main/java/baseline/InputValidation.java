package baseline;

public class InputValidation {
    //  Create Functions:

    public String firstNameValidation(String firstName, String outputString) {
        if (firstName.length() < 2) {
            //  concatenate "The first name must be at least 2 characters long.  \n" to OutputString
            outputString = outputString.concat("The first name must be at least 2 characters long. \n");
        }
        return outputString;
    }

    public String lastNameValidation(String lastName, String outputString) {
        if (lastName.length() < 2) {
            //  concatenate "The last name must be at least 2 characters long.  \n" to OutputString
            outputString = outputString.concat("The last name must be at least 2 characters long. \n");
        }
        return outputString;
    }

    public String filledNameValidation(String firstName, String lastName, String outputString) {
        if ((firstName.equals("")) || (lastName.equals(""))) {
            if(firstName.equals("")) {
                //  concatenate "The first name must be filled in.  \n" to OutputString
                outputString = outputString.concat("The first name must be filled in. \n");
            }
            if (lastName.equals("")) {
                //  concatenate "The last name must be filled in.  \n" to OutputString
                outputString = outputString.concat("The last name must be filled in.  \n");
            }
        }
        return outputString;
    }

    public String zipCodeValidation(String zip, String outputString) {
        if ((!zip.matches("[0-9]+")) || (zip.length() != 5)) {
            //  concatenate "The zipcode must be a 5 digit number. \n" to OutputString
            outputString = outputString.concat("The zipcode must be a 5 digit number. \n");
        }
        return outputString;
    }

    public String idFormatValidation(String id, String outputString) {
        if ((id.length() != 7) || (!Character.isLetter(id.charAt(0))) || (!Character.isLetter(id.charAt(1))) ||
                (!Character.isDigit(id.charAt(3))) || (!Character.isDigit(id.charAt(4))) ||
                (!Character.isDigit(id.charAt(5))) || (!Character.isDigit(id.charAt(6))) || (id.charAt(2) != '-')) {
            //  concatenate "The employee ID must be in the format of AA-1234. \n"  to OutputString
            outputString = outputString.concat("The employee ID must be in the format of AA-1234. \n");
        }
        return outputString;
    }

    public String validateInput(String firstName, String lastName, String zip, String id) {
        String outputString = "";
        outputString = firstNameValidation(firstName, outputString);
        outputString = lastNameValidation(lastName, outputString);
        outputString = filledNameValidation(firstName, lastName, outputString);
        outputString = zipCodeValidation(zip, outputString);
        outputString = idFormatValidation(id, outputString);
        if (outputString.equals("")) {
            //  concatenate "There were no errors. \n" to OutputString
            outputString = outputString.concat("There were no errors. \n");
        }
        return outputString;
    }

}
