package baseline;

import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Heartrate {
    public void printTable(double rest, int age) {
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");
        double percent;
        double target;
        for (percent = 55; percent <= 95; percent += 5) {
            target = calculateTarget(rest, percent/100, age);
            System.out.println(String.format("%.0f",percent) + "%          | " + String.format("%.0f",target) + " bpm");
        }
    }

    public double calculateTarget(double rest, double intensity, int age) {
        return (((220 - age) - rest) * intensity) + rest;
    }

    public boolean validateInput(String rest, String age) {
        //  if rest is not a number or age is not a number, input is invalid
        return (rest.matches("[0-9]+")) && (age.matches("[0-9]+"));
    }

    public void run(){
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        String restIn;
        String ageIn;
        double rest;
        int age;
        restIn = "";
        ageIn = "";
        //  Enter input validation loop:
        while(!valid) {
            //    Prompt for user to input resting pulse and age
            System.out.print("Enter resting pulse: ");
            restIn = input.nextLine();
            System.out.print("Enter age: ");
            ageIn = input.nextLine();
            //    pass the input strings into input validation method
            valid = validateInput(restIn,ageIn);
            if (!valid)
                System.out.println("Please enter resting pulse and age as numeric values.");
        }
        //  After exiting loop, parseInt and parseDouble to turn input into respective types
        rest = parseDouble(restIn);
        age = parseInt(ageIn);
        //  rest and age are then passed into printTable function
        printTable(rest,age);
    }


}
