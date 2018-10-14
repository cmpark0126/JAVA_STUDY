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
 *            1F, 0x10   0X1ff xyz  0xFF  ,    0x1FF
 *******************************************************************
 */

public class Hex2Dec {
	public static void main(String[] args) {
		String[] inStrs;
		if (args.length == 0) {
			java.util.Scanner kb = new java.util.Scanner(System.in);
			System.out.println("Enter hexadecimals(ex:1F 0x10 ,  0X1f): ");
			String inStr = kb.nextLine().trim();
			inStrs = inStr.split("[,\\s]+");
//			inStrs = inStr.split("[\\W]+"); // d / D / w / W 가 의미하는 것을 알아야 한다.
//			inStrs = inStr.split("[a-fA-F0-9]");
		}
		else {
			inStrs = new String[args.length];
			for (int i = 0; i < args.length; i++)
				inStrs[i] = args[i];
//			System.arraycopy(args, 0, inStrs, 0, args.length);
		}
		
		for (String inStr: inStrs)
			System.out.println(inStr);
		
		for (String inStr: inStrs) {
			// Use startsWith() and substring to remove 0x 0X
			// Use replaceAll(regex), not replace()
			String myStr = inStr;
			
			if(inStr.startsWith("0x") || inStr.startsWith("0X")){
//				myStr = inStr.replaceAll("0[xX]", "");
				myStr = inStr.substring(2,inStr.length());
				myStr = myStr.toUpperCase();
			} else {
				myStr = inStr.toUpperCase();
			}
			
			// Check if the input is a hexadecimal string or not
			// if not, print an error message and exit.
			// if yes, print the decimal value of hexadecimal 
			// Don't copy methods defined in HexString2Decimal.java
			// into this file, but invoke them necessary here.
			
			if (!HexString2Decimal.isHexString(myStr)) {
				System.out.println(inStr + ": not a hexadecimal");
			}
			else {
				System.out.println("Hex(" + inStr + ") is " +
						HexString2Decimal.hexStringToDecimal(myStr));
			}
		}
	}
}
