/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution42 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReaderWriter inOutFile = new FileReaderWriter();
        Solution42 sol = new Solution42();

        //make a hardcoded .txt file from given problem
        //create a file obj
        File fileInput = new File("data\\exercise42_input.txt");

        //read the raw data input
        List<String> rawInput = inOutFile.readInputFile(fileInput);

        //parse the file
        List<ArrayList<String>> parsedInput = sol.parseComma(rawInput);

        //display output as .txt file
        inOutFile.displayTableFormat(parsedInput);

        //display output to screen
        sol.displayTableFormat(parsedInput);
    }

    //method to parse the data split by comma
    private List<ArrayList<String>> parseComma(List<String> rawInput) {
        //make a temp String to store each line before parsing
        //make a temp String
        List<ArrayList<String>> parsedByComma = new ArrayList<>();
        //nested (outer)loop through size of List
        for (String s : rawInput) {
            //split the data using split()
            ArrayList<String> eachPerson = new ArrayList<>(Arrays.asList(s.split(",")));
            //add temp string ArrayList
            parsedByComma.add(eachPerson);
        }
        //return that list
        return parsedByComma;
    }

    //this method shouldn't be in the FileReaderWriter class, since it's outputting to screen
    //method to display table format to screen
    private void displayTableFormat(List<ArrayList<String>> parsedInput) {
        //display heading "Last      First     Salary"
        System.out.println("Last      First     Salary");
        //display heading "--------------------------"
        System.out.println("--------------------------");

        //loop through size of the list
        //  display content in each arrayList to file
        //      lastname, firstname, salary
        for (ArrayList<String> strings : parsedInput) {
            for (String string : strings) {
                System.out.printf("%-10s", string);
            }
            System.out.printf("%n");
        }
    }
}
