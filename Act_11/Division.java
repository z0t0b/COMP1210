/**
 * Program for division.
 *
 * Activity 11
 * 11/29/17
 */
public class Division {

   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   
   
   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   /**
    * Constructor for Division.
    */
   public Division() {
   }
   
   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   /**
    * Divides ints.
    * @param numerator for numerator.
    * @param denominator for denominator.
    * @return numerator / denominator or zero.
    */
   public static int intDivide(int numerator, int denominator) {
      try {
         return numerator / denominator;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
   
   /**
    * Divides numbers as decimals.
    * @param numerator for numerator.
    * @param denominator for denominator.
    * @return numerator / denominator.
    */
   public static double decimalDivide(int numerator, int denominator) {
      if (denominator == 0) {
         throw new IllegalArgumentException("The denominator "
              + "cannot be zero.");
      }
      else {
         return (double) numerator / (double) denominator;
      }
   }
}