import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

/**
 * Program for calculating dimensions of a spherocylinder.
 *
 * Project 6
 * 10/18/17
 */
public class SpherocylinderListMenuApp {
   
   /**
    * Main method for program.
    * @param args Command line arguments - not used.
    * @throws FileNotFoundException if file is not found.
    */
   public static void main(String[] args) 
      throws FileNotFoundException {
      
      String scListName = "*** no list name assigned ***";
      ArrayList<Spherocylinder> spheroList
         = new ArrayList<Spherocylinder>();
      SpherocylinderList scList = new SpherocylinderList(scListName, 
         spheroList);
      Scanner scan = new Scanner(System.in);
      String fileName = "no file name";
      String code = "";
      String label = "";
      double radius = 0;
      double cylinderHeight = 0;
      String bLabel = "";
      
      System.out.println("Spherocylinder List System Menu\n"
         + "R - Read File and Create Spherocylinder List\n"
         + "P - Print Spherocylinder List\n"
         + "S - Print Summary\n"
         + "A - Add Spherocylinder\n"
         + "D - Delete Spherocylinder\n"
         + "F - Find Spherocylinder\n"
         + "E - Edit Spherocylinder\n"
         + "Q - Quit");
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         
         switch (codeChar) {
            case 'R':
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
               scList = scList.readFile(fileName);
               
               System.out.println("\tFile read in and "
                  + "Spherocylinder List created\n");
               break;
            
            case 'P':
               System.out.println("\n" + scList + "\n");
               break;
         
            case 'S':
               System.out.println(scList.summaryInfo());
               break;
            
            case 'A':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scan.nextLine());
               System.out.print("\tCylinder Height: ");
               cylinderHeight = Double.parseDouble(scan.nextLine());
               
               scList.addSpherocylinder(label, radius, cylinderHeight);
               System.out.println("\t*** Spherocylinder added ***\n");
               break;
            
            case 'D':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               if (scList.deleteSpherocylinder(label) == null) {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               break;
            
            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               if (scList.findSpherocylinder(label) == null) {
                  System.out.println("\t\"" + label + "\" not found");
               }
               else {
                  System.out.println(scList.findSpherocylinder(label));
               }
               break;
                  
            case 'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scan.nextLine());
               System.out.print("\tCylinder Height: ");
               cylinderHeight = Double.parseDouble(scan.nextLine());
               boolean t = scList.editSpherocylinder(label, radius, 
                  cylinderHeight);
               if (t == true) {
                  System.out.println("\t\"" + label 
                     + "\" successfully edited\n");
               } 
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
                  break;
               }
            
            case 'Q':
               break;
            
            default:
               System.out.println("\t*** invalid code ***");
               break;         
         }
      } while (!code.equalsIgnoreCase("Q"));   
   }

}