public class Hex2Dec {
  public static void main(String[] args) {
    try{
      int noInput = args.length;

      if (noInput == 0) {
        System.out.println("Usage : Hex2Dec hexadecimals");
        System.exit(1);
      }

      for(int i = 0; i < noInput; i++){
        String hexStr = args[i].toUpperCase();

    		// Check if hexStr is a hexadecimal string or not.
    		// If not, exit with a message.
    		if (!HexString2Decimal.isHexString(hexStr)) {
    			System.out.println("Expecting a hexdecimal number.");
    			System.exit(1);
    		}

    		// Invoke hexStringToDecimal() to display its decimal value.
    		// Sample run: Hex(FF) is 255
    		int decimalNum = HexString2Decimal.hexStringToDecimal(hexStr);
    		System.out.println("Hex(" + args[i] + ") is " + decimalNum);
      }

    }catch (Exception e){
      System.out.println("Usage : Hex2Dec hexadecimals");
    }

  }
}
