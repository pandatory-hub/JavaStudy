public class Q10_1 {
  static int sum = 0;

  static void add(int n) {
    sum += n;
  }

  static void showResult() {
    System.out.println("sum = " + sum);
  }

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++)
      Q10_1.add(i);
    Q10_1.showResult();
  }
}
