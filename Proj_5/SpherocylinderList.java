import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * This program calculates the surface area and volume for
 * every item in an arraylist.
 *
 * Project 5
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

}