import java.util.Comparator;

/**
 * Interface for comparing.
 *
 * Project 11
 * 12/5/17
 */
public class UseTaxComparator implements Comparator<Vehicle> {
   /**
    * Compares vehicles.
    * @param v1 for first vehicle.
    * @param v2 for second vehicle.
    * @return 1, -1, or 0.
    */
   public int compare(Vehicle v1, Vehicle v2) {
      double vehicle1 = v1.useTax();
      double vehicle2 = v2.useTax();
      
      if (vehicle1 > vehicle2) {
         return 1;
      }
      else if (vehicle1 < vehicle2) {
         return -1;
      }
      else {
         return 0;
      }
   }

}