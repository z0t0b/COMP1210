import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

/**
 * This program generates a ticket to the moon from user input.
 *
 * Project 3
 * 9/20/17
 */
public class MoonTrip {

   static final double STUDENT_DISCOUNT = .40;
   static final double EMPLOYEE_DISCOUNT = .20;
   
    /**
     * Relies on user input for ticket code, then prints
     * information from the code to the screen.
     * @param args Command line arguments - not used.
     */    
   public static void main(String[]args) {
      
      // Declares some variables and classes.
      Scanner userInput = new Scanner(System.in);
      Random generator = new Random();
      DecimalFormat df = new DecimalFormat("#,###.00");
      DecimalFormat pn = new DecimalFormat("0000");
      String s = "s";
      String e = "e";
      double cost1 = 0;
      double cost2 = 0;
       
      // Prompts user for ticket code, then trims white space.
      System.out.print("Enter ticket code: ");
      String ticketCode = userInput.nextLine();
      System.out.println("");
      String trimUserInput = ticketCode.trim();
       
      
      if (trimUserInput.length() < 26) { // Checks if string is < 26 chars.
         System.out.println("*** Invalid ticket code ***");
         System.out.println("Ticket code must have at least 26 characters.");
      }
      else { // Continues with program.
         
         // Assigns trimmed substring values to declared variables.
         String category = trimUserInput.substring(12, 13);
         float price = Float.parseFloat(trimUserInput.substring(14, 20));
         String seat = trimUserInput.substring(22, 25);
         String itenerary = trimUserInput.substring(25, trimUserInput.length());
         
         // Assigns trimmed portions of date + time input.
         String date1 = trimUserInput.substring(0, 2);
         String date2 = trimUserInput.substring(2, 4);
         String date3 = trimUserInput.substring(4, 8);
         String time1 = trimUserInput.substring(8, 10);
         String time2 = trimUserInput.substring(10, 12);
         
         // Formats date and time for output.
         String date = date1 + "/" + date2 + "/" + date3;
         String time = time1 + ":" + time2;
         
         // Generates random prize number.
         int prizeNumber = generator.nextInt(10000);
       
         if (category.equals(s)) { // Gives student discount to cost.
            cost1 = price * STUDENT_DISCOUNT;
            cost2 = price - cost1;
         }
         else if (category.equals(e)) { // Gives employee discount to cost.
            cost1 = price * EMPLOYEE_DISCOUNT;
            cost2 = price - cost1;
         }
         else { // No discount given to final cost.
            cost2 = price;
         }
         
         // Prints all variables within ticket code to screen.
         System.out.println("Date: " + date + "   Time: " + time + "   "
            + "Seat: " + seat);
         System.out.println("Itinerary: " + itenerary);
         System.out.println("Price: $" + df.format(price) + "   Category: "
            + category + "   Cost: $" + df.format(cost2));
         System.out.println("Prize Number: " + pn.format(prizeNumber));
      }
    
   }
 
}