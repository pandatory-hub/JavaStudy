public class Q6_1_2 {
  public static void result(int a, int b) {
    if (a > b)
      System.out.println(a - b);
    else
      System.out.println(b - a);
  }

  public static void main(String[] args) {
    result(5, 3);
    result(3, 5);
    result(-3, 5);
  }
}
