import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTest {
    @Test
    public void testMultiply() {
        assertEquals(2, skillDemo.multiply(1, 3));
    }
}
