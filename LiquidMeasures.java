import java.util.Scanner;

/**
 * This program allows the user to enter an amount
 * of liquid in oucnes, which must be a multiple of 32,
 * and then displays the number of barrels, gallons, and
 * quarts, maximizing the number measure from largest to
 * smallest. 
 * Project 02.
 *
 * @author Trisha Sengupta - section 001
 * @version 9/7/2014
 */
 
public class LiquidMeasures {

   static final int OUNCES_IN_QUARTS = 32;
   static final int OUNCES_IN_GALLON = 128;
   static final int GALLONS_IN_BARREL = 42;
   static final int OUNCES_IN_BARREL = GALLONS_IN_BARREL * OUNCES_IN_GALLON;
   
/**
 * Uses user numbers for equations.
 * 
 * @param args Command line arguments (not used).
 */
   
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      int ounces = 0;
      int barrels = 0;
      int gallons = 0;
      int quarts = 0;
      int overflow = 0;
      
      // Asks user to enter amount:
      System.out.print("Enter amount of liquid in ounces: ");
      ounces = userInput.nextInt();
      overflow = ounces;
      
      // Determines wheather user's number is a multiple of 32
      int isMultiple32 = ounces % 32;
      if (isMultiple32 != 0) {
         System.out.println("Amount must be a multiple of 32.");
      }
      // Continues program
      else {
         System.out.println("Measures by volume:");
      
         barrels = overflow / OUNCES_IN_BARREL;
         overflow =  overflow % OUNCES_IN_BARREL;
         System.out.println("\tBarrels: " + barrels);
         
         gallons = overflow / OUNCES_IN_GALLON;
         overflow = overflow % OUNCES_IN_GALLON;
         System.out.println("\tGallons: " + gallons);
         
         quarts = overflow / OUNCES_IN_QUARTS;
         System.out.println("\tQuarts: " + quarts);
         
         System.out.println(ounces + " oz = (" + barrels + " bl * " 
            + OUNCES_IN_BARREL + " oz) + (" + gallons + " gal * " 
            + OUNCES_IN_GALLON + " oz) + (" + quarts + " qt * " 
            + OUNCES_IN_QUARTS + " oz)");
      }
   }
}