/**
 * Sets author for main program.
 *
 * Activity 9
 * 9/27/17
 */
 
public class OnlineBook extends OnlineTextItem {
 
   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   protected String author;
   
   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   /**
    * Constructor for InventoryItem.
    * @param nameIn for name
    * @param priceIn for price
    */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   /**
    * Method for setting author.
    * @param authorIn for author.
    * @return author for author.
    */
   public String setAuthor(String authorIn) {
      author = authorIn;
      return author;
   }
   /**
    * Method calculates cost and returns it.
    * @return all values to string.
    */
   public String toString() {
      return name + " - " + author + ": $" + price;
   }
}