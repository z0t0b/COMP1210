import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Test method for vehicle.java.
 *
 * Project 11
 * 12/6/17
 */
public class CarTest {

   private Car car1;
   private Car car2;
   private Car car3;
   private Car car4;
   
   /** Fixture initialization (common initialization
    *  for all tests). 
    *  @throws NegativeValueException for error.
    **/
   @Before public void setUp() throws NegativeValueException {
      car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true);
      car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe",
         110000, false);
      car4 = new Car("Smith, Jack", "2015 Mercedes-Benz Coupe",
         110000, true);
   }

   /**
    * A test for getting and setting the owner, yearmakeandmodel,
    * alternative fuel, and value.
    * @throws NegativeValueException for error.
    */
   @Test public void getAndSetTests() throws NegativeValueException {
      Assert.assertEquals(car1.getOwner(), "Jones, Sam");
      car1.setOwner("Jones, Bob");
      Assert.assertEquals(car1.getOwner(), "Jones, Bob");
      
      Assert.assertEquals(car2.getYearMakeModel(), "2017 Honda Accord");
      car2.setYearMakeModel("2010 Chevy Cobalt");
      Assert.assertEquals(car2.getYearMakeModel(), "2010 Chevy Cobalt");
      
      Assert.assertEquals(car2.getAlternativeFuel(), true);
      car2.setAlternativeFuel(false);
      Assert.assertEquals(car2.getAlternativeFuel(), false);
      
      car3.setValue(45555.0);
      Assert.assertEquals(car3.getValue(), 45555.0, .00001);
   }
   
   
   /** A test for useTax(). **/
   @Test public void useTax() {
      Assert.assertEquals("", 220.00, car1.useTax(), .00001);
      Assert.assertEquals("", 110.00, car2.useTax(), .00001);
      Assert.assertEquals("", 3300.00, car3.useTax(), .00001);
      Assert.assertEquals("", 2750.00, car4.useTax(), .00001);
   }
   
   /** A test for toString(). **/
   @Test public void toStringTest() {
      Assert.assertEquals(car1.toString().contains("Honda Accord"), true);
      Assert.assertEquals(car2.toString().contains("(Alternative Fuel)"), true);
      Assert.assertEquals(car3.toString().contains("Luxury Tax Rate"), true);
      Assert.assertEquals(car4.toString().contains("Mercedes-Benz Coupe"),
         true);
   }
}
