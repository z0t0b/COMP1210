import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
/**
 * Tests each method in spherocylinder.java.
 *
 * Project 8A
 * 11/1/17
 */
public class SpherocylinderTest {
   
   private Spherocylinder s;
   
   /** setup method **/
   @Before
   public void setUp() {
      s = new Spherocylinder("Small Example", 0.5, 0.25);
   }
   
   /** Tests if getLabel() and setLabel() works. **/
   @Test public void getLabel() {
      Assert.assertEquals(s.getLabel(), "Small Example");
      Assert.assertEquals(s.setLabel("Medium Example"), true);
      Assert.assertEquals(s.setLabel(null), false);
   }
   
   /** Tests if getRadius() and setLabel() works. **/
   @Test public void getRadius() {
      Assert.assertEquals(s.getRadius(), 0.5, .000001);
      Assert.assertEquals(s.setRadius(44), true);
      Assert.assertEquals(s.setRadius(-44), false);
   }
   
   /** Tests if getCylinderHeight() and setCylinderHeight() works. **/
   @Test public void getCylinderHeight() {
      Assert.assertEquals(s.getCylinderHeight(), 0.25, .000001);
      Assert.assertEquals(s.setCylinderHeight(44), true);
      Assert.assertEquals(s.setCylinderHeight(-44), false);
   }
   
   /** Tests if circumference() works. **/
   @Test public void circumferenceTest() {
      double circum = s.circumference();
      Assert.assertEquals(s.circumference(), circum, .000001);
   }
   
   /** Tests if surfaceArea() works. **/
   @Test public void surfaceAreaTest() {
      double surfaceArea = s.surfaceArea();
      Assert.assertEquals(s.surfaceArea(), surfaceArea, .000001);
   }
   
   /** Tests if volume() works. **/
   @Test public void volumeTest() {
      double volume = s.volume();
      Assert.assertEquals(s.volume(), volume, .000001);
   }
   
   /** Tests if toString() works. **/
   @Test public void toStringTest() {
      boolean hasString = s.toString().contains("Small Example");
      Assert.assertEquals(s.toString().contains("Small Example"), hasString);
   }
   
   /** Tests if getCount() works. **/
   @Test public void getCountTest() {
      int count = s.getCount();
      Assert.assertEquals(s.getCount(), count, .000001);
   }
   
   /** Tests if resetCount() works. **/
   @Test public void resetCountTest() {
      s.resetCount();
      Assert.assertEquals(s.getCount(), 0);
   }
   
   /** Tests if equals() works. **/
   @Test public void equalsTest() {
      Spherocylinder sphero2 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder sphero3 = new Spherocylinder("Small example", 0.5, 2);
      Spherocylinder sphero4 = new Spherocylinder("Small EXAMPLE", 0.25, 0.25);
      Spherocylinder sphero5 = new Spherocylinder("SMallExAMPLE", 2, 2);
      Assert.assertEquals(s.equals(""), false);
      Assert.assertEquals(s.equals(sphero2), true);
      Assert.assertEquals(s.equals(sphero3), false);
      Assert.assertEquals(s.equals(sphero4), false);
      Assert.assertEquals(s.equals(sphero5), false);
   }
   
   /** Tests if hashCode() works. **/
   @Test public void hashCodeTest() {
      Assert.assertEquals(s.hashCode(), 0, .000001);
   }
}
