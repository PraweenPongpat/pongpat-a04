package baseline;

import java.io.File;
import java.util.List;

public class JsonFileHandler {

    public List<Product> mainHandler(){
        //make the exercise44_input.json file
        //allocate the .json file knowing that the input is in data--->.json
        //call jsonFileReader method to read the .json file as a string

        //call jsonFileParser method to parse the String
        //return the result
        return null;
    }

    private List<Product> jsonFileParser(String rawDataFromJson) {
        //allocate a JsonObject using rewDataFromJson, as a jsonObj class

        //create the temp variables as needed
        //tempName, tempPrice, tempQuantity

        //create a jsonArray with the key name of products (name of the array in .json)
        //create a List<Product> to store the result

        //iterate through the size of jsonArray
        //each iteration:
        //      set tempName from the element of the jsonArray
        //      set tempPrice from the element of the jsonArray
        //      set tempQuantity from the element of the jsonArray
        //      allocate a new Product class with initial values of temp variables
        //      add that Product class into a list of Product

        //return that list made
        return null;
    }

    private String jsonFileReader(File input) {
        //allocate a scanner with File .json as input
        //create a string to store result
        //keep reading using while loop, as long as it's not the end-of-marker
        //each iteration, append to the result string

        //return the string
        return "";
    }

}
