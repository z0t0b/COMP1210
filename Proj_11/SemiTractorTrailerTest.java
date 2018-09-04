import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for SemiTractorTrailer.java.
 *
 * Project 11
 * 11/29/17
 */
public class SemiTractorTrailerTest {

   private SemiTractorTrailer stt;
   /** Fixture initialization (common initialization
    *  for all tests). 
    *  @throws NegativeValueException for error.
    **/
   @Before public void setUp() throws NegativeValueException {
      stt = new SemiTractorTrailer("Williams, Pat",
         "2012 International Big Boy", 45000, false, 1.5, 4);
   }


   /** A test for get and set axles methods. 
    *  @throws NegativeValueException for error.
   **/
   @Test public void getAndSetAxles() throws NegativeValueException {
      Assert.assertEquals(stt.getAxles(), 4, .00001);
      stt.setAxles(5);
      Assert.assertEquals(stt.getAxles(), 5, .00001);
   }
   
   /** A test for useTax() method. **/
   @Test public void useTaxTest() {
      Assert.assertEquals("", 1800.0, stt.useTax(), .00001);
   }
   
   /** A test for toString() method. **/
   @Test public void toStringTest() {
      Assert.assertEquals(stt.toString().contains("Axle Tax Rate"), true);
   }
}
