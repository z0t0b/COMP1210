import java.util.Scanner;

/**
 * This program calculates the area of a triangle and requires user input.
 *
 * Project 2
 * 9/13/17
 */

public class AreaOfPyramid {

   /**
    * Calculates area with the base and slant height of a triangle.
    * @param args Command line arguments - not used.
    */    
   public static void main(String[] args) {
   
      // Declares variables base, area, and slantHeight.
      Scanner userInput = new Scanner(System.in);
      int base = 0;
      int slantHeight = 0;
      float area = (base * base) + (4 * (base * slantHeight) / 2);
      
      // Prompts user for input.
      System.out.println("Enter values for base and slant height of a "
         + "pyramid:");
      
      // Prompts for base and slant height values.
      System.out.print("\tbase = ");
      base = userInput.nextInt();
      System.out.print("\tslant height = ");
      slantHeight = userInput.nextInt();
      
      // Prints blank line.
      System.out.println("\n");
      
      // Prints base, slant height, and area to screen.
      System.out.println("A pyramid with base = " + base + " and slant "
         + "height = " + slantHeight + " has an area of " + area
         + " square units.");
   }

}