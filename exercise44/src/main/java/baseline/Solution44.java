/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.List;
import java.util.Scanner;

public class Solution44 {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //allocate Solution44 class
        Solution44 sol = new Solution44();

        //call a class JsonFileHandler to start the process on dealing with json file
        //the method should return a list of Product class
        JsonFileHandler jsonFileHandler = new JsonFileHandler();
        List<Product> list = jsonFileHandler.mainHandler();

        //call method findProduct passing in the list of Product
        //the method should return the index where the searching product is located
        int itemIndex = sol.findProduct(list);

        //display using overridden-toString the result since we have all info
        System.out.println(list.get(itemIndex).toString());
    }

    private int findProduct(List<Product> list){
        String name;
        while (true) {
            //call method getNameFromUser to prompt and get name from user
            name = getNameFormUser();
            //search through the list if there's a match
            for(int i = 0; i<list.size(); i++) {
                //if found, return the index
                if(list.get(i).getName().equals(name))
                    return i;
            }
            //if not found, display not found. ask for another input
            System.out.println("Sorry, that product was not found in our inventory.");
        }
    }

    private String getNameFormUser() {
        //display prompt to get name of product
        System.out.print("What is the product name?: ");
        //read String from user
        //return that string
        return in.nextLine();
    }
}
