package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputOutputFileTest {
    InputOutputFile test = new InputOutputFile("utilize","use");
    @Test
    void readFileTest() {
        String rawInput = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "utilizes an IDE to write her Java programs\".";
        String[] expectedArray = rawInput.split(" ");

        String[] actualArray = test.readFile();
        assertEquals(expectedArray.length,actualArray.length);
        for(int i = 0; i<expectedArray.length;i++)
            assertEquals(expectedArray[i],actualArray[i]);
    }

    @Test
    void replaceWordsTest() {
        String expectedOutput = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\".";
        String[] readFromFileTest = test.readFile();
        StringBuilder replacedTest = test.replaceWords(readFromFileTest);

        assertEquals(expectedOutput,replacedTest.toString());
    }
}