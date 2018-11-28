import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for truck.java.
 * 
 * Project 10
 * 11/29/17
 */
public class TruckTest {

   private Truck truck1;
   private Truck truck2;
   
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado", 
         30000, false, 1.5);
      truck2 = new Truck("Williams, Sam", "2010 Chevy Mack",
         40000, true, 2.5);
   }

   /** A test for vehicle count in vehicle.java. **/
   @Test public void vehicleCountTest() {
      int vehicleCount = Vehicle.getVehicleCount();
      Assert.assertEquals(Vehicle.getVehicleCount(), vehicleCount);
      Vehicle.resetVehicleCount();
      Assert.assertEquals(Vehicle.getVehicleCount(), 0);
   }
   
   /** A test for get and set tons methods. **/
   @Test public void getAndSetTonsTest() {
      Assert.assertEquals(truck1.getTons(), 1.5, .00001);
      truck2.setTons(4.5);
      Assert.assertEquals(4.5, truck2.getTons(), .00001);
   }
   
   /** A test for useTax() method. **/
   @Test public void useTaxTest() {
      Assert.assertEquals("", 600.0, truck1.useTax(), .00001);
      Assert.assertEquals("", 1600.0, truck2.useTax(), .00001);
   }
   
   /** A test for toString() method. **/
   @Test public void toStringTest() {
      Assert.assertEquals(truck1.toString().contains("with Tax Rate"),
         true);
      Assert.assertEquals(truck2.toString().contains("Alternative Fuel"),
         true);
      Assert.assertEquals(truck2.toString().contains("Large Truck Tax Rate"),
         true);
   }
   
}
