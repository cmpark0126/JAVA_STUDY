import java.util.Scanner;

public class Average {
  public static void main(String[] args) {
    try{
      int noNum = args.length;
      double sumOfInputs = 0.F;
      double avg = 0.F;

      if(noNum == 0){
        Scanner input = new Scanner(System.in);

        while(input.hasNextDouble()) {
          sumOfInputs += input.nextDouble();
          noNum++;
        }

        System.out.println("<ctrl-z>");

        if (noNum == 0) throw new Exception();
      }else {
        for (int cnt = 0; cnt < noNum; cnt++) {
           sumOfInputs += Double.parseDouble(args[cnt]);
        }
      }

      avg = sumOfInputs / noNum;
      System.out.printf("Average[%d] is %f\n", noNum, avg);

    } catch (Exception e){
      System.out.println("Usage : java Average [n0 n1 n2 . . . n]");
    }
  }
}
