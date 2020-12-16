import java.util.Arrays;

class Person3 implements Comparable {
  private String name;
  private int age;

  public Person3(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int compareTo(Object o) {
    Person3 p = (Person3) o;
    return this.name.length() - p.name.length();
    // return this.name.compareTo(p.name);
  }

  @Override
  public String toString() {
    return name + ": " + age;
  }
}

public class Q20_3 {
  public static void main(String[] args) {
    Person3[] ar = new Person3[3];
    ar[0] = new Person3("Lee", 29);
    ar[1] = new Person3("Leee", 30);
    ar[2] = new Person3("Leeee", 31);
    Arrays.sort(ar);
    int idx = Arrays.binarySearch(ar, new Person3("Lee", 12));
    System.out.println(ar[idx]);
  }

}
