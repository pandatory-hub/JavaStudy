public class Q6_2_1 {
  final static double pi = 3.14;

  public static double area(int rad) {
    return rad * rad * pi;
  }

  public static double cir(int rad) {
    return 2 * pi * rad;
  }

  public static void main(String[] args) {
    System.out.println(area(4));
    System.out.println(cir(4));
  }
}
