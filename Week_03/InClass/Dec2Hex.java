
import java.util.Scanner;
public class Dec2Hex {
   public static char hexValue2Digit(int hexValue){
     // Convert a decimal value to a hex digit
     char hexDigit = (hexValue <= 9 && hexValue >=0) ?
       (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');

     return hexDigit;
   }

   public static String decimalHexString(int decimal){
     // Convert decimal to hex string
     String hex = "";

     while (decimal != 0) {
        System.out.println("Processing:" + decimal);
        int hexValue = decimal % 16;
        char hexDigit = hexValue2Digit(hexValue);
        hex = hexDigit + hex;
        decimal = decimal / 16;
     }

     return hex;
   }
}
