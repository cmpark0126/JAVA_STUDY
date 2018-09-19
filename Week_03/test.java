import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    int number = 25;
int i;

boolean isPrime = true;
for (i = 2; i < number; i++) {
     if (number % i == 0) {
         isPrime = false; break;
     }
}

System.out.println("i is " + i + " isPrime is " + isPrime);

  }
}
