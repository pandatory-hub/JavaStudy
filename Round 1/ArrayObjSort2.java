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
    if (this.name.length() > p.name.length())
      return 1;
    else if (this.name.length() < p.name.length())
      return -1;
    else
      return 0;
  }

  @Override
  public String toString() {
    return name + ": " + age;
  }
}

public class ArrayObjSort2 {
  public static void main(String[] args) {
    Person2[] ar = new Person2[5];
    ar[0] = new Person2("Leee", 29);
    ar[1] = new Person2("Go", 15);
    ar[2] = new Person2("S", 37);
    ar[3] = new Person2("Kimeeee", 20);
    ar[4] = new Person2("Zooeeeeee", 50);

    Arrays.sort(ar);
    for (Person2 p : ar)
      System.out.println(p);
  }

}
