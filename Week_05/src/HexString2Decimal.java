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
	public static boolean isHexChar(char hexChar) {
		return (hexChar >= '0' && hexChar <= '9') ||
		       (hexChar >= 'A' && hexChar <= 'F') ||
		       (hexChar >= 'a' && hexChar <= 'f');
	}

	// hexCharToDecimal()
	// Returns a decimal value from a hexadecimal
	public static int hexCharToDecimal(char hexChar) {
		if (hexChar >= '0' && hexChar <= '9')
			return hexChar - '0';
		else
			return Character.toUpperCase(hexChar) - 'A' + 10;
	}

	// isHexString()
	// Returns true if a hexString is a hexadecimal, false otherwise.
	public static boolean isHexString(String hexString) {

//		for (int i = 0; i < hexString.length(); i++)
//			if (!isHexChar(hexString.charAt(i)))
//				return false;
//		
//		return true;
		
		// Using for-each loop, toCharArray()
//		for(char c : hexString.toCharArray()) {
//			if (!isHexChar(c))
//				return false;
//		}
//		return true;

		
		// Use .matches(regex): [xX] "x or X"
		// ? "0 or 1", + "1 or more", * "1 or more"
		// a(bc)?  "a followed by bc by 0 or 1 time"
		// Use regexr.com to test.
		
		return hexString.matches("(0[xX])?[a-fA-F0-9]+$"); // $는 마지막에라는 의미이다.
	}

	// hexStringToDecimal()
	// returns a decimal value for a hexadecimal string.
	public static int hexStringToDecimal(String hexString) {
		// In a for loop, get each char in hexStr
		// Invoke hexCharToDecimal to get its decimal value
		// The new decimalValue is set by multiplying 16 to the previous
		// decimal value + the decimal value of the current digit
		int decimalValue = 0;
		for (int i = 0; i < hexString.length(); i++) {
			char hexChar = hexString.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}

	// main tests methods defined above
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in); // Get a hexadecimal
		System.out.print("Enter hexadecimals: ");
		String hexStr = kb.nextLine();

		// Check if hexStr is a hexadecimal string or not.
		// If not, exit with a message.


		// Invoke hexStringToDecimal() to display its decimal value.
		// Sample run: Hex(FF) is 255

		kb.close();
	}
}
