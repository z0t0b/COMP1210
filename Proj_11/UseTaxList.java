import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.NoSuchElementException;

/**
 * Sorts vehicles by owner and use tax amount.
 *
 * Project 11
 * 12/5/17
 */
public class UseTaxList {

   //---------------------------------------------------//
   //                instance variables                 //
   //---------------------------------------------------//
   private String taxDistrict;
   private Vehicle[] vehicleList;
   private String[] excludedRecords;
   
   //---------------------------------------------------//
   //                    constructor                    //
   //---------------------------------------------------//
   /**
    * Constructor for UseTaxList.
    */
   public UseTaxList() {
      taxDistrict = "Not assigned";
      vehicleList = new Vehicle[0];
      excludedRecords = new String[0];
   }
   
   //---------------------------------------------------//
   //                      methods                      //
   //---------------------------------------------------//
   /**
    * Reads the vehicle file name.
    * @param fileNameIn for fileName.
    * @throws FileNotFoundException if file is not found.
    */
   public void readVehicleFile(String fileNameIn) throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      taxDistrict = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         String fileLines = scanFile.nextLine();
         Scanner scan = new Scanner(fileLines);
         scan.useDelimiter(";");
         
         try {
            String vehicleType = scan.next().trim();
            String ownerName = scan.next().trim();
            String yearMakeModel = scan.next().trim();
            double value = Double.parseDouble(scan.next().trim());
            Boolean alternativeFuel = Boolean.parseBoolean(scan.next().trim());
            char choice = vehicleType.toUpperCase().charAt(0);
            switch (choice) {
               case 'C':
                  Car car = new Car(ownerName, yearMakeModel, value,
                     alternativeFuel);
                  addVehicle(car);
                  break;
               case 'T':
                  double tons = Double.parseDouble(scan.next());
                  Truck truck = new Truck(ownerName, yearMakeModel,
                     value, alternativeFuel, tons);
                  addVehicle(truck);
                  break;
               case 'S':
                  double tons2 = Double.parseDouble(scan.next());
                  int axles = Integer.parseInt(scan.next().trim());
                  SemiTractorTrailer stt = new SemiTractorTrailer(ownerName,
                     yearMakeModel, value, alternativeFuel, tons2, axles);
                  addVehicle(stt);
                  break;
               case 'M':
                  int engineSize = Integer.parseInt(scan.next().trim());
                  Motorcycle mtrcycle = new Motorcycle(ownerName, 
                     yearMakeModel, value, alternativeFuel, engineSize);
                  addVehicle(mtrcycle);
                  break;
               default:
                  addExcludedRecord(fileLines);
                  break; 
            }        
         }
         catch (NegativeValueException e) {
            addExcludedRecord(e + " in:\n" + fileLines);
         }
         catch (NumberFormatException e) {
            addExcludedRecord(e + " in:\n" + fileLines);
         }
         catch (NoSuchElementException e) {
            addExcludedRecord(e + " in:\n" + fileLines);
         }
      }
   }
   
   /**
    * Gets tax district.
    * @return taxDistrict as string.
    */
   public String getTaxDistrict() {
      return taxDistrict;
   }
   
   /**
    * Sets tax district.
    * @param taxDistrictIn for taxDistrict.
    */
   public void setTaxDistrict(String taxDistrictIn) {
      taxDistrict = taxDistrictIn;
   }
   
   /**
    * Gets vehicle list.
    * @return vehicleList as list.
    */
   public Vehicle[] getVehicleList() {
      return vehicleList;
   }
   
   /**
    * Gets excluded records.
    * @return excludedRecords as a string array.
    */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
   
   /**
    * Adds a vehicle.
    * @param vehicleIn for vehicle.
    */
   public void addVehicle(Vehicle vehicleIn) {
      vehicleList = Arrays.copyOf(vehicleList, vehicleList.length + 1);
      vehicleList[vehicleList.length - 1] = vehicleIn;
   }
   
   /**
    * Adds excluded records.
    * @param excludedRecordsIn for excludedRecords.
    */
   public void addExcludedRecord(String excludedRecordsIn) {
      excludedRecords = Arrays.copyOf(excludedRecords,
         excludedRecords.length + 1);
      excludedRecords[excludedRecords.length - 1] = excludedRecordsIn;
   }
   
   /**
    * Returns objects as a string.
    * @return result as result.
    */
   public String toString() {
      String result = "";
      for (int i = 0; i < vehicleList.length; i++) {
         result += "\n" + vehicleList[i] + "\n";
      }
      return result;
   }
   
   /**
    * Calculates total use tax.
    * @return totalUseTax as total use tax.
    */
   public double calculateTotalUseTax() {
      double totalUseTax = 0;
      for (int i = 0; i < vehicleList.length; i++) {
         totalUseTax += vehicleList[i].useTax();
      }
      return totalUseTax;
   }
   
   /**
    * Calculates total value.
    * @return totalValue as total value.
    */
   public double calculateTotalValue() {
      double totalValue = 0;
      for (int i = 0; i < vehicleList.length; i++) {
         totalValue += vehicleList[i].getValue();
      }
      return totalValue;
   }
   
   /**
    * Returns a string representing summary info.
    * @return result as result.
    */
   public String summary() {
      String result = "------------------------------";
      result += "\nSummary for Tax District " + this.getTaxDistrict();
      result += "\n------------------------------";
      result += "\nNumber of Vehicles: " + vehicleList.length;
      result += "\nTotal Value: " + calculateTotalValue();
      result += "\nTotal Use Tax: " + calculateTotalUseTax() + "\n";
      return result;
   }
   
   /**
    * Returns a list sorted by owner.
    * @return result as result.
    */
   public String listByOwner() {
      String result = "";
      result += "------------------------------";
      result += "\nVehicles by Owner";
      result += "\n------------------------------\n";
      Vehicle[] fixedList = Arrays.copyOf(vehicleList, vehicleList.length);
      Arrays.sort(fixedList);
      for (Vehicle v: fixedList) {
         result += "\n" + v.toString() + "\n";
      }
      return result;
   }
   
   /**
    * Returns a list by use tax.
    * @return result as result.
    */
   public String listByUseTax() {
      String result = "";
      result += "------------------------------";
      result += "\nVehicles by Use Tax";
      result += "\n------------------------------\n";
      Vehicle[] fixedList = Arrays.copyOf(vehicleList, vehicleList.length);
      Arrays.sort(fixedList, new UseTaxComparator());
      for (Vehicle v: fixedList) {
         result += "\n" + v.toString() + "\n";
      }
      return result;
   }
   
   /**
    * Returns a string representing the list of vehicle records.
    * @return result as result.
    */
   public String excludedRecordsList() {
      String result = "";
      result = "------------------------------"
             + "\nExcluded Records"
             + "\n------------------------------\n";
      for (int i = 0; i < excludedRecords.length; i++) {
         result += "\n" + excludedRecords[i].toString() + "\n";
      }
      return result;
   }
}