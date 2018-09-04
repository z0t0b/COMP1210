import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
 * Test for SpherocylinderList2.java.
 *
 * Project 8B
 * 11/9/17
 */
public class SpherocylinderList2Test {

   private SpherocylinderList2 s;
   private Spherocylinder[] spheroList2;
   
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      spheroList2 = new Spherocylinder[5];
      spheroList2[0] = new Spherocylinder("Small Example", 0.5, 0.25);
      spheroList2[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      spheroList2[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      spheroList2[3] = new Spherocylinder(null, 0.0, 0.0);
      s = new SpherocylinderList2("Spherocylinder Test List", spheroList2, 4);
   }


   /** Test for getName(). **/
   @Test public void getNameTest() {
      Assert.assertEquals("Spherocylinder Test List", s.getName());
   }
   
   /** Test for numberOfSpherocylinders(). **/
   @Test public void numberOfSpherocylindersTest() {
      SpherocylinderList2 nullList = new SpherocylinderList2("Empty test list",
          null, 0);
      Assert.assertEquals(4, s.numberOfSpherocylinders());
      Assert.assertEquals(0, nullList.numberOfSpherocylinders());
   }
   
   /** Test for totalSurfaceArea(). **/
   @Test public void totalSurfaceAreaTest() {
      double surfaceArea2 = s.totalSurfaceArea();
      Assert.assertEquals(s.totalSurfaceArea(), surfaceArea2, .000001);
   }
   
   /** Test for totalVolume(). **/
   @Test public void totalVolumeTest() {
      double volume = s.totalVolume();
      Assert.assertEquals(s.totalVolume(), volume, .000001);
   }
   
   /** Test for averageSurfaceArea(). **/
   @Test public void averageSurfaceAreaTest() {
      double averageSurfaceArea = s.averageSurfaceArea();
      SpherocylinderList2 nullList = new SpherocylinderList2("Empty test list",
         null, 0);
      Assert.assertEquals(s.averageSurfaceArea(), averageSurfaceArea, .000001);
      Assert.assertEquals(nullList.averageSurfaceArea(), 0, .000001);
   }
   
   /** Test for averageVolume(). **/
   @Test public void averageVolumeTest() {
      double averageVolume = s.averageVolume();
      SpherocylinderList2 nullList = new SpherocylinderList2("Empty test list",
         null, 0);
      Assert.assertEquals(s.averageVolume(), averageVolume, .000001);
      Assert.assertEquals(nullList.averageVolume(), 0, .000001);
   }
   
   /** Test for toString(). **/
   @Test public void toStringTest() {
      boolean hasString = s.toString().contains("Spherocylinder Test List");
      Assert.assertEquals(s.toString().contains("Spherocylinder Test List"),
         hasString);
   }
   
   /** Test for summaryInfo(). **/
   @Test public void summaryInfoTest() {
      Assert.assertEquals(s.summaryInfo().contains("Spherocylinder Test List"),
          true);
   }
   
   /** Test for getList(). **/
   @Test public void getListTest() {
      Spherocylinder[] getList = s.getList();
      Assert.assertEquals(s.getList(), getList);
   }
   
   /** Test for readFile(). 
    *  @throws IOException for file not found.
    **/
   @Test public void readFileTest() throws IOException {
      s.readFile("spherocylinder_data_1.txt");
      Assert.assertEquals("Spherocylinder Test List", s.getName());
   }
   
   /** Test for addSpherocylinder(). **/
   @Test public void addSpherocylinderTest() {
      s.addSpherocylinder("New Example", 4, 4);
      Assert.assertEquals(s.toString().contains("New Example"), true);
      Assert.assertEquals(s.toString().contains("Blah"), false);
   }
   
   /** Test for findSpherocylinder(). **/
   @Test public void findSpherocylinderTest() {
      Spherocylinder found = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(s.findSpherocylinder("Small Example"), found);
      Assert.assertEquals(s.findSpherocylinder("Not an Example"), null);
   }
   
   /** Test for deleteSpherocylinder(). **/
   @Test public void deleteSpherocylinderTest() {
      Spherocylinder deleted = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(s.deleteSpherocylinder("Small Example"), deleted);
      Assert.assertEquals(s.deleteSpherocylinder("Not an Example"), null);
   }
   
   /** Test for editSpherocylinder(). **/
   @Test public void editSpherocylinderTest() {
      Assert.assertEquals(s.editSpherocylinder("Small Example", 4, 4), true);
      Assert.assertEquals(s.editSpherocylinder("Doesn't Exist", 4, 4), false);
   }
   
   /** Test for findSpherocylinderWithShortestRadius(). **/
   @Test public void findSpherocylinderWithShortestRadius() {
      s.addSpherocylinder("New Example", 0.2, 0.25);
      SpherocylinderList2 nullList = new SpherocylinderList2("Empty test list",
         null, 0);
      Assert.assertEquals(s.findSpherocylinderWithShortestRadius(),
         s.findSpherocylinder("New Example"));
      Assert.assertEquals(nullList.findSpherocylinderWithShortestRadius(),
         null);
   }
   
   /** Test for findSpherocylinderWithLongestRadius(). **/
   @Test public void findSpherocylinderWithLongestRadius() {
      s.addSpherocylinder("New Example", 100.0, 0.25);
      SpherocylinderList2 nullList = new SpherocylinderList2("Empty test list",
         null, 0);
      Assert.assertEquals(s.findSpherocylinderWithLongestRadius(),
         s.findSpherocylinder("New Example"));
      Assert.assertEquals(nullList.findSpherocylinderWithLongestRadius(), null);
   }
   
   /** Test for findSpherocylinderWithSmallestVolume(). **/
   @Test public void findSpherocylinderWithSmallestVolume() {
      s.addSpherocylinder("New Example", 0.3, 0.25);
      SpherocylinderList2 nullList = new SpherocylinderList2("Empty test list",
         null, 0);
      Assert.assertEquals(s.findSpherocylinderWithSmallestVolume(),
         s.findSpherocylinder("New Example"));
      Assert.assertEquals(nullList.findSpherocylinderWithSmallestVolume(),
         null);
   }
   
   /** Test for findSpherocylinderWithLargestVolume(). **/
   @Test public void findSpherocylinderWithLargestVolume() {
      s.addSpherocylinder("New Example", 100, 900);
      SpherocylinderList2 nullList = new SpherocylinderList2("Empty test list",
         null, 0);
      Assert.assertEquals(s.findSpherocylinderWithLargestVolume(),
         s.findSpherocylinder("New Example"));
      Assert.assertEquals(nullList.findSpherocylinderWithLargestVolume(), null);
   }
}
