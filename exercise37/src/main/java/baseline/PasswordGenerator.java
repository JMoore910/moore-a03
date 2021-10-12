package baseline;

import java.util.*;

import static java.lang.Integer.parseInt;

public class PasswordGenerator {
    //  Make Scanner public static final for all methods. Do the same for a Random() object
    public static final Scanner input = new Scanner(System.in);
    public static final Random rand = new Random();

    //Hard Coding Character Array Lists for alphabet, numbers, and special characters
    private static final ArrayList<Character> letters = new ArrayList<>(Arrays.asList(
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
            'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'));

    private static final ArrayList<Character> numbers = new ArrayList<>(Arrays.asList(
            '0','1','2','3','4','5','6','7','8','9'));

    private static final ArrayList<Character> specials = new ArrayList<>(Arrays.asList(
            '!','#','$','%','^','&','*','.'));


    private ArrayList<String> getUserInput() {
        ArrayList<String> inputArr = new ArrayList<>();
        boolean valid = false;
        while (!valid) {
            //  Prompt for password length
            System.out.print("What's the minimum length? ");
            inputArr.add(input.nextLine());
            //	prompt for number of special characters
            System.out.print("How many special characters? ");
            inputArr.add(input.nextLine());
            //	prompt for number of numbers
            System.out.print("How many numbers? ");
            inputArr.add(input.nextLine());

            valid = validateUserInput(inputArr);
            //  if inputValidation fails, clear out the list and start again
            if (!valid)
                inputArr.clear();
        }
        return inputArr;
    }


    public boolean validateUserInput(List<String> inputArr) {
        for(int i = 0; i < 3; i++) {
            if (!inputArr.get(i).matches("[0-9]+")) {
                System.out.println("All inputs must be integers. ");
                return false;
            }
        }
        return true;
    }


    private String passwordRandomizer(List<Character> charArray) {
        //  All method must do it randomly pick characters from the given list to arrange in a string
        StringBuilder build = new StringBuilder();
        String password;
        while (!charArray.isEmpty())
            build.append(charArray.remove(rand.nextInt(charArray.size())));
        password = build.toString();
        return password;
    }


    private String passwordBuilder(List<String> inputArr) {
        //  method takes inputArr and uses it to build a character array.
        //  first builds each array of special and letter characters
        ArrayList<Character> builtList = new ArrayList<>();

        //  update length to ensure letters are represented as much as numbers/special characters
        int length = parseInt(inputArr.get(0));
        int numLetters = parseInt(inputArr.get(1)) + parseInt(inputArr.get(2));

        //  generate a random number from 1 to 10 and add it to the minimum length
        //  this will become the new length of the password
        length += rand.nextInt(10);
        if (length < numLetters*2) {
            //  ensure that the length is large enough to hold at least as many letters as numbers + specials
            length = numLetters*2;
            length += rand.nextInt(10);
        }

        //  then the method will randomly pick characters from each array based on the number of
        //  characters specified by the user
        //  use for loops
        for (int i=0; i < parseInt(inputArr.get(1)); i++)
            builtList.add(specials.get(rand.nextInt(specials.size())));
        for (int i=0; i < parseInt(inputArr.get(2)); i++)
            builtList.add(numbers.get(rand.nextInt(numbers.size())));

        //  With the new length, make the remaining characters randomized letters
        while (builtList.size()<= length)
            builtList.add(letters.get(rand.nextInt(letters.size())));

        return passwordRandomizer(builtList);
    }

    public void generatePassword() {
        List<String> userInput;
        String password;
        userInput = getUserInput();
        password = passwordBuilder(userInput);
        System.out.println("Your password is " + password);
    }
}
