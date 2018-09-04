import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This program prompts the user for the label, radius, and cylinder
 * height of a spherocylinder, then calculates the circumference,
 * surface area, and volume.
 *
 * Project 4
 * 9/27/17
 */
public class SpherocylinderApp {
   
   /**
    * Prints calculations for dimensions of a spherocylinder to the screen.
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {
      
      // Declares scanner + decimalformat classes.
      Scanner scan = new Scanner(System.in);
      DecimalFormat f = new DecimalFormat("#,##0.0##");
      
      // Prompts user for label, radius, and cylinder height.
      System.out.println("Enter label, radius, and cylinder height"
         + " for a spherocylinder.");
      System.out.print("\tlabel: ");
      String label = scan.nextLine();
      System.out.print("\tradius: ");
      double radius = scan.nextDouble();
      
      if (radius < 0) { // Ends program if radius is negative.
         System.out.println("Error: radius must be non-negative.");
      }
      
      else { // Continues with program.
         System.out.print("\tcylinder height: ");
         double cylHeight = scan.nextDouble();
         
         if (cylHeight < 0) { // Ends program if cylinder height is negative.
            System.out.println("Error: cylinder height must be non-negative.");
         }
         else { // Continues with program.
            
            // Calculates circumference, surface area, and volume.
            double circumference = 2 * Math.PI * radius;
            double surfaceArea = (2 * Math.PI * radius) * (2 * radius
               + cylHeight);
            double volume = (Math.PI * Math.pow(radius, 2)) * ((4.0 / 3.0)
               * radius + cylHeight);
            
            // Prints values to screen.
            System.out.print("\n");
            System.out.print("Spherocylinder \"" + label + "\" with radius "
               + radius + " and cylinder height " + cylHeight + " has:\n");
            System.out.print("\tcircumference = " + f.format(circumference)
               + " units\n");
            System.out.print("\tsurface area = " + f.format(surfaceArea)
               + " square units\n");
            System.out.print("\tvolume = " + f.format(volume)
               + " cubic units\n");
         }
      }
   
   }

}