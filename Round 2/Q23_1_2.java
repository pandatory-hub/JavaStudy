import java.util.HashSet;
import java.util.Objects;

class Person5 {
  private String name;
  private int age;

  public Person5(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return name + "(" + age + "세)";
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  public boolean equals(Object o) {
    Person5 comp = (Person5) o;

    if (comp.name.equals(name) && (comp.age == age))
      return true;
    else
      return false;
  }
}

public class Q23_1_2 {
  public static void main(String[] args) {
    HashSet<Person5> hSet = new HashSet<>();
    hSet.add(new Person5("LEE", 10));
    hSet.add(new Person5("LEE", 10));
    hSet.add(new Person5("KIM", 35));
    hSet.add(new Person5("PARK", 35));

    System.out.println("저장된 데이터 수 : " + hSet.size());
    System.out.println(hSet);

  }
}
