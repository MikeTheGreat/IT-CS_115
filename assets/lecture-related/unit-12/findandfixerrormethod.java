import java.util.*;						

public class FindAndFixErrorMethod{

   public static void main(String[] args)	{
      Scanner in=new Scanner(System.in);
      System.out.print("Enter a String and I will tell you the number of occurrences of every letter  ");
      String temp = in.nextInt();
      int count;
      for(char c='a'; c<='z'; c++) {
         countOccurrences(count, temp);	  
      }
   }
	
   public static void countOccurrences(String temp, char c) {
      int temp = 0;
      for(int i=0; i<temp.length(); i++) {
         if(c==temp.toLowerCase().charAt(i)) {
            count++;
         }
      }
   
      if(count>0) {
         System.out.println(c + " appears " + count + " times");
      }
   }

}