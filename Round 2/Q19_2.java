class Business implements Cloneable {
  private String comp;
  private String work;

  public Business(String comp, String work) {
    this.comp = comp;
    this.work = work;
  }

  public void showBusinessInfo() {
    System.out.println("회사 : " + comp);
    System.out.println("업무 : " + work);
  }
}

class PersonalInfo implements Cloneable {
  private String name;
  private int age;
  private Business bz;

  public PersonalInfo(String name, int age, String comp, String work) {
    this.name = name;
    this.age = age;
    bz = new Business(comp, work);
  }

  public void showPersonalInfo() {
    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age);
    bz.showBusinessInfo();
  }
}

public class Q19_2 {
  PersonalInfo p1 = new PersonalInfo("김", 24, "sam", "a");

}
