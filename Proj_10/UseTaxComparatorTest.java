import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

/**
 * Test for useTaxComparator().
 *
 * Project 10
 * 11/30/17
 */
public class UseTaxComparatorTest {

   private Car car;
   private Motorcycle mtrcycle;
   private SemiTractorTrailer stt;
   
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      car = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      mtrcycle = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 750);
      stt = new SemiTractorTrailer("Williams, Pat",
         "2012 International Big Boy", 45000, false, 1.5, 4);
   }


   /** A test that always fails. **/
   @Test public void useTaxComparatorTest() {
      Vehicle[] comparatorTest = new Vehicle[3];
      comparatorTest[0] = car;
      comparatorTest[1] = mtrcycle;
      comparatorTest[2] = stt;
      Arrays.sort(comparatorTest, new UseTaxComparator());
      Assert.assertEquals(stt.toString(), comparatorTest[2].toString());
      Assert.assertEquals(mtrcycle.toString(), comparatorTest[1].toString());
      Assert.assertEquals(car.toString(), comparatorTest[0].toString());
   }
}
