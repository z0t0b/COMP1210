/**
 * This program prints assigned information for two users to the screen.
 *
 * Activity 4A
 * 9/25/17
 */
public class UserInfoDriver {
   
   /**
    * Prints information for user1 and user2 to screen.
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {
      
      // Creates user1 and assigns information to it.
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      // Creates user2 and assigns information to it.
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   
   }

}