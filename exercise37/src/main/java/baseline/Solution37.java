package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sean Moore
 */

/*
    Create an application that processes user input to generate a random password
    User must pass in three integers as input, the minimum password length, the
    number of random numbers that will be in the password, and the number of
    random special characters that will be in the password.

    Create a list with all possible characters of each type:
        specialList()
        numberList()
        letterList()
 */

public class Solution37 {
    //  Make Scanner public static final for all methods. Do the same for a Random() object
    //  public static final Scanner input = new Scanner(System.in)
    //  public static final Random rand = new Random();


    //  Create Method: public static ArrayList<String> getUserInput()
    //      boolean valid = false
    //		while (!valid)
    //			ArrayList<String> inputArr = new ArrayList<String>();
    //			Prompt for password length
    //			inputArr.add(input.nextLine());
    //			prompt for number of special characters
    //			inputArr.add(input.nextLine));
    //			prompt for number of numbers
    //			inputArr.add(input.nextLine));
    //			valid = validateUserInput(inputArr)
    //      return inputArr


    //  Create Method: public static boolean validateUserInput(ArrayList<String> inputArr)
    //      boolean valid = true;
    //      String output = “”;
	//  	for(int i = 0, i < 3, i++)
    //          if !(inputArr.get(i).matches(“[0-9]+”))
    //              output.concat: “All inputs must be integers”
    //              valid = false;
	//  	return valid;


    //  Create Method:  public static ArrayList<Character> buildCharList(ArrayList<Character> charList,char low, char high)
    //      method takes in the character at the low end and high end of a range and builds
    //      a list of all characters within that range using a for loop
    //      for (low, low <= high, low ++)
    //          charList.add(low)
    //      return charList


    //  Create Method: public static String passwordRandomizer(ArrayList<Character> charArray)
    //      All method must do it randomly pick characters from the given list to arrange in a string
    //      StringBuilder build = new StringBuilder();
    //      String password;
    //      while (charArray.size() != 0)
    //          build.append(charArray.remove(rand.nextInt(charArray.size())))
    //      password = build.toString();
    //      return password;


    //------------------------------------------------------------------------------------------------
    //  Create Method: public static String passwordBuilder(ArrayList<String> inputArr)
    //      method takes inputArr and uses it to build a character array.
    //      first builds each array of special and letter characters
    //      ArrayList<Character> specialList = new ArrayList<Character>;
    //      ArrayList<Character> letterList = new ArrayList<Character>;
    //      ArrayList<Character> builtList = new ArrayList<Character>
    //      specialList = buildCharList('!','.');
    //      specialList = buildCharList(':','@');
    //      letterList = buildCharList('a','z');
    //      letterList = buildCharList('A','Z');
    //
    //
    //      Once the two arrays are built,
    //      now generate a random number from 1 to 10 and add it to the minimum length
    //      this will become the new length of the password
    //      int length = parseInt(inputArr.get(0)) + rand.nextInt(10);
    //
    //
    //      then the method will randomly pick characters from each array based on the number of
    //      characters specified by the user
    //      use for loops
    //      for (int i=0; i < parseInt(inputArr.get(1)); i++)
    //          builtList.add(specialList.get(rand.nextInt(specialList.size())))
    //      for (int i=0; i < parseInt(inputArr.get(2)); i++)
    //          builtList.add((Character)rand.nextInt(10)
    //
    //
    //      With the new length, make the remaining characters randomized letters
    //      while (builtList.size()<= length)
    //          builtList.add(letterList.get(rand.nextInt(letterList.size())))
    //
    //
    //      return passwordRandomizer(builtList);
    //-----------------------------------------------------------------------------------------------


    public static void main(String[] args) {
        //  ArrayList<String> userInput = new ArrayList<String>();
        //  String password;
        //  userInput = getUserInput();
        //  password = passwordBuilder();
        //  print: "Your password is " + password
    }
}
