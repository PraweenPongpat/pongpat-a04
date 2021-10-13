package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InputOutputFileTest {
    File inputFile = new File("data\\exercise41_input.txt");
    InputOutputFile test = new InputOutputFile();

    @Test
    void readInputFileTest() {
        try{
            //check to see if the testArray (hardcoded version) and readArray (test method) is the same
            List<String> testArray = new ArrayList<>();
            testArray.add("Ling, Mai");
            testArray.add("Johnson, Jim");
            testArray.add("Zarnecki, Sabrina");
            testArray.add("Jones, Chris");
            testArray.add("Jones, Aaron");
            testArray.add("Swift, Geoffrey");
            testArray.add("Xiong, Fong");

            List<String> readArray = test.readInputFile(inputFile);

            assertEquals(testArray, readArray);
            assertEquals(testArray.size(),readArray.size());
        } catch (FileNotFoundException e){
            System.out.println("file cannot be found");
        }
    }
    //test on writeToFiles only works when readFromFile is properly tested
    @Test
    void displayNameTest() throws FileNotFoundException {
        List<String> testArray = new ArrayList<>();
        testArray.add("Ling, Mai");
        testArray.add("Johnson, Jim");
        testArray.add("Zarnecki, Sabrina");
        testArray.add("Jones, Chris");
        testArray.add("Jones, Aaron");
        testArray.add("Swift, Geoffrey");
        testArray.add("Xiong, Fong");

        test.displayName(testArray);
        List<String> readArray = test.readInputFile(inputFile);

        assertEquals(testArray, readArray);
        assertEquals(testArray.size(),readArray.size());
    }
}