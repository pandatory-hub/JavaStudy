import java.util.Arrays;

class Person2 implements Comparable {
  private String name;
  private int age;

  public Person2(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int compareTo(Object o) {
    Person2 p = (Person2) o;
    return this.name.length() - p.name.length();
  }

  @Override
  public String toString() {
    return name + ": " + age;
  }
}

public class Q20_2_2 {
  public static void main(String[] args) {
    Person2[] ar = new Person2[3];
    ar[0] = new Person2("Lee", 29);
    ar[1] = new Person2("Kimm", 30);
    ar[2] = new Person2("Ho", 31);

    Arrays.sort(ar);
    for (Person2 p : ar)
      System.out.println(p);
  }
}
