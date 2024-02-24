import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {
    private MathUtils mathUtils;

    @Before
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @After
    public void tearDown() {
        // Clean up resources if needed
    }

    @Test
    public void testAdd() {
    	assertEquals(5, mathUtils.add(2, 3));
        assertEquals(-1, mathUtils.add(-2, 1));
        assertEquals(0, mathUtils.add(0, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals(3, mathUtils.subtract(5, 2));
        assertEquals(-4, mathUtils.subtract(-2, 2));
        assertEquals(0, mathUtils.add(0, 0));
        
    }

    @Test
    public void testMultiply() {
        assertEquals(6, mathUtils.multiply(2, 3));
        assertEquals(-8, mathUtils.multiply(4, -2));
        assertEquals(0, mathUtils.multiply(4, 0));
        
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, mathUtils.divide(6, 3), 0.0001); // Specifying delta for double comparison
        assertEquals(-2.5, mathUtils.divide(-5, 2), 0.0001);
        
        // Using explicit casting to resolve ambiguity
      //  assertEquals(-1.0, (double) mathUtils.divide(8, 0), 0.0001); // Division by zero
    }
}
