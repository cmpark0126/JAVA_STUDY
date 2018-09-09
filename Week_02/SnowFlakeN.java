public class SnowFlakeN {
  public static void main(String[] args) {
    try{
      int N = Integer.parseInt(args[0]);

      while (N != 1) {
        if (N % 2 == 0) {
          N = N / 2;
          System.out.println(N);
        }
        else {
          N = N * 3 + 1;
          System.out.println(N);
        }
      }
    } catch (Exception e){
      System.out.println("Usage : java SnowFlakeN N");
    }
  }
}
