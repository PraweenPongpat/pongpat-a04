/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.ArrayList;
import java.util.List;

public class Solution45 {
    public static void main(String[] args) {
        //allocate Solution45
        Solution45 sol = new Solution45();

        //make the .txt file input
        InputOutputFile inputOutputFile = new InputOutputFile();

        //read the file input as a list of list
        //an outer list is the whole paragraph
        //multiple inner lists is each line context
        List<ArrayList<String>> parsedInput = inputOutputFile.readTextFile();

        //make a string to store utilizes
        //make a string to store uses
        //call method replaceWord passing in changeFrom and changeTo
        List<ArrayList<String>> modifyInput = sol.replaceWord("","",parsedInput);

        //output the string to a text file
        inputOutputFile.outputTextFile(modifyInput);
    }

    private List<ArrayList<String>> replaceWord(String changeFrom, String changeTo,List<ArrayList<String>> parsedInput) {
        //go through the list (paragraph)
        //  go through the arrayList (each line)
        //      check if the current word matches the changeFrom
        //      if so, change set the current word to changeTo (replace it)
        //      if not, keep looking

        //return the list
        return null;
    }

}
