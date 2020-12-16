class Box3<T> {
  private T ob;

  public void set(T o) {
    ob = o;
  }

  public T get() {
    return ob;
  }
}

public class Q21_2 {
  public static <T extends Number> void swapBox(Box3<T> box1, Box3<T> box2) {
    T temp = box1.get();
    box1.set(box2.get());
    box2.set(temp);
  }

  public static void main(String[] args) {
    Box3<Integer> box1 = new Box3<>();
    box1.set(99);
    Box3<Integer> box2 = new Box3<>();
    box2.set(55);
    System.out.println(box1.get() + " & " + box2.get());
    swapBox(box1, box2);
    System.out.println(box1.get() + " & " + box2.get());
  }
}
