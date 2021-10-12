/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution41 {
    public static void main(String[] args) throws FileNotFoundException {
        Solution41 sol = new Solution41();
        //create file.txt for the input of names in 'docs' directory

        //create a file obj
        File inputFile = new File("exercise41_input.txt");

        //create method to read from file, return an arrayList
        List<String> arrayList = new ArrayList<>();
        arrayList = sol.readInputFile(inputFile);

        //sort the arrayList with Collections class with sort method

        //output using the function
        sol.displayName(arrayList,"exercise41_output.txt");
    }
    private List<String> readInputFile(File inputFile) throws FileNotFoundException {
        //create a scanner linking the file
        Scanner input = new Scanner(inputFile);

        //make a list to store data
        List<String> names = new ArrayList<>();

        //read the file from Scanner class
        //store each name into the list
        //return that list

        return null;
    }

    private void displayName(List<String> arrayList, String fileName) {
        //create a file output
        //display the number of elements into output file
        //display -----
        //display names to the file
    }
}
