import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
 * Test for VehiclePart3.
 *
 * Project 11
 * 12/6/17
 */
public class VehiclesPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * Test with good file name.
    * @throws FileNotFoundException if file is not found.
    */
   @Test public void badFileName() throws FileNotFoundException {   
      Vehicle.resetVehicleCount();
      String[] file = {"notafilelol.txt"};
      VehiclesPart3.main(file);
      Assert.assertEquals(0, Vehicle.getVehicleCount());  
   }

   /**
    * Test that has no file name.
    * @throws FileNotFoundException if file is not found.
    */
   @Test public void noFileName() throws FileNotFoundException {
      VehiclesPart3 noFile = new VehiclesPart3();
      String[] noArgs = { };
      VehiclesPart3.main(noArgs);
      Assert.assertEquals(0, Vehicle.getVehicleCount());  
   }
   
   /**
    * Test that has bad file name.
    * @throws FileNotFoundException if file isn't found.
    */
   @Test public void goodFileName() throws FileNotFoundException {
      Vehicle.resetVehicleCount();
      String[] file = {"vehicle2.txt"};
      VehiclesPart3.main(file);
      Assert.assertEquals(0, Vehicle.getVehicleCount());  
   }
}
