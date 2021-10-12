package baseline;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Employee {
    public List<String> createLinkedList(List<String> nameList) {
        nameList.add("John Smith");
        nameList.add("Jackie Jackson");
        nameList.add("Chris Jones");
        nameList.add("Amanda Cullen");
        nameList.add("Jeremy Goodwin");
        return nameList;
    }

    public List<String> removeNode(List<String> nameList, String name) {
        nameList.remove(name);
        return nameList;
    }

    public void printNameList(List<String> nameList) {
        System.out.print("\nThere are " + nameList.size() + " employees.\n");
        for (String name : nameList)
            System.out.println(name);
    }

    public void removeEmployee(){
        Scanner input = new Scanner(System.in);
        List<String> nameList = new LinkedList<>();
        nameList = createLinkedList(nameList);
        printNameList(nameList);
        //  prompt user to enter an employee name to remove
        System.out.print("Enter an employee name to remove: ");
        //  receive name as input from user
        String name = input.nextLine();
        nameList = removeNode(nameList, name);
        printNameList(nameList);
    }
}
