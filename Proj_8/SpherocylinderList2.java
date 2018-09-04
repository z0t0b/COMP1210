import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This program calculates the surface area and volume for
 * every item in an arraylist.
 *
 * Project 8
 * 10/9/17
 */
public class SpherocylinderList2 {

   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   private String list;
   private Spherocylinder[] spheroList2;
   private int spLength;

   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   /**
    * Passes values to methods.
    * @param listIn for list.
    * @param spheroListIn2 for spheroList2.
    * @param spLengthIn for spLength.
    */
   public SpherocylinderList2(String listIn,
      Spherocylinder[] spheroListIn2, int spLengthIn) {
      list = listIn;
      spheroList2 = spheroListIn2;
      spLength = spLengthIn;
   }
   
   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   /**
    * Returns name of cylinder list.
    * @return list.
    */
   public String getName() {
      return list;
   }
   
   /**
    * Returns number of spherocylinders.
    * @return numberOfCylinders.
    */
   public int numberOfSpherocylinders() {
      int numberOfCylinders = 0;
      if (spLength > numberOfCylinders) {
         numberOfCylinders = spLength;
         return numberOfCylinders;
      }
      else {
         return numberOfCylinders;
      }
   }
   
   /**
    * Returns total surface area.
    * @return total.
    */
   public double totalSurfaceArea() {
      double total = 0;
      int index = 0;
      while (index < spLength) {
         total += spheroList2[index].surfaceArea();
         index++;
      }
      return total;
   }
   
   /**
    * Returns total volume.
    * @return total.
    */
   public double totalVolume() {
      double total = 0;
      int index = 0;
      while (index < spLength) {
         total += spheroList2[index].volume();
         index++;
      }
      return total;
   }
   
   /**
    * Returns average surface area.
    * @return averageSurfaceArea.
    */
   public double averageSurfaceArea() {
      double total = 0;
      int index = 0;
      while (index < spLength) {
         total += spheroList2[index].surfaceArea();
         index++;
      }
      if (spLength == 0) {
         return 0;
      }
      else {
         double averageSurfaceArea = (total / spLength);
         return averageSurfaceArea;
      }
   }
   
   /**
    * Returns average volume.
    * @return averageVolume.
    */
   public double averageVolume() {
      double total = 0;
      int index = 0;
      while (index < spLength) {
         total += spheroList2[index].volume();
         index++;
      }
      if (spLength == 0) {
         return 0;
      }
      else {
         double averageVolume = (total / spLength);
         return averageVolume;
      }
   }
   
   /**
    * Method for printing results in a string.
    * @return result.
    */
   public String toString() {
      String result = list + "\n";
      int index = 0;
      while (index < spLength) {
         result += "\n" + spheroList2[index] + "\n";
         index++;
      }
      return result;
   }
   
