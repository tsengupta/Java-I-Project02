import java.util.Scanner; 
  
/**
 * This program determines the area of a pyramid
 * given the base and slant height of the pyramid.
 * Project 02.
 * 
 * @author Trisha Sengupta - section 001
 * @version 9/7/2014
 */
 
public class AreaOfPyramid {
   /**
    * Uses users numbers and calculates area and prints
    * to std output.
    *
    * @param args Command line arguments (not used).
   */
 
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double base = 0;
      double slantHeight = 0;
      double area = 0;
      
      // Asks user to enter values:
      System.out.println("Enter values for base and " 
         + "slant height of a pyramid:");
      
      // Prompt user for their base number:
      System.out.print("\tbase = ");
      base = userInput.nextDouble();
      
      // Prompt user for their slant height number:
      System.out.print("\tslant height = ");
      slantHeight = userInput.nextDouble();
      
      // Calculates area of pyramid:
      area = base * base + 4 * (base * slantHeight / 2);
      
      // Prints the results:
      System.out.println("\nA pyramid with base = " + base 
         + " and slant height = " + slantHeight + " \nhas an area of " 
         + area + " square units.");
      
   }
}
    
