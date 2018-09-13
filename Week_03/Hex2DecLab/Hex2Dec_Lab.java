import java.util.Scanner;

public class Hex2Dec_Lab {
  public static void main(String[] args) {
    // Get a hexadecimal from the user
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter a hexadecimal(ex FF 100 1ff): ");
    String hexStr = kb.nextLine();
    hexStr = hexStr.toUpperCase();

    for(int i = 0; i < hexStr.length(); i++){ // independent function
      char ch = hexStr.charAt(i);
      if((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F')){
        continue;
      }
      else {
        System.out.println("Usage : Expecting a hexdecimal number!");
        System.exit(1);
      }
    }

    System.out.println(hexStr);

    // Check if hexStr is a hexadecimal string or not

  }
}
