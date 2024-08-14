package JSONReaderTest;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import pre.JSONReader;

public class JSONReaderTest {

    private JSONReader jsonReader;

    @Before
    public void setUp() {
        jsonReader = new JSONReader();
    }

    @Test
    public void testGetCountryNameTranslation_US_EN() {
        String result = jsonReader.getCountryNameTranslation("us", "en");
        assertEquals("United States of America", result);
    }

    @Test
    public void testGetCountryNameTranslation_FR_FR() {
        String result = jsonReader.getCountryNameTranslation("fr", "fr");
        assertEquals("France", result);
    }

    @Test
    public void testGetCountryNameTranslation_DE_DE() {
        String result = jsonReader.getCountryNameTranslation("de", "de");
        assertEquals("Deutschland", result);
    }

    @Test
    public void testGetCountryNameTranslation_InvalidLanguage() {
        String result = jsonReader.getCountryNameTranslation("us", "zh");
        assertEquals("美国", result);
    }

    @Test
    public void testGetCountryNameTranslation_InvalidCountry() {
        String result = jsonReader.getCountryNameTranslation("ut", "en");
        assertEquals("Country not found", result);
    }

}