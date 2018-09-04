/**
 * Sets weight for main program.
 *
 * Activity 9
 * 9/27/17
 */
 
public class ElectronicsItem extends InventoryItem {
 
   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   /**
    * Instance variables - needed a javadoc for some reason.
    */
   public static final double SHIPPING_COST = 1.5;
   protected double weight;
   
   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   /**
    * Constructor for InventoryItem.
    * @param nameIn for name
    * @param priceIn for price
    * @param weightIn for weight
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   /**
    * Method calculates cost and returns it.
    * @return super calculated price.
    */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}