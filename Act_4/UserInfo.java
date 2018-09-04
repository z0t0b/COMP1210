/**
 * This program lets the user assign input to variables within
 * the interactions pane.
 *
 * Activity 4A
 * 9/25/17
 */
public class UserInfo {
    
   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   
   private String firstName = "";
   private String lastName = "";
   private String location = "";
   private int age = 0;
   private int status = 0;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   
   /**
    * Checks if age > 0, then sets user age.
    * @param firstNameIn for first name.
    * @param lastNameIn for last name.
    */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   
   /**
    * Prints name, location, age, and status to screen.
    * @return string
    */
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
   
   /**
    * Sets user location.
    * @param locationIn for location.
    */
   public void setLocation(String locationIn) { 
      location = locationIn;
   }
   
   /**
    * Checks if age > 0, then sets user age.
    * @param ageIn for age.
    * @return age.
    */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
    * Checks if age > 0, then sets user age.
    * @return age
    */
   public int getAge() {
      return age;
   }
   
   /**
    * Checks if age > 0, then sets user age.
    * @return location.
    */
   public String getLocation() {
      return location;
   }
   
   /**
    * Logs user off.
    */
   public void logOff() {
      status = OFFLINE;
   }
   
   /**
    * Logs user on.
    */
   public void logOn() {
      status = ONLINE;
   }
}