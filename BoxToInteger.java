import java.util.List;
import java.util.Arrays;

class Box9<T> {
  private T ob;

  public Box9(T o) {
    ob = o;
  }

  public T get() {
    return ob;
  }
}

public class BoxToInteger {
  public static void main(String[] args) {
    List<Box9<String>> ls = Arrays.asList(new Box9<>("Robot"), new Box9<>("Simple"));
    ls.stream().map(s -> s.get().length()).forEach(n -> System.out.println(n));

  }
}
