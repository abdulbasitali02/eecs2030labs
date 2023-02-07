import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;

public class AppleTest {
    @Test
    public void testAppleConstructorArguments(){
        String type = "MacIntosh";
        double sizeGrams = 250.0;
        Date datePicked = new Date();
        Apple apple = new Apple(type, sizeGrams, datePicked);
        assertEquals(type, apple.getType());
        assertEquals(sizeGrams, apple.getSizeGrams(), 0.0000001);
        assertEquals(datePicked, apple.getDatePicked());
    }

    @Test
    public void testAppleConstructorNoArguments(){
        Apple apple = new Apple();
        assertEquals("Unknown Cultivar", apple.getType());
        assertEquals(150.0, apple.getSizeGrams(), 0.0000001);
        assertNotNull(apple.getDatePicked());
    }

    @Test
    public void testAppleImmutable(){
        String type = "MacIntosh";
        double sizeGrams = 250.0;
        Date datePicked = new Date();
        Apple apple = new Apple(type, sizeGrams, datePicked);
        type = "Fuji";
        sizeGrams = 300.0;
        datePicked = new Date();
        assertEquals("MacIntosh", apple.getType());
        assertEquals(250.0, apple.getSizeGrams(), 0.0000001);
        assertNotNull(apple.getDatePicked());
        
    }

    @Test
    public void testAppleEquals(){
        String type = "MacIntosh";
        double sizeGrams = 250.0;
        Date datePicked = new Date();
        Apple apple1 = new Apple(type, sizeGrams, datePicked);
        Apple apple2 = new Apple(type, sizeGrams, datePicked);
        assertTrue(apple1.equals(apple2));
    }

    @Test
    public void testAppleNotEquals(){
        String type1 = "MacIntosh";
        String type2 = "Fuji";
        double sizeGrams1 = 250.0;
        double sizeGrams2 = 300.0;
        Date datePicked1 = new Date();
        Date datePicked2 = new Date();
        Apple apple1 = new Apple(type1, sizeGrams1, datePicked1);
        Apple apple2 = new Apple(type2, sizeGrams2, datePicked2);
        assertFalse(apple1.equals(apple2));
    }

}



