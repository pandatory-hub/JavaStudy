class DBox<L, R> {
  private L left;
  private R right;

  public void set(L l, R r) {
    left = l;
    right = r;
  }

  @Override
  public String toString() {
    return left + " & " + right;
  }
}

class DDBox<U, D> {
  private U up;
  private D down;

  public void set(U u, D d) {
    up = u;
    down = d;
  }

  @Override
  public String toString() {
    return up.toString() + "\n" + down.toString();
  }
}

public class Q21_1_1 {
  public static void main(String[] args) {
    DBox<String, Integer> box1 = new DBox<>();
    box1.set("Banana", 20);
    DBox<String, Integer> box2 = new DBox<>();
    box2.set("Apple", 30);
    DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
    ddbox.set(box1, box2);
    System.out.println(ddbox);
  }
}
