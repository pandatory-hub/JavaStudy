import java.util.Scanner;
import java.util.Random;

public class Q20_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int max, min;

    if (a > b) {
      max = a;
      min = b;
    } else {
      max = b;
      min = a;
    }

    sc.close();

    Random rand = new Random();
    int r;

    for (int i = 0; i < 10; i++) {
      r = min;
      r += rand.nextInt(max - min + 1);
      System.out.println(r);
    }
  }
}
