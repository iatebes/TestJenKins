package test1;

import media.testjenkins.MathClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloJUnitTest {

    public HelloJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testPlus() {
        media.testjenkins.MathClass c = new MathClass();
        assertEquals("2 + 2 phai bang 4 moi dung", 4, c.plus(2, 2));
    }
}