   /**
    * Prints summary info to screen.
    * @return result.
    */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      System.out.println("");
      String result = "";
      result += "----- Summary for " + getName() + " -----";
      result += "\nNumber of Spherocylinders: " + numberOfSpherocylinders();
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
      result += "\nTotal Volume: " + df.format(totalVolume());
      result += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      result += "\nAverage Volume: " + df.format(averageVolume());
      return result;
   }
   
   //---------------------------------------------------//
   //                    new methods                    //
   //---------------------------------------------------//
   
   /**
    * Gets ArrayList objects.
    * @return spheroList2.
    */
   public Spherocylinder[] getList() {
      return spheroList2;
   }
   
   /**
    * Reads file.
    * @return sL.
    * @param fileName for file.
    * @throws FileNotFoundException for when file isn't found.
    */
   public SpherocylinderList2 readFile(String fileName)
      throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileName));
      Spherocylinder[] myList = new Spherocylinder[20];
      String nameOfListReadIn = scanFile.nextLine(); 
      int spLengthOfReadIn = 0; 
      while (scanFile.hasNext()) {
         String label = scanFile.nextLine();
         double radius = Double.parseDouble(scanFile.nextLine());
         double cylinderHeight = Double.parseDouble(scanFile.nextLine());
         Spherocylinder s = new Spherocylinder(label, radius, cylinderHeight);
         myList[spLengthOfReadIn] = s;
         spLengthOfReadIn++;
      }               
      SpherocylinderList2 sL = new SpherocylinderList2(nameOfListReadIn, 
         myList, spLengthOfReadIn);
      return sL;
   }
   
   /**
    * Adds a spherocylinder.
    * @param label for label.
    * @param radius for radius.
    * @param cylinderHeight for cylinder height.
    */
   public void addSpherocylinder(String label, double radius, 
      double cylinderHeight) {
      Spherocylinder s = new Spherocylinder(label, radius, cylinderHeight);
      spheroList2[spLength] = s;
      spLength++;
   }
   
   
   /**
    * @param label for label.
    * @return found for result.
    */
   public Spherocylinder findSpherocylinder(String label) {
      Spherocylinder result = null;
      for (int i = 0; i < spLength; i++) {
         if (spheroList2[i].getLabel().equalsIgnoreCase(label))   {
            result = spheroList2[i];
            break;
         }
      }
      return result;     
   }  
   
   /**
    * @param label for label.
    * @return result.
    */
   public Spherocylinder deleteSpherocylinder(String label)  {
      int indexToDelete = 0;
      Spherocylinder result = null;
      for (int i = 0; i < spLength; i++) {
         if (spheroList2[i].getLabel().equalsIgnoreCase(label))   {
            result = spheroList2[i];
            indexToDelete = i;
            break;
         }
      }
      if (result != null) {
         for (int i = indexToDelete; i < spLength - 1; i++) {
            spheroList2[i] = spheroList2[i + 1];
         }
         spheroList2[spLength - 1] = null;
         spLength--;
      }
      return result;
   }
   
   /**
    * @param label for label.
    * @param radius for radius.
    * @param cylinderHeight for cylinder height.
    * @return result for result.
    */
   public boolean editSpherocylinder(String label, double radius, 
      double cylinderHeight) {
      boolean result = false;
      for (Spherocylinder sList : spheroList2) {
         if (sList != null) {
            if (sList.getLabel().equalsIgnoreCase(label)) {
               sList.setRadius(radius);
               sList.setCylinderHeight(cylinderHeight);
               result = true;
               break;
            }
         }
      }
      return result;
   }
   
   /**
    * Finds spherocylinder with shortest radius.
    * @return objects or null.
    */
   public Spherocylinder findSpherocylinderWithShortestRadius() {
      Spherocylinder shortestRadius = null;
      if (spheroList2 != null) {
         shortestRadius = spheroList2[0];
         for (int i = 0; i < spLength; i++) {
            if (spheroList2[i].getRadius() < shortestRadius.getRadius()) {
               shortestRadius = spheroList2[i];
            }
            i++;
         }
      }
      return shortestRadius;
   }
   
   /**
    * Finds spherocylinder with longest radius.
    * @return radius or null.
    */
   public Spherocylinder findSpherocylinderWithLongestRadius() {
      Spherocylinder longestRadius = null;
      if (spheroList2 != null) {
         longestRadius = spheroList2[2];
         for (int i = 0; i < spLength; i++) {
            if (spheroList2[i].getRadius() > longestRadius.getRadius()) {
               longestRadius = spheroList2[i];
            }
            i++;
         }
      }
      return longestRadius;
   }
   
   /**
    * Finds spherocylinder with smallest volume.
    * @return volume or null.
    */
   public Spherocylinder findSpherocylinderWithSmallestVolume() {
      Spherocylinder smallestVolume = null;
      if (spheroList2 != null) {
         smallestVolume = spheroList2[0];
         for (int i = 0; i < spLength; i++) {
            if (spheroList2[i].getRadius() < smallestVolume.getRadius()) {
               smallestVolume = spheroList2[i];
            }
            i++;
         }
      }
      return smallestVolume;
   }
   
   /**
    * Finds spherocylinder with largest volume.
    * @return volume or null.
    */ 
   public Spherocylinder findSpherocylinderWithLargestVolume() {
      Spherocylinder largestVolume = null;
      if (spheroList2 != null) {
         largestVolume = spheroList2[2];
         for (int i = 0; i < spLength; i++) {
            if (spheroList2[i].getRadius() > largestVolume.getRadius()) {
               largestVolume = spheroList2[i];
            }
            i++;
         }
      }
      return largestVolume;
   }
}