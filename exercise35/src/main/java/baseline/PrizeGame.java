package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PrizeGame {
    public static final Random rand = new Random();
    //Make a public static final Scanner
    public static final Scanner input = new Scanner(System.in);

    public void inputList(List<String> nameList) {
        String name;
        for (int i = 0; i < 6; i ++) {
            //  prompt for user to input a name
            System.out.print("Enter a name: ");
            name = input.nextLine();
            if (!name.equals("")) {
                //  name is not blank, add it
                nameList.add(name);
            }
        }
    }

    public int generateRandom() {
        return rand.nextInt(6);
    }

    public String pickWinner(List<String> nameList, int randNum) {
        String winner;
        if (nameList.isEmpty()) {
            winner = "Nobody because you failed to enter any names";
        } else {
            winner = nameList.get(randNum);
        }

        return "The winner is... " + winner + "!!!";
    }

    public void prizeGame(){
        List<String> nameList = new ArrayList<>();
        //  pass the array list into inputList to get input and fill it with names
        inputList(nameList);
        int randNum = generateRandom();
        //  use random number to pick a name randomly from the list
        System.out.println(pickWinner(nameList, randNum));
    }
}
