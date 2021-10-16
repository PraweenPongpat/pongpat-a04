package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputOutputTest {
    InputOutput test = new InputOutput();
    @Test
    void readFromFileTest() {
        //expected from file, trim all white spaces out
        //put comma after every word read
        String expectedStringFromReadFile = "badger,badger,badger,badger,mushroom,mushroom,snake,badger,badger,badger,";
        String actualStringFromReadFile = test.readFromFile();
        assertEquals(expectedStringFromReadFile,actualStringFromReadFile);
    }
}