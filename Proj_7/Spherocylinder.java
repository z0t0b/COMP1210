import java.text.DecimalFormat;

/**
 * This program calculates values for a spherocylinder based on
 * user input.
 *
 * Project 7
 * 9/27/17
 */
public class Spherocylinder {

   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   
   private String label = "";
   private double radius = 0;
   private double cylHeight = 0;
   
   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   
   /**
    * Passes values to methods.
    * @param labelIn for label.
    * @param radiusIn for radius.
    * @param cylHeightIn for cylHeight.
    */
   public Spherocylinder(String labelIn, double radiusIn, double cylHeightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(cylHeightIn);
   }
   
   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   
   /**
    * Sets label.
    * @return label.
    */
   public String getLabel() {
      return label;
   }
   
   /**
    * Checks if label has input, then sets the value.
    * @param labelIn for label.
    * @return isSet.
    */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Sets radius.
    * @return radius.
    */
   public double getRadius() {
      return radius;
   }
   
   /**
    * Checks if radius is positive, then sets the value.
    * @param radiusIn for radius.
    * @return isSet2.
    */
   public boolean setRadius(double radiusIn) {
      if (radiusIn >= 0) {
         radius = radiusIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Sets cylinder height.
    * @return cylHeight.
    */
   public double getCylinderHeight() {
      return cylHeight;
   }
   
   /**
    * Checks if value is positive, then sets the value.
    * @param cylHeightIn for cylHeight.
    * @return isSet3.
    */
   public boolean setCylinderHeight(double cylHeightIn) {
      if (cylHeightIn >= 0) {
         cylHeight = cylHeightIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Calculates circumference.
    * @return circumference.
    */
   public double circumference() {
      double circumference = 2 * Math.PI * radius;
      return circumference;
   }
   
   /**
    * Calculates surface area.
    * @return surfaceArea.
    */
   public double surfaceArea() {
      double surfaceArea = (2 * Math.PI * radius) * (2 * radius + cylHeight);
      return surfaceArea;
   }
   
   /**
    * Calculates volume.
    * @return volume.
    */
   public double volume() {
      double volume = (Math.PI * Math.pow(radius, 2)) * ((4.0 / 3.0) * radius
         + cylHeight);
      return volume;
   }
   
   /**
    * Prints all values to the screen.
    * @return output.
    */
   public String toString() {
      DecimalFormat f = new DecimalFormat("#,##0.0##");
      
      String output = "Spherocylinder \"" + label + "\" with radius " + radius
         + " and cylinder height " + cylHeight + " has:\n";
      output += "\tcircumference = " + f.format(circumference()) + " units\n";
      output += "\tsurface area = " + f.format(surfaceArea())
         + " square units\n";
      output += "\tvolume = " + f.format(volume()) + " cubic units";
      return output;
   }


}