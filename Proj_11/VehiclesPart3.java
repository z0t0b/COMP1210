import java.io.FileNotFoundException;

/**
 * VehiclePart3 Class.
 *
 * Project 11
 * 12/6/17
 */
public class VehiclesPart3 {
   /**
    * VehiclePart3 main method.
    * @param args Command line arguments - not used.
    * @throws FileNotFoundException if file isn't found.
    */
   public static void main(String[] args) throws FileNotFoundException {
      UseTaxList utl = new UseTaxList();
      try {
         if (args.length == 0) {
            System.out.println("File name not provided by command"
               + " line argument.\nProgram ending.");
            return;
         } else {
            utl.readVehicleFile(args[0]);
            System.out.println(utl.summary() + "\n\n");
            System.out.println(utl.listByOwner() + "\n");
            System.out.println(utl.listByUseTax() + "\n");
            System.out.println(utl.excludedRecordsList() + "\n");  
         }   
      }
      catch (FileNotFoundException e) {
         System.out.println("*** File not found.");
         System.out.println("Program ending.");
         return;
      } 
   }
}