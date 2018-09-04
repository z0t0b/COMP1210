/**
 * Gets & sets customer name, location, and balance.
 *
 * Activity 8B
 * 11/6/17
 */
public class Customer implements Comparable<Customer> {
 
   //---------------------------------------------------//
//                instance variables                 //
//---------------------------------------------------//
   private String customerName;
   private String customerLocation;
   private double customerBalance;
   
   //---------------------------------------------------//
//                    constructor                    //
//---------------------------------------------------//
/**
 * Constructor class.
 * @param nameIn for customerName.
 */
   public Customer(String nameIn) {
      customerName = nameIn;
      customerLocation = "";
      customerBalance = 0;
   }

//---------------------------------------------------//
//                      methods                      //
//---------------------------------------------------//
/**
 * Sets customer location.
 * @param locationIn for customerLocation.
 */
   public void setLocation(String locationIn) {
      customerLocation = locationIn;
   }
   
/**
 * Overrides location, sets by state and city.
 * @param city for city.
 * @param state for state.
 */
   public void setLocation(String city, String state) {
      customerLocation = city + ", " + state;
   }

/**
 * Changes customer balance.
 * @param amount for customerBalance.
 */
   public void changeBalance(double amount) {
      customerBalance = customerBalance + amount;
   }

/**
 * Gets customer location.
 * @return customerLocation.
 */
   public String getLocation() {
      return customerLocation;
   }

/**
 * Gets customer balance.
 * @return customerBalance.
 */
   public double getBalance() {
      return customerBalance;
   }
   
/**
 * Returns name, location, and balance as a string.
 * @return a string.
 */
   public String toString() {
      return customerName + "\n"
         + customerLocation + "\n"
         + "$" + customerBalance;
   }

/**
 * Compares customer objects.
 * @param obj as customer object.
 * @return 0, -1, or 1.
 */
   public int compareTo(Customer obj) {
      if (Math.abs(this.customerBalance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.customerBalance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }
}