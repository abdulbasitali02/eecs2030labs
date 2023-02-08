import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;

public class AppleTest {

    // This test tests for the constructor with arguments.
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

    // This test tests for the default constructor.
    @Test
    public void testAppleConstructorNoArguments(){
        Apple apple = new Apple();
        assertEquals("Unknown Cultivar", apple.getType());
        assertEquals(150.0, apple.getSizeGrams(), 0.0000001);
        assertNotNull(apple.getDatePicked());
    }

    // This test tests for immutability of the Apple class.
    @Test
    public void testAppleImmutability(){
        String type = "MacIntosh";
        Date datePicked = new Date();
        Apple apple = new Apple(type, 200.0, datePicked);
        // Type
        String newType = "Fuji";
        apple.getType().replace(type, newType);
        assertEquals(type, apple.getType());
        // Size
        double sizeGrams = apple.getSizeGrams();
        sizeGrams = 0.0;
        assertEquals(200.0, apple.getSizeGrams(), 0.0000001);
        // Date
        Date newDatePicked = new Date();
        apple.getDatePicked().setTime(newDatePicked.getTime());
        assertEquals(datePicked, apple.getDatePicked());
    }

    // This test tests for the case where the two apples are equal.
    @Test
    public void testAppleEquals(){
        String type = "MacIntosh";
        double sizeGrams = 250.0;
        Date datePicked = new Date();
        Apple apple1 = new Apple(type, sizeGrams, datePicked);
        Apple apple2 = new Apple(type, sizeGrams, datePicked);
        assertTrue(apple1.equals(apple2));
    }

    // This test tests for the null case and for the case where the two apples are not equal.
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
        assertFalse(apple1.equals(null));
    }

    // This test tests for the case where the two apples are equal but not the same object.
    @Test
    public void testHashCode(){
        String type = "MacIntosh";
        double sizeGrams = 250.0;
        Date datePicked = new Date();
        Apple apple1 = new Apple(type, sizeGrams, datePicked);
        Apple apple2 = new Apple(type, sizeGrams, datePicked);
        assertTrue(apple1.hashCode() == apple2.hashCode());
    }

}



