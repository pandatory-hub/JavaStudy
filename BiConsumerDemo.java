import java.util.function.BiConsumer;

class Box5<T> {
  private T ob;

  public void set(T o) {
    ob = o;
  }

  public T get() {
    return ob;
  }
}

public class BiConsumerDemo {
  public static void main(String[] args) {
    BiConsumer<Box5<Integer>, Integer> c1 = (b, i) -> b.set(i);
    BiConsumer<Box5<Double>, Double> c2 = (b, i) -> b.set(i);

    Box5<Integer> bi = new Box5<>();
    Box5<Double> bd = new Box5<>();

    c1.accept(bi, 12);
    c2.accept(bd, 12.12);

    System.out.println(bi.get());
    System.out.println(bd.get());
  }
}
