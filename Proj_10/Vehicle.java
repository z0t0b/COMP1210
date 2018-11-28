import java.text.DecimalFormat;

/**
 * Main class for main program.
 *
 * Project 10
 * 11/29/17
 */
 
public abstract class Vehicle implements Comparable<Vehicle> {

   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   protected String vehicleOwner, yearMakeModel;
   protected double value;
   protected boolean alternativeFuel;
   private static int vehicleCount;
   
   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   /**
    * Constructor for Vehicle.
    * @param vehicleOwnerIn for vehicleOwner.
    * @param yearMakeModelIn for yearMakeModel.
    * @param valueIn for value.
    * @param alternativeFuelIn for alternativeValue.
    */
   public Vehicle(String vehicleOwnerIn, String yearMakeModelIn,
      double valueIn, boolean alternativeFuelIn) {
      vehicleOwner = vehicleOwnerIn;
      yearMakeModel = yearMakeModelIn;
      value = valueIn;
      alternativeFuel = alternativeFuelIn;
      vehicleCount++;
   }
   
   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   /**
    * Method for getting owner.
    * @return vehicleOwner for vehicle owner.
    */
   public String getOwner() {
      return vehicleOwner;
   }
   
   /**
    * Method for setting owner.
    * @param vehicleOwnerIn for vehicleOwner.
    */
   public void setOwner(String vehicleOwnerIn) {
      vehicleOwner = vehicleOwnerIn;
   }
   
   /**
    * Gets year, make, and model.
    * @return yearMakeModel for the year, make, and model.
    */
   public String getYearMakeModel() {
      return yearMakeModel;
   }
   
   /**
    * Sets year, make, and model.
    * @param yearMakeModelIn for the year, make, and model.
    */
   public void setYearMakeModel(String yearMakeModelIn) {
      yearMakeModel = yearMakeModelIn;
   }
   
   /**
    * Gets value.
    * @return value for value.
    */
   public double getValue() {
      return value;
   }
   
   /**
    * Sets value.
    * @param valueIn for value.
    */
   public void setValue(double valueIn) {
      value = valueIn;
   }
   
   /**
    * Checks if alternative fuel is true or false.
    * @return alternativeFuel for alternative fuel.
    */
   public boolean getAlternativeFuel() {
      return alternativeFuel;
   }
   
   /**
    * Sets alternative fuel value as true or false.
    * @param alternativeFuelIn for alternativeFuel.
    */
   public void setAlternativeFuel(boolean alternativeFuelIn) {
      alternativeFuel = alternativeFuelIn;
   }
   
   /**
    * Gets vehicle count.
    * @return vehicleCount.
    */
   public static int getVehicleCount() {
      return vehicleCount;
   }
   
   /**
    * Resets vehicle count.
    */
   public static void resetVehicleCount() {
      vehicleCount = 0;
   }
   
   /**
    * Returns total amount for vehicle's use tax.
    * @return nothing - needed return tag.
    */
   public abstract double useTax();
   
   /**
    * Returns all values as a string.
    * @return string for string.
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.00###");
      if (alternativeFuel) {
         return vehicleOwner + ": " + this.getClass().getName()
            + " " + yearMakeModel + " (Alternative Fuel)\nValue: $" 
            + df.format(value) + " Use Tax: $";
      }
      else {
         return vehicleOwner + ": " + this.getClass().getName()
            + " " + yearMakeModel + "\nValue: $" + df.format(value)
            + " Use Tax: $";
      }
   }
   
   /**
    * Compares two objects and returns an int.
    * @param vehicleIn for vehicle.
    * @return this.toString()...
    */
   public int compareTo(Vehicle vehicleIn) {
      return this.toString().toLowerCase().compareTo(vehicleIn.toString()
         .toLowerCase());
   }

}