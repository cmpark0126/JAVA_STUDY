// Lecture Note: Loops and Methods by Youngsup Kim
// Topics: Using static or instance methods,defining a method
//   Eclipse quick fix, Source-Format, Collapse & Expand
//   The scope of variables
//   System.exit(),
//   Character class methods - isDigit(), toUpperCase()
//   String class methods - charAt(), length(), toUpperCase()
//
// Next Challenges After this program HexChar2Decimal:
//   1. define isHexChar() method
//   2. define hexCharToDecimal() method
//   3. define isHexString() method
//	 4. define hexStringToDecimal method
//   5. define HexString2Decimal class
//
// The HexChar2Decimal class prompts the user to enter
// a hex digit and displays its corresponding decimal number.
//
// The HexString2Decimal class prompts the user to enter
// a hexadecimal number and displays its corresponding
// decimal number.
//
// Sample run(HexChar2Decimal):
//   Enter a hex digit: B
//   The decimal value of B is 11
//   Enter a hex digit: G
//   G is an invalid hex char.
// Sample run(HexString2Decimal):
//   Enter a hexadecimal number: 1F
//   The decimal value of 1F is 31
//   Enter a hexadecimal number: 3G
//   3G is an invalid hexadecimal number.
//
import java.util.Scanner;

public class HexString2Decimal {
	// isHexChar()
	// Returns true if a hexChar is a hexadecimal, otherwise false.
	public static boolean isHexChar(char ch){
		return ((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F'));
	}

	// hexCharToDecimal()
	// Returns a decimal value from a hexadecimal
	public static int hexCharToDecimal(char ch){
		return ((ch >= '0' && ch <= '9'))? (int)(ch - '0') : (int)(ch - 'A') + 10;
	}

	// isHexString()
	// Returns true if a hexString is a hexadecimal, false otherwise.
	public static boolean isHexString(String hexStr){
		int lengthOfStr = hexStr.length();
		for(int i = 0; i < lengthOfStr; i++){ // independent function
      char ch = hexStr.charAt(i);
      if(!isHexChar(ch)) return false;
    }
		return true;
	}

	// hexStringToDecimal()
	// returns a decimal value for a hexadecimal string.
	public static int hexStringToDecimal(String hexStr){
		int decimalNum = 0;
		int lengthOfStr = hexStr.length();
		for(int i = 0; i < lengthOfStr; i++){ // independent function
			char ch = hexStr.charAt(i);
    	decimalNum += Math.pow(16, lengthOfStr - i - 1) * hexCharToDecimal(ch);
    }
		return decimalNum;
	}


	// main tests methods defined above
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in); // Get a hexadecimal
		System.out.print("Enter a hexadecimal: ");
		String input = kb.nextLine();

		if (input.length() == 0) {
			System.out.println("Usage : Hex2Dec Hexadecimals");
			System.exit(1);
		}

		String hexStr = input.toUpperCase();

		// Check if hexStr is a hexadecimal string or not.
		// If not, exit with a message.
		if (!isHexString(hexStr)) {
			System.out.println("Usage : Expecting a hexdecimal number.");
			System.exit(1);
		}

		// Invoke hexStringToDecimal() to display its decimal value.
		// Sample run: Hex(FF) is 255
		int decimalNum = hexStringToDecimal(hexStr);
		System.out.println("Hex(" + input + ") is " + decimalNum);

		kb.close();

	}
}
