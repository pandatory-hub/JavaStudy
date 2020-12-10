public class Q6_3_1 {

  public static int result(int n) {
    int mul = 1;
    for (int i = 0; i < n; i++) {
      mul *= 2;
    }
    return mul;
  }

  public static void main(String[] args) {
    System.out.println(result(0));
    System.out.println(result(3));
  }

  // public static void main(String[] args) {
  // System.out.println("2의 3승 : " + powerOfTwo(0));
  // System.out.println("2의 7승 : " + powerOfTwo(7));
  // }

  // public static int powerOfTwo(int n) {
  // if (n == 0)
  // return 1;

  // return 2 * powerOfTwo(n - 1);
  // }
}
