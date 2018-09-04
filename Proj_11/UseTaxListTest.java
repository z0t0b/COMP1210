import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
 * A test for UseTaxList.
 *
 * Project 11
 * 12/1/17
 */
public class UseTaxListTest {

   private UseTaxList utl;
   private Car newVehicle;
   private String[] excludedRecords;
   private Vehicle[] newVehicle2;
   
   /** Fixture initialization (common initialization
    *  for all tests). 
    *  @throws NegativeValueException for error.
    **/
   @Before public void setUp() throws NegativeValueException {
      utl = new UseTaxList();
      newVehicle = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      excludedRecords = new String[1];
      newVehicle2 = new Vehicle[0];
   }


   /** Test for readVehicleFile(). 
    * @throws FileNotFoundException if file isn't found.
    **/
   @Test public void readVehicleFileTest() throws FileNotFoundException {
      utl.readVehicleFile("vehicles2.txt");
      Assert.assertEquals(utl.getTaxDistrict(), "Tax District 52");
   }
   /** A test for getTaxDistrict() and setTaxDistrict(). **/
   @Test public void getAndSetTaxDistrictTest() {
      Assert.assertEquals("Not assigned", utl.getTaxDistrict());
      utl.setTaxDistrict("Tax District 9");
      Assert.assertEquals("Tax District 9", utl.getTaxDistrict());
   }
   /** A test for getVehicleList(). **/
   @Test public void getVehicleListTest() {
      newVehicle2 = utl.getVehicleList();
      Assert.assertArrayEquals(utl.getVehicleList(), newVehicle2);
   }
   /** A test for getExcludedRecords(). 
    * @throws FileNotFoundException if file isn't found.
    */
   @Test public void getExcludedRecordsTest() throws FileNotFoundException {
      utl.readVehicleFile("vehicles2.txt");
      excludedRecords = utl.getExcludedRecords();
      Assert.assertArrayEquals(utl.getExcludedRecords(), excludedRecords);
   }
   /** A test for addVehicle(). **/
   @Test public void addVehicleTest() {
      utl.addVehicle(newVehicle);
      Assert.assertTrue(utl.toString().contains("Jones, Sam"));
   }
   /** A test for addExcludedRecord(). **/
   @Test public void addExcludedRecordTest() {
      utl.addExcludedRecord("race car; Zinc, Zed; 2013 Custom Hot Rod;"
         + "61000; false");
      excludedRecords = utl.getExcludedRecords();
      Assert.assertArrayEquals(utl.getExcludedRecords(), excludedRecords);
   }
   /** A test for toString(). **/
   @Test public void toStringTest() {
      utl.addVehicle(newVehicle);
      Assert.assertEquals(utl.toString().contains("Jones, Sam"), true);
   }
   /** A test for calculateTotalUseTax().
    * @throws FileNotFoundException if file isn't found.
    **/
   @Test public void calculateTotalUseTaxTest() throws FileNotFoundException {
      utl.readVehicleFile("vehicles2.txt");
      Assert.assertEquals(utl.calculateTotalUseTax(), 15310.0, .00001);
   }
   /** A test for calculateTotalValue().
     * @throws FileNotFoundException if file isn't found.
    **/
   @Test public void calculateTotalValueTest() throws FileNotFoundException {
      utl.readVehicleFile("vehicles2.txt");
      Assert.assertEquals(utl.calculateTotalValue(), 503000.0, .00001);
   }
   /** A test for summary().
    * @throws NegativeValueException if file isn't found.
    * @throws FileNotFoundException if file isn't found.
   **/
   @Test public void summaryTest() throws NegativeValueException, 
      FileNotFoundException {
      utl.readVehicleFile("vehicles2.txt");
      Assert.assertEquals(utl.summary().contains("Summary for Tax District"),
         true);
   }
   /** A test for listByOwner(). 
    *  @throws NegativeValueException for error.
    **/
   @Test public void listByOwnerTest() throws NegativeValueException {
      Assert.assertTrue(utl.listByOwner().contains("by Owner"));
   }
   /** A test for listByUseTax(). 
    *  @throws NegativeValueException for error.
    **/
   @Test public void listByUseTaxTest() throws NegativeValueException {
      Assert.assertTrue(utl.listByUseTax().contains("by Use Tax"));
   }
   /** A test for excludedRecordsList(). 
     * @throws NegativeValueException for error.
    **/
   @Test public void excludedRecordsListTest() throws NegativeValueException {
      Assert.assertTrue(utl.excludedRecordsList().contains("Excluded Records"));
   }
}
