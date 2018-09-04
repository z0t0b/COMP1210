import java.text.DecimalFormat;

/**
 * Class for motorcycle that extends vehicle.
 * 
 * Project 10
 * 11/29/17
 */
public class Motorcycle extends Vehicle {
 
   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   protected double engineSize;
   /** Constant. **/
   public static final double TAX_RATE = 0.005;
   /** Constant. **/
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.0025;
   /** Constant. **/
   public static final double LARGE_BIKE_CC_THRESHOLD = 499;
   /** Constant. **/
   public static final double LARGE_BIKE_TAX_RATE = .015;
   
   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   /**
    * Constructor for Motorcycle.
    * @param vehicleOwnerIn for vehicleOwner.
    * @param yearMakeModelIn for yearMakeModel.
    * @param valueIn for value.
    * @param alternativeFuelIn for alternativeValue.
    * @param engineSizeIn for engineSize.
    */
   public Motorcycle(String vehicleOwnerIn, String yearMakeModelIn,
      double valueIn, boolean alternativeFuelIn, double engineSizeIn) {
      super(vehicleOwnerIn, yearMakeModelIn, valueIn, alternativeFuelIn);
      engineSize = engineSizeIn;
   }
   
   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   /**
    * Method for getting engine size.
    * @return engineSize for engine size.
    */
   public double getEngineSize() {
      return engineSize;
   }
   
   /**
    * Method for setting engine size.
    * @param engineSizeIn for engineSize.
    */
   public void setEngineSize(double engineSizeIn) {
      engineSize = engineSizeIn;
   }
   
   /**
    * Method for useTax().
    * @return useTax as result.
    */
   public double useTax() {
      double useTax;
      if (alternativeFuel) {
         useTax = super.getValue() * ALTERNATIVE_FUEL_TAX_RATE;
      }
      else {
         useTax = super.getValue() * TAX_RATE;
      }
      if (this.getEngineSize() > LARGE_BIKE_CC_THRESHOLD) {
         useTax += super.getValue() * LARGE_BIKE_TAX_RATE;
      }
      return useTax;
   }
   
   /**
    * Result for toString() method.
    * @return string as string.
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.00###");
      String result = super.toString() + df.format(this.useTax());
      if (alternativeFuel) {
         result += "\nwith Tax Rate: " + ALTERNATIVE_FUEL_TAX_RATE;
      }
      else {
         result += "\nwith Tax Rate: " + TAX_RATE;
      }
      if (engineSize > LARGE_BIKE_CC_THRESHOLD) {
         result += " Large Bike Tax Rate: " + LARGE_BIKE_TAX_RATE;
      }
      return result;
   }
 
}