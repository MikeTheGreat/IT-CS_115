public class FindAndFix_VariablesAndExpressions_WRONG_NAME {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    System.out.println("Hello\n \world!");

    System.out.println(Hello world!);

    System.out.println("Hello world!")

    int x;
    x = 10;

    double temperature = 98.6;

    // copy temperature into new variable y:
    double z = temperature;
    
    // Copy temperature into x:
    x = temperature;

    // Print x and y on separate lines:
    System.out.print(x);
    System.out.println(y);

    // z should be twice what temperature is:
    z = temperature + 2;

    // z should now be 2 more than half of temperature:
    z = temperature + 2 / 2 

    // z should now be half of temperature plus 2:
    z = temperature + 2 / 2 

  }
}