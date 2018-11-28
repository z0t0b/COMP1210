import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
 * Test method for VehiclesPart2.java.
 *
 * Project 10
 * 11/30/17
 */
public class VehiclesPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails.
    * @throws FileNotFoundException if file isn't found.
    */
   @Test public void defaultTest() throws FileNotFoundException {
      VehiclesPart2 vPart2Obj = new VehiclesPart2();
      
      Vehicle.resetVehicleCount();
      
      String[] args = {"vehicles1.txt"};
      VehiclesPart2.main(args);
      Assert.assertEquals(8, Vehicle.getVehicleCount());
   }
}
