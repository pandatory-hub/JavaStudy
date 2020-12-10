public class Q6_3_2 {
  public static int result(int n) {
    if (n > 0) {
      int res = n % 2;
      n /= 2;

      result(n);
      System.out.print(res);
    }
    return 0;
  }

  public static void main(String[] args) {
    result(5);
  }
}
