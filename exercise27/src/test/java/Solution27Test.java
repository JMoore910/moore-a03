import baseline.Solution27;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {
    Solution27 sol27 = new Solution27();


    @Test
    public void test_first_name_validation() {
        //Since the output is a string containing errors, it should return error statement
        String expectedOutput = "The first name must be at least 2 characters long. \n";
        String actualOutput = "";
        actualOutput = sol27.firstNameValidation("A",actualOutput);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void test_last_name_validation(){
        //Since the output is a string containing errors, it should return error statement
        String expectedOutput = "The last name must be at least 2 characters long. \n";
        String actualOutput = "";
        actualOutput = sol27.lastNameValidation("B",actualOutput);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void test_filled_name_validation(){
        //Since the output is a string containing errors, it should return error statement
        String expectedOutput = "The first name must be filled in. \nThe last name must be filled in.  \n";
        String actualOutput = "";
        actualOutput = sol27.filledNameValidation("","",actualOutput);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void test_zip_validation(){
        //Since the output is a string containing errors, it should return error statement
        String expectedOutput = "The zipcode must be a 5 digit number. \n";
        String actualOutput = "";
        actualOutput = sol27.zipCodeValidation("1AB234C",actualOutput);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void test_id_validation(){
        //Since the output is a string containing errors, it should return error statement
        String expectedOutput = "The employee ID must be in the format of AA-1234. \n";
        String actualOutput = "";
        actualOutput = sol27.idFormatValidation("J1~2O21",actualOutput);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void test_input_validation(){
        //A test that runs all code and gets a valid response
        String expectedOutput = "There were no errors. \n";
        String actualOutput = sol27.validateInput("Jeanne","Moore","12345","JM-2021");
        assertEquals(expectedOutput,actualOutput);
    }
}
