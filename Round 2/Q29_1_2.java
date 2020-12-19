import java.util.List;
import java.util.Arrays;

class Box10<T> {
  private T ob;

  public Box10(T o) {
    ob = o;
  }

  public T get() {
    return ob;
  }
}

public class Q29_1_2 {
  public static void main(String[] args) {
    List<Box10<String>> ls = Arrays.asList(new Box10<>("Robot"), new Box10<>("Simple"));

    ls.stream().map(s -> s.get().length()).forEach(n -> System.out.println(n));
  }
}
