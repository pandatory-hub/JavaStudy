public class Q5_7_1 {
  public static void main(String[] args) {
    for (int i = 1; i < 10; i++) {
      if (i % 2 == 0) {
        for (int j = 1; j <= i; j++) {
          System.out.println(i + "*" + j + "=" + (i * j));
        }
      }
    }
  }
}
