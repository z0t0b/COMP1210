import java.util.Scanner;

/**
 * This program will change text entered by the user.
 *
 * Activity 3
 * 9/18/17
 */

public class MessageConverter {
   /**
    * Changes user input in to 5 different outputs.
    * @param args Command line arguments - not used.
    */
   
   public static void main(String[]args) { // Makes main function
      
      // Assigns variables userInput, message, and result
      Scanner userInput = new Scanner(System.in);
      String message = "";
      String result = "";
      
      // Prompts user for message
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      
      // Prints output types to the screen
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
         
      // Changes user input to an integer
      int outputType = Integer.parseInt(userInput.nextLine());
      
      if (outputType == 0) { // As is
         result = message;
      }
      else if (outputType == 1) { // Trimmed
         result = message.trim();
      }
      else if (outputType == 2) { // Lower case
         result = message.toLowerCase();
      }
      else if (outputType == 3) { // Upper case
         result = message.toUpperCase();
      }
      else if (outputType == 4) { // Replace vowels
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
      }
      else if (outputType == 5) { // Without first and last character
         result = message.substring(1, message.length() - 1);
      }
      else { // Invalid input
         result = "Error: Invalid choice input.";
      }
      // Prints result to screen
      System.out.println("\n" + result);
   }
   
}