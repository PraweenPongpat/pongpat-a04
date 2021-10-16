package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class Solution46Test {
    Solution46 testApp = new Solution46();
    String rawDataTest = "ddd,ddd,ddd,ddd,ccc,ccc,ccc,bbb,bbb,aaa,aaa";

    @Test
    void parseAndCountTest() {
        //we can expect 4x"ddd", 3x"ccc", 2x"bbb" and 2x"aaa"
        Map<String,Integer> parseTestExpected = new TreeMap<>();
        parseTestExpected.put("ddd",4);
        parseTestExpected.put("ccc",3);
        parseTestExpected.put("bbb",2);
        parseTestExpected.put("aaa",2);

        Map<String,Integer> parseTestActual = testApp.parseAndCount(rawDataTest);

        assertEquals(parseTestExpected,parseTestActual);
    }

    @Test
    void makeCountArrTest() {
        //from the input, we expected the occurrence from max-to-min list to be [4,3,2,2]
        List<Integer> expectedMakeCountArrTest = new ArrayList<>();
        expectedMakeCountArrTest.add(4);
        expectedMakeCountArrTest.add(3);
        expectedMakeCountArrTest.add(2);
        expectedMakeCountArrTest.add(2);

        Map<String,Integer> testInputMakeCountArr = testApp.parseAndCount(rawDataTest);
        List<Integer> actualMakeCountArrTest = testApp.makeCountArr(testInputMakeCountArr);

        assertEquals(expectedMakeCountArrTest,actualMakeCountArrTest);
    }
}