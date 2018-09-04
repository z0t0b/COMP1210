/**
 * Holds array of InventoryItem objects.
 *
 * Activity 10
 * 11/25/17
 */
 
public class ItemsList {

   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   
   private InventoryItem[] inventory;
   private int count;
   
   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   /**
    * Constructor for ItemsList.
    */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   /**
    * Adds item to array.
    * @param itemIn for item.
    */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   
   /**
    * Calculates total.
    * @param electronicsSurcharge for surcharge.
    * @return total for total.
    */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   
   /**
    * Prints everything as a string.
    * @return string as string.
    */
   public String toString() {
      String output = "All inventory:\n\n";
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      return output;
   }

}