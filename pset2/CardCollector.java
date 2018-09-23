public class CardCollector {
  public static int getCard(int noCards){
    return (int)(Math.random() * noCards);
  }

  public static int collect(int noCards){
    boolean[] isCollected = new boolean[noCards];

    int cardcnt = 0;
    int valcnt = 0;
    int tempCard = 0;

    while (valcnt != noCards){
      tempCard = getCard(noCards);

      if(isCollected[tempCard] == false) {
        isCollected[tempCard] = true;
        valcnt++;
      }

      cardcnt++;
    }

    return cardcnt;
  }

  public static double expected(int noCards){
    double result = 0;

    for(int i = 0; i < noCards; i++){
      result += (double)1 / (noCards - i);
    }

    return result * noCards;
  }

  public static void main(String[] args) {
    try {
      int noCards = Integer.parseInt(args[0]);
      int noLoop = 1;
      if(args.length == 2)
        noLoop = Integer.parseInt(args[1]);

      for(int i = 0; i < noLoop; i++){
        System.out.println(collect(noCards));
        // System.out.println(expected(noCards));
      }

    } catch(Exception e) {
      System.out.println("Usage: java CardCollector N1 [N2]");
      System.out.println("\tN1 : a number of cards to collect");
      System.out.println("\tN2 : a number of simulations to run");
    }

  }
}
