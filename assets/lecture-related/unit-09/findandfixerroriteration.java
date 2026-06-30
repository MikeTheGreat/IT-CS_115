import java.util.*;

public class FindAndFixErrorIteration{
   public static void main (String[] args){
   
      Scanner keyboard = new Scanner(System.in);
   
      System.out.println("Please enter numbers, each one followed by the enter/return key");
      System.out.println("Please type 100<enter> to exit the program");
   
      int userNumber = 100; // anything EXCEPT 100 is good
      while( userNumber != 100 ) {
         System.out.println("Please type a whole number");
         if( !keyboard.hasNextInteger() ) {
            System.out.println("You need to type a number.");
         } else { // The user DID type an integer into the keyboard
            keyboard.nextInt(); // get int & assign to userNumber on this line
         
            if( userNumber < 0 ) {
               System.out.println( userNumber " is negative!");
            } else if( userNumber > 0 ) {
               System.out.println( userNumber + " is positive!");
            } else if( userNumber == 0 ) {
               System.out.println( userNumber + " is zero!");
            } 
         }
      
      System.out.println("Done!");
   }
}

