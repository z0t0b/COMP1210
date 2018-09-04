import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for NegativeValueException.
 *
 * Project 11
 * 12/6/17
 */
public class NegativeValueExceptionTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void negativeValueExceptionTest() {
      boolean thrown = false;
      try {
         Car car = new Car("Jackson, Bo", "2012 Toyota Camry", -25000, false);
      }
      catch (NegativeValueException e) {
         thrown = true;
      }
      Assert.assertEquals("Expected NegativeValueException to be thrown.",
            true, thrown);
   }
}
