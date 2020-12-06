class Box2<T extends Number> {
  private T ob;

  public void set(T o) {
    ob = o;
  }

  public T get() {
    return ob;
  }
}

public class BoxSwapDemo {
  public static <T extends Number> void swapBox(Box2<T> box1, Box2<T> box2) {
    T temp = box1.get();
    box1.set(box2.get());
    box2.set(temp);
  }

  public static void main(String[] args) {
    Box2<Integer> box1 = new Box2<>();
    box1.set(99);
    Box2<Integer> box2 = new Box2<>();
    box2.set(55);
    System.out.println(box1.get() + " & " + box2.get());
    swapBox(box1, box2);
    System.out.println(box1.get() + " & " + box2.get());

  }
}
