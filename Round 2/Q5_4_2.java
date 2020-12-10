public class Q5_4_2 {
  public static void main(String[] args) {
    int n = 1;

    while (n <= 100) {
      System.out.println(n++);
    }

    do {
      System.out.println(--n);
    } while (n > 1);
  }
}
