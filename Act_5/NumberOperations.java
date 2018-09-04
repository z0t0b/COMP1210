/**
 * This program calculates user input and prints odd
 * numbers and powers that are under the input value.
 *
 * Activity 5
 * 10/4/17
 */
public class NumberOperations {

   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   // Declares private variable number.
   private int number;
   
   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   /**
    * Creates constructor class NumberOperations.
    * @param numberIn for number.
    */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
   
   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   /**
    * Gets the value of user input.
    * @return number.
    */
   public int getValue() {
      return number;
   }
   
   /**
    * Returns all odd numbers below user input.
    * @return output.
    */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   
   /**
    * Returns all powers below user input.
    * @return output.
    */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   
   /**
    * Checks if input is greater than a value.
    * @param compareNumber for number.
    * @return Command line arguments - not used.
    */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   
   /**
    * Returns value as a string.
    * @return Command line arguments - not used.
    */
   public String toString() {
      return number + "";
   }
}