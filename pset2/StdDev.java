import java.util.Scanner;

public class StdDev {
  public static double average(double[] data, int size){
    double sum = 0;
    // int lengthOfData = data.length;

    for(double datum : data){
      sum += datum;
    }

    return sum / size;
  }

  public static double stdDev(double[] data, int size, double mean){
    double sum = 0;
    for(double datum : data){
      sum += (datum - mean) * (datum - mean);
    }

    return Math.sqrt(sum / size);
  }

  public static double stdDev(double[] data, int size){
    double mean = average(data, size);

    return stdDev(data, size, mean);
  }

  public static double[] doubleArraySize(double[] oldArray){
    int lenOfOldArray = oldArray.length;
    double[] newArray = new double[lenOfOldArray + 1];

    for (int i = 0; i < lenOfOldArray; i++){
      newArray[i] = oldArray[i];
    }

    return newArray;
  }

  public static void main(String[] args) {
    try{
      double[] data = new double[0];
      int cnt = 0;

      Scanner input = new Scanner(System.in);

      while(input.hasNextDouble()) {
        data = doubleArraySize(data);

        data[cnt] = input.nextDouble();
        cnt++;
      }

      System.out.println("<ctrl-z>");

      System.out.printf("Average\t(%d) is %f\n", cnt, average(data, cnt));
      System.out.printf("StdDev\t(%d) is %f\n", cnt, stdDev(data, cnt));

    } catch (Exception e){
      System.out.println("Usage : java Average [n0 n1 n2 . . . n]");
    }
  }
}
