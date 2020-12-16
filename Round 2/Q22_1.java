class Box4<T> {
  private T ob;

  public void set(T o) {
    ob = o;
  }

  public T get() {
    return ob;
  }
}

public class Q22_1 {
  public static void addBox(Box4<? super Integer> b1, Box4<? extends Integer> b2, Box4<? extends Integer> b3) {
    b1.set(b2.get() + b3.get());
  }

  public static void main(String[] args) {
    Box4<Integer> box1 = new Box4<>();
    box1.set(24);
    Box4<Integer> box2 = new Box4<>();
    box2.set(37);
    Box4<Integer> result = new Box4<>();
    result.set(0);
    addBox(result, box1, box2);
    System.out.println(result.get());
  }
}
