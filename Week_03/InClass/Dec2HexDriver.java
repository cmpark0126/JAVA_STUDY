import java.util.Scanner;

public class Dec2HexDriver {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     // Prompt the user to enter a decimal integer
     System.out.print("Enter a decimal number: ");

     try{
      int decimal = input.nextInt();

      // Convert decimal to hex string
      String hex = Dec2Hex.decimalHexString(decimal);

      System.out.println("The hex number is " + hex);
    } catch (Exception e){
      System.out.println("Usage : number N must be decimal number!");
    }
   }
}
