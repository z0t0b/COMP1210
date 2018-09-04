/**
 * This program gets all even and odd scores, and
 * also calculates the average.
 *
 * Activity 7
 * 10/23/17
 */
public class Scores {

   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   private int[] numbers;
   
   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   /**
    * @param numbersIn for numbers.
    */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   
   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   /**
    * @return evens.
    */
   public int[] findEvens() {
      int numberEvens = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      int[] evens = new int[numberEvens];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   
   /** 
    * @return odds.
    */
   public int[] findOdds() {
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            numberOdds++;
         }
      }
      int[] odds = new int[numberOdds];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   /**
    *@return sum / numLength.
    */
   public double calculateAverage() {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      double numLength = numbers.length;
      return sum / numLength;
   }
   
   /**
    * @return result.
    */
   public String toString() {
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
   
   /**
    * @return result.
    */
   public String toStringInReverse() {
      String result = "";
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      return result;
   }
}