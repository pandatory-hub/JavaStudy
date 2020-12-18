import java.util.function.BiConsumer;

class Box6<T> {
  private T ob;

  public void set(T o) {
    ob = o;
  }

  public T get() {
    return ob;
  }
}

public class Q27_4 {
  public static void main(String[] args) {
    BiConsumer<Box6<Integer>, Integer> c1 = (b, i) -> b.set(i);
    BiConsumer<Box6<Double>, Double> c2 = (b, i) -> b.set(i);

    Box6<Integer> bi = new Box6<>();
    Box6<Double> bd = new Box6<>();

    c1.accept(bi, 12);
    c2.accept(bd, 7.7);

    System.out.println(bi.get());
    System.out.println(bd.get());
  }
}
