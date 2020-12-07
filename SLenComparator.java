import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SLenComparator {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Robot");
    list.add("Lambda");
    list.add("box");

    Collections.sort(list, (s1, s2) -> s1.length() - s2.length());

    for (String s : list)
      System.out.println(s);
  }
}
