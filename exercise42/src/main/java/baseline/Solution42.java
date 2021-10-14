/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Solution42 {
    public static void main(String[] args) {
        FileReaderWriter inOutFile = new FileReaderWriter();
        Solution42 sol = new Solution42();

        //make a hardcoded .txt file from given problem
        //create a file obj
        File fileInput = new File("data\\exercise42_input.txt");

        //read the raw data input
        List<String> rawInput = inOutFile.readInputFile(fileInput);

        //parse the file
        List<ArrayList<String>> parsedInput = sol.ParseComma(rawInput);

        //display output as .txt file
        inOutFile.displayTableFormat(parsedInput);

        //display output to screen
        sol.displayTableFormat(parsedInput);
    }

    //method to parse the data split by comma
    private List<ArrayList<String>> ParseComma(List<String> rawInput) {
        //make a temp String to store each line before parsing
        //make a temp char[] to convert string to char[]
        //make a temp String

        //nested (outer)loop through size of List
        //  nested (middle)loop through char[] as long as it's not 'newLine'
        //      (inner)loop as long as it's not ','
        //          append each char to the temp String
        //      add temp string ArrayList
        //  add ArrayList to a [List-of-ArrayList]

        //return that list
        return null;
    }

    //this method shouldn't be in the FileReaderWriter class, since it's outputting to screen
    //method to display table format to screen
    private void displayTableFormat(List<ArrayList<String>> parsedInput) {
        //display heading "Last      First     Salary"
        //display heading "--------------------------"
        //loop through size of the list
        //  display content in each arrayList
        //      lastname, firstname, salary
    }
}
