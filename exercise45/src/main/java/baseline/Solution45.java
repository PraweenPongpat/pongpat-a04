/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.Scanner;

public class Solution45 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Solution45 sol = new Solution45();

        //create the string that we want to modify from
        String changeFrom = "utilize";
        //create the string that we want to modify to
        String changeTo = "use";

        //prompt and ask user for the nameOfFileOutput
        String outputFileName = sol.getString();

        //create a constructor for InputOutputFile class
        InputOutputFile inputOutputFile = new InputOutputFile(changeFrom,changeTo);

        //read the input .txt file
        String[] originalString = inputOutputFile.readFile();

        //modify the string[]
        StringBuilder modifiedString = inputOutputFile.replaceWords(originalString);

        //display the modified String
        inputOutputFile.displayOutput(modifiedString,outputFileName);
    }

    private String getString() {
        String result;
        while(true) {
            //display prompt
            System.out.print("What is the name of output File (no extension .txt)?: ");
            //read user input and return that string
            result = input.nextLine();
            if(result.contains(".txt")){
                System.out.println("do not include .txt file extension! try again");
            }
            else
                return result;
        }
    }
}
