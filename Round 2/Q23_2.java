import java.util.TreeSet;
import java.util.Comparator;

class IntComp implements Comparator<Integer> {
  public int compare(Integer n1, Integer n2) {
    return n2.intValue() - n1.intValue();
  }
}

public class Q23_2 {
  public static void main(String[] args) {
    TreeSet<Integer> tr = new TreeSet<>(new IntComp());
    tr.add(30);
    tr.add(10);
    tr.add(20);
    System.out.println(tr);
  }
}
