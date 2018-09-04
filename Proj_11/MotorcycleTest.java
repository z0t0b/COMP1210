import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for motorcycle.java.
 * 
 * Project 11
 * 11/29/17
 */
public class MotorcycleTest {


   private Motorcycle mtrcycle1;
   private Motorcycle mtrcycle2;
   
   /** Fixture initialization (common initialization
    *  for all tests). 
    * @throws NegativeValueException for error.
    **/
   @Before public void setUp() throws NegativeValueException {
      mtrcycle1 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 750);
      mtrcycle2 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, true, 498);
   }


   /** A test for get and set tons methods. **/
   @Test public void getAndSetEngineSizeTest() {   
      Assert.assertEquals(mtrcycle1.getEngineSize(), 750, .00001);
      mtrcycle1.setEngineSize(4.5);
      Assert.assertEquals(mtrcycle1.getEngineSize(), 4.5, .00001);
   }
   
   /** A test for useTax(). **/
   @Test public void useTaxTest() {
      Assert.assertEquals("", 280.0, mtrcycle1.useTax(), .00001);
      Assert.assertEquals("", 35.0, mtrcycle2.useTax(), .00001);
   }
   
   /** A test for toString(). **/
   @Test public void toStringTest() {  
      Assert.assertEquals(mtrcycle1.toString().contains("Large Bike Tax Rate"),
         true);
      Assert.assertEquals(mtrcycle2.toString().contains("Alternative Fuel"),
         true);
   }
}
