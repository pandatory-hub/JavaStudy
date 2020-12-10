public class Q6_2_2 {
  public static boolean result(int n) {
    if (n == 1)
      return false;

    for (int i = 2; i < n; i++) {
      if (n % i == 0)
        return false;
    }
    return true;

  }

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      if (result(i))
        System.out.println(i);
    }
  }
}
