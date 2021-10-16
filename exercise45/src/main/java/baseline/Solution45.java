/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

public class Solution45 {
    public static void main(String[] args) {
        //create the string that we want to modify from
        String changeFrom = "utilize";
        //create the string that we want to modify to
        String changeTo = "use";

        //create a constructor for InputOutputFile class
        InputOutputFile inputOutputFile = new InputOutputFile(changeFrom,changeTo);

        //read the input .txt file
        String[] originalString = inputOutputFile.readFile();

        //modify the string[]
        StringBuilder modifiedString = inputOutputFile.replaceWords(originalString);

        //display the modified String
        inputOutputFile.displayOutput(modifiedString);
    }
}
