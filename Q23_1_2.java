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

  @Override
  public boolean equals(Object o) {
    String n = ((Person5) o).name;
    int a = ((Person5) o).age;
    // Person comp = (Person)o;

    if (name.equals(n) && age == a)
      return true;
    else
      return false;
    // if(comp.name.equals(name) && (comp.age == age))
    // return true;
    // else
    // return false;
  }

}

public class Q23_1_2 {
  public static void main(String[] args) {
    HashSet<Person5> set = new HashSet<>();
    set.add(new Person5("Lee", 12));
    set.add(new Person5("Kim", 14));
    set.add(new Person5("Lee", 12));
    set.add(new Person5("Soo", 16));
    set.add(new Person5("Kim", 14));
    System.out.println("인스턴스 수: " + set.size());
    // System.out.println(set);

    for (Person5 person : set)
      System.out.println(person.toString() + '\t');
  }
}
