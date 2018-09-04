import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;

/**
 * This program outputs all information to the screen in an app.
 *
 * Project 5
 * 10/9/17
 */
public class SpherocylinderListApp {
   
   /**
    * Prints circumference, surface area, and volume for imported
    * examples.
    * @param args Command line arguments - not used.
    * @throws FileNotFoundException required by Scanner for file.
    */
   public static void main(String[] args) throws FileNotFoundException {
      ArrayList<Spherocylinder> myList
         = new ArrayList<Spherocylinder>();
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      System.out.println("");
      
      Scanner scanFile = new Scanner(new File(fileName));
      String listName = scanFile.nextLine();
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      while (scanFile.hasNext()) {
         String label = scanFile.nextLine();
         double radius = Double.parseDouble(scanFile.nextLine());
         double cylinderHeight = Double.parseDouble(scanFile.nextLine());
         
         Spherocylinder sc = new Spherocylinder(label, radius, cylinderHeight);
         myList.add(sc);
      }
      scanFile.close();
      
      SpherocylinderList scList = new SpherocylinderList(listName, myList);
      
      System.out.println(scList);
      System.out.println(scList.summaryInfo());
   
   }

}