import java.util.function.BiFunction;

class Box7<T, U> {
  private T id;
  private U con;

  public Box7(T i, U c) {
    id = i;
    con = c;
  }

  public void showIt() {
    System.out.println("ID: " + id + ", " + "Contents: " + con);
  }
}

public class Q28_2_2 {
  public static void main(String[] args) {
    BiFunction<Integer, String, Box7<Integer, String>> bf = Box7::new;
    Box7<Integer, String> b1 = bf.apply(1, "Toy");
    Box7<Integer, String> b2 = bf.apply(2, "Robot");
    b1.showIt();
    b2.showIt();
  }
}
