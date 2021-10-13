/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class Solution41 {
    public static void main(String[] args) throws FileNotFoundException {
        InputOutputFile inOutFile = new InputOutputFile();
        //create file.txt for the input of names in 'docs' directory

        //create a file obj
        File inputFile = new File("data\\exercise41_input.txt");

        //create method to read from file, return an arrayList
        List<String> arrayList = new ArrayList<>();
        arrayList = inOutFile.readInputFile(inputFile);

        //sort the arrayList with Collections class with sort method

        //output using the function
        inOutFile.displayName(arrayList,"data\\exercise41_output.txt");
    }
}
