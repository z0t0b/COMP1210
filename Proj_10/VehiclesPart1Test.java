// import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for main driver method.
 *
 * Project 10
 * 11/16/17
 */
public class VehiclesPart1Test {

   private VehiclesPart1 testVehicle;
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      testVehicle = new VehiclesPart1();
   }

   /** A test that always fails. **/
   @Test public void defaultTest() {
      VehiclesPart1.main(null);
   }
}
