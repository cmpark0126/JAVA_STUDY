/**
 * Lecture Note: Lab2
 * 	Convert hexadecimal strings from a command line into a decimal
 *
 * Step 1: Create hexChar2Decimal class
 *  - Define and use isHexChar(char hexChar)
 *  - Define hexCharToDecimal(char hexChar) method
 *  - Define a main(String[] args) to test two methods
 *  	- Get a hexadecimal string from user and save it "hexStr"
 *      - Convert it to a uppercase string and save it "hexStr"
 *      - Get a first character and save it "hexChar"
 *        Convert it to a decimal value if it is a hexadecimal char.
 *        If it is not a hexadecimal, exit the program with an error message.
 *  - Test two methods defined above
 *  - Sample run:
 *
 * Step 2: Create HexString2Decimal class
 *  - copy over isHexChar()
 *  - copy over hexCharToDecimal()
 *  - define isHexString()
 *  - define hexStringToDecimal()
 *  - define main() to test hexStringToDecimal().
 *
 * Step 3: Lab2
 *    Create Hex2Dec class that runs like some sample runs shown below:
 *    However, don't define any other methods in Hex2Dec.java.
 *    You may copy main() from Step 2 and modify a bit.
 *    Sample runs:
 *    $ java Hex2Dec FF 1ff
 *    Hex(FF) is 255   Hex(1ff) is 511
 *    $ java Hex2Dec
 *    Usage: Hex2Dec hexadecimals
 *    $ java Hex2Dec 100 ABXX
 *    Hex(100) is 256
 *    Expecting a hexadecimal number.
 *
 * You may extend this program shown below:
 * Step 4: Use for-each Loops instead of for-loops wherever possible
 * Step 5: Allow the user to enter a hex prefix optionally
 *         1F 0x10 0X1ff
 *         1F 0x10 0X1ff xyz
 * Watch-out: Keep the user's original input and display as it is
 ***********************LAB*****************************************
 * Step 6: Allow the user to enter hexadecimals interactively
 *         as well as using command-line arguments
 *         If no hexdecimals are given in command-line, then
 *         ask the user to enter hexadecimals to process.
 *
 * Hints: Use split(regex), for-each, trim()
 *         1F 0x10 0X1ff
 *         1F 0x10   0X1ff
 *         1F,0x10   0X1ff xyz
 *******************************************************************
 */
import java.util.Scanner;

public class Hex2Dec {
	public static void main(String[] args) {
		String[] inStrs;
		if (args.length == 0) {
			Scanner input = new Scanner(System.in);
			System.out.printf("Enter hexadecimal : ");
			String inputLine = input.nextLine().trim(); // method를 두개를 붙이는 것을 method cascade라고 한다.
			if (inputLine.length() == 0) {
				System.out.println("Usage: Hex2Dec hexadecimal");
				System.exit(1);
			}
			// inStrs = inputLine.split("\\s*[ ;:,.]\\s*");
			inStrs = inputLine.split("[,.\\s]+");
			// args = inputLine.split("\\s+");
		} else {
			inStrs = new String[args.length];
			for(int i = 0; i < args.length; i++){
				inStrs[i] = args[i];
			}
		}

		for(String el : inStrs){
			String modified_el = "";

			if(el.startsWith("0x") || el.startsWith("0X")){
				modified_el = el.substring(2,el.length());
				modified_el = modified_el.toUpperCase();
			} else {
				modified_el = el.toUpperCase();
			}

			if (!HexString2Decimal.isHexString(modified_el)) {
				System.out.println(el + ": not a hexadecimal");
			}
			else {
				System.out.println("Hex(" + el + ") is " +
						HexString2Decimal.hexStringToDecimal(modified_el));
			}
		}
	}
}
