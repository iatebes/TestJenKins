package test1;

import media.testjenkins.MathClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class MathTestNGTest {
    
    private static WebDriver driver;
    
    public MathTestNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver-v0.20.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
        driver.close();
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
    
//    @Test
//    public void testGUI() {
//        // Mo trang web
//        driver.get("http://118.70.183.219:8080/TestJenKins/");
//        
//        // nhap so 1
//        driver.findElement(By.id("so1")).sendKeys("6");
//        String so1 = driver.findElement(By.id("so1")).getAttribute("value");
//        
//        // nhap so 2
//        driver.findElement(By.id("so2")).sendKeys("7");
//        String so2 = driver.findElement(By.id("so2")).getAttribute("value");
//        
//        // an nut cong
//        driver.findElement(By.id("btnCong")).click();
//        
//        // doc ket qua
//        String ketqua = driver.findElement(By.xpath(".//*[@id='lblketqua']")).getText();
////        System.out.println("so1:" + so1 + ", so2:" + so2 + ", ketqua:" + ketqua);
//        assertEquals("13", ketqua);
//    }
}
