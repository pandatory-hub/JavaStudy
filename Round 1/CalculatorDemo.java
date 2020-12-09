interface Calculate<T> {
  T cal(T a, T b);
}

public class CalculatorDemo {
  public static <T> void calAndShow(Calculate<T> op, T n1, T n2) {
    T r = op.cal(n1, n2);
    System.out.println(r);
  }

  public static void main(String[] args) {
    Calculate<Integer> ci = (a, b) -> a + b;
    System.out.println(ci.cal(3, 4));

    Calculate<Double> cd = (a, b) -> a + b;
    System.out.println(cd.cal(2.5, 7.1));

    Calculate<Integer> ci2 = (a, b) -> a - b;
    System.out.println(ci2.cal(4, 2));

    Calculate<Double> cd2 = (a, b) -> a - b;
    System.out.println(cd2.cal(4.9, 3.2));

    // calAndShow((a, b) -> a + b, 3, 4);
    // calAndShow((a, b) -> a + b, 2.5, 7.1);
    // calAndShow((a, b) -> a - b, 4, 2);
    // calAndShow((a, b) -> a - b, 4.9, 3.2);
  }

}
