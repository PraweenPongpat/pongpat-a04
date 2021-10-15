package baseline;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JsonFileHandler {
    private String rawDataFromJson;

    public void setRawDataFromJson(String rawDataFromJson){
        this.rawDataFromJson = rawDataFromJson;
    }

    public List<Product> mainHandler(){
        //make the exercise44_input.json file

        //allocate the .json file knowing that the input is in data--->.json
        File jsonFile = new File("data\\exercise44_input.json");

        //call jsonFileReader method to read the .json file as a string
        jsonFileReader(jsonFile);

        //call jsonFileParser method to parse the String
        //return the result
        return jsonFileParser();
    }

    private List<Product> jsonFileParser() {
        //allocate a JsonObject using rewDataFromJson (class variable), as a jsonObj class
        JsonObject jsonObject = new Gson().fromJson(rawDataFromJson,JsonObject.class);

        //create the temp variables as needed
        //tempName, tempPrice, tempQuantity
        String tempName;
        double tempPrice;
        int tempQuantity;

        //create a jsonArray with the key name of products (name of the array in .json)
        JsonArray jsonArray = jsonObject.getAsJsonArray("products");

        //create a List<Product> to store the result
        List<Product> list = new ArrayList<>();

        //iterate through the size of jsonArray
        //each iteration:
        for(int i = 0; i<jsonArray.size(); i++) {
            //      set tempName from the element of the jsonArray
            tempName = jsonArray.get(i).getAsJsonObject().get("name").getAsString();
            //      set tempPrice from the element of the jsonArray
            tempPrice = jsonArray.get(i).getAsJsonObject().get("price").getAsDouble();
            //      set tempQuantity from the element of the jsonArray
            tempQuantity =jsonArray.get(i).getAsJsonObject().get("quantity").getAsInt();

            //      allocate a new Product class with initial values of temp variables
            //      add that Product class into a list of Product
            list.add(new Product(tempName,tempPrice,tempQuantity));
        }
        //return that list made
        return list;
    }

    private void jsonFileReader(File input) {
        //allocate a scanner with File .json as input
        try (Scanner inFile = new Scanner(input)){
            //create a string to store result
            StringBuilder rawJsonData= new StringBuilder();

            //keep reading using while loop, as long as it's not the end-of-marker
            //each iteration, append to the result string
            while (inFile.hasNext()){
                rawJsonData.append(inFile.nextLine());
            }

            //set the result string to class variable
            setRawDataFromJson(rawJsonData.toString());

        } catch (FileNotFoundException e) {
            System.out.println("File .json cannot be opened");
        }
    }
}
