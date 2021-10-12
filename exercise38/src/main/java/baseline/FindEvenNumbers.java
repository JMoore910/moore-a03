package baseline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class FindEvenNumbers {  //  Make Scanner public static final for any methods who need it
    public static final Scanner input = new Scanner(System.in);

    public String getUserInput() {
        //	prompt user to input a list of numbers separated by spaces
        String nums = "";
        boolean valid = false;
        while (!valid) {
            System.out.print("Enter a list of numbers, separated by spaces: ");
            nums = input.nextLine();
            valid = inputValidation(nums);
        }
        return nums;
    }

    public boolean inputValidation(String nums) {
        if (!nums.matches("[0-9 ]+")) {
            System.out.print("Please give only numbers and spaces in your input ");
            return false;
        }
        return true;
    }

    public List<String> findEvens(String nums) {
        ArrayList<String> evens = new ArrayList<>();
        List<String> numList;
        numList = Arrays.asList(nums.split("\\s"));   //MAY BE "\s*" or "\\s" INSTEAD
        for (String str : numList) {
            if (parseInt(str) % 2 == 0)
                evens.add(str);
        }
        return evens;
    }


    public void printList(List<String> list) {
        System.out.print("The even numbers are:");
        for (String str : list)
            System.out.printf(" %s",str);
        System.out.println(".");
    }

    public void findEvens(){
        String nums = getUserInput();
        List<String> evens;
        evens = findEvens(nums);
        printList(evens);
    }
}
