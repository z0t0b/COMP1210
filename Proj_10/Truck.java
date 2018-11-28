import java.text.DecimalFormat;

/**
 * Program for truck that extends vehicle.
 *
 * Project 10
 * 11/29/17
 */
public class Truck extends Vehicle {

   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   protected double tons;
   /** Constant. **/
   public static final double TAX_RATE = 0.02;
   /** Constant. **/
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.01;
   /** Constant. **/
   public static final double LARGE_TRUCK_TONS_THRESHOLD = 2;
   /** Constant. **/
   public static final double LARGE_TRUCK_TAX_RATE = 0.03;
   
   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   /**
    * Constructor for Truck.
    * @param vehicleOwnerIn for vehicleOwner.
    * @param yearMakeModelIn for yearMakeModel.
    * @param valueIn for value.
    * @param alternativeFuelIn for alternativeValue.
    * @param tonsIn for tons.
    */
   public Truck(String vehicleOwnerIn, String yearMakeModelIn,
      double valueIn, boolean alternativeFuelIn, double tonsIn) {
      super(vehicleOwnerIn, yearMakeModelIn, valueIn, alternativeFuelIn);
      tons = tonsIn;
   }
   
   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   /**
    * Gets tons.
    * @return tons for tons.
    */
   public double getTons() {
      return tons;
   }
   
   /**
    * Sets tons.
    * @param tonsIn for tons.
    */
   public void setTons(double tonsIn) {
      tons = tonsIn;
   }
   
   /**
    * Overrides useTax method.
    * @return value for use tax.
    */
   public double useTax() {
      double useTax;
      if (alternativeFuel) {
         useTax = super.getValue() * ALTERNATIVE_FUEL_TAX_RATE;
      }
      else {
         useTax = super.getValue() * TAX_RATE;
      }
      if (tons > LARGE_TRUCK_TONS_THRESHOLD) {
         useTax += super.getValue() * LARGE_TRUCK_TAX_RATE;
      }
      return useTax;
   }
   
   /**
    * Overrides toString() method.
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
      if (tons > LARGE_TRUCK_TONS_THRESHOLD) {
         result += " Large Truck Tax Rate: " + LARGE_TRUCK_TAX_RATE;
      }
      return result;
   }
}