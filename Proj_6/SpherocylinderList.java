import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This program calculates the surface area and volume for
 * every item in an arraylist.
 *
 * Project 6
 * 10/9/17
 */
public class SpherocylinderList {

   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   private String list = "";
   private ArrayList<Spherocylinder> spheroList
      = new ArrayList<Spherocylinder>();

   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   /**
    * Passes values to methods.
    * @param listIn for list.
    * @param spheroListIn for spheroList.
    */
   public SpherocylinderList(String listIn,
      ArrayList<Spherocylinder> spheroListIn) {
      list = listIn;
      spheroList = spheroListIn;
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
      if (spheroList.size() > numberOfCylinders) {
         numberOfCylinders = spheroList.size();
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
      while (index < spheroList.size()) {
         total += spheroList.get(index).surfaceArea();
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
      while (index < spheroList.size()) {
         total += spheroList.get(index).volume();
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
      while (index < spheroList.size()) {
         total += spheroList.get(index).surfaceArea();
         index++;
      }
      if (spheroList.size() == 0) {
         return 0;
      }
      else {
         double averageSurfaceArea = (total / spheroList.size());
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
      while (index < spheroList.size()) {
         total += spheroList.get(index).volume();
         index++;
      }
      if (spheroList.size() == 0) {
         return 0;
      }
      else {
         double averageVolume = (total / spheroList.size());
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
      while (index < spheroList.size()) {
         result += "\n" + spheroList.get(index) + "\n";
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
    * @return myList
    */
   public ArrayList<Spherocylinder> getList() {
      return spheroList;
   }
   
   /**
    * Reads file.
    * @return sL.
    * @param fileName for file.
    * @throws FileNotFoundException for when file isn't found.
    */
   public SpherocylinderList readFile(String fileName)
      throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileName));
      ArrayList<Spherocylinder> myList
           = new ArrayList<Spherocylinder>(); 
      list = scanFile.nextLine();  
      while (scanFile.hasNext()) {
         String label = scanFile.nextLine();
         double radius = Double.parseDouble(scanFile.nextLine());
         double cylinderHeight = Double.parseDouble(scanFile.nextLine());
         Spherocylinder s = new Spherocylinder(label, radius, cylinderHeight);
         myList.add(s);
      }               
      SpherocylinderList sL = new SpherocylinderList(list, myList);
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
      spheroList.add(s);
   }
   
   /**
    * @param label for label.
    * @return found for result.
    */
   public Spherocylinder findSpherocylinder(String label) {
      for (Spherocylinder s : spheroList) {
         if (s.getLabel().equalsIgnoreCase(label))   {
            return s;
         }
      }
      return null;     
   }  
   
   /**
    * @param label for label.
    * @return result.
    */
   public Spherocylinder deleteSpherocylinder(String label)  {
      String deleteLabel = label.trim().toUpperCase();
      Spherocylinder scanObj;
      Spherocylinder obj = null;
      boolean result = false;
      String labelObj;
      String trimmed;
      int i = 0;
      int remove = -1;
      
      for (i = 0; i < spheroList.size(); i++) {
         scanObj = spheroList.get(i);
         labelObj = scanObj.getLabel();
         trimmed = labelObj.trim().toUpperCase();
         if (trimmed.equals(deleteLabel))  {
            obj = spheroList.get(i);
            remove = spheroList.indexOf(spheroList.get(i));
            result = true;
            break; 
         }
         else {
            result = false;
         }
      } 
      if (result) {
         spheroList.remove(remove);
         return obj;
      }
      else {
         return null;
      }
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
      for (Spherocylinder sList : spheroList) {
         if (sList.getLabel().equalsIgnoreCase(label)) {
            sList.setRadius(radius);
            sList.setCylinderHeight(cylinderHeight);
            result = true;
            break;
         }
         else {
            result = false;
         }
      }
      return result;
   }
}