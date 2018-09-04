import java.util.Scanner;

/**
 * Program asks user for amount of liquid in ounces, then converts it.
 *
 * Project 2
 * 9/13/17
 */

public class LiquidMeasures {
   
   /**
    * Calculates measures by volume.
    * @param args - Command line arguments, not used.
    */
   public static void main(String[] args) {
      
      // Declares variables barrels, gallons, quarts, and ounces.
      Scanner userInput = new Scanner(System.in);
      int barrels = 0;
      int gallons = 0;
      int quarts = 0;
      int ounces = 0;
      int userOunces = 0;
      
      // Prompts user for ounces.
      System.out.print("Enter amount of liquid in ounces: ");
      userOunces = userInput.nextInt();
      
      // Determines if input is over 1,000,000,000.
      if (userOunces > 1000000000) {
         System.out.println("Amount must not exceed 1,000,000,000.");
         return;
      }
      
      else {
         // Prints values for barrels, gallons, quarts, and ounces.
         System.out.println("Measures by volume:");
         System.out.println("\tBarrels: " + barrels);
         System.out.println("\tGallons: " + gallons);
         System.out.println("\tQuarts: " + quarts);
         System.out.println("\tOunces: " + ounces);
      
         // Prints calculations to the screen.
         System.out.println(userOunces + " oz = (" + barrels + " bl * 5376 oz) "
            + "+ (" + gallons + " gal * 128 oz) + (" + quarts + " qt * 32 oz) "
            + "+ (" + ounces + " oz)");
      }
   }

}