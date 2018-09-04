/**
 * This program calculates loans and balances for users.
 *
 * Activity 8A
 * 10/30/17
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
   
   /**
    * @param customerNameIn for customerName.
    * @param interestRateIn for interestRate.
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   /**
    * @param amount for amount.
    * @return wasLoanMade for if loan is made.
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   
   /**
    * @param amountPaid for amount.
    * @return Math.abs(newBalance) for balance.
    */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
    * @return balance for balance.
    */
   public double getBalance() {
      return balance;
   }
   
   /**
    * @param interestRateIn for interestRate.
    * @return true or false.
    */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * @return interestRate.
    */
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
    * balance = balance * (1 + interestRate).
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
    * @return output.
    */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   
   /**
    * @param amount for amount.
    * @return amount >= 0.
    */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   
   /**
    * @param loan for loan.
    * @return true or false.
    */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   
   /**
    * @return loansCreated.
    */
   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /**
    * loansCreated = 0.
    */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }

}
