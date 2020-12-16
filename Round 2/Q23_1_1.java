import java.util.HashSet;

class Person4 {
  private String name;
  private int age;

  public Person4(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return name + "(" + age + "세)";
  }

  @Override
  public int hashCode() {
    return name.hashCode() + (age % 7);
  }

  public boolean equals(Object o) {
    Person4 comp = (Person4) o;

    if (comp.name.equals(name) && (comp.age == age))
      return true;
    else
      return false;
  }
}

public class Q23_1_1 {
  public static void main(String[] args) {
    HashSet<Person4> hSet = new HashSet<>();
    hSet.add(new Person4("LEE", 10));
    hSet.add(new Person4("LEE", 10));
    hSet.add(new Person4("KIM", 35));
    hSet.add(new Person4("PARK", 35));

    System.out.println("저장된 데이터 수 : " + hSet.size());
    System.out.println(hSet);

  }
}
