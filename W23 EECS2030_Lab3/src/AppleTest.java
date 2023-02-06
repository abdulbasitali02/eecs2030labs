import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppleTest {
    @Test
    public void testGetType() {
        Apple myApple = new Apple("fiji", 154.8);
        assertEquals("fiji", myApple.getType());
    }
}



