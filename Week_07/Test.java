
import java.util.Arrays;
public class Test {
     private int x;

     public static void main(String[] args) {
       int [] nums = {1, 2, 3};
       String str = Arrays.toString(nums).replaceAll("[,\\s]+", "");
       str = str.substring(1, str.length()-1);
       // System.out.print("A,B;C".replaceAll(",;", "#") + " ");
       System.out.println(str);
     }
}
