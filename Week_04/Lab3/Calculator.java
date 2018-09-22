public class Calculator {
  public static void main(String[] args) {
    if(args.length != 3){
      System.out.println("Usage : Calculator Operand1 Operator Operand2");
      System.exit(1);
    }

    try{
      int operand1 = Integer.parseInt(args[0]);
      int operand2 = Integer.parseInt(args[2]);
      char op = args[1].charAt(0);

      switch(op){
        case '+': System.out.println(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
                  break;
        case '-': System.out.println(operand1 + " - " + operand2 + " = " + (operand1 - operand2));
                  break;
        case 'x': System.out.println(operand1 + " x " + operand2 + " = " + (operand1 * operand2));
                  break;
        case '/': System.out.println(operand1 + " / " + operand2 + " = " + (operand1 / operand2));
                  break;
        default : System.out.println("Usage : Calculator Operand1 Operator Operand2");
                  //throw new exception
                  //System.exit(1);
      }
    } catch (NumberFormatException ex) { // specific exception
      System.out.println(ex.getMessage());
      System.out.println("Operand: Integer only");
      System.exit(1);
    } catch (Exception e) { // Others (except NumberFormatException)
      System.out.println(e.getMessage());
      System.exit(1);
    }
    // 이런 것을 폴리몰피즘이라고 한다.

  }
}
