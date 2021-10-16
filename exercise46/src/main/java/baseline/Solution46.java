/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.*;

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

    public Map<String, Integer> parseAndCount(String rawData) {
        //parse the data input using split
        //store the result as String array
        String[] parsedData = rawData.split(",");

        //create a map to store result
        Map<String,Integer> wordToCountMap = new TreeMap<>();
        int tempCount;

        //iterate through the size of the array
        for(int i = 0; i < parsedData.length; i++) {
            //check each iteration:
            //      if the key already exists in the map, increment the count
            if(wordToCountMap.containsKey(parsedData[i])) {
                tempCount = wordToCountMap.get(parsedData[i]) + 1;  //increment the count
                wordToCountMap.put(parsedData[i],tempCount);        //write over the key-val pair with the new count
            } else {
                //if the key has not existed in the map, put in the map, make a 1-count
                wordToCountMap.put(parsedData[i],1);
            }
        }
        //return the Map
        return wordToCountMap;
    }

    public List<Integer> makeCountArr(Map<String, Integer> wordToCountMap) {
        //make a list of integer to store result
        List<Integer> countList = new ArrayList<>();

        //iterate through the map, get only to values to the list (making a countList)
        for(Map.Entry<String,Integer> entry: wordToCountMap.entrySet()) {
            countList.add(entry.getValue());
        }

        //sort the list (min-to-max)
        Collections.sort(countList);
        //reverse the order of the list (max-to-min)
        Collections.reverse(countList);

        //return that list
        return countList;
    }
}
