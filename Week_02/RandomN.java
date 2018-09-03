public class RandomN {
  public static void main(String[] args) {
    if (args.length != 1)
      System.out.println("java RandomN N");
    else{
      int numOfRandomNum = Integer.parseInt(args[0]);

      for (int cnt = 0; cnt < numOfRandomNum; cnt++) {
        System.out.println(Math.random());
      }
    }
  }
}
