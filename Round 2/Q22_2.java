class Box5<T> {
  private T ob;

  public void set(T o) {
    ob = o;
  }

  public T get() {
    return ob;
  }
}

public class Q22_2 {
  public static <T> boolean compBox(Box5<? extends T> box, T con) {
    T bc = box.get();
    return bc.equals(con);
  }

  public static void main(String[] args) {
    Box5<Integer> box1 = new Box5<>();
    box1.set(24);
    Box5<String> box2 = new Box5<>();
    box2.set("PoPo");

    if (compBox(box1, 25))
      System.out.println("상자 안에 25 저장");
    if (compBox(box2, "PoPo"))
      System.out.println("상자 안에 PoPo 저장");

    System.out.println(box1.get());
    System.out.println(box2.get());
  }
}
