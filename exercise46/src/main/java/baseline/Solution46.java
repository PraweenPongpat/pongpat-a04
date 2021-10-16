/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.List;
import java.util.Map;

public class Solution46 {
    public static void main(String[] args) {
        //make an input .txt file
        //allocate Solution46
        Solution46 sol = new Solution46();

        //allocate the InputOutputFile class
        InputOutput inOut = new InputOutput();

        //pass that input file into the readFile method
        String rawData = inOut.readFromFile();

        //parse and count the string
        Map<String,Integer> wordToCount = sol.parseAndCount(rawData);

        //create a list of integer to store all the occurrences
        //sort the list of integer from max-to-min also
        List<Integer> countOccurrencesList = sol.makeCountArr(wordToCount);

        //display the output passing in the list
        inOut.outputToScreen(wordToCount,countOccurrencesList);
    }

    private Map<String, Integer> parseAndCount(String rawData) {
        //parse the data input using split
        //store the result as String array

        //create a map to store result
        //iterate through the size of the array
        //check each iteration:
        //      if the key already exists in the map, increment the count
        //      if the key has not existed in the map, put in the map, make a 1-count

        //return the Map
        return null;
    }

    private List<Integer> makeCountArr(Map<String, Integer> wordToCount) {
        //make a list of integer to store result

        //iterate through the map, get only to values to the list (making a countList)

        //sort the list (min-to-max)
        //reverse the order of the list (max-to-min)

        //return that list
        return null;
    }
}
