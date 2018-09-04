import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Calculates user input, then prints # of digits to left and right of
 * output, and the formatted result.
 *
 * Project 3
 * 9/18/17
 */
public class ExpressionEvaluator {

   /**
    * This program calculates input through an expression and prints
    * results to the screen.
    * @param args Command line arguments - not used.
    */    
   public static void main(String[]args) {
      
      // Declares variables and scanner class.
      Scanner userInput = new Scanner(System.in);
      
      // Prompts user for input.
      System.out.print("Enter a value for x: ");
      double input = userInput.nextDouble();
      
      // Math formula for expression.
      double result = Math.sqrt(Math.abs(23.7 * Math.pow(input, 9)) - input)
         / (7.3 * Math.pow(input, 2) + 5.2 * input + 3.1);
      
      // Assigns new decimal format to variable "formatted".
      DecimalFormat formatted = new DecimalFormat("#,##0.0####");
      
      String res1 = new Double(result).toString();
      String afterLeft = res1.substring(0, res1.indexOf('.'));
      int numbToLeft = afterLeft.length();
      String afterRight = res1.substring(res1.indexOf('.'), res1.length());
      int numbToRight = afterRight.length() - 1;
      
      // Prints final values to screen.
      System.out.println("Result: " + result);
      System.out.println("# digits to left of decimal point: " + numbToLeft);
      System.out.println("# digits to right of decimal point: " + numbToRight);
      System.out.println("Formatted Result: " + formatted.format(result));
   }

}