/**
 * Sets word count for main program.
 *
 * Activity 10
 * 11/25/17
 */
 
public class OnlineArticle extends OnlineTextItem {
 
   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   private int wordCount;
   
   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   /**
    * Constructor for InventoryItem.
    * @param nameIn for name
    * @param priceIn for price
    */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   /**
    * Method calculates cost and returns it.
    * @param wordCountIn for wordCount.
    * @return wordCount for wordCount.
    */
   public int setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
      return wordCount;
   }
}