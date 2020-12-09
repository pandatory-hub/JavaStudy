import java.util.List;
import java.util.Arrays;

class Box8<T> {
  private T ob;

  public Box8(T o) {
    ob = o;
  }

  public T get() {
    return ob;
  }

}

public class BoxToString {
  public static void main(String[] args) {
    List<Box8<String>> ls = Arrays.asList(new Box8<>("Robot"), new Box8<>("Simple"));
    ls.stream().map(s -> s.get()).forEach(n -> System.out.println(n));

  }

}
