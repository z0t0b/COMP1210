/**
 * Abstract class - returns price without tax.
 *
 * Activity 9
 * 9/27/17
 */
 
public abstract class OnlineTextItem extends InventoryItem {
 
   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   
   // no instance variables for this class
   
   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   /**
    * Constructor for InventoryItem.
    * @param nameIn for name
    * @param priceIn for price
    */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   
   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   /**
    * Method calculates cost and returns it.
    * @return super calculated price.
    */
   public double calculateCost() {
      return price;
   }
}