package test1;

import media.testjenkins.MathClass;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class MathTestNGTest {
    
    public MathTestNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testPlus() throws Exception {
        media.testjenkins.MathClass c = new MathClass();
        assertEquals(4, c.plus(2, 2));
    }

    @Test
    public void testPlus2() throws Exception {
        media.testjenkins.MathClass c = new MathClass();
        assertEquals(5, c.plus(3, 2));
    }
    
    @Test (expectedExceptions = Exception.class)
    public void testParameterNegative() throws Exception {
        MathClass t = new MathClass();
        t.plus(-1, -2);
    }
}
