package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class InputOutputFile {
    protected List<String> readInputFile(File inputFile) throws FileNotFoundException {
        //create a scanner linking the file
        List<String> names;
        try (Scanner input = new Scanner(inputFile)) {

            //make a list to store data
            names = new ArrayList<>();

            //read the file from Scanner class
            //store each name into the list
            while (input.hasNextLine()) {
                names.add(input.nextLine());
            }
            //return that list
            return names;
        } catch (FileNotFoundException e){
            System.out.println("file cannot be found.");
            return Collections.emptyList();
        }
    }

    protected void displayName(List<String> arrayList) {
        //create a file output
        //display the number of elements into output file
        //display -----
        //display names to the file
        try (Formatter output = new Formatter("data\\"+ "exercise41_output" +".txt") ){
            output.format("There are %d names%n",arrayList.size());
            output.format("-----------------%n");
            for (String name : arrayList) {
                output.format("%s%n", name);
            }
        } catch (SecurityException| FileNotFoundException | FormatterClosedException e) {
            System.out.println("error on writing occurs...");
        }
    }
}
