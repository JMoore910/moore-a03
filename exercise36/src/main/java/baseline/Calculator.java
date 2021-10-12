package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Calculator {
    //Make Scanner public static final here for all methods in class to use
    public static final Scanner input = new Scanner(System.in);


    public double average(List<Integer> numList) {
        //      use for each loop:
        double avg=0;
        double count=0;
        for (int i : numList) {
            avg += i;
            count++;
        }
        if (count == 0)
            count ++;
        return avg/count;
    }

    public int max(List<Integer> numList) {
        //      use for each loop:
        int max = 0;
        for (int i : numList) {
            if (max < i)
                max = i;
        }
        return max;
    }

    public int min(List<Integer> numList) {
        //      use for each loop:
        int min = MAX_VALUE;
        for (int i : numList) {
            if (min > i)
                min = i;
        }
        return min;
    }


    public double std(List<Integer> numList, double avg) {
        //      use for each loop:
        double sum = 0;
        for (int i: numList)
            sum += pow(i-avg, 2);
        return sqrt(sum / numList.size());
    }


    public List<Integer> inputList(List<Integer> numList) {
        //      use while loop
        String numIn;
        while (true) {
            System.out.print("Enter a number: ");
            numIn = input.nextLine();
            if ((numIn.matches("[0-9]+")) && (numIn.length()!=0))
                numList.add(parseInt(numIn));
                //Ensure the list is not empty. Trap user in loop until at least one number is given
            else if ((numIn.equals("done")) && (numList.isEmpty()))
                return numList;
        }
    }

    public void printValues(List<Integer> numList, int min, int max, double avg, double std) {
        System.out.print("Numbers: ");
        for (int i: numList)
            System.out.printf("%d, ",i);
        System.out.printf("%nThe average is %.2f.",avg);
        System.out.printf("%nThe minimum is %d", min);
        System.out.printf("%nThe maximum is %d", max);
        System.out.printf("%nThe standard deviation is %.2f.",std);
    }

    public void runCalculator(){
        //  Receive input and store it as an ArrayList
        int max;
        int min;
        double avg;
        double std;
        List<Integer> numList = new ArrayList<>();
        numList = inputList(numList);
        //  Calculate Average, maximum, and minimum
        //  then use average to calculate standard deviation
        avg = average(numList);
        max = max(numList);
        min = min(numList);
        std = std(numList, avg);
        printValues(numList, min, max, avg, std);
    }
}
