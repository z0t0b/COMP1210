/**
 * Class for semi tractor trailer that extends Truck.
 * 
 * Project 11
 * 12/5/17
 */
public class SemiTractorTrailer extends Truck {
 
   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   protected int axles;
   /** Constant. **/
   public static final double PER_AXLE_TAX_RATE = 0.005;
   
   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   /**
    * Constructor for SemiTractorTrailer.
    * @param vehicleOwnerIn for vehicleOwner.
    * @param yearMakeModelIn for yearMakeModel.
    * @param valueIn for value.
    * @param alternativeFuelIn for alternativeValue.
    * @param tonsIn for tons.
    * @param axlesIn for axles.
    * @throws NegativeValueException for error.
    */
   public SemiTractorTrailer(String vehicleOwnerIn, String yearMakeModelIn,
      double valueIn, boolean alternativeFuelIn, double tonsIn, int axlesIn)
      throws NegativeValueException {
      super(vehicleOwnerIn, yearMakeModelIn, valueIn, alternativeFuelIn,
         tonsIn);
      axles = axlesIn;
      if (axlesIn < 0) {
         vehicleCount--;
         throw new NegativeValueException();
      }
   }
   
   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   /**
    * Method for getting axles.
    * @return axles for axles.
    */
   public int getAxles() {
      return axles;
   }
   
   /**
    * Method for setting axles.
    * @param axlesIn for axles.
    */
   public void setAxles(int axlesIn) {
      axles = axlesIn;
   }
   
   /**
    * Method for useTax().
    * @return result for result.
    */
   public double useTax() {
      double result = super.useTax();
      result += super.getValue() * PER_AXLE_TAX_RATE * axles;
      return result;
   }
   
   /**
    * Result for toString() method.
    * @return string as string.
    */
   public String toString() {
      String result = super.toString();
      result += " Axle Tax Rate: " + PER_AXLE_TAX_RATE * axles;
      return result; 
   }
 
}