import java.util.ArrayList;

/**
 * This program is used to run the temperatureInfo.java program.
 *
 * Activity 6
 * 10/16/17
 */
public class Temperatures {
  
   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   private ArrayList<Integer> temperatures =
      new ArrayList<Integer>();
   
   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   /**
    * Passes variables to the temperatures variable.
    * @param temperaturesIn for temperatures.
    */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   
   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   /**
    * Gets lowest temperature.
    * @return low
    */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   
   /**
    * Gets highest temperature.
    * @return high
    */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
   
   /**
    * Works for getLowTemp().
    * @param lowIn Command line arguments - not used.
    * @return Command line arguments - not used.
    */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
   /**
    * Works for getHighTemp().
    * @param highIn Command line arguments - not used.
    * @return Command line arguments - not used.
    */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
   /**
    * Prints all to string.
    * @return Command line arguments - not used.
    */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
  
}