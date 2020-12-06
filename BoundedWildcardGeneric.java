class Box4<T> {
  private T ob;

  public void set(T o) {
    ob = o;
  }

  public T get() {
    return ob;
  }
}

public class BoundedWildcardGeneric {
  public static <T> boolean compBox(Box4<? extends T> box, T con) {
    T bc = box.get();
    // box.set(con);
    return bc.equals(con);
  }

  public static void main(String[] args) {
    Box4<Integer> box1 = new Box4<>();
    box1.set(24);
    Box4<String> box2 = new Box4<>();
    box2.set("Poly");

    if (compBox(box1, 25))
      System.out.println("상자 안에 25 저장");
    if (compBox(box2, "Moly"))
      System.out.println("상자 안에 Moly 저장");

    System.out.println(box1.get());
    System.out.println(box2.get());
  }
}
