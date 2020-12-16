class DBox2<L, R> {
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

public class Q21_1_2 {
  public static void main(String[] args) {
    DBox2<String, Integer> box1 = new DBox2<>();
    box1.set("Banana", 20);
    DBox2<String, Integer> box2 = new DBox2<>();
    box2.set("Apple", 30);
    DBox2<DBox2<String, Integer>, DBox2<String, Integer>> ddbox = new DBox2<>();
    ddbox.set(box1, box2);
    System.out.println(ddbox);
  }
}
