import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program gets user inputprints low & high temperatures to the screen.
 *
 * Activity 6
 * 10/16/17
 */
public class TemperatureInfo {
   
   /**
    * Prints low temp, high temp, and all temps that were input by the user.
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList
         = new ArrayList<Integer>();
      String tempInput = "";
      
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
      
      Temperatures temps = new Temperatures(tempsList);
      
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp, "
            + "[P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
         
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
         
            case 'P':
               System.out.println(temps);
               break;
         
            case 'E':
               System.out.println("\tDone");
               break;
         
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
   }

}