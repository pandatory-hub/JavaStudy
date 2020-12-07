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
    return (name.hashCode() + age) / 2; // 왜 이렇게 해도 답이 나오는가 ? 이 식이 의미하는 것은 ?
    // return name.hashCode() + (age % 7);
  }

  @Override
  public boolean equals(Object o) {
    String n = ((Person4) o).name;
    int a = ((Person4) o).age;
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

public class Q23_1_1 {
  public static void main(String[] args) {
    HashSet<Person4> set = new HashSet<>();
    set.add(new Person4("Lee", 12));
    set.add(new Person4("Kim", 14));
    set.add(new Person4("Lee", 12));
    set.add(new Person4("Soo", 16));
    set.add(new Person4("Kim", 14));
    System.out.println("인스턴스 수: " + set.size());
    // System.out.println(set);

    for (Person4 person : set)
      System.out.println(person.toString() + '\t');
  }
}
