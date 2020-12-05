import java.util.Scanner;
import java.util.Random;

public class Q20_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("입력 1 : ");
    int A = sc.nextInt();

    System.out.println("입력 2 : ");
    int Z = sc.nextInt();

    int min, max;

    if (A > Z) {
      min = Z;
      max = A;
    } else {
      min = A;
      max = Z;
    }

    Random rand = new Random();
    int rn;

    for (int i = 0; i < 10; i++) {
      rn = min;
      rn += rand.nextInt(max - min + 1);
      System.out.println(rn);
    }
  }
}
