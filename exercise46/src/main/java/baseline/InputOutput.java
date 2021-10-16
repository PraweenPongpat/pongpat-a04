package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class InputOutput {
    public String readFromFile() {
        //create a File obj linked to the input given .txt file
        File inputFile = new File("data\\exercise46_input.txt");
        //create a scanner obj linked to that file
        try(Scanner input = new Scanner(inputFile)){
            StringBuilder rawData = new StringBuilder();

            //start reading using loop, as long as not meeting end marker
            while (input.hasNext()) {
                //  read one word at a time, putting comma between each word
                //  store the result to a StringBuilder
                rawData.append(input.next()).append(",");
            }
            //return that string builder
            return rawData.toString();
        } catch (FileNotFoundException e) {
            System.out.println("file input cannot be opened");
            return null;
        }
    }

    protected void outputToScreen(Map<String, Integer> wordToCount, List<Integer> countOccurrencesList) {
        //create the set of keys using keySet, used to retrieve the value from the key

        //iterate through the set of keys
        //  get index of most front value from the list
        //  retrieve the key from that value
        //  display both key and value in a proper format
        //  increment index of list
    }
}
