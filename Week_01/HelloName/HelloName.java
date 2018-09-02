public class HelloName {
  public static void main(String[] args) {
    System.out.println("Hallo world!");
    for(int i = 0; i < args.length; i++) System.out.println("Hello " + args[i]);
  }
}
