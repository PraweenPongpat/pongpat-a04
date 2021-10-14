package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderWriterTest {
    File input = new File("data\\exercise42_input.txt");
    FileReaderWriter test = new FileReaderWriter();

    @Test
    void readInputFileTest() throws FileNotFoundException {
        try {
            List<String> testData = new ArrayList<>();
            testData.add("Ling,Mai,55900");
            testData.add("Johnson,Jim,56500");
            testData.add("Jones,Aaron,46000");
            testData.add("Jones,Chris,34500");
            testData.add("Swift,Geoffrey,14200");
            testData.add("Xiong,Fong,65000");
            testData.add("Zarnecki,Sabrina,51500");

            List<String> readData = test.readInputFile(input);
            assertEquals(testData, readData);
            assertEquals(testData.size(),readData.size());

        } catch (FileNotFoundException e){
            System.out.println("test failed, file not found.");
        }
    }
}