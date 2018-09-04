/**
 * Main class for main program.
 *
 * Activity 10
 * 11/25/17
 */
 
public class InventoryItem {
 
   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   /**
    * Constructor for InventoryItem.
    * @param nameIn for name
    * @param priceIn for price
    */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   /**
    * Method returns customer name.
    * @return name for customer name.
    */
   public String getName() {
      return name;
   }
   
   /**
    * Method calculates cost and returns it.
    * @return calculated price.
    */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   
   /**
    * Method sets the tax rate.
    * @param taxRateIn for taxRate.
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /**
    * Returns representation as a string.
    * @return string as string.
    */
   public String toString() {
      return name + ": $" + calculateCost();
   }
   
}