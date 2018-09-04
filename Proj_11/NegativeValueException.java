/**
 * Class for NegativeValueException.
 *
 * Project 11
 * 12/6/17
 */
public class NegativeValueException extends Exception {

   /** Constructor for NegativeValueException. */
   public NegativeValueException() {
      super("Numeric values must be nonnegative");
   }

}