package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class InputOutputFile {
    protected List<String> readInputFile(File inputFile) throws FileNotFoundException {
        try{//create a scanner linking the file
            Scanner input = new Scanner(inputFile);

            //make a list to store data
            List<String> names = new ArrayList<>();

            //read the file from Scanner class
            //store each name into the list
            while (input.hasNextLine()) {
                names.add(input.nextLine());
            }

            //return that list
            return names;
        } catch (FileNotFoundException e){
            System.out.println("file cannot be found.");
            return null;
        }
    }

    protected void displayName(List<String> arrayList, String fileName) {
        //create a file output
        //display the number of elements into output file
        //display -----
        //display names to the file
        try (Formatter output = new Formatter("data\\"+fileName+".txt") ){
            for(int i =0; i<arrayList.size();i++){
                output.format("%s%n",arrayList.get(i));
            }
        } catch (SecurityException| FileNotFoundException | FormatterClosedException e) {
            System.out.println("error on writing occurs...");
        }
    }
}
