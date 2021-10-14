package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileReaderWriter {
    protected List<String> readInputFile(File fileInput) throws FileNotFoundException {
        //make a list to store rawData from the file
        List<String> rawData = new ArrayList<>();

        //link the file with scanner
        try(Scanner input = new Scanner(fileInput)) {
            //read the file from Scanner class
            //store each name into the list
            while (input.hasNextLine()){
                rawData.add(input.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("input file cannot be found.");
        }

        //return that list
        return rawData;
    }

    protected void displayTableFormat(List<ArrayList<String>> parsedInput) {
        //creating a file output.txt
        try (Formatter output = new Formatter("data\\exercise42_output.txt")){
            //display heading "Last      First     Salary" to file
            //display heading "--------------------------" to file
            output.format("Last      First     Salary%n");
            output.format("--------------------------%n");
            //loop through size of the list
            //  display content in each arrayList to file
            //      lastname, firstname, salary
            for (ArrayList<String> strings : parsedInput) {
                for (String string : strings) {
                    output.format("%-10s", string);
                }
                output.format("%n");
            }
        } catch (SecurityException| FileNotFoundException | FormatterClosedException e) {
            System.out.println("output to .txt file has error");
        }
    }
}
