package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public record InputOutputFile(String changeFrom, String changeTo) {

    public String getChangeFrom() {
        return changeFrom;
    }
    public String getChangeTo() {
        return changeTo;
    }

    public String[] readFile() {
        //create a scanner link to the file input .txt
        File inFile = new File("data\\exercise45_input.txt");
        try (Scanner input = new Scanner(inFile)) {
            //loop as long as input doesn't meet end-of-file marker
            StringBuilder rawData = new StringBuilder();
            while (input.hasNextLine()) {
                //  read input one line at a time
                //  keep appending the string
                rawData.append(input.nextLine()).append('\n');
            }
            //delete the last '\n'
            rawData.deleteCharAt(rawData.length() - 1);

            //parse the string using split
            //store result as string[]
            //return that string[]
            return rawData.toString().split(" ");
        } catch (FileNotFoundException e) {
            System.out.println("input file cannot be opened.");
            return new String[0];
        }
    }

    public StringBuilder replaceWords(String[] originalString) {
        //allocate the StringBuilder to store result
        StringBuilder result = new StringBuilder();

        //loop through the string[]
        for (String s : originalString) {
            //check one word at a time (one string at a time)
            if (s.contains(getChangeFrom())) {
                //  if the word contains the keyword changeFrom
                //      replace that word
                result.append(s.replace(getChangeFrom(), getChangeTo())).append(" ");
            } else {
                //  appends the word to StringBuilder
                //  also append ' ' (one space) to it as separation of the word
                result.append(s).append(" ");
            }
        }
        //delete the last white space
        result.deleteCharAt(result.length() - 1);

        //return the result StringBuilder
        return result;
    }

    public void displayOutput(StringBuilder output) {
        //allocate a BufferedWriter link to the output .txt file
        //write the output to the .txt file

    }
}
