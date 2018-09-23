public class Cardx {
  public static void main(String[] args) {
    try {
      int noCards = Integer.parseInt(args[0]);
      int noLoop = Integer.parseInt(args[1]);

      double result = 0.f;
      double temp = 0.f;

      int expected = (int)Math.ceil(CardCollector.expected(noCards));
      int cnt = 0;

      for(int i = 0; i < noLoop; i++){
        temp = CardCollector.collect(noCards);
        if (temp > expected) cnt++;
        result += temp;
      }

      result /= noLoop;
      double prob = (double)cnt / noLoop;

      System.out.printf("CardCollector(%d, %d) is %f\n", noCards, noLoop, result);
      System.out.printf("CardCollector(%d) expects %f\n", noCards, CardCollector.expected(noCards));
      System.out.printf("Probability that takes more than %d is %f\n", expected, prob);

    } catch(Exception e) {
      System.out.println("Usage: java Cardx N1 N2");
      System.out.println("\tN1 : a number of cards to collect");
      System.out.println("\tN2 : a number of simulations to run");

    }
  }
}
