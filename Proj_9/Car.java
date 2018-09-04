import java.text.DecimalFormat;

/**
 * Subclass of vehicle class.
 *
 * Project 9
 * 11/15/17
 */
public class Car extends Vehicle {

   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   /** Constant. **/
   public static final double TAX_RATE = 0.01;
   /** Constant. **/
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.005;
   /** Constant. **/
   public static final double LUXURY_THRESHOLD = 50_000;
   /** Constant. **/
   public static final double LUXURY_TAX_RATE = 0.02;
   
   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   /**
    * Constructor for Car.
    * @param vehicleOwnerIn for vehicleOwner.
    * @param yearMakeModelIn for yearMakeModel.
    * @param valueIn for value.
    * @param alternativeFuelIn for alternativeValue.
    */
   public Car(String vehicleOwnerIn, String yearMakeModelIn,
      double valueIn, boolean alternativeFuelIn) {
      super(vehicleOwnerIn, yearMakeModelIn, valueIn, alternativeFuelIn);
   }
   
   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   /**
    * Overrides useTax method.
    * @return value for total use tax.
    */
   public double useTax() {
      double useTax;
      if (alternativeFuel) {
         useTax = super.getValue() * ALTERNATIVE_FUEL_TAX_RATE;
      }
      else {
         useTax = super.getValue() * TAX_RATE;
      }
      if (super.getValue() > LUXURY_THRESHOLD) {
         useTax += super.getValue() * LUXURY_TAX_RATE;
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
      if (this.getValue() > LUXURY_THRESHOLD) {
         result += " Luxury Tax Rate: " + LUXURY_TAX_RATE;
      }
      return result;
   }
}