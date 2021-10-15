package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JsonFileHandlerTest {
/*from .json file
{
  "products" : [
    {"name": "Widget", "price": 25.00, "quantity": 5 },
    {"name": "Thing", "price": 15.00, "quantity": 5 },
    {"name": "Doodad", "price": 5.00, "quantity": 10 }
  ]
}
 */
    JsonFileHandler testHandler = new JsonFileHandler();
    @Test
    void mainHandlerTest() {
        List<Product> expectedList = new ArrayList<>();
        expectedList.add(new Product("Widget",25.00,5));
        expectedList.add(new Product("Thing",15.00,5));
        expectedList.add(new Product("Doodad",5.00,10));

        List<Product> actualList = testHandler.mainHandler();

        assertEquals(expectedList,actualList);
    }
}