public class RandomN {
  public static void main(String[] args) {
    try{
      int noRandomNum = Integer.parseInt(args[0]);

      for (int cnt = 0; cnt < noRandomNum; cnt++) {
        System.out.println(Math.random());
      }
    } catch (Exception e){
      System.out.println("Usage : java RandomN N");
    }
  }
}
