import java.io.FileNotFoundException;
/**
 * Driver class for all other classes.
 *
 * Project 10
 * 11/29/17
 */
public class VehiclesPart2 {
   /**
    * Main driver method.
    * @param args - Command line arguments, not used.
    * @throws FileNotFoundException if file isn't found.
    */
   public static void main(String[] args) throws FileNotFoundException {
      UseTaxList vehicles = new UseTaxList();
      vehicles.readVehicleFile(args[0].trim());
      System.out.println(vehicles.summary());
      System.out.println("\n" + vehicles.listByOwner());
      System.out.println("\n" + vehicles.listByUseTax());
      System.out.println("\n" + vehicles.excludedRecordsList());
   }

}